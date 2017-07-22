/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacao
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacaoSoap
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.ServiceException
 */
package br.gov.sp.fazenda.dsen.ws.autorizacao.retorno;

import br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacaoSoap;
import java.net.URL;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface NfeRetAutorizacao
extends Service {
    public String getNfeRetAutorizacaoSoapAddress();

    public NfeRetAutorizacaoSoap getNfeRetAutorizacaoSoap() throws ServiceException;

    public NfeRetAutorizacaoSoap getNfeRetAutorizacaoSoap(URL var1) throws ServiceException;
}

