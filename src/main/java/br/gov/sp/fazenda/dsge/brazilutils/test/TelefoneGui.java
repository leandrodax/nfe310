/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.telefone.Telefone
 *  br.gov.sp.fazenda.dsge.brazilutils.test.TelefoneGui
 *  br.gov.sp.fazenda.dsge.brazilutils.test.TelefoneGui$1
 */
package br.gov.sp.fazenda.dsge.brazilutils.test;

import br.gov.sp.fazenda.dsge.brazilutils.telefone.Telefone;
import br.gov.sp.fazenda.dsge.brazilutils.test.TelefoneGui;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class TelefoneGui
extends JFrame {
    private static final long a = 1;
    private Telefone a;
    private JPanel a;
    private JPanel b;
    private JPanel c;
    private JFormattedTextField a;
    private JLabel a;
    private JPanel d = null;
    private JButton a;
    private JLabel b;
    private JTextField a = null;
    private JFormattedTextField b = null;
    private JLabel c = null;

    public TelefoneGui() {
        this.a();
    }

    private void a() {
        this.setSize(438, 355);
        this.setContentPane((Container)this.a());
        this.setTitle("JFrame");
    }

    private JPanel a() {
        if (this.a == null) {
            this.a = new JPanel();
            this.a.setLayout(new BorderLayout());
            this.a.add((Component)this.b(), "North");
            this.a.add((Component)this.c(), "Center");
            this.a.add((Component)this.d(), "East");
        }
        return this.a;
    }

    private JPanel b() {
        if (this.b == null) {
            this.b = new JPanel();
        }
        return this.b;
    }

    private JPanel c() {
        if (this.c == null) {
            this.c = new JLabel();
            this.b = new JLabel();
            this.a = new JLabel();
            this.c = new JPanel();
            this.c.setLayout(null);
            this.a.setBounds(15, 15, 99, 16);
            this.a.setText("Input");
            this.b.setBounds(15, 66, 68, 17);
            this.b.setText("Output");
            this.c.setBounds(15, 130, 157, 15);
            this.c.setText("Mask");
            this.c.add((Component)this.a(), (Object)null);
            this.c.add((Component)this.b(), (Object)null);
            this.c.add((Component)this.c, (Object)null);
            this.c.add((Component)this.a, (Object)null);
            this.c.add((Component)this.b, (Object)null);
            this.c.add((Component)this.a(), (Object)null);
        }
        return this.c;
    }

    private JFormattedTextField a() {
        if (this.a == null) {
            this.a = new JFormattedTextField();
            this.a.setBounds(14, 32, 160, 22);
        }
        return this.a;
    }

    private JPanel d() {
        if (this.d == null) {
            this.d = new JPanel();
            this.d.setPreferredSize(new Dimension(100, 36));
            this.d.add((Component)this.a(), (Object)null);
        }
        return this.d;
    }

    private JButton a() {
        if (this.a == null) {
            this.a = new JButton();
            this.a.setText("Test");
            this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        }
        return this.a;
    }

    private JTextField a() {
        if (this.a == null) {
            this.a = new JTextField();
            this.a.setBounds(15, 83, 158, 22);
        }
        return this.a;
    }

    private JFormattedTextField b() {
        if (this.b == null) {
            this.b = new JFormattedTextField();
            this.b.setBounds(15, 146, 161, 21);
        }
        return this.b;
    }

    static /* synthetic */ JFormattedTextField a(TelefoneGui x0) {
        return x0.a;
    }

    static /* synthetic */ JFormattedTextField b(TelefoneGui x0) {
        return x0.b;
    }

    static /* synthetic */ JTextField a(TelefoneGui x0) {
        return x0.a;
    }
}

