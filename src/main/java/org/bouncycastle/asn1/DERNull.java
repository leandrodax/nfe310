/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1Null
 *  org.bouncycastle.asn1.DERNull
 *  org.bouncycastle.asn1.DEROutputStream
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.DEROutputStream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class DERNull
extends ASN1Null {
    static final DERNull a = new DERNull();
    byte[] a = new byte[0];

    void encode(DEROutputStream out) throws IOException {
        out.a(5, this.a);
    }
}

