/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.RepositorioCertificadoEnum
 *  br.gov.sp.fazenda.dsen.common.to.AvisoTO
 *  br.gov.sp.fazenda.dsen.common.to.BackupRestoreTO
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoInfoTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.PropriedadeTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO
 *  br.gov.sp.fazenda.dsen.model.business.AvisoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.BackupBusiness
 *  br.gov.sp.fazenda.dsen.model.business.CertificadoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.ControleVersaoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.EmitenteBusiness
 *  br.gov.sp.fazenda.dsen.model.business.PropriedadeBusiness
 *  br.gov.sp.fazenda.dsen.model.business.factory.BusinessFactory
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.SistemaFacade
 *  br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.model.business.DSGEBusinessFactory
 */
package br.gov.sp.fazenda.dsen.model.facade;

import br.gov.sp.fazenda.dsen.common.enumeration.RepositorioCertificadoEnum;
import br.gov.sp.fazenda.dsen.common.to.AvisoTO;
import br.gov.sp.fazenda.dsen.common.to.BackupRestoreTO;
import br.gov.sp.fazenda.dsen.common.to.CertificadoInfoTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.PropriedadeTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO;
import br.gov.sp.fazenda.dsen.model.business.AvisoBusiness;
import br.gov.sp.fazenda.dsen.model.business.BackupBusiness;
import br.gov.sp.fazenda.dsen.model.business.CertificadoBusiness;
import br.gov.sp.fazenda.dsen.model.business.ControleVersaoBusiness;
import br.gov.sp.fazenda.dsen.model.business.EmitenteBusiness;
import br.gov.sp.fazenda.dsen.model.business.PropriedadeBusiness;
import br.gov.sp.fazenda.dsen.model.business.factory.BusinessFactory;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoBusiness;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.model.business.DSGEBusinessFactory;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class SistemaFacade {
    private BackupBusiness a;
    private AvisoBusiness a;
    private PropriedadeBusiness a;
    private ControleVersaoBusiness a;
    private ImportacaoBusiness a;
    private CertificadoBusiness a;
    private EmitenteBusiness a;

    public boolean executarRestore(BackupRestoreTO caminhoBackup) throws DSENBusinessException {
        return this.a().executarRestore(caminhoBackup);
    }

    public boolean executarBackup(BackupRestoreTO caminhoBackup) throws DSENBusinessException {
        return this.a().executarBackup(caminhoBackup);
    }

    public void verificarVersao() throws DSENBusinessException {
        ControleVersaoBusiness cBusiness = this.a();
        cBusiness.verificarVersao();
    }

    public AvisoTO verificarAvisos(EmitenteTO emitenteTO) throws DSENBusinessException {
        return this.a().verificarAvisos(emitenteTO);
    }

    public void salvarUltimaVisualFaixaInutil(PropriedadeTO propriedadeTO) throws DSENBusinessException {
        this.a().salvarUltimaVisualFaixaInutil(propriedadeTO);
    }

    public PropriedadeTO pesquisarPropriedade(PropriedadeTO propriedadeTO) throws DSENBusinessException {
        return this.a().pesquisarPropriedade(propriedadeTO);
    }

    public PropriedadeTO alterarPropriedade(PropriedadeTO propriedadeTO) throws DSENBusinessException {
        return this.a().alterarPropriedade(propriedadeTO);
    }

    public void gerarCopiaSegurancaEmitente(EmitenteTO emitenteTO, String copiaSegurancaPath) throws DSENBusinessException {
        this.a().gerarCopiaSeguranca(emitenteTO, copiaSegurancaPath);
    }

    public EmitenteTO restaurarCopiaSegurancaEmitente(String copiaSegurancaPath, Boolean sobrescreverEmitente) throws DSENBusinessException {
        return this.a().restaurarCopiaSeguranca(copiaSegurancaPath, sobrescreverEmitente);
    }

    public List<ImportacaoTelaTO> listarArquivoImportacao(String path) throws DSENBusinessException {
        return this.a().listarArquivoImportacao(path);
    }

    public ImportacaoResultadoTO importarArquivo(List<ImportacaoTelaTO> listaArquivos) throws DSGEBaseException {
        return this.a().importarArquivo(listaArquivos);
    }

    public CertificadoInfoTO obterInformacoesCertificadoA1(String caminho, String senha) throws DSENBusinessException {
        return this.a().obterInformacoesCertificadoA1(caminho, senha);
    }

    public CertificadoInfoTO incluirCertificado(CertificadoInfoTO certificadoTO) throws DSENBusinessException {
        return this.a().incluirCertificado(certificadoTO);
    }

    public void usarRepositorioWindows(EmitenteTO emitenteTO) throws DSENBusinessException {
        this.a().usarRepositorioWindows(emitenteTO);
    }

    public void usarRepositorioAplicativo(EmitenteTO emitenteTO) throws DSENBusinessException {
        this.a().usarRepositorioAplicativo(emitenteTO);
    }

    public List<CertificadoInfoTO> excluirCertificados(List<CertificadoInfoTO> certificadoTOList) throws DSENBusinessException {
        return this.a().excluirCertificados(certificadoTOList);
    }

    public List<CertificadoInfoTO> pesquisarCertificados(EmitenteTO emitenteTO) throws DSENBusinessException {
        return this.a().pesquisarCertificados(emitenteTO);
    }

    public List<CertificadoInfoTO> pesquisarCertificadosIE(EmitenteTO emitenteTO) throws DSENBusinessException {
        return this.a().pesquisarCertificadosIE(emitenteTO);
    }

    public Map<X509Certificate, PrivateKey> recuperarCertificadoIE(CertificadoInfoTO certTO) throws DSENBusinessException {
        return this.a().recuperarCertificadoIE(certTO);
    }

    public Map<X509Certificate, PrivateKey> recuperarCertificado(String pwd, CertificadoInfoTO certTO) throws DSENBusinessException {
        return this.a().recuperarCertificado(pwd, certTO);
    }

    public String validarCertificado(TipoCertificadoEnum tipo, X509Certificate certificado, String cnpj) throws DSENBusinessException {
        return this.a().validarCertificado(tipo, certificado, cnpj);
    }

    public void atualizarCertificado(CertificadoInfoTO to) throws DSENBusinessException {
        this.a().atualizarCertificado(to);
    }

    public List<CertificadoInfoTO> incluirA3BuscaAutomatica(String diretorio) throws DSENBusinessException {
        return this.a().incluirA3BuscaAutomatica(diretorio);
    }

    public RepositorioCertificadoEnum obterTipoRepositorio(EmitenteTO emitenteTO) throws DSENBusinessException {
        return this.a().obterTipoRepositorio(emitenteTO);
    }

    private BackupBusiness a() throws DSENBusinessException {
        try {
            if (this.a == null) {
                this.a = (BackupBusiness)BusinessFactory.create((String)BackupBusiness.class.getName());
            }
            return this.a;
        }
        catch (Exception e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    private AvisoBusiness a() throws DSENBusinessException {
        try {
            if (this.a == null) {
                this.a = (AvisoBusiness)BusinessFactory.create((String)AvisoBusiness.class.getName());
            }
            return this.a;
        }
        catch (Exception ex) {
            throw new DSENBusinessException((Throwable)ex, ex.getMessage());
        }
    }

    private PropriedadeBusiness a() throws DSENBusinessException {
        try {
            if (this.a == null) {
                this.a = (PropriedadeBusiness)BusinessFactory.create((String)PropriedadeBusiness.class.getName());
            }
            return this.a;
        }
        catch (Exception ex) {
            throw new DSENBusinessException((Throwable)ex, ex.getMessage());
        }
    }

    private ControleVersaoBusiness a() throws DSENBusinessException {
        try {
            if (this.a == null) {
                this.a = new ControleVersaoBusiness();
            }
            return this.a;
        }
        catch (Exception e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    private ImportacaoBusiness a() throws DSENBusinessException {
        try {
            if (this.a == null) {
                this.a = (ImportacaoBusiness)BusinessFactory.create((String)ImportacaoBusiness.class.getName());
            }
            return this.a;
        }
        catch (Exception e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    private CertificadoBusiness a() throws DSENBusinessException {
        try {
            if (this.a == null) {
                this.a = (CertificadoBusiness)DSGEBusinessFactory.create((String)CertificadoBusiness.class.getName());
            }
            return this.a;
        }
        catch (Exception ex) {
            throw new DSENBusinessException((Throwable)ex, ex.getMessage());
        }
    }

    private EmitenteBusiness a() throws DSENBusinessException {
        try {
            if (this.a == null) {
                this.a = (EmitenteBusiness)DSGEBusinessFactory.create((String)EmitenteBusiness.class.getName());
            }
            return this.a;
        }
        catch (Exception ex) {
            throw new DSENBusinessException((Throwable)ex, ex.getMessage());
        }
    }
}

