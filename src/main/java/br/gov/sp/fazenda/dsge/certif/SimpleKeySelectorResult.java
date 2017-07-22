/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.certif.SimpleKeySelectorResult
 */
package br.gov.sp.fazenda.dsge.certif;

import java.security.Key;
import java.security.PublicKey;
import javax.xml.crypto.KeySelectorResult;

public class SimpleKeySelectorResult
implements KeySelectorResult {
    private PublicKey a;

    SimpleKeySelectorResult(PublicKey pk) {
        this.a = pk;
    }

    @Override
    public Key getKey() {
        return this.a;
    }
}

