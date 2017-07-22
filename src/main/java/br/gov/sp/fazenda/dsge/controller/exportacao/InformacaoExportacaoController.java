/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.app.Observer
 *  br.gov.sp.fazenda.dsge.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsge.common.enumeration.YesNoAllCancelEnum
 *  br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants
 *  br.gov.sp.fazenda.dsge.controller.exportacao.InformacaoExportacaoController
 *  br.gov.sp.fazenda.dsge.controller.exportacao.InformacaoExportacaoController$1
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exportacao.InformacaoExportacaoGUI
 *  br.gov.sp.fazenda.dsge.view.exportacao.YesNoAllCancelMessageGUI
 */
package br.gov.sp.fazenda.dsge.controller.exportacao;

import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.app.Observer;
import br.gov.sp.fazenda.dsge.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.GrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsge.common.enumeration.YesNoAllCancelEnum;
import br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants;
import br.gov.sp.fazenda.dsge.controller.exportacao.InformacaoExportacaoController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exportacao.InformacaoExportacaoGUI;
import br.gov.sp.fazenda.dsge.view.exportacao.YesNoAllCancelMessageGUI;
import java.awt.Dialog;
import java.awt.Frame;
import java.text.MessageFormat;

public class InformacaoExportacaoController
implements Observer {
    private InformacaoExportacaoGUI a;

    public InformacaoExportacaoController(Frame parentGUI) {
        this.a = new InformacaoExportacaoGUI(parentGUI, true);
    }

    public InformacaoExportacaoController(Dialog parentGUI) {
        this.a = new InformacaoExportacaoGUI(parentGUI, true);
    }

    public void inicializar() {
        Notificador.getInstance().register((Observer)this, new EnumItf[]{GrupoNotificacaoEnum.SOBRESCREVER_ARQUIVO_EXISTENTE, GrupoNotificacaoEnum.EXPORTACAO_RESULTADO, GrupoNotificacaoEnum.EXPORTACAO_TOTAIS});
        this.a.setTermino(false);
    }

    public InformacaoExportacaoGUI getGUI() {
        return this.a;
    }

    public void finalizar() {
        this.a.setTermino(true);
        Notificador.getInstance().remove((Observer)this);
        AppContext.getInstance().removeContextParameter((EnumItf)AppContextEnum.ACAO_SOBRESCREVER_ARQUIVO_EXISTENTE);
    }

    public void update(Object o, EnumItf source) {
        switch (1.a[((GrupoNotificacaoEnum)source).ordinal()]) {
            case 1: {
                this.a(o);
                break;
            }
            case 2: {
                this.notificarResultado((String)o);
                break;
            }
            case 3: {
                int[] totais = (int[])o;
                this.a.setTotalRegistros(totais[0]);
                this.a.setQtdeRegistrosExportados(totais[1]);
                this.a.setQtdeArquivosGerados(totais[2]);
            }
        }
    }

    public void notificarResultado(String mensagemResultado) {
        this.a.appendDetail(mensagemResultado);
    }

    private void a(Object obj) {
        String nomeArquivo = (String)obj;
        String question = MessageFormat.format(DSGEMessageConstants.ARQUIVO_JA_EXISTE_SOBRESCREVER, nomeArquivo);
        YesNoAllCancelEnum acaoArquivoExistente = YesNoAllCancelMessageGUI.showQuestion((String)question, (ViewItf)this.a);
        if (acaoArquivoExistente == YesNoAllCancelEnum.CANCELAR) {
            this.a.dispose();
        }
        AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.ACAO_SOBRESCREVER_ARQUIVO_EXISTENTE, (Object)acaoArquivoExistente);
    }
}

