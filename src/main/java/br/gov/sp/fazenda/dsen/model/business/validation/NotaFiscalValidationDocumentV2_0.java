/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.to.ErroNFeTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.model.business.validation.NotaFiscalValidationDocumentV2_0
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGECommonException
 *  br.gov.sp.fazenda.dsge.common.util.ReflectionHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  org.apache.commons.logging.Log
 *  org.apache.xmlbeans.SchemaAttributeModel
 *  org.apache.xmlbeans.SchemaLocalAttribute
 *  org.apache.xmlbeans.SchemaParticle
 *  org.apache.xmlbeans.SchemaType
 *  org.apache.xmlbeans.XmlAnySimpleType
 *  org.apache.xmlbeans.XmlError
 *  org.apache.xmlbeans.XmlOptions
 */
package br.gov.sp.fazenda.dsen.model.business.validation;

import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.to.ErroNFeTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.exception.DSGECommonException;
import br.gov.sp.fazenda.dsge.common.util.ReflectionHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import javax.xml.namespace.QName;
import org.apache.commons.logging.Log;
import org.apache.xmlbeans.SchemaAttributeModel;
import org.apache.xmlbeans.SchemaLocalAttribute;
import org.apache.xmlbeans.SchemaParticle;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnySimpleType;
import org.apache.xmlbeans.XmlError;
import org.apache.xmlbeans.XmlOptions;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class NotaFiscalValidationDocumentV2_0 {
    private NFeDocument a;
    private Log a;
    private Properties a;
    private List<ErroNFeTO> a = null;

    public NotaFiscalValidationDocumentV2_0() throws DSENBusinessException {
        try {
            this.a = new Properties();
            this.a = new ArrayList();
            this.a.load(this.getClass().getResourceAsStream("dsen_campos.properties"));
        }
        catch (FileNotFoundException e) {
            this.a.error((Object)e.getMessage(), (Throwable)e);
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        catch (UnsupportedEncodingException e) {
            this.a.error((Object)e.getMessage(), (Throwable)e);
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        catch (IOException e) {
            this.a.error((Object)e.getMessage(), (Throwable)e);
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    public NotaFiscalTO validarDocumentoNotaFiscalXML(NotaFiscalTO notaFiscalTO, NFeDocument nfeDoc) throws DSENBusinessException {
        try {
            this.a.clear();
            this.a = nfeDoc;
            SchemaParticle schema = this.a.getNFe().getInfNFe().schemaType().getContentModel();
            this.a(schema, "TNFe.SEQUENCE.infNFe", (Object)this.a.getNFe().getInfNFe(), new ArrayList(), "TNFe.SEQUENCE.infNFe");
            notaFiscalTO.setListaErroNFe(this.a);
        }
        catch (Exception e) {
            this.a.error((Object)e.getMessage(), (Throwable)e);
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        return notaFiscalTO;
    }

    public NotaFiscalTO executarValidacaoXMLBeans(NotaFiscalTO notaFiscalTO, NFeDocument nfeDoc) throws DSENBusinessException {
        this.a = nfeDoc;
        ArrayList validationErrors = new ArrayList();
        XmlOptions validationOptions = new XmlOptions();
        validationOptions.setErrorListener(validationErrors);
        if (!this.a.validate(validationOptions)) {
            for (XmlError error : validationErrors) {
                ErroNFeTO erroNFeTO;
                if (notaFiscalTO.getSituacao() == null || SituacaoNFeEnum.EM_DIGITACAO.equals((Object)notaFiscalTO.getSituacao()) || SituacaoNFeEnum.VALIDADA.equals((Object)notaFiscalTO.getSituacao())) {
                    if (error.getMessage().contains("Signature")) continue;
                    erroNFeTO = new ErroNFeTO();
                    erroNFeTO.setDescricao(error.getMessage());
                    notaFiscalTO.getListaErroNFe().add(erroNFeTO);
                    continue;
                }
                erroNFeTO = new ErroNFeTO();
                erroNFeTO.setDescricao(error.getMessage());
                notaFiscalTO.getListaErroNFe().add(erroNFeTO);
            }
        }
        return notaFiscalTO;
    }

    private Object a(Object objeto, String nome, List<String> listaDetalhes, String chaveProperty) throws DSGECommonException, DSENBusinessException {
        try {
            return ReflectionHelper.getFieldByReflection((Object)objeto, (String)nome);
        }
        catch (DSGECommonException e) {
            if (e.getSourceException() instanceof InvocationTargetException) {
                this.a(chaveProperty, MessageFormat.format(DSENMessageConstants.VALOR_INVALIDO, nome), listaDetalhes);
                return null;
            }
            if (e.getSourceException() instanceof NoSuchMethodException) {
                this.a(chaveProperty, MessageFormat.format(DSENMessageConstants.CAMPO_NAO_ENCONTRADO, nome, objeto.getClass().getName()), listaDetalhes);
                return null;
            }
            throw e;
        }
    }

    private void a(SchemaParticle parte, Object xmlPai, List<String> listaDetalhes, String chaveProperty) throws Exception {
        SchemaLocalAttribute[] atributos;
        if (parte == null || parte.getType() == null) {
            return;
        }
        SchemaAttributeModel modeloAtributos = parte.getType().getAttributeModel();
        if (modeloAtributos != null && (atributos = modeloAtributos.getAttributes()) != null && atributos.length > 0) {
            for (SchemaLocalAttribute atributo : atributos) {
                Object xml = null;
                Object[] lista = null;
                if (this.a(parte)) {
                    xml = this.a(xmlPai, parte.getName().getLocalPart() + "Array", listaDetalhes, chaveProperty);
                    lista = (Object[])xml;
                } else {
                    xml = this.a(xmlPai, parte.getName().getLocalPart(), listaDetalhes, chaveProperty);
                    lista = new Object[]{xml};
                }
                if (lista == null) continue;
                String chavePropertyAttrib = chaveProperty + "." + atributo.getName().getLocalPart();
                int posicaoArray = 1;
                for (Object xmlObj : lista) {
                    ArrayList<String> listaDetalhesFilho = new ArrayList<String>(listaDetalhes.size());
                    listaDetalhesFilho.addAll(listaDetalhes);
                    listaDetalhesFilho.add(this.a(posicaoArray, xmlObj, listaDetalhesFilho, chaveProperty));
                    ++posicaoArray;
                    if (!this.a(atributo, xmlObj, listaDetalhesFilho, chavePropertyAttrib) || !this.b(atributo, xmlObj, listaDetalhesFilho, chavePropertyAttrib) || !this.c(atributo, xmlObj, listaDetalhesFilho, chavePropertyAttrib)) continue;
                    this.a(atributo, xmlObj, listaDetalhesFilho, chavePropertyAttrib);
                }
            }
        }
    }

    private boolean a(SchemaParticle parte) {
        return parte.getMaxOccurs() == null || parte.getMaxOccurs().compareTo(new BigInteger("1")) > 0;
    }

    private boolean a(SchemaLocalAttribute attrib, Object xmlPai, List<String> listaDetalhes, String chaveProperty) throws DSGECommonException, DSENBusinessException {
        return this.a(attrib.getName().getLocalPart(), attrib.getMaxOccurs() == null || attrib.getMaxOccurs().compareTo(new BigInteger("1")) > 0, attrib.getMinOccurs(), xmlPai, listaDetalhes, chaveProperty);
    }

    private boolean a(SchemaParticle parte, Object xmlPai, List<String> listaDetalhes, String chaveProperty) throws DSGECommonException, DSENBusinessException {
        return this.a(parte.getName().getLocalPart(), parte.getMaxOccurs() == null || parte.getMaxOccurs().compareTo(new BigInteger("1")) > 0, parte.getMinOccurs(), xmlPai, listaDetalhes, chaveProperty);
    }

    private boolean a(String localPart, boolean isLista, BigInteger minOccurs, Object xmlPai, List<String> listaDetalhes, String chaveProperty) throws DSGECommonException, DSENBusinessException {
        Object xml = null;
        Object[] lista = null;
        if (isLista) {
            xml = this.a(xmlPai, localPart + "Array", listaDetalhes, chaveProperty);
            lista = (Object[])xml;
        } else {
            xml = this.a(xmlPai, localPart, listaDetalhes, chaveProperty);
        }
        if (BigInteger.ZERO.equals(minOccurs)) {
            if (xml == null) {
                return false;
            }
            return true;
        }
        if (minOccurs == null || BigInteger.ONE.equals(minOccurs)) {
            if (xml == null) {
                this.a(chaveProperty, DSENMessageConstants.CAMPO_OBRIGATORIO_NAO_PREENCHIDO, listaDetalhes);
                return false;
            }
            if (lista != null && lista.length < 1) {
                this.a(chaveProperty, DSENMessageConstants.CAMPO_OBRIGATORIO_NAO_PREENCHIDO, listaDetalhes);
                return false;
            }
        }
        if (minOccurs != null && minOccurs.compareTo(new BigInteger("1")) > 0) {
            try {
                lista = (Object[])ReflectionHelper.getFieldByReflection((Object)xmlPai, (String)(localPart + "Array"));
                if (lista == null || new BigInteger(String.valueOf(lista.length)).compareTo(minOccurs) > 0) {
                    this.a(chaveProperty, MessageFormat.format(DSENMessageConstants.OCORRENCIA_MINIMA, minOccurs.toString()), listaDetalhes);
                    return false;
                }
            }
            catch (DSGECommonException e) {
                this.a.error((Object)e.getMessage(), (Throwable)e);
                throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
            }
        }
        return true;
    }

    private boolean b(SchemaParticle parte, Object xmlPai, List<String> listaDetalhes, String chaveProperty) throws DSGECommonException, DSENBusinessException {
        return this.a(parte.getName().getLocalPart(), parte.getMaxOccurs(), xmlPai, listaDetalhes, chaveProperty);
    }

    private boolean b(SchemaLocalAttribute atributo, Object xmlPai, List<String> listaDetalhes, String chaveProperty) throws DSGECommonException, DSENBusinessException {
        return this.a(atributo.getName().getLocalPart(), atributo.getMaxOccurs(), xmlPai, listaDetalhes, chaveProperty);
    }

    private boolean a(String localPart, BigInteger maxOccurs, Object xmlPai, List<String> listaDetalhes, String chaveProperty) throws DSGECommonException, DSENBusinessException {
        Object[] lista = null;
        if (maxOccurs != null && maxOccurs.compareTo(new BigInteger("1")) > 0 && (lista = (Object[])this.a(xmlPai, localPart + "Array", listaDetalhes, chaveProperty)) != null && new BigInteger(String.valueOf(lista.length)).compareTo(maxOccurs) > 0) {
            this.a(chaveProperty, MessageFormat.format(DSENMessageConstants.OCORRENCIA_MAXIMA, maxOccurs.toString()), listaDetalhes);
            return false;
        }
        return true;
    }

    private String a(String chaveProperty) throws DSENBusinessException {
        return this.d(chaveProperty.replace("Array", "") + ".NOME_AMIGAVEL");
    }

    private String a(List<String> listaDetalhes, String chaveProperty) throws DSENBusinessException {
        return MessageFormat.format(this.d(chaveProperty.replace("Array", "") + ".NOME_ABA"), listaDetalhes.toArray());
    }

    private String b(String chaveProperty) throws DSENBusinessException {
        return this.a.getProperty(chaveProperty.replace("Array", "") + ".NOME_CAMPO_IDENTIFICADOR");
    }

    private String c(String chaveProperty) throws DSENBusinessException {
        return this.a.getProperty(chaveProperty.replace("Array", "") + ".NOME_LISTA_TELA");
    }

    private String d(String key) throws DSENBusinessException {
        String value = this.a.getProperty(key);
        if (StringHelper.isBlankOrNull((Object)value)) {
            String message = MessageFormat.format(DSENMessageConstants.CHAVE_NAO_EXISTE_DSEN_CAMPOS_PROPERTIES, key);
            throw new DSENBusinessException(new Throwable(message), message);
        }
        return value;
    }

    private void a(String chaveProperty, String descricao, List<String> listaDetalhes) throws DSENBusinessException {
        ErroNFeTO erroNFeTO = new ErroNFeTO();
        erroNFeTO.setDescricao(descricao);
        erroNFeTO.setAba(this.a(listaDetalhes, chaveProperty));
        erroNFeTO.setNomeCampo(this.a(chaveProperty));
        erroNFeTO.setTipoOcorrencia(ErroNFeTO.OCORRENCIA_ERRO);
        this.a.add(erroNFeTO);
    }

    private List<String> a(SchemaType type) {
        ArrayList<String> patterns = new ArrayList<String>();
        if (type == null) {
            return patterns;
        }
        if (type.getPatterns() != null) {
            for (String pattern : type.getPatterns()) {
                patterns.add(pattern);
            }
        }
        patterns.addAll(this.a(type.getBaseType()));
        return patterns;
    }

    private boolean c(SchemaParticle parte, Object xml, List<String> listaDetalhes, String chaveProperty) throws Exception {
        return this.a(parte.getName().getLocalPart(), parte.getType(), xml, listaDetalhes, chaveProperty);
    }

    private boolean c(SchemaLocalAttribute atributo, Object xml, List<String> listaDetalhes, String chaveProperty) throws Exception {
        return this.a(atributo.getName().getLocalPart(), atributo.getType(), xml, listaDetalhes, chaveProperty);
    }

    private boolean a(String localPart, SchemaType schemaType, Object xml, List<String> listaDetalhes, String chaveProperty) throws Exception {
        try {
            String valor = ReflectionHelper.getFieldValueByReflection((Object)xml, (String)localPart);
            List patterns = this.a(schemaType);
            for (String pattern : patterns) {
                if (valor == null || valor.matches(pattern)) continue;
                this.a(chaveProperty, DSENMessageConstants.ERRO_PATTERN, listaDetalhes);
                return false;
            }
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }

    private void b(SchemaParticle parte, Object xml, List<String> listaDetalhes, String chaveProperty) throws Exception {
        this.a(parte.getName().getLocalPart(), parte.getType(), xml, listaDetalhes, chaveProperty);
    }

    private void a(SchemaLocalAttribute atributo, Object xml, List<String> listaDetalhes, String chaveProperty) throws Exception {
        this.a(atributo.getName().getLocalPart(), atributo.getType(), xml, listaDetalhes, chaveProperty);
    }

    private void a(String localPart, SchemaType schemaType, Object xml, List<String> listaDetalhes, String chaveProperty) throws Exception {
        try {
            String valor = ReflectionHelper.getFieldValueByReflection((Object)xml, (String)localPart);
            XmlAnySimpleType facet = schemaType.getFacet(0);
            if (facet != null && valor.length() != new Integer(facet.getStringValue()).intValue()) {
                this.a(chaveProperty, MessageFormat.format(DSENMessageConstants.ERRO_FACET_LENGTH, facet.getStringValue()), listaDetalhes);
            }
            if ((facet = schemaType.getFacet(2)) != null && valor.length() > new Integer(facet.getStringValue())) {
                this.a(chaveProperty, MessageFormat.format(DSENMessageConstants.ERRO_FACET_MAXIMO, facet.getStringValue()), listaDetalhes);
            }
            if ((facet = schemaType.getFacet(1)) != null && valor.length() < new Integer(facet.getStringValue())) {
                this.a(chaveProperty, MessageFormat.format(DSENMessageConstants.ERRO_FACET_MINIMO, facet.getStringValue()), listaDetalhes);
            }
        }
        catch (Exception e) {
            return;
        }
    }

    private void c(SchemaParticle tag, Object xmlPai, List<String> listaDetalhes, String chaveProperty) throws DSGECommonException, DSENBusinessException {
        ArrayList<Object> filhos = new ArrayList<Object>();
        SchemaParticle filhoEscolhido = null;
        for (SchemaParticle filho : tag.getParticleChildren()) {
            if (filho.getParticleType() == 3) continue;
            Object objeto = null;
            String nomeFilho = filho.getName().getLocalPart();
            if (filho.getType().isSimpleType()) {
                Object valorObj = ReflectionHelper.getFieldByReflection((Object)xmlPai, (String)nomeFilho);
                if (valorObj == null) continue;
                filhoEscolhido = filho;
                filhos.add(valorObj.toString());
                continue;
            }
            nomeFilho = filho.getIntMaxOccurs() <= 1 ? nomeFilho : nomeFilho + "Array";
            objeto = ReflectionHelper.getFieldByReflection((Object)xmlPai, (String)nomeFilho);
            if (objeto == null) continue;
            if (objeto instanceof Object[]) {
                Object[] lista = (Object[])objeto;
                if (lista.length <= 0) continue;
                filhoEscolhido = filho;
                filhos.addAll(Arrays.asList(objeto));
                continue;
            }
            filhoEscolhido = filho;
            filhos.add(objeto);
        }
        if (filhoEscolhido != null && filhos.size() > filhoEscolhido.getIntMaxOccurs()) {
            this.a(chaveProperty + "." + filhoEscolhido.getName().getLocalPart(), MessageFormat.format(DSENMessageConstants.ERRO_CHOICE_INFORME_NO_MAX_X_FILHOS, tag.getIntMaxOccurs(), this.a(chaveProperty + "." + filhoEscolhido.getName().getLocalPart())), listaDetalhes);
        }
        if (filhoEscolhido != null && filhoEscolhido.getIntMinOccurs() >= 1 && filhos.size() < filhoEscolhido.getIntMinOccurs()) {
            this.a(chaveProperty + "." + filhoEscolhido.getName().getLocalPart(), MessageFormat.format(DSENMessageConstants.ERRO_CHOICE_FILHO_INFORME_PELO_MENOS_UM_FILHO, this.a(chaveProperty + "." + filhoEscolhido.getName().getLocalPart())), listaDetalhes);
        }
        if (filhoEscolhido != null && tag.getIntMinOccurs() >= 1 && filhos.size() == 0) {
            this.a(chaveProperty, DSENMessageConstants.ERRO_CHOICE_FILHO_OBRIGATORIO, listaDetalhes);
        }
    }

    private void a(SchemaParticle choice, String nomeChoice, Object xmlPai, List<String> listaDetalhes, String chaveProperty, HashMap<String, Integer> mapNomeListaTelaPosicaoArray) throws Exception {
        if (mapNomeListaTelaPosicaoArray == null) {
            mapNomeListaTelaPosicaoArray = new HashMap();
        }
        for (SchemaParticle filho : choice.getParticleChildren()) {
            Object objeto;
            String nomeFilho;
            String chavePropertyFilho = chaveProperty;
            if (filho.getParticleType() == 3) {
                SchemaParticle[] netos = filho.getParticleChildren();
                boolean sequenceSelecionado = false;
                if (netos == null) continue;
                List<String> listaDetalhesNeto = listaDetalhes;
                for (SchemaParticle neto : netos) {
                    String nomeNeto;
                    if (neto.getType().isSimpleType()) {
                        nomeNeto = neto.getName().getLocalPart();
                        if (this.a(xmlPai, nomeNeto, listaDetalhes, chaveProperty) == null) continue;
                        sequenceSelecionado = true;
                        break;
                    }
                    nomeNeto = filho.getIntMaxOccurs() <= 1 ? neto.getName().getLocalPart() : neto.getName().getLocalPart() + "Array";
                    objeto = ReflectionHelper.getFieldByReflection((Object)xmlPai, (String)nomeNeto);
                    if (objeto == null) continue;
                    sequenceSelecionado = true;
                    break;
                }
                if (!sequenceSelecionado) continue;
                this.a(filho, nomeChoice, xmlPai, listaDetalhesNeto, chaveProperty);
                continue;
            }
            objeto = null;
            if (filho.getType().isSimpleType()) {
                nomeFilho = filho.getName().getLocalPart();
                if (this.a(xmlPai, nomeFilho, listaDetalhes, chaveProperty) == null) continue;
                this.a(filho, nomeChoice, xmlPai, this.a(mapNomeListaTelaPosicaoArray, filho, xmlPai, listaDetalhes, chaveProperty + "." + nomeFilho), chaveProperty);
                continue;
            }
            nomeFilho = filho.getIntMaxOccurs() <= 1 ? filho.getName().getLocalPart() : filho.getName().getLocalPart() + "Array";
            objeto = ReflectionHelper.getFieldByReflection((Object)xmlPai, (String)nomeFilho);
            if (objeto == null) continue;
            if (objeto instanceof Object[]) {
                Object[] lista = (Object[])objeto;
                int posicaoArray = 1;
                for (SchemaParticle pai : lista) {
                    ArrayList<String> listaDetalhesFilho = new ArrayList<String>(listaDetalhes.size());
                    listaDetalhesFilho.addAll(listaDetalhes);
                    listaDetalhesFilho.add(this.a(posicaoArray, (Object)pai, listaDetalhesFilho, chaveProperty));
                    ++posicaoArray;
                    this.b(filho, nomeChoice + "." + nomeFilho, (Object)pai, this.a(mapNomeListaTelaPosicaoArray, filho, xmlPai, listaDetalhes, chaveProperty + "." + nomeFilho), chaveProperty);
                }
                continue;
            }
            this.b(filho, nomeChoice + "." + nomeFilho, objeto, this.a(mapNomeListaTelaPosicaoArray, filho, xmlPai, listaDetalhes, chaveProperty + "." + nomeFilho), chaveProperty);
        }
    }

    private List<String> a(HashMap<String, Integer> mapNomeListaTelaPosicaoArray, SchemaParticle filho, Object xmlPai, List<String> listaDetalhes, String chavePropertyFilho) throws DSGECommonException, DSENBusinessException {
        ArrayList<String> listaDetalhesFilho = new ArrayList<String>(listaDetalhes.size());
        Object objeto = ReflectionHelper.getFieldByReflection((Object)xmlPai, (String)filho.getName().getLocalPart());
        if (objeto != null) {
            String nomeListaTela = this.c(chavePropertyFilho);
            nomeListaTela = StringHelper.isBlankOrNull((Object)nomeListaTela) ? "default" : nomeListaTela;
            Integer ultimaPos = mapNomeListaTelaPosicaoArray.get(nomeListaTela);
            if (ultimaPos == null) {
                ultimaPos = new Integer(1);
            }
            listaDetalhesFilho.addAll(listaDetalhes);
            listaDetalhesFilho.add(this.a(ultimaPos.intValue(), objeto, listaDetalhesFilho, chavePropertyFilho));
            mapNomeListaTelaPosicaoArray.put(nomeListaTela, new Integer(ultimaPos + 1));
        }
        return listaDetalhesFilho;
    }

    private void a(SchemaParticle tag, String anterior, Object xmlPai, List<String> listaDetalhes, String chaveProperty) throws DSENBusinessException {
        this.a(tag, anterior, xmlPai, listaDetalhes, -1, chaveProperty);
    }

    private void a(SchemaParticle tag, String anterior, Object xmlPai, List<String> listaDetalhes, int posChoice, String chaveProperty, HashMap<String, Integer> mapNomeListaTelaPosicaoArray) throws DSENBusinessException {
        try {
            if (xmlPai == null) {
                return;
            }
            chaveProperty = anterior + "." + "CHOICE" + (posChoice > 1 ? Integer.valueOf(posChoice) : "");
            this.c(tag, xmlPai, listaDetalhes, chaveProperty);
            this.a(tag, chaveProperty, xmlPai, listaDetalhes, chaveProperty, mapNomeListaTelaPosicaoArray);
            this.a(tag, xmlPai, listaDetalhes, chaveProperty);
        }
        catch (DSGECommonException e) {
            this.a.error((Object)e.getMessage(), (Throwable)e);
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (Exception e) {
            this.a.error((Object)e.getMessage(), (Throwable)e);
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    private void a(SchemaParticle tag, String anterior, Object xmlPai, List<String> listaDetalhes, int posChoice, String chaveProperty) throws DSENBusinessException {
        block24 : {
            try {
                Object xmlCampo = null;
                if (xmlPai == null) {
                    return;
                }
                if (tag == null) break block24;
                block3 : switch (tag.getParticleType()) {
                    case 2: {
                        chaveProperty = anterior + "." + "CHOICE" + (posChoice > 1 ? Integer.valueOf(posChoice) : "");
                        this.c(tag, xmlPai, listaDetalhes, chaveProperty);
                        this.a(tag, chaveProperty, xmlPai, listaDetalhes, chaveProperty, null);
                        break;
                    }
                    case 3: {
                        chaveProperty = anterior + "." + "SEQUENCE";
                        if (!this.d(tag, xmlPai, listaDetalhes, chaveProperty)) break;
                        this.b(tag, chaveProperty, xmlPai, listaDetalhes, chaveProperty);
                        break;
                    }
                    case 4: {
                        if (this.a(tag)) {
                            xmlCampo = this.a(xmlPai, tag.getName().getLocalPart() + "Array", listaDetalhes, chaveProperty);
                        } else {
                            try {
                                xmlCampo = this.a(xmlPai, tag.getName().getLocalPart(), listaDetalhes, chaveProperty);
                            }
                            catch (DSGECommonException e) {
                                try {
                                    xmlCampo = this.a(xmlPai, tag.getName().getLocalPart() + "Array", listaDetalhes, chaveProperty);
                                }
                                catch (Exception ex) {
                                    this.a.error((Object)ex.getMessage());
                                    throw new DSENBusinessException((Throwable)ex, ex.getMessage());
                                }
                            }
                        }
                        chaveProperty = xmlCampo instanceof Object[] ? anterior + "." + tag.getName().getLocalPart() + "Array" : anterior + "." + tag.getName().getLocalPart();
                        switch (tag.getType().getContentType()) {
                            case 1: {
                                break block3;
                            }
                            case 2: {
                                if (!this.a(tag, xmlPai, listaDetalhes, chaveProperty)) break block3;
                                this.b(tag, xmlPai, listaDetalhes, chaveProperty);
                                break block3;
                            }
                            case 3: {
                                if (this.a(tag, xmlPai, listaDetalhes, chaveProperty)) {
                                    this.b(tag, xmlPai, listaDetalhes, chaveProperty);
                                }
                                if (xmlCampo == null) break block3;
                                this.b(tag, chaveProperty, xmlCampo, listaDetalhes, chaveProperty);
                                break block3;
                            }
                            case 4: {
                                if (this.a(tag, xmlPai, listaDetalhes, chaveProperty)) {
                                    this.b(tag, xmlPai, listaDetalhes, chaveProperty);
                                }
                                if (xmlCampo == null) break block3;
                                this.b(tag, chaveProperty, xmlCampo, listaDetalhes, chaveProperty);
                                break block3;
                            }
                            case 0: {
                                if (!this.a(tag, xmlPai, listaDetalhes, chaveProperty) || !this.b(tag, xmlPai, listaDetalhes, chaveProperty) || xmlCampo == null || !this.c(tag, xmlPai, listaDetalhes, chaveProperty)) break block3;
                                this.b(tag, xmlPai, listaDetalhes, chaveProperty);
                                break block3;
                            }
                        }
                        break;
                    }
                }
                this.a(tag, xmlPai, listaDetalhes, chaveProperty);
            }
            catch (DSGECommonException e) {
                this.a.error((Object)e.getMessage(), (Throwable)e);
                throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
            }
            catch (Exception e) {
                this.a.error((Object)e.getMessage(), (Throwable)e);
                throw new DSENBusinessException((Throwable)e, e.getMessage());
            }
        }
    }

    private boolean d(SchemaParticle tag, Object xmlPai, List<String> listaDetalhes, String chaveProperty) throws DSGECommonException, DSENBusinessException {
        Object xml = null;
        if (BigInteger.ZERO.equals(tag.getMinOccurs())) {
            for (SchemaParticle filho : tag.getParticleChildren()) {
                xml = this.a(xmlPai, filho.getName().getLocalPart(), listaDetalhes, chaveProperty);
                if (xml == null) continue;
                return true;
            }
            return false;
        }
        return true;
    }

    private void b(SchemaParticle tagPai, String nomePai, Object xmlPai, List<String> listaDetalhes, String chaveProperty) throws Exception {
        Object[] xmlPaiArray = null;
        SchemaParticle[] filhos = tagPai.getParticleChildren();
        HashMap mapNomeListaTelaPosicaoArray = new HashMap();
        if (xmlPai instanceof Object[]) {
            xmlPaiArray = (Object[])xmlPai;
            if (xmlPaiArray.length > 0) {
                int x = 0;
                for (Object pai : xmlPaiArray) {
                    ++x;
                    if (filhos != null) {
                        int y = 0;
                        for (SchemaParticle filho : filhos) {
                            if (2 == filho.getParticleType()) {
                                ++y;
                            }
                            ArrayList<String> listaDetalhesFilho = new ArrayList<String>(listaDetalhes.size());
                            listaDetalhesFilho.addAll(listaDetalhes);
                            listaDetalhesFilho.add(this.a(x, pai, listaDetalhesFilho, chaveProperty));
                            this.a(filho, nomePai, pai, listaDetalhesFilho, y, chaveProperty);
                        }
                        continue;
                    }
                    if (tagPai.getType().getContentModel().getParticleType() == 2) {
                        this.a(tagPai.getType().getContentModel(), nomePai, pai, listaDetalhes, -1, chaveProperty, mapNomeListaTelaPosicaoArray);
                        continue;
                    }
                    ArrayList<String> listaDetalhesFilho = new ArrayList<String>(listaDetalhes.size());
                    listaDetalhesFilho.addAll(listaDetalhes);
                    listaDetalhesFilho.add(this.a(x, pai, listaDetalhesFilho, chaveProperty));
                    this.a(tagPai.getType().getContentModel(), nomePai, pai, listaDetalhesFilho, -1, chaveProperty);
                }
            }
        } else if (filhos != null) {
            int y = 0;
            for (SchemaParticle filho : filhos) {
                if (2 == filho.getParticleType()) {
                    ++y;
                }
                this.a(filho, nomePai, xmlPai, listaDetalhes, y, chaveProperty);
            }
        } else {
            this.a(tagPai.getType().getContentModel(), nomePai, xmlPai, listaDetalhes, chaveProperty);
        }
    }

    private String a(int posicaoArray, Object objeto, List<String> listaDetalhes, String chaveProperty) throws DSENBusinessException, DSGECommonException {
        String[] campos;
        String nomeCampoIdentificador = this.b(chaveProperty);
        if (StringHelper.isBlankOrNull((Object)nomeCampoIdentificador)) {
            return String.valueOf(posicaoArray);
        }
        for (String campo : campos = nomeCampoIdentificador.split("\\.")) {
            if (!StringHelper.isBlankOrNull((Object)(objeto = this.a(objeto, campo, listaDetalhes, chaveProperty)))) continue;
            return "?";
        }
        return objeto.toString();
    }
}

