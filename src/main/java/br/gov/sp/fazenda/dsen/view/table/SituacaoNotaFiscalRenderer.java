/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.view.table.SituacaoNotaFiscalRenderer
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 */
package br.gov.sp.fazenda.dsen.view.table;

import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.view.table.JDSGETable;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class SituacaoNotaFiscalRenderer
extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        JDSGETable dsenTable = (JDSGETable)table;
        NotaFiscalTO notaFiscalTO = (NotaFiscalTO)dsenTable.getTO(row);
        if (notaFiscalTO != null) {
            if (notaFiscalTO.getSituacao().equals((Object)SituacaoNFeEnum.REJEITADA)) {
                component.setForeground(Color.RED);
                Font fonte = new Font(component.getFont().getName(), 1, component.getFont().getSize());
                component.setFont(fonte);
            } else {
                component.setForeground(table.getForeground());
            }
        }
        return component;
    }
}

