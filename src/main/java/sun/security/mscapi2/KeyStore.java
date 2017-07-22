/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  sun.security.mscapi2.Key
 *  sun.security.mscapi2.KeyStore
 *  sun.security.mscapi2.KeyStore$1
 *  sun.security.mscapi2.KeyStore$KeyEntry
 *  sun.security.mscapi2.RSAPrivateKey
 */
package sun.security.mscapi2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.Permission;
import java.security.SecurityPermission;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateCrtKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import sun.security.action.GetPropertyAction;
import sun.security.mscapi2.Key;
import sun.security.mscapi2.KeyStore;
import sun.security.mscapi2.RSAPrivateKey;

/*
 * Exception performing whole class analysis ignored.
 */
abstract class KeyStore
extends KeyStoreSpi {
    private CertificateFactory certificateFactory = null;
    private static final String KEYSTORE_COMPATIBILITY_MODE_PROP = "sun.security.mscapi.keyStoreCompatibilityMode";
    private final boolean keyStoreCompatibilityMode;
    private Collection<KeyEntry> entries = new ArrayList();
    private final String storeName;

    KeyStore(String storeName) {
        String prop = (String)AccessController.doPrivileged(new GetPropertyAction("sun.security.mscapi.keyStoreCompatibilityMode"));
        this.keyStoreCompatibilityMode = !"false".equalsIgnoreCase(prop);
        this.storeName = storeName;
    }

    @Override
    public java.security.Key engineGetKey(String alias, char[] password) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        if (alias == null) {
            return null;
        }
        if (password != null && !this.keyStoreCompatibilityMode) {
            throw new UnrecoverableKeyException("Password must be null");
        }
        if (!this.engineIsKeyEntry(alias)) {
            return null;
        }
        for (KeyEntry entry : this.entries) {
            if (!alias.equals(entry.getAlias())) continue;
            return entry.getPrivateKey();
        }
        return null;
    }

    @Override
    public Certificate[] engineGetCertificateChain(String alias) {
        if (alias == null) {
            return null;
        }
        for (KeyEntry entry : this.entries) {
            if (!alias.equals(entry.getAlias())) continue;
            X509Certificate[] certChain = entry.getCertificateChain();
            return (Certificate[])certChain.clone();
        }
        return null;
    }

    @Override
    public Certificate engineGetCertificate(String alias) {
        if (alias == null) {
            return null;
        }
        for (KeyEntry entry : this.entries) {
            if (!alias.equals(entry.getAlias())) continue;
            X509Certificate[] certChain = entry.getCertificateChain();
            return certChain[0];
        }
        return null;
    }

    @Override
    public Date engineGetCreationDate(String alias) {
        if (alias == null) {
            return null;
        }
        return new Date();
    }

    @Override
    public void engineSetKeyEntry(String alias, java.security.Key key, char[] password, Certificate[] chain) throws KeyStoreException {
        if (alias == null) {
            throw new KeyStoreException("alias must not be null");
        }
        if (password != null && !this.keyStoreCompatibilityMode) {
            throw new KeyStoreException("Password must be null");
        }
        if (key instanceof RSAPrivateCrtKey) {
            KeyEntry entry = null;
            boolean found = false;
            for (KeyEntry e : this.entries) {
                if (!alias.equals(e.getAlias())) continue;
                found = true;
                entry = e;
                break;
            }
            if (!found) {
                entry = new KeyEntry(this, alias, null, (X509Certificate[])chain);
                this.entries.add(entry);
            }
            entry.setAlias(alias);
            entry.setPrivateKey((RSAPrivateCrtKey)key);
            try {
                entry.setCertificateChain((X509Certificate[])chain);
            }
            catch (CertificateException ce) {
                throw new KeyStoreException(ce);
            }
        } else {
            throw new UnsupportedOperationException("Cannot assign the key to the given alias.");
        }
    }

    @Override
    public void engineSetKeyEntry(String alias, byte[] key, Certificate[] chain) throws KeyStoreException {
        throw new UnsupportedOperationException("Cannot assign the encoded key to the given alias.");
    }

    @Override
    public void engineSetCertificateEntry(String alias, Certificate cert) throws KeyStoreException {
        if (alias == null) {
            throw new KeyStoreException("alias must not be null");
        }
        if (cert instanceof X509Certificate) {
            X509Certificate[] chain = new X509Certificate[]{(X509Certificate)cert};
            KeyEntry entry = null;
            boolean found = false;
            for (KeyEntry e : this.entries) {
                if (!alias.equals(e.getAlias())) continue;
                found = true;
                entry = e;
                break;
            }
            if (!found) {
                entry = new KeyEntry(this, alias, null, chain);
                this.entries.add(entry);
            }
            if (entry.getPrivateKey() == null) {
                entry.setAlias(alias);
                try {
                    entry.setCertificateChain(chain);
                }
                catch (CertificateException ce) {
                    throw new KeyStoreException(ce);
                }
            }
        } else {
            throw new UnsupportedOperationException("Cannot assign the certificate to the given alias.");
        }
    }

    @Override
    public void engineDeleteEntry(String alias) throws KeyStoreException {
        if (alias == null) {
            throw new KeyStoreException("alias must not be null");
        }
        for (KeyEntry entry : this.entries) {
            Key privateKey;
            if (!alias.equals(entry.getAlias())) continue;
            X509Certificate[] certChain = entry.getCertificateChain();
            if (certChain != null) {
                try {
                    byte[] encoding = certChain[0].getEncoded();
                    this.removeCertificate(this.getName(), alias, encoding, encoding.length);
                }
                catch (CertificateEncodingException e) {
                    throw new KeyStoreException("Cannot remove entry: " + e);
                }
            }
            if ((privateKey = entry.getPrivateKey()) != null) {
                this.destroyKeyContainer(Key.getContainerName((long)privateKey.getHCryptProvider()));
            }
            this.entries.remove((Object)entry);
            break;
        }
    }

    public Enumeration engineAliases() {
        Iterator iter = this.entries.iterator();
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    @Override
    public boolean engineContainsAlias(String alias) {
        Enumeration enumerator = this.engineAliases();
        while (enumerator.hasMoreElements()) {
            String a = (String)enumerator.nextElement();
            if (!a.equals(alias)) continue;
            return true;
        }
        return false;
    }

    @Override
    public int engineSize() {
        return this.entries.size();
    }

    @Override
    public boolean engineIsKeyEntry(String alias) {
        if (alias == null) {
            return false;
        }
        for (KeyEntry entry : this.entries) {
            if (!alias.equals(entry.getAlias())) continue;
            return entry.getPrivateKey() != null;
        }
        return false;
    }

    @Override
    public boolean engineIsCertificateEntry(String alias) {
        for (KeyEntry entry : this.entries) {
            if (!alias.equals(entry.getAlias())) continue;
            return entry.getPrivateKey() == null;
        }
        return false;
    }

    @Override
    public String engineGetCertificateAlias(Certificate cert) {
        for (KeyEntry entry : this.entries) {
            if (KeyEntry.access$400((KeyEntry)entry) == null || !KeyEntry.access$400((KeyEntry)entry)[0].equals(cert)) continue;
            return entry.getAlias();
        }
        return null;
    }

    @Override
    public void engineStore(OutputStream stream, char[] password) throws IOException, NoSuchAlgorithmException, CertificateException {
        if (stream != null && !this.keyStoreCompatibilityMode) {
            throw new IOException("Keystore output stream must be null");
        }
        if (password != null && !this.keyStoreCompatibilityMode) {
            throw new IOException("Keystore password must be null");
        }
    }

    @Override
    public void engineLoad(InputStream stream, char[] password) throws IOException, NoSuchAlgorithmException, CertificateException {
        if (stream != null && !this.keyStoreCompatibilityMode) {
            throw new IOException("Keystore input stream must be null");
        }
        if (password != null && !this.keyStoreCompatibilityMode) {
            throw new IOException("Keystore password must be null");
        }
        SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            sm.checkPermission(new SecurityPermission("authProvider.SunMSCAPI"));
        }
        this.entries.clear();
        this.loadKeysOrCertificateChains(this.getName(), this.entries);
    }

    private void generateCertificateChain(String alias, Collection certCollection, Collection<KeyEntry> entries) {
        try {
            X509Certificate[] certChain = new X509Certificate[certCollection.size()];
            int i = 0;
            for (X509Certificate certChain[i] : certCollection) {
                ++i;
            }
            KeyEntry entry = new KeyEntry(this, alias, null, certChain);
            entries.add(entry);
        }
        catch (Throwable e) {
            // empty catch block
        }
    }

    private void generateRSAKeyAndCertificateChain(String alias, long hCryptProv, long hCryptKey, int keyLength, Collection certCollection, Collection<KeyEntry> entries) {
        try {
            X509Certificate[] certChain = new X509Certificate[certCollection.size()];
            int i = 0;
            for (X509Certificate certChain[i] : certCollection) {
                ++i;
            }
            KeyEntry entry = new KeyEntry(this, alias, (Key)new RSAPrivateKey(hCryptProv, hCryptKey, keyLength), certChain);
            entries.add(entry);
        }
        catch (Throwable e) {
            // empty catch block
        }
    }

    private void generateCertificate(byte[] data, Collection certCollection) {
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            if (this.certificateFactory == null) {
                this.certificateFactory = CertificateFactory.getInstance("X.509");
            }
            Collection<? extends Certificate> c = this.certificateFactory.generateCertificates(bis);
            certCollection.addAll(c);
        }
        catch (CertificateException e) {
        }
        catch (Throwable te) {
            // empty catch block
        }
    }

    private String getName() {
        return this.storeName;
    }

    private native void loadKeysOrCertificateChains(String var1, Collection<KeyEntry> var2);

    private native void storeCertificate(String var1, String var2, byte[] var3, int var4, long var5, long var7);

    private native void removeCertificate(String var1, String var2, byte[] var3, int var4);

    private native void destroyKeyContainer(String var1);

    private native byte[] generatePrivateKeyBlob(int var1, byte[] var2, byte[] var3, byte[] var4, byte[] var5, byte[] var6, byte[] var7, byte[] var8, byte[] var9);

    private native RSAPrivateKey storePrivateKey(byte[] var1, String var2, int var3);

    static /* synthetic */ byte[] access$000(KeyStore x0, int x1, byte[] x2, byte[] x3, byte[] x4, byte[] x5, byte[] x6, byte[] x7, byte[] x8, byte[] x9) {
        return x0.generatePrivateKeyBlob(x1, x2, x3, x4, x5, x6, x7, x8, x9);
    }

    static /* synthetic */ RSAPrivateKey access$100(KeyStore x0, byte[] x1, String x2, int x3) {
        return x0.storePrivateKey(x1, x2, x3);
    }

    static /* synthetic */ String access$200(KeyStore x0) {
        return x0.getName();
    }

    static /* synthetic */ void access$300(KeyStore x0, String x1, String x2, byte[] x3, int x4, long x5, long x6) {
        x0.storeCertificate(x1, x2, x3, x4, x5, x6);
    }
}

