/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.entity.CertificadoInfoEntity
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
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

@Entity
@Table(name="CERTIFICADO_INFO")
@NamedQueries(value={@NamedQuery(name="CertificadoInfo.findByIdEmitente", query="SELECT c FROM CertificadoInfoEntity c WHERE c.emitente.idEmitente = :idEmitente ORDER BY c.tipoCertificado,c.nome,c.cnpj"), @NamedQuery(name="CertificadoInfo.deleteByIdEmitente", query="DELETE CertificadoInfoEntity c WHERE c.emitente.idEmitente = :idEmitente")})
public class CertificadoInfoEntity
implements Serializable {
    private static final long serialVersionUID = 3723538090827214248L;
    @TableGenerator(name="CERTIFICADO_INFO_GEN", table="GENERATOR", pkColumnName="GEN_KEY", valueColumnName="GEN_VALUE", pkColumnValue="CERTIFICADO_INFO", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="CERTIFICADO_INFO_GEN")
    @Id
    @Column(name="ID_CERTIFICADO_INFO", nullable=0)
    private Integer idCertificadoInfo;
    @Column(name="AUTORIDADE_CERTIFICADORA", nullable=0)
    private String autoridadeCertificadora;
    @Column(name="CNPJ", nullable=0)
    private String cnpj;
    @JoinColumn(name="ID_EMITENTE", nullable=0, referencedColumnName="ID_EMITENTE")
    @ManyToOne
    private EmitenteEntity emitente;
    @Column(name="TIPO_CERTIFICADO", nullable=0)
    private String tipoCertificado;
    @Column(name="ALIAS", nullable=0)
    private String alias;
    @Column(name="NOME", nullable=0)
    private String nome;
    @Column(name="DATA_UTILIZACAO", nullable=1)
    private Date dataUtilizacao;
    @Column(name="CAMINHO", nullable=0)
    private String caminho;
    @Column(name="DATA_VALIDADE", nullable=0)
    private Date dataValidade;

    public String getAutoridadeCertificadora() {
        return this.autoridadeCertificadora;
    }

    public void setAutoridadeCertificadora(String theAutoridadeCertificadora) {
        this.autoridadeCertificadora = theAutoridadeCertificadora;
    }

    public Integer getIdCertificadoInfo() {
        return this.idCertificadoInfo;
    }

    public void setIdCertificadoInfo(Integer theIdCertificadoInfo) {
        this.idCertificadoInfo = theIdCertificadoInfo;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String theCnpj) {
        this.cnpj = theCnpj;
    }

    public EmitenteEntity getEmitente() {
        return this.emitente;
    }

    public void setEmitente(EmitenteEntity theEmitente) {
        this.emitente = theEmitente;
    }

    public String getTipoCertificado() {
        return this.tipoCertificado;
    }

    public void setTipoCertificado(String theTipoCertificado) {
        this.tipoCertificado = theTipoCertificado;
    }

    public void CertificadoEntity() {
    }

    public void CertificadoEntity(Integer idCertificadoInfo) {
        this.idCertificadoInfo = idCertificadoInfo;
    }

    public String getCaminho() {
        return this.caminho;
    }

    public void setCaminho(String theCaminho) {
        this.caminho = theCaminho;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String theAlias) {
        this.alias = theAlias;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataValidade() {
        return this.dataValidade;
    }

    public void setDataValidade(Date theDataValidade) {
        this.dataValidade = theDataValidade;
    }

    public Date getDataUtilizacao() {
        return this.dataUtilizacao;
    }

    public void setDataUtilizacao(Date theDataUtilizacao) {
        this.dataUtilizacao = theDataUtilizacao;
    }

    public int hashCode() {
        return this.idCertificadoInfo != null ? this.idCertificadoInfo.hashCode() : 0;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object.getClass() != CertificadoInfoEntity.class) {
            return false;
        }
        CertificadoInfoEntity other = (CertificadoInfoEntity)object;
        if (!(this.idCertificadoInfo == other.idCertificadoInfo || this.idCertificadoInfo != null && this.idCertificadoInfo.equals(other.idCertificadoInfo))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "" + (this.idCertificadoInfo != null ? this.idCertificadoInfo.hashCode() : 0);
    }
}

