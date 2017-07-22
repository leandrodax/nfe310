/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoInfoTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.view.ManterCertificadoGUI
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.DSGETabbedPane
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.to.CertificadoInfoTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.DSGETabbedPane;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.util.HashMap;
import java.util.Map;
import javax.accessibility.AccessibleContext;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.event.CellEditorListener;

public class ManterCertificadoGUI
extends DSGESimplePanel {
    private static final long a = -486167842875255366L;
    private JButton a;
    private JButton b;
    private JButton c;
    private JButton d;
    private JButton e;
    private JButton f;
    private ButtonGroup a;
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JPanel a;
    private JPanel b;
    private JTabbedPane a;
    private JPanel c;
    private JPanel d;
    private JRadioButton a;
    private JRadioButton b;
    private Map<String, JComponent[]> a;
    private JDSGEPageableTable<CertificadoInfoTO> a;
    private JDSGEPageableTable<CertificadoInfoTO> b;

    public ManterCertificadoGUI() throws DSGEViewException {
        this.d();
        this.a();
        this.c();
        this.b();
        this.bindController((ViewItf)this);
    }

    private void a() {
        this.a = new JDSGEPageableTable();
        this.a.setSelectAllAvailable(true);
        int index = 0;
        this.a.addColumn(index++, "marcado", "", true, null);
        this.a.addColumn(index++, "alias", "Nome", false, "alias");
        this.a.addColumn(index++, "cnpj", "CNPJ", false, "cnpj");
        this.a.addColumn(index++, "dataValidade", "V\u00e1lido at\u00e9", false, "dataValidade");
        this.a.addColumn(index++, "autoridadeCertificadora", "Emitido por", false, "autoridadeCertificadora");
        this.a.addColumn(index++, "caminho", "Local do Arquivo", false, "caminho");
        this.a.setAutoFitTableColumns(true);
        this.a.setPageable(false);
        this.a.setSortable(true);
        this.a.setSortColumnDbFieldName("alias");
        this.a.setSortColumnASC(true);
        this.a.setInitialSortColumn(1, true);
        this.a.setPanel(this.a);
        this.b = new JDSGEPageableTable();
        this.b.setSelectAllAvailable(true);
        index = 0;
        this.b.addColumn(index++, "marcado", "", true, null);
        this.b.addColumn(index++, "alias", "Nome", false, "alias");
        this.b.addColumn(index++, "cnpj", "CNPJ", false, "cnpj");
        this.b.addColumn(index++, "dataValidade", "V\u00e1lido at\u00e9", false, "dataValidade");
        this.b.addColumn(index++, "autoridadeCertificadora", "Emitido por", false, "autoridadeCertificadora");
        this.b.addColumn(index++, "caminho", "Biblioteca do Driver PKCS11", false, "caminho");
        this.b.setAutoFitTableColumns(true);
        this.b.setPageable(false);
        this.b.setSortable(true);
        this.b.setSortColumnDbFieldName("alias");
        this.b.setSortColumnASC(true);
        this.b.setInitialSortColumn(1, true);
        this.b.setPanel(this.b);
    }

    public JDSGEPageableTable<CertificadoInfoTO> getTblA1() {
        return this.a;
    }

    public JDSGEPageableTable<CertificadoInfoTO> getTblA3() {
        return this.b;
    }

    public boolean usarRepositorioWindows() {
        return this.b.isSelected();
    }

    public void setUsarRepositorioWindows(boolean b) {
        if (b) {
            this.b.setSelected(true);
            this.disableComponents("GERENCIAR_CERTIFICADOS_REPOSITORIO_WINDOWS_DISABLED_FIELDS");
        } else {
            this.a.setSelected(true);
            this.enableComponents("GERENCIAR_CERTIFICADOS_REPOSITORIO_WINDOWS_DISABLED_FIELDS");
        }
    }

    private void b() {
        this.d.setActionCommand("ACTION_PROCURAR_A3");
        this.f.setActionCommand("ACTION_REMOVER_A3");
        this.c.setActionCommand("ACTION_INFORMAR_BIBLIOTECA");
        this.a.setActionCommand("ACTION_ADICIONAR_A1");
        this.e.setActionCommand("ACTION_REMOVER_A1");
        this.b.setActionCommand("fechar");
        this.a.setActionCommand("ACTION_CERTIFICADO_SELECIONAR_CADASTRO_APLICATIVO");
        this.b.setActionCommand("ACTION_CERTIFICADO_SELECIONAR_REPOSITORIO_WINDOWS");
    }

    public void addActionListener(EventListener listener) {
        this.d.addActionListener((ActionListener)listener);
        this.f.addActionListener((ActionListener)listener);
        this.c.addActionListener((ActionListener)listener);
        this.a.addActionListener((ActionListener)listener);
        this.e.addActionListener((ActionListener)listener);
        this.b.addActionListener((ActionListener)listener);
        this.a.addActionListener((ActionListener)listener);
        this.b.addActionListener((ActionListener)listener);
        this.a.addPageableSortableListener((PageableSortableTableActionListener)listener);
        this.b.addPageableSortableListener((PageableSortableTableActionListener)listener);
        this.a.addCellEditorListener(0, (CellEditorListener)listener);
        this.b.addCellEditorListener(0, (CellEditorListener)listener);
    }

    private void c() {
        this.a = new HashMap();
        this.a.put("SELECT_GERENCIAR_CERTIFICADOS_INIT", new JComponent[]{this.e, this.a, this.f, this.c, this.d});
        this.a.put("SELECT_GERENCIAR_CERTIFICADOS_A1_NONE_SELECTED_DISABLED", new JComponent[]{this.e});
        this.a.put("SELECT_GERENCIAR_CERTIFICADOS_A3_NONE_SELECTED_DISABLED", new JComponent[]{this.f});
        this.a.put("GERENCIAR_CERTIFICADOS_REPOSITORIO_WINDOWS_DISABLED_FIELDS", new JComponent[]{this.c, this.d, this.a, this.b, this.a, this.e, this.d, this.c, this.f, this.a, this.b});
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    private void d() {
        this.a = new ButtonGroup();
        this.a = new JLabel();
        this.b = new JRadioButton();
        this.a = new JRadioButton();
        this.b = new JLabel();
        this.a = new DSGETabbedPane();
        this.c = new JPanel();
        this.a = new JButton();
        this.e = new JButton();
        this.a = new JPanel();
        this.d = new JLabel();
        this.d = new JPanel();
        this.d = new JButton();
        this.f = new JButton();
        this.b = new JPanel();
        this.c = new JButton();
        this.e = new JLabel();
        this.c = new JLabel();
        this.b = new JButton();
        this.setBorder((Border)BorderFactory.createTitledBorder(null, "Certificados", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.a.setFont(new Font("SansSerif", 0, 11));
        this.a.setText("<html><p>Para sistemas Microsoft Windows h\u00e1 a op\u00e7\u00e3o de utilizar o Reposit\u00f3rio de Certificados do pr\u00f3prio Windows.<br>O Software ir\u00e1 apresentar os certificados encontrados no Windows e fornecer\u00e1 a op\u00e7\u00e3o de escolha de um deles para assinatura e transmiss\u00e3o.<br>Forne\u00e7a a senha quando for requerido.<br>*Recomenda-se a utiliza\u00e7\u00e3o desta op\u00e7\u00e3o caso seja usu\u00e1rio Windows.</p></html>");
        this.a.add(this.b);
        this.b.setFont(new Font("SansSerif", 1, 12));
        this.b.setText("Utilizar Reposit\u00f3rio de Certificados do Windows");
        this.a.add(this.a);
        this.a.setFont(new Font("SansSerif", 1, 12));
        this.a.setText("Utilizar o cadastro de Certificados via aplicativo");
        this.b.setFont(new Font("SansSerif", 0, 11));
        this.b.setText("<html><p><b>Importante: </b>Antes de utilizar o certificado:<br><p style=\"margin-left: 10px;\">Certifique-se atrav\u00e9s de sua fornecedora que o certificado escolhido \u00e9 compat\u00edvel com os padr\u00f5es estabelecidos;</p><p style=\"margin-left: 10px;\">Para certificados tipo A1: N\u00e3o se esque\u00e7a de instal\u00e1-lo corretamente no seu sistema;</p><p style=\"margin-left: 10px;\">Para certificados tipo A3 (Token/Smart Card): N\u00e3o se esque\u00e7a de instalar o driver especificado pela fornecedora e conectar o dispositivo corretamente.</p></p></html>");
        this.a.setText("Incluir");
        this.a.setToolTipText(DSENLabelConstants.TOOLTIP_CERTIFICADO_BTN_INCLUIR_A1);
        this.e.setText("Excluir");
        this.e.setToolTipText(DSENLabelConstants.TOOLTIP_CERTIFICADO_BTN_EXCLUIR_A1);
        GroupLayout pnlA1Layout = new GroupLayout(this.a);
        this.a.setLayout(pnlA1Layout);
        pnlA1Layout.setHorizontalGroup(pnlA1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 666, 32767));
        pnlA1Layout.setVerticalGroup(pnlA1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 24, 32767));
        this.d.setFont(new Font("SansSerif", 0, 11));
        this.d.setText("<html><p>Escolha o arquivo com a chave privada do certificado (extens\u00e3o .pfx ou .p12) que ser\u00e1 utilizado para Assinatura e/ou Transmiss\u00e3o de arquivos</p></html>");
        GroupLayout pnlBorderA1Layout = new GroupLayout(this.c);
        this.c.setLayout(pnlBorderA1Layout);
        pnlBorderA1Layout.setHorizontalGroup(pnlBorderA1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlBorderA1Layout.createSequentialGroup().addContainerGap().addGroup(pnlBorderA1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.a, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.d, GroupLayout.Alignment.LEADING, -1, 666, 32767).addGroup(GroupLayout.Alignment.LEADING, pnlBorderA1Layout.createSequentialGroup().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e))).addContainerGap()));
        pnlBorderA1Layout.setVerticalGroup(pnlBorderA1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlBorderA1Layout.createSequentialGroup().addComponent(this.d, -2, 38, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlBorderA1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.e))));
        this.a.addTab("Certificados A1 (Arquivo)", null, this.c, "");
        this.d.setText("Incluir via Busca Autom\u00e1tica");
        this.d.setToolTipText(DSENLabelConstants.TOOLTIP_CERTIFICADO_BTN_INCLUIR_A3_BUSCA_AUTO);
        this.f.setText("Excluir");
        this.f.setToolTipText(DSENLabelConstants.TOOLTIP_CERTIFICADO_BTN_EXCLUIR_A3);
        GroupLayout pnlA3Layout = new GroupLayout(this.b);
        this.b.setLayout(pnlA3Layout);
        pnlA3Layout.setHorizontalGroup(pnlA3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 666, 32767));
        pnlA3Layout.setVerticalGroup(pnlA3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 0, 32767));
        this.c.setText("Incluir Manualmente");
        this.c.setToolTipText(DSENLabelConstants.TOOLTIP_CERTIFICADO_BTN_INCLUIR_A3_MANUALMENTE);
        this.e.setFont(new Font("SansSerif", 0, 11));
        this.e.setText("<html><p>Inclua manualmente o arquivo de biblioteca (extens\u00e3o .dll se Windows ou .so se Linux) do dispositivo A3 ou escolha a busca autom\u00e1tica pelo driver (o aplicativo tentar\u00e1 buscar os drivers instalados no sistema - a opera\u00e7\u00e3o poder\u00e1 demorar alguns minutos) que ser\u00e1 utilizado para identificar o certificado para Assinatura e/ou Transmiss\u00e3o de arquivos.</p><p style=\"margin-left:10px;\"><b>*Certifique-se que o dispositivo esteja conectado ao computador</b></p></html>");
        GroupLayout pnlBorderA3Layout = new GroupLayout(this.d);
        this.d.setLayout(pnlBorderA3Layout);
        pnlBorderA3Layout.setHorizontalGroup(pnlBorderA3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlBorderA3Layout.createSequentialGroup().addContainerGap().addGroup(pnlBorderA3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.b, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.e, GroupLayout.Alignment.LEADING, -1, 666, 32767).addGroup(GroupLayout.Alignment.LEADING, pnlBorderA3Layout.createSequentialGroup().addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.f))).addContainerGap()));
        pnlBorderA3Layout.setVerticalGroup(pnlBorderA3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlBorderA3Layout.createSequentialGroup().addComponent(this.e, -2, 62, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlBorderA3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.d).addComponent(this.c).addComponent(this.f))));
        this.a.addTab("Certificados Tipo A3 (Token/Smart Card)", this.d);
        this.c.setFont(new Font("SansSerif", 0, 11));
        this.c.setText("Escolha esta op\u00e7\u00e3o caso deseje cadastrar os certificados via aplicativo, fornecendo os dados necess\u00e1rios.");
        this.b.setText("Sair");
        this.b.setToolTipText(DSENLabelConstants.TOOLTIP_CERTIFICADO_BTN_SAIR);
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a).addComponent(this.b).addGroup(layout.createSequentialGroup().addGap(21, 21, 21).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.a, GroupLayout.Alignment.LEADING, 0, 0, 32767).addComponent(this.b, GroupLayout.Alignment.LEADING, 0, 0, 32767).addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addGap(1, 1, 1).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 695, 32767).addComponent(this.c)))))).addGap(12, 12, 12)).addGroup(layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 325, 32767).addComponent(this.b, -2, 78, -2).addContainerGap(326, 32767)))));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addGap(18, 18, 18).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c).addGap(5, 5, 5).addComponent(this.a, -1, 126, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.b).addContainerGap()));
        this.a.getAccessibleContext().setAccessibleName("");
    }
}

