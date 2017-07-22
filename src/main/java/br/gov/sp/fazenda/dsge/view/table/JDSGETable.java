/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.view.table.AutofitTableColumns
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable$1
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable$TableRowClickListener
 *  br.gov.sp.fazenda.dsge.view.table.model.DSGETableModel
 *  br.gov.sp.fazenda.dsge.view.table.model.DSGETableModelItf
 */
package br.gov.sp.fazenda.dsge.view.table;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.view.table.AutofitTableColumns;
import br.gov.sp.fazenda.dsge.view.table.JDSGETable;
import br.gov.sp.fazenda.dsge.view.table.model.DSGETableModel;
import br.gov.sp.fazenda.dsge.view.table.model.DSGETableModelItf;
import java.awt.Component;
import java.awt.event.ComponentListener;
import java.awt.event.MouseListener;
import java.util.Comparator;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.CellEditorListener;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.text.DefaultFormatter;

public class JDSGETable<E extends BaseTO>
extends JTable {
    public JDSGETable() {
        this.setModel((TableModel)new DSGETableModel());
        this.getSelectionModel().setSelectionMode(0);
        this.getTableHeader().setReorderingAllowed(false);
        this.addMouseListener((MouseListener)new TableRowClickListener(this));
    }

    public void setAutoFitTableColumns(boolean fit) {
        if (fit) {
            this.setAutoResizeMode(0);
        } else {
            this.setAutoResizeMode(2);
        }
    }

    public void fitTableColumns() {
        if (this.getAutoResizeMode() == 0) {
            AutofitTableColumns.autoResizeTable((JTable)this, (boolean)true);
        }
    }

    public void setScrollPane(JScrollPane scroll) {
        scroll.setViewportView((Component)this);
        scroll.addComponentListener((ComponentListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private DSGETableModelItf<E> a() {
        return (DSGETableModelItf)this.getModel();
    }

    public void addColumn(int columnIndex, String fieldName, String columnName, boolean editable, String dbColumn) {
        this.a().addColumn(columnIndex, fieldName, columnName, editable, dbColumn);
    }

    public void addColumn(int columnIndex, String fieldName, String columnName, boolean editable) {
        this.a().addColumn(columnIndex, fieldName, columnName, editable, null);
    }

    public void addColumn(int columnIndex, String fieldName, String columnName, DefaultFormatter formatter, boolean editable, String dbColumn) {
        this.a().addColumn(columnIndex, fieldName, columnName, formatter, editable, dbColumn);
    }

    public void addColumn(int columnIndex, String fieldName, String columnName, DefaultFormatter formatter, boolean editable) {
        this.a().addColumn(columnIndex, fieldName, columnName, formatter, editable, null);
    }

    public void addColumnComponent(int columnIndex, String columnName, JComponent component, boolean editable, String dbColumn) {
        this.a().addColumnComponent(columnIndex, columnName, component, editable, dbColumn);
    }

    public void addTO(E to) {
        this.a().addTO(to);
        this.fitTableColumns();
    }

    public void addTO(List<E> listaTO) {
        if (listaTO == null) {
            return;
        }
        this.a().addTO(listaTO);
        this.fitTableColumns();
    }

    public E getTO(int rowIndex) {
        return (E)this.a().getTO(rowIndex);
    }

    public List<E> getAllTO() {
        return this.a().getAllTO();
    }

    public void sortTOs(Comparator<E> comparator) {
        this.a().sortTOs(comparator);
    }

    public List<E> getSelectedTOs() {
        return this.getSelectedItens(0);
    }

    public void removeTO(int rowIndex) {
        this.a().removeTO(rowIndex);
        this.fitTableColumns();
    }

    public void removeAllTO() {
        this.a().removeAllTO();
        this.fitTableColumns();
    }

    public boolean containsTO(E to) {
        return this.a().containsTO(to);
    }

    @Override
    public String getColumnName(int columnIndex) {
        return this.getModel().getColumnName(columnIndex);
    }

    public List<E> getSelectedItens(int columnIndex) {
        return this.a().getSelectedItens(columnIndex);
    }

    public void markSelectedAllTO(int columnIndex, Boolean selected) {
        this.a().markSelectedAllTO(columnIndex, selected);
    }

    public void addCellEditorListener(int columnIndex, CellEditorListener listener) {
        this.a().addCellEditorListener(columnIndex, listener);
    }

    public void removeCellEditorListener(int columnIndex, CellEditorListener listener) {
        this.a().removeCellEditorListener(columnIndex, listener);
    }

    public void removeTO(E to) {
        this.a().removeTO(to);
        this.fitTableColumns();
    }

    public void removeTO(List<E> lista) {
        if (lista == null) {
            return;
        }
        this.a().removeTO(lista);
        this.fitTableColumns();
    }

    public void setColumnEditable(int column, boolean editable) {
        this.a().setColumnEditable(column, editable);
    }
}

