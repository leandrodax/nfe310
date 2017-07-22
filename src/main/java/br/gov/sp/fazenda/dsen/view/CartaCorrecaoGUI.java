/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.CartaCorrecaoTO
 *  br.gov.sp.fazenda.dsen.view.CartaCorrecaoGUI
 *  br.gov.sp.fazenda.dsen.view.CartaCorrecaoGUI$1
 *  br.gov.sp.fazenda.dsen.view.CartaCorrecaoGUI$2
 *  br.gov.sp.fazenda.dsen.view.CartaCorrecaoGUI$3
 *  br.gov.sp.fazenda.dsen.view.CartaCorrecaoGUI$4
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

import br.gov.sp.fazenda.dsen.common.to.CartaCorrecaoTO;
import br.gov.sp.fazenda.dsen.view.CartaCorrecaoGUI;
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
public class CartaCorrecaoGUI
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
    private JPanel a;
    private JScrollPane a;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JLabel f;
    private JLabel g;
    private JPanel b;
    private JTextArea a;
    private JFormattedTextField a = null;
    private JFormattedTextField b;

    public CartaCorrecaoGUI(CartaCorrecaoTO cartaCorrecaoTO, Window parent, boolean modal) {
        super(parent, modal);
        this.a();
        this.c();
        this.b();
        this.a.setText(DateHelper.formataDataHora((Date)new Date(), (SimpleDateFormat)DateHelper.DATE_TIME_FORMAT));
        this.b.setText(cartaCorrecaoTO.getnSeqEvento().toString());
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
        this.b = new JPanel();
        this.c = new JLabel();
        this.a = new JScrollPane();
        this.a = new JTextArea();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 1000));
        this.a = new JLabel();
        this.g = new JLabel();
        this.d = new JLabel();
        this.a = new JPanel();
        this.b = new JButton();
        this.a = new JButton();
        this.e = new JLabel();
        this.a = new JFormattedTextField();
        this.a.install(this.a);
        this.b = new JLabel();
        this.b = new JFormattedTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("([1-9])|([1][0-9])|(20)"));
        this.f = new JLabel();
        this.setDefaultCloseOperation(2);
        this.setTitle("Carta de Corre\u00e7\u00e3o");
        this.setResizable(false);
        this.b.setBorder(BorderFactory.createTitledBorder(null, "Carta De Corre\u00e7\u00e3o", 2, 0, new Font("Arial", 1, 14), Color.blue));
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("* Corre\u00e7\u00e3o");
        this.a.setColumns(20);
        this.a.setLineWrap(true);
        this.a.setRows(12);
        this.a.setWrapStyleWord(true);
        this.a.setViewportView(this.a);
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("m\u00ednimo de 15 e m\u00e1ximo de 1000 caracteres.");
        this.g.setFont(new Font("Tahoma", 1, 11));
        this.g.setText("Condi\u00e7\u00f5es de Uso da Carta de Corre\u00e7\u00e3o");
        this.d.setForeground(Color.red);
        this.d.setText("<html><p>A Carta de Corre\u00e7\u00e3o \u00e9 disciplinada pelo \u00a7 1\u00ba-A do art. 7\u00ba do Conv\u00eanio S/N, de 15 de dezembro de 1970 e pode ser utilizada para regulariza\u00e7\u00e3o de erro ocorrido na emiss\u00e3o de documento fiscal, desde que o erro n\u00e3o esteja relacionado com: <p style=\"padding-left:15px\">I - as vari\u00e1veis que determinam o valor do imposto tais como: base de c\u00e1lculo, al\u00edquota, diferen\u00e7a de pre\u00e7o, quantidade, valor da opera\u00e7\u00e3o ou da presta\u00e7\u00e3o;</p><p style=\"padding-left:15px\">II - a corre\u00e7\u00e3o de dados cadastrais que implique mudan\u00e7a do remetente ou do destinat\u00e1rio; </p><p style=\"padding-left:15px\">III - a data de emiss\u00e3o ou de sa\u00edda.</p></p></html>");
        this.b.setText("Enviar");
        this.b.setEnabled(false);
        this.b.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.setText("Cancelar");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addContainerGap(-1, 32767)));
        jPanel1Layout.linkSize(0, this.a, this.b);
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a)));
        this.e.setFont(new Font("Tahoma", 1, 11));
        this.e.setText("* Data e Hora do Evento");
        this.a.setHorizontalAlignment(4);
        this.b.setFont(new Font("Dialog", 0, 10));
        this.b.setText("(*) Campo de preenchimento obrigat\u00f3rio.");
        this.b.setEditable(false);
        this.b.setHorizontalAlignment(4);
        this.b.setToolTipText("Informe um n\u00famero de sequ\u00eancia entre 1 e 19.");
        this.f.setFont(new Font("Tahoma", 1, 11));
        this.f.setText("* N\u00famero de Seq\u00fc\u00eancia");
        GroupLayout pnlPrincipalLayout = new GroupLayout(this.b);
        this.b.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addContainerGap().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 654, 32767).addComponent(this.g).addComponent(this.d, -1, 654, 32767).addGroup(GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup().addComponent(this.a, -1, 459, 32767).addGap(195, 195, 195)).addComponent(this.c).addGroup(pnlPrincipalLayout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 244, 32767).addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 40, 32767).addComponent(this.b)).addGroup(pnlPrincipalLayout.createSequentialGroup().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.e).addComponent(this.a, -2, 179, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.b).addComponent(this.f, -1, -1, 32767)))).addContainerGap()));
        pnlPrincipalLayout.setVerticalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup().addComponent(this.g).addGap(0, 0, 0).addComponent(this.d, -2, 95, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(pnlPrincipalLayout.createSequentialGroup().addComponent(this.e).addGap(1, 1, 1).addComponent(this.a, -2, -1, -2)).addGroup(pnlPrincipalLayout.createSequentialGroup().addComponent(this.f).addGap(1, 1, 1).addComponent(this.b, -2, -1, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 188, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(pnlPrincipalLayout.createSequentialGroup().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, -1, -2).addContainerGap()).addComponent(this.b))));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b, -1, -1, 32767));
        this.pack();
    }

    private void a(ActionEvent evt) {
    }

    public void addActionListener(EventListener listener) {
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public String getCorrecao() {
        return this.a;
    }

    public Date getDhEvento() {
        return this.a;
    }

    public static CartaCorrecaoTO showGUI(CartaCorrecaoTO cartaCorrecaoTO) {
        CartaCorrecaoGUI gui = new CartaCorrecaoGUI(cartaCorrecaoTO, (Window)DSENDesktop.getInstance(), true);
        WindowManager.getInstance().centralizarDialogo((JDialog)gui);
        gui.setVisible(true);
        if (!StringHelper.isBlankOrNull((Object)gui.getCorrecao())) {
            cartaCorrecaoTO.setxCorrecao(gui.getCorrecao());
            cartaCorrecaoTO.setDataEvento(gui.getDhEvento());
            cartaCorrecaoTO.setnSeqEvento(gui.a());
            return cartaCorrecaoTO;
        }
        return null;
    }

    private Integer a() {
        return this.a;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    static /* synthetic */ JTextArea a(CartaCorrecaoGUI x0) {
        return x0.a;
    }

    static /* synthetic */ JButton a(CartaCorrecaoGUI x0) {
        return x0.b;
    }

    static /* synthetic */ String a(CartaCorrecaoGUI x0, String x1) {
        x0.a = x1;
        return x0.a;
    }

    static /* synthetic */ JFormattedTextField a(CartaCorrecaoGUI x0) {
        return x0.a;
    }

    static /* synthetic */ Date a(CartaCorrecaoGUI x0, Date x1) {
        x0.a = x1;
        return x0.a;
    }

    static /* synthetic */ Date a(CartaCorrecaoGUI x0) {
        return x0.a;
    }

    static /* synthetic */ JFormattedTextField b(CartaCorrecaoGUI x0) {
        return x0.b;
    }

    static /* synthetic */ Integer a(CartaCorrecaoGUI x0, Integer x1) {
        x0.a = x1;
        return x0.a;
    }

    static /* synthetic */ void a(CartaCorrecaoGUI x0, ActionEvent x1) {
        x0.a(x1);
    }
}

