/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.entity.IcmsEntity
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
@Table(name="ICMS")
@NamedQueries(value={@NamedQuery(name="IcmsEntity.findByIdIcms", query="SELECT i FROM IcmsEntity i WHERE i.idIcms = :idIcms"), @NamedQuery(name="IcmsEntity.findByOrig", query="SELECT i FROM IcmsEntity i WHERE i.orig = :orig"), @NamedQuery(name="IcmsEntity.findByCst", query="SELECT i FROM IcmsEntity i WHERE i.cst = :cst"), @NamedQuery(name="IcmsEntity.findByModBc", query="SELECT i FROM IcmsEntity i WHERE i.modBc = :modBc"), @NamedQuery(name="IcmsEntity.findByPRedBc", query="SELECT i FROM IcmsEntity i WHERE i.pRedBc = :pRedBc"), @NamedQuery(name="IcmsEntity.findByPIcms", query="SELECT i FROM IcmsEntity i WHERE i.pIcms = :pIcms"), @NamedQuery(name="IcmsEntity.findByModBcst", query="SELECT i FROM IcmsEntity i WHERE i.modBcst = :modBcst"), @NamedQuery(name="IcmsEntity.findByPMvast", query="SELECT i FROM IcmsEntity i WHERE i.pMvast = :pMvast"), @NamedQuery(name="IcmsEntity.findByPRedBcst", query="SELECT i FROM IcmsEntity i WHERE i.pRedBcst = :pRedBcst"), @NamedQuery(name="IcmsEntity.findByPIcmsst", query="SELECT i FROM IcmsEntity i WHERE i.pIcmsst = :pIcmsst")})
public class IcmsEntity
implements Serializable {
    private static final long serialVersionUID = -1234781034664015268L;
    @TableGenerator(name="ICMS_GEN", table="GENERATOR", pkColumnName="GEN_KEY", valueColumnName="GEN_VALUE", pkColumnValue="ICMS", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="ICMS_GEN")
    @Id
    @Column(name="ID_ICMS", nullable=0)
    private Integer idIcms;
    @Column(name="ORIG")
    private String orig;
    @Column(name="CST", nullable=0)
    private String cst;
    @Column(name="MOD_BC")
    private String modBc;
    @Column(name="P_RED_BC")
    private String pRedBc;
    @Column(name="P_ICMS")
    private String pIcms;
    @Column(name="MOD_BCST")
    private String modBcst;
    @Column(name="P_MVAST")
    private String pMvast;
    @Column(name="P_RED_BCST")
    private String pRedBcst;
    @Column(name="P_ICMSST")
    private String pIcmsst;
    @Column(name="MOT_DES_ICMS")
    private String motDesICMS;
    @Column(name="P_BCOP")
    private String pBCOp;
    @Column(name="UFST")
    private String UFST;
    @Column(name="P_CRED_SN")
    private String pCredSN;
    @JoinColumn(name="ID_PRODUTO", referencedColumnName="ID_PRODUTO")
    @ManyToOne
    private ProdutoEntity idProduto;

    public IcmsEntity() {
    }

    public IcmsEntity(Integer idIcms) {
        this.idIcms = idIcms;
    }

    public IcmsEntity(Integer idIcms, String cst) {
        this.idIcms = idIcms;
        this.cst = cst;
    }

    public Integer getIdIcms() {
        return this.idIcms;
    }

    public void setIdIcms(Integer idIcms) {
        this.idIcms = idIcms;
    }

    public String getOrig() {
        return this.orig;
    }

    public void setOrig(String orig) {
        this.orig = orig;
    }

    public String getCst() {
        return this.cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public String getModBc() {
        return this.modBc;
    }

    public void setModBc(String modBc) {
        this.modBc = modBc;
    }

    public String getPRedBc() {
        return this.pRedBc;
    }

    public void setPRedBc(String pRedBc) {
        this.pRedBc = pRedBc;
    }

    public String getPIcms() {
        return this.pIcms;
    }

    public void setPIcms(String pIcms) {
        this.pIcms = pIcms;
    }

    public String getModBcst() {
        return this.modBcst;
    }

    public void setModBcst(String modBcst) {
        this.modBcst = modBcst;
    }

    public String getPMvast() {
        return this.pMvast;
    }

    public void setPMvast(String pMvast) {
        this.pMvast = pMvast;
    }

    public String getPRedBcst() {
        return this.pRedBcst;
    }

    public void setPRedBcst(String pRedBcst) {
        this.pRedBcst = pRedBcst;
    }

    public String getPIcmsst() {
        return this.pIcmsst;
    }

    public void setPIcmsst(String pIcmsst) {
        this.pIcmsst = pIcmsst;
    }

    public ProdutoEntity getIdProduto() {
        return this.idProduto;
    }

    public void setIdProduto(ProdutoEntity idProduto) {
        this.idProduto = idProduto;
    }

    public int hashCode() {
        int hash = 0;
        return hash += this.idIcms != null ? this.idIcms.hashCode() : 0;
    }

    public boolean equals(Object object) {
        if (!(object instanceof IcmsEntity)) {
            return false;
        }
        IcmsEntity other = (IcmsEntity)object;
        if (!(this.idIcms == other.idIcms || this.idIcms != null && this.idIcms.equals(other.idIcms))) {
            return false;
        }
        if (!(this.cst == other.cst || this.cst != null && this.cst.equals(other.cst))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "br.gov.sp.fazenda.dsen.model.entity.IcmsEntity[idIcms=" + this.idIcms + "]";
    }

    public String getMotDesICMS() {
        return this.motDesICMS;
    }

    public void setMotDesICMS(String motDesICMS) {
        this.motDesICMS = motDesICMS;
    }

    public String getPBCOp() {
        return this.pBCOp;
    }

    public void setPBCOp(String op) {
        this.pBCOp = op;
    }

    public String getPCredSN() {
        return this.pCredSN;
    }

    public void setPCredSN(String credSN) {
        this.pCredSN = credSN;
    }

    public String getUFST() {
        return this.UFST;
    }

    public void setUFST(String ufst) {
        this.UFST = ufst;
    }
}

