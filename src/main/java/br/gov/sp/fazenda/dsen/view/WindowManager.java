/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.StartPanel
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsen.view.WindowManager$1
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.app.Observer
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.view.DSGEDesktop
 *  br.gov.sp.fazenda.dsge.view.DSGEPanel
 *  br.gov.sp.fazenda.dsge.view.WindowManager
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.StartPanel;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.app.Observer;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.view.DSGEDesktop;
import br.gov.sp.fazenda.dsge.view.DSGEPanel;
import java.awt.Component;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;

public class WindowManager
extends br.gov.sp.fazenda.dsge.view.WindowManager
implements Observer {
    private static WindowManager a;

    private WindowManager() {
        Notificador.getInstance().register((Observer)this, new EnumItf[]{AppContextEnum.EMITENTE});
    }

    public static WindowManager getInstance() {
        if (a == null) {
            a = new WindowManager();
        }
        return a;
    }

    public void setFrame(DSENDesktop frame) {
        this.frame = frame;
    }

    public void update(Object data, EnumItf source) {
        switch (1.a[((AppContextEnum)source).ordinal()]) {
            case 1: {
                EmitenteTO emitente = (EmitenteTO)data;
                if (emitente != null) {
                    this.setMenuEmitenteLogado(true);
                    break;
                }
                this.setMenuEmitenteLogado(false);
            }
        }
    }

    public void setMenuEmitenteLogado(boolean logado) {
        int menuCount = ((DSENDesktop)this.frame).getMnuPrincipal().getMenuCount();
        for (int i = 0; i < menuCount; ++i) {
            int k;
            int menuComponentCount;
            JMenuItem mnuItem;
            JMenu mnu = ((DSENDesktop)this.frame).getMnuPrincipal().getMenu(i);
            if (DSENLabelConstants.MNU_CADASTROS.equals(mnu.getText())) {
                mnu.setEnabled(logado);
                continue;
            }
            if (DSENLabelConstants.MNU_NOTAS_FISCAIS.equals(mnu.getText())) {
                menuComponentCount = mnu.getMenuComponentCount();
                for (k = 0; k < menuComponentCount; ++k) {
                    if (!(mnu.getMenuComponent(k) instanceof JMenuItem)) continue;
                    mnuItem = (JMenuItem)mnu.getMenuComponent(k);
                    if (DSENLabelConstants.MNU_SAIR.equals(mnuItem.getText())) {
                        mnuItem.setEnabled(true);
                        continue;
                    }
                    mnuItem.setEnabled(logado);
                }
                continue;
            }
            if (DSENLabelConstants.MNU_SISTEMA.equals(mnu.getText())) {
                menuComponentCount = mnu.getMenuComponentCount();
                for (k = 0; k < menuComponentCount; ++k) {
                    if (!(mnu.getMenuComponent(k) instanceof JMenuItem)) continue;
                    mnuItem = (JMenuItem)mnu.getMenuComponent(k);
                    if (DSENLabelConstants.MNU_PARAMETROS.equals(mnuItem.getText()) || DSENLabelConstants.MNU_IMPORTAR.equals(mnuItem.getText())) {
                        mnuItem.setEnabled(true);
                        continue;
                    }
                    if (DSENLabelConstants.MNU_RESTAURAR.equals(mnuItem.getText()) || DSENLabelConstants.MNU_BACKUP.equals(mnuItem.getText())) {
                        mnuItem.setEnabled(!logado);
                        continue;
                    }
                    mnuItem.setEnabled(logado);
                }
                continue;
            }
            if (DSENLabelConstants.MNU_PREFERENCIAS.equals(mnu.getText())) {
                mnu.setEnabled(true);
                continue;
            }
            if (DSENLabelConstants.MNU_AJUDA.equals(mnu.getText())) {
                mnu.setEnabled(true);
                continue;
            }
            if (!DSENLabelConstants.MNU_EMITENTE.equals(mnu.getText())) continue;
            menuComponentCount = mnu.getMenuComponentCount();
            for (k = 0; k < menuComponentCount; ++k) {
                if (!(mnu.getMenuComponent(k) instanceof JMenuItem)) continue;
                mnuItem = (JMenuItem)mnu.getMenuComponent(k);
                if (DSENLabelConstants.MNU_SELECIONAR_OUTRO_EMITENTE.equals(mnuItem.getText())) {
                    mnuItem.setEnabled(true);
                    continue;
                }
                mnuItem.setEnabled(logado);
            }
        }
    }

    public JSplitPane getDesktop() {
        return DSENDesktop.getInstance().getDesktop();
    }

    public DSGEPanel getStartPanel() {
        return new StartPanel();
    }
}

