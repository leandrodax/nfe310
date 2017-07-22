/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.WSStatusRetorno
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta$ErroXmlRespostaAcao
 *  br.gov.sp.fazenda.dsen.model.business.WSBusiness
 *  br.gov.sp.fazenda.dsen.model.business.util.ConsultaStatusServicoHelper
 *  br.gov.sp.fazenda.dsen.model.business.util.ConsultaStatusServicoHelper$1
 *  br.gov.sp.fazenda.dsen.model.business.util.ScanHelper
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao
 *  br.gov.sp.fazenda.dsge.common.enumeration.ServicoSefazEnumItf
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.common.util.XMLUtil
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 */
package br.gov.sp.fazenda.dsen.model.business.util;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.WSStatusRetorno;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta;
import br.gov.sp.fazenda.dsen.model.business.WSBusiness;
import br.gov.sp.fazenda.dsen.model.business.util.ConsultaStatusServicoHelper;
import br.gov.sp.fazenda.dsen.model.business.util.ScanHelper;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao;
import br.gov.sp.fazenda.dsge.common.enumeration.ServicoSefazEnumItf;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.common.util.XMLUtil;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.text.MessageFormat;

public class ConsultaStatusServicoHelper {
    public boolean consultarStatusServico(EstadoTO emitenteEstadoTO, X509Certificate certificate, PrivateKey privateKey, ServicoSefazEnum servicoSefazEnum, boolean isSefaz, TipoEmissaoEnum tipoEmissaoEnum) throws Exception {
        String url;
        String wsReceptor = isSefaz ? DSENMessageConstants.MSG_WS_SEFAZ : DSENMessageConstants.MSG_WS_RFB;
        ScanHelper scanHelper = new ScanHelper();
        EstadoTO estadoTO = scanHelper.getEstadoTO(emitenteEstadoTO, isSefaz, tipoEmissaoEnum);
        String consultaStatusServicoCabecalho = DocumentoUtil.criarCabecalhoMensagem((ServicoSefazEnum)ServicoSefazEnum.StatusServico, (String)emitenteEstadoTO.getCodigo(), (String)DSENProperties.getInstance().getVersaoSchemaStatusServico());
        WSBusiness wsbusiness = new WSBusiness();
        try {
            url = DSENUtilHelper.getInstance().getURLPorUF(estadoTO, (ServicoSefazEnumItf)ServicoSefazEnum.StatusServico);
        }
        catch (Exception e) {
            Notificador.getInstance().notificar((Object)MessageFormat.format(DSENMessageConstants.UF_NAO_HABILITADA, estadoTO.getSigla()), new EnumItf[]{GrupoNotificacaoEnum.UF_NAO_HABILITADA});
            return false;
        }
        if (StringHelper.isBlankOrNull((Object)url)) {
            Notificador.getInstance().notificar((Object)MessageFormat.format(DSENMessageConstants.UF_NAO_HABILITADA, estadoTO.getSigla()), new EnumItf[]{GrupoNotificacaoEnum.UF_NAO_HABILITADA});
            return false;
        }
        if (DSENConstants.CONSULTA_STATUS_SERVICO_HABILITADA) {
            String consultaStatusServicoRetorno = wsbusiness.servico(consultaStatusServicoCabecalho, DocumentoUtil.criarConsStatServDocument((String)emitenteEstadoTO.getCodigo()), estadoTO, ServicoSefazEnum.StatusServico, certificate, privateKey);
            WSStatusRetorno statusRetorno = DocumentoUtil.validarRetConsStatServDocument((String)consultaStatusServicoRetorno);
            switch (1.a[statusRetorno.ordinal()]) {
                case 1: {
                    ErroXmlResposta erroXmlResposta = new ErroXmlResposta(servicoSefazEnum, url, consultaStatusServicoRetorno, isSefaz ? DSENMessageConstants.MSG_WS_SEFAZ : DSENMessageConstants.MSG_WS_RFB);
                    GrupoNotificacaoEnum gEnum = GrupoNotificacaoEnum.ERRO_RESPOSTA_SEFAZ_CONSULTA_STATUS;
                    Notificador.getInstance().notificar((Object)erroXmlResposta, new EnumItf[]{gEnum});
                    ErroXmlResposta.ErroXmlRespostaAcao acao = (ErroXmlResposta.ErroXmlRespostaAcao)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.ERRO_XML_RETORNO_ACAO, ErroXmlResposta.ErroXmlRespostaAcao.class);
                    if (ErroXmlResposta.ErroXmlRespostaAcao.FECHAR.equals((Object)acao)) {
                        return false;
                    }
                    return true;
                }
                case 2: {
                    return true;
                }
                case 3: 
                case 4: {
                    if (servicoSefazEnum == ServicoSefazEnum.Recepcao) break;
                    return true;
                }
            }
            String mensagemErro = MessageFormat.format(DSENMessageConstants.MSG_WS_RETORNO_NOK, wsReceptor, XMLUtil.getTagConteudo((String)consultaStatusServicoRetorno, (String)"cStat", (boolean)false).get(0), XMLUtil.getTagConteudo((String)consultaStatusServicoRetorno, (String)"xMotivo", (boolean)false).get(0));
            ProblemaConexaoAcao problemaConexaoAcao = this.a(mensagemErro, isSefaz);
            if (problemaConexaoAcao == ProblemaConexaoAcao.RECONECTAR) {
                return this.consultarStatusServico(emitenteEstadoTO, certificate, privateKey, servicoSefazEnum, isSefaz, tipoEmissaoEnum);
            }
            return false;
        }
        return true;
    }

    private ProblemaConexaoAcao a(String mensagemErro, boolean isSefaz) {
        if (isSefaz) {
            Notificador.getInstance().notificar((Object)mensagemErro, new EnumItf[]{GrupoNotificacaoEnum.CONSULTA_STATUS_SERVICO_NOK_SEFAZ});
        } else {
            Notificador.getInstance().notificar((Object)mensagemErro, new EnumItf[]{GrupoNotificacaoEnum.CONSULTA_STATUS_SERVICO_NOK_SCAN});
        }
        ProblemaConexaoAcao problemaConexaoAcao = (ProblemaConexaoAcao)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO, ProblemaConexaoAcao.class);
        AppContext.getInstance().removeContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO);
        return problemaConexaoAcao;
    }
}

