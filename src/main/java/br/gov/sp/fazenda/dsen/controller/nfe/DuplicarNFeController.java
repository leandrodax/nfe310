/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.NumeracaoTO
 *  br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.nfe.DuplicarNFeController
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade
 *  br.gov.sp.fazenda.dsen.view.nfe.DuplicarNFeGUI
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.NumeracaoTO;
import br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade;
import br.gov.sp.fazenda.dsen.view.nfe.DuplicarNFeGUI;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.EventListener;
import java.util.List;

public class DuplicarNFeController
extends DSGEBaseController
implements FocusListener {
    private DuplicarNFeGUI a;
    private NotaFiscalFacade a;

    public DuplicarNFeController(ViewItf view) throws DSGEUtilException {
        this.a = (DuplicarNFeGUI)view;
        view.addActionListener((EventListener)this);
        this.a = new NotaFiscalFacade();
        this.a();
    }

    private void a() {
        try {
            NumeracaoTO numeracaoTO = this.a.pesquisarUltimoNumero(this.a.getNotaFiscalTO().getEmitenteTO());
            Integer serie = numeracaoTO == null ? 1 : new Integer(numeracaoTO.getSerie());
            Integer numero = numeracaoTO == null ? 1 : Integer.parseInt(numeracaoTO.getNumero()) + 1;
            String nume = numero.toString();
            if (nume.matches("[1-9]{1}[0-9]{0,8}")) {
                this.a.showMessage(MessageFormat.format(DSENMessageConstants.INFNFE_IDE_NUMERO_SEFAZ_INVALIDA, numero));
                this.a.setVisible(false);
                this.a.dispose();
            } else {
                this.a.setSerie(ChaveAcessoUtil.SERIE_FORMAT.format(serie));
                this.a.setNumero(ChaveAcessoUtil.NUMERO_NFE_FORMAT.format(numero));
            }
        }
        catch (DSENBusinessException e) {
            this.a.showErrors((DSGEBaseException)e);
        }
    }

    public void actionPerformed(ActionEvent e) {
        block6 : {
            if ("ok".equals(e.getActionCommand())) {
                try {
                    NotaFiscalTO duplicada = this.a.duplicarNotaFiscal(this.a.getNotaFiscalTO(), this.a.getSerie(), this.a.getNumero());
                    if (duplicada.getErrors() != null) {
                        this.a.showMessage((BaseTO)duplicada);
                        break block6;
                    }
                    this.a.showMessage(DSENMessageConstants.NOTA_FISCAL_DUPLICADA_COM_SUCESSO);
                    this.a.setVisible(false);
                    this.a.dispose();
                    this.a.firePropertyChange("NOTA_FISCAL_CHANGED", (Object)null, (Object)null);
                }
                catch (Throwable t) {
                    this.a.showErrors(t);
                }
            } else if ("cancelar".equals(e.getActionCommand())) {
                this.a.setVisible(false);
                this.a.dispose();
            }
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
        String serie = this.a.getSerie();
        try {
            NumeracaoTO numeracaoTO = this.a.pesquisarUltimoNumero(this.a.getNotaFiscalTO().getEmitenteTO(), serie);
            Integer numero = numeracaoTO == null ? 1 : Integer.parseInt(numeracaoTO.getNumero()) + 1;
            String novoNumero = ChaveAcessoUtil.NUMERO_NFE_FORMAT.format(numero);
            this.a.setNumero(novoNumero);
        }
        catch (Throwable ex) {
            this.a.showErrors(ex);
        }
    }
}

