/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ParametroEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

import java.io.File;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum ParametroEnum {
    PROXY_SERVIDOR(""),
    PROXY_PORTA(""),
    PROXY_USUARIO(""),
    PROXY_SENHA(""),
    INTERVALO_TRANSMISSAO("60"),
    INTERVALO_CONSULTA("60"),
    NUM_REGISTROS_PAGINA("100"),
    AVISO_INUTILIZACAO("N"),
    DPEC_GERADO_DIR(new File(File.separator + "DPEC" + File.separator + "Gerados").getAbsolutePath()),
    DPEC_AUTORIZADO_DIR(new File(File.separator + "DPEC" + File.separator + "Autorizados").getAbsolutePath());
    
    private String a;

    private ParametroEnum(String defaultValue) {
        this.a = defaultValue;
    }

    public String getDefaultValue() {
        return this.a;
    }
}

