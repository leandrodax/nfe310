/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ProdutoEspecificoEnum
 *  br.gov.sp.fazenda.dsen.common.to.IcmsTO
 *  br.gov.sp.fazenda.dsen.common.to.IpiTO
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoNotaTO
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoTO
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TIpi
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TIpi$IPITrib
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS00
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS10
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS20
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS40
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS51
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS70
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS90
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN900
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.enumeration.ProdutoEspecificoEnum;
import br.gov.sp.fazenda.dsen.common.to.IcmsTO;
import br.gov.sp.fazenda.dsen.common.to.IpiTO;
import br.gov.sp.fazenda.dsen.common.to.ProdutoTO;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TIpi;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class ProdutoNotaTO
extends BaseTO {
    private static final long a = 7020392170372739193L;
    private TNFe.InfNFe.Det a;
    private Collection<IcmsTO> a;
    private ProdutoEspecificoEnum a;

    public TNFe.InfNFe.Det getDetalheProduto() {
        return this.a;
    }

    public void setDetalheProduto(TNFe.InfNFe.Det detalheProduto) {
        this.a = detalheProduto;
    }

    public Collection<IcmsTO> getListaICMSTO() {
        return this.a;
    }

    public void setListaICMSTO(Collection<IcmsTO> listaICMSTO) {
        this.a = listaICMSTO;
    }

    public String getCProd() {
        String cProd = "";
        if (this.a != null && this.a.getProd() != null) {
            cProd = this.a.getProd().getCProd();
        }
        return cProd;
    }

    public void setCProd(String cProd) {
        if (this.a != null && this.a.getProd() != null) {
            this.a.getProd().setCProd(cProd);
        }
    }

    public String getXProd() {
        String xProd = "";
        if (this.a != null && this.a.getProd() != null) {
            xProd = this.a.getProd().getXProd();
        }
        return xProd;
    }

    public void setXProd(String xProd) {
        if (this.a != null && this.a.getProd() != null) {
            this.a.getProd().setXProd(xProd);
        }
    }

    public BigDecimal getVProd() {
        BigDecimal vProd = null;
        if (this.a == null || this.a.getProd() != null) {
            // empty if block
        }
        return vProd;
    }

    public void setVProd(BigDecimal vProd) {
        if (this.a == null || this.a.getProd() != null) {
            // empty if block
        }
    }

    public String getNCM() {
        String ncm = null;
        if (this.a != null && this.a.getProd() != null) {
            ncm = this.a.getProd().getNCM();
        }
        return ncm;
    }

    public String getCFOP() {
        if (this.a != null) {
            return DocumentoUtil.getCFOP((TNFe.InfNFe.Det.Prod)this.a.getProd(), (boolean)true);
        }
        return null;
    }

    public String getUnid() {
        String unid = null;
        if (this.a != null && this.a.getProd() != null) {
            unid = this.a.getProd().getUCom();
        }
        return unid;
    }

    public String getQtd() {
        String qtd = null;
        if (this.a != null && this.a.getProd() != null) {
            qtd = this.a.getProd().getQCom();
        }
        return qtd;
    }

    public String getVUnid() {
        String vUnid = null;
        if (this.a != null && this.a.getProd() != null) {
            vUnid = this.a.getProd().getVUnCom();
        }
        return vUnid;
    }

    public String getVTot() {
        String vTot = null;
        if (this.a != null && this.a.getProd() != null) {
            vTot = this.a.getProd().getVProd();
        }
        return vTot;
    }

    public String getBCICMS() {
        String bcICMS = null;
        if (this.a != null && this.a.getImposto() != null && this.a.getImposto().getICMS() != null) {
            TNFe.InfNFe.Det.Imposto.ICMS icms = this.a.getImposto().getICMS();
            if (icms.getICMS00() != null) {
                bcICMS = icms.getICMS00().getVBC();
            }
            if (icms.getICMS10() != null) {
                bcICMS = icms.getICMS10().getVBC();
            }
            if (icms.getICMS20() != null) {
                bcICMS = icms.getICMS20().getVBC();
            }
            if (icms.getICMS51() != null) {
                bcICMS = icms.getICMS51().getVBC();
            }
            if (icms.getICMS70() != null) {
                bcICMS = icms.getICMS70().getVBC();
            }
            if (icms.getICMS90() != null) {
                bcICMS = icms.getICMS90().getVBC();
            }
            if (icms.getICMSSN900() != null) {
                bcICMS = icms.getICMSSN900().getVBC();
            }
        }
        return bcICMS;
    }

    public String getVICMS() {
        String vICMS = null;
        if (this.a != null && this.a.getImposto() != null && this.a.getImposto().getICMS() != null) {
            TNFe.InfNFe.Det.Imposto.ICMS icms = this.a.getImposto().getICMS();
            if (icms.getICMS00() != null) {
                vICMS = icms.getICMS00().getVICMS();
            }
            if (icms.getICMS10() != null) {
                vICMS = icms.getICMS10().getVICMS();
            }
            if (icms.getICMS20() != null) {
                vICMS = icms.getICMS20().getVICMS();
            }
            if (icms.getICMS40() != null) {
                vICMS = icms.getICMS40().getVICMSDeson();
            }
            if (icms.getICMS51() != null) {
                vICMS = icms.getICMS51().getVICMS();
            }
            if (icms.getICMS70() != null) {
                vICMS = icms.getICMS70().getVICMS();
            }
            if (icms.getICMS90() != null) {
                vICMS = icms.getICMS90().getVICMS();
            }
            if (icms.getICMSSN900() != null) {
                vICMS = icms.getICMSSN900().getVICMS();
            }
        }
        return vICMS;
    }

    public String getVIPI() {
        TIpi ipi;
        String vIPI = null;
        if (this.a != null && this.a.getImposto() != null && this.a.getImposto().getIPI() != null && (ipi = this.a.getImposto().getIPI()).getIPITrib() != null) {
            vIPI = ipi.getIPITrib().getVIPI();
        }
        return vIPI;
    }

    public String getPIPI() {
        TIpi ipi;
        String pIPI = null;
        if (this.a != null && this.a.getImposto() != null && this.a.getImposto().getIPI() != null && (ipi = this.a.getImposto().getIPI()).getIPITrib() != null) {
            pIPI = ipi.getIPITrib().getPIPI();
        }
        return pIPI;
    }

    public String getPICMS() {
        String pICMS = null;
        if (this.a != null && this.a.getImposto() != null && this.a.getImposto().getICMS() != null) {
            TNFe.InfNFe.Det.Imposto.ICMS icms = this.a.getImposto().getICMS();
            if (icms.getICMS00() != null) {
                pICMS = icms.getICMS00().getPICMS();
            }
            if (icms.getICMS10() != null) {
                pICMS = icms.getICMS10().getPICMS();
            }
            if (icms.getICMS20() != null) {
                pICMS = icms.getICMS20().getPICMS();
            }
            if (icms.getICMS51() != null) {
                pICMS = icms.getICMS51().getPICMS();
            }
            if (icms.getICMS70() != null) {
                pICMS = icms.getICMS70().getPICMS();
            }
            if (icms.getICMS90() != null) {
                pICMS = icms.getICMS90().getPICMS();
            }
            if (icms.getICMSSN900() != null) {
                pICMS = icms.getICMSSN900().getPICMS();
            }
        }
        return pICMS;
    }

    public String getNItem() {
        String nItem = null;
        if (this.a != null) {
            nItem = this.a.getNItem();
        }
        return nItem;
    }

    public void setProdutoEspecifico(ProdutoEspecificoEnum produtoEspecifico) {
        this.a = produtoEspecifico;
    }

    public ProdutoEspecificoEnum getProdutoEspecifico() {
        return this.a;
    }

    public void setValues(ProdutoTO produtoTO) {
        this.a = TNFe.InfNFe.Det.Factory.newInstance();
        this.a.addNewProd();
        TNFe.InfNFe.Det.Prod produto = this.a.getProd();
        if (!StringHelper.isBlankOrNull((Object)produtoTO.getCProd())) {
            produto.setCProd(produtoTO.getCProd());
        }
        if (!StringHelper.isBlankOrNull((Object)produtoTO.getCEan())) {
            produto.setCEAN(produtoTO.getCEan());
        }
        if (!StringHelper.isBlankOrNull((Object)produtoTO.getXProd())) {
            produto.setXProd(produtoTO.getXProd());
        }
        if (!StringHelper.isBlankOrNull((Object)produtoTO.getNcm())) {
            produto.setNCM(produtoTO.getNcm());
        }
        if (!StringHelper.isBlankOrNull((Object)produtoTO.getExTipi())) {
            produto.setEXTIPI(produtoTO.getExTipi());
        }
        if (!StringHelper.isBlankOrNull((Object)produtoTO.getUCom())) {
            produto.setUCom(produtoTO.getUCom());
        }
        if (!StringHelper.isBlankOrNull((Object)produtoTO.getVUnCom())) {
            produto.setVUnCom(produtoTO.getVUnCom());
        }
        if (!StringHelper.isBlankOrNull((Object)produtoTO.getVUnTrib())) {
            produto.setVUnTrib(produtoTO.getVUnTrib());
        }
        if (!StringHelper.isBlankOrNull((Object)produtoTO.getQTrib())) {
            produto.setQTrib(produtoTO.getQTrib());
        }
        if (!StringHelper.isBlankOrNull((Object)produtoTO.getCEanTrib())) {
            produto.setCEANTrib(produtoTO.getCEanTrib());
        }
        if (!StringHelper.isBlankOrNull((Object)produtoTO.getUTrib())) {
            produto.setUTrib(produtoTO.getUTrib());
        }
        if (produtoTO.getIpiTOSet() != null && produtoTO.getIpiTOSet().size() > 0) {
            IpiTO ipiTO = (IpiTO)produtoTO.getIpiTOSet().iterator().next();
            TNFe.InfNFe.Det.Imposto imposto = this.a.addNewImposto();
            TIpi ipi = imposto.addNewIPI();
            if (!StringHelper.isBlankOrNull((Object)ipiTO.getCEnq())) {
                ipi.setCEnq(ipiTO.getCEnq());
            }
            if (!StringHelper.isBlankOrNull((Object)ipiTO.getCnpjProd())) {
                ipi.setCNPJProd(ipiTO.getCnpjProd());
            }
            if (!StringHelper.isBlankOrNull((Object)ipiTO.getClEnq())) {
                ipi.setClEnq(ipiTO.getClEnq());
            }
        }
        if (produtoTO.getIcmsTOSet() != null && produtoTO.getIcmsTOSet().size() > 0) {
            this.setListaICMSTO((Collection)produtoTO.getIcmsTOSet());
        }
    }
}

