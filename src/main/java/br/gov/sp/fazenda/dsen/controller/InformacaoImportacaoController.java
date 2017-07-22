/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.importacao.SituacaoRegistroEnum
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO$Status
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoGuiTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.InformacaoImportacaoController
 *  br.gov.sp.fazenda.dsen.controller.InformacaoImportacaoController$1
 *  br.gov.sp.fazenda.dsen.controller.InformacaoImportacaoController$2
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.InformacaoImportacaoGUI
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.app.Observer
 *  br.gov.sp.fazenda.dsge.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsge.common.enumeration.YesNoAllCancelEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exportacao.YesNoAllCancelMessageGUI
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.importacao.SituacaoRegistroEnum;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoGuiTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.controller.InformacaoImportacaoController;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.InformacaoImportacaoGUI;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.app.Observer;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.GrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsge.common.enumeration.YesNoAllCancelEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exportacao.YesNoAllCancelMessageGUI;
import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class InformacaoImportacaoController
extends DSGEBaseController
implements Observer,
WindowListener {
    List<ImportacaoTelaTO> a;
    InformacaoImportacaoGUI a;
    ImageIcon a = new ImageIcon(InformacaoImportacaoGUI.class.getResource("resources/warning.gif"));
    ImageIcon b = new ImageIcon(InformacaoImportacaoGUI.class.getResource("resources/error.gif"));
    ImageIcon c = new ImageIcon(InformacaoImportacaoGUI.class.getResource("resources/check.gif"));

    public InformacaoImportacaoController(List<ImportacaoTelaTO> lista) {
        this.a = lista;
    }

    public void importar() {
        Notificador.getInstance().register((Observer)this, new EnumItf[]{br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum.IMPORTACAO_TIPO_AMBIENTE_DIFERENTE, br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum.IMPORTACAO_DUPLICIDADE_REGISTRO, br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum.IMPORTACAO_ASSINATURA_INVALIDA, GrupoNotificacaoEnum.SOBRESCREVER_ARQUIVO_EXISTENTE});
         s = new /* Unavailable Anonymous Inner Class!! */;
        s.execute();
    }

    private void a() {
    }

    private List<ImportacaoResultadoGuiTO> a(ImportacaoResultadoTO nto) {
        ArrayList<ImportacaoResultadoGuiTO> list = new ArrayList<ImportacaoResultadoGuiTO>();
        if (nto == null) {
            return list;
        }
        List impRegs = nto.getImportacaoRegistros();
        if (impRegs == null) {
            return list;
        }
        for (ImportacaoRegistroTO impReg : impRegs) {
            List impErrosList = impReg.getImportacaoErros();
            if (impErrosList == null || impErrosList.isEmpty()) {
                ImportacaoResultadoGuiTO regTO = new ImportacaoResultadoGuiTO();
                regTO.setNomeArquivo(impReg.getNomeArquivo());
                regTO.setSituacaoRegistro(impReg.getSituacaoRegistro());
                regTO.setIdRegistro(impReg.getIdRegistro());
                regTO.setIcon((Icon)this.c);
                list.add(regTO);
                continue;
            }
            for (ImportacaoErroTO impErro : impErrosList) {
                ImportacaoResultadoGuiTO erroTO = new ImportacaoResultadoGuiTO();
                erroTO.setNomeArquivo(impReg.getNomeArquivo());
                erroTO.setSituacaoRegistro(impReg.getSituacaoRegistro());
                erroTO.setIdRegistro(impReg.getIdRegistro());
                if (impErro.getStatus() == ImportacaoErroTO.Status.ERROR) {
                    erroTO.setIcon((Icon)this.b);
                } else {
                    erroTO.setIcon((Icon)this.a);
                }
                erroTO.setCampo(impErro.getCampo());
                erroTO.setMensagem(impErro.getMensagem());
                list.add(erroTO);
            }
        }
        return list;
    }

    public InformacaoImportacaoGUI getGUI() {
        this.a = new InformacaoImportacaoGUI((Frame)DSENDesktop.getInstance());
        this.a.addActionListener((EventListener)this);
        this.a.addWindowListener((WindowListener)this);
        return this.a;
    }

    public void actionPerformed(ActionEvent e) {
        if ("cancelar".equals(e.getActionCommand())) {
            this.a.dispose();
        }
    }

    public void update(Object data, EnumItf source) {
        GrupoNotificacaoEnum grupoEnum;
        String question = null;
        boolean resposta = false;
        if (source instanceof br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum) {
            switch (2.a[((br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum)source).ordinal()]) {
                case 1: {
                    question = data.toString();
                    boolean overwrite = this.a.showQuestion(question) == 0;
                    AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.IMPORTACAO_ACAO_DUPLICIDADE_REGISTRO, (Object)overwrite);
                    break;
                }
                case 2: {
                    question = data.toString();
                    resposta = this.a.showQuestion(question) == 0;
                    AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.IMPORTACAO_ACAO_TIPO_AMBIENTE_INVALIDO, (Object)resposta);
                    break;
                }
                case 3: {
                    question = data.toString();
                    resposta = this.a.showQuestion(question) == 0;
                    AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.IMPORTACAO_ACAO_ASSINATURA_INVALIDA, (Object)resposta);
                }
            }
        } else if (source instanceof GrupoNotificacaoEnum && GrupoNotificacaoEnum.SOBRESCREVER_ARQUIVO_EXISTENTE.equals((Object)(grupoEnum = (GrupoNotificacaoEnum)source))) {
            this.a(data);
        }
    }

    private void a(Object obj) {
        String nomeArquivo = (String)obj;
        String question = MessageFormat.format(DSGEMessageConstants.ARQUIVO_JA_EXISTE_SOBRESCREVER, nomeArquivo);
        YesNoAllCancelEnum acaoArquivoExistente = YesNoAllCancelMessageGUI.showQuestion((String)question, (ViewItf)((ViewItf)this.a.getParent()));
        AppContext.getInstance().setContextParameter((EnumItf)br.gov.sp.fazenda.dsge.common.enumeration.AppContextEnum.ACAO_SOBRESCREVER_ARQUIVO_EXISTENTE, (Object)acaoArquivoExistente);
    }

    private void b() {
        Notificador.getInstance().remove((Observer)this);
        AppContext.getInstance().removeContextParameter((EnumItf)br.gov.sp.fazenda.dsge.common.enumeration.AppContextEnum.ACAO_SOBRESCREVER_ARQUIVO_EXISTENTE);
        this.a.setProgressBarIndeterminated(false);
        this.a.setPercentCompleted(100);
        this.a.setDefaultCloseOperation(2);
        this.a.setBtnFecharEnabled(true);
    }

    private void a(DSGEBaseException ex) {
        this.b();
        this.a.setLabel1(DSENMessageConstants.IMPORTACAO_CONCLUIDA_COM_ERRO);
        this.a.setLabel2("");
        this.a.showErrors(ex);
    }

    private void a(ImportacaoResultadoTO resultadoTO) {
        this.b();
        this.a.setLabel1(DSENMessageConstants.IMPORTACAO_CONCLUIDA);
        if (resultadoTO.getSucesso() > 1) {
            this.a.setLabel2(MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_NUM_SUCESSO_ERRO_PLURAL, resultadoTO.getSucesso(), resultadoTO.getSucesso() + resultadoTO.getInsucesso()));
        } else {
            this.a.setLabel2(MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_NUM_SUCESSO_ERRO_SINGULAR, resultadoTO.getSucesso(), resultadoTO.getSucesso() + resultadoTO.getInsucesso()));
        }
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
        Notificador.getInstance().remove((Observer)this);
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    static /* synthetic */ List a(InformacaoImportacaoController x0, ImportacaoResultadoTO x1) {
        return x0.a(x1);
    }

    static /* synthetic */ void a(InformacaoImportacaoController x0, DSGEBaseException x1) {
        x0.a(x1);
    }

    static /* synthetic */ void a(InformacaoImportacaoController x0, ImportacaoResultadoTO x1) {
        x0.a(x1);
    }
}

