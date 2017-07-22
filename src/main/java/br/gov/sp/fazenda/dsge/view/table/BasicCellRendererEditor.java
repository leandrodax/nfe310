/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.view.table.BasicCellRendererEditor
 */
package br.gov.sp.fazenda.dsge.view.table;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.EventListener;
import java.util.EventObject;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.EventListenerList;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public abstract class BasicCellRendererEditor
implements PropertyChangeListener,
TableCellEditor,
TableCellRenderer {
    private Color a;
    private Color b;
    protected static ChangeEvent changeEvent;
    protected JComponent editor;
    protected JComponent renderer;
    protected EventListenerList listeners = new EventListenerList();
    protected EventObject editingEvent;

    public BasicCellRendererEditor() {
        this.editor = null;
    }

    public BasicCellRendererEditor(JComponent editor, JComponent renderer) {
        this.editor = editor;
        this.renderer = renderer;
        editor.addPropertyChangeListener((PropertyChangeListener)this);
    }

    @Override
    public abstract Object getCellEditorValue();

    @Override
    public boolean isCellEditable(EventObject evt) {
        this.editingEvent = evt;
        return true;
    }

    @Override
    public boolean shouldSelectCell(EventObject evt) {
        return true;
    }

    @Override
    public boolean stopCellEditing() {
        this.fireEditingStopped();
        return true;
    }

    @Override
    public void cancelCellEditing() {
        this.fireEditingCanceled();
    }

    @Override
    public void addCellEditorListener(CellEditorListener l) {
        this.listeners.add(CellEditorListener.class, l);
    }

    @Override
    public void removeCellEditorListener(CellEditorListener l) {
        this.listeners.remove(CellEditorListener.class, l);
    }

    public JComponent getRendererComponent() {
        return this.renderer;
    }

    public JComponent getEditorComponent() {
        this.editor.setBorder(new LineBorder(Color.black));
        return this.editor;
    }

    protected void setEditorComponent(JComponent comp) {
        this.editor = comp;
    }

    protected void setRendererComponent(JComponent comp) {
        this.renderer = comp;
    }

    public EventObject getEditingEvent() {
        return this.editingEvent;
    }

    public void editingStarted(EventObject event) {
    }

    public CellEditorListener[] getCellEditorListeners() {
        EventListener[] events = this.listeners.getListeners(CellEditorListener.class);
        CellEditorListener[] editorListeners = new CellEditorListener[events.length];
        for (int i = 0; i < events.length; ++i) {
            editorListeners[i] = (CellEditorListener)events[i];
        }
        return editorListeners;
    }

    protected void fireEditingStopped() {
        Object[] l = this.listeners.getListenerList();
        for (int i = l.length - 2; i >= 0; i -= 2) {
            if (l[i] != CellEditorListener.class) continue;
            if (changeEvent == null) {
                changeEvent = new ChangeEvent((Object)this);
            }
            ((CellEditorListener)l[i + 1]).editingStopped(changeEvent);
        }
    }

    protected void fireEditingCanceled() {
        Object[] l = this.listeners.getListenerList();
        for (int i = l.length - 2; i >= 0; i -= 2) {
            if (l[i] != CellEditorListener.class) continue;
            if (changeEvent == null) {
                changeEvent = new ChangeEvent((Object)this);
            }
            ((CellEditorListener)l[i + 1]).editingCanceled(changeEvent);
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("ancestor") && evt.getNewValue() != null) {
            this.editingStarted(this.editingEvent);
        }
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JComponent renderer = this.getRendererComponent();
        if (isSelected) {
            renderer.setForeground(table.getSelectionForeground());
            renderer.setBackground(table.getSelectionBackground());
        } else {
            renderer.setForeground(this.a != null ? this.a : table.getForeground());
            renderer.setBackground(this.b != null ? this.b : table.getBackground());
        }
        renderer.setFont(table.getFont());
        if (hasFocus) {
            renderer.setBorder(UIManager.getBorder("Table.focusCellHighlightBorder"));
            renderer.requestFocus();
            if (table.isCellEditable(row, column)) {
                renderer.setForeground(UIManager.getColor("Table.focusCellForeground"));
                renderer.setBackground(UIManager.getColor("Table.focusCellBackground"));
            }
        } else {
            EmptyBorder noFocusBorder = new EmptyBorder(1, 1, 1, 1);
            renderer.setBorder(noFocusBorder);
        }
        return renderer;
    }
}

