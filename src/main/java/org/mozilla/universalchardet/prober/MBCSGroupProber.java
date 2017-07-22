/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.mozilla.universalchardet.prober.Big5Prober
 *  org.mozilla.universalchardet.prober.CharsetProber
 *  org.mozilla.universalchardet.prober.CharsetProber$ProbingState
 *  org.mozilla.universalchardet.prober.EUCJPProber
 *  org.mozilla.universalchardet.prober.EUCKRProber
 *  org.mozilla.universalchardet.prober.EUCTWProber
 *  org.mozilla.universalchardet.prober.GB18030Prober
 *  org.mozilla.universalchardet.prober.MBCSGroupProber
 *  org.mozilla.universalchardet.prober.SJISProber
 *  org.mozilla.universalchardet.prober.UTF8Prober
 */
package org.mozilla.universalchardet.prober;

import org.mozilla.universalchardet.prober.Big5Prober;
import org.mozilla.universalchardet.prober.CharsetProber;
import org.mozilla.universalchardet.prober.EUCJPProber;
import org.mozilla.universalchardet.prober.EUCKRProber;
import org.mozilla.universalchardet.prober.EUCTWProber;
import org.mozilla.universalchardet.prober.GB18030Prober;
import org.mozilla.universalchardet.prober.SJISProber;
import org.mozilla.universalchardet.prober.UTF8Prober;

public class MBCSGroupProber
extends CharsetProber {
    private CharsetProber.ProbingState a;
    private CharsetProber[] a;
    private boolean[] a;
    private int a = new boolean[7];
    private int b;

    public MBCSGroupProber() {
        this.a[0] = new UTF8Prober();
        this.a[1] = new SJISProber();
        this.a[2] = new EUCJPProber();
        this.a[3] = new GB18030Prober();
        this.a[4] = new EUCKRProber();
        this.a[5] = new Big5Prober();
        this.a[6] = new EUCTWProber();
        this.reset();
    }

    public String getCharSetName() {
        if (this.a == -1) {
            this.getConfidence();
            if (this.a == -1) {
                this.a = 0;
            }
        }
        return this.a[this.a].getCharSetName();
    }

    public float getConfidence() {
        float bestConf = 0.0f;
        if (this.a == CharsetProber.ProbingState.FOUND_IT) {
            return 0.99f;
        }
        if (this.a == CharsetProber.ProbingState.NOT_ME) {
            return 0.01f;
        }
        for (int i = 0; i < this.a.length; ++i) {
            float cf;
            if (!this.a[i] || bestConf >= (cf = this.a[i].getConfidence())) continue;
            bestConf = cf;
            this.a = i;
        }
        return bestConf;
    }

    public CharsetProber.ProbingState getState() {
        return this.a;
    }

    public CharsetProber.ProbingState handleData(byte[] buf, int offset, int length) {
        int i;
        boolean keepNext = true;
        byte[] highbyteBuf = new byte[length];
        int highpos = 0;
        int maxPos = offset + length;
        for (i = offset; i < maxPos; ++i) {
            if ((buf[i] & 128) != 0) {
                highbyteBuf[highpos++] = buf[i];
                keepNext = true;
                continue;
            }
            if (!keepNext) continue;
            highbyteBuf[highpos++] = buf[i];
            keepNext = false;
        }
        for (i = 0; i < this.a.length; ++i) {
            if (!this.a[i]) continue;
            CharsetProber.ProbingState st = this.a[i].handleData(highbyteBuf, 0, highpos);
            if (st == CharsetProber.ProbingState.FOUND_IT) {
                this.a = i;
                this.a = CharsetProber.ProbingState.FOUND_IT;
                break;
            }
            if (st != CharsetProber.ProbingState.NOT_ME) continue;
            this.a[i] = false;
            --this.b;
            if (this.b > 0) continue;
            this.a = CharsetProber.ProbingState.NOT_ME;
            break;
        }
        return this.a;
    }

    public void reset() {
        this.b = 0;
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i].reset();
            this.a[i] = true;
            ++this.b;
        }
        this.a = -1;
        this.a = CharsetProber.ProbingState.DETECTING;
    }

    public void setOption() {
    }
}

