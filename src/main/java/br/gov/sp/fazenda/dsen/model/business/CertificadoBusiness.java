/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.PropriedadeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.RepositorioCertificadoEnum
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoInfoTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.PropriedadeTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.model.business.CertificadoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.CertificadoBusiness$1
 *  br.gov.sp.fazenda.dsen.model.business.PropriedadeBusiness
 *  br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter
 *  br.gov.sp.fazenda.dsen.model.dao.CertificadoInfoDAO
 *  br.gov.sp.fazenda.dsen.model.entity.CertificadoInfoEntity
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENConverterException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsge.certif.Certificado
 *  br.gov.sp.fazenda.dsge.certif.CertificadoHelper
 *  br.gov.sp.fazenda.dsge.certif.RepositorioInfo
 *  br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum
 *  br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoException
 *  br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoInvalidoException
 *  br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoSenhaException
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.model.business.DSGEBusinessFactory
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 */
package br.gov.sp.fazenda.dsen.model.business;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.PropriedadeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.RepositorioCertificadoEnum;
import br.gov.sp.fazenda.dsen.common.to.CertificadoInfoTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.PropriedadeTO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.model.business.CertificadoBusiness;
import br.gov.sp.fazenda.dsen.model.business.PropriedadeBusiness;
import br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter;
import br.gov.sp.fazenda.dsen.model.dao.CertificadoInfoDAO;
import br.gov.sp.fazenda.dsen.model.entity.CertificadoInfoEntity;
import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.exception.DSENConverterException;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsge.certif.Certificado;
import br.gov.sp.fazenda.dsge.certif.CertificadoHelper;
import br.gov.sp.fazenda.dsge.certif.RepositorioInfo;
import br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum;
import br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoException;
import br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoInvalidoException;
import br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoSenhaException;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.model.business.DSGEBusinessFactory;
import br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import java.io.File;
import java.io.FilenameFilter;
import java.io.PrintStream;
import java.io.Serializable;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CertificadoBusiness {
    final String a = ".so";
    final String b = ".dll";
    private static Log a = LogFactory.getLog(CertificadoBusiness.class);
    private CertificadoInfoDAO a;
    private PropriedadeBusiness a = null;

    private CertificadoInfoDAO a() {
        if (this.a == null) {
            this.a = new CertificadoInfoDAO();
        }
        return this.a;
    }

    public CertificadoInfoTO obterInformacoesCertificadoA1(String caminho, String senha) throws DSENBusinessException {
        Certificado certificado = new Certificado();
        CertificadoInfoTO certificadoTO = new CertificadoInfoTO();
        try {
            Map map = certificado.recuperarCertificadosArquivo(caminho, senha);
            Set set = map.entrySet();
            X509Certificate x509Certificate = (X509Certificate)set.iterator().next().getKey();
            certificadoTO.setEmitenteTO((EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class));
            certificadoTO.setCaminho(caminho);
            certificadoTO.setCnpj(CertificadoHelper.recuperarCNPJ((X509Certificate)x509Certificate));
            certificadoTO.setDataValidade(CertificadoHelper.getDataValidadeFim((X509Certificate)x509Certificate));
            certificadoTO.setAutoridadeCertificadora(CertificadoHelper.getEmissor((X509Certificate)x509Certificate));
            certificadoTO.setTipoCertificado(Certificado.A1);
            String fileName = new File(caminho).getName();
            certificadoTO.setAlias("(" + Certificado.A1 + ") " + fileName + " " + certificadoTO.getCnpj());
            certificadoTO.setNome(certificadoTO.getAlias());
        }
        catch (DSGECertificadoException ex) {
            a.error((Object)ex.getMessage());
            throw new DSENBusinessException((Throwable)ex, ex.getMessage());
        }
        catch (Exception ex) {
            a.error((Object)ex.getMessage());
            throw new DSENBusinessException((Throwable)ex, ex.getMessage());
        }
        return certificadoTO;
    }

    @DSGETransaction
    public RepositorioCertificadoEnum obterTipoRepositorio(EmitenteTO emitenteTO) throws DSENBusinessException {
        PropriedadeTO propriedadeTO = new PropriedadeTO();
        propriedadeTO.setEmitenteTO(emitenteTO);
        propriedadeTO.setPropriedadeEnum(PropriedadeEnum.REPOSITORIO_CERTIFICADO);
        PropriedadeTO propriedadeTOPesquisado = this.a().pesquisarPropriedade(propriedadeTO);
        if (propriedadeTOPesquisado == null) {
            propriedadeTO.setValor(RepositorioCertificadoEnum.REPOSITORIO_APLICATIVO.toString());
            propriedadeTO = this.a().alterarPropriedade(propriedadeTO);
            return RepositorioCertificadoEnum.REPOSITORIO_APLICATIVO;
        }
        if (propriedadeTOPesquisado.getValor().equals(RepositorioCertificadoEnum.REPOSITORIO_APLICATIVO.name())) {
            return RepositorioCertificadoEnum.REPOSITORIO_APLICATIVO;
        }
        return RepositorioCertificadoEnum.REPOSITORIO_WINDOWS;
    }

    @DSGETransaction
    public CertificadoInfoTO incluirCertificado(CertificadoInfoTO certificadoTO) throws DSENBusinessException {
        return this.a(certificadoTO);
    }

    private CertificadoInfoTO a(CertificadoInfoTO certificadoTO) throws DSENBusinessException {
        try {
            CertificadoInfoEntity certificadoEntity = DSENBusinessConverter.getCertificadoEntity((CertificadoInfoTO)certificadoTO);
            EmitenteEntity emitente = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)certificadoTO.getEmitenteTO());
            certificadoEntity.setEmitente(emitente);
            this.a().insert((Serializable)certificadoEntity);
            certificadoTO = DSENBusinessConverter.getCertificadoTO((CertificadoInfoEntity)certificadoEntity);
            a.debug((Object)("<Certf> inclu\u00eddo: " + certificadoTO.getAlias()));
        }
        catch (DSENConverterException ex) {
            a.error((Object)ex.getMessage());
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSGEDAOException ex) {
            a.error((Object)ex.getMessage());
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        certificadoTO.addMessage(DSENMessageConstants.CERT_CADASTRADO_COM_SUCESSO);
        return certificadoTO;
    }

    @DSGETransaction
    public void usarRepositorioWindows(EmitenteTO emitenteTO) throws DSENBusinessException {
        try {
            this.a().excluirCertificadoPorEmitente(emitenteTO.getIdEmitente());
        }
        catch (DSENDAOException e) {
            a.error((Object)e.getMessage());
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        PropriedadeBusiness propriedadeBusiness = this.a();
        PropriedadeTO propriedadeTO = new PropriedadeTO();
        propriedadeTO.setEmitenteTO(emitenteTO);
        propriedadeTO.setPropriedadeEnum(PropriedadeEnum.REPOSITORIO_CERTIFICADO);
        PropriedadeTO propriedadeTOPesquisado = propriedadeBusiness.pesquisarPropriedade(propriedadeTO);
        if (propriedadeTOPesquisado != null) {
            propriedadeTO = propriedadeTOPesquisado;
        }
        propriedadeTO.setValor(RepositorioCertificadoEnum.REPOSITORIO_WINDOWS.toString());
        propriedadeTO = propriedadeBusiness.alterarPropriedade(propriedadeTO);
        a.debug((Object)"<Certf> usando Repositorio Windows");
    }

    private PropriedadeBusiness a() throws DSENBusinessException {
        try {
            if (this.a == null) {
                this.a = (PropriedadeBusiness)DSGEBusinessFactory.create((String)PropriedadeBusiness.class.getName());
            }
            return this.a;
        }
        catch (Exception ex) {
            a.error((Object)ex.getMessage());
            throw new DSENBusinessException((Throwable)ex, ex.getMessage());
        }
    }

    @DSGETransaction
    public void usarRepositorioAplicativo(EmitenteTO emitenteTO) throws DSENBusinessException {
        PropriedadeTO propriedadeTO = new PropriedadeTO();
        propriedadeTO.setEmitenteTO(emitenteTO);
        propriedadeTO.setPropriedadeEnum(PropriedadeEnum.REPOSITORIO_CERTIFICADO);
        PropriedadeTO propriedadeTOPesquisado = this.a().pesquisarPropriedade(propriedadeTO);
        if (propriedadeTOPesquisado != null) {
            propriedadeTO = propriedadeTOPesquisado;
        }
        propriedadeTO.setValor(RepositorioCertificadoEnum.REPOSITORIO_APLICATIVO.toString());
        this.a().alterarPropriedade(propriedadeTO);
        a.debug((Object)"<Certf> usando Repositorio Aplicativo");
    }

    @DSGETransaction
    public List<CertificadoInfoTO> excluirCertificados(List<CertificadoInfoTO> certificadoInfoTOList) throws DSENBusinessException {
        ArrayList<CertificadoInfoTO> lista = new ArrayList<CertificadoInfoTO>();
        if (certificadoInfoTOList != null) {
            for (CertificadoInfoTO certificadoInfoTO : certificadoInfoTOList) {
                try {
                    CertificadoInfoEntity certificadoEntity = DSENBusinessConverter.getCertificadoEntity((CertificadoInfoTO)certificadoInfoTO);
                    this.a().delete((Serializable)certificadoEntity);
                    a.debug((Object)("<Certf> certificado exclu\u00eddo: " + certificadoInfoTO.getAlias()));
                    lista.add(certificadoInfoTO);
                }
                catch (DSENConverterException ex) {
                    a.error((Object)ex.getMessage());
                }
                catch (DSGEDAOException ex) {
                    a.error((Object)ex.getMessage());
                }
            }
        }
        if (lista.size() > 0) {
            lista.get(0).addMessage("" + lista.size() + DSENMessageConstants.CERT_EXCLIDO_COM_SUCESSO);
        }
        return lista;
    }

    @DSGETransaction
    public List<CertificadoInfoTO> pesquisarCertificados(EmitenteTO emitenteTO) throws DSENBusinessException {
        List certificadoEntityLista = null;
        ArrayList<CertificadoInfoTO> certificadoTOLista = null;
        try {
            certificadoTOLista = new ArrayList<CertificadoInfoTO>();
            certificadoEntityLista = new ArrayList();
            EmitenteEntity emitenteEntity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)emitenteTO);
            certificadoEntityLista = this.a().pesquisarCertificados(emitenteEntity);
            if (certificadoEntityLista != null) {
                for (CertificadoInfoEntity entity : certificadoEntityLista) {
                    CertificadoInfoTO certificadoTO = DSENBusinessConverter.getCertificadoTO((CertificadoInfoEntity)entity);
                    certificadoTOLista.add(certificadoTO);
                }
            }
        }
        catch (DSENConverterException ex) {
            a.error((Object)ex.getMessage());
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSENDAOException ex) {
            a.error((Object)ex.getMessage());
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        a.debug((Object)("<Certf> certificadoInfo.size: " + certificadoTOLista.size()));
        return certificadoTOLista;
    }

    public List<CertificadoInfoTO> pesquisarCertificadosIE(EmitenteTO emitenteTO) throws DSENBusinessException {
        try {
            List list = new Certificado().procurarRepositorioIE();
            List listReposInfTO = null;
            if (list != null && list.size() > 0) {
                listReposInfTO = DSENBusinessConverter.getCertificadoInfoTO((List)list, (EmitenteTO)emitenteTO);
            }
            return listReposInfTO;
        }
        catch (DSGECertificadoException t) {
            throw new DSENBusinessException((Throwable)t, t.getMessage());
        }
    }

    public Map<X509Certificate, PrivateKey> recuperarCertificadoIE(CertificadoInfoTO cTO) throws DSENBusinessException {
        try {
            return new Certificado().recuperarCertificadosRepositorioIE(DSENBusinessConverter.getRepositorioInfo((CertificadoInfoTO)cTO));
        }
        catch (DSGECertificadoException e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    public Map<X509Certificate, PrivateKey> recuperarCertificado(String pwd, CertificadoInfoTO cTO) throws DSENBusinessException {
        try {
            return new Certificado().recuperarCertificado(pwd, DSENBusinessConverter.getRepositorioInfo((CertificadoInfoTO)cTO));
        }
        catch (DSGECertificadoException e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    public String validarCertificado(TipoCertificadoEnum tipo, X509Certificate certificado, String cnpj) {
        return new Certificado().validarCertificado(tipo, certificado, cnpj);
    }

    @DSGETransaction
    public List<CertificadoInfoTO> incluirA3BuscaAutomatica(String caminho) throws DSENBusinessException {
        String defaultSearchPath;
        String libraryExtension;
        String sistemaOperacionalStr;
        a.debug((Object)("incluirA3BuscaAutomatica - INICIO" + caminho));
        AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.PARAMETRO_BUSCA_A3_PAUSADO, (Object)false);
        EmitenteTO emitente = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
        ArrayList<CertificadoInfoTO> certificadoLista = new ArrayList<CertificadoInfoTO>();
        List listRepositorio = null;
        Certificado certificado = new Certificado();
        String string = sistemaOperacionalStr = System.getProperty("os.name") != null ? System.getProperty("os.name").toLowerCase() : "";
        if (sistemaOperacionalStr.indexOf("windows") >= 0) {
            String windir = System.getenv("WINDIR");
            if (StringHelper.isBlankOrNull((Object)windir)) {
                a.debug((Object)"incluirA3BuscaAutomatica - n\u00e3o conseguiu achar a vari\u00e1vel de ambiente WINDIR");
                windir = "C:" + File.separator + "WINDOWS";
            }
            libraryExtension = ".dll";
            defaultSearchPath = windir + File.separator + "system32" + File.separator;
        } else if (sistemaOperacionalStr.indexOf("linux") >= 0) {
            libraryExtension = ".so";
            defaultSearchPath = "/usr/lib/";
        } else {
            a.debug((Object)"incluirA3BuscaAutomatica - n\u00e3o \u00e9 compat\u00edvel com outros sistemas operacionais");
            return null;
        }
         filenameFilter = new /* Unavailable Anonymous Inner Class!! */;
        if (StringHelper.isBlankOrNull((Object)caminho)) {
            caminho = defaultSearchPath;
        }
        File searchFile = new File(caminho);
        a.debug((Object)("caminho=" + caminho));
        File[] files = new File[]{searchFile};
        if (searchFile.isDirectory()) {
            files = searchFile.listFiles((FilenameFilter)filenameFilter);
        }
        for (int i = 0; i < files.length; ++i) {
            a.debug((Object)("" + i + " - search file=" + files[i].getAbsolutePath()));
            if (files[i].getAbsolutePath().contains("stdvcl32.dll")) {
                System.out.println(files[i].getAbsolutePath());
                continue;
            }
            if (!Thread.interrupted()) {
                while (((Boolean)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.PARAMETRO_BUSCA_A3_PAUSADO, Boolean.class)).booleanValue()) {
                    try {
                        Thread.sleep(500);
                    }
                    catch (InterruptedException interruptedException) {}
                }
                Notificador.getInstance().notificar((Object)files[i].getAbsolutePath(), new EnumItf[]{GrupoNotificacaoEnum.CERTIFICADO_BUSCA_AUTOMATICA_ARQUIVO_LIDO});
                listRepositorio = certificado.procurarRepositorio(files[i].getAbsolutePath(), libraryExtension);
                if (listRepositorio == null) continue;
                for (RepositorioInfo repInfo : listRepositorio) {
                    Map certificados = null;
                    int tentativas = 1;
                    GrupoNotificacaoEnum notifEnum = GrupoNotificacaoEnum.CERTIFICADO_SENHA_A3;
                    while (tentativas++ <= DSENConstants.MAX_TENTATIVAS_SENHA_A3) {
                        try {
                            if (Thread.interrupted()) {
                                return null;
                            }
                            Notificador.getInstance().notificar((Object)repInfo, new EnumItf[]{notifEnum});
                            String senha = (String)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.PARAMETRO_SENHA_A3, String.class);
                            if (senha == null) break;
                            certificados = certificado.recuperarCertificadosRepositorio(repInfo, senha);
                            break;
                        }
                        catch (DSGECertificadoSenhaException e) {
                            a.info((Object)("Senha incorreta para recuperar os certificados do repositorioInfo nome=" + repInfo.getNome() + " caminho=" + repInfo.getCaminho()), (Throwable)e);
                            notifEnum = GrupoNotificacaoEnum.CERTIFICADO_SENHA_ERRADA_A3;
                        }
                        catch (Throwable e) {
                            a.error((Object)("Erro ao recuperar certificados do repositorioInfo nome=" + repInfo.getNome() + " caminho=" + repInfo.getCaminho()), e);
                            break;
                        }
                    }
                    if (certificados == null) continue;
                    for (X509Certificate x509 : certificados.keySet()) {
                        CertificadoInfoTO certificadoTO = new CertificadoInfoTO();
                        certificadoTO.setEmitenteTO(emitente);
                        certificadoTO.setCaminho(repInfo.getCaminho());
                        certificadoTO.setTipoCertificado(repInfo.getTpCertif());
                        certificadoTO.setDataUtilizacao(repInfo.getDataUtilizacao());
                        certificadoTO.setNome(repInfo.getNome());
                        certificadoTO.setDataValidade(CertificadoHelper.getDataValidadeFim((X509Certificate)x509));
                        certificadoTO.setAutoridadeCertificadora(CertificadoHelper.getEmissor((X509Certificate)x509));
                        try {
                            certificadoTO.setCnpj(CertificadoHelper.recuperarCNPJ((X509Certificate)x509));
                        }
                        catch (DSGECertificadoInvalidoException e) {
                            a.error((Object)("Erro ao recuperar CNPJ do certificado nome=" + certificadoTO.getAlias()), (Throwable)e);
                            continue;
                        }
                        certificadoTO.setAlias("(" + repInfo.getTpCertif() + ") " + repInfo.getNome() + " " + certificadoTO.getCnpj());
                        certificadoLista.add(certificadoTO);
                    }
                }
                continue;
            }
            return null;
        }
        for (CertificadoInfoTO cert : certificadoLista) {
            this.a(cert);
        }
        return certificadoLista.isEmpty() ? null : certificadoLista;
    }

    public void atualizarCertificado(CertificadoInfoTO certificadoTO) throws DSENBusinessException {
        try {
            CertificadoInfoEntity certificadoEntity = DSENBusinessConverter.getCertificadoEntity((CertificadoInfoTO)certificadoTO);
            EmitenteEntity emitente = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)certificadoTO.getEmitenteTO());
            certificadoEntity.setEmitente(emitente);
            this.a().update((Serializable)certificadoEntity);
        }
        catch (DSENConverterException ex) {
            a.error((Object)ex.getMessage());
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSGEDAOException ex) {
            a.error((Object)ex.getMessage());
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
    }
}

