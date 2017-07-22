/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaNotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.controller.PesquisarNotaFiscalController
 *  br.gov.sp.fazenda.dsen.controller.PesquisarNotaFiscalController$BotoesEnum
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.util.DSENViewConstants
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.PesquisarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.PesquisarNotaFiscalGUI$1
 *  br.gov.sp.fazenda.dsen.view.PesquisarNotaFiscalGUI$2
 *  br.gov.sp.fazenda.dsen.view.PesquisarNotaFiscalGUI$3
 *  br.gov.sp.fazenda.dsen.view.PesquisarNotaFiscalGUI$4
 *  br.gov.sp.fazenda.dsen.view.PesquisarNotaFiscalGUI$5
 *  br.gov.sp.fazenda.dsen.view.PesquisarNotaFiscalGUI$6
 *  br.gov.sp.fazenda.dsen.view.table.SituacaoNotaFiscalRenderer
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.BooleanFormatter
 *  br.gov.sp.fazenda.dsge.view.format.DateHourMinuteFormatter
 *  br.gov.sp.fazenda.dsge.view.format.DocumentoFormatter
 *  br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 *  br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener
 *  br.gov.sp.fazenda.dsge.view.util.CursorController
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.ParametroTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaNotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil;
import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsen.controller.PesquisarNotaFiscalController;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.util.DSENViewConstants;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.PesquisarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.table.SituacaoNotaFiscalRenderer;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.BooleanFormatter;
import br.gov.sp.fazenda.dsge.view.format.DateHourMinuteFormatter;
import br.gov.sp.fazenda.dsge.view.format.DocumentoFormatter;
import br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import br.gov.sp.fazenda.dsge.view.table.JDSGETable;
import br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener;
import br.gov.sp.fazenda.dsge.view.util.CursorController;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.accessibility.AccessibleContext;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DefaultFormatter;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class PesquisarNotaFiscalGUI
extends DSGESimplePanel
implements FocusListener,
ItemListener {
    private static final long a = 957715486736216707L;
    private String a;
    private JLabel a;
    private JLabel b;
    private JButton a;
    private JButton b;
    private JButton c;
    private JButton d;
    private JButton e;
    private JButton f;
    private JButton g;
    private JButton h;
    private JButton i;
    private JButton j;
    private JButton k;
    private JButton l;
    private JButton m;
    private JButton n;
    private JButton o;
    private JButton p;
    private JButton q;
    private JButton r;
    private JButton s;
    private JButton t;
    private JCheckBox a;
    private JComboBox a;
    private JComboBox b;
    private JComboBox c;
    private JComboBox d;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JPanel a;
    private JLabel f;
    private JLabel g;
    private JLabel h;
    private JLabel i;
    private JLabel j;
    private JLabel k;
    private JLabel l;
    private JScrollPane a;
    private JFormattedTextField a;
    private JFormattedTextField b;
    private JFormattedTextField c;
    private JFormattedTextField d;
    private JFormattedTextField e;
    private JFormattedTextField f;
    private JFormattedTextField g;
    private JDSGEPageableTable<NotaFiscalTO> a;
    private Map<String, JComponent[]> a;
    private DateHourMinuteFormatter a;
    private DateHourMinuteFormatter b;

    public PesquisarNotaFiscalGUI(String operacao) throws DSGEViewException, DSGEUtilException {
        this.a = operacao;
        this.c();
        this.j();
        this.b();
        this.d();
        this.e();
        this.g();
        this.h();
        this.i();
        this.bindController((ViewItf)this);
        this.a();
    }

    private void a() {
        this.g.addFocusListener((FocusListener)this);
        this.f.addFocusListener((FocusListener)this);
        this.e.addFocusListener((FocusListener)this);
    }

    private void b() {
        this.o.setActionCommand("pesquisar");
        this.e.setActionCommand("detalhar");
        this.s.setActionCommand("ACTION_VALIDAR");
        this.a.setActionCommand("ACTION_ASSINAR");
        this.r.setActionCommand("ACTION_TRANSMITIR");
        this.j.setActionCommand("ACTION_IMPRIMIR_DANFE");
        this.p.setActionCommand("ACTION_PRE_VISUALIZAR_DANFE");
        this.d.setActionCommand("ACTION_CONSULTAR_SITUACAO_SEFAZ");
        this.h.setActionCommand("exportar");
        this.f.setActionCommand("ACTION_DUPLICAR");
        this.b.setActionCommand("ACTION_CANCELAR_NFE");
        this.g.setActionCommand("excluir");
        this.m.setActionCommand("ACTION_EMITIR_NOVA_NFE");
        this.l.setActionCommand("ACTION_VER_CHAVE_SEM_FORMATACAO");
        this.i.setActionCommand("ACTION_GERAR_DPEC");
        this.n.setActionCommand("ACTION_PARAR_BUSCA");
        this.t.setActionCommand("ACTION_VERIFICAR_PROCESSAMENTOS_PENDENTES");
        this.c.setActionCommand("ACTION_ENVIAR_CARTA_CORRECAO");
    }

    private void c() {
        try {
            this.a = new DateHourMinuteFormatter();
            this.b = new DateHourMinuteFormatter();
        }
        catch (ParseException parseException) {
            // empty catch block
        }
    }

    private void d() {
        this.a = new JDSGEPageableTable();
        this.a.addColumn(0, "marcado", "", true, null);
        this.a.addColumn(1, "serie", "S\u00e9rie", false, "serie");
        this.a.addColumn(2, "numero", "N\u00famero", false, "numero");
        this.a.addColumn(3, "dataEmissao", "Data Emiss\u00e3o", (DefaultFormatter)this.a, false, "dataEmissao");
        this.a.addColumn(4, "dataAutorizacao", "Data Autoriza\u00e7\u00e3o", (DefaultFormatter)this.b, false, "dataAutorizacao");
        this.a.addColumn(5, "documentoDest", "CNPJ/CPF do Destinat\u00e1rio", (DefaultFormatter)new DocumentoFormatter(), false, "documentoDest");
        this.a.addColumn(6, "ufDest", "UF Dest.", false, "ufDest");
        this.a.addColumn(7, "tipoEmissao", "Tipo", false, "tipoEmissao");
        this.a.addColumn(8, "situacao", "Situa\u00e7\u00e3o", false, "situacao");
        this.a.addColumn(9, "danfeImpresso", "DANFE Impresso", (DefaultFormatter)new BooleanFormatter(), false, "danfeImpresso");
        this.a.addColumn(10, "autorizacaoExportadaXml", "Autor. Exp.", (DefaultFormatter)new BooleanFormatter(), false, "autorizacaoExportadaXml");
        this.a.getWrappedTable().getColumnModel().getColumn(0).setMaxWidth(30);
        this.a.getWrappedTable().getColumnModel().getColumn(1).setPreferredWidth(30);
        this.a.getWrappedTable().getColumnModel().getColumn(1).setMaxWidth(30);
        this.a.getWrappedTable().getColumnModel().getColumn(2).setPreferredWidth(70);
        this.a.getWrappedTable().getColumnModel().getColumn(2).setMaxWidth(70);
        this.a.getWrappedTable().getColumnModel().getColumn(5).setPreferredWidth(150);
        this.a.getWrappedTable().getColumnModel().getColumn(5).setMinWidth(150);
        this.a.getWrappedTable().getColumnModel().getColumn(6).setPreferredWidth(50);
        this.a.getWrappedTable().getColumnModel().getColumn(6).setMaxWidth(50);
        this.a.getWrappedTable().getColumnModel().getColumn(7).setPreferredWidth(120);
        this.a.getWrappedTable().getColumnModel().getColumn(7).setMinWidth(120);
        this.a.getWrappedTable().getColumnModel().getColumn(8).setPreferredWidth(150);
        this.a.getWrappedTable().getColumnModel().getColumn(8).setMinWidth(150);
        SituacaoNotaFiscalRenderer renderer = new SituacaoNotaFiscalRenderer();
        this.a.getWrappedTable().getColumnModel().getColumn(1).setCellRenderer((TableCellRenderer)renderer);
        this.a.getWrappedTable().getColumnModel().getColumn(2).setCellRenderer((TableCellRenderer)renderer);
        this.a.getWrappedTable().getColumnModel().getColumn(3).setCellRenderer((TableCellRenderer)renderer);
        this.a.getWrappedTable().getColumnModel().getColumn(4).setCellRenderer((TableCellRenderer)renderer);
        this.a.getWrappedTable().getColumnModel().getColumn(5).setCellRenderer((TableCellRenderer)renderer);
        this.a.getWrappedTable().getColumnModel().getColumn(6).setCellRenderer((TableCellRenderer)renderer);
        this.a.getWrappedTable().getColumnModel().getColumn(7).setCellRenderer((TableCellRenderer)renderer);
        this.a.getWrappedTable().getColumnModel().getColumn(8).setCellRenderer((TableCellRenderer)renderer);
        this.a.getWrappedTable().getColumnModel().getColumn(9).setCellRenderer((TableCellRenderer)renderer);
        this.a.getWrappedTable().getColumnModel().getColumn(10).setCellRenderer((TableCellRenderer)renderer);
        ParametroTO numRegPagTO = (ParametroTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.PARAMETRO_NUM_REG_POR_PAG_CONSULTA, ParametroTO.class);
        this.a.setPageSize(Integer.parseInt(numRegPagTO.getValor()));
        this.a.setViewportView((Component)this.a);
    }

    private void e() throws DSGEUtilException {
        this.configuraTipoNFeCombo();
        this.f();
        this.configuraSituacaoNFeCombo();
        this.configuraAutorizadaExportadaCombo();
    }

    private void f() throws DSGEUtilException {
        this.b.removeAllItems();
        List estados = DSENUtilHelper.getInstance().getEstadoTO(true);
        this.b.addItem("Todos");
        for (EstadoTO estado : estados) {
            this.b.addItem(estado.getSigla());
        }
    }

    private void g() {
        this.q.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void h() {
        this.k.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void i() {
        this.a = new HashMap();
        this.a.put(PesquisarNotaFiscalController.BotoesEnum.ASSINAR.getName(), new JComponent[]{this.a});
        this.a.put(PesquisarNotaFiscalController.BotoesEnum.CANCELAR.getName(), new JComponent[]{this.b});
        this.a.put(PesquisarNotaFiscalController.BotoesEnum.DANFE.getName(), new JComponent[]{this.j});
        this.a.put(PesquisarNotaFiscalController.BotoesEnum.PRE_VISUALIZAR_DANFE.getName(), new JComponent[]{this.p});
        this.a.put(PesquisarNotaFiscalController.BotoesEnum.DETALHAR.getName(), new JComponent[]{this.e});
        this.a.put(PesquisarNotaFiscalController.BotoesEnum.EXCLUIR.getName(), new JComponent[]{this.g});
        this.a.put(PesquisarNotaFiscalController.BotoesEnum.EXPORTAR.getName(), new JComponent[]{this.h});
        this.a.put(PesquisarNotaFiscalController.BotoesEnum.DUPLICAR.getName(), new JComponent[]{this.f});
        this.a.put(PesquisarNotaFiscalController.BotoesEnum.SEFAZ.getName(), new JComponent[]{this.d});
        this.a.put(PesquisarNotaFiscalController.BotoesEnum.TRANSMITIR.getName(), new JComponent[]{this.r});
        this.a.put(PesquisarNotaFiscalController.BotoesEnum.VALIDAR.getName(), new JComponent[]{this.s});
        this.a.put(PesquisarNotaFiscalController.BotoesEnum.MOSTRAR_CHAVE_ACESSO.getName(), new JComponent[]{this.l});
        this.a.put(PesquisarNotaFiscalController.BotoesEnum.GERAR_DPEC.getName(), new JComponent[]{this.i});
        this.a.put(PesquisarNotaFiscalController.BotoesEnum.VERIFICAR_PROCESSAMENTOS_PENDENTES.getName(), new JComponent[]{this.t});
        this.a.put(PesquisarNotaFiscalController.BotoesEnum.CARTA_CORRECAO.getName(), new JComponent[]{this.c});
    }

    private void j() {
        this.a = new JScrollPane();
        this.e = new JButton();
        this.s = new JButton();
        this.a = new JButton();
        this.r = new JButton();
        this.j = new JButton();
        this.d = new JButton();
        this.h = new JButton();
        this.b = new JButton();
        this.g = new JButton();
        this.q = new JButton();
        this.a = new JPanel();
        this.i = new JLabel();
        this.a = new JLabel();
        this.l = new JLabel();
        this.d = new JComboBox();
        this.c = new JComboBox();
        this.j = new JLabel();
        this.d = new JLabel();
        this.b = new JLabel();
        this.f = new JLabel();
        this.h = new JLabel();
        this.b = new JComboBox();
        this.g = new JLabel();
        this.a = new JCheckBox();
        this.o = new JButton();
        this.k = new JButton();
        this.k = new JLabel();
        this.d = new JFormattedTextField();
        ((AbstractDocument)this.d.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(14));
        this.b = new JFormattedTextField();
        this.a.install(this.b);
        this.c = new JFormattedTextField();
        this.b.install(this.c);
        this.g = new JFormattedTextField();
        ((AbstractDocument)this.g.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(3));
        this.a = new JFormattedTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(44));
        this.f = new JFormattedTextField();
        ((AbstractDocument)this.f.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(9));
        this.e = new JFormattedTextField();
        ((AbstractDocument)this.e.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(9));
        this.e = new JLabel();
        this.c = new JLabel();
        this.a = new JComboBox();
        this.m = new JButton();
        this.l = new JButton();
        this.i = new JButton();
        this.t = new JButton();
        this.n = new JButton();
        this.f = new JButton();
        this.p = new JButton();
        this.c = new JButton();
        this.setBorder((Border)BorderFactory.createTitledBorder(null, "Gerenciamento de Notas", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.a.addMouseWheelListener((MouseWheelListener)new /* Unavailable Anonymous Inner Class!! */);
        this.e.setFont(new Font("Dialog", 0, 11));
        this.e.setText("Detalhar");
        this.e.setMargin(new Insets(1, 5, 1, 5));
        this.s.setFont(new Font("Dialog", 0, 11));
        this.s.setText("Validar");
        this.s.setMargin(new Insets(1, 5, 1, 5));
        this.a.setFont(new Font("Dialog", 0, 11));
        this.a.setText("Assinar");
        this.a.setMargin(new Insets(1, 5, 1, 5));
        this.r.setFont(new Font("Dialog", 0, 11));
        this.r.setText("Transmitir");
        this.r.setMargin(new Insets(1, 5, 1, 5));
        this.j.setFont(new Font("Dialog", 0, 11));
        this.j.setText("Imprimir DANFE");
        this.j.setMargin(new Insets(1, 5, 1, 5));
        this.d.setFont(new Font("Dialog", 0, 11));
        this.d.setText("Consultar na SEFAZ");
        this.d.setMargin(new Insets(1, 5, 1, 5));
        this.h.setFont(new Font("Dialog", 0, 11));
        this.h.setText("Exportar...");
        this.h.setMargin(new Insets(1, 5, 1, 5));
        this.b.setFont(new Font("Dialog", 0, 11));
        this.b.setText("Cancelar NF-e");
        this.b.setMargin(new Insets(1, 5, 1, 5));
        this.b.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.g.setFont(new Font("Dialog", 0, 11));
        this.g.setText("Excluir");
        this.g.setMargin(new Insets(1, 5, 1, 5));
        this.q.setFont(new Font("Dialog", 0, 11));
        this.q.setActionCommand("Sair");
        this.q.setLabel("Sair");
        this.q.setMargin(new Insets(1, 5, 1, 5));
        this.a.setBorder(BorderFactory.createTitledBorder("Filtro"));
        this.i.setFont(new Font("SansSerif", 1, 12));
        this.i.setHorizontalAlignment(4);
        this.i.setText("Per\u00edodo");
        this.a.setFont(new Font("SansSerif", 1, 12));
        this.a.setText("a");
        this.l.setFont(new Font("SansSerif", 1, 12));
        this.l.setText("Tipo de NF-e");
        this.d.setModel(new DefaultComboBoxModel<String>(new String[]{"Todos"}));
        this.c.setModel(new DefaultComboBoxModel<String>(new String[]{"Todas"}));
        this.j.setFont(new Font("SansSerif", 1, 12));
        this.j.setHorizontalAlignment(4);
        this.j.setText("S\u00e9rie");
        this.d.setFont(new Font("SansSerif", 1, 12));
        this.d.setText("N\u00famero");
        this.b.setFont(new Font("SansSerif", 1, 12));
        this.b.setText("a");
        this.f.setFont(new Font("SansSerif", 1, 12));
        this.f.setText("CNPJ/CPF do Destinat\u00e1rio");
        this.h.setFont(new Font("SansSerif", 1, 12));
        this.h.setText("UF Destinat\u00e1rio");
        this.b.setModel(new DefaultComboBoxModel<String>(new String[]{"SP", "MG", "RS", "BA"}));
        this.g.setFont(new Font("SansSerif", 1, 12));
        this.g.setText("Chave de Acesso NF-e");
        this.a.setFont(new Font("SansSerif", 1, 12));
        this.a.setText("c/ DANFE impresso");
        this.a.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.a.setInheritsPopupMenu(true);
        this.a.setMargin(new Insets(0, 0, 0, 0));
        this.o.setFont(new Font("Dialog", 0, 12));
        this.o.setText("Pesquisar");
        this.o.setMargin(new Insets(1, 5, 1, 5));
        this.k.setFont(new Font("Dialog", 0, 12));
        this.k.setText("Nova Pesquisa");
        this.k.setMargin(new Insets(1, 5, 1, 5));
        this.k.setFont(new Font("SansSerif", 1, 12));
        this.k.setHorizontalAlignment(2);
        this.k.setText("Situa\u00e7\u00e3o da NF-e");
        this.d.setHorizontalAlignment(4);
        this.b.setHorizontalAlignment(4);
        this.c.setHorizontalAlignment(4);
        this.g.setHorizontalAlignment(4);
        this.a.setHorizontalAlignment(4);
        this.f.setHorizontalAlignment(4);
        this.e.setHorizontalAlignment(4);
        this.e.setFont(new Font("Dialog", 0, 10));
        this.e.setForeground(Color.red);
        this.e.setHorizontalAlignment(0);
        this.e.setText("Os documentos eletr\u00f4nicos gerados por esse aplicativo n\u00e3o t\u00eam validade jur\u00eddica");
        this.e.setText(DSENProperties.getInstance().getAplicativoLabelAviso());
        this.c.setFont(new Font("SansSerif", 1, 12));
        this.c.setText("Nota Autorizada Exportada para XML");
        this.a.setModel(new DefaultComboBoxModel<String>(new String[]{"Todas"}));
        this.a.addItemListener((ItemListener)new /* Unavailable Anonymous Inner Class!! */);
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.i).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -2, 95, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, 95, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.l).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d, -2, 160, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.k).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -2, 205, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.o).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.k, -2, 100, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.j).addGap(10, 10, 10).addComponent(this.g, -2, 46, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.f, -2, 110, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e, -2, 110, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.f).addComponent(this.g).addComponent(this.a)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 91, -2)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.a).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.d, -2, 174, -2).addGap(29, 29, 29).addComponent(this.h).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, -1, -2)))))).addContainerGap(334, 32767)).addComponent(this.e, -1, 930, 32767));
        jPanel1Layout.linkSize(0, this.e, this.f);
        jPanel1Layout.linkSize(0, this.c, this.d);
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.i).addComponent(this.a).addComponent(this.c, -2, -1, -2).addComponent(this.b, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.l).addComponent(this.k, -2, 18, -2).addComponent(this.d, -2, -1, -2).addComponent(this.c, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.j).addComponent(this.d).addComponent(this.g, -2, -1, -2).addComponent(this.f, -2, -1, -2).addComponent(this.b).addComponent(this.e, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.f).addComponent(this.d, -2, -1, -2).addComponent(this.h).addComponent(this.b, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.g).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.c).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.o).addComponent(this.k)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 10, 32767).addComponent(this.e)));
        this.b.getAccessibleContext().setAccessibleName(" a ");
        this.m.setFont(new Font("Dialog", 0, 11));
        this.m.setText("Nova NF-e");
        this.m.setMargin(new Insets(1, 5, 1, 5));
        this.l.setFont(new Font("Dialog", 0, 11));
        this.l.setText("Chave de Acesso");
        this.l.setMargin(new Insets(1, 5, 1, 5));
        this.i.setFont(new Font("Dialog", 0, 11));
        this.i.setText("Gerar DPEC");
        this.i.setMargin(new Insets(1, 5, 1, 5));
        this.t.setFont(new Font("Dialog", 0, 11));
        this.t.setText("Verificar Processamentos Pendentes");
        this.t.setMargin(new Insets(1, 5, 1, 5));
        this.n.setFont(new Font("Dialog", 0, 11));
        this.n.setText("Parar Busca por Retorno");
        this.n.setMargin(new Insets(1, 5, 1, 5));
        this.f.setFont(new Font("Dialog", 0, 11));
        this.f.setText("Duplicar");
        this.f.setMargin(new Insets(1, 5, 1, 5));
        this.p.setFont(new Font("Dialog", 0, 11));
        this.p.setText("Pr\u00e9-Visualizar DANFE");
        this.p.setMargin(new Insets(1, 5, 1, 5));
        this.c.setFont(new Font("Dialog", 0, 11));
        this.c.setText("Carta de Corre\u00e7\u00e3o");
        this.c.setMargin(new Insets(1, 5, 1, 5));
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767).addComponent(this.a, -1, 946, 32767).addGroup(layout.createSequentialGroup().addComponent(this.m).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e, -2, 63, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.s).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.r).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.p).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.j).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.t)).addGroup(layout.createSequentialGroup().addComponent(this.f).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.h).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.g, -2, 47, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.l).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.i).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.n).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.q, -2, 52, -2))).addContainerGap()));
        layout.linkSize(0, this.f, this.h, this.m);
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 131, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.m).addComponent(this.e).addComponent(this.s).addComponent(this.a).addComponent(this.r).addComponent(this.j).addComponent(this.d).addComponent(this.t).addComponent(this.p)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.h).addComponent(this.b).addComponent(this.f).addComponent(this.g).addComponent(this.l).addComponent(this.i).addComponent(this.n).addComponent(this.c).addComponent(this.q))));
    }

    private void a(ItemEvent evt) {
        if (DSENViewConstants.SIM.equals(this.a.getSelectedItem())) {
            this.setSituacaoNfe(SituacaoNFeEnum.AUTORIZADA);
            this.c.setEnabled(false);
        } else if (DSENViewConstants.NAO.equals(this.a.getSelectedItem())) {
            this.setSituacaoNfe(SituacaoNFeEnum.AUTORIZADA);
            this.c.setEnabled(false);
        } else {
            this.c.setEnabled(true);
        }
    }

    private void a(MouseWheelEvent evt) {
    }

    private void a(ActionEvent evt) {
    }

    public void addActionListener(EventListener listener) {
        this.a.addCellEditorListener(0, (CellEditorListener)listener);
        this.a.setActionListener((ActionListener)listener);
        this.a.addPageableSortableListener(CursorController.createPageableSortableTableActionListener((Component)DSENDesktop.getInstance(), (PageableSortableTableActionListener)((PageableSortableTableActionListener)listener)));
        this.o.addActionListener(CursorController.createActionListener((Component)DSENDesktop.getInstance(), (ActionListener)((ActionListener)listener)));
        this.e.addActionListener((ActionListener)listener);
        this.s.addActionListener((ActionListener)listener);
        this.a.addActionListener((ActionListener)listener);
        this.r.addActionListener((ActionListener)listener);
        this.j.addActionListener((ActionListener)listener);
        this.p.addActionListener((ActionListener)listener);
        this.d.addActionListener((ActionListener)listener);
        this.h.addActionListener((ActionListener)listener);
        this.f.addActionListener((ActionListener)listener);
        this.b.addActionListener((ActionListener)listener);
        this.g.addActionListener((ActionListener)listener);
        this.m.addActionListener((ActionListener)listener);
        this.l.addActionListener((ActionListener)listener);
        this.i.addActionListener((ActionListener)listener);
        this.n.addActionListener((ActionListener)listener);
        this.t.addActionListener((ActionListener)listener);
        this.c.addActionListener((ActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
    }

    public NotaFiscalTO getSelectedNotaFiscalTO() {
        List lista = this.a.getSelectedItens(0);
        NotaFiscalTO nota = null;
        if (lista != null && lista.size() > 0) {
            nota = (NotaFiscalTO)lista.get(0);
        }
        return nota;
    }

    public List<NotaFiscalTO> getSelectedNotas() {
        return this.a.getSelectedItens(0);
    }

    public void setNotaFiscalTOList(List<NotaFiscalTO> lista) {
        SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
    }

    public PesquisaNotaFiscalTO getPesquisaNotaFiscalTO() {
        ChaveAcessoTO chave;
        TipoEmissaoEnum tpNFe = this.d.getSelectedIndex() == 0 ? null : (TipoEmissaoEnum)this.d.getSelectedItem();
        SituacaoNFeEnum situacaoNFe = this.c.getSelectedIndex() == 0 ? null : (SituacaoNFeEnum)this.c.getSelectedItem();
        String uf = this.b.getSelectedIndex() == 0 ? null : (String)this.b.getSelectedItem();
        PesquisaNotaFiscalTO to = new PesquisaNotaFiscalTO();
        try {
            chave = StringHelper.isBlankOrNull((Object)this.a.getText()) ? null : ChaveAcessoUtil.obterChaveAcessoTO((String)this.a.getText());
        }
        catch (Exception pe) {
            to.addError(pe.getMessage());
            chave = null;
        }
        to.setTelaPesquisaEnum(TelaPesquisaEnum.GERENCIAR_NOTA_FISCAL);
        to.setChaveAcessoTO(chave);
        to.setDocumentoDest(StringHelper.isBlankOrNull((Object)this.d.getText()) ? null : this.d.getText());
        to.setComDanfeImpresso(Boolean.valueOf(this.a.isSelected()));
        to.setAutorizadaExportada(DSENViewConstants.TODAS.equals(this.a.getSelectedItem()) ? null : Boolean.valueOf(DSENViewConstants.SIM.equals(this.a.getSelectedItem())));
        to.setDataIni(!StringHelper.isBlankOrNull((Object)this.c.getText().replaceAll("\\D", "")) ? DateHelper.getDate((String)this.c.getText()) : null);
        to.setDataFim(!StringHelper.isBlankOrNull((Object)this.b.getText().replaceAll("\\D", "")) ? DateHelper.getDate((String)this.b.getText(), (int)23, (int)59, (int)59, (int)999) : null);
        to.setIdSituacaoNf(situacaoNFe);
        to.setIdTipoEmissaoNf(tpNFe);
        to.setNumFim(StringHelper.isBlankOrNull((Object)this.e.getText()) ? null : this.e.getText());
        to.setNumIni(StringHelper.isBlankOrNull((Object)this.f.getText()) ? null : this.f.getText());
        to.setSerie(StringHelper.isBlankOrNull((Object)this.g.getText()) ? null : this.g.getText());
        to.setIdEmitente((EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class));
        to.setUfDest(uf);
        return to;
    }

    public void configuraTipoNFeCombo() {
        int i;
        TipoEmissaoEnum[] enumTpNFe = TipoEmissaoEnum.values();
        ArrayList<TipoEmissaoEnum> lista = new ArrayList<TipoEmissaoEnum>();
        for (i = 0; i < enumTpNFe.length; ++i) {
            lista.add(enumTpNFe[i]);
        }
        if (lista != null) {
            for (i = 0; i < lista.size(); ++i) {
                this.d.addItem(lista.get(i));
            }
        }
    }

    public void configuraAutorizadaExportadaCombo() {
        this.a.removeAllItems();
        this.a.addItem(DSENViewConstants.TODAS);
        this.a.addItem(DSENViewConstants.SIM);
        this.a.addItem(DSENViewConstants.NAO);
    }

    public void configuraSituacaoNFeCombo() {
        int i;
        SituacaoNFeEnum[] enumStNFe = SituacaoNFeEnum.values();
        ArrayList<SituacaoNFeEnum> lista = new ArrayList<SituacaoNFeEnum>();
        for (i = 0; i < enumStNFe.length; ++i) {
            lista.add(enumStNFe[i]);
        }
        if (lista != null) {
            for (i = 0; i < lista.size(); ++i) {
                if (lista.get(i) == SituacaoNFeEnum.CANCELADA_EVENTO) continue;
                this.c.addItem(lista.get(i));
            }
        }
    }

    public void populaFiltro(PesquisaNotaFiscalTO pesquisaTO) {
        if (pesquisaTO != null) {
            if (pesquisaTO.getDataIni() != null) {
                this.c.setText(DateHelper.formataData((Date)pesquisaTO.getDataIni()));
            } else {
                this.c.setText("");
            }
            if (pesquisaTO.getDataFim() != null) {
                this.b.setText(DateHelper.formataData((Date)pesquisaTO.getDataFim()));
            } else {
                this.b.setText("");
            }
            if (pesquisaTO.getIdTipoEmissaoNf() != null) {
                this.d.setSelectedItem((Object)pesquisaTO.getIdTipoEmissaoNf());
            } else {
                this.d.setSelectedIndex(0);
            }
            if (pesquisaTO.getIdSituacaoNf() != null) {
                this.c.setSelectedItem(pesquisaTO.getIdSituacaoNf().get(0));
            } else {
                this.c.setSelectedIndex(0);
            }
            if (pesquisaTO.getSerie() != null) {
                this.g.setText(pesquisaTO.getSerie().toString());
            } else {
                this.g.setText("");
            }
            if (pesquisaTO.getNumIni() != null) {
                this.f.setText(pesquisaTO.getNumIni().toString());
            } else {
                this.f.setText("");
            }
            if (pesquisaTO.getNumFim() != null) {
                this.e.setText(pesquisaTO.getNumFim().toString());
            } else {
                this.e.setText("");
            }
            if (pesquisaTO.getDocumentoDest() != null) {
                this.d.setText(pesquisaTO.getDocumentoDest());
            } else {
                this.d.setText("");
            }
            if (pesquisaTO.getUfDest() != null) {
                this.b.setSelectedItem(pesquisaTO.getUfDest());
            } else {
                this.b.setSelectedIndex(0);
            }
            if (pesquisaTO.getComDanfeImpresso() != null) {
                this.a.setSelected(pesquisaTO.getComDanfeImpresso());
            } else {
                this.a.setSelected(false);
            }
            this.setAutorizadaExportada(pesquisaTO.getAutorizadaExportada());
        }
    }

    public String getOperacao() {
        return this.a;
    }

    public void setOperacao(String operacao) {
        this.a = operacao;
    }

    public void setSituacaoNfe(SituacaoNFeEnum situacao) {
        this.c.setSelectedItem((Object)situacao);
    }

    public void setAutorizadaExportada(Boolean autorizadaExportada) {
        if (autorizadaExportada == null) {
            this.a.setSelectedItem(DSENViewConstants.TODAS);
        } else if (autorizadaExportada.booleanValue()) {
            this.a.setSelectedItem(DSENViewConstants.SIM);
        } else {
            this.a.setSelectedItem(DSENViewConstants.NAO);
        }
    }

    public void setTipoNfe(TipoEmissaoEnum CONTINGENCIA) {
        this.d.setSelectedItem((Object)CONTINGENCIA);
    }

    public void setDanfeImpresso(boolean b) {
        this.a.setSelected(b);
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == this.g) {
            if (!StringHelper.isBlankOrNull((Object)this.g.getText())) {
                String serie = StringHelper.completaComZerosAEsquerda((String)this.g.getText(), (int)3);
                this.g.setText(serie);
            }
        } else if (e.getSource() == this.f) {
            if (!StringHelper.isBlankOrNull((Object)this.f.getText())) {
                String inicio = StringHelper.completaComZerosAEsquerda((String)this.f.getText(), (int)9);
                this.f.setText(inicio);
            }
        } else if (e.getSource() == this.e && !StringHelper.isBlankOrNull((Object)this.e.getText())) {
            String fim = StringHelper.completaComZerosAEsquerda((String)this.e.getText(), (int)9);
            this.e.setText(fim);
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    public JDSGEPageableTable<NotaFiscalTO> getTable() {
        return this.a;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    public void setPararBuscaRetornoEnabled(boolean enabled) {
        this.n.setEnabled(enabled);
    }

    public boolean isPararBuscaRetornoEnabled() {
        return this.n.isEnabled();
    }

    static /* synthetic */ JFormattedTextField a(PesquisarNotaFiscalGUI x0) {
        return x0.a;
    }

    static /* synthetic */ JFormattedTextField b(PesquisarNotaFiscalGUI x0) {
        return x0.c;
    }

    static /* synthetic */ JFormattedTextField c(PesquisarNotaFiscalGUI x0) {
        return x0.b;
    }

    static /* synthetic */ JFormattedTextField d(PesquisarNotaFiscalGUI x0) {
        return x0.d;
    }

    static /* synthetic */ JFormattedTextField e(PesquisarNotaFiscalGUI x0) {
        return x0.e;
    }

    static /* synthetic */ JFormattedTextField f(PesquisarNotaFiscalGUI x0) {
        return x0.f;
    }

    static /* synthetic */ JFormattedTextField g(PesquisarNotaFiscalGUI x0) {
        return x0.g;
    }

    static /* synthetic */ JComboBox a(PesquisarNotaFiscalGUI x0) {
        return x0.d;
    }

    static /* synthetic */ JComboBox b(PesquisarNotaFiscalGUI x0) {
        return x0.c;
    }

    static /* synthetic */ JComboBox c(PesquisarNotaFiscalGUI x0) {
        return x0.a;
    }

    static /* synthetic */ JComboBox d(PesquisarNotaFiscalGUI x0) {
        return x0.b;
    }

    static /* synthetic */ JCheckBox a(PesquisarNotaFiscalGUI x0) {
        return x0.a;
    }

    static /* synthetic */ JDSGEPageableTable a(PesquisarNotaFiscalGUI x0) {
        return x0.a;
    }

    static /* synthetic */ void a(PesquisarNotaFiscalGUI x0, MouseWheelEvent x1) {
        x0.a(x1);
    }

    static /* synthetic */ void a(PesquisarNotaFiscalGUI x0, ActionEvent x1) {
        x0.a(x1);
    }

    static /* synthetic */ void a(PesquisarNotaFiscalGUI x0, ItemEvent x1) {
        x0.a(x1);
    }
}

