/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ModeloNotaProdutorEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public enum ModeloNotaProdutorEnum {
    NF_01("01", "01"),
    NF_04("04", "04");
    
    private String a;
    private String b;

    private ModeloNotaProdutorEnum(String codigo, String descricao) {
        this.a = codigo;
        this.b = descricao;
    }

    public String getCodigo() {
        return this.a;
    }

    public String getDescricao() {
        return this.b;
    }

    public String toString() {
        return this.getDescricao();
    }

    public static ModeloNotaProdutorEnum getEnumPeloCodigo(String string) {
        for (ModeloNotaProdutorEnum e : ModeloNotaProdutorEnum.values()) {
            if (!e.getCodigo().equals(string)) continue;
            return e;
        }
        return null;
    }

    static {
    }
}

