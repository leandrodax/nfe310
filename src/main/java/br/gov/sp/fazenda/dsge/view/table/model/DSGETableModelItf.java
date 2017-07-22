/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.view.table.model.DSGETableModelItf
 */
package br.gov.sp.fazenda.dsge.view.table.model;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import java.util.Comparator;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.event.CellEditorListener;
import javax.swing.text.DefaultFormatter;

public interface DSGETableModelItf<E extends BaseTO> {
    public void addColumn(int var1, String var2, String var3, boolean var4, String var5);

    public void addColumn(int var1, String var2, String var3, DefaultFormatter var4, boolean var5, String var6);

    public void addColumnComponent(int var1, String var2, JComponent var3, boolean var4, String var5);

    public void addTO(E var1);

    public void addTO(List<E> var1);

    public E getTO(int var1);

    public List<E> getAllTO();

    public List<E> getSelectedItens(int var1);

    public void removeTO(int var1);

    public void removeAllTO();

    public void removeTO(E var1);

    public void removeTO(List<E> var1);

    public boolean containsTO(E var1);

    public void markSelectedAllTO(int var1, Boolean var2);

    public void addCellEditorListener(int var1, CellEditorListener var2);

    public void removeCellEditorListener(int var1, CellEditorListener var2);

    public void setColumnEditable(int var1, boolean var2);

    public void sortTOs(Comparator<E> var1);
}

