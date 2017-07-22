/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.help.Help
 *  br.gov.sp.fazenda.dsen.help.exception.DSENHelpException
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$1
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$10
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$11
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$12
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$13
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$14
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$15
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$16
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$17
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$18
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$19
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$2
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$20
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$21
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$22
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$23
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$24
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$25
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$26
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$27
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$28
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$3
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$4
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$5
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$6
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$7
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$8
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder$9
 *  br.gov.sp.fazenda.dsge.common.enumeration.ServicoSefazEnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.view.message.DSGEMessageDialog
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.help.Help;
import br.gov.sp.fazenda.dsen.help.exception.DSENHelpException;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.DSENMenuBuilder;
import br.gov.sp.fazenda.dsge.common.enumeration.ServicoSefazEnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.view.message.DSGEMessageDialog;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/*
 * Exception performing whole class analysis ignored.
 */
public class DSENMenuBuilder {
    public DSENMenuBuilder() {
    }

    public static JMenuBar createMnus() {
        JMenuBar mnuPrincipal = new JMenuBar();
        mnuPrincipal.add(DSENMenuBuilder.b());
        mnuPrincipal.add(DSENMenuBuilder.a());
        mnuPrincipal.add(DSENMenuBuilder.e());
        mnuPrincipal.add(DSENMenuBuilder.d());
        mnuPrincipal.add(DSENMenuBuilder.c());
        return mnuPrincipal;
    }

    private static JMenu a() {
        JMenu mnuEmitente = new JMenu(DSENLabelConstants.MNU_EMITENTE);
        mnuEmitente.setMnemonic(DSENLabelConstants.MNU_EMITENTE_MNEMONIC);
        JMenuItem mnuEditarEmitente = new JMenuItem(DSENLabelConstants.MNU_EDITAR_EMITENTE);
        mnuEditarEmitente.setMnemonic(DSENLabelConstants.MNU_EDITAR_EMITENTE_MNEMONIC);
        mnuEditarEmitente.setAccelerator(KeyStroke.getKeyStroke("control shift E"));
        JMenuItem mnuSelecionarEmitente = new JMenuItem(DSENLabelConstants.MNU_SELECIONAR_OUTRO_EMITENTE);
        mnuSelecionarEmitente.setMnemonic(DSENLabelConstants.MNU_SELECIONAR_EMITENTE_MNEMONIC);
        mnuSelecionarEmitente.setAccelerator(KeyStroke.getKeyStroke("control alt O"));
        JMenuItem mnuDeslogarEmitente = new JMenuItem(DSENLabelConstants.MNU_DESLOGAR_EMITENTE);
        mnuDeslogarEmitente.setMnemonic(DSENLabelConstants.MNU_DESLOGAR_EMITENTE_MNEMONIC);
        mnuDeslogarEmitente.setAccelerator(KeyStroke.getKeyStroke("control alt S"));
        mnuEmitente.add(mnuEditarEmitente);
        mnuEmitente.add(mnuSelecionarEmitente);
        mnuEmitente.add(mnuDeslogarEmitente);
        mnuEditarEmitente.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        mnuSelecionarEmitente.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        mnuDeslogarEmitente.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        return mnuEmitente;
    }

    private static boolean a(EstadoTO estadoTO) {
        try {
            String url = DSENUtilHelper.getInstance().getURLPorUF(estadoTO, (ServicoSefazEnumItf)ServicoSefazEnum.RecepcaoEvento);
            if (url != null && !"".equals(url)) {
                return true;
            }
        }
        catch (DSGEBaseException ex) {
            DSGEMessageDialog.showErrors((DSGEBaseException)ex);
        }
        return false;
    }

