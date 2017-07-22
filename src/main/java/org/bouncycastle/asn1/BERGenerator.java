/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1Generator
 *  org.bouncycastle.asn1.BERGenerator
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Generator;

public class BERGenerator
extends ASN1Generator {
    private boolean a;
    private boolean b;
    private int a = false;

    protected BERGenerator(OutputStream out) {
        super(out);
    }

    public BERGenerator(OutputStream out, int tagNo, boolean isExplicit) {
        super(out);
        this.a = true;
        this.b = isExplicit;
        this.a = tagNo;
    }

    public OutputStream getRawOutputStream() {
        return this._out;
    }

    private void a(int tag) throws IOException {
        this._out.write(tag);
        this._out.write(128);
    }

    protected void writeBERHeader(int tag) throws IOException {
        int tagNum = this.a | 128;
        if (this.a) {
            if (this.b) {
                this.a(tagNum | 32);
                this.a(tag);
            } else if ((tag & 32) != 0) {
                this.a(tagNum | 32);
            } else {
                this.a(tagNum);
            }
        } else {
            this.a(tag);
        }
    }

    protected void writeBERBody(InputStream contentStream) throws IOException {
        int ch;
        while ((ch = contentStream.read()) >= 0) {
            this._out.write(ch);
        }
    }

    protected void writeBEREnd() throws IOException {
        this._out.write(0);
        this._out.write(0);
        if (this.a && this.b) {
            this._out.write(0);
            this._out.write(0);
        }
    }
}

