/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1Generator
 *  org.bouncycastle.asn1.DERGenerator
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Generator;

public abstract class DERGenerator
extends ASN1Generator {
    private boolean a;
    private boolean b;
    private int a = false;

    protected DERGenerator(OutputStream out) {
        super(out);
    }

    public DERGenerator(OutputStream out, int tagNo, boolean isExplicit) {
        super(out);
        this.a = true;
        this.b = isExplicit;
        this.a = tagNo;
    }

    private void a(OutputStream out, int length) throws IOException {
        if (length > 127) {
            int size = 1;
            int val = length;
            while ((val >>>= 8) != 0) {
                ++size;
            }
            out.write((byte)(size | 128));
            for (int i = (size - 1) * 8; i >= 0; i -= 8) {
                out.write((byte)(length >> i));
            }
        } else {
            out.write((byte)length);
        }
    }

    void a(OutputStream out, int tag, byte[] bytes) throws IOException {
        out.write(tag);
        this.a(out, bytes.length);
        out.write(bytes);
    }

    void a(int tag, byte[] bytes) throws IOException {
        if (this.a) {
            int tagNum = this.a | 128;
            if (this.b) {
                int newTag = this.a | 32 | 128;
                ByteArrayOutputStream bOut = new ByteArrayOutputStream();
                this.a((OutputStream)bOut, tag, bytes);
                this.a(this._out, newTag, bOut.toByteArray());
            } else if ((tag & 32) != 0) {
                this.a(this._out, tagNum | 32, bytes);
            } else {
                this.a(this._out, tagNum, bytes);
            }
        } else {
            this.a(this._out, tag, bytes);
        }
    }

    void a(OutputStream out, int tag, InputStream in) throws IOException {
        out.write(tag);
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        int b = 0;
        while ((b = in.read()) >= 0) {
            bOut.write(b);
        }
        byte[] bytes = bOut.toByteArray();
        this.a(out, bytes.length);
        out.write(bytes);
    }
}

