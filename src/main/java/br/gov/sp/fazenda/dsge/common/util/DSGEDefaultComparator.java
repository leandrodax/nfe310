/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.util.DSGEDefaultComparator
 *  br.gov.sp.fazenda.dsge.common.util.ReflectionHelper
 *  org.apache.log4j.Logger
 */
package br.gov.sp.fazenda.dsge.common.util;

import br.gov.sp.fazenda.dsge.common.util.ReflectionHelper;
import java.util.Comparator;
import org.apache.log4j.Logger;

public class DSGEDefaultComparator<T>
implements Comparator<T> {
    private String a;
    private boolean a;
    Logger a = Logger.getLogger(DSGEDefaultComparator.class);

    public DSGEDefaultComparator(String fieldName, boolean asc) {
        this.a = fieldName;
        this.a = asc;
    }

    @Override
    public int compare(T o1, T o2) {
        try {
            Object p1 = ReflectionHelper.getFieldByReflection(o1, (String)this.a);
            Object p2 = ReflectionHelper.getFieldByReflection(o2, (String)this.a);
            if (!this.a) {
                Object aux = p1;
                p1 = p2;
                p2 = aux;
            }
            if (p1 == null && p2 == null) {
                return 0;
            }
            if (p1 == null && p2 != null) {
                return -1;
            }
            if (p1 != null && p2 == null) {
                return 1;
            }
            if (p1 instanceof Comparable && p2 instanceof Comparable) {
                return ((Comparable)p1).compareTo((Comparable)p2);
            }
            return p1.toString().compareTo(p2.toString());
        }
        catch (Exception e) {
            this.a.error((Object)"Default Comparable error ", (Throwable)e);
            return 0;
        }
    }
}

