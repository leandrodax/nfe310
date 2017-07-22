/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.mozilla.universalchardet.prober.contextanalysis.JapaneseContextAnalysis
 *  org.mozilla.universalchardet.prober.contextanalysis.JapaneseContextAnalysis$Order
 *  org.mozilla.universalchardet.prober.contextanalysis.SJISContextAnalysis
 */
package org.mozilla.universalchardet.prober.contextanalysis;

import org.mozilla.universalchardet.prober.contextanalysis.JapaneseContextAnalysis;

public class SJISContextAnalysis
extends JapaneseContextAnalysis {
    public static final int HIRAGANA_HIGHBYTE = 130;
    public static final int HIRAGANA_LOWBYTE_BEGIN = 159;
    public static final int HIRAGANA_LOWBYTE_END = 241;
    public static final int HIGHBYTE_BEGIN_1 = 129;
    public static final int HIGHBYTE_END_1 = 159;
    public static final int HIGHBYTE_BEGIN_2 = 224;
    public static final int HIGHBYTE_END_2 = 239;

    protected void getOrder(JapaneseContextAnalysis.Order order, byte[] buf, int offset) {
        int lowbyte;
        order.order = -1;
        order.charLength = 1;
        int highbyte = buf[offset] & 255;
        if (highbyte >= 129 && highbyte <= 159 || highbyte >= 224 && highbyte <= 239) {
            order.charLength = 2;
        }
        if (highbyte == 130 && (lowbyte = buf[offset + 1] & 255) >= 159 && lowbyte <= 241) {
            order.order = lowbyte - 159;
        }
    }

    protected int getOrder(byte[] buf, int offset) {
        int lowbyte;
        int highbyte = buf[offset] & 255;
        if (highbyte == 130 && (lowbyte = buf[offset + 1] & 255) >= 159 && lowbyte <= 241) {
            return lowbyte - 159;
        }
        return -1;
    }
}

