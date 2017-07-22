/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.CSOSNEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.CSTEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.importacao.SituacaoRegistroEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.IcmsTO
 *  br.gov.sp.fazenda.dsen.common.to.IpiTO
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO$Status
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.model.business.ProdutoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.expimp.DSENRegistroProdutoConverter
 *  br.gov.sp.fazenda.dsen.model.business.expimp.produto.RegistroM
 *  br.gov.sp.fazenda.dsen.model.business.importacao.BaseImportacaoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoProdutoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGECommonException
 *  br.gov.sp.fazenda.dsge.common.to.Campo
 *  br.gov.sp.fazenda.dsge.common.to.Registro
 *  br.gov.sp.fazenda.dsge.common.util.ReflectionHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface
 *  br.gov.sp.fazenda.dsge.model.business.util.DSGERegistroConverter
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEConverterException
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 */
package br.gov.sp.fazenda.dsen.model.business.importacao;

import br.gov.sp.fazenda.dsen.common.enumeration.CSOSNEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.CSTEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.importacao.SituacaoRegistroEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.IcmsTO;
import br.gov.sp.fazenda.dsen.common.to.IpiTO;
import br.gov.sp.fazenda.dsen.common.to.ProdutoTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.model.business.ProdutoBusiness;
import br.gov.sp.fazenda.dsen.model.business.expimp.DSENRegistroProdutoConverter;
import br.gov.sp.fazenda.dsen.model.business.expimp.produto.RegistroM;
import br.gov.sp.fazenda.dsen.model.business.importacao.BaseImportacaoBusiness;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.exception.DSGECommonException;
import br.gov.sp.fazenda.dsge.common.to.Campo;
import br.gov.sp.fazenda.dsge.common.to.Registro;
import br.gov.sp.fazenda.dsge.common.util.ReflectionHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface;
import br.gov.sp.fazenda.dsge.model.business.util.DSGERegistroConverter;
import br.gov.sp.fazenda.dsge.model.exception.DSGEConverterException;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import java.io.PrintStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * Exception performing whole class analysis ignored.
 */
