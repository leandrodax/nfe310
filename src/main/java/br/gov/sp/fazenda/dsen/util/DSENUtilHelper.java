/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.util.CfopTO
 *  br.gov.sp.fazenda.dsge.util.DSGEUtilHelper
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 */
package br.gov.sp.fazenda.dsen.util;

import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.util.CfopTO;
import br.gov.sp.fazenda.dsge.util.DSGEUtilHelper;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class DSENUtilHelper
extends DSGEUtilHelper {
    private static DSENUtilHelper a;
    protected List<CfopTO> listaCfopTransp;
    protected List<CfopTO> listaCfopCombustivel;
    protected List<String> listaUFPorEvento;

    public static synchronized DSENUtilHelper getInstance() throws DSGEUtilException {
        if (a == null) {
            a = new DSENUtilHelper();
        }
        return a;
    }

    private DSENUtilHelper() throws DSGEUtilException {
    }

    public String getArquivoEstado() {
        return DSENProperties.getInstance().getArquivoUF();
    }

    public InputStream getArquivoURLUf() {
        return DSENUtilHelper.class.getResourceAsStream(DSENProperties.getInstance().getArquivoSefazUrl());
    }

    protected BufferedReader getBufferedReader(String fileName) {
        if (fileName.startsWith("Cfop") || fileName.startsWith("UF")) {
            return new BufferedReader(new InputStreamReader(DSENUtilHelper.class.getResourceAsStream(fileName + ".txt")));
        }
        return super.getBufferedReader(fileName);
    }

    public CfopTO getCfopTranspTO(String codigo) throws DSGEUtilException {
        CfopTO cfopTO;
        int index;
        if (this.listaCfopTransp == null) {
            this.a();
        }
        if (!StringHelper.isBlankOrNull((Object)codigo) && (index = this.listaCfopTransp.indexOf((Object)(cfopTO = new CfopTO(codigo)))) >= 0) {
            return (CfopTO)this.listaCfopTransp.get(index);
        }
        return null;
    }

    public List<CfopTO> getCfopTranspTO() throws DSGEUtilException {
        if (this.listaCfopTransp == null) {
            this.a();
        }
        return this.listaCfopTransp;
    }

    private List<CfopTO> a() throws DSGEUtilException {
        BufferedReader br = null;
        if (this.listaCfopTransp == null) {
            this.listaCfopTransp = new ArrayList();
            try {
                br = this.getBufferedReader("CfopTransp");
                while (br.ready()) {
                    this.listaCfopTransp.add(new CfopTO(br.readLine()));
                }
            }
            catch (IOException e) {
                throw new DSGEUtilException((Throwable)e, e.getMessage());
            }
            finally {
                if (br != null) {
                    try {
                        br.close();
                    }
                    catch (IOException iOException) {}
                }
            }
        }
        return this.listaCfopTransp;
    }

    public CfopTO getCfopCombustivelTO(String codigo) throws DSGEUtilException {
        CfopTO cfopTO;
        int index;
        if (this.listaCfopCombustivel == null) {
            this.c();
        }
        if (!StringHelper.isBlankOrNull((Object)codigo) && (index = this.listaCfopCombustivel.indexOf((Object)(cfopTO = new CfopTO(codigo)))) >= 0) {
            return (CfopTO)this.listaCfopCombustivel.get(index);
        }
        return null;
    }

    public List<String> getUFPorEvento() throws DSGEUtilException {
        if (this.listaUFPorEvento == null) {
            this.b();
        }
        return this.listaUFPorEvento;
    }

    private List<String> b() throws DSGEUtilException {
        BufferedReader br = null;
        if (this.listaUFPorEvento == null) {
            this.listaUFPorEvento = new ArrayList();
            try {
                br = this.getBufferedReader("UFPorEvento");
                while (br.ready()) {
                    this.listaUFPorEvento.add(br.readLine());
                }
            }
            catch (IOException e) {
                throw new DSGEUtilException((Throwable)e, e.getMessage());
            }
            finally {
                if (br != null) {
                    try {
                        br.close();
                    }
                    catch (IOException iOException) {}
                }
            }
        }
        return this.listaUFPorEvento;
    }

    public List<CfopTO> getCfopCombustivelTO() throws DSGEUtilException {
        if (this.listaCfopCombustivel == null) {
            this.c();
        }
        return this.listaCfopCombustivel;
    }

    private List<CfopTO> c() throws DSGEUtilException {
        BufferedReader br = null;
        if (this.listaCfopCombustivel == null) {
            this.listaCfopCombustivel = new ArrayList();
            try {
                br = this.getBufferedReader("CfopCombustivel");
                while (br.ready()) {
                    this.listaCfopCombustivel.add(new CfopTO(br.readLine()));
                }
            }
            catch (IOException e) {
                throw new DSGEUtilException((Throwable)e, e.getMessage());
            }
            finally {
                if (br != null) {
                    try {
                        br.close();
                    }
                    catch (IOException iOException) {}
                }
            }
        }
        return this.listaCfopTransp;
    }
}

