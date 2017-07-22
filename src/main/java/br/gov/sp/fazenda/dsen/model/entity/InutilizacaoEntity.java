/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.InutilizacaoEntity
 *  javax.persistence.Column
 *  javax.persistence.Entity
 *  javax.persistence.GeneratedValue
 *  javax.persistence.GenerationType
 *  javax.persistence.Id
 *  javax.persistence.JoinColumn
 *  javax.persistence.Lob
 *  javax.persistence.ManyToOne
 *  javax.persistence.Table
 *  javax.persistence.TableGenerator
 *  javax.persistence.Temporal
 *  javax.persistence.TemporalType
 */
package br.gov.sp.fazenda.dsen.model.entity;

import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="INUTILIZACAO")
public class InutilizacaoEntity
implements Serializable {
    @TableGenerator(name="INUTILIZACAO_GEN", table="GENERATOR", pkColumnName="GEN_KEY", valueColumnName="GEN_VALUE", pkColumnValue="INUTILIZACAO", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="INUTILIZACAO_GEN")
    @Id
    @Column(name="ID_INUTILIZACAO", nullable=0)
    private Long idInutilizacao;
    @ManyToOne
    @JoinColumn(name="ID_EMITENTE", referencedColumnName="ID_EMITENTE")
    private EmitenteEntity emitenteEntity;
    private static final long serialVersionUID = 5935718110716463716L;
    @Column(name="NUMERO_INICIAL", nullable=0)
    private String numeroInicial;
    @Column(name="NUMERO_FINAL", nullable=0)
    private String numeroFinal;
    @Column(name="SERIE", nullable=0)
    private String serie;
    @Lob
    @Column(name="PROTOCOLO_XML")
    private byte[] protocoloXml;
    @Column(name="DATA_INUTILIZACAO")
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date dataInutilizacao;

    public String getNumeroInicial() {
        return this.numeroInicial;
    }

    public void setNumeroInicial(String numeroInicial) {
        this.numeroInicial = numeroInicial;
    }

    public String getNumeroFinal() {
        return this.numeroFinal;
    }

    public void setNumeroFinal(String numeroFinal) {
        this.numeroFinal = numeroFinal;
    }

    public int hashCode() {
        int hash = 0;
        return hash += this.getIdInutilizacao() != null ? this.getIdInutilizacao().hashCode() : 0;
    }

    public boolean equals(Object object) {
        if (!(object instanceof InutilizacaoEntity)) {
            return false;
        }
        InutilizacaoEntity other = (InutilizacaoEntity)object;
        if (!(this.idInutilizacao == other.getIdInutilizacao() || this.idInutilizacao != null && this.idInutilizacao.equals(other.getIdInutilizacao()))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "br.gov.sp.fazenda.dsec.model.entity.InutilizacaoEntity[idInutilizacao=" + this.idInutilizacao + "]";
    }

    public String getSerie() {
        return this.serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Long getIdInutilizacao() {
        return this.idInutilizacao;
    }

    public void setIdInutilizacao(Long idInutilizacao) {
        this.idInutilizacao = idInutilizacao;
    }

    public byte[] getProtocoloXml() {
        return this.protocoloXml;
    }

    public void setProtocoloXml(byte[] docXml) {
        this.protocoloXml = docXml;
    }

    public Date getDataInutilizacao() {
        return this.dataInutilizacao;
    }

    public void setDataInutilizacao(Date dataInutilizacao) {
        this.dataInutilizacao = dataInutilizacao;
    }

    public EmitenteEntity getEmitenteEntity() {
        return this.emitenteEntity;
    }

    public void setEmitenteEntity(EmitenteEntity emitenteEntity) {
        this.emitenteEntity = emitenteEntity;
    }
}