    private static JMenu b() {
        JMenu mnuNota = new JMenu(DSENLabelConstants.MNU_NOTAS_FISCAIS);
        mnuNota.setMnemonic(DSENLabelConstants.MNU_NOTAS_FISCAIS_MNEMONIC);
        JMenuItem mnuEmitir = new JMenuItem(DSENLabelConstants.MNU_EMITIR_NOVA_NOTA);
        mnuEmitir.setMnemonic(DSENLabelConstants.MNU_EMITIR_NOVA_NOTA_MNEMONIC);
        mnuEmitir.setAccelerator(KeyStroke.getKeyStroke("control shift N"));
        JMenuItem mnuGerenciar = new JMenuItem(DSENLabelConstants.MNU_GERENCIAR_NOTAS);
        mnuGerenciar.setMnemonic(DSENLabelConstants.MNU_GERENCIAR_NOTAS_MNEMONIC);
        mnuGerenciar.setAccelerator(KeyStroke.getKeyStroke("control shift G"));
        JMenu mnuInutilizacao = new JMenu(DSENLabelConstants.MNU_INUTILIZACOES);
        mnuInutilizacao.setMnemonic(DSENLabelConstants.MNU_INUTILIZACOES_MNEMONIC);
        JMenuItem mnuInutilizarFaixa = new JMenuItem(DSENLabelConstants.MNU_INUTILIZAR_FAIXA_NUMERACAO);
        mnuInutilizarFaixa.setMnemonic(DSENLabelConstants.MNU_INUTILIZAR_FAIXA_NUMERACAO_MNEMONIC);
        mnuInutilizarFaixa.setAccelerator(KeyStroke.getKeyStroke("control shift I"));
        JMenuItem mnuConsultarFaixa = new JMenuItem(DSENLabelConstants.MNU_CONSULTAR_INUTILIZACOES_CADASTRADAS);
        mnuConsultarFaixa.setMnemonic(DSENLabelConstants.MNU_CONSULTAR_INUTILIZACOES_CADASTRADAS_MNEMONIC);
        mnuConsultarFaixa.setAccelerator(KeyStroke.getKeyStroke("control shift I C"));
        mnuInutilizacao.add(mnuInutilizarFaixa);
        mnuInutilizacao.add(mnuConsultarFaixa);
        JMenuItem mnuVisualizarDPECs = new JMenuItem(DSENLabelConstants.MNU_VISUALIZAR_DPECS);
        mnuVisualizarDPECs.setMnemonic(DSENLabelConstants.MNU_VISUALIZAR_DPECS_MNEMONIC);
        mnuVisualizarDPECs.setAccelerator(KeyStroke.getKeyStroke("control shift D"));
        JMenuItem mnuConsultarNFE = new JMenuItem(DSENLabelConstants.MNU_CONSULTAR_NFE_NAO_CADASTRADA);
        mnuConsultarNFE.setMnemonic(DSENLabelConstants.MNU_CONSULTAR_NFE_PELA_CHAVE_MNEMONIC);
        JMenuItem mnuConsultarDPEC = new JMenuItem(DSENLabelConstants.MNU_CONSULTAR_DPEC);
        mnuConsultarNFE.setMnemonic(DSENLabelConstants.MNU_CONSULTAR_DPEC_MNEMONIC);
        JMenuItem mnuCancelarNFE = new JMenuItem(DSENLabelConstants.MNU_CANCELAR_NFE_NAO_CADASTRADA);
        mnuCancelarNFE.setMnemonic(DSENLabelConstants.MNU_CANCELAR_NFE_NAO_CADASTRADA_MNEMONIC);
        JMenuItem mnuSair = new JMenuItem(DSENLabelConstants.MNU_SAIR);
        mnuSair.setMnemonic(DSENLabelConstants.MNU_SAIR_MNEMONIC);
        mnuSair.setAccelerator(KeyStroke.getKeyStroke(115, 8));
        mnuNota.add(mnuEmitir);
        mnuNota.add(mnuGerenciar);
        mnuNota.add(mnuInutilizacao);
        mnuNota.addSeparator();
        mnuNota.add(mnuConsultarNFE);
        mnuNota.add(mnuCancelarNFE);
        mnuNota.addSeparator();
        mnuNota.add(mnuVisualizarDPECs);
        mnuNota.add(mnuConsultarDPEC);
        mnuNota.addSeparator();
        mnuNota.add(mnuSair);
        mnuSair.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        mnuGerenciar.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        mnuEmitir.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        mnuInutilizarFaixa.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        mnuConsultarFaixa.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        mnuVisualizarDPECs.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        mnuCancelarNFE.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        mnuConsultarNFE.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        mnuConsultarDPEC.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        return mnuNota;
    }

