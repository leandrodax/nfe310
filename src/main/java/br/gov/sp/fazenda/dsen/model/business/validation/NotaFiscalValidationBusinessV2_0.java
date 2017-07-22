/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.FinalidadeEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoAmbienteEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.ErroNFeTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.common.util.NumberFormatterHelper
 *  br.gov.sp.fazenda.dsen.model.business.validation.NotaFiscalValidationBusinessV2_0
 *  br.gov.sp.fazenda.dsen.model.business.validation.NotaFiscalValidationBusinessV2_0$CSTICMS
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TAmb
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TAmb$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCfop
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCfop$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCodUfIBGE
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCodUfIBGE$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEnderEmi
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEndereco
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TFinNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TFinNFe$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TIpi
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TIpi$IPITrib
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TLocal
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$AutXML
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Avulsa
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Dest
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$COFINS
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$COFINS$COFINSAliq
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$COFINS$COFINSNT
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$COFINS$COFINSOutr
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$COFINS$COFINSQtde
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS00
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS00$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS00$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS10
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS10$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS10$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS20
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS20$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS20$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS30
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS30$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS30$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS40
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS40$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS40$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS40$MotDesICMS
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS40$MotDesICMS$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS51
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS51$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS51$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS60
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS60$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS60$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS70
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS70$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS70$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS90
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS90$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS90$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSPart
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSPart$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSPart$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN101
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN101$CSOSN
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN101$CSOSN$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN102
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN102$CSOSN
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN102$CSOSN$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN201
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN201$CSOSN
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN201$CSOSN$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN202
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN202$CSOSN
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN202$CSOSN$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN500
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN500$CSOSN
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN500$CSOSN$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN900
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN900$CSOSN
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN900$CSOSN$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSST$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSST$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$II
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ISSQN
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$PIS
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$PIS$PISAliq
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$PIS$PISNT
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$PIS$PISOutr
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$PIS$PISQtde
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$Comb
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$DI
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$IndTot
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$IndTot$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$VeicProd
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$VeicProd$TpOp
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$VeicProd$TpOp$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Emit
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Emit$CRT
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Emit$CRT$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Exporta
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$NFref
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$NFref$RefNF
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$NFref$RefNFP
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$TpEmis
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$TpEmis$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$TpNF
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$TpNF$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Total
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Total$ICMSTot
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Total$ISSQNtot
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Transp
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Transp$RetTransp
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Transp$Transporta
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProcEmi
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProcEmi$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUf
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUf$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUfEmi
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUfEmi$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TVeiculo
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.Tpais
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.Tpais$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.impl.TNFeImpl
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.impl.TNFeImpl$InfNFeImpl
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.impl.TNFeImpl$InfNFeImpl$AutXMLImpl
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException
 *  br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.MunicipioTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  org.apache.commons.logging.Log
 */
package br.gov.sp.fazenda.dsen.model.business.validation;

import br.gov.sp.fazenda.dsen.common.enumeration.FinalidadeEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoAmbienteEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.ErroNFeTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsen.common.util.NumberFormatterHelper;
import br.gov.sp.fazenda.dsen.model.business.validation.NotaFiscalValidationBusinessV2_0;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TAmb;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCfop;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCodUfIBGE;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEnderEmi;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEndereco;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TFinNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TIpi;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TLocal;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProcEmi;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUf;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUfEmi;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TVeiculo;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.Tpais;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.impl.TNFeImpl;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException;
import br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.MunicipioTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import org.apache.commons.logging.Log;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
class NotaFiscalValidationBusinessV2_0 {
    private Properties a;
    private static double a = 0.5;
    private Log a;
    private boolean a = true;

