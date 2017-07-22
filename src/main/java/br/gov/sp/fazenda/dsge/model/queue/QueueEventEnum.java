/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.model.queue.QueueEventEnum
 */
package br.gov.sp.fazenda.dsge.model.queue;

public enum QueueEventEnum {
    OnPush,
    OnConsume,
    OnWakeup,
    OnSleep,
    OnStartup,
    OnShutdown,
    OnError,
    OnCancel;
    

    private QueueEventEnum() {
    }
}

