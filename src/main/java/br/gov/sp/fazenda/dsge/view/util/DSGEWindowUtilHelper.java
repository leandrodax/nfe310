/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.view.DSGEFrame
 *  br.gov.sp.fazenda.dsge.view.util.DSGEWindowUtilHelper
 */
package br.gov.sp.fazenda.dsge.view.util;

import br.gov.sp.fazenda.dsge.view.DSGEFrame;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JDialog;

public class DSGEWindowUtilHelper {
    public static void centralizarDialogo(Component parent, JDialog dialogo) {
        Point frameLocation = null;
        Dimension frameSize = null;
        if (parent == null) {
            frameSize = Toolkit.getDefaultToolkit().getScreenSize();
            frameLocation = new Point(0, 0);
        } else {
            frameSize = parent.getSize();
            frameLocation = parent.getLocation();
        }
        Dimension dialogSize = dialogo.getSize();
        int height = (frameSize.height - dialogSize.height) / 2;
        int width = (frameSize.width - dialogSize.width) / 2;
        dialogo.setLocation(width + frameLocation.x, height + frameLocation.y);
    }

    public static Frame getAppFrame() {
        Frame[] frames;
        for (Frame f : frames = Frame.getFrames()) {
            if (!(f instanceof DSGEFrame) || !f.isVisible()) continue;
            return f;
        }
        return null;
    }
}

