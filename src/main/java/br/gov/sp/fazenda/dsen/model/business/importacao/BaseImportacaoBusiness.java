/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.DSENSchemaTypeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.importacao.SituacaoRegistroEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO$Status
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENSchemaValidator
 *  br.gov.sp.fazenda.dsen.model.business.importacao.BaseImportacaoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO
 *  br.gov.sp.fazenda.dsen.model.business.importacao.Validacao
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENValidationException
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.to.Campo
 *  br.gov.sp.fazenda.dsge.common.to.Registro
 *  br.gov.sp.fazenda.dsge.common.util.DSGEConstants
 *  br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper
 *  br.gov.sp.fazenda.dsge.common.util.IOHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface
 *  br.gov.sp.fazenda.dsge.model.business.util.DSGERegistroConverter
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEConverterException
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.MunicipioTO
 *  br.gov.sp.fazenda.dsge.util.PaisTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 */
package br.gov.sp.fazenda.dsen.model.business.importacao;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.DSENSchemaTypeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.importacao.SituacaoRegistroEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENSchemaValidator;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO;
import br.gov.sp.fazenda.dsen.model.business.importacao.Validacao;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.exception.DSENValidationException;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.to.Campo;
import br.gov.sp.fazenda.dsge.common.to.Registro;
import br.gov.sp.fazenda.dsge.common.util.DSGEConstants;
import br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper;
import br.gov.sp.fazenda.dsge.common.util.IOHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface;
import br.gov.sp.fazenda.dsge.model.business.util.DSGERegistroConverter;
import br.gov.sp.fazenda.dsge.model.exception.DSGEConverterException;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.MunicipioTO;
import br.gov.sp.fazenda.dsge.util.PaisTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import java.io.Reader;
import java.io.StringReader;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
abstract class BaseImportacaoBusiness {
    private static final String a = "[([ -\u00ff]{0,})|(\r\n|[\n\r\u2028\u2029\u0085])]*";
    private static final Pattern a = Pattern.compile("versao\\s*=\\s*[\"']?\\s*[\\d]?(\\d[.]\\d\\d)\\s*[\"']?", 8);

    BaseImportacaoBusiness() {
    }

    protected final String getVersao(String xml) {
        Matcher matcher = a.matcher(xml);
        matcher.find();
        return matcher.group(1);
    }

