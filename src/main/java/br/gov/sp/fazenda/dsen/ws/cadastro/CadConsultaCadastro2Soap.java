/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.cadastro.CadConsultaCadastro2Soap
 *  br.gov.sp.fazenda.dsen.ws.cadastro.CadConsultaCadastroNF2Result
 *  br.gov.sp.fazenda.dsen.ws.cadastro.NfeDadosMsg
 */
package br.gov.sp.fazenda.dsen.ws.cadastro;

import br.gov.sp.fazenda.dsen.ws.cadastro.CadConsultaCadastroNF2Result;
import br.gov.sp.fazenda.dsen.ws.cadastro.NfeDadosMsg;
import java.rmi.Remote;
import java.rmi.RemoteException;
import org.w3c.dom.Element;

public interface CadConsultaCadastro2Soap
extends Remote {
    public CadConsultaCadastroNF2Result consultaCadastro2(Element var1, NfeDadosMsg var2) throws RemoteException;
}

