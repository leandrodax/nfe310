/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta
 *  br.gov.sp.fazenda.dsen.model.queue.BuscaRetornoQueueItem
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.InformacaoBuscaRetornoGUI
 *  br.gov.sp.fazenda.dsen.view.InformacaoBuscaRetornoGUI$1
 *  br.gov.sp.fazenda.dsen.view.InformacaoBuscaRetornoGUI$2
 *  br.gov.sp.fazenda.dsen.view.InformacaoBuscaRetornoGUI$3
 *  br.gov.sp.fazenda.dsen.view.InformacaoBuscaRetornoGUI$4
 *  br.gov.sp.fazenda.dsen.view.InformacaoBuscaRetornoGUI$5
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.DateTimeFormatter
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 *  br.gov.sp.fazenda.dsge.view.table.JTableComponentRenderer
 *  br.gov.sp.fazenda.dsge.view.table.JTableImageMouseListener
 *  br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta;
import br.gov.sp.fazenda.dsen.model.queue.BuscaRetornoQueueItem;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.InformacaoBuscaRetornoGUI;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.DateTimeFormatter;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import br.gov.sp.fazenda.dsge.view.table.JDSGETable;
import br.gov.sp.fazenda.dsge.view.table.JTableComponentRenderer;
import br.gov.sp.fazenda.dsge.view.table.JTableImageMouseListener;
import br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;
import java.net.URL;
import java.text.ParseException;
import java.util.EventListener;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.text.DefaultFormatter;

public class InformacaoBuscaRetornoGUI
extends DSGEDialog {
    private static final long a = -7491478077723698811L;
    private ImageIcon a;
    private JButton a;
    private JPanel a;
    private JPanel b;
    private JDSGEPageableTable<BuscaRetornoQueueItem> a;

    public InformacaoBuscaRetornoGUI(Frame parent, boolean modal) throws DSGEViewException {
        super((Window)parent, modal);
        try {
            this.d();
            this.c();
            this.a();
            this.bindController((ViewItf)this);
            this.setDefaultCloseOperation(0);
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            this.setSize((int)d.getWidth() - 50, (int)d.getHeight() - 50);
            this.setLocationRelativeTo(null);
            this.a = new ImageIcon(DSENDesktop.class.getResource("resources/lupa.gif"));
        }
        catch (Exception e) {
            DSENDesktop.getInstance().showErrors((DSGEBaseException)new DSGEViewException((Throwable)e, e.getMessage()));
        }
    }

    private void a() {
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.addWindowListener((WindowListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.addPageableSortableListener((PageableSortableTableActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void b() {
        this.a.removeAllTO();
        this.setVisible(false);
    }

    private void c() throws ParseException {
        this.a = new JDSGEPageableTable();
        int index = 0;
        this.a.getWrappedTable().addColumn(index++, "horaTerminoExecucao", "           Data/Hora           ", (DefaultFormatter)new DateTimeFormatter(), false, "horaTerminoExecucao");
        this.a.getWrappedTable().addColumn(index++, "chaveAcessoFormatada", "Chave de Acesso", false, "chaveAcessoFormatada");
        this.a.getWrappedTable().addColumn(index++, "serie", "S\u00e9rie", false, "serie");
        this.a.getWrappedTable().addColumn(index++, "numero", "N\u00famero", false, "numero");
        this.a.getWrappedTable().addColumn(index++, "situacaoNFe", "Situa\u00e7\u00e3o da NF-e", false, "situacaoNFe");
        this.a.getWrappedTable().addColumn(index++, "codigoErro", "C\u00f3digo", false, "codigoErro");
        this.a.getWrappedTable().addColumn(index++, "mensagemErro", "Mensagem/Erro/Motivo Rejei\u00e7\u00e3o", false, "mensagemErro");
        this.a.getWrappedTable().addColumn(index++, "botaoDetalhe", "Detalhe", false, "botaoDetalhe");
        this.a.setSelectAllAvailable(false);
        this.a.setPageable(false);
        this.a.setSortable(true);
        this.a.setAutoFitTableColumns(true);
        this.a.setColumnSelecao(-1);
        this.a.setPanel(this.b);
        this.a.getWrappedTable().addMouseListener((MouseListener)new JTableImageMouseListener((JTable)this.a.getWrappedTable()));
         renderer = new /* Unavailable Anonymous Inner Class!! */;
        int columnIndex = this.a.getWrappedTable().getColumnModel().getColumnCount() - 1;
        while (columnIndex > 0) {
            this.a.getWrappedTable().getColumnModel().getColumn(--columnIndex).setCellRenderer((TableCellRenderer)renderer);
        }
        this.a.getWrappedTable().setDefaultRenderer(JLabel.class, (TableCellRenderer)new JTableComponentRenderer(this.a.getWrappedTable().getDefaultRenderer(JLabel.class)));
    }

    private void d() {
        this.a = new JPanel();
        this.a = new JButton();
        this.b = new JPanel();
        this.setDefaultCloseOperation(0);
        this.setTitle("Resultados da Busca por Retornos");
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Resultados da Busca por Retornos", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.a.setText("Fechar");
        GroupLayout pnlResumoLayout = new GroupLayout(this.b);
        this.b.setLayout(pnlResumoLayout);
        pnlResumoLayout.setHorizontalGroup(pnlResumoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 778, 32767));
        pnlResumoLayout.setVerticalGroup(pnlResumoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 512, 32767));
        GroupLayout pnlPrincipalLayout = new GroupLayout(this.a);
        this.a.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addContainerGap().addComponent(this.b, -1, -1, 32767)).addGroup(GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup().addContainerGap(352, 32767).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 364, 32767))).addContainerGap()));
        pnlPrincipalLayout.setVerticalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup().addContainerGap().addComponent(this.b, -1, -1, 32767).addGap(12, 12, 12).addComponent(this.a).addContainerGap()));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        this.pack();
    }

    public void addActionListener(EventListener listener) {
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public void addItem(BuscaRetornoQueueItem obj) {
        if (obj.getErroXmlResposta() != null || obj.getException() != null) {
            JLabel label = new JLabel(this.a);
            label.addMouseListener((MouseListener)new /* Unavailable Anonymous Inner Class!! */);
            obj.setBotaoDetalhe(label);
        }
        this.a.addTO((BaseTO)obj);
    }

    public InformacaoBuscaRetornoGUI getGUI() {
        return this;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
    }

    static /* synthetic */ void a(InformacaoBuscaRetornoGUI x0) {
        x0.b();
    }
}

