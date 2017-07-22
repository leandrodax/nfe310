/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.evento.NfeDadosMsg
 *  br.gov.sp.fazenda.dsen.ws.evento.NfeRecepcaoEventoResult
 *  br.gov.sp.fazenda.dsen.ws.evento.RecepcaoEventoSoap
 */
package br.gov.sp.fazenda.dsen.ws.evento;

import br.gov.sp.fazenda.dsen.ws.evento.NfeDadosMsg;
import br.gov.sp.fazenda.dsen.ws.evento.NfeRecepcaoEventoResult;
import java.rmi.Remote;
import java.rmi.RemoteException;
import org.w3c.dom.Element;

public interface RecepcaoEventoSoap
extends Remote {
    public NfeRecepcaoEventoResult nfeRecepcaoEvento(Element var1, NfeDadosMsg var2) throws RemoteException;
}

