/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.model.queue.QueueRetornoItem
 */
package br.gov.sp.fazenda.dsge.model.queue;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import java.util.Date;

public class QueueRetornoItem
extends BaseTO {
    private static final long a = 7272002000181698224L;
    int a;
    private long b = 0;
    private boolean a;
    private Date a;

    public int getId() {
        return this.a;
    }

    public void setId(int id) {
        this.a = id;
    }

    public QueueRetornoItem(int id, long timeToGo) {
        this.a = id;
        this.b = System.currentTimeMillis() + timeToGo * 1000;
    }

    public QueueRetornoItem(int id, QueueRetornoItem item, long timeToGo) {
        this.a = id;
        this.b = item.getTimeToGo() + timeToGo * 1000;
    }

    public String toString() {
        return "" + this.a;
    }

    public long getTimeToGo() {
        return this.b;
    }

    public void setTimeToGo(long timeToGo) {
        this.b = timeToGo;
    }

    public void setExecutado(boolean executado) {
        this.a = executado;
    }

    public boolean isExecutado() {
        return this.a;
    }

    public void setHoraTerminoExecucao(Date horaTerminoExecucao) {
        this.a = horaTerminoExecucao;
    }

    public Date getHoraTerminoExecucao() {
        return this.a;
    }
}

