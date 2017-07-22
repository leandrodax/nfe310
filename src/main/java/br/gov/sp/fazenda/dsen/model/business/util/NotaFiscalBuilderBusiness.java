/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.model.business.util.NotaFiscalBuilderBusiness
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TAmb
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TAmb$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEnderEmi
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TIpi
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TIpi$IPITrib
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TMod
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TMod$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$COFINS
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$COFINS$COFINSAliq
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$COFINS$COFINSOutr
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$COFINS$COFINSQtde
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$COFINSST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS00
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS10
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS20
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS30
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS40
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS51
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS70
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS90
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSPart
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN201
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN202
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN900
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$II
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ISSQN
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$PIS
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$PIS$PISAliq
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$PIS$PISOutr
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$PIS$PISQtde
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$PISST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$Comb
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$Comb$CIDE
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$IndTot
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$IndTot$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Emit
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Total
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Total$ICMSTot
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Total$ISSQNtot
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Transp
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Transp$RetTransp
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProcEmi
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProcEmi$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUfEmi
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUfEmi$Enum
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsge.common.util.NumberHelper
 *  br.gov.sp.fazenda.dsge.common.util.NumberHelper$PreDefinedNumberFormatEnum
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  org.apache.xmlbeans.XmlException
 */
package br.gov.sp.fazenda.dsen.model.business.util;

