/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO
 *  br.gov.sp.fazenda.dsen.view.ConsultaCadastroGUI
 *  br.gov.sp.fazenda.dsen.view.ConsultaCadastroGUI$1
 *  br.gov.sp.fazenda.dsen.view.ConsultaCadastroPnlResultadoConsultaGUI
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.DSGETabbedPane
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO;
import br.gov.sp.fazenda.dsen.view.ConsultaCadastroGUI;
import br.gov.sp.fazenda.dsen.view.ConsultaCadastroPnlResultadoConsultaGUI;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.DSGETabbedPane;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;
import javax.swing.border.Border;

public class ConsultaCadastroGUI
extends DSGEDialog {
    private JButton a;
    private JTabbedPane a;

    public ConsultaCadastroGUI(Frame parent, boolean modal, List<ConsultaCadastroTO> listaConsultaCadastroTO) throws DSGEViewException {
        super((Window)parent, modal);
        this.a();
        if (listaConsultaCadastroTO != null) {
            for (ConsultaCadastroTO to : listaConsultaCadastroTO) {
                if (StringHelper.isBlankOrNull((Object)to.getIeSuframa())) {
                    this.setIETab(to);
                    continue;
                }
                this.setSUFRAMATab(to);
            }
        }
        this.setSize(new Dimension(1000, 650));
        this.setLocationRelativeTo(null);
    }

    public void setIETab(ConsultaCadastroTO to) throws DSGEViewException {
        ConsultaCadastroPnlResultadoConsultaGUI resGUI = new ConsultaCadastroPnlResultadoConsultaGUI(to);
        this.a.add("Consulta Cadastro - IE ", (Component)resGUI);
    }

    public void setSUFRAMATab(ConsultaCadastroTO to) throws DSGEViewException {
        ConsultaCadastroPnlResultadoConsultaGUI resGUI = new ConsultaCadastroPnlResultadoConsultaGUI(to);
        this.a.add("Consulta Cadastro - SUFRAMA ", (Component)resGUI);
    }

    private void a() {
        this.a = new DSGETabbedPane();
        this.a = new JButton();
        this.setDefaultCloseOperation(2);
        this.setTitle("Resultado da Consulta do Cadastro de Contribuintes do ICMS");
        this.setAlwaysOnTop(true);
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Resultado da Consulta do Cadastro de Contribuintes do ICMS", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.a.setText("Fechar");
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 600, 32767).addGroup(layout.createSequentialGroup().addContainerGap(261, 32767).addComponent(this.a).addContainerGap(265, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.a, -1, 378, 32767).addGap(3, 3, 3).addComponent(this.a).addGap(12, 12, 12)));
        this.pack();
    }

    private void a(ActionEvent evt) {
        this.setVisible(false);
        this.dispose();
    }

    public void addActionListener(EventListener listener) {
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
    }

    static /* synthetic */ void a(ConsultaCadastroGUI x0, ActionEvent x1) {
        x0.a(x1);
    }
}

