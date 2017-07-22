/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEventoEnum
 *  br.gov.sp.fazenda.dsen.model.entity.EventoEntity
 *  br.gov.sp.fazenda.dsen.model.entity.NotaFiscalEntity
 *  javax.persistence.Column
 *  javax.persistence.Entity
 *  javax.persistence.EnumType
 *  javax.persistence.Enumerated
 *  javax.persistence.GeneratedValue
 *  javax.persistence.GenerationType
 *  javax.persistence.Id
 *  javax.persistence.JoinColumn
 *  javax.persistence.Lob
 *  javax.persistence.ManyToOne
 *  javax.persistence.NamedQueries
 *  javax.persistence.NamedQuery
 *  javax.persistence.Table
 *  javax.persistence.TableGenerator
 *  javax.persistence.Temporal
 *  javax.persistence.TemporalType
 */
package br.gov.sp.fazenda.dsen.model.entity;

import br.gov.sp.fazenda.dsen.common.enumeration.TipoEventoEnum;
import br.gov.sp.fazenda.dsen.model.entity.NotaFiscalEntity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="EVENTO")
@NamedQueries(value={@NamedQuery(name="EventoEntity.findById", query="SELECT n FROM EventoEntity n WHERE n.idEvento = :idEvento")})
public class EventoEntity
implements Serializable {
    private static final long serialVersionUID = -5763920127967350778L;
    @TableGenerator(name="EVENTO_GEN", table="GENERATOR", pkColumnName="GEN_KEY", valueColumnName="GEN_VALUE", pkColumnValue="EVENTO", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="EVENTO_GEN")
    @Id
    @Column(name="ID_EVENTO", nullable=0)
    private Long idEvento;
    @JoinColumn(name="ID_NOTA_FISCAL", referencedColumnName="ID_NOTA_FISCAL")
    @ManyToOne
    private NotaFiscalEntity notaFiscalEntity;
    @Enumerated(value=EnumType.STRING)
    @Column(name="TP_EVENTO", nullable=0)
    private TipoEventoEnum tpEvento;
    @Column(name="DATA_EVENTO")
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date dataEvento;
    @Column(name="N_SEQ_EVENTO")
    private Integer nSeqEvento;
    @Column(name="NUM_PROTOCOLO")
    private String numProtocolo;
    @Lob
    @Column(name="XML_PROC", nullable=0)
    private byte[] xmlProc;
    @Column(name="DATA_REG_EVENTO")
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date dataRegEvento;

    public EventoEntity() {
    }

    public EventoEntity(Long idEvento) {
        this.idEvento = idEvento;
    }

    public Long getIdEvento() {
        return this.idEvento;
    }

    public void setIdEvento(Long idEvento) {
        this.idEvento = idEvento;
    }

    public NotaFiscalEntity getNotaFiscalEntity() {
        return this.notaFiscalEntity;
    }

    public void setNotaFiscalEntity(NotaFiscalEntity notaFiscalEntity) {
        this.notaFiscalEntity = notaFiscalEntity;
    }

    public TipoEventoEnum getTpEvento() {
        return this.tpEvento;
    }

    public void setTpEvento(TipoEventoEnum tpEvento) {
        this.tpEvento = tpEvento;
    }

    public Date getDataEvento() {
        return this.dataEvento;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

    public Integer getnSeqEvento() {
        return this.nSeqEvento;
    }

    public void setnSeqEvento(Integer nSeqEvento) {
        this.nSeqEvento = nSeqEvento;
    }

    public String getNumProtocolo() {
        return this.numProtocolo;
    }

    public void setNumProtocolo(String numProtocolo) {
        this.numProtocolo = numProtocolo;
    }

    public byte[] getXmlProc() {
        return this.xmlProc;
    }

    public void setXmlProc(byte[] xmlProc) {
        this.xmlProc = xmlProc;
    }

    public Date getDataRegEvento() {
        return this.dataRegEvento;
    }

    public void setDataRegEvento(Date dataRegEvento) {
        this.dataRegEvento = dataRegEvento;
    }

    public int hashCode() {
        int hash = 11;
        int primeMultiplier = 23;
        hash = primeMultiplier * hash + (this.getIdEvento() != null ? this.getIdEvento().hashCode() : 0);
        hash = primeMultiplier * hash + (this.getTpEvento() != null ? this.getTpEvento().hashCode() : 0);
        hash = primeMultiplier * hash + (this.getnSeqEvento() != null ? this.getnSeqEvento().hashCode() : 0);
        return hash;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!(object instanceof EventoEntity)) {
            return false;
        }
        EventoEntity other = (EventoEntity)object;
        if (this.idEvento == null && other.getIdEvento() == null) {
            return this.hashCode() == other.hashCode();
        }
        if (this.idEvento == null || other.getIdEvento() == null) {
            return false;
        }
        return this.idEvento.equals(other.idEvento);
    }

    public String toString() {
        return "br.gov.sp.fazenda.dsen.model.entity.EventoEntity[idEvento=" + this.idEvento + "]";
    }
}

