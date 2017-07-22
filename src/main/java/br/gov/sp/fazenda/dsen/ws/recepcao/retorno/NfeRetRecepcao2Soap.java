/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.recepcao.retorno.NfeDadosMsg
 *  br.gov.sp.fazenda.dsen.ws.recepcao.retorno.NfeRetRecepcao2Result
 *  br.gov.sp.fazenda.dsen.ws.recepcao.retorno.NfeRetRecepcao2Soap
 */
package br.gov.sp.fazenda.dsen.ws.recepcao.retorno;

import br.gov.sp.fazenda.dsen.ws.recepcao.retorno.NfeDadosMsg;
import br.gov.sp.fazenda.dsen.ws.recepcao.retorno.NfeRetRecepcao2Result;
import java.rmi.Remote;
import java.rmi.RemoteException;
import org.w3c.dom.Element;

public interface NfeRetRecepcao2Soap
extends Remote {
    public NfeRetRecepcao2Result nfeRetRecepcao2(Element var1, NfeDadosMsg var2) throws RemoteException;
}

