/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.controller.TableSorter
 *  br.gov.sp.fazenda.dsen.controller.TableSorter$1
 *  br.gov.sp.fazenda.dsen.controller.TableSorter$2
 *  br.gov.sp.fazenda.dsen.controller.TableSorter$3
 *  br.gov.sp.fazenda.dsen.controller.TableSorter$Arrow
 *  br.gov.sp.fazenda.dsen.controller.TableSorter$Directive
 *  br.gov.sp.fazenda.dsen.controller.TableSorter$MouseHandler
 *  br.gov.sp.fazenda.dsen.controller.TableSorter$Row
 *  br.gov.sp.fazenda.dsen.controller.TableSorter$SortableHeaderRenderer
 *  br.gov.sp.fazenda.dsen.controller.TableSorter$TableModelHandler
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.controller.TableSorter;
import br.gov.sp.fazenda.dsge.view.table.JDSGETable;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.SwingUtilities;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public class TableSorter
implements TableModelListener {
    protected TableModel tableModel;
    private static final int a = -1;
    private static final int b = 0;
    private static final int c = 1;
    private static Directive a = new Directive(-1, 0);
    public static final Comparator COMPARABLE_COMAPRATOR = new /* Unavailable Anonymous Inner Class!! */;
    public static final Comparator LEXICAL_COMPARATOR = new /* Unavailable Anonymous Inner Class!! */;
    private Row[] a;
    private int[] a;
    private JTableHeader a;
    private MouseListener a;
    private TableModelListener a;
    private Map a;
    private List a = new ArrayList();

    public TableSorter() {
        this.a = new MouseHandler(this, null);
        this.a = new TableModelHandler(this, null);
    }

    public TableSorter(TableModel tableModel) {
        this.setTableModel(tableModel);
    }

    public TableSorter(TableModel tableModel, JTableHeader tableHeader) {
        this();
        this.setTableHeader(tableHeader);
        this.setTableModel(tableModel);
    }

    private void a() {
        this.a = null;
        this.a = null;
    }

    public TableModel getTableModel() {
        return this.tableModel;
    }

    public void setTableModel(TableModel tableModel) {
        if (this.tableModel != null) {
            this.tableModel.removeTableModelListener(this.a);
        }
        this.tableModel = tableModel;
        if (this.tableModel != null) {
            this.tableModel.addTableModelListener(this.a);
        }
        this.a();
    }

    public JTableHeader getTableHeader() {
        return this.a;
    }

    public void setTableHeader(JTableHeader tableHeader) {
        if (this.a != null) {
            this.a.removeMouseListener(this.a);
            TableCellRenderer defaultRenderer = this.a.getDefaultRenderer();
            if (defaultRenderer instanceof SortableHeaderRenderer) {
                this.a.setDefaultRenderer(SortableHeaderRenderer.a((SortableHeaderRenderer)((SortableHeaderRenderer)defaultRenderer)));
            }
        }
        this.a = tableHeader;
        if (this.a != null) {
            this.a.addMouseListener(this.a);
            this.a.setDefaultRenderer((TableCellRenderer)new SortableHeaderRenderer(this, this.a.getDefaultRenderer()));
        }
    }

    public boolean isSorting() {
        return this.a.size() != 0;
    }

    private Directive a(int column) {
        for (int i = 0; i < this.a.size(); ++i) {
            Directive directive = (Directive)this.a.get(i);
            if (Directive.a((Directive)directive) != column) continue;
            return directive;
        }
        return a;
    }

    public int getSortingStatus(int column) {
        return Directive.b((Directive)this.a(column));
    }

    private void b() {
        this.a();
        if (this.a != null) {
            this.a.repaint();
        }
    }

    public void setSortingStatus(int column, int status) {
        Directive directive = this.a(column);
        if (directive != a) {
            this.a.remove((Object)directive);
        }
        if (status != 0) {
            this.a.add(new Directive(column, status));
        }
        this.b();
    }

    protected Icon getHeaderRendererIcon(int column, int size) {
        Directive directive = this.a(column);
        if (directive == a) {
            return null;
        }
        return new Arrow(Directive.b((Directive)directive) == -1, size, this.a.indexOf((Object)directive));
    }

    private void c() {
        this.a.clear();
        this.b();
    }

    public void setColumnComparator(Class type, Comparator comparator) {
        if (comparator == null) {
            this.a.remove(type);
        } else {
            this.a.put(type, comparator);
        }
    }

    protected Comparator getComparator(int column) {
        Class columnType = this.tableModel.getColumnClass(column);
        Comparator comparator = (Comparator)this.a.get(columnType);
        if (comparator != null) {
            return comparator;
        }
        if (Comparable.class.isAssignableFrom(columnType)) {
            return COMPARABLE_COMAPRATOR;
        }
        return LEXICAL_COMPARATOR;
    }

    private Row[] a() {
        if (this.a == null) {
            int tableModelRowCount = this.tableModel.getRowCount();
            this.a = new Row[tableModelRowCount];
            for (int row = 0; row < tableModelRowCount; ++row) {
                this.a[row] = new Row(this, row);
            }
            if (this.isSorting()) {
                Arrays.sort(this.a);
            }
        }
        return this.a;
    }

    public int modelIndex(int viewIndex) {
        return Row.a((Row)this.a()[viewIndex]);
    }

    private int[] a() {
        if (this.a == null) {
            int n = this.a().length;
            this.a = new int[n];
            int i = 0;
            while (i < n) {
                this.a[this.modelIndex((int)i)] = i++;
            }
        }
        return this.a;
    }

    public int getRowCount() {
        return this.tableModel == null ? 0 : this.tableModel.getRowCount();
    }

    public int getColumnCount() {
        return this.tableModel == null ? 0 : this.tableModel.getColumnCount();
    }

    public String getColumnName(int column) {
        return this.tableModel.getColumnName(column);
    }

    public Class getColumnClass(int column) {
        return this.tableModel.getColumnClass(column);
    }

    public boolean isCellEditable(int row, int column) {
        return this.tableModel.isCellEditable(this.modelIndex(row), column);
    }

    public Object getValueAt(int row, int column) {
        return this.tableModel.getValueAt(this.modelIndex(row), column);
    }

    public void setValueAt(Object aValue, int row, int column) {
        this.tableModel.setValueAt(aValue, this.modelIndex(row), column);
    }

    @Override
    public void tableChanged(TableModelEvent e) {
    }

    public void setEmitenteTOList(List lista, JDSGETable tblResultado) {
        SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
    }

    static /* synthetic */ List a(TableSorter x0) {
        return x0.a;
    }

    static /* synthetic */ void a(TableSorter x0) {
        x0.a();
    }

    static /* synthetic */ void b(TableSorter x0) {
        x0.c();
    }

    static /* synthetic */ int[] a(TableSorter x0) {
        return x0.a;
    }

    static /* synthetic */ int[] b(TableSorter x0) {
        return x0.a();
    }

    static {
    }
}

