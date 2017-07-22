/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.entity.ClienteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
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
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
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
@Table(name="CLIENTE")
@NamedQueries(value={@NamedQuery(name="ClienteEntity.findByNrDocumento", query="SELECT c FROM ClienteEntity c WHERE c.nrDocumento = :nrDocumento AND c.idEmitente = :idEmitente"), @NamedQuery(name="ClienteEntity.findByNrDocumentoIE", query="SELECT c FROM ClienteEntity c WHERE c.nrDocumento = :nrDocumento AND c.ie = :ie AND c.idEmitente = :idEmitente"), @NamedQuery(name="ClienteEntity.findByNrDocumentoIENull", query="SELECT c FROM ClienteEntity c WHERE c.nrDocumento = :nrDocumento AND c.ie = NULL AND c.idEmitente = :idEmitente")})
public class ClienteEntity
implements Serializable {
    private static final long serialVersionUID = 5360331783785157419L;
    @Column(name="TP_DOCUMENTO_ENUM")
    private TipoDocumentoEnum tpDocumentoEnum;
    @TableGenerator(name="CLIENTE_GEN", table="GENERATOR", pkColumnName="GEN_KEY", valueColumnName="GEN_VALUE", pkColumnValue="CLIENTE", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="CLIENTE_GEN")
    @Id
    @Column(name="ID_CLIENTE", nullable=0)
    private Integer idCliente;
    @Column(name="NR_DOCUMENTO")
    private String nrDocumento;
    @Column(name="X_NOME", nullable=0)
    private String xNome;
    @Column(name="X_LGR")
    private String xLgr;
    @Column(name="NRO")
    private String nro;
    @Column(name="X_CPL")
    private String xCpl;
    @Column(name="X_BAIRRO")
    private String xBairro;
    @Column(name="X_MUN")
    private String xMun;
    @Column(name="C_MUN")
    private String cMun;
    @Column(name="UF")
    private String uf;
    @Column(name="CEP")
    private String cep;
    @Column(name="C_PAIS")
    private String cPais;
    @Column(name="X_PAIS")
    private String xPais;
    @Column(name="FONE")
    private String fone;
    @Column(name="IE")
    private String ie;
    @Column(name="IESUF")
    private String iesuf;
    @Column(name="EMAIL")
    private String email;
    @JoinColumn(name="ID_EMITENTE", referencedColumnName="ID_EMITENTE")
    @ManyToOne
    private EmitenteEntity idEmitente;
    @Column(name="VERSAO", nullable=0)
    private String versao;

    public ClienteEntity() {
    }

    public ClienteEntity(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public ClienteEntity(Integer idCliente, TipoDocumentoEnum tpDocumentoEnum, String nrDocumento, String xNome) {
        this.idCliente = idCliente;
        this.tpDocumentoEnum = tpDocumentoEnum;
        this.nrDocumento = nrDocumento;
        this.xNome = xNome;
    }

    public TipoDocumentoEnum getTpDocumentoEnum() {
        return this.tpDocumentoEnum;
    }

    public void setTpDocumentoEnum(TipoDocumentoEnum tpDocumentoEnum) {
        this.tpDocumentoEnum = tpDocumentoEnum;
    }

    public Integer getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNrDocumento() {
        return this.nrDocumento;
    }

    public void setNrDocumento(String nrDocumento) {
        this.nrDocumento = nrDocumento;
    }

    public String getXNome() {
        return this.xNome;
    }

    public void setXNome(String xNome) {
        this.xNome = xNome;
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

    public String getXMun() {
        return this.xMun;
    }

    public void setXMun(String xMun) {
        this.xMun = xMun;
    }

    public String getCMun() {
        return this.cMun;
    }

    public void setCMun(String cMun) {
        this.cMun = cMun;
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

    public String getIesuf() {
        return this.iesuf;
    }

    public void setIesuf(String iesuf) {
        this.iesuf = iesuf;
    }

    public EmitenteEntity getIdEmitente() {
        return this.idEmitente;
    }

    public void setIdEmitente(EmitenteEntity idEmitente) {
        this.idEmitente = idEmitente;
    }

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public int hashCode() {
        int hash = 0;
        return hash += this.idCliente != null ? this.idCliente.hashCode() : 0;
    }

    public boolean equals(Object object) {
        if (!(object instanceof ClienteEntity)) {
            return false;
        }
        ClienteEntity other = (ClienteEntity)object;
        if (!(this.idCliente == other.idCliente || this.idCliente != null && this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "br.gov.sp.fazenda.dsen.model.entity.ClienteEntity[idCliente=" + this.idCliente + "]";
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

