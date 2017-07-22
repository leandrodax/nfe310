/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.model.queue.QueueListener
 */
package br.gov.sp.fazenda.dsge.model.queue;

public interface QueueListener<T> {
    public void onPush(T var1);

    public void onConsume(T var1);

    public void onWakeup(T var1, int var2);

    public void onSleep(T var1);

    public void onStartup(T var1);

    public void onShutdown(T var1);

    public void onError(T var1, Throwable var2);

    public void onCancel(int var1, int var2);
}

