/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DERGenerator
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DERSequenceGenerator
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERGenerator;
import org.bouncycastle.asn1.DERObject;

public class DERSequenceGenerator
extends DERGenerator {
    private final ByteArrayOutputStream a = new ByteArrayOutputStream();

    public DERSequenceGenerator(OutputStream out) throws IOException {
        super(out);
    }

    public DERSequenceGenerator(OutputStream out, int tagNo, boolean isExplicit) throws IOException {
        super(out, tagNo, isExplicit);
    }

    public void addObject(DEREncodable object) throws IOException {
        this.a.write(object.getDERObject().getEncoded());
    }

    public OutputStream getRawOutputStream() {
        return this.a;
    }

    public void close() throws IOException {
        this.a(48, this.a.toByteArray());
    }
}

