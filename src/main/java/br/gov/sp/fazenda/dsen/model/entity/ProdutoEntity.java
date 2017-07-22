/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.IcmsEntity
 *  br.gov.sp.fazenda.dsen.model.entity.IpiEntity
 *  br.gov.sp.fazenda.dsen.model.entity.ProdutoEntity
 *  javax.persistence.CascadeType
 *  javax.persistence.Column
 *  javax.persistence.Entity
 *  javax.persistence.GeneratedValue
 *  javax.persistence.GenerationType
 *  javax.persistence.Id
 *  javax.persistence.JoinColumn
 *  javax.persistence.ManyToOne
 *  javax.persistence.NamedQueries
 *  javax.persistence.NamedQuery
 *  javax.persistence.OneToMany
 *  javax.persistence.Table
 *  javax.persistence.TableGenerator
 *  org.hibernate.annotations.Cascade
 *  org.hibernate.annotations.CascadeType
 */
package br.gov.sp.fazenda.dsen.model.entity;

import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
import br.gov.sp.fazenda.dsen.model.entity.IcmsEntity;
import br.gov.sp.fazenda.dsen.model.entity.IpiEntity;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name="PRODUTO")
@NamedQueries(value={@NamedQuery(name="ProdutoEntity.findByCProd", query="SELECT p FROM ProdutoEntity p WHERE p.cProd = :cProd AND p.idEmitente = :idEmitente")})
public class ProdutoEntity
implements Serializable {
    private static final long serialVersionUID = -3419194531978101605L;
    @Column(name="C_PROD", nullable=0)
    private String cProd;
    @TableGenerator(name="PRODUTO_GEN", table="GENERATOR", pkColumnName="GEN_KEY", valueColumnName="GEN_VALUE", pkColumnValue="PRODUTO", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="PRODUTO_GEN")
    @Id
    @Column(name="ID_PRODUTO", nullable=0)
    private Integer idProduto;
    @Column(name="X_PROD", nullable=0)
    private String xProd;
    @Column(name="C_EAN")
    private String cEan;
    @Column(name="NCM")
    private String ncm;
    @Column(name="EX_TIPI")
    private String exTipi;
    @Column(name="GENERO")
    private String genero;
    @Column(name="U_COM")
    private String uCom;
    @Column(name="V_UN_COM")
    private String vUnCom;
    @Column(name="V_UN_TRIB")
    private String vUnTrib;
    @Column(name="C_EAN_TRIB")
    private String cEanTrib;
    @Column(name="U_TRIB")
    private String uTrib;
    @Column(name="Q_TRIB")
    private String qTrib;
    @Column(name="VERSAO", nullable=0)
    private String versao;
    @Cascade(value={org.hibernate.annotations.CascadeType.DELETE_ORPHAN, org.hibernate.annotations.CascadeType.MERGE})
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="idProduto")
    private Set<IpiEntity> ipiEntitySet;
    @Cascade(value={org.hibernate.annotations.CascadeType.DELETE_ORPHAN, org.hibernate.annotations.CascadeType.MERGE})
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="idProduto")
    private Set<IcmsEntity> icmsEntitySet;
    @JoinColumn(name="ID_EMITENTE", referencedColumnName="ID_EMITENTE")
    @ManyToOne
    private EmitenteEntity idEmitente;

    public ProdutoEntity() {
    }

    public ProdutoEntity(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public ProdutoEntity(Integer idProduto, String cProd, String xProd) {
        this.idProduto = idProduto;
        this.cProd = cProd;
        this.xProd = xProd;
    }

    public String getCProd() {
        return this.cProd;
    }

    public void setCProd(String cProd) {
        this.cProd = cProd;
    }

    public Integer getIdProduto() {
        return this.idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getXProd() {
        return this.xProd;
    }

    public void setXProd(String xProd) {
        this.xProd = xProd;
    }

    public String getCEan() {
        return this.cEan;
    }

    public void setCEan(String cEan) {
        this.cEan = cEan;
    }

    public String getNcm() {
        return this.ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public String getExTipi() {
        return this.exTipi;
    }

    public void setExTipi(String exTipi) {
        this.exTipi = exTipi;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUCom() {
        return this.uCom;
    }

    public void setUCom(String uCom) {
        this.uCom = uCom;
    }

    public String getCEanTrib() {
        return this.cEanTrib;
    }

    public void setCEanTrib(String cEanTrib) {
        this.cEanTrib = cEanTrib;
    }

    public String getUTrib() {
        return this.uTrib;
    }

    public void setUTrib(String uTrib) {
        this.uTrib = uTrib;
    }

    public Set<IpiEntity> getIpiEntitySet() {
        return this.ipiEntitySet;
    }

    public void setIpiEntitySet(Set<IpiEntity> ipiEntityCollection) {
        this.ipiEntitySet = ipiEntityCollection;
    }

    public Set<IcmsEntity> getIcmsEntitySet() {
        return this.icmsEntitySet;
    }

    public void setIcmsEntitySet(Set<IcmsEntity> icmsEntityCollection) {
        this.icmsEntitySet = icmsEntityCollection;
    }

    public EmitenteEntity getIdEmitente() {
        return this.idEmitente;
    }

    public void setIdEmitente(EmitenteEntity idEmitente) {
        this.idEmitente = idEmitente;
    }

    public String getVUnCom() {
        return this.vUnCom;
    }

    public void setVUnCom(String unCom) {
        this.vUnCom = unCom;
    }

    public String getVUnTrib() {
        return this.vUnTrib;
    }

    public void setVUnTrib(String unTrib) {
        this.vUnTrib = unTrib;
    }

    public String getQTrib() {
        return this.qTrib;
    }

    public void setQTrib(String trib) {
        this.qTrib = trib;
    }

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public int hashCode() {
        int hash = 0;
        return hash += this.idProduto != null ? this.idProduto.hashCode() : 0;
    }

    public boolean equals(Object object) {
        if (!(object instanceof ProdutoEntity)) {
            return false;
        }
        ProdutoEntity other = (ProdutoEntity)object;
        if (!(this.idProduto == other.idProduto || this.idProduto != null && this.idProduto.equals(other.idProduto))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "br.gov.sp.fazenda.dsen.model.entity.ProdutoEntity[idProduto=" + this.idProduto + "]";
    }
}

