/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEventoEnum
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoVinculacao
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoVinculacao$1
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoVinculacao$TO
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoVinculacao$TO2
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.util.IOHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.common.util.XMLUtil
 *  org.apache.commons.beanutils.PropertyUtils
 *  org.mozilla.universalchardet.CharsetListener
 *  org.mozilla.universalchardet.UniversalDetector
 */
package br.gov.sp.fazenda.dsen.model.business.importacao;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEventoEnum;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoVinculacao;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.util.IOHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.common.util.XMLUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.beanutils.PropertyUtils;
import org.mozilla.universalchardet.CharsetListener;
import org.mozilla.universalchardet.UniversalDetector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public class ImportacaoVinculacao {
    private static HashMap<String, ArrayList<ArrayList<TO>>> a = new HashMap();
    private List<ImportacaoTelaTO> a = new ArrayList();
    private static final String a = "nfeProc";
    private static final String b = "NFe";
    private static final String c = "procCancNFe";
    private static final String d = "retCancNFe";
    private static final String e = "ProcInutNFe";
    private static final String f = "procInutNFe";
    private static final String g = "procEventoNFe";
    private static final int a = 10000;
    private List<ImportacaoTelaTO> b = new ArrayList();
    private List<ImportacaoTelaTO> c = new ArrayList();
    private List<ImportacaoTelaTO> d = new ArrayList();
    private static Pattern a = Pattern.compile(".*((\\.xml)|(\\.XML)|(\\.txt)|(\\.TXT))");

    public ImportacaoVinculacao() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private String a(File file) throws IOException {
        FileInputStream fis = null;
        try {
            int nread;
            byte[] buf = new byte[4096];
            fis = new FileInputStream(file);
            UniversalDetector detector = new UniversalDetector(null);
            while ((nread = fis.read(buf)) > 0 && !detector.isDone()) {
                detector.handleData(buf, 0, nread);
            }
            detector.dataEnd();
            String charset = detector.getDetectedCharset();
            detector.reset();
            String string = charset = charset != null ? charset : "UTF-8";
            return string;
        }
        catch (Exception e) {
            e.printStackTrace();
            String detector = "UTF-8";
            return detector;
        }
        finally {
            if (fis != null) {
                fis.close();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void find(File file) {
        Scanner scanner = null;
        try {
            if (file.isDirectory()) {
                return;
            }
            if (file.length() > 0x100000 && file.getName().toUpperCase().endsWith(ExtensaoArquivoEnum.XML.toString())) {
                Integer qtde = (Integer)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.IMPORTACAO_QTDE_ARQUIVOS_XML_MAIORES_LIMITE, Integer.class);
                if (qtde == null) {
                    qtde = new Integer(1);
                } else {
                    Integer n = qtde;
                    Integer n2 = qtde = Integer.valueOf(qtde + 1);
                }
                AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.IMPORTACAO_QTDE_ARQUIVOS_XML_MAIORES_LIMITE, (Object)qtde);
                System.out.println("Alerta! O arquivo XML \"" + file.getAbsolutePath() + "\" foi descartado pois cont\u00e9m mais do que " + 1048576 + " bytes!");
                return;
            }
            if (file.length() > 0x200000 && file.getName().toUpperCase().endsWith(ExtensaoArquivoEnum.TXT.toString())) {
                Integer qtde = (Integer)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.IMPORTACAO_QTDE_ARQUIVOS_TXT_MAIORES_LIMITE, Integer.class);
                if (qtde == null) {
                    qtde = new Integer(1);
                } else {
                    Integer n = qtde;
                    Integer n3 = qtde = Integer.valueOf(qtde + 1);
                }
                AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.IMPORTACAO_QTDE_ARQUIVOS_TXT_MAIORES_LIMITE, (Object)qtde);
                System.out.println("Alerta! O arquivo TXT \"" + file.getAbsolutePath() + "\" foi descartado pois cont\u00e9m mais do que " + 2097152 + " bytes!");
                return;
            }
            String charsetArquivo = this.a(file);
            TO2 to2 = ImportacaoVinculacao.getPatterns((File)file);
            if (to2 == null) {
                return;
            }
            List patterns = to2.a();
            if (patterns == null) {
                return;
            }
            for (ArrayList arrayList : patterns) {
                for (TO to : arrayList) {
                    for (Pattern pattern : to.a()) {
                        String conteudoArquivo;
                        ImportacaoTelaTO telaTO = new ImportacaoTelaTO();
                        if (file.getName().toUpperCase().endsWith(ExtensaoArquivoEnum.TXT.toString())) {
                            try {
                                scanner = new Scanner(IOHelper.getFirstNonEmptyLine((File)file, (String)charsetArquivo));
                            }
                            catch (UnsupportedEncodingException e) {
                                System.out.println("Charset " + charsetArquivo + " do arquivo \"" + file.getAbsolutePath() + "\" n\u00e3o \u00e9 suportado pelo sistema!");
                                if (scanner != null) {
                                    scanner.close();
                                }
                                return;
                            }
                            String matched = scanner.findInLine(pattern);
                            if (matched == null) continue;
                            int qtde = 0;
                            try {
                                qtde = Integer.parseInt(scanner.match().group(2));
                            }
                            catch (Exception exception) {
                                // empty catch block
                            }
                            telaTO.setQtdRegistro(Integer.valueOf(qtde));
                            String tipoArquivo = scanner.match().group(1);
                            telaTO.setTipoArquivo(this.a(tipoArquivo));
                            telaTO.setExtensaoArquivo(ExtensaoArquivoEnum.TXT);
                            telaTO.setCaminhoArquivo(file.getAbsolutePath());
                            telaTO.setNomeArquivo(file.getName());
                            telaTO.setCharset(charsetArquivo);
                            this.a.add(telaTO);
                            return;
                        }
                        try {
                            conteudoArquivo = IOHelper.readFile((File)file, (String)charsetArquivo);
                        }
                        catch (UnsupportedEncodingException e) {
                            System.out.println("Charset " + charsetArquivo + " do arquivo \"" + file.getAbsolutePath() + "\" n\u00e3o \u00e9 suportado pelo sistema!");
                            if (scanner != null) {
                                scanner.close();
                            }
                            return;
                        }
                        scanner = new Scanner(conteudoArquivo);
                        int horizon = Math.min(10000, (int)file.length());
                        String matched = scanner.findWithinHorizon(pattern, horizon);
                        if (matched == null) continue;
                        telaTO.setQtdRegistro(Integer.valueOf(1));
                        telaTO.setExtensaoArquivo(ExtensaoArquivoEnum.XML);
                        telaTO.setCaminhoArquivo(file.getAbsolutePath());
                        telaTO.setNomeArquivo(file.getName());
                        telaTO.setCharset(charsetArquivo);
                        telaTO.setTipoArquivo(TipoDocumentoArquivoEnum.valueOf((String)to.a()));
                        String identificacao = scanner.match().group(scanner.match().groupCount());
                        telaTO.setIdentificacao(StringHelper.isBlankOrNull((Object)identificacao) ? null : identificacao);
                        telaTO.setSituacao(this.a(conteudoArquivo, to2.a()));
                        if (to2.a() != null) {
                            if (to2.a().equals("NFe") || to2.a().equals("nfeProc") || to2.a().equalsIgnoreCase("ProcInutNFe")) {
                                this.b.add(telaTO);
                            } else if (to2.a().equals("procCancNFe") || to2.a().equals("retCancNFe")) {
                                this.c.add(telaTO);
                            } else if (to2.a().equals("procEventoNFe") && (telaTO.getSituacao() == null || SituacaoNFeEnum.CANCELADA.toString().equals(telaTO.getSituacao()))) {
                                this.d.add(telaTO);
                            }
                        } else {
                            this.a.add(telaTO);
                        }
                        return;
                    }
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    private TipoDocumentoArquivoEnum a(String name) {
        TipoDocumentoArquivoEnum[] tipoArquivoValues = TipoDocumentoArquivoEnum.values();
        int i = 0;
        while (!tipoArquivoValues[i].toString().equalsIgnoreCase(StringHelper.removeChar((String)name, (char)' '))) {
            ++i;
        }
        return tipoArquivoValues[i];
    }

    public static TO2 getPatterns(File file) throws FileNotFoundException {
        Matcher matcher = a.matcher(file.getName());
        if (matcher.matches() && matcher.group(1) != null) {
            String key = matcher.group(1).substring(1).toUpperCase();
            if (key.equals(ExtensaoArquivoEnum.TXT.toString())) {
                return new TO2((List)a.get(key), null);
            }
            String tipo = ImportacaoVinculacao.b((File)file);
            if (tipo != null) {
                return new TO2((List)a.get(tipo), tipo);
            }
            return new TO2((List)a.get("cadastro"), null);
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static String b(File file) throws FileNotFoundException {
        Scanner scanner = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] bytes = new byte[(int)file.length()];
            fis.read(bytes);
            scanner = new Scanner(new String(bytes, "UTF-8"));
            String[] x = new String[]{"procCancNFe", "retCancNFe", "nfeProc", "NFe", "procEventoNFe", "ProcInutNFe", "procInutNFe"};
            for (int i = 0; i < x.length; ++i) {
                Pattern pattern = Pattern.compile("(<\\s*[/]{0,1}\\s*" + x[i] + "(\\s+[^<]*|\\s*)>|<\\s*" + x[i] + "(\\s+[^<]*|\\s*)/{0,1}\\s*>)");
                if (scanner.findWithinHorizon(pattern, Math.min(10000, (int)file.length())) == null) continue;
                String string = x[i];
                return string;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return null;
    }

    private String a(String xml, String tipo) throws FileNotFoundException {
        String situacao = null;
        if ("nfeProc".equals(tipo)) {
            String cstat = this.a(xml);
            situacao = DSENConstants.CODIGO_AUTORIZACAO.equals(cstat) || DSENConstants.CODIGO_AUTORIZADO_FORA_PRAZO.equals(cstat) ? SituacaoNFeEnum.AUTORIZADA.toString() : (DSENConstants.CODIGO_DENEGADO.equals(cstat) ? SituacaoNFeEnum.DENEGADA.toString() : SituacaoNFeEnum.ASSINADA.toString());
        } else if ("procCancNFe".equals(tipo) || "retCancNFe".equals(tipo)) {
            String cstat = this.a(xml);
            situacao = DSENConstants.CODIGO_CANCELAMENTO.equals(cstat) || DSENConstants.CODIGO_CANCELAMENTO_FORA_PRAZO.equals(cstat) || DSENConstants.CODIGO_CANCELAMENTO_EVENTO_FORA_PRAZO.equals(situacao) ? SituacaoNFeEnum.CANCELADA.toString() : (DSENConstants.CODIGO_CANCELAMENTO_FORA_PRAZO.equals(cstat) ? SituacaoNFeEnum.CANCELADA_EVENTO.toString() : null);
        } else if ("procEventoNFe".equals(tipo)) {
            String tpEvento = XMLUtil.getFirstTagConteudo((String)xml, (String)"tpEvento", (boolean)false, (boolean)false);
            TipoEventoEnum tpEventoEnum = TipoEventoEnum.getEnumPeloCodigo((String)tpEvento);
            if (tpEventoEnum != null) {
                switch (1.a[tpEventoEnum.ordinal()]) {
                    case 1: {
                        situacao = SituacaoNFeEnum.AUTORIZADA.toString();
                        break;
                    }
                    case 2: {
                        situacao = SituacaoNFeEnum.DENEGADA.toString();
                        break;
                    }
                    case 3: {
                        situacao = SituacaoNFeEnum.CANCELADA.toString();
                        break;
                    }
                    default: {
                        situacao = null;
                        break;
                    }
                }
            }
        } else if ("NFe".equals(tipo)) {
            situacao = StringHelper.isBlankOrNull((Object)XMLUtil.getFirstTagConteudo((String)xml, (String)"Signature", (boolean)false, (boolean)false)) ? "-" : SituacaoNFeEnum.ASSINADA.toString();
        }
        return situacao;
    }

    private String a(String xml) {
        List l = XMLUtil.getTagConteudo((String)xml, (String)"cStat", (boolean)false);
        if (l != null && !l.isEmpty()) {
            return ((String)l.get(0)).trim();
        }
        return "";
    }

    public List<ImportacaoTelaTO> getAll() throws Exception {
        this.a.addAll(ImportacaoVinculacao.vincularArquivos((List)this.b, (List)this.c, (List)this.d));
        return this.a;
    }

    public static List<ImportacaoTelaTO> vincularArquivos(List<ImportacaoTelaTO> procList, List<ImportacaoTelaTO> cancList, List<ImportacaoTelaTO> eventosList) throws Exception {
        ArrayList<ImportacaoTelaTO> vinculadosList = new ArrayList<ImportacaoTelaTO>();
        HashSet<String> eventosVinculados = new HashSet<String>();
        HashMap<String, ArrayList<ImportacaoTelaTO>> eventosMap = new HashMap<String, ArrayList<ImportacaoTelaTO>>();
        for (ImportacaoTelaTO evento : eventosList) {
            ArrayList<ImportacaoTelaTO> list = (ArrayList<ImportacaoTelaTO>)eventosMap.get(evento.getIdentificacao());
            if (list == null) {
                list = new ArrayList<ImportacaoTelaTO>();
                eventosMap.put(evento.getIdentificacao(), list);
            }
            list.add(evento);
        }
        for (ImportacaoTelaTO imp : procList) {
            List eventos = (List)eventosMap.get(imp.getIdentificacao());
            if (eventos == null || eventos.isEmpty()) continue;
            for (ImportacaoTelaTO evento : eventos) {
                if (evento.getSituacao() == null) {
                    imp.addArquivoVinculado(evento);
                    eventosVinculados.add(evento.getIdentificacao());
                }
                if (evento.getSituacao() == null || !SituacaoNFeEnum.CANCELADA.toString().equals(evento.getSituacao())) continue;
                imp.addArquivoVinculado(evento);
                imp.setSituacao(SituacaoNFeEnum.CANCELADA_EVENTO.toString());
                eventosVinculados.add(evento.getIdentificacao());
            }
        }
        for (ImportacaoTelaTO evento : eventosList) {
            if (eventosVinculados.contains(evento.getIdentificacao())) continue;
            vinculadosList.add(evento);
        }
        HashMap<String, ArrayList<ImportacaoTelaTO>> cancMap = new HashMap<String, ArrayList<ImportacaoTelaTO>>();
        for (ImportacaoTelaTO canc : cancList) {
            ArrayList<ImportacaoTelaTO> list = (ArrayList<ImportacaoTelaTO>)cancMap.get(canc.getIdentificacao());
            if (list == null) {
                list = new ArrayList<ImportacaoTelaTO>();
                cancMap.put(canc.getIdentificacao(), list);
            }
            list.add(canc);
        }
        HashSet<String> cancelamentosVinculados = new HashSet<String>();
        for (ImportacaoTelaTO imp : procList) {
            List cList = (List)cancMap.get(imp.getIdentificacao());
            if (cList != null && !cList.isEmpty()) {
                for (ImportacaoTelaTO canc : cList) {
                    ImportacaoTelaTO impClone = new ImportacaoTelaTO();
                    PropertyUtils.copyProperties((Object)impClone, (Object)imp);
                    ArrayList vinculadosClone = new ArrayList();
                    vinculadosClone.addAll(imp.getArquivosVinculados());
                    impClone.setArquivosVinculados(vinculadosClone);
                    impClone.addArquivoVinculado(canc);
                    impClone.setSituacao(SituacaoNFeEnum.CANCELADA.toString());
                    vinculadosList.add(impClone);
                    cancelamentosVinculados.add(canc.getIdentificacao());
                }
                continue;
            }
            vinculadosList.add(imp);
        }
        for (ImportacaoTelaTO canc : cancList) {
            if (cancelamentosVinculados.contains(canc.getIdentificacao())) continue;
            vinculadosList.add(canc);
        }
        return vinculadosList;
    }

    static {
        ArrayList<Pattern> tmp = new ArrayList<Pattern>();
        ArrayList<TO> listTO = new ArrayList<TO>();
        ArrayList<ArrayList<TO>> agregListTO = new ArrayList<ArrayList<TO>>();
        tmp.add(Pattern.compile("<infNFe.*Id=\\s*+(\"|')NFe([0-9]{44})"));
        listTO.add(new TO(TipoDocumentoArquivoEnum.NotaFiscal.toString(), tmp));
        agregListTO.add(listTO);
        a.put("NFe", agregListTO);
        tmp = new ArrayList();
        listTO = new ArrayList();
        agregListTO = new ArrayList();
        tmp.add(Pattern.compile("<infInut.*Id=\\s*+(\"|')ID([0-9]{39})"));
        listTO.add(new TO(TipoDocumentoArquivoEnum.Inutilizacao.toString(), tmp));
        agregListTO.add(listTO);
        a.put("ProcInutNFe", agregListTO);
        a.put("procInutNFe", agregListTO);
        tmp = new ArrayList();
        listTO = new ArrayList();
        agregListTO = new ArrayList();
        tmp.add(Pattern.compile("<infNFe.*Id=\\s*+(\"|')NFe([0-9]{44})"));
        listTO.add(new TO(TipoDocumentoArquivoEnum.NotaFiscal.toString(), tmp));
        agregListTO.add(listTO);
        a.put("nfeProc", agregListTO);
        tmp = new ArrayList();
        listTO = new ArrayList();
        agregListTO = new ArrayList();
        tmp.add(Pattern.compile("<chNFe\\s*>\\s*([0-9]{44})"));
        listTO.add(new TO(TipoDocumentoArquivoEnum.NotaFiscal.toString(), tmp));
        agregListTO.add(listTO);
        a.put("retCancNFe", agregListTO);
        tmp = new ArrayList();
        listTO = new ArrayList();
        agregListTO = new ArrayList();
        tmp.add(Pattern.compile("<chNFe\\s*>\\s*([0-9]{44})"));
        listTO.add(new TO(TipoDocumentoArquivoEnum.NotaFiscal.toString(), tmp));
        agregListTO.add(listTO);
        a.put("procCancNFe", agregListTO);
        tmp = new ArrayList();
        listTO = new ArrayList();
        agregListTO = new ArrayList();
        tmp.add(Pattern.compile("<chNFe\\s*>\\s*([0-9]{44})"));
        listTO.add(new TO(TipoDocumentoArquivoEnum.NotaFiscal.toString(), tmp));
        agregListTO.add(listTO);
        a.put("procEventoNFe", agregListTO);
        tmp = new ArrayList();
        listTO = new ArrayList();
        agregListTO = new ArrayList();
        tmp.add(Pattern.compile("<emit\\s*>\\s*\\<CNPJ\\s*>\\s*([0-9]{14})\\s*</CNPJ>"));
        listTO.add(new TO(TipoDocumentoArquivoEnum.Emitente.toString(), tmp));
        agregListTO.add(listTO);
        tmp = new ArrayList();
        listTO = new ArrayList();
        tmp.add(Pattern.compile("<dest\\s*>\\s*\\<CNPJ\\s*>\\s*([0-9]{14})\\s*</CNPJ>"));
        listTO.add(new TO(TipoDocumentoArquivoEnum.Cliente.toString(), tmp));
        agregListTO.add(listTO);
        tmp = new ArrayList();
        listTO = new ArrayList();
        tmp.add(Pattern.compile("<dest\\s*>\\s*\\<CPF\\s*>\\s*([0-9]{11})\\s*</CPF>"));
        listTO.add(new TO(TipoDocumentoArquivoEnum.Cliente.toString(), tmp));
        agregListTO.add(listTO);
        tmp = new ArrayList();
        listTO = new ArrayList();
        tmp.add(Pattern.compile("<dest\\s*>\\s*((\\<CPF\\s*/\\s*>)|(\\<CNPJ\\s*/\\s*>)|(\\<CNPJ\\s*>\\s*</CNPJ>)|(\\<CPF\\s*>\\s*</CPF>))?\\<xNome\\s*>\\s*([!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1})\\s*</xNome>"));
        listTO.add(new TO(TipoDocumentoArquivoEnum.Cliente.toString(), tmp));
        agregListTO.add(listTO);
        tmp = new ArrayList();
        listTO = new ArrayList();
        tmp.add(Pattern.compile("<transporta\\s*>\\s*\\<CNPJ\\s*>\\s*([0-9]{14})\\s*</CNPJ>"));
        listTO.add(new TO(TipoDocumentoArquivoEnum.Transportadora.toString(), tmp));
        agregListTO.add(listTO);
        tmp = new ArrayList();
        listTO = new ArrayList();
        tmp.add(Pattern.compile("<transporta\\s*>\\s*\\<CPF\\s*>\\s*([0-9]{11})\\s*</CPF>"));
        listTO.add(new TO(TipoDocumentoArquivoEnum.Transportadora.toString(), tmp));
        agregListTO.add(listTO);
        tmp = new ArrayList();
        listTO = new ArrayList();
        tmp.add(Pattern.compile("<transporta\\s*>\\s*((\\<CPF\\s*/\\s*>)|(\\<CNPJ\\s*/\\s*>)|(\\<CNPJ\\s*>\\s*</CNPJ>)|(\\<CPF\\s*>\\s*</CPF>))?\\<xNome\\s*>\\s*([!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1})\\s*</xNome>"));
        listTO.add(new TO(TipoDocumentoArquivoEnum.Transportadora.toString(), tmp));
        agregListTO.add(listTO);
        tmp = new ArrayList();
        listTO = new ArrayList();
        tmp.add(Pattern.compile("<cProd\\s*>(.*)</cProd>"));
        listTO.add(new TO(TipoDocumentoArquivoEnum.Produto.toString(), tmp));
        agregListTO.add(listTO);
        a.put("cadastro", agregListTO);
        tmp = new ArrayList();
        listTO = new ArrayList();
        agregListTO = new ArrayList();
        tmp.add(Pattern.compile("^\\s*(NOTA FISCAL|NOTAFISCAL|EMITENTE|CLIENTE|PRODUTO|TRANSPORTADORA){1}\\s*\\|([0-9])*(\\|){0,1}\\s*"));
        listTO.add(new TO(ExtensaoArquivoEnum.TXT.toString(), tmp));
        agregListTO.add(listTO);
        a.put(ExtensaoArquivoEnum.TXT.toString(), agregListTO);
    }
}

