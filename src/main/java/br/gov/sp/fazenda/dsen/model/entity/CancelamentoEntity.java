/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.entity.CancelamentoEntity
 *  javax.persistence.Column
 *  javax.persistence.Entity
 *  javax.persistence.Id
 *  javax.persistence.Lob
 *  javax.persistence.NamedQueries
 *  javax.persistence.NamedQuery
 *  javax.persistence.Table
 *  javax.persistence.Temporal
 *  javax.persistence.TemporalType
 */
package br.gov.sp.fazenda.dsen.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="CANCELAMENTO")
@NamedQueries(value={@NamedQuery(name="CancelamentoEntity.findByIdNotaFiscal", query="SELECT n FROM CancelamentoEntity n WHERE n.idNotaFiscal = :idNotaFiscal")})
public class CancelamentoEntity
implements Serializable {
    private static final long serialVersionUID = 5395948293382764489L;
    @Id
    @Column(name="ID_NOTA_FISCAL", insertable=1, updatable=0, nullable=0)
    private Long idNotaFiscal;
    @Column(name="NUMERO_PROTOCOLO", nullable=0)
    private String numeroProtocolo;
    @Lob
    @Column(name="PROTOCOLO", nullable=0)
    private byte[] protocolo = null;
    @Column(name="DATA_PROTOCOLO", nullable=0)
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date dataProtocolo;
    @Column(name="JUSTIFICATIVA", nullable=0)
    private String justificativa;
    @Column(name="CODIGO_ERRO", nullable=0)
    private String codigoErro;
    @Column(name="MENSAGEM_ERRO", nullable=0)
    private String mensagemErro;

    public String getNumeroProtocolo() {
        return this.numeroProtocolo;
    }

    public void setNumeroProtocolo(String theNumeroProtocolo) {
        this.numeroProtocolo = theNumeroProtocolo;
    }

    public byte[] getProtocolo() {
        return this.protocolo;
    }

    public void setProtocolo(byte[] theProtocolo) {
        this.protocolo = theProtocolo;
    }

    public Date getDataProtocolo() {
        return this.dataProtocolo;
    }

    public void setDataProtocolo(Date theDataProtocolo) {
        this.dataProtocolo = theDataProtocolo;
    }

    public String getJustificativa() {
        return this.justificativa;
    }

    public void setJustificativa(String theJustificativa) {
        this.justificativa = theJustificativa;
    }

    public void setCodigoErro(String codigoErro) {
        this.codigoErro = codigoErro;
    }

    public String getCodigoErro() {
        return this.codigoErro;
    }

    public void setMensagemErro(String mensagemErro) {
        this.mensagemErro = mensagemErro;
    }

    public String getMensagemErro() {
        return this.mensagemErro;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CancelamentoEntity)) {
            return false;
        }
        CancelamentoEntity other = (CancelamentoEntity)obj;
        if (!(this.idNotaFiscal == other.idNotaFiscal || this.idNotaFiscal != null && this.idNotaFiscal.equals(other.idNotaFiscal))) {
            return false;
        }
        return true;
    }

    public Long getIdNotaFiscal() {
        return this.idNotaFiscal;
    }

    public void setIdNotaFiscal(Long id) {
        this.idNotaFiscal = id;
    }
}

