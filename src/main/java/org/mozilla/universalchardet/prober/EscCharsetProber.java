/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.mozilla.universalchardet.prober.CharsetProber
 *  org.mozilla.universalchardet.prober.CharsetProber$ProbingState
 *  org.mozilla.universalchardet.prober.EscCharsetProber
 *  org.mozilla.universalchardet.prober.statemachine.CodingStateMachine
 *  org.mozilla.universalchardet.prober.statemachine.HZSMModel
 *  org.mozilla.universalchardet.prober.statemachine.ISO2022CNSMModel
 *  org.mozilla.universalchardet.prober.statemachine.ISO2022JPSMModel
 *  org.mozilla.universalchardet.prober.statemachine.ISO2022KRSMModel
 *  org.mozilla.universalchardet.prober.statemachine.SMModel
 */
package org.mozilla.universalchardet.prober;

import org.mozilla.universalchardet.prober.CharsetProber;
import org.mozilla.universalchardet.prober.statemachine.CodingStateMachine;
import org.mozilla.universalchardet.prober.statemachine.HZSMModel;
import org.mozilla.universalchardet.prober.statemachine.ISO2022CNSMModel;
import org.mozilla.universalchardet.prober.statemachine.ISO2022JPSMModel;
import org.mozilla.universalchardet.prober.statemachine.ISO2022KRSMModel;
import org.mozilla.universalchardet.prober.statemachine.SMModel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class EscCharsetProber
extends CharsetProber {
    private CodingStateMachine[] a;
    private int a;
    private CharsetProber.ProbingState a;
    private String a = new CodingStateMachine[4];
    private static final HZSMModel a = new HZSMModel();
    private static final ISO2022CNSMModel a = new ISO2022CNSMModel();
    private static final ISO2022JPSMModel a = new ISO2022JPSMModel();
    private static final ISO2022KRSMModel a = new ISO2022KRSMModel();

    public EscCharsetProber() {
        this.a[0] = new CodingStateMachine((SMModel)a);
        this.a[1] = new CodingStateMachine((SMModel)a);
        this.a[2] = new CodingStateMachine((SMModel)a);
        this.a[3] = new CodingStateMachine((SMModel)a);
        this.reset();
    }

    public String getCharSetName() {
        return this.a;
    }

    public float getConfidence() {
        return 0.99f;
    }

    public CharsetProber.ProbingState getState() {
        return this.a;
    }

    public CharsetProber.ProbingState handleData(byte[] buf, int offset, int length) {
        int maxPos = offset + length;
        for (int i = offset; i < maxPos && this.a == CharsetProber.ProbingState.DETECTING; ++i) {
            for (int j = this.a - 1; j >= 0; --j) {
                int codingState = this.a[j].nextState(buf[i]);
                if (codingState == 1) {
                    --this.a;
                    if (this.a <= 0) {
                        this.a = CharsetProber.ProbingState.NOT_ME;
                        return this.a;
                    }
                    if (j == this.a) continue;
                    CodingStateMachine t = this.a[this.a];
                    this.a[this.a] = this.a[j];
                    this.a[j] = t;
                    continue;
                }
                if (codingState != 2) continue;
                this.a = CharsetProber.ProbingState.FOUND_IT;
                this.a = this.a[j].getCodingStateMachine();
                return this.a;
            }
        }
        return this.a;
    }

    public void reset() {
        this.a = CharsetProber.ProbingState.DETECTING;
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i].reset();
        }
        this.a = this.a.length;
        this.a = null;
    }

    public void setOption() {
    }
}

