/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.cancelamento.NfeCancelamento2Soap
 *  br.gov.sp.fazenda.dsen.ws.cancelamento.NfeCancelamentoNF2Result
 *  br.gov.sp.fazenda.dsen.ws.cancelamento.NfeDadosMsg
 */
package br.gov.sp.fazenda.dsen.ws.cancelamento;

import br.gov.sp.fazenda.dsen.ws.cancelamento.NfeCancelamentoNF2Result;
import br.gov.sp.fazenda.dsen.ws.cancelamento.NfeDadosMsg;
import java.rmi.Remote;
import java.rmi.RemoteException;
import org.w3c.dom.Element;

public interface NfeCancelamento2Soap
extends Remote {
    public NfeCancelamentoNF2Result nfeCancelamentoNF2(Element var1, NfeDadosMsg var2) throws RemoteException;
}

