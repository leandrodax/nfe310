/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.IndCredCTeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.IndCredNFeEnum
 *  br.gov.sp.fazenda.dsen.common.to.EstabelecimentoTO
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.ConsultaCadastroPnlInformacoesCadastraisGUI
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.util.MunicipioTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.CEPFormatter
 *  br.gov.sp.fazenda.dsge.view.format.CNPJFormatter
 *  br.gov.sp.fazenda.dsge.view.format.CPFFormatter
 *  br.gov.sp.fazenda.dsge.view.format.DateFormatter
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.enumeration.IndCredCTeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.IndCredNFeEnum;
import br.gov.sp.fazenda.dsen.common.to.EstabelecimentoTO;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.util.MunicipioTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.CEPFormatter;
import br.gov.sp.fazenda.dsge.view.format.CNPJFormatter;
import br.gov.sp.fazenda.dsge.view.format.CPFFormatter;
import br.gov.sp.fazenda.dsge.view.format.DateFormatter;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;

public class ConsultaCadastroPnlInformacoesCadastraisGUI
extends JPanel {
    private JButton a;
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
    private JLabel k;
    private JLabel l;
    private JLabel m;
    private JLabel n;
    private JLabel o;
    private JLabel p;
    private JLabel q;
    private JLabel r;
    private JLabel s;
    private JLabel t;
    private JLabel u;
    private JPanel a;
    private JFormattedTextField a;
    private JFormattedTextField b;
    private JFormattedTextField c;
    private JFormattedTextField d;
    private JFormattedTextField e;
    private JFormattedTextField f;
    private JFormattedTextField g;
    private JFormattedTextField h;
    private JFormattedTextField i;
    private JFormattedTextField j;
    private JTextField a;
    private JTextField b;
    private JTextField c;
    private JTextField d;
    private JTextField e;
    private JTextField f;
    private JTextField g;
    private JTextField h;
    private JTextField i;
    private JTextField j;
    private JTextField k;
    private DateFormatter a;
    private CEPFormatter a;
    private CNPJFormatter a;
    private CPFFormatter a;

    public ConsultaCadastroPnlInformacoesCadastraisGUI(EstabelecimentoTO estabelecimentoTO) throws DSGEViewException {
        this.b();
        this.c();
        this.a();
        this.a.setVisible(false);
        this.setEstabelecimentoTO(estabelecimentoTO);
    }

    public void setBtnVoltarVisible(boolean visible) {
        this.a.setVisible(visible);
    }

    private void a() {
        this.a.setActionCommand("voltar");
    }

    public void addActionListener(ActionListener aL) {
        this.a.addActionListener(aL);
    }

    public void setEstabelecimentoTO(EstabelecimentoTO to) {
        this.h.setText(to.getXNome());
        this.c.setText(to.getXFant());
        if (!StringHelper.isBlankOrNull((Object)to.getCPF())) {
            this.a.install(this.i);
            this.i.setText(to.getCPF());
            this.q.setText("CPF");
        } else {
            this.a.install(this.i);
            this.i.setText(to.getCNPJ());
            this.q.setText("CNPJ");
        }
        this.f.setText(to.getIEFormatada());
        this.g.setText(to.getIEAtualFormatada());
        this.h.setText(to.getIEUnicaFormatada());
        this.a.setText(to.getCNAE());
        this.k.setText(to.getUF());
        this.j.setText(to.getSituacao());
        this.i.setText(to.getXRegApur());
        this.c.setText(DateHelper.formataData((Date)to.getDBaixa()));
        this.d.setText(DateHelper.formataData((Date)to.getDataIniAtiv()));
        this.e.setText(DateHelper.formataData((Date)to.getDUltSit()));
        this.d.setText(to.getIndCredCTe().getCodigo() + "-" + to.getIndCredCTe().getDescricao());
        this.e.setText(to.getIndCredNFe().getCodigo() + "-" + to.getIndCredNFe().getDescricao());
        if (!(StringHelper.isBlankOrNull((Object)to.getXLgr()) && StringHelper.isBlankOrNull((Object)to.getXCpl()) && StringHelper.isBlankOrNull((Object)to.getNro()) && StringHelper.isBlankOrNull((Object)to.getCEP()) && StringHelper.isBlankOrNull((Object)to.getXBairro()) && StringHelper.isBlankOrNull((Object)to.getXMun()) && StringHelper.isBlankOrNull((Object)to.getCMun()))) {
            this.f.setText(to.getXLgr());
            this.b.setText(to.getXCpl());
            this.j.setText(to.getNro());
            this.b.setText(to.getCEP());
            this.a.setText(to.getXBairro());
            String mun = null;
            if (!StringHelper.isBlankOrNull((Object)to.getXMun())) {
                mun = to.getXMun();
            } else if (!StringHelper.isBlankOrNull((Object)to.getCMun())) {
                try {
                    MunicipioTO munTO = DSENUtilHelper.getInstance().getMunicipioTO(to.getCMun());
                    if (munTO != null) {
                        mun = munTO.getNome();
                    }
                }
                catch (DSGEUtilException munTO) {
                    // empty catch block
                }
            }
            this.g.setText(mun);
            this.a.setVisible(true);
        } else {
            this.a.setVisible(false);
        }
    }

    private void b() throws DSGEViewException {
        try {
            this.a = new CNPJFormatter();
            this.a = new CPFFormatter();
            this.a = new CEPFormatter();
            this.a = new DateFormatter();
        }
        catch (ParseException e) {
            throw new DSGEViewException((Throwable)e, e.getMessage());
        }
    }

    private void c() {
        this.p = new JLabel();
        this.h = new JTextField();
        this.k = new JTextField();
        this.u = new JLabel();
        this.t = new JLabel();
        this.j = new JTextField();
        this.i = new JTextField();
        this.s = new JLabel();
        this.f = new JLabel();
        this.d = new JFormattedTextField();
        this.e = new JFormattedTextField();
        this.g = new JLabel();
        this.c = new JFormattedTextField();
        this.e = new JLabel();
        this.j = new JLabel();
        this.h = new JFormattedTextField();
        this.g = new JFormattedTextField();
        this.k = new JLabel();
        this.a = new JPanel();
        this.n = new JLabel();
        this.f = new JTextField();
        this.r = new JLabel();
        this.j = new JFormattedTextField();
        this.d = new JLabel();
        this.b = new JTextField();
        this.a = new JLabel();
        this.a = new JTextField();
        this.c = new JLabel();
        this.b = new JFormattedTextField();
        this.a.install(this.b);
        this.o = new JLabel();
        this.g = new JTextField();
        this.i = new JFormattedTextField();
        this.q = new JLabel();
        this.i = new JLabel();
        this.f = new JFormattedTextField();
        this.b = new JLabel();
        this.a = new JFormattedTextField();
        this.a = new JButton();
        this.c = new JTextField();
        this.h = new JLabel();
        this.m = new JLabel();
        this.e = new JTextField();
        this.l = new JLabel();
        this.d = new JTextField();
        this.setBorder((Border)BorderFactory.createTitledBorder("Informa\u00e7\u00f5es Cadastrais do Contribuinte"));
        this.p.setFont(new Font("Dialog", 1, 11));
        this.p.setText("Nome/Raz\u00e3o Social");
        this.h.setEditable(false);
        this.k.setEditable(false);
        this.u.setFont(new Font("Dialog", 1, 11));
        this.u.setText("UF");
        this.t.setFont(new Font("Dialog", 1, 11));
        this.t.setText("Situa\u00e7\u00e3o");
        this.j.setEditable(false);
        this.i.setEditable(false);
        this.s.setFont(new Font("Dialog", 1, 11));
        this.s.setText("Regime de Apura\u00e7\u00e3o do ICMS");
        this.f.setFont(new Font("Dialog", 1, 11));
        this.f.setText("Data de In\u00edcio");
        this.d.setEditable(false);
        this.d.setHorizontalAlignment(4);
        this.e.setEditable(false);
        this.e.setHorizontalAlignment(4);
        this.g.setFont(new Font("Dialog", 1, 11));
        this.g.setText("Data da \u00dalt. Modif.");
        this.c.setEditable(false);
        this.c.setHorizontalAlignment(4);
        this.e.setFont(new Font("Dialog", 1, 11));
        this.e.setText("Data de Baixa");
        this.j.setFont(new Font("Dialog", 1, 11));
        this.j.setText("IE \u00danica");
        this.h.setEditable(false);
        this.h.setHorizontalAlignment(4);
        this.g.setEditable(false);
        this.g.setHorizontalAlignment(4);
        this.k.setFont(new Font("Dialog", 1, 11));
        this.k.setText("IE Atual");
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Endere\u00e7o", 1, 2));
        this.n.setFont(new Font("Dialog", 1, 11));
        this.n.setText("Logradouro");
        this.f.setEditable(false);
        this.r.setFont(new Font("Dialog", 1, 11));
        this.r.setText("N\u00famero");
        this.j.setEditable(false);
        this.j.setHorizontalAlignment(4);
        this.d.setFont(new Font("Dialog", 1, 11));
        this.d.setText("Complemento");
        this.b.setEditable(false);
        this.a.setFont(new Font("Dialog", 1, 11));
        this.a.setText("Bairro");
        this.a.setEditable(false);
        this.c.setFont(new Font("Dialog", 1, 11));
        this.c.setText("CEP");
        this.b.setEditable(false);
        this.b.setHorizontalAlignment(4);
        this.o.setFont(new Font("Dialog", 1, 11));
        this.o.setText("Munic\u00edpio");
        this.g.setEditable(false);
        GroupLayout pnlEnderecoLayout = new GroupLayout(this.a);
        this.a.setLayout(pnlEnderecoLayout);
        pnlEnderecoLayout.setHorizontalGroup(pnlEnderecoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlEnderecoLayout.createSequentialGroup().addContainerGap().addGroup(pnlEnderecoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlEnderecoLayout.createSequentialGroup().addGroup(pnlEnderecoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.n).addComponent(this.d).addComponent(this.a).addComponent(this.a, -1, 312, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlEnderecoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.o).addComponent(this.g, -1, 311, 32767))).addGroup(GroupLayout.Alignment.TRAILING, pnlEnderecoLayout.createSequentialGroup().addGroup(pnlEnderecoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.b, GroupLayout.Alignment.LEADING, -1, 469, 32767).addComponent(this.f, -1, 469, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlEnderecoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.j, GroupLayout.Alignment.TRAILING).addComponent(this.b, GroupLayout.Alignment.TRAILING, -1, 154, 32767).addComponent(this.r).addComponent(this.c)))).addContainerGap()));
        pnlEnderecoLayout.setVerticalGroup(pnlEnderecoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlEnderecoLayout.createSequentialGroup().addGroup(pnlEnderecoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.n).addComponent(this.r)).addGap(2, 2, 2).addGroup(pnlEnderecoLayout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(this.f, -2, 19, -2).addComponent(this.j, -2, -1, -2)).addGap(3, 3, 3).addGroup(pnlEnderecoLayout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(this.c).addComponent(this.d)).addGap(2, 2, 2).addGroup(pnlEnderecoLayout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(this.b, -2, -1, -2).addComponent(this.b, -2, -1, -2)).addGap(3, 3, 3).addGroup(pnlEnderecoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(pnlEnderecoLayout.createSequentialGroup().addComponent(this.a).addGap(2, 2, 2).addComponent(this.a, -2, -1, -2)).addGroup(pnlEnderecoLayout.createSequentialGroup().addComponent(this.o).addGap(2, 2, 2).addComponent(this.g, -2, -1, -2)))));
        this.i.setEditable(false);
        this.i.setHorizontalAlignment(4);
        this.q.setFont(new Font("Dialog", 1, 11));
        this.q.setText("CNPJ/CPF");
        this.i.setFont(new Font("Dialog", 1, 11));
        this.i.setText("IE");
        this.f.setEditable(false);
        this.f.setHorizontalAlignment(4);
        this.b.setFont(new Font("Dialog", 1, 11));
        this.b.setText("CNAE");
        this.a.setEditable(false);
        this.a.setHorizontalAlignment(4);
        this.a.setText("Voltar");
        this.a.setMargin(new Insets(1, 7, 1, 7));
        this.c.setEditable(false);
        this.h.setFont(new Font("Dialog", 1, 11));
        this.h.setText("Nome Fantasia");
        this.m.setFont(new Font("Dialog", 1, 11));
        this.m.setText("Indicador de contribuinte credenciado a emitir NF-e");
        this.e.setEditable(false);
        this.l.setFont(new Font("Dialog", 1, 11));
        this.l.setText("Indicador de contribuinte credenciado a emitir CT-e");
        this.d.setEditable(false);
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.f, -2, 89, -2).addComponent(this.d, -2, 101, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.e, -2, 107, -2).addComponent(this.g)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.e).addComponent(this.c, -2, 107, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.j).addComponent(this.h, -2, 145, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.k).addComponent(this.g, -2, 106, -2))).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.q).addComponent(this.i, -2, 194, -2).addComponent(this.t).addComponent(this.j, -2, 183, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.s).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.i).addComponent(this.f, -2, 143, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.b).addComponent(this.a, -2, 121, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.k, -2, 34, -2).addComponent(this.u)).addGap(93, 93, 93)).addComponent(this.i, -1, 465, 32767))).addComponent(this.h).addComponent(this.c, -1, 665, 32767).addComponent(this.h, -1, 665, 32767).addComponent(this.p).addComponent(this.a, -1, -1, 32767).addComponent(this.a).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.m).addComponent(this.e, -1, 329, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.l).addComponent(this.d, -1, 330, 32767)).addGap(0, 0, 0))).addContainerGap()));
        layout.linkSize(0, this.i, this.j);
        layout.linkSize(0, this.c, this.d, this.e);
        layout.linkSize(0, this.g, this.h);
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.p).addGap(2, 2, 2).addComponent(this.h, -2, -1, -2).addGap(3, 3, 3).addComponent(this.h).addGap(2, 2, 2).addComponent(this.c, -2, -1, -2).addGap(3, 3, 3).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addComponent(this.q).addGap(2, 2, 2).addComponent(this.i, -2, -1, -2)).addGroup(layout.createSequentialGroup().addComponent(this.i).addGap(2, 2, 2).addComponent(this.f, -2, -1, -2)).addGroup(layout.createSequentialGroup().addComponent(this.b).addGap(2, 2, 2).addComponent(this.a, -2, 19, -2)).addGroup(layout.createSequentialGroup().addComponent(this.u).addGap(2, 2, 2).addComponent(this.k, -2, -1, -2))).addGap(3, 3, 3).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.t).addComponent(this.s)).addGap(2, 2, 2).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.j, -2, -1, -2).addComponent(this.i, -2, -1, -2)).addGap(3, 3, 3).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.f).addComponent(this.g)).addGap(2, 2, 2).addComponent(this.d, -2, -1, -2)).addComponent(this.e, -2, -1, -2).addGroup(layout.createSequentialGroup().addComponent(this.e).addGap(2, 2, 2).addComponent(this.c, -2, -1, -2)).addGroup(layout.createSequentialGroup().addComponent(this.j).addGap(2, 2, 2).addComponent(this.h, -2, -1, -2)).addGroup(layout.createSequentialGroup().addComponent(this.k).addGap(2, 2, 2).addComponent(this.g, -2, -1, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addComponent(this.m).addGap(2, 2, 2).addComponent(this.e, -2, -1, -2)).addGroup(layout.createSequentialGroup().addComponent(this.l).addGap(2, 2, 2).addComponent(this.d, -2, -1, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addGap(0, 0, 32767)));
    }
}

