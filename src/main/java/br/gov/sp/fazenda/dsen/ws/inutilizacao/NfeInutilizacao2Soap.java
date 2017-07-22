/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.inutilizacao.NfeDadosMsg
 *  br.gov.sp.fazenda.dsen.ws.inutilizacao.NfeInutilizacao2Soap
 *  br.gov.sp.fazenda.dsen.ws.inutilizacao.NfeInutilizacaoNF2Result
 */
package br.gov.sp.fazenda.dsen.ws.inutilizacao;

import br.gov.sp.fazenda.dsen.ws.inutilizacao.NfeDadosMsg;
import br.gov.sp.fazenda.dsen.ws.inutilizacao.NfeInutilizacaoNF2Result;
import java.rmi.Remote;
import java.rmi.RemoteException;
import org.w3c.dom.Element;

public interface NfeInutilizacao2Soap
extends Remote {
    public NfeInutilizacaoNF2Result nfeInutilizacaoNF2(Element var1, NfeDadosMsg var2) throws RemoteException;
}

