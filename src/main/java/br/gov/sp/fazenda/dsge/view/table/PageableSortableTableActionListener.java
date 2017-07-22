/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener
 */
package br.gov.sp.fazenda.dsge.view.table;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import java.util.EventListener;

public interface PageableSortableTableActionListener<E extends BaseTO>
extends EventListener {
    public void sortColumnChanged(JDSGEPageableTable<E> var1);

    public void pageChanged(JDSGEPageableTable<E> var1);
}

