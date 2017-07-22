/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.view.table.JTableComponentRenderer
 */
package br.gov.sp.fazenda.dsge.view.table;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class JTableComponentRenderer
implements TableCellRenderer {
    private TableCellRenderer a;

    public JTableComponentRenderer(TableCellRenderer renderer) {
        this.a = renderer;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (value instanceof Component) {
            return (Component)value;
        }
        return this.a.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}

