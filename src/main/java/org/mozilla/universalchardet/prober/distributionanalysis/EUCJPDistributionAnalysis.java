/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.mozilla.universalchardet.prober.distributionanalysis.EUCJPDistributionAnalysis
 *  org.mozilla.universalchardet.prober.distributionanalysis.JISDistributionAnalysis
 */
package org.mozilla.universalchardet.prober.distributionanalysis;

import org.mozilla.universalchardet.prober.distributionanalysis.JISDistributionAnalysis;

public class EUCJPDistributionAnalysis
extends JISDistributionAnalysis {
    public static final int HIGHBYTE_BEGIN = 161;
    public static final int HIGHBYTE_END = 254;
    public static final int LOWBYTE_BEGIN = 161;
    public static final int LOWBYTE_END = 254;

    protected int getOrder(byte[] buf, int offset) {
        int highbyte = buf[offset] & 255;
        if (highbyte >= 161) {
            int lowbyte = buf[offset + 1] & 255;
            return 94 * (highbyte - 161) + lowbyte - 161;
        }
        return -1;
    }
}

