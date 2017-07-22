/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.mozilla.universalchardet.prober.CharsetProber
 *  org.mozilla.universalchardet.prober.CharsetProber$ProbingState
 *  org.mozilla.universalchardet.prober.SingleByteCharsetProber
 *  org.mozilla.universalchardet.prober.sequence.SequenceModel
 */
package org.mozilla.universalchardet.prober;

import org.mozilla.universalchardet.prober.CharsetProber;
import org.mozilla.universalchardet.prober.sequence.SequenceModel;

public class SingleByteCharsetProber
extends CharsetProber {
    public static final int SAMPLE_SIZE = 64;
    public static final int SB_ENOUGH_REL_THRESHOLD = 1024;
    public static final float POSITIVE_SHORTCUT_THRESHOLD = 0.95f;
    public static final float NEGATIVE_SHORTCUT_THRESHOLD = 0.05f;
    public static final int SYMBOL_CAT_ORDER = 250;
    public static final int NUMBER_OF_SEQ_CAT = 4;
    public static final int POSITIVE_CAT = 3;
    public static final int NEGATIVE_CAT = 0;
    private CharsetProber.ProbingState a;
    private SequenceModel a;
    private boolean a;
    private short a;
    private int a;
    private int[] a;
    private int b;
    private int c;
    private CharsetProber a;

    public SingleByteCharsetProber(SequenceModel model) {
        this.a = model;
        this.a = false;
        this.a = null;
        this.a = new int[4];
        this.reset();
    }

    public SingleByteCharsetProber(SequenceModel model, boolean reversed, CharsetProber nameProber) {
        this.a = model;
        this.a = reversed;
        this.a = nameProber;
        this.a = new int[4];
        this.reset();
    }

    boolean a() {
        return this.a.getKeepEnglishLetter();
    }

    public String getCharSetName() {
        if (this.a == null) {
            return this.a.getCharsetName();
        }
        return this.a.getCharSetName();
    }

    public float getConfidence() {
        if (this.a > 0) {
            float r = 1.0f * (float)this.a[3] / (float)this.a / this.a.getTypicalPositiveRatio();
            if ((r = r * (float)this.c / (float)this.b) >= 1.0f) {
                r = 0.99f;
            }
            return r;
        }
        return 0.01f;
    }

    public CharsetProber.ProbingState getState() {
        return this.a;
    }

    public CharsetProber.ProbingState handleData(byte[] buf, int offset, int length) {
        int maxPos = offset + length;
        for (int i = offset; i < maxPos; ++i) {
            short order = this.a.getOrder(buf[i]);
            if (order < 250) {
                ++this.b;
            }
            if (order < 64) {
                ++this.c;
                if (this.a < 64) {
                    ++this.a;
                    if (!this.a) {
                        int[] arrn = this.a;
                        byte by = this.a.getPrecedence(this.a * 64 + order);
                        arrn[by] = arrn[by] + 1;
                    } else {
                        int[] arrn = this.a;
                        byte by = this.a.getPrecedence(order * 64 + this.a);
                        arrn[by] = arrn[by] + 1;
                    }
                }
            }
            this.a = order;
        }
        if (this.a == CharsetProber.ProbingState.DETECTING && this.a > 1024) {
            float cf = this.getConfidence();
            if (cf > 0.95f) {
                this.a = CharsetProber.ProbingState.FOUND_IT;
            } else if (cf < 0.05f) {
                this.a = CharsetProber.ProbingState.NOT_ME;
            }
        }
        return this.a;
    }

    public void reset() {
        this.a = CharsetProber.ProbingState.DETECTING;
        this.a = 255;
        for (int i = 0; i < 4; ++i) {
            this.a[i] = 0;
        }
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public void setOption() {
    }
}

