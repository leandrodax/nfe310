/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.business.validation.GeradorCamposSchema
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe
 *  org.apache.xmlbeans.SchemaAttributeModel
 *  org.apache.xmlbeans.SchemaLocalAttribute
 *  org.apache.xmlbeans.SchemaParticle
 *  org.apache.xmlbeans.SchemaType
 */
package br.gov.sp.fazenda.dsen.model.business.validation;

import br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Set;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaAttributeModel;
import org.apache.xmlbeans.SchemaLocalAttribute;
import org.apache.xmlbeans.SchemaParticle;
import org.apache.xmlbeans.SchemaType;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class GeradorCamposSchema {
    private static int a = 0;
    private LinkedHashMap<String, String> a;
    private String a = null;

    public static void main(String[] args) {
        GeradorCamposSchema classe = new GeradorCamposSchema();
        try {
            classe.comparaArquivos();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(SchemaParticle tag, String anterior) throws Exception {
        if (tag != null) {
            block0 : switch (tag.getParticleType()) {
                case 2: {
                    this.a = anterior + "." + "CHOICE";
                    this.b(tag, this.a);
                    break;
                }
                case 3: {
                    this.a = anterior + "." + "SEQUENCE";
                    this.b(tag, this.a);
                    break;
                }
                case 4: {
                    this.a = anterior + "." + tag.getName().getLocalPart();
                    String nomePropriedade = this.a + ".NOME_ABA";
                    this.a.put(nomePropriedade, "<Nome da aba>");
                    nomePropriedade = this.a + ".NOME_AMIGAVEL";
                    this.a.put(nomePropriedade, "<Nome amig\u00e1vel>");
                    switch (tag.getType().getContentType()) {
                        case 1: {
                            this.c(tag, this.a);
                            break block0;
                        }
                        case 2: {
                            this.c(tag, this.a);
                            break block0;
                        }
                        case 3: {
                            this.c(tag, this.a);
                            this.b(tag, this.a);
                            break block0;
                        }
                        case 4: {
                            this.c(tag, this.a);
                            this.b(tag, this.a);
                            break block0;
                        }
                        case 0: {
                            break block0;
                        }
                    }
                    break;
                }
            }
        }
    }

    private void b(SchemaParticle tagPai, String nomePai) throws Exception {
        SchemaParticle[] filhos = tagPai.getParticleChildren();
        if (filhos != null) {
            for (SchemaParticle filho : filhos) {
                this.a(filho, nomePai);
            }
        } else {
            this.a(tagPai.getType().getContentModel(), nomePai);
        }
    }

    public void comparaArquivos() throws Exception {
    }

    public void gerarArquivo() throws Exception {
        NFeDocument doc = NFeDocument.Factory.newInstance();
        doc.addNewNFe().addNewInfNFe();
        SchemaParticle schema = doc.getNFe().getInfNFe().schemaType().getContentModel();
        this.a(schema, "TNFe.SEQUENCE.infNFe");
        PrintWriter pw = new PrintWriter("c:\\temp\\arquivo_novo.txt");
        Set c = this.a.keySet();
        for (String st : c) {
            pw.println(st + "=");
            System.out.println(st);
        }
        pw.close();
    }

    private void c(SchemaParticle parte, String nome) {
        SchemaAttributeModel modeloAtributos = parte.getType().getAttributeModel();
        if (modeloAtributos != null) {
            SchemaLocalAttribute[] atributos;
            for (SchemaLocalAttribute atributo : atributos = modeloAtributos.getAttributes()) {
                ++a;
            }
        }
    }
}

