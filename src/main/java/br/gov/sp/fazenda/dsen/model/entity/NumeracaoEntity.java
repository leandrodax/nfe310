/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.NumeracaoEntity
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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="NUMERACAO")
@NamedQueries(value={@NamedQuery(name="NumeracaoEntity.findLastBySerieEmitente", query="SELECT n FROM NumeracaoEntity n WHERE  n.serie = :serie and  n.idEmitente = :idEmitente and n.dataSistema = (SELECT max(n2.dataSistema) FROM NumeracaoEntity n2 WHERE  n2.serie = n.serie and n2.idEmitente = n.idEmitente)"), @NamedQuery(name="NumeracaoEntity.findLastByEmitente", query="SELECT n FROM NumeracaoEntity n WHERE n.idEmitente = :idEmitente and n.dataSistema = (SELECT max(n2.dataSistema) FROM NumeracaoEntity n2 WHERE n2.idEmitente = n.idEmitente)")})
public class NumeracaoEntity
implements Serializable {
    private static final long serialVersionUID = 3429540434861580179L;
    @TableGenerator(name="NUMERACAO_GEN", table="GENERATOR", pkColumnName="GEN_KEY", valueColumnName="GEN_VALUE", pkColumnValue="NUMERACAO", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="NUMERACAO_GEN")
    @Id
    @Column(name="ID_NUMERACAO", nullable=0)
    private Integer idNumeracao;
    @Column(name="SERIE", nullable=0)
    private String serie;
    @Column(name="NUMERO", nullable=0)
    private String numero;
    @Column(name="ANO")
    private String ano;
    @Column(name="DATA_SISTEMA")
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date dataSistema;
    @JoinColumn(name="ID_EMITENTE", referencedColumnName="ID_EMITENTE")
    @ManyToOne
    private EmitenteEntity idEmitente;

    public static final long getSerialVersionUID() {
        return 3429540434861580179L;
    }

    public Integer getIdNumeracao() {
        return this.idNumeracao;
    }

    public void setIdNumeracao(Integer theIdNumeracao) {
        this.idNumeracao = theIdNumeracao;
    }

    public String getSerie() {
        return this.serie;
    }

    public void setSerie(String theSerie) {
        this.serie = theSerie;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String theNumero) {
        this.numero = theNumero;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String theAno) {
        this.ano = theAno;
    }

    public Date getDataSistema() {
        return this.dataSistema;
    }

    public void setDataSistema(Date theDataSistema) {
        this.dataSistema = theDataSistema;
    }

    public EmitenteEntity getIdEmitente() {
        return this.idEmitente;
    }

    public void setIdEmitente(EmitenteEntity theIdEmitente) {
        this.idEmitente = theIdEmitente;
    }

    public NumeracaoEntity() {
    }

    public NumeracaoEntity(Integer idNumeracao) {
        this.idNumeracao = idNumeracao;
    }

    public NumeracaoEntity(Integer idNumeracao, String serie, String numero) {
        this.idNumeracao = idNumeracao;
        this.serie = serie;
        this.numero = numero;
    }

    public int hashCode() {
        int hash = 0;
        return hash += this.idNumeracao != null ? this.idNumeracao.hashCode() : 0;
    }

    public boolean equals(Object object) {
        if (!(object instanceof NumeracaoEntity)) {
            return false;
        }
        NumeracaoEntity other = (NumeracaoEntity)object;
        if (!(this.idNumeracao == other.idNumeracao || this.idNumeracao != null && this.idNumeracao.equals(other.idNumeracao))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "br.gov.sp.fazenda.dsen.model.entity.NumeracaoEntity[idNumeracao=" + this.idNumeracao + "]";
    }
}

