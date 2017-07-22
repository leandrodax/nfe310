/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.mozilla.universalchardet.prober.contextanalysis.EUCJPContextAnalysis
 *  org.mozilla.universalchardet.prober.contextanalysis.JapaneseContextAnalysis
 *  org.mozilla.universalchardet.prober.contextanalysis.JapaneseContextAnalysis$Order
 */
package org.mozilla.universalchardet.prober.contextanalysis;

import org.mozilla.universalchardet.prober.contextanalysis.JapaneseContextAnalysis;

public class EUCJPContextAnalysis
extends JapaneseContextAnalysis {
    public static final int HIRAGANA_HIGHBYTE = 164;
    public static final int HIRAGANA_LOWBYTE_BEGIN = 161;
    public static final int HIRAGANA_LOWBYTE_END = 243;
    public static final int SINGLE_SHIFT_2 = 142;
    public static final int SINGLE_SHIFT_3 = 143;
    public static final int FIRSTPLANE_HIGHBYTE_BEGIN = 161;
    public static final int FIRSTPLANE_HIGHBYTE_END = 254;

    protected void getOrder(JapaneseContextAnalysis.Order order, byte[] buf, int offset) {
        int secondByte;
        order.order = -1;
        order.charLength = 1;
        int firstByte = buf[offset] & 255;
        if (firstByte == 142 || firstByte >= 161 && firstByte <= 254) {
            order.charLength = 2;
        } else if (firstByte == 143) {
            order.charLength = 3;
        }
        if (firstByte == 164 && (secondByte = buf[offset + 1] & 255) >= 161 && secondByte <= 243) {
            order.order = secondByte - 161;
        }
    }

    protected int getOrder(byte[] buf, int offset) {
        int lowbyte;
        int highbyte = buf[offset] & 255;
        if (highbyte == 164 && (lowbyte = buf[offset + 1] & 255) >= 161 && lowbyte <= 243) {
            return lowbyte - 161;
        }
        return -1;
    }
}

