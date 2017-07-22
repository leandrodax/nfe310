/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.PropriedadeEnum
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.PropriedadeEntity
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

import br.gov.sp.fazenda.dsen.common.enumeration.PropriedadeEnum;
import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
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
@Table(name="PROPRIEDADE")
@NamedQueries(value={@NamedQuery(name="PropriedadeEntity.findByEmitenteAndPropriedadeEnum", query="SELECT p FROM PropriedadeEntity p WHERE p.idEmitente.idEmitente = :idEmitente AND p.propriedadeEnum = :propriedadeEnum")})
public class PropriedadeEntity
implements Serializable {
    private static final long serialVersionUID = -8441159425602411401L;
    @TableGenerator(name="PROPRIEDADE_GEN", table="GENERATOR", pkColumnName="GEN_KEY", valueColumnName="GEN_VALUE", pkColumnValue="PROPRIEDADE", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="PROPRIEDADE_GEN")
    @Id
    @Column(name="ID_PROPRIEDADE", nullable=0)
    private Integer idPropriedade;
    @Column(name="PROPRIEDADE_ENUM", nullable=0)
    private PropriedadeEnum propriedadeEnum;
    @Column(name="VALOR")
    private String valor;
    @JoinColumn(name="ID_EMITENTE", referencedColumnName="ID_EMITENTE")
    @ManyToOne
    private EmitenteEntity idEmitente;

    public PropriedadeEntity() {
    }

    public PropriedadeEntity(Integer idPropriedade) {
        this.idPropriedade = idPropriedade;
    }

    public PropriedadeEntity(Integer idPropriedade, PropriedadeEnum propriedadeEnum) {
        this.idPropriedade = idPropriedade;
        this.propriedadeEnum = propriedadeEnum;
    }

    public Integer getIdPropriedade() {
        return this.idPropriedade;
    }

    public void setIdPropriedade(Integer idPropriedade) {
        this.idPropriedade = idPropriedade;
    }

    public PropriedadeEnum getPropriedadeEnum() {
        return this.propriedadeEnum;
    }

    public void setPropriedadeEnum(PropriedadeEnum propriedadeEnum) {
        this.propriedadeEnum = propriedadeEnum;
    }

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public EmitenteEntity getIdEmitente() {
        return this.idEmitente;
    }

    public void setIdEmitente(EmitenteEntity idEmitente) {
        this.idEmitente = idEmitente;
    }

    public int hashCode() {
        int hash = 0;
        return hash += this.idPropriedade != null ? this.idPropriedade.hashCode() : 0;
    }

    public boolean equals(Object object) {
        if (!(object instanceof PropriedadeEntity)) {
            return false;
        }
        PropriedadeEntity other = (PropriedadeEntity)object;
        if (!(this.idPropriedade == other.idPropriedade || this.idPropriedade != null && this.idPropriedade.equals(other.idPropriedade))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "br.gov.sp.fazenda.dsen.model.entity.PropriedadeEntity[idPropriedade=" + this.idPropriedade + "]";
    }
}

