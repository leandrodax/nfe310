/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.to.OrdenacaoTO
 */
package br.gov.sp.fazenda.dsge.common.to;

import java.util.LinkedHashMap;

public class OrdenacaoTO {
    private LinkedHashMap<String, Boolean> a;
    private int a = new LinkedHashMap();
    private int b;

    public void addSortColumn(String dbFieldName, Boolean isSortAsc, int start, int maxResults) {
        this.a.put(dbFieldName, isSortAsc);
        this.a = start;
        this.b = maxResults;
    }

    public int getMaxResults() {
        return this.b;
    }

    public void setMaxResults(int maxResults) {
        this.b = maxResults;
    }

    public LinkedHashMap<String, Boolean> getSortColumns() {
        return this.a;
    }

    public void setSortColumns(LinkedHashMap<String, Boolean> sortColumns) {
        this.a = sortColumns;
    }

    public int getStart() {
        return this.a;
    }

    public void setStart(int start) {
        this.a = start;
    }
}

