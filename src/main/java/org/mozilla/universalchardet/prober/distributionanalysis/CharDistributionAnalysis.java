/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.mozilla.universalchardet.prober.distributionanalysis.CharDistributionAnalysis
 */
package org.mozilla.universalchardet.prober.distributionanalysis;

public abstract class CharDistributionAnalysis {
    public static final float SURE_NO = 0.01f;
    public static final float SURE_YES = 0.99f;
    public static final int ENOUGH_DATA_THRESHOLD = 1024;
    public static final int MINIMUM_DATA_THRESHOLD = 4;
    private int a;
    private int b;
    protected int[] charToFreqOrder;
    protected float typicalDistributionRatio;
    protected boolean done;

    public CharDistributionAnalysis() {
        this.reset();
    }

    public void handleData(byte[] buf, int offset, int length) {
    }

    public void handleOneChar(byte[] buf, int offset, int charLength) {
        int order = -1;
        if (charLength == 2) {
            order = this.getOrder(buf, offset);
        }
        if (order >= 0) {
            ++this.b;
            if (order < this.charToFreqOrder.length && 512 > this.charToFreqOrder[order]) {
                ++this.a;
            }
        }
    }

    public float getConfidence() {
        float r;
        if (this.b <= 0 || this.a <= 4) {
            return 0.01f;
        }
        if (this.b != this.a && (r = (float)(this.a / (this.b - this.a)) * this.typicalDistributionRatio) < 0.99f) {
            return r;
        }
        return 0.99f;
    }

    public void reset() {
        this.done = false;
        this.b = 0;
        this.a = 0;
    }

    public void setOption() {
    }

    public boolean gotEnoughData() {
        return this.b > 1024;
    }

    protected abstract int getOrder(byte[] var1, int var2);
}

