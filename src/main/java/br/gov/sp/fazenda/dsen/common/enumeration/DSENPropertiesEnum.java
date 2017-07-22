/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.DSENPropertiesEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum DSENPropertiesEnum {
    APLICATIVO_TIPO_AMBIENTE("aplicativo.tipo.ambiente"),
    APLICATIVO_VERSAO("aplicativo.versao"),
    APLICATIVO_LABEL_VERSAO_TESTE("aplicativo.label.versao.teste"),
    APLICATIVO_DATA("aplicativo.data"),
    APLICATIVO_LABEL_AVISO("aplicativo.label.aviso"),
    APLICATIVO_WINDOW_TITLE("aplicativo.window.title"),
    ARQUIVO_SEFAZURL("arquivo.sefazURL"),
    ARQUIVO_TRUSTSTORE("arquivo.trustStore"),
    ARQUIVO_DATABASE_NAME("arquivo.databaseName"),
    ARQUIVO_DATABASE_PROPERTIES("arquivo.databaseProperties"),
    ARQUIVO_UF("arquivo.uf"),
    APLICATIVO_RELATORIO_MSG("aplicativo.relatorio.msg"),
    VERSAO_SCHEMA_CABEC_MSG("versao.schema.cabecMsg"),
    VERSAO_SCHEMA_CANCELAMENTO_EVENTO("versao.schema.cancelamentoEvento"),
    VERSAO_SCHEMA_CANCELAMENTO("versao.schema.cancelamento"),
    VERSAO_SCHEMA_CONS_SITUACAO("versao.schema.consSituacao"),
    VERSAO_SCHEMA_CONS_STAT_SERV("versao.schema.consStatServ"),
    VERSAO_SCHEMA_INUTILIZACAO("versao.schema.inutilizacao"),
    VERSAO_SCHEMA("versao.schema"),
    VERSAO_SCHEMA_SISTEMA("versao.schema.sistema"),
    VERSAO_SCHEMA_CONS_CAD("versao.schema.consCad"),
    VERSAO_SCHEMA_CONS_RECIBO("versao.schema.consReci"),
    VERSAO_SCHEMA_ENVI_NFE("versao.schema.enviNFe"),
    VERSAO_SCHEMA_DPEC("versao.schema.dpec"),
    DPEC_URL_ENVIO("dpec.url.envio"),
    DPEC_URL_CONSULTA("dpec.url.consulta"),
    REPORT_CONFIG_PATH("report.config.path"),
    VERSAO_SCHEMA_EVENTOS("versao.schema.eventos"),
    VERSAO_SCHEMA_CARTA_CORRECAO("versao.schema.cartaCorrecao");
    
    private String a;

    private DSENPropertiesEnum(String key) {
        this.a = key;
    }

    public String toString() {
        return this.a;
    }
}

