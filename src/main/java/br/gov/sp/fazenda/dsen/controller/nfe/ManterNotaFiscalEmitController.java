/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalEmitController
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.PaisTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.PaisTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.EventListener;
import java.util.List;
import javax.swing.JComboBox;

public class ManterNotaFiscalEmitController
extends DSGEBaseController
implements ItemListener {
    private DigitarNotaFiscalGUI a;
    private int a;
    private DSENUtilHelper a;

    public ManterNotaFiscalEmitController(ViewItf view, int aba) throws DSGEUtilException {
        this.a = (DigitarNotaFiscalGUI)view;
        this.a = aba;
        this.a = DSENUtilHelper.getInstance();
        this.a.addActionListener((EventListener)this, this.a);
        this.a();
    }

    private void a() {
        try {
            this.a.setListaEmitPais(this.a.getPaisTO());
        }
        catch (DSGEUtilException ex) {
            this.a.showErrors((DSGEBaseException)ex);
        }
        if (this.a.getOperacao().equals("manterNotaOperacaoInclusao")) {
            this.a.setEmitenteTO((EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class));
        }
    }

    private void a(PaisTO paisTO) throws DSGEUtilException {
        if (paisTO != null && !StringHelper.isBlankOrNull((Object)paisTO.getCodigo())) {
            List listaEstado = this.a.getEstadoTO(paisTO);
            this.a.setListaEmitEstado(listaEstado);
            this.a.setListaEmitMunicipio(null);
        } else {
            this.a.setListaEmitEstado(null);
            this.a.setListaEmitMunicipio(null);
        }
    }

    private void a(EstadoTO estadoTO) {
        if (estadoTO != null && !StringHelper.isBlankOrNull((Object)estadoTO.getCodigo())) {
            try {
                List listaMunicipio = this.a.getMunicipioTO(estadoTO);
                this.a.setListaEmitMunicipio(listaMunicipio);
            }
            catch (DSGEUtilException ex) {
                this.a.showErrors((DSGEBaseException)ex);
            }
        } else {
            this.a.setListaEmitMunicipio(null);
        }
    }

    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JComboBox source = (JComboBox)e.getSource();
        if (e.getStateChange() == 1) {
            if (source.getActionCommand().equals("pais")) {
                try {
                    this.a((PaisTO)e.getItem());
                }
                catch (DSGEUtilException e1) {
                    this.a.showErrors((DSGEBaseException)e1);
                }
            } else if (source.getActionCommand().equals("estado")) {
                this.a((EstadoTO)e.getItem());
            }
        }
    }
}

