/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.entity.DocumentoEntity
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.LoteEntity
 *  javax.persistence.Column
 *  javax.persistence.Entity
 *  javax.persistence.GeneratedValue
 *  javax.persistence.GenerationType
 *  javax.persistence.Id
 *  javax.persistence.Inheritance
 *  javax.persistence.InheritanceType
 *  javax.persistence.JoinColumn
 *  javax.persistence.Lob
 *  javax.persistence.ManyToOne
 *  javax.persistence.NamedQueries
 *  javax.persistence.NamedQuery
 *  javax.persistence.Table
 *  javax.persistence.TableGenerator
 *  javax.persistence.Temporal
 *  javax.persistence.TemporalType
 */
package br.gov.sp.fazenda.dsen.model.entity;

import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
import br.gov.sp.fazenda.dsen.model.entity.LoteEntity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="DOCUMENTO")
@Inheritance(strategy=InheritanceType.JOINED)
@NamedQueries(value={@NamedQuery(name="DocumentoEntity.findByIdDocumento", query="SELECT d FROM DocumentoEntity d WHERE d.idDocumento = :idDocumento"), @NamedQuery(name="DocumentoEntity.findByAno", query="SELECT d FROM DocumentoEntity d WHERE d.ano = :ano"), @NamedQuery(name="DocumentoEntity.findBySerie", query="SELECT d FROM DocumentoEntity d WHERE d.serie = :serie"), @NamedQuery(name="DocumentoEntity.findByModelo", query="SELECT d FROM DocumentoEntity d WHERE d.modelo = :modelo"), @NamedQuery(name="DocumentoEntity.findByDataSistema", query="SELECT d FROM DocumentoEntity d WHERE d.dataSistema = :dataSistema"), @NamedQuery(name="DocumentoEntity.findByNProtocolo", query="SELECT d FROM DocumentoEntity d WHERE d.nProtocolo = :nProtocolo"), @NamedQuery(name="DocumentoEntity.findByVersao", query="SELECT d FROM DocumentoEntity d WHERE d.versao = :versao"), @NamedQuery(name="DocumentoEntity.findByDataProtocolo", query="SELECT d FROM DocumentoEntity d WHERE d.dataProtocolo = :dataProtocolo"), @NamedQuery(name="DocumentoEntity.findByCUf", query="SELECT d FROM DocumentoEntity d WHERE d.cUf = :cUf")})
public class DocumentoEntity
implements Serializable {
    private static final long serialVersionUID = 5912511248243712114L;
    @TableGenerator(name="DOCUMENTO_GEN", table="GENERATOR", pkColumnName="GEN_KEY", valueColumnName="GEN_VALUE", pkColumnValue="DOCUMENTO", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="DOCUMENTO_GEN")
    @Id
    @Column(name="ID_DOCUMENTO", nullable=0)
    private Long idDocumento;
    @Column(name="ANO", nullable=0)
    private String ano;
    @Lob
    @Column(name="DOC_XML")
    private byte[] docXml;
    @Column(name="SERIE", nullable=0)
    private String serie;
    @Lob
    @Column(name="PROTOCOLO")
    private byte[] protocolo;
    @Column(name="MODELO", nullable=0)
    private String modelo;
    @Column(name="DATA_SISTEMA")
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date dataSistema;
    @Column(name="N_PROTOCOLO")
    private String nProtocolo;
    @Column(name="VERSAO", nullable=0)
    private String versao;
    @Column(name="DATA_PROTOCOLO")
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date dataProtocolo;
    @Column(name="C_UF", nullable=0)
    private String cUf;
    @ManyToOne
    @JoinColumn(name="ID_EMITENTE", referencedColumnName="ID_EMITENTE")
    private EmitenteEntity idEmitente;
    @ManyToOne
    @JoinColumn(name="ID_LOTE", referencedColumnName="ID_LOTE")
    private LoteEntity idLote;

    public DocumentoEntity() {
    }

    public DocumentoEntity(Long idDocumento) {
        this.idDocumento = idDocumento;
    }

    public DocumentoEntity(Long idDocumento, String ano, String serie, String modelo, String versao, String cUf) {
        this.idDocumento = idDocumento;
        this.ano = ano;
        this.serie = serie;
        this.modelo = modelo;
        this.versao = versao;
        this.cUf = cUf;
    }

    public Long getIdDocumento() {
        return this.idDocumento;
    }

    public void setIdDocumento(Long idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public byte[] getDocXml() {
        return this.docXml;
    }

    public void setDocXml(byte[] docXml) {
        this.docXml = docXml;
    }

    public String getSerie() {
        return this.serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public byte[] getProtocolo() {
        return this.protocolo;
    }

    public void setProtocolo(byte[] protocolo) {
        this.protocolo = protocolo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getDataSistema() {
        return this.dataSistema;
    }

    public void setDataSistema(Date dataSistema) {
        this.dataSistema = dataSistema;
    }

    public String getNProtocolo() {
        return this.nProtocolo;
    }

    public void setNProtocolo(String nProtocolo) {
        this.nProtocolo = nProtocolo;
    }

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public Date getDataProtocolo() {
        return this.dataProtocolo;
    }

    public void setDataProtocolo(Date dataProtocolo) {
        this.dataProtocolo = dataProtocolo;
    }

    public String getCUf() {
        return this.cUf;
    }

    public void setCUf(String cUf) {
        this.cUf = cUf;
    }

    public EmitenteEntity getIdEmitente() {
        return this.idEmitente;
    }

    public void setIdEmitente(EmitenteEntity idEmitente) {
        this.idEmitente = idEmitente;
    }

    public LoteEntity getIdLote() {
        return this.idLote;
    }

    public void setIdLote(LoteEntity idLote) {
        this.idLote = idLote;
    }

    public int hashCode() {
        int hash = 0;
        return hash += this.idDocumento != null ? this.idDocumento.hashCode() : 0;
    }

    public boolean equals(Object object) {
        if (!(object instanceof DocumentoEntity)) {
            return false;
        }
        DocumentoEntity other = (DocumentoEntity)object;
        if (!(this.idDocumento == other.idDocumento || this.idDocumento != null && this.idDocumento.equals(other.idDocumento))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "br.gov.sp.fazenda.dsen.model.entity.DocumentoEntity[idDocumento=" + this.idDocumento + "]";
    }
}

