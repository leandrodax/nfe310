/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.dao.ControleVersaoDAO
 *  br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO
 *  br.gov.sp.fazenda.dsen.model.dao.util.DSENDAOHelper
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 *  org.apache.log4j.Logger
 *  org.hibernate.Session
 *  org.hibernate.ejb.EntityManagerImpl
 */
package br.gov.sp.fazenda.dsen.model.dao;

import br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO;
import br.gov.sp.fazenda.dsen.model.dao.util.DSENDAOHelper;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.ejb.EntityManagerImpl;

public class ControleVersaoDAO
extends DSENBaseDAO {
    private Logger a;

    public ControleVersaoDAO() {
        this.a = Logger.getLogger(this.getClass());
    }

    public void executarScript(InputStream script) throws DSENDAOException {
        Session session = ((EntityManagerImpl)DSENDAOHelper.currentSession()).getSession();
        Connection conn = session.connection();
        try {
            conn.setAutoCommit(false);
            InputStream inputStream = script;
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String comando = "";
            while (br.ready()) {
                comando = br.readLine();
                this.a(comando, conn);
            }
            br.close();
            inputStream.close();
            System.out.println("[SCRIPT EXECUTADO]");
            conn.commit();
        }
        catch (Exception e) {
            try {
                this.a.error((Object)e.getMessage());
                conn.rollback();
                conn.close();
            }
            catch (SQLException e1) {
                this.a.error((Object)e1.getMessage());
                throw new DSENDAOException((Throwable)e1, e.getMessage());
            }
            throw new DSENDAOException((Throwable)e, e.getMessage());
        }
        finally {
            try {
                conn.close();
            }
            catch (SQLException e) {
                this.a.error((Object)e.getMessage());
                throw new DSENDAOException((Throwable)e, e.getMessage());
            }
        }
    }

    private void a(String sqlCommand, Connection conn) throws DSENDAOException {
        Statement s = null;
        System.out.println("[EXECUTANDO COMANDO] " + sqlCommand);
        try {
            s = conn.createStatement();
            s.execute(sqlCommand);
        }
        catch (Exception e) {
            this.a.error((Object)e.getMessage());
            throw new DSENDAOException((Throwable)e, e.getMessage());
        }
        finally {
            try {
                s.close();
            }
            catch (SQLException e) {
                this.a.error((Object)e.getMessage());
                throw new DSENDAOException((Throwable)e, e.getMessage());
            }
        }
    }

    public Integer selectMaxNumeroVersao() throws DSENDAOException {
        try {
            return (Integer)this.selectSingleResult("ControleVersaoEntity.findMaxNumeroVersaoString", null);
        }
        catch (DSGEDAOException e) {
            throw new DSENDAOException((DSGEBaseException)e, e.getMessage());
        }
    }
}

