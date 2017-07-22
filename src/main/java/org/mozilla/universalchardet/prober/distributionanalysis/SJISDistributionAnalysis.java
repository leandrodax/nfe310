/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.mozilla.universalchardet.prober.distributionanalysis.JISDistributionAnalysis
 *  org.mozilla.universalchardet.prober.distributionanalysis.SJISDistributionAnalysis
 */
package org.mozilla.universalchardet.prober.distributionanalysis;

import org.mozilla.universalchardet.prober.distributionanalysis.JISDistributionAnalysis;

public class SJISDistributionAnalysis
extends JISDistributionAnalysis {
    public static final int HIGHBYTE_BEGIN_1 = 129;
    public static final int HIGHBYTE_END_1 = 159;
    public static final int HIGHBYTE_BEGIN_2 = 224;
    public static final int HIGHBYTE_END_2 = 239;
    public static final int LOWBYTE_BEGIN_1 = 64;
    public static final int LOWBYTE_BEGIN_2 = 128;

    protected int getOrder(byte[] buf, int offset) {
        int order = -1;
        int highbyte = buf[offset] & 255;
        if (highbyte >= 129 && highbyte <= 159) {
            order = 188 * (highbyte - 129);
        } else if (highbyte >= 224 && highbyte <= 239) {
            order = 188 * (highbyte - 224 + 31);
        } else {
            return -1;
        }
        int lowbyte = buf[offset + 1] & 255;
        order += lowbyte - 64;
        if (lowbyte >= 128) {
            --order;
        }
        return order;
    }
}

