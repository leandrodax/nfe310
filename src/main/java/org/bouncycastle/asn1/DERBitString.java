/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1Object
 *  org.bouncycastle.asn1.ASN1OctetString
 *  org.bouncycastle.asn1.ASN1OutputStream
 *  org.bouncycastle.asn1.ASN1TaggedObject
 *  org.bouncycastle.asn1.DERBitString
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DEROutputStream
 *  org.bouncycastle.asn1.DERString
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROutputStream;
import org.bouncycastle.asn1.DERString;

/*
 * Exception performing whole class analysis ignored.
 */
public class DERBitString
extends ASN1Object
implements DERString {
    private static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    protected byte[] data;
    protected int padBits;

    protected static int getPadBits(int bitString) {
        int val = 0;
        for (int i = 3; i >= 0; --i) {
            if (i != 0) {
                if (bitString >> i * 8 == 0) continue;
                val = bitString >> i * 8 & 255;
                break;
            }
            if (bitString == 0) continue;
            val = bitString & 255;
            break;
        }
        if (val == 0) {
            return 7;
        }
        int bits = 1;
        while (((val <<= 1) & 255) != 0) {
            ++bits;
        }
        return 8 - bits;
    }

    protected static byte[] getBytes(int bitString) {
        int bytes = 4;
        for (int i = 3; i >= 1 && (bitString & 255 << i * 8) == 0; --i) {
            --bytes;
        }
        byte[] result = new byte[bytes];
        for (int i = 0; i < bytes; ++i) {
            result[i] = (byte)(bitString >> i * 8 & 255);
        }
        return result;
    }

    public static DERBitString getInstance(Object obj) {
        if (obj == null || obj instanceof DERBitString) {
            return (DERBitString)obj;
        }
        if (obj instanceof ASN1OctetString) {
            byte[] bytes = ((ASN1OctetString)obj).getOctets();
            byte padBits = bytes[0];
            byte[] data = new byte[bytes.length - 1];
            System.arraycopy(bytes, 1, data, 0, bytes.length - 1);
            return new DERBitString(data, (int)padBits);
        }
        if (obj instanceof ASN1TaggedObject) {
            return DERBitString.getInstance((Object)((ASN1TaggedObject)obj).getObject());
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static DERBitString getInstance(ASN1TaggedObject obj, boolean explicit) {
        return DERBitString.getInstance((Object)obj.getObject());
    }

    protected DERBitString(byte data, int padBits) {
        this.data = new byte[1];
        this.data[0] = data;
        this.padBits = padBits;
    }

    public DERBitString(byte[] data, int padBits) {
        this.data = data;
        this.padBits = padBits;
    }

    public DERBitString(byte[] data) {
        this(data, 0);
    }

    public DERBitString(DEREncodable obj) {
        try {
            ByteArrayOutputStream bOut = new ByteArrayOutputStream();
            DEROutputStream dOut = new DEROutputStream((OutputStream)bOut);
            dOut.writeObject((Object)obj);
            dOut.close();
            this.data = bOut.toByteArray();
            this.padBits = 0;
        }
        catch (IOException e) {
            throw new IllegalArgumentException("Error processing object : " + e.toString());
        }
    }

    public byte[] getBytes() {
        return this.data;
    }

    public int getPadBits() {
        return this.padBits;
    }

    public int intValue() {
        int value = 0;
        for (int i = 0; i != this.data.length && i != 4; ++i) {
            value |= (this.data[i] & 255) << 8 * i;
        }
        return value;
    }

    void encode(DEROutputStream out) throws IOException {
        byte[] bytes = new byte[this.getBytes().length + 1];
        bytes[0] = (byte)this.getPadBits();
        System.arraycopy(this.getBytes(), 0, bytes, 1, bytes.length - 1);
        out.a(3, bytes);
    }

    public int hashCode() {
        int value = 0;
        for (int i = 0; i != this.data.length; ++i) {
            value ^= (this.data[i] & 255) << i % 4;
        }
        return value;
    }

    protected boolean asn1Equals(DERObject o) {
        if (!(o instanceof DERBitString)) {
            return false;
        }
        DERBitString other = (DERBitString)o;
        if (this.data.length != other.data.length) {
            return false;
        }
        for (int i = 0; i != this.data.length; ++i) {
            if (this.data[i] == other.data[i]) continue;
            return false;
        }
        return this.padBits == other.padBits;
    }

    public String getString() {
        StringBuffer buf = new StringBuffer("#");
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        ASN1OutputStream aOut = new ASN1OutputStream((OutputStream)bOut);
        try {
            aOut.writeObject((Object)this);
        }
        catch (IOException e) {
            throw new RuntimeException("internal error encoding BitString");
        }
        byte[] string = bOut.toByteArray();
        for (int i = 0; i != string.length; ++i) {
            buf.append(a[string[i] >>> 4 & 15]);
            buf.append(a[string[i] & 15]);
        }
        return buf.toString();
    }

    public String toString() {
        return this.getString();
    }

    static {
    }
}

