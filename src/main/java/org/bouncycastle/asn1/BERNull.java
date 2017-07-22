/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1OutputStream
 *  org.bouncycastle.asn1.BERNull
 *  org.bouncycastle.asn1.BEROutputStream
 *  org.bouncycastle.asn1.DERNull
 *  org.bouncycastle.asn1.DEROutputStream
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.BEROutputStream;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROutputStream;

public class BERNull
extends DERNull {
    static final BERNull a = new BERNull();

    void encode(DEROutputStream out) throws IOException {
        if (out instanceof ASN1OutputStream || out instanceof BEROutputStream) {
            out.write(5);
        } else {
            super.encode(out);
        }
    }
}