    private static JMenu c() {
        JMenu mnuAjuda = new JMenu(DSENLabelConstants.MNU_AJUDA);
        mnuAjuda.setMnemonic(DSENLabelConstants.MNU_AJUDA_MNEMONIC);
        JMenuItem mnuConteudo = new JMenuItem(DSENLabelConstants.MNU_CONTEUDO_AJUDA);
        mnuConteudo.setMnemonic(DSENLabelConstants.MNU_CONTEUDO_AJUDA_MNEMONIC);
        mnuConteudo.setAccelerator(KeyStroke.getKeyStroke(112, 0));
        JMenuItem mnuSobre = new JMenuItem(DSENLabelConstants.MNU_SOBRE);
        mnuSobre.setMnemonic(DSENLabelConstants.MNU_SOBRE_MNEMONIC);
        mnuAjuda.add(mnuConteudo);
        mnuAjuda.add(mnuSobre);
        try {
            new Help().configurarHelp(mnuConteudo, "EmissorNFe-inicio");
        }
        catch (DSENHelpException e) {
            DSGEMessageDialog.showErrors((DSGEBaseException)e);
        }
        mnuSobre.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        return mnuAjuda;
    }

    private static JMenu d() {
        JMenu mnuSistema = new JMenu(DSENLabelConstants.MNU_SISTEMA);
        mnuSistema.setMnemonic(DSENLabelConstants.MNU_SISTEMA_MNEMONIC);
        JMenuItem mnuParametros = new JMenuItem(DSENLabelConstants.MNU_PARAMETROS);
        mnuParametros.setMnemonic(DSENLabelConstants.MNU_PARAMETROS_MNEMONIC);
        JMenuItem mnuCertificados = new JMenuItem(DSENLabelConstants.MNU_CERTIFICADOS);
        mnuCertificados.setMnemonic(DSENLabelConstants.MNU_CERTIFICADOS_MNEMONIC);
        JMenuItem mnuImportar = new JMenuItem(DSENLabelConstants.MNU_IMPORTAR);
        mnuImportar.setMnemonic(DSENLabelConstants.MNU_IMPORTAR_MNEMONIC);
        JMenuItem mnuBackup = new JMenuItem(DSENLabelConstants.MNU_BACKUP);
        mnuBackup.setMnemonic(DSENLabelConstants.MNU_BACKUP_MNEMONIC);
        JMenuItem mnuRestore = new JMenuItem(DSENLabelConstants.MNU_RESTAURAR);
        mnuRestore.setMnemonic(DSENLabelConstants.MNU_RESTAURAR_MNEMONIC);
        JMenuItem mnuAvisos = new JMenuItem(DSENLabelConstants.MNU_AVISOS);
        mnuAvisos.setMnemonic(DSENLabelConstants.MNU_AVISOS_MNEMONIC);
        mnuAvisos.setAccelerator(KeyStroke.getKeyStroke("control shift A"));
        JMenuItem mnuRelatorio = new JMenuItem(DSENLabelConstants.MNU_RELATORIO_GERENCIAL);
        mnuRelatorio.setMnemonic(DSENLabelConstants.MNU_RELATORIO_GERENCIAL_MNEMONIC);
        mnuAvisos.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        mnuCertificados.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        mnuParametros.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        mnuImportar.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        mnuRestore.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        mnuBackup.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        mnuRelatorio.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        mnuSistema.add(mnuAvisos);
        mnuSistema.addSeparator();
        mnuSistema.add(mnuCertificados);
        mnuSistema.add(mnuParametros);
        mnuSistema.addSeparator();
        mnuSistema.add(mnuImportar);
        mnuSistema.add(mnuBackup);
        mnuSistema.add(mnuRestore);
        mnuSistema.addSeparator();
        mnuSistema.add(mnuRelatorio);
        return mnuSistema;
    }

