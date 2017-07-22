/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  sun.security.mscapi2.PRNG
 */
package sun.security.mscapi2;

import java.io.Serializable;
import java.security.ProviderException;
import java.security.SecureRandomSpi;

/*
 * Exception performing whole class analysis ignored.
 */
public final class PRNG
extends SecureRandomSpi
implements Serializable {
    private static native byte[] generateSeed(int var0, byte[] var1);

    public PRNG() {
    }

    protected void engineSetSeed(byte[] seed) {
        if (seed != null) {
            PRNG.generateSeed((int)-1, (byte[])seed);
        }
    }

    protected void engineNextBytes(byte[] bytes) {
        if (bytes != null && PRNG.generateSeed((int)0, (byte[])bytes) == null) {
            throw new ProviderException("Error generating random bytes");
        }
    }

    protected byte[] engineGenerateSeed(int numBytes) {
        byte[] seed = PRNG.generateSeed((int)numBytes, (byte[])null);
        if (seed == null) {
            throw new ProviderException("Error generating seed bytes");
        }
        return seed;
    }
}

