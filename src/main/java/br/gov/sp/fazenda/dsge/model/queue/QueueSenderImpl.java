/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.model.queue.QueueRetornoItem
 *  br.gov.sp.fazenda.dsge.model.queue.QueueSender
 *  br.gov.sp.fazenda.dsge.model.queue.QueueSenderImpl
 */
package br.gov.sp.fazenda.dsge.model.queue;

import br.gov.sp.fazenda.dsge.model.queue.QueueRetornoItem;
import br.gov.sp.fazenda.dsge.model.queue.QueueSender;
import java.util.logging.Logger;

public class QueueSenderImpl
implements QueueSender {
    private Logger a = Logger.getLogger(QueueSenderImpl.class.getName());

    public void onSend(QueueRetornoItem obj) {
        this.a.info("***** item: " + obj.toString() + " consumido.");
    }
}

