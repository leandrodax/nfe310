/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.BERGenerator
 *  org.bouncycastle.asn1.BERSequenceGenerator
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DERObject
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.BERGenerator;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;

public class BERSequenceGenerator
extends BERGenerator {
    public BERSequenceGenerator(OutputStream out) throws IOException {
        super(out);
        this.writeBERHeader(48);
    }

    public BERSequenceGenerator(OutputStream out, int tagNo, boolean isExplicit) throws IOException {
        super(out, tagNo, isExplicit);
        this.writeBERHeader(48);
    }

    public void addObject(DEREncodable object) throws IOException {
        this._out.write(object.getDERObject().getEncoded());
    }

    public void close() throws IOException {
        this.writeBEREnd();
    }
}

