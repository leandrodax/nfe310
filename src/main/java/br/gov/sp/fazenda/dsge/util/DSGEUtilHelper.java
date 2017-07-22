/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.enumeration.ServicoSefazEnumItf
 *  br.gov.sp.fazenda.dsge.common.util.DSGEConstants
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.util.CfopTO
 *  br.gov.sp.fazenda.dsge.util.CorDenatranTO
 *  br.gov.sp.fazenda.dsge.util.DSGEUtilHelper
 *  br.gov.sp.fazenda.dsge.util.EspecieVeiculoTO
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.ModeloVeiculoTO
 *  br.gov.sp.fazenda.dsge.util.MunicipioTO
 *  br.gov.sp.fazenda.dsge.util.NcmTO
 *  br.gov.sp.fazenda.dsge.util.PaisTO
 *  br.gov.sp.fazenda.dsge.util.ServicoTO
 *  br.gov.sp.fazenda.dsge.util.TipoCombustivelTO
 *  br.gov.sp.fazenda.dsge.util.TipoVeiculoTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 */
package br.gov.sp.fazenda.dsge.util;

import br.gov.sp.fazenda.dsge.common.enumeration.ServicoSefazEnumItf;
import br.gov.sp.fazenda.dsge.common.util.DSGEConstants;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.util.CfopTO;
import br.gov.sp.fazenda.dsge.util.CorDenatranTO;
import br.gov.sp.fazenda.dsge.util.EspecieVeiculoTO;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.ModeloVeiculoTO;
import br.gov.sp.fazenda.dsge.util.MunicipioTO;
import br.gov.sp.fazenda.dsge.util.NcmTO;
import br.gov.sp.fazenda.dsge.util.PaisTO;
import br.gov.sp.fazenda.dsge.util.ServicoTO;
import br.gov.sp.fazenda.dsge.util.TipoCombustivelTO;
import br.gov.sp.fazenda.dsge.util.TipoVeiculoTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public abstract class DSGEUtilHelper {
    protected List<NcmTO> listaNcm;
    protected List<CfopTO> listaCfop;
    protected LinkedHashMap<String, PaisTO> paisMap;
    protected List<EstadoTO> listaEstado;
    protected List<EstadoTO> listaEstadoEspecifico;
    protected List<ServicoTO> listaServico;
    protected List<CorDenatranTO> listaCorDenatran;
    protected List<TipoVeiculoTO> listaTipoVeiculo;
    protected List<ModeloVeiculoTO> listaModeloVeiculo;
    protected List<EspecieVeiculoTO> listaEspecieVeiculo;
    protected List<TipoCombustivelTO> listaTipoCombustivel;
    protected HashMap<String, List<MunicipioTO>> mapMunicipio;
    private Map<ServicoSefazEnumItf, String> a = null;
    private Map<EstadoTO, Map> b = null;
    private static Document a = null;

    protected DSGEUtilHelper() throws DSGEUtilException {
        this.a();
    }

    private List<EstadoTO> a() throws DSGEUtilException {
        return this.listaEstado;
    }

    public HashMap<String, List<MunicipioTO>> getMapMunicipio() {
        if (this.mapMunicipio == null) {
            this.mapMunicipio = new HashMap();
        }
        return this.mapMunicipio;
    }

    public EstadoTO getEstadoTO(String codigo) throws DSGEUtilException {
        EstadoTO estadoTO = new EstadoTO(codigo, "", "");
        if (this.a().contains((Object)estadoTO)) {
            estadoTO = (EstadoTO)this.a().get(this.a().indexOf((Object)estadoTO));
        } else if (codigo.equals("99")) {
            estadoTO.setSigla("EX");
            estadoTO.setNome("Exterior");
        } else {
            estadoTO = null;
        }
        return estadoTO;
    }

    public EstadoTO getEstadoTOBySigla(String sigla) throws DSGEUtilException {
        EstadoTO estadoTO = new EstadoTO("", sigla, "");
        if (this.a().contains((Object)estadoTO)) {
            estadoTO = (EstadoTO)this.a().get(this.a().indexOf((Object)estadoTO));
        } else if (sigla.equals("EX")) {
            estadoTO.setCodigo("99");
            estadoTO.setNome("Exterior");
        } else {
            estadoTO = sigla.equals("RFB") ? new EstadoTO("90", "RFB", "Receita Federal do Brasil") : (sigla.equals("SVCAN") ? new EstadoTO("99SVCAN", "SVCAN", "SEFAZ Virtual de Conting\u00eancia do Ambi\u00eante Nacional") : (sigla.equals("SVCRS") ? new EstadoTO("99SVCRS", "SVCRS", "SEFAZ Virtual de Conting\u00eancia do Rio Grande do Sul") : (sigla.equals("SU") ? new EstadoTO("", "SU", "SUFRAMA") : null)));
        }
        return estadoTO;
    }

    public EstadoTO getSiglaEstadoTO(String sigla) {
        EstadoTO estadoTO = new EstadoTO("", sigla, "");
        try {
            if (this.a().contains((Object)estadoTO)) {
                estadoTO = (EstadoTO)this.a().get(this.a().indexOf((Object)estadoTO));
            } else if (!StringHelper.isBlankOrNull((Object)sigla) && sigla.equals("EX")) {
                estadoTO.setCodigo("99");
                estadoTO.setNome("Exterior");
            } else {
                estadoTO = null;
            }
        }
        catch (DSGEUtilException dSGEUtilException) {
            // empty catch block
        }
        return estadoTO;
    }

    public List<EstadoTO> getEstadoTO(PaisTO paisTO) throws DSGEUtilException {
        if (!StringHelper.isBlankOrNull((Object)paisTO.getCodigo())) {
            if (!paisTO.getCodigo().equals(DSGEConstants.BRASIL)) {
                ArrayList<EstadoTO> list = new ArrayList<EstadoTO>();
                EstadoTO estadoTO = null;
                estadoTO = new EstadoTO("99", "EX", "Exterior");
                list.add(estadoTO);
                return list;
            }
            return this.a();
        }
        return null;
    }

    public List<EstadoTO> getEstadoTO(boolean incluirExterior) throws DSGEUtilException {
        if (incluirExterior) {
            ArrayList<EstadoTO> list = new ArrayList<EstadoTO>();
            list.addAll(this.a());
            EstadoTO exterior = new EstadoTO("99", "EX", "Exterior");
            list.add(exterior);
            return list;
        }
        return this.a();
    }

    public List<MunicipioTO> getMunicipioTO(EstadoTO estadoTO) throws DSGEUtilException {
        HashMap mapMunicipio = this.getMapMunicipio();
        if (!mapMunicipio.containsKey(estadoTO.getCodigo()) && !estadoTO.getCodigo().equals("99")) {
            this.a(estadoTO);
        } else if (estadoTO.getCodigo().equals("99")) {
            ArrayList<MunicipioTO> listaExterior = new ArrayList<MunicipioTO>();
            MunicipioTO municipioTO = new MunicipioTO();
            municipioTO.setCodigo(new String("9999999"));
            municipioTO.setNome("Exterior");
            listaExterior.add(municipioTO);
            mapMunicipio.put(estadoTO.getCodigo(), listaExterior);
        }
        return new ArrayList<MunicipioTO>((Collection)mapMunicipio.get(estadoTO.getCodigo()));
    }

    public MunicipioTO getMunicipioTO(EstadoTO estadoTO, String nomeMunicipio) throws DSGEUtilException {
        if (!StringHelper.isBlankOrNull((Object)nomeMunicipio)) {
            HashMap mapMunicipio = this.getMapMunicipio();
            if (!mapMunicipio.containsKey(estadoTO.getCodigo())) {
                this.getMunicipioTO(estadoTO);
            }
            List listMunicipio = (List)mapMunicipio.get(estadoTO.getCodigo());
            for (MunicipioTO municipioTO : listMunicipio) {
                if (!municipioTO.getNome().equalsIgnoreCase(nomeMunicipio.trim())) continue;
                return municipioTO;
            }
        }
        return null;
    }

    public MunicipioTO getMunicipioTO(String codigo) throws DSGEUtilException {
        if (!StringHelper.isBlankOrNull((Object)codigo) && !codigo.equals("0")) {
            String codigoEstado = codigo.substring(0, 2);
            EstadoTO estadoTO = new EstadoTO(codigoEstado, "", "");
            HashMap mapMunicipio = this.getMapMunicipio();
            if (!mapMunicipio.containsKey(estadoTO.getCodigo())) {
                this.getMunicipioTO(estadoTO);
            }
            List listMunicipio = (List)mapMunicipio.get(estadoTO.getCodigo());
            MunicipioTO municipioTO = new MunicipioTO();
            municipioTO.setCodigo(codigo);
            int index = listMunicipio.indexOf((Object)municipioTO);
            if (index != -1) {
                return (MunicipioTO)listMunicipio.get(index);
            }
        }
        return null;
    }

    public List<PaisTO> getPaisTO() throws DSGEUtilException {
        BufferedReader br = null;
        try {
            if (this.paisMap == null) {
                br = this.getBufferedReader("Pais");
                PaisTO paisTO = null;
                this.paisMap = new LinkedHashMap();
                while (br.ready()) {
                    String linha = br.readLine();
                    StringTokenizer stringTokenizer = new StringTokenizer(linha, "|");
                    paisTO = new PaisTO();
                    paisTO.setCodigo(new String(stringTokenizer.nextToken().trim()));
                    paisTO.setNome(stringTokenizer.nextToken().trim());
                    this.paisMap.put(paisTO.getCodigo(), paisTO);
                }
            }
        }
        catch (FileNotFoundException e) {
            throw new DSGEUtilException((Throwable)e, e.getMessage());
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
        return new ArrayList<PaisTO>(this.paisMap.values());
    }

    public PaisTO getPaisTO(String codigo) throws DSGEUtilException {
        if (this.paisMap == null) {
            this.getPaisTO();
        }
        if (StringHelper.isBlankOrNull((Object)codigo)) {
            PaisTO paisTO = new PaisTO();
            paisTO.setCodigo("");
            paisTO.setNome("");
            return paisTO;
        }
        PaisTO paisTO = (PaisTO)this.paisMap.get(codigo = StringHelper.removeZerosAEsquerda((String)codigo));
        if (paisTO == null) {
            paisTO = new PaisTO();
            paisTO.setCodigo("");
            paisTO.setNome("");
        }
        return paisTO;
    }

    public PaisTO getPaisTOByNome(String nomePais) throws DSGEUtilException {
        List l = this.getPaisTO();
        nomePais = nomePais.trim();
        for (PaisTO paisTO : l) {
            if (!paisTO.getNome().equalsIgnoreCase(nomePais)) continue;
            return paisTO;
        }
        return null;
    }

    public List<EspecieVeiculoTO> getEspecieVeiculoTO() throws DSGEUtilException {
        BufferedReader br = null;
        EspecieVeiculoTO especieVeiculoTO = null;
        if (this.listaEspecieVeiculo == null) {
            this.listaEspecieVeiculo = new ArrayList();
            try {
                br = this.getBufferedReader("EspecieVeiculo");
                while (br.ready()) {
                    especieVeiculoTO = new EspecieVeiculoTO();
                    String linha = br.readLine();
                    StringTokenizer stringTokenizer = new StringTokenizer(linha, "|");
                    especieVeiculoTO.setCodigo(stringTokenizer.nextToken().trim());
                    especieVeiculoTO.setNome(stringTokenizer.nextToken());
                    this.listaEspecieVeiculo.add(especieVeiculoTO);
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
        return this.listaEspecieVeiculo;
    }

    public List<TipoCombustivelTO> getTipoCombustivelTO() throws DSGEUtilException {
        BufferedReader br = null;
        TipoCombustivelTO tipoCombustivelTO = null;
        if (this.listaTipoCombustivel == null) {
            this.listaTipoCombustivel = new ArrayList();
            try {
                br = this.getBufferedReader("TipoCombustivel");
                while (br.ready()) {
                    tipoCombustivelTO = new TipoCombustivelTO();
                    String linha = br.readLine();
                    StringTokenizer stringTokenizer = new StringTokenizer(linha, "|");
                    tipoCombustivelTO.setCodigo(stringTokenizer.nextToken().trim());
                    tipoCombustivelTO.setNome(stringTokenizer.nextToken());
                    this.listaTipoCombustivel.add(tipoCombustivelTO);
                }
            }
            catch (NumberFormatException e) {
                throw new DSGEUtilException((Throwable)e, e.getMessage());
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
        return this.listaTipoCombustivel;
    }

    public List<CorDenatranTO> getCorDenatranTO() throws DSGEUtilException {
        BufferedReader br = null;
        CorDenatranTO tipoPinturaTO = null;
        if (this.listaCorDenatran == null) {
            this.listaCorDenatran = new ArrayList();
            try {
                br = this.getBufferedReader("CorDenatran");
                while (br.ready()) {
                    tipoPinturaTO = new CorDenatranTO();
                    String linha = br.readLine();
                    StringTokenizer stringTokenizer = new StringTokenizer(linha, "|");
                    tipoPinturaTO.setCodigo(stringTokenizer.nextToken().trim());
                    tipoPinturaTO.setNome(stringTokenizer.nextToken());
                    this.listaCorDenatran.add(tipoPinturaTO);
                }
            }
            catch (NumberFormatException e) {
                throw new DSGEUtilException((Throwable)e, e.getMessage());
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
        return this.listaCorDenatran;
    }

    public List<TipoVeiculoTO> getTipoVeiculoTO() throws DSGEUtilException {
        BufferedReader br = null;
        TipoVeiculoTO tipoVeiculoTO = null;
        if (this.listaTipoVeiculo == null) {
            this.listaTipoVeiculo = new ArrayList();
            try {
                br = this.getBufferedReader("TipoVeiculo");
                while (br.ready()) {
                    tipoVeiculoTO = new TipoVeiculoTO();
                    String linha = br.readLine();
                    StringTokenizer stringTokenizer = new StringTokenizer(linha, "|");
                    tipoVeiculoTO.setCodigo(stringTokenizer.nextToken().trim());
                    tipoVeiculoTO.setNome(stringTokenizer.nextToken());
                    this.listaTipoVeiculo.add(tipoVeiculoTO);
                }
            }
            catch (NumberFormatException e) {
                throw new DSGEUtilException((Throwable)e, e.getMessage());
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
        return this.listaTipoVeiculo;
    }

    public List<ModeloVeiculoTO> getModeloVeiculoTO() throws DSGEUtilException {
        BufferedReader br = null;
        ModeloVeiculoTO modeloVeiculoTO = null;
        if (this.listaModeloVeiculo == null) {
            this.listaModeloVeiculo = new ArrayList();
            try {
                br = this.getBufferedReader("ModeloVeiculo");
                while (br.ready()) {
                    modeloVeiculoTO = new ModeloVeiculoTO();
                    String linha = br.readLine();
                    StringTokenizer stringTokenizer = new StringTokenizer(linha, "|");
                    modeloVeiculoTO.setCodigo(stringTokenizer.nextToken().trim());
                    modeloVeiculoTO.setNome(stringTokenizer.nextToken());
                    this.listaModeloVeiculo.add(modeloVeiculoTO);
                }
            }
            catch (NumberFormatException e) {
                throw new DSGEUtilException((Throwable)e, e.getMessage());
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
        return this.listaModeloVeiculo;
    }

    public CfopTO getCfopTO(String codigo) throws DSGEUtilException {
        CfopTO cfopTO;
        int index;
        if (this.listaCfop == null) {
            this.b();
        }
        if (!StringHelper.isBlankOrNull((Object)codigo) && (index = this.listaCfop.indexOf((Object)(cfopTO = new CfopTO(codigo)))) >= 0) {
            return (CfopTO)this.listaCfop.get(index);
        }
        return null;
    }

    public List<CfopTO> getCfopTO() throws DSGEUtilException {
        if (this.listaCfop == null) {
            this.b();
        }
        return this.listaCfop;
    }

    public ServicoTO getServicoTO(String codigo) throws DSGEUtilException {
        if (this.listaServico == null) {
            this.c();
        }
        if (!StringHelper.isBlankOrNull((Object)codigo)) {
            ServicoTO servicoTO = new ServicoTO();
            servicoTO.setCodigo(codigo);
            return (ServicoTO)this.listaServico.get(this.listaServico.indexOf((Object)servicoTO));
        }
        return null;
    }

    public List<ServicoTO> getServicoTO() throws DSGEUtilException {
        if (this.listaServico == null) {
            this.c();
        }
        return this.listaServico;
    }

    public ServicoTO getServicoNFe310TO(String codigo) throws DSGEUtilException {
        if (this.listaServico == null) {
            this.d();
        }
        if (!StringHelper.isBlankOrNull((Object)codigo)) {
            ServicoTO servicoTO = new ServicoTO();
            servicoTO.setCodigo(codigo);
            return (ServicoTO)this.listaServico.get(this.listaServico.indexOf((Object)servicoTO));
        }
        return null;
    }

    public List<ServicoTO> getServicoNFe310TO() throws DSGEUtilException {
        if (this.listaServico == null) {
            this.d();
        }
        return this.listaServico;
    }

    public NcmTO getNcmTO(String codigo) throws DSGEUtilException {
        if (this.listaNcm == null) {
            this.e();
        }
        if (!StringHelper.isBlankOrNull((Object)codigo)) {
            NcmTO ncmTO = new NcmTO();
            ncmTO.setCodigo(codigo);
            int index = this.listaNcm.indexOf((Object)ncmTO);
            if (index >= 0) {
                return (NcmTO)this.listaNcm.get(index);
            }
        }
        return null;
    }

    public EspecieVeiculoTO getEspecieVeiculoTO(String codigo) throws DSGEUtilException {
        if (this.listaEspecieVeiculo == null) {
            this.getEspecieVeiculoTO();
        }
        if (!StringHelper.isBlankOrNull((Object)codigo)) {
            EspecieVeiculoTO especieVeiculoTO = new EspecieVeiculoTO();
            especieVeiculoTO.setCodigo(codigo);
            int index = this.listaEspecieVeiculo.indexOf((Object)especieVeiculoTO);
            if (index >= 0) {
                return (EspecieVeiculoTO)this.listaEspecieVeiculo.get(index);
            }
        }
        return null;
    }

    public TipoCombustivelTO getTipoCombustivelTO(String codigo) throws DSGEUtilException {
        if (this.listaTipoCombustivel == null) {
            this.getTipoCombustivelTO();
        }
        if (!StringHelper.isBlankOrNull((Object)codigo)) {
            TipoCombustivelTO tipoCombustivelTO = new TipoCombustivelTO();
            tipoCombustivelTO.setCodigo(codigo);
            int index = this.listaTipoCombustivel.indexOf((Object)tipoCombustivelTO);
            if (index >= 0) {
                return (TipoCombustivelTO)this.listaTipoCombustivel.get(index);
            }
        }
        return null;
    }

    public CorDenatranTO getCorDenatranTO(String codigo) throws DSGEUtilException {
        if (this.listaCorDenatran == null) {
            this.getCorDenatranTO();
        }
        if (!StringHelper.isBlankOrNull((Object)codigo)) {
            CorDenatranTO cCor = new CorDenatranTO();
            cCor.setCodigo(codigo);
            int index = this.listaCorDenatran.indexOf((Object)cCor);
            if (index >= 0) {
                return (CorDenatranTO)this.listaCorDenatran.get(index);
            }
        }
        return null;
    }

    public TipoVeiculoTO getTipoVeiculoTO(String codigo) throws DSGEUtilException {
        if (this.listaTipoVeiculo == null) {
            this.getTipoVeiculoTO();
        }
        if (!StringHelper.isBlankOrNull((Object)codigo)) {
            TipoVeiculoTO tipoVeiculoTO = new TipoVeiculoTO();
            tipoVeiculoTO.setCodigo(codigo);
            int index = this.listaTipoVeiculo.indexOf((Object)tipoVeiculoTO);
            if (index >= 0) {
                return (TipoVeiculoTO)this.listaTipoVeiculo.get(index);
            }
        }
        return null;
    }

    public ModeloVeiculoTO getModeloVeiculoTO(String codigo) throws DSGEUtilException {
        if (this.listaModeloVeiculo == null) {
            this.getModeloVeiculoTO();
        }
        if (!StringHelper.isBlankOrNull((Object)codigo)) {
            ModeloVeiculoTO modeloVeiculoTO = new ModeloVeiculoTO();
            modeloVeiculoTO.setCodigo(codigo);
            int index = this.listaModeloVeiculo.indexOf((Object)modeloVeiculoTO);
            if (index >= 0) {
                return (ModeloVeiculoTO)this.listaModeloVeiculo.get(index);
            }
        }
        return null;
    }

    private void a() throws DSGEUtilException {
        this.listaEstado = new ArrayList();
        this.listaEstadoEspecifico = new ArrayList();
        BufferedReader br = this.getBufferedReader(this.getArquivoEstado());
        try {
            while (br.ready()) {
                EstadoTO estadoTO = new EstadoTO();
                String linha = br.readLine();
                StringTokenizer stringTokenizer = new StringTokenizer(linha, "|");
                estadoTO.setCodigo(stringTokenizer.nextToken());
                estadoTO.setSigla(stringTokenizer.nextToken());
                estadoTO.setNome(stringTokenizer.nextToken());
                if (stringTokenizer.countTokens() == 1) {
                    this.listaEstadoEspecifico.add(estadoTO);
                }
                this.listaEstado.add(estadoTO);
            }
            this.listaEstado = Collections.unmodifiableList(this.listaEstado);
            this.listaEstadoEspecifico = Collections.unmodifiableList(this.listaEstadoEspecifico);
        }
        catch (FileNotFoundException e) {
            throw new DSGEUtilException((Throwable)e, e.getMessage());
        }
        catch (NumberFormatException e) {
            throw new DSGEUtilException((Throwable)e, e.getMessage());
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

    private void a(EstadoTO estadoTO) throws DSGEUtilException {
        BufferedReader br = null;
        ArrayList<MunicipioTO> listMunicipio = new ArrayList<MunicipioTO>();
        MunicipioTO municipioTO = null;
        try {
            br = this.getBufferedReader(estadoTO.getCodigo());
            while (br.ready()) {
                String linha = br.readLine();
                StringTokenizer stringTokenizer = new StringTokenizer(linha, "|");
                municipioTO = new MunicipioTO();
                municipioTO.setCodigo(new String(stringTokenizer.nextToken()));
                municipioTO.setNome(stringTokenizer.nextToken());
                listMunicipio.add(municipioTO);
            }
            Collections.sort(listMunicipio);
            this.getMapMunicipio().put(estadoTO.getCodigo(), listMunicipio);
        }
        catch (FileNotFoundException e) {
            throw new DSGEUtilException((Throwable)e, e.getMessage());
        }
        catch (NumberFormatException e) {
            throw new DSGEUtilException((Throwable)e, e.getMessage());
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

    private List<CfopTO> b() throws DSGEUtilException {
        BufferedReader br = null;
        if (this.listaCfop == null) {
            this.listaCfop = new ArrayList();
            try {
                br = this.getBufferedReader("Cfop");
                while (br.ready()) {
                    this.listaCfop.add(new CfopTO(br.readLine()));
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
        return this.listaCfop;
    }

    private List<ServicoTO> c() throws DSGEUtilException {
        BufferedReader br = null;
        ServicoTO servicoTO = null;
        if (this.listaServico == null) {
            this.listaServico = new ArrayList();
            try {
                br = this.getBufferedReader("Servico");
                while (br.ready()) {
                    servicoTO = new ServicoTO();
                    String linha = br.readLine();
                    StringTokenizer stringTokenizer = new StringTokenizer(linha, "|");
                    servicoTO.setCodigo(stringTokenizer.nextToken().trim());
                    servicoTO.setNome(stringTokenizer.nextToken());
                    this.listaServico.add(servicoTO);
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
        return this.listaServico;
    }

    private List<ServicoTO> d() throws DSGEUtilException {
        BufferedReader br = null;
        ServicoTO servicoTO = null;
        if (this.listaServico == null) {
            this.listaServico = new ArrayList();
            try {
                br = this.getBufferedReader("ServicoNFe310");
                while (br.ready()) {
                    servicoTO = new ServicoTO();
                    String linha = br.readLine();
                    StringTokenizer stringTokenizer = new StringTokenizer(linha, "|");
                    servicoTO.setCodigo(stringTokenizer.nextToken().trim());
                    servicoTO.setNome(stringTokenizer.nextToken());
                    this.listaServico.add(servicoTO);
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
        return this.listaServico;
    }

    private List<NcmTO> e() throws DSGEUtilException {
        NcmTO ncmTO = null;
        BufferedReader br = null;
        if (this.listaNcm == null) {
            this.listaNcm = new ArrayList();
            try {
                br = this.getBufferedReader("Ncm");
                while (br.ready()) {
                    ncmTO = new NcmTO();
                    String linha = br.readLine();
                    StringTokenizer stringTokenizer = new StringTokenizer(linha, "|");
                    ncmTO.setCodigo(stringTokenizer.nextToken().trim());
                    ncmTO.setNome(stringTokenizer.nextToken());
                    this.listaNcm.add(ncmTO);
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
        return this.listaNcm;
    }

    protected BufferedReader getBufferedReader(String fileName) {
        return new BufferedReader(new InputStreamReader(DSGEUtilHelper.class.getResourceAsStream(fileName + ".txt")));
    }

    public boolean validaPais(String cPais) throws DSGEUtilException {
        PaisTO paisTO = this.getPaisTO(cPais);
        if (paisTO == null || StringHelper.isBlankOrNull((Object)paisTO.getNome())) {
            return false;
        }
        return true;
    }

    public boolean validaCUF(String cUF) throws DSGEUtilException {
        EstadoTO estadoTO = this.getEstadoTO(cUF);
        if (estadoTO == null || StringHelper.isBlankOrNull((Object)estadoTO.getNome())) {
            return false;
        }
        return true;
    }

    public boolean validaUF(String uf) throws DSGEUtilException {
        EstadoTO estadoTO = this.getEstadoTOBySigla(uf);
        if (estadoTO == null || StringHelper.isBlankOrNull((Object)estadoTO.getNome())) {
            return false;
        }
        return true;
    }

    public boolean validaCMun(String cMun) throws DSGEUtilException {
        MunicipioTO municipioTO = this.getMunicipioTO(cMun);
        if (municipioTO == null || StringHelper.isBlankOrNull((Object)municipioTO.getNome())) {
            return false;
        }
        return true;
    }

    public boolean isEstadoEspecifico(EstadoTO estadoTO) {
        return this.listaEstadoEspecifico.contains((Object)estadoTO);
    }

    public abstract String getArquivoEstado();

    public String getURLPorUF(EstadoTO estadoTO, ServicoSefazEnumItf sefazEnum) throws DSGEUtilException {
        if (this.b == null) {
            this.a(sefazEnum);
        }
        return (String)((Map)this.b.get((Object)estadoTO)).get((Object)sefazEnum);
    }

    private void a(ServicoSefazEnumItf sefazEnumItf) throws DSGEUtilException {
        this.b = new HashMap<K, V>();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            a = db.parse(this.getArquivoURLUf());
            Element elem = a.getDocumentElement();
            NodeList nl = elem.getElementsByTagName("uf");
            for (int i = 0; i < nl.getLength(); ++i) {
                EstadoTO estado;
                this.a = new HashMap<K, V>();
                Element tagUF = (Element)nl.item(i);
                String sigla = tagUF.getAttribute("sigla");
                for (ServicoSefazEnumItf enum1 : (ServicoSefazEnumItf[])sefazEnumItf.getClass().getEnumConstants()) {
                    this.a.put(enum1, DSGEUtilHelper.a((Element)tagUF, (String)enum1.getNomeServico(), (String)null));
                }
                if (sigla.contains("SVC")) {
                    estado = new EstadoTO("99" + sigla, sigla, sigla);
                    this.b.put(estado, this.a);
                }
                if (sigla.contains("AN")) {
                    estado = new EstadoTO("99" + sigla, sigla, sigla);
                    this.b.put(estado, this.a);
                    continue;
                }
                this.b.put(this.getEstadoTOBySigla(sigla), this.a);
            }
        }
        catch (ParserConfigurationException e) {
            throw new DSGEUtilException((Throwable)e, e.getMessage());
        }
        catch (SAXException e) {
            throw new DSGEUtilException((Throwable)e, e.getMessage());
        }
        catch (IOException e) {
            throw new DSGEUtilException((Throwable)e, e.getMessage());
        }
    }

    private static String a(Element elem, String tagName, String tagAttribute) {
        NodeList children = elem.getElementsByTagName(tagName);
        if (children == null) {
            return null;
        }
        Element child = (Element)children.item(0);
        if (child == null) {
            return null;
        }
        if (child.getFirstChild() != null) {
            return child.getFirstChild().getNodeValue();
        }
        return child.getAttribute(tagAttribute);
    }

    public InputStream getArquivoURLUf() {
        return null;
    }

    static {
    }
}

