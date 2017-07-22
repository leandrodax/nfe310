/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoLoteResult
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoLoteZipResult
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoSoap
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeDadosMsg
 */
package br.gov.sp.fazenda.dsen.ws.autorizacao;

import br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoLoteResult;
import br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoLoteZipResult;
import br.gov.sp.fazenda.dsen.ws.autorizacao.NfeDadosMsg;
import java.rmi.Remote;
import java.rmi.RemoteException;
import org.w3c.dom.Element;

public interface NfeAutorizacaoSoap
extends Remote {
    public NfeAutorizacaoLoteResult nfeAutorizacaoLote(Element var1, NfeDadosMsg var2) throws RemoteException;

    public NfeAutorizacaoLoteZipResult nfeAutorizacaoLoteZip(String var1) throws RemoteException;
}

