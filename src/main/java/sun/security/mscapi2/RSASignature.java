/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  sun.security.mscapi2.Key
 *  sun.security.mscapi2.RSAPrivateKey
 *  sun.security.mscapi2.RSAPublicKey
 *  sun.security.mscapi2.RSASignature
 */
package sun.security.mscapi2;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import sun.security.mscapi2.Key;
import sun.security.mscapi2.RSAPrivateKey;
import sun.security.mscapi2.RSAPublicKey;

/*
 * Exception performing whole class analysis ignored.
 */
abstract class RSASignature
extends SignatureSpi {
    private final MessageDigest messageDigest;
    private boolean needsReset;
    private Key privateKey = null;
    private Key publicKey = null;

    RSASignature() {
        this.messageDigest = null;
    }

    RSASignature(String digestName) {
        try {
            this.messageDigest = MessageDigest.getInstance(digestName);
        }
        catch (NoSuchAlgorithmException e) {
            throw new ProviderException(e);
        }
        this.needsReset = false;
    }

    protected void engineInitVerify(PublicKey key) throws InvalidKeyException {
        if (!(key instanceof java.security.interfaces.RSAPublicKey)) {
            throw new InvalidKeyException("Key type not supported");
        }
        java.security.interfaces.RSAPublicKey rsaKey = (java.security.interfaces.RSAPublicKey)key;
        if (!(key instanceof RSAPublicKey)) {
            byte[] modulusBytes = rsaKey.getModulus().toByteArray();
            int keyBitLength = modulusBytes[0] == 0 ? (modulusBytes.length - 1) * 8 : modulusBytes.length * 8;
            byte[] keyBlob = this.generatePublicKeyBlob(keyBitLength, modulusBytes, rsaKey.getPublicExponent().toByteArray());
            this.publicKey = this.importPublicKey(keyBlob, keyBitLength);
        } else {
            this.publicKey = (RSAPublicKey)key;
        }
        if (this.needsReset) {
            this.messageDigest.reset();
            this.needsReset = false;
        }
    }

    protected void engineInitSign(PrivateKey key) throws InvalidKeyException {
        if (!(key instanceof RSAPrivateKey)) {
            throw new InvalidKeyException("Key type not supported");
        }
        this.privateKey = (RSAPrivateKey)key;
        int keySize = this.privateKey.bitLength() + 7 >> 3;
        if (keySize < 64) {
            throw new InvalidKeyException("RSA keys must be at least 512 bits long");
        }
        if (this.needsReset) {
            this.messageDigest.reset();
            this.needsReset = false;
        }
    }

    protected void engineUpdate(byte b) throws SignatureException {
        this.messageDigest.update(b);
        this.needsReset = true;
    }

    protected void engineUpdate(byte[] b, int off, int len) throws SignatureException {
        this.messageDigest.update(b, off, len);
        this.needsReset = true;
    }

    protected void engineUpdate(ByteBuffer input) {
        this.messageDigest.update(input);
        this.needsReset = true;
    }

    protected byte[] engineSign() throws SignatureException {
        byte[] hash = this.messageDigest.digest();
        this.needsReset = false;
        byte[] result = RSASignature.signHash((byte[])hash, (int)hash.length, (String)this.messageDigest.getAlgorithm(), (long)this.privateKey.getHCryptProvider(), (long)this.privateKey.getHCryptKey());
        return this.convertEndianArray(result);
    }

    protected byte[] convertEndianArray(byte[] byteArray) {
        if (byteArray == null || byteArray.length == 0) {
            return byteArray;
        }
        byte[] retval = new byte[byteArray.length];
        for (int i = 0; i < byteArray.length; ++i) {
            retval[i] = byteArray[byteArray.length - i - 1];
        }
        return retval;
    }

    protected static native byte[] signHash(byte[] var0, int var1, String var2, long var3, long var5) throws SignatureException;

    protected static native boolean verifySignedHash(byte[] var0, int var1, String var2, byte[] var3, int var4, long var5, long var7) throws SignatureException;

    protected boolean engineVerify(byte[] sigBytes) throws SignatureException {
        byte[] hash = this.messageDigest.digest();
        this.needsReset = false;
        return RSASignature.verifySignedHash((byte[])hash, (int)hash.length, (String)this.messageDigest.getAlgorithm(), (byte[])this.convertEndianArray(sigBytes), (int)sigBytes.length, (long)this.publicKey.getHCryptProvider(), (long)this.publicKey.getHCryptKey());
    }

    protected void engineSetParameter(String param, Object value) throws InvalidParameterException {
        throw new InvalidParameterException("Parameter not supported");
    }

    protected Object engineGetParameter(String param) throws InvalidParameterException {
        throw new InvalidParameterException("Parameter not supported");
    }

    protected native byte[] generatePublicKeyBlob(int var1, byte[] var2, byte[] var3);

    protected native RSAPublicKey importPublicKey(byte[] var1, int var2);
}

