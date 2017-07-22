/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.mozilla.universalchardet.Constants
 *  org.mozilla.universalchardet.prober.CharsetProber
 *  org.mozilla.universalchardet.prober.CharsetProber$ProbingState
 *  org.mozilla.universalchardet.prober.UTF8Prober
 *  org.mozilla.universalchardet.prober.statemachine.CodingStateMachine
 *  org.mozilla.universalchardet.prober.statemachine.SMModel
 *  org.mozilla.universalchardet.prober.statemachine.UTF8SMModel
 */
package org.mozilla.universalchardet.prober;

import org.mozilla.universalchardet.Constants;
import org.mozilla.universalchardet.prober.CharsetProber;
import org.mozilla.universalchardet.prober.statemachine.CodingStateMachine;
import org.mozilla.universalchardet.prober.statemachine.SMModel;
import org.mozilla.universalchardet.prober.statemachine.UTF8SMModel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class UTF8Prober
extends CharsetProber {
    public static final float ONE_CHAR_PROB = 0.5f;
    private CodingStateMachine a;
    private CharsetProber.ProbingState a;
    private int a = new CodingStateMachine(a);
    private static final SMModel a = new UTF8SMModel();

    public UTF8Prober() {
        this.reset();
    }

    public String getCharSetName() {
        return Constants.CHARSET_UTF_8;
    }

    public CharsetProber.ProbingState handleData(byte[] buf, int offset, int length) {
        int maxPos = offset + length;
        for (int i = offset; i < maxPos; ++i) {
            int codingState = this.a.nextState(buf[i]);
            if (codingState == 1) {
                this.a = CharsetProber.ProbingState.NOT_ME;
                break;
            }
            if (codingState == 2) {
                this.a = CharsetProber.ProbingState.FOUND_IT;
                break;
            }
            if (codingState != 0 || this.a.getCurrentCharLen() < 2) continue;
            ++this.a;
        }
        if (this.a == CharsetProber.ProbingState.DETECTING && this.getConfidence() > 0.95f) {
            this.a = CharsetProber.ProbingState.FOUND_IT;
        }
        return this.a;
    }

    public CharsetProber.ProbingState getState() {
        return this.a;
    }

    public void reset() {
        this.a.reset();
        this.a = 0;
        this.a = CharsetProber.ProbingState.DETECTING;
    }

    public float getConfidence() {
        float unlike = 0.99f;
        if (this.a < 6) {
            for (int i = 0; i < this.a; ++i) {
                unlike *= 0.5f;
            }
            return 1.0f - unlike;
        }
        return 0.99f;
    }

    public void setOption() {
    }
}

