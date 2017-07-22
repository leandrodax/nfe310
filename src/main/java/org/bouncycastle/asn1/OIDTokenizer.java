/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.OIDTokenizer
 */
package org.bouncycastle.asn1;

public class OIDTokenizer {
    private String a;
    private int a;

    public OIDTokenizer(String oid) {
        this.a = oid;
        this.a = 0;
    }

    public boolean hasMoreTokens() {
        return this.a != -1;
    }

    public String nextToken() {
        if (this.a == -1) {
            return null;
        }
        int end = this.a.indexOf(46, this.a);
        if (end == -1) {
            String token = this.a.substring(this.a);
            this.a = -1;
            return token;
        }
        String token = this.a.substring(this.a, end);
        this.a = end + 1;
        return token;
    }
}

