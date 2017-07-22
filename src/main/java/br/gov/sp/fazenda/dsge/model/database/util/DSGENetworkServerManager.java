/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.model.database.util.DSGENetworkServerManager
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEBusinessException
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 *  org.apache.derby.drda.NetworkServerControl
 */
package br.gov.sp.fazenda.dsge.model.database.util;

import br.gov.sp.fazenda.dsge.model.exception.DSGEBusinessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.derby.drda.NetworkServerControl;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class DSGENetworkServerManager {
    private static Log a = LogFactory.getLog(DSGENetworkServerManager.class);
    private static final int a = 1527;
    protected NetworkServerControl server;
    protected int derbyPort = 1527;
    protected String derbyDBMSPath;

    protected DSGENetworkServerManager() {
        boolean isPortFree = false;
        while (this.derbyPort < 10000 && !isPortFree) {
            if (!this.pingPorta(this.derbyPort)) {
                ++this.derbyPort;
                continue;
            }
            isPortFree = true;
        }
        if (this.derbyPort == 10000) {
            throw new RuntimeException("Erro ao tentar subir o servidor de banco de dados. N\u00e3o h\u00e1 porta dispon\u00edvel entre 1527-10000.");
        }
    }

    public void startNetworkServer() throws Exception {
        try {
            if (!this.existeArquivoPropriedades()) {
                this.geraArquivoPropriedades();
                this.derbyDBMSPath = this.getDerbyDatabasePath();
            } else {
                this.derbyDBMSPath = this.loadProperties().getProperty("DERBY_DBMS_PATH");
            }
            System.setProperty("derby.system.home", this.derbyDBMSPath);
            System.setProperty("derby.storage.pageSize", "8192");
            this.server = new NetworkServerControl(InetAddress.getByName("localhost"), this.derbyPort);
            this.a();
        }
        catch (Throwable e) {
            throw new DSGEBusinessException(e, e.getMessage());
        }
    }

    public int getDerbyPort() {
        return this.derbyPort;
    }

    public void stopNetworkServer() throws Exception {
        try {
            boolean started = true;
            try {
                this.server.ping();
            }
            catch (Exception e) {
                started = false;
            }
            if (started) {
                this.server.shutdown();
            }
        }
        catch (Throwable e) {
            throw new DSGEBusinessException(e, e.getMessage());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void createDataBase() throws Exception {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:derby://localhost:" + this.derbyPort + "/" + this.getDerbyDatabaseName() + ";create=true");
            System.out.println("NetworkServer:Banco de dados criado");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            }
            catch (Throwable e) {
                throw new DSGEBusinessException(e, e.getMessage());
            }
        }
    }

    protected void geraArquivoPropriedades() throws Exception {
        try {
            new File(this.getDerbyDatabasePath()).mkdir();
            String conteudo = "DERBY_PORT=" + 1527 + "\nDERBY_DBMS_PATH=" + this.getDerbyDatabasePath();
            FileOutputStream fileOutputStream = new FileOutputStream(this.getDerbyDatabasePath() + File.separator + this.getArquivoPropriedades());
            fileOutputStream.write(conteudo.getBytes());
            fileOutputStream.close();
        }
        catch (FileNotFoundException e) {
            throw new Exception("ERRO SISTEMA - N\u00c3O FOI POSSIVEL CRIAR ARQUIVO DE PROPRIEDADES");
        }
        catch (IOException e) {
            throw new Exception("ERRO SISTEMA - N\u00c3O FOI POSSIVEL CRIAR ARQUIVO DE PROPRIEDADES");
        }
    }

    protected boolean existeArquivoPropriedades() {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(this.getDerbyDatabasePath() + File.separator + this.getArquivoPropriedades()));
        }
        catch (FileNotFoundException e) {
            return false;
        }
        catch (IOException e) {
            return false;
        }
        return true;
    }

    protected Properties loadProperties() throws Exception {
        Properties properties = null;
        try {
            properties = new Properties();
            properties.load(new FileInputStream(this.getDerbyDatabasePath() + File.separator + this.getArquivoPropriedades()));
            return properties;
        }
        catch (FileNotFoundException e) {
            throw new Exception("ERRO DE SISTEMA - N\u00c3O FOI POSSIVEL CARREGAR PROPRIEDADES DO BANCO DE DADOS");
        }
        catch (IOException e) {
            throw new Exception("ERRO DE SISTEMA - N\u00c3O FOI POSSIVEL CARREGAR PROPRIEDADES DO BANCO DE DADOS");
        }
    }

    protected boolean pingPorta(int porta) {
        try {
            ServerSocket serverTest = new ServerSocket(porta);
            serverTest.close();
            serverTest = null;
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }

    private void a() throws Exception {
        this.server.start(null);
        int numeroTentativas = 10;
        int tempoEntreTentativas = 1000;
        while (numeroTentativas > 0) {
            try {
                this.server.ping();
                break;
            }
            catch (Exception e) {
                --numeroTentativas;
                Thread.sleep(tempoEntreTentativas);
                tempoEntreTentativas *= 2;
            }
        }
        a.debug((Object)this.server.getCurrentProperties().toString());
        a.debug((Object)("runtime: " + this.server.getRuntimeInfo()));
        a.debug((Object)("sysinfo: " + this.server.getSysinfo()));
    }

    public abstract String getArquivoPropriedades();

    public abstract String getDerbyDatabaseName();

    public abstract String getDerbyDatabasePath();
}

