/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.help.Help
 *  br.gov.sp.fazenda.dsen.help.exception.DSENHelpException
 *  javax.help.HelpBroker
 *  javax.help.HelpSet
 *  javax.help.HelpSetException
 */
package br.gov.sp.fazenda.dsen.help;

import br.gov.sp.fazenda.dsen.help.exception.DSENHelpException;
import java.awt.Component;
import java.net.URL;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;
import javax.swing.JButton;
import javax.swing.JMenuItem;

public class Help {
    private final String a = "DSENHelpSet.hs";
    private HelpSet a;
    private HelpBroker a = "DSENHelpSet.hs";

    public Help() throws DSENHelpException {
        try {
            URL url = Help.class.getResource("DSENHelpSet.hs");
            this.a = new HelpSet(null, url);
            this.a = this.a.createHelpBroker();
        }
        catch (HelpSetException e) {
            throw new DSENHelpException((Throwable)e, e.getMessage());
        }
    }

    public void configurarHelp(JMenuItem menuItem, String target) {
        this.a.enableHelpOnButton((Component)menuItem, target, this.a);
    }

    public void configurarHelp(JButton button, String target) {
        this.a.enableHelpOnButton((Component)button, target, this.a);
    }
}

