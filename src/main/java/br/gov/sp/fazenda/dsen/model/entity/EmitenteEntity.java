/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.RegimeTributarioEnum
 *  br.gov.sp.fazenda.dsen.model.entity.CertificadoInfoEntity
 *  br.gov.sp.fazenda.dsen.model.entity.ClienteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.InutilizacaoEntity
 *  br.gov.sp.fazenda.dsen.model.entity.NotaFiscalEntity
 *  br.gov.sp.fazenda.dsen.model.entity.NumeracaoEntity
 *  br.gov.sp.fazenda.dsen.model.entity.PesquisaEntity
 *  br.gov.sp.fazenda.dsen.model.entity.ProdutoEntity
 *  br.gov.sp.fazenda.dsen.model.entity.PropriedadeEntity
 *  br.gov.sp.fazenda.dsen.model.entity.TransportadoraEntity
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  javax.persistence.Column
 *  javax.persistence.Entity
 *  javax.persistence.EnumType
 *  javax.persistence.Enumerated
 *  javax.persistence.FetchType
 *  javax.persistence.GeneratedValue
 *  javax.persistence.GenerationType
 *  javax.persistence.Id
 *  javax.persistence.Lob
 *  javax.persistence.NamedQueries
 *  javax.persistence.NamedQuery
 *  javax.persistence.OneToMany
 *  javax.persistence.Table
 *  javax.persistence.TableGenerator
 *  org.hibernate.annotations.Cascade
 *  org.hibernate.annotations.CascadeType
 */
package br.gov.sp.fazenda.dsen.model.entity;

