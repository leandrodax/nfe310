/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  sun.security.mscapi2.RSAKeyPair
 *  sun.security.mscapi2.RSAKeyPairGenerator
 *  sun.security.mscapi2.RSAPrivateKey
 *  sun.security.mscapi2.RSAPublicKey
 */
package sun.security.mscapi2;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGeneratorSpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.UUID;
import sun.security.mscapi2.RSAKeyPair;
import sun.security.mscapi2.RSAPrivateKey;
import sun.security.mscapi2.RSAPublicKey;

/*
 * Exception performing whole class analysis ignored.
 */
public final class RSAKeyPairGenerator
extends KeyPairGeneratorSpi {
    private static final int KEY_SIZE_MIN = 512;
    private static final int KEY_SIZE_MAX = 16384;
    private static final int KEY_SIZE_DEFAULT = 1024;
    private int keySize;

    public RSAKeyPairGenerator() {
        this.initialize(1024, null);
    }

    @Override
    public void initialize(int keySize, SecureRandom random) {
        this.checkKeySize(keySize);
    }

    @Override
    public void initialize(AlgorithmParameterSpec params, SecureRandom random) throws InvalidAlgorithmParameterException {
        if (params == null) {
            this.checkKeySize(1024);
        } else if (params instanceof RSAKeyGenParameterSpec) {
            if (((RSAKeyGenParameterSpec)params).getPublicExponent() != null) {
                throw new InvalidAlgorithmParameterException("Exponent parameter is not supported");
            }
            this.checkKeySize(((RSAKeyGenParameterSpec)params).getKeysize());
        } else {
            throw new InvalidAlgorithmParameterException("Params must be an instance of RSAKeyGenParameterSpec");
        }
    }

    @Override
    public KeyPair generateKeyPair() {
        RSAKeyPair keys = RSAKeyPairGenerator.generateRSAKeyPair((int)this.keySize, (String)("{" + UUID.randomUUID().toString() + "}"));
        return new KeyPair((PublicKey)keys.getPublic(), (PrivateKey)keys.getPrivate());
    }

    private void checkKeySize(int keySize) throws InvalidParameterException {
        if (keySize < 512) {
            throw new InvalidParameterException("Key size must be at least 512 bits");
        }
        if (keySize > 16384) {
            throw new InvalidParameterException("Key size must be 16384 bits or less");
        }
        this.keySize = keySize;
    }

    private static native RSAKeyPair generateRSAKeyPair(int var0, String var1);
}

