/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1OutputStream
 *  org.bouncycastle.asn1.BERConstructedSequence
 *  org.bouncycastle.asn1.BEROutputStream
 *  org.bouncycastle.asn1.DERConstructedSequence
 *  org.bouncycastle.asn1.DEROutputStream
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.BEROutputStream;
import org.bouncycastle.asn1.DERConstructedSequence;
import org.bouncycastle.asn1.DEROutputStream;

public class BERConstructedSequence
extends DERConstructedSequence {
    void encode(DEROutputStream out) throws IOException {
        if (out instanceof ASN1OutputStream || out instanceof BEROutputStream) {
            out.write(48);
            out.write(128);
            Enumeration e = this.getObjects();
            while (e.hasMoreElements()) {
                out.writeObject(e.nextElement());
            }
            out.write(0);
            out.write(0);
        } else {
            super.encode(out);
        }
    }
}

