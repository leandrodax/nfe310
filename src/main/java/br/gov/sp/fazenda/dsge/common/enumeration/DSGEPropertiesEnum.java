/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.enumeration.DSGEPropertiesEnum
 */
package br.gov.sp.fazenda.dsge.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum DSGEPropertiesEnum {
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
    VERSAO_SCHEMA_CANCELAMENTO("versao.schema.cancelamento"),
    VERSAO_SCHEMA_CONS_SITUACAO("versao.schema.consSituacao"),
    VERSAO_SCHEMA_CONS_STAT_SERV("versao.schema.consStatServ"),
    VERSAO_SCHEMA_INUTILIZACAO("versao.schema.inutilizacao"),
    VERSAO_SCHEMA("versao.schema"),
    VERSAO_SCHEMA_SISTEMA("versao.schema.sistema"),
    VERSAO_SCHEMA_CONS_CAD("versao.schema.consCad");
    
    private String a;

    private DSGEPropertiesEnum(String key) {
        this.a = key;
    }

    public String toString() {
        return this.a;
    }
}

