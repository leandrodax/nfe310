/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.report.data.page.Page
 */
package br.gov.sp.fazenda.dsge.report.data.page;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Page
implements Serializable {
    public static final Page EMPTY_PAGE = new Page(Collections.EMPTY_LIST, 0, false);
    private List a;
    private int a;
    private boolean a;

    public Page(List list, int start, boolean hasNext) {
        this.a = new ArrayList(list);
        this.a = start;
        this.a = hasNext;
    }

    public List getList() {
        return this.a;
    }

    public boolean isNextPageAvailable() {
        return this.a;
    }

    public boolean isPreviousPageAvailable() {
        return this.a > 0;
    }

    public int getStartOfNextPage() {
        return this.a + this.a.size();
    }

    public int getStartOfPreviousPage() {
        return Math.max(this.a - this.a.size(), 0);
    }

    public int getSize() {
        return this.a.size();
    }
}

