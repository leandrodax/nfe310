/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.model.queue.QueueListenerImpl
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.TrayIconGrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsge.model.queue.QueueListener
 */
package br.gov.sp.fazenda.dsen.model.queue;

import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.TrayIconGrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsge.model.queue.QueueListener;

public class QueueListenerImpl<T>
implements QueueListener<T> {
    public void onConsume(T obj) {
    }

    public void onError(T obj, Throwable error) {
    }

    public void onShutdown(T obj) {
    }

    public void onSleep(T obj) {
        Notificador.getInstance().notificar((Object)DSENMessageConstants.MSG_BUSCA_RETORNO_CONCLUIDA, new EnumItf[]{TrayIconGrupoNotificacaoEnum.TRAY_ICON_INFO_MESSAGE});
    }

    public void onStartup(T obj) {
    }

    public void onWakeup(T obj, int queueSize) {
    }

    public void onCancel(int agendadosCancelados, int prontosCancelados) {
    }

    public void onPush(T obj) {
    }
}

