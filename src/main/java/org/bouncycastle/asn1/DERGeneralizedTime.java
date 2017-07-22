/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1Object
 *  org.bouncycastle.asn1.ASN1OctetString
 *  org.bouncycastle.asn1.ASN1TaggedObject
 *  org.bouncycastle.asn1.DERGeneralizedTime
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DEROutputStream
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
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public class DERGeneralizedTime
extends ASN1Object {
    String a;

    public static DERGeneralizedTime getInstance(Object obj) {
        if (obj == null || obj instanceof DERGeneralizedTime) {
            return (DERGeneralizedTime)obj;
        }
        if (obj instanceof ASN1OctetString) {
            return new DERGeneralizedTime(((ASN1OctetString)obj).getOctets());
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static DERGeneralizedTime getInstance(ASN1TaggedObject obj, boolean explicit) {
        return DERGeneralizedTime.getInstance((Object)obj.getObject());
    }

    public DERGeneralizedTime(String time) {
        this.a = time;
        try {
            this.getDate();
        }
        catch (ParseException e) {
            throw new IllegalArgumentException("invalid date string: " + e.getMessage());
        }
    }

    public DERGeneralizedTime(Date time) {
        SimpleDateFormat dateF = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
        dateF.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.a = dateF.format(time);
    }

    DERGeneralizedTime(byte[] bytes) {
        char[] dateC = new char[bytes.length];
        for (int i = 0; i != dateC.length; ++i) {
            dateC[i] = (char)(bytes[i] & 255);
        }
        this.a = new String(dateC);
    }

    public String getTimeString() {
        return this.a;
    }

    public String getTime() {
        if (this.a.charAt(this.a.length() - 1) == 'Z') {
            return this.a.substring(0, this.a.length() - 1) + "GMT+00:00";
        }
        int signPos = this.a.length() - 5;
        char sign = this.a.charAt(signPos);
        if (sign == '-' || sign == '+') {
            return this.a.substring(0, signPos) + "GMT" + this.a.substring(signPos, signPos + 3) + ":" + this.a.substring(signPos + 3);
        }
        signPos = this.a.length() - 3;
        sign = this.a.charAt(signPos);
        if (sign == '-' || sign == '+') {
            return this.a.substring(0, signPos) + "GMT" + this.a.substring(signPos) + ":00";
        }
        return this.a + this.a();
    }

    private String a() {
        String sign = "+";
        TimeZone timeZone = TimeZone.getDefault();
        int offset = timeZone.getRawOffset();
        if (offset < 0) {
            sign = "-";
            offset = - offset;
        }
        int hours = offset / 3600000;
        int minutes = (offset - hours * 60 * 60 * 1000) / 60000;
        try {
            if (timeZone.useDaylightTime() && timeZone.inDaylightTime(this.getDate())) {
                hours += sign.equals("+") ? 1 : -1;
            }
        }
        catch (ParseException parseException) {
            // empty catch block
        }
        return "GMT" + sign + this.a(hours) + ":" + this.a(minutes);
    }

    private String a(int time) {
        if (time < 10) {
            return "0" + time;
        }
        return Integer.toString(time);
    }

    public Date getDate() throws ParseException {
        SimpleDateFormat dateF;
        String d = this.a;
        if (this.a.endsWith("Z")) {
            dateF = this.a() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSS'Z'") : new SimpleDateFormat("yyyyMMddHHmmss'Z'");
            dateF.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (this.a.indexOf(45) > 0 || this.a.indexOf(43) > 0) {
            d = this.getTime();
            dateF = this.a() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSSz") : new SimpleDateFormat("yyyyMMddHHmmssz");
            dateF.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else {
            dateF = this.a() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSS") : new SimpleDateFormat("yyyyMMddHHmmss");
            dateF.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        return dateF.parse(d);
    }

    private boolean a() {
        return this.a.indexOf(46) == 14;
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
        out.a(24, this.a());
    }

    boolean asn1Equals(DERObject o) {
        if (!(o instanceof DERGeneralizedTime)) {
            return false;
        }
        return this.a.equals(((DERGeneralizedTime)o).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

