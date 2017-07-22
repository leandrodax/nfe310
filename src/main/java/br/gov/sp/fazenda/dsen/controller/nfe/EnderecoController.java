/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.controller.nfe.EnderecoController
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TLocal
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.nfe.EnderecoGUI
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TLocal;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.nfe.EnderecoGUI;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.EventListener;
import java.util.List;
import javax.swing.JComboBox;

public class EnderecoController
extends DSGEBaseController
implements ItemListener {
    private EnderecoGUI a;
    private DSENUtilHelper a;

    public EnderecoController(ViewItf view) throws DSGEUtilException {
        this.a = (EnderecoGUI)view;
        view.addActionListener((EventListener)this);
        this.a = DSENUtilHelper.getInstance();
        this.a();
        this.a.disableComponents("enderecoTodos");
        if (this.a.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
            this.a.enableComponents("enderecoTodos");
        }
    }

    private void a() throws DSGEUtilException {
        this.a.setListaUF(this.a.getEstadoTO(true));
    }

    private void a(EstadoTO estadoTO) {
        if (estadoTO != null) {
            try {
                this.a.setListaMunicipio(this.a.getMunicipioTO(estadoTO));
            }
            catch (DSGEUtilException ex) {
                this.a.showErrors((DSGEBaseException)ex);
            }
        }
    }

    private void b() {
        TLocal endereco = this.a.getEndereco();
        this.a.firePropertyChange(this.a.getAcao(), endereco);
        this.a.fechar();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("ok")) {
            this.b();
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JComboBox source;
        if (e.getStateChange() == 1 && e.getSource() instanceof JComboBox && (source = (JComboBox)e.getSource()).getActionCommand().equals("estado")) {
            this.a((EstadoTO)e.getItem());
        }
    }
}

