/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.view.table.AutofitTableColumns
 */
package br.gov.sp.fazenda.dsge.view.table;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.text.JTextComponent;

/*
 * Exception performing whole class analysis ignored.
 */
public class AutofitTableColumns {
    private static final int a = 5;

    public AutofitTableColumns() {
    }

    public static int autoResizeTable(JTable aTable, boolean includeColumnHeaderWidth) {
        return AutofitTableColumns.autoResizeTable((JTable)aTable, (boolean)includeColumnHeaderWidth, (int)5);
    }

    public static int autoResizeTable(JTable aTable, boolean includeColumnHeaderWidth, int columnPadding) {
        Container topLevelAncestor = aTable.getTopLevelAncestor();
        if (topLevelAncestor != null && !topLevelAncestor.isValid()) {
            topLevelAncestor.validate();
        }
        int columnCount = aTable.getColumnCount();
        int tableWidth = 0;
        if (columnCount > 0) {
            int[] columnWidth = new int[columnCount];
            for (int i = 0; i < columnCount; ++i) {
                columnWidth[i] = AutofitTableColumns.a((JTable)aTable, (int)i, (boolean)true, (int)columnPadding);
                tableWidth += columnWidth[i];
            }
            int parentWidth = aTable.getParent().getWidth();
            int blankSpace = parentWidth > tableWidth ? parentWidth - tableWidth : 0;
            int blankSpacePerColumn = blankSpace / columnWidth.length;
            int roudingError = blankSpace - blankSpacePerColumn * columnWidth.length;
            tableWidth += blankSpace;
            for (int i = 0; i < columnCount; ++i) {
                columnWidth[i] = columnWidth[i] + blankSpacePerColumn + (i == columnCount - 1 ? roudingError : 0);
            }
            TableColumnModel tableColumnModel = aTable.getColumnModel();
            for (int i = 0; i < columnCount; ++i) {
                TableColumn tableColumn = tableColumnModel.getColumn(i);
                tableColumn.setMinWidth(columnWidth[i]);
                tableColumn.setPreferredWidth(columnWidth[i]);
                tableColumn.setMaxWidth(columnWidth[i]);
                tableColumn.setWidth(columnWidth[i]);
            }
            JTableHeader tableHeader = aTable.getTableHeader();
            Dimension headerDim = tableHeader.getPreferredSize();
            headerDim.width = tableWidth;
            tableHeader.setPreferredSize(headerDim);
            int tableHeight = aTable.getRowCount() * aTable.getRowHeight();
            Dimension dim = aTable.getPreferredSize();
            dim.width = tableWidth;
            dim.height = tableHeight;
            aTable.setPreferredSize(dim);
            aTable.setMaximumSize(dim);
            aTable.setMinimumSize(dim);
            aTable.revalidate();
        }
        return tableWidth;
    }

    private static int a(JTable aTable, int columnNo, boolean includeColumnHeaderWidth, int columnPadding) {
        TableColumn column = aTable.getColumnModel().getColumn(columnNo);
        Component comp = null;
        int maxWidth = 0;
        if (includeColumnHeaderWidth) {
            Font font;
            FontMetrics fontMetrics;
            TableCellRenderer headerRenderer = column.getHeaderRenderer();
            if (headerRenderer != null) {
                comp = headerRenderer.getTableCellRendererComponent(aTable, column.getHeaderValue(), false, false, 0, columnNo);
                if (comp instanceof JTextComponent) {
                    JTextComponent jtextComp = (JTextComponent)comp;
                    String text = jtextComp.getText();
                    font = jtextComp.getFont();
                    fontMetrics = jtextComp.getFontMetrics(font);
                    maxWidth = SwingUtilities.computeStringWidth(fontMetrics, text);
                } else {
                    maxWidth = comp.getPreferredSize().width;
                }
            } else {
                try {
                    String headerText = (String)column.getHeaderValue();
                    JLabel defaultLabel = new JLabel(headerText);
                    font = defaultLabel.getFont();
                    fontMetrics = defaultLabel.getFontMetrics(font);
                    maxWidth = SwingUtilities.computeStringWidth(fontMetrics, headerText);
                }
                catch (ClassCastException ce) {
                    maxWidth = 0;
                }
            }
        }
        int cellWidth = 0;
        for (int i = 0; i < aTable.getRowCount(); ++i) {
            TableCellRenderer tableCellRenderer = aTable.getCellRenderer(i, columnNo);
            if (tableCellRenderer == null) continue;
            comp = tableCellRenderer.getTableCellRendererComponent(aTable, aTable.getValueAt(i, columnNo), false, false, i, columnNo);
            if (comp instanceof JTextComponent) {
                JTextComponent jtextComp = (JTextComponent)comp;
                String text = jtextComp.getText();
                Font font = jtextComp.getFont();
                FontMetrics fontMetrics = jtextComp.getFontMetrics(font);
                int textWidth = SwingUtilities.computeStringWidth(fontMetrics, text);
                maxWidth = Math.max(maxWidth, textWidth);
                continue;
            }
            cellWidth = comp.getPreferredSize().width;
            maxWidth = Math.max(maxWidth, cellWidth);
        }
        return maxWidth + columnPadding;
    }
}

