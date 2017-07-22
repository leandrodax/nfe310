/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.exception.NaoExisteCertificadoBDException
 *  br.gov.sp.fazenda.dsen.common.exception.NaoExisteCertificadoWindowsException
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoInfoTO
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.SelecionarCertificadoGUI
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.message.DSGEMessageDialog
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.exception.NaoExisteCertificadoBDException;
import br.gov.sp.fazenda.dsen.common.exception.NaoExisteCertificadoWindowsException;
import br.gov.sp.fazenda.dsen.common.to.CertificadoInfoTO;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.message.DSGEMessageDialog;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;

/*
 * Exception performing whole class analysis ignored.
 */
public class SelecionarCertificadoGUI
extends DSGEDialog
implements KeyListener {
    private static final long a = 4119224344209210352L;
    private JButton a;
    private JButton b;
    private JComboBox a;
    private ButtonGroup a;
    private JPanel a;
    private JLabel a;
    private JLabel b;
    private JPanel b;
    private JPasswordField a;
    private Map<String, JComponent[]> a;
    private CertificadoTO a;
    private TipoCertificadoEnum a;
    private boolean a = false;

    public SelecionarCertificadoGUI(Frame parent, TipoCertificadoEnum tipoCertificado) throws DSGEViewException {
        super((Window)parent, true);
        this.a = tipoCertificado;
        this.a();
    }

    public SelecionarCertificadoGUI(Dialog parent, TipoCertificadoEnum tipoCertificado) throws DSGEViewException {
        super((Window)parent, true);
        this.a = tipoCertificado;
        this.a();
    }

    private void a() throws DSGEViewException {
        this.d();
        this.b();
        this.c();
        if (this.a.equals((Object)TipoCertificadoEnum.ASSINATURA)) {
            this.setTitle(DSENLabelConstants.SELECIONAR_CERTIFICADO_ASSINATURA);
        } else {
            this.setTitle(DSENLabelConstants.SELECIONAR_CERTIFICADO_CONEXAO);
        }
        this.bindController((ViewItf)this);
        this.a.requestFocus();
        this.a.addKeyListener((KeyListener)this);
        this.b.addKeyListener((KeyListener)this);
    }

    private void b() {
        this.b.setActionCommand("ACTION_SELECIONAR_CERTIFICADO");
        this.a.setActionCommand("cancelar");
    }

    private void c() {
        this.a = new HashMap();
    }

    private void d() {
        this.a = new ButtonGroup();
        this.b = new JPanel();
        this.a = new JComboBox();
        this.a = new JPanel();
        this.b = new JButton();
        this.a = new JButton();
        this.a = new JPasswordField();
        this.b = new JLabel();
        this.a = new JLabel();
        this.setDefaultCloseOperation(2);
        this.setResizable(false);
        this.b.setBorder(BorderFactory.createTitledBorder(null, "Escolha um certificado", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.b.setText("Selecionar");
        this.a.setText("Cancelar");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addContainerGap(-1, 32767)));
        jPanel1Layout.linkSize(0, this.a, this.b);
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a)));
        this.b.setText("Senha");
        this.a.setText("Certificado");
        GroupLayout pnlPrincipalLayout = new GroupLayout(this.b);
        this.b.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addContainerGap().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a).addComponent(this.b)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 333, 32767).addComponent(this.a, 0, 333, 32767)).addContainerGap()).addGroup(pnlPrincipalLayout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 100, 32767).addComponent(this.a, -2, -1, -2).addContainerGap(101, 32767)))));
        pnlPrincipalLayout.setVerticalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addContainerGap().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.a, -2, -1, -2)).addGap(15, 15, 15).addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.a, -2, -1, -2).addContainerGap(18, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.b, -1, -1, 32767).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.b, -2, -1, -2).addContainerGap(-1, 32767)));
        this.pack();
    }

    public void addActionListener(EventListener listener) {
        this.b.addActionListener((ActionListener)listener);
        this.a.addActionListener((ActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public boolean containsCertificate() {
        return this.a.getItemCount() > 0;
    }

    public void setListaCertificado(List<CertificadoInfoTO> lista) {
        this.a.removeAllItems();
        CertificadoInfoTO ultimoUtilizado = null;
        if (lista != null) {
            for (CertificadoInfoTO certificado : lista) {
                if (ultimoUtilizado == null || ultimoUtilizado.getDataUtilizacao() == null) {
                    ultimoUtilizado = certificado;
                }
                if (certificado.getDataUtilizacao() != null && ultimoUtilizado.getDataUtilizacao() != null && certificado.getDataUtilizacao().after(ultimoUtilizado.getDataUtilizacao())) {
                    ultimoUtilizado = certificado;
                }
                this.a.addItem(certificado);
            }
        }
        if (this.a.getItemCount() > 0) {
            this.a.setSelectedItem((Object)ultimoUtilizado);
        }
    }

    public String getSenhaArquivo() {
        String pwd = new String(this.a.getPassword());
        return pwd;
    }

    public CertificadoInfoTO getSelectedCertificadoInfoTO() {
        return (CertificadoInfoTO)this.a.getSelectedItem();
    }

    public void setSelectedCertificadoTO(CertificadoTO certificadoTO) {
        this.a = certificadoTO;
    }

    public CertificadoTO getSelectedCertificadoTO() {
        return this.a;
    }

    public void setTipoCertificado(TipoCertificadoEnum tipoCertificado) {
        this.a = tipoCertificado;
    }

    public TipoCertificadoEnum getTipoCertificado() {
        return this.a;
    }

    private static CertificadoTO a(Component parent, TipoCertificadoEnum tipoCertificado) throws NaoExisteCertificadoBDException, NaoExisteCertificadoWindowsException {
        try {
            SelecionarCertificadoGUI gui = parent instanceof Dialog ? new SelecionarCertificadoGUI((Dialog)parent, tipoCertificado) : (parent instanceof Frame ? new SelecionarCertificadoGUI((Frame)parent, tipoCertificado) : new SelecionarCertificadoGUI((Frame)DSENDesktop.getInstance(), tipoCertificado));
            if (gui.containsCertificate()) {
                gui.setLocationRelativeTo(null);
                gui.setVisible(true);
                return gui.getSelectedCertificadoTO();
            }
            if (gui.isIE()) {
                throw new NaoExisteCertificadoWindowsException(null, null);
            }
            throw new NaoExisteCertificadoBDException(null, null);
        }
        catch (DSGEViewException ex) {
            DSGEMessageDialog.showErrors((DSGEBaseException)ex);
            return null;
        }
    }

    public static CertificadoTO getCertificado(TipoCertificadoEnum tipoCertificado) {
        return SelecionarCertificadoGUI.getCertificado((Component)null, (TipoCertificadoEnum)tipoCertificado);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static CertificadoTO getCertificado(Component parent, TipoCertificadoEnum tipoCertificado) {
        CertificadoTO certificado = null;
        do {
            try {
                return SelecionarCertificadoGUI.a((Component)parent, (TipoCertificadoEnum)tipoCertificado);
            }
            catch (NaoExisteCertificadoWindowsException e) {
                String sistemaOperacionalStr = System.getProperty("os.name") != null ? System.getProperty("os.name").toLowerCase() : "";
                if (sistemaOperacionalStr.indexOf("windows") < 0) return certificado;
                int n = JOptionPane.showOptionDialog((Component)DSENDesktop.getInstance(), DSENMessageConstants.NAO_EXISTE_CERTIFICADO_WINDOWS_CADASTRADO, DSENMessageConstants.CERTIFICADO_NAO_ENCONTRADO, 0, 2, null, new Object[]{"Repetir", "Cancelar"}, "Repetir");
                if (n != 0) return certificado;
                continue;
            }
            break;
        } while (true);
        catch (NaoExisteCertificadoBDException e) {
            JOptionPane.showMessageDialog((Component)DSENDesktop.getInstance(), DSENMessageConstants.NAO_EXISTE_CERTIFICADO_CADASTRADO, DSENMessageConstants.CERTIFICADO_NAO_ENCONTRADO, 2);
        }
        return certificado;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    public void setIE(boolean ie) {
        this.a = ie;
        this.a.setVisible(!ie);
        this.b.setVisible(!ie);
    }

    public boolean isIE() {
        return this.a;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 10) {
            this.b.doClick();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}

