/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.view.table.JTableImageMouseListener
 */
package br.gov.sp.fazenda.dsge.view.table;

import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.TableColumnModel;

public class JTableImageMouseListener
implements MouseListener,
MouseMotionListener {
    private JTable a;
    private static JLabel a;

    private JLabel a(int x, int y) {
        TableColumnModel columnModel = this.a.getColumnModel();
        int column = columnModel.getColumnIndexAtX(x);
        int row = y / this.a.getRowHeight();
        if (row >= this.a.getRowCount() || row < 0 || column >= this.a.getColumnCount() || column < 0) {
            return null;
        }
        Object o = this.a.getValueAt(row, column);
        if (o instanceof JLabel) {
            return (JLabel)o;
        }
        return null;
    }

    private void a(MouseEvent e) {
        JLabel labelImage = this.a(e.getX(), e.getY());
        switch (e.getID()) {
            case 500: 
            case 501: 
            case 502: 
            case 506: {
                if (labelImage == null) break;
                labelImage.dispatchEvent(SwingUtilities.convertMouseEvent(this.a, e, labelImage));
                this.a.repaint();
                break;
            }
            case 504: {
                if (labelImage != null) {
                    labelImage.dispatchEvent(SwingUtilities.convertMouseEvent(this.a, new MouseEvent(labelImage, 504, e.getWhen(), e.getModifiers(), e.getX(), e.getY(), e.getXOnScreen(), e.getYOnScreen(), e.getClickCount(), e.isPopupTrigger(), 0), labelImage));
                }
                a = labelImage;
                break;
            }
            case 505: {
                if (a == null) break;
                a.dispatchEvent(SwingUtilities.convertMouseEvent(this.a, new MouseEvent(a, 505, e.getWhen(), e.getModifiers(), e.getX(), e.getY(), e.getXOnScreen(), e.getYOnScreen(), e.getClickCount(), e.isPopupTrigger(), 0), a));
                a = null;
                break;
            }
            case 503: {
                if (a != null && a != labelImage) {
                    a.dispatchEvent(SwingUtilities.convertMouseEvent(this.a, new MouseEvent(a, 505, e.getWhen(), e.getModifiers(), e.getX(), e.getY(), e.getXOnScreen(), e.getYOnScreen(), e.getClickCount(), e.isPopupTrigger(), 0), a));
                }
                if (labelImage != null && a != labelImage) {
                    labelImage.dispatchEvent(SwingUtilities.convertMouseEvent(this.a, new MouseEvent(labelImage, 504, e.getWhen(), e.getModifiers(), e.getX(), e.getY(), e.getXOnScreen(), e.getYOnScreen(), e.getClickCount(), e.isPopupTrigger(), 0), labelImage));
                    labelImage.dispatchEvent(SwingUtilities.convertMouseEvent(this.a, e, labelImage));
                }
                a = labelImage;
            }
        }
    }

    public JTableImageMouseListener(JTable table) {
        this.a = table;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.a(e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.a(e);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.a(e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.a(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.a(e);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        this.a(e);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        this.a(e);
    }
}

