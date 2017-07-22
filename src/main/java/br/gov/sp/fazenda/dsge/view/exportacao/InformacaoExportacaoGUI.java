/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.util.DSGELabelConstants
 *  br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.exportacao.InformacaoExportacaoGUI
 *  br.gov.sp.fazenda.dsge.view.exportacao.InformacaoExportacaoGUI$1
 *  br.gov.sp.fazenda.dsge.view.util.DSGEWindowUtilHelper
 */
package br.gov.sp.fazenda.dsge.view.exportacao;

import br.gov.sp.fazenda.dsge.common.util.DSGELabelConstants;
import br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.exportacao.InformacaoExportacaoGUI;
import br.gov.sp.fazenda.dsge.view.util.DSGEWindowUtilHelper;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.util.EventListener;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;

public class InformacaoExportacaoGUI
extends DSGEDialog {
    private static final long a = -4519851730970989839L;
    private int a;
    private int b;
    private int c;
    private JButton a;
    private JScrollPane a;
    private JLabel a;
    private JPanel a;
    private JProgressBar a;
    private JTextArea a;

    public InformacaoExportacaoGUI(Frame parent, boolean modal) {
        super((Window)parent, modal);
        this.a();
    }

    public InformacaoExportacaoGUI(Dialog parent, boolean modal) {
        super((Window)parent, modal);
        this.a();
    }

    public void setTermino(boolean termino) {
        if (termino) {
            this.a.setText(MessageFormat.format(DSGEMessageConstants.MSG_QUANTIDADE_REGISTROS_EXPORTADOS, this.a, this.b, this.c));
            this.a.setIndeterminate(false);
            this.a.setValue(100);
            this.a.setEnabled(true);
            this.setDefaultCloseOperation(2);
            this.setTitle(DSGELabelConstants.EXPORTACAO_CONCLUIDA);
        } else {
            this.a.setText(DSGEMessageConstants.EXPORTANDO_ARQUIVO_AGUARDE_TERMINO);
            this.a.setIndeterminate(true);
            this.a.setEnabled(false);
            this.setTitle(DSGELabelConstants.EXPORTANDO);
        }
    }

    public void appendDetail(String detail) {
        this.a.append(detail + '\n');
    }

    public void addActionListener(EventListener listener) {
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    private void a() {
        this.c();
        this.b();
        DSGEWindowUtilHelper.centralizarDialogo((Component)this.getParent(), (JDialog)this);
    }

    private void b() {
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    public void setTotalRegistros(int totalRegistros) {
        this.a = totalRegistros;
    }

    public void setQtdeRegistrosExportados(int qtdeRegistrosExportados) {
        this.b = qtdeRegistrosExportados;
    }

    public void setQtdeArquivosGerados(int qtdeArquivosGerados) {
        this.c = qtdeArquivosGerados;
    }

    private void c() {
        this.a = new JPanel();
        this.a = new JLabel();
        this.a = new JProgressBar();
        this.a = new JButton();
        this.a = new JScrollPane();
        this.a = new JTextArea();
        this.setDefaultCloseOperation(0);
        this.setTitle("Exportando...");
        this.a.setBorder(BorderFactory.createTitledBorder(""));
        this.a.setText("Exportando arquivo. Aguarde o t\u00e9rmino...");
        this.a.setIndeterminate(true);
        this.a.setText("OK");
        this.a.setColumns(20);
        this.a.setEditable(false);
        this.a.setRows(5);
        this.a.setViewportView(this.a);
        GroupLayout pnlPrincipalLayout = new GroupLayout(this.a);
        this.a.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addContainerGap().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 431, 32767).addComponent(this.a, -1, 431, 32767).addComponent(this.a, -1, 431, 32767))).addGroup(GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup().addContainerGap(195, 32767).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 195, 32767))).addContainerGap()));
        pnlPrincipalLayout.setVerticalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addContainerGap().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 95, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addContainerGap()));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, -1, 32767).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, -1, 32767).addContainerGap()));
        this.pack();
    }
}

