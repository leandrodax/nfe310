/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;

public enum AppContextEnum implements EnumItf
{
    EMITENTE,
    CLIENTE,
    BUSCA_RETORNO_SEFAZ,
    ALL,
    STATUS,
    PARAMETRO_PROXY_SERVIDOR,
    PARAMETRO_PORTA_PROXY,
    PARAMETRO_USUARIO_PROXY,
    PARAMETRO_SENHA_PROXY,
    PARAMETRO_INTERV_TENT_TRANSM,
    PARAMETRO_INTERV_CONS_PROC_PEND,
    PARAMETRO_NUM_REG_POR_PAG_CONSULTA,
    PARAMETRO_AVISO_INUTILIZACAO_APENAS_MENSAL,
    PARAMETRO_DPEC_GERADO_DIR,
    PARAMETRO_DPEC_AUTORIZADO_DIR,
    IMPORTACAO_ACAO_DUPLICIDADE_REGISTRO,
    IMPORTACAO_ACAO_ASSINATURA_INVALIDA,
    IMPORTACAO_ACAO_TIPO_AMBIENTE_INVALIDO,
    IMPORTACAO_ACAO_VERPROC_DIFERENTE,
    IMPORTACAO_ACAO_PROCEMI_DIFERENTE,
    IMPORTACAO_ACAO_CPAIS_EMITENTE_DIFERENTE,
    IMPORTACAO_ACAO_CUF_NOTA_DIFERENTE,
    ERRO_XML_RETORNO_ACAO,
    PROBLEMA_CONEXAO_ACAO,
    PARAMETRO_SENHA_A3,
    PARAMETRO_BUSCA_A3_PAUSADO,
    IMPORTACAO_QTDE_ARQUIVOS_XML_MAIORES_LIMITE,
    IMPORTACAO_QTDE_ARQUIVOS_TXT_MAIORES_LIMITE;
    

    private AppContextEnum() {
    }
}

