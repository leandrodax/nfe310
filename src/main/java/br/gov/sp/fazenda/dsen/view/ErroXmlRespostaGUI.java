/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta$ErroXmlRespostaAcao
 *  br.gov.sp.fazenda.dsen.view.ErroXmlRespostaGUI
 *  br.gov.sp.fazenda.dsen.view.ErroXmlRespostaGUI$1
 *  br.gov.sp.fazenda.dsen.view.ErroXmlRespostaGUI$2
 *  br.gov.sp.fazenda.dsen.view.ErroXmlRespostaGUI$3
 *  br.gov.sp.fazenda.dsen.view.ErroXmlRespostaGUI$4
 *  br.gov.sp.fazenda.dsge.view.util.DSGEWindowUtilHelper
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum;
import br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta;
import br.gov.sp.fazenda.dsen.view.ErroXmlRespostaGUI;
import br.gov.sp.fazenda.dsge.view.util.DSGEWindowUtilHelper;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;

public class ErroXmlRespostaGUI
extends JDialog
implements WindowListener {
    private static final long a = -9203320414998324630L;
    private ErroXmlResposta.ErroXmlRespostaAcao a;
    private JButton a;
    private JButton b;
    private JButton c;
    private JPanel a;
    private JEditorPane a;
    private JScrollPane a;
    private JLabel a = ErroXmlResposta.ErroXmlRespostaAcao.FECHAR;

    ErroXmlRespostaGUI(Frame parent) {
        super(parent, true);
        this.a();
        DSGEWindowUtilHelper.centralizarDialogo((Component)parent, (JDialog)this);
        this.setDefaultCloseOperation(0);
    }

    ErroXmlRespostaGUI(Dialog parent) {
        super(parent, true);
        this.a();
        DSGEWindowUtilHelper.centralizarDialogo((Component)parent, (JDialog)this);
    }

    public static ErroXmlResposta.ErroXmlRespostaAcao showError(String error, ServicoSefazEnum type, Dialog dialogParent, String title, String message) {
        ErroXmlRespostaGUI gui = new ErroXmlRespostaGUI(dialogParent);
        gui.setTitle(title);
        gui.setMessage(message);
        return gui.a(error, type);
    }

    public static ErroXmlResposta.ErroXmlRespostaAcao showError(String error, ServicoSefazEnum type, Frame frameParent, String title, String message) {
        ErroXmlRespostaGUI gui = new ErroXmlRespostaGUI(frameParent);
        gui.setTitle(title);
        gui.setMessage(message);
        return gui.a(error, type);
    }

    private ErroXmlResposta.ErroXmlRespostaAcao a(String error, ServicoSefazEnum type) {
        this.setType(type);
        this.setDetalhe(error);
        this.setVisible(true);
        return this.getAnswer();
    }

    public void setDetalhe(String text) {
        this.a.setText(text);
        this.a.setCaretPosition(0);
    }

    public void setMessage(String message) {
        this.a.setText(message);
    }

    public void setType(ServicoSefazEnum type) {
        this.c.setVisible(false);
        switch (4.a[type.ordinal()]) {
            case 1: {
                break;
            }
            case 2: {
                this.a.setVisible(false);
                break;
            }
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: {
                this.a.setVisible(false);
            }
        }
    }

    public ErroXmlResposta.ErroXmlRespostaAcao getAnswer() {
        return this.a;
    }

    public void setAnswer(ErroXmlResposta.ErroXmlRespostaAcao answer) {
        this.a = answer;
    }

    private void a() {
        this.a = new JScrollPane();
        this.a = new JEditorPane();
        this.a = new JLabel();
        this.a = new JPanel();
        this.a = new JButton();
        this.c = new JButton();
        this.b = new JButton();
        this.setDefaultCloseOperation(2);
        this.setTitle("Erro na resposta");
        this.setAlwaysOnTop(true);
        this.a.setContentType("text/html");
        this.a.setEditable(false);
        this.a.setDisabledTextColor(new Color(0, 0, 0));
        this.a.setViewportView(this.a);
        this.a.setFont(new Font("Dialog", 1, 14));
        this.a.setForeground(Color.blue);
        this.a.setHorizontalAlignment(0);
        this.a.setText("Erro na resposta");
        this.a.setText("Continuar");
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.c.setText("Parar Busca de Retorno");
        this.c.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.b.setText("Fechar");
        this.b.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        GroupLayout hrButtonsLayout = new GroupLayout(this.a);
        this.a.setLayout(hrButtonsLayout);
        hrButtonsLayout.setHorizontalGroup(hrButtonsLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(hrButtonsLayout.createSequentialGroup().addContainerGap(105, 32767).addComponent(this.a).addGap(10, 10, 10).addComponent(this.c).addGap(10, 10, 10).addComponent(this.b).addContainerGap(112, 32767)));
        hrButtonsLayout.setVerticalGroup(hrButtonsLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(hrButtonsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.c).addComponent(this.b)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 560, 32767).addComponent(this.a, GroupLayout.Alignment.TRAILING, -1, 560, 32767)).addContainerGap()).addComponent(this.a, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a).addGap(15, 15, 15).addComponent(this.a, -1, 231, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, -1, -2).addContainerGap()));
        this.pack();
    }

    private void a(ActionEvent evt) {
        this.a = ErroXmlResposta.ErroXmlRespostaAcao.FECHAR;
        this.setVisible(false);
        this.dispose();
    }

    private void b(ActionEvent evt) {
        this.a = ErroXmlResposta.ErroXmlRespostaAcao.PARAR_BUSCA_RETORNO;
        this.setVisible(false);
        this.dispose();
    }

    private void c(ActionEvent evt) {
        this.a = ErroXmlResposta.ErroXmlRespostaAcao.CONTINUAR;
        this.setVisible(false);
        this.dispose();
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
        this.a = ErroXmlResposta.ErroXmlRespostaAcao.FECHAR;
        this.setVisible(false);
        this.dispose();
    }

    @Override
    public void windowClosing(WindowEvent e) {
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

    static /* synthetic */ void a(ErroXmlRespostaGUI x0, ActionEvent x1) {
        x0.c(x1);
    }

    static /* synthetic */ void b(ErroXmlRespostaGUI x0, ActionEvent x1) {
        x0.b(x1);
    }

    static /* synthetic */ void c(ErroXmlRespostaGUI x0, ActionEvent x1) {
        x0.a(x1);
    }
}

