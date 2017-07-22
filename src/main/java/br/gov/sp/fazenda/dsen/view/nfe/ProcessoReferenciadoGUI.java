/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.OrigemProcessoEnum
 *  br.gov.sp.fazenda.dsen.common.to.ProcessoReferenciadoNotaTO
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ProcessoReferenciadoGUI
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 */
package br.gov.sp.fazenda.dsen.view.nfe;

import br.gov.sp.fazenda.dsen.common.enumeration.OrigemProcessoEnum;
import br.gov.sp.fazenda.dsen.common.to.ProcessoReferenciadoNotaTO;
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
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class ProcessoReferenciadoGUI
extends DSGEDialog
implements ActionListener,
WindowListener {
    private static final long a = 3252870673753187921L;
    private ProcessoReferenciadoNotaTO a;
    private Map<String, JComponent[]> a;
    private String a;
    private JButton a;
    private JButton b;
    private JComboBox a;
    private JLabel a;
    private JPanel a;
    private JLabel b;
    private JLabel c;
    private JTextField a;

    public ProcessoReferenciadoGUI(DigitarNotaFiscalGUI digitarGUI, ProcessoReferenciadoNotaTO procTO) {
        super((Window)DSENDesktop.getInstance(), true);
        this.a = digitarGUI.getOperacao();
        this.b();
        this.setListaInfoOrigemProcesso(OrigemProcessoEnum.values());
        this.c();
        this.a();
        this.addActionListener((EventListener)this);
        this.updateGUI(procTO);
        this.setLocationRelativeTo(null);
        this.addWindowListener((WindowListener)this);
    }

    private void a() {
        this.b.setActionCommand("ok");
        this.a.setActionCommand("fechar");
    }

    public void setListaInfoOrigemProcesso(OrigemProcessoEnum[] lista) {
        this.a.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.a.addItem(lista[i]);
            }
        }
        this.a.setSelectedIndex(-1);
    }

    public void updateGUI(ProcessoReferenciadoNotaTO procTO) {
        if (procTO == null) {
            procTO = new ProcessoReferenciadoNotaTO();
        }
        this.a = procTO;
        OrigemProcessoEnum[] origemValues = OrigemProcessoEnum.values();
        this.a.setText(procTO.getNProc());
        if (!StringHelper.isBlankOrNull((Object)procTO.getIndProc())) {
            for (int i = 0; i < origemValues.length; ++i) {
                if (!String.valueOf(origemValues[i].getCodigo()).equals(procTO.getIndProc())) continue;
                this.a.setSelectedItem((Object)origemValues[i]);
                break;
            }
        }
        if ("manterNotaOperacaoDetalhe".equals(this.a)) {
            this.disableComponents("CAMPOS_PROCESSO_REFERENCIADO");
        } else {
            this.a.requestFocus();
        }
    }

    public void updateTO() {
        OrigemProcessoEnum origem = (OrigemProcessoEnum)this.a.getSelectedItem();
        this.a.setNProc(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? this.a.getText() : null);
        this.a.setIndProc(origem != null ? origem.getCodigo() : null);
    }

    private void b() {
        this.a = new JPanel();
        this.c = new JLabel();
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.b = new JLabel();
        this.a = new JComboBox();
        this.b = new JButton();
        this.a = new JButton();
        this.a = new JLabel();
        this.setDefaultCloseOperation(0);
        this.setTitle("Processo Referenciado");
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Processo Referenciado", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("* Identificador do processo");
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("* Origem do processo");
        this.b.setText("Ok");
        this.a.setText("Fechar");
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("(*) Campo de preenchimento obrigat\u00f3rio. ");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 433, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 169, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 278, 32767).addComponent(this.a))).addContainerGap()));
        jPanel1Layout.linkSize(0, this.b, this.c);
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.a, -2, -1, -2)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a)).addContainerGap(-1, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addContainerGap()))));
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
        this.a.put("CAMPOS_PROCESSO_REFERENCIADO", new JComponent[]{this.b, this.a, this.a});
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("ok".equals(e.getActionCommand())) {
            this.updateTO();
            if (this.a.getNProc() == null || this.a.getIndProc() == null) {
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

    public ProcessoReferenciadoNotaTO getProcTO() {
        return this.a;
    }
}

