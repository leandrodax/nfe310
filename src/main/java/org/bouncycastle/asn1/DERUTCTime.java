/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1Object
 *  org.bouncycastle.asn1.ASN1OctetString
 *  org.bouncycastle.asn1.ASN1TaggedObject
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DEROutputStream
 *  org.bouncycastle.asn1.DERUTCTime
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROutputStream;

/*
 * Exception performing whole class analysis ignored.
 */
public class DERUTCTime
extends ASN1Object {
    String a;

    public static DERUTCTime getInstance(Object obj) {
        if (obj == null || obj instanceof DERUTCTime) {
            return (DERUTCTime)obj;
        }
        if (obj instanceof ASN1OctetString) {
            return new DERUTCTime(((ASN1OctetString)obj).getOctets());
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static DERUTCTime getInstance(ASN1TaggedObject obj, boolean explicit) {
        return DERUTCTime.getInstance((Object)obj.getObject());
    }

    public DERUTCTime(String time) {
        this.a = time;
        try {
            this.getDate();
        }
        catch (ParseException e) {
            throw new IllegalArgumentException("invalid date string: " + e.getMessage());
        }
    }

    public DERUTCTime(Date time) {
        SimpleDateFormat dateF = new SimpleDateFormat("yyMMddHHmmss'Z'");
        dateF.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.a = dateF.format(time);
    }

    DERUTCTime(byte[] bytes) {
        char[] dateC = new char[bytes.length];
        for (int i = 0; i != dateC.length; ++i) {
            dateC[i] = (char)(bytes[i] & 255);
        }
        this.a = new String(dateC);
    }

    public Date getDate() throws ParseException {
        SimpleDateFormat dateF = new SimpleDateFormat("yyMMddHHmmssz");
        return dateF.parse(this.getTime());
    }

    public Date getAdjustedDate() throws ParseException {
        SimpleDateFormat dateF = new SimpleDateFormat("yyyyMMddHHmmssz");
        dateF.setTimeZone(new SimpleTimeZone(0, "Z"));
        return dateF.parse(this.getAdjustedTime());
    }

    public String getTime() {
        if (this.a.indexOf(45) < 0 && this.a.indexOf(43) < 0) {
            if (this.a.length() == 11) {
                return this.a.substring(0, 10) + "00GMT+00:00";
            }
            return this.a.substring(0, 12) + "GMT+00:00";
        }
        int index = this.a.indexOf(45);
        if (index < 0) {
            index = this.a.indexOf(43);
        }
        String d = this.a;
        if (index == this.a.length() - 3) {
            d = d + "00";
        }
        if (index == 10) {
            return d.substring(0, 10) + "00GMT" + d.substring(10, 13) + ":" + d.substring(13, 15);
        }
        return d.substring(0, 12) + "GMT" + d.substring(12, 15) + ":" + d.substring(15, 17);
    }

    public String getAdjustedTime() {
        String d = this.getTime();
        if (d.charAt(0) < '5') {
            return "20" + d;
        }
        return "19" + d;
    }

    private byte[] a() {
        char[] cs = this.a.toCharArray();
        byte[] bs = new byte[cs.length];
        for (int i = 0; i != cs.length; ++i) {
            bs[i] = (byte)cs[i];
        }
        return bs;
    }

    void encode(DEROutputStream out) throws IOException {
        out.a(23, this.a());
    }

    boolean asn1Equals(DERObject o) {
        if (!(o instanceof DERUTCTime)) {
            return false;
        }
        return this.a.equals(((DERUTCTime)o).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }
}

