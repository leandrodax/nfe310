/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.io.UnicodeInputStream
 */
package br.gov.sp.fazenda.dsge.common.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

public class UnicodeInputStream
extends InputStream {
    PushbackInputStream a;
    boolean a;
    String a = false;
    String b;
    private static final int a = 4;

    public UnicodeInputStream(InputStream in, String defaultEnc) {
        this.a = new PushbackInputStream(in, 4);
        this.a = defaultEnc;
    }

    public String getDefaultEncoding() {
        return this.a;
    }

    public String getEncoding() {
        if (!this.a) {
            try {
                this.init();
            }
            catch (IOException ex) {
                IllegalStateException ise = new IllegalStateException("Init method failed.");
                ise.initCause(ise);
                throw ise;
            }
        }
        return this.b;
    }

    protected void init() throws IOException {
        int unread;
        if (this.a) {
            return;
        }
        byte[] bom = new byte[4];
        int n = this.a.read(bom, 0, bom.length);
        if (bom[0] == 0 && bom[1] == 0 && bom[2] == -2 && bom[3] == -1) {
            this.b = "UTF-32BE";
            unread = n - 4;
        } else if (bom[0] == -1 && bom[1] == -2 && bom[2] == 0 && bom[3] == 0) {
            this.b = "UTF-32LE";
            unread = n - 4;
        } else if (bom[0] == -17 && bom[1] == -69 && bom[2] == -65) {
            this.b = "UTF-8";
            unread = n - 3;
        } else if (bom[0] == -2 && bom[1] == -1) {
            this.b = "UTF-16BE";
            unread = n - 2;
        } else if (bom[0] == -1 && bom[1] == -2) {
            this.b = "UTF-16LE";
            unread = n - 2;
        } else {
            this.b = this.a;
            unread = n;
        }
        if (unread > 0) {
            this.a.unread(bom, n - unread, unread);
        }
        this.a = true;
    }

    @Override
    public void close() throws IOException {
        this.a = true;
        this.a.close();
    }

    @Override
    public int read() throws IOException {
        this.a = true;
        return this.a.read();
    }
}

