/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.entity.ControleVersaoEntity
 *  javax.persistence.Column
 *  javax.persistence.Entity
 *  javax.persistence.Id
 *  javax.persistence.NamedQueries
 *  javax.persistence.NamedQuery
 *  javax.persistence.Table
 *  javax.persistence.Temporal
 *  javax.persistence.TemporalType
 */
package br.gov.sp.fazenda.dsen.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="CONTROLE_VERSAO")
@NamedQueries(value={@NamedQuery(name="ControleVersaoEntity.findMaxNumeroVersaoString", query="select max(c.numVersaoEnum) from ControleVersaoEntity c")})
public class ControleVersaoEntity
implements Serializable {
    private static final long serialVersionUID = -8807303762461068445L;
    @Id
    @Column(name="ID_CONTROLE_VERSAO", nullable=0)
    private Integer idControleVersao;
    @Column(name="NUM_VERSAO_ENUM", nullable=0)
    private Integer numVersaoEnum;
    @Column(name="DATA_VERSAO", nullable=0)
    @Temporal(value=TemporalType.DATE)
    private Date dataVersao;

    public ControleVersaoEntity() {
    }

    public ControleVersaoEntity(Integer idControleVersao) {
        this.idControleVersao = idControleVersao;
    }

    public ControleVersaoEntity(Integer idControleVersao, Integer numVersaoEnum, Date dataVersao) {
        this.idControleVersao = idControleVersao;
        this.numVersaoEnum = numVersaoEnum;
        this.dataVersao = dataVersao;
    }

    public Integer getIdControleVersao() {
        return this.idControleVersao;
    }

    public void setIdControleVersao(Integer idControleVersao) {
        this.idControleVersao = idControleVersao;
    }

    public Integer getNumVersaoEnum() {
        return this.numVersaoEnum;
    }

    public void setNumVersaoEnum(Integer numVersaoEnum) {
        this.numVersaoEnum = numVersaoEnum;
    }

    public Date getDataVersao() {
        return this.dataVersao;
    }

    public void setDataVersao(Date dataVersao) {
        this.dataVersao = dataVersao;
    }

    public int hashCode() {
        int hash = 0;
        return hash += this.idControleVersao != null ? this.idControleVersao.hashCode() : 0;
    }

    public boolean equals(Object object) {
        if (!(object instanceof ControleVersaoEntity)) {
            return false;
        }
        ControleVersaoEntity other = (ControleVersaoEntity)object;
        if (!(this.idControleVersao == other.idControleVersao || this.idControleVersao != null && this.idControleVersao.equals(other.idControleVersao))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "br.gov.sp.fazenda.dsen.model.entity.ControleVersaoEntity[idControleVersao=" + this.idControleVersao + "]";
    }
}

