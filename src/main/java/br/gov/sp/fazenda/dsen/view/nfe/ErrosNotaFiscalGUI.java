/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ErroNFeTO
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.nfe.ErrosNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ErrosNotaFiscalGUI$1
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener
 */
package br.gov.sp.fazenda.dsen.view.nfe;

import br.gov.sp.fazenda.dsen.common.to.ErroNFeTO;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.nfe.ErrosNotaFiscalGUI;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.EventListener;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;

public class ErrosNotaFiscalGUI
extends DSGESimplePanel {
    private static final long a = 2974915961847383887L;
    private JButton a;
    private JScrollPane a;
    private JDSGEPageableTable<ErroNFeTO> a;

    public ErrosNotaFiscalGUI() {
        this.b();
        this.a();
        this.c();
    }

    private void a() {
        this.a.setActionCommand("ACTION_HIDE_ERROR_PANEL");
    }

    private void b() {
        this.a = new JScrollPane();
        this.a = new JButton();
        this.setBorder((Border)BorderFactory.createTitledBorder(null, "Erros", 2, 0, new Font("Dialog", 1, 14), Color.red));
        this.setPreferredSize(new Dimension(700, 200));
        this.a.setPreferredSize(new Dimension(700, 50));
        this.a.setFont(new Font("Dialog", 1, 10));
        this.a.setText("Fechar");
        this.a.setMargin(new Insets(1, 8, 1, 8));
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, 666, 32767)).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(324, 32767).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 297, 32767))).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.a, -1, 146, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a)));
    }

    public void addActionListener(EventListener listener) {
        this.a.addActionListener((ActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
    }

    private void a(List<ErroNFeTO> retDet) {
        if (retDet == null) {
            return;
        }
        ImageIcon warningIcon = new ImageIcon(DSENDesktop.class.getResource("resources/warning.gif"));
        ImageIcon errorIcon = new ImageIcon(DSENDesktop.class.getResource("resources/error.gif"));
        for (ErroNFeTO ret : retDet) {
            String tipoOcorrencia;
            String string = tipoOcorrencia = ret.getTipoOcorrencia() == null ? "" : ret.getTipoOcorrencia().trim();
            if (ErroNFeTO.OCORRENCIA_ERRO.equals(tipoOcorrencia)) {
                ret.setIcon(errorIcon);
                continue;
            }
            if (!ErroNFeTO.OCORRENCIA_ALERTA.equals(tipoOcorrencia)) continue;
            ret.setIcon(warningIcon);
        }
    }

    public void setErros(List<ErroNFeTO> erros) {
        this.a.removeAllTO();
        if (erros != null) {
            this.a(erros);
            this.a.addTO(erros);
        }
    }

    private void c() {
        this.a = new JDSGEPageableTable();
        int columnIndex = 0;
        this.a.addColumn(columnIndex++, "icon", "", false, "icon");
        this.a.addColumn(columnIndex++, "tipoOcorrencia", "Tipo", false, "tipoOcorrencia");
        this.a.addColumn(columnIndex++, "aba", "Local", false, "aba");
        this.a.addColumn(columnIndex++, "nomeCampo", "Campo", false, "nomeCampo");
        this.a.addColumn(columnIndex++, "descricao", "Descri\u00e7\u00e3o do Erro/Alerta", false, "descricao");
        this.a.setSortable(true);
        this.a.setPageable(false);
        this.a.setSelectAllAvailable(false);
        this.a.setAutoFitTableColumns(true);
        this.a.setScrollPane(this.a);
        this.a.addPageableSortableListener((PageableSortableTableActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    public boolean containsErrors() {
        List toList = this.a.getAllTO();
        for (ErroNFeTO erroTO : toList) {
            if (!ErroNFeTO.OCORRENCIA_ERRO.equalsIgnoreCase(erroTO.getTipoOcorrencia())) continue;
            return true;
        }
        return false;
    }

    public boolean containsWarnings() {
        List toList = this.a.getAllTO();
        for (ErroNFeTO erroTO : toList) {
            if (!ErroNFeTO.OCORRENCIA_ALERTA.equalsIgnoreCase(erroTO.getTipoOcorrencia())) continue;
            return true;
        }
        return false;
    }
}

