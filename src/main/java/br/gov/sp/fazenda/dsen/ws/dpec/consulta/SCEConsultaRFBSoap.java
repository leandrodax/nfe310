/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.dpec.consulta.SCEConsultaRFBSoap
 *  br.gov.sp.fazenda.dsen.ws.dpec.consulta.SceConsultaDPECResult
 *  br.gov.sp.fazenda.dsen.ws.dpec.consulta.SceDadosMsg
 */
package br.gov.sp.fazenda.dsen.ws.dpec.consulta;

import br.gov.sp.fazenda.dsen.ws.dpec.consulta.SceConsultaDPECResult;
import br.gov.sp.fazenda.dsen.ws.dpec.consulta.SceDadosMsg;
import java.rmi.Remote;
import java.rmi.RemoteException;
import org.w3c.dom.Element;

public interface SCEConsultaRFBSoap
extends Remote {
    public SceConsultaDPECResult sceConsultaDPEC(Element var1, SceDadosMsg var2) throws RemoteException;
}

