/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.ChainValidator
 */
package br.gov.sp.fazenda.dsge.brazilutils.uf.ie;

public interface ChainValidator {
    public void addValidator(ChainValidator var1);

    public boolean validate(String var1);
}

