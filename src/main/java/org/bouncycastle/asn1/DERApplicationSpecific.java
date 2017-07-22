/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1InputStream
 *  org.bouncycastle.asn1.ASN1Object
 *  org.bouncycastle.asn1.DERApplicationSpecific
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DEROutputStream
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROutputStream;

public class DERApplicationSpecific
extends ASN1Object {
    private int a;
    private byte[] a;

    public DERApplicationSpecific(int tag, byte[] octets) {
        this.a = tag;
        this.a = octets;
    }

    public DERApplicationSpecific(int tag, DEREncodable object) throws IOException {
        this(true, tag, object);
    }

    public DERApplicationSpecific(boolean explicit, int tag, DEREncodable object) throws IOException {
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        DEROutputStream dos = new DEROutputStream((OutputStream)bOut);
        dos.writeObject((Object)object);
        byte[] data = bOut.toByteArray();
        if (tag >= 31) {
            throw new IOException("unsupported tag number");
        }
        if (explicit) {
            this.a = tag | 32;
            this.a = data;
        } else {
            this.a = tag;
            int lenBytes = this.a(data);
            byte[] tmp = new byte[data.length - lenBytes];
            System.arraycopy(data, lenBytes, tmp, 0, tmp.length);
            this.a = tmp;
        }
    }

    private int a(byte[] data) {
        int count = 2;
        while ((data[count - 1] & 128) != 0) {
            ++count;
        }
        return count;
    }

    public boolean isConstructed() {
        return (this.a & 32) != 0;
    }

    public byte[] getContents() {
        return this.a;
    }

    public int getApplicationTag() {
        return this.a;
    }

    public DERObject getObject() throws IOException {
        return new ASN1InputStream(this.getContents()).readObject();
    }

    public DERObject getObject(int derTagNo) throws IOException {
        if (this.a >= 31) {
            throw new IOException("unsupported tag number");
        }
        byte[] tmp = this.getEncoded();
        tmp[0] = (byte)derTagNo;
        return new ASN1InputStream(tmp).readObject();
    }

    void encode(DEROutputStream out) throws IOException {
        out.a(64 | this.a, this.a);
    }

    boolean asn1Equals(DERObject o) {
        if (!(o instanceof DERApplicationSpecific)) {
            return false;
        }
        DERApplicationSpecific other = (DERApplicationSpecific)o;
        if (this.a != other.a) {
            return false;
        }
        if (this.a.length != other.a.length) {
            return false;
        }
        for (int i = 0; i < this.a.length; ++i) {
            if (this.a[i] == other.a[i]) continue;
            return false;
        }
        return true;
    }

    public int hashCode() {
        byte[] b = this.getContents();
        int value = 0;
        for (int i = 0; i != b.length; ++i) {
            value ^= (b[i] & 255) << i % 4;
        }
        return value ^ this.getApplicationTag();
    }
}

