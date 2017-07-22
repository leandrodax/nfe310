/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.model.dao.util.DSENDAOHelper
 *  br.gov.sp.fazenda.dsen.model.database.util.NetworkServerManager
 *  br.gov.sp.fazenda.dsge.model.database.util.DSGENetworkServerManager
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 */
package br.gov.sp.fazenda.dsen.model.database.util;

import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsen.model.dao.util.DSENDAOHelper;
import br.gov.sp.fazenda.dsge.model.database.util.DSGENetworkServerManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class NetworkServerManager
extends DSGENetworkServerManager {
    protected static Log logger = LogFactory.getLog(NetworkServerManager.class);
    private static NetworkServerManager a = new NetworkServerManager();
    private static final String a = "/database";
    private static final String b = DSENDAOHelper.databaseName;
    private static final String c = DSENProperties.getInstance().getArquivoDatabaseProperties();

    protected NetworkServerManager() {
    }

    public static synchronized NetworkServerManager getInstance() throws Exception {
        return a;
    }

    public String getArquivoPropriedades() {
        return c;
    }

    public String getDerbyDatabaseName() {
        return b;
    }

    public String getDerbyDatabasePath() {
        return "/database";
    }
}

