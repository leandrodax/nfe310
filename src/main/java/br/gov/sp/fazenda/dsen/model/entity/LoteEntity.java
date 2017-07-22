/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.entity.LoteEntity
 *  javax.persistence.Column
 *  javax.persistence.Entity
 *  javax.persistence.GeneratedValue
 *  javax.persistence.GenerationType
 *  javax.persistence.Id
 *  javax.persistence.Lob
 *  javax.persistence.NamedQueries
 *  javax.persistence.NamedQuery
 *  javax.persistence.Table
 *  javax.persistence.TableGenerator
 *  javax.persistence.Temporal
 *  javax.persistence.TemporalType
 */
package br.gov.sp.fazenda.dsen.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="LOTE")
@NamedQueries(value={@NamedQuery(name="LoteEntity.findById", query="SELECT n FROM LoteEntity n WHERE n.idLote = :idLote")})
public class LoteEntity
implements Serializable {
    private static final long serialVersionUID = -5763920127967350778L;
    @TableGenerator(name="LOTE_GEN", table="GENERATOR", pkColumnName="GEN_KEY", valueColumnName="GEN_VALUE", pkColumnValue="LOTE", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="LOTE_GEN")
    @Id
    @Column(name="ID_LOTE", nullable=0)
    private Long idLote;
    @Column(name="CNPJ_TRANSMISSAO", nullable=0)
    private String cnpjTransmissao;
    @Column(name="DATA_TRANSMISSAO", nullable=0)
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date dataTransmissao;
    @Column(name="NUM_RECIBO")
    private String numRecibo;
    @Lob
    @Column(name="XML_RETORNO")
    private byte[] xmlRetorno;
    @Column(name="DATA_PROC")
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date dataProcessamento;

    public LoteEntity() {
    }

    public LoteEntity(Long idLote) {
        this.idLote = idLote;
    }

    public LoteEntity(Long idLote, String cnpjTransmissao, Date dataTransmissao) {
        this.idLote = idLote;
        this.cnpjTransmissao = cnpjTransmissao;
        this.dataTransmissao = dataTransmissao;
    }

    public Long getIdLote() {
        return this.idLote;
    }

    public void setIdLote(Long idLote) {
        this.idLote = idLote;
    }

    public String getCnpjTransmissao() {
        return this.cnpjTransmissao;
    }

    public void setCnpjTransmissao(String cnpjTransmissao) {
        this.cnpjTransmissao = cnpjTransmissao;
    }

    public Date getDataTransmissao() {
        return this.dataTransmissao;
    }

    public void setDataTransmissao(Date dataTransmissao) {
        this.dataTransmissao = dataTransmissao;
    }

    public String getNumRecibo() {
        return this.numRecibo;
    }

    public void setNumRecibo(String numRecibo) {
        this.numRecibo = numRecibo;
    }

    public byte[] getXmlRetorno() {
        return this.xmlRetorno;
    }

    public void setXmlRetorno(byte[] xmlRetorno) {
        this.xmlRetorno = xmlRetorno;
    }

    public Date getDataProcessamento() {
        return this.dataProcessamento;
    }

    public void setDataProcessamento(Date dataProc) {
        this.dataProcessamento = dataProc;
    }

    public int hashCode() {
        int hash = 0;
        return hash += this.idLote != null ? this.idLote.hashCode() : 0;
    }

    public boolean equals(Object object) {
        if (!(object instanceof LoteEntity)) {
            return false;
        }
        LoteEntity other = (LoteEntity)object;
        if (!(this.idLote == other.idLote || this.idLote != null && this.idLote.equals(other.idLote))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "br.gov.sp.fazenda.dsen.model.entity.LoteEntity[idLote=" + this.idLote + "]";
    }
}

