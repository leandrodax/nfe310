/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  sun.security.mscapi2.DSGEProvider
 *  sun.security.mscapi2.DSGEProvider$1
 */
package sun.security.mscapi2;

import java.security.AccessController;
import java.security.Provider;
import java.security.Security;
import java.util.HashMap;
import java.util.Map;
import sun.security.action.PutAllAction;
import sun.security.mscapi2.DSGEProvider;

public final class DSGEProvider
extends Provider {
    private static final long serialVersionUID = 8622598936488630849L;
    private static final String INFO = "DSGE API provider";
    public static final String ProviderName = "DSGEProvider";
    private static DSGEProvider providerInstance;

    public DSGEProvider() {
        super("DSGEProvider", 1.7, "DSGE API provider");
        DSGEProvider map = System.getSecurityManager() == null ? this : new DSGEProvider();
        map.put("SecureRandom.Windows-PRNG", "sun.security.mscapi2.PRNG");
        map.put("KeyStore.Windows-MY", "sun.security.mscapi2.KeyStore$MY");
        map.put("KeyStore.Windows-ROOT", "sun.security.mscapi2.KeyStore$ROOT");
        map.put("Signature.SHA1withRSA", "sun.security.mscapi2.RSASignature$SHA1");
        map.put("Signature.MD5withRSA", "sun.security.mscapi2.RSASignature$MD5");
        map.put("Signature.MD2withRSA", "sun.security.mscapi2.RSASignature$MD2");
        map.put("Signature.NONEwithRSA", "sun.security.mscapi2.NONEwithRSASignature");
        map.put("Signature.SHA1withRSA SupportedKeyClasses", "sun.security.mscapi2.Key");
        map.put("Signature.MD5withRSA SupportedKeyClasses", "sun.security.mscapi2.Key");
        map.put("Signature.MD2withRSA SupportedKeyClasses", "sun.security.mscapi2.Key");
        map.put("Signature.NONEwithRSA SupportedKeyClasses", "sun.security.mscapi2.Key");
        map.put("KeyPairGenerator.RSA", "sun.security.mscapi2.RSAKeyPairGenerator");
        map.put("KeyPairGenerator.RSA KeySize", "1024");
        map.put("Cipher.RSA", "sun.security.mscapi2.RSACipher");
        map.put("Cipher.RSA/ECB/PKCS1Padding", "sun.security.mscapi2.RSACipher");
        map.put("Cipher.RSA SupportedModes", "ECB");
        map.put("Cipher.RSA SupportedPaddings", "PKCS1PADDING");
        map.put("Cipher.RSA SupportedKeyClasses", "sun.security.mscapi2.Key");
        if (map != this) {
            AccessController.doPrivileged(new PutAllAction((Provider)this, map));
        }
    }

    public static synchronized void init() {
        if (providerInstance == null) {
            providerInstance = new DSGEProvider();
            Security.addProvider((Provider)providerInstance);
        }
    }

    static {
        AccessController.doPrivileged(new /* Unavailable Anonymous Inner Class!! */);
        providerInstance = null;
    }
}

