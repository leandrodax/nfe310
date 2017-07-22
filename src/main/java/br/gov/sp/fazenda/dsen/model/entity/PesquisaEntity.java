/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.PesquisaEntity
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

import br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum;
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
@Table(name="PESQUISA")
@NamedQueries(value={@NamedQuery(name="PesquisaEntity.findByIdEmitenteTelaEnum", query="SELECT p FROM PesquisaEntity p WHERE p.idEmitente.idEmitente = :idEmitente AND p.telaEnum = :telaEnum")})
public class PesquisaEntity
implements Serializable {
    private static final long serialVersionUID = -5620715078203628695L;
    @TableGenerator(name="PESQUISA_GEN", table="GENERATOR", pkColumnName="GEN_KEY", valueColumnName="GEN_VALUE", pkColumnValue="PESQUISA", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="PESQUISA_GEN")
    @Id
    @Column(name="ID_PESQUISA", nullable=0)
    private Integer idPesquisa;
    @Column(name="CAMPO_ENUM", nullable=0)
    private Integer campoEnum;
    @Column(name="VALOR")
    private String valor;
    @Column(name="TELA_ENUM", nullable=0)
    private TelaPesquisaEnum telaEnum;
    @JoinColumn(name="ID_EMITENTE", referencedColumnName="ID_EMITENTE")
    @ManyToOne
    private EmitenteEntity idEmitente;

    public PesquisaEntity() {
    }

    public PesquisaEntity(Integer idPesquisa) {
        this.idPesquisa = idPesquisa;
    }

    public PesquisaEntity(Integer idPesquisa, Integer campoEnum, TelaPesquisaEnum telaEnum) {
        this.idPesquisa = idPesquisa;
        this.campoEnum = campoEnum;
        this.telaEnum = telaEnum;
    }

    public Integer getIdPesquisa() {
        return this.idPesquisa;
    }

    public void setIdPesquisa(Integer idPesquisa) {
        this.idPesquisa = idPesquisa;
    }

    public Integer getCampoEnum() {
        return this.campoEnum;
    }

    public void setCampoEnum(Integer campoEnum) {
        this.campoEnum = campoEnum;
    }

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public TelaPesquisaEnum getTelaEnum() {
        return this.telaEnum;
    }

    public void setTelaEnum(TelaPesquisaEnum telaEnum) {
        this.telaEnum = telaEnum;
    }

    public EmitenteEntity getIdEmitente() {
        return this.idEmitente;
    }

    public void setIdEmitente(EmitenteEntity idEmitente) {
        this.idEmitente = idEmitente;
    }

    public int hashCode() {
        int hash = 0;
        return hash += this.idPesquisa != null ? this.idPesquisa.hashCode() : 0;
    }

    public boolean equals(Object object) {
        if (!(object instanceof PesquisaEntity)) {
            return false;
        }
        PesquisaEntity other = (PesquisaEntity)object;
        if (!(this.idPesquisa == other.idPesquisa || this.idPesquisa != null && this.idPesquisa.equals(other.idPesquisa))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "br.gov.sp.fazenda.dsen.model.entity.PesquisaEntity[idPesquisa=" + this.idPesquisa + "]";
    }
}

