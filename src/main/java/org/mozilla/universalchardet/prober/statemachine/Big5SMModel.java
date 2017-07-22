/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.mozilla.universalchardet.Constants
 *  org.mozilla.universalchardet.prober.statemachine.Big5SMModel
 *  org.mozilla.universalchardet.prober.statemachine.PkgInt
 *  org.mozilla.universalchardet.prober.statemachine.SMModel
 */
package org.mozilla.universalchardet.prober.statemachine;

import org.mozilla.universalchardet.Constants;
import org.mozilla.universalchardet.prober.statemachine.PkgInt;
import org.mozilla.universalchardet.prober.statemachine.SMModel;

public class Big5SMModel
extends SMModel {
    public static final int BIG5_CLASS_FACTOR = 5;
    private static int[] a = new int[]{PkgInt.pack4bits((int)1, (int)1, (int)1, (int)1, (int)1, (int)1, (int)1, (int)1), PkgInt.pack4bits((int)1, (int)1, (int)1, (int)1, (int)1, (int)1, (int)0, (int)0), PkgInt.pack4bits((int)1, (int)1, (int)1, (int)1, (int)1, (int)1, (int)1, (int)1), PkgInt.pack4bits((int)1, (int)1, (int)1, (int)0, (int)1, (int)1, (int)1, (int)1), PkgInt.pack4bits((int)1, (int)1, (int)1, (int)1, (int)1, (int)1, (int)1, (int)1), PkgInt.pack4bits((int)1, (int)1, (int)1, (int)1, (int)1, (int)1, (int)1, (int)1), PkgInt.pack4bits((int)1, (int)1, (int)1, (int)1, (int)1, (int)1, (int)1, (int)1), PkgInt.pack4bits((int)1, (int)1, (int)1, (int)1, (int)1, (int)1, (int)1, (int)1), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)1), PkgInt.pack4bits((int)4, (int)4, (int)4, (int)4, (int)4, (int)4, (int)4, (int)4), PkgInt.pack4bits((int)4, (int)4, (int)4, (int)4, (int)4, (int)4, (int)4, (int)4), PkgInt.pack4bits((int)4, (int)4, (int)4, (int)4, (int)4, (int)4, (int)4, (int)4), PkgInt.pack4bits((int)4, (int)4, (int)4, (int)4, (int)4, (int)4, (int)4, (int)4), PkgInt.pack4bits((int)4, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3), PkgInt.pack4bits((int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3), PkgInt.pack4bits((int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3), PkgInt.pack4bits((int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3), PkgInt.pack4bits((int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3), PkgInt.pack4bits((int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3), PkgInt.pack4bits((int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3), PkgInt.pack4bits((int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3), PkgInt.pack4bits((int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3), PkgInt.pack4bits((int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3), PkgInt.pack4bits((int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3), PkgInt.pack4bits((int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)3, (int)0)};
    private static int[] b = new int[]{PkgInt.pack4bits((int)1, (int)0, (int)0, (int)3, (int)1, (int)1, (int)1, (int)1), PkgInt.pack4bits((int)1, (int)1, (int)2, (int)2, (int)2, (int)2, (int)2, (int)1), PkgInt.pack4bits((int)1, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0)};
    private static int[] c = new int[]{0, 1, 1, 2, 0};

    public Big5SMModel() {
        super(new PkgInt(3, 7, 2, 15, a), 5, new PkgInt(3, 7, 2, 15, b), c, Constants.CHARSET_BIG5);
    }
}

