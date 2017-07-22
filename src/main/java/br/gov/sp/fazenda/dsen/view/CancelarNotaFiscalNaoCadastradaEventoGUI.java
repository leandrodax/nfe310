/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.CancelamentoEventoTO
 *  br.gov.sp.fazenda.dsen.view.CancelarNotaFiscalNaoCadastradaEventoGUI
 *  br.gov.sp.fazenda.dsen.view.CancelarNotaFiscalNaoCadastradaEventoGUI$1
 *  br.gov.sp.fazenda.dsen.view.CancelarNotaFiscalNaoCadastradaEventoGUI$2
 *  br.gov.sp.fazenda.dsen.view.CancelarNotaFiscalNaoCadastradaEventoGUI$3
 *  br.gov.sp.fazenda.dsen.view.CancelarNotaFiscalNaoCadastradaEventoGUI$4
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.DateTimeFormatter
 *  br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.to.CancelamentoEventoTO;
import br.gov.sp.fazenda.dsen.view.CancelarNotaFiscalNaoCadastradaEventoGUI;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.DateTimeFormatter;
import br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter;
import br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EventListener;
import java.util.Map;
import javax.accessibility.AccessibleContext;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CancelarNotaFiscalNaoCadastradaEventoGUI
extends DSGEDialog {
    private static final long a = 1348739311364418043L;
    private String a;
    private String b;
    private String c;
    private Date a;
    private DateTimeFormatter a;
    private Integer a;
    private JButton a;
    private JButton b;
    private JLabel a;
    private JLabel b;
    private JScrollPane a;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JLabel f;
    private JPanel a;
    private JTextArea a;
    private JFormattedTextField a = null;
    private JFormattedTextField b = null;
    private JFormattedTextField c = null;

    public CancelarNotaFiscalNaoCadastradaEventoGUI(CancelamentoEventoTO cancelamentoEventoTO, Window parent, boolean modal) {
        super(parent, modal);
        this.a();
        this.d();
        this.b();
        this.c();
        this.a.setText(DateHelper.formataDataHora((Date)new Date(), (SimpleDateFormat)DateHelper.DATE_TIME_FORMAT));
        this.b.requestFocus();
        try {
            this.bindController(null);
        }
        catch (DSGEBaseException e1) {
            this.showErrors(e1);
        }
    }

    private void a() {
        try {
            this.a = new DateTimeFormatter();
        }
        catch (ParseException e) {
            this.showErrors((Throwable)e);
        }
    }

    private void b() {
        this.a.addKeyListener((KeyListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.b.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void c() {
        this.c = this.b.getText().trim();
        this.b = this.c.getText().trim();
        this.a.setActionCommand("ACTION_CANCELAR_NFE");
        this.b.setActionCommand("cancelar");
    }

    private void d() {
        this.a = new JPanel();
        this.f = new JLabel();
        this.a = new JScrollPane();
        this.a = new JTextArea();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 255));
        this.a = new JLabel();
        this.d = new JLabel();
        this.a = new JFormattedTextField();
        this.a.install(this.a);
        this.b = new JLabel();
        this.a = new JButton();
        this.b = new JButton();
        this.c = new JLabel();
        this.b = new JFormattedTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(44));
        this.e = new JLabel();
        this.c = new JFormattedTextField();
        ((AbstractDocument)this.c.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(15));
        this.setDefaultCloseOperation(2);
        this.setTitle("Cancelamento por Evento");
        this.setResizable(false);
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Cancelamento por Evento", 2, 0, new Font("Arial", 1, 14), Color.blue));
        this.f.setFont(new Font("Tahoma", 1, 11));
        this.f.setText("* Justificativa");
        this.a.setColumns(20);
        this.a.setLineWrap(true);
        this.a.setRows(12);
        this.a.setWrapStyleWord(true);
        this.a.setViewportView(this.a);
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("m\u00ednimo de 15 e m\u00e1ximo de 255 caracteres.");
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText("* Data e Hora do Evento");
        this.a.setHorizontalAlignment(4);
        this.b.setFont(new Font("Dialog", 0, 10));
        this.b.setText("(*) Campo de preenchimento obrigat\u00f3rio.");
        this.a.setText("Enviar");
        this.a.setEnabled(false);
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.b.setText("Cancelar");
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("* Chave de Acesso");
        this.b.setHorizontalAlignment(4);
        this.e.setFont(new Font("Tahoma", 1, 11));
        this.e.setText("* N\u00famero do Protocolo");
        this.c.setHorizontalAlignment(4);
        GroupLayout pnlPrincipalLayout = new GroupLayout(this.a);
        this.a.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addContainerGap().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addComponent(this.e).addContainerGap(353, 32767)).addGroup(pnlPrincipalLayout.createSequentialGroup().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.a, GroupLayout.Alignment.LEADING).addComponent(this.d, GroupLayout.Alignment.LEADING, -1, -1, 32767)).addContainerGap(345, 32767)).addGroup(pnlPrincipalLayout.createSequentialGroup().addComponent(this.c).addContainerGap(376, 32767)).addGroup(pnlPrincipalLayout.createSequentialGroup().addComponent(this.a, -1, 471, 32767).addContainerGap()).addGroup(pnlPrincipalLayout.createSequentialGroup().addComponent(this.f).addContainerGap(402, 32767)).addGroup(GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.b, GroupLayout.Alignment.LEADING, -1, 471, 32767).addComponent(this.c, -1, 471, 32767)).addContainerGap()).addGroup(GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup().addComponent(this.a, -1, -1, 32767).addGap(274, 274, 274))).addGroup(GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup().addComponent(this.b).addContainerGap()))).addGroup(pnlPrincipalLayout.createSequentialGroup().addGap(155, 155, 155).addComponent(this.a).addGap(18, 18, 18).addComponent(this.b).addContainerGap(168, 32767)));
        pnlPrincipalLayout.linkSize(0, this.a, this.b);
        pnlPrincipalLayout.setVerticalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup().addContainerGap().addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, -1, -2).addGap(13, 13, 13).addComponent(this.e).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -2, -1, -2).addGap(12, 12, 12).addComponent(this.f).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 74, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addGap(25, 25, 25).addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.b)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, 19, -2).addGap(146, 146, 146)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -2, 370, -2));
        this.a.getAccessibleContext().setAccessibleName("");
        this.pack();
    }

    private void a(ActionEvent evt) {
    }

    public void addActionListener(EventListener listener) {
        this.a.addActionListener((ActionListener)listener);
        this.b.addActionListener((ActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public String getJustificativaCancelamento() {
        return this.a.getText().trim();
    }

    public String getChaveAcesso() {
        return this.b.getText().trim();
    }

    public String getProtocolo() {
        return this.c.getText().trim();
    }

    public Date getDhEvento() {
        return this.a;
    }

    public String getTxDhEvento() {
        return this.a.getText().trim();
    }

    public static CancelamentoEventoTO showGUI(CancelamentoEventoTO cancelamentoEventoTO) {
        CancelarNotaFiscalNaoCadastradaEventoGUI gui = new CancelarNotaFiscalNaoCadastradaEventoGUI(cancelamentoEventoTO, (Window)DSENDesktop.getInstance(), true);
        WindowManager.getInstance().centralizarDialogo((JDialog)gui);
        gui.setVisible(true);
        if (!StringHelper.isBlankOrNull((Object)gui.getJustificativaCancelamento())) {
            cancelamentoEventoTO.setxJustificatica(gui.getJustificativaCancelamento());
            cancelamentoEventoTO.setDataEvento(gui.getDhEvento());
            cancelamentoEventoTO.setnSeqEvento(gui.a());
            return cancelamentoEventoTO;
        }
        return null;
    }

    private Integer a() {
        return this.a;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    static /* synthetic */ JTextArea a(CancelarNotaFiscalNaoCadastradaEventoGUI x0) {
        return x0.a;
    }

    static /* synthetic */ JButton a(CancelarNotaFiscalNaoCadastradaEventoGUI x0) {
        return x0.a;
    }

    static /* synthetic */ void a(CancelarNotaFiscalNaoCadastradaEventoGUI x0, ActionEvent x1) {
        x0.a(x1);
    }
}

