/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  sun.security.mscapi2.RSAKeyPair
 *  sun.security.mscapi2.RSAPrivateKey
 *  sun.security.mscapi2.RSAPublicKey
 */
package sun.security.mscapi2;

import sun.security.mscapi2.RSAPrivateKey;
import sun.security.mscapi2.RSAPublicKey;

class RSAKeyPair {
    private final RSAPrivateKey privateKey;
    private final RSAPublicKey publicKey;

    RSAKeyPair(long hCryptProv, long hCryptKey, int keyLength) {
        this.privateKey = new RSAPrivateKey(hCryptProv, hCryptKey, keyLength);
        this.publicKey = new RSAPublicKey(hCryptProv, hCryptKey, keyLength);
    }

    public RSAPrivateKey getPrivate() {
        return this.privateKey;
    }

    public RSAPublicKey getPublic() {
        return this.publicKey;
    }
}

