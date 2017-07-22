/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.mozilla.universalchardet.prober.CharsetProber
 *  org.mozilla.universalchardet.prober.CharsetProber$ProbingState
 *  org.mozilla.universalchardet.prober.HebrewProber
 *  org.mozilla.universalchardet.prober.SBCSGroupProber
 *  org.mozilla.universalchardet.prober.SingleByteCharsetProber
 *  org.mozilla.universalchardet.prober.sequence.HebrewModel
 *  org.mozilla.universalchardet.prober.sequence.Ibm855Model
 *  org.mozilla.universalchardet.prober.sequence.Ibm866Model
 *  org.mozilla.universalchardet.prober.sequence.Koi8rModel
 *  org.mozilla.universalchardet.prober.sequence.Latin5BulgarianModel
 *  org.mozilla.universalchardet.prober.sequence.Latin5Model
 *  org.mozilla.universalchardet.prober.sequence.Latin7Model
 *  org.mozilla.universalchardet.prober.sequence.MacCyrillicModel
 *  org.mozilla.universalchardet.prober.sequence.SequenceModel
 *  org.mozilla.universalchardet.prober.sequence.Win1251BulgarianModel
 *  org.mozilla.universalchardet.prober.sequence.Win1251Model
 *  org.mozilla.universalchardet.prober.sequence.Win1253Model
 */
package org.mozilla.universalchardet.prober;

import java.nio.ByteBuffer;
import org.mozilla.universalchardet.prober.CharsetProber;
import org.mozilla.universalchardet.prober.HebrewProber;
import org.mozilla.universalchardet.prober.SingleByteCharsetProber;
import org.mozilla.universalchardet.prober.sequence.HebrewModel;
import org.mozilla.universalchardet.prober.sequence.Ibm855Model;
import org.mozilla.universalchardet.prober.sequence.Ibm866Model;
import org.mozilla.universalchardet.prober.sequence.Koi8rModel;
import org.mozilla.universalchardet.prober.sequence.Latin5BulgarianModel;
import org.mozilla.universalchardet.prober.sequence.Latin5Model;
import org.mozilla.universalchardet.prober.sequence.Latin7Model;
import org.mozilla.universalchardet.prober.sequence.MacCyrillicModel;
import org.mozilla.universalchardet.prober.sequence.SequenceModel;
import org.mozilla.universalchardet.prober.sequence.Win1251BulgarianModel;
import org.mozilla.universalchardet.prober.sequence.Win1251Model;
import org.mozilla.universalchardet.prober.sequence.Win1253Model;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class SBCSGroupProber
extends CharsetProber {
    private CharsetProber.ProbingState a;
    private CharsetProber[] a;
    private boolean[] a;
    private int a = new boolean[13];
    private int b;
    private static final SequenceModel a = new Win1251Model();
    private static final SequenceModel b = new Koi8rModel();
    private static final SequenceModel c = new Latin5Model();
    private static final SequenceModel d = new MacCyrillicModel();
    private static final SequenceModel e = new Ibm866Model();
    private static final SequenceModel f = new Ibm855Model();
    private static final SequenceModel g = new Latin7Model();
    private static final SequenceModel h = new Win1253Model();
    private static final SequenceModel i = new Latin5BulgarianModel();
    private static final SequenceModel j = new Win1251BulgarianModel();
    private static final SequenceModel k = new HebrewModel();

    public SBCSGroupProber() {
        this.a[0] = new SingleByteCharsetProber(a);
        this.a[1] = new SingleByteCharsetProber(b);
        this.a[2] = new SingleByteCharsetProber(c);
        this.a[3] = new SingleByteCharsetProber(d);
        this.a[4] = new SingleByteCharsetProber(e);
        this.a[5] = new SingleByteCharsetProber(f);
        this.a[6] = new SingleByteCharsetProber(g);
        this.a[7] = new SingleByteCharsetProber(h);
        this.a[8] = new SingleByteCharsetProber(i);
        this.a[9] = new SingleByteCharsetProber(j);
        HebrewProber hebprober = new HebrewProber();
        this.a[10] = hebprober;
        this.a[11] = new SingleByteCharsetProber(k, false, (CharsetProber)hebprober);
        this.a[12] = new SingleByteCharsetProber(k, true, (CharsetProber)hebprober);
        hebprober.setModalProbers(this.a[11], this.a[12]);
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
        ByteBuffer newbuf = this.filterWithoutEnglishLetters(buf, offset, length);
        if (newbuf.position() != 0) {
            for (int i = 0; i < this.a.length; ++i) {
                if (!this.a[i]) continue;
                CharsetProber.ProbingState st = this.a[i].handleData(newbuf.array(), 0, newbuf.position());
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

