/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.AvisoTO
 *  br.gov.sp.fazenda.dsen.common.to.PropriedadeTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.view.AvisoGUI
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.to.AvisoTO;
import br.gov.sp.fazenda.dsen.common.to.PropriedadeTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EventListener;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;

public class AvisoGUI
extends DSGESimplePanel {
    private String a;
    private JButton a;
    private JButton b;
    private JButton c;
    private JButton d;
    private JButton e;
    private JButton f;
    private JButton g;
    private JPanel a;
    private JPanel b;
    private JPanel c;
    private JPanel d;
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JLabel f;
    private JLabel g;
    private JLabel h;
    private JPanel e;
    private JPanel f;
    private JPanel g;

    public AvisoGUI(String op) throws DSGEViewException {
        this.setOperacao(op);
        this.a();
        this.b();
        this.bindController((ViewItf)this);
    }

    private void a() {
        this.a = new JPanel();
        this.h = new JLabel();
        this.g = new JLabel();
        this.b = new JLabel();
        this.b = new JButton();
        this.f = new JPanel();
        this.b = new JPanel();
        this.d = new JLabel();
        this.e = new JButton();
        this.d = new JPanel();
        this.e = new JLabel();
        this.f = new JButton();
        this.c = new JPanel();
        this.f = new JLabel();
        this.d = new JButton();
        this.g = new JPanel();
        this.c = new JLabel();
        this.g = new JButton();
        this.a = new JButton();
        this.e = new JPanel();
        this.a = new JLabel();
        this.c = new JButton();
        this.setBorder((Border)BorderFactory.createTitledBorder(null, "Avisos", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Retornos da SEFAZ Pendentes", 0, 0, new Font("Dialog", 1, 14), Color.blue));
        this.h.setFont(new Font("Dialog", 0, 12));
        this.h.setText("\u00daltima busca realizada em:");
        this.g.setFont(new Font("Dialog", 0, 12));
        this.g.setText("Existem 10 Notas Fiscais Eletr\u00f4nicas em processamento na SEFAZ. ");
        this.b.setFont(new Font("Dialog", 0, 12));
        this.b.setText("01/01/0000 ");
        this.b.setText("Visualizar");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.g, -1, 594, 32767).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.h).addGap(14, 14, 14).addComponent(this.b))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.g).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.h).addComponent(this.b))).addComponent(this.b)).addContainerGap(-1, 32767)));
        this.f.setBorder(BorderFactory.createTitledBorder(null, "NF-e's em conting\u00eancia com DANFE impresso n\u00e3o transmitidas", 0, 0, new Font("Dialog", 1, 14), Color.blue));
        this.b.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Dialog", 0, 11), Color.blue));
        this.d.setFont(new Font("Dialog", 0, 12));
        this.d.setText("<html><p><b>Em Conting\u00eancia via DPEC: </b>Existem 2 Notas Fiscais eletr\u00f4nicas n\u00e3o transmitidas para a SEFAZ. </p></html>");
        this.e.setText("Visualizar");
        GroupLayout jPanel4Layout = new GroupLayout(this.b);
        this.b.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.d, -1, 560, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e, -2, 95, -2).addContainerGap()));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.d, -2, 27, -2).addComponent(this.e));
        this.d.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Dialog", 0, 11), Color.blue));
        this.e.setFont(new Font("Dialog", 0, 12));
        this.e.setText("<html><p><b>Em Conting\u00eancia FS-DA: </b>Existem 2 Notas Fiscais eletr\u00f4nicas n\u00e3o transmitidas para a SEFAZ. </p></html>");
        this.f.setText("Visualizar");
        GroupLayout jPanel6Layout = new GroupLayout(this.d);
        this.d.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup().addContainerGap().addComponent(this.e, -1, 560, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.f, -2, 95, -2).addContainerGap()));
        jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.e, -2, 27, -2).addComponent(this.f));
        this.c.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Dialog", 0, 11), Color.blue));
        this.f.setFont(new Font("Dialog", 0, 12));
        this.f.setText("<html><p><b>Em Conting\u00eancia: </b>Existem 2 Notas Fiscais eletr\u00f4nicas n\u00e3o transmitidas para a SEFAZ. </p></html>");
        this.d.setText("Visualizar");
        GroupLayout jPanel5Layout = new GroupLayout(this.c);
        this.c.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(this.f, -1, 560, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d, -2, 95, -2).addContainerGap()));
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.f, -2, 27, -2).addComponent(this.d));
        GroupLayout pnlContingenciaLayout = new GroupLayout(this.f);
        this.f.setLayout(pnlContingenciaLayout);
        pnlContingenciaLayout.setHorizontalGroup(pnlContingenciaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlContingenciaLayout.createSequentialGroup().addContainerGap().addGroup(pnlContingenciaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b, -1, -1, 32767).addComponent(this.d, -1, -1, 32767).addComponent(this.c, -1, -1, 32767)).addContainerGap()));
        pnlContingenciaLayout.setVerticalGroup(pnlContingenciaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlContingenciaLayout.createSequentialGroup().addComponent(this.c, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d, -2, -1, -2).addContainerGap()));
        this.g.setBorder(BorderFactory.createTitledBorder(null, "Faixas de numera\u00e7\u00e3o a serem inutilizadas", 0, 0, new Font("Dialog", 1, 14), Color.blue));
        this.c.setFont(new Font("Dialog", 0, 12));
        this.c.setText("<html><p>O contribuinte dever\u00e1 inutilizar, at\u00e9 o 10\u00b0 (d\u00e9cimo) dia do m\u00eas subseq\u00fcente, os n\u00fameros de NF-e n\u00e3o utilizados, na eventualidade de quebra de seq\u00fc\u00eancia da numera\u00e7\u00e3o da NF-e. Caso a quebra de seq\u00fc\u00eancia tenha ocorrido, selecione a fun\u00e7\u00e3o \"Inutilizar Faixa de Numera\u00e7\u00e3o\" no menu \"Nota Fiscal\" e informe as faixas que dever\u00e3o ser inutilizadas. Se preferir, acesse a funcionalidade atrav\u00e9s do bot\u00e3o ao lado. </p></html>");
        this.g.setText("Visualizar");
        GroupLayout pnlFaixasNumeracaoLayout = new GroupLayout(this.g);
        this.g.setLayout(pnlFaixasNumeracaoLayout);
        pnlFaixasNumeracaoLayout.setHorizontalGroup(pnlFaixasNumeracaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlFaixasNumeracaoLayout.createSequentialGroup().addContainerGap().addComponent(this.c, -1, 594, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.g).addContainerGap()));
        pnlFaixasNumeracaoLayout.setVerticalGroup(pnlFaixasNumeracaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlFaixasNumeracaoLayout.createSequentialGroup().addGroup(pnlFaixasNumeracaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.c).addGroup(pnlFaixasNumeracaoLayout.createSequentialGroup().addGap(25, 25, 25).addComponent(this.g))).addContainerGap(-1, 32767)));
        this.a.setText("Fechar");
        this.e.setBorder(BorderFactory.createTitledBorder(null, "Notas autorizadas pendentes de exporta\u00e7\u00e3o para XML", 0, 0, new Font("Dialog", 1, 14), Color.blue));
        this.a.setFont(new Font("Dialog", 0, 12));
        this.a.setText("Existe(m) 2 Notas Fiscais eletr\u00f4nicas autorizadas pendentes de exporta\u00e7\u00e3o para XML");
        this.c.setText("Visualizar");
        GroupLayout pnlAutorizadaNaoExportadaLayout = new GroupLayout(this.e);
        this.e.setLayout(pnlAutorizadaNaoExportadaLayout);
        pnlAutorizadaNaoExportadaLayout.setHorizontalGroup(pnlAutorizadaNaoExportadaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlAutorizadaNaoExportadaLayout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, 593, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c).addContainerGap()));
        pnlAutorizadaNaoExportadaLayout.setVerticalGroup(pnlAutorizadaNaoExportadaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlAutorizadaNaoExportadaLayout.createSequentialGroup().addGroup(pnlAutorizadaNaoExportadaLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.a, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.c, GroupLayout.Alignment.LEADING, -1, -1, 32767)).addContainerGap()));
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.g, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.f, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.a, -1, -1, 32767))).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(13, 13, 13).addComponent(this.e, -1, -1, 32767))).addContainerGap()).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(342, 32767).addComponent(this.a).addContainerGap(343, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.f, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.g, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addGap(0, 0, 32767)));
    }

    public void addActionListener(EventListener listener) {
        this.b.addActionListener((ActionListener)listener);
        this.d.addActionListener((ActionListener)listener);
        this.e.addActionListener((ActionListener)listener);
        this.f.addActionListener((ActionListener)listener);
        this.g.addActionListener((ActionListener)listener);
        this.c.addActionListener((ActionListener)listener);
        this.a.addActionListener((ActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public void mostrarFaixasNumeracao(boolean show) {
        this.g.setVisible(show);
    }

    private void b() {
        this.b.setActionCommand("ACTION_INICIAR_BUSCA_SEFAZ");
        this.d.setActionCommand("ACTION_VISUALIZAR_NFE_CONTING_N_TRANS");
        this.e.setActionCommand("ACTION_VISUALIZAR_NFE_CONTING_DPEC_N_TRANS");
        this.f.setActionCommand("ACTION_VISUALIZAR_NFE_CONTING_FSDA_N_TRANS");
        this.g.setActionCommand("ACTION_VISUALIZAR_FAIXAS_INUT");
        this.a.setActionCommand("voltar");
        this.c.setActionCommand("ACTION_VISUALIZAR_AUTORIZADA_NAO_EXPORTADA_XML");
    }

    public void showAviso(AvisoTO aviso) {
        String dtUltimaBusca;
        if (aviso == null) {
            this.f.setText(DSENLabelConstants.NAO_EXISTE_NOTA_CONTING_NAO_TRANS);
            this.e.setText(DSENLabelConstants.NAO_EXISTE_NOTA_FSDA_DANFE_ASSINADA);
            this.d.setText(DSENLabelConstants.NAO_EXISTE_NOTA_DPEC_DANFE_ASSINADA);
            this.g.setText(DSENLabelConstants.NAO_EXISTE_NOTA_PROC_SEFAZ);
            this.c.setText(DSENLabelConstants.NAO_EXISTE_FAIXA_NUM_INUT);
            return;
        }
        int cnt = aviso.getNroNfeContNTransm();
        int cdnt = aviso.getNroNfeContDpecNTransm();
        int cfsdant = aviso.getNroNfeContFsdaNTransm();
        int np = aviso.getNroNotasEmProc();
        int ef = aviso.getFaixasInutilizar();
        int autorNaoExp = aviso.getNroNfeAutorNaoExport();
        String string = dtUltimaBusca = aviso.getUltimaBuscaSefaz() == null ? null : aviso.getUltimaBuscaSefaz().getValor();
        if (dtUltimaBusca == null) {
            this.b.setText(null);
            this.h.setText(null);
        } else {
            this.b.setText(DateHelper.formataDataHora((Date)new Date(new Long(dtUltimaBusca)), (SimpleDateFormat)DateHelper.DATE_TIME_FORMAT));
            this.h.setText(DSENLabelConstants.ULTIMA_BUSCA_REALIZADA_EM);
        }
        if (np == 0) {
            this.b.setVisible(false);
            this.g.setText(DSENLabelConstants.NAO_EXISTE_NOTA_PROC_SEFAZ);
        } else {
            this.b.setVisible(true);
            if (np == 1) {
                this.g.setText(DSENLabelConstants.EXISTE_NOTA_PROC_SEFAZ);
            } else {
                this.g.setText(MessageFormat.format(DSENLabelConstants.EXISTEM_NOTAS_PROC_SEFAZ, np));
            }
        }
        if (cnt == 0) {
            this.d.setVisible(false);
            this.f.setText(DSENLabelConstants.NAO_EXISTE_NOTA_CONTING_NAO_TRANS);
        } else {
            this.d.setVisible(true);
            if (cnt == 1) {
                this.f.setText(DSENLabelConstants.EXISTE_NOTA_CONTING_NAO_TRANS);
            } else {
                this.f.setText(MessageFormat.format(DSENLabelConstants.EXISTEM_NOTAS_CONTING_NAO_TRANS, cnt));
            }
        }
        if (cdnt == 0) {
            this.e.setVisible(false);
            this.d.setText(DSENLabelConstants.NAO_EXISTE_NOTA_DPEC_DANFE_ASSINADA);
        } else {
            this.e.setVisible(true);
            if (cdnt == 1) {
                this.d.setText(DSENLabelConstants.EXISTE_UMA_NOTA_DPEC_DANFE_ASSINADA);
            } else {
                this.d.setText(MessageFormat.format(DSENLabelConstants.EXISTEM_X_NOTA_DPEC_DANFE_ASSINADA, cdnt));
            }
        }
        if (cfsdant == 0) {
            this.f.setVisible(false);
            this.e.setText(DSENLabelConstants.NAO_EXISTE_NOTA_FSDA_DANFE_ASSINADA);
        } else {
            this.f.setVisible(true);
            if (cfsdant == 1) {
                this.e.setText(DSENLabelConstants.EXISTE_UMA_NOTA_FSDA_DANFE_ASSINADA);
            } else {
                this.e.setText(MessageFormat.format(DSENLabelConstants.EXISTEM_X_NOTA_FSDA_DANFE_ASSINADA, cfsdant));
            }
        }
        if (ef == 0) {
            this.g.setVisible(false);
            this.c.setText(DSENLabelConstants.NAO_EXISTE_FAIXA_NUM_INUT);
        } else {
            this.g.setVisible(true);
            if (ef == 1) {
                this.c.setText(DSENLabelConstants.EXISTE_FAIXA_NUM_INUT);
            } else {
                this.c.setText(MessageFormat.format(DSENLabelConstants.EXISTEM_FAIXAS_NUM_INUT, ef));
            }
        }
        if (autorNaoExp == 0) {
            this.c.setVisible(false);
            this.a.setText(DSENLabelConstants.NAO_EXISTE_AUTORIZADA_NAO_EXPORTADA_XML);
        } else {
            this.c.setVisible(true);
            if (autorNaoExp == 1) {
                this.a.setText(DSENLabelConstants.EXISTE_UMA_NFE_AUTORIZADA_NAO_EXPORTADA_XML);
            } else {
                this.a.setText(MessageFormat.format(DSENLabelConstants.EXISTEM_X_NFE_AUTORIZADA_NAO_EXPORTADA_XML, autorNaoExp));
            }
        }
    }

    public String getOperacao() {
        return this.a;
    }

    public void setOperacao(String operacao) {
        this.a = operacao;
    }

    public void setBuscaSefazEnabled(boolean enabled) {
        this.b.setEnabled(enabled);
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }
}

