/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.recepcao.NfeDadosMsg
 *  br.gov.sp.fazenda.dsen.ws.recepcao.NfeRecepcao2Soap
 *  br.gov.sp.fazenda.dsen.ws.recepcao.NfeRecepcaoLote2Result
 */
package br.gov.sp.fazenda.dsen.ws.recepcao;

import br.gov.sp.fazenda.dsen.ws.recepcao.NfeDadosMsg;
import br.gov.sp.fazenda.dsen.ws.recepcao.NfeRecepcaoLote2Result;
import java.rmi.Remote;
import java.rmi.RemoteException;
import org.w3c.dom.Element;

public interface NfeRecepcao2Soap
extends Remote {
    public NfeRecepcaoLote2Result nfeRecepcaoLote2(Element var1, NfeDadosMsg var2) throws RemoteException;
}

