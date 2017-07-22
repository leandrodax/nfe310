/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.message.DSGEExceptionGUI
 *  br.gov.sp.fazenda.dsge.view.message.DSGEExceptionGUI$1
 *  br.gov.sp.fazenda.dsge.view.message.DSGEExceptionGUI$2
 *  br.gov.sp.fazenda.dsge.view.message.DSGEExceptionGUI$3
 *  br.gov.sp.fazenda.dsge.view.message.DSGEMessageDialog
 *  br.gov.sp.fazenda.dsge.view.util.DSGEWindowUtilHelper
 *  br.gov.sp.fazenda.dsge.view.util.FileChooserHelper
 */
package br.gov.sp.fazenda.dsge.view.message;

import br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.message.DSGEExceptionGUI;
import br.gov.sp.fazenda.dsge.view.message.DSGEMessageDialog;
import br.gov.sp.fazenda.dsge.view.util.DSGEWindowUtilHelper;
import br.gov.sp.fazenda.dsge.view.util.FileChooserHelper;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.text.MessageFormat;
import java.util.EventListener;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;

public class DSGEExceptionGUI
extends JDialog {
    private static final long a = -8944540748656398584L;
    Throwable a;
    private JButton a;
    private JButton b;
    private JCheckBox a;
    private JLabel a;
    private JPanel a;
    private JScrollPane a;
    private JLabel b;
    private JPanel b;
    private JTextArea a;

    public DSGEExceptionGUI(Window owner, Throwable ex) {
        super(owner);
        this.a = ex;
        this.a();
        this.setModal(true);
        this.b.setText("<html><p>" + DSGEMessageConstants.OCORREU_UM_ERRO_INESPERADO + "</p></html>");
        this.a.setText(ex.getMessage() + "\n" + this.a(ex));
        this.a.setVisible(false);
        this.b.setVisible(false);
        this.setSize(571, 170);
        DSGEWindowUtilHelper.centralizarDialogo((Component)owner, (JDialog)this);
        Frame mainAppFrame = DSGEWindowUtilHelper.getAppFrame();
        if (mainAppFrame != null) {
            this.setIconImage(mainAppFrame.getIconImage());
        }
    }

    public DSGEExceptionGUI(Throwable ex) {
        this(null, ex);
    }

    private String a(Throwable ex) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        ex.printStackTrace(pw);
        pw.close();
        try {
            baos.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return new String(baos.toByteArray());
    }

    private void a() {
        this.b = new JLabel();
        this.a = new JLabel();
        this.b = new JPanel();
        this.a = new JScrollPane();
        this.a = new JTextArea();
        this.a = new JCheckBox();
        this.a = new JPanel();
        this.b = new JButton();
        this.a = new JButton();
        this.setDefaultCloseOperation(2);
        this.setTitle("Erro no Sistema");
        this.setResizable(false);
        this.b.setText(" ");
        this.a.setIcon(new ImageIcon(this.getClass().getResource("/br/gov/sp/fazenda/dsge/view/resources/error_medium.gif")));
        this.a.setColumns(20);
        this.a.setEditable(false);
        this.a.setLineWrap(true);
        this.a.setRows(5);
        this.a.setWrapStyleWord(true);
        this.a.setViewportView(this.a);
        GroupLayout pnlDetalhesLayout = new GroupLayout(this.b);
        this.b.setLayout(pnlDetalhesLayout);
        pnlDetalhesLayout.setHorizontalGroup(pnlDetalhesLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 555, 32767));
        pnlDetalhesLayout.setVerticalGroup(pnlDetalhesLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -2, 134, -2));
        this.a.setText("Mostrar Detalhes");
        this.a.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.a.setMargin(new Insets(0, 0, 0, 0));
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.b.setText("Salvar");
        this.b.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.setText("Fechar");
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.b, -1, 71, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, -1, 32767).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.a).addGap(16, 16, 16).addComponent(this.b, -1, 509, 32767)).addComponent(this.a).addComponent(this.b, -1, -1, 32767)).addContainerGap()).addGroup(layout.createSequentialGroup().addContainerGap(201, 32767).addComponent(this.a, -1, -1, 32767).addContainerGap(203, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.a).addComponent(this.b)).addGap(14, 14, 14).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 8, 32767).addComponent(this.a, -2, -1, -2).addContainerGap()));
        layout.linkSize(1, this.a, this.b);
        this.pack();
    }

    private void b() {
        String path = FileChooserHelper.chooseFile((Component)this, (String)"erro.txt", (FileNameExtensionFilter)new FileNameExtensionFilter("Arquivos de texto (*.txt)", "txt"));
        if (path == null) {
            return;
        }
        File f = new File(path);
        try {
            PrintWriter p = new PrintWriter(f);
            this.a.printStackTrace(p);
            p.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            DSGEMessageDialog.showMessage((Window)this, (String)MessageFormat.format(DSGEMessageConstants.NAO_FOI_POSSIVEL_SALVAR_ARQUIVO, f.getAbsolutePath()));
        }
    }

    private void a(ActionEvent evt) {
        this.b();
    }

    private void b(ActionEvent evt) {
        this.setVisible(false);
        this.dispose();
    }

    private void c(ActionEvent evt) {
        JCheckBox c = (JCheckBox)evt.getSource();
        this.a.setVisible(c.isSelected());
        if (c.isSelected()) {
            this.b.setVisible(true);
            this.setSize(571, 271);
        } else {
            this.b.setVisible(false);
            this.setSize(571, 170);
        }
    }

    public void addActionListener(EventListener listener) {
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
    }

    static /* synthetic */ void a(DSGEExceptionGUI x0, ActionEvent x1) {
        x0.c(x1);
    }

    static /* synthetic */ void b(DSGEExceptionGUI x0, ActionEvent x1) {
        x0.a(x1);
    }

    static /* synthetic */ void c(DSGEExceptionGUI x0, ActionEvent x1) {
        x0.b(x1);
    }
}

