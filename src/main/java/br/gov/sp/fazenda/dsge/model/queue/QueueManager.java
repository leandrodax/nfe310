/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.model.queue.QueueEventEnum
 *  br.gov.sp.fazenda.dsge.model.queue.QueueListener
 *  br.gov.sp.fazenda.dsge.model.queue.QueueManager
 *  br.gov.sp.fazenda.dsge.model.queue.QueueManager$1
 *  br.gov.sp.fazenda.dsge.model.queue.QueueManager$2
 *  br.gov.sp.fazenda.dsge.model.queue.QueueManager$3
 *  br.gov.sp.fazenda.dsge.model.queue.QueueManager$4
 *  br.gov.sp.fazenda.dsge.model.queue.QueueManager$5
 *  br.gov.sp.fazenda.dsge.model.queue.QueueRetornoItem
 *  br.gov.sp.fazenda.dsge.model.queue.QueueSender
 *  br.gov.sp.fazenda.dsge.model.queue.QueueSenderImpl
 */
package br.gov.sp.fazenda.dsge.model.queue;

import br.gov.sp.fazenda.dsge.model.queue.QueueEventEnum;
import br.gov.sp.fazenda.dsge.model.queue.QueueListener;
import br.gov.sp.fazenda.dsge.model.queue.QueueManager;
import br.gov.sp.fazenda.dsge.model.queue.QueueRetornoItem;
import br.gov.sp.fazenda.dsge.model.queue.QueueSender;
import br.gov.sp.fazenda.dsge.model.queue.QueueSenderImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public class QueueManager<T extends QueueRetornoItem>
extends Thread
implements Runnable {
    private static Logger a = Logger.getLogger(QueueManager.class.getName());
    private static final int a = 1000;
    private static final int b = 150;
    private List<T> a;
    private boolean a;
    private static final Object a = new Object();
    private static QueueManager<? extends QueueRetornoItem> a;
    private boolean b;
    private QueueSender a;
    private List<QueueListener<T>> b;
    private int c;
    private int d;

    private QueueManager(Class<T> t) {
        this.a = Collections.synchronizedList(new LinkedList());
        this.a = false;
        this.b = false;
        this.b = new ArrayList();
        this.c = 0;
        this.d = 0;
        this.start();
        try {
            QueueManager.sleep((long)100);
            for (int i = 0; i < 10; ++i) {
                if (this.isAlive()) {
                    QueueManager.sleep((long)1000);
                    break;
                }
                a.info("waiting Thread.start().");
            }
        }
        catch (InterruptedException ex) {
            a.log(Level.SEVERE, null, ex);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static <U extends QueueRetornoItem> QueueManager<U> getInstance(Class<U> u) {
        if (a == null) {
            Object object = a;
            synchronized (object) {
                if (a == null) {
                    a = new QueueManager(u);
                }
            }
        }
        return a;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void push(T obj) {
        if (!a.isAlive()) {
            this.a(QueueEventEnum.OnError, null, -1, null);
            a.log(Level.SEVERE, "ERRO INSTANCIA DO QUEUE MANAGER MORREU!", "");
            return;
        }
        obj.setExecutado(false);
        this.a.add(obj);
        this.a(QueueEventEnum.OnPush, obj, -1, null);
        Object object = a;
        synchronized (object) {
            a.notify();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        try {
            QueueManager.sleep((long)1000);
        }
        catch (InterruptedException ex) {
            a.log(Level.SEVERE, null, ex);
        }
        this.a(QueueEventEnum.OnStartup, null, -1, null);
        do {
            if (!this.a.isEmpty()) {
                this.a();
            }
            try {
                Object ex = a;
                synchronized (ex) {
                    a.wait(1000);
                }
            }
            catch (InterruptedException ex) {
                a.log(Level.SEVERE, "", ex);
            }
        } while (!this.isShutdown() || !this.a.isEmpty());
        this.a(QueueEventEnum.OnShutdown, null, -1, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private synchronized void a() {
        LinkedList<QueueRetornoItem> newList = new LinkedList<QueueRetornoItem>();
        long current = System.currentTimeMillis();
        List list = this.a;
        synchronized (list) {
            for (QueueRetornoItem t : this.a) {
                if (current < t.getTimeToGo()) continue;
                newList.add(t);
            }
            if (this.b) {
                this.c = newList.size();
                this.d = this.a.size() - newList.size();
                this.a.clear();
                newList.clear();
                this.a(QueueEventEnum.OnCancel, null, -1, null);
                this.b = false;
            }
        }
        if (!newList.isEmpty()) {
            this.a(QueueEventEnum.OnWakeup, null, newList.size(), null);
            int processados = 0;
            int agendados = this.a.size() - newList.size();
            for (QueueRetornoItem t : newList) {
                this.a(t);
                this.a.remove((Object)t);
                ++processados;
                if (!this.b) continue;
                List list2 = this.a;
                synchronized (list2) {
                    this.c = newList.size() - processados;
                    this.d = agendados;
                    this.a.clear();
                    this.a(QueueEventEnum.OnCancel, null, -1, null);
                    this.b = false;
                    break;
                }
            }
            this.a(QueueEventEnum.OnSleep, null, -1, null);
        }
    }

    private void a(T obj) {
        try {
            if (this.getSender() != null) {
                a.log(Level.INFO, "Starting onSend method");
                this.getSender().onSend(obj);
                obj.setExecutado(true);
                obj.setHoraTerminoExecucao(new Date());
                a.log(Level.INFO, "Finished onSend method");
            }
            this.a(QueueEventEnum.OnConsume, obj, -1, null);
            QueueManager.sleep((long)150);
        }
        catch (Throwable tr) {
            this.a(QueueEventEnum.OnError, obj, -1, tr);
            obj.setExecutado(true);
            obj.setHoraTerminoExecucao(new Date());
            a.log(Level.SEVERE, null, tr);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public QueueRetornoItem getItem(T obj) {
        List list = this.a;
        synchronized (list) {
            for (QueueRetornoItem t : this.a) {
                if (!t.equals(obj)) continue;
                return t;
            }
            return null;
        }
    }

    public boolean containsItens() {
        return !this.a.isEmpty();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public List<QueueRetornoItem> getItens() {
        ArrayList<QueueRetornoItem> clone = new ArrayList<QueueRetornoItem>();
        List list = this.a;
        synchronized (list) {
            clone.addAll(this.a);
        }
        return clone;
    }

    public void cancel() {
        if (this.containsItens()) {
            this.b = true;
        }
    }

    public boolean isCanceled() {
        return this.b;
    }

    public QueueSender getSender() {
        return this.a;
    }

    public void setSender(QueueSender sender) {
        this.a = sender;
    }

    public void addListener(QueueListener<T> listener) {
        this.b.add(listener);
    }

    public void removeListener(QueueListener<T> listener) {
        this.b.remove(listener);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(QueueEventEnum event, T t, int newListSize, Throwable error) {
        try {
            a.info("fire Event " + event.toString());
            List list = this.b;
            synchronized (list) {
                switch (5.a[event.ordinal()]) {
                    case 1: {
                        for (QueueListener listener : this.b) {
                            listener.onPush(t);
                        }
                        break;
                    }
                    case 2: {
                        for (QueueListener listener : this.b) {
                            a.info("onconsume " + listener.getClass().getName());
                            listener.onConsume(t);
                            a.info("FIM onconsume " + listener.getClass().getName());
                        }
                        break;
                    }
                    case 3: {
                        for (QueueListener listener : this.b) {
                            listener.onShutdown(t);
                        }
                        break;
                    }
                    case 4: {
                        for (QueueListener listener : this.b) {
                            listener.onSleep(t);
                        }
                        break;
                    }
                    case 5: {
                        for (QueueListener listener : this.b) {
                            listener.onStartup(t);
                        }
                        break;
                    }
                    case 6: {
                        for (QueueListener listener : this.b) {
                            listener.onWakeup(t, newListSize);
                        }
                        break;
                    }
                    case 7: {
                        for (QueueListener listener : this.b) {
                            listener.onError(t, error);
                        }
                        break;
                    }
                    case 8: {
                        for (QueueListener listener : this.b) {
                            listener.onCancel(this.d, this.c);
                        }
                        break;
                    }
                }
            }
            a.info("FIM fire Event " + event.toString());
        }
        catch (Throwable e) {
            a.log(Level.SEVERE, "Queue Manager -> Some event listener caused an Exception", e);
        }
    }

    public boolean isShutdown() {
        return this.a;
    }

    public void setShutdown(boolean shutdown) {
        this.a = shutdown;
    }

    public static void main(String[] args) throws Exception {
        QueueManager manager = QueueManager.getInstance(QueueRetornoItem.class);
        manager.setSender((QueueSender)new QueueSenderImpl());
        manager.addListener((QueueListener)new /* Unavailable Anonymous Inner Class!! */);
        manager.addListener((QueueListener)new /* Unavailable Anonymous Inner Class!! */);
        manager.addListener((QueueListener)new /* Unavailable Anonymous Inner Class!! */);
        manager.addListener((QueueListener)new /* Unavailable Anonymous Inner Class!! */);
        for (int i = 0; i < 20; ++i) {
            Thread.sleep(100);
            manager.push(new QueueRetornoItem(i, 6));
        }
        manager.setShutdown(true);
    }

    static /* synthetic */ Logger a() {
        return a;
    }

    static {
        a = null;
    }
}

