/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.model.queue.QueueListener
 *  br.gov.sp.fazenda.dsge.model.queue.QueueListenerAdapter
 */
package br.gov.sp.fazenda.dsge.model.queue;

import br.gov.sp.fazenda.dsge.model.queue.QueueListener;

public class QueueListenerAdapter<T>
implements QueueListener<T> {
    public void onConsume(T obj) {
    }

    public void onWakeup(T obj, int queueSize) {
    }

    public void onSleep(T obj) {
    }

    public void onStartup(T obj) {
    }

    public void onShutdown(T obj) {
    }

    public void onError(T obj, Throwable error) {
    }

    public void onCancel(int agendadosCancelados, int prontosCancelados) {
    }

    public void onPush(T obj) {
    }
}

