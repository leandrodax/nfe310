/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.mozilla.universalchardet.Constants
 *  org.mozilla.universalchardet.prober.CharsetProber
 *  org.mozilla.universalchardet.prober.CharsetProber$ProbingState
 *  org.mozilla.universalchardet.prober.HebrewProber
 */
package org.mozilla.universalchardet.prober;

import org.mozilla.universalchardet.Constants;
import org.mozilla.universalchardet.prober.CharsetProber;

/*
 * Exception performing whole class analysis ignored.
 */
public class HebrewProber
extends CharsetProber {
    public static final int FINAL_KAF = 234;
    public static final int NORMAL_KAF = 235;
    public static final int FINAL_MEM = 237;
    public static final int NORMAL_MEM = 238;
    public static final int FINAL_NUN = 239;
    public static final int NORMAL_NUN = 240;
    public static final int FINAL_PE = 243;
    public static final int NORMAL_PE = 244;
    public static final int FINAL_TSADI = 245;
    public static final int NORMAL_TSADI = 246;
    public static final byte SPACE = 32;
    public static final int MIN_FINAL_CHAR_DISTANCE = 5;
    public static final float MIN_MODEL_DISTANCE = 0.01f;
    private int a;
    private int b;
    private byte a;
    private byte b;
    private CharsetProber a = null;
    private CharsetProber b = null;

    public HebrewProber() {
        this.reset();
    }

    public void setModalProbers(CharsetProber logicalProber, CharsetProber visualProber) {
        this.a = logicalProber;
        this.b = visualProber;
    }

    public String getCharSetName() {
        int finalsub = this.a - this.b;
        if (finalsub >= 5) {
            return Constants.CHARSET_WINDOWS_1255;
        }
        if (finalsub <= -5) {
            return Constants.CHARSET_ISO_8859_8;
        }
        float modelsub = this.a.getConfidence() - this.b.getConfidence();
        if (modelsub > 0.01f) {
            return Constants.CHARSET_WINDOWS_1255;
        }
        if (modelsub < -0.01f) {
            return Constants.CHARSET_ISO_8859_8;
        }
        if (finalsub < 0) {
            return Constants.CHARSET_ISO_8859_8;
        }
        return Constants.CHARSET_WINDOWS_1255;
    }

    public float getConfidence() {
        return 0.0f;
    }

    public CharsetProber.ProbingState getState() {
        if (this.a.getState() == CharsetProber.ProbingState.NOT_ME && this.b.getState() == CharsetProber.ProbingState.NOT_ME) {
            return CharsetProber.ProbingState.NOT_ME;
        }
        return CharsetProber.ProbingState.DETECTING;
    }

    public CharsetProber.ProbingState handleData(byte[] buf, int offset, int length) {
        if (this.getState() == CharsetProber.ProbingState.NOT_ME) {
            return CharsetProber.ProbingState.NOT_ME;
        }
        int maxPos = offset + length;
        for (int i = offset; i < maxPos; ++i) {
            byte c = buf[i];
            if (c == 32) {
                if (this.b != 32) {
                    if (HebrewProber.isFinal((byte)this.a)) {
                        ++this.a;
                    } else if (HebrewProber.isNonFinal((byte)this.a)) {
                        ++this.b;
                    }
                }
            } else if (this.b == 32 && HebrewProber.isFinal((byte)this.a) && c != 32) {
                ++this.b;
            }
            this.b = this.a;
            this.a = c;
        }
        return CharsetProber.ProbingState.DETECTING;
    }

    public void reset() {
        this.a = 0;
        this.b = 0;
        this.a = 32;
        this.b = 32;
    }

    public void setOption() {
    }

    protected static boolean isFinal(byte b) {
        int c = b & 255;
        return c == 234 || c == 237 || c == 239 || c == 243 || c == 245;
    }

    protected static boolean isNonFinal(byte b) {
        int c = b & 255;
        return c == 235 || c == 238 || c == 240 || c == 244;
    }
}

