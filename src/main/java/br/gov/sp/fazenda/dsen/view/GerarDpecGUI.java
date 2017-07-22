/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.view.GerarDpecGUI
 *  br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.util.EventListener;
import java.util.Map;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;

public class GerarDpecGUI
extends DSGEDialog {
    private int a;
    private int b;
    private int c;
    private JButton a;
    private JButton b;
    private JLabel a;
    private JScrollPane a;
    private JLabel b;
    private JLabel c;
    private JPanel a;
    private JProgressBar a;
    private JTextArea a;

    public GerarDpecGUI(Frame parent, boolean modal) throws DSGEViewException {
        super((Window)parent, modal);
        this.a();
        this.setLocationRelativeTo(null);
        this.b();
    }

    private void a() {
        this.a = new JProgressBar();
        this.a = new JLabel();
        this.b = new JLabel();
        this.a = new JPanel();
        this.b = new JButton();
        this.a = new JButton();
        this.c = new JLabel();
        this.a = new JScrollPane();
        this.a = new JTextArea();
        this.setDefaultCloseOperation(2);
        this.setTitle("Gera\u00e7\u00e3o de DPECs");
        this.a.setIndeterminate(true);
        this.a.setStringPainted(true);
        this.a.setText("Resumo das Opera\u00e7\u00f5es:");
        this.b.setText("<html><p>Gerando DPECs...</p></html>");
        this.b.setText("Visualizar DPECs");
        this.b.setEnabled(false);
        this.a.setText("Fechar");
        this.a.setEnabled(false);
        GroupLayout pnlBotoesLayout = new GroupLayout(this.a);
        this.a.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(pnlBotoesLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlBotoesLayout.createSequentialGroup().addContainerGap().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.a).addContainerGap(-1, 32767)));
        pnlBotoesLayout.setVerticalGroup(pnlBotoesLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlBotoesLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b, -2, 25, -2).addComponent(this.a, -2, 25, -2)));
        this.c.setFont(new Font("Dialog", 0, 12));
        this.c.setText("<html><p>Para realizar a transmiss\u00e3o e autoriza\u00e7\u00e3o do DPEC e a posterior impress\u00e3o do DANFE:<ol><li>V\u00e1 para a tela de Visualiza\u00e7\u00e3o de DPECs</li><li>Selecione os DPECs gerados e clique em Transmitir</li><li>Forne\u00e7a os dados do certificado digital para transmiss\u00e3o e aguarde pela Autoriza\u00e7\u00e3o</li><li>Selecione o DPEC autorizado e clique em \"Detalhar\"</li><li>Selecione a Nota Fiscal e clique em \"Imprimir DANFE\"</li><li>ATEN\u00c7\u00c3O: Transmitir a NF-e para a SEFAZ quando superado o problema\nt\u00e9cnico</li></ol></p></html>");
        this.a.setColumns(20);
        this.a.setEditable(false);
        this.a.setRows(5);
        this.a.setViewportView(this.a);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, 562, 32767)).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.b, GroupLayout.Alignment.LEADING, -1, 562, 32767).addComponent(this.a, -1, 562, 32767).addComponent(this.a, GroupLayout.Alignment.LEADING))).addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addContainerGap().addComponent(this.c, -1, 562, 32767))).addContainerGap()).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(169, 32767).addComponent(this.a, -2, -1, -2).addContainerGap(168, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.b, -2, 38, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 110, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -1, -1, 32767).addGap(18, 18, 18).addComponent(this.a, -2, -1, -2).addContainerGap()));
        this.pack();
    }

    private void b() {
        this.a.setActionCommand("fechar");
        this.b.setActionCommand("visualizar");
    }

    public void addActionListener(EventListener listener) {
        this.a.addActionListener((ActionListener)listener);
        this.b.addActionListener((ActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
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

    public void updateProgress() {
        if (this.a.isIndeterminate()) {
            this.a.setIndeterminate(false);
        }
        int total = this.a == 0 ? 1 : this.a;
        this.a.setValue(this.b * 100 / total);
        this.b.setText(MessageFormat.format(DSENMessageConstants.MSG_INFO_GERACAO_DPEC, this.a, this.b, this.c));
    }

    public void appendDetail(String detail) {
        this.a.append(detail + '\n');
    }

    public void setTermino(boolean termino) {
        if (termino) {
            this.b.setText(MessageFormat.format(DSENMessageConstants.MSG_INFO_GERACAO_DPEC, this.a, this.b, this.c));
            this.a.setIndeterminate(false);
            this.a.setValue(100);
            this.setDefaultCloseOperation(2);
        } else {
            this.b.setText(DSGEMessageConstants.EXPORTANDO_ARQUIVO_AGUARDE_TERMINO);
            this.a.setIndeterminate(true);
        }
        this.a.setEnabled(termino);
        this.b.setEnabled(termino);
    }
}

