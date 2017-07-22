/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ObservacaoNotaTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ObservacaoFiscoContribGUI
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 */
package br.gov.sp.fazenda.dsen.view.nfe;

import br.gov.sp.fazenda.dsen.common.to.ObservacaoNotaTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
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
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.EventListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class ObservacaoFiscoContribGUI
extends DSGEDialog
implements ActionListener,
WindowListener {
    private static final long a = 7487875160938219984L;
    private ObservacaoNotaTO a;
    private Map<String, JComponent[]> a;
    private String a;
    private JButton a;
    private JButton b;
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JPanel a;
    private JTextField a;
    private JTextField b;

    public ObservacaoFiscoContribGUI(DigitarNotaFiscalGUI digitarGUI, ObservacaoNotaTO obsTO, boolean isObsFisco) {
        super((Window)DSENDesktop.getInstance(), true);
        this.a = digitarGUI.getOperacao();
        this.b();
        this.c();
        this.a();
        this.addActionListener((EventListener)this);
        this.updateGUI(obsTO);
        this.setLocationRelativeTo(null);
        this.addWindowListener((WindowListener)this);
        this.a(isObsFisco ? DSENLabelConstants.OBSERVACAO_FISCO : DSENLabelConstants.OBSERVACAO_CONTRIBUINTE);
    }

    private void a(String title) {
        this.setTitle(title);
        this.a.setBorder(BorderFactory.createTitledBorder(null, title, 2, 0, new Font("Dialog", 1, 14), Color.blue));
    }

    private void a() {
        this.b.setActionCommand("ok");
        this.a.setActionCommand("fechar");
    }

    public void updateGUI(ObservacaoNotaTO obsTO) {
        if (obsTO == null) {
            obsTO = new ObservacaoNotaTO();
        }
        this.a = obsTO;
        this.a.setText(obsTO.getXTexto());
        this.b.setText(obsTO.getXCampo());
        if ("manterNotaOperacaoDetalhe".equals(this.a)) {
            this.disableComponents("CAMPOS_OBS_FISCO_CONTRIB");
        } else {
            this.b.requestFocus();
        }
    }

    public void updateTO() {
        this.a.setXCampo(!StringHelper.isBlankOrNull((Object)this.b.getText()) ? this.b.getText() : null);
        this.a.setXTexto(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? this.a.getText() : null);
    }

    public ObservacaoNotaTO getObsTO() {
        return this.a;
    }

    private void b() {
        this.a = new JPanel();
        this.c = new JLabel();
        this.b = new JTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 20));
        this.b = new JLabel();
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.b = new JButton();
        this.a = new JButton();
        this.a = new JLabel();
        this.setDefaultCloseOperation(2);
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Observa\u00e7\u00e3o", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("* Nome do campo");
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("* Observa\u00e7\u00e3o");
        this.b.setText("Ok");
        this.a.setText("Fechar");
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("(*) Campo de preenchimento obrigat\u00f3rio. ");
        GroupLayout pnlPrincipalLayout = new GroupLayout(this.a);
        this.a.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addContainerGap().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.c).addComponent(this.b)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 483, 32767).addComponent(this.b, -2, 212, -2))).addGroup(pnlPrincipalLayout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 274, 32767).addComponent(this.a))).addContainerGap()));
        pnlPrincipalLayout.linkSize(0, this.b, this.c);
        pnlPrincipalLayout.setVerticalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.b, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a, -2, -1, -2)).addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(pnlPrincipalLayout.createSequentialGroup().addGap(18, 18, 18).addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a)).addContainerGap(-1, 32767)).addGroup(pnlPrincipalLayout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addContainerGap()))));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        this.pack();
    }

    public void addActionListener(EventListener listener) {
        this.b.addActionListener((ActionListener)listener);
        this.a.addActionListener((ActionListener)listener);
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
    }

    private void c() {
        this.a = new HashMap();
        this.a.put("CAMPOS_OBS_FISCO_CONTRIB", new JComponent[]{this.b, this.a, this.b});
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("ok".equals(e.getActionCommand())) {
            this.updateTO();
            if (this.a.getXCampo() == null || this.a.getXTexto() == null) {
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
}

