/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeDadosMsg
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacaoLoteResult
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacaoSoap
 */
package br.gov.sp.fazenda.dsen.ws.autorizacao.retorno;

import br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeDadosMsg;
import br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacaoLoteResult;
import java.rmi.Remote;
import java.rmi.RemoteException;
import org.w3c.dom.Element;

public interface NfeRetAutorizacaoSoap
extends Remote {
    public NfeRetAutorizacaoLoteResult nfeRetAutorizacaoLote(Element var1, NfeDadosMsg var2) throws RemoteException;
}

