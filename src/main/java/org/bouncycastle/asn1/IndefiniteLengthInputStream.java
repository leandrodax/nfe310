/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.IndefiniteLengthInputStream
 *  org.bouncycastle.asn1.LimitedInputStream
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.LimitedInputStream;

class IndefiniteLengthInputStream
extends LimitedInputStream {
    private int a;
    private int b;
    private boolean a = false;
    private boolean b = true;

    IndefiniteLengthInputStream(InputStream in) throws IOException {
        super(in);
        this.a = in.read();
        this.b = in.read();
        this.a = this.b < 0;
    }

    void a(boolean eofOn00) {
        this.b = eofOn00;
    }

    void a() throws IOException {
        if (this.b && this.a == 0 && this.b == 0) {
            this.a = true;
            this.b(true);
        }
    }

    public int read() throws IOException {
        this.a();
        if (this.a) {
            return -1;
        }
        int b = this.a.read();
        if (b < 0) {
            this.a = true;
            return -1;
        }
        int v = this.a;
        this.a = this.b;
        this.b = b;
        return v;
    }
}

