/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1Object
 *  org.bouncycastle.asn1.ASN1OctetString
 *  org.bouncycastle.asn1.ASN1TaggedObject
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DERObjectIdentifier
 *  org.bouncycastle.asn1.DEROutputStream
 *  org.bouncycastle.asn1.OIDTokenizer
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROutputStream;
import org.bouncycastle.asn1.OIDTokenizer;

/*
 * Exception performing whole class analysis ignored.
 */
public class DERObjectIdentifier
extends ASN1Object {
    String a;

    public static DERObjectIdentifier getInstance(Object obj) {
        if (obj == null || obj instanceof DERObjectIdentifier) {
            return (DERObjectIdentifier)obj;
        }
        if (obj instanceof ASN1OctetString) {
            return new DERObjectIdentifier(((ASN1OctetString)obj).getOctets());
        }
        if (obj instanceof ASN1TaggedObject) {
            return DERObjectIdentifier.getInstance((Object)((ASN1TaggedObject)obj).getObject());
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static DERObjectIdentifier getInstance(ASN1TaggedObject obj, boolean explicit) {
        return DERObjectIdentifier.getInstance((Object)obj.getObject());
    }

    DERObjectIdentifier(byte[] bytes) {
        StringBuffer objId = new StringBuffer();
        long value = 0;
        BigInteger bigValue = null;
        boolean first = true;
        for (int i = 0; i != bytes.length; ++i) {
            int b = bytes[i] & 255;
            if (value < 0x80000000000000L) {
                value = value * 128 + (long)(b & 127);
                if ((b & 128) != 0) continue;
                if (first) {
                    switch ((int)value / 40) {
                        case 0: {
                            objId.append('0');
                            break;
                        }
                        case 1: {
                            objId.append('1');
                            value -= 40;
                            break;
                        }
                        default: {
                            objId.append('2');
                            value -= 80;
                        }
                    }
                    first = false;
                }
                objId.append('.');
                objId.append(value);
                value = 0;
                continue;
            }
            if (bigValue == null) {
                bigValue = BigInteger.valueOf(value);
            }
            bigValue = bigValue.shiftLeft(7);
            bigValue = bigValue.or(BigInteger.valueOf(b & 127));
            if ((b & 128) != 0) continue;
            objId.append('.');
            objId.append(bigValue);
            bigValue = null;
            value = 0;
        }
        this.a = objId.toString();
    }

    public DERObjectIdentifier(String identifier) {
        if (!DERObjectIdentifier.a((String)identifier)) {
            throw new IllegalArgumentException("string " + identifier + " not an OID");
        }
        this.a = identifier;
    }

    public String getId() {
        return this.a;
    }

    private void a(OutputStream out, long fieldValue) throws IOException {
        if (fieldValue >= 128) {
            if (fieldValue >= 16384) {
                if (fieldValue >= 0x200000) {
                    if (fieldValue >= 0x10000000) {
                        if (fieldValue >= 0x800000000L) {
                            if (fieldValue >= 0x40000000000L) {
                                if (fieldValue >= 0x2000000000000L) {
                                    if (fieldValue >= 0x100000000000000L) {
                                        out.write((int)(fieldValue >> 56) | 128);
                                    }
                                    out.write((int)(fieldValue >> 49) | 128);
                                }
                                out.write((int)(fieldValue >> 42) | 128);
                            }
                            out.write((int)(fieldValue >> 35) | 128);
                        }
                        out.write((int)(fieldValue >> 28) | 128);
                    }
                    out.write((int)(fieldValue >> 21) | 128);
                }
                out.write((int)(fieldValue >> 14) | 128);
            }
            out.write((int)(fieldValue >> 7) | 128);
        }
        out.write((int)fieldValue & 127);
    }

    private void a(OutputStream out, BigInteger fieldValue) throws IOException {
        int byteCount = (fieldValue.bitLength() + 6) / 7;
        if (byteCount == 0) {
            out.write(0);
        } else {
            BigInteger tmpValue = fieldValue;
            byte[] tmp = new byte[byteCount];
            for (int i = byteCount - 1; i >= 0; --i) {
                tmp[i] = (byte)(tmpValue.intValue() & 127 | 128);
                tmpValue = tmpValue.shiftRight(7);
            }
            byte[] arrby = tmp;
            int n = byteCount - 1;
            arrby[n] = (byte)(arrby[n] & 127);
            out.write(tmp);
        }
    }

    void encode(DEROutputStream out) throws IOException {
        OIDTokenizer tok = new OIDTokenizer(this.a);
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        DEROutputStream dOut = new DEROutputStream((OutputStream)bOut);
        this.a((OutputStream)bOut, (long)(Integer.parseInt(tok.nextToken()) * 40 + Integer.parseInt(tok.nextToken())));
        while (tok.hasMoreTokens()) {
            String token = tok.nextToken();
            if (token.length() < 18) {
                this.a((OutputStream)bOut, Long.parseLong(token));
                continue;
            }
            this.a((OutputStream)bOut, new BigInteger(token));
        }
        dOut.close();
        byte[] bytes = bOut.toByteArray();
        out.a(6, bytes);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    boolean asn1Equals(DERObject o) {
        if (!(o instanceof DERObjectIdentifier)) {
            return false;
        }
        return this.a.equals(((DERObjectIdentifier)o).a);
    }

    public String toString() {
        return this.getId();
    }

    private static boolean a(String identifier) {
        if (identifier.length() < 3 || identifier.charAt(1) != '.') {
            return false;
        }
        char first = identifier.charAt(0);
        if (first < '0' || first > '2') {
            return false;
        }
        boolean periodAllowed = false;
        for (int i = identifier.length() - 1; i >= 2; --i) {
            char ch = identifier.charAt(i);
            if ('0' <= ch && ch <= '9') {
                periodAllowed = true;
                continue;
            }
            if (ch == '.') {
                if (!periodAllowed) {
                    return false;
                }
                periodAllowed = false;
                continue;
            }
            return false;
        }
        return periodAllowed;
    }
}

