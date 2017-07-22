/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  sun.security.mscapi2.Key
 *  sun.security.mscapi2.RSACipher
 */
package sun.security.mscapi2;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import sun.security.mscapi2.Key;

/*
 * Exception performing whole class analysis ignored.
 */
public final class RSACipher
extends CipherSpi {
    private static final byte[] B0 = new byte[0];
    private static final int MODE_ENCRYPT = 1;
    private static final int MODE_DECRYPT = 2;
    private static final int MODE_SIGN = 3;
    private static final int MODE_VERIFY = 4;
    private static final String PAD_PKCS1 = "PKCS1Padding";
    private static final int PAD_PKCS1_LENGTH = 11;
    private int mode;
    private String paddingType = "PKCS1Padding";
    private int paddingLength = 0;
    private byte[] buffer;
    private int bufOfs;
    private int outputSize;
    private Key publicKey;
    private Key privateKey;

    public RSACipher() {
    }

    protected void engineSetMode(String mode) throws NoSuchAlgorithmException {
        if (!mode.equalsIgnoreCase("ECB")) {
            throw new NoSuchAlgorithmException("Unsupported mode " + mode);
        }
    }

    protected void engineSetPadding(String paddingName) throws NoSuchPaddingException {
        if (!paddingName.equalsIgnoreCase("PKCS1Padding")) {
            throw new NoSuchPaddingException("Padding " + paddingName + " not supported");
        }
        this.paddingType = "PKCS1Padding";
    }

    protected int engineGetBlockSize() {
        return 0;
    }

    protected int engineGetOutputSize(int inputLen) {
        return this.outputSize;
    }

    protected byte[] engineGetIV() {
        return null;
    }

    protected AlgorithmParameters engineGetParameters() {
        return null;
    }

    protected void engineInit(int opmode, java.security.Key key, SecureRandom random) throws InvalidKeyException {
        this.init(opmode, key);
    }

    protected void engineInit(int opmode, java.security.Key key, AlgorithmParameterSpec params, SecureRandom random) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (params != null) {
            throw new InvalidAlgorithmParameterException("Parameters not supported");
        }
        this.init(opmode, key);
    }

    protected void engineInit(int opmode, java.security.Key key, AlgorithmParameters params, SecureRandom random) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (params != null) {
            throw new InvalidAlgorithmParameterException("Parameters not supported");
        }
        this.init(opmode, key);
    }

    private void init(int opmode, java.security.Key key) throws InvalidKeyException {
        boolean encrypt;
        switch (opmode) {
            case 1: 
            case 3: {
                this.paddingLength = 11;
                encrypt = true;
                break;
            }
            case 2: 
            case 4: {
                this.paddingLength = 0;
                encrypt = false;
                break;
            }
            default: {
                throw new InvalidKeyException("Unknown mode: " + opmode);
            }
        }
        if (!(key instanceof Key)) {
            throw new InvalidKeyException("Unsupported key type: " + key);
        }
        if (key instanceof PublicKey) {
            this.mode = encrypt ? 1 : 4;
            this.publicKey = (Key)key;
            this.privateKey = null;
            this.outputSize = this.publicKey.bitLength() / 8;
        } else if (key instanceof PrivateKey) {
            this.mode = encrypt ? 3 : 2;
            this.privateKey = (Key)key;
            this.publicKey = null;
            this.outputSize = this.privateKey.bitLength() / 8;
        } else {
            throw new InvalidKeyException("Unknown key type: " + key);
        }
        this.bufOfs = 0;
        this.buffer = new byte[this.outputSize];
    }

    private void update(byte[] in, int inOfs, int inLen) {
        if (inLen == 0 || in == null) {
            return;
        }
        if (this.bufOfs + inLen > this.buffer.length - this.paddingLength) {
            this.bufOfs = this.buffer.length + 1;
            return;
        }
        System.arraycopy(in, inOfs, this.buffer, this.bufOfs, inLen);
        this.bufOfs += inLen;
    }

    private byte[] doFinal() throws BadPaddingException, IllegalBlockSizeException {
        if (this.bufOfs > this.buffer.length) {
            throw new IllegalBlockSizeException("Data must not be longer than " + (this.buffer.length - this.paddingLength) + " bytes");
        }
        try {
            byte[] data = this.buffer;
            switch (this.mode) {
                case 3: {
                    byte[] arrby = RSACipher.encryptDecrypt((byte[])data, (int)this.bufOfs, (long)this.privateKey.getHCryptKey(), (boolean)true);
                    return arrby;
                }
                case 4: {
                    byte[] arrby = RSACipher.encryptDecrypt((byte[])data, (int)this.bufOfs, (long)this.publicKey.getHCryptKey(), (boolean)false);
                    return arrby;
                }
                case 1: {
                    byte[] arrby = RSACipher.encryptDecrypt((byte[])data, (int)this.bufOfs, (long)this.publicKey.getHCryptKey(), (boolean)true);
                    return arrby;
                }
                case 2: {
                    byte[] arrby = RSACipher.encryptDecrypt((byte[])data, (int)this.bufOfs, (long)this.privateKey.getHCryptKey(), (boolean)false);
                    return arrby;
                }
            }
            try {
                throw new AssertionError((Object)"Internal error");
            }
            catch (KeyException e) {
                throw new ProviderException(e);
            }
        }
        finally {
            this.bufOfs = 0;
        }
    }

    protected byte[] engineUpdate(byte[] in, int inOfs, int inLen) {
        this.update(in, inOfs, inLen);
        return B0;
    }

    protected int engineUpdate(byte[] in, int inOfs, int inLen, byte[] out, int outOfs) {
        this.update(in, inOfs, inLen);
        return 0;
    }

    protected byte[] engineDoFinal(byte[] in, int inOfs, int inLen) throws BadPaddingException, IllegalBlockSizeException {
        this.update(in, inOfs, inLen);
        return this.doFinal();
    }

    protected int engineDoFinal(byte[] in, int inOfs, int inLen, byte[] out, int outOfs) throws ShortBufferException, BadPaddingException, IllegalBlockSizeException {
        if (this.outputSize > out.length - outOfs) {
            throw new ShortBufferException("Need " + this.outputSize + " bytes for output");
        }
        this.update(in, inOfs, inLen);
        byte[] result = this.doFinal();
        int n = result.length;
        System.arraycopy(result, 0, out, outOfs, n);
        return n;
    }

    protected byte[] engineWrap(java.security.Key key) throws InvalidKeyException, IllegalBlockSizeException {
        byte[] encoded = key.getEncoded();
        if (encoded == null || encoded.length == 0) {
            throw new InvalidKeyException("Could not obtain encoded key");
        }
        if (encoded.length > this.buffer.length) {
            throw new InvalidKeyException("Key is too long for wrapping");
        }
        this.update(encoded, 0, encoded.length);
        try {
            return this.doFinal();
        }
        catch (BadPaddingException e) {
            throw new InvalidKeyException("Wrapping failed", e);
        }
    }

    protected java.security.Key engineUnwrap(byte[] wrappedKey, String algorithm, int type) throws InvalidKeyException, NoSuchAlgorithmException {
        if (wrappedKey.length > this.buffer.length) {
            throw new InvalidKeyException("Key is too long for unwrapping");
        }
        this.update(wrappedKey, 0, wrappedKey.length);
        try {
            byte[] encoding = this.doFinal();
            switch (type) {
                case 1: {
                    return RSACipher.constructPublicKey((byte[])encoding, (String)algorithm);
                }
                case 2: {
                    return RSACipher.constructPrivateKey((byte[])encoding, (String)algorithm);
                }
                case 3: {
                    return RSACipher.constructSecretKey((byte[])encoding, (String)algorithm);
                }
            }
            throw new InvalidKeyException("Unknown key type " + type);
        }
        catch (BadPaddingException e) {
            throw new InvalidKeyException("Unwrapping failed", e);
        }
        catch (IllegalBlockSizeException e) {
            throw new InvalidKeyException("Unwrapping failed", e);
        }
    }

    protected int engineGetKeySize(java.security.Key key) throws InvalidKeyException {
        if (key instanceof Key) {
            return ((Key)key).bitLength();
        }
        throw new InvalidKeyException("Unsupported key type: " + key);
    }

    private static PublicKey constructPublicKey(byte[] encodedKey, String encodedKeyAlgorithm) throws InvalidKeyException, NoSuchAlgorithmException {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance(encodedKeyAlgorithm);
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(encodedKey);
            return keyFactory.generatePublic(keySpec);
        }
        catch (NoSuchAlgorithmException nsae) {
            throw new NoSuchAlgorithmException("No installed provider supports the " + encodedKeyAlgorithm + " algorithm", nsae);
        }
        catch (InvalidKeySpecException ike) {
            throw new InvalidKeyException("Cannot construct public key", ike);
        }
    }

    private static PrivateKey constructPrivateKey(byte[] encodedKey, String encodedKeyAlgorithm) throws InvalidKeyException, NoSuchAlgorithmException {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance(encodedKeyAlgorithm);
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(encodedKey);
            return keyFactory.generatePrivate(keySpec);
        }
        catch (NoSuchAlgorithmException nsae) {
            throw new NoSuchAlgorithmException("No installed provider supports the " + encodedKeyAlgorithm + " algorithm", nsae);
        }
        catch (InvalidKeySpecException ike) {
            throw new InvalidKeyException("Cannot construct private key", ike);
        }
    }

    private static SecretKey constructSecretKey(byte[] encodedKey, String encodedKeyAlgorithm) {
        return new SecretKeySpec(encodedKey, encodedKeyAlgorithm);
    }

    private static native byte[] encryptDecrypt(byte[] var0, int var1, long var2, boolean var4) throws KeyException;

    static {
    }
}

