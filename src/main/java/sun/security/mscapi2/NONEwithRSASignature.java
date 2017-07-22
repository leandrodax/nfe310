/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  sun.security.mscapi2.Key
 *  sun.security.mscapi2.NONEwithRSASignature
 *  sun.security.mscapi2.RSAPrivateKey
 *  sun.security.mscapi2.RSAPublicKey
 *  sun.security.mscapi2.RSASignature
 */
package sun.security.mscapi2;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SignatureException;
import sun.security.mscapi2.Key;
import sun.security.mscapi2.RSAPrivateKey;
import sun.security.mscapi2.RSAPublicKey;
import sun.security.mscapi2.RSASignature;

/*
 * Exception performing whole class analysis ignored.
 */
public final class NONEwithRSASignature
extends RSASignature {
    private Key privateKey = null;
    private Key publicKey = null;
    private ByteArrayOutputStream data = new ByteArrayOutputStream(128);

    public NONEwithRSASignature() {
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
        this.data.reset();
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
        this.data.reset();
    }

    protected void engineUpdate(byte b) throws SignatureException {
        this.engineUpdate(new byte[]{b}, 0, 1);
    }

    protected void engineUpdate(byte[] b, int off, int len) throws SignatureException {
        this.data.write(b, off, len);
    }

    protected void engineUpdate(ByteBuffer input) {
        if (!input.hasRemaining()) {
            return;
        }
        try {
            if (input.hasArray()) {
                byte[] b = input.array();
                int ofs = input.arrayOffset();
                int pos = input.position();
                int lim = input.limit();
                this.engineUpdate(b, ofs + pos, lim - pos);
                input.position(lim);
            } else {
                int len;
                int chunk;
                byte[] b = new byte[len];
                for (len = input.remaining(); len > 0; len -= chunk) {
                    chunk = Math.min(len, b.length);
                    input.get(b, 0, chunk);
                    this.engineUpdate(b, 0, chunk);
                }
            }
        }
        catch (SignatureException e) {
            throw new ProviderException("update() failed", e);
        }
    }

    protected byte[] engineSign() throws SignatureException {
        byte[] hash = this.data.toByteArray();
        byte[] result = NONEwithRSASignature.signHash((byte[])hash, (int)hash.length, (String)"NONEwithRSA", (long)this.privateKey.getHCryptProvider(), (long)this.privateKey.getHCryptKey());
        return this.convertEndianArray(result);
    }

    protected boolean engineVerify(byte[] sigBytes) throws SignatureException {
        byte[] hash = this.data.toByteArray();
        return NONEwithRSASignature.verifySignedHash((byte[])hash, (int)hash.length, (String)"NONEwithRSA", (byte[])this.convertEndianArray(sigBytes), (int)sigBytes.length, (long)this.publicKey.getHCryptProvider(), (long)this.publicKey.getHCryptKey());
    }

    protected void engineSetParameter(String param, Object value) throws InvalidParameterException {
        throw new InvalidParameterException("Parameter not supported");
    }

    protected Object engineGetParameter(String param) throws InvalidParameterException {
        throw new InvalidParameterException("Parameter not supported");
    }
}

