/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO
 *  br.gov.sp.fazenda.dsen.common.to.EstabelecimentoTO
 *  br.gov.sp.fazenda.dsen.view.ConsultaCadastroPnlInformacoesCadastraisGUI
 *  br.gov.sp.fazenda.dsen.view.ConsultaCadastroPnlResultadoConsultaGUI
 *  br.gov.sp.fazenda.dsen.view.ConsultaCadastroPnlTableResultadoGUI
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.CNPJFormatter
 *  br.gov.sp.fazenda.dsge.view.format.DateFormatter
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO;
import br.gov.sp.fazenda.dsen.common.to.EstabelecimentoTO;
import br.gov.sp.fazenda.dsen.view.ConsultaCadastroPnlInformacoesCadastraisGUI;
import br.gov.sp.fazenda.dsen.view.ConsultaCadastroPnlTableResultadoGUI;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.CNPJFormatter;
import br.gov.sp.fazenda.dsge.view.format.DateFormatter;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EventListener;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;

public class ConsultaCadastroPnlResultadoConsultaGUI
extends DSGESimplePanel
implements ActionListener {
    ConsultaCadastroTO a;
    private JPanel a;
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JLabel f;
    private JPanel b;
    private JFormattedTextField a;
    private JFormattedTextField b;
    private JTextField a;
    private JTextField b;
    private JTextField c;
    private JTextField d;
    private DateFormatter a;
    private CNPJFormatter a;
    private ConsultaCadastroPnlInformacoesCadastraisGUI a;
    private ConsultaCadastroPnlTableResultadoGUI a;

    public ConsultaCadastroPnlResultadoConsultaGUI(ConsultaCadastroTO to) throws DSGEViewException {
        this.a();
        this.b();
        this.a(to);
        this.a = to;
    }

    private void a(ConsultaCadastroTO to) throws DSGEViewException {
        this.c.setText(to.getCStat());
        this.a.setText(to.getXMotivo());
        this.b.setText(to.getListaEstabelecimentoTO() == null ? "0" : "" + to.getListaEstabelecimentoTO().size() + "");
        this.d.setText(to.getUf());
        if (!StringHelper.isBlankOrNull((Object)to.getCPF())) {
            this.b.setText(to.getCPF());
            this.c.setText("CPF Consultado");
        } else if (!StringHelper.isBlankOrNull((Object)to.getCNPJ())) {
            this.b.setText(to.getCNPJ());
            this.c.setText("CNPJ Consultado");
        } else if (!StringHelper.isBlankOrNull((Object)to.getIeSuframa())) {
            this.b.setText(to.getIeSuframaFormatada());
            this.c.setText("Inscri\u00e7\u00e3o SUFRAMA Consultada");
        } else {
            this.b.setText(to.getIEFormatada());
            this.c.setText("IE Consultada");
        }
        this.a.setText(DateHelper.formataDataHora((Date)to.getDhCons(), (SimpleDateFormat)DateHelper.DATE_FORMAT));
        this.a(to.getListaEstabelecimentoTO());
    }

    private void a(List<EstabelecimentoTO> list) throws DSGEViewException {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (list.size() == 1) {
            this.createPnlInformacoesCadastrais(list.get(0), false);
        } else {
            this.b(list);
        }
    }

    public void createPnlInformacoesCadastrais(EstabelecimentoTO estabelecimentoTO, boolean btnVoltarVisible) throws DSGEViewException {
        this.a = new ConsultaCadastroPnlInformacoesCadastraisGUI(estabelecimentoTO);
        this.a.setBtnVoltarVisible(btnVoltarVisible);
        this.a((Component)this.a);
        this.a.addActionListener((ActionListener)this);
    }

    private void b(List<EstabelecimentoTO> list) {
        this.a = new ConsultaCadastroPnlTableResultadoGUI();
        this.a.addTO(list);
        this.a((Component)this.a);
        this.a.addActionListener((ActionListener)this);
    }

    private void a(Component c) {
        this.b.removeAll();
        this.b.setLayout(new BorderLayout());
        this.b.add(c);
        this.b.validate();
        this.b.repaint();
    }

    private void a() throws DSGEViewException {
        try {
            this.a = new CNPJFormatter();
            this.a = new DateFormatter();
        }
        catch (ParseException e) {
            throw new DSGEViewException((Throwable)e, e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if ("voltar".equals(e.getActionCommand())) {
                this.b(this.a.getListaEstabelecimentoTO());
            } else if ("detalhar".equals(e.getActionCommand())) {
                EstabelecimentoTO to = this.a.getSelectedTO();
                this.createPnlInformacoesCadastrais(to, true);
            }
        }
        catch (DSGEBaseException ex) {
            this.showErrors(ex);
        }
    }

    private void b() {
        this.b = new JPanel();
        this.a = new JPanel();
        this.c = new JTextField();
        this.b = new JFormattedTextField();
        this.a = new JTextField();
        this.b = new JLabel();
        this.c = new JLabel();
        this.e = new JLabel();
        this.a = new JLabel();
        this.a = new JFormattedTextField();
        this.d = new JTextField();
        this.f = new JLabel();
        this.b = new JTextField();
        this.d = new JLabel();
        GroupLayout pnlInformacoesCadastraisLayout = new GroupLayout(this.b);
        this.b.setLayout(pnlInformacoesCadastraisLayout);
        pnlInformacoesCadastraisLayout.setHorizontalGroup(pnlInformacoesCadastraisLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 552, 32767));
        pnlInformacoesCadastraisLayout.setVerticalGroup(pnlInformacoesCadastraisLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 273, 32767));
        this.a.setBorder(BorderFactory.createTitledBorder("Informa\u00e7\u00f5es da Requisi\u00e7\u00e3o"));
        this.c.setEditable(false);
        this.c.setHorizontalAlignment(4);
        this.b.setEditable(false);
        this.b.setHorizontalAlignment(4);
        this.a.setEditable(false);
        this.b.setFont(new Font("Dialog", 1, 11));
        this.b.setText("Descri\u00e7\u00e3o");
        this.c.setFont(new Font("Dialog", 1, 11));
        this.c.setText("CNPJ/CPF/IE Consultada");
        this.e.setFont(new Font("Dialog", 1, 11));
        this.e.setText("Status");
        this.a.setFont(new Font("Dialog", 1, 11));
        this.a.setText("Data da Consulta");
        this.a.setEditable(false);
        this.a.setHorizontalAlignment(4);
        this.d.setEditable(false);
        this.f.setFont(new Font("Dialog", 1, 11));
        this.f.setText("UF de Atendimento");
        this.b.setEditable(false);
        this.b.setHorizontalAlignment(4);
        this.d.setFont(new Font("Dialog", 1, 11));
        this.d.setText("Ocorr\u00eancias");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.c).addComponent(this.b, -2, 176, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.a, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.a, GroupLayout.Alignment.LEADING, -2, 108, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.b).addComponent(this.d)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.d, -2, 34, -2).addComponent(this.f))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.e).addComponent(this.c, -2, 39, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.b).addGap(412, 412, 412)).addComponent(this.a, -1, 471, 32767)))).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.e).addComponent(this.b)).addGap(2, 2, 2).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a, -2, -1, -2).addComponent(this.c, -2, -1, -2)).addGap(3, 3, 3).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.c).addGap(2, 2, 2).addComponent(this.b, -2, -1, -2)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.a).addGap(2, 2, 2).addComponent(this.a, -2, -1, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.f).addGap(2, 2, 2).addComponent(this.d, -2, -1, -2))).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.d).addGap(2, 2, 2).addComponent(this.b, -2, -1, -2))))));
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.b, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.a, GroupLayout.Alignment.LEADING, -1, -1, 32767)).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.a, -2, -1, -2).addGap(2, 2, 2).addComponent(this.b, -1, -1, 32767).addGap(4, 4, 4)));
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public void addActionListener(EventListener listener) {
    }
}

