/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.mozilla.universalchardet.CharsetListener
 *  org.mozilla.universalchardet.Constants
 *  org.mozilla.universalchardet.UniversalDetector
 *  org.mozilla.universalchardet.UniversalDetector$1
 *  org.mozilla.universalchardet.UniversalDetector$InputState
 *  org.mozilla.universalchardet.prober.CharsetProber
 *  org.mozilla.universalchardet.prober.CharsetProber$ProbingState
 *  org.mozilla.universalchardet.prober.EscCharsetProber
 *  org.mozilla.universalchardet.prober.Latin1Prober
 *  org.mozilla.universalchardet.prober.MBCSGroupProber
 *  org.mozilla.universalchardet.prober.SBCSGroupProber
 */
package org.mozilla.universalchardet;

import java.io.FileInputStream;
import java.io.PrintStream;
import org.mozilla.universalchardet.CharsetListener;
import org.mozilla.universalchardet.Constants;
import org.mozilla.universalchardet.UniversalDetector;
import org.mozilla.universalchardet.prober.CharsetProber;
import org.mozilla.universalchardet.prober.EscCharsetProber;
import org.mozilla.universalchardet.prober.Latin1Prober;
import org.mozilla.universalchardet.prober.MBCSGroupProber;
import org.mozilla.universalchardet.prober.SBCSGroupProber;

public class UniversalDetector {
    public static final float SHORTCUT_THRESHOLD = 0.95f;
    public static final float MINIMUM_THRESHOLD = 0.2f;
    private InputState a;
    private boolean a;
    private boolean b;
    private boolean c;
    private byte a;
    private String a;
    private CharsetProber[] a;
    private CharsetProber a;
    private CharsetListener a;

    public UniversalDetector(CharsetListener listener) {
        this.a = listener;
        this.a = null;
        this.a = new CharsetProber[3];
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i] = null;
        }
        this.reset();
    }

    public boolean isDone() {
        return this.a;
    }

    public String getDetectedCharset() {
        return this.a;
    }

    public void setListener(CharsetListener listener) {
        this.a = listener;
    }

    public CharsetListener getListener() {
        return this.a;
    }

    public void handleData(byte[] buf, int offset, int length) {
        if (this.a) {
            return;
        }
        if (length > 0) {
            this.c = true;
        }
        if (this.b) {
            this.b = false;
            if (length > 3) {
                int b1 = buf[offset] & 255;
                int b2 = buf[offset + 1] & 255;
                int b3 = buf[offset + 2] & 255;
                int b4 = buf[offset + 3] & 255;
                switch (b1) {
                    case 239: {
                        if (b2 != 187 || b3 != 191) break;
                        this.a = Constants.CHARSET_UTF_8;
                        break;
                    }
                    case 254: {
                        if (b2 == 255 && b3 == 0 && b4 == 0) {
                            this.a = Constants.CHARSET_X_ISO_10646_UCS_4_3412;
                            break;
                        }
                        if (b2 != 255) break;
                        this.a = Constants.CHARSET_UTF_16BE;
                        break;
                    }
                    case 0: {
                        if (b2 == 0 && b3 == 254 && b4 == 255) {
                            this.a = Constants.CHARSET_UTF_32BE;
                            break;
                        }
                        if (b2 != 0 || b3 != 255 || b4 != 254) break;
                        this.a = Constants.CHARSET_X_ISO_10646_UCS_4_2143;
                        break;
                    }
                    case 255: {
                        if (b2 == 254 && b3 == 0 && b4 == 0) {
                            this.a = Constants.CHARSET_UTF_32LE;
                            break;
                        }
                        if (b2 != 254) break;
                        this.a = Constants.CHARSET_UTF_16LE;
                    }
                }
                if (this.a != null) {
                    this.a = true;
                    return;
                }
            }
        }
        int maxPos = offset + length;
        for (int i = offset; i < maxPos; ++i) {
            int c = buf[i] & 255;
            if ((c & 128) != 0 && c != 160) {
                if (this.a == InputState.HIGHBYTE) continue;
                this.a = InputState.HIGHBYTE;
                if (this.a != null) {
                    this.a = null;
                }
                if (this.a[0] == null) {
                    this.a[0] = new MBCSGroupProber();
                }
                if (this.a[1] == null) {
                    this.a[1] = new SBCSGroupProber();
                }
                if (this.a[2] != null) continue;
                this.a[2] = new Latin1Prober();
                continue;
            }
            if (this.a == InputState.PURE_ASCII && (c == 27 || c == 123 && this.a == 126)) {
                this.a = InputState.ESC_ASCII;
            }
            this.a = buf[i];
        }
        if (this.a == InputState.ESC_ASCII) {
            CharsetProber.ProbingState st;
            if (this.a == null) {
                this.a = new EscCharsetProber();
            }
            if ((st = this.a.handleData(buf, offset, length)) == CharsetProber.ProbingState.FOUND_IT) {
                this.a = true;
                this.a = this.a.getCharSetName();
            }
        } else if (this.a == InputState.HIGHBYTE) {
            for (int i = 0; i < this.a.length; ++i) {
                CharsetProber.ProbingState st = this.a[i].handleData(buf, offset, length);
                if (st != CharsetProber.ProbingState.FOUND_IT) continue;
                this.a = true;
                this.a = this.a[i].getCharSetName();
                return;
            }
        }
    }

    public void dataEnd() {
        if (!this.c) {
            return;
        }
        if (this.a != null) {
            this.a = true;
            if (this.a != null) {
                this.a.report(this.a);
            }
            return;
        }
        if (this.a == InputState.HIGHBYTE) {
            float maxProberConfidence = 0.0f;
            int maxProber = 0;
            for (int i = 0; i < this.a.length; ++i) {
                float proberConfidence = this.a[i].getConfidence();
                if (proberConfidence <= maxProberConfidence) continue;
                maxProberConfidence = proberConfidence;
                maxProber = i;
            }
            if (maxProberConfidence > 0.2f) {
                this.a = this.a[maxProber].getCharSetName();
                if (this.a != null) {
                    this.a.report(this.a);
                }
            }
        } else if (this.a == InputState.ESC_ASCII) {
            // empty if block
        }
    }

    public void reset() {
        this.a = false;
        this.b = true;
        this.a = null;
        this.c = false;
        this.a = InputState.PURE_ASCII;
        this.a = 0;
        if (this.a != null) {
            this.a.reset();
        }
        for (int i = 0; i < this.a.length; ++i) {
            if (this.a[i] == null) continue;
            this.a[i].reset();
        }
    }

    public static void main(String[] args) throws Exception {
        int nread;
        if (args.length != 1) {
            System.out.println("USAGE: java UniversalDetector filename");
            return;
        }
        UniversalDetector detector = new UniversalDetector((CharsetListener)new /* Unavailable Anonymous Inner Class!! */);
        byte[] buf = new byte[4096];
        FileInputStream fis = new FileInputStream(args[0]);
        while ((nread = fis.read(buf)) > 0 && !detector.isDone()) {
            detector.handleData(buf, 0, nread);
        }
        detector.dataEnd();
    }
}

