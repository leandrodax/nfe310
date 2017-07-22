/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoImportacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoViaTransporteEnum
 *  br.gov.sp.fazenda.dsen.common.to.AdicaoTO
 *  br.gov.sp.fazenda.dsen.common.to.DITO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoDeclaracaoImportacaoGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoDeclaracaoImportacaoGUI$1
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.CNPJFormatter
 *  br.gov.sp.fazenda.dsge.view.format.DateFormatter
 *  br.gov.sp.fazenda.dsge.view.format.NumberFormatterHelper
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 *  br.gov.sp.fazenda.dsge.view.table.model.DSGETableModel
 */
package br.gov.sp.fazenda.dsen.view.nfe;

import br.gov.sp.fazenda.dsen.common.enumeration.TipoImportacaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoViaTransporteEnum;
import br.gov.sp.fazenda.dsen.common.to.AdicaoTO;
import br.gov.sp.fazenda.dsen.common.to.DITO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.nfe.ProdutoDeclaracaoImportacaoGUI;
import br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.CNPJFormatter;
import br.gov.sp.fazenda.dsge.view.format.DateFormatter;
import br.gov.sp.fazenda.dsge.view.format.NumberFormatterHelper;
import br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import br.gov.sp.fazenda.dsge.view.table.JDSGETable;
import br.gov.sp.fazenda.dsge.view.table.model.DSGETableModel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.MessageFormat;
import java.text.ParseException;
import java.util.Collection;
import java.util.Date;
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
import javax.swing.table.TableModel;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DefaultFormatter;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class ProdutoDeclaracaoImportacaoGUI
extends DSGEDialog {
    private static final long a = 7765556896677576662L;
    ProdutoNotaGUI a;
    private JButton a;
    private JButton b;
    private JButton c;
    private JButton d;
    private JButton e;
    private JComboBox a;
    private JComboBox b;
    private JComboBox c;
    private JComboBox d;
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JLabel f;
    private JLabel g;
    private JLabel h;
    private JLabel i;
    private JLabel j;
    private JLabel k;
    private JLabel l;
    private JScrollPane a;
    private JPanel a;
    private JPanel b;
    private JPanel c;
    private JPanel d;
    private JFormattedTextField a;
    private JFormattedTextField b;
    private JFormattedTextField c;
    private JFormattedTextField d;
    private JTextField a;
    private JTextField b;
    private JTextField c;
    private DateFormatter a;
    private DateFormatter b;
    private CNPJFormatter a;
    private Map<String, JComponent[]> a;
    private String a;
    private String b;
    private DITO a;
    private JDSGEPageableTable<AdicaoTO> a;

    public ProdutoDeclaracaoImportacaoGUI(String operacao, String operacaoNota, ProdutoNotaGUI produtoNotaGUI) throws DSGEViewException {
        super((Window)produtoNotaGUI, true);
        this.a = produtoNotaGUI;
        this.setOperacao(operacao);
        this.setOperacaoNota(operacaoNota);
        this.c();
        this.a();
        this.d();
        this.e();
        this.b();
        this.setLocationRelativeTo(null);
        this.bindController((ViewItf)this);
        this.b.setEnabled(false);
    }

    private void a() {
        this.b = new JPanel();
        this.h = new JLabel();
        this.b = new JTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 12));
        this.f = new JLabel();
        this.c = new JFormattedTextField();
        this.a.install(this.c);
        this.b = new JLabel();
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.c = new JPanel();
        this.i = new JLabel();
        this.d = new JComboBox();
        this.k = new JLabel();
        this.a = new JFormattedTextField();
        this.a.install(this.a);
        this.a = new JPanel();
        this.a = new JScrollPane();
        this.c = new JButton();
        this.a = new JButton();
        this.b = new JButton();
        this.e = new JButton();
        this.d = new JButton();
        this.a = new JLabel();
        this.c = new JLabel();
        this.b = new JComboBox();
        this.d = new JLabel();
        this.b = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.b, (int)13, (int)2);
        this.e = new JLabel();
        this.a = new JComboBox();
        this.d = new JPanel();
        this.j = new JLabel();
        this.c = new JComboBox();
        this.l = new JLabel();
        this.c = new JTextField();
        ((AbstractDocument)this.c.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.g = new JLabel();
        this.d = new JFormattedTextField();
        this.b.install(this.d);
        this.setDefaultCloseOperation(2);
        this.setTitle("Declara\u00e7\u00e3o de Importa\u00e7\u00e3o");
        this.b.setBorder(BorderFactory.createTitledBorder(null, "Declara\u00e7\u00e3o de Importa\u00e7\u00e3o", 2, 2, new Font("Dialog", 1, 14), new Color(0, 0, 255)));
        this.h.setFont(new Font("Tahoma", 1, 11));
        this.h.setText("* N\u00famero DI/DSI/DA/DRI-E");
        this.b.setHorizontalAlignment(4);
        this.f.setFont(new Font("Tahoma", 1, 11));
        this.f.setText("* Data registro");
        this.c.setHorizontalAlignment(4);
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("* Cod. Exportador");
        this.c.setBorder(BorderFactory.createTitledBorder("Adquirente ou Encomendante"));
        this.i.setFont(new Font("Tahoma", 1, 11));
        this.i.setText("UF");
        this.k.setFont(new Font("Tahoma", 1, 11));
        this.k.setText("CNPJ");
        this.a.setHorizontalAlignment(2);
        GroupLayout pnlDesembaracoLayout = new GroupLayout(this.c);
        this.c.setLayout(pnlDesembaracoLayout);
        pnlDesembaracoLayout.setHorizontalGroup(pnlDesembaracoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDesembaracoLayout.createSequentialGroup().addContainerGap().addComponent(this.i).addGap(17, 17, 17).addComponent(this.d, -2, 80, -2).addGap(18, 18, 18).addComponent(this.k).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 245, -2).addContainerGap(-1, 32767)));
        pnlDesembaracoLayout.setVerticalGroup(pnlDesembaracoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.i, GroupLayout.Alignment.TRAILING).addComponent(this.d, GroupLayout.Alignment.TRAILING, -2, -1, -2).addComponent(this.k, GroupLayout.Alignment.TRAILING).addComponent(this.a, GroupLayout.Alignment.TRAILING, -2, -1, -2));
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Adi\u00e7\u00f5es(100 no M\u00e1ximo)", 1, 2));
        this.c.setText("Incluir");
        this.a.setText("Detalhar");
        this.b.setText("Excluir");
        GroupLayout pnlAdicoesLayout = new GroupLayout(this.a);
        this.a.setLayout(pnlAdicoesLayout);
        pnlAdicoesLayout.setHorizontalGroup(pnlAdicoesLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlAdicoesLayout.createSequentialGroup().addContainerGap().addGroup(pnlAdicoesLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 602, 32767).addGroup(pnlAdicoesLayout.createSequentialGroup().addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b))).addContainerGap()));
        pnlAdicoesLayout.setVerticalGroup(pnlAdicoesLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlAdicoesLayout.createSequentialGroup().addComponent(this.a, -1, 192, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlAdicoesLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.a).addComponent(this.b))));
        this.e.setText("OK");
        this.d.setText("Fechar");
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("(*) Campo de preenchimento obrigat\u00f3rio.");
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("* Via de Transporte Interncional");
        this.b.addItemListener((ItemListener)new /* Unavailable Anonymous Inner Class!! */);
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText("Valor da AFRMM");
        this.b.setHorizontalAlignment(4);
        this.e.setFont(new Font("Tahoma", 1, 11));
        this.e.setText("* Tipo Importa\u00e7\u00e3o");
        this.d.setBorder(BorderFactory.createTitledBorder("Desembara\u00e7o aduaneiro"));
        this.j.setFont(new Font("Tahoma", 1, 11));
        this.j.setText("* UF");
        this.l.setFont(new Font("Tahoma", 1, 11));
        this.l.setText("* Local");
        this.g.setFont(new Font("Tahoma", 1, 11));
        this.g.setText("* Data");
        this.d.setHorizontalAlignment(4);
        GroupLayout pnlDesembaraco1Layout = new GroupLayout(this.d);
        this.d.setLayout(pnlDesembaraco1Layout);
        pnlDesembaraco1Layout.setHorizontalGroup(pnlDesembaraco1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDesembaraco1Layout.createSequentialGroup().addContainerGap().addGroup(pnlDesembaraco1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.g).addComponent(this.j)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDesembaraco1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDesembaraco1Layout.createSequentialGroup().addComponent(this.c, -2, 80, -2).addGap(18, 18, 18).addComponent(this.l).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -1, 420, 32767)).addComponent(this.d, -2, 118, -2)).addContainerGap()));
        pnlDesembaraco1Layout.setVerticalGroup(pnlDesembaraco1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDesembaraco1Layout.createSequentialGroup().addGroup(pnlDesembaraco1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.j).addComponent(this.l).addComponent(this.c, -2, -1, -2).addComponent(this.c, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDesembaraco1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.g).addComponent(this.d, -2, -1, -2))));
        GroupLayout pnlDI1Layout = new GroupLayout(this.b);
        this.b.setLayout(pnlDI1Layout);
        pnlDI1Layout.setHorizontalGroup(pnlDI1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDI1Layout.createSequentialGroup().addContainerGap().addGroup(pnlDI1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767).addComponent(this.c, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addGroup(pnlDI1Layout.createSequentialGroup().addGroup(pnlDI1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.h).addComponent(this.b)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDI1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a).addGroup(pnlDI1Layout.createSequentialGroup().addComponent(this.b, -2, 186, -2).addGap(18, 18, 18).addComponent(this.f).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -2, 120, -2)))).addGroup(pnlDI1Layout.createSequentialGroup().addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.b, -2, 180, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b)).addComponent(this.d, -1, -1, 32767).addGroup(pnlDI1Layout.createSequentialGroup().addComponent(this.e).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 149, -2).addGap(0, 0, 32767)).addGroup(pnlDI1Layout.createSequentialGroup().addComponent(this.e).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.a))).addContainerGap()));
        pnlDI1Layout.setVerticalGroup(pnlDI1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDI1Layout.createSequentialGroup().addGroup(pnlDI1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDI1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.h).addComponent(this.b, -2, -1, -2)).addGroup(pnlDI1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c, -2, -1, -2).addComponent(this.f))).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(pnlDI1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a, -2, -1, -2)).addGap(9, 9, 9).addGroup(pnlDI1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.c, GroupLayout.Alignment.TRAILING).addComponent(this.b, GroupLayout.Alignment.TRAILING, -2, -1, -2).addGroup(GroupLayout.Alignment.TRAILING, pnlDI1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b, -2, -1, -2).addComponent(this.d))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDI1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.e).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.d, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDI1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.e).addComponent(this.d).addComponent(this.a)).addGap(99, 99, 99)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b, -2, 533, -2));
        this.pack();
    }

    private void a(ItemEvent evt) {
        TipoViaTransporteEnum tipo = (TipoViaTransporteEnum)evt.getItem();
        if (!this.b.equals("manterNotaOperacaoDetalhe") && tipo == TipoViaTransporteEnum.MARITIMA) {
            this.b.setEnabled(true);
        } else {
            this.b.setEnabled(false);
        }
    }

    public void firePropertyChange(String propertyName, DITO diTO) {
        this.firePropertyChange(propertyName, (Object)null, (Object)diTO);
    }

    public void addActionListener(EventListener listener) {
        this.a.addCellEditorListener(0, (CellEditorListener)listener);
        this.a.addActionListener((ActionListener)listener);
        this.b.addActionListener((ActionListener)listener);
        this.c.addActionListener((ActionListener)listener);
        this.e.addActionListener((ActionListener)listener);
        this.d.addActionListener((ActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    public void setListaDIUF(List<EstadoTO> lista) {
        int i;
        this.c.removeAllItems();
        if (lista != null) {
            for (i = 0; i < lista.size(); ++i) {
                this.c.addItem(lista.get(i));
            }
        }
        this.c.setSelectedIndex(-1);
        this.d.removeAllItems();
        if (lista != null) {
            for (i = 0; i < lista.size(); ++i) {
                this.d.addItem(lista.get(i));
            }
        }
        this.d.setSelectedIndex(-1);
    }

    public void setListaDITpViaTransp(TipoViaTransporteEnum[] lista) {
        this.b.removeAllItems();
        if (lista != null) {
            for (TipoViaTransporteEnum item : lista) {
                this.b.addItem(item);
            }
        }
        this.b.setSelectedIndex(-1);
    }

    public void setListaDITpIntermedia(TipoImportacaoEnum[] lista) {
        this.b.removeAllItems();
        if (lista != null) {
            for (TipoImportacaoEnum item : lista) {
                this.a.addItem(item);
            }
        }
    }

    public String getOperacao() {
        return this.a;
    }

    public void setOperacao(String operacao) {
        this.a = operacao;
    }

    public String getOperacaoNota() {
        return this.b;
    }

    public void setOperacaoNota(String operacaoNota) {
        this.b = operacaoNota;
    }

    public DITO getDiTO() {
        if (this.a == null) {
            this.a = new DITO();
        }
        String ddiStr = this.c.getText().replaceAll("[/][ ]", "");
        String dDesembStr = this.d.getText().replaceAll("[/][ ]", "");
        EstadoTO estadoTO = (EstadoTO)this.c.getSelectedItem();
        EstadoTO estadoTOAE = (EstadoTO)this.d.getSelectedItem();
        TipoImportacaoEnum tpImportacao = (TipoImportacaoEnum)this.a.getSelectedItem();
        TipoViaTransporteEnum tpTransporte = (TipoViaTransporteEnum)this.b.getSelectedItem();
        this.a.setNDI(!StringHelper.isBlankOrNull((Object)this.b.getText()) ? this.b.getText() : null);
        if (!StringHelper.isBlankOrNull((Object)ddiStr)) {
            Date ddi = DateHelper.getDate((String)this.c.getText());
            this.a.setDDI(ddi);
        } else {
            this.a.setDDI(null);
        }
        this.a.setXLocDesemb(!StringHelper.isBlankOrNull((Object)this.c.getText()) ? this.c.getText() : null);
        if (estadoTO != null) {
            this.a.setUFDesemb(estadoTO.getSigla());
        } else {
            this.a.setUFDesemb(null);
        }
        if (estadoTOAE != null) {
            this.a.setUFAE(estadoTOAE.getSigla());
        } else {
            this.a.setUFAE(null);
        }
        if (tpImportacao != null) {
            this.a.setTpIntermedio(tpImportacao);
        } else {
            this.a.setTpIntermedio(null);
        }
        if (tpTransporte != null) {
            this.a.setTpViaTransp(tpTransporte);
            if (tpTransporte.equals((Object)TipoViaTransporteEnum.MARITIMA)) {
                this.b.setEnabled(true);
                if (!StringHelper.isBlankOrNull((Object)this.b.getText())) {
                    this.a.setvAFRMM(this.b.getText());
                }
            } else {
                this.a.setvAFRMM(null);
            }
        } else {
            this.a.setTpViaTransp(null);
        }
        if (!StringHelper.isBlankOrNull((Object)this.a.getText())) {
            String cnpj = this.a.getText();
            this.a.setCNPJAE(cnpj.replaceAll("/", "").replace(".", "").replace("-", ""));
        }
        if (!StringHelper.isBlankOrNull((Object)dDesembStr)) {
            Date dDesemb = DateHelper.getDate((String)this.d.getText());
            this.a.setDDesemb(dDesemb);
        } else {
            this.a.setDDesemb(null);
        }
        this.a.setCExportador(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? this.a.getText() : null);
        this.a.setListaAdicao((Collection)this.a.getAllTO());
        return this.a;
    }

    public void setDiTO(DITO diTO) throws DSGEUtilException {
        this.a = diTO;
        if (diTO != null) {
            EstadoTO estadoTO = DSENUtilHelper.getInstance().getSiglaEstadoTO(diTO.getUFDesemb());
            EstadoTO estadoTOAE = DSENUtilHelper.getInstance().getSiglaEstadoTO(diTO.getUFAE());
            TipoViaTransporteEnum tipoVia = diTO.getTpViaTransp();
            TipoImportacaoEnum tipoImport = diTO.getTpIntermedio();
            this.b.setText(diTO.getNDI());
            this.c.setText(diTO.getDDI() != null ? DateHelper.formataData((Date)diTO.getDDI()) : null);
            this.a.setText(diTO.getCExportador());
            this.c.setText(diTO.getXLocDesemb());
            this.d.setText(diTO.getDDesemb() != null ? DateHelper.formataData((Date)diTO.getDDesemb()) : null);
            this.d.setSelectedItem((Object)estadoTOAE);
            this.c.setSelectedItem((Object)estadoTO);
            this.b.setText(diTO.getvAFRMM() != null ? diTO.getvAFRMM() : null);
            this.a.setText(diTO.getCNPJAE() != null ? diTO.getCNPJAE() : null);
            this.a.removeAllTO();
            this.a.addTO((List)diTO.getListaAdicao());
            this.b.setSelectedItem((Object)tipoVia);
            this.a.setSelectedItem((Object)tipoImport);
            this.verificarSelecionadosTabela();
        }
    }

    public List<AdicaoTO> getAllAdicaoTO() {
        return this.a.getAllTO();
    }

    public void adicionarAdicaoTO(AdicaoTO adicaoTO) {
        if (adicaoTO != null) {
            this.a.addTO((BaseTO)adicaoTO);
        } else {
            this.showMessage(MessageFormat.format(DSENMessageConstants.MSG_PREENCHA_CAMPO, DSENLabelConstants.ADICAO));
        }
    }

    public List<AdicaoTO> getSelectedAdicaoTOs() {
        return this.a.getSelectedItens(0);
    }

    public void removerListaAdicaoTO(List<AdicaoTO> lista) {
        if (lista != null) {
            this.a.removeTO(lista);
        }
    }

    public AdicaoTO getSelectedAdicaoTO() {
        List listaAdicao = this.getSelectedAdicaoTOs();
        AdicaoTO adicaoTO = null;
        if (listaAdicao != null && listaAdicao.size() > 0) {
            adicaoTO = (AdicaoTO)listaAdicao.get(0);
        }
        return adicaoTO;
    }

    private void b() {
        this.a = new HashMap();
        this.a.put("DI_TODOS", new JComponent[]{this.e, this.a, this.b, this.c, this.d, this.c, this.a, this.b, this.c, this.c, this.d, this.b, this.b, this.a, this.a});
        this.a.put("MANTER_NFE_INICIO_DESABILITADO" + DSENLabelConstants.ADICAO, new JComponent[]{this.a, this.b, this.c});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.ADICAO + "1", new JComponent[]{this.a});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.ADICAO + "*", new JComponent[0]);
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.ADICAO + "0", new JComponent[0]);
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.ADICAO + "1", new JComponent[]{this.a, this.b, this.c});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.ADICAO + "*", new JComponent[]{this.c, this.b});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.ADICAO + "0", new JComponent[]{this.c});
    }

    public void verificarSelecionadosTabela() {
        List lista = this.a.getSelectedTOs();
        String tipo = DSENLabelConstants.ADICAO;
        this.disableComponents("MANTER_NFE_INICIO_DESABILITADO" + tipo);
        if (lista == null || lista.size() == 0) {
            if (!this.getOperacaoNota().equals("manterNotaOperacaoDetalhe")) {
                this.enableComponents("MANTER_NFE_EDICAO" + tipo + "0");
            } else {
                this.enableComponents("MANTER_NFE_DETALHE" + tipo + "0");
            }
            return;
        }
        if (lista.size() == 1) {
            if (!this.getOperacaoNota().equals("manterNotaOperacaoDetalhe")) {
                this.enableComponents("MANTER_NFE_EDICAO" + tipo + "1");
            } else {
                this.enableComponents("MANTER_NFE_DETALHE" + tipo + "1");
            }
        } else if (!this.getOperacaoNota().equals("manterNotaOperacaoDetalhe")) {
            this.enableComponents("MANTER_NFE_EDICAO" + tipo + "*");
        } else {
            this.enableComponents("MANTER_NFE_DETALHE" + tipo + "*");
        }
    }

    private void c() {
        try {
            this.a = new DateFormatter();
            this.b = new DateFormatter();
            this.a = new CNPJFormatter();
        }
        catch (ParseException parseException) {
            // empty catch block
        }
    }

    private void d() {
        this.e.setActionCommand("ok");
        this.d.setActionCommand("fechar");
        this.c.setActionCommand("incluirAdicao");
        this.a.setActionCommand("ACTION_DETALHAR_ADICAO");
        this.b.setActionCommand("excluirAdicao");
    }

    private void e() {
        this.a = new JDSGEPageableTable();
        this.a.setPageSize(0);
        this.a.setPageable(false);
        this.a.setSortable(false);
        this.a.addColumn(0, "marcado", "", true, null);
        this.a.addColumn(1, "NSeqAdic", "Item", false, null);
        this.a.addColumn(2, "NAdicao", "N\u00famero", false, null);
        this.a.addColumn(3, "CFabricante", "Fabricante", false, null);
        this.a.addColumn(4, "VDescDI", "Desconto", (DefaultFormatter)NumberFormatterHelper.getFormatter1302(), false, null);
        this.a.addColumn(5, "NDraw", "Drawback", false, null);
        this.a.getWrappedTable().getColumnModel().getColumn(0).setMaxWidth(30);
        this.a.getWrappedTable().getColumnModel().getColumn(1).setMaxWidth(50);
        this.a.getWrappedTable().getColumnModel().getColumn(2).setPreferredWidth(100);
        this.a.getWrappedTable().getColumnModel().getColumn(2).setMaxWidth(150);
        this.a.getWrappedTable().getColumnModel().getColumn(4).setPreferredWidth(100);
        this.a.getWrappedTable().getColumnModel().getColumn(4).setMaxWidth(150);
        this.a.setViewportView((Component)this.a);
    }

    public ProdutoNotaGUI getProdutoNotaGUI() {
        return this.a;
    }

    public void refreshTableAdicoes() {
        ((DSGETableModel)this.a.getWrappedTable().getModel()).fireTableDataChanged();
    }

    static /* synthetic */ void a(ProdutoDeclaracaoImportacaoGUI x0, ItemEvent x1) {
        x0.a(x1);
    }
}

