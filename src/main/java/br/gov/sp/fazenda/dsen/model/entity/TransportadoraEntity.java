/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.TransportadoraEntity
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  javax.persistence.Column
 *  javax.persistence.Entity
 *  javax.persistence.GeneratedValue
 *  javax.persistence.GenerationType
 *  javax.persistence.Id
 *  javax.persistence.JoinColumn
 *  javax.persistence.ManyToOne
 *  javax.persistence.NamedQueries
 *  javax.persistence.NamedQuery
 *  javax.persistence.Table
 *  javax.persistence.TableGenerator
 */
package br.gov.sp.fazenda.dsen.model.entity;

import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="TRANSPORTADORA")
@NamedQueries(value={@NamedQuery(name="TransportadoraEntity.findByNrDocumento", query="SELECT t FROM TransportadoraEntity t WHERE t.nrDocumento = :nrDocumento  AND t.idEmitente = :idEmitente")})
public class TransportadoraEntity
implements Serializable {
    private static final long serialVersionUID = 999527416535631364L;
    @TableGenerator(name="TRANSPORTADORA_GEN", table="GENERATOR", pkColumnName="GEN_KEY", valueColumnName="GEN_VALUE", pkColumnValue="TRANSPORTADORA", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="TRANSPORTADORA_GEN")
    @Id
    @Column(name="ID_TRANSPORTADORA", nullable=0)
    private Integer idTransportadora;
    @Column(name="TP_DOCUMENTO_ENUM")
    private TipoDocumentoEnum tpDocumentoEnum;
    @Column(name="NR_DOCUMENTO")
    private String nrDocumento;
    @Column(name="X_NOME", nullable=0)
    private String xNome;
    @Column(name="IE")
    private String ie;
    @Column(name="X_ENDER")
    private String xEnder;
    @Column(name="UF")
    private String uf;
    @Column(name="X_MUN")
    private String xMun;
    @JoinColumn(name="ID_EMITENTE", referencedColumnName="ID_EMITENTE")
    @ManyToOne
    private EmitenteEntity idEmitente;
    @Column(name="VERSAO", nullable=0)
    private String versao;

    public TransportadoraEntity() {
    }

    public TransportadoraEntity(Integer idTransportadora) {
        this.idTransportadora = idTransportadora;
    }

    public TransportadoraEntity(Integer idTransportadora, TipoDocumentoEnum tpDocumentoEnum, String nrDocumento) {
        this.idTransportadora = idTransportadora;
        this.tpDocumentoEnum = tpDocumentoEnum;
        this.nrDocumento = nrDocumento;
    }

    public Integer getIdTransportadora() {
        return this.idTransportadora;
    }

    public void setIdTransportadora(Integer idTransportadora) {
        this.idTransportadora = idTransportadora;
    }

    public TipoDocumentoEnum getTpDocumentoEnum() {
        return this.tpDocumentoEnum;
    }

    public void setTpDocumentoEnum(TipoDocumentoEnum tpDocumentoEnum) {
        this.tpDocumentoEnum = tpDocumentoEnum;
    }

    public String getNrDocumento() {
        return this.nrDocumento;
    }

    public void setNrDocumento(String nrDocumento) {
        this.nrDocumento = nrDocumento;
    }

    public String getXNome() {
        return this.xNome;
    }

    public void setXNome(String xNome) {
        this.xNome = xNome;
    }

    public String getIe() {
        return this.ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getXEnder() {
        return this.xEnder;
    }

    public void setXEnder(String xEnder) {
        this.xEnder = xEnder;
    }

    public String getUf() {
        return this.uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getXMun() {
        return this.xMun;
    }

    public void setXMun(String mun) {
        this.xMun = mun;
    }

    public EmitenteEntity getIdEmitente() {
        return this.idEmitente;
    }

    public void setIdEmitente(EmitenteEntity idEmitente) {
        this.idEmitente = idEmitente;
    }

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public int hashCode() {
        int hash = 0;
        return hash += this.idTransportadora != null ? this.idTransportadora.hashCode() : 0;
    }

    public boolean equals(Object object) {
        if (!(object instanceof TransportadoraEntity)) {
            return false;
        }
        TransportadoraEntity other = (TransportadoraEntity)object;
        if (!(this.idTransportadora == other.idTransportadora || this.idTransportadora != null && this.idTransportadora.equals(other.idTransportadora))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "br.gov.sp.fazenda.dsen.model.entity.TransportadoraEntity[idTransportadora=" + this.idTransportadora + "]";
    }
}

