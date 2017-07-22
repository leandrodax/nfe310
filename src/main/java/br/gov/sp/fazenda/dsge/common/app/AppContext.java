/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsge.common.app;

import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import java.util.HashMap;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class AppContext {
    private static AppContext a = null;
    private Map<EnumItf, BaseTO> a;
    private Map<EnumItf, Object> b = new HashMap();
    private boolean a;
    private int a = new HashMap();

    private AppContext() {
    }

    public static synchronized AppContext getInstance() {
        if (a == null) {
            a = new AppContext();
        }
        return a;
    }

    public static void destroyInstance() {
        a = null;
    }

    public synchronized void setTO(EnumItf appContexEnum, BaseTO baseTO) {
        this.a.put(appContexEnum, baseTO);
        Notificador.getInstance().notificar((Object)baseTO, new EnumItf[]{appContexEnum});
    }

    public boolean isBuscaRetornoSEFAZRunning() {
        return this.a;
    }

    public synchronized void setBuscaRetornoSEFAZRunning(EnumItf appContexEnum, Boolean buscaRetornoRunning) {
        this.a = buscaRetornoRunning;
        Notificador.getInstance().notificar((Object)this.a, new EnumItf[]{appContexEnum});
    }

    public <T extends BaseTO> T getTO(EnumItf appContexEnum, Class<T> t) {
        BaseTO to = null;
        try {
            to = (BaseTO)this.a.get((Object)appContexEnum);
            if (to != null) {
                to = (BaseTO)to.clone();
            }
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (T)to;
    }

    public void setDBConnectionPort(int port) {
        this.a = port;
    }

    public int getDBConnectionPort() {
        return this.a;
    }

    public void setContextParameter(EnumItf appContextEnum, Object parameter) {
        this.b.put(appContextEnum, parameter);
    }

    public <T> T getContextParameter(EnumItf appContextEnum, Class<T> type) {
        return (T)this.b.get((Object)appContextEnum);
    }

    public void removeContextParameter(EnumItf appContextEnum) {
        this.b.remove((Object)appContextEnum);
    }
}

