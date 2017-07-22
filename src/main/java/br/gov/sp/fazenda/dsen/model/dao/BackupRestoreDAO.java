/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.dao.BackupRestoreDAO
 *  br.gov.sp.fazenda.dsen.model.dao.util.DSENDAOHelper
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  com.sun.java.xml.ns.persistence.PersistenceDocument
 *  com.sun.java.xml.ns.persistence.PersistenceDocument$Factory
 *  com.sun.java.xml.ns.persistence.PersistenceDocument$Persistence
 *  com.sun.java.xml.ns.persistence.PersistenceDocument$Persistence$PersistenceUnit
 *  com.sun.java.xml.ns.persistence.PersistenceDocument$Persistence$PersistenceUnit$Properties
 *  com.sun.java.xml.ns.persistence.PersistenceDocument$Persistence$PersistenceUnit$Properties$Property
 *  javax.persistence.Query
 *  org.apache.xmlbeans.XmlException
 */
package br.gov.sp.fazenda.dsen.model.dao;

import br.gov.sp.fazenda.dsen.model.dao.util.DSENDAOHelper;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import com.sun.java.xml.ns.persistence.PersistenceDocument;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLTransientConnectionException;
import java.util.Properties;
import javax.persistence.Query;
import org.apache.xmlbeans.XmlException;

public class BackupRestoreDAO {
    private String a = "jdbc:derby://localhost:" + AppContext.getInstance().getDBConnectionPort() + "/" + DSENDAOHelper.databaseName + ";shutdown=true";
    private String b = "jdbc:derby://localhost:" + AppContext.getInstance().getDBConnectionPort() + "/" + DSENDAOHelper.databaseName + ";restoreFrom=";
    private String c;
    private String d;
    private String e;

    public boolean encerrarBD() throws DSENDAOException {
        boolean resultado = false;
        try {
            Connection conn = DriverManager.getConnection(this.a);
            conn.close();
        }
        catch (SQLTransientConnectionException exception) {
            resultado = true;
        }
        catch (SQLException e) {
            if (e.getSQLState().equals("08006")) {
                resultado = true;
            }
            throw new DSENDAOException((Throwable)e, e.getMessage());
        }
        return resultado;
    }

    public boolean restaurarBD(String caminhoBackup) throws DSENDAOException {
        boolean resultado = false;
        Properties props = new Properties();
        try {
            Connection conn = DriverManager.getConnection(this.b + caminhoBackup, props);
            conn.close();
            resultado = true;
        }
        catch (SQLException e) {
            throw new DSENDAOException((Throwable)e, e.getMessage());
        }
        return resultado;
    }

    public boolean backupBD(String caminhoBackup) throws DSENDAOException {
        boolean retorno = false;
        try {
            Query query = DSENDAOHelper.currentSession().createNativeQuery("CALL SYSCS_UTIL.SYSCS_BACKUP_DATABASE(?)");
            query.setParameter(1, (Object)caminhoBackup);
            query.executeUpdate();
            retorno = true;
        }
        catch (RuntimeException e) {
            throw new DSENDAOException((Throwable)e, e.getMessage());
        }
        return retorno;
    }

    private void a() throws DSENDAOException {
        try {
            PersistenceDocument persistenceDoc = PersistenceDocument.Factory.parse((InputStream)new BufferedInputStream(this.getClass().getResourceAsStream("/META-INF/persistence.xml")));
            PersistenceDocument.Persistence.PersistenceUnit.Properties.Property[] propertyArray = persistenceDoc.getPersistence().getPersistenceUnitArray(0).getProperties().getPropertyArray();
            for (int i = 0; i < propertyArray.length; ++i) {
                if (propertyArray[i].getName().equals("hibernate.connection.url")) {
                    this.c = propertyArray[i].getValue();
                    continue;
                }
                if (propertyArray[i].getName().equals("hibernate.connection.username")) {
                    this.d = propertyArray[i].getValue();
                    continue;
                }
                if (!propertyArray[i].getName().equals("hibernate.connection.password")) continue;
                this.e = propertyArray[i].getValue();
            }
        }
        catch (XmlException exception) {
            throw new DSENDAOException((Throwable)exception, exception.getMessage());
        }
        catch (IOException exception) {
            throw new DSENDAOException((Throwable)exception, exception.getMessage());
        }
    }

    public String getNomeBD() throws DSENDAOException {
        if (this.c == null) {
            this.a();
        }
        String nomeBD = this.c;
        while (nomeBD.indexOf("/") > -1) {
            nomeBD = nomeBD.substring(nomeBD.indexOf("/") + 1, nomeBD.length());
        }
        return nomeBD;
    }
}

