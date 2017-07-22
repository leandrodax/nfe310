/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.model.queue.BuscaRetornoQueueItem
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.DSENStatusBAR
 *  br.gov.sp.fazenda.dsen.view.InformacaoBuscaRetornoGUI
 *  br.gov.sp.fazenda.dsen.view.ProgressoBuscaRetornoGUI
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.app.Observer
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.TrayIconGrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.model.queue.QueueListener
 *  br.gov.sp.fazenda.dsge.model.queue.QueueManager
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.model.queue.BuscaRetornoQueueItem;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.InformacaoBuscaRetornoGUI;
import br.gov.sp.fazenda.dsen.view.ProgressoBuscaRetornoGUI;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.app.Observer;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.TrayIconGrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.model.queue.QueueListener;
import br.gov.sp.fazenda.dsge.model.queue.QueueManager;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.text.MessageFormat;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/*
 * Exception performing whole class analysis ignored.
 */
public class DSENStatusBAR
extends Box
implements Observer,
QueueListener<BuscaRetornoQueueItem>,
ActionListener,
MouseListener {
    private static final long a = 5936899913455695721L;
    private JLabel a;
    private JButton a;
    private JButton b;
    private long b;
    private long c = 0;
    JProgressBar a;
    InformacaoBuscaRetornoGUI a;
    ProgressoBuscaRetornoGUI a;
    private String a = new JButton(DSENStatusBAR.a());
    private String b = "ACTION_SHOW_PROGRESS";

    public DSENStatusBAR() {
        super(0);
        this.a.setMaximumSize(new Dimension(20, 15));
        this.a.setBorderPainted(false);
        this.a.setFocusable(false);
        this.a.setVisible(false);
        this.a.setCursor(new Cursor(12));
        this.a.addActionListener((ActionListener)this);
        this.a.setActionCommand(this.a);
        this.b = new JButton(DSENStatusBAR.b());
        this.b.setMaximumSize(new Dimension(20, 15));
        this.b.setBorderPainted(false);
        this.b.setFocusable(false);
        this.b.setVisible(false);
        this.b.setCursor(new Cursor(12));
        this.b.addActionListener((ActionListener)this);
        this.b.setActionCommand(this.b);
        this.a = new JProgressBar();
        this.a.setIndeterminate(true);
        this.a.setMaximumSize(new Dimension(50, 20));
        this.a.setVisible(false);
        this.a.setCursor(new Cursor(12));
        this.a.addMouseListener((MouseListener)this);
        this.add((Component)this.a);
        this.add(DSENStatusBAR.createHorizontalStrut((int)5));
        this.add((Component)this.b);
        this.add(DSENStatusBAR.createHorizontalStrut((int)5));
        this.add((Component)this.a);
        this.add(DSENStatusBAR.createHorizontalStrut((int)5));
        this.add((Component)this.a);
        this.add(DSENStatusBAR.createHorizontalStrut((int)5));
        this.setPreferredSize(new Dimension(28, 20));
    }

    public void update(Object data, EnumItf source) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.a.equals(e.getActionCommand())) {
            this.a.setVisible(false);
            this.a.setVisible(true);
        } else if (this.b.equals(e.getActionCommand())) {
            this.a.setVisible(true);
        }
    }

    private static ImageIcon a() {
        URL imgURL = DSENStatusBAR.class.getResource("resources/info.gif");
        if (imgURL != null) {
            return new ImageIcon(imgURL, "Informa\u00e7\u00e3o");
        }
        return null;
    }

    private static ImageIcon b() {
        URL imgURL = DSENStatusBAR.class.getResource("resources/clock.gif");
        if (imgURL != null) {
            return new ImageIcon(imgURL, "Agendamentos da Busca Retorno.");
        }
        return null;
    }

    public void onConsume(BuscaRetornoQueueItem obj) {
        Object[] arrobject = new Object[]{++this.b, this.c};
        String label = MessageFormat.format(DSENMessageConstants.MSG_X_RECIBOS_CONSULTADOS_DE_Y, arrobject);
        this.a.setText(label);
        this.a.setInfoLabel(label);
        this.a.setIndeterminate(false);
        this.a.setValue((int)(this.b * 100 / this.c));
        this.a.setProgressBarIndeterminated(false);
        this.a.setProgressBarValue(this.a.getValue());
        this.a.removeItem(obj);
        this.a.addItem(obj);
        this.repaint();
    }

    public void onError(BuscaRetornoQueueItem obj, Throwable error) {
        if (error == null) {
            return;
        }
        DSENDesktop.getInstance().showErrors((DSGEBaseException)new DSGEViewException(error, error.getMessage()));
    }

    public void onShutdown(BuscaRetornoQueueItem obj) {
        this.a.setDone();
    }

    public void onSleep(BuscaRetornoQueueItem obj) {
        this.a.setText(DSENLabelConstants.NFE);
        this.a.setInfoLabel("");
        this.a.setVisible(false);
        if (QueueManager.getInstance(BuscaRetornoQueueItem.class).containsItens()) {
            this.b.setVisible(true);
        } else {
            this.b.setVisible(false);
        }
        if (!this.a.isVisible()) {
            this.a.setVisible(true);
        }
        this.a.setProgressBarValue(0);
        this.repaint();
        AppContext.getInstance().setBuscaRetornoSEFAZRunning((EnumItf)AppContextEnum.BUSCA_RETORNO_SEFAZ, Boolean.valueOf(false));
        Notificador.getInstance().notificar((Object)DSENMessageConstants.MSG_BUSCA_RETORNO_CONCLUIDA, new EnumItf[]{TrayIconGrupoNotificacaoEnum.TRAY_ICON_INFO_MESSAGE});
    }

    public void onStartup(BuscaRetornoQueueItem obj) {
    }

    public void onCancel(int agendados, int prontos) {
        this.a.removeAllItens();
        this.a.setProgressBarIndeterminated(false);
        this.a.setProgressBarValue(0);
        this.b.setVisible(false);
        this.a.setVisible(false);
        this.a.setValue(0);
        AppContext.getInstance().setBuscaRetornoSEFAZRunning((EnumItf)AppContextEnum.BUSCA_RETORNO_SEFAZ, Boolean.valueOf(false));
        Notificador.getInstance().notificar((Object)MessageFormat.format(DSENMessageConstants.MSG_BUSCA_RETORNO_CANCELADA, agendados, prontos), new EnumItf[]{TrayIconGrupoNotificacaoEnum.TRAY_ICON_WARNING_MESSAGE});
    }

    public void onWakeup(BuscaRetornoQueueItem obj, int queueSize) {
        try {
            if (this.a == null) {
                this.a = new InformacaoBuscaRetornoGUI((Frame)DSENDesktop.getInstance(), false);
                this.a.setVisible(false);
            }
            this.a.startBuscaRetorno();
        }
        catch (DSGEViewException dSGEViewException) {
            // empty catch block
        }
        AppContext.getInstance().setBuscaRetornoSEFAZRunning((EnumItf)AppContextEnum.BUSCA_RETORNO_SEFAZ, Boolean.valueOf(true));
        this.b = 0;
        this.c = queueSize;
        this.a.setVisible(true);
        this.b.setVisible(false);
        this.a.setValue(0);
        this.a.setIndeterminate(true);
        this.a.setProgressBarIndeterminated(true);
        this.a.setProgressBarValue(0);
        this.a.setText(DSENLabelConstants.PROCESSANDO_BUSCA_POR_RETORNOS);
        this.a.setInfoLabel(DSENLabelConstants.PROCESSANDO_BUSCA_POR_RETORNOS);
        this.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.a.setVisible(true);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    public void onPush(BuscaRetornoQueueItem obj) {
        if (this.a == null) {
            this.a = new ProgressoBuscaRetornoGUI((Frame)DSENDesktop.getInstance(), true);
            this.a.setVisible(false);
        }
        this.a.addItem(obj);
        if (!this.a.isVisible()) {
            this.b.setVisible(true);
        }
    }
}

