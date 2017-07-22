/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.mozilla.universalchardet.prober.sequence.SequenceModel
 */
package org.mozilla.universalchardet.prober.sequence;

public abstract class SequenceModel {
    protected short[] charToOrderMap;
    protected byte[] precedenceMatrix;
    protected float typicalPositiveRatio;
    protected boolean keepEnglishLetter;
    protected String charsetName;

    public SequenceModel(short[] charToOrderMap, byte[] precedenceMatrix, float typicalPositiveRatio, boolean keepEnglishLetter, String charsetName) {
        this.charToOrderMap = charToOrderMap;
        this.precedenceMatrix = precedenceMatrix;
        this.typicalPositiveRatio = typicalPositiveRatio;
        this.keepEnglishLetter = keepEnglishLetter;
        this.charsetName = charsetName;
    }

    public short getOrder(byte b) {
        int c = b & 255;
        return this.charToOrderMap[c];
    }

    public byte getPrecedence(int pos) {
        return this.precedenceMatrix[pos];
    }

    public float getTypicalPositiveRatio() {
        return this.typicalPositiveRatio;
    }

    public boolean getKeepEnglishLetter() {
        return this.keepEnglishLetter;
    }

    public String getCharsetName() {
        return this.charsetName;
    }
}