    public NotaFiscalValidationBusinessV2_0() throws DSENBusinessException {
        try {
            this.a = new Properties();
            this.a.load(this.getClass().getResourceAsStream("dsen_campos.properties"));
        }
        catch (Exception e) {
            this.a.error((Object)"Erro na carga de arquito de propriedades", (Throwable)e);
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    public NotaFiscalTO a(NotaFiscalTO notaFiscalTO, NFeDocument nfeDocument) throws DSENBusinessException {
        try {
            this.a(notaFiscalTO);
            TNFe.InfNFe.Ide ide = nfeDocument.getNFe().getInfNFe().getIde();
            if (ide == null) {
                notaFiscalTO.addError(DSENMessageConstants.INFNFE_IDE_OBRIGATORIA);
            } else {
                this.a(nfeDocument, notaFiscalTO);
                this.b(nfeDocument, notaFiscalTO);
                this.c(nfeDocument, notaFiscalTO);
                this.d(nfeDocument, notaFiscalTO);
                this.e(nfeDocument, notaFiscalTO);
                this.f(nfeDocument, notaFiscalTO);
                this.g(nfeDocument, notaFiscalTO);
                this.h(nfeDocument, notaFiscalTO);
                this.j(nfeDocument, notaFiscalTO);
                this.k(nfeDocument, notaFiscalTO);
            }
            return notaFiscalTO;
        }
        catch (DSENBusinessException e) {
            throw e;
        }
        catch (Exception e) {
            this.a.error((Object)"Erro na valida\u00e7\u00e3o de NF-e", (Throwable)e);
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    public boolean a(String docXmlString) {
        int tamanhoMaximoPermitido = 509061;
        if (docXmlString != null && docXmlString.getBytes().length > tamanhoMaximoPermitido) {
            return false;
        }
        return true;
    }

    private void a(NFeDocument nfeDocument, NotaFiscalTO notaFiscalTO) {
        String id = nfeDocument.getNFe().getInfNFe().getId();
        String chaveAcesso = ChaveAcessoUtil.gerarChaveAcesso((NotaFiscalTO)notaFiscalTO);
        if (StringHelper.isBlankOrNull((Object)id) || id.length() != 47 || !id.substring(0, 3).equals("NFe") || !id.substring(3, 47).equals(chaveAcesso)) {
            this.a(MessageFormat.format(DSENMessageConstants.INFNFE_DADOSNFE_ID_INVALIDO, id), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.NOME_AMIGAVEL"), notaFiscalTO);
        }
    }

    private boolean a(NFeDocument nfeDocument, NotaFiscalTO notaFiscalTO) {
        Date dtAutorizacao = notaFiscalTO.getDataAutorizacao();
        int diferencaHoras = DateHelper.getHoursBetweenDates((Date)dtAutorizacao, (Date)new Date());
        if (diferencaHoras <= 720) {
            return true;
        }
        return false;
    }

    private void b(NFeDocument nfeDocument, NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        try {
            String xMun;
            int i;
            TNFe.InfNFe.Ide.NFref nfRef;
            TNFe.InfNFe.Ide ide = nfeDocument.getNFe().getInfNFe().getIde();
            TNFe.InfNFe.Emit emitente = nfeDocument.getNFe().getInfNFe().getEmit();
            if (!StringHelper.isBlankOrNull((Object)ide.getTpEmis())) {
                if (TNFe.InfNFe.Ide.TpEmis.X_3.equals((Object)ide.getTpEmis())) {
                    if (StringHelper.isBlankOrNull((Object)ide.getSerie()) || Integer.parseInt(ide.getSerie()) < 900 || Integer.parseInt(ide.getSerie()) > 999) {
                        this.a(MessageFormat.format(DSENMessageConstants.INFNFE_IDE_SERIE_SCAN_INVALIDA, ide.getSerie(), "{900-999}"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.serie.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.serie.NOME_AMIGAVEL"), notaFiscalTO);
                    }
                } else {
                    if (nfeDocument.getNFe().getInfNFe().getAvulsa() == null && (StringHelper.isBlankOrNull((Object)ide.getSerie()) || Integer.parseInt(ide.getSerie()) < 0 || Integer.parseInt(ide.getSerie()) > 889)) {
                        this.a(MessageFormat.format(DSENMessageConstants.INFNFE_IDE_SERIE_SEFAZ_INVALIDA, ide.getSerie(), "{0-889}"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.serie.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.serie.NOME_AMIGAVEL"), notaFiscalTO);
                    }
                    if (nfeDocument.getNFe().getInfNFe().getAvulsa() != null && (StringHelper.isBlankOrNull((Object)ide.getSerie()) || Integer.parseInt(ide.getSerie()) < 890 || Integer.parseInt(ide.getSerie()) > 899)) {
                        this.a(MessageFormat.format(DSENMessageConstants.INFNFE_IDE_SERIE_SEFAZ_INVALIDA, ide.getSerie(), "{890-899}"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.serie.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.serie.NOME_AMIGAVEL"), notaFiscalTO);
                    }
                }
            }
            if (!StringHelper.isBlankOrNull((Object)ide.getTpNF()) && TNFe.InfNFe.Ide.TpNF.X_1.equals((Object)ide.getTpNF()) && !StringHelper.isBlankOrNull((Object)ide.getDhSaiEnt()) && DateHelper.getDate((String)ide.getDhSaiEnt(), (SimpleDateFormat)DateHelper.DATE_TIME_XML_FORMAT310).compareTo(DateHelper.getDate((String)ide.getDhEmi(), (SimpleDateFormat)DateHelper.DATE_TIME_XML_FORMAT310)) < 0) {
                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_IDE_DTSAIDA_MENOR_DTEMISSAO, DateHelper.formataData((Date)DateHelper.getDate((String)ide.getDhSaiEnt(), (SimpleDateFormat)DateHelper.DATE_TIME_XML_FORMAT310)), DateHelper.formataData((Date)DateHelper.getDate((String)ide.getDhEmi(), (SimpleDateFormat)DateHelper.DATE_TIME_XML_FORMAT310))), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.dhEmi.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.dhEmi.NOME_AMIGAVEL"), notaFiscalTO);
            }
            String siglaUF = StringHelper.isBlankOrNull((Object)emitente.getEnderEmit().getUF()) ? null : emitente.getEnderEmit().getUF().toString();
            String string = xMun = StringHelper.isBlankOrNull((Object)ide.getCMunFG()) ? null : this.a(ide.getCMunFG());
            if (StringHelper.isBlankOrNull((Object)ide.getCMunFG()) || !this.b(ide.getCMunFG())) {
                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_IDE_CDMUN_FTGERADOR_INVALIDO, xMun), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.cMunFG.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.cMunFG.NOME_AMIGAVEL"), notaFiscalTO);
            }
            if (StringHelper.isBlankOrNull((Object)ide.getCMunFG()) || StringHelper.isBlankOrNull((Object)emitente.getEnderEmit().getUF()) || !this.a(ide.getCMunFG(), emitente.getEnderEmit().getUF().toString())) {
                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_IDE_CDMUN_FTGERADOR_DIFER_UFEMIT, xMun, siglaUF), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.cMunFG.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.cMunFG.NOME_AMIGAVEL"), notaFiscalTO);
            }
            String cnpjEmitenteNFREf = null;
            if (ide.getNFrefArray() != null && ide.getNFrefArray().length > 0) {
                int posListaNotasConhec = 0;
                int posListaProdutor = 0;
                for (i = 0; i < ide.getNFrefArray().length; ++i) {
                    nfRef = ide.getNFrefArray(i);
                    if (!StringHelper.isBlankOrNull((Object)nfRef.getRefNFe())) {
                        ++posListaNotasConhec;
                        cnpjEmitenteNFREf = nfRef.getRefNFe().substring(6, 20);
                        if (!ChaveAcessoUtil.verificarDigitoChaveAcesso((String)nfRef.getRefNFe())) {
                            this.a(MessageFormat.format(DSENMessageConstants.INFNFE_IDE_DIGITOVERIF_NFEREF_INVALIDO, nfRef.getRefNFe()), MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.NFref.CHOICE.refNFe.NOME_ABA"), posListaNotasConhec), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.NFref.CHOICE.refNFe.NOME_AMIGAVEL"), notaFiscalTO);
                        }
                    }
                    if (nfRef.getRefNF() != null) {
                        ++posListaNotasConhec;
                        cnpjEmitenteNFREf = nfRef.getRefNF().getCNPJ();
                        if (!this.a(nfRef.getRefNF().getCNPJ(), TipoDocumentoEnum.CNPJ)) {
                            this.a(MessageFormat.format(DSENMessageConstants.INFNFE_IDE_CNPJ_INVALIDO_NF_REFER, StringHelper.cnpjFormat((String)nfRef.getRefNF().getCNPJ())), MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.NFref.CHOICE.refNF.SEQUENCE.CNPJ.NOME_ABA"), posListaNotasConhec), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.NFref.CHOICE.refNF.SEQUENCE.CNPJ.NOME_AMIGAVEL"), notaFiscalTO);
                        }
                    }
                    if (nfRef.getRefNFP() != null) {
                        String uf;
                        ++posListaProdutor;
                        if (StringHelper.isBlankOrNull((Object)nfRef.getRefNFP().getCPF()) && StringHelper.isBlankOrNull((Object)nfRef.getRefNFP().getCNPJ())) {
                            this.a(DSENMessageConstants.CAMPO_OBRIGATORIO_NAO_PREENCHIDO, MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.NFref.CHOICE.refNFP.SEQUENCE.CHOICE.CPF.NOME_ABA"), posListaProdutor), DSENLabelConstants.CNPJ_CPF, notaFiscalTO);
                        } else if (!StringHelper.isBlankOrNull((Object)nfRef.getRefNFP().getCNPJ()) && !this.a(nfRef.getRefNFP().getCNPJ(), TipoDocumentoEnum.CNPJ)) {
                            this.a(MessageFormat.format(DSENMessageConstants.INFNFE_IDE_CNPJ_INVALIDO_NF_REFER_PRODRURAL, StringHelper.cnpjFormat((String)nfRef.getRefNFP().getCNPJ())), MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.NFref.CHOICE.refNFP.SEQUENCE.CHOICE.CNPJ.NOME_ABA"), posListaProdutor), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.NFref.CHOICE.refNFP.SEQUENCE.CHOICE.CNPJ.NOME_AMIGAVEL"), notaFiscalTO);
                        } else if (!StringHelper.isBlankOrNull((Object)nfRef.getRefNFP().getCPF()) && !this.a(nfRef.getRefNFP().getCPF(), TipoDocumentoEnum.CPF)) {
                            this.a(MessageFormat.format(DSENMessageConstants.INFNFE_IDE_CPF_INVALIDO_NF_REFER_PRODRURAL, StringHelper.cpfFormat((String)nfRef.getRefNFP().getCPF())), MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.NFref.CHOICE.refNFP.SEQUENCE.CHOICE.CPF.NOME_ABA"), posListaProdutor), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.NFref.CHOICE.refNFP.SEQUENCE.CHOICE.CPF.NOME_AMIGAVEL"), notaFiscalTO);
                        }
                        String string2 = uf = StringHelper.isBlankOrNull((Object)nfRef.getRefNFP().getCUF()) ? null : this.a(Integer.parseInt(nfRef.getRefNFP().getCUF().toString()));
                        if (!this.b(nfRef.getRefNFP().getIE(), uf)) {
                            this.a(MessageFormat.format(DSENMessageConstants.INFNFE_IDE_IE_INVALIDA_NF_REFER_PRODRURAL, nfRef.getRefNFP().getIE()), MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.NFref.CHOICE.refNFP.SEQUENCE.IE.NOME_ABA"), posListaProdutor), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.NFref.CHOICE.refNFP.SEQUENCE.IE.NOME_AMIGAVEL"), notaFiscalTO);
                        }
                    }
                    if (StringHelper.isBlankOrNull((Object)nfRef.getRefCTe())) continue;
                    ++posListaNotasConhec;
                    if (ChaveAcessoUtil.verificarDigitoChaveAcesso((String)nfRef.getRefCTe())) continue;
                    this.a(MessageFormat.format(DSENMessageConstants.INFNFE_IDE_DIGITO_CHAVEACESSO_CTE_INVALIDO, nfRef.getRefCTe()), MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.NFref.CHOICE.refCTe.NOME_ABA"), posListaNotasConhec), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.NFref.CHOICE.refCTe.NOME_AMIGAVEL"), notaFiscalTO);
                }
            }
            if (!StringHelper.isBlankOrNull((Object)ide.getTpEmis())) {
                if (TNFe.InfNFe.Ide.TpEmis.X_1.equals((Object)ide.getTpEmis()) && !StringHelper.isBlankOrNull((Object)ide.getXJust())) {
                    this.a(DSENMessageConstants.INFNFE_IDE_JUST_INFORMADA_EMISSAO_NORMAL, this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.SEQUENCE.xJust.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.SEQUENCE.xJust.NOME_AMIGAVEL"), notaFiscalTO);
                }
                if (!TNFe.InfNFe.Ide.TpEmis.X_1.equals((Object)ide.getTpEmis()) && StringHelper.isBlankOrNull((Object)ide.getXJust())) {
                    this.a(DSENMessageConstants.INFNFE_IDE_JUST_NAO_INFORMADA, this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.SEQUENCE.xJust.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.SEQUENCE.xJust.NOME_AMIGAVEL"), notaFiscalTO);
                }
            }
            if (StringHelper.isBlankOrNull((Object)ide.getCDV()) || !ChaveAcessoUtil.gerarDigitoChaveAcesso((NotaFiscalTO)notaFiscalTO).equals(ide.getCDV())) {
                this.a(DSENMessageConstants.INFNFE_IDE_NFE_CHAVE_ACESSO_INVALIDA, this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.cDV.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.cDV.NOME_AMIGAVEL"), notaFiscalTO);
            }
            TipoAmbienteEnum tipoAmbiente = null;
            if (!StringHelper.isBlankOrNull((Object)ide.getTpAmb())) {
                tipoAmbiente = TAmb.X_1.equals((Object)ide.getTpAmb()) ? TipoAmbienteEnum.PRODUCAO : TipoAmbienteEnum.HOMOLOGACAO;
            }
            if (tipoAmbiente == null || !tipoAmbiente.getCodigo().equals(DSENProperties.getInstance().getAplicativoTipoAmbiente())) {
                this.a(DSENMessageConstants.INFNFE_IDE_NFE_AMBIENTE_DIFERENTE, this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.tpAmb.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.tpAmb.NOME_AMIGAVEL"), notaFiscalTO);
            }
            if (!StringHelper.isBlankOrNull((Object)ide.getFinNFe()) && TFinNFe.X_2.equals((Object)ide.getFinNFe())) {
                int contNFRef = 0;
                for (i = 0; i < ide.getNFrefArray().length; ++i) {
                    nfRef = ide.getNFrefArray(i);
                    if (nfRef.getRefNF() == null && nfRef.getRefNFe() == null) continue;
                    ++contNFRef;
                }
                if (contNFRef == 0) {
                    this.a(DSENMessageConstants.INFNFE_IDE_NFE_COMPLEMENTAR_SEM_NFREF, this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.finNFe.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.finNFe.NOME_AMIGAVEL"), notaFiscalTO);
                } else if (contNFRef > 1) {
                    this.a(DSENMessageConstants.INFNFE_IDE_NFE_COMPLEMENTAR_POSSUI_MAIS1_NFREF, this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.finNFe.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.finNFe.NOME_AMIGAVEL"), notaFiscalTO);
                } else if (StringHelper.isBlankOrNull((Object)cnpjEmitenteNFREf) || !StringHelper.isBlankOrNull((Object)emitente.getCNPJ()) && !cnpjEmitenteNFREf.equals(emitente.getCNPJ())) {
                    this.a(MessageFormat.format(DSENMessageConstants.INFNFE_IDE_NFE_COMPLEMENTAR_CNPJ_DIFERENTE, cnpjEmitenteNFREf, emitente.getCNPJ()), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.finNFe.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.finNFe.NOME_AMIGAVEL"), notaFiscalTO);
                }
            }
            if (StringHelper.isBlankOrNull((Object)ide.getProcEmi()) || !TProcEmi.X_0.equals((Object)ide.getProcEmi()) && !TProcEmi.X_3.equals((Object)ide.getProcEmi())) {
                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_IDE_NFE_PROCEMI_NAOCONTRIBUINTE, cnpjEmitenteNFREf, emitente.getCNPJ()), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.procEmi.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.procEmi.NOME_AMIGAVEL"), notaFiscalTO);
            }
        }
        catch (Exception e) {
            this.a.error((Object)"Erro na valida\u00e7\u00e3o da Nota", (Throwable)e);
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    private void c(NFeDocument nfeDocument, NotaFiscalTO notaFiscalTO) {
        TNFe.InfNFe.Ide ide = nfeDocument.getNFe().getInfNFe().getIde();
        TNFe.InfNFe.Emit emitente = nfeDocument.getNFe().getInfNFe().getEmit();
        if (ide.getTpEmis() != null) {
            if (!TNFe.InfNFe.Ide.TpEmis.X_1.equals((Object)ide.getTpEmis())) {
                if (StringHelper.isBlankOrNull((Object)ide.getDhCont())) {
                    this.a(DSENMessageConstants.INFNFE_IDE_DHCONT_NAO_INFORMADO, this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.SEQUENCE.dhCont.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.SEQUENCE.dhCont.NOME_AMIGAVEL"), notaFiscalTO);
                } else if (!StringHelper.isBlankOrNull((Object)ide.getDhEmi()) && DateHelper.getDate((String)ide.getDhCont(), (SimpleDateFormat)DateHelper.DATE_TIME_XML_FORMAT310).compareTo(DateHelper.getDate((String)ide.getDhEmi(), (SimpleDateFormat)DateHelper.DATE_TIME_XML_FORMAT310)) > 0) {
                    this.a(MessageFormat.format(DSENMessageConstants.INFNFE_EMITENTE_DTENTRADA_CONTING_MAIOR_DTEMISSAO, DateHelper.formataData((Date)DateHelper.getDate((String)ide.getDhCont(), (SimpleDateFormat)DateHelper.DATE_TIME_XML_FORMAT310)), DateHelper.formataData((Date)DateHelper.getDate((String)ide.getDhEmi(), (SimpleDateFormat)DateHelper.DATE_TIME_XML_FORMAT310))), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.SEQUENCE.dhCont.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.SEQUENCE.dhCont.NOME_AMIGAVEL"), notaFiscalTO);
                }
            }
            if (TNFe.InfNFe.Ide.TpEmis.X_1.equals((Object)ide.getTpEmis()) && !StringHelper.isBlankOrNull((Object)ide.getDhCont())) {
                this.a(DSENMessageConstants.INFNFE_IDE_DHCONT_INFORMADO_EMISSAO_NORMAL, this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.SEQUENCE.dhCont.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.ide.SEQUENCE.SEQUENCE.dhCont.NOME_AMIGAVEL"), notaFiscalTO);
            }
        }
        if (emitente != null) {
            String uf;
            if (emitente.getCNPJ() != null && !this.a(emitente.getCNPJ(), TipoDocumentoEnum.CNPJ)) {
                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_EMITENTE_CNPJ_INVALIDO, StringHelper.cnpjFormat((String)emitente.getCNPJ())), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.emit.SEQUENCE.CHOICE.CNPJ.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.emit.SEQUENCE.CHOICE.CNPJ.NOME_AMIGAVEL"), notaFiscalTO);
            }
            if (emitente.getCPF() != null) {
                if (nfeDocument.getNFe().getInfNFe().getAvulsa() == null) {
                    this.a(DSENMessageConstants.INFNFE_EMITENTE_CPF_INFORMADO_NFE_NAO_AVULSA, this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.emit.SEQUENCE.CHOICE.CPF.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.emit.SEQUENCE.CHOICE.CPF.NOME_AMIGAVEL"), notaFiscalTO);
                } else if (!this.a(emitente.getCPF(), TipoDocumentoEnum.CPF)) {
                    this.a(MessageFormat.format(DSENMessageConstants.INFNFE_EMITENTE_CPF_EMITENTE_INVALIDO, StringHelper.cpfFormat((String)emitente.getCPF())), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.emit.SEQUENCE.CHOICE.CPF.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.emit.SEQUENCE.CHOICE.CPF.NOME_AMIGAVEL"), notaFiscalTO);
                }
            }
            if (emitente.getEnderEmit() != null) {
                String xMun;
                String siglaUF = StringHelper.isBlankOrNull((Object)emitente.getEnderEmit().getUF()) ? null : emitente.getEnderEmit().getUF().toString();
                String string = xMun = StringHelper.isBlankOrNull((Object)emitente.getEnderEmit().getCMun()) ? null : this.a(emitente.getEnderEmit().getCMun());
                if (StringHelper.isBlankOrNull((Object)emitente.getEnderEmit().getCMun()) || !this.b(emitente.getEnderEmit().getCMun())) {
                    this.a(MessageFormat.format(DSENMessageConstants.INFNFE_EMITENTE_CDMUN_EMITENTE_INVALIDO, xMun), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.emit.SEQUENCE.enderEmit.SEQUENCE.cMun.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.emit.SEQUENCE.enderEmit.SEQUENCE.cMun.NOME_AMIGAVEL"), notaFiscalTO);
                }
                if (StringHelper.isBlankOrNull((Object)emitente.getEnderEmit().getCMun()) || StringHelper.isBlankOrNull((Object)emitente.getEnderEmit().getUF()) || !this.a(emitente.getEnderEmit().getCMun(), emitente.getEnderEmit().getUF().toString())) {
                    this.a(MessageFormat.format(DSENMessageConstants.INFNFE_EMITENTE_CDMUN_EMITENTE_DIFER_UFEMIT, xMun, siglaUF), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.emit.SEQUENCE.enderEmit.SEQUENCE.xMun.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.emit.SEQUENCE.enderEmit.SEQUENCE.xMun.NOME_AMIGAVEL"), notaFiscalTO);
                }
            }
            if (StringHelper.isBlankOrNull((Object)emitente.getIE())) {
                this.a(DSENMessageConstants.INFNFE_EMITENTE_IE_NAO_INFORMADA, this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.emit.SEQUENCE.IE.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.emit.SEQUENCE.IE.NOME_AMIGAVEL"), notaFiscalTO);
            } else {
                String string = uf = emitente.getEnderEmit().getUF() == null ? null : emitente.getEnderEmit().getUF().toString();
                if (!this.b(emitente.getIE(), uf)) {
                    this.a(DSENMessageConstants.INFNFE_EMITENTE_IE_INVALIDA, this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.emit.SEQUENCE.IE.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.emit.SEQUENCE.IE.NOME_AMIGAVEL"), notaFiscalTO);
                }
            }
            uf = null;
            boolean isFaturamentoDiretoVeicNovos = false;
            TNFe.InfNFe.Det[] detArray = nfeDocument.getNFe().getInfNFe().getDetArray();
            if (detArray != null) {
                for (int i = 0; i < detArray.length; ++i) {
                    TNFe.InfNFe.Det det = detArray[i];
                    if (det.getProd() == null || det.getProd().getVeicProd() == null || StringHelper.isBlankOrNull((Object)det.getProd().getVeicProd().getTpOp()) || !TNFe.InfNFe.Det.Prod.VeicProd.TpOp.X_2.equals((Object)det.getProd().getVeicProd().getTpOp())) continue;
                    isFaturamentoDiretoVeicNovos = true;
                }
            }
            if (isFaturamentoDiretoVeicNovos) {
                if (nfeDocument.getNFe().getInfNFe().getEntrega() == null || StringHelper.isBlankOrNull((Object)nfeDocument.getNFe().getInfNFe().getEntrega().getUF())) {
                    this.a(DSENMessageConstants.INFNFE_EMITENTE_UF_LOCAL_ENTREGA_OBRIGATORIA, this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.emit.SEQUENCE.IEST.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.emit.SEQUENCE.IEST.NOME_AMIGAVEL"), notaFiscalTO);
                } else {
                    uf = nfeDocument.getNFe().getInfNFe().getEntrega().getUF().toString();
                }
            } else if (nfeDocument.getNFe().getInfNFe().getDest() != null && nfeDocument.getNFe().getInfNFe().getDest().getEnderDest() != null && !StringHelper.isBlankOrNull((Object)nfeDocument.getNFe().getInfNFe().getDest().getEnderDest().getUF())) {
                uf = nfeDocument.getNFe().getInfNFe().getDest().getEnderDest().getUF().toString();
            }
            if (!StringHelper.isBlankOrNull((Object)emitente.getIEST()) && !this.b(emitente.getIEST(), uf)) {
                this.a(DSENMessageConstants.INFNFE_EMITENTE_IEST_INVALIDA, this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.emit.SEQUENCE.IEST.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.emit.SEQUENCE.IEST.NOME_AMIGAVEL"), notaFiscalTO);
            }
        }
    }

    private void d(NFeDocument nfeDocument, NotaFiscalTO notaFiscalTO) {
        TNFe.InfNFe.Avulsa avulsa = nfeDocument.getNFe().getInfNFe().getAvulsa();
        if (avulsa != null) {
            this.a(DSENMessageConstants.INFNFE_IDENT_FISCO_EMITENTE_AVULSA, this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.avulsa.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.avulsa.NOME_AMIGAVEL"), notaFiscalTO);
        }
    }

    private void e(NFeDocument nfeDocument, NotaFiscalTO notaFiscalTO) {
        TNFe.InfNFe.Dest dest = nfeDocument.getNFe().getInfNFe().getDest();
        if (dest != null) {
            if (dest.getEnderDest() != null) {
                if (!StringHelper.isBlankOrNull((Object)dest.getEnderDest().getUF()) && TUf.EX.equals((Object)dest.getEnderDest().getUF())) {
                    TNFe.InfNFe.Ide ide;
                    if (!StringHelper.isBlankOrNull((Object)dest.getCNPJ())) {
                        this.a(DSENMessageConstants.INFNFE_DEST_CNPJ_INFORMADO_EXTERIOR, this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.dest.SEQUENCE.CHOICE.CNPJ.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.dest.SEQUENCE.CHOICE.CNPJ.NOME_AMIGAVEL"), notaFiscalTO);
                    }
                    if (StringHelper.isBlankOrNull((Object)dest.getEnderDest().getCMun()) || !dest.getEnderDest().getCMun().equals(DSENConstants.CD_MUNICIPIO_EXTERIOR)) {
                        this.a(DSENMessageConstants.INFNFE_DEST_CMUN_DIFERENTE_9999999, this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.dest.SEQUENCE.enderDest.SEQUENCE.cMun.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.dest.SEQUENCE.enderDest.SEQUENCE.cMun.NOME_AMIGAVEL"), notaFiscalTO);
                    }
                    if (StringHelper.isBlankOrNull((Object)dest.getEnderDest().getCPais()) || Tpais.X_1058.equals((Object)dest.getEnderDest().getCPais())) {
                        this.a(DSENMessageConstants.INFNFE_DEST_CPAIS_INVALIDO_EXTERIOR, this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.dest.SEQUENCE.enderDest.SEQUENCE.cPais.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.dest.SEQUENCE.enderDest.SEQUENCE.cPais.NOME_AMIGAVEL"), notaFiscalTO);
                    }
                    if (!StringHelper.isBlankOrNull((Object)(ide = nfeDocument.getNFe().getInfNFe().getIde()).getTpAmb())) {
                        if (TAmb.X_1.equals((Object)ide.getTpAmb())) {
                            if (!StringHelper.isBlankOrNull((Object)dest.getIE())) {
                                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_DEST_IE_INVALIDA, dest.getIE()), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.dest.SEQUENCE.IE.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.dest.SEQUENCE.IE.NOME_AMIGAVEL"), notaFiscalTO);
                            }
                        } else if (!StringHelper.isBlankOrNull((Object)dest.getIE())) {
                            this.a(MessageFormat.format(DSENMessageConstants.INFNFE_DEST_IE_HOMOLOG, dest.getIE()), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.dest.SEQUENCE.IE.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.dest.SEQUENCE.IE.NOME_AMIGAVEL"), notaFiscalTO);
                        }
                    }
                } else {
                    String xMun;
                    TNFe.InfNFe.Ide ide = nfeDocument.getNFe().getInfNFe().getIde();
                    if (!StringHelper.isBlankOrNull((Object)ide.getTpAmb()) && TAmb.X_1.equals((Object)ide.getTpAmb()) && StringHelper.isBlankOrNull((Object)dest.getCNPJ()) && StringHelper.isBlankOrNull((Object)dest.getCPF())) {
                        this.a(DSENMessageConstants.INFNFE_DEST_CNPJ_CPF_NULO, this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.dest.SEQUENCE.CHOICE.CNPJ.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.dest.SEQUENCE.CHOICE.CNPJ.NOME_AMIGAVEL"), notaFiscalTO);
                    }
                    String siglaUF = StringHelper.isBlankOrNull((Object)dest.getEnderDest().getUF()) ? null : dest.getEnderDest().getUF().toString();
                    String string = xMun = StringHelper.isBlankOrNull((Object)dest.getEnderDest().getCMun()) ? null : this.a(dest.getEnderDest().getCMun());
                    if (StringHelper.isBlankOrNull((Object)dest.getEnderDest().getCMun()) || !this.b(dest.getEnderDest().getCMun())) {
                        this.a(MessageFormat.format(DSENMessageConstants.INFNFE_DEST_CMUN_INVALIDO, xMun), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.emit.SEQUENCE.enderEmit.SEQUENCE.cMun.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.emit.SEQUENCE.enderEmit.SEQUENCE.cMun.NOME_AMIGAVEL"), notaFiscalTO);
                    }
                    if (StringHelper.isBlankOrNull((Object)dest.getEnderDest().getCMun()) || StringHelper.isBlankOrNull((Object)dest.getEnderDest().getUF()) || !this.a(dest.getEnderDest().getCMun(), dest.getEnderDest().getUF().toString())) {
                        this.a(MessageFormat.format(DSENMessageConstants.INFNFE_DEST_CMUN_UF_INVALIDO, xMun, siglaUF), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.emit.SEQUENCE.enderEmit.SEQUENCE.cMun.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.emit.SEQUENCE.enderEmit.SEQUENCE.cMun.NOME_AMIGAVEL"), notaFiscalTO);
                    }
                    if (!StringHelper.isBlankOrNull((Object)dest.getEnderDest().getCPais()) && !Tpais.X_1058.equals((Object)dest.getEnderDest().getCPais())) {
                        this.a(MessageFormat.format(DSENMessageConstants.INFNFE_DEST_CPAIS_INVALIDO_NAO_EXTERIOR, new Object[]{dest.getEnderDest().getCPais()}), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.dest.SEQUENCE.enderDest.SEQUENCE.cPais.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.dest.SEQUENCE.enderDest.SEQUENCE.cPais.NOME_AMIGAVEL"), notaFiscalTO);
                    }
                    if (TAmb.X_1.equals((Object)ide.getTpAmb()) && !StringHelper.isBlankOrNull((Object)dest.getIE()) && !dest.getIE().equalsIgnoreCase(DSENConstants.ISENTO) && !this.b(dest.getIE(), siglaUF)) {
                        this.a(MessageFormat.format(DSENMessageConstants.INFNFE_DEST_IE_INVALIDA, dest.getIE()), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.dest.SEQUENCE.IE.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.dest.SEQUENCE.IE.NOME_AMIGAVEL"), notaFiscalTO);
                    }
                }
            }
            if (!StringHelper.isBlankOrNull((Object)dest.getCNPJ()) && !this.a(dest.getCNPJ(), TipoDocumentoEnum.CNPJ)) {
                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_DEST_CNPJ_INVALIDO, StringHelper.cnpjFormat((String)dest.getCNPJ())), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.dest.SEQUENCE.CHOICE.CNPJ.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.dest.SEQUENCE.CHOICE.CNPJ.NOME_AMIGAVEL"), notaFiscalTO);
            }
            if (!(StringHelper.isBlankOrNull((Object)dest.getCPF()) || dest.getCPF().matches("[9]{11}") || this.a(dest.getCPF(), TipoDocumentoEnum.CPF))) {
                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_DEST_CPF_INVALIDO, StringHelper.cpfFormat((String)dest.getCPF())), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.dest.SEQUENCE.CHOICE.CPF.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.dest.SEQUENCE.CHOICE.CPF.NOME_AMIGAVEL"), notaFiscalTO);
            }
            if (!StringHelper.isBlankOrNull((Object)dest.getISUF()) && dest.getISUF().matches("[0-9]{8,9}")) {
                if ("AC".equals(dest.getEnderDest().getUF().toString()) || "AM".equals(dest.getEnderDest().getUF().toString()) || "RO".equals(dest.getEnderDest().getUF().toString()) || "RR".equals(dest.getEnderDest().getUF().toString()) || "AP".equals(dest.getEnderDest().getUF().toString()) && !StringHelper.isBlankOrNull((Object)dest.getEnderDest().getCMun()) && (DSENConstants.CODIGO_MUNICIPIO_AP_MACAPA.equals(dest.getEnderDest().getCMun()) || DSENConstants.CODIGO_MUNICIPIO_AP_SANTANA.equals(dest.getEnderDest().getCMun()))) {
                    if (!this.b(dest.getISUF(), "SU")) {
                        this.a(MessageFormat.format(DSENMessageConstants.INFNFE_DEST_IE_ISUF_INVALIDA, DSENMessageConstants.DESTINATARIO), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.dest.SEQUENCE.ISUF.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.dest.SEQUENCE.ISUF.NOME_AMIGAVEL"), notaFiscalTO);
                    }
                } else {
                    this.a(MessageFormat.format(DSENMessageConstants.INFNFE_DEST_CMUN_PERTENCE_SUFRAMA, DSENMessageConstants.DESTINATARIO), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.dest.SEQUENCE.ISUF.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.dest.SEQUENCE.ISUF.NOME_AMIGAVEL"), notaFiscalTO);
                }
            }
        }
    }

    private void f(NFeDocument nfeDocument, NotaFiscalTO notaFiscalTO) {
        TLocal retirada = nfeDocument.getNFe().getInfNFe().getRetirada();
        if (retirada != null) {
            if (!StringHelper.isBlankOrNull((Object)retirada.getCNPJ()) && !this.a(retirada.getCNPJ(), TipoDocumentoEnum.CNPJ)) {
                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_RETIRADA_CNPJ_INVALIDO, StringHelper.cnpjFormat((String)retirada.getCNPJ())), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.retirada.SEQUENCE.CHOICE.CNPJ.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.retirada.SEQUENCE.CHOICE.CNPJ.NOME_AMIGAVEL"), notaFiscalTO);
            }
            if (!StringHelper.isBlankOrNull((Object)retirada.getCPF()) && !this.a(retirada.getCPF(), TipoDocumentoEnum.CPF)) {
                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_RETIRADA_CPF_INVALIDO, StringHelper.cpfFormat((String)retirada.getCPF())), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.retirada.SEQUENCE.CHOICE.CPF.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.retirada.SEQUENCE.CHOICE.CPF.NOME_AMIGAVEL"), notaFiscalTO);
            }
            if (!StringHelper.isBlankOrNull((Object)retirada.getUF()) && TUf.EX.equals((Object)retirada.getUF())) {
                if (StringHelper.isBlankOrNull((Object)retirada.getCMun()) || !retirada.getCMun().equals(DSENConstants.CD_MUNICIPIO_EXTERIOR)) {
                    this.a(DSENMessageConstants.INFNFE_RETIRADA_CMUN_INVALIDO_EX, this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.retirada.SEQUENCE.xMun.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.retirada.SEQUENCE.xMun.NOME_AMIGAVEL"), notaFiscalTO);
                }
            } else {
                String xMun;
                String siglaUF = StringHelper.isBlankOrNull((Object)retirada.getUF()) ? null : retirada.getUF().toString();
                String string = xMun = StringHelper.isBlankOrNull((Object)retirada.getCMun()) ? null : this.a(retirada.getCMun());
                if (StringHelper.isBlankOrNull((Object)retirada.getCMun()) || !this.b(retirada.getCMun())) {
                    this.a(MessageFormat.format(DSENMessageConstants.INFNFE_RETIRADA_CMUN_INVALIDO, xMun), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.retirada.SEQUENCE.xMun.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.retirada.SEQUENCE.xMun.NOME_AMIGAVEL"), notaFiscalTO);
                }
                if (StringHelper.isBlankOrNull((Object)retirada.getCMun()) || StringHelper.isBlankOrNull((Object)siglaUF) || !this.a(retirada.getCMun(), retirada.getUF().toString())) {
                    this.a(MessageFormat.format(DSENMessageConstants.INFNFE_RETIRADA_CMUN_UF_INVALIDO, xMun, siglaUF), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.retirada.SEQUENCE.UF.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.retirada.SEQUENCE.UF.NOME_AMIGAVEL"), notaFiscalTO);
                }
            }
        }
    }

    private void g(NFeDocument nfeDocument, NotaFiscalTO notaFiscalTO) {
        TLocal entrega = nfeDocument.getNFe().getInfNFe().getEntrega();
        if (entrega != null) {
            if (!StringHelper.isBlankOrNull((Object)entrega.getCNPJ()) && !this.a(entrega.getCNPJ(), TipoDocumentoEnum.CNPJ)) {
                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_ENTREGA_CNPJ_INVALIDO, StringHelper.cnpjFormat((String)entrega.getCNPJ())), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.entrega.SEQUENCE.CHOICE.CNPJ.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.entrega.SEQUENCE.CHOICE.CNPJ.NOME_AMIGAVEL"), notaFiscalTO);
            }
            if (!StringHelper.isBlankOrNull((Object)entrega.getCPF()) && !this.a(entrega.getCPF(), TipoDocumentoEnum.CPF)) {
                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_ENTREGA_CPF_INVALIDO, StringHelper.cpfFormat((String)entrega.getCPF())), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.entrega.SEQUENCE.CHOICE.CPF.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.entrega.SEQUENCE.CHOICE.CPF.NOME_AMIGAVEL"), notaFiscalTO);
            }
            if (!StringHelper.isBlankOrNull((Object)entrega.getUF()) && TUf.EX.equals((Object)entrega.getUF())) {
                if (StringHelper.isBlankOrNull((Object)entrega.getCMun()) || !entrega.getCMun().equals(DSENConstants.CD_MUNICIPIO_EXTERIOR)) {
                    this.a(DSENMessageConstants.INFNFE_ENTREGA_CMUN_INVALIDO_EX, this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.entrega.SEQUENCE.xMun.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.entrega.SEQUENCE.xMun.NOME_AMIGAVEL"), notaFiscalTO);
                }
            } else {
                String xMun;
                String siglaUF = StringHelper.isBlankOrNull((Object)entrega.getUF()) ? null : entrega.getUF().toString();
                String string = xMun = StringHelper.isBlankOrNull((Object)entrega.getCMun()) ? null : this.a(entrega.getCMun());
                if (StringHelper.isBlankOrNull((Object)entrega.getCMun()) || !this.b(entrega.getCMun())) {
                    this.a(MessageFormat.format(DSENMessageConstants.INFNFE_ENTREGA_CMUN_INVALIDO, xMun), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.entrega.SEQUENCE.xMun.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.entrega.SEQUENCE.xMun.NOME_AMIGAVEL"), notaFiscalTO);
                }
                if (StringHelper.isBlankOrNull((Object)entrega.getCMun()) || StringHelper.isBlankOrNull((Object)siglaUF) || !this.a(entrega.getCMun(), entrega.getUF().toString())) {
                    this.a(MessageFormat.format(DSENMessageConstants.INFNFE_ENTREGA_CMUN_UF_INVALIDO, xMun, siglaUF), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.entrega.SEQUENCE.UF.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.entrega.SEQUENCE.UF.NOME_AMIGAVEL"), notaFiscalTO);
                }
            }
        }
    }

    private void h(NFeDocument nfeDocument, NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        TNFe.InfNFe.Det[] det = nfeDocument.getNFe().getInfNFe().getDetArray();
        TNFe.InfNFe.Ide ide = nfeDocument.getNFe().getInfNFe().getIde();
        TNFe.InfNFe.Dest destinatario = nfeDocument.getNFe().getInfNFe().getDest();
        TNFe.InfNFe.Emit emitente = nfeDocument.getNFe().getInfNFe().getEmit();
        TNFe.InfNFe infNFe = nfeDocument.getNFe().getInfNFe();
        if (det != null && det.length > 0) {
            double valorTotalBCICMS = 0.0;
            double valorTotalBCICMSST = 0.0;
            double valorTotalICMS = 0.0;
            double valorTotalICMSST = 0.0;
            double valorTotalProduto = 0.0;
            double valorTotalFrete = 0.0;
            double valorTotalSeguro = 0.0;
            double valorTotalDesconto = 0.0;
            double valorTotalIPI = 0.0;
            double valorTotalII = 0.0;
            double valorTotalPIS = 0.0;
            double valorTotalCOFINS = 0.0;
            double valorTotalOutro = 0.0;
            double valorTotalBCISSQN = 0.0;
            double valorTotalISSISSQN = 0.0;
            double valorTotalPISISSQN = 0.0;
            double valorTotalCOFINSISSQN = 0.0;
            boolean informadoGrupoICMS = false;
            boolean informadoGrupoISSQN = false;
            for (int i = 0; i < det.length; ++i) {
                String nItem = det[i].getNItem();
                TNFe.InfNFe.Det.Prod produto = det[i].getProd();
                TNFe.InfNFe.Det.Imposto imposto = det[i].getImposto();
                if (produto == null || !StringHelper.isBlankOrNull((Object)produto.getCEAN())) {
                    // empty if block
                }
                if (produto != null && produto.getCFOP() != null) {
                    String ufConsumo;
                    TNFe.InfNFe.Det.Prod.Comb comb;
                    if (ide.getTpNF() != null) {
                        if (TNFe.InfNFe.Ide.TpNF.X_1.equals((Object)ide.getTpNF())) {
                            if (produto.getCFOP().toString().startsWith("1") || produto.getCFOP().toString().startsWith("2") || produto.getCFOP().toString().startsWith("3")) {
                                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_PRODSERV_CFOP_ENTRADA_NOTASAIDA, produto.getCFOP().toString()), MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.prod.SEQUENCE.CFOP.NOME_ABA"), nItem), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.prod.SEQUENCE.CFOP.NOME_AMIGAVEL"), notaFiscalTO);
                            }
                        } else if (TNFe.InfNFe.Ide.TpNF.X_0.equals((Object)ide.getTpNF()) && (produto.getCFOP().toString().startsWith("5") || produto.getCFOP().toString().startsWith("6") || produto.getCFOP().toString().startsWith("7"))) {
                            this.a(MessageFormat.format(DSENMessageConstants.INFNFE_PRODSERV_CFOP_SAIDA_NOTAENTRADA, produto.getCFOP().toString()), MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.prod.SEQUENCE.CFOP.NOME_ABA"), nItem), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.prod.SEQUENCE.CFOP.NOME_AMIGAVEL"), notaFiscalTO);
                        }
                    }
                    if (imposto.getPIS() == null || imposto.getPIS().getPISAliq() == null && imposto.getPIS().getPISNT() == null && imposto.getPIS().getPISOutr() == null && imposto.getPIS().getPISQtde() == null) {
                        this.a(DSENMessageConstants.INFNFE_PRODSERV_PIS_NAO_INFORMADO, MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.imposto.SEQUENCE.PIS.CHOICE.PISAliq.SEQUENCE.CST.NOME_ABA"), nItem), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.imposto.SEQUENCE.PIS.CHOICE.PISAliq.SEQUENCE.CST.NOME_AMIGAVEL"), notaFiscalTO);
                    }
                    if (imposto.getCOFINS() == null || imposto.getCOFINS().getCOFINSAliq() == null && imposto.getCOFINS().getCOFINSNT() == null && imposto.getCOFINS().getCOFINSOutr() == null && imposto.getCOFINS().getCOFINSQtde() == null) {
                        this.a(DSENMessageConstants.INFNFE_PRODSERV_COFINS_NAO_INFORMADO, MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.imposto.SEQUENCE.COFINS.CHOICE.COFINSAliq.SEQUENCE.CST.NOME_ABA"), nItem), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.imposto.SEQUENCE.COFINS.CHOICE.COFINSAliq.SEQUENCE.CST.NOME_AMIGAVEL"), notaFiscalTO);
                    }
                    if ((imposto.getICMS() != null || imposto.getII() != null) && imposto.getISSQN() != null) {
                        this.a(DSENMessageConstants.INFNFE_PRODSERV_INFORME_ICMS_OU_ISSQN, MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.imposto.NOME_ABA"), nItem), "", notaFiscalTO);
                    }
                    if ((comb = produto.getComb()) != null && comb.getUFCons() != null) {
                        try {
                            ufConsumo = DSENUtilHelper.getInstance().getSiglaEstadoTO(comb.getUFCons().toString()).getSigla();
                        }
                        catch (DSGEUtilException e) {
                            ufConsumo = null;
                        }
                    } else {
                        ufConsumo = null;
                    }
                    if (destinatario.getEnderDest() != null) {
                        String siglaUF;
                        String string = siglaUF = StringHelper.isBlankOrNull((Object)destinatario.getEnderDest().getUF()) ? null : destinatario.getEnderDest().getUF().toString();
                        if (!(StringHelper.isBlankOrNull((Object)destinatario.getEnderDest().getUF()) || produto.getCFOP() == null || !produto.getCFOP().toString().startsWith("3") && !produto.getCFOP().toString().startsWith("7") || TUf.EX.equals((Object)destinatario.getEnderDest().getUF()) || ufConsumo != null && "EX".equals(ufConsumo))) {
                            this.a(MessageFormat.format(DSENMessageConstants.INFNFE_PRODSERV_CFOP_EXTERIOR_UFDIFER_EX, produto.getCFOP().toString(), siglaUF), MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.prod.SEQUENCE.CFOP.NOME_ABA"), nItem), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.prod.SEQUENCE.CFOP.NOME_AMIGAVEL"), notaFiscalTO);
                        }
                    }
                    if (destinatario.getEnderDest() != null && emitente.getEnderEmit() != null && !StringHelper.isBlankOrNull((Object)destinatario.getEnderDest().getUF()) && !StringHelper.isBlankOrNull((Object)emitente.getEnderEmit().getUF())) {
                        String siglaUFEmitente = emitente.getEnderEmit().getUF().toString();
                        String siglaUFDestinatario = destinatario.getEnderDest().getUF().toString();
                        String modFrete = "";
                        if (!(StringHelper.isBlankOrNull((Object)destinatario.getIE()) || DSENConstants.ISENTO.equals(destinatario.getIE()) || produto.getCFOP().toString().startsWith("5") || !produto.getCFOP().toString().startsWith("1") || siglaUFEmitente.equals(siglaUFDestinatario) || ufConsumo != null && siglaUFEmitente.equals(ufConsumo))) {
                            this.a(MessageFormat.format(DSENMessageConstants.INFNFE_PRODSERV_CFOP_ESTADUAL_UFEMITENTE_DIFER_UFREMETENTE, produto.getCFOP().toString(), siglaUFEmitente, siglaUFDestinatario), MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.prod.SEQUENCE.CFOP.NOME_ABA"), nItem), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.prod.SEQUENCE.CFOP.NOME_AMIGAVEL"), notaFiscalTO);
                        }
                        if ((produto.getCFOP().toString().startsWith("2") || produto.getCFOP().toString().startsWith("6")) && siglaUFEmitente.equals(siglaUFDestinatario) && (ufConsumo == null || siglaUFEmitente.equals(ufConsumo)) && !emitente.getCNPJ().equals(destinatario.getCNPJ())) {
                            this.a(MessageFormat.format(DSENMessageConstants.INFNFE_PRODSERV_CFOP_NAOESTADUAL_UFEMITENTE_IGUAL_UFDEST, produto.getCFOP().toString(), siglaUFEmitente, siglaUFDestinatario), MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.prod.SEQUENCE.CFOP.NOME_ABA"), nItem), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.prod.SEQUENCE.CFOP.NOME_AMIGAVEL"), notaFiscalTO);
                        }
                    }
                    if (produto.getCFOP() != null && (produto.getCFOP().toString().startsWith("3") || produto.getCFOP().toString().startsWith("7"))) {
                        if (!(!StringHelper.isBlankOrNull((Object)produto.getNCM()) && produto.getNCM().trim().length() == 8 || imposto.getISSQN() != null && "00".equals(produto.getNCM()))) {
                            this.a(MessageFormat.format(DSENMessageConstants.INFNFE_PRODSERV_CFOP_EXTERIOR_NCM_INVALIDO, produto.getCFOP().toString(), produto.getNCM()), MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.prod.SEQUENCE.CFOP.NOME_ABA"), nItem), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.prod.SEQUENCE.CFOP.NOME_AMIGAVEL"), notaFiscalTO);
                        }
                        if (!(!produto.getCFOP().toString().startsWith("3") || "3201".equals(produto.getCFOP().toString()) || "3202".equals(produto.getCFOP().toString()) || "3211".equals(produto.getCFOP().toString()) || "3503".equals(produto.getCFOP().toString()) || "3553".equals(produto.getCFOP().toString()))) {
                            if (produto.getDIArray() == null || produto.getDIArray().length == 0) {
                                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_PRODSERV_CFOP_IMPORTACAO_DI_INVALIDO, produto.getCFOP().toString()), MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.prod.SEQUENCE.CFOP.NOME_ABA"), nItem), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.prod.SEQUENCE.CFOP.NOME_AMIGAVEL"), notaFiscalTO);
                            }
                        } else if (produto.getCFOP().toString().startsWith("7")) {
                            TNFe.InfNFe.Exporta exporta = nfeDocument.getNFe().getInfNFe().getExporta();
                            if (exporta == null || StringHelper.isBlankOrNull((Object)exporta.getUFSaidaPais()) || StringHelper.isBlankOrNull((Object)exporta.getXLocExporta())) {
                                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_PRODSERV_CFOP_EXPORTACAO_LOCAL_EMBARQUE_INVALIDO, produto.getCFOP().toString()), MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.prod.SEQUENCE.CFOP.NOME_ABA"), nItem), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.prod.SEQUENCE.CFOP.NOME_AMIGAVEL"), notaFiscalTO);
                            }
                            if (det[i].getImposto() != null && det[i].getImposto().getICMS() != null) {
                                CSTICMS csticms = this.a(det[i].getImposto().getICMS());
                                String cst = "";
                                if (csticms != null && !StringHelper.isBlankOrNull((Object)csticms.a)) {
                                    cst = csticms.a;
                                }
                                if (!cst.equals("41") && !cst.equals("300")) {
                                    this.a(DSENMessageConstants.INFNFE_ITEMTRIB_CFOP_EXPORTACAO_ICMS_INCOMP, MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.imposto.SEQUENCE.CHOICE.SEQUENCE.ICMS.CHOICE.ICMS00.SEQUENCE.CST.NOME_ABA"), nItem), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.imposto.SEQUENCE.CHOICE.SEQUENCE.ICMS.CHOICE.ICMS00.SEQUENCE.CST.NOME_AMIGAVEL"), notaFiscalTO);
                                }
                            }
                        }
                    }
                }
                if (imposto != null) {
                    if (produto != null && imposto.getIPI() != null && (StringHelper.isBlankOrNull((Object)produto.getNCM()) || produto.getNCM().trim().length() != 8)) {
                        this.a(DSENMessageConstants.INFNFE_ITEMTRIB_IPI_REJEICAO_NCM, MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.imposto.SEQUENCE.CHOICE.SEQUENCE.IPI.NOME_ABA"), nItem), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.imposto.SEQUENCE.CHOICE.SEQUENCE.IPI.NOME_AMIGAVEL"), notaFiscalTO);
                    }
                    if (imposto.getICMS() != null) {
                        double diff;
                        CSTICMS csticms = this.a(det[i].getImposto().getICMS());
                        String cst = csticms.a;
                        if (!StringHelper.isBlankOrNull((Object)cst)) {
                            informadoGrupoICMS = true;
                        }
                        BigDecimal valorICMS = csticms.a();
                        BigDecimal aliquotaICMS = csticms.b();
                        BigDecimal baseCalculoICMS = csticms.c();
                        BigDecimal baseCalculoICMSST = csticms.d();
                        BigDecimal valorICMSST = csticms.f();
                        if ("40".equals(cst) || "41".equals(cst) || "50".equals(cst)) {
                            TNFe.InfNFe.Det.Imposto.ICMS.ICMS40 icms40 = det[i].getImposto().getICMS().getICMS40();
                            String motDesICMS = null;
                            if (icms40 != null && icms40.getMotDesICMS() != null) {
                                motDesICMS = icms40.getMotDesICMS().toString();
                            }
                            if (motDesICMS != null && this.a && motDesICMS.equals("7")) {
                                if (!(destinatario != null && !StringHelper.isBlankOrNull((Object)destinatario.getISUF()) || produto.getCFOP() == null || produto.getCFOP().toString().substring(0, 1).equals("1") || produto.getCFOP().toString().substring(0, 1).equals("2"))) {
                                    this.a(DSENMessageConstants.INFNFE_PRODSERV_ISENCAO_ISUF, MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.imposto.SEQUENCE.CHOICE.SEQUENCE.ICMS.CHOICE.ICMS40.SEQUENCE.SEQUENCE.motDesICMS.NOME_ABA"), nItem), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.imposto.SEQUENCE.CHOICE.SEQUENCE.ICMS.CHOICE.ICMS40.SEQUENCE.SEQUENCE.motDesICMS.NOME_AMIGAVEL"), notaFiscalTO);
                                }
                                if (!(produto != null && !StringHelper.isBlankOrNull((Object)produto.getCFOP()) && ("1203".equals(produto.getCFOP().toString()) || "1204".equals(produto.getCFOP().toString()) || "1208".equals(produto.getCFOP().toString()) || "1209".equals(produto.getCFOP().toString()) || "2203".equals(produto.getCFOP().toString()) || "2204".equals(produto.getCFOP().toString()) || "2208".equals(produto.getCFOP().toString()) || "2209".equals(produto.getCFOP().toString()) || "5109".equals(produto.getCFOP().toString()) || "5110".equals(produto.getCFOP().toString()) || "5151".equals(produto.getCFOP().toString()) || "5152".equals(produto.getCFOP().toString()) || "5120".equals(produto.getCFOP().toString()) || "5651".equals(produto.getCFOP().toString()) || "5652".equals(produto.getCFOP().toString()) || "5654".equals(produto.getCFOP().toString()) || "5655".equals(produto.getCFOP().toString()) || "5658".equals(produto.getCFOP().toString()) || "5659".equals(produto.getCFOP().toString()) || "6109".equals(produto.getCFOP().toString()) || "6110".equals(produto.getCFOP().toString()) || "6152".equals(produto.getCFOP().toString()) || "6122".equals(produto.getCFOP().toString()) || "6123".equals(produto.getCFOP().toString()) || "6120".equals(produto.getCFOP().toString()) || "6651".equals(produto.getCFOP().toString()) || "6652".equals(produto.getCFOP().toString()) || "6654".equals(produto.getCFOP().toString()) || "6655".equals(produto.getCFOP().toString()) || "6658".equals(produto.getCFOP().toString()) || "6659".equals(produto.getCFOP().toString())))) {
                                    this.a(DSENMessageConstants.INFNFE_PRODSERV_ISENCAO_CFOP, MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.imposto.SEQUENCE.CHOICE.SEQUENCE.ICMS.CHOICE.ICMS40.SEQUENCE.SEQUENCE.motDesICMS.NOME_ABA"), nItem), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.imposto.SEQUENCE.CHOICE.SEQUENCE.ICMS.CHOICE.ICMS40.SEQUENCE.SEQUENCE.motDesICMS.NOME_AMIGAVEL"), notaFiscalTO);
                                }
                            }
                        }
                        if (("00".equals(cst) || "10".equals(cst) || "20".equals(cst) || "51".equals(cst) || "70".equals(cst)) && FinalidadeEmissaoEnum.NFE_NORMAL.getCodigo().equals(nfeDocument.getNFe().getInfNFe().getIde().getFinNFe().toString()) && !StringHelper.isBlankOrNull((Object)cst) && valorICMS != null && aliquotaICMS != null && baseCalculoICMS != null && (diff = Math.abs(baseCalculoICMS.doubleValue() * aliquotaICMS.doubleValue() / 100.0 - valorICMS.doubleValue())) > a) {
                            this.a(MessageFormat.format(DSENMessageConstants.INFNFE_ITEMTRIB_VICMS_DIFER_VBC_PCIS, csticms.a(), csticms.c(), csticms.b()), MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.imposto.SEQUENCE.CHOICE.SEQUENCE.ICMS.CHOICE.ICMS00.SEQUENCE.vICMS.NOME_ABA"), nItem), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.imposto.SEQUENCE.CHOICE.SEQUENCE.ICMS.CHOICE.ICMS00.SEQUENCE.vICMS.NOME_AMIGAVEL"), notaFiscalTO);
                        }
                        if (!("40".equals(cst) || "41".equals(cst) || "50".equals(cst) || "51".equals(cst) || "60".equals(cst) || "101".equals(cst) || "102".equals(cst) || "103".equals(cst) || "300".equals(cst) || "400".equals(cst) || "500".equals(cst))) {
                            if (baseCalculoICMS != null) {
                                valorTotalBCICMS += baseCalculoICMS.doubleValue();
                            }
                            if (valorICMS != null) {
                                valorTotalICMS += valorICMS.doubleValue();
                            }
                            if (baseCalculoICMSST != null) {
                                valorTotalBCICMSST += baseCalculoICMSST.doubleValue();
                            }
                            if (valorICMSST != null) {
                                valorTotalICMSST += valorICMSST.doubleValue();
                            }
                        }
                        if (emitente.getCRT() != null) {
                            if ("1".equals(emitente.getCRT().toString())) {
                                if (cst != null && Integer.parseInt(cst) <= 90) {
                                    this.a(DSENMessageConstants.INFNFE_ITEMTRIB_INFORMADO_CST_PARA_EMISSOR_SIMPLES_NACIONAL, MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.imposto.SEQUENCE.CHOICE.SEQUENCE.ICMS.CHOICE.ICMS00.SEQUENCE.CST.NOME_ABA"), nItem), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.imposto.SEQUENCE.CHOICE.SEQUENCE.ICMS.CHOICE.ICMS00.SEQUENCE.CST.NOME_AMIGAVEL"), notaFiscalTO);
                                }
                            } else if (cst != null && Integer.parseInt(cst) > 90) {
                                this.a(DSENMessageConstants.INFNFE_ITEMTRIB_INFORMADO_CSOSN_PARA_EMISSOR_NAO_SIMPLES_NACIONAL, MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.imposto.SEQUENCE.CHOICE.SEQUENCE.ICMS.CHOICE.ICMSSN101.SEQUENCE.CSOSN.NOME_ABA"), nItem), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.imposto.SEQUENCE.CHOICE.SEQUENCE.ICMS.CHOICE.ICMSSN101.SEQUENCE.CSOSN.NOME_AMIGAVEL"), notaFiscalTO);
                            }
                        }
                    }
                    if (imposto.getISSQN() != null) {
                        informadoGrupoISSQN = true;
                        if (emitente == null || StringHelper.isBlankOrNull((Object)emitente.getIM())) {
                            this.a(DSENMessageConstants.INFNFE_ITEMTRIB_ISSQN_SEM_IM, MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.imposto.SEQUENCE.CHOICE.SEQUENCE.ISSQN.NOME_ABA"), nItem), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.imposto.SEQUENCE.CHOICE.SEQUENCE.ISSQN.NOME_AMIGAVEL"), notaFiscalTO);
                        }
                        if (!StringHelper.isBlankOrNull((Object)imposto.getISSQN().getCMunFG()) && !this.b(imposto.getISSQN().getCMunFG())) {
                            String xMun = StringHelper.isBlankOrNull((Object)imposto.getISSQN().getCMunFG()) ? null : this.a(imposto.getISSQN().getCMunFG());
                            this.a(MessageFormat.format(DSENMessageConstants.INFNFE_ITEMTRIB_ISSQN_DMUN_INVALIDO, xMun), MessageFormat.format(this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.imposto.SEQUENCE.CHOICE.SEQUENCE.ISSQN.SEQUENCE.cMunFG.NOME_ABA"), nItem), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.det.SEQUENCE.imposto.SEQUENCE.CHOICE.SEQUENCE.ISSQN.SEQUENCE.cMunFG.NOME_AMIGAVEL"), notaFiscalTO);
                        }
                    }
                    if (imposto.getIPI() != null && imposto.getIPI().getIPITrib() != null && !StringHelper.isBlankOrNull((Object)imposto.getIPI().getIPITrib().getVIPI())) {
                        valorTotalIPI += new BigDecimal(imposto.getIPI().getIPITrib().getVIPI()).doubleValue();
                    }
                }
                if (produto == null) continue;
                if (!StringHelper.isBlankOrNull((Object)produto.getVProd()) && !StringHelper.isBlankOrNull((Object)produto.getIndTot()) && TNFe.InfNFe.Det.Prod.IndTot.X_1.equals((Object)produto.getIndTot())) {
                    valorTotalProduto += new BigDecimal(produto.getVProd()).doubleValue();
                }
                if (!StringHelper.isBlankOrNull((Object)produto.getVFrete())) {
                    valorTotalFrete += new BigDecimal(produto.getVFrete()).doubleValue();
                }
                if (!StringHelper.isBlankOrNull((Object)produto.getVSeg())) {
                    valorTotalSeguro += new BigDecimal(produto.getVSeg()).doubleValue();
                }
                if (!StringHelper.isBlankOrNull((Object)produto.getVDesc())) {
                    valorTotalDesconto += new BigDecimal(produto.getVDesc()).doubleValue();
                }
                if (!StringHelper.isBlankOrNull((Object)imposto.getII()) && !StringHelper.isBlankOrNull((Object)imposto.getII().getVII())) {
                    valorTotalII += new BigDecimal(imposto.getII().getVII()).doubleValue();
                }
                if (!(StringHelper.isBlankOrNull((Object)imposto.getPIS()) || StringHelper.isBlankOrNull((Object)imposto.getPIS().getPISAliq()) || StringHelper.isBlankOrNull((Object)imposto.getPIS().getPISAliq().getVPIS()))) {
                    valorTotalPIS += new BigDecimal(imposto.getPIS().getPISAliq().getVPIS()).doubleValue();
                }
                if (!(StringHelper.isBlankOrNull((Object)imposto.getCOFINS()) || StringHelper.isBlankOrNull((Object)imposto.getCOFINS().getCOFINSAliq()) || StringHelper.isBlankOrNull((Object)imposto.getCOFINS().getCOFINSAliq().getVCOFINS()))) {
                    valorTotalCOFINS += new BigDecimal(imposto.getCOFINS().getCOFINSAliq().getVCOFINS()).doubleValue();
                }
                if (!StringHelper.isBlankOrNull((Object)produto.getVOutro())) {
                    valorTotalOutro += new BigDecimal(produto.getVOutro()).doubleValue();
                }
                if (!StringHelper.isBlankOrNull((Object)imposto.getISSQN()) && !StringHelper.isBlankOrNull((Object)imposto.getISSQN().getVBC())) {
                    valorTotalBCISSQN += new BigDecimal(imposto.getISSQN().getVBC()).doubleValue();
                }
                if (StringHelper.isBlankOrNull((Object)imposto.getISSQN()) || StringHelper.isBlankOrNull((Object)imposto.getISSQN().getVISSQN())) continue;
                valorTotalISSISSQN += new BigDecimal(imposto.getISSQN().getVISSQN()).doubleValue();
            }
            if (!informadoGrupoISSQN || informadoGrupoICMS || !"DF".equals(notaFiscalTO.getEmitenteTO().getUf())) {
                // empty if block
            }
            this.a(nfeDocument, valorTotalBCICMS, valorTotalICMS, valorTotalBCICMSST, valorTotalICMSST, valorTotalProduto, valorTotalFrete, valorTotalSeguro, valorTotalDesconto, valorTotalIPI, valorTotalII, valorTotalPIS, valorTotalCOFINS, valorTotalOutro, valorTotalBCISSQN, valorTotalISSISSQN, notaFiscalTO);
            this.i(nfeDocument, notaFiscalTO);
        }
    }

    private void i(NFeDocument nfeDocument, NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        TNFe.InfNFe.Total total = nfeDocument.getNFe().getInfNFe().getTotal();
        double vProdTotal = 0.0;
        double vDescTotal = 0.0;
        double vSTTotal = 0.0;
        double vFreteTotal = 0.0;
        double vSegTotal = 0.0;
        double vOutroTotal = 0.0;
        double vIITotal = 0.0;
        double vIPITotal = 0.0;
        double vServTotal = 0.0;
        String vTotalNFe = "0";
        if (!StringHelper.isBlankOrNull((Object)total.getICMSTot()) && !StringHelper.isBlankOrNull((Object)total.getICMSTot().getVProd())) {
            vProdTotal = new BigDecimal(total.getICMSTot().getVProd()).doubleValue();
        }
        if (!StringHelper.isBlankOrNull((Object)total.getICMSTot()) && !StringHelper.isBlankOrNull((Object)total.getICMSTot().getVDesc())) {
            vDescTotal = new BigDecimal(total.getICMSTot().getVDesc()).doubleValue();
        }
        if (!StringHelper.isBlankOrNull((Object)total.getICMSTot()) && !StringHelper.isBlankOrNull((Object)total.getICMSTot().getVST())) {
            vSTTotal = new BigDecimal(total.getICMSTot().getVST()).doubleValue();
        }
        if (!StringHelper.isBlankOrNull((Object)total.getICMSTot()) && !StringHelper.isBlankOrNull((Object)total.getICMSTot().getVFrete())) {
            vFreteTotal = new BigDecimal(total.getICMSTot().getVFrete()).doubleValue();
        }
        if (!StringHelper.isBlankOrNull((Object)total.getICMSTot()) && !StringHelper.isBlankOrNull((Object)total.getICMSTot().getVSeg())) {
            vSegTotal = new BigDecimal(total.getICMSTot().getVSeg()).doubleValue();
        }
        if (!StringHelper.isBlankOrNull((Object)total.getICMSTot()) && !StringHelper.isBlankOrNull((Object)total.getICMSTot().getVOutro())) {
            vOutroTotal = new BigDecimal(total.getICMSTot().getVOutro()).doubleValue();
        }
        if (!StringHelper.isBlankOrNull((Object)total.getICMSTot()) && !StringHelper.isBlankOrNull((Object)total.getICMSTot().getVII())) {
            vIITotal = new BigDecimal(total.getICMSTot().getVII()).doubleValue();
        }
        if (!StringHelper.isBlankOrNull((Object)total.getICMSTot()) && !StringHelper.isBlankOrNull((Object)total.getICMSTot().getVIPI())) {
            vIPITotal = new BigDecimal(total.getICMSTot().getVIPI()).doubleValue();
        }
        if (!StringHelper.isBlankOrNull((Object)total.getISSQNtot()) && !StringHelper.isBlankOrNull((Object)total.getISSQNtot().getVServ())) {
            vServTotal = new BigDecimal(total.getISSQNtot().getVServ()).doubleValue();
        }
        if (!StringHelper.isBlankOrNull((Object)total.getICMSTot()) && !StringHelper.isBlankOrNull((Object)total.getICMSTot().getVNF())) {
            vTotalNFe = total.getICMSTot().getVNF();
        }
        double vTotalNFeCalculado = vProdTotal - vDescTotal + vSTTotal + vFreteTotal + vSegTotal + vOutroTotal + vIITotal + vIPITotal + vServTotal;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(NFeDocument nfeDocument, double valorBC, double valorTotalICMS, double valorTotalBCICMSST, double valorTotalICMSST, double valorTotalProduto, double valorTotalFrete, double valorTotalSeguro, double valorTotalDesconto, double valorTotalIPI, double valorTotalII, double valorTotalPIS, double valorTotalCOFINS, double valorTotalOutro, double valorTotalBCISSQN, double valorTotalISSISSQN, NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        try {
            TNFe.InfNFe.Total total = nfeDocument.getNFe().getInfNFe().getTotal();
            if (total.getICMSTot() == null) return;
            if (this.a(total.getICMSTot().getVBC(), valorBC, a)) {
                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_TOTALNFE_VALOR_BC_INCONSISTENTE, StringHelper.formataValor((String)total.getICMSTot().getVBC(), (int)2, (int)2), NumberFormatterHelper.getFormatter1302().valueToString(valorBC)), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.total.SEQUENCE.ICMSTot.SEQUENCE.vBC.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.total.SEQUENCE.ICMSTot.SEQUENCE.vBC.NOME_AMIGAVEL"), notaFiscalTO);
            }
            if (this.a(total.getICMSTot().getVICMS(), valorTotalICMS, a)) {
                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_TOTALNFE_VALOR_ICMS_INCONSISTENTE, StringHelper.formataValor((String)total.getICMSTot().getVICMS(), (int)2, (int)2), NumberFormatterHelper.getFormatter1302().valueToString(valorTotalICMS)), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.total.SEQUENCE.ICMSTot.SEQUENCE.vICMS.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.total.SEQUENCE.ICMSTot.SEQUENCE.vICMS.NOME_AMIGAVEL"), notaFiscalTO);
            }
            if (this.a(total.getICMSTot().getVBCST(), valorTotalBCICMSST, a)) {
                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_TOTALNFE_VALOR_BCST_INCONSISTENTE, StringHelper.formataValor((String)total.getICMSTot().getVBCST(), (int)2, (int)2), NumberFormatterHelper.getFormatter1302().valueToString(valorTotalBCICMSST)), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.total.SEQUENCE.ICMSTot.SEQUENCE.vBCST.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.total.SEQUENCE.ICMSTot.SEQUENCE.vBCST.NOME_AMIGAVEL"), notaFiscalTO);
            }
            if (this.a(total.getICMSTot().getVST(), valorTotalICMSST, a)) {
                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_TOTALNFE_VALOR_ICMSST_INCONSISTENTE, StringHelper.formataValor((String)total.getICMSTot().getVST(), (int)2, (int)2), NumberFormatterHelper.getFormatter1302().valueToString(valorTotalICMSST)), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.total.SEQUENCE.ICMSTot.SEQUENCE.vST.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.total.SEQUENCE.ICMSTot.SEQUENCE.vST.NOME_AMIGAVEL"), notaFiscalTO);
            }
            if (this.a(total.getICMSTot().getVProd(), valorTotalProduto, a)) {
                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_TOTALNFE_VALOR_PRODUTOS_INCONSISTENTE, StringHelper.formataValor((String)total.getICMSTot().getVProd(), (int)2, (int)2), NumberFormatterHelper.getFormatter1302().valueToString(valorTotalProduto)), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.total.SEQUENCE.ICMSTot.SEQUENCE.vProd.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.total.SEQUENCE.ICMSTot.SEQUENCE.vProd.NOME_AMIGAVEL"), notaFiscalTO);
            }
            if (this.a(total.getICMSTot().getVFrete(), valorTotalFrete, a)) {
                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_TOTALNFE_VALOR_FRETE_INCONSISTENTE, StringHelper.formataValor((String)total.getICMSTot().getVFrete(), (int)2, (int)2), NumberFormatterHelper.getFormatter1302().valueToString(valorTotalFrete)), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.total.SEQUENCE.ICMSTot.SEQUENCE.vFrete.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.total.SEQUENCE.ICMSTot.SEQUENCE.vFrete.NOME_AMIGAVEL"), notaFiscalTO);
            }
            if (this.a(total.getICMSTot().getVSeg(), valorTotalSeguro, a)) {
                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_TOTALNFE_VALOR_SEGURO_INCONSISTENTE, StringHelper.formataValor((String)total.getICMSTot().getVSeg(), (int)2, (int)2), NumberFormatterHelper.getFormatter1302().valueToString(valorTotalSeguro)), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.total.SEQUENCE.ICMSTot.SEQUENCE.vSeg.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.total.SEQUENCE.ICMSTot.SEQUENCE.vSeg.NOME_AMIGAVEL"), notaFiscalTO);
            }
            if (this.a(total.getICMSTot().getVDesc(), valorTotalDesconto, a)) {
                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_TOTALNFE_VALOR_DESCONTO_INCONSISTENTE, StringHelper.formataValor((String)total.getICMSTot().getVDesc(), (int)2, (int)2), NumberFormatterHelper.getFormatter1302().valueToString(valorTotalDesconto)), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.total.SEQUENCE.ICMSTot.SEQUENCE.vDesc.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.total.SEQUENCE.ICMSTot.SEQUENCE.vDesc.NOME_AMIGAVEL"), notaFiscalTO);
            }
            if (this.a(total.getICMSTot().getVIPI(), valorTotalIPI, a)) {
                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_TOTALNFE_VALOR_IPI_INCONSISTENTE, StringHelper.formataValor((String)total.getICMSTot().getVIPI(), (int)2, (int)2), NumberFormatterHelper.getFormatter1302().valueToString(valorTotalIPI)), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.total.SEQUENCE.ICMSTot.SEQUENCE.vIPI.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.total.SEQUENCE.ICMSTot.SEQUENCE.vIPI.NOME_AMIGAVEL"), notaFiscalTO);
            }
            if (StringHelper.isBlankOrNull((Object)total.getISSQNtot())) return;
        }
        catch (Exception e) {
            this.a.error((Object)"Erro na valida\u00e7\u00e3o do grupo de neg\u00f3cio W - Total da NF-e", (Throwable)e);
            throw new DSENBusinessException((Throwable)e, "Erro na valida\u00e7\u00e3o do grupo de neg\u00f3cio W - Total da NF-e");
        }
    }

    private void j(NFeDocument nfeDocument, NotaFiscalTO notaFiscalTO) {
        TNFe.InfNFe.Transp transporte = nfeDocument.getNFe().getInfNFe().getTransp();
        if (transporte != null) {
            if (transporte.getTransporta() != null) {
                if (!StringHelper.isBlankOrNull((Object)transporte.getTransporta().getCNPJ()) && !this.a(transporte.getTransporta().getCNPJ(), TipoDocumentoEnum.CNPJ)) {
                    this.a(MessageFormat.format(DSENMessageConstants.INFNFE_TRASNPORTE_CNPJ_INVALIDO, StringHelper.cnpjFormat((String)transporte.getTransporta().getCNPJ())), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.transp.SEQUENCE.transporta.SEQUENCE.CHOICE.CNPJ.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.transp.SEQUENCE.transporta.SEQUENCE.CHOICE.CNPJ.NOME_AMIGAVEL"), notaFiscalTO);
                }
                if (!StringHelper.isBlankOrNull((Object)transporte.getTransporta().getCPF()) && !this.a(transporte.getTransporta().getCPF(), TipoDocumentoEnum.CPF)) {
                    this.a(MessageFormat.format(DSENMessageConstants.INFNFE_TRASNPORTE_CPF_INVALIDO, StringHelper.cpfFormat((String)transporte.getTransporta().getCPF())), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.transp.SEQUENCE.transporta.SEQUENCE.CHOICE.CPF.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.transp.SEQUENCE.transporta.SEQUENCE.CHOICE.CPF.NOME_AMIGAVEL"), notaFiscalTO);
                }
                if (!StringHelper.isBlankOrNull((Object)transporte.getTransporta().getIE())) {
                    if (StringHelper.isBlankOrNull((Object)transporte.getTransporta().getUF())) {
                        this.a(DSENMessageConstants.INFNFE_TRASNPORTE_UF_NAO_INFORMADA, this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.transp.SEQUENCE.transporta.SEQUENCE.IE.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.transp.SEQUENCE.transporta.SEQUENCE.IE.NOME_AMIGAVEL"), notaFiscalTO);
                    } else if (!this.b(transporte.getTransporta().getIE(), transporte.getTransporta().getUF().toString())) {
                        this.a(MessageFormat.format(DSENMessageConstants.INFNFE_TRASNPORTE_IE_INVALIDA, transporte.getTransporta().getIE()), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.transp.SEQUENCE.transporta.SEQUENCE.IE.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.transp.SEQUENCE.transporta.SEQUENCE.IE.NOME_AMIGAVEL"), notaFiscalTO);
                    }
                }
            }
            if (transporte.getRetTransp() != null && !StringHelper.isBlankOrNull((Object)transporte.getRetTransp().getCMunFG()) && !this.b(transporte.getRetTransp().getCMunFG())) {
                this.a(DSENMessageConstants.INFNFE_TRASNPORTE_CMUNFG_INVALIDO, this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.transp.SEQUENCE.retTransp.SEQUENCE.cMunFG.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.transp.SEQUENCE.retTransp.SEQUENCE.cMunFG.NOME_AMIGAVELS"), notaFiscalTO);
            }
            if (transporte.getVeicTransp() != null) {
                if (transporte.getVeicTransp().getPlaca() == null) {
                    this.a(DSENMessageConstants.INFNFE_TRASNPORTE_CMUNFG_INVALIDO, this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.transp.SEQUENCE.CHOICE.SEQUENCE.veicTransp.SEQUENCE.placa.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.transp.SEQUENCE.CHOICE.SEQUENCE.veicTransp.SEQUENCE.placa.NOME_AMIGAVEL"), notaFiscalTO);
                }
                if (transporte.getVeicTransp().getUF() == null) {
                    this.a(DSENMessageConstants.INFNFE_TRASNPORTE_CMUNFG_INVALIDO, this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.transp.SEQUENCE.CHOICE.SEQUENCE.veicTransp.SEQUENCE.UF.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.transp.SEQUENCE.CHOICE.SEQUENCE.veicTransp.SEQUENCE.UF.NOME_AMIGAVEL"), notaFiscalTO);
                }
            }
        }
    }

    private void k(NFeDocument nfe, NotaFiscalTO notaFiscalTO) {
        if (nfe.getNFe().getInfNFe().getAutXMLArray() != null && nfe.getNFe().getInfNFe().getAutXMLArray().length != 0) {
            for (int i = 0; i < nfe.getNFe().getInfNFe().getAutXMLArray().length; ++i) {
                TNFeImpl.InfNFeImpl.AutXMLImpl aut = (TNFeImpl.InfNFeImpl.AutXMLImpl)nfe.getNFe().getInfNFe().getAutXMLArray(i);
                if (!StringHelper.isBlankOrNull((Object)aut.getCNPJ()) && !this.a(aut.getCNPJ(), TipoDocumentoEnum.CNPJ)) {
                    this.a(MessageFormat.format(DSENMessageConstants.INFNFE_AUTORIZACAO_CNPJ_INVALIDO, StringHelper.cnpjFormat((String)aut.getCNPJ())), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.autXML.CHOICE.CNPJ.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.autXML.CHOICE.CNPJ.NOME_AMIGAVEL"), notaFiscalTO);
                }
                if (StringHelper.isBlankOrNull((Object)aut.getCPF()) || this.a(aut.getCPF(), TipoDocumentoEnum.CPF)) continue;
                this.a(MessageFormat.format(DSENMessageConstants.INFNFE_AUTORIZACAO_CPF_INVALIDO, StringHelper.cpfFormat((String)aut.getCPF())), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.autXML.CHOICE.CPF.NOME_ABA"), this.a.getProperty("TNFe.SEQUENCE.infNFe.SEQUENCE.autXML.CHOICE.CPF.NOME_AMIGAVEL"), notaFiscalTO);
            }
        }
    }

    private CSTICMS a(TNFe.InfNFe.Det.Imposto.ICMS icms) {
        CSTICMS ctsIcms = new CSTICMS(this);
        if (icms.getICMS00() != null && !StringHelper.isBlankOrNull((Object)icms.getICMS00().getCST()) && TNFe.InfNFe.Det.Imposto.ICMS.ICMS00.CST.X_00.equals((Object)icms.getICMS00().getCST())) {
            return new CSTICMS(this, "00", icms.getICMS00().getVICMS(), icms.getICMS00().getPICMS(), icms.getICMS00().getVBC(), null, null, null);
        }
        if (icms.getICMS10() != null && !StringHelper.isBlankOrNull((Object)icms.getICMS10().getCST()) && TNFe.InfNFe.Det.Imposto.ICMS.ICMS10.CST.X_10.equals((Object)icms.getICMS10().getCST())) {
            return new CSTICMS(this, "10", icms.getICMS10().getVICMS(), icms.getICMS10().getPICMS(), icms.getICMS10().getVBC(), icms.getICMS10().getVBCST(), icms.getICMS10().getPICMSST(), icms.getICMS10().getVICMSST());
        }
        if (icms.getICMS20() != null && !StringHelper.isBlankOrNull((Object)icms.getICMS20().getCST()) && TNFe.InfNFe.Det.Imposto.ICMS.ICMS20.CST.X_20.equals((Object)icms.getICMS20().getCST())) {
            return new CSTICMS(this, "20", icms.getICMS20().getVICMS(), icms.getICMS20().getPICMS(), icms.getICMS20().getVBC(), null, null, null);
        }
        if (icms.getICMS30() != null && !StringHelper.isBlankOrNull((Object)icms.getICMS30().getCST()) && TNFe.InfNFe.Det.Imposto.ICMS.ICMS30.CST.X_30.equals((Object)icms.getICMS30().getCST())) {
            return new CSTICMS(this, "30", null, null, null, icms.getICMS30().getVBCST(), icms.getICMS30().getPICMSST(), icms.getICMS30().getVICMSST());
        }
        if (icms.getICMS40() != null && !StringHelper.isBlankOrNull((Object)icms.getICMS40().getCST())) {
            if (TNFe.InfNFe.Det.Imposto.ICMS.ICMS40.CST.X_40.equals((Object)icms.getICMS40().getCST())) {
                return new CSTICMS(this, "40", icms.getICMS40().getVICMSDeson(), null, null, null, null, null);
            }
            if (TNFe.InfNFe.Det.Imposto.ICMS.ICMS40.CST.X_41.equals((Object)icms.getICMS40().getCST())) {
                return new CSTICMS(this, "41", icms.getICMS40().getVICMSDeson(), null, null, null, null, null);
            }
            if (TNFe.InfNFe.Det.Imposto.ICMS.ICMS40.CST.X_50.equals((Object)icms.getICMS40().getCST())) {
                return new CSTICMS(this, "50", icms.getICMS40().getVICMSDeson(), null, null, null, null, null);
            }
        }
        if (icms.getICMS51() != null && !StringHelper.isBlankOrNull((Object)icms.getICMS51().getCST()) && TNFe.InfNFe.Det.Imposto.ICMS.ICMS51.CST.X_51.equals((Object)icms.getICMS51().getCST())) {
            return new CSTICMS(this, "51", icms.getICMS51().getVICMS(), icms.getICMS51().getPICMS(), icms.getICMS51().getVBC(), null, null, null);
        }
        if (icms.getICMS60() != null && !StringHelper.isBlankOrNull((Object)icms.getICMS60().getCST()) && TNFe.InfNFe.Det.Imposto.ICMS.ICMS60.CST.X_60.equals((Object)icms.getICMS60().getCST())) {
            return new CSTICMS(this, "60", null, null, null, null, null, null);
        }
        if (icms.getICMS70() != null && !StringHelper.isBlankOrNull((Object)icms.getICMS70().getCST()) && TNFe.InfNFe.Det.Imposto.ICMS.ICMS70.CST.X_70.equals((Object)icms.getICMS70().getCST())) {
            return new CSTICMS(this, "70", icms.getICMS70().getVICMS(), icms.getICMS70().getPICMS(), icms.getICMS70().getVBC(), icms.getICMS70().getVBCST(), icms.getICMS70().getPICMSST(), icms.getICMS70().getVICMSST());
        }
        if (icms.getICMS90() != null && !StringHelper.isBlankOrNull((Object)icms.getICMS90().getCST()) && TNFe.InfNFe.Det.Imposto.ICMS.ICMS90.CST.X_90.equals((Object)icms.getICMS90().getCST())) {
            return new CSTICMS(this, "90", icms.getICMS90().getVICMS(), icms.getICMS90().getPICMS(), icms.getICMS90().getVBC(), icms.getICMS90().getVBCST(), icms.getICMS90().getPICMSST(), icms.getICMS90().getVICMSST());
        }
        if (icms.getICMSPart() != null && !StringHelper.isBlankOrNull((Object)icms.getICMSPart().getCST())) {
            if (TNFe.InfNFe.Det.Imposto.ICMS.ICMSPart.CST.X_10.equals((Object)icms.getICMSPart().getCST())) {
                return new CSTICMS(this, "10", icms.getICMSPart().getVICMS(), icms.getICMSPart().getPICMS(), icms.getICMSPart().getVBC(), icms.getICMSPart().getVBCST(), icms.getICMSPart().getPICMSST(), icms.getICMSPart().getVICMSST());
            }
            if (TNFe.InfNFe.Det.Imposto.ICMS.ICMSPart.CST.X_90.equals((Object)icms.getICMSPart().getCST())) {
                return new CSTICMS(this, "90", icms.getICMSPart().getVICMS(), icms.getICMSPart().getPICMS(), icms.getICMSPart().getVBC(), icms.getICMSPart().getVBCST(), icms.getICMSPart().getPICMSST(), icms.getICMSPart().getVICMSST());
            }
        }
        if (icms.getICMSSN101() != null && !StringHelper.isBlankOrNull((Object)icms.getICMSSN101().getCSOSN()) && TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN101.CSOSN.X_101.equals((Object)icms.getICMSSN101().getCSOSN())) {
            return new CSTICMS(this, "101", null, null, null, null, null, null);
        }
        if (icms.getICMSSN102() != null && !StringHelper.isBlankOrNull((Object)icms.getICMSSN102().getCSOSN())) {
            if (TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN102.CSOSN.X_102.equals((Object)icms.getICMSSN102().getCSOSN())) {
                return new CSTICMS(this, "102", null, null, null, null, null, null);
            }
            if (TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN102.CSOSN.X_300.equals((Object)icms.getICMSSN102().getCSOSN())) {
                return new CSTICMS(this, "300", null, null, null, null, null, null);
            }
            if (TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN102.CSOSN.X_103.equals((Object)icms.getICMSSN102().getCSOSN())) {
                return new CSTICMS(this, "103", null, null, null, null, null, null);
            }
            if (TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN102.CSOSN.X_400.equals((Object)icms.getICMSSN102().getCSOSN())) {
                return new CSTICMS(this, "400", null, null, null, null, null, null);
            }
        }
        if (icms.getICMSSN201() != null && !StringHelper.isBlankOrNull((Object)icms.getICMSSN201().getCSOSN()) && TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN201.CSOSN.X_201.equals((Object)icms.getICMSSN201().getCSOSN())) {
            return new CSTICMS(this, "201", null, null, null, icms.getICMSSN201().getVBCST(), icms.getICMSSN201().getPICMSST(), icms.getICMSSN201().getVICMSST());
        }
        if (icms.getICMSSN202() != null && !StringHelper.isBlankOrNull((Object)icms.getICMSSN202().getCSOSN())) {
            if (TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN202.CSOSN.X_202.equals((Object)icms.getICMSSN202().getCSOSN())) {
                return new CSTICMS(this, "202", null, null, null, icms.getICMSSN202().getVBCST(), icms.getICMSSN202().getPICMSST(), icms.getICMSSN202().getVICMSST());
            }
            if (TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN202.CSOSN.X_203.equals((Object)icms.getICMSSN202().getCSOSN())) {
                return new CSTICMS(this, "203", null, null, null, icms.getICMSSN202().getVBCST(), icms.getICMSSN202().getPICMSST(), icms.getICMSSN202().getVICMSST());
            }
        }
        if (icms.getICMSSN500() != null && !StringHelper.isBlankOrNull((Object)icms.getICMSSN500().getCSOSN()) && TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN500.CSOSN.X_500.equals((Object)icms.getICMSSN500().getCSOSN())) {
            return new CSTICMS(this, "500", null, null, null, null, null, null);
        }
        if (icms.getICMSSN900() != null && !StringHelper.isBlankOrNull((Object)icms.getICMSSN900().getCSOSN()) && TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN900.CSOSN.X_900.equals((Object)icms.getICMSSN900().getCSOSN())) {
            return new CSTICMS(this, "900", icms.getICMSSN900().getVICMS(), icms.getICMSSN900().getPICMS(), icms.getICMSSN900().getVBC(), icms.getICMSSN900().getVBCST(), icms.getICMSSN900().getPICMSST(), icms.getICMSSN900().getVICMSST());
        }
        if (icms.getICMSST() != null && !StringHelper.isBlankOrNull((Object)icms.getICMSST().getCST())) {
            return new CSTICMS(this, "41", null, null, null, null, null, null);
        }
        return ctsIcms;
    }

    private boolean a(String valor1, double valor2, double tolerancia) {
        double diff;
        boolean result = true;
        result = StringHelper.isBlankOrNull((Object)valor1) && valor2 > 0.0 ? true : (StringHelper.isBlankOrNull((Object)valor1) && valor2 == 0.0 ? false : (diff = Math.abs(new BigDecimal(valor1).doubleValue() - valor2)) > tolerancia);
        return result;
    }

    private void a(String descricao, String aba, String nomeCampo, NotaFiscalTO notaFiscalTO) {
        ErroNFeTO erroNFeTO = new ErroNFeTO();
        erroNFeTO.setDescricao(descricao);
        erroNFeTO.setAba(aba);
        erroNFeTO.setNomeCampo(nomeCampo);
        erroNFeTO.setTipoOcorrencia(ErroNFeTO.OCORRENCIA_ERRO);
        notaFiscalTO.getListaErroNFe().add(erroNFeTO);
    }

    private boolean b(String cMun) {
        boolean result = false;
        if (!StringHelper.isBlankOrNull((Object)cMun)) {
            try {
                MunicipioTO municipioTO = DSENUtilHelper.getInstance().getMunicipioTO(cMun);
                if (municipioTO != null) {
                    result = true;
                }
            }
            catch (DSGEUtilException e) {
                result = false;
            }
        }
        return result;
    }

    private boolean a(String cMun, String uf) {
        boolean result;
        block3 : {
            result = false;
            try {
                EstadoTO estadoTO;
                if (StringHelper.isBlankOrNull((Object)uf) || StringHelper.isBlankOrNull((Object)cMun) || (estadoTO = DSENUtilHelper.getInstance().getEstadoTOBySigla(uf)) == null) break block3;
                List munList = DSENUtilHelper.getInstance().getMunicipioTO(estadoTO);
                for (MunicipioTO mun : munList) {
                    if (!mun.getCodigo().equals(cMun)) continue;
                    result = true;
                    break;
                }
            }
            catch (DSGEUtilException e) {
                result = false;
            }
        }
        return result;
    }

    private boolean b(String ie, String uf) {
        boolean isValido = false;
        try {
            if (!ie.equals("ISENTO")) {
                DSGEDocumentoHelper.validarIE((String)ie, (String)uf);
            }
            isValido = true;
        }
        catch (DSGEValidationException e) {
            isValido = false;
        }
        return isValido;
    }

    private boolean a(String doc, TipoDocumentoEnum tipoDocumentoEnum) {
        boolean isValido = false;
        try {
            DSGEDocumentoHelper.validarDocumento((String)doc, (TipoDocumentoEnum)tipoDocumentoEnum);
            isValido = true;
        }
        catch (DSGEValidationException e) {
            isValido = false;
        }
        return isValido;
    }

    private String a(int codigo) {
        String result = null;
        if (!StringHelper.isBlankOrNull((Object)codigo)) {
            try {
                EstadoTO estadoTO = DSENUtilHelper.getInstance().getEstadoTO(String.valueOf(codigo));
                if (estadoTO != null) {
                    result = estadoTO.getSigla();
                }
            }
            catch (DSGEUtilException e) {
                return null;
            }
        }
        return result;
    }

    private String a(String codigo) {
        String result = null;
        if (!StringHelper.isBlankOrNull((Object)codigo)) {
            try {
                MunicipioTO municipioTO = DSENUtilHelper.getInstance().getMunicipioTO(codigo);
                if (municipioTO != null) {
                    result = municipioTO.getNome();
                }
            }
            catch (DSGEUtilException e) {
                return null;
            }
        }
        return result;
    }

    private void a(NotaFiscalTO notaFiscalTO) {
        if (!this.a(notaFiscalTO.getDocXmlString())) {
            ErroNFeTO erroNFeTO = new ErroNFeTO();
            erroNFeTO.setDescricao(DSENMessageConstants.NOTA_FISCAL_MAXIMO_BYTES);
            notaFiscalTO.getListaErroNFe().add(erroNFeTO);
        }
    }
}

