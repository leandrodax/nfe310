/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.io.UnicodeBOMInputStream
 *  br.gov.sp.fazenda.dsge.common.io.UnicodeBOMInputStream$BOM
 */
package br.gov.sp.fazenda.dsge.common.io;

import br.gov.sp.fazenda.dsge.common.io.UnicodeBOMInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

public class UnicodeBOMInputStream
extends InputStream {
    private final PushbackInputStream a;
    private final BOM a;
    private boolean a = false;

    public UnicodeBOMInputStream(InputStream inputStream) throws NullPointerException, IOException {
        if (inputStream == null) {
            throw new NullPointerException("invalid input stream: null is not allowed");
        }
        this.a = new PushbackInputStream(inputStream, 4);
        byte[] bom = new byte[4];
        int read = this.a.read(bom);
        switch (read) {
            case 4: {
                if (bom[0] == -1 && bom[1] == -2 && bom[2] == 0 && bom[3] == 0) {
                    this.a = BOM.UTF_32_LE;
                    break;
                }
                if (bom[0] == 0 && bom[1] == 0 && bom[2] == -2 && bom[3] == -1) {
                    this.a = BOM.UTF_32_BE;
                    break;
                }
            }
            case 3: {
                if (bom[0] == -17 && bom[1] == -69 && bom[2] == -65) {
                    this.a = BOM.UTF_8;
                    break;
                }
            }
            case 2: {
                if (bom[0] == -1 && bom[1] == -2) {
                    this.a = BOM.UTF_16_LE;
                    break;
                }
                if (bom[0] == -2 && bom[1] == -1) {
                    this.a = BOM.UTF_16_BE;
                    break;
                }
            }
            default: {
                this.a = BOM.NONE;
            }
        }
        if (read > 0) {
            this.a.unread(bom, 0, read);
        }
    }

    public final BOM getBOM() {
        return this.a;
    }

    public final synchronized UnicodeBOMInputStream skipBOM() throws IOException {
        if (!this.a) {
            this.a.skip(this.a.a.length);
            this.a = true;
        }
        return this;
    }

    @Override
    public int read() throws IOException {
        return this.a.read();
    }

    @Override
    public int read(byte[] b) throws IOException, NullPointerException {
        return this.a.read(b, 0, b.length);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException, NullPointerException {
        return this.a.read(b, off, len);
    }

    @Override
    public long skip(long n) throws IOException {
        return this.a.skip(n);
    }

    @Override
    public int available() throws IOException {
        return this.a.available();
    }

    @Override
    public void close() throws IOException {
        this.a.close();
    }

    @Override
    public synchronized void mark(int readlimit) {
        this.a.mark(readlimit);
    }

    @Override
    public synchronized void reset() throws IOException {
        this.a.reset();
    }

    @Override
    public boolean markSupported() {
        return this.a.markSupported();
    }
}

