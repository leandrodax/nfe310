/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.DpecNotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.DpecTO
 *  br.gov.sp.fazenda.dsen.common.to.DpecTO$DpecStatus
 *  br.gov.sp.fazenda.dsen.view.DetalharDpecGUI
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.CNPJFormatter
 *  br.gov.sp.fazenda.dsge.view.format.DocumentoFormatter
 *  br.gov.sp.fazenda.dsge.view.format.NumberFormatterHelper
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.to.DpecNotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.DpecTO;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.CNPJFormatter;
import br.gov.sp.fazenda.dsge.view.format.DocumentoFormatter;
import br.gov.sp.fazenda.dsge.view.format.NumberFormatterHelper;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.event.CellEditorListener;
import javax.swing.text.DefaultFormatter;

public class DetalharDpecGUI
extends DSGESimplePanel {
    DpecTO a;
    private JButton a;
    private JButton b;
    private JButton c;
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JLabel f;
    private JLabel g;
    private JPanel a;
    private JPanel b;
    private JPanel c;
    private JFormattedTextField a;
    private JFormattedTextField b;
    private JFormattedTextField c;
    private JFormattedTextField d;
    private JFormattedTextField e;
    private JTextField a;
    private JTextField b;
    private CNPJFormatter a;
    private JDSGEPageableTable<DpecNotaFiscalTO> a;
    private Map<String, JComponent[]> a;

    public DetalharDpecGUI(DpecTO dpecTO, boolean btnSalvarVisible) throws DSGEViewException {
        this.a = dpecTO;
        this.a();
        this.c();
        this.a(dpecTO.getDpecStatus());
        this.b();
        this.setSalvarVisible(btnSalvarVisible);
        this.configureMapComponents();
        this.bindController((ViewItf)this);
        this.setDPEC(dpecTO);
    }

    public DetalharDpecGUI(DpecTO dpecTO) throws DSGEViewException {
        this(dpecTO, false);
    }

    public void setSalvarVisible(boolean visible) {
        this.c.setVisible(visible);
    }

    private void a() {
        try {
            this.a = new CNPJFormatter();
        }
        catch (ParseException e) {
            this.showErrors((DSGEBaseException)new DSGEViewException((Throwable)e, e.getMessage()));
        }
    }

    public List<DpecNotaFiscalTO> getSelectedDpecNotaFiscalTO() {
        return this.a.getSelectedTOs();
    }

    public void setDPEC(DpecTO dpecTO) {
        this.b.setText(dpecTO.getUfEmitente());
        this.c.setText(dpecTO.getCnpjEmitente());
        this.b.setText(DSGEDocumentoHelper.formatarIE((String)dpecTO.getIeEmitente(), (String)dpecTO.getUfEmitente()));
        if (dpecTO.getListaDpecNotaFiscal() != null) {
            this.a.addTO(dpecTO.getListaDpecNotaFiscal());
        }
        if (DpecTO.DpecStatus.AUTORIZADO.equals((Object)dpecTO.getDpecStatus())) {
            this.a.setVisible(true);
            this.b.setVisible(true);
            this.e.setText(dpecTO.getNumeroRegistro());
            if (!StringHelper.isBlankOrNull((Object)dpecTO.getDataRegistro())) {
                this.a.setText(DateHelper.formataDataHora((Date)dpecTO.getDataRegistro(), (SimpleDateFormat)DateHelper.DATE_TIME_FORMAT));
            } else {
                this.a.setText(null);
            }
            this.a.setText(dpecTO.getCodigoStatus());
            this.d.setText(dpecTO.getMotivo());
        } else {
            this.a.setVisible(false);
            this.b.setVisible(false);
            this.a.setText(null);
            this.a.setText(null);
            this.d.setText(null);
            this.e.setText(null);
        }
    }

    public void addActionListener(EventListener listener) {
        this.b.addActionListener((ActionListener)listener);
        this.a.addActionListener((ActionListener)listener);
        this.c.addActionListener((ActionListener)listener);
        this.a.addCellEditorListener(0, (CellEditorListener)listener);
    }

    public void configureMapComponents() {
        this.a = new HashMap();
        this.a.put("DPEC_NOTAFISCAL_SELECIONADO", new JComponent[]{this.a});
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    private void b() {
        this.b.setActionCommand("fechar");
        this.a.setActionCommand("ACTION_IMPRIMIR_DANFE");
        this.c.setActionCommand("salvar");
    }

    private void a(DpecTO.DpecStatus dpecStatus) {
        this.a = new JDSGEPageableTable();
        this.a.setPageable(false);
        this.a.setSortable(false);
        int columnIndex = 0;
        if (DpecTO.DpecStatus.AUTORIZADO.equals((Object)dpecStatus)) {
            this.a.addColumn(columnIndex++, "marcado", "", true, null);
            this.a.setSelectAllAvailable(true);
        } else {
            this.a.setSelectAllAvailable(false);
        }
        this.a.addColumn(columnIndex++, "chaveAcesso", "Chave de Acesso", false, "chaveAcesso");
        this.a.addColumn(columnIndex++, "documentoDestinatario", "CNPJ/CPF do destinat\u00e1rio", (DefaultFormatter)new DocumentoFormatter(), false, "documentoDestinatario");
        this.a.addColumn(columnIndex++, "ufDestinatario", "UF de destino", false, "ufDestinatario");
        this.a.addColumn(columnIndex++, "valorTotal", "Valor Total da NF-e", (DefaultFormatter)NumberFormatterHelper.getFormatter1302(), false, "valorTotal");
        this.a.addColumn(columnIndex++, "valorICMS", "Valor do ICMS", (DefaultFormatter)NumberFormatterHelper.getFormatter1302(), false, "valorICMS");
        this.a.addColumn(columnIndex++, "valorICMSST", "Valor do ICMS ST", (DefaultFormatter)NumberFormatterHelper.getFormatter1302(), false, "valorICMSST");
        this.a.setAutoFitTableColumns(true);
        this.a.setPanel(this.a);
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView(viewItf);
    }

    private void c() {
        this.c = new JPanel();
        this.a = new JLabel();
        this.c = new JFormattedTextField();
        this.a.install(this.c);
        this.c = new JLabel();
        this.b = new JFormattedTextField();
        this.g = new JLabel();
        this.b = new JTextField();
        this.a = new JPanel();
        this.a = new JButton();
        this.b = new JButton();
        this.b = new JPanel();
        this.e = new JLabel();
        this.e = new JFormattedTextField();
        this.a.install(this.c);
        this.b = new JLabel();
        this.a = new JFormattedTextField();
        this.f = new JLabel();
        this.a = new JTextField();
        this.d = new JLabel();
        this.d = new JFormattedTextField();
        this.a.install(this.c);
        this.c = new JButton();
        this.setBorder((Border)BorderFactory.createTitledBorder(null, "Detalhe do Arquivo de DPEC", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.c.setBorder(BorderFactory.createTitledBorder("Emitente"));
        this.a.setFont(new Font("Tahoma", 1, 11));
        this.a.setText("CNPJ");
        this.c.setEditable(false);
        this.c.setHorizontalAlignment(4);
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("Inscri\u00e7\u00e3o Estadual");
        this.b.setEditable(false);
        this.b.setHorizontalAlignment(4);
        this.g.setFont(new Font("Tahoma", 1, 11));
        this.g.setText("UF");
        this.b.setEditable(false);
        GroupLayout pnlEmitenteLayout = new GroupLayout(this.c);
        this.c.setLayout(pnlEmitenteLayout);
        pnlEmitenteLayout.setHorizontalGroup(pnlEmitenteLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlEmitenteLayout.createSequentialGroup().addContainerGap().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -2, 186, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, 197, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.g).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, 36, -2).addContainerGap(31, 32767)));
        pnlEmitenteLayout.setVerticalGroup(pnlEmitenteLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlEmitenteLayout.createSequentialGroup().addGroup(pnlEmitenteLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.c).addComponent(this.c, -2, -1, -2).addComponent(this.b, -2, -1, -2).addComponent(this.g).addComponent(this.b, -2, -1, -2)).addContainerGap(15, 32767)));
        this.a.setBorder(BorderFactory.createTitledBorder("DPECs"));
        GroupLayout pnlDPECLayout = new GroupLayout(this.a);
        this.a.setLayout(pnlDPECLayout);
        pnlDPECLayout.setHorizontalGroup(pnlDPECLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 666, 32767));
        pnlDPECLayout.setVerticalGroup(pnlDPECLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 241, 32767));
        this.a.setText("Imprimir DANFE");
        this.a.setEnabled(false);
        this.b.setText("Voltar");
        this.b.setBorder(BorderFactory.createTitledBorder("Dados de Processamento"));
        this.e.setFont(new Font("Tahoma", 1, 11));
        this.e.setText("N\u00famero do Registro");
        this.e.setEditable(false);
        this.e.setHorizontalAlignment(4);
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("Data do Registro");
        this.a.setEditable(false);
        this.a.setHorizontalAlignment(4);
        this.f.setFont(new Font("Tahoma", 1, 11));
        this.f.setText("C\u00f3digo do Status");
        this.a.setEditable(false);
        this.a.setHorizontalAlignment(4);
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText("Motivo");
        this.d.setEditable(false);
        GroupLayout pnlDadosProcessamentoLayout = new GroupLayout(this.b);
        this.b.setLayout(pnlDadosProcessamentoLayout);
        pnlDadosProcessamentoLayout.setHorizontalGroup(pnlDadosProcessamentoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDadosProcessamentoLayout.createSequentialGroup().addContainerGap().addGroup(pnlDadosProcessamentoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDadosProcessamentoLayout.createSequentialGroup().addComponent(this.e).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e, -2, 184, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 171, -2)).addGroup(pnlDadosProcessamentoLayout.createSequentialGroup().addComponent(this.f).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.a, -2, 48, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d, -1, 412, 32767))).addContainerGap()));
        pnlDadosProcessamentoLayout.setVerticalGroup(pnlDadosProcessamentoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDadosProcessamentoLayout.createSequentialGroup().addGroup(pnlDadosProcessamentoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.e).addComponent(this.b).addComponent(this.a, -2, -1, -2).addComponent(this.e, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDadosProcessamentoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.f).addComponent(this.a, -2, -1, -2).addComponent(this.d).addComponent(this.d, -2, -1, -2)).addContainerGap(13, 32767)));
        this.c.setText("Salvar");
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.b, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.c, -1, -1, 32767).addComponent(this.a, GroupLayout.Alignment.LEADING, -1, -1, 32767).addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addComponent(this.a).addGap(6, 6, 6).addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b))).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.c, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.b).addComponent(this.c))));
    }

    public DpecTO getDpecTO() {
        return this.a;
    }

    public void setDpecTO(DpecTO dpecTO) {
        this.a = dpecTO;
    }
}

