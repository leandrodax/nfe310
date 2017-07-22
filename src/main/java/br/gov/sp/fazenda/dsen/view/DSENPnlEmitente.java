/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.view.DSENPnlEmitente
 *  br.gov.sp.fazenda.dsen.view.DSENPnlEmitente$1
 *  br.gov.sp.fazenda.dsge.common.app.Observer
 *  br.gov.sp.fazenda.dsge.common.app.Subject
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException
 *  br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.view.DSENPnlEmitente;
import br.gov.sp.fazenda.dsge.common.app.Observer;
import br.gov.sp.fazenda.dsge.common.app.Subject;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException;
import br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DSENPnlEmitente
extends JPanel
implements Observer {
    JLabel a;
    JLabel b;
    JLabel c;

    public DSENPnlEmitente(JLabel lblRazao, JLabel lblCNPJ, JLabel lblIE, Subject subject, AppContextEnum appContexEnum) {
        subject.register((Observer)this, new EnumItf[]{appContexEnum});
        this.a = lblRazao;
        this.b = lblCNPJ;
        this.c = lblIE;
    }

    public void update(Object data, EnumItf source) {
        switch (1.a[((AppContextEnum)source).ordinal()]) {
            case 1: {
                EmitenteTO emitente = (EmitenteTO)data;
                if (emitente != null) {
                    this.a.setText(emitente.getXNome());
                    String doc = null;
                    try {
                        doc = emitente.getNrDocumento() == null ? null : DSGEDocumentoHelper.formatarDocumento((String)emitente.getNrDocumento(), (TipoDocumentoEnum)emitente.getTpDocumentoEnum());
                    }
                    catch (DSGEValidationException ex) {
                        ex.printStackTrace();
                    }
                    this.b.setText(doc);
                    this.c.setText(DSGEDocumentoHelper.formatarIE((String)emitente.getIe(), (String)emitente.getUf()));
                } else {
                    this.a.setText("");
                    this.b.setText("");
                    this.c.setText("");
                }
                this.repaint();
            }
        }
    }

    public DSENPnlEmitente() {
    }
}

