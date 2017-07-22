/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.enumeration.QuestionEnum
 */
package br.gov.sp.fazenda.dsge.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum QuestionEnum {
    YES_NO(Integer.valueOf(0)),
    YES_NO_CANCEL(Integer.valueOf(1));
    
    private Integer a;

    public Integer getValue() {
        return this.a;
    }

    public void setValue(Integer value) {
        this.a = value;
    }

    private QuestionEnum(Integer value) {
        this.setValue(value);
    }
}

