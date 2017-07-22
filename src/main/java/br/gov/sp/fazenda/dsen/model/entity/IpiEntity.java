/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.entity.IpiEntity
 *  br.gov.sp.fazenda.dsen.model.entity.ProdutoEntity
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

import br.gov.sp.fazenda.dsen.model.entity.ProdutoEntity;
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
@Table(name="IPI")
@NamedQueries(value={@NamedQuery(name="IpiEntity.findByIdIpi", query="SELECT i FROM IpiEntity i WHERE i.idIpi = :idIpi"), @NamedQuery(name="IpiEntity.findByClEnq", query="SELECT i FROM IpiEntity i WHERE i.clEnq = :clEnq"), @NamedQuery(name="IpiEntity.findByCnpjProd", query="SELECT i FROM IpiEntity i WHERE i.cnpjProd = :cnpjProd"), @NamedQuery(name="IpiEntity.findByCEnq", query="SELECT i FROM IpiEntity i WHERE i.cEnq = :cEnq")})
public class IpiEntity
implements Serializable {
    @TableGenerator(name="IPI_GEN", table="GENERATOR", pkColumnName="GEN_KEY", valueColumnName="GEN_VALUE", pkColumnValue="IPI", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="IPI_GEN")
    @Id
    @Column(name="ID_IPI", nullable=0)
    private Integer idIpi;
    @Column(name="CL_ENQ")
    private String clEnq;
    @Column(name="CNPJ_PROD")
    private String cnpjProd;
    @Column(name="C_ENQ")
    private String cEnq;
    @JoinColumn(name="ID_PRODUTO", referencedColumnName="ID_PRODUTO")
    @ManyToOne
    private ProdutoEntity idProduto;

    public IpiEntity() {
    }

    public IpiEntity(Integer idIpi) {
        this.idIpi = idIpi;
    }

    public Integer getIdIpi() {
        return this.idIpi;
    }

    public void setIdIpi(Integer idIpi) {
        this.idIpi = idIpi;
    }

    public String getClEnq() {
        return this.clEnq;
    }

    public void setClEnq(String clEnq) {
        this.clEnq = clEnq;
    }

    public String getCnpjProd() {
        return this.cnpjProd;
    }

    public void setCnpjProd(String cnpjProd) {
        this.cnpjProd = cnpjProd;
    }

    public String getCEnq() {
        return this.cEnq;
    }

    public void setCEnq(String cEnq) {
        this.cEnq = cEnq;
    }

    public ProdutoEntity getIdProduto() {
        return this.idProduto;
    }

    public void setIdProduto(ProdutoEntity idProduto) {
        this.idProduto = idProduto;
    }

    public int hashCode() {
        int hash = 0;
        return hash += this.idIpi != null ? this.idIpi.hashCode() : 0;
    }

    public boolean equals(Object object) {
        if (!(object instanceof IpiEntity)) {
            return false;
        }
        IpiEntity other = (IpiEntity)object;
        if (!(this.idIpi == other.idIpi || this.idIpi != null && this.idIpi.equals(other.idIpi))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "br.gov.sp.fazenda.dsen.model.entity.IpiEntity[idIpi=" + this.idIpi + "]";
    }
}

