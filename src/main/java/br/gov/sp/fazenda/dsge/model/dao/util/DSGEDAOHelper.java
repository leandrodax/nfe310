/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGEDAOHelper
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGEDAOHelperItf
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 *  javax.persistence.EntityManager
 *  javax.persistence.EntityManagerFactory
 *  javax.persistence.EntityTransaction
 *  javax.persistence.Persistence
 *  javax.persistence.RollbackException
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 *  org.hibernate.SessionFactory
 *  org.hibernate.ejb.EntityManagerFactoryImpl
 *  org.hibernate.stat.Statistics
 */
package br.gov.sp.fazenda.dsge.model.dao.util;

import br.gov.sp.fazenda.dsge.model.dao.util.DSGEDAOHelperItf;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import java.io.PrintStream;
import java.util.HashMap;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.RollbackException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.hibernate.ejb.EntityManagerFactoryImpl;
import org.hibernate.stat.Statistics;

/*
 * Exception performing whole class analysis ignored.
 */
public abstract class DSGEDAOHelper
implements DSGEDAOHelperItf {
    protected static Log logger = LogFactory.getLog(DSGEDAOHelper.class);
    protected static EntityManagerFactory factory = null;
    protected static EntityManager entityManager = null;
    protected static Statistics statistics;
    private static ThreadLocal<EntityTransaction> a;

    protected DSGEDAOHelper() {
        logger.debug((Object)"Iniciando JPA EntityManagerFactory...");
        long inicio = System.currentTimeMillis();
        if (factory == null) {
            try {
                HashMap<String, String> map = new HashMap<String, String>();
                map.put("hibernate.connection.url", this.getURLConnection());
                factory = Persistence.createEntityManagerFactory((String)this.getPersistenceUnit(), map);
            }
            catch (RuntimeException e) {
                logger.error((Object)e);
                throw e;
            }
            catch (Exception e) {
                logger.error((Object)e);
            }
            logger.debug((Object)("JPA EntityManagerFactory iniciada em " + (System.currentTimeMillis() - inicio) + "ms!"));
        }
    }

    protected abstract String getPersistenceUnit();

    protected abstract String getURLConnection();

    public abstract void init();

    public static void closeFactory() {
        if (factory == null) {
            return;
        }
        System.out.println(" -> DESTROY - factory ");
        factory.close();
        factory = null;
    }

    public static EntityManager currentSession() {
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }

    public static void closeSession() {
        if (entityManager == null) {
            return;
        }
        System.out.println(" -> DESTROY - entityManager ");
        entityManager.close();
        entityManager = null;
    }

    public static EntityTransaction beginTransaction() throws DSGEDAOException {
        EntityTransaction entityTransaction = null;
        try {
            if (a.get() == null) {
                entityTransaction = DSGEDAOHelper.currentSession().getTransaction();
                entityTransaction.begin();
                a.set(entityTransaction);
            }
        }
        catch (RuntimeException e) {
            e.printStackTrace();
            throw new DSGEDAOException((Throwable)e, e.getMessage());
        }
        return entityTransaction;
    }

    public static void commitTransaction(EntityTransaction entityTransaction) throws DSGEDAOException {
        try {
            if (entityTransaction != null && entityTransaction.isActive()) {
                a.set(null);
                entityTransaction.commit();
            }
        }
        catch (RollbackException e) {
            e.printStackTrace();
            DSGEDAOHelper.currentSession().clear();
            throw new DSGEDAOException((Throwable)e, e.getMessage());
        }
        catch (Throwable e) {
            e.printStackTrace();
            throw new DSGEDAOException(e, e.getMessage());
        }
    }

    public static void rollbackTransaction(EntityTransaction entityTransaction) throws DSGEDAOException {
        try {
            if (entityTransaction != null && entityTransaction.isActive()) {
                a.set(null);
                entityTransaction.rollback();
            }
        }
        catch (Throwable e) {
            e.printStackTrace();
            DSGEDAOHelper.currentSession().clear();
            throw new DSGEDAOException(e, e.getMessage());
        }
    }

    private void a() {
        SessionFactory sessionFactory = ((EntityManagerFactoryImpl)factory).getSessionFactory();
        statistics = sessionFactory.getStatistics();
        statistics.setStatisticsEnabled(true);
    }

    public static void printStatistics() {
        logger.info((Object)"***** STATISTICS *****");
        logger.info((Object)("ConnectCount[" + statistics.getConnectCount() + "]"));
        logger.info((Object)("TransactionCount[" + statistics.getTransactionCount() + "]"));
        logger.info((Object)("SuccessfulTransactionCount[" + statistics.getSuccessfulTransactionCount() + "]"));
        logger.info((Object)("SessionOpenCount[" + statistics.getSessionOpenCount() + "]"));
        logger.info((Object)("SessionCloseCount[" + statistics.getSessionCloseCount() + "]"));
        logger.info((Object)("QueryExecutionCount[" + statistics.getQueryExecutionCount() + "]"));
        logger.info((Object)("QueryExecutionMaxTime[" + statistics.getQueryExecutionMaxTime() + "]"));
        logger.info((Object)("QueryExecutionMaxTimeQueryString[" + statistics.getQueryExecutionMaxTimeQueryString() + "]"));
        logger.info((Object)("CollectionFetchCount[" + statistics.getCollectionFetchCount() + "]"));
        logger.info((Object)("CollectionLoadCount[" + statistics.getCollectionLoadCount() + "]"));
        logger.info((Object)("EntityFetchCount[" + statistics.getEntityFetchCount() + "]"));
        logger.info((Object)("EntityLoadCount[" + statistics.getEntityLoadCount() + "]"));
    }

    static {
        a = new ThreadLocal<T>();
    }
}

