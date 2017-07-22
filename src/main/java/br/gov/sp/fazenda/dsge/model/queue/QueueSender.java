/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.model.queue.QueueRetornoItem
 *  br.gov.sp.fazenda.dsge.model.queue.QueueSender
 */
package br.gov.sp.fazenda.dsge.model.queue;

import br.gov.sp.fazenda.dsge.model.queue.QueueRetornoItem;

public interface QueueSender<T extends QueueRetornoItem> {
    public void onSend(T var1) throws Exception;
}

