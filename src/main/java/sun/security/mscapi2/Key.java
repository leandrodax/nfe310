/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  sun.security.mscapi2.Key
 */
package sun.security.mscapi2;

/*
 * Exception performing whole class analysis ignored.
 */
abstract class Key
implements java.security.Key {
    protected long hCryptProv = 0;
    protected long hCryptKey = 0;
    protected int keyLength = 0;

    protected Key(long hCryptProv, long hCryptKey, int keyLength) {
        this.hCryptProv = hCryptProv;
        this.hCryptKey = hCryptKey;
        this.keyLength = keyLength;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void finalize() throws Throwable {
        try {
            Key key = this;
            synchronized (key) {
                Key.cleanUp((long)this.hCryptProv, (long)this.hCryptKey);
                this.hCryptProv = 0;
                this.hCryptKey = 0;
            }
        }
        finally {
            super.finalize();
        }
    }

    private static native void cleanUp(long var0, long var2);

    public int bitLength() {
        return this.keyLength;
    }

    public long getHCryptKey() {
        return this.hCryptKey;
    }

    public long getHCryptProvider() {
        return this.hCryptProv;
    }

    @Override
    public abstract String getAlgorithm();

    @Override
    public String getFormat() {
        return null;
    }

    @Override
    public byte[] getEncoded() {
        return null;
    }

    protected static native String getContainerName(long var0);

    protected static native String getKeyType(long var0);
}