import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TAmb;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEnderEmi;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TIpi;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TMod;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProcEmi;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUfEmi;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsge.common.util.NumberHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import org.apache.xmlbeans.XmlException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class NotaFiscalBuilderBusiness {
    private BigDecimal a;
    private BigDecimal b;
    private BigDecimal c;
    private BigDecimal d;
    private BigDecimal e;
    private BigDecimal f;
    private BigDecimal g;
    private BigDecimal h;
    private BigDecimal i;
    private BigDecimal j;
    private BigDecimal k;
    private BigDecimal l;
    private BigDecimal m;
    private BigDecimal n;
    private BigDecimal o;
    private BigDecimal p;
    private NumberHelper a = new NumberHelper(NumberHelper.PreDefinedNumberFormatEnum.EN_US);

    public String calcularValorTotalNotaFiscal(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        this.a(notaFiscalTO);
        BigDecimal totalNotaFiscal = this.a(notaFiscalTO);
        return this.a.toString((Number)totalNotaFiscal, -1, -1, 2, 2, RoundingMode.HALF_UP);
    }

    public void calcularNotaFiscalTotais(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        this.a(notaFiscalTO);
        BigDecimal totalNotaFiscal = this.a(notaFiscalTO);
        NFeDocument nfeDocument = this.a(notaFiscalTO);
        TNFe.InfNFe.Total total = nfeDocument.getNFe().getInfNFe().getTotal();
        if (total == null) {
            total = nfeDocument.getNFe().getInfNFe().addNewTotal();
        }
        TNFe.InfNFe.Total.ICMSTot icmsTotal = total.getICMSTot();
        if (total.getICMSTot() == null) {
            icmsTotal = total.addNewICMSTot();
        }
        DecimalFormat totalFormat = new DecimalFormat("###.##");
        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();
        symbols.setDecimalSeparator('.');
        totalFormat.setDecimalFormatSymbols(symbols);
        totalFormat.setMinimumFractionDigits(2);
        totalFormat.setMaximumIntegerDigits(13);
        totalFormat.setParseBigDecimal(true);
        icmsTotal.setVBC(totalFormat.format(this.a.doubleValue()));
        icmsTotal.setVICMS(totalFormat.format(this.b.doubleValue()));
        icmsTotal.setVBCST(totalFormat.format(this.c.doubleValue()));
        icmsTotal.setVST(totalFormat.format(this.d.doubleValue()));
        icmsTotal.setVProd(totalFormat.format(this.e.doubleValue()));
        icmsTotal.setVFrete(totalFormat.format(this.f.doubleValue()));
        icmsTotal.setVSeg(totalFormat.format(this.g.doubleValue()));
        icmsTotal.setVDesc(totalFormat.format(this.h.doubleValue()));
        icmsTotal.setVII(totalFormat.format(this.i.doubleValue()));
        icmsTotal.setVIPI(totalFormat.format(this.j.doubleValue()));
        icmsTotal.setVPIS(totalFormat.format(this.k.doubleValue()));
        icmsTotal.setVCOFINS(totalFormat.format(this.l.doubleValue()));
        icmsTotal.setVOutro(totalFormat.format(this.m.doubleValue()));
        icmsTotal.setVICMSDeson(totalFormat.format(this.p.doubleValue()));
        TNFe.InfNFe.Total.ISSQNtot issqnTotal = total.getISSQNtot();
        if (this.n.doubleValue() != 0.0) {
            if (issqnTotal == null) {
                issqnTotal = total.addNewISSQNtot();
            }
            issqnTotal.setVBC(totalFormat.format(this.n.doubleValue()));
        } else if (issqnTotal != null) {
            issqnTotal.setVBC("");
            issqnTotal.unsetVBC();
        }
        if (this.o.doubleValue() != 0.0) {
            if (issqnTotal == null) {
                issqnTotal = total.addNewISSQNtot();
            }
            issqnTotal.setVISS(totalFormat.format(this.o.doubleValue()));
        } else if (issqnTotal != null) {
            issqnTotal.setVISS("");
            issqnTotal.unsetVISS();
        }
        if (issqnTotal != null && issqnTotal.getVServ() != null) {
            totalNotaFiscal = this.a.somar(totalNotaFiscal, new String[]{issqnTotal.getVServ()});
        }
        if (this.p != null) {
            totalNotaFiscal = this.a.subtrair(totalNotaFiscal, new String[]{icmsTotal.getVICMSDeson()});
        }
        icmsTotal.setVNF(totalFormat.format(totalNotaFiscal.doubleValue()));
        this.a(nfeDocument, notaFiscalTO);
    }

    public void calcularValorICMS(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        NFeDocument nfeDocument = this.a(notaFiscalTO);
        TNFe.InfNFe.Det[] detalhes = nfeDocument.getNFe().getInfNFe().getDetArray();
        for (int i = 0; i < detalhes.length; ++i) {
            TNFe.InfNFe.Det.Imposto.ICMS icms = detalhes[i].getImposto().getICMS();
            if (icms.getICMS00() != null) {
                this.a(icms);
                continue;
            }
            if (icms.getICMS10() != null) {
                this.b(icms);
                continue;
            }
            if (icms.getICMS20() != null) {
                this.d(icms);
                continue;
            }
            if (icms.getICMS51() != null) {
                this.f(icms);
                continue;
            }
            if (icms.getICMS70() != null) {
                this.g(icms);
                continue;
            }
            if (icms.getICMS90() != null) {
                this.i(icms);
                continue;
            }
            if (icms.getICMSPart() != null) {
                this.j(icms);
                continue;
            }
            if (icms.getICMSSN900() == null) continue;
            this.k(icms);
        }
        this.a(nfeDocument, notaFiscalTO);
    }

    public void calcularValorICMSST(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        NFeDocument nfeDocument = this.a(notaFiscalTO);
        TNFe.InfNFe.Det[] detalhes = nfeDocument.getNFe().getInfNFe().getDetArray();
        for (int i = 0; i < detalhes.length; ++i) {
            TNFe.InfNFe.Det.Imposto.ICMS icms = detalhes[i].getImposto().getICMS();
            if (icms.getICMS10() != null) {
                this.c(icms);
                continue;
            }
            if (icms.getICMS30() != null) {
                this.e(icms);
                continue;
            }
            if (icms.getICMS70() != null) {
                this.h(icms);
                continue;
            }
            if (icms.getICMS90() != null) {
                this.l(icms);
                continue;
            }
            if (icms.getICMSPart() != null) {
                this.m(icms);
                continue;
            }
            if (icms.getICMSSN201() != null) continue;
            if (icms.getICMSSN202() != null) {
                this.p(icms);
                continue;
            }
            if (icms.getICMSSN900() == null) continue;
            this.n(icms);
        }
        this.a(nfeDocument, notaFiscalTO);
    }

    public void calcularValorIPI(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        NFeDocument nfeDocument = this.a(notaFiscalTO);
        TNFe.InfNFe.Det[] detalhes = nfeDocument.getNFe().getInfNFe().getDetArray();
        for (int i = 0; i < detalhes.length; ++i) {
            String valorIPI;
            TIpi ipi = detalhes[i].getImposto().getIPI();
            if (ipi == null || ipi.getIPITrib() == null) continue;
            TIpi.IPITrib ipiTrib = ipi.getIPITrib();
            if (ipiTrib.getVBC() != null && ipiTrib.getPIPI() != null) {
                valorIPI = this.a.multiplicar(ipiTrib.getVBC(), this.a.getPercentual(ipiTrib.getPIPI()), RoundingMode.HALF_UP);
                ipiTrib.setVIPI(valorIPI);
                continue;
            }
            valorIPI = this.a.multiplicar(ipiTrib.getQUnid(), ipiTrib.getVUnid(), RoundingMode.HALF_UP);
            ipiTrib.setVIPI(valorIPI);
        }
        this.a(nfeDocument, notaFiscalTO);
    }

    public void calcularValorPIS(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        NFeDocument nfeDocument = this.a(notaFiscalTO);
        TNFe.InfNFe.Det[] detalhes = nfeDocument.getNFe().getInfNFe().getDetArray();
        for (int i = 0; i < detalhes.length; ++i) {
            TNFe.InfNFe.Det.Imposto.PIS pis = detalhes[i].getImposto().getPIS();
            if (pis.getPISAliq() != null) {
                this.a(pis);
                continue;
            }
            if (pis.getPISQtde() != null) {
                this.b(pis);
                continue;
            }
            if (pis.getPISOutr() == null) continue;
            this.c(pis);
        }
        this.a(nfeDocument, notaFiscalTO);
    }

    public void calcularValorPISST(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        NFeDocument nfeDocument = this.a(notaFiscalTO);
        TNFe.InfNFe.Det[] detalhes = nfeDocument.getNFe().getInfNFe().getDetArray();
        for (int i = 0; i < detalhes.length; ++i) {
            TNFe.InfNFe.Det.Imposto.PISST pisST = detalhes[i].getImposto().getPISST();
            if (pisST == null) continue;
            if (pisST.getVBC() != null && pisST.getPPIS() != null) {
                pisST.setVPIS(this.a.multiplicar(pisST.getVBC(), this.a.getPercentual(pisST.getPPIS()), RoundingMode.HALF_UP));
                continue;
            }
            pisST.setVPIS(this.a.multiplicar(pisST.getQBCProd(), pisST.getVAliqProd(), RoundingMode.HALF_UP));
        }
        this.a(nfeDocument, notaFiscalTO);
    }

    public void calcularValorCOFINS(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        NFeDocument nfeDocument = this.a(notaFiscalTO);
        TNFe.InfNFe.Det[] detalhes = nfeDocument.getNFe().getInfNFe().getDetArray();
        for (int i = 0; i < detalhes.length; ++i) {
            TNFe.InfNFe.Det.Imposto.COFINS cofins = detalhes[i].getImposto().getCOFINS();
            if (cofins.getCOFINSAliq() != null) {
                this.a(cofins);
                continue;
            }
            if (cofins.getCOFINSQtde() != null) {
                this.b(cofins);
                continue;
            }
            if (cofins.getCOFINSOutr() == null) continue;
            this.c(cofins);
        }
        this.a(nfeDocument, notaFiscalTO);
    }

    public void calcularValorCOFINSST(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        NFeDocument nfeDocument = this.a(notaFiscalTO);
        TNFe.InfNFe.Det[] detalhes = nfeDocument.getNFe().getInfNFe().getDetArray();
        for (int i = 0; i < detalhes.length; ++i) {
            TNFe.InfNFe.Det.Imposto.COFINSST cofinsST = detalhes[i].getImposto().getCOFINSST();
            if (cofinsST == null) continue;
            if (cofinsST.getVBC() != null && cofinsST.getPCOFINS() != null) {
                cofinsST.setVCOFINS(this.a.multiplicar(cofinsST.getVBC(), this.a.getPercentual(cofinsST.getPCOFINS()), RoundingMode.HALF_UP));
                continue;
            }
            cofinsST.setVCOFINS(this.a.multiplicar(cofinsST.getQBCProd(), cofinsST.getVAliqProd(), RoundingMode.HALF_UP));
        }
        this.a(nfeDocument, notaFiscalTO);
    }

    public void calcularValorISSQN(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        NFeDocument nfeDocument = this.a(notaFiscalTO);
        TNFe.InfNFe.Det[] detalhes = nfeDocument.getNFe().getInfNFe().getDetArray();
        for (int i = 0; i < detalhes.length; ++i) {
            TNFe.InfNFe.Det.Imposto.ISSQN issQN = detalhes[i].getImposto().getISSQN();
            if (issQN == null) continue;
            String valorISS = this.a.multiplicar(issQN.getVBC(), this.a.getPercentual(issQN.getVAliq()), RoundingMode.HALF_UP);
            issQN.setVISSQN(valorISS);
        }
        this.a(nfeDocument, notaFiscalTO);
    }

    public void calcularValorICMSTransporte(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        NFeDocument nfeDocument = this.a(notaFiscalTO);
        TNFe.InfNFe.Transp.RetTransp retTransp = nfeDocument.getNFe().getInfNFe().getTransp().getRetTransp();
        if (retTransp != null) {
            retTransp.setVICMSRet(this.a.multiplicar(retTransp.getVBCRet(), this.a.getPercentual(retTransp.getPICMSRet()), RoundingMode.HALF_UP));
        }
        this.a(nfeDocument, notaFiscalTO);
    }

    public void calcularValorCIDE(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        NFeDocument nfeDocument = this.a(notaFiscalTO);
        TNFe.InfNFe.Det[] detalhes = nfeDocument.getNFe().getInfNFe().getDetArray();
        for (int i = 0; i < detalhes.length; ++i) {
            TNFe.InfNFe.Det.Prod.Comb combustivel = detalhes[i].getProd().getComb();
            if (combustivel == null || combustivel.getCIDE() == null) continue;
            TNFe.InfNFe.Det.Prod.Comb.CIDE cide = combustivel.getCIDE();
            cide.setVCIDE(this.a.multiplicar(cide.getQBCProd(), this.a.getPercentual(cide.getVAliqProd()), RoundingMode.HALF_UP));
        }
        this.a(nfeDocument, notaFiscalTO);
    }

    public void setDadosNotaFiscal(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        try {
            NFeDocument nfeDocument = this.a(notaFiscalTO);
            this.b(nfeDocument, notaFiscalTO);
            this.c(nfeDocument, notaFiscalTO);
            this.d(nfeDocument, notaFiscalTO);
            this.c(nfeDocument);
            this.b(notaFiscalTO);
            this.a(nfeDocument);
            this.b(nfeDocument);
            this.e(nfeDocument, notaFiscalTO);
            this.a(nfeDocument, notaFiscalTO);
        }
        catch (Exception e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    public void gerarIdNotaFiscal(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        try {
            NFeDocument nfeDocument = this.a(notaFiscalTO);
            this.f(nfeDocument, notaFiscalTO);
            this.a(nfeDocument, notaFiscalTO);
        }
        catch (Exception e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    private NFeDocument a(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        try {
            return DocumentoUtil.getNFeDocument((String)notaFiscalTO.getDocXmlString());
        }
        catch (XmlException e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    private void a(NFeDocument nfeDocument, NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        try {
            notaFiscalTO.setDocXmlString(DocumentoUtil.getDocumentString((Object)nfeDocument, (boolean)true));
        }
        catch (UnsupportedEncodingException e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    private void a(TNFe.InfNFe.Det.Imposto.ICMS icms) throws DSENBusinessException {
        String valorICMS = this.a.multiplicar(icms.getICMS00().getVBC(), this.a.getPercentual(icms.getICMS00().getPICMS()), RoundingMode.HALF_UP);
        icms.getICMS00().setVICMS(valorICMS);
    }

    private void b(TNFe.InfNFe.Det.Imposto.ICMS icms) throws DSENBusinessException {
        String valorICMS = this.a.multiplicar(icms.getICMS10().getVBC(), this.a.getPercentual(icms.getICMS10().getPICMS()), RoundingMode.HALF_UP);
        icms.getICMS10().setVICMS(valorICMS);
    }

    private void c(TNFe.InfNFe.Det.Imposto.ICMS icms) throws DSENBusinessException {
        String valorICMS = icms.getICMS10().getVICMS();
        String valorICMSST = this.a(icms.getICMS10().getVBCST(), icms.getICMS10().getPICMSST(), valorICMS);
        icms.getICMS10().setVICMSST(valorICMSST);
    }

    private void d(TNFe.InfNFe.Det.Imposto.ICMS icms) throws DSENBusinessException {
        String valorICMS = this.a.multiplicar(icms.getICMS20().getVBC(), this.a.getPercentual(icms.getICMS20().getPICMS()), RoundingMode.HALF_UP);
        icms.getICMS20().setVICMS(valorICMS);
    }

    private void e(TNFe.InfNFe.Det.Imposto.ICMS icms) throws DSENBusinessException {
        String valorICMSST = this.a(icms.getICMS30().getVBCST(), icms.getICMS30().getPICMSST(), null);
        icms.getICMS30().setVICMSST(valorICMSST);
    }

    private void f(TNFe.InfNFe.Det.Imposto.ICMS icms) throws DSENBusinessException {
        String valorICMS = this.a.multiplicar(icms.getICMS51().getVBC(), this.a.getPercentual(icms.getICMS51().getPICMS()), RoundingMode.HALF_UP);
        icms.getICMS51().setVICMSOp(valorICMS);
    }

    private void g(TNFe.InfNFe.Det.Imposto.ICMS icms) throws DSENBusinessException {
        String valorICMS = this.a.multiplicar(icms.getICMS70().getVBC(), this.a.getPercentual(icms.getICMS70().getPICMS()), RoundingMode.HALF_UP);
        icms.getICMS70().setVICMS(valorICMS);
    }

    private void h(TNFe.InfNFe.Det.Imposto.ICMS icms) throws DSENBusinessException {
        String valorICMS = icms.getICMS70().getVICMS();
        String valorICMSST = this.a(icms.getICMS70().getVBCST(), icms.getICMS70().getPICMSST(), valorICMS);
        icms.getICMS70().setVICMSST(valorICMSST);
    }

    private void i(TNFe.InfNFe.Det.Imposto.ICMS icms) throws DSENBusinessException {
        if (icms.getICMS90().getVBC() != null) {
            String valorICMS = this.a.multiplicar(icms.getICMS90().getVBC(), this.a.getPercentual(icms.getICMS90().getPICMS()), RoundingMode.HALF_UP);
            icms.getICMS90().setVICMS(valorICMS);
        }
    }

    private void j(TNFe.InfNFe.Det.Imposto.ICMS icms) throws DSENBusinessException {
        if (icms.getICMSPart().getVBC() != null) {
            String valorICMS = this.a.multiplicar(icms.getICMSPart().getVBC(), this.a.getPercentual(icms.getICMSPart().getPICMS()), RoundingMode.HALF_UP);
            icms.getICMSPart().setVICMS(valorICMS);
        }
    }

    private void k(TNFe.InfNFe.Det.Imposto.ICMS icms) throws DSENBusinessException {
        if (icms.getICMSSN900().getVBC() != null) {
            String valorICMS = this.a.multiplicar(icms.getICMSSN900().getVBC(), this.a.getPercentual(icms.getICMSSN900().getPICMS()), RoundingMode.HALF_UP);
            icms.getICMSSN900().setVICMS(valorICMS);
        }
    }

    private void l(TNFe.InfNFe.Det.Imposto.ICMS icms) throws DSENBusinessException {
        if (icms.getICMS90().getVBCST() != null) {
            String valorICMS = icms.getICMS90().getVICMS();
            String valorICMSST = this.a(icms.getICMS90().getVBCST(), icms.getICMS90().getPICMSST(), valorICMS);
            icms.getICMS90().setVICMSST(valorICMSST);
        }
    }

    private void m(TNFe.InfNFe.Det.Imposto.ICMS icms) throws DSENBusinessException {
        if (icms.getICMSPart().getVBCST() != null) {
            String valorICMS = icms.getICMSPart().getVICMS();
            String valorICMSST = this.a(icms.getICMSPart().getVBCST(), icms.getICMSPart().getPICMSST(), valorICMS);
            icms.getICMSPart().setVICMSST(valorICMSST);
        }
    }

    private void n(TNFe.InfNFe.Det.Imposto.ICMS icms) throws DSENBusinessException {
        if (icms.getICMSSN900().getVBCST() != null) {
            String valorICMS = icms.getICMSSN900().getVICMS();
            String valorICMSST = this.a(icms.getICMSSN900().getVBCST(), icms.getICMSSN900().getPICMSST(), valorICMS);
            icms.getICMSSN900().setVICMSST(valorICMSST);
        }
    }

    private void o(TNFe.InfNFe.Det.Imposto.ICMS icms) throws DSENBusinessException {
        String valorICMSST = this.a(icms.getICMSSN201().getVBCST(), icms.getICMSSN201().getPICMSST(), null);
        icms.getICMSSN201().setVICMSST(valorICMSST);
    }

    private void p(TNFe.InfNFe.Det.Imposto.ICMS icms) throws DSENBusinessException {
        String valorICMSST = this.a(icms.getICMSSN202().getVBCST(), icms.getICMSSN202().getPICMSST(), null);
        icms.getICMSSN202().setVICMSST(valorICMSST);
    }

    private String a(String vBCST, String pICMSST, String vICMS) {
        String vICMSSTMinuendo = this.a.multiplicar(vBCST, this.a.getPercentual(pICMSST), RoundingMode.HALF_UP);
        if (StringHelper.isBlankOrNull((Object)vICMS) || StringHelper.isBlankOrNull((Object)vICMSSTMinuendo)) {
            return vICMSSTMinuendo;
        }
        BigDecimal vICMSST = this.a.subtrair(this.a.getBigDecimal(vICMSSTMinuendo), new String[]{vICMS});
        if (vICMSST.doubleValue() < 0.0) {
            vICMSST = BigDecimal.ZERO;
        }
        return this.a.toString((Number)vICMSST, -1, -1, 2, 2, RoundingMode.HALF_UP);
    }

    private void a(TNFe.InfNFe.Det.Imposto.PIS pis) throws DSENBusinessException {
        String valorPIS = this.a.multiplicar(pis.getPISAliq().getVBC(), this.a.getPercentual(pis.getPISAliq().getPPIS()), RoundingMode.HALF_UP);
        pis.getPISAliq().setVPIS(valorPIS);
    }

    private void b(TNFe.InfNFe.Det.Imposto.PIS pis) throws DSENBusinessException {
        String valorPIS = this.a.multiplicar(pis.getPISQtde().getQBCProd(), pis.getPISQtde().getVAliqProd(), RoundingMode.HALF_UP);
        pis.getPISQtde().setVPIS(valorPIS);
    }

    private void c(TNFe.InfNFe.Det.Imposto.PIS pis) throws DSENBusinessException {
        String valorPIS = null;
        if (pis.getPISOutr().getVBC() != null && pis.getPISOutr().getPPIS() != null) {
            valorPIS = this.a.multiplicar(pis.getPISOutr().getVBC(), this.a.getPercentual(pis.getPISOutr().getPPIS()), RoundingMode.HALF_UP);
            pis.getPISOutr().setVPIS(valorPIS);
        } else {
            valorPIS = this.a.multiplicar(pis.getPISOutr().getQBCProd(), pis.getPISOutr().getVAliqProd(), RoundingMode.HALF_UP);
            pis.getPISOutr().setVPIS(valorPIS);
        }
    }

    private void a(TNFe.InfNFe.Det.Imposto.COFINS cofins) throws DSENBusinessException {
        String valorCOFINS = this.a.multiplicar(cofins.getCOFINSAliq().getVBC(), this.a.getPercentual(cofins.getCOFINSAliq().getPCOFINS()), RoundingMode.HALF_UP);
        cofins.getCOFINSAliq().setVCOFINS(valorCOFINS);
    }

    private void b(TNFe.InfNFe.Det.Imposto.COFINS cofins) throws DSENBusinessException {
        String valorCOFINS = this.a.multiplicar(cofins.getCOFINSQtde().getQBCProd(), cofins.getCOFINSQtde().getVAliqProd(), RoundingMode.HALF_UP);
        cofins.getCOFINSQtde().setVCOFINS(valorCOFINS);
    }

    private void c(TNFe.InfNFe.Det.Imposto.COFINS cofins) throws DSENBusinessException {
        String valorCOFINS = null;
        if (cofins.getCOFINSOutr().getVBC() != null && cofins.getCOFINSOutr().getPCOFINS() != null) {
            valorCOFINS = this.a.multiplicar(cofins.getCOFINSOutr().getVBC(), this.a.getPercentual(cofins.getCOFINSOutr().getPCOFINS()), RoundingMode.HALF_UP);
            cofins.getCOFINSOutr().setVCOFINS(valorCOFINS);
        } else {
            valorCOFINS = this.a.multiplicar(cofins.getCOFINSOutr().getQBCProd(), cofins.getCOFINSOutr().getVAliqProd(), RoundingMode.HALF_UP);
            cofins.getCOFINSOutr().setVCOFINS(valorCOFINS);
        }
    }

    private void a(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        this.a();
        NFeDocument nfeDocument = this.a(notaFiscalTO);
        TNFe.InfNFe.Det[] detalhes = nfeDocument.getNFe().getInfNFe().getDetArray();
        for (int i = 0; i < detalhes.length; ++i) {
            TNFe.InfNFe.Det.Imposto imposto = detalhes[i].getImposto();
            TNFe.InfNFe.Det.Prod produto = detalhes[i].getProd();
            this.a(imposto);
            if (imposto.getISSQN() == null) {
                this.e(imposto);
                this.c(imposto);
            }
            this.b(imposto);
            this.d(imposto);
            this.f(imposto);
            this.b(produto);
            this.a(produto);
        }
    }

    private BigDecimal a(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        BigDecimal totalBigDecimal = this.e.add(this.d).add(this.f).add(this.g).add(this.j).add(this.i).add(this.m).subtract(this.h);
        return totalBigDecimal;
    }

    private void a(TNFe.InfNFe.Det.Imposto imposto) throws DSENBusinessException {
        TNFe.InfNFe.Det.Imposto.ICMS icms = imposto.getICMS();
        if (icms == null) {
            return;
        }
        if (icms.getICMS00() != null) {
            this.a = this.a.somar(this.a, new String[]{icms.getICMS00().getVBC()});
            this.b = this.a.somar(this.b, new String[]{icms.getICMS00().getVICMS()});
        } else if (icms.getICMS10() != null) {
            this.a = this.a.somar(this.a, new String[]{icms.getICMS10().getVBC()});
            this.b = this.a.somar(this.b, new String[]{icms.getICMS10().getVICMS()});
            this.c = this.a.somar(this.c, new String[]{icms.getICMS10().getVBCST()});
            this.d = this.a.somar(this.d, new String[]{icms.getICMS10().getVICMSST()});
        } else if (icms.getICMS20() != null) {
            this.a = this.a.somar(this.a, new String[]{icms.getICMS20().getVBC()});
            this.b = this.a.somar(this.b, new String[]{icms.getICMS20().getVICMS()});
            if (icms.getICMS20().getVICMSDeson() != null) {
                this.p = this.a.somar(this.p, new String[]{icms.getICMS20().getVICMSDeson()});
            }
        } else if (icms.getICMS30() != null) {
            this.c = this.a.somar(this.c, new String[]{icms.getICMS30().getVBCST()});
            this.d = this.a.somar(this.d, new String[]{icms.getICMS30().getVICMSST()});
            if (icms.getICMS30().getVICMSDeson() != null) {
                this.p = this.a.somar(this.p, new String[]{icms.getICMS30().getVICMSDeson()});
            }
        } else if (icms.getICMS70() != null) {
            this.a = this.a.somar(this.a, new String[]{icms.getICMS70().getVBC()});
            this.b = this.a.somar(this.b, new String[]{icms.getICMS70().getVICMS()});
            this.c = this.a.somar(this.c, new String[]{icms.getICMS70().getVBCST()});
            this.d = this.a.somar(this.d, new String[]{icms.getICMS70().getVICMSST()});
            if (icms.getICMS70().getVICMSDeson() != null) {
                this.p = this.a.somar(this.p, new String[]{icms.getICMS70().getVICMSDeson()});
            }
        } else if (icms.getICMS90() != null) {
            if (icms.getICMS90().getVBC() != null) {
                this.a = this.a.somar(this.a, new String[]{icms.getICMS90().getVBC()});
                this.b = this.a.somar(this.b, new String[]{icms.getICMS90().getVICMS()});
            }
            if (icms.getICMS90().getVBCST() != null) {
                this.c = this.a.somar(this.c, new String[]{icms.getICMS90().getVBCST()});
                this.d = this.a.somar(this.d, new String[]{icms.getICMS90().getVICMSST()});
            }
            if (icms.getICMS90().getVICMSDeson() != null) {
                this.p = this.a.somar(this.p, new String[]{icms.getICMS90().getVICMSDeson()});
            }
        } else if (icms.getICMSSN201() != null) {
            this.c = this.a.somar(this.c, new String[]{icms.getICMSSN201().getVBCST()});
            this.d = this.a.somar(this.d, new String[]{icms.getICMSSN201().getVICMSST()});
        } else if (icms.getICMSSN202() != null) {
            this.c = this.a.somar(this.c, new String[]{icms.getICMSSN202().getVBCST()});
            this.d = this.a.somar(this.d, new String[]{icms.getICMSSN202().getVICMSST()});
        } else if (icms.getICMSSN900() != null) {
            if (icms.getICMSSN900().getVBC() != null) {
                this.a = this.a.somar(this.a, new String[]{icms.getICMSSN900().getVBC()});
                this.b = this.a.somar(this.b, new String[]{icms.getICMSSN900().getVICMS()});
            }
            if (icms.getICMSSN900().getVBCST() != null) {
                this.c = this.a.somar(this.c, new String[]{icms.getICMSSN900().getVBCST()});
                this.d = this.a.somar(this.d, new String[]{icms.getICMSSN900().getVICMSST()});
            }
        } else if (icms.getICMSPart() != null) {
            if (icms.getICMSPart().getVBC() != null) {
                this.a = this.a.somar(this.a, new String[]{icms.getICMSPart().getVBC()});
                this.b = this.a.somar(this.b, new String[]{icms.getICMSPart().getVICMS()});
            }
            if (icms.getICMSPart().getVBCST() != null) {
                this.c = this.a.somar(this.c, new String[]{icms.getICMSPart().getVBCST()});
                this.d = this.a.somar(this.d, new String[]{icms.getICMSPart().getVICMSST()});
            }
        } else if (icms.getICMS40() != null && icms.getICMS40().getVICMSDeson() != null) {
            this.p = this.a.somar(this.p, new String[]{icms.getICMS40().getVICMSDeson()});
        }
    }

    private void b(TNFe.InfNFe.Det.Imposto imposto) throws DSENBusinessException {
        if (imposto.getIPI() != null && imposto.getIPI().getIPITrib() != null) {
            TIpi.IPITrib ipi = imposto.getIPI().getIPITrib();
            this.j = this.a.somar(this.j, new String[]{ipi.getVIPI()});
        }
    }

    private void c(TNFe.InfNFe.Det.Imposto imposto) throws DSENBusinessException {
        TNFe.InfNFe.Det.Imposto.PIS pis = imposto.getPIS();
        if (pis != null) {
            if (pis.getPISAliq() != null) {
                this.k = this.a.somar(this.k, new String[]{pis.getPISAliq().getVPIS()});
            } else if (pis.getPISQtde() != null) {
                this.k = this.a.somar(this.k, new String[]{pis.getPISQtde().getVPIS()});
            } else if (pis.getPISOutr() != null) {
                this.k = this.a.somar(this.k, new String[]{pis.getPISOutr().getVPIS()});
            }
        }
    }

    private void d(TNFe.InfNFe.Det.Imposto imposto) throws DSENBusinessException {
        TNFe.InfNFe.Det.Imposto.II ii = imposto.getII();
        if (ii != null) {
            this.i = this.a.somar(this.i, new String[]{ii.getVII()});
        }
    }

    private void e(TNFe.InfNFe.Det.Imposto imposto) throws DSENBusinessException {
        TNFe.InfNFe.Det.Imposto.COFINS cofins = imposto.getCOFINS();
        if (cofins != null) {
            if (cofins.getCOFINSAliq() != null) {
                this.l = this.a.somar(this.l, new String[]{cofins.getCOFINSAliq().getVCOFINS()});
            } else if (cofins.getCOFINSQtde() != null) {
                this.l = this.a.somar(this.l, new String[]{cofins.getCOFINSQtde().getVCOFINS()});
            } else if (cofins.getCOFINSOutr() != null) {
                this.l = this.a.somar(this.l, new String[]{cofins.getCOFINSOutr().getVCOFINS()});
            }
        }
    }

    private void f(TNFe.InfNFe.Det.Imposto imposto) throws DSENBusinessException {
        TNFe.InfNFe.Det.Imposto.ISSQN issqn = imposto.getISSQN();
        if (issqn != null) {
            this.n = this.a.somar(this.n, new String[]{issqn.getVBC()});
            this.o = this.a.somar(this.o, new String[]{issqn.getVISSQN()});
        }
    }

    private void a(TNFe.InfNFe.Det.Prod produto) throws DSENBusinessException {
        this.m = this.a.somar(this.m, new String[]{produto.getVOutro()});
    }

    private void b(TNFe.InfNFe.Det.Prod produto) throws DSENBusinessException {
        if (TNFe.InfNFe.Det.Prod.IndTot.X_1.equals((Object)produto.getIndTot())) {
            this.e = this.a.somar(this.e, new String[]{produto.getVProd()});
        }
        if (produto.getVFrete() != null) {
            this.f = this.a.somar(this.f, new String[]{produto.getVFrete()});
        }
        if (produto.getVSeg() != null) {
            this.g = this.a.somar(this.g, new String[]{produto.getVSeg()});
        }
        if (produto.getVDesc() != null) {
            this.h = this.a.somar(this.h, new String[]{produto.getVDesc()});
        }
    }

    private void b(NFeDocument nfeDocument, NotaFiscalTO notaFiscalTO) {
        nfeDocument.getNFe().getInfNFe().getIde().setSerie(String.valueOf(Integer.parseInt(notaFiscalTO.getSerie())));
    }

    private void c(NFeDocument nfeDocument, NotaFiscalTO notaFiscalTO) {
        nfeDocument.getNFe().getInfNFe().getIde().setNNF(String.valueOf(Integer.parseInt(notaFiscalTO.getNumero())));
    }

    private void d(NFeDocument nfeDocument, NotaFiscalTO notaFiscalTO) throws DSGEUtilException {
        TUfEmi.Enum ufEnum = nfeDocument.getNFe().getInfNFe().getEmit().getEnderEmit().getUF();
        if (ufEnum == null) {
            notaFiscalTO.setCodigoUfEmitente("");
        } else {
            String codigoUf = DSENUtilHelper.getInstance().getEstadoTOBySigla(ufEnum.toString()).getCodigo();
            notaFiscalTO.setCodigoUfEmitente(codigoUf);
        }
    }

    private void b(NotaFiscalTO notaFiscalTO) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(notaFiscalTO.getDataEmissao());
        notaFiscalTO.setAno(ChaveAcessoUtil.DATA_MODELO_FORMAT.format(calendar.get(1) % 100));
        notaFiscalTO.setMes(ChaveAcessoUtil.DATA_MODELO_FORMAT.format(calendar.get(2) + 1));
    }

    private void a(NFeDocument nfeDocument) {
        nfeDocument.getNFe().getInfNFe().getIde().setTpAmb(TAmb.Enum.forString((String)DSENProperties.getInstance().getAplicativoTipoAmbiente()));
    }

    private void b(NFeDocument nfeDocument) {
        nfeDocument.getNFe().getInfNFe().getIde().setProcEmi(TProcEmi.X_3);
    }

    private void c(NFeDocument nfeDocument) {
        nfeDocument.getNFe().getInfNFe().getIde().setVerProc(DSENProperties.getInstance().getAplicativoVersao());
    }

    private void e(NFeDocument nfeDocument, NotaFiscalTO notaFiscalTO) {
        nfeDocument.getNFe().getInfNFe().getIde().setMod(TMod.Enum.forString((String)DSENConstants.MODELO_NFE));
        notaFiscalTO.setModelo(DSENConstants.MODELO_NFE);
    }

    private void f(NFeDocument nfeDocument, NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        nfeDocument.getNFe().getInfNFe().setId("NFe" + ChaveAcessoUtil.gerarChaveAcesso((NotaFiscalTO)notaFiscalTO));
    }

    private void a() {
        this.a = BigDecimal.ZERO;
        this.b = BigDecimal.ZERO;
        this.c = BigDecimal.ZERO;
        this.d = BigDecimal.ZERO;
        this.e = BigDecimal.ZERO;
        this.f = BigDecimal.ZERO;
        this.g = BigDecimal.ZERO;
        this.h = BigDecimal.ZERO;
        this.i = BigDecimal.ZERO;
        this.j = BigDecimal.ZERO;
        this.k = BigDecimal.ZERO;
        this.l = BigDecimal.ZERO;
        this.m = BigDecimal.ZERO;
        this.n = BigDecimal.ZERO;
        this.o = BigDecimal.ZERO;
        this.p = BigDecimal.ZERO;
    }
}

