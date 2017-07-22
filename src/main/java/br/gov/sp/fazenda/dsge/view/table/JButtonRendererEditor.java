/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.view.table.BasicCellRendererEditor
 *  br.gov.sp.fazenda.dsge.view.table.JButtonRendererEditor
 */
package br.gov.sp.fazenda.dsge.view.table;

import br.gov.sp.fazenda.dsge.view.table.BasicCellRendererEditor;
import java.awt.Component;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTable;

public class JButtonRendererEditor
extends BasicCellRendererEditor {
    private ActionListener a;

    public Object getCellEditorValue() {
        return null;
    }

    public void setActionListener(ActionListener listener) {
        this.a = listener;
    }

    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        JButton btn = (JButton)value;
        JButton btnEditor = new JButton();
        this.setEditorComponent((JComponent)btnEditor);
        btnEditor.setText(btn.getText());
        btnEditor.setIcon(btn.getIcon());
        btnEditor.addActionListener(this.a);
        btnEditor.setActionCommand(btn.getActionCommand());
        return btnEditor;
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JButton btn = (JButton)value;
        this.setRendererComponent((JComponent)btn);
        return btn;
    }
}