    protected final String lerArquivo(String nomeArquivo, String charset) throws DSENBusinessException {
        try {
            return IOHelper.readFile((String)nomeArquivo, (String)charset);
        }
        catch (Exception e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    protected final ImportacaoRegistroTO validarCaracteresEspeciais(String nomeArquivo, String conteudoArquivo) {
        boolean caracteresValidos = conteudoArquivo.matches("[([ -\u00ff]{0,})|(\r\n|[\n\r\u2028\u2029\u0085])]*");
        if (!caracteresValidos) {
            ImportacaoErroTO erro = BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)null, (String)DSENMessageConstants.MSG_IMPORTACAO_CARACTER_INVALIDO, (Object[])new Object[0]);
            return this.newImportacaoRegistro(nomeArquivo, null, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erro});
        }
        return null;
    }

    protected final Registro montarRegistro(DSGERegistroConverter converter, String conteudoArquivo, ExtensaoArquivoEnum extensaoArquivo, DSENSchemaTypeEnum schemaType) throws DSGEConverterException {
        if (ExtensaoArquivoEnum.XML.equals((Object)extensaoArquivo)) {
            return converter.getRegistroFromXML((Reader)new StringReader(conteudoArquivo), schemaType.toString());
        }
        return converter.getRegistroFromTXT(new Scanner(conteudoArquivo));
    }

    protected final ImportacaoRegistroTO executarImportacaoValidacao(Registro child, ImportacaoTelaTO importacaoTela) throws DSENValidationException {
        String versao;
        List erros = new ArrayList();
        if (importacaoTela.getExtensaoArquivo().equals((Object)ExtensaoArquivoEnum.TXT) && this.hasErro(erros = new Validacao().validar(child, versao = child.getCampo("versao").getValue()))) {
            return this.newImportacaoRegistro(importacaoTela.getNomeArquivo(), importacaoTela.getIdentificacao(), SituacaoRegistroEnum.REJEITADO, erros);
        }
        return this.newImportacaoRegistro(importacaoTela.getNomeArquivo(), importacaoTela.getIdentificacao(), SituacaoRegistroEnum.INSERIDO, erros);
    }

    protected final EmitenteTO getEmitenteAtual() {
        return (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
    }

    protected final List<ImportacaoErroTO> convertRegistroErroToImportacaoErro(Registro registro) {
        ArrayList<ImportacaoErroTO> erros = new ArrayList<ImportacaoErroTO>();
        ArrayList registroErros = new ArrayList();
        registro.getAllErrors(registroErros);
        for (String mensagemErro : registroErros) {
            erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)null, (String)mensagemErro, (Object[])new Object[0]));
        }
        ArrayList registroMessages = new ArrayList();
        registro.getAllMessages(registroMessages);
        for (String mensagemAlerta : registroMessages) {
            erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.WARNING, (String)null, (String)mensagemAlerta, (Object[])new Object[0]));
        }
        return erros;
    }

    protected final ImportacaoRegistroTO hasRegistroChildren(String nomeArquivo, Registro registroBase) {
        if (registroBase.getChildren() == null || registroBase.getChildren().isEmpty()) {
            return this.newImportacaoRegistro(nomeArquivo, null, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{new ImportacaoErroTO(null, DSENMessageConstants.MSG_IMPORTACAO_REGISTRO_OBRIGATORIO_AUSENTE, ImportacaoErroTO.Status.ERROR)});
        }
        return null;
    }

    protected final boolean rejeitado(ImportacaoRegistroTO registroTO) {
        return registroTO != null && SituacaoRegistroEnum.REJEITADO.equals((Object)registroTO.getSituacaoRegistro());
    }

    protected final boolean hasErro(List<ImportacaoErroTO> listaImportacaoErro) {
        if (listaImportacaoErro == null || listaImportacaoErro.isEmpty()) {
            return false;
        }
        for (ImportacaoErroTO importacaoErroTO : listaImportacaoErro) {
            if (!ImportacaoErroTO.Status.ERROR.equals((Object)importacaoErroTO.getStatus())) continue;
            return true;
        }
        return false;
    }

    protected void verificarAlertas(ImportacaoRegistroTO registroTO, List<ImportacaoErroTO> errosAlertas) {
        if (!this.rejeitado(registroTO)) {
            for (ImportacaoErroTO info : errosAlertas) {
                if (!ImportacaoErroTO.Status.WARNING.equals((Object)info.getStatus())) continue;
                registroTO.addImportacaoErro(info);
            }
        }
    }

    protected ExpImpInterface getTOFromRegistro(DSGERegistroConverter converter, Registro child) throws DSGEConverterException {
        return (ExpImpInterface)converter.getTOFromRegistro(child).get(0);
    }

    protected final ImportacaoRegistroTO notificarDuplicidade(String nomeArquivo, String idRegistro, String mensagem, String mensagemSobrescrever) {
        Notificador.getInstance().notificar((Object)mensagemSobrescrever, new EnumItf[]{GrupoNotificacaoEnum.IMPORTACAO_DUPLICIDADE_REGISTRO});
        boolean sobrescrever = (Boolean)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.IMPORTACAO_ACAO_DUPLICIDADE_REGISTRO, Boolean.class);
        if (!sobrescrever) {
            ImportacaoErroTO erro = BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)null, (String)mensagem, (Object[])new Object[0]);
            return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erro});
        }
        ImportacaoErroTO warning = BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.WARNING, (String)null, (String)mensagem, (Object[])new Object[0]);
        return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.ALTERADO, new ImportacaoErroTO[]{warning});
    }

    protected static final /* varargs */ ImportacaoErroTO newImportacaoErro(ImportacaoErroTO.Status status, String campo, String mensagem, Object ... argsMensagem) {
        if (argsMensagem != null) {
            return new ImportacaoErroTO(campo, MessageFormat.format(mensagem, argsMensagem), status);
        }
        return new ImportacaoErroTO(campo, mensagem, status);
    }

    protected final ImportacaoRegistroTO newImportacaoRegistro(String nomeArquivo, String idRegistro, SituacaoRegistroEnum situacaoRegistro, List<ImportacaoErroTO> erros) {
        ImportacaoRegistroTO importacaoRegistroTO = new ImportacaoRegistroTO(nomeArquivo, idRegistro, situacaoRegistro);
        importacaoRegistroTO.setImportacaoErros(erros);
        return importacaoRegistroTO;
    }

    protected final /* varargs */ ImportacaoRegistroTO newImportacaoRegistro(String nomeArquivo, String idRegistro, SituacaoRegistroEnum situacaoRegistro, ImportacaoErroTO ... erros) {
        if (erros != null) {
            ArrayList<ImportacaoErroTO> errosList = new ArrayList<ImportacaoErroTO>();
            for (int i = 0; i < erros.length; ++i) {
                errosList.add(erros[i]);
            }
            return this.newImportacaoRegistro(nomeArquivo, idRegistro, situacaoRegistro, errosList);
        }
        return this.newImportacaoRegistro(nomeArquivo, idRegistro, situacaoRegistro, new ArrayList());
    }

    protected final void addResultadoRegistro(ImportacaoResultadoTO resultadoTO, ImportacaoRegistroTO registroTO) {
        resultadoTO.getImportacaoRegistros().add(registroTO);
        if (SituacaoRegistroEnum.REJEITADO.equals((Object)registroTO.getSituacaoRegistro())) {
            resultadoTO.incrementaInsucesso();
        } else {
            resultadoTO.incrementaSucesso();
        }
    }

    protected boolean validarPais(String tipoInformacao, String cPais, String xPais, List<ImportacaoErroTO> erros, boolean permitirEX) throws DSGEUtilException {
        boolean valid = true;
        if (!StringHelper.isBlankOrNull((Object)cPais)) {
            if (!permitirEX && !DSGEConstants.BRASIL.equals(cPais)) {
                erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"xPais", (String)DSENMessageConstants.MSG_IMPORTACAO_CODIGO_PAIS_DEVE_SER_BRASIL, (Object[])new Object[]{tipoInformacao}));
                valid = false;
            } else if (!StringHelper.isBlankOrNull((Object)xPais)) {
                PaisTO paisTO = null;
                try {
                    if (!(permitirEX || "BRASIL".equals(xPais) || "Brasil".equals(xPais))) {
                        erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"cPais", (String)DSENMessageConstants.MSG_IMPORTACAO_NOME_PAIS_DEVE_SER_BRASIL, (Object[])new Object[]{tipoInformacao}));
                        return false;
                    }
                    if (DSENUtilHelper.getInstance().validaPais(cPais)) {
                        paisTO = DSENUtilHelper.getInstance().getPaisTO(cPais);
                    }
                }
                catch (Exception e) {
                    erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"cPais", (String)DSENMessageConstants.MSG_IMPORTACAO_CODIGO_PAIS_INVALIDO, (Object[])new Object[]{tipoInformacao}));
                    return false;
                }
                if (paisTO == null) {
                    erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"cPais", (String)DSENMessageConstants.MSG_IMPORTACAO_CODIGO_PAIS_INVALIDO, (Object[])new Object[]{tipoInformacao}));
                    valid = false;
                } else if (!paisTO.getNome().equalsIgnoreCase(xPais)) {
                    erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.WARNING, (String)"xPais", (String)DSENMessageConstants.MSG_IMPORTACAO_NOME_PAIS_INVALIDO, (Object[])new Object[]{tipoInformacao, cPais, xPais, paisTO.getNome()}));
                    valid = true;
                }
            }
        }
        return valid;
    }

    protected final boolean validarUF(String tipoInformacao, String cPais, String siglaUF, List<ImportacaoErroTO> erros, boolean permitirEX) throws DSGEUtilException {
        boolean valid = true;
        if (!permitirEX) {
            EstadoTO estadoTO = DSENUtilHelper.getInstance().getEstadoTOBySigla(siglaUF);
            if (estadoTO == null || "EX".equals(estadoTO.getSigla())) {
                erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"UF", (String)DSENMessageConstants.MSG_IMPORTACAO_UF_BRASIL, (Object[])new Object[]{tipoInformacao}));
                valid = false;
            }
        } else if (!StringHelper.isBlankOrNull((Object)cPais) && !StringHelper.isBlankOrNull((Object)siglaUF)) {
            if (DSGEConstants.BRASIL.equals(cPais)) {
                EstadoTO estadoTO = DSENUtilHelper.getInstance().getEstadoTOBySigla(siglaUF);
                if (estadoTO == null || "EX".equals(estadoTO.getSigla())) {
                    erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"UF", (String)DSENMessageConstants.MSG_IMPORTACAO_UF_BRASIL, (Object[])new Object[]{tipoInformacao}));
                    valid = false;
                }
            } else if (!"EX".equals(siglaUF)) {
                erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"UF", (String)DSENMessageConstants.MSG_IMPORTACAO_UF_EXTERIOR, (Object[])new Object[]{tipoInformacao}));
                valid = false;
            }
        }
        return valid;
    }

    protected final boolean validarMunicipioExterior(String tipoInformacao, String cPais, String xMun, List<ImportacaoErroTO> erros) {
        boolean valid = true;
        if (!(StringHelper.isBlankOrNull((Object)cPais) || StringHelper.isBlankOrNull((Object)xMun) || DSGEConstants.BRASIL.equals(cPais) || "Exterior".equals(xMun) || "Exterior".toUpperCase().equals(xMun))) {
            erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"xMun", (String)DSENMessageConstants.MSG_IMPORTACAO_MUNICIPIO_EXTERIOR, (Object[])new Object[]{tipoInformacao}));
            valid = false;
        }
        return valid;
    }

    protected final boolean validarNomeMunicipioSiglaUF(String tipoInformacao, String siglaUF, String xMun, ImportacaoErroTO.Status status, List<ImportacaoErroTO> erros) throws DSGEUtilException {
        EstadoTO estadoTO;
        boolean valid = true;
        if (!StringHelper.isBlankOrNull((Object)siglaUF) && !StringHelper.isBlankOrNull((Object)xMun) && (estadoTO = DSENUtilHelper.getInstance().getEstadoTOBySigla(siglaUF)) != null && DSENUtilHelper.getInstance().getMunicipioTO(estadoTO, xMun) == null) {
            erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)status, (String)"xMun", (String)DSENMessageConstants.MSG_IMPORTACAO_NOME_MUNICIPIO_UF, (Object[])new Object[]{tipoInformacao}));
            valid = false;
        }
        return valid;
    }

    protected final boolean validarCodigoMunicipioSiglaUF(String tipoInformacao, String siglaUF, String cMun, ImportacaoErroTO.Status status, List<ImportacaoErroTO> erros) throws DSGEUtilException {
        EstadoTO estadoTO;
        if (!StringHelper.isBlankOrNull((Object)siglaUF) && !StringHelper.isBlankOrNull((Object)cMun) && (estadoTO = DSENUtilHelper.getInstance().getEstadoTOBySigla(siglaUF)) != null) {
            List munList = DSENUtilHelper.getInstance().getMunicipioTO(estadoTO);
            for (MunicipioTO mun : munList) {
                if (!mun.getCodigo().equals(cMun)) continue;
                return true;
            }
            erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)status, (String)"cMun", (String)DSENMessageConstants.MSG_IMPORTACAO_CODIGO_MUNICIPIO_SIGLA_UF_INVALIDOS, (Object[])new Object[]{tipoInformacao}));
            return false;
        }
        return true;
    }

    protected final boolean validarCMunCUF(String tipoInformacao, String cUF, String cMun, ImportacaoErroTO.Status status, List<ImportacaoErroTO> erros) throws DSGEUtilException {
        if (!StringHelper.isBlankOrNull((Object)cUF) && !StringHelper.isBlankOrNull((Object)cMun)) {
            EstadoTO estadoTO = DSENUtilHelper.getInstance().getEstadoTO(cUF);
            if (estadoTO == null) {
                erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)status, (String)"cUF", (String)DSENMessageConstants.MSG_IMPORTACAO_CODIGO_UF_INEXISTENTE, (Object[])new Object[]{tipoInformacao}));
                return false;
            }
            List munList = DSENUtilHelper.getInstance().getMunicipioTO(estadoTO);
            boolean valido = false;
            for (MunicipioTO mun : munList) {
                if (!mun.getCodigo().equals(cMun)) continue;
                valido = true;
                break;
            }
            if (!valido) {
                erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)status, (String)"cMun", (String)DSENMessageConstants.MSG_IMPORTACAO_CODIGO_MUNICIPIO_CODIGO_UF_INVALIDOS, (Object[])new Object[]{tipoInformacao}));
                return false;
            }
        } else if (StringHelper.isBlankOrNull((Object)cUF) && !StringHelper.isBlankOrNull((Object)cMun)) {
            erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)status, (String)"cUF", (String)DSENMessageConstants.MSG_IMPORTACAO_UF_OBRIGATORIO_QDO_MUN_INFORMADO, (Object[])new Object[]{tipoInformacao}));
            return false;
        }
        return true;
    }

    protected final boolean validarMunicipioCodigoNome(String tipoInformacao, String cMun, String xMun, List<ImportacaoErroTO> erros) throws DSGEUtilException {
        boolean valid = true;
        if (!StringHelper.isBlankOrNull((Object)cMun) && !StringHelper.isBlankOrNull((Object)xMun)) {
            MunicipioTO municipioTO = null;
            try {
                if (DSENUtilHelper.getInstance().validaCMun(cMun)) {
                    municipioTO = DSENUtilHelper.getInstance().getMunicipioTO(cMun);
                }
            }
            catch (Throwable t) {
                erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"cMun", (String)DSENMessageConstants.MSG_IMPORTACAO_CODIGO_MUNICIPIO_INVALIDO, (Object[])new Object[]{tipoInformacao}));
                return false;
            }
            if (municipioTO == null) {
                erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"cMun", (String)DSENMessageConstants.MSG_IMPORTACAO_CODIGO_MUNICIPIO_INVALIDO, (Object[])new Object[]{tipoInformacao}));
                valid = false;
            } else if (!municipioTO.getNome().equalsIgnoreCase(xMun)) {
                erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.WARNING, (String)"xMun", (String)DSENMessageConstants.MSG_IMPORTACAO_NOME_MUNICIPIO_INVALIDO, (Object[])new Object[]{tipoInformacao, cMun, xMun, municipioTO.getNome()}));
                valid = true;
            }
        }
        return valid;
    }

    protected final boolean validarIE(String tipoInformacao, String ie, String uf, List<ImportacaoErroTO> erros) throws DSGEUtilException {
        boolean valid = true;
        if (!StringHelper.isBlankOrNull((Object)ie) && !DSENConstants.ISENTO.equalsIgnoreCase(ie)) {
            try {
                if (StringHelper.isBlankOrNull((Object)uf)) {
                    erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"UF", (String)DSENMessageConstants.MSG_IMPORTACAO_IE_SEM_UF, (Object[])new Object[0]));
                    valid = false;
                } else {
                    DSGEDocumentoHelper.validarIE((String)ie, (String)uf);
                }
            }
            catch (DSGEValidationException e) {
                erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"IE", (String)DSENMessageConstants.MSG_IMPORTACAO_IE_INVALIDA, (Object[])new Object[]{ie, tipoInformacao, uf}));
                valid = false;
            }
        }
        return valid;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final boolean validarIESUF(String tipoInformacao, String ie, String siglaUf, String codigoMunicipio, List<ImportacaoErroTO> erros) throws DSGEUtilException {
        if (!StringHelper.isBlankOrNull((Object)ie)) {
            if (!ie.matches("[0-9]{8,9}")) {
                erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"IESUF", (String)DSENMessageConstants.MSG_IMPORTACAO_IESU_INVALIDA, (Object[])new Object[]{ie, tipoInformacao}));
                return false;
            }
            if (StringHelper.isBlankOrNull((Object)siglaUf)) {
                erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"IESUF", (String)DSENMessageConstants.MSG_IMPORTACAO_IESU_INFORMAR_UF_PERTENCENTE_SUFRAMA, (Object[])new Object[]{ie, tipoInformacao}));
                return false;
            }
            if ("AP".equals(siglaUf) && StringHelper.isBlankOrNull((Object)codigoMunicipio)) {
                erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"IESUF", (String)DSENMessageConstants.MSG_IMPORTACAO_IESU_INFORMAR_MUNICIPIO_PERTENCENTE_SUFRAMA, (Object[])new Object[]{ie, tipoInformacao}));
                return false;
            }
            if ("AC".equals(siglaUf) || "AM".equals(siglaUf) || "RO".equals(siglaUf) || "RR".equals(siglaUf) || "AP".equals(siglaUf) && !StringHelper.isBlankOrNull((Object)codigoMunicipio) && (DSENConstants.CODIGO_MUNICIPIO_AP_MACAPA.equals(codigoMunicipio) || DSENConstants.CODIGO_MUNICIPIO_AP_SANTANA.equals(codigoMunicipio))) {
                try {
                    DSGEDocumentoHelper.validarIE((String)ie, (String)"SU");
                }
                catch (DSGEValidationException ex) {
                    erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"IESUF", (String)DSENMessageConstants.MSG_IMPORTACAO_IESU_INVALIDA, (Object[])new Object[]{ie, tipoInformacao}));
                    return false;
                }
            } else {
                erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"IESUF", (String)DSENMessageConstants.MSG_IMPORTACAO_IESU_UF_MUN_NAO_PERTENCE_SUFRAMA, (Object[])new Object[]{ie, tipoInformacao}));
                return false;
            }
        }
        if (StringHelper.isBlankOrNull((Object)ie)) return true;
        try {
            DSGEDocumentoHelper.validarIE((String)ie, (String)"SU");
            return true;
        }
        catch (DSGEValidationException e) {
            erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"IESUF", (String)DSENMessageConstants.MSG_IMPORTACAO_IESU_INVALIDA, (Object[])new Object[]{ie, tipoInformacao}));
            return false;
        }
    }

    protected boolean validarCnpjCpf(String tipoInformacao, String nrDocumento, TipoDocumentoEnum tipoDocumentoEnum, List<ImportacaoErroTO> erros) throws DSGEUtilException {
        boolean valid = true;
        if (!StringHelper.isBlankOrNull((Object)nrDocumento)) {
            try {
                DSGEDocumentoHelper.validarDocumento((String)nrDocumento, (TipoDocumentoEnum)tipoDocumentoEnum);
            }
            catch (DSGEValidationException e) {
                erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"nrDocumento", (String)DSENMessageConstants.MSG_IMPORTACAO_NR_DOCUMENTO_INVALIDO, (Object[])new Object[]{tipoDocumentoEnum.toString(), nrDocumento}));
                valid = false;
            }
        } else {
            erros.add(BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"nrDocumento", (String)DSENMessageConstants.MSG_IMPORTACAO_REGISTRO_OBRIGATORIO_AUSENTE, (Object[])new Object[]{tipoInformacao}));
            valid = false;
        }
        return valid;
    }

    protected final ImportacaoResultadoTO importarTemplateMethod(ImportacaoTelaTO importacaoTela) throws DSENBusinessException {
        ImportacaoResultadoTO resultadoTO = new ImportacaoResultadoTO();
        DSGERegistroConverter converter = this.getDSGERegistroConverter();
        String conteudoArquivo = this.lerArquivo(importacaoTela.getCaminhoArquivo(), importacaoTela.getCharset());
        ImportacaoRegistroTO registroTO = this.validarCaracteresEspeciais(importacaoTela.getNomeArquivo(), conteudoArquivo);
        if (this.rejeitado(registroTO)) {
            this.addResultadoRegistro(resultadoTO, registroTO);
            return resultadoTO;
        }
        if (importacaoTela.getExtensaoArquivo().equals((Object)ExtensaoArquivoEnum.XML)) {
            String versao = this.getVersao(conteudoArquivo);
            List erros = DSENSchemaValidator.getInstance().validate(DSENSchemaTypeEnum.sistema, versao, conteudoArquivo);
            if (this.hasErro(erros)) {
                ImportacaoRegistroTO registro = this.newImportacaoRegistro(importacaoTela.getNomeArquivo(), null, SituacaoRegistroEnum.REJEITADO, erros);
                this.addResultadoRegistro(resultadoTO, registro);
                return resultadoTO;
            }
        }
        Registro registroBase = null;
        try {
            registroBase = this.montarRegistro(converter, conteudoArquivo, importacaoTela.getExtensaoArquivo(), DSENSchemaTypeEnum.sistema);
        }
        catch (DSGEConverterException e) {
            ImportacaoRegistroTO registro = this.newImportacaoRegistro(importacaoTela.getNomeArquivo(), null, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)null, (String)e.getMessage(), (Object[])new Object[0])});
            this.addResultadoRegistro(resultadoTO, registro);
            return resultadoTO;
        }
        List registroErros = this.convertRegistroErroToImportacaoErro(registroBase);
        if (this.hasErro(registroErros)) {
            registroTO = this.newImportacaoRegistro(importacaoTela.getNomeArquivo(), null, SituacaoRegistroEnum.REJEITADO, registroErros);
            this.addResultadoRegistro(resultadoTO, registroTO);
            return resultadoTO;
        }
        for (Registro child : registroBase.getChildren()) {
            ImportacaoErroTO erro;
            registroErros = this.convertRegistroErroToImportacaoErro(child);
            if (this.hasErro(registroErros)) {
                registroTO = this.newImportacaoRegistro(importacaoTela.getNomeArquivo(), null, SituacaoRegistroEnum.REJEITADO, registroErros);
                this.addResultadoRegistro(resultadoTO, registroTO);
                continue;
            }
            ArrayList erros = new ArrayList();
            erros.addAll(registroErros);
            String idRegistro = null;
            try {
                registroTO = this.hasRegistroChildren(importacaoTela.getNomeArquivo(), child);
                if (this.rejeitado(registroTO)) {
                    registroTO.getImportacaoErros().addAll(erros);
                    this.addResultadoRegistro(resultadoTO, registroTO);
                    continue;
                }
                idRegistro = this.getIdRegistro(child);
                registroTO = this.executarImportacaoValidacao(child, importacaoTela);
                if (this.rejeitado(registroTO)) {
                    registroTO.setIdRegistro(idRegistro);
                    registroTO.getImportacaoErros().addAll(erros);
                    this.addResultadoRegistro(resultadoTO, registroTO);
                    continue;
                }
                if (registroTO != null && registroTO.getImportacaoErros() != null) {
                    erros.addAll(registroTO.getImportacaoErros());
                }
                ExpImpInterface importado = this.getTOFromRegistro(converter, child);
                registroTO = this.validarRegras(importacaoTela.getNomeArquivo(), idRegistro, importado);
                if (this.rejeitado(registroTO)) {
                    registroTO.getImportacaoErros().addAll(erros);
                    this.addResultadoRegistro(resultadoTO, registroTO);
                    continue;
                }
                if (registroTO != null && registroTO.getImportacaoErros() != null) {
                    erros.addAll(registroTO.getImportacaoErros());
                }
                registroTO = this.verificarDuplicidadeRegistro(importado, importacaoTela.getNomeArquivo(), idRegistro);
                registroTO.getImportacaoErros().addAll(erros);
                if (this.rejeitado(registroTO)) {
                    this.addResultadoRegistro(resultadoTO, registroTO);
                    continue;
                }
                this.atualizarRegistro(importado);
                if (importado.hasErrors()) {
                    erro = BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"Id", (String)importado.getErrorsString(), (Object[])new Object[0]);
                    registroTO = this.newImportacaoRegistro(importacaoTela.getNomeArquivo(), idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erro});
                }
                this.addResultadoRegistro(resultadoTO, registroTO);
            }
            catch (Exception e) {
                e.printStackTrace();
                erro = BaseImportacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)null, (String)(e.getClass().getSimpleName() + ": " + e.getMessage()), (Object[])new Object[0]);
                ImportacaoRegistroTO registro = this.newImportacaoRegistro(importacaoTela.getNomeArquivo(), idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erro});
                this.addResultadoRegistro(resultadoTO, registro);
            }
        }
        AppContext.getInstance().removeContextParameter((EnumItf)AppContextEnum.IMPORTACAO_ACAO_DUPLICIDADE_REGISTRO);
        return resultadoTO;
    }

    protected DSGERegistroConverter getDSGERegistroConverter() {
        throw new UnsupportedOperationException();
    }

    protected String getIdRegistro(Registro child) {
        throw new UnsupportedOperationException();
    }

    protected ImportacaoRegistroTO validarRegras(String nomeArquivo, String idRegistro, ExpImpInterface importado) throws DSGEUtilException {
        throw new UnsupportedOperationException();
    }

    protected ImportacaoRegistroTO verificarDuplicidadeRegistro(ExpImpInterface importado, String nomeArquivo, String idRegistro) throws DSENBusinessException {
        throw new UnsupportedOperationException();
    }

    protected void atualizarRegistro(ExpImpInterface importado) throws DSENBusinessException {
        throw new UnsupportedOperationException();
    }

    static {
    }
}

