/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.CancelamentoEventoTO
 *  br.gov.sp.fazenda.dsen.view.CancelamentoEventoGUI
 *  br.gov.sp.fazenda.dsen.view.CancelamentoEventoGUI$1
 *  br.gov.sp.fazenda.dsen.view.CancelamentoEventoGUI$2
 *  br.gov.sp.fazenda.dsen.view.CancelamentoEventoGUI$3
 *  br.gov.sp.fazenda.dsen.view.CancelamentoEventoGUI$4
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.DateTimeFormatter
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.to.CancelamentoEventoTO;
import br.gov.sp.fazenda.dsen.view.CancelamentoEventoGUI;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.DateTimeFormatter;
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
public class CancelamentoEventoGUI
extends DSGEDialog {
    private static final long a = 1348739311364418043L;
    private String a;
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
    private JPanel a;
    private JTextArea a;
    private JFormattedTextField a = null;
    private JFormattedTextField b;

    public CancelamentoEventoGUI(CancelamentoEventoTO cancelamentoEventoTO, Window parent, boolean modal) {
        super(parent, modal);
        this.a();
        this.c();
        this.b();
        this.a.setText(DateHelper.formataDataHora((Date)new Date(), (SimpleDateFormat)DateHelper.DATE_TIME_FORMAT));
        this.b.setText(cancelamentoEventoTO.getnSeqEvento().toString());
        this.a.requestFocus();
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
        this.b.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void c() {
        this.a = new JPanel();
        this.d = new JLabel();
        this.a = new JScrollPane();
        this.a = new JTextArea();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 255));
        this.a = new JLabel();
        this.c = new JLabel();
        this.a = new JFormattedTextField();
        this.a.install(this.a);
        this.b = new JLabel();
        this.b = new JFormattedTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("([1-9])|([1][0-9])|(20)"));
        this.e = new JLabel();
        this.b = new JButton();
        this.a = new JButton();
        this.setDefaultCloseOperation(2);
        this.setTitle("Cancelamento por Evento");
        this.setResizable(false);
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Cancelamento por Evento", 2, 0, new Font("Arial", 1, 14), Color.blue));
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText("* Justificativa");
        this.a.setColumns(20);
        this.a.setLineWrap(true);
        this.a.setRows(12);
        this.a.setWrapStyleWord(true);
        this.a.setViewportView(this.a);
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("m\u00ednimo de 15 e m\u00e1ximo de 255 caracteres.");
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("* Data e Hora do Evento");
        this.a.setHorizontalAlignment(4);
        this.b.setFont(new Font("Dialog", 0, 10));
        this.b.setText("(*) Campo de preenchimento obrigat\u00f3rio.");
        this.b.setEditable(false);
        this.b.setHorizontalAlignment(4);
        this.e.setFont(new Font("Tahoma", 1, 11));
        this.e.setText("* N\u00famero de Seq\u00fc\u00eancia");
        this.b.setText("Enviar");
        this.b.setEnabled(false);
        this.b.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.setText("Cancelar");
        GroupLayout pnlPrincipalLayout = new GroupLayout(this.a);
        this.a.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addContainerGap().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -2, 179, -2).addComponent(this.c)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.b).addComponent(this.e))).addComponent(this.a, -1, 670, 32767).addComponent(this.d)).addContainerGap()).addGroup(pnlPrincipalLayout.createSequentialGroup().addComponent(this.a, -1, 475, 32767).addGap(205, 205, 205)))).addGroup(pnlPrincipalLayout.createSequentialGroup().addGap(256, 256, 256).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addContainerGap(278, 32767)).addGroup(GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup().addContainerGap(486, 32767).addComponent(this.b).addContainerGap()));
        pnlPrincipalLayout.linkSize(0, this.a, this.b);
        pnlPrincipalLayout.setVerticalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.a, -2, -1, -2).addGroup(pnlPrincipalLayout.createSequentialGroup().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.e).addComponent(this.c)).addGap(1, 1, 1).addComponent(this.b, -2, -1, -2))).addGap(18, 18, 18).addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 188, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.a).addGap(18, 18, 18).addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        this.a.getAccessibleContext().setAccessibleName("");
        this.pack();
    }

    private void a(ActionEvent evt) {
    }

    public void addActionListener(EventListener listener) {
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public String getJustificativaCancelamento() {
        return this.a;
    }

    public Date getDhEvento() {
        return this.a;
    }

    public static CancelamentoEventoTO showGUI(CancelamentoEventoTO cancelamentoEventoTO) {
        CancelamentoEventoGUI gui = new CancelamentoEventoGUI(cancelamentoEventoTO, (Window)DSENDesktop.getInstance(), true);
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

    static /* synthetic */ JTextArea a(CancelamentoEventoGUI x0) {
        return x0.a;
    }

    static /* synthetic */ JButton a(CancelamentoEventoGUI x0) {
        return x0.b;
    }

    static /* synthetic */ String a(CancelamentoEventoGUI x0, String x1) {
        x0.a = x1;
        return x0.a;
    }

    static /* synthetic */ JFormattedTextField a(CancelamentoEventoGUI x0) {
        return x0.a;
    }

    static /* synthetic */ Date a(CancelamentoEventoGUI x0, Date x1) {
        x0.a = x1;
        return x0.a;
    }

    static /* synthetic */ Date a(CancelamentoEventoGUI x0) {
        return x0.a;
    }

    static /* synthetic */ JFormattedTextField b(CancelamentoEventoGUI x0) {
        return x0.b;
    }

    static /* synthetic */ Integer a(CancelamentoEventoGUI x0, Integer x1) {
        x0.a = x1;
        return x0.a;
    }

    static /* synthetic */ void a(CancelamentoEventoGUI x0, ActionEvent x1) {
        x0.a(x1);
    }
}

