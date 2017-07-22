/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 */
package br.gov.sp.fazenda.dsge.common.exception;

import java.io.PrintStream;
import java.io.PrintWriter;

public class DSGEBaseException
extends Exception {
    private static final long a = 4591773391919367112L;
    private Throwable a;
    private DSGEBaseException a;

    public DSGEBaseException(Throwable source, String mensagem) {
        super(mensagem);
        if (source instanceof DSGEBaseException) {
            this.a = (DSGEBaseException)source;
            this.a = this.a.getSourceException();
        } else {
            this.a = source;
        }
    }

    public Throwable getSourceException() {
        return this.a;
    }

    public DSGEBaseException getBaseException() {
        return this.a;
    }

    @Override
    public void printStackTrace() {
        if (this.a != null) {
            this.a.printStackTrace();
        } else {
            super.printStackTrace();
        }
    }

    @Override
    public void printStackTrace(PrintStream s) {
        if (this.a != null) {
            this.a.printStackTrace(s);
        } else {
            super.printStackTrace(s);
        }
    }

    @Override
    public void printStackTrace(PrintWriter s) {
        if (this.a != null) {
            this.a.printStackTrace(s);
        } else {
            super.printStackTrace(s);
        }
    }
}

