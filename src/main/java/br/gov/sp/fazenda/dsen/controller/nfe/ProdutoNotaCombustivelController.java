/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaCombustivelController
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TcProdANP
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TcProdANP$Enum
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  org.apache.xmlbeans.StringEnumAbstractBase
 *  org.apache.xmlbeans.StringEnumAbstractBase$Table
 *  org.apache.xmlbeans.XmlException
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TcProdANP;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EventListener;
import java.util.List;
import org.apache.xmlbeans.StringEnumAbstractBase;
import org.apache.xmlbeans.XmlException;

public class ProdutoNotaCombustivelController
extends DSGEBaseController
implements FocusListener {
    private ProdutoNotaGUI a;
    private int a;
    private NotaFiscalFacade a;

    public ProdutoNotaCombustivelController(ViewItf view, int aba) throws DSGEUtilException {
        this.a = (ProdutoNotaGUI)view;
        this.a = aba;
        this.a.addActionListener((EventListener)this, aba);
        this.a = new NotaFiscalFacade();
        this.a();
    }

    private void a() throws DSGEUtilException {
        this.a.setListaICMSConsumoUF(DSENUtilHelper.getInstance().getEstadoTO(true));
        ArrayList<String> listaANP = new ArrayList<String>();
        for (int i = 1; i <= TcProdANP.Enum.table.lastInt(); ++i) {
            StringEnumAbstractBase x = TcProdANP.Enum.table.forInt(i);
            if (listaANP.contains(x.toString())) continue;
            listaANP.add(x.toString());
        }
        Collections.sort(listaANP);
        this.a.setListaCodigoANP(listaANP);
    }

    private void b() {
        NotaFiscalTO notaFiscalTO = this.a.getNotaFiscalTO();
        try {
            this.a.calcularValorCIDE(notaFiscalTO);
            try {
                NFeDocument nfe = DocumentoUtil.getNFeDocument((String)notaFiscalTO.getDocXmlString());
                this.a.updateValorCIDE(nfe.getNFe().getInfNFe().getDetArray(0));
            }
            catch (XmlException nfe) {}
        }
        catch (DSENBusinessException ex) {
            this.a.showErrors((DSGEBaseException)ex);
        }
    }

    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
        this.b();
    }
}

