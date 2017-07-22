/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.view.table.model.DSGETableModel
 *  br.gov.sp.fazenda.dsge.view.table.model.DSGETableModelItf
 */
package br.gov.sp.fazenda.dsge.view.table.model;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.view.table.model.DSGETableModelItf;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.table.AbstractTableModel;
import javax.swing.text.DefaultFormatter;

public class DSGETableModel<E extends BaseTO>
extends AbstractTableModel
implements DSGETableModelItf<E> {
    private List<E> a;
    private List<Object[]> b = new ArrayList();
    private List<Boolean> c = new ArrayList();
    private Map<Integer, List<CellEditorListener>> a = new HashMap();

    public String getFieldName(int columnIndex) {
        String fieldName = null;
        Object[] column = (Object[])this.b.get(columnIndex);
        if (column != null) {
            fieldName = column[1].toString();
        }
        return fieldName;
    }

    public String getDBFieldName(int columnIndex) {
        String fieldName = null;
        Object[] column = (Object[])this.b.get(columnIndex);
        if (column != null) {
            fieldName = column[4].toString();
        }
        return fieldName;
    }

    private String a(Object value, DefaultFormatter formatter) {
        String valueString = null;
        try {
            Class valueClass = formatter.getValueClass();
            Object valueObj = value;
            if (valueClass != null) {
                try {
                    Constructor constructor = valueClass.getConstructor(String.class);
                    valueObj = constructor.newInstance(value.toString());
                }
                catch (SecurityException ex) {
                    ex.printStackTrace();
                }
                catch (NoSuchMethodException ex) {
                    ex.printStackTrace();
                }
                catch (IllegalArgumentException ex) {
                    ex.printStackTrace();
                }
                catch (InvocationTargetException ex) {
                    ex.printStackTrace();
                }
                catch (IllegalAccessException ex) {
                    ex.printStackTrace();
                }
                catch (InstantiationException ex) {
                    ex.printStackTrace();
                }
            }
            valueString = formatter.valueToString(valueObj);
        }
        catch (ParseException ex) {
            ex.printStackTrace();
        }
        return valueString;
    }

    @Override
    public int getRowCount() {
        return this.a.size();
    }

    @Override
    public int getColumnCount() {
        return this.b.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object value = null;
        String columnName = this.getFieldName(columnIndex);
        Object[] column = (Object[])this.b.get(columnIndex);
        if (columnName != null && !columnName.equals("component")) {
            BaseTO to = (BaseTO)this.a.get(rowIndex);
            if (to != null) {
                value = to.getValueAt(columnName);
                if (column[2] != null && !StringHelper.isBlankOrNull((Object)value)) {
                    DefaultFormatter formatter = (DefaultFormatter)column[2];
                    value = this.a(value, formatter);
                }
            }
        } else {
            value = column[3];
        }
        return value;
    }

    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        String columnName = this.getFieldName(columnIndex);
        BaseTO to = (BaseTO)this.a.get(rowIndex);
        if (to != null && !columnName.equals("component")) {
            to.setValueAt(columnName, value);
        }
        this.fireTableCellUpdated(rowIndex, columnIndex);
        this.a(value, columnIndex);
    }

    private void a(Object value, int columnIndex) {
        List listenerList = (List)this.a.get(new Integer(columnIndex));
        if (listenerList != null) {
            for (CellEditorListener listener : listenerList) {
                if (listener == null) continue;
                ChangeEvent evt = new ChangeEvent(value);
                listener.editingStopped(evt);
            }
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        Boolean editable = (Boolean)this.c.get(columnIndex);
        boolean isEditable = false;
        if (editable != null) {
            isEditable = editable;
        }
        return isEditable;
    }

    public void addColumn(int columnIndex, String fieldName, String columnName, boolean editable, String dbColumn) {
        this.addColumn(columnIndex, fieldName, columnName, null, editable, dbColumn);
    }

    public void addTO(E to) {
        this.a.add(to);
        this.fireTableDataChanged();
    }

    public void addTO(List<E> lista) {
        this.a.addAll(lista);
        this.fireTableDataChanged();
    }

    public E getTO(int rowIndex) {
        return (E)((BaseTO)this.a.get(rowIndex));
    }

    public List<E> getAllTO() {
        return new ArrayList(this.a);
    }

    public void sortTOs(Comparator<E> comparator) {
        Collections.sort(this.a, comparator);
        this.fireTableDataChanged();
    }

    public List<E> getSelectedItens(int columnIndex) {
        ArrayList<BaseTO> lista = new ArrayList<BaseTO>();
        String columnName = this.getFieldName(columnIndex);
        for (int i = 0; i < this.a.size(); ++i) {
            BaseTO to = (BaseTO)this.a.get(i);
            Object value = to.getValueAt(columnName);
            if (value == null || !(value instanceof Boolean) || !((Boolean)value).booleanValue()) continue;
            lista.add(to);
        }
        return lista;
    }

    public void removeTO(int rowIndex) {
        this.a.remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }

    public void removeAllTO() {
        int rowCount = this.getRowCount();
        this.a.clear();
        if (rowCount > 0) {
            this.fireTableRowsDeleted(0, rowCount - 1);
        }
    }

    public boolean containsTO(E to) {
        return this.a.contains(to);
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columnName = null;
        Object[] column = (Object[])this.b.get(columnIndex);
        if (column != null) {
            columnName = column[0].toString();
        }
        return columnName;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        String fieldName = this.getFieldName(columnIndex);
        Object[] column = (Object[])this.b.get(columnIndex);
        BaseTO to = null;
        Class classType = null;
        if (!this.a.isEmpty()) {
            to = (BaseTO)this.a.get(0);
            if (to != null) {
                classType = to.getFieldType(fieldName);
                if (classType.isPrimitive()) {
                    classType = this.a(classType);
                }
            } else {
                classType = super.getColumnClass(columnIndex);
            }
        }
        if (column[2] != null) {
            classType = String.class;
        }
        if (column[3] != null) {
            classType = column[3].getClass();
        }
        return classType;
    }

    private Class<?> a(Class<?> classType) {
        if (classType == null || classType.equals(Void.TYPE)) {
            return Object.class;
        }
        if (classType.equals(Integer.TYPE)) {
            return Integer.class;
        }
        if (classType.equals(Boolean.TYPE)) {
            return Boolean.class;
        }
        if (classType.equals(Short.TYPE)) {
            return Short.class;
        }
        if (classType.equals(Long.TYPE)) {
            return Long.class;
        }
        if (classType.equals(Float.TYPE)) {
            return Float.class;
        }
        if (classType.equals(Double.TYPE)) {
            return Double.class;
        }
        if (classType.equals(Character.TYPE)) {
            return Character.class;
        }
        if (classType.equals(Byte.TYPE)) {
            return Byte.class;
        }
        return Object.class;
    }

    public void markSelectedAllTO(int columnIndex, Boolean selected) {
        if (this.a != null) {
            String columnName = this.getFieldName(columnIndex);
            for (int i = 0; i < this.a.size(); ++i) {
                BaseTO to = (BaseTO)this.a.get(i);
                to.setValueAt(columnName, (Object)selected);
            }
        }
        this.fireTableDataChanged();
        this.a((Object)new Integer(columnIndex), columnIndex);
    }

    public void addCellEditorListener(int columnIndex, CellEditorListener listener) {
        ArrayList<CellEditorListener> listenerList = (ArrayList<CellEditorListener>)this.a.get(new Integer(columnIndex));
        if (listenerList == null) {
            listenerList = new ArrayList<CellEditorListener>();
            this.a.put(new Integer(columnIndex), listenerList);
        }
        listenerList.add(new Integer(columnIndex), listener);
    }

    public void removeTO(E to) {
        this.a.remove(to);
        this.fireTableRowsDeleted(0, 0);
    }

    public void removeTO(List<E> lista) {
        this.a.removeAll(lista);
        this.fireTableRowsDeleted(0, 0);
    }

    public void addColumn(int columnIndex, String fieldName, String columnName, DefaultFormatter formatter, boolean editable, String dbColumn) {
        Object[] column = new Object[]{columnName, fieldName, formatter, null, dbColumn};
        this.b.add(columnIndex, column);
        this.c.add(columnIndex, editable);
        this.fireTableStructureChanged();
    }

    public void removeCellEditorListener(int columnIndex, CellEditorListener listener) {
        List cellEditorListenerList = (List)this.a.get(new Integer(columnIndex));
        if (cellEditorListenerList == null || cellEditorListenerList.isEmpty()) {
            return;
        }
        cellEditorListenerList.remove(listener);
        if (cellEditorListenerList.isEmpty()) {
            this.a.remove(new Integer(columnIndex));
        }
    }

    public void addColumnComponent(int columnIndex, String columnName, JComponent component, boolean editable, String dbColumn) {
        Object[] column = new Object[]{columnName, "component", null, component, dbColumn};
        this.b.add(columnIndex, column);
        this.c.add(columnIndex, editable);
        this.fireTableStructureChanged();
    }

    public void setColumnEditable(int column, boolean editable) {
        this.c.set(column, editable);
    }
}

