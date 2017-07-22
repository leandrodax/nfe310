/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.mozilla.universalchardet.prober.statemachine.PkgInt
 *  org.mozilla.universalchardet.prober.statemachine.SMModel
 */
package org.mozilla.universalchardet.prober.statemachine;

import org.mozilla.universalchardet.prober.statemachine.PkgInt;

public abstract class SMModel {
    public static final int START = 0;
    public static final int ERROR = 1;
    public static final int ITSME = 2;
    protected PkgInt classTable;
    protected int classFactor;
    protected PkgInt stateTable;
    protected int[] charLenTable;
    protected String name;

    public SMModel(PkgInt classTable, int classFactor, PkgInt stateTable, int[] charLenTable, String name) {
        this.classTable = classTable;
        this.classFactor = classFactor;
        this.stateTable = stateTable;
        this.charLenTable = charLenTable;
        this.name = name;
    }

    public int getClass(byte b) {
        int c = b & 255;
        return this.classTable.unpack(c);
    }

    public int getNextState(int cls, int currentState) {
        return this.stateTable.unpack(currentState * this.classFactor + cls);
    }

    public int getCharLen(int cls) {
        return this.charLenTable[cls];
    }

    public String getName() {
        return this.name;
    }
}

