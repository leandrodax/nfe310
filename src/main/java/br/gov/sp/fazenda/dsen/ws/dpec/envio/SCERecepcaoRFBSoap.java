/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.dpec.envio.SCERecepcaoRFBSoap
 *  br.gov.sp.fazenda.dsen.ws.dpec.envio.SceDadosMsg
 *  br.gov.sp.fazenda.dsen.ws.dpec.envio.SceRecepcaoDPECResult
 */
package br.gov.sp.fazenda.dsen.ws.dpec.envio;

import br.gov.sp.fazenda.dsen.ws.dpec.envio.SceDadosMsg;
import br.gov.sp.fazenda.dsen.ws.dpec.envio.SceRecepcaoDPECResult;
import java.rmi.Remote;
import java.rmi.RemoteException;
import org.w3c.dom.Element;

public interface SCERecepcaoRFBSoap
extends Remote {
    public SceRecepcaoDPECResult sceRecepcaoDPEC(Element var1, SceDadosMsg var2) throws RemoteException;
}

