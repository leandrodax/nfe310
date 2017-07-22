/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  sun.security.mscapi2.Key
 *  sun.security.mscapi2.RSAPrivateKey
 */
package sun.security.mscapi2;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import sun.security.mscapi2.Key;

/*
 * Exception performing whole class analysis ignored.
 */
class RSAPrivateKey
extends Key
implements PrivateKey {
    RSAPrivateKey(long hCryptProv, long hCryptKey, int keyLength) {
        super(hCryptProv, hCryptKey, keyLength);
    }

    @Override
    public String getAlgorithm() {
        return "RSA";
    }

    public String toString() {
        return "RSAPrivateKey [size=" + this.keyLength + " bits, type=" + RSAPrivateKey.getKeyType((long)this.hCryptKey) + ", container=" + RSAPrivateKey.getContainerName((long)this.hCryptProv) + "]";
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        throw new NotSerializableException();
    }
}

