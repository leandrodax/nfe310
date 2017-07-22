/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacao
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoSoap
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.ServiceException
 */
package br.gov.sp.fazenda.dsen.ws.autorizacao;

import br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoSoap;
import java.net.URL;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface NfeAutorizacao
extends Service {
    public String getNfeAutorizacaoSoapAddress();

    public NfeAutorizacaoSoap getNfeAutorizacaoSoap() throws ServiceException;

    public NfeAutorizacaoSoap getNfeAutorizacaoSoap(URL var1) throws ServiceException;
}

