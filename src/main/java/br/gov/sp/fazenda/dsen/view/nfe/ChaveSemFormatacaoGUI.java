/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.view.nfe.ChaveSemFormatacaoGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ChaveSemFormatacaoGUI$1
 *  br.gov.sp.fazenda.dsen.view.nfe.ChaveSemFormatacaoGUI$2
 *  br.gov.sp.fazenda.dsen.view.nfe.ChaveSemFormatacaoGUI$MyEditorKit
 */
package br.gov.sp.fazenda.dsen.view.nfe;

import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.view.nfe.ChaveSemFormatacaoGUI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.Document;
import javax.swing.text.EditorKit;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class ChaveSemFormatacaoGUI
extends JDialog {
    private JButton a;
    private JPanel a;
    private JEditorPane a;

    public ChaveSemFormatacaoGUI(Frame parent, boolean modal) {
        super(parent, modal);
        this.setTitle(DSENLabelConstants.CHAVE_DE_ACESSO);
        this.a();
    }

    public void setChave(String chave) {
        try {
            this.a.setEditorKit((EditorKit)new MyEditorKit(this));
            SimpleAttributeSet attrs = new SimpleAttributeSet();
            StyleConstants.setAlignment(attrs, 1);
            StyleConstants.setFontSize(attrs, 14);
            StyleConstants.setBold(attrs, true);
            StyledDocument doc = (StyledDocument)this.a.getDocument();
            doc.insertString(0, chave, attrs);
            doc.setParagraphAttributes(0, doc.getLength() - 1, attrs, false);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void a() {
        this.a = new JPanel();
        this.a = new JButton();
        this.a = new JEditorPane();
        this.setDefaultCloseOperation(2);
        this.setResizable(false);
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Chave de Acesso", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.a.setText("Fechar");
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.setBackground(UIManager.getDefaults().getColor("Label.background"));
        this.a.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        this.a.setEditable(false);
        this.a.setFont(new Font("SansSerif", 1, 14));
        this.a.setDisabledTextColor(new Color(0, 0, 0));
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(197, 32767).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 193, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, 452, 32767))).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.a, -2, 49, -2).addGap(21, 21, 21).addComponent(this.a).addContainerGap(-1, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a, -2, -1, -2).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.a, -2, -1, -2).addContainerGap(-1, 32767)));
        this.pack();
    }

    private void a(ActionEvent evt) {
        this.setVisible(false);
        this.dispose();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
    }

    static /* synthetic */ void a(ChaveSemFormatacaoGUI x0, ActionEvent x1) {
        x0.a(x1);
    }
}

