/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO$Status
 *  br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.model.business.importacao.BaseImportacaoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ValidacaoChaveAcessoImport
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.common.util.XMLUtil
 */
package br.gov.sp.fazenda.dsen.model.business.importacao;

import br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO;
import br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.model.business.importacao.BaseImportacaoBusiness;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.common.util.XMLUtil;
import java.text.ParseException;
import java.util.List;

public class ValidacaoChaveAcessoImport {
    private ExtensaoArquivoEnum a;

    public ValidacaoChaveAcessoImport(ExtensaoArquivoEnum extensaoArquivo) {
        this.a = extensaoArquivo;
    }

    public void validar(String idRegistro, NotaFiscalTO nfeTO, List<ImportacaoErroTO> info) {
        String xmlIde = XMLUtil.getFirstTagConteudo((String)nfeTO.getDocXmlString(), (String)"ide", (boolean)true, (boolean)false);
        String cnpjEmitente = nfeTO.getEmitenteTO().getNrDocumento();
        String cUF = XMLUtil.getFirstTagConteudo((String)xmlIde, (String)"cUF", (boolean)false, (boolean)false);
        String codigoNumerico = nfeTO.getCodigoNumericoChaveAcesso();
        String digitoVerificador = nfeTO.getDigitoChaveAcesso();
        String numero = nfeTO.getNumero();
        String ano = nfeTO.getAno();
        String mes = nfeTO.getMes();
        String modelo = nfeTO.getModelo();
        String serie = nfeTO.getSerie();
        String chaveCalculada = "";
        String digitoCalculado = "";
        if (StringHelper.isBlankOrNull((Object)codigoNumerico)) {
            if (ExtensaoArquivoEnum.TXT.equals((Object)this.a)) {
                if (!StringHelper.isBlankOrNull((Object)idRegistro) && !"NFe".equals(idRegistro)) {
                    info.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.WARNING, (String)"infNFe", (String)DSENMessageConstants.MSG_IMPORTACAO_ID_NFE_TROCADO_CNF_NAO_INFORMADO, (Object[])new Object[]{"NFe"}));
                }
                this.b(nfeTO, "NFe");
                if (!StringHelper.isBlankOrNull((Object)digitoVerificador)) {
                    info.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.WARNING, (String)"infNFe", (String)DSENMessageConstants.MSG_IMPORTACAO_CDV_REMOVIDO_CNF_NAO_INFORMADO, (Object[])new Object[0]));
                    this.a(nfeTO, "");
                }
                return;
            }
            if (ExtensaoArquivoEnum.XML.equals((Object)this.a)) {
                info.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"infNFe", (String)DSENMessageConstants.MSG_IMPORTACAO_ID_NFE_TROCADO_CNF_NAO_INFORMADO, (Object[])new Object[0]));
                return;
            }
        } else {
            try {
                digitoCalculado = ChaveAcessoUtil.gerarDigitoChaveAcesso((String)cUF, (String)ano, (String)mes, (String)cnpjEmitente, (String)modelo, (String)serie, (String)numero, (String)nfeTO.getTipoEmissao().getCodigo(), (String)codigoNumerico);
                if (!StringHelper.isBlankOrNull((Object)digitoVerificador)) {
                    if (!digitoVerificador.equals(digitoCalculado)) {
                        if (ExtensaoArquivoEnum.TXT.equals((Object)this.a)) {
                            info.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.WARNING, (String)"cDV", (String)DSENMessageConstants.MSG_IMPORTACAO_CDV_TROCADO, (Object[])new Object[]{digitoVerificador, digitoCalculado}));
                            this.a(nfeTO, digitoCalculado);
                            digitoVerificador = digitoCalculado;
                        } else if (ExtensaoArquivoEnum.XML.equals((Object)this.a)) {
                            info.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"cDV", (String)DSENMessageConstants.MSG_IMPORTACAO_CDV_INCORRETO, (Object[])new Object[]{digitoVerificador, digitoCalculado}));
                            return;
                        }
                    }
                } else if (ExtensaoArquivoEnum.TXT.equals((Object)this.a)) {
                    this.a(nfeTO, digitoCalculado);
                    digitoVerificador = digitoCalculado;
                } else if (ExtensaoArquivoEnum.XML.equals((Object)this.a)) {
                    info.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"cDV", (String)DSENMessageConstants.MSG_IMPORTACAO_CDV_NAO_INFORMADO, (Object[])new Object[0]));
                    return;
                }
                chaveCalculada = ChaveAcessoUtil.gerarChaveAcessoTO((NotaFiscalTO)nfeTO).getChaveAcesso();
            }
            catch (ParseException e) {
                chaveCalculada = "";
            }
        }
        if (!idRegistro.equals(chaveCalculada)) {
            if (ExtensaoArquivoEnum.TXT.equals((Object)this.a)) {
                info.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.WARNING, (String)"infNFe", (String)DSENMessageConstants.MSG_IMPORTACAO_ID_NFE_TROCADO, (Object[])new Object[]{"NFe" + idRegistro, "NFe" + chaveCalculada}));
                this.b(nfeTO, "NFe" + chaveCalculada);
            } else if (ExtensaoArquivoEnum.XML.equals((Object)this.a)) {
                info.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"infNFe", (String)DSENMessageConstants.MSG_IMPORTACAO_ID_NFE_X_INVALIDO_CALCULADO_Y, (Object[])new Object[]{"NFe" + idRegistro, "NFe" + chaveCalculada}));
            }
        }
    }

    private void a(NotaFiscalTO nfeTO, String novoDigito) {
        nfeTO.setDigitoChaveAcesso(novoDigito);
        nfeTO.setDocXmlString(XMLUtil.alterarTagConteudo((String)nfeTO.getDocXmlString(), (String)"cDV", (String)novoDigito));
    }

    private void b(NotaFiscalTO nfeTO, String novoId) {
        nfeTO.setDocXmlString(XMLUtil.alterarAtributoTag((String)nfeTO.getDocXmlString(), (String)"infNFe", (String)"Id", (String)novoId));
    }
}