class ImportacaoProdutoBusiness
extends BaseImportacaoBusiness {
    private static final String a = "cProd";
    private ProdutoBusiness a;
    HashMap<String, String[]> a;
    String[] a = new HashMap();

    public ImportacaoProdutoBusiness() {
        this.a.put(CSTEnum._00.getCst(), new String[]{"cst", "orig", "modBc", "pIcms"});
        this.a.put(CSTEnum._10.getCst(), new String[]{"cst", "orig", "modBc", "pIcms", "modBcst", "pIcmsst", "pMvast", "pRedBcst"});
        this.a.put(CSTEnum._10_Part.getCst(), new String[]{"cst", "orig", "modBc", "pIcms", "pRedBc", "pBCOp", "modBcst", "pIcmsst", "pMvast", "pRedBcst", "UFST"});
        this.a.put(CSTEnum._20.getCst(), new String[]{"cst", "orig", "modBc", "pIcms", "pRedBc"});
        this.a.put(CSTEnum._30.getCst(), new String[]{"cst", "orig", "modBcst", "pMvast", "pIcmsst", "pRedBcst"});
        this.a.put(CSTEnum._40.getCst(), new String[]{"cst", "orig", "motDesICMS"});
        this.a.put(CSTEnum._41.getCst(), new String[]{"cst", "orig", "motDesICMS"});
        this.a.put(CSTEnum._41_ST.getCst(), new String[]{"cst", "orig"});
        this.a.put(CSTEnum._50.getCst(), new String[]{"cst", "orig", "motDesICMS"});
        this.a.put(CSTEnum._51.getCst(), new String[]{"cst", "orig", "modBc", "pRedBc", "pIcms"});
        this.a.put(CSTEnum._60.getCst(), new String[]{"cst", "orig"});
        this.a.put(CSTEnum._70.getCst(), new String[]{"cst", "orig", "modBc", "pRedBc", "pIcms", "modBcst", "pMvast", "pRedBcst", "pIcmsst"});
        this.a.put(CSTEnum._90.getCst(), new String[]{"cst", "orig", "modBc", "pRedBc", "pIcms", "modBcst", "pMvast", "pRedBcst", "pIcmsst"});
        this.a.put(CSTEnum._90_Part.getCst(), new String[]{"cst", "orig", "modBc", "pRedBc", "pIcms", "pBCOp", "modBcst", "pMvast", "pRedBcst", "pIcmsst", "UFST"});
        this.a.put(CSOSNEnum._101.getCsosn(), new String[]{"cst", "orig", "pCredSN"});
        this.a.put(CSOSNEnum._102.getCsosn(), new String[]{"cst", "orig"});
        this.a.put(CSOSNEnum._103.getCsosn(), new String[]{"cst", "orig"});
        this.a.put(CSOSNEnum._201.getCsosn(), new String[]{"cst", "orig", "pCredSN", "modBcst", "pMvast", "pRedBcst", "pIcmsst"});
        this.a.put(CSOSNEnum._202.getCsosn(), new String[]{"cst", "orig", "modBcst", "pMvast", "pRedBcst", "pIcmsst"});
        this.a.put(CSOSNEnum._203.getCsosn(), new String[]{"cst", "orig", "modBcst", "pMvast", "pRedBcst", "pIcmsst"});
        this.a.put(CSOSNEnum._300.getCsosn(), new String[]{"cst", "orig"});
        this.a.put(CSOSNEnum._400.getCsosn(), new String[]{"cst", "orig"});
        this.a.put(CSOSNEnum._500.getCsosn(), new String[]{"cst", "orig"});
        this.a.put(CSOSNEnum._900.getCsosn(), new String[]{"cst", "orig", "pCredSN", "modBc", "pRedBc", "pIcms", "modBcst", "pMvast", "pRedBcst", "pIcmsst"});
        this.a = new String[]{"cst", "orig", "modBc", "pRedBc", "pIcms", "modBcst", "pMvast", "pRedBcst", "pIcmsst", "motDesICMS", "pBCOp", "UFST", "pCredSN"};
    }

    public ImportacaoResultadoTO a(ImportacaoTelaTO importacaoTela) throws DSENBusinessException {
        return this.importarTemplateMethod(importacaoTela);
    }

    protected DSGERegistroConverter getDSGERegistroConverter() {
        return new DSENRegistroProdutoConverter();
    }

    protected String getIdRegistro(Registro child) {
        Registro prod = child.getChild(0);
        return prod.getCampo("cProd").getValue();
    }

    protected ExpImpInterface getTOFromRegistro(DSGERegistroConverter converter, Registro child) throws DSGEConverterException {
        IcmsTO to;
        int i;
        List tos = converter.getTOFromRegistro(child);
        int k = 0;
        ProdutoTO prod = (ProdutoTO)tos.get(k++);
        if (tos.size() == 1) {
            return prod;
        }
        RegistroM registroM = (RegistroM)tos.get(k++);
        if (tos.size() == 2) {
            return prod;
        }
        HashSet<IcmsTO> icmsList = new HashSet<IcmsTO>();
        HashSet<IcmsTO> ipiList = new HashSet<IcmsTO>();
        int numIPI = Integer.parseInt(registroM.getMIPI());
        int numICMS = Integer.parseInt(registroM.getQtdeN());
        for (i = k; i < numICMS + k; ++i) {
            to = (IcmsTO)tos.get(i);
            icmsList.add(to);
            to.setProduto(prod);
        }
        for (i = k + numICMS; i < k + numICMS + numIPI; ++i) {
            to = (IpiTO)tos.get(i);
            ipiList.add(to);
            to.setProduto(prod);
        }
        prod.setIcmsTOSet(icmsList);
        prod.setIpiTOSet(ipiList);
        return prod;
    }

    private void a(IcmsTO icms, List<ImportacaoErroTO> erros) throws DSGECommonException {
        System.out.println(this.a + " " + (Object)icms);
        List<Object> icmsCstPossibleFields = Arrays.asList((Object[])this.a.get(icms.getCst()));
        for (int i = 0; i < this.a.length; ++i) {
            String value;
            String field = this.a[i];
            if (icmsCstPossibleFields.contains(field) || StringHelper.isBlankOrNull((Object)(value = ReflectionHelper.getFieldValueByReflection((Object)icms, (String)field)))) continue;
            erros.add(ImportacaoProdutoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)field, (String)DSENMessageConstants.MSG_IMPORTACAO_CAMPO_NAO_PERMITIDO_COM_CST, (Object[])new Object[]{field, icms.getCst()}));
        }
    }

    protected ImportacaoRegistroTO validarRegras(String nomeArquivo, String idRegistro, ExpImpInterface importado) throws DSGEUtilException {
        ProdutoTO produto = (ProdutoTO)importado;
        ArrayList<ImportacaoErroTO> erros = new ArrayList<ImportacaoErroTO>();
        Set ipiList = produto.getIpiTOSet();
        if (ipiList != null && !ipiList.isEmpty()) {
            for (IpiTO ipi : ipiList) {
                if (StringHelper.isBlankOrNull((Object)ipi.getCnpjProd())) continue;
                this.validarCnpjCpf("Produto", ipi.getCnpjProd(), TipoDocumentoEnum.CNPJ, erros);
            }
        }
        Set icmsList = produto.getIcmsTOSet();
        HashSet<String> icmsSet = new HashSet<String>();
        if (icmsList != null) {
            for (IcmsTO icms : icmsList) {
                if (icmsSet.contains(icms.getCst())) {
                    erros.add(ImportacaoProdutoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"CST", (String)DSENMessageConstants.MSG_IMPORTACAO_CST_DUPLICADO, (Object[])new Object[]{icms.getCst(), produto.getCProd()}));
                    continue;
                }
                icmsSet.add(icms.getCst());
                try {
                    this.a(icms, erros);
                }
                catch (DSGECommonException e) {
                    throw new DSGEUtilException((DSGEBaseException)e, e.getMessage());
                }
            }
        }
        if (this.hasErro(erros)) {
            return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, erros);
        }
        return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.INSERIDO, erros);
    }

    protected ImportacaoRegistroTO verificarDuplicidadeRegistro(ExpImpInterface to, String nomeArquivo, String idRegistro) throws DSENBusinessException {
        ProdutoTO importado = (ProdutoTO)to;
        importado.setEmitente(this.getEmitenteAtual());
        ProdutoTO duplicado = this.a.pesquisarProdutoPorCodigo(importado);
        if (duplicado == null) {
            return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.INSERIDO, new ImportacaoErroTO[0]);
        }
        importado.setIdProduto(duplicado.getIdProduto());
        this.b(importado, duplicado);
        this.a(importado, duplicado);
        String mensagem = MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_DUPLICIDADE_REGISTRO, new Object[]{TipoDocumentoArquivoEnum.Produto, idRegistro, nomeArquivo});
        String mensagemSobrescrever = MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_DUPLICIDADE_REGISTRO_SOBRESCREVER, new Object[]{TipoDocumentoArquivoEnum.Produto, idRegistro, nomeArquivo});
        return this.notificarDuplicidade(nomeArquivo, idRegistro, mensagem, mensagemSobrescrever);
    }

    private void a(ProdutoTO novoProdutoTO, ProdutoTO produtoTO) {
        if (novoProdutoTO.getIpiTOSet() == null) {
            novoProdutoTO.setIpiTOSet(new HashSet());
            return;
        }
        Set listaOriginalIpi = produtoTO.getIpiTOSet();
        if (listaOriginalIpi == null) {
            return;
        }
        if (listaOriginalIpi.size() == 1 && novoProdutoTO.getIpiTOSet().size() == 1) {
            ((IpiTO)novoProdutoTO.getIpiTOSet().iterator().next()).setIdIpi(((IpiTO)listaOriginalIpi.iterator().next()).getIdIpi());
        }
    }

    private void b(ProdutoTO novoProdutoTO, ProdutoTO produtoTO) {
        Set listaOriginalIcms = produtoTO.getIcmsTOSet();
        if (listaOriginalIcms == null) {
            return;
        }
        if (novoProdutoTO.getIcmsTOSet() == null) {
            novoProdutoTO.setIcmsTOSet(new HashSet());
            return;
        }
        for (IcmsTO novoIcmsTO : novoProdutoTO.getIcmsTOSet()) {
            for (IcmsTO icmsOriginalTO : listaOriginalIcms) {
                if (!icmsOriginalTO.getCst().equals(novoIcmsTO.getCst())) continue;
                novoIcmsTO.setIdIcms(icmsOriginalTO.getIdIcms());
            }
        }
    }

    protected void atualizarRegistro(ExpImpInterface to) throws DSENBusinessException {
        this.a.alterarProduto((ProdutoTO)to);
    }
}

