/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.DefiniteLengthInputStream
 *  org.bouncycastle.asn1.LimitedInputStream
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.LimitedInputStream;

class DefiniteLengthInputStream
extends LimitedInputStream {
    private int a;

    DefiniteLengthInputStream(InputStream in, int length) {
        super(in);
        this.a = length;
    }

    public int read() throws IOException {
        if (this.a-- > 0) {
            return this.a.read();
        }
        this.b(true);
        return -1;
    }
}

