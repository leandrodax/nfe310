/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.IndefiniteLengthInputStream
 *  org.bouncycastle.asn1.LimitedInputStream
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.IndefiniteLengthInputStream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
abstract class LimitedInputStream
extends InputStream {
    protected final InputStream a;

    LimitedInputStream(InputStream in) {
        this.a = in;
    }

    byte[] a() throws IOException {
        int b;
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        while ((b = this.read()) >= 0) {
            bOut.write(b);
        }
        return bOut.toByteArray();
    }

    InputStream a() {
        return this.a;
    }

    protected void b(boolean on) {
        if (this.a instanceof IndefiniteLengthInputStream) {
            ((IndefiniteLengthInputStream)this.a).a(on);
        }
    }
}

