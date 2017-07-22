/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  sun.security.mscapi2.Key
 *  sun.security.mscapi2.RSAPublicKey
 */
package sun.security.mscapi2;

import java.io.ObjectStreamException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyRep;
import sun.security.mscapi2.Key;
import sun.security.rsa.RSAPublicKeyImpl;

/*
 * Exception performing whole class analysis ignored.
 */
class RSAPublicKey
extends Key
implements java.security.interfaces.RSAPublicKey {
    private byte[] publicKeyBlob = null;
    private byte[] encoding = null;
    private BigInteger modulus = null;
    private BigInteger exponent = null;

    RSAPublicKey(long hCryptProv, long hCryptKey, int keyLength) {
        super(hCryptProv, hCryptKey, keyLength);
    }

    @Override
    public String getAlgorithm() {
        return "RSA";
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("RSAPublicKey [size=").append(this.keyLength).append(" bits, type=").append(RSAPublicKey.getKeyType((long)this.hCryptKey)).append(", container=").append(RSAPublicKey.getContainerName((long)this.hCryptProv)).append("]\n  modulus: ").append(this.getModulus()).append("\n  public exponent: ").append(this.getPublicExponent());
        return sb.toString();
    }

    @Override
    public BigInteger getPublicExponent() {
        if (this.exponent == null) {
            this.publicKeyBlob = this.getPublicKeyBlob(this.hCryptKey);
            this.exponent = new BigInteger(this.getExponent(this.publicKeyBlob));
        }
        return this.exponent;
    }

    @Override
    public BigInteger getModulus() {
        if (this.modulus == null) {
            this.publicKeyBlob = this.getPublicKeyBlob(this.hCryptKey);
            this.modulus = new BigInteger(this.getModulus(this.publicKeyBlob));
        }
        return this.modulus;
    }

    @Override
    public String getFormat() {
        return "X.509";
    }

    @Override
    public byte[] getEncoded() {
        if (this.encoding == null) {
            try {
                this.encoding = new RSAPublicKeyImpl(this.getModulus(), this.getPublicExponent()).getEncoded();
            }
            catch (InvalidKeyException e) {
                // empty catch block
            }
        }
        return this.encoding;
    }

    protected Object writeReplace() throws ObjectStreamException {
        return new KeyRep(KeyRep.Type.PUBLIC, this.getAlgorithm(), this.getFormat(), this.getEncoded());
    }

    private native byte[] getPublicKeyBlob(long var1);

    private native byte[] getExponent(byte[] var1);

    private native byte[] getModulus(byte[] var1);
}

