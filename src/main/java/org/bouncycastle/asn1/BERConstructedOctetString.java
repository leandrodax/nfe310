/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1OutputStream
 *  org.bouncycastle.asn1.BERConstructedOctetString
 *  org.bouncycastle.asn1.BEROutputStream
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DEROctetString
 *  org.bouncycastle.asn1.DEROutputStream
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.BEROutputStream;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DEROutputStream;

/*
 * Exception performing whole class analysis ignored.
 */
public class BERConstructedOctetString
extends DEROctetString {
    private static final int a = 1000;
    private Vector a;

    private static byte[] a(Vector octs) {
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        for (int i = 0; i != octs.size(); ++i) {
            try {
                DEROctetString o = (DEROctetString)octs.elementAt(i);
                bOut.write(o.getOctets());
                continue;
            }
            catch (ClassCastException e) {
                throw new IllegalArgumentException(octs.elementAt(i).getClass().getName() + " found in input should only contain DEROctetString");
            }
            catch (IOException e) {
                throw new IllegalArgumentException("exception converting octets " + e.toString());
            }
        }
        return bOut.toByteArray();
    }

    public BERConstructedOctetString(byte[] string) {
        super(string);
    }

    public BERConstructedOctetString(Vector octs) {
        super(BERConstructedOctetString.a((Vector)octs));
        this.a = octs;
    }

    public BERConstructedOctetString(DERObject obj) {
        super((DEREncodable)obj);
    }

    public BERConstructedOctetString(DEREncodable obj) {
        super((DEREncodable)obj.getDERObject());
    }

    public byte[] getOctets() {
        return this.a;
    }

    public Enumeration getObjects() {
        if (this.a == null) {
            return this.a().elements();
        }
        return this.a.elements();
    }

    private Vector a() {
        byte[] nStr;
        int start = 0;
        int end = 0;
        Vector<DEROctetString> vec = new Vector<DEROctetString>();
        while (end + 1 < this.a.length) {
            if (this.a[end] == 0 && this.a[end + 1] == 0) {
                nStr = new byte[end - start + 1];
                System.arraycopy(this.a, start, nStr, 0, nStr.length);
                vec.addElement(new DEROctetString(nStr));
                start = end + 1;
            }
            ++end;
        }
        nStr = new byte[this.a.length - start];
        System.arraycopy(this.a, start, nStr, 0, nStr.length);
        vec.addElement(new DEROctetString(nStr));
        return vec;
    }

    public void encode(DEROutputStream out) throws IOException {
        if (out instanceof ASN1OutputStream || out instanceof BEROutputStream) {
            out.write(36);
            out.write(128);
            if (this.a != null) {
                for (int i = 0; i != this.a.size(); ++i) {
                    out.writeObject(this.a.elementAt(i));
                }
            } else {
                for (int i = 0; i < this.a.length; i += 1000) {
                    int end = i + 1000 > this.a.length ? this.a.length : i + 1000;
                    byte[] nStr = new byte[end - i];
                    System.arraycopy(this.a, i, nStr, 0, nStr.length);
                    out.writeObject((Object)new DEROctetString(nStr));
                }
            }
            out.write(0);
            out.write(0);
        } else {
            super.encode(out);
        }
    }
}

