/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.LacreTO
 *  br.gov.sp.fazenda.dsen.common.to.VolumeTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.view.nfe.VolumeGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.VolumeGUI$1
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.format.NumberFormatterHelper
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 */
package br.gov.sp.fazenda.dsen.view.nfe;

import br.gov.sp.fazenda.dsen.common.to.LacreTO;
import br.gov.sp.fazenda.dsen.common.to.VolumeTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.view.nfe.VolumeGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter;
import br.gov.sp.fazenda.dsge.view.format.NumberFormatterHelper;
import br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import br.gov.sp.fazenda.dsge.view.table.JDSGETable;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.ParseException;
import java.util.Collection;
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
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class VolumeGUI
extends DSGEDialog {
    private static final long a = -7121079916077822459L;
    private boolean a;
    private static final int a = 5000;
    private JButton a;
    private JButton b;
    private JButton c;
    private JButton d;
    private JButton e;
    private JPanel a;
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JLabel f;
    private JLabel g;
    private JPanel b;
    private JScrollPane a;
    private JPanel c;
    private JFormattedTextField a;
    private JFormattedTextField b;
    private JFormattedTextField c;
    private JTextField a;
    private JTextField b;
    private JTextField c;
    private JTextField d;
    private JDSGEPageableTable<LacreTO> a;
    private VolumeTO a;
    private Map<String, JComponent[]> a;
    private String a;

    public VolumeGUI(String operacaoNota, Window janelaPai, boolean inclusao) throws DSGEViewException {
        super(janelaPai, true);
        this.a = operacaoNota;
        this.a = inclusao;
        this.f();
        this.b();
        this.d();
        this.a();
        this.c();
        this.bindController((ViewItf)this);
        this.setLocationRelativeTo(null);
    }

    private void a() {
        this.a = new HashMap();
        this.a.put("volumeTodos", new JComponent[]{this.c, this.a, this.b, this.d, this.b, this.a, this.c, this.a, this.d, this.e});
        this.a.put("volumeInicioDesabilitado", new JComponent[]{this.b, this.c});
        this.a.put("volumeUmLacreSelecionado", new JComponent[]{this.b, this.c});
        this.a.put("volumeVariosLacresSelecionados", new JComponent[]{this.c});
    }

    private void b() {
        this.a = new JDSGEPageableTable();
        this.a.setPageSize(0);
        this.a.setPageable(false);
        this.a.setSortable(false);
        this.a.addColumn(0, "marcado", "", true, null);
        this.a.addColumn(1, "NItem", "Item", false, null);
        this.a.addColumn(2, "NLacre", "N\u00famero Lacre", false, null);
        this.a.getWrappedTable().getColumnModel().getColumn(0).setMaxWidth(30);
        this.a.getWrappedTable().getColumnModel().getColumn(1).setMaxWidth(50);
        this.a.setViewportView((Component)this.a);
    }

    private void c() {
        this.b.setActionCommand("editar");
        this.c.setActionCommand("excluir");
        this.d.setActionCommand("incluir");
        this.e.setActionCommand("ok");
    }

    private void d() {
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    public void fechar() {
        this.setVisible(false);
        this.dispose();
    }

    private void e() {
        this.a.removeAllTO();
        this.c.setText("");
        this.a.setText("");
        this.b.setText("");
        this.d.setText("");
        this.b.setText("");
        this.a.setText("");
        this.c.setText("");
    }

    private void a(VolumeTO volumeTO) {
        this.e();
        if (volumeTO != null) {
            if (volumeTO.getQVol() != null) {
                this.c.setText(volumeTO.getQVol().toString());
            }
            this.a.setText(volumeTO.getEsp());
            this.b.setText(volumeTO.getMarca());
            this.d.setText(volumeTO.getNVol());
            try {
                this.a.setText(!StringHelper.isBlankOrNull((Object)volumeTO.getPesoB()) ? NumberFormatterHelper.getFormatter1203().valueToString(new BigDecimal(volumeTO.getPesoB())) : null);
                this.b.setText(!StringHelper.isBlankOrNull((Object)volumeTO.getPesoL()) ? NumberFormatterHelper.getFormatter1203().valueToString(new BigDecimal(volumeTO.getPesoL())) : null);
            }
            catch (ParseException parseException) {
                // empty catch block
            }
            if (volumeTO.getListaLacre() != null) {
                int i = 1;
                for (LacreTO lacre : volumeTO.getListaLacre()) {
                    lacre.setNItem(String.valueOf(i++));
                    this.a.addTO((BaseTO)lacre);
                }
            }
        }
    }

    private void b(VolumeTO volumeTO) {
        if (!(StringHelper.isBlankOrNull((Object)this.c.getText()) && StringHelper.isBlankOrNull((Object)this.a.getText()) && StringHelper.isBlankOrNull((Object)this.b.getText()) && StringHelper.isBlankOrNull((Object)this.a.getText()) && StringHelper.isBlankOrNull((Object)this.b.getText()) && StringHelper.isBlankOrNull((Object)this.d.getText()) && this.a.getAllTO().size() <= 0)) {
            if (volumeTO == null) {
                volumeTO = new VolumeTO();
            }
            volumeTO.setQVol(!StringHelper.isBlankOrNull((Object)this.c.getText()) ? this.c.getText() : null);
            volumeTO.setPesoB(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? StringHelper.formataValorXML((String)this.a.getText()) : null);
            volumeTO.setPesoL(!StringHelper.isBlankOrNull((Object)this.b.getText()) ? StringHelper.formataValorXML((String)this.b.getText()) : null);
            volumeTO.setEsp(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? this.a.getText().trim() : null);
            volumeTO.setMarca(!StringHelper.isBlankOrNull((Object)this.b.getText()) ? this.b.getText().trim() : null);
            volumeTO.setNVol(!StringHelper.isBlankOrNull((Object)this.d.getText()) ? this.d.getText().trim() : null);
            volumeTO.setListaLacre((Collection)this.a.getAllTO());
        }
    }

    private void f() {
        this.a = new JPanel();
        this.c = new JPanel();
        this.g = new JLabel();
        this.c = new JFormattedTextField();
        ((AbstractDocument)this.c.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(8));
        this.a = new JLabel();
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.b = new JLabel();
        this.b = new JTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.d = new JLabel();
        this.d = new JTextField();
        ((AbstractDocument)this.d.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.f = new JLabel();
        this.b = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.b, (int)12, (int)3);
        this.e = new JLabel();
        this.a = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.a, (int)12, (int)3);
        this.b = new JPanel();
        this.c = new JLabel();
        this.c = new JTextField();
        ((AbstractDocument)this.c.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.a = new JScrollPane();
        this.d = new JButton();
        this.b = new JButton();
        this.c = new JButton();
        this.e = new JButton();
        this.a = new JButton();
        this.setDefaultCloseOperation(2);
        this.setTitle("Volumes Transportados");
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Volumes Transportados", 2, 0, new Font("Dialog", 1, 14), new Color(0, 0, 255)));
        this.c.setBorder(BorderFactory.createTitledBorder(""));
        this.g.setFont(new Font("Tahoma", 1, 11));
        this.g.setText("Quantidade");
        this.c.setHorizontalAlignment(4);
        this.a.setFont(new Font("Tahoma", 1, 11));
        this.a.setText("Esp\u00e9cie");
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("Marca");
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText("Numera\u00e7\u00e3o");
        this.f.setFont(new Font("Tahoma", 1, 11));
        this.f.setText("Peso Liq. (kg)");
        this.b.setHorizontalAlignment(4);
        this.e.setFont(new Font("Tahoma", 1, 11));
        this.e.setText("Peso Bruto (kg)");
        this.a.setHorizontalAlignment(4);
        this.b.setBorder(BorderFactory.createTitledBorder(null, "Lacres", 1, 2));
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("N\u00b0 lacres");
        this.d.setText("Incluir");
        this.b.setText("Editar");
        this.c.setText("Excluir");
        GroupLayout pnlLacresLayout = new GroupLayout(this.b);
        this.b.setLayout(pnlLacresLayout);
        pnlLacresLayout.setHorizontalGroup(pnlLacresLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlLacresLayout.createSequentialGroup().addContainerGap().addGroup(pnlLacresLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.a, GroupLayout.Alignment.LEADING, -1, 496, 32767).addGroup(GroupLayout.Alignment.LEADING, pnlLacresLayout.createSequentialGroup().addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -1, 442, 32767)).addGroup(GroupLayout.Alignment.LEADING, pnlLacresLayout.createSequentialGroup().addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c))).addContainerGap()));
        pnlLacresLayout.setVerticalGroup(pnlLacresLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlLacresLayout.createSequentialGroup().addGroup(pnlLacresLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.c, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 133, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlLacresLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.d).addComponent(this.b).addComponent(this.c)).addGap(11, 11, 11)));
        GroupLayout pnlVolumeLayout = new GroupLayout(this.c);
        this.c.setLayout(pnlVolumeLayout);
        pnlVolumeLayout.setHorizontalGroup(pnlVolumeLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlVolumeLayout.createSequentialGroup().addComponent(this.b, -1, -1, 32767).addContainerGap()).addGroup(pnlVolumeLayout.createSequentialGroup().addContainerGap().addGroup(pnlVolumeLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.f).addComponent(this.d).addComponent(this.g).addComponent(this.a).addComponent(this.b)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlVolumeLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlVolumeLayout.createSequentialGroup().addGroup(pnlVolumeLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlVolumeLayout.createSequentialGroup().addComponent(this.c, -1, 148, 32767).addGap(290, 290, 290)).addComponent(this.a, -1, 438, 32767).addComponent(this.b, GroupLayout.Alignment.TRAILING, -1, 438, 32767)).addContainerGap()).addGroup(pnlVolumeLayout.createSequentialGroup().addComponent(this.d, -1, 438, 32767).addContainerGap()).addGroup(pnlVolumeLayout.createSequentialGroup().addComponent(this.b, -1, 127, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 128, 32767).addGap(97, 97, 97)))));
        pnlVolumeLayout.setVerticalGroup(pnlVolumeLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlVolumeLayout.createSequentialGroup().addGroup(pnlVolumeLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c, -2, -1, -2).addComponent(this.g)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlVolumeLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a, -2, -1, -2).addComponent(this.a)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlVolumeLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.b, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlVolumeLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.d).addComponent(this.d, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlVolumeLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b, -2, -1, -2).addComponent(this.e).addComponent(this.a, -2, -1, -2).addComponent(this.f)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -1, -1, 32767).addContainerGap()));
        this.e.setText("Ok");
        this.a.setText("Fechar");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.c, -1, -1, 32767).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.e).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a))).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(this.c, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.e).addComponent(this.a)).addContainerGap()));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 582, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(0, 0, 0).addComponent(this.a, -1, -1, 32767).addGap(0, 0, 0))));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 449, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(0, 0, 0).addComponent(this.a, -1, -1, 32767).addGap(0, 0, 0))));
        this.pack();
    }

    public void setVolumeTO(VolumeTO volumeTO) {
        this.a = volumeTO;
        this.e();
        this.a(volumeTO);
    }

    public void addActionListener(EventListener listener) {
        this.e.addActionListener((ActionListener)listener);
        this.b.addActionListener((ActionListener)listener);
        this.c.addActionListener((ActionListener)listener);
        this.d.addActionListener((ActionListener)listener);
        this.a.addCellEditorListener(0, (CellEditorListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public void adicionarLacreTO() {
        if (this.a.getAllTO().size() > 5000) {
            this.showMessage(MessageFormat.format(DSENMessageConstants.MSG_MAX_TRANSPORTADORA_VOLUME_LACRE, 5000));
        } else if (this.c.getText() != null && !this.c.getText().equals("")) {
            LacreTO lacreTO = new LacreTO();
            lacreTO.setNLacre(this.c.getText());
            this.a.addTO((BaseTO)lacreTO);
            this.c.setText("");
        } else {
            this.showMessage(MessageFormat.format(DSENMessageConstants.MSG_PREENCHA_CAMPO, DSENLabelConstants.LACRE));
        }
    }

    public void editarLacreTO(LacreTO lacreTO) {
        this.a.getWrappedTable().setColumnEditable(0, false);
        this.d.setEnabled(false);
        this.b.setActionCommand("alterar");
        this.b.setText(DSENLabelConstants.ALTERAR);
        this.c.setActionCommand("cancelar");
        this.c.setText(DSENLabelConstants.CANCELAR);
        this.c.setText(lacreTO.getNLacre());
    }

    public void alterarLacreTO(LacreTO lacreTO) {
        lacreTO.setNLacre(this.c.getText());
        this.c.setText("");
        this.a.getWrappedTable().setColumnEditable(0, true);
        this.d.setEnabled(true);
        this.b.setActionCommand("editar");
        this.b.setText(DSENLabelConstants.EDITAR);
        this.c.setActionCommand("excluir");
        this.c.setText(DSENLabelConstants.EXCLUIR);
    }

    public void cancelarEdicaoLacreTO() {
        this.c.setText("");
        this.a.getWrappedTable().setColumnEditable(0, true);
        this.d.setEnabled(true);
        this.b.setActionCommand("editar");
        this.b.setText(DSENLabelConstants.EDITAR);
        this.c.setActionCommand("excluir");
        this.c.setText(DSENLabelConstants.EXCLUIR);
    }

    public void excluirLacreTO(List<LacreTO> lista) {
        this.a.removeTO(lista);
    }

    public List<LacreTO> getSelectedLacreTOs() {
        return this.a.getSelectedItens(0);
    }

    public LacreTO getSelectedLacreTO() {
        List lista = this.getSelectedLacreTOs();
        LacreTO lacreTO = null;
        if (lista != null) {
            lacreTO = (LacreTO)lista.get(0);
        }
        return lacreTO;
    }

    public VolumeTO getVolumeTO() {
        if (this.a != null) {
            this.b(this.a);
        }
        return this.a;
    }

    public void firePropertyChange(String propertyName, VolumeTO volumeTO) {
        this.firePropertyChange(propertyName, (Object)null, (Object)volumeTO);
    }

    public List<LacreTO> getAllLacreTO() {
        return this.a.getAllTO();
    }

    public String getOperacaoNota() {
        return this.a;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    public boolean isInclusao() {
        return this.a;
    }
}

