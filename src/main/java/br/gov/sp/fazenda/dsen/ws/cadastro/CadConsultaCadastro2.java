/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.cadastro.CadConsultaCadastro2
 *  br.gov.sp.fazenda.dsen.ws.cadastro.CadConsultaCadastro2Soap
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.ServiceException
 */
package br.gov.sp.fazenda.dsen.ws.cadastro;

import br.gov.sp.fazenda.dsen.ws.cadastro.CadConsultaCadastro2Soap;
import java.net.URL;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface CadConsultaCadastro2
extends Service {
    public String getCadConsultaCadastro2Soap12Address();

    public CadConsultaCadastro2Soap getCadConsultaCadastro2Soap12() throws ServiceException;

    public CadConsultaCadastro2Soap getCadConsultaCadastro2Soap12(URL var1) throws ServiceException;
}