import br.gov.sp.fazenda.dsen.common.enumeration.RegimeTributarioEnum;
import br.gov.sp.fazenda.dsen.model.entity.CertificadoInfoEntity;
import br.gov.sp.fazenda.dsen.model.entity.ClienteEntity;
import br.gov.sp.fazenda.dsen.model.entity.InutilizacaoEntity;
import br.gov.sp.fazenda.dsen.model.entity.NotaFiscalEntity;
import br.gov.sp.fazenda.dsen.model.entity.NumeracaoEntity;
import br.gov.sp.fazenda.dsen.model.entity.PesquisaEntity;
import br.gov.sp.fazenda.dsen.model.entity.ProdutoEntity;
import br.gov.sp.fazenda.dsen.model.entity.PropriedadeEntity;
import br.gov.sp.fazenda.dsen.model.entity.TransportadoraEntity;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="EMITENTE")
@NamedQueries(value={@NamedQuery(name="EmitenteEntity.findByNrDocumento", query="SELECT e FROM EmitenteEntity e WHERE e.nrDocumento = :nrDocumento")})
public class EmitenteEntity
implements Serializable {
    private static final long serialVersionUID = -6230602968787681578L;
    @TableGenerator(name="EMITENTE_GEN", table="GENERATOR", pkColumnName="GEN_KEY", valueColumnName="GEN_VALUE", pkColumnValue="EMITENTE", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="EMITENTE_GEN")
    @Id
    @Column(name="ID_EMITENTE", nullable=0)
    private Integer idEmitente;
    @Column(name="X_NOME", nullable=0)
    private String xNome;
    @Column(name="X_FANT")
    private String xFant;
    @Column(name="X_LGR", nullable=0)
    private String xLgr;
    @Column(name="NRO", nullable=0)
    private String nro;
    @Column(name="X_CPL")
    private String xCpl;
    @Column(name="X_BAIRRO", nullable=0)
    private String xBairro;
    @Column(name="C_MUN", nullable=0)
    private String cMun;
    @Column(name="X_MUN", nullable=0)
    private String xMun;
    @Column(name="UF", nullable=0)
    private String uf;
    @Column(name="CEP")
    private String cep;
    @Column(name="C_PAIS")
    private String cPais;
    @Column(name="X_PAIS")
    private String xPais;
    @Column(name="FONE")
    private String fone;
    @Column(name="IE", nullable=0)
    private String ie;
    @Column(name="IEST")
    private String iest;
    @Column(name="IM")
    private String im;
    @Column(name="CNAE")
    private String cnae;
    @Lob
    @Column(name="LOGOTIPO")
    private byte[] logotipo;
    @Column(name="TP_DOCUMENTO_ENUM", nullable=0)
    private TipoDocumentoEnum tpDocumentoEnum;
    @Enumerated(value=EnumType.STRING)
    @Column(name="REGIME_TRIBUTARIO", nullable=0)
    private RegimeTributarioEnum regimeTributarioEnum;
    @Column(name="NR_DOCUMENTO", nullable=0)
    private String nrDocumento;
    @Column(name="VERSAO", nullable=0)
    private String versao;
    @OneToMany(mappedBy="idEmitente", fetch=FetchType.LAZY)
    @Cascade(value={CascadeType.ALL})
    private Set<TransportadoraEntity> transportadoraEntitySet;
    @OneToMany(mappedBy="idEmitente", fetch=FetchType.LAZY)
    @Cascade(value={CascadeType.ALL})
    private Set<ProdutoEntity> produtoEntitySet;
    @OneToMany(mappedBy="idEmitente", fetch=FetchType.LAZY)
    @Cascade(value={CascadeType.ALL})
    private Set<PesquisaEntity> pesquisaEntitySet;
    @OneToMany(mappedBy="idEmitente", fetch=FetchType.LAZY)
    @Cascade(value={CascadeType.ALL})
    private Set<ClienteEntity> clienteEntitySet;
    @OneToMany(mappedBy="idEmitente", fetch=FetchType.LAZY)
    @Cascade(value={CascadeType.ALL})
    private Set<PropriedadeEntity> propriedadeEntitySet;
    @OneToMany(mappedBy="emitente", fetch=FetchType.LAZY)
    @Cascade(value={CascadeType.ALL})
    private Set<CertificadoInfoEntity> certificadoInfoEntitySet;
    @OneToMany(mappedBy="emitenteEntity", fetch=FetchType.LAZY)
    @Cascade(value={CascadeType.ALL})
    private Set<NotaFiscalEntity> notaFiscalEntitySet;
    @OneToMany(mappedBy="idEmitente", fetch=FetchType.LAZY)
    @Cascade(value={CascadeType.ALL})
    private Set<NumeracaoEntity> numeracaoEntitySet;
    @OneToMany(mappedBy="emitenteEntity", fetch=FetchType.LAZY)
    @Cascade(value={CascadeType.ALL})
    private Set<InutilizacaoEntity> inutilizacaoEntitySet;

    public EmitenteEntity() {
    }

    public EmitenteEntity(Integer idEmitente) {
        this.idEmitente = idEmitente;
    }

    public EmitenteEntity(Integer idEmitente, String xNome, String xLgr, String nro, String xBairro, String cMun, String xMun, String uf, String ie, TipoDocumentoEnum tpDocumentoEnum, String nrDocumento) {
        this.idEmitente = idEmitente;
        this.xNome = xNome;
        this.xLgr = xLgr;
        this.nro = nro;
        this.xBairro = xBairro;
        this.cMun = cMun;
        this.xMun = xMun;
        this.uf = uf;
        this.ie = ie;
        this.tpDocumentoEnum = tpDocumentoEnum;
        this.nrDocumento = nrDocumento;
    }

    public Integer getIdEmitente() {
        return this.idEmitente;
    }

    public void setIdEmitente(Integer idEmitente) {
        this.idEmitente = idEmitente;
    }

    public String getXNome() {
        return this.xNome;
    }

    public void setXNome(String xNome) {
        this.xNome = xNome;
    }

    public String getXFant() {
        return this.xFant;
    }

    public void setXFant(String xFant) {
        this.xFant = xFant;
    }

    public String getXLgr() {
        return this.xLgr;
    }

    public void setXLgr(String xLgr) {
        this.xLgr = xLgr;
    }

    public String getNro() {
        return this.nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getXCpl() {
        return this.xCpl;
    }

    public void setXCpl(String xCpl) {
        this.xCpl = xCpl;
    }

    public String getXBairro() {
        return this.xBairro;
    }

    public void setXBairro(String xBairro) {
        this.xBairro = xBairro;
    }

    public String getCMun() {
        return this.cMun;
    }

    public void setCMun(String cMun) {
        this.cMun = cMun;
    }

    public String getXMun() {
        return this.xMun;
    }

    public void setXMun(String xMun) {
        this.xMun = xMun;
    }

    public String getUf() {
        return this.uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCPais() {
        return this.cPais;
    }

    public void setCPais(String cPais) {
        this.cPais = cPais;
    }

    public String getXPais() {
        return this.xPais;
    }

    public void setXPais(String xPais) {
        this.xPais = xPais;
    }

    public String getFone() {
        return this.fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getIe() {
        return this.ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getIest() {
        return this.iest;
    }

    public void setIest(String iest) {
        this.iest = iest;
    }

    public String getIm() {
        return this.im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public String getCnae() {
        return this.cnae;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
    }

    public byte[] getLogotipo() {
        return this.logotipo;
    }

    public void setLogotipo(byte[] logotipo) {
        this.logotipo = logotipo;
    }

    public TipoDocumentoEnum getTpDocumentoEnum() {
        return this.tpDocumentoEnum;
    }

    public void setTpDocumentoEnum(TipoDocumentoEnum tpDocumentoEnum) {
        this.tpDocumentoEnum = tpDocumentoEnum;
    }

    public String getNrDocumento() {
        return this.nrDocumento;
    }

    public void setNrDocumento(String nrDocumento) {
        this.nrDocumento = nrDocumento;
    }

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public int hashCode() {
        int hash = 0;
        return hash += this.idEmitente != null ? this.idEmitente.hashCode() : 0;
    }

    public boolean equals(Object object) {
        if (!(object instanceof EmitenteEntity)) {
            return false;
        }
        EmitenteEntity other = (EmitenteEntity)object;
        if (!(this.idEmitente == other.idEmitente || this.idEmitente != null && this.idEmitente.equals(other.idEmitente))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity[idEmitente=" + this.idEmitente + "]";
    }

    public Set<CertificadoInfoEntity> getCertificadoInfoEntitySet() {
        return this.certificadoInfoEntitySet;
    }

    public void setCertificadoInfoEntitySet(Set<CertificadoInfoEntity> certificadoInfoEntitySet) {
        this.certificadoInfoEntitySet = certificadoInfoEntitySet;
    }

    public Set<ClienteEntity> getClienteEntitySet() {
        return this.clienteEntitySet;
    }

    public void setClienteEntitySet(Set<ClienteEntity> clienteEntitySet) {
        this.clienteEntitySet = clienteEntitySet;
    }

    public Set<InutilizacaoEntity> getInutilizacaoEntitySet() {
        return this.inutilizacaoEntitySet;
    }

    public void setInutilizacaoEntitySet(Set<InutilizacaoEntity> inutilizacaoEntitySet) {
        this.inutilizacaoEntitySet = inutilizacaoEntitySet;
    }

    public Set<NotaFiscalEntity> getNotaFiscalEntitySet() {
        return this.notaFiscalEntitySet;
    }

    public void setNotaFiscalEntitySet(Set<NotaFiscalEntity> notaFiscalEntitySet) {
        this.notaFiscalEntitySet = notaFiscalEntitySet;
    }

    public Set<NumeracaoEntity> getNumeracaoEntitySet() {
        return this.numeracaoEntitySet;
    }

    public void setNumeracaoEntitySet(Set<NumeracaoEntity> numeracaoEntitySet) {
        this.numeracaoEntitySet = numeracaoEntitySet;
    }

    public Set<PesquisaEntity> getPesquisaEntitySet() {
        return this.pesquisaEntitySet;
    }

    public void setPesquisaEntitySet(Set<PesquisaEntity> pesquisaEntitySet) {
        this.pesquisaEntitySet = pesquisaEntitySet;
    }

    public Set<ProdutoEntity> getProdutoEntitySet() {
        return this.produtoEntitySet;
    }

    public void setProdutoEntitySet(Set<ProdutoEntity> produtoEntitySet) {
        this.produtoEntitySet = produtoEntitySet;
    }

    public Set<PropriedadeEntity> getPropriedadeEntitySet() {
        return this.propriedadeEntitySet;
    }

    public void setPropriedadeEntitySet(Set<PropriedadeEntity> propriedadeEntitySet) {
        this.propriedadeEntitySet = propriedadeEntitySet;
    }

    public Set<TransportadoraEntity> getTransportadoraEntitySet() {
        return this.transportadoraEntitySet;
    }

    public void setTransportadoraEntitySet(Set<TransportadoraEntity> transportadoraEntitySet) {
        this.transportadoraEntitySet = transportadoraEntitySet;
    }

    public RegimeTributarioEnum getRegimeTributarioEnum() {
        return this.regimeTributarioEnum;
    }

    public void setRegimeTributarioEnum(RegimeTributarioEnum regimeTributarioEnum) {
        this.regimeTributarioEnum = regimeTributarioEnum;
    }
}

