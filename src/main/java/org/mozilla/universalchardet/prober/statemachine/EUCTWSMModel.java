/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.mozilla.universalchardet.Constants
 *  org.mozilla.universalchardet.prober.statemachine.EUCTWSMModel
 *  org.mozilla.universalchardet.prober.statemachine.PkgInt
 *  org.mozilla.universalchardet.prober.statemachine.SMModel
 */
package org.mozilla.universalchardet.prober.statemachine;

import org.mozilla.universalchardet.Constants;
import org.mozilla.universalchardet.prober.statemachine.PkgInt;
import org.mozilla.universalchardet.prober.statemachine.SMModel;

public class EUCTWSMModel
extends SMModel {
    public static final int EUCTW_CLASS_FACTOR = 7;
    private static int[] a = new int[]{PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)0, (int)0), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)0, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0), PkgInt.pack4bits((int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)6, (int)0), PkgInt.pack4bits((int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0), PkgInt.pack4bits((int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0), PkgInt.pack4bits((int)0, (int)3, (int)4, (int)4, (int)4, (int)4, (int)4, (int)4), PkgInt.pack4bits((int)5, (int)5, (int)1, (int)1, (int)1, (int)1, (int)1, (int)1), PkgInt.pack4bits((int)1, (int)1, (int)1, (int)1, (int)1, (int)1, (int)1, (int)1), PkgInt.pack4bits((int)1, (int)1, (int)1, (int)1, (int)1, (int)1, (int)1, (int)1), PkgInt.pack4bits((int)1, (int)1, (int)3, (int)1, (int)3, (int)3, (int)3, (int)3), PkgInt.pack4bits((int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3), PkgInt.pack4bits((int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3), PkgInt.pack4bits((int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3), PkgInt.pack4bits((int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3), PkgInt.pack4bits((int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3), PkgInt.pack4bits((int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3), PkgInt.pack4bits((int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)0)};
    private static int[] b = new int[]{PkgInt.pack4bits((int)1, (int)1, (int)0, (int)3, (int)3, (int)3, (int)4, (int)1), PkgInt.pack4bits((int)1, (int)1, (int)1, (int)1, (int)1, (int)1, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)1, (int)0, (int)1), PkgInt.pack4bits((int)0, (int)0, (int)0, (int)1, (int)1, (int)1, (int)1, (int)1), PkgInt.pack4bits((int)5, (int)1, (int)1, (int)1, (int)0, (int)1, (int)0, (int)0), PkgInt.pack4bits((int)0, (int)1, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0)};
    private static int[] c = new int[]{0, 0, 1, 2, 2, 2, 3};

    public EUCTWSMModel() {
        super(new PkgInt(3, 7, 2, 15, a), 7, new PkgInt(3, 7, 2, 15, b), c, Constants.CHARSET_EUC_TW);
    }
}

