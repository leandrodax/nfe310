/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ReboqueTO
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ReboqueGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ReboqueGUI$1
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 */
package br.gov.sp.fazenda.dsen.view.nfe;

import br.gov.sp.fazenda.dsen.common.to.ReboqueTO;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.nfe.ReboqueGUI;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
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
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class ReboqueGUI
extends DSGEDialog
implements ActionListener,
KeyListener,
WindowListener {
    private static final long a = 3905593923468069725L;
    private ReboqueTO a;
    private Map<String, JComponent[]> a;
    private String a;
    private JButton a;
    private JButton b;
    private JComboBox a;
    private JLabel a;
    private JPanel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JFormattedTextField a;
    private JTextField a;

    public ReboqueGUI(DigitarNotaFiscalGUI digitarGUI, ReboqueTO reboqueTO) {
        super((Window)DSENDesktop.getInstance(), true);
        this.a = digitarGUI.getOperacao();
        this.b();
        this.c();
        this.a();
        this.addActionListener((EventListener)this);
        this.setListaTransReboqueUF();
        this.updateGUI(reboqueTO);
        this.setLocationRelativeTo(null);
        this.addWindowListener((WindowListener)this);
        this.a.addKeyListener((KeyListener)this);
    }

    private void a() {
        this.b.setActionCommand("ok");
        this.a.setActionCommand("fechar");
    }

    public void setListaTransReboqueUF() {
        List lista = null;
        try {
            lista = DSENUtilHelper.getInstance().getEstadoTO(true);
        }
        catch (DSGEUtilException e) {
            this.showErrors((DSGEBaseException)e);
        }
        this.a.removeAllItems();
        this.a.addItem(new EstadoTO("", "", ""));
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                this.a.addItem(lista.get(i));
            }
        }
        this.a.setSelectedIndex(-1);
    }

    public void updateGUI(ReboqueTO reboqueTO) {
        if (reboqueTO == null) {
            reboqueTO = new ReboqueTO();
        }
        this.a = reboqueTO;
        this.a.setText(reboqueTO.getPlaca());
        this.a.setText(reboqueTO.getRNTC());
        try {
            this.a.setSelectedItem((Object)DSENUtilHelper.getInstance().getSiglaEstadoTO(reboqueTO.getUF()));
        }
        catch (DSGEUtilException e) {
            this.showErrors((DSGEBaseException)e);
        }
        if ("manterNotaOperacaoDetalhe".equals(this.a)) {
            this.disableComponents("CAMPOS_REBOQUE");
        } else {
            this.a.requestFocus();
        }
    }

    public void updateTO() {
        EstadoTO estadoTO = (EstadoTO)this.a.getSelectedItem();
        this.a.setPlaca(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? this.a.getText() : null);
        this.a.setRNTC(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? this.a.getText() : null);
        this.a.setUF(estadoTO != null ? estadoTO.getSigla() : null);
    }

    public ReboqueTO getReboqueTO() {
        return this.a;
    }

    private void b() {
        this.a = new JPanel();
        this.b = new JLabel();
        this.a = new JFormattedTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("([A-Z]{2,3}[0-9]{4}|[A-Z]{3,4}[0-9]{3})", 7));
        this.a = new JComboBox();
        this.d = new JLabel();
        this.c = new JLabel();
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 20));
        this.b = new JButton();
        this.a = new JButton();
        this.a = new JLabel();
        this.setDefaultCloseOperation(0);
        this.setTitle("Reboque");
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Reboque", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("* Placa");
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText("* UF");
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("RNTC");
        this.b.setText("Ok");
        this.a.setText("Fechar");
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("(*) Campo de preenchimento obrigat\u00f3rio. ");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 164, -2).addGap(18, 18, 18).addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 45, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a))).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.a))).addContainerGap(-1, 32767)));
        jPanel1Layout.linkSize(0, this.b, this.c);
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.d).addComponent(this.a, -2, -1, -2).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.a, -2, -1, -2)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a)).addContainerGap(-1, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addContainerGap()))));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        this.pack();
    }

    private void a(ActionEvent evt) {
    }

    public void addActionListener(EventListener listener) {
        this.b.addActionListener((ActionListener)listener);
        this.a.addActionListener((ActionListener)listener);
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
    }

    private void c() {
        this.a = new HashMap();
        this.a.put("CAMPOS_REBOQUE", new JComponent[]{this.b, this.a, this.a, this.a});
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("ok".equals(e.getActionCommand())) {
            this.updateTO();
            if (this.a.getPlaca() == null || this.a.getUF() == null) {
                this.showMessage("Campo obrigat\u00f3rio n\u00e3o preenchido");
            } else {
                this.fechar();
            }
        } else if ("fechar".equals(e.getActionCommand())) {
            this.a = null;
            this.fechar();
        }
    }

    public void fechar() {
        this.setVisible(false);
        this.dispose();
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        this.a = null;
        this.fechar();
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

    @Override
    public void keyPressed(KeyEvent arg0) {
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        this.a.setText(this.a.getText().toUpperCase() + Character.toUpperCase(arg0.getKeyChar()));
        arg0.consume();
    }

    static /* synthetic */ void a(ReboqueGUI x0, ActionEvent x1) {
        x0.a(x1);
    }
}

