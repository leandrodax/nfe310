/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ErroNFeTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import javax.swing.ImageIcon;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ErroNFeTO
extends BaseTO {
    private static final long a = 972847957727968223L;
    private String a;
    private ImageIcon a;
    private String b;
    private String c;
    private String d;
    public static String OCORRENCIA_ERRO = "Erro";
    public static String OCORRENCIA_ALERTA = "Alerta";

    public String getDescricao() {
        return this.b;
    }

    public void setDescricao(String descricao) {
        this.b = descricao;
    }

    public ImageIcon getIcon() {
        return this.a;
    }

    public void setIcon(ImageIcon icon) {
        this.a = icon;
    }

    public String getTipoOcorrencia() {
        return this.a;
    }

    public void setTipoOcorrencia(String tipoOcorrencia) {
        this.a = tipoOcorrencia;
    }

    public void setAba(String aba) {
        this.c = aba;
    }

    public String getAba() {
        return this.c;
    }

    public void setNomeCampo(String nomeCampo) {
        this.d = nomeCampo;
    }

    public String getNomeCampo() {
        return this.d;
    }
}

