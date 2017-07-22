/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.mozilla.universalchardet.Constants
 *  org.mozilla.universalchardet.prober.CharsetProber
 *  org.mozilla.universalchardet.prober.CharsetProber$ProbingState
 *  org.mozilla.universalchardet.prober.EUCJPProber
 *  org.mozilla.universalchardet.prober.contextanalysis.EUCJPContextAnalysis
 *  org.mozilla.universalchardet.prober.distributionanalysis.EUCJPDistributionAnalysis
 *  org.mozilla.universalchardet.prober.statemachine.CodingStateMachine
 *  org.mozilla.universalchardet.prober.statemachine.EUCJPSMModel
 *  org.mozilla.universalchardet.prober.statemachine.SMModel
 */
package org.mozilla.universalchardet.prober;

import java.util.Arrays;
import org.mozilla.universalchardet.Constants;
import org.mozilla.universalchardet.prober.CharsetProber;
import org.mozilla.universalchardet.prober.contextanalysis.EUCJPContextAnalysis;
import org.mozilla.universalchardet.prober.distributionanalysis.EUCJPDistributionAnalysis;
import org.mozilla.universalchardet.prober.statemachine.CodingStateMachine;
import org.mozilla.universalchardet.prober.statemachine.EUCJPSMModel;
import org.mozilla.universalchardet.prober.statemachine.SMModel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class EUCJPProber
extends CharsetProber {
    private CodingStateMachine a;
    private CharsetProber.ProbingState a;
    private EUCJPContextAnalysis a;
    private EUCJPDistributionAnalysis a;
    private byte[] a = new byte[2];
    private static final SMModel a = new EUCJPSMModel();

    public EUCJPProber() {
        this.reset();
    }

    public String getCharSetName() {
        return Constants.CHARSET_EUC_JP;
    }

    public float getConfidence() {
        float contextCf = this.a.getConfidence();
        float distribCf = this.a.getConfidence();
        return Math.max(contextCf, distribCf);
    }

    public CharsetProber.ProbingState getState() {
        return this.a;
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
            if (codingState != 0) continue;
            int charLen = this.a.getCurrentCharLen();
            if (i == offset) {
                this.a[1] = buf[offset];
                this.a.handleOneChar(this.a, 0, charLen);
                this.a.handleOneChar(this.a, 0, charLen);
                continue;
            }
            this.a.handleOneChar(buf, i - 1, charLen);
            this.a.handleOneChar(buf, i - 1, charLen);
        }
        this.a[0] = buf[maxPos - 1];
        if (this.a == CharsetProber.ProbingState.DETECTING && this.a.gotEnoughData() && this.getConfidence() > 0.95f) {
            this.a = CharsetProber.ProbingState.FOUND_IT;
        }
        return this.a;
    }

    public void reset() {
        this.a.reset();
        this.a = CharsetProber.ProbingState.DETECTING;
        this.a.reset();
        this.a.reset();
        Arrays.fill(this.a, 0);
    }

    public void setOption() {
    }
}

