/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.model.dao.util.DSENDAOHelper
 *  br.gov.sp.fazenda.dsen.model.database.util.NetworkServerManager
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGEDAOHelper
 *  javax.persistence.EntityManager
 *  javax.persistence.EntityManagerFactory
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 */
package br.gov.sp.fazenda.dsen.model.dao.util;

import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsen.model.database.util.NetworkServerManager;
import br.gov.sp.fazenda.dsge.model.dao.util.DSGEDAOHelper;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DSENDAOHelper
extends DSGEDAOHelper {
    protected static Log logger = LogFactory.getLog(DSENDAOHelper.class);
    public static final String databaseName = DSENProperties.getInstance().getArquivoDatabaseName();
    private static final String a = "DSENPU";

    public void init() {
        logger.debug((Object)"Iniciando JPA EntityManager...");
        long inicio = System.currentTimeMillis();
        entityManager = factory.createEntityManager();
        logger.debug((Object)("JPA EntityManager iniciado em " + (System.currentTimeMillis() - inicio) + "ms!"));
    }

    protected String getPersistenceUnit() {
        return "DSENPU";
    }

    protected String getURLConnection() {
        try {
            return "jdbc:derby://localhost:" + NetworkServerManager.getInstance().getDerbyPort() + "/" + databaseName;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

