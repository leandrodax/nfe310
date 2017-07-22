/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoArmaEnum
 *  br.gov.sp.fazenda.dsen.common.to.ArmaTO
 *  br.gov.sp.fazenda.dsen.view.nfe.ArmamentoGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 */
package br.gov.sp.fazenda.dsen.view.nfe;

import br.gov.sp.fazenda.dsen.common.enumeration.TipoArmaEnum;
import br.gov.sp.fazenda.dsen.common.to.ArmaTO;
import br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI;
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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class ArmamentoGUI
extends DSGEDialog
implements ActionListener,
WindowListener {
    private static final long a = -2436647952801432307L;
    private ArmaTO a;
    private Map<String, JComponent[]> a;
    private String a;
    private JButton a;
    private JButton b;
    private JComboBox a;
    private JLabel a;
    private JScrollPane a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JPanel a;
    private JTextArea a;
    private JTextField a;
    private JTextField b;

    public ArmamentoGUI(ProdutoNotaGUI produtoNotaGUI, ArmaTO armaTO) {
        super((Window)produtoNotaGUI, true);
        this.a = produtoNotaGUI.getOperacaoNota();
        this.b();
        this.c();
        this.a();
        this.addActionListener((EventListener)this);
        this.setListaTipoArma(TipoArmaEnum.values());
        this.updateGUI(armaTO);
        this.setLocationRelativeTo(null);
        this.addWindowListener((WindowListener)this);
    }

    private void a() {
        this.b.setActionCommand("ok");
        this.a.setActionCommand("fechar");
    }

    public void setListaTipoArma(TipoArmaEnum[] lista) {
        this.a.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.a.addItem(lista[i]);
            }
        }
        this.a.setSelectedIndex(-1);
    }

    public void updateGUI(ArmaTO armaTO) {
        if (armaTO == null) {
            armaTO = new ArmaTO();
        }
        this.a = armaTO;
        if (!StringHelper.isBlankOrNull((Object)armaTO.getTpArma())) {
            TipoArmaEnum[] tipoArma = TipoArmaEnum.values();
            for (int i = 0; i < tipoArma.length; ++i) {
                if (!tipoArma[i].getCodigo().equals(armaTO.getTpArma())) continue;
                this.a.setSelectedItem((Object)tipoArma[i]);
                break;
            }
        }
        this.b.setText(armaTO.getNSerie() != null ? armaTO.getNSerie().toString() : null);
        this.a.setText(armaTO.getNCano() != null ? armaTO.getNCano().toString() : null);
        this.a.setText(armaTO.getDescr());
        if ("manterNotaOperacaoDetalhe".equals(this.a)) {
            this.disableComponents("CAMPOS_ARMAMENTO");
        } else {
            this.a.requestFocus();
        }
    }

    public void updateTO() {
        TipoArmaEnum tpArma = (TipoArmaEnum)this.a.getSelectedItem();
        this.a.setTpArma(tpArma != null ? tpArma.getCodigo() : null);
        this.a.setNSerie(!StringHelper.isBlankOrNull((Object)this.b.getText()) ? this.b.getText() : null);
        this.a.setNCano(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? this.a.getText() : null);
        this.a.setDescr(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? this.a.getText() : null);
    }

    public ArmaTO getArmamentoTO() {
        return this.a;
    }

    private void b() {
        this.a = new JPanel();
        this.e = new JLabel();
        this.a = new JComboBox();
        this.d = new JLabel();
        this.b = new JTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 15));
        this.c = new JLabel();
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 15));
        this.b = new JLabel();
        this.a = new JScrollPane();
        this.a = new JTextArea();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 256));
        this.b = new JButton();
        this.a = new JButton();
        this.a = new JLabel();
        this.setDefaultCloseOperation(0);
        this.setTitle("Armamento");
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Armamento", 2, 2, new Font("Dialog", 1, 14), Color.blue));
        this.e.setFont(new Font("Tahoma", 1, 11));
        this.e.setText("* Tipo de arma");
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText("* S\u00e9rie da arma");
        this.b.setHorizontalAlignment(4);
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("* S\u00e9rie do cano");
        this.a.setHorizontalAlignment(4);
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("* Descri\u00e7\u00e3o");
        this.a.setColumns(20);
        this.a.setLineWrap(true);
        this.a.setRows(3);
        this.a.setWrapStyleWord(true);
        this.a.setViewportView(this.a);
        this.b.setText("Ok");
        this.a.setText("Fechar");
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("(*) Campo de preenchimento obrigat\u00f3rio. ");
        GroupLayout pnlArmamento1Layout = new GroupLayout(this.a);
        this.a.setLayout(pnlArmamento1Layout);
        pnlArmamento1Layout.setHorizontalGroup(pnlArmamento1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlArmamento1Layout.createSequentialGroup().addContainerGap().addGroup(pnlArmamento1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlArmamento1Layout.createSequentialGroup().addGroup(pnlArmamento1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.d).addComponent(this.e).addComponent(this.b)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlArmamento1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(pnlArmamento1Layout.createSequentialGroup().addGroup(pnlArmamento1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.b, -1, 274, 32767).addComponent(this.a, 0, 274, 32767)).addGap(18, 18, 18).addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 274, -2)).addComponent(this.a))).addGroup(GroupLayout.Alignment.TRAILING, pnlArmamento1Layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 436, 32767).addComponent(this.a))).addContainerGap(-1, 32767)));
        pnlArmamento1Layout.setVerticalGroup(pnlArmamento1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlArmamento1Layout.createSequentialGroup().addGroup(pnlArmamento1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.e).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlArmamento1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.d).addComponent(this.b, -2, -1, -2).addComponent(this.c).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlArmamento1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b).addComponent(this.a, -2, 120, -2)).addGroup(pnlArmamento1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlArmamento1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.a)).addGroup(pnlArmamento1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(pnlArmamento1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a)).addContainerGap()))));
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
        this.a.put("CAMPOS_ARMAMENTO", new JComponent[]{this.b, this.a, this.a, this.b, this.a});
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("ok".equals(e.getActionCommand())) {
            this.updateTO();
            if (this.a.getTpArma() == null || this.a.getNSerie() == null || this.a.getNCano() == null || this.a.getDescr() == null) {
                this.showMessage("Campo(s) obrigat\u00f3rio(s) n\u00e3o informado(s)");
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

