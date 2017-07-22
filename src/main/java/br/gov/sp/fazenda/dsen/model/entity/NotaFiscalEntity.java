/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.model.entity.CancelamentoEntity
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.EventoEntity
 *  br.gov.sp.fazenda.dsen.model.entity.LoteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.NotaFiscalEntity
 *  javax.persistence.CascadeType
 *  javax.persistence.Column
 *  javax.persistence.Entity
 *  javax.persistence.EnumType
 *  javax.persistence.Enumerated
 *  javax.persistence.FetchType
 *  javax.persistence.GeneratedValue
 *  javax.persistence.GenerationType
 *  javax.persistence.Id
 *  javax.persistence.JoinColumn
 *  javax.persistence.Lob
 *  javax.persistence.ManyToOne
 *  javax.persistence.NamedQueries
 *  javax.persistence.NamedQuery
 *  javax.persistence.OneToMany
 *  javax.persistence.OneToOne
 *  javax.persistence.Table
 *  javax.persistence.TableGenerator
 *  javax.persistence.Temporal
 *  javax.persistence.TemporalType
 */
package br.gov.sp.fazenda.dsen.model.entity;

import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.model.entity.CancelamentoEntity;
import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
import br.gov.sp.fazenda.dsen.model.entity.EventoEntity;
import br.gov.sp.fazenda.dsen.model.entity.LoteEntity;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="NOTA_FISCAL")
@NamedQueries(value={@NamedQuery(name="NotaFiscalEntity.findBySerieNumeroEmitente", query="SELECT n FROM NotaFiscalEntity n WHERE n.serie = :serie and n.numero = :numero and n.emitenteEntity.idEmitente = :idEmitente"), @NamedQuery(name="NotaFiscalEntity.findByIdNotaFiscal", query="SELECT n FROM NotaFiscalEntity n WHERE n.idNotaFiscal = :idNotaFiscal"), @NamedQuery(name="NotaFiscalEntity.deleteInutilizadas", query="delete from NotaFiscalEntity c where c.emitenteEntity.idEmitente = :idEmitente and c.serie = :serie and c.situacao in ('ASSINADA','EM_DIGITACAO','VALIDADA','REJEITADA','EM_PROCESSAMENTO_SEFAZ','TRANSMITIDA_COM_PENDENCIA') and integer(c.numero) between integer(:numeroInicial) and integer(:numeroFinal)"), @NamedQuery(name="NotaFiscalEntity.findQtityByEmitenteSituacaoNfEnum", query="SELECT integer(count(*)) FROM NotaFiscalEntity n WHERE n.emitenteEntity.idEmitente = :idEmitente AND n.situacao = :situacao"), @NamedQuery(name="NotaFiscalEntity.findQtityByEmitenteNfeAutorNaoExport", query="SELECT integer(count(*)) FROM NotaFiscalEntity n WHERE n.emitenteEntity.idEmitente = :idEmitente AND n.situacao = :situacao AND n.autorizacaoExportadaXml = :autorizacaoExportadaXml")})
public class NotaFiscalEntity
implements Serializable {
    private static final long serialVersionUID = -7900844411239455944L;
    @TableGenerator(name="NOTA_FISCAL_GEN", table="GENERATOR", pkColumnName="GEN_KEY", valueColumnName="GEN_VALUE", pkColumnValue="NOTA_FISCAL", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="NOTA_FISCAL_GEN")
    @Id
    @Column(name="ID_NOTA_FISCAL", nullable=0)
    private Long idNotaFiscal;
    @Column(name="MES", nullable=0)
    private String mes;
    @Enumerated(value=EnumType.STRING)
    @Column(name="TIPO_EMISSAO", nullable=0)
    private TipoEmissaoEnum tipoEmissao;
    @Column(name="NUMERO", nullable=0)
    private String numero;
    @Column(name="CODIGO_NUMERICO_CHAVE_ACESSO")
    private String codigoNumericoChaveAcesso;
    @Column(name="DIGITO_CHAVE_ACESSO")
    private String digitoChaveAcesso;
    @Column(name="NUMERO_RECIBO")
    private String numeroRecibo;
    @Column(name="DOCUMENTO_DEST")
    private String documentoDest;
    @Column(name="UF_DEST")
    private String ufDest;
    @Column(name="DATA_EMISSAO")
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date dataEmissao;
    @Column(name="DATA_AUTORIZACAO", nullable=1)
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date dataAutorizacao;
    @Column(name="DANFE_IMPRESSO", nullable=0)
    private Boolean danfeImpresso;
    @Column(name="AUTORIZACAO_EXPORTADA_XML", nullable=0)
    private Boolean autorizacaoExportadaXml;
    @Enumerated(value=EnumType.STRING)
    @Column(name="SITUACAO", nullable=0)
    private SituacaoNFeEnum situacao;
    @Column(name="CODIGO_ERRO")
    private String codigoErro;
    @Column(name="MENSAGEM_ERRO")
    private String mensagemErro;
    @Column(name="VERSAO")
    private String versao;
    @Column(name="ANO", nullable=0)
    private String ano;
    @Lob
    @Column(name="DOC_XML")
    private byte[] docXml;
    @Column(name="SERIE", nullable=0)
    private String serie;
    @Lob
    @Column(name="PROTOCOLO")
    private byte[] protocolo;
    @Column(name="MODELO", nullable=0)
    private String modelo;
    @Column(name="DATA_SISTEMA")
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date dataSistema;
    @Column(name="NUMERO_PROTOCOLO")
    private String numeroProtocolo;
    @Column(name="DATA_PROTOCOLO")
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date dataProtocolo;
    @Column(name="CODIGO_UF_EMITENTE", nullable=0)
    private String codigoUfEmitente;
    @ManyToOne
    @JoinColumn(name="ID_EMITENTE", referencedColumnName="ID_EMITENTE")
    private EmitenteEntity emitenteEntity;
    @OneToOne(fetch=FetchType.LAZY, cascade={CascadeType.ALL})
    @JoinColumn(name="ID_NOTA_FISCAL")
    public CancelamentoEntity cancelamentoEntity;
    @OneToOne(fetch=FetchType.LAZY, cascade={CascadeType.ALL})
    @JoinColumn(name="ID_LOTE")
    private LoteEntity loteEntity;
    @OneToMany(mappedBy="notaFiscalEntity", fetch=FetchType.LAZY, cascade={CascadeType.ALL})
    private Set<EventoEntity> eventoEntitySet;

    public NotaFiscalEntity() {
    }

    public NotaFiscalEntity(Long idNotaFiscal) {
        this.idNotaFiscal = idNotaFiscal;
    }

    public NotaFiscalEntity(Long idNotaFiscal, String mes, TipoEmissaoEnum tipoEmissaoEnum, String numero, SituacaoNFeEnum situacao, String cNf, Boolean danfe) {
        this.idNotaFiscal = idNotaFiscal;
        this.mes = mes;
        this.tipoEmissao = tipoEmissaoEnum;
        this.numero = numero;
        this.danfeImpresso = danfe;
        this.codigoNumericoChaveAcesso = cNf;
        this.situacao = situacao;
    }

    public NotaFiscalEntity(String ano, String serie, String numero) {
        this.ano = ano;
        this.serie = serie;
        this.numero = numero;
    }

    public String getMes() {
        return this.mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public TipoEmissaoEnum getTipoEmissao() {
        return this.tipoEmissao;
    }

    public void setTipoEmissao(TipoEmissaoEnum tipoEmissaoEnum) {
        this.tipoEmissao = tipoEmissaoEnum;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigoNumericoChaveAcesso() {
        return this.codigoNumericoChaveAcesso;
    }

    public void setCodigoNumericoChaveAcesso(String cNf) {
        this.codigoNumericoChaveAcesso = cNf;
    }

    public String getDigitoChaveAcesso() {
        return this.digitoChaveAcesso;
    }

    public void setDigitoChaveAcesso(String cDv) {
        this.digitoChaveAcesso = cDv;
    }

    public String getNumeroRecibo() {
        return this.numeroRecibo;
    }

    public void setNumeroRecibo(String recibo) {
        this.numeroRecibo = recibo;
    }

    public String getDocumentoDest() {
        return this.documentoDest;
    }

    public void setDocumentoDest(String documentoDest) {
        this.documentoDest = documentoDest;
    }

    public String getUfDest() {
        return this.ufDest;
    }

    public void setUfDest(String ufDest) {
        this.ufDest = ufDest;
    }

    public Date getDataEmissao() {
        return this.dataEmissao;
    }

    public void setDataEmissao(Date dataEmissaoNf) {
        this.dataEmissao = dataEmissaoNf;
    }

    public Date getDataAutorizacao() {
        return this.dataAutorizacao;
    }

    public void setDataAutorizacao(Date dataAtualizacaoNf) {
        this.dataAutorizacao = dataAtualizacaoNf;
    }

    public Boolean getAutorizacaoExportadaXml() {
        return this.autorizacaoExportadaXml;
    }

    public void setAutorizacaoExportadaXml(Boolean autorizadaExportada) {
        this.autorizacaoExportadaXml = autorizadaExportada;
    }

    public Boolean getDanfeImpresso() {
        return this.danfeImpresso;
    }

    public void setDanfeImpresso(Boolean danfe) {
        this.danfeImpresso = danfe;
    }

    public SituacaoNFeEnum getSituacao() {
        return this.situacao;
    }

    public void setSituacao(SituacaoNFeEnum situacao) {
        this.situacao = situacao;
    }

    public String getCodigoErro() {
        return this.codigoErro;
    }

    public void setCodigoErro(String cErro) {
        this.codigoErro = cErro;
    }

    public String getMensagemErro() {
        return this.mensagemErro;
    }

    public void setMensagemErro(String mensagemErro) {
        this.mensagemErro = mensagemErro;
    }

    public int hashCode() {
        int hash = 0;
        return hash += this.getIdNotaFiscal() != null ? this.getIdNotaFiscal().hashCode() : 0;
    }

    public boolean equals(Object object) {
        if (!(object instanceof NotaFiscalEntity)) {
            return false;
        }
        NotaFiscalEntity other = (NotaFiscalEntity)object;
        if (!(this.getIdNotaFiscal() == other.getIdNotaFiscal() || this.getIdNotaFiscal() != null && this.getIdNotaFiscal().equals(other.getIdNotaFiscal()))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "br.gov.sp.fazenda.dsen.model.entity.NotaFiscalEntity[idDocumento=" + this.getIdNotaFiscal() + "]";
    }

    public CancelamentoEntity getCancelamentoEntity() {
        return this.cancelamentoEntity;
    }

    public void setCancelamentoEntity(CancelamentoEntity cancelamentoEntity) {
        this.cancelamentoEntity = cancelamentoEntity;
    }

    public LoteEntity getLoteEntity() {
        return this.loteEntity;
    }

    public void setLoteEntity(LoteEntity lote) {
        this.loteEntity = lote;
    }

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public Long getIdNotaFiscal() {
        return this.idNotaFiscal;
    }

    public void setIdNotaFiscal(Long idNotaFiscal) {
        this.idNotaFiscal = idNotaFiscal;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCodigoUfEmitente() {
        return this.codigoUfEmitente;
    }

    public void setCodigoUfEmitente(String codigoUfEmitente) {
        this.codigoUfEmitente = codigoUfEmitente;
    }

    public Date getDataProtocolo() {
        return this.dataProtocolo;
    }

    public void setDataProtocolo(Date dataProtocolo) {
        this.dataProtocolo = dataProtocolo;
    }

    public Date getDataSistema() {
        return this.dataSistema;
    }

    public void setDataSistema(Date dataSistema) {
        this.dataSistema = dataSistema;
    }

    public byte[] getDocXml() {
        return this.docXml;
    }

    public void setDocXml(byte[] docXml) {
        this.docXml = docXml;
    }

    public EmitenteEntity getEmitenteEntity() {
        return this.emitenteEntity;
    }

    public void setEmitenteEntity(EmitenteEntity emitenteEntity) {
        this.emitenteEntity = emitenteEntity;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public byte[] getProtocolo() {
        return this.protocolo;
    }

    public void setProtocolo(byte[] protocolo) {
        this.protocolo = protocolo;
    }

    public String getSerie() {
        return this.serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumeroProtocolo() {
        return this.numeroProtocolo;
    }

    public void setNumeroProtocolo(String numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }

    public Set<EventoEntity> getEventoEntitySet() {
        return this.eventoEntitySet;
    }

    public void setEventoEntitySet(Set<EventoEntity> eventoEntitySet) {
        this.eventoEntitySet = eventoEntitySet;
    }
}

