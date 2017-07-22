/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.consulta.NfeConsulta2Soap
 *  br.gov.sp.fazenda.dsen.ws.consulta.NfeConsultaNF2Result
 *  br.gov.sp.fazenda.dsen.ws.consulta.NfeDadosMsg
 */
package br.gov.sp.fazenda.dsen.ws.consulta;

import br.gov.sp.fazenda.dsen.ws.consulta.NfeConsultaNF2Result;
import br.gov.sp.fazenda.dsen.ws.consulta.NfeDadosMsg;
import java.rmi.Remote;
import java.rmi.RemoteException;
import org.w3c.dom.Element;

public interface NfeConsulta2Soap
extends Remote {
    public NfeConsultaNF2Result nfeConsultaNF2(Element var1, NfeDadosMsg var2) throws RemoteException;
}

