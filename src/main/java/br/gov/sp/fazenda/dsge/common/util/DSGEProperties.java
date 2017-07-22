/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.enumeration.DSGEPropertiesEnum
 *  br.gov.sp.fazenda.dsge.common.util.DSGEProperties
 */
package br.gov.sp.fazenda.dsge.common.util;

import br.gov.sp.fazenda.dsge.common.enumeration.DSGEPropertiesEnum;
import java.text.MessageFormat;
import java.util.ResourceBundle;

public abstract class DSGEProperties {
    protected abstract ResourceBundle getProperties();

    public final String getAplicativoTipoAmbiente() {
        return this.getProperties().getString(DSGEPropertiesEnum.APLICATIVO_TIPO_AMBIENTE.toString());
    }

    public final String getAplicativoVersao() {
        return this.getProperties().getString(DSGEPropertiesEnum.APLICATIVO_VERSAO.toString());
    }

    public final String getAplicativoData() {
        return this.getProperties().getString(DSGEPropertiesEnum.APLICATIVO_DATA.toString());
    }

    public final String getAplicativoLabelAviso() {
        return this.getProperties().getString(DSGEPropertiesEnum.APLICATIVO_LABEL_AVISO.toString());
    }

    public final String getAplicativoLabelVersaoTeste() {
        return this.getProperties().getString(DSGEPropertiesEnum.APLICATIVO_LABEL_VERSAO_TESTE.toString());
    }

    public final String getArquivoSefazUrl() {
        return this.getProperties().getString(DSGEPropertiesEnum.ARQUIVO_SEFAZURL.toString());
    }

    public final String getArquivoTrustStore() {
        return this.getProperties().getString(DSGEPropertiesEnum.ARQUIVO_TRUSTSTORE.toString());
    }

    public final String getArquivoDatabaseName() {
        return this.getProperties().getString(DSGEPropertiesEnum.ARQUIVO_DATABASE_NAME.toString());
    }

    public final String getArquivoDatabaseProperties() {
        return this.getProperties().getString(DSGEPropertiesEnum.ARQUIVO_DATABASE_PROPERTIES.toString());
    }

    public final String getArquivoUF() {
        return this.getProperties().getString(DSGEPropertiesEnum.ARQUIVO_UF.toString());
    }

    public final String getAplicativoWindowTitle() {
        return MessageFormat.format(this.getProperties().getString(DSGEPropertiesEnum.APLICATIVO_WINDOW_TITLE.toString()), this.getAplicativoVersao());
    }

    public final String getAplicativoRelatorioMsg() {
        return this.getProperties().getString(DSGEPropertiesEnum.APLICATIVO_RELATORIO_MSG.toString());
    }

    public final String getVersaoSchemaCancelamento() {
        return this.getProperties().getString(DSGEPropertiesEnum.VERSAO_SCHEMA_CANCELAMENTO.toString());
    }

    public final String getVersaoSchemaCabecalho() {
        return this.getProperties().getString(DSGEPropertiesEnum.VERSAO_SCHEMA_CABEC_MSG.toString());
    }

    public final String getVersaoSchemaConsultaSituacao() {
        return this.getProperties().getString(DSGEPropertiesEnum.VERSAO_SCHEMA_CONS_SITUACAO.toString());
    }

    public final String getVersaoSchemaStatusServico() {
        return this.getProperties().getString(DSGEPropertiesEnum.VERSAO_SCHEMA_CONS_STAT_SERV.toString());
    }

    public final String getVersaoSchemaInutilizacao() {
        return this.getProperties().getString(DSGEPropertiesEnum.VERSAO_SCHEMA_INUTILIZACAO.toString());
    }

    public final String getVersaoSchema() {
        return this.getProperties().getString(DSGEPropertiesEnum.VERSAO_SCHEMA.toString());
    }

    public final String getVersaoSchemaSistema() {
        return this.getProperties().getString(DSGEPropertiesEnum.VERSAO_SCHEMA_SISTEMA.toString());
    }

    public final String getVersaoSchemaConsultaCadastro() {
        return this.getProperties().getString(DSGEPropertiesEnum.VERSAO_SCHEMA_CONS_CAD.toString());
    }
}

