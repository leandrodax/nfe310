/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.mozilla.universalchardet.Constants
 *  org.mozilla.universalchardet.prober.CharsetProber
 *  org.mozilla.universalchardet.prober.CharsetProber$ProbingState
 *  org.mozilla.universalchardet.prober.Latin1Prober
 */
package org.mozilla.universalchardet.prober;

import java.nio.ByteBuffer;
import org.mozilla.universalchardet.Constants;
import org.mozilla.universalchardet.prober.CharsetProber;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Latin1Prober
extends CharsetProber {
    public static final byte UDF = 0;
    public static final byte OTH = 1;
    public static final byte ASC = 2;
    public static final byte ASS = 3;
    public static final byte ACV = 4;
    public static final byte ACO = 5;
    public static final byte ASV = 6;
    public static final byte ASO = 7;
    public static final int CLASS_NUM = 8;
    public static final int FREQ_CAT_NUM = 4;
    private CharsetProber.ProbingState a;
    private byte a;
    private int[] a = new int[4];
    private static final byte[] a = new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 0, 1, 7, 1, 1, 1, 1, 1, 1, 5, 1, 5, 0, 5, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 7, 1, 7, 0, 7, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 4, 4, 4, 5, 5, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 4, 4, 4, 4, 4, 1, 4, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 6, 6, 6, 6, 6, 1, 6, 6, 6, 6, 6, 7, 7, 7};
    private static final byte[] b = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 3, 3, 1, 1, 3, 3, 0, 3, 3, 3, 1, 2, 1, 2, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 1, 3, 1, 1, 1, 3, 0, 3, 1, 3, 1, 1, 3, 3};

    public Latin1Prober() {
        this.reset();
    }

    public String getCharSetName() {
        return Constants.CHARSET_WINDOWS_1252;
    }

    public float getConfidence() {
        float confidence;
        if (this.a == CharsetProber.ProbingState.NOT_ME) {
            return 0.01f;
        }
        int total = 0;
        for (int i = 0; i < this.a.length; ++i) {
            total += this.a[i];
        }
        if (total <= 0) {
            confidence = 0.0f;
        } else {
            confidence = (float)this.a[3] * 1.0f / (float)total;
            confidence -= (float)this.a[1] * 20.0f / (float)total;
        }
        if (confidence < 0.0f) {
            confidence = 0.0f;
        }
        return confidence *= 0.5f;
    }

    public CharsetProber.ProbingState getState() {
        return this.a;
    }

    public CharsetProber.ProbingState handleData(byte[] buf, int offset, int length) {
        ByteBuffer newBufTmp = this.filterWithEnglishLetters(buf, offset, length);
        byte[] newBuf = newBufTmp.array();
        int newBufLen = newBufTmp.position();
        for (int i = 0; i < newBufLen; ++i) {
            int c = newBuf[i] & 255;
            byte charClass = a[c];
            byte freq = b[this.a * 8 + charClass];
            if (freq == 0) {
                this.a = CharsetProber.ProbingState.NOT_ME;
                break;
            }
            int[] arrn = this.a;
            byte by = freq;
            arrn[by] = arrn[by] + 1;
            this.a = charClass;
        }
        return this.a;
    }

    public void reset() {
        this.a = CharsetProber.ProbingState.DETECTING;
        this.a = 1;
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i] = 0;
        }
    }

    public void setOption() {
    }
}

