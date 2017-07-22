/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.app.Observer
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.TrayIconGrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants
 *  br.gov.sp.fazenda.dsge.view.DSGETrayIcon
 *  br.gov.sp.fazenda.dsge.view.DSGETrayIcon$1
 */
package br.gov.sp.fazenda.dsge.view;

import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.app.Observer;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.TrayIconGrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants;
import br.gov.sp.fazenda.dsge.view.DSGETrayIcon;
import java.awt.Image;
import java.awt.TrayIcon;
import javax.swing.ImageIcon;

public class DSGETrayIcon
extends TrayIcon
implements Observer {
    private String a = DSGEMessageConstants.TRAY_ICON_INFO_TITLE;
    private String b = DSGEMessageConstants.TRAY_ICON_WARNING_TITLE;
    private String c = DSGEMessageConstants.TRAY_ICON_ERROR_TITLE;
    private String d = DSGEMessageConstants.TRAY_ICON_DEFAULT_TITLE;

    public DSGETrayIcon(ImageIcon img, String tooltip) {
        super(img.getImage());
        this.setToolTip(tooltip);
        Notificador.getInstance().register((Observer)this, new EnumItf[]{TrayIconGrupoNotificacaoEnum.TRAY_ICON_DEFAULT_MESSAGE, TrayIconGrupoNotificacaoEnum.TRAY_ICON_ERROR_MESSAGE, TrayIconGrupoNotificacaoEnum.TRAY_ICON_INFO_MESSAGE, TrayIconGrupoNotificacaoEnum.TRAY_ICON_WARNING_MESSAGE});
    }

    public void update(Object data, EnumItf source) {
        switch (1.a[((TrayIconGrupoNotificacaoEnum)source).ordinal()]) {
            case 1: {
                this.displayMessage(this.a, (String)data, TrayIcon.MessageType.INFO);
                break;
            }
            case 2: {
                this.displayMessage(this.b, (String)data, TrayIcon.MessageType.WARNING);
                break;
            }
            case 3: {
                this.displayMessage(this.c, (String)data, TrayIcon.MessageType.ERROR);
                break;
            }
            case 4: {
                this.displayMessage(this.d, (String)data, TrayIcon.MessageType.NONE);
            }
        }
    }

    public String getDefaultTitle() {
        return this.d;
    }

    public void setDefaultTitle(String defaultTitle) {
        this.d = defaultTitle;
    }

    public String getErrorTitle() {
        return this.c;
    }

    public void setErrorTitle(String errorTitle) {
        this.c = errorTitle;
    }

    public String getInfoTitle() {
        return this.a;
    }

    public void setInfoTitle(String infoTitle) {
        this.a = infoTitle;
    }

    public String getWarningTitle() {
        return this.b;
    }

    public void setWarningTitle(String warningTitle) {
        this.b = warningTitle;
    }
}

