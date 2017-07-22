/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DEROutputStream
 *  org.bouncycastle.asn1.DERTags
 */
package org.bouncycastle.asn1;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERTags;

public class DEROutputStream
extends FilterOutputStream
implements DERTags {
    public DEROutputStream(OutputStream os) {
        super(os);
    }

    private void a(int length) throws IOException {
        if (length > 127) {
            int size = 1;
            int val = length;
            while ((val >>>= 8) != 0) {
                ++size;
            }
            this.write((int)((byte)(size | 128)));
            for (int i = (size - 1) * 8; i >= 0; i -= 8) {
                this.write((int)((byte)(length >> i)));
            }
        } else {
            this.write((int)((byte)length));
        }
    }

    void a(int tag, byte[] bytes) throws IOException {
        this.write(tag);
        this.a(bytes.length);
        this.write(bytes);
    }

    protected void writeNull() throws IOException {
        this.write(5);
        this.write(0);
    }

    @Override
    public void write(byte[] buf) throws IOException {
        this.out.write(buf, 0, buf.length);
    }

    @Override
    public void write(byte[] buf, int offSet, int len) throws IOException {
        this.out.write(buf, offSet, len);
    }

    public void writeObject(Object obj) throws IOException {
        if (obj == null) {
            this.writeNull();
        } else if (obj instanceof DERObject) {
            ((DERObject)obj).encode(this);
        } else if (obj instanceof DEREncodable) {
            ((DEREncodable)obj).getDERObject().encode(this);
        } else {
            throw new IOException("object not DEREncodable");
        }
    }
}

