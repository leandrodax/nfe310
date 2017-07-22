/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.controller.DSGESystemController
 *  br.gov.sp.fazenda.dsge.controller.DSGESystemController$1
 *  br.gov.sp.fazenda.dsge.controller.DSGESystemController$2
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGEDAOHelper
 *  br.gov.sp.fazenda.dsge.model.database.util.DSGENetworkServerManager
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEControllerException
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 */
package br.gov.sp.fazenda.dsge.controller;

import br.gov.sp.fazenda.dsge.controller.DSGESystemController;
import br.gov.sp.fazenda.dsge.model.dao.util.DSGEDAOHelper;
import br.gov.sp.fazenda.dsge.model.database.util.DSGENetworkServerManager;
import br.gov.sp.fazenda.dsge.view.exception.DSGEControllerException;
import java.io.File;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class DSGESystemController<T> {
    private static FileLock a;
    private static boolean a;
    private static boolean b;
    private static Object a;
    private static Log a;

    public abstract DSGENetworkServerManager getNetworkServerManager() throws Exception;

    public abstract DSGEDAOHelper getDAOHelper();

    protected abstract String getFileLockName();

    protected abstract String getFileLockMessage();

    protected abstract void execAfterStartApp() throws Exception;

    protected void verificaInstanciasAplicacao() throws Exception {
        FileChannel channel;
        String currentdir = System.getProperty("java.io.tmpdir");
        File f = new File(currentdir + "/" + this.getFileLockName());
        if (!f.exists()) {
            f.createNewFile();
        }
        if ((DSGESystemController.a = (channel = new RandomAccessFile(f, "rw").getChannel()).tryLock()) == null) {
            throw new DSGEControllerException((Throwable)new Exception(this.getFileLockMessage()), this.getFileLockMessage());
        }
        System.out.println("Arquivo de lock em " + f.getAbsolutePath());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void startApp() throws Exception {
        this.verificaInstanciasAplicacao();
        new /* Unavailable Anonymous Inner Class!! */.start();
        new /* Unavailable Anonymous Inner Class!! */.start();
        Object object = a;
        synchronized (object) {
            while (!b || !a) {
                try {
                    a.wait();
                }
                catch (InterruptedException interruptedException) {}
            }
        }
        this.execAfterStartApp();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void stopApp() throws Exception {
        try {
            this.getDAOHelper();
            DSGEDAOHelper.closeSession();
            this.getDAOHelper();
            DSGEDAOHelper.closeFactory();
            this.getNetworkServerManager().stopNetworkServer();
        }
        finally {
            if (a != null) {
                a.release();
            }
        }
    }

    public static synchronized <T> T getInstance(Class<T> pInstance) {
        if (a == null) {
            try {
                a = pInstance.newInstance();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (T)a;
    }

    static /* synthetic */ Log a() {
        return a;
    }

    static /* synthetic */ boolean a(boolean x0) {
        b = x0;
        return b;
    }

    static /* synthetic */ Object a() {
        return a;
    }

    static /* synthetic */ boolean b(boolean x0) {
        a = x0;
        return a;
    }

    static {
        a = false;
        b = false;
        a = LogFactory.getLog(DSGESystemController.class);
    }
}

