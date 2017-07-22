/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum
 *  br.gov.sp.fazenda.dsge.common.enumeration.ServicoSefazEnumItf
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

import br.gov.sp.fazenda.dsge.common.enumeration.ServicoSefazEnumItf;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum ServicoSefazEnum implements ServicoSefazEnumItf
{
    Recepcao("NfeAutorizacao", "Recep\u00e7\u00e3o de NF-e"),
    RetRecepcao("NfeRetAutorizacao", "Busca Retorno"),
    Cancelamento("NfeCancelamento2", "Cancelamento"),
    Inutilizacao("NfeInutilizacao2", "Inutiliza\u00e7\u00e3o"),
    StatusServico("NfeStatusServico2", "Status Servi\u00e7o"),
    ConsultaNf("NfeConsulta2", "Consulta Nf-e"),
    EnvioDpec("sceRecepcaoRFB", "Envio DPEC"),
    ConsultaDpec("sceConsultaRFB", "Consulta DPEC"),
    ConsultaCadastro("CadConsultaCadastro2", "Consulta Cadastro"),
    RecepcaoEvento("RecepcaoEvento", "Recep\u00e7\u00e3o de Evento"),
    Autorizacao("NfeAutorizacao", "Autoriza\u00e7\u00e3o de NF-e"),
    RetAutorizacao("NfeRetAutorizacao", "Busca Retorno");
    
    private String a;
    private String b;

    private ServicoSefazEnum(String url, String descricao) {
        this.setNomeServico(url);
        this.setDescricao(descricao);
    }

    public String getNomeServico() {
        return this.a;
    }

    public void setNomeServico(String tag) {
        this.a = tag;
    }

    public void setDescricao(String descricao) {
        this.b = descricao;
    }

    public String getDescricao() {
        return this.b;
    }
}

