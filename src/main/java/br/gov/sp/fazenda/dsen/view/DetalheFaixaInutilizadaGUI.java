/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.ProcInutNFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TInutNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TInutNFe$InfInut
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TMod
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TMod$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProcInutNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetInutNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetInutNFe$InfInut
 *  br.gov.sp.fazenda.dsen.view.DetalheFaixaInutilizadaGUI
 *  br.gov.sp.fazenda.dsen.view.DetalheFaixaInutilizadaGUI$1
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.CNPJFormatter
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.ProcInutNFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TInutNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TMod;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProcInutNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetInutNFe;
import br.gov.sp.fazenda.dsen.view.DetalheFaixaInutilizadaGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.CNPJFormatter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.EventListener;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class DetalheFaixaInutilizadaGUI
extends DSGESimplePanel {
    private static final long a = 5225829151144847907L;
    private CNPJFormatter a;
    private JButton a;
    private JPanel a;
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JLabel f;
    private JLabel g;
    private JLabel h;
    private JLabel i;
    private JLabel j;
    private JFormattedTextField a;
    private JFormattedTextField b;
    private JFormattedTextField c;
    private JFormattedTextField d;
    private JFormattedTextField e;
    private JFormattedTextField f;
    private JTextField a;
    private JLabel k;
    private JLabel l;
    private JTextField b;

    public DetalheFaixaInutilizadaGUI(String procInut) {
        this.a();
        this.b();
        this.a(procInut);
    }

    private void a() {
        try {
            this.a = new CNPJFormatter();
        }
        catch (ParseException ex) {
            this.showErrors((Throwable)ex);
        }
    }

    private void a(String procInut) {
        try {
            ProcInutNFeDocument document = DocumentoUtil.getProcInutNFeDocument((String)procInut);
            TInutNFe inut = document.getProcInutNFe().getInutNFe();
            TRetInutNFe retInut = document.getProcInutNFe().getRetInutNFe();
            this.a.setText(inut.getInfInut().getCNPJ());
            this.b.setText(inut.getInfInut().getMod().toString());
            this.f.setText(StringHelper.completaComZerosAEsquerda((String)inut.getInfInut().getSerie(), (int)3));
            this.d.setText(StringHelper.completaComZerosAEsquerda((String)inut.getInfInut().getNNFIni(), (int)9));
            this.c.setText(StringHelper.completaComZerosAEsquerda((String)inut.getInfInut().getNNFFin(), (int)9));
            this.a.setText(retInut.getInfInut().getCStat());
            this.k.setText("<html><p>" + retInut.getInfInut().getXMotivo() + "</p></html>");
            this.l.setText("<html><p>" + inut.getInfInut().getXJust() + "</p></html>");
            if (!StringHelper.isBlankOrNull((Object)retInut.getInfInut().getDhRecbto())) {
                this.b.setText(retInut.getInfInut().getDhRecbto());
            }
            this.e.setText(retInut.getInfInut().getNProt());
        }
        catch (Throwable e) {
            this.showErrors(e);
        }
    }

    private void b() {
        this.a = new JPanel();
        this.a = new JButton();
        this.b = new JTextField();
        this.b = new JLabel();
        this.f = new JFormattedTextField();
        this.j = new JLabel();
        this.d = new JFormattedTextField();
        this.h = new JLabel();
        this.c = new JFormattedTextField();
        this.g = new JLabel();
        this.a = new JFormattedTextField();
        this.a.install(this.a);
        this.f = new JLabel();
        this.b = new JFormattedTextField();
        this.c = new JLabel();
        this.e = new JFormattedTextField();
        this.i = new JLabel();
        this.a = new JLabel();
        this.a = new JTextField();
        this.d = new JLabel();
        this.e = new JLabel();
        this.k = new JLabel();
        this.l = new JLabel();
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Detalhe da Inutiliza\u00e7\u00e3o", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.a.setText("Fechar");
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.b.setEditable(false);
        this.b.setHorizontalAlignment(4);
        this.b.setOpaque(false);
        this.b.setFont(new Font("SansSerif", 1, 11));
        this.b.setText("Modelo");
        this.f.setEditable(false);
        this.f.setHorizontalAlignment(4);
        this.f.setOpaque(false);
        this.j.setFont(new Font("SansSerif", 1, 11));
        this.j.setText("S\u00e9rie");
        this.d.setEditable(false);
        this.d.setHorizontalAlignment(4);
        this.d.setOpaque(false);
        this.h.setFont(new Font("SansSerif", 1, 11));
        this.h.setText("N\u00famero Inicial");
        this.c.setEditable(false);
        this.c.setHorizontalAlignment(4);
        this.c.setOpaque(false);
        this.g.setFont(new Font("SansSerif", 1, 11));
        this.g.setText("N\u00famero Final");
        this.a.setEditable(false);
        this.a.setHorizontalAlignment(4);
        this.a.setOpaque(false);
        this.f.setFont(new Font("Tahoma", 1, 11));
        this.f.setText("CNPJ");
        this.b.setEditable(false);
        this.b.setHorizontalAlignment(4);
        this.b.setOpaque(false);
        this.c.setFont(new Font("SansSerif", 1, 11));
        this.c.setText("Data da Inutiliza\u00e7\u00e3o");
        this.e.setEditable(false);
        this.e.setHorizontalAlignment(4);
        this.e.setOpaque(false);
        this.i.setFont(new Font("SansSerif", 1, 11));
        this.i.setText("N\u00famero do Protocolo");
        this.a.setFont(new Font("SansSerif", 1, 11));
        this.a.setText("C\u00f3digo de Retorno");
        this.a.setEditable(false);
        this.a.setOpaque(false);
        this.d.setFont(new Font("SansSerif", 1, 11));
        this.d.setText("Descri\u00e7\u00e3o do Retorno");
        this.e.setFont(new Font("SansSerif", 1, 11));
        this.e.setText("Justificativa para a Inutiliza\u00e7\u00e3o");
        this.k.setBorder(BorderFactory.createLineBorder(UIManager.getDefaults().getColor("TextPane.inactiveForeground")));
        this.k.setOpaque(true);
        this.l.setVerticalAlignment(1);
        this.l.setBorder(BorderFactory.createLineBorder(UIManager.getDefaults().getColor("TextField.inactiveForeground")));
        this.l.setOpaque(true);
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.l, -1, 738, 32767).addContainerGap()).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.c, GroupLayout.Alignment.LEADING).addComponent(this.f, GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.b, GroupLayout.Alignment.LEADING).addComponent(this.a, GroupLayout.Alignment.LEADING, -1, 191, 32767))).addGap(12, 12, 12).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.i).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.e, GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b).addComponent(this.b, -2, 51, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.f, -2, 50, -2).addComponent(this.j)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.d, -2, 156, -2).addComponent(this.h)))).addGap(12, 12, 12).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.g).addComponent(this.c, -2, 156, -2))))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.a, GroupLayout.Alignment.LEADING).addComponent(this.a, GroupLayout.Alignment.LEADING, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.k, -1, 621, 32767).addComponent(this.d)))).addContainerGap()).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.e, -1, -1, 32767).addGap(574, 574, 574)))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.j).addComponent(this.h).addComponent(this.g)).addGap(1, 1, 1).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.f, -2, -1, -2).addComponent(this.b, -2, -1, -2).addComponent(this.d, -2, -1, -2).addComponent(this.c, -2, -1, -2))).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.f).addGap(1, 1, 1).addComponent(this.a, -2, -1, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.c).addGap(1, 1, 1).addComponent(this.b, -2, -1, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.i).addGap(1, 1, 1).addComponent(this.e, -2, -1, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.a).addGap(1, 1, 1).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a, -2, -1, -2).addComponent(this.k, -2, 19, -2))).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.d).addGap(20, 20, 20))).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.e).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.l, -1, 115, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.a).addContainerGap()));
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
    }

    private void a(ActionEvent evt) {
        WindowManager.getInstance().closePanel();
    }

    public void addActionListener(EventListener listener) {
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    static /* synthetic */ void a(DetalheFaixaInutilizadaGUI x0, ActionEvent x1) {
        x0.a(x1);
    }
}

