/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.mozilla.universalchardet.Constants
 *  org.mozilla.universalchardet.prober.statemachine.ISO2022CNSMModel
 *  org.mozilla.universalchardet.prober.statemachine.PkgInt
 *  org.mozilla.universalchardet.prober.statemachine.SMModel
 */
package org.mozilla.universalchardet.prober.statemachine;

import org.mozilla.universalchardet.Constants;
import org.mozilla.universalchardet.prober.statemachine.PkgInt;
import org.mozilla.universalchardet.prober.statemachine.SMModel;

public class ISO2022CNSMModel
extends SMModel {
    public static final int ISO2022CN_CLASS_FACTOR = 9;
    private static int[] a = new int[]{PkgInt.pack4bits((int)2, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0), PkgInt.pack4bits((int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0), PkgInt.pack4bits((int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0), PkgInt.pack4bits((int)0, (int)0, (int)0, (int)1, (int)0, (int)0, (int)0, (int)0), PkgInt.pack4bits((int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0), PkgInt.pack4bits((int)0, (int)3, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0), PkgInt.pack4bits((int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0), PkgInt.pack4bits((int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0), PkgInt.pack4bits((int)0, (int)0, (int)0, (int)4, (int)0, (int)0, (int)0, (int)0), PkgInt.pack4bits((int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0), PkgInt.pack4bits((int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0), PkgInt.pack4bits((int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0), PkgInt.pack4bits((int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0), PkgInt.pack4bits((int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0), PkgInt.pack4bits((int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0), PkgInt.pack4bits((int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0, (int)0), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2)};
    private static int[] b = new int[]{PkgInt.pack4bits((int)0, (int)3, (int)1, (int)0, (int)0, (int)0, (int)0, (int)0), PkgInt.pack4bits((int)0, (int)1, (int)1, (int)1, (int)1, (int)1, (int)1, (int)1), PkgInt.pack4bits((int)1, (int)1, (int)2, (int)2, (int)2, (int)2, (int)2, (int)2), PkgInt.pack4bits((int)2, (int)2, (int)2, (int)1, (int)1, (int)1, (int)4, (int)1), PkgInt.pack4bits((int)1, (int)1, (int)1, (int)2, (int)1, (int)1, (int)1, (int)1), PkgInt.pack4bits((int)5, (int)6, (int)1, (int)1, (int)1, (int)1, (int)1, (int)1), PkgInt.pack4bits((int)1, (int)1, (int)1, (int)2, (int)1, (int)1, (int)1, (int)1), PkgInt.pack4bits((int)1, (int)1, (int)1, (int)1, (int)1, (int)2, (int)1, (int)0)};
    private static int[] c = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};

    public ISO2022CNSMModel() {
        super(new PkgInt(3, 7, 2, 15, a), 9, new PkgInt(3, 7, 2, 15, b), c, Constants.CHARSET_ISO_2022_CN);
    }
}

