/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.COFINSEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.CSOSNEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.CSTEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExigibilidadeISSEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.IPIEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.IndIncentivoFiscalEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ModBCEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ModBcstEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.MotivoDesoneracaoICMSEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.OrigemMercadoriaEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.PISEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoCalculoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoTributacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TributacaoISSQNEnum
 *  br.gov.sp.fazenda.dsen.common.to.IcmsTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoNotaTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaTributosController
 *  br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaTributosController$1
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.MunicipioTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  org.apache.xmlbeans.XmlException
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.enumeration.COFINSEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.CSOSNEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.CSTEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ExigibilidadeISSEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.IPIEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.IndIncentivoFiscalEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ModBCEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ModBcstEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.MotivoDesoneracaoICMSEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.OrigemMercadoriaEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.PISEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoCalculoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoTributacaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TributacaoISSQNEnum;
import br.gov.sp.fazenda.dsen.common.to.IcmsTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.ProdutoNotaTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaTributosController;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.MunicipioTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import org.apache.xmlbeans.XmlException;

public class ProdutoNotaTributosController
extends DSGEBaseController
implements FocusListener,
ItemListener {
    private ProdutoNotaGUI a;
    private int a;
    private DSENUtilHelper a;
    private NotaFiscalFacade a;
    private HashMap<String, String> a = new HashMap();

    public ProdutoNotaTributosController(ViewItf view, int aba) throws DSGEUtilException {
        this.a = (ProdutoNotaGUI)view;
        this.a = aba;
        this.a = DSENUtilHelper.getInstance();
        this.a = new NotaFiscalFacade();
        this.a();
        this.a.addActionListener((EventListener)this, this.a);
    }

    private void a() throws DSGEUtilException {
        this.a.setListaTipoTributacao(TipoTributacaoEnum.values());
        this.a.setListaICMSCST(CSTEnum.values());
        this.a.setListaCSOSN(CSOSNEnum.values());
        this.a.setListaICMSOrigem(OrigemMercadoriaEnum.values());
        this.a.setListaICMSModBC(ModBCEnum.values());
        this.a.setListaICMSModBCST(ModBcstEnum.values());
        this.a.setListaIPICST(IPIEnum.values());
        this.a.setListaPISCST(PISEnum.values());
        this.a.setListaCOFINSCST(COFINSEnum.values());
        this.a.setListaTipoCalculo(TipoCalculoEnum.values());
        this.a.setListaCFOP(DSENUtilHelper.getInstance().getCfopTO());
        this.a.setListaISSQNUF(this.a.getEstadoTO(true));
        this.a.setListaISSQNUFInci(this.a.getEstadoTO(true));
        this.a.setListaISSQNPais(this.a.getPaisTO());
        this.a.setListaISSQNTributacao(TributacaoISSQNEnum.values());
        this.a.setListaSTUFDevido(this.a.getEstadoTO(true));
        this.a.setListaMotivoDesoneracaoICMS(MotivoDesoneracaoICMSEnum.values());
        this.a.setListaISSQNExigibilidade(ExigibilidadeISSEnum.values());
        this.a.setListaISSQNIncentivoFiscal(IndIncentivoFiscalEnum.values());
        try {
            this.a.setListaServicoTO(this.a.getServicoNFe310TO());
        }
        catch (DSGEUtilException ex) {
            this.a.showErrors((DSGEBaseException)ex);
        }
        this.a.disableComponents("produtoNotaTributoCofinsTodos");
        this.a.disableComponents("produtoNotaCOFINSTodos");
        this.a.disableComponents("produtoNotaTributoIPITodos");
        this.a.disableComponents("produtoNotaTributoIPITodosDisable");
        this.a.disableComponents("produtoNotaTributoPISTodos");
        this.a.disableComponents("produtoNotaPISSTTodos");
    }

    private void a(CSTEnum cst) {
        Collection listaICMS;
        this.a.limparCamposCST();
        this.a.setComponentsVisible("PRODUTO_NOTA_ICMS_TRIB_NORMAL_TODOS", false);
        if (cst == null) {
            return;
        }
        this.a.atualizarICMSObrigatorios(cst);
        this.a.disableICMSRegime40(cst);
        this.a.setComponentsVisible(cst.getDescricao(), true);
        ProdutoNotaTO produtoNotaTO = this.a.getProdutoNotaTO(false);
        if (produtoNotaTO != null && (listaICMS = produtoNotaTO.getListaICMSTO()) != null) {
            for (IcmsTO icmsTO : listaICMS) {
                if (!cst.getCst().equals(icmsTO.getCst())) continue;
                this.a.setICMSTO(icmsTO);
                break;
            }
        }
        MotivoDesoneracaoICMSEnum[] listaNova = new MotivoDesoneracaoICMSEnum[3];
        switch (1.a[cst.ordinal()]) {
            case 1: 
            case 2: 
            case 3: {
                listaNova[0] = MotivoDesoneracaoICMSEnum.getEnumPeloCodigo((String)"3");
                listaNova[1] = MotivoDesoneracaoICMSEnum.getEnumPeloCodigo((String)"9");
                listaNova[2] = MotivoDesoneracaoICMSEnum.getEnumPeloCodigo((String)"12");
                this.a.setListaMotivoDesoneracaoICMS(listaNova);
                break;
            }
            case 4: {
                listaNova[0] = MotivoDesoneracaoICMSEnum.getEnumPeloCodigo((String)"6");
                listaNova[1] = MotivoDesoneracaoICMSEnum.getEnumPeloCodigo((String)"7");
                listaNova[2] = MotivoDesoneracaoICMSEnum.getEnumPeloCodigo((String)"9");
                this.a.setListaMotivoDesoneracaoICMS(listaNova);
                break;
            }
            case 5: {
                this.a.setListaMotivoDesoneracaoICMS(MotivoDesoneracaoICMSEnum.values());
                break;
            }
        }
    }

    private void a(CSOSNEnum csosn) {
        Collection listaICMS;
        this.a.limparCamposCSOSN();
        if (CSOSNEnum._201.equals((Object)csosn) || CSOSNEnum._202.equals((Object)csosn)) {
            this.a.setInfoSimplesNacionalICMSST(DSENMessageConstants.MSG_VALOR_ICMS_INF_ABAT_ICMS_PROP);
        }
        this.a.setComponentsVisible("PRODUTO_NOTA_ICMS_SIMPLES_NACIONAL_TODOS", false);
        if (csosn == null) {
            return;
        }
        this.a.atualizarICMSObrigatorios(csosn);
        this.a.setComponentsVisible(csosn.getDescricao(), true);
        ProdutoNotaTO produtoNotaTO = this.a.getProdutoNotaTO(false);
        if (produtoNotaTO != null && (listaICMS = produtoNotaTO.getListaICMSTO()) != null) {
            for (IcmsTO icmsTO : listaICMS) {
                if (!csosn.getCsosn().equals(icmsTO.getCst())) continue;
                this.a.setICMSTO(icmsTO);
                break;
            }
        }
    }

    private void a(IPIEnum ipi) {
        this.a.limparIPI(true);
        this.a.disableComponents("produtoNotaTributoIPITodos");
        if (this.a.getOperacaoNota().equals("manterNotaOperacaoEdicao") && ipi != null) {
            this.a.enableComponents(ipi.getDescricao());
        }
    }

    private void a(TipoCalculoEnum tpCalculo) {
        this.a.limparIPI(false);
        this.a.disableComponents("produtoNotaTributoIPITodos");
        if (tpCalculo != null) {
            if (this.a.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
                if (tpCalculo.equals((Object)TipoCalculoEnum.PERCENTUAL)) {
                    this.a.enableComponents("produtoNotaIPIPercentual");
                } else if (tpCalculo.equals((Object)TipoCalculoEnum.EM_VALOR)) {
                    this.a.enableComponents("produtoNotaIPIEmValor");
                }
            }
        } else {
            IPIEnum ipiEnum = this.a.getSelectedIPI();
            if (this.a.getOperacaoNota().equals("manterNotaOperacaoEdicao") && ipiEnum != null) {
                this.a.enableComponents(ipiEnum.getDescricao());
            }
        }
    }

    private void a(PISEnum pis) {
        this.a.limparPIS(true);
        this.a.disableComponents("produtoNotaTributoPISTodos");
        this.a.disableComponents("produtoNotaPISSTTodos");
        if (this.a.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
            if (pis.equals((Object)PISEnum.PIS_05) || pis.equals((Object)PISEnum.PIS_75)) {
                this.a.enableComponents("produtoNotaPISSTTodos");
            } else {
                this.a.limparCmbPISSTTpCalculo();
                this.a.disableComponents("produtoNotaPISSTTodos");
            }
            this.a.enableComponents(pis.getDescricao());
        } else {
            this.a.disableComponents("produtoNotaPISSTTodos");
        }
    }

    private void b(TipoCalculoEnum tpCalculo) {
        this.a.limparPISST();
        this.a.disableComponents("produtoNotaPISST");
        if (tpCalculo != null && this.a.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
            if (tpCalculo.equals((Object)TipoCalculoEnum.PERCENTUAL)) {
                this.a.enableComponents("produtoNotaPISSTPercentual");
            } else if (tpCalculo.equals((Object)TipoCalculoEnum.EM_VALOR)) {
                this.a.enableComponents("produtoNotaPISSTEmValor");
            }
        }
    }

    private void c(TipoCalculoEnum tpCalculo) {
        this.a.limparPIS(false);
        this.a.disableComponents("produtoNotaTributoPISTodos");
        if (this.a.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
            if (tpCalculo.equals((Object)TipoCalculoEnum.PERCENTUAL)) {
                this.a.enableComponents("produtoNotaPISPercentual");
            } else if (tpCalculo.equals((Object)TipoCalculoEnum.EM_VALOR)) {
                this.a.enableComponents("produtoNotaPISEmValor");
            }
        }
    }

    private void a(COFINSEnum cofins) {
        this.a.limparCOFINS(true);
        this.a.disableComponents("produtoNotaTributoCofinsTodos");
        this.a.disableComponents("produtoNotaCOFINSTodos");
        if (this.a.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
            if (cofins.equals((Object)COFINSEnum.COFINS_05) || cofins.equals((Object)COFINSEnum.COFINS_75)) {
                this.a.enableComponents("produtoNotaCOFINSTodos");
            } else {
                this.a.limparCmbCOFINSSTTpCalculo();
                this.a.disableComponents("produtoNotaCOFINSTodos");
            }
            this.a.enableComponents(cofins.getDescricao());
        }
    }

    private void d(TipoCalculoEnum tpCalculo) {
        this.a.limparCOFINSST();
        this.a.disableComponents("produtoNotaCOFINS");
        if (tpCalculo != null && this.a.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
            if (tpCalculo.equals((Object)TipoCalculoEnum.PERCENTUAL)) {
                this.a.enableComponents("produtoNotaCOFINSSTPercentual");
            } else if (tpCalculo.equals((Object)TipoCalculoEnum.EM_VALOR)) {
                this.a.enableComponents("produtoNotaCOFINSSTEmValor");
            }
        }
    }

    private void e(TipoCalculoEnum tpCalculo) {
        this.a.limparCOFINS(false);
        this.a.disableComponents("produtoNotaTributoCofinsTodos");
        if (this.a.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
            if (tpCalculo.equals((Object)TipoCalculoEnum.PERCENTUAL)) {
                this.a.enableComponents("produtoNotaCOFINSPercentual");
            } else if (tpCalculo.equals((Object)TipoCalculoEnum.EM_VALOR)) {
                this.a.enableComponents("produtoNotaCOFINSEmValor");
            }
        }
    }

    private void a(EstadoTO estadoTO) {
        if (estadoTO == null) {
            this.a.setListaISSQNMunicipio(new ArrayList());
        } else {
            try {
                List listaMunicipio = this.a.getMunicipioTO(estadoTO);
                this.a.setListaISSQNMunicipio(listaMunicipio);
            }
            catch (DSGEUtilException ex) {
                this.a.showErrors((DSGEBaseException)ex);
            }
        }
    }

    private void b(EstadoTO estadoTO) {
        if (estadoTO == null) {
            this.a.setListaISSQNMunicipioInci(new ArrayList());
        } else {
            try {
                List listaMunicipio = this.a.getMunicipioTO(estadoTO);
                this.a.setListaISSQNMunicipioInci(listaMunicipio);
            }
            catch (DSGEUtilException ex) {
                this.a.showErrors((DSGEBaseException)ex);
            }
        }
    }

    private void a(MunicipioTO municiopioTO) {
        if (municiopioTO != null) {
            if (municiopioTO.getCodigo().equals("9999999")) {
                this.a.enablecmbISSQNPais(true);
            } else {
                this.a.enablecmbISSQNPais(false);
            }
        } else {
            this.a.enablecmbISSQNPais(false);
        }
    }

    private void a(String name) {
        NotaFiscalTO notaFiscalTO = this.a.getNotaFiscalTO();
        try {
            if (name.equals("TRIB_NORM_ICMS_FOCUS_LOST")) {
                this.a.calcularValorICMS(notaFiscalTO);
                NFeDocument nfe = DocumentoUtil.getNFeDocument((String)notaFiscalTO.getDocXmlString());
                this.a.updateValorICMS(nfe.getNFe().getInfNFe().getDetArray(0));
            } else if (name.equals("TRIB_NORM_ICMSST_FOCUS_LOST")) {
                this.a.calcularValorICMSST(notaFiscalTO);
                NFeDocument nfe = DocumentoUtil.getNFeDocument((String)notaFiscalTO.getDocXmlString());
                this.a.updateValorICMSST(nfe.getNFe().getInfNFe().getDetArray(0));
            } else if (name.equals("SIMPLES_NACIONAL_ICMS_FOCUS_LOST")) {
                this.a.calcularValorICMS(notaFiscalTO);
                NFeDocument nfe = DocumentoUtil.getNFeDocument((String)notaFiscalTO.getDocXmlString());
                this.a.updateValorICMSSN(nfe.getNFe().getInfNFe().getDetArray(0));
            } else if (name.equals("SIMPLES_NACIONAL_ICMSST_FOCUS_LOST")) {
                this.a.calcularValorICMSST(notaFiscalTO);
                NFeDocument nfe = DocumentoUtil.getNFeDocument((String)notaFiscalTO.getDocXmlString());
                this.a.updateValorICMSSNST(nfe.getNFe().getInfNFe().getDetArray(0));
            } else if (name.equals("ipiFocusLost")) {
                this.a.calcularValorIPI(notaFiscalTO);
                NFeDocument nfe = DocumentoUtil.getNFeDocument((String)notaFiscalTO.getDocXmlString());
                this.a.updateValorIPI(nfe.getNFe().getInfNFe().getDetArray(0));
            } else if (name.equals("pisFocusLost")) {
                this.a.calcularValorPIS(notaFiscalTO);
                NFeDocument nfe = DocumentoUtil.getNFeDocument((String)notaFiscalTO.getDocXmlString());
                this.a.updateValorPIS(nfe.getNFe().getInfNFe().getDetArray(0));
            } else if (name.equals("pisSTFocusLost")) {
                this.a.calcularValorPISST(notaFiscalTO);
                NFeDocument nfe = DocumentoUtil.getNFeDocument((String)notaFiscalTO.getDocXmlString());
                this.a.updateValorPISST(nfe.getNFe().getInfNFe().getDetArray(0));
            } else if (name.equals("cofinsFocusLost")) {
                this.a.calcularValorCOFINS(notaFiscalTO);
                NFeDocument nfe = DocumentoUtil.getNFeDocument((String)notaFiscalTO.getDocXmlString());
                this.a.updateValorCOFINS(nfe.getNFe().getInfNFe().getDetArray(0));
            } else if (name.equals("cofinsSTFocusLost")) {
                this.a.calcularValorCOFINSST(notaFiscalTO);
                NFeDocument nfe = DocumentoUtil.getNFeDocument((String)notaFiscalTO.getDocXmlString());
                this.a.updateValorCOFINS(nfe.getNFe().getInfNFe().getDetArray(0));
            } else if (name.equals("issqnFocusLost")) {
                this.a.calcularValorISSQN(notaFiscalTO);
                NFeDocument nfe = DocumentoUtil.getNFeDocument((String)notaFiscalTO.getDocXmlString());
                this.a.updateValorISSQN(nfe.getNFe().getInfNFe().getDetArray(0));
            }
        }
        catch (DSENBusinessException ex2) {
            this.a.showErrors((DSGEBaseException)ex2);
        }
        catch (XmlException ex2) {
            // empty catch block
        }
    }

    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JComboBox source = (JComboBox)e.getSource();
        if (e.getStateChange() == 1) {
            if (source.getActionCommand().equals("ICMSCST")) {
                this.a((CSTEnum)e.getItem());
            } else if (source.getActionCommand().equals("ACTION_ICMS_CSOSN")) {
                this.a((CSOSNEnum)e.getItem());
            } else if (source.getActionCommand().equals("IPICST")) {
                IPIEnum ipiEnum = null;
                if (e.getItem() != null && !e.getItem().equals("")) {
                    ipiEnum = (IPIEnum)e.getItem();
                }
                this.a(ipiEnum);
            } else if (source.getActionCommand().equals("IPITpCalculo")) {
                TipoCalculoEnum tpCalculo = null;
                if (e.getItem() != null && !e.getItem().equals("")) {
                    tpCalculo = (TipoCalculoEnum)e.getItem();
                }
                this.a(tpCalculo);
            } else if (source.getActionCommand().equals("PISCST")) {
                this.a((PISEnum)e.getItem());
            } else if (source.getActionCommand().equals("PISSTTpCalculo")) {
                TipoCalculoEnum tpCalculo = null;
                if (e.getItem() != null && !e.getItem().equals("")) {
                    tpCalculo = (TipoCalculoEnum)e.getItem();
                }
                this.b(tpCalculo);
            } else if (source.getActionCommand().equals("PISTpCalculo")) {
                this.c((TipoCalculoEnum)e.getItem());
            } else if (source.getActionCommand().equals("COFINSCST")) {
                this.a((COFINSEnum)e.getItem());
            } else if (source.getActionCommand().equals("COFINSSTTpCalculo")) {
                TipoCalculoEnum tpCalculo = null;
                if (e.getItem() != null && !e.getItem().equals("")) {
                    tpCalculo = (TipoCalculoEnum)e.getItem();
                }
                this.d(tpCalculo);
            } else if (source.getActionCommand().equals("COFINSTpCalculo")) {
                this.e((TipoCalculoEnum)e.getItem());
            } else if (source.getActionCommand().equals("ISSQNUF")) {
                this.a((EstadoTO)e.getItem());
            } else if (source.getActionCommand().equals("ISSQNUFINCI")) {
                this.b((EstadoTO)e.getItem());
            } else if (source.getActionCommand().equals("ISSQNMUNFG")) {
                this.a((MunicipioTO)e.getItem());
            }
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        Component component = (Component)e.getSource();
        if (component instanceof JTextComponent) {
            JTextComponent textComponent = (JTextComponent)component;
            this.a.put(textComponent.getName(), textComponent.getText());
        } else if (component instanceof JComboBox) {
            JComboBox combo = (JComboBox)component;
            String value = String.valueOf(combo.getSelectedIndex());
            this.a.put(combo.getName(), value);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        JTextField source = (JTextField)e.getSource();
        String oldValue = (String)this.a.get(source.getName());
        String newValue = source.getText();
        if (oldValue != null && newValue != null && oldValue.equals(newValue)) {
            return;
        }
        this.a(source.getName());
    }
}

