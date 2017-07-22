/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ModalidadeFreteEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public enum ModalidadeFreteEnum {
    POR_CONTA_EMITENTE("0", "Por conta do emitente", "0 - Emitente"),
    POR_CONTA_DESTINATARIO("1", "Por conta do destinat\u00e1rio/remetente", "1- Destinat\u00e1rio/Remetente"),
    POR_CONTA_TERCEIROS("2", "Por conta de terceiros", "2 - Terceiros"),
    SEM_FRETE("9", "Sem Frete", "9 - Sem Frete");
    
    private String a;
    private String b;
    private String c;

    private ModalidadeFreteEnum(String codigo, String descricao, String descricaoDanfe) {
        this.a = codigo;
        this.b = descricao;
        this.c = descricaoDanfe;
    }

    public String getDescricao() {
        return this.b;
    }

    public String getDescricaoDanfe() {
        return this.c;
    }

    public String getCodigo() {
        return this.a;
    }

    public String toString() {
        return this.getCodigo() + " - " + this.getDescricao();
    }

    public static ModalidadeFreteEnum getEnumPeloCodigo(String string) {
        for (ModalidadeFreteEnum e : ModalidadeFreteEnum.values()) {
            if (!e.getCodigo().equals(string)) continue;
            return e;
        }
        return null;
    }

    static {
    }
}

