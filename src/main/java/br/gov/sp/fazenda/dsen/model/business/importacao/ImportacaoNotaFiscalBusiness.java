/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.DSENSchemaTypeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEventoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.importacao.SituacaoRegistroEnum
 *  br.gov.sp.fazenda.dsen.common.exception.DSENCommonException
 *  br.gov.sp.fazenda.dsen.common.exception.DSENImportacaoException
 *  br.gov.sp.fazenda.dsen.common.to.CancelamentoTO
 *  br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.EventoTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO$Status
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO
 *  br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.common.util.DSENSchemaValidator
 *  br.gov.sp.fazenda.dsen.model.business.InutilizacaoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.NotaFiscalBusiness
 *  br.gov.sp.fazenda.dsen.model.business.expimp.DSENRegistroNotaFiscalConverter
 *  br.gov.sp.fazenda.dsen.model.business.importacao.BaseImportacaoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoNotaFiscalBusiness
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoNotaFiscalBusiness$1
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoNotaFiscalBusiness$CancelamentoConverter
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoNotaFiscalBusiness$EventoConverter
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoNotaFiscalBusiness$NotaFiscalConverter
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoNotaFiscalBusiness$TipoImportacaoEnum
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO
 *  br.gov.sp.fazenda.dsen.model.business.importacao.TipoAmbiente
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ValidacaoChaveAcessoImport
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsge.certif.Certificado
 *  br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoException
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.to.Campo
 *  br.gov.sp.fazenda.dsge.common.to.Registro
 *  br.gov.sp.fazenda.dsge.common.util.DSGEConstants
 *  br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.common.util.XMLUtil
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEConverterException
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 */
package br.gov.sp.fazenda.dsen.model.business.importacao;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.DSENSchemaTypeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEventoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.importacao.SituacaoRegistroEnum;
import br.gov.sp.fazenda.dsen.common.exception.DSENCommonException;
import br.gov.sp.fazenda.dsen.common.exception.DSENImportacaoException;
import br.gov.sp.fazenda.dsen.common.to.CancelamentoTO;
import br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.EventoTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO;
import br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsen.common.util.DSENSchemaValidator;
import br.gov.sp.fazenda.dsen.model.business.InutilizacaoBusiness;
import br.gov.sp.fazenda.dsen.model.business.NotaFiscalBusiness;
import br.gov.sp.fazenda.dsen.model.business.expimp.DSENRegistroNotaFiscalConverter;
import br.gov.sp.fazenda.dsen.model.business.importacao.BaseImportacaoBusiness;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoNotaFiscalBusiness;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO;
import br.gov.sp.fazenda.dsen.model.business.importacao.TipoAmbiente;
import br.gov.sp.fazenda.dsen.model.business.importacao.ValidacaoChaveAcessoImport;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsge.certif.Certificado;
import br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoException;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.to.Campo;
import br.gov.sp.fazenda.dsge.common.to.Registro;
import br.gov.sp.fazenda.dsge.common.util.DSGEConstants;
import br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.common.util.XMLUtil;
import br.gov.sp.fazenda.dsge.model.exception.DSGEConverterException;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public class ImportacaoNotaFiscalBusiness
extends BaseImportacaoBusiness {
    private static final String a = "NFe";
    private static final String b = "<NFe xmlns=\"http://www.portalfiscal.inf.br/nfe\">";
    private static final String c = "</NFe>";
    private static final String d = "</infNFe>";
    private static final String e = "tpAmb";
    private static final String f = "verProc";
    private static final String g = "cPais";
    private static final String h = "cUF";
    private static final String i = "procEmi";
    private static final String j = "nItem";
    private static final String k = "3";
    private static final String l = DSGEConstants.BRASIL;
    private static Log a = LogFactory.getLog(ImportacaoNotaFiscalBusiness.class);
    SimpleDateFormat a;
    private long a;
    private long b = 0;
    private long c = 0;
    private static Map<String, DSENSchemaTypeEnum> a;
    private NotaFiscalBusiness a;
    private InutilizacaoBusiness a = new InutilizacaoBusiness();

    public ImportacaoNotaFiscalBusiness() {
    }

    public ImportacaoResultadoTO importar(ImportacaoTelaTO importacaoTela) throws DSENImportacaoException {
        ImportacaoResultadoTO resultadoTO = new ImportacaoResultadoTO();
        String conteudoArquivo = null;
        try {
            conteudoArquivo = this.lerArquivo(importacaoTela.getCaminhoArquivo(), importacaoTela.getCharset());
        }
        catch (DSENBusinessException e) {
            ImportacaoRegistroTO registro = this.newImportacaoRegistro(importacaoTela.getNomeArquivo(), null, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)null, (String)e.getMessage(), (Object[])new Object[0])});
            this.addResultadoRegistro(resultadoTO, registro);
            throw new DSENImportacaoException(resultadoTO);
        }
        ImportacaoRegistroTO registroTO = this.validarCaracteresEspeciais(importacaoTela.getNomeArquivo(), conteudoArquivo);
        if (this.rejeitado(registroTO)) {
            this.addResultadoRegistro(resultadoTO, registroTO);
            throw new DSENImportacaoException(resultadoTO);
        }
        if (ExtensaoArquivoEnum.TXT.equals((Object)importacaoTela.getExtensaoArquivo())) {
            return this.a(conteudoArquivo, importacaoTela);
        }
        return this.b(conteudoArquivo, importacaoTela);
    }

    private ImportacaoResultadoTO a(String conteudoArquivo, ImportacaoTelaTO importacaoTela) throws DSENImportacaoException {
        ImportacaoResultadoTO resultadoTO = new ImportacaoResultadoTO();
        ImportacaoRegistroTO registroTO = null;
        Registro registroBase = null;
        this.a = 0;
        this.b = 0;
        this.c = 0;
        long startTempoImportacao = new Date().getTime();
        try {
            Date d = new Date();
            a.info((Object)("*** Starting converter --> " + this.a.format(d)));
            registroBase = new DSENRegistroNotaFiscalConverter().getRegistroFromTXT(new Scanner(conteudoArquivo));
            a.info((Object)("*** Finish converter in --> " + (new Date().getTime() - d.getTime()) + " ms"));
        }
        catch (DSGEConverterException e) {
            ImportacaoRegistroTO registro = this.newImportacaoRegistro(importacaoTela.getNomeArquivo(), null, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)null, (String)e.getMessage(), (Object[])new Object[0])});
            this.addResultadoRegistro(resultadoTO, registro);
            throw new DSENImportacaoException(resultadoTO);
        }
        List registroErros = this.convertRegistroErroToImportacaoErro(registroBase);
        if (this.hasErro(registroErros)) {
            registroTO = this.newImportacaoRegistro(importacaoTela.getNomeArquivo(), null, SituacaoRegistroEnum.REJEITADO, registroErros);
            this.addResultadoRegistro(resultadoTO, registroTO);
            throw new DSENImportacaoException(resultadoTO);
        }
        for (Registro child : registroBase.getChildren()) {
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
                idRegistro = child.getCampo("Id").getValue();
                if (!StringHelper.isBlankOrNull((Object)idRegistro) && (idRegistro = idRegistro.replaceFirst("NFe", "")).length() > 0 && !idRegistro.matches("[0-9]{44}")) {
                    ImportacaoErroTO erro = ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"Id", (String)DSENMessageConstants.MSG_IMPORTACAO_ID_NFE_INVALIDO, (Object[])new Object[0]);
                    ImportacaoRegistroTO registro = this.newImportacaoRegistro(importacaoTela.getNomeArquivo(), idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erro});
                    this.addResultadoRegistro(resultadoTO, registro);
                }
                if (this.rejeitado(registroTO = this.executarImportacaoValidacao(child, importacaoTela))) {
                    registroTO.setIdRegistro(idRegistro);
                    registroTO.getImportacaoErros().addAll(erros);
                    this.addResultadoRegistro(resultadoTO, registroTO);
                    continue;
                }
                if (registroTO != null && registroTO.getImportacaoErros() != null) {
                    erros.addAll(registroTO.getImportacaoErros());
                }
                this.a(child);
                registroTO = this.a(importacaoTela.getNomeArquivo(), idRegistro, "<NFe xmlns=\"http://www.portalfiscal.inf.br/nfe\">" + child.toXML() + "</NFe>", TipoImportacaoEnum.a, DSENSchemaTypeEnum.nfe, importacaoTela, erros);
                this.addResultadoRegistro(resultadoTO, registroTO);
            }
            catch (Exception e) {
                e.printStackTrace();
                ImportacaoErroTO erro = ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)null, (String)(e.getClass().getSimpleName() + ": " + e.getMessage()), (Object[])new Object[0]);
                ImportacaoRegistroTO registro = this.newImportacaoRegistro(importacaoTela.getNomeArquivo(), idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erro});
                this.addResultadoRegistro(resultadoTO, registro);
                throw new DSENImportacaoException(resultadoTO);
            }
        }
        a.info((Object)("*** Tempo BANCO --> " + (this.b + this.c) + " ms"));
        a.info((Object)("*** Tempo Consulta --> " + this.b + " ms"));
        a.info((Object)("*** Tempo Insercao --> " + this.c + " ms"));
        a.info((Object)("*** Tempo Xml para TO --> " + this.a + " ms"));
        long finishTempoImportacao = new Date().getTime();
        a.info((Object)("*** Tempo importacao --> " + (finishTempoImportacao - startTempoImportacao) + " ms"));
        return resultadoTO;
    }

    private void a(Registro reg) {
        Registro registroB = (Registro)reg.getChildren("B").get(0);
        Campo serie = registroB.getCampo("serie");
        Campo numero = registroB.getCampo("nNF");
        String serieS = serie.getValue();
        String numeroS = numero.getValue();
        if (serieS.length() > 1) {
            serie.setValue(serieS.replaceFirst("[0]{0,2}", ""));
        }
        if (numeroS.length() > 1) {
            numero.setValue(numeroS.replaceFirst("[0]{0,8}", ""));
        }
    }

    private ImportacaoResultadoTO b(String conteudoArquivo, ImportacaoTelaTO importacaoTela) throws DSENImportacaoException {
        ImportacaoResultadoTO resultadoTO = new ImportacaoResultadoTO();
        ImportacaoRegistroTO registroTO = null;
        String idRegistro = null;
        try {
            DSENSchemaTypeEnum schemaType = this.a(conteudoArquivo);
            String versao = this.getVersao(conteudoArquivo);
            idRegistro = schemaType.equals((Object)DSENSchemaTypeEnum.procCancNFe) || schemaType.equals((Object)DSENSchemaTypeEnum.retCancNFe) ? XMLUtil.getFirstTagConteudo((String)conteudoArquivo, (String)"chNFe", (boolean)false, (boolean)false) : importacaoTela.getIdentificacao();
            registroTO = this.a(importacaoTela.getNomeArquivo(), idRegistro, conteudoArquivo, versao, schemaType);
            if (this.rejeitado(registroTO)) {
                this.addResultadoRegistro(resultadoTO, registroTO);
                throw new DSENImportacaoException(resultadoTO);
            }
            registroTO = this.a(importacaoTela.getNomeArquivo(), idRegistro, conteudoArquivo, schemaType);
            if (this.rejeitado(registroTO)) {
                this.addResultadoRegistro(resultadoTO, registroTO);
                throw new DSENImportacaoException(resultadoTO);
            }
            registroTO = this.a(importacaoTela.getNomeArquivo(), idRegistro, conteudoArquivo, this.a(schemaType), schemaType, importacaoTela, new ArrayList());
            this.addResultadoRegistro(resultadoTO, registroTO);
            if (this.rejeitado(registroTO)) {
                throw new DSENImportacaoException(resultadoTO);
            }
        }
        catch (DSENImportacaoException e) {
            throw e;
        }
        catch (Exception e) {
            e.printStackTrace();
            ImportacaoErroTO erro = ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)null, (String)(e.getClass().getSimpleName() + ": " + e.getMessage()), (Object[])new Object[0]);
            ImportacaoRegistroTO registro = this.newImportacaoRegistro(importacaoTela.getNomeArquivo(), idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erro});
            this.addResultadoRegistro(resultadoTO, registro);
            throw new DSENImportacaoException(resultadoTO);
        }
        return resultadoTO;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private ImportacaoRegistroTO a(String nomeArquivo, String idRegistro, String conteudoArquivo, TipoImportacaoEnum tipoImportacao, DSENSchemaTypeEnum schemaType, ImportacaoTelaTO importacaoTela, List<ImportacaoErroTO> erros) throws DSENBusinessException, DSGEUtilException {
        try {
            ImportacaoRegistroTO registroTO = this.a(nomeArquivo, idRegistro, conteudoArquivo, tipoImportacao);
            if (this.rejeitado(registroTO)) {
                registroTO.getImportacaoErros().addAll(erros);
                ImportacaoRegistroTO importacaoRegistroTO = registroTO;
                return importacaoRegistroTO;
            }
            registroTO = this.a(nomeArquivo, idRegistro, conteudoArquivo, tipoImportacao, schemaType);
            if (this.rejeitado(registroTO)) {
                registroTO.getImportacaoErros().addAll(erros);
                ImportacaoRegistroTO importacaoRegistroTO = registroTO;
                return importacaoRegistroTO;
            }
            switch (1.a[tipoImportacao.ordinal()]) {
                case 1: {
                    registroTO = this.a(nomeArquivo, idRegistro, conteudoArquivo);
                    if (this.rejeitado(registroTO)) {
                        registroTO.getImportacaoErros().addAll(erros);
                        ImportacaoRegistroTO importacaoRegistroTO = registroTO;
                        return importacaoRegistroTO;
                    }
                    registroTO = this.a(nomeArquivo, idRegistro, conteudoArquivo, importacaoTela);
                    if (this.rejeitado(registroTO)) {
                        registroTO.getImportacaoErros().addAll(erros);
                        ImportacaoRegistroTO importacaoRegistroTO = registroTO;
                        return importacaoRegistroTO;
                    }
                    this.b(nomeArquivo, idRegistro, conteudoArquivo, importacaoTela);
                    erros.addAll(this.a(nomeArquivo, idRegistro, conteudoArquivo, importacaoTela));
                    registroTO = this.e(nomeArquivo, idRegistro, conteudoArquivo);
                    if (this.rejeitado(registroTO)) {
                        registroTO.getImportacaoErros().addAll(erros);
                        ImportacaoRegistroTO importacaoRegistroTO = registroTO;
                        return importacaoRegistroTO;
                    }
                    if (registroTO != null) {
                        erros.addAll(registroTO.getImportacaoErros());
                    }
                    if (this.rejeitado(registroTO = this.d(nomeArquivo, idRegistro, conteudoArquivo))) {
                        registroTO.getImportacaoErros().addAll(erros);
                        ImportacaoRegistroTO importacaoRegistroTO = registroTO;
                        return importacaoRegistroTO;
                    }
                    registroTO = this.c(nomeArquivo, idRegistro, conteudoArquivo);
                    if (this.rejeitado(registroTO)) {
                        registroTO.getImportacaoErros().addAll(erros);
                        ImportacaoRegistroTO importacaoRegistroTO = registroTO;
                        return importacaoRegistroTO;
                    }
                    registroTO = this.c(nomeArquivo, idRegistro, conteudoArquivo, importacaoTela);
                    if (this.rejeitado(registroTO)) {
                        registroTO.getImportacaoErros().addAll(erros);
                        ImportacaoRegistroTO importacaoRegistroTO = registroTO;
                        return importacaoRegistroTO;
                    }
                    registroTO = this.b(nomeArquivo, idRegistro, conteudoArquivo);
                    if (this.rejeitado(registroTO)) {
                        registroTO.getImportacaoErros().addAll(erros);
                        ImportacaoRegistroTO importacaoRegistroTO = registroTO;
                        return importacaoRegistroTO;
                    }
                    long startTime = new Date().getTime();
                    NotaFiscalTO notaFiscalTO = new NotaFiscalConverter(this, conteudoArquivo).a();
                    long finishTime = new Date().getTime();
                    this.a += finishTime - startTime;
                    if (importacaoTela.getExtensaoArquivo().equals((Object)ExtensaoArquivoEnum.TXT)) {
                        notaFiscalTO.setSituacao(SituacaoNFeEnum.EM_DIGITACAO);
                    }
                    startTime = new Date().getTime();
                    registroTO = this.a(notaFiscalTO, nomeArquivo, idRegistro);
                    finishTime = new Date().getTime();
                    this.b += finishTime - startTime;
                    ValidacaoChaveAcessoImport valiChave = new ValidacaoChaveAcessoImport(importacaoTela.getExtensaoArquivo());
                    valiChave.validar(idRegistro, notaFiscalTO, erros);
                    if (this.hasErro(erros)) {
                        ImportacaoRegistroTO importacaoRegistroTO = this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, erros);
                        return importacaoRegistroTO;
                    }
                    if (registroTO != null) {
                        registroTO.getImportacaoErros().addAll(erros);
                    }
                    if (this.rejeitado(registroTO)) {
                        ImportacaoRegistroTO importacaoRegistroTO = registroTO;
                        return importacaoRegistroTO;
                    }
                    if (importacaoTela.getSituacao() != null && importacaoTela.getSituacao().equals(SituacaoNFeEnum.CANCELADA_EVENTO.toString())) {
                        notaFiscalTO.setSituacao(SituacaoNFeEnum.CANCELADA_EVENTO);
                    }
                    this.a(notaFiscalTO, importacaoTela);
                    break;
                }
                case 2: {
                    registroTO = this.b(schemaType, conteudoArquivo, idRegistro, importacaoTela);
                    break;
                }
                case 3: {
                    registroTO = this.a(schemaType, conteudoArquivo, idRegistro, importacaoTela);
                }
            }
            ImportacaoRegistroTO startTime = registroTO;
            return startTime;
        }
        finally {
            AppContext.getInstance().removeContextParameter((EnumItf)AppContextEnum.IMPORTACAO_ACAO_ASSINATURA_INVALIDA);
            AppContext.getInstance().removeContextParameter((EnumItf)AppContextEnum.IMPORTACAO_ACAO_DUPLICIDADE_REGISTRO);
            AppContext.getInstance().removeContextParameter((EnumItf)AppContextEnum.IMPORTACAO_ACAO_TIPO_AMBIENTE_INVALIDO);
            AppContext.getInstance().removeContextParameter((EnumItf)AppContextEnum.IMPORTACAO_ACAO_VERPROC_DIFERENTE);
            AppContext.getInstance().removeContextParameter((EnumItf)AppContextEnum.IMPORTACAO_ACAO_PROCEMI_DIFERENTE);
            AppContext.getInstance().removeContextParameter((EnumItf)AppContextEnum.IMPORTACAO_ACAO_CPAIS_EMITENTE_DIFERENTE);
            AppContext.getInstance().removeContextParameter((EnumItf)AppContextEnum.IMPORTACAO_ACAO_CUF_NOTA_DIFERENTE);
        }
    }

    private ImportacaoRegistroTO a(DSENSchemaTypeEnum schemaType, String conteudoArquivo, String idRegistro, ImportacaoTelaTO telaTO) throws DSENBusinessException {
        ImportacaoRegistroTO registroTO;
        NotaFiscalTO nfe;
        EventoTO eventoTO;
        ArrayList<ImportacaoErroTO> errosAlertas = null;
        String versao = this.getVersao(conteudoArquivo);
        errosAlertas = DSENSchemaValidator.getInstance().validate(schemaType, versao, conteudoArquivo);
        if (this.hasErro((List)errosAlertas)) {
            ImportacaoRegistroTO registroTO2 = this.newImportacaoRegistro(telaTO.getNomeArquivo(), idRegistro, SituacaoRegistroEnum.REJEITADO, errosAlertas);
            return registroTO2;
        }
        errosAlertas = new ArrayList<ImportacaoErroTO>();
        try {
            eventoTO = new EventoConverter(this, conteudoArquivo).a();
        }
        catch (DSENCommonException e) {
            errosAlertas.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"chNFe", (String)e.getMessage(), (Object[])null));
            ImportacaoRegistroTO registroTO3 = this.newImportacaoRegistro(telaTO.getNomeArquivo(), idRegistro, SituacaoRegistroEnum.REJEITADO, errosAlertas);
            return registroTO3;
        }
        String xml = eventoTO.getXmlProcString();
        String chNFe = XMLUtil.getFirstTagConteudo((String)xml, (String)"chNFe", (boolean)false, (boolean)false);
        NotaFiscalTO nfeBanco = null;
        try {
            nfe = ChaveAcessoUtil.gerarNotaFiscalTO((ChaveAcessoTO)ChaveAcessoUtil.obterChaveAcessoTO((String)chNFe), (EmitenteTO)((EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class)));
            nfeBanco = this.a.pesquisarPorSerieNumeroEmitente(nfe);
        }
        catch (DSGEBaseException e) {
            errosAlertas.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"chNFe", (String)e.getMessage(), (Object[])null));
            ImportacaoRegistroTO registroTO4 = this.newImportacaoRegistro(telaTO.getNomeArquivo(), idRegistro, SituacaoRegistroEnum.REJEITADO, errosAlertas);
            return registroTO4;
        }
        if (nfeBanco == null) {
            errosAlertas.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)chNFe, (String)DSENMessageConstants.MSG_IMPORTACAO_NFE_INEXISTENTE_CHAVE, (Object[])new Object[]{chNFe}));
            ImportacaoRegistroTO registroTO5 = this.newImportacaoRegistro(telaTO.getNomeArquivo(), idRegistro, SituacaoRegistroEnum.REJEITADO, errosAlertas);
            return registroTO5;
        }
        switch (1.b[nfeBanco.getSituacao().ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                break;
            }
            default: {
                errosAlertas.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)chNFe, (String)DSENMessageConstants.MSG_IMPORTACAO_SITUACAO_NFE_NAO_PERMITE_ASSOCIACAO_EVENTO, (Object[])new Object[]{nfeBanco.getSituacao().getDescricao(), nfeBanco.getSerie(), nfeBanco.getNumero(), eventoTO.getTpEvento().getDescricao()}));
                ImportacaoRegistroTO registroTO6 = this.newImportacaoRegistro(telaTO.getNomeArquivo(), idRegistro, SituacaoRegistroEnum.REJEITADO, errosAlertas);
                return registroTO6;
            }
        }
        List eventosBanco = nfeBanco.getEventoTOList();
        EventoTO eventoTOBanco = null;
        if (eventosBanco != null) {
            for (EventoTO evTO : eventosBanco) {
                if (!evTO.getTpEvento().equals((Object)eventoTO.getTpEvento()) || !evTO.getnSeqEvento().equals(eventoTO.getnSeqEvento())) continue;
                eventoTOBanco = evTO;
                break;
            }
        }
        if (eventoTOBanco != null) {
            String mensagem = MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_NFE_EVENTO_EXISTENTE, eventoTO.getTpEvento().getDescricao(), eventoTO.getnSeqEvento(), nfe.getSerie(), nfe.getNumero());
            String mensagemSobrescrever = mensagem + DSENMessageConstants.MSG_IMPORTACAO_DUPLICIDADE_SOBRESCREVER;
            registroTO = this.notificarDuplicidade(telaTO.getNomeArquivo(), idRegistro, mensagem, mensagemSobrescrever);
            if (this.rejeitado(registroTO)) {
                return registroTO;
            }
            eventoTOBanco.setDataEvento(eventoTO.getDataEvento());
            eventoTOBanco.setDataRegEvento(eventoTO.getDataRegEvento());
            eventoTOBanco.setNumProtocolo(eventoTO.getNumProtocolo());
            eventoTOBanco.setXmlProcString(eventoTO.getXmlProcString());
        } else {
            eventoTO.setNotaFiscalTO(nfe);
            ArrayList<EventoTO> eventosNfe = nfeBanco.getEventoTOList();
            if (eventosNfe == null) {
                eventosNfe = new ArrayList<EventoTO>();
                nfeBanco.setEventoTOList(eventosNfe);
            }
            eventosNfe.add(eventoTO);
        }
        NotaFiscalTO alterado = this.a.salvar(nfeBanco);
        if (alterado.hasErrors()) {
            ImportacaoErroTO erro = ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)null, (String)alterado.getErrorsString(), (Object[])new Object[0]);
            registroTO = this.newImportacaoRegistro(telaTO.getNomeArquivo(), idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erro});
        } else {
            registroTO = this.newImportacaoRegistro(telaTO.getNomeArquivo(), idRegistro, eventoTOBanco != null ? SituacaoRegistroEnum.ALTERADO : SituacaoRegistroEnum.INSERIDO, new ImportacaoErroTO[0]);
        }
        this.verificarAlertas(registroTO, errosAlertas);
        return registroTO;
    }

    private ImportacaoRegistroTO b(DSENSchemaTypeEnum schemaType, String conteudoArquivo, String idRegistro, ImportacaoTelaTO telaTO) throws DSENBusinessException {
        NotaFiscalTO nfe;
        ImportacaoRegistroTO registroTO;
        ArrayList<ImportacaoErroTO> errosAlertas = null;
        String versao = this.getVersao(conteudoArquivo);
        errosAlertas = DSENSchemaValidator.getInstance().validate(schemaType, versao, conteudoArquivo);
        if (this.hasErro((List)errosAlertas)) {
            ImportacaoRegistroTO registroTO2 = this.newImportacaoRegistro(telaTO.getNomeArquivo(), idRegistro, SituacaoRegistroEnum.REJEITADO, errosAlertas);
            return registroTO2;
        }
        errosAlertas = new ArrayList<ImportacaoErroTO>();
        CancelamentoTO cancTO = new CancelamentoConverter(this, conteudoArquivo).a();
        String xml = cancTO.getProtocoloString();
        String chNFe = XMLUtil.getFirstTagConteudo((String)xml, (String)"chNFe", (boolean)false, (boolean)false);
        NotaFiscalTO nfeBanco = null;
        try {
            nfe = ChaveAcessoUtil.gerarNotaFiscalTO((ChaveAcessoTO)ChaveAcessoUtil.obterChaveAcessoTO((String)chNFe), (EmitenteTO)((EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class)));
            nfeBanco = this.a.pesquisarPorSerieNumeroEmitente(nfe);
        }
        catch (DSGEBaseException e) {
            errosAlertas.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"chNFe", (String)e.getMessage(), (Object[])null));
            ImportacaoRegistroTO registroTO3 = this.newImportacaoRegistro(telaTO.getNomeArquivo(), idRegistro, SituacaoRegistroEnum.REJEITADO, errosAlertas);
            return registroTO3;
        }
        if (nfeBanco == null) {
            nfe.setSituacao(SituacaoNFeEnum.CANCELADA);
            nfe.setDataSistema(new Date());
            nfe = this.a.salvarSemTransaction(nfe);
            if (nfe.hasErrors()) {
                ImportacaoErroTO erro = ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)null, (String)nfe.getErrorsString(), (Object[])new Object[0]);
                ImportacaoRegistroTO registroTO4 = this.newImportacaoRegistro(telaTO.getNomeArquivo(), idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erro});
                return registroTO4;
            }
            cancTO.setIdNotaFiscal(nfe.getIdNotaFiscal());
            nfe.setCancelamentoTO(cancTO);
            nfe = this.a.alterar(nfe);
            if (nfe.hasErrors()) {
                ImportacaoErroTO erro = ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)null, (String)nfe.getErrorsString(), (Object[])new Object[0]);
                registroTO = this.newImportacaoRegistro(telaTO.getNomeArquivo(), idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erro});
            } else {
                registroTO = this.newImportacaoRegistro(telaTO.getNomeArquivo(), idRegistro, SituacaoRegistroEnum.INSERIDO, new ImportacaoErroTO[0]);
            }
        } else {
            switch (1.b[nfeBanco.getSituacao().ordinal()]) {
                case 1: 
                case 2: 
                case 5: {
                    break;
                }
                default: {
                    errosAlertas.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)chNFe, (String)DSENMessageConstants.MSG_IMPORTACAO_EXISTE_NFE_NUMERO_SERIE_COM_SITUACAO_Y_NAO_PODE_SER_CANCELADO, (Object[])new Object[]{nfeBanco.getSerie(), nfeBanco.getNumero(), nfeBanco.getSituacao().getDescricao()}));
                    ImportacaoRegistroTO registroTO5 = this.newImportacaoRegistro(telaTO.getNomeArquivo(), idRegistro, SituacaoRegistroEnum.REJEITADO, errosAlertas);
                    return registroTO5;
                }
            }
            if (SituacaoNFeEnum.CANCELADA.equals((Object)nfeBanco.getSituacao())) {
                String mensagem = MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_NFE_CANCELAMENTO_EXISTENTE, nfe.getSerie(), nfe.getNumero(), nfe.getAno());
                String mensagemSobrescrever = mensagem + DSENMessageConstants.MSG_IMPORTACAO_DUPLICIDADE_SOBRESCREVER;
                registroTO = this.notificarDuplicidade(telaTO.getNomeArquivo(), idRegistro, mensagem, mensagemSobrescrever);
                if (this.rejeitado(registroTO)) {
                    return registroTO;
                }
                cancTO.setIdNotaFiscal(nfeBanco.getIdNotaFiscal());
                nfeBanco.setCancelamentoTO(cancTO);
                NotaFiscalTO alterado = this.a.salvar(nfeBanco);
                if (alterado.hasErrors()) {
                    ImportacaoErroTO erro = ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)null, (String)alterado.getErrorsString(), (Object[])new Object[0]);
                    registroTO = this.newImportacaoRegistro(telaTO.getNomeArquivo(), idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erro});
                } else {
                    registroTO.setSituacaoRegistro(SituacaoRegistroEnum.ALTERADO);
                }
            } else {
                cancTO.setIdNotaFiscal(nfeBanco.getIdNotaFiscal());
                nfeBanco.setCancelamentoTO(cancTO);
                nfeBanco.setSituacao(SituacaoNFeEnum.CANCELADA);
                NotaFiscalTO alterado = this.a.salvar(nfeBanco);
                if (alterado.hasErrors()) {
                    ImportacaoErroTO erro = ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)null, (String)alterado.getErrorsString(), (Object[])new Object[0]);
                    registroTO = this.newImportacaoRegistro(telaTO.getNomeArquivo(), idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erro});
                } else {
                    registroTO = this.newImportacaoRegistro(telaTO.getNomeArquivo(), idRegistro, SituacaoRegistroEnum.INSERIDO, new ImportacaoErroTO[0]);
                }
            }
        }
        this.verificarAlertas(registroTO, errosAlertas);
        return registroTO;
    }

    private List<ImportacaoErroTO> a(String nomeArquivo, String idRegistro, String xml, ImportacaoTelaTO importacaoTela) throws DSGEUtilException {
        ArrayList<ImportacaoErroTO> erros = new ArrayList<ImportacaoErroTO>();
        String xmlIde = XMLUtil.getFirstTagConteudo((String)xml, (String)"ide", (boolean)true, (boolean)false);
        String verProc = XMLUtil.getFirstTagConteudo((String)xmlIde, (String)"verProc", (boolean)false, (boolean)false);
        String appVersion = DSENProperties.getInstance().getAplicativoVersao();
        if (importacaoTela.getExtensaoArquivo().equals((Object)ExtensaoArquivoEnum.TXT)) {
            if (StringHelper.isBlankOrNull((Object)verProc)) {
                AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.IMPORTACAO_ACAO_VERPROC_DIFERENTE, (Object)Boolean.TRUE);
            } else if (!verProc.equals(appVersion)) {
                erros.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.WARNING, (String)"verProc", (String)DSENMessageConstants.MSG_IMPORTACAO_VERPROC_DIFERENTE_VERSAO_APLICATIVO, (Object[])new Object[]{verProc, appVersion}));
                AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.IMPORTACAO_ACAO_VERPROC_DIFERENTE, (Object)Boolean.TRUE);
            }
        } else if (importacaoTela.getExtensaoArquivo().equals((Object)ExtensaoArquivoEnum.XML) && !verProc.equals(appVersion)) {
            erros.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.WARNING, (String)"verProc", (String)DSENMessageConstants.MSG_IMPORTACAO_VERPROC_DIFERENTE_VERSAO_APLICATIVO, (Object[])new Object[]{verProc, appVersion}));
        }
        return erros;
    }

    private ImportacaoRegistroTO a(String nomeArquivo, String idRegistro, String xml, ImportacaoTelaTO importacaoTela) throws DSGEUtilException {
        ArrayList<ImportacaoErroTO> erros = new ArrayList<ImportacaoErroTO>();
        String xmlIde = XMLUtil.getFirstTagConteudo((String)xml, (String)"ide", (boolean)true, (boolean)false);
        String procEmi = XMLUtil.getFirstTagConteudo((String)xmlIde, (String)"procEmi", (boolean)false, (boolean)false);
        if (!"3".equals(procEmi) && importacaoTela.getExtensaoArquivo().equals((Object)ExtensaoArquivoEnum.TXT)) {
            AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.IMPORTACAO_ACAO_PROCEMI_DIFERENTE, (Object)Boolean.TRUE);
            if (!StringHelper.isBlankOrNull((Object)procEmi)) {
                erros.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.WARNING, (String)"procEmi", (String)DSENMessageConstants.MSG_IMPORTACAO_PROCEMI_ALTERADO, (Object[])new Object[0]));
            }
        }
        if (this.hasErro(erros)) {
            return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, erros);
        }
        return null;
    }

    private ImportacaoRegistroTO b(String nomeArquivo, String idRegistro, String xml, ImportacaoTelaTO importacaoTela) throws DSGEUtilException {
        String xmlIde = XMLUtil.getFirstTagConteudo((String)xml, (String)"ide", (boolean)true, (boolean)false);
        String cUF = XMLUtil.getFirstTagConteudo((String)xmlIde, (String)"cUF", (boolean)false, (boolean)false);
        if (StringHelper.isBlankOrNull((Object)cUF) && importacaoTela.getExtensaoArquivo().equals((Object)ExtensaoArquivoEnum.TXT)) {
            AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.IMPORTACAO_ACAO_CUF_NOTA_DIFERENTE, (Object)Boolean.TRUE);
        }
        return null;
    }

    private ImportacaoRegistroTO a(String nomeArquivo, String idRegistro, String xml) throws DSGEUtilException {
        ArrayList<ImportacaoErroTO> erros = new ArrayList<ImportacaoErroTO>();
        String xmlIde = XMLUtil.getFirstTagConteudo((String)xml, (String)"ide", (boolean)true, (boolean)false);
        String tpEmis = XMLUtil.getFirstTagConteudo((String)xmlIde, (String)"tpEmis", (boolean)false, (boolean)false);
        String serie = XMLUtil.getFirstTagConteudo((String)xmlIde, (String)"serie", (boolean)false, (boolean)false);
        int serieInt = Integer.parseInt(serie);
        if (!TipoEmissaoEnum.CONTINGENCIA_SCAN.getCodigo().equals(tpEmis) && serieInt >= 900 && serieInt <= 999) {
            erros.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"serie", (String)DSENMessageConstants.INFNFE_IDE_SCAN_TIPO_EMISSAO_INVALIDO, (Object[])new Object[0]));
        } else if (TipoEmissaoEnum.CONTINGENCIA_SCAN.getCodigo().equals(tpEmis) && (serieInt < 900 || serieInt > 999)) {
            erros.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"tpEmis", (String)DSENMessageConstants.INFNFE_IDE_SCAN_SERIE_INVALIDA, (Object[])new Object[0]));
        }
        if (this.hasErro(erros)) {
            return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, erros);
        }
        return null;
    }

    private ImportacaoRegistroTO b(String nomeArquivo, String idRegistro, String xml) throws DSGEUtilException {
        ArrayList<ImportacaoErroTO> erros = new ArrayList<ImportacaoErroTO>();
        String xmlTransp = XMLUtil.getFirstTagConteudo((String)xml, (String)"transp", (boolean)true, (boolean)false);
        String xmlTransporta = XMLUtil.getFirstTagConteudo((String)xmlTransp, (String)"transporta", (boolean)true, (boolean)false);
        String cnpj = XMLUtil.getFirstTagConteudo((String)xmlTransporta, (String)"CNPJ", (boolean)false, (boolean)false);
        String cpf = XMLUtil.getFirstTagConteudo((String)xmlTransporta, (String)"CPF", (boolean)false, (boolean)false);
        String ie = XMLUtil.getFirstTagConteudo((String)xmlTransporta, (String)"IE", (boolean)false, (boolean)false);
        String uf = XMLUtil.getFirstTagConteudo((String)xmlTransporta, (String)"UF", (boolean)false, (boolean)false);
        TipoDocumentoEnum tpDoc = null;
        String nrDocumento = null;
        if (!StringHelper.isBlankOrNull((Object)cnpj)) {
            tpDoc = TipoDocumentoEnum.CNPJ;
            nrDocumento = cnpj;
        } else if (!StringHelper.isBlankOrNull((Object)cpf)) {
            tpDoc = TipoDocumentoEnum.CPF;
            nrDocumento = cpf;
        }
        if (nrDocumento != null) {
            try {
                DSGEDocumentoHelper.validarDocumento((String)nrDocumento, (TipoDocumentoEnum)tpDoc);
            }
            catch (DSGEValidationException ex) {
                erros.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)tpDoc.getDescription(), (String)DSENMessageConstants.IMPORTACAO_VALOR_INVALIDO, (Object[])new Object[]{nrDocumento}));
            }
        }
        if (!StringHelper.isBlankOrNull((Object)ie)) {
            if (StringHelper.isBlankOrNull((Object)uf)) {
                erros.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)tpDoc.getDescription(), (String)DSENMessageConstants.CAMPO_OBRIGATORIO, (Object[])new Object[]{"UF"}));
            } else {
                try {
                    if (!DSENConstants.ISENTO.equals(ie)) {
                        DSGEDocumentoHelper.validarIE((String)ie, (String)uf);
                    }
                }
                catch (DSGEValidationException ex) {
                    erros.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"IE", (String)DSENMessageConstants.IMPORTACAO_VALOR_INVALIDO, (Object[])new Object[]{ie}));
                }
            }
        }
        if (this.hasErro(erros)) {
            return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, erros);
        }
        return null;
    }

    private ImportacaoRegistroTO c(String nomeArquivo, String idRegistro, String xml, ImportacaoTelaTO importacaoTela) throws DSGEUtilException {
        ArrayList<ImportacaoErroTO> erros = new ArrayList<ImportacaoErroTO>();
        String xmlIde = XMLUtil.getFirstTagConteudo((String)xml, (String)"ide", (boolean)true, (boolean)false);
        String tpNFString = XMLUtil.getFirstTagConteudo((String)xmlIde, (String)"tpNF", (boolean)false, (boolean)false);
        List xmlDetList = XMLUtil.getTagConteudo((String)xml, (String)"det", (boolean)true);
        if (xmlDetList == null) {
            return null;
        }
        HashSet<String> nItemSet = new HashSet<String>();
        HashSet<String> nItemErroSet = new HashSet<String>();
        for (String xmldet : xmlDetList) {
            String nItem = this.a(xmldet);
            if (nItemSet.contains(nItem) && !nItemErroSet.contains(nItem)) {
                erros.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"nItem", (String)MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_NITEM_DUPLICADO, nItem), (Object[])new Object[0]));
                nItemErroSet.add(nItem);
            } else {
                nItemSet.add(nItem);
            }
            if (!ExtensaoArquivoEnum.XML.equals((Object)importacaoTela.getExtensaoArquivo())) continue;
            String xmlProd = XMLUtil.getFirstTagConteudo((String)xmldet, (String)"prod", (boolean)true, (boolean)false);
            String cfop = XMLUtil.getFirstTagConteudo((String)xmlProd, (String)"CFOP", (boolean)false, (boolean)false);
            String cean = XMLUtil.getFirstTagConteudo((String)xmlProd, (String)"cEAN", (boolean)false, (boolean)false);
            String ceanTrib = XMLUtil.getFirstTagConteudo((String)xmlProd, (String)"cEANTrib", (boolean)false, (boolean)false);
            if (cfop == null) continue;
            String firstDigit = cfop.substring(0, 1);
            int tpNF = Integer.parseInt(tpNFString);
            if (tpNF == TipoDocumentoNFeEnum.ENTRADA.ordinal() && !firstDigit.matches("[123]{1}")) {
                erros.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"CFOP", (String)MessageFormat.format(DSENMessageConstants.INFNFE_DET_PROD_CFOP_INCOMPATIVEL, nItem), (Object[])new Object[0]));
            }
            if (tpNF != TipoDocumentoNFeEnum.SAIDA.ordinal() || firstDigit.matches("[567]{1}")) continue;
            erros.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"CFOP", (String)MessageFormat.format(DSENMessageConstants.INFNFE_DET_PROD_CFOP_INCOMPATIVEL, nItem), (Object[])new Object[0]));
        }
        if (this.hasErro(erros)) {
            return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, erros);
        }
        return null;
    }

    private ImportacaoRegistroTO c(String nomeArquivo, String idRegistro, String xml) throws DSGEUtilException {
        ArrayList<ImportacaoErroTO> erros = new ArrayList<ImportacaoErroTO>();
        String xmlRet = XMLUtil.getFirstTagConteudo((String)xml, (String)"retirada", (boolean)true, (boolean)false);
        String cnpjRet = XMLUtil.getFirstTagConteudo((String)xmlRet, (String)"CNPJ", (boolean)false, (boolean)false);
        String xmlEntr = XMLUtil.getFirstTagConteudo((String)xml, (String)"entrega", (boolean)true, (boolean)false);
        String cnpjEntr = XMLUtil.getFirstTagConteudo((String)xmlEntr, (String)"CNPJ", (boolean)false, (boolean)false);
        if (!StringHelper.isBlankOrNull((Object)cnpjRet)) {
            try {
                DSGEDocumentoHelper.validarDocumento((String)cnpjRet, (TipoDocumentoEnum)TipoDocumentoEnum.CNPJ);
            }
            catch (DSGEValidationException ex) {
                erros.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)TipoDocumentoEnum.CNPJ.getDescription(), (String)DSENMessageConstants.IMPORTACAO_VALOR_INVALIDO, (Object[])new Object[]{cnpjRet}));
            }
        }
        if (!StringHelper.isBlankOrNull((Object)cnpjEntr)) {
            try {
                DSGEDocumentoHelper.validarDocumento((String)cnpjEntr, (TipoDocumentoEnum)TipoDocumentoEnum.CNPJ);
            }
            catch (DSGEValidationException ex) {
                erros.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)TipoDocumentoEnum.CNPJ.getDescription(), (String)DSENMessageConstants.IMPORTACAO_VALOR_INVALIDO, (Object[])new Object[]{cnpjEntr}));
            }
        }
        if (this.hasErro(erros)) {
            return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, erros);
        }
        return null;
    }

    private ImportacaoRegistroTO d(String nomeArquivo, String idRegistro, String xml) throws DSGEUtilException {
        ArrayList<ImportacaoErroTO> erros = new ArrayList<ImportacaoErroTO>();
        String xmlDest = XMLUtil.getFirstTagConteudo((String)xml, (String)"dest", (boolean)true, (boolean)false);
        String cnpj = XMLUtil.getFirstTagConteudo((String)xmlDest, (String)"CNPJ", (boolean)false, (boolean)false);
        String cpf = XMLUtil.getFirstTagConteudo((String)xmlDest, (String)"CPF", (boolean)false, (boolean)false);
        String isuf = XMLUtil.getFirstTagConteudo((String)xmlDest, (String)"ISUF", (boolean)false, (boolean)false);
        String ie = XMLUtil.getFirstTagConteudo((String)xmlDest, (String)"IE", (boolean)false, (boolean)false);
        String xmlEnderDest = XMLUtil.getFirstTagConteudo((String)xmlDest, (String)"dest", (boolean)true, (boolean)false);
        String uf = XMLUtil.getFirstTagConteudo((String)xmlEnderDest, (String)"UF", (boolean)false, (boolean)false);
        TipoDocumentoEnum tpDoc = null;
        String nrDocumento = null;
        if (!StringHelper.isBlankOrNull((Object)cnpj)) {
            tpDoc = TipoDocumentoEnum.CNPJ;
            nrDocumento = cnpj;
        } else if (!StringHelper.isBlankOrNull((Object)cpf)) {
            tpDoc = TipoDocumentoEnum.CPF;
            nrDocumento = cpf;
        }
        if (nrDocumento != null) {
            try {
                if (!TipoDocumentoEnum.CPF.equals((Object)tpDoc) || !nrDocumento.matches("[9]{11}")) {
                    DSGEDocumentoHelper.validarDocumento((String)nrDocumento, (TipoDocumentoEnum)tpDoc);
                }
            }
            catch (DSGEValidationException ex) {
                erros.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)tpDoc.getDescription(), (String)DSENMessageConstants.IMPORTACAO_VALOR_INVALIDO, (Object[])new Object[]{nrDocumento}));
            }
        }
        if (!StringHelper.isBlankOrNull((Object)ie)) {
            if (StringHelper.isBlankOrNull((Object)uf)) {
                erros.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)tpDoc.getDescription(), (String)DSENMessageConstants.CAMPO_OBRIGATORIO, (Object[])new Object[]{"UF"}));
            } else {
                try {
                    if (!DSENConstants.ISENTO.equals(ie)) {
                        DSGEDocumentoHelper.validarIE((String)ie, (String)uf);
                    }
                }
                catch (DSGEValidationException ex) {
                    erros.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"IE", (String)DSENMessageConstants.IMPORTACAO_VALOR_INVALIDO, (Object[])new Object[]{ie}));
                }
            }
        }
        try {
            if (!StringHelper.isBlankOrNull((Object)isuf)) {
                DSGEDocumentoHelper.validarIE((String)isuf, (String)"SU");
            }
        }
        catch (DSGEValidationException ex) {
            erros.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"ISUF", (String)DSENMessageConstants.IMPORTACAO_VALOR_INVALIDO, (Object[])new Object[]{isuf}));
        }
        if (this.hasErro(erros)) {
            return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, erros);
        }
        return null;
    }

    private ImportacaoRegistroTO a(String nomeArquivo, String idRegistro, String xml, TipoImportacaoEnum tipoImportacao) throws DSGEUtilException {
        String cnpjEmitente = null;
        String ufEmitente = null;
        String ieEmitente = null;
        String cPais = null;
        String xPais = null;
        if (TipoImportacaoEnum.b.equals((Object)tipoImportacao) || TipoImportacaoEnum.c.equals((Object)tipoImportacao)) {
            try {
                String chaveAcesso = XMLUtil.getFirstTagConteudo((String)xml, (String)"chNFe", (boolean)false, (boolean)false);
                ChaveAcessoTO chaveAcessoTO = ChaveAcessoUtil.obterChaveAcessoTO((String)chaveAcesso);
                cnpjEmitente = chaveAcessoTO.getCnpjEmitente();
                ufEmitente = DSENUtilHelper.getInstance().getEstadoTO(chaveAcessoTO.getCodigoUfEmitente()).getSigla();
            }
            catch (Exception e) {
                ImportacaoErroTO erro = ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"chNFe", (String)DSENMessageConstants.IMPORTACAO_VALOR_INVALIDO, (Object[])new Object[0]);
                return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erro});
            }
        } else {
            String xmlEmitente = XMLUtil.getFirstTagConteudo((String)xml, (String)"emit", (boolean)true, (boolean)false);
            cnpjEmitente = XMLUtil.getFirstTagConteudo((String)xmlEmitente, (String)"CNPJ", (boolean)false, (boolean)false);
            ufEmitente = XMLUtil.getFirstTagConteudo((String)xmlEmitente, (String)"UF", (boolean)false, (boolean)false);
            ieEmitente = XMLUtil.getFirstTagConteudo((String)xmlEmitente, (String)"IE", (boolean)false, (boolean)false);
            String enderEmitente = XMLUtil.getFirstTagConteudo((String)xml, (String)"enderEmit", (boolean)true, (boolean)false);
            cPais = XMLUtil.getFirstTagConteudo((String)enderEmitente, (String)"cPais", (boolean)false, (boolean)false);
            xPais = XMLUtil.getFirstTagConteudo((String)enderEmitente, (String)"xPais", (boolean)false, (boolean)false);
        }
        ArrayList<ImportacaoErroTO> erros = new ArrayList<ImportacaoErroTO>();
        EmitenteTO emitenteAtual = this.getEmitenteAtual();
        this.validarCnpjCpf("Emitente", cnpjEmitente, TipoDocumentoEnum.CNPJ, erros);
        if (!emitenteAtual.getNrDocumento().equals(cnpjEmitente)) {
            erros.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"CNPJ", (String)DSENMessageConstants.MSG_IMPORTACAO_EMITENTE_CNPJ_DIFERENTE_EMITENTE_ATUAL, (Object[])new Object[0]));
        }
        if (!emitenteAtual.getUf().equals(ufEmitente)) {
            erros.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"UF", (String)DSENMessageConstants.MSG_IMPORTACAO_EMITENTE_UF_DIF_EMIT_LOGADO, (Object[])new Object[0]));
        } else {
            this.validarIE("Emitente", ieEmitente, ufEmitente, erros);
        }
        if (StringHelper.isBlankOrNull((Object)cPais)) {
            AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.IMPORTACAO_ACAO_CPAIS_EMITENTE_DIFERENTE, (Object)Boolean.TRUE);
        } else if (!cPais.equals(DSGEConstants.BRASIL)) {
            erros.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"cPais", (String)DSENMessageConstants.MSG_IMPORTACAO_EMITENTE_CODIGO_PAIS_INVALIDO, (Object[])new Object[]{DSGEConstants.BRASIL}));
        }
        if (!(StringHelper.isBlankOrNull((Object)xPais) || xPais.equals("BRASIL") || xPais.equals("Brasil"))) {
            erros.add(ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"xPais", (String)DSENMessageConstants.MSG_IMPORTACAO_EMITENTE_NOME_PAIS_INVALIDO, (Object[])new Object[0]));
        }
        if (this.hasErro(erros)) {
            return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, erros);
        }
        return null;
    }

    private ImportacaoRegistroTO a(String nomeArquivo, String idRegistro, String xml, TipoImportacaoEnum tipoImportacao, DSENSchemaTypeEnum schemaType) {
        TipoAmbiente tipoAmbienteImportado;
        TipoAmbiente tipoAmbienteAtual = TipoAmbiente.valueOf((String)("_" + DSENProperties.getInstance().getAplicativoTipoAmbiente()));
        String tipoAmbienteString = XMLUtil.getFirstTagConteudo((String)xml, (String)"tpAmb", (boolean)false, (boolean)false);
        if (StringHelper.isBlankOrNull((Object)tipoAmbienteString)) {
            tipoAmbienteImportado = null;
        } else {
            tipoAmbienteImportado = TipoAmbiente.valueOf((String)("_" + tipoAmbienteString));
            if (tipoAmbienteAtual.equals((Object)tipoAmbienteImportado)) {
                return null;
            }
        }
        if (!DSENSchemaTypeEnum.nfe.equals((Object)schemaType)) {
            ImportacaoErroTO erro = ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"Tipo de Ambiente", (String)DSENMessageConstants.MSG_IMPORTACAO_TIPO_AMBIENTE_DIFERENTE_SISTEMA, (Object[])new Object[0]);
            return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erro});
        }
        if (tipoAmbienteImportado != null) {
            String mensagemNotificacao = MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_TIPO_AMBIENTE_DIFERENTE_SOBRESCREVER, idRegistro, tipoAmbienteImportado.getDescricao(), tipoAmbienteAtual.getDescricao());
            Notificador.getInstance().notificar((Object)mensagemNotificacao, new EnumItf[]{GrupoNotificacaoEnum.IMPORTACAO_TIPO_AMBIENTE_DIFERENTE});
        } else {
            AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.IMPORTACAO_ACAO_TIPO_AMBIENTE_INVALIDO, (Object)Boolean.TRUE);
        }
        boolean alterarTipoAmbiente = this.a();
        if (!alterarTipoAmbiente) {
            ImportacaoErroTO erro = ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"Tipo de Ambiente", (String)DSENMessageConstants.MSG_IMPORTACAO_TIPO_AMBIENTE_DIFERENTE_SISTEMA, (Object[])new Object[0]);
            return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erro});
        }
        return null;
    }

    private Boolean a() {
        Boolean retorno = (Boolean)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.IMPORTACAO_ACAO_TIPO_AMBIENTE_INVALIDO, Boolean.class);
        if (retorno == null) {
            return false;
        }
        return retorno;
    }

    private Boolean b() {
        Boolean retorno = (Boolean)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.IMPORTACAO_ACAO_VERPROC_DIFERENTE, Boolean.class);
        if (retorno == null) {
            return false;
        }
        return retorno;
    }

    private Boolean c() {
        Boolean retorno = (Boolean)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.IMPORTACAO_ACAO_PROCEMI_DIFERENTE, Boolean.class);
        if (retorno == null) {
            return false;
        }
        return retorno;
    }

    private Boolean d() {
        Boolean retorno = (Boolean)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.IMPORTACAO_ACAO_CPAIS_EMITENTE_DIFERENTE, Boolean.class);
        if (retorno == null) {
            return false;
        }
        return retorno;
    }

    private Boolean e() {
        Boolean retorno = (Boolean)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.IMPORTACAO_ACAO_CUF_NOTA_DIFERENTE, Boolean.class);
        if (retorno == null) {
            return false;
        }
        return retorno;
    }

    private ImportacaoRegistroTO a(NotaFiscalTO notaFiscalTO, String nomeArquivo, String idRegistro) throws DSENBusinessException {
        boolean isInutilizada;
        ImportacaoRegistroTO registroTO = null;
        ArrayList erros = new ArrayList();
        EmitenteTO emitenteAtual = this.getEmitenteAtual();
        notaFiscalTO.setEmitenteTO(emitenteAtual);
        NotaFiscalTO toBanco = this.a.pesquisarPorSerieNumeroEmitente(notaFiscalTO);
        if (toBanco != null) {
            if (this.a(toBanco)) {
                ImportacaoErroTO erro = ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)null, (String)DSENMessageConstants.MSG_IMPORTACAO_NOTA_FISCAL_DANFE_CONTINGENCIA, (Object[])new Object[]{idRegistro});
                return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erro});
            }
            if (SituacaoNFeEnum.AUTORIZADA.equals((Object)toBanco.getSituacao())) {
                ImportacaoErroTO erro = ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)null, (String)MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_EXISTE_UMA_NFE_AUTORIZADA, toBanco.getSerie(), toBanco.getNumero()), (Object[])new Object[]{idRegistro});
                return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erro});
            }
            notaFiscalTO.setIdNotaFiscal(toBanco.getIdNotaFiscal());
            String mensagem = MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_DUPLICIDADE_NOTA_FISCAL, idRegistro, nomeArquivo);
            String mensagemSobrescrever = mensagem + DSENMessageConstants.MSG_IMPORTACAO_DUPLICIDADE_SOBRESCREVER;
            registroTO = this.notificarDuplicidade(nomeArquivo, idRegistro, mensagem, mensagemSobrescrever);
            if (this.rejeitado(registroTO)) {
                return registroTO;
            }
            erros.addAll(registroTO.getImportacaoErros());
            if (SituacaoNFeEnum.AUTORIZADA.equals((Object)notaFiscalTO.getSituacao()) && SituacaoNFeEnum.CANCELADA.equals((Object)toBanco.getSituacao())) {
                notaFiscalTO.setSituacao(SituacaoNFeEnum.CANCELADA);
                notaFiscalTO.setCancelamentoTO(toBanco.getCancelamentoTO());
            }
        }
        if (isInutilizada = this.a.numeroInutilizado(emitenteAtual.getIdEmitente(), notaFiscalTO.getSerie(), notaFiscalTO.getNumero())) {
            ImportacaoErroTO erro = ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)null, (String)DSENMessageConstants.MSG_IMPORTACAO_NOTA_FISCAL_INUTILIZADA, (Object[])new Object[]{idRegistro});
            return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erro});
        }
        if (registroTO != null) {
            return registroTO;
        }
        return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.INSERIDO, erros);
    }

    private void a(NotaFiscalTO notaFiscalTO, ImportacaoTelaTO importacaoTela) throws DSENBusinessException {
        if (this.a().booleanValue()) {
            notaFiscalTO.setDocXmlString(XMLUtil.alterarTagConteudo((String)notaFiscalTO.getDocXmlString(), (String)"tpAmb", (String)DSENProperties.getInstance().getAplicativoTipoAmbiente()));
            this.a(notaFiscalTO);
            notaFiscalTO.setSituacao(SituacaoNFeEnum.EM_DIGITACAO);
        }
        if (this.b().booleanValue()) {
            notaFiscalTO.setDocXmlString(XMLUtil.alterarTagConteudo((String)notaFiscalTO.getDocXmlString(), (String)"verProc", (String)DSENProperties.getInstance().getAplicativoVersao()));
        }
        if (this.c().booleanValue()) {
            notaFiscalTO.setDocXmlString(XMLUtil.alterarTagConteudo((String)notaFiscalTO.getDocXmlString(), (String)"procEmi", (String)"3"));
        }
        if (this.d().booleanValue()) {
            String xmlEnderEmit = XMLUtil.getFirstTagConteudo((String)notaFiscalTO.getDocXmlString(), (String)"enderEmit", (boolean)false, (boolean)false);
            xmlEnderEmit = XMLUtil.alterarTagConteudo((String)xmlEnderEmit, (String)"cPais", (String)l);
            notaFiscalTO.setDocXmlString(XMLUtil.alterarTagConteudo((String)notaFiscalTO.getDocXmlString(), (String)"enderEmit", (String)xmlEnderEmit));
        }
        if (this.e().booleanValue()) {
            EmitenteTO emitente = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
            notaFiscalTO.setDocXmlString(XMLUtil.alterarTagConteudo((String)notaFiscalTO.getDocXmlString(), (String)"cUF", (String)emitente.getUf()));
        }
        if (this.f().booleanValue()) {
            this.a(notaFiscalTO);
            notaFiscalTO.setSituacao(SituacaoNFeEnum.EM_DIGITACAO);
        }
        notaFiscalTO.setDanfeImpresso(Boolean.valueOf(false));
        long startTime = new Date().getTime();
        if (SituacaoNFeEnum.EM_DIGITACAO.equals((Object)notaFiscalTO.getSituacao())) {
            this.a.editar(notaFiscalTO);
        } else {
            this.a.alterar(notaFiscalTO);
        }
        long finishTime = new Date().getTime();
        this.c += finishTime - startTime;
    }

    private DSENSchemaTypeEnum a(String xml) {
        Set xmlTagsKeySet = a.keySet();
        for (String xmlTag : xmlTagsKeySet) {
            List listaConteudoTag = XMLUtil.getTagConteudo((String)xml, (String)xmlTag, (boolean)true);
            if (listaConteudoTag == null || listaConteudoTag.isEmpty() || listaConteudoTag.size() > 1) continue;
            return (DSENSchemaTypeEnum)a.get(xmlTag);
        }
        return null;
    }

    private ImportacaoRegistroTO a(String nomeArquivo, String idRegistro, String conteudoArquivo, String versao, DSENSchemaTypeEnum schemaType) {
        List erros = DSENSchemaValidator.getInstance().validate(schemaType, versao, conteudoArquivo);
        if (this.hasErro(erros)) {
            return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, erros);
        }
        return null;
    }

    private ImportacaoRegistroTO a(String nomeArquivo, String idRegistro, String conteudo, DSENSchemaTypeEnum schemaType) throws DSGECertificadoException {
        if (DSENSchemaTypeEnum.retCancNFe.equals((Object)schemaType)) {
            return null;
        }
        try {
            Certificado certificado = new Certificado();
            boolean isAssinaturaValida = certificado.validarAssinaturaXML(conteudo);
            if (isAssinaturaValida) {
                return null;
            }
            if (!DSENSchemaTypeEnum.nfe.equals((Object)schemaType) && !DSENSchemaTypeEnum.procNFe.equals((Object)schemaType)) {
                ImportacaoErroTO erro = ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)null, (String)DSENMessageConstants.MSG_IMPORTACAO_ASSINATURA_INVALIDA, (Object[])new Object[]{nomeArquivo});
                return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erro});
            }
            String mensagem = MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_ASSINATURA_INVALIDA_SALVAR, nomeArquivo);
            Notificador.getInstance().notificar((Object)mensagem, new EnumItf[]{GrupoNotificacaoEnum.IMPORTACAO_ASSINATURA_INVALIDA});
            boolean importar = this.f();
            if (!importar) {
                ImportacaoErroTO erro = ImportacaoNotaFiscalBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)null, (String)DSENMessageConstants.MSG_IMPORTACAO_ASSINATURA_INVALIDA, (Object[])new Object[]{nomeArquivo});
                return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erro});
            }
            return null;
        }
        catch (Throwable e) {
            a.error((Object)e);
            throw new DSGECertificadoException(e.getMessage());
        }
    }

    private Boolean f() {
        Boolean retorno = (Boolean)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.IMPORTACAO_ACAO_ASSINATURA_INVALIDA, Boolean.class);
        if (retorno == null) {
            return false;
        }
        return retorno;
    }

    private TipoImportacaoEnum a(DSENSchemaTypeEnum schemaType) {
        switch (1.c[schemaType.ordinal()]) {
            case 1: 
            case 2: {
                return TipoImportacaoEnum.a;
            }
            case 3: 
            case 4: {
                return TipoImportacaoEnum.b;
            }
            case 5: {
                return TipoImportacaoEnum.c;
            }
        }
        return null;
    }

    private boolean a(NotaFiscalTO duplicada) {
        return duplicada.getDanfeImpresso() != false && (TipoEmissaoEnum.CONTINGENCIA.equals((Object)duplicada.getTipoEmissao()) || TipoEmissaoEnum.CONTINGENCIA_DPEC.equals((Object)duplicada.getTipoEmissao()) || TipoEmissaoEnum.CONTINGENCIA_FS_DA.equals((Object)duplicada.getTipoEmissao())) && SituacaoNFeEnum.ASSINADA.equals((Object)duplicada.getSituacao());
    }

    private void a(NotaFiscalTO notaFiscalTO) {
        String docXmlString = notaFiscalTO.getDocXmlString();
        int lastIndexDadosNFe = docXmlString.indexOf("</infNFe>") + "</infNFe>".length();
        docXmlString = docXmlString.substring(0, lastIndexDadosNFe);
        docXmlString = docXmlString + "</NFe>";
        notaFiscalTO.setDocXmlString(docXmlString);
    }

    private ImportacaoRegistroTO e(String nomeArquivo, String idRegistro, String xml) throws DSGEUtilException {
        ArrayList erros = new ArrayList();
        this.a(xml, erros);
        this.c(xml, erros);
        this.d(xml, erros);
        this.e(xml, erros);
        this.f(xml, erros);
        this.b(xml, erros);
        if (this.hasErro(erros)) {
            return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, erros);
        }
        return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.INSERIDO, erros);
    }

    private void a(String xml, List<ImportacaoErroTO> erros) throws DSGEUtilException {
        List listaIde = XMLUtil.getTagConteudo((String)xml, (String)"ide", (boolean)true);
        if (listaIde != null && !listaIde.isEmpty()) {
            String ide = (String)listaIde.get(0);
            String cUF = XMLUtil.getFirstTagConteudo((String)ide, (String)"cUF", (boolean)false, (boolean)false);
            String cMun = XMLUtil.getFirstTagConteudo((String)ide, (String)"cMunFG", (boolean)false, (boolean)false);
            if (!StringHelper.isBlankOrNull((Object)cUF) && !StringHelper.isBlankOrNull((Object)cMun)) {
                this.validarCMunCUF("Fato Gerador", cUF, cMun, ImportacaoErroTO.Status.ERROR, erros);
            }
        }
    }

    private void b(String xml, List<ImportacaoErroTO> erros) throws DSGEUtilException {
        List listaTransporta = XMLUtil.getTagConteudo((String)xml, (String)"transporta", (boolean)true);
        if (listaTransporta != null && !listaTransporta.isEmpty()) {
            String transportadora = (String)listaTransporta.get(0);
            String transportadoraSiglaUF = XMLUtil.getFirstTagConteudo((String)transportadora, (String)"UF", (boolean)false, (boolean)false);
            String transportadoraXMun = XMLUtil.getFirstTagConteudo((String)transportadora, (String)"xMun", (boolean)false, (boolean)true);
            if (!StringHelper.isBlankOrNull((Object)transportadoraSiglaUF) && !StringHelper.isBlankOrNull((Object)transportadoraXMun)) {
                this.validarNomeMunicipioSiglaUF("Transporte", transportadoraSiglaUF, transportadoraXMun, ImportacaoErroTO.Status.ERROR, erros);
            }
        }
    }

    private void c(String xml, List<ImportacaoErroTO> erros) throws DSGEUtilException {
        String emit = XMLUtil.getFirstTagConteudo((String)xml, (String)"emit", (boolean)true, (boolean)false);
        String emitenteCPais = XMLUtil.getFirstTagConteudo((String)emit, (String)"cPais", (boolean)false, (boolean)false);
        String emitenteXPais = XMLUtil.getFirstTagConteudo((String)emit, (String)"xPais", (boolean)false, (boolean)true);
        String emitenteSiglaUF = XMLUtil.getFirstTagConteudo((String)emit, (String)"UF", (boolean)false, (boolean)false);
        String emitenteCMun = XMLUtil.getFirstTagConteudo((String)emit, (String)"cMun", (boolean)false, (boolean)false);
        String emitenteXMun = XMLUtil.getFirstTagConteudo((String)emit, (String)"xMun", (boolean)false, (boolean)true);
        if (this.validarPais("Emitente", emitenteCPais, emitenteXPais, erros, false) && this.validarUF("Emitente", emitenteCPais, emitenteSiglaUF, erros, false)) {
            this.validarMunicipioExterior("Emitente", emitenteCPais, emitenteXMun, erros);
            if (this.validarMunicipioCodigoNome("Emitente", emitenteCMun, emitenteXMun, erros)) {
                this.validarCodigoMunicipioSiglaUF("Emitente", emitenteSiglaUF, emitenteCMun, ImportacaoErroTO.Status.ERROR, erros);
            }
        }
    }

    private void d(String xml, List<ImportacaoErroTO> erros) throws DSGEUtilException {
        String dest = XMLUtil.getFirstTagConteudo((String)xml, (String)"dest", (boolean)true, (boolean)false);
        String destinatarioCPais = XMLUtil.getFirstTagConteudo((String)dest, (String)"cPais", (boolean)false, (boolean)true);
        String destinatarioXPais = XMLUtil.getFirstTagConteudo((String)dest, (String)"xPais", (boolean)false, (boolean)true);
        String destinatarioSiglaUF = XMLUtil.getFirstTagConteudo((String)dest, (String)"UF", (boolean)false, (boolean)false);
        String destinatarioCMun = XMLUtil.getFirstTagConteudo((String)dest, (String)"cMun", (boolean)false, (boolean)false);
        String destinatarioXMun = XMLUtil.getFirstTagConteudo((String)dest, (String)"xMun", (boolean)false, (boolean)true);
        if (this.validarPais("Destinat\u00e1rio", destinatarioCPais, destinatarioXPais, erros, true) && this.validarUF("Destinat\u00e1rio", destinatarioCPais, destinatarioSiglaUF, erros, true)) {
            this.validarMunicipioExterior("Destinat\u00e1rio", destinatarioCPais, destinatarioXMun, erros);
            if (this.validarMunicipioCodigoNome("Destinat\u00e1rio", destinatarioCMun, destinatarioXMun, erros)) {
                this.validarCodigoMunicipioSiglaUF("Destinat\u00e1rio", destinatarioSiglaUF, destinatarioCMun, ImportacaoErroTO.Status.ERROR, erros);
            }
        }
    }

    private void e(String xml, List<ImportacaoErroTO> erros) throws DSGEUtilException {
        List listaRetirada = XMLUtil.getTagConteudo((String)xml, (String)"retirada", (boolean)true);
        if (listaRetirada != null && !listaRetirada.isEmpty()) {
            String retiradaXMun;
            String retirada = (String)listaRetirada.get(0);
            String retiradaSiglaUF = XMLUtil.getFirstTagConteudo((String)retirada, (String)"UF", (boolean)false, (boolean)false);
            String retiradaCMun = XMLUtil.getFirstTagConteudo((String)retirada, (String)"cMun", (boolean)false, (boolean)false);
            if (this.validarMunicipioCodigoNome("Local de Retirada", retiradaCMun, retiradaXMun = XMLUtil.getFirstTagConteudo((String)retirada, (String)"xMun", (boolean)false, (boolean)true), erros)) {
                this.validarCodigoMunicipioSiglaUF("Local de Retirada", retiradaSiglaUF, retiradaCMun, ImportacaoErroTO.Status.WARNING, erros);
            }
        }
    }

    private void f(String xml, List<ImportacaoErroTO> erros) throws DSGEUtilException {
        List listaEntrega = XMLUtil.getTagConteudo((String)xml, (String)"entrega", (boolean)true);
        if (listaEntrega != null && !listaEntrega.isEmpty()) {
            String entregaXMun;
            String entrega = (String)listaEntrega.get(0);
            String entregaSiglaUF = XMLUtil.getFirstTagConteudo((String)entrega, (String)"UF", (boolean)false, (boolean)false);
            String entregaCMun = XMLUtil.getFirstTagConteudo((String)entrega, (String)"cMun", (boolean)false, (boolean)false);
            if (this.validarMunicipioCodigoNome("Local de Entrega", entregaCMun, entregaXMun = XMLUtil.getFirstTagConteudo((String)entrega, (String)"xMun", (boolean)false, (boolean)true), erros)) {
                this.validarCodigoMunicipioSiglaUF("Local de Entrega", entregaSiglaUF, entregaCMun, ImportacaoErroTO.Status.WARNING, erros);
            }
        }
    }

    private String a(String xml) {
        Pattern pattern = Pattern.compile("nItem\\s*=\\s*\"\\d*\"");
        Matcher m = pattern.matcher(xml);
        if (m.find()) {
            String attrib = m.group();
            return attrib.replaceAll("\\D", "");
        }
        return null;
    }

    static {
        a = new HashMap();
        a.put("procCancNFe", DSENSchemaTypeEnum.procCancNFe);
        a.put("retCancNFe", DSENSchemaTypeEnum.retCancNFe);
        a.put("nfeProc", DSENSchemaTypeEnum.procNFe);
        a.put("NFe", DSENSchemaTypeEnum.nfe);
        a.put("sistema", DSENSchemaTypeEnum.sistema);
        a.put("procEventoNFe", DSENSchemaTypeEnum.procEventoNFe);
    }
}

