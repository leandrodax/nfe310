/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.to.CancelamentoTO
 *  br.gov.sp.fazenda.dsen.common.to.EventoTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.view.ExportacaoGUI
 *  br.gov.sp.fazenda.dsen.view.ExportacaoGUI$1
 *  br.gov.sp.fazenda.dsen.view.ExportacaoGUI$2
 *  br.gov.sp.fazenda.dsen.view.ExportacaoGUI$3
 *  br.gov.sp.fazenda.dsen.view.ExportacaoGUI$4
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 *  br.gov.sp.fazenda.dsge.view.util.DSGEWindowUtilHelper
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.to.CancelamentoTO;
import br.gov.sp.fazenda.dsen.common.to.EventoTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.view.ExportacaoGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import br.gov.sp.fazenda.dsge.view.table.JDSGETable;
import br.gov.sp.fazenda.dsge.view.util.DSGEWindowUtilHelper;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.EventListener;
import java.util.List;
import java.util.Map;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultCellEditor;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.table.TableCellEditor;

public class ExportacaoGUI<T extends BaseTO>
extends DSGEDialog
implements CellEditorListener {
    private static final long a = 6655981938643421215L;
    private List<T> a;
    private TipoDocumentoArquivoEnum a;
    private JDSGEPageableTable<BaseTO> a;
    private JButton a;
    private JButton b;
    private JButton c;
    private JRadioButton a;
    private JRadioButton b;
    private JCheckBox a;
    private JPanel a;
    private JPanel b;
    private JLabel a;
    private JLabel b;
    private JPanel c;
    private ButtonGroup a;
    private JTextField a;

    public ExportacaoGUI(List<T> listaBaseTO, TipoDocumentoArquivoEnum tpDocEnum, Window parent, boolean modal) throws DSGEViewException {
        super(parent, modal);
        this.c();
        this.a = listaBaseTO;
        this.a = tpDocEnum;
        this.e();
        this.b();
        this.bindController((ViewItf)this);
        this.setSize(600, 200);
        DSGEWindowUtilHelper.centralizarDialogo((Component)parent, (JDialog)this);
        this.a.setSelected(true);
        this.a();
    }

    private void a() {
        this.a.removeAllTO();
        for (BaseTO to : this.a) {
            if (to instanceof NotaFiscalTO) {
                List eventoTOList;
                NotaFiscalTO notaTO = (NotaFiscalTO)to;
                if (SituacaoNFeEnum.CANCELADA.equals((Object)notaTO.getSituacao()) && notaTO.getCancelamentoTO() != null) {
                    notaTO.getCancelamentoTO().setNomeArquivoXml(DocumentoUtil.getNomePadraoArquivoXML((CancelamentoTO)notaTO.getCancelamentoTO()));
                    this.a.addTO((BaseTO)notaTO.getCancelamentoTO());
                }
                if (notaTO.getDocXmlString() != null) {
                    to.setNomeArquivoXml(DocumentoUtil.getNomePadraoArquivoXML((BaseTO)to));
                    this.a.addTO(to);
                }
                if ((eventoTOList = notaTO.getEventoTOList()) == null) continue;
                for (EventoTO eventoTO : eventoTOList) {
                    eventoTO.setNomeArquivoXml(DocumentoUtil.getNomePadraoArquivoXML((EventoTO)eventoTO));
                    this.a.addTO((BaseTO)eventoTO);
                }
                continue;
            }
            to.setNomeArquivoXml(DocumentoUtil.getNomePadraoArquivoXML((BaseTO)to));
            this.a.addTO(to);
        }
        this.d();
    }

    private void b() {
        this.a = new JDSGEPageableTable();
        this.a.addColumn(0, "nomeArquivoXml", "Nome do Arquivo XML", true, null);
        this.a.setSelectAllAvailable(false);
        this.a.setPageable(false);
        this.a.setSortable(false);
        this.a.setPanel(this.c);
        this.a.setAutoFitTableColumns(true);
        this.a.addCellEditorListener(0, (CellEditorListener)this);
        this.a.getWrappedTable().setDefaultEditor(String.class, (TableCellEditor)new /* Unavailable Anonymous Inner Class!! */);
        this.a.getWrappedTable().putClientProperty((Object)"terminateEditOnFocusLost", (Object)Boolean.TRUE);
    }

    private void c() {
        this.a = new ButtonGroup();
        this.a = new JPanel();
        this.b = new JPanel();
        this.a = new JButton();
        this.b = new JButton();
        this.b = new JLabel();
        this.a = new JRadioButton();
        this.b = new JRadioButton();
        this.a = new JLabel();
        this.a = new JTextField();
        this.c = new JButton();
        this.a = new JCheckBox();
        this.c = new JPanel();
        this.setDefaultCloseOperation(2);
        this.setTitle("Exporta\u00e7\u00e3o de Arquivos");
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Exporta\u00e7\u00e3o de Arquivos", 2, 2, new Font("Dialog", 1, 14), new Color(0, 0, 255)));
        this.a.setText("Fechar");
        this.b.setText("Exportar");
        GroupLayout jPanel2Layout = new GroupLayout(this.b);
        this.b.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.b).addGap(10, 10, 10).addComponent(this.a).addContainerGap(-1, 32767)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.b))));
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("Tipo:");
        this.a.add(this.a);
        this.a.setFont(new Font("Tahoma", 1, 11));
        this.a.setText("Arquivo TXT");
        this.a.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.a.setMargin(new Insets(0, 0, 0, 0));
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.add(this.b);
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("Arquivo XML");
        this.b.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.b.setMargin(new Insets(0, 0, 0, 0));
        this.b.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.setFont(new Font("Tahoma", 1, 11));
        this.a.setText("Local:");
        this.a.setEnabled(false);
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("Localizar");
        this.a.setFont(new Font("Tahoma", 1, 11));
        this.a.setText("Alterar Nomes dos XMLs");
        this.a.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.a.setMargin(new Insets(0, 0, 0, 0));
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        GroupLayout pnlNomesLayout = new GroupLayout(this.c);
        this.c.setLayout(pnlNomesLayout);
        pnlNomesLayout.setHorizontalGroup(pnlNomesLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 528, 32767));
        pnlNomesLayout.setVerticalGroup(pnlNomesLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 164, 32767));
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.c, -1, -1, 32767).addContainerGap()).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.b).addGap(15, 15, 15).addComponent(this.a, -2, 107, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 384, 32767))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c).addGap(22, 22, 22)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.a).addGap(387, 387, 387)).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 173, 32767).addComponent(this.b, -2, -1, -2).addContainerGap(173, 32767)))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.b).addComponent(this.b)).addGap(14, 14, 14).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a, -2, 24, -2).addComponent(this.c).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, -1, -2).addContainerGap()));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        this.pack();
    }

    private void a(ActionEvent evt) {
        JCheckBox c = (JCheckBox)evt.getSource();
        this.c.setVisible(c.isSelected());
        if (c.isSelected()) {
            this.setSize(600, 350);
        } else {
            this.setSize(600, 200);
        }
        this.a();
    }

    private void b(ActionEvent evt) {
        this.d();
    }

    private void c(ActionEvent evt) {
        this.d();
    }

    private void d() {
        if (this.b.isSelected()) {
            File arquivo;
            this.a.setVisible(true);
            if (this.a.isSelected()) {
                this.c.setVisible(true);
                this.setSize(600, 350);
            } else {
                this.c.setVisible(false);
                this.setSize(600, 200);
            }
            String localArquivo = this.a.getText();
            if (!StringHelper.isBlankOrNull((Object)localArquivo) && !(arquivo = new File(localArquivo)).isDirectory()) {
                localArquivo = arquivo.getParentFile().getAbsolutePath();
                this.a.setText(localArquivo);
            }
        } else {
            this.c.setVisible(false);
            this.a.setVisible(false);
            String localArquivo = this.a.getText();
            if (!StringHelper.isBlankOrNull((Object)localArquivo)) {
                localArquivo = localArquivo + File.separator + this.a.toString().toUpperCase() + ".txt";
                this.a.setText(localArquivo);
            }
            this.setSize(600, 200);
        }
    }

    private void e() {
        this.b.setActionCommand("exportar");
        this.a.setActionCommand("cancelar");
        this.c.setActionCommand("buscarLogotipo");
    }

    public void addActionListener(EventListener listener) {
        this.b.addActionListener((ActionListener)listener);
        this.a.addActionListener((ActionListener)listener);
        this.c.addActionListener((ActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public void setBtnXmlEnabled(boolean enabled) {
        this.b.setEnabled(enabled);
        if (!enabled) {
            this.a.doClick();
        }
    }

    public void setBtnTxtEnabled(boolean enabled) {
        this.a.setEnabled(enabled);
        if (!enabled) {
            this.b.doClick();
        }
    }

    public boolean isBtnTxtSelected() {
        return this.a.isSelected();
    }

    public List<T> getListaBaseTO() {
        return this.a;
    }

    public String getExportacaoPath() {
        return this.a.getText();
    }

    public void setExportacaoPath(String path) {
        this.a.setText(path);
    }

    public ExtensaoArquivoEnum getExtensaoArquivoEnum() {
        if (this.a.isSelected()) {
            return ExtensaoArquivoEnum.TXT;
        }
        if (this.b.isSelected()) {
            return ExtensaoArquivoEnum.XML;
        }
        return null;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    public TipoDocumentoArquivoEnum getTpDocEnum() {
        return this.a;
    }

    @Override
    public void editingCanceled(ChangeEvent e) {
    }

    @Override
    public void editingStopped(ChangeEvent e) {
    }

    static /* synthetic */ void a(ExportacaoGUI x0, ActionEvent x1) {
        x0.c(x1);
    }

    static /* synthetic */ void b(ExportacaoGUI x0, ActionEvent x1) {
        x0.b(x1);
    }

    static /* synthetic */ void c(ExportacaoGUI x0, ActionEvent x1) {
        x0.a(x1);
    }
}

