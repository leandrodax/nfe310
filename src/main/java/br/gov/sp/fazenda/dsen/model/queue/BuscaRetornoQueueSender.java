/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTO
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta
 *  br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade
 *  br.gov.sp.fazenda.dsen.model.queue.BuscaRetornoQueueItem
 *  br.gov.sp.fazenda.dsen.model.queue.BuscaRetornoQueueSender
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.model.queue.QueueRetornoItem
 *  br.gov.sp.fazenda.dsge.model.queue.QueueSender
 */
package br.gov.sp.fazenda.dsen.model.queue;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.ParametroTO;
import br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta;
import br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade;
import br.gov.sp.fazenda.dsen.model.queue.BuscaRetornoQueueItem;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.model.queue.QueueRetornoItem;
import br.gov.sp.fazenda.dsge.model.queue.QueueSender;

public class BuscaRetornoQueueSender
implements QueueSender<BuscaRetornoQueueItem> {
    public void onSend(BuscaRetornoQueueItem obj) throws Exception {
        NotaFiscalFacade notaFiscalFacade = new NotaFiscalFacade();
        notaFiscalFacade.consultarSituacaoRecibo(obj.getNotaFiscalTO(), obj.getCertificadoTO());
        obj.setSituacaoNFeToItem();
        if (obj.getNotaFiscalTO().getErroXmlResposta() == null && SituacaoNFeEnum.EM_PROCESSAMENTO_SEFAZ.equals((Object)obj.getNotaFiscalTO().getSituacao())) {
            ParametroTO intervaloTentativa = (ParametroTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.PARAMETRO_INTERV_CONS_PROC_PEND, ParametroTO.class);
            notaFiscalFacade.reagendarBuscaRetorno(obj, new Long(intervaloTentativa.getValor()).longValue());
        }
    }
}

