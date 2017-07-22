/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.certif.NomesAlternativos
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 *  org.bouncycastle.asn1.ASN1InputStream
 *  org.bouncycastle.asn1.ASN1TaggedObject
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DERObjectIdentifier
 *  org.bouncycastle.asn1.DEROctetString
 *  org.bouncycastle.asn1.DERSequence
 *  org.bouncycastle.asn1.DERString
 */
package br.gov.sp.fazenda.dsge.certif;

import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERString;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class NomesAlternativos<T, U> {
    private static Log a = LogFactory.getLog(NomesAlternativos.class);
    private T a;
    private U b;

    public NomesAlternativos() {
    }

    private NomesAlternativos(T t, U u) {
        this.a = t;
        this.b = u;
    }

    private NomesAlternativos<DERObjectIdentifier, String> a(byte[] encoded) throws Exception {
        ASN1InputStream inputStream = new ASN1InputStream(encoded);
        DERSequence sequence = (DERSequence)inputStream.readObject();
        inputStream.close();
        Enumeration enumeration = sequence.getObjects();
        DERObjectIdentifier objectIdentifier = (DERObjectIdentifier)enumeration.nextElement();
        DERObject object = ((ASN1TaggedObject)((ASN1TaggedObject)enumeration.nextElement()).getObject()).getObject();
        String conteudo = "";
        if (object instanceof DERString) {
            conteudo = ((DERString)object).getString();
        } else if (object instanceof DEROctetString) {
            conteudo = new String(((DEROctetString)object).getOctets(), "ISO-8859-1");
        }
        return new NomesAlternativos((Object)objectIdentifier, (Object)conteudo);
    }

    public HashMap<String, String> recuperarNomesAlternativos(X509Certificate certificado) throws Exception {
        HashMap<String, String> nomesAlternativos = new HashMap<String, String>();
        Collection collectionSubjectAlternativeName = certificado.getSubjectAlternativeNames();
        try {
            if (collectionSubjectAlternativeName != null) {
                for (List subjectAlternativeName : collectionSubjectAlternativeName) {
                    switch (((Number)subjectAlternativeName.get(0)).intValue()) {
                        case 0: {
                            NomesAlternativos otherName = this.a((byte[])subjectAlternativeName.get(1));
                            nomesAlternativos.put(((DERObjectIdentifier)otherName.a).getId(), (String)otherName.b);
                            break;
                        }
                        case 1: {
                            nomesAlternativos.put("Email", (String)subjectAlternativeName.get(1));
                            break;
                        }
                    }
                }
            }
        }
        catch (RuntimeException e) {
            a.error((Object)e.getMessage());
            throw e;
        }
        catch (Exception e) {
            a.error((Object)e.getMessage());
            throw e;
        }
        return nomesAlternativos;
    }
}

