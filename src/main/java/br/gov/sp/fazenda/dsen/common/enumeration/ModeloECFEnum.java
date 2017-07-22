/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ModeloECFEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public enum ModeloECFEnum {
    ECF_2B("2B", "2B"),
    ECF_2C("2C", "2C"),
    ECF_2D("2D", "2D");
    
    private String a;
    private String b;

    private ModeloECFEnum(String codigo, String descricao) {
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

    public static ModeloECFEnum getEnumPeloCodigo(String string) {
        for (ModeloECFEnum e : ModeloECFEnum.values()) {
            if (!e.getCodigo().equals(string)) continue;
            return e;
        }
        return null;
    }

    static {
    }
}