    private static JMenu e() {
        JMenu mnuCadastro = new JMenu(DSENLabelConstants.MNU_CADASTROS);
        mnuCadastro.setMnemonic(DSENLabelConstants.MNU_CADASTROS_MNEMONIC);
        JMenuItem mnuCliente = new JMenuItem(DSENLabelConstants.MNU_CLIENTE);
        mnuCliente.setMnemonic(DSENLabelConstants.MNU_CLIENTE_MNEMONIC);
        mnuCliente.setAccelerator(KeyStroke.getKeyStroke("control shift C"));
        JMenuItem mnuProduto = new JMenuItem(DSENLabelConstants.MNU_PRODUTO);
        mnuProduto.setMnemonic(DSENLabelConstants.MNU_PRODUTO_MNEMONIC);
        mnuProduto.setAccelerator(KeyStroke.getKeyStroke("control shift P"));
        JMenuItem mnuTransportadora = new JMenuItem(DSENLabelConstants.MNU_TRANSPORTADORA);
        mnuTransportadora.setMnemonic(DSENLabelConstants.MNU_TRANSPORTADORA_MNEMONIC);
        mnuTransportadora.setAccelerator(KeyStroke.getKeyStroke("control shift T"));
        mnuCadastro.add(mnuCliente);
        mnuCadastro.add(mnuProduto);
        mnuCadastro.add(mnuTransportadora);
        mnuCliente.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        mnuProduto.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        mnuTransportadora.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        return mnuCadastro;
    }

    private static JMenu f() {
        JMenu mnuPref = new JMenu(DSENLabelConstants.MNU_PREFERENCIAS);
        mnuPref.setMnemonic(DSENLabelConstants.MNU_PREFERENCIAS_MNEMONIC);
        JMenu mnuAp = new JMenu(DSENLabelConstants.MNU_APARENCIA);
        mnuAp.setMnemonic(DSENLabelConstants.MNU_APARENCIA_MNEMONIC);
        JMenuItem mnuDefault = new JMenuItem(DSENLabelConstants.MNU_TEMA_PADRAO);
        mnuDefault.setMnemonic(DSENLabelConstants.MNU_TEMA_PADRAO_MNEMONIC);
        mnuAp.add(mnuDefault);
        JMenuItem mnuDark = new JMenuItem(DSENLabelConstants.MNU_TEMA_PRETO);
        mnuDark.setMnemonic(DSENLabelConstants.MNU_TEMA_PRETO_MNEMONIC);
        mnuAp.add(mnuDark);
        JMenuItem mnuDourado = new JMenuItem(DSENLabelConstants.MNU_TEMA_DOURADO);
        mnuDourado.setMnemonic(DSENLabelConstants.MNU_TEMA_DOURADO_MNEMONIC);
        mnuAp.add(mnuDourado);
        JMenuItem mnuPrata = new JMenuItem(DSENLabelConstants.MNU_TEMA_PRATEADO);
        mnuPrata.setMnemonic(DSENLabelConstants.MNU_TEMA_PRATEADO_MNEMONIC);
        mnuAp.add(mnuPrata);
        JMenuItem mnuAzul = new JMenuItem(DSENLabelConstants.MNU_TEMA_AZUL);
        mnuAzul.setMnemonic(DSENLabelConstants.MNU_TEMA_AZUL_MNEMONIC);
        mnuAp.add(mnuAzul);
        mnuPref.add(mnuAp);
        mnuDefault.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        mnuDark.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        mnuAzul.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        mnuDourado.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        mnuPrata.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        return mnuPref;
    }
}

