/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.app.Observable
 *  br.gov.sp.fazenda.dsge.common.app.Observer
 *  br.gov.sp.fazenda.dsge.common.app.Subject
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 */
package br.gov.sp.fazenda.dsge.common.app;

import br.gov.sp.fazenda.dsge.common.app.Observer;
import br.gov.sp.fazenda.dsge.common.app.Subject;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Observable
implements Subject {
    Map<Observer, List<EnumItf>> a = Collections.synchronizedMap(new HashMap());

    public void remove(Observer o) {
        this.a.remove((Object)o);
    }

    public /* varargs */ void notificar(Object data, EnumItf ... appContexEnum) {
        for (EnumItf enum1 : appContexEnum) {
            for (Map.Entry pairs : this.a.entrySet()) {
                List li = (List)pairs.getValue();
                for (EnumItf itf : li) {
                    if (!itf.equals((Object)enum1)) continue;
                    try {
                        ((Observer)pairs.getKey()).update(data, enum1);
                    }
                    catch (Throwable t) {
                        System.out.println("-----------------------------------------------------------------------------------------------------------");
                        System.out.println("OBSERVABLE THROWS NEW EXCEPTION IN UPDATE METHOD OF CLASS '" + pairs.getKey().getClass().getName() + "' AND ENUMITF '" + itf.toString() + "':");
                        t.printStackTrace();
                        System.out.println("-----------------------------------------------------------------------------------------------------------");
                    }
                }
            }
        }
    }

    public /* varargs */ void register(Observer o, EnumItf ... enumItf) {
        this.a.put(o, Arrays.asList(enumItf));
    }
}

