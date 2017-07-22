/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ParametroEnum
 *  br.gov.sp.fazenda.dsen.model.entity.ParametrosEntity
 *  javax.persistence.Column
 *  javax.persistence.Entity
 *  javax.persistence.Id
 *  javax.persistence.NamedQueries
 *  javax.persistence.NamedQuery
 *  javax.persistence.Table
 */
package br.gov.sp.fazenda.dsen.model.entity;

import br.gov.sp.fazenda.dsen.common.enumeration.ParametroEnum;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="PARAMETROS")
@NamedQueries(value={@NamedQuery(name="ParametrosEntity.findAll", query="SELECT p FROM ParametrosEntity p")})
public class ParametrosEntity
implements Serializable {
    private static final long serialVersionUID = -2602399798402928415L;
    @Id
    @Column(name="PARAMETROS_ENUM", nullable=0)
    private Short parametrosEnum;
    @Column(name="VALOR")
    private String valor;

    public ParametrosEntity() {
    }

    public ParametrosEntity(ParametroEnum parametrosEnum) {
        this.parametrosEnum = new Short((short)parametrosEnum.ordinal());
    }

    public ParametrosEntity(ParametroEnum parametrosEnum, String valor) {
        this.parametrosEnum = new Short((short)parametrosEnum.ordinal());
        this.valor = valor;
    }

    public ParametroEnum getParametrosEnum() {
        return ParametroEnum.values()[this.parametrosEnum];
    }

    public void setParametrosEnum(ParametroEnum parametrosEnum) {
        this.parametrosEnum = new Short((short)parametrosEnum.ordinal());
    }

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int hashCode() {
        int hash = 0;
        return hash += this.parametrosEnum != null ? this.parametrosEnum.hashCode() : 0;
    }

    public boolean equals(Object object) {
        if (!(object instanceof ParametrosEntity)) {
            return false;
        }
        ParametrosEntity other = (ParametrosEntity)object;
        if (!(this.parametrosEnum == other.parametrosEnum || this.parametrosEnum != null && this.parametrosEnum.equals(other.parametrosEnum))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "br.gov.sp.fazenda.dsen.model.entity.ParametrosEntity[parametrosEnum=" + this.parametrosEnum + "]";
    }
}

