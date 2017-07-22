/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.DSGELabelConstants
 *  br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants
 *  br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.message.DSGEMessageDialog
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable$1
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable$2
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable$3
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable$4
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable$5
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable$6
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable$7
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable$ItemSelectionListener
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable$MouseHandler
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable$SelecionarTodosItemListener
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable$SortableHeaderRenderer
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 *  br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener
 */
package br.gov.sp.fazenda.dsge.view.table;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.DSGELabelConstants;
import br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants;
import br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter;
import br.gov.sp.fazenda.dsge.view.message.DSGEMessageDialog;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import br.gov.sp.fazenda.dsge.view.table.JDSGETable;
import br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.event.CellEditorListener;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DefaultFormatter;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class JDSGEPageableTable<E extends BaseTO>
extends JPanel {
    private static final long a = 4777497287956772022L;
    private JDSGETable<E> a;
    private int a;
    public int DEFAULT_PAGE_SIZE = 50;
    private int b;
    private String a;
    private boolean a;
    private boolean b;
    private boolean c;
    private int c;
    private int d;
    private int e = this.DEFAULT_PAGE_SIZE;
    private int f = 0;
    public static ImageIcon upArrowIcon = new ImageIcon(JDSGEPageableTable.class.getResource("resources/up_arrow.png"));
    public static ImageIcon downArrowIcon = new ImageIcon(JDSGEPageableTable.class.getResource("resources/down_arrow.png"));
    private JDSGEPageableTable<E> a;
    private JDSGEPageableTable<E> a;
    private List<PageableSortableTableActionListener> a;
    private JButton a;
    private JButton b = true;
    private JButton c = 1;
    private JButton d = 1;
    private JCheckBox a;
    private JLabel a;
    private JPanel a;
    private JScrollPane a;
    private JTextField a = true;

    public JDSGEPageableTable() {
        this.a = new SelecionarTodosItemListener(this);
        this.a = new ItemSelectionListener(this);
        this.a = new ArrayList();
        this.a();
        this.a(new JDSGETable());
        this.d();
    }

    public void setScrollPane(JScrollPane scroll) {
        scroll.setViewportView((Component)this);
        scroll.addComponentListener((ComponentListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    public void setPanel(JPanel panel) {
        panel.setLayout(new BorderLayout());
        panel.add((Component)this);
        panel.validate();
        panel.repaint();
        panel.addComponentListener((ComponentListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    public void fitTableColumns() {
        this.a.fitTableColumns();
    }

    public void setAutoFitTableColumns(boolean fit) {
        this.a.setAutoFitTableColumns(fit);
    }

    public void setBtnFirstPage(JButton btnFirstPage) {
        this.a = btnFirstPage;
    }

    public void setPageable(boolean pageable) {
        this.a.setVisible(pageable);
        this.a.setVisible(pageable);
        if (!pageable) {
            this.e = Integer.MAX_VALUE;
        }
    }

    public void setSortable(boolean sortable) {
        this.c = sortable;
    }

    public void setSelectAllAvailable(boolean available) {
        this.b = available;
        this.b();
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (this.getWrappedTable() != null) {
            this.getWrappedTable().setEnabled(enabled);
        }
        if (this.b && this.a.isVisible()) {
            this.a.setEnabled(enabled);
        }
        if (this.a.isVisible()) {
            this.a.setEnabled(enabled);
            if (!enabled) {
                this.a.setEnabled(enabled);
                this.b.setEnabled(enabled);
                this.c.setEnabled(enabled);
                this.d.setEnabled(enabled);
            } else {
                this.c();
            }
        }
    }

    private void a(JDSGETable<E> jDSENTable) {
        if (jDSENTable == null) {
            throw new IllegalArgumentException("Tabela n\u00e3o pode ser nula");
        }
        this.a = jDSENTable;
        this.updateUI();
        JTableHeader header = this.a.getTableHeader();
        header.setDefaultRenderer((TableCellRenderer)new SortableHeaderRenderer(this, header.getDefaultRenderer()));
        header.addMouseListener((MouseListener)new MouseHandler(this, null));
        this.a.setViewportView((Component)this.a);
        this.a.addItemListener((ItemListener)this.a);
        this.a(jDSENTable, this.a, this.a);
        this.c();
        this.a.setText(MessageFormat.format(DSGELabelConstants.Pagina_X_DE_Y, this.c, this.getNumberOfPages()));
        this.a.setText("1");
    }

    public JDSGETable<E> getWrappedTable() {
        return this.a;
    }

    public void setColumnSelecao(int columnIndex) {
        this.a(this.a, columnIndex, this.a);
        this.a = columnIndex;
    }

    public void addColumn(int columnIndex, String fieldName, String columnName, boolean editable, String dbColumn) {
        this.a.addColumn(columnIndex, fieldName, columnName, editable, dbColumn);
    }

    public void addColumn(int columnIndex, String fieldName, String columnName, DefaultFormatter formatter, boolean editable, String dbColumn) {
        this.a.addColumn(columnIndex, fieldName, columnName, formatter, editable, dbColumn);
    }

    public void addTO(E to) {
        this.a.addTO(to);
        this.b();
    }

    public void addTO(List<E> listaTO) {
        if (listaTO == null) {
            return;
        }
        this.a.addTO(listaTO);
        this.b();
    }

    public E getTO(int rowIndex) {
        return (E)this.a.getTO(rowIndex);
    }

    public List<E> getAllTO() {
        return this.a.getAllTO();
    }

    public void sortTOs(Comparator<E> comparator) {
        this.a.sortTOs(comparator);
    }

    public List<E> getSelectedTOs() {
        return this.a.getSelectedTOs();
    }

    public void removeTO(int rowIndex) {
        this.a.removeTO(rowIndex);
        this.b();
    }

    public void removeAllTO() {
        this.a.removeAllTO();
        this.b();
    }

    public String getColumnName(int columnIndex) {
        return this.a.getColumnName(columnIndex);
    }

    public List<E> getSelectedItens(int columnIndex) {
        return this.a.getSelectedItens(columnIndex);
    }

    public void markSelectedAllTO(int columnIndex, Boolean selected) {
        this.a.markSelectedAllTO(columnIndex, selected);
    }

    public void addCellEditorListener(int columnIndex, CellEditorListener listener) {
        this.a.addCellEditorListener(columnIndex, listener);
    }

    public void removeCellEditorListener(int columnIndex, CellEditorListener listener) {
        this.a.removeCellEditorListener(columnIndex, listener);
    }

    public void removeTO(E to) {
        this.a.removeTO(to);
        this.b();
    }

    public void removeTO(List<E> lista) {
        if (lista == null) {
            return;
        }
        this.a.removeTO(lista);
        this.b();
    }

    public boolean containsTO(E to) {
        return this.a.containsTO(to);
    }

    private void a(JDSGETable table, int newColumnSelecao, int oldColumnSelecao) {
        table.removeCellEditorListener(oldColumnSelecao, (CellEditorListener)this.a);
        if (newColumnSelecao >= 0) {
            table.addCellEditorListener(newColumnSelecao, (CellEditorListener)this.a);
        }
    }

    private void a() {
        this.a = new JCheckBox();
        this.a = new JScrollPane();
        this.a = new JPanel();
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(9));
        this.d = new JButton();
        this.a = new JButton();
        this.c = new JButton();
        this.b = new JButton();
        this.a = new JLabel();
        this.setOpaque(false);
        this.a.setFont(new Font("Tahoma", 1, 11));
        this.a.setText("Selecionar todos");
        this.a.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.a.setMargin(new Insets(0, 0, 0, 0));
        this.a.setHorizontalAlignment(0);
        this.a.setToolTipText("Ir para a P\u00e1gina");
        this.a.addKeyListener((KeyListener)new /* Unavailable Anonymous Inner Class!! */);
        this.d.setText("<");
        this.d.setToolTipText("P\u00e1gina Anterior");
        this.d.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.setText("|<");
        this.a.setToolTipText("Primeira P\u00e1gina");
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.c.setText(">");
        this.c.setToolTipText("Pr\u00f3xima P\u00e1gina");
        this.c.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.b.setText(">|");
        this.b.setToolTipText("\u00daltima P\u00e1gina");
        this.b.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        GroupLayout pnlPageControlsLayout = new GroupLayout(this.a);
        this.a.setLayout(pnlPageControlsLayout);
        pnlPageControlsLayout.setHorizontalGroup(pnlPageControlsLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlPageControlsLayout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d).addGap(19, 19, 19).addComponent(this.a, -2, 37, -2).addGap(18, 18, 18).addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addContainerGap()));
        pnlPageControlsLayout.setVerticalGroup(pnlPageControlsLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPageControlsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.d).addComponent(this.b).addComponent(this.c).addComponent(this.a, -2, 22, -2)));
        this.a.setText("P\u00e1gina 1 de 1");
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 164, 32767).addComponent(this.a)).addComponent(this.a, -1, 357, 32767).addGroup(layout.createSequentialGroup().addContainerGap(30, 32767).addComponent(this.a, -2, -1, -2).addContainerGap(31, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.a)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 117, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, -1, -2).addContainerGap()));
    }

    private void a(ActionEvent evt) {
        this.a(this.getNumberOfPages());
        this.b(this.c);
    }

    private void b(ActionEvent evt) {
        this.a(++this.c);
        this.b(this.c);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(KeyEvent evt) {
        block8 : {
            if (evt.getKeyCode() == 10) {
                int page = 0;
                try {
                    this.a.setEnabled(false);
                    String pageStr = this.a.getText();
                    page = Integer.parseInt(pageStr);
                    if (page >= 1 && page <= this.getNumberOfPages()) {
                        this.a(page);
                        this.b(this.c);
                    } else {
                        DSGEMessageDialog.showMessage((String)MessageFormat.format(DSGEMessageConstants.INFORME_UMA_PAGINA_ENTRE_X_E_Y, 1, this.getNumberOfPages()));
                        this.a(this.c);
                    }
                    break block8;
                }
                catch (Exception pageStr) {}
                break block8;
                finally {
                    this.a.setEnabled(true);
                }
            }
        }
    }

    private void c(ActionEvent evt) {
        this.a(--this.c);
        this.b(this.c);
    }

    private void d(ActionEvent evt) {
        this.a(1);
        this.b(this.c);
    }

    private void a(int page) {
        this.c = page;
        this.a.setText(MessageFormat.format(DSGELabelConstants.Pagina_X_DE_Y, this.c, this.getNumberOfPages()));
        this.a.setText("" + this.c + "");
        this.c();
        this.b();
    }

    private void b() {
        int size = this.getAllTO().size();
        if (!this.b || size <= 1) {
            this.a.setVisible(false);
        } else {
            this.a.setVisible(true);
        }
        if (size == 0) {
            this.a(false);
        } else if (this.getSelectedTOs().size() == size) {
            this.a(true);
        } else {
            this.a(false);
        }
    }

    private void a(boolean selected) {
        this.a.removeItemListener((ItemListener)this.a);
        this.a.setSelected(selected);
        this.a.addItemListener((ItemListener)this.a);
    }

    public void reset() {
        this.c = 1;
        this.f = 0;
        this.d = 1;
        this.a.setSelected(false);
        this.a.setText(MessageFormat.format(DSGELabelConstants.Pagina_X_DE_Y, this.c, this.getNumberOfPages()));
        this.a.setText("" + this.c + "");
        this.c();
        this.a.getTableHeader().repaint();
    }

    public void setInitialSortColumn(int column, boolean asc) {
        this.setSortColumnASC(asc);
        this.setSortColumnIndex(column);
        this.a.getTableHeader().repaint();
    }

    private void c() {
        if (!this.isEnabled()) {
            return;
        }
        this.a.setEnabled(this.c > 1);
        this.d.setEnabled(this.c > 1);
        this.c.setEnabled(this.c < this.getNumberOfPages());
        this.b.setEnabled(this.c < this.getNumberOfPages());
    }

    private void d() {
        this.a.setActionCommand("GOTOFIRSTPAGE");
        this.d.setActionCommand("GOTOPREVIOUSPAGE");
        this.c.setActionCommand("GOTONEXTPAGE");
        this.b.setActionCommand("GOTOLASTPAGE");
        this.a.setActionCommand("GOTOPAGEX");
    }

    public void setActionListener(ActionListener actionListener) {
        this.a.addActionListener(actionListener);
        this.d.addActionListener(actionListener);
        this.c.addActionListener(actionListener);
        this.b.addActionListener(actionListener);
        this.a.addActionListener(actionListener);
    }

    public void addPageableSortableListener(PageableSortableTableActionListener listener) {
        this.a.add(listener);
    }

    public void removePageableSortableListener(PageableSortableTableActionListener listener) {
        this.a.remove((Object)listener);
    }

    private void e() {
        for (PageableSortableTableActionListener listener : this.a) {
            if (listener == null) continue;
            listener.sortColumnChanged(this);
        }
    }

    private void b(int page) {
        if (this.getNumberOfPages() > 1) {
            for (PageableSortableTableActionListener listener : this.a) {
                if (listener == null) continue;
                listener.pageChanged(this);
            }
        }
    }

    public int getPageSize() {
        return this.e;
    }

    public void setPageSize(int pageSize) {
        this.e = pageSize;
        this.f();
        this.c();
        this.a.setText(MessageFormat.format(DSGELabelConstants.Pagina_X_DE_Y, this.c, this.getNumberOfPages()));
    }

    public int getStartPageIndex() {
        return (this.c - 1) * this.e;
    }

    public int getFinishPageIndex() {
        int finish = this.getStartPageIndex() + this.e;
        if (finish > this.f) {
            return this.f;
        }
        return finish;
    }

    public int getSortColumnIndex() {
        return this.b;
    }

    public String getSortColumnDbFieldName() {
        return this.a;
    }

    public void setSortColumnDbFieldName(String f) {
        this.a = f;
    }

    public void setSortColumnIndex(int sortColumnIndex) {
        this.b = sortColumnIndex;
    }

    public boolean isSortColumnASC() {
        return this.a;
    }

    public void setSortColumnASC(boolean sortColumnASC) {
        this.a = sortColumnASC;
    }

    public int getNumberOfLines() {
        return this.f;
    }

    public void setNumberOfLines(int numberOfLines) {
        this.f = numberOfLines;
        this.f();
        if (this.c > this.d) {
            this.c = this.d;
        }
        this.c();
        this.a.setText(MessageFormat.format(DSGELabelConstants.Pagina_X_DE_Y, this.c, this.getNumberOfPages()));
        this.a.setText("" + this.c);
    }

    private void f() {
        this.d = Math.max((int)Math.ceil((float)this.f / (float)this.e), 1);
    }

    public int getNumberOfPages() {
        return this.d;
    }

    static /* synthetic */ void a(JDSGEPageableTable x0, KeyEvent x1) {
        x0.a(x1);
    }

    static /* synthetic */ void a(JDSGEPageableTable x0, ActionEvent x1) {
        x0.c(x1);
    }

    static /* synthetic */ void b(JDSGEPageableTable x0, ActionEvent x1) {
        x0.d(x1);
    }

    static /* synthetic */ void c(JDSGEPageableTable x0, ActionEvent x1) {
        x0.b(x1);
    }

    static /* synthetic */ void d(JDSGEPageableTable x0, ActionEvent x1) {
        x0.a(x1);
    }

    static /* synthetic */ int a(JDSGEPageableTable x0) {
        return x0.a;
    }

    static /* synthetic */ JDSGETable a(JDSGEPageableTable x0) {
        return x0.a;
    }

    static /* synthetic */ void a(JDSGEPageableTable x0) {
        x0.b();
    }

    static /* synthetic */ boolean a(JDSGEPageableTable x0) {
        return x0.c;
    }

    static /* synthetic */ void a(JDSGEPageableTable x0, int x1) {
        x0.a(x1);
    }

    static /* synthetic */ void b(JDSGEPageableTable x0) {
        x0.e();
    }
}

