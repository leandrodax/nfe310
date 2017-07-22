/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.status.NfeDadosMsg
 *  br.gov.sp.fazenda.dsen.ws.status.NfeStatusServico2Soap
 *  br.gov.sp.fazenda.dsen.ws.status.NfeStatusServicoNF2Result
 */
package br.gov.sp.fazenda.dsen.ws.status;

import br.gov.sp.fazenda.dsen.ws.status.NfeDadosMsg;
import br.gov.sp.fazenda.dsen.ws.status.NfeStatusServicoNF2Result;
import java.rmi.Remote;
import java.rmi.RemoteException;
import org.w3c.dom.Element;

public interface NfeStatusServico2Soap
extends Remote {
    public NfeStatusServicoNF2Result nfeStatusServicoNF2(Element var1, NfeDadosMsg var2) throws RemoteException;
}

