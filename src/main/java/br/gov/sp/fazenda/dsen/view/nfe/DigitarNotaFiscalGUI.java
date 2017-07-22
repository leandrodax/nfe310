/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.FinalidadeEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.FormaPagamentoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.IdentLocalDestinoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.IndAtendementoPresencialEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.IndIEDestEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.IndOperacaoConsumidorFinalEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ModalidadeFreteEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ProdutoEspecificoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.RegimeEspecialTributarioEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.RegimeTributarioEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoDestEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEventoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoImpressaoEnum
 *  br.gov.sp.fazenda.dsen.common.exception.DSENCommonException
 *  br.gov.sp.fazenda.dsen.common.to.AutorizacaoTO
 *  br.gov.sp.fazenda.dsen.common.to.CancelamentoTO
 *  br.gov.sp.fazenda.dsen.common.to.ClienteTO
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO$TipoConsultaEnum
 *  br.gov.sp.fazenda.dsen.common.to.DeducaoTO
 *  br.gov.sp.fazenda.dsen.common.to.DuplicataTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.EventoTO
 *  br.gov.sp.fazenda.dsen.common.to.FornecimentoTO
 *  br.gov.sp.fazenda.dsen.common.to.LacreTO
 *  br.gov.sp.fazenda.dsen.common.to.LoteTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.ObservacaoNotaTO
 *  br.gov.sp.fazenda.dsen.common.to.ProcessoReferenciadoNotaTO
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoNotaTO
 *  br.gov.sp.fazenda.dsen.common.to.ReboqueTO
 *  br.gov.sp.fazenda.dsen.common.to.RefECFTO
 *  br.gov.sp.fazenda.dsen.common.to.RefNFPTO
 *  br.gov.sp.fazenda.dsen.common.to.RefNFTO
 *  br.gov.sp.fazenda.dsen.common.to.TransportadoraTO
 *  br.gov.sp.fazenda.dsen.common.to.VolumeTO
 *  br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.KeyInfoType
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.ProcEventoNFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.ReferenceType
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.SignatureType
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.SignedInfoType
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TAmb
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TAmb$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCfopTransp
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCfopTransp$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCodUfIBGE
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCodUfIBGE$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEnderEmi
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEnderEmi$CPais
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEnderEmi$CPais$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEnderEmi$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEnderEmi$XPais
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEnderEmi$XPais$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEndereco
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEndereco$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TFinNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TFinNFe$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TLocal
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TMod
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TMod$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$AutXML
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$AutXML$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Cana
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Cana$Deduc
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Cana$ForDia
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Cobr
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Cobr$Dup
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Cobr$Fat
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Compra
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Compra$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Dest
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Dest$IndIEDest
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Dest$IndIEDest$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$Arma
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$Comb
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$Med
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$VeicProd
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Emit
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Emit$CRT
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Emit$CRT$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Exporta
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Exporta$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$IdDest
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$IdDest$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$IndFinal
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$IndFinal$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$IndPag
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$IndPag$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$IndPres
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$IndPres$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$NFref
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$NFref$RefECF
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$NFref$RefECF$Mod
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$NFref$RefECF$Mod$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$NFref$RefNF
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$NFref$RefNF$Mod
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$NFref$RefNF$Mod$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$NFref$RefNFP
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$NFref$RefNFP$Mod
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$NFref$RefNFP$Mod$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$TpEmis
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$TpEmis$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$TpImp
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$TpImp$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$TpNF
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$TpNF$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$InfAdic
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$InfAdic$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$InfAdic$ObsCont
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$InfAdic$ObsFisco
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$InfAdic$ProcRef
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$InfAdic$ProcRef$IndProc
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$InfAdic$ProcRef$IndProc$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Total
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Total$ICMSTot
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Total$ISSQNtot
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Total$ISSQNtot$CRegTrib
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Total$ISSQNtot$CRegTrib$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Total$RetTrib
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Transp
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Transp$ModFrete
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Transp$ModFrete$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Transp$RetTransp
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Transp$Transporta
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Transp$Vol
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Transp$Vol$Lacres
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProcEmi
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProcEmi$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProcEvento
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetEvento
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetEvento$InfEvento
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUf
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUf$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUfEmi
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUfEmi$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TVeiculo
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TVeiculo$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.Tpais
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.Tpais$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.X509DataType
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.format.ChaveAcessoFormatter
 *  br.gov.sp.fazenda.dsen.view.format.IdentificacaoSafraFormatter
 *  br.gov.sp.fazenda.dsen.view.format.UFFormatter
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI$1
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI$10
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI$11
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI$12
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI$13
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI$14
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI$15
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI$16
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI$17
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI$18
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI$19
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI$2
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI$20
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI$21
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI$22
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI$3
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI$4
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI$5
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI$6
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI$7
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI$8
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI$9
 *  br.gov.sp.fazenda.dsge.certif.CertificadoHelper
 *  br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoInvalidoException
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.QuestionEnum
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.DSGEConstants
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.common.util.XMLUtil
 *  br.gov.sp.fazenda.dsge.util.CfopTO
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.MunicipioTO
 *  br.gov.sp.fazenda.dsge.util.PaisTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.DSGETabbedPane
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.CEPFormatter
 *  br.gov.sp.fazenda.dsge.view.format.CNPJFormatter
 *  br.gov.sp.fazenda.dsge.view.format.CPFFormatter
 *  br.gov.sp.fazenda.dsge.view.format.DateFormatter
 *  br.gov.sp.fazenda.dsge.view.format.DateHourMinuteFormatter
 *  br.gov.sp.fazenda.dsge.view.format.DateTimeFormatter
 *  br.gov.sp.fazenda.dsge.view.format.DocumentoFormatter
 *  br.gov.sp.fazenda.dsge.view.format.EstrangeiroFormatter
 *  br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.format.NumberFormatterHelper
 *  br.gov.sp.fazenda.dsge.view.format.PhoneFormatter
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 *  br.gov.sp.fazenda.dsge.view.table.JTableComponentRenderer
 *  br.gov.sp.fazenda.dsge.view.table.JTableImageMouseListener
 *  br.gov.sp.fazenda.dsge.view.table.model.DSGETableModel
 *  org.apache.xmlbeans.XmlException
 */
package br.gov.sp.fazenda.dsen.view.nfe;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.FinalidadeEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.FormaPagamentoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.IdentLocalDestinoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.IndAtendementoPresencialEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.IndIEDestEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.IndOperacaoConsumidorFinalEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ModalidadeFreteEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ProdutoEspecificoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.RegimeEspecialTributarioEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.RegimeTributarioEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoDestEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEventoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoImpressaoEnum;
import br.gov.sp.fazenda.dsen.common.exception.DSENCommonException;
import br.gov.sp.fazenda.dsen.common.to.AutorizacaoTO;
import br.gov.sp.fazenda.dsen.common.to.CancelamentoTO;
import br.gov.sp.fazenda.dsen.common.to.ClienteTO;
import br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO;
import br.gov.sp.fazenda.dsen.common.to.DeducaoTO;
import br.gov.sp.fazenda.dsen.common.to.DuplicataTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.EventoTO;
import br.gov.sp.fazenda.dsen.common.to.FornecimentoTO;
import br.gov.sp.fazenda.dsen.common.to.LacreTO;
import br.gov.sp.fazenda.dsen.common.to.LoteTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.ObservacaoNotaTO;
import br.gov.sp.fazenda.dsen.common.to.ProcessoReferenciadoNotaTO;
import br.gov.sp.fazenda.dsen.common.to.ProdutoNotaTO;
import br.gov.sp.fazenda.dsen.common.to.ReboqueTO;
import br.gov.sp.fazenda.dsen.common.to.RefECFTO;
import br.gov.sp.fazenda.dsen.common.to.RefNFPTO;
import br.gov.sp.fazenda.dsen.common.to.RefNFTO;
import br.gov.sp.fazenda.dsen.common.to.TransportadoraTO;
import br.gov.sp.fazenda.dsen.common.to.VolumeTO;
import br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.KeyInfoType;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.ProcEventoNFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.ReferenceType;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.SignatureType;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.SignedInfoType;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TAmb;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCfopTransp;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCodUfIBGE;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEnderEmi;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEndereco;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TFinNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TLocal;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TMod;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProcEmi;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProcEvento;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetEvento;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUf;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUfEmi;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TVeiculo;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.Tpais;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.X509DataType;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.format.ChaveAcessoFormatter;
import br.gov.sp.fazenda.dsen.view.format.IdentificacaoSafraFormatter;
import br.gov.sp.fazenda.dsen.view.format.UFFormatter;
import br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI;
import br.gov.sp.fazenda.dsge.certif.CertificadoHelper;
import br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoInvalidoException;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.QuestionEnum;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.DSGEConstants;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.common.util.XMLUtil;
import br.gov.sp.fazenda.dsge.util.CfopTO;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.MunicipioTO;
import br.gov.sp.fazenda.dsge.util.PaisTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.DSGETabbedPane;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.CEPFormatter;
import br.gov.sp.fazenda.dsge.view.format.CNPJFormatter;
import br.gov.sp.fazenda.dsge.view.format.CPFFormatter;
import br.gov.sp.fazenda.dsge.view.format.DateFormatter;
import br.gov.sp.fazenda.dsge.view.format.DateHourMinuteFormatter;
import br.gov.sp.fazenda.dsge.view.format.DateTimeFormatter;
import br.gov.sp.fazenda.dsge.view.format.DocumentoFormatter;
import br.gov.sp.fazenda.dsge.view.format.EstrangeiroFormatter;
import br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter;
import br.gov.sp.fazenda.dsge.view.format.NumberFormatterHelper;
import br.gov.sp.fazenda.dsge.view.format.PhoneFormatter;
import br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import br.gov.sp.fazenda.dsge.view.table.JDSGETable;
import br.gov.sp.fazenda.dsge.view.table.JTableComponentRenderer;
import br.gov.sp.fazenda.dsge.view.table.JTableImageMouseListener;
import br.gov.sp.fazenda.dsge.view.table.model.DSGETableModel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.ItemSelectable;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URL;
import java.security.cert.X509Certificate;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.EventListener;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DefaultFormatter;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import javax.swing.text.NumberFormatter;
import org.apache.xmlbeans.XmlException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class DigitarNotaFiscalGUI
extends DSGESimplePanel
implements FocusListener,
ItemListener,
KeyListener {
    private static final long a = -6433086245403410042L;
    public static final int ABA_IDE = 0;
    public static final int ABA_EMIT = 1;
    public static final int ABA_DEST = 2;
    public static final int ABA_PROD = 3;
    public static final int ABA_TOTAIS = 4;
    public static final int ABA_TRANS = 5;
    public static final int ABA_COBRANCA = 6;
    public static final int ABA_INFO = 7;
    public static final int ABA_EXPORTA_COMPRA = 8;
    public static final int ABA_CANA = 9;
    public static final int ABA_CERTIFICADO = 10;
    public static final int ABA_AUTORIZACAO = 11;
    private ImageIcon a;
    private JDSGEPageableTable<FornecimentoTO> a;
    private JDSGEPageableTable<DeducaoTO> b;
    private JButton a;
    private JButton b;
    private JButton c;
    private JButton d;
    private JButton e;
    private JButton f;
    private JButton g;
    private JButton h;
    private JButton i;
    private JButton j;
    private JButton k;
    private JButton l;
    private JButton m;
    private JButton n;
    private JButton o;
    private JButton p;
    private JButton q;
    private JButton r;
    private JButton s;
    private JButton t;
    private JButton u;
    private JButton v;
    private JButton w;
    private JButton x;
    private JButton y;
    private JButton z;
    private JButton A;
    private JButton B;
    private JButton C;
    private JButton D;
    private JButton E;
    private JButton F;
    private JButton G;
    private JButton H;
    private JButton I;
    private JButton J;
    private JButton K;
    private JButton L;
    private JButton M;
    private JButton N;
    private JButton O;
    private JButton P;
    private JButton Q;
    private JButton R;
    private JButton S;
    private JButton T;
    private JButton U;
    private JButton V;
    private JButton W;
    private JButton X;
    private JButton Y;
    private JButton Z;
    private JButton aa;
    private JButton ab;
    private JButton ac;
    private JButton ad;
    private JButton ae;
    private JButton af;
    private ButtonGroup a;
    private JCheckBox a;
    private JCheckBox b;
    private JCheckBox c;
    private JCheckBox d;
    private JComboBox a;
    private JComboBox b;
    private JComboBox c;
    private JComboBox d;
    private JComboBox e;
    private JComboBox f;
    private JComboBox g;
    private JComboBox h;
    private JComboBox i;
    private JComboBox j;
    private JComboBox k;
    private JComboBox l;
    private JComboBox m;
    private JComboBox n;
    private JComboBox o;
    private JComboBox p;
    private JComboBox q;
    private JComboBox r;
    private JComboBox s;
    private JComboBox t;
    private JComboBox u;
    private JComboBox v;
    private JComboBox w;
    private JComboBox x;
    private JComboBox y;
    private JComboBox z;
    private JComboBox A;
    private JComboBox B;
    private JComboBox C;
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JLabel f;
    private JLabel g;
    private JLabel h;
    private JPanel a;
    private JPanel b;
    private JPanel c;
    private JPanel d;
    private JPanel e;
    private JPanel f;
    private JPanel g;
    private JPanel h;
    private JPanel i;
    private JPanel j;
    private JPanel k;
    private JPanel l;
    private JPanel m;
    private JScrollPane a;
    private JScrollPane b;
    private JScrollPane c;
    private JScrollPane d;
    private JTabbedPane a;
    private JTabbedPane b;
    private JTabbedPane c;
    private JLabel i;
    private JLabel j;
    private JLabel k;
    private JLabel l;
    private JLabel m;
    private JLabel n;
    private JLabel o;
    private JLabel p;
    private JLabel q;
    private JLabel r;
    private JLabel s;
    private JLabel t;
    private JLabel u;
    private JLabel v;
    private JLabel w;
    private JLabel x;
    private JLabel y;
    private JLabel z;
    private JLabel A;
    private JLabel B;
    private JLabel C;
    private JLabel D;
    private JLabel E;
    private JLabel F;
    private JLabel G;
    private JLabel H;
    private JLabel I;
    private JLabel J;
    private JLabel K;
    private JLabel L;
    private JLabel M;
    private JLabel N;
    private JLabel O;
    private JLabel P;
    private JLabel Q;
    private JLabel R;
    private JLabel S;
    private JLabel T;
    private JLabel U;
    private JLabel V;
    private JLabel W;
    private JLabel X;
    private JLabel Y;
    private JLabel Z;
    private JLabel aa;
    private JLabel ab;
    private JLabel ac;
    private JLabel ad;
    private JLabel ae;
    private JLabel af;
    private JLabel ag;
    private JLabel ah;
    private JLabel ai;
    private JLabel aj;
    private JLabel ak;
    private JLabel al;
    private JLabel am;
    private JLabel an;
    private JLabel ao;
    private JLabel ap;
    private JLabel aq;
    private JLabel ar;
    private JLabel as;
    private JLabel at;
    private JLabel au;
    private JLabel av;
    private JLabel aw;
    private JLabel ax;
    private JLabel ay;
    private JLabel az;
    private JLabel aA;
    private JLabel aB;
    private JLabel aC;
    private JLabel aD;
    private JLabel aE;
    private JLabel aF;
    private JLabel aG;
    private JLabel aH;
    private JLabel aI;
    private JLabel aJ;
    private JLabel aK;
    private JLabel aL;
    private JLabel aM;
    private JLabel aN;
    private JLabel aO;
    private JLabel aP;
    private JLabel aQ;
    private JLabel aR;
    private JLabel aS;
    private JLabel aT;
    private JLabel aU;
    private JLabel aV;
    private JLabel aW;
    private JLabel aX;
    private JLabel aY;
    private JLabel aZ;
    private JLabel ba;
    private JLabel bb;
    private JLabel bc;
    private JLabel bd;
    private JLabel be;
    private JLabel bf;
    private JLabel bg;
    private JLabel bh;
    private JLabel bi;
    private JLabel bj;
    private JLabel bk;
    private JLabel bl;
    private JLabel bm;
    private JLabel bn;
    private JLabel bo;
    private JLabel bp;
    private JLabel bq;
    private JLabel br;
    private JLabel bs;
    private JLabel bt;
    private JLabel bu;
    private JLabel bv;
    private JLabel bw;
    private JLabel bx;
    private JLabel by;
    private JLabel bz;
    private JLabel bA;
    private JLabel bB;
    private JLabel bC;
    private JLabel bD;
    private JLabel bE;
    private JLabel bF;
    private JLabel bG;
    private JLabel bH;
    private JLabel bI;
    private JLabel bJ;
    private JLabel bK;
    private JLabel bL;
    private JLabel bM;
    private JLabel bN;
    private JLabel bO;
    private JLabel bP;
    private JLabel bQ;
    private JScrollPane e;
    private JPanel n;
    private JScrollPane f;
    private JPanel o;
    private JPanel p;
    private JPanel q;
    private JPanel r;
    private JPanel s;
    private JPanel t;
    private JPanel u;
    private JPanel v;
    private JPanel w;
    private JScrollPane g;
    private JScrollPane h;
    private JScrollPane i;
    private JPanel x;
    private JPanel y;
    private JPanel z;
    private JPanel A;
    private JPanel B;
    private JPanel C;
    private JPanel D;
    private JPanel E;
    private JPanel F;
    private JPanel G;
    private JPanel H;
    private JPanel I;
    private JPanel J;
    private JPanel K;
    private JPanel L;
    private JPanel M;
    private JPanel N;
    private JScrollPane j;
    private JScrollPane k;
    private JPanel O;
    private JScrollPane l;
    private JPanel P;
    private JScrollPane m;
    private JPanel Q;
    private JPanel R;
    private JPanel S;
    private JPanel T;
    private JPanel U;
    private JPanel V;
    private JPanel W;
    private JPanel X;
    private JPanel Y;
    private JPanel Z;
    private JPanel aa;
    private JPanel ab;
    private JPanel ac;
    private JPanel ad;
    private JPanel ae;
    private JPanel af;
    private JPanel ag;
    private JRadioButton a;
    private JRadioButton b;
    private JRadioButton c;
    private JScrollPane n;
    private JTabbedPane d;
    private JTabbedPane e;
    private JTextArea a;
    private JTextArea b;
    private JTextArea c;
    private JTextArea d;
    private JTextArea e;
    private JTextArea f;
    private JFormattedTextField a;
    private JFormattedTextField b;
    private JFormattedTextField c;
    private JFormattedTextField d;
    private JFormattedTextField e;
    private JFormattedTextField f;
    private JFormattedTextField g;
    private JFormattedTextField h;
    private JFormattedTextField i;
    private JFormattedTextField j;
    private JFormattedTextField k;
    private JFormattedTextField l;
    private JFormattedTextField m;
    private JFormattedTextField n;
    private JFormattedTextField o;
    private JFormattedTextField p;
    private JFormattedTextField q;
    private JFormattedTextField r;
    private JFormattedTextField s;
    private JFormattedTextField t;
    private JFormattedTextField u;
    private JFormattedTextField v;
    private JFormattedTextField w;
    private JFormattedTextField x;
    private JFormattedTextField y;
    private JFormattedTextField z;
    private JFormattedTextField A;
    private JFormattedTextField B;
    private JFormattedTextField C;
    private JFormattedTextField D;
    private JFormattedTextField E;
    private JFormattedTextField F;
    private JFormattedTextField G;
    private JFormattedTextField H;
    private JFormattedTextField I;
    private JTextField a;
    private JFormattedTextField J;
    private JFormattedTextField K;
    private JFormattedTextField L;
    private JFormattedTextField M;
    private JFormattedTextField N;
    private JFormattedTextField O;
    private JFormattedTextField P;
    private JFormattedTextField Q;
    private JTextField b;
    private JTextField c;
    private JTextField d;
    private JTextField e;
    private JFormattedTextField R;
    private JTextField f;
    private JTextField g;
    private JTextField h;
    private JTextField i;
    private JTextField j;
    private JFormattedTextField S;
    private JTextField k;
    private JTextField l;
    private JTextField m;
    private JTextField n;
    private JTextField o;
    private JTextField p;
    private JTextField q;
    private JTextField r;
    private JTextField s;
    private JTextField t;
    private JTextField u;
    private JTextField v;
    private JFormattedTextField T;
    private JFormattedTextField U;
    private JFormattedTextField V;
    private JTextField w;
    private JTextField x;
    private JTextField y;
    private JTextField z;
    private JTextField A;
    private JTextField B;
    private JTextField C;
    private JTextField D;
    private JTextField E;
    private JTextField F;
    private JTextField G;
    private JTextField H;
    private JTextField I;
    private JTextField J;
    private JTextField K;
    private JTextField L;
    private JTextField M;
    private JTextField N;
    private JTextField O;
    private JTextField P;
    private JTextField Q;
    private JTextField R;
    private JTextField S;
    private JTextField T;
    private JTextField U;
    private JTextField V;
    private JTextField W;
    private JFormattedTextField W;
    private JTextField X;
    private JTextField Y;
    private JTextField Z;
    private JFormattedTextField X;
    private JFormattedTextField Y;
    private JTextField aa;
    private JDSGEPageableTable<RefNFTO> c;
    private JDSGEPageableTable<RefNFPTO> d;
    private JDSGEPageableTable<RefECFTO> e;
    private JDSGEPageableTable<ProdutoNotaTO> f;
    private JDSGEPageableTable<AutorizacaoTO> g;
    private JDSGEPageableTable<EventoTO> h;
    private JDSGEPageableTable<ReboqueTO> i;
    private JDSGEPageableTable<VolumeTO> j;
    private JDSGEPageableTable<DuplicataTO> k;
    private JDSGEPageableTable<ObservacaoNotaTO> l;
    private JDSGEPageableTable<ObservacaoNotaTO> m;
    private JDSGEPageableTable<ProcessoReferenciadoNotaTO> n;
    private String a;
    private NotaFiscalTO a;
    private TLocal a;
    private TLocal b;
    private Map<String, JComponent[]> a;
    private DateFormatter a;
    private DateHourMinuteFormatter a;
    private DateHourMinuteFormatter b;
    private DateHourMinuteFormatter c;
    private CNPJFormatter a;
    private CEPFormatter a;
    private CNPJFormatter b;
    private CPFFormatter a;
    private CEPFormatter b;
    private DateFormatter b;
    private CNPJFormatter c;
    private CPFFormatter b;
    private PhoneFormatter a;
    private IdentificacaoSafraFormatter a;
    private EstrangeiroFormatter a;

    public DigitarNotaFiscalGUI(String operacao, NotaFiscalTO notaFiscalTO) throws DSGEViewException {
        this.a = operacao;
        this.setDesabilitaMenu(true);
        this.c();
        this.v();
        this.a();
        this.b();
        this.d();
        this.e();
        this.g();
        this.f();
        this.a = notaFiscalTO;
        this.t.setVisible(true);
        this.W.setVisible(true);
        this.a = new ImageIcon(DSENDesktop.class.getResource("resources/lupa.gif"));
    }

    private void a() {
        try {
            new /* Unavailable Anonymous Inner Class!! */.install(this.G);
        }
        catch (ParseException e) {
            this.showErrors((Throwable)e);
        }
    }

    private void b() {
        this.w.addFocusListener((FocusListener)this);
        this.t.addFocusListener((FocusListener)this);
        this.K.addFocusListener((FocusListener)this);
        this.k.addFocusListener((FocusListener)this);
        this.j.addFocusListener((FocusListener)this);
        this.v.addFocusListener((FocusListener)this);
        this.A.addItemListener((ItemListener)this);
        this.k.addItemListener((ItemListener)this);
        this.P.addKeyListener((KeyListener)this);
        this.f.addFocusListener((FocusListener)this);
        this.c.addItemListener((ItemListener)this);
        this.g.addFocusListener((FocusListener)this);
        this.c.addItemListener((ItemListener)this);
        this.a.addItemListener((ItemListener)this);
        this.b.addItemListener((ItemListener)this);
        this.c.addItemListener((ItemListener)this);
        this.y.addItemListener((ItemListener)this);
        this.T.addFocusListener((FocusListener)this);
        this.X.addFocusListener((FocusListener)this);
        this.F.addFocusListener((FocusListener)this);
        this.s.addItemListener((ItemListener)this);
        this.t.addItemListener((ItemListener)this);
        this.o.addItemListener((ItemListener)this);
        this.p.addItemListener((ItemListener)this);
        this.t.addKeyListener((KeyListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void c() {
        try {
            this.a = new DateFormatter();
            this.a = new DateHourMinuteFormatter();
            this.b = new DateHourMinuteFormatter();
            this.c = new DateHourMinuteFormatter();
            this.a = new CNPJFormatter();
            this.a = new CEPFormatter();
            this.b = new CNPJFormatter();
            this.a = new EstrangeiroFormatter();
            this.a.setPlaceholderCharacter(' ');
            this.a = new CPFFormatter();
            this.b = new CEPFormatter();
            this.b = new DateFormatter();
            this.c = new CNPJFormatter();
            this.b = new CPFFormatter();
            this.a = new PhoneFormatter();
            this.a = new IdentificacaoSafraFormatter();
        }
        catch (ParseException ex) {
            this.showErrors((Throwable)ex);
        }
    }

    private void d() {
        this.h.addItemListener((ItemListener)this);
        this.z.addItemListener((ItemListener)this);
        this.g.addItemListener((ItemListener)this);
    }

    private void e() {
        this.F.setActionCommand("salvar");
        this.D.setActionCommand("ACTION_GERAR_DPEC");
        this.af.setActionCommand("ACTION_VALIDAR");
        this.a.setActionCommand("ACTION_ASSINAR");
        this.ae.setActionCommand("ACTION_TRANSMITIR");
        this.e.setActionCommand("cancelar");
        this.E.setActionCommand("ACTION_IMPRIMIR_DANFE");
        this.O.setActionCommand("ACTION_PRE_VISUALIZAR_DANFE");
        this.B.setActionCommand("exportar");
        this.f.setActionCommand("ACTION_CARTA_CORRECAO");
        this.C.setActionCommand("fechar");
        this.g.setActionCommand("ACTION_VER_CHAVE_SEM_FORMATACAO");
        this.q.setActionCommand("notaReferenciadaIncluir");
        this.n.setActionCommand("notaReferenciadaExcluir");
        this.k.setActionCommand("notaReferenciadaDetalhar");
        this.s.setActionCommand("notaReferenciadaProdutorIncluir");
        this.p.setActionCommand("notaReferenciadaProdutorExcluir");
        this.m.setActionCommand("notaReferenciadaProdutorDetalhar");
        this.r.setActionCommand("notaECFReferenciadoIncluir");
        this.o.setActionCommand("notaECFReferenciadoExcluir");
        this.l.setActionCommand("notaECFReferenciadoDetalhar");
        this.m.setActionCommand("pais");
        this.n.setActionCommand("estado");
        this.k.setActionCommand("pais");
        this.i.setActionCommand("estado");
        this.u.setActionCommand("manterNotaDestEntrega");
        this.w.setActionCommand("manterNotaDestRetirada");
        this.a.setActionCommand("manterNotaDestEntrega");
        this.b.setActionCommand("manterNotaDestRetirada");
        this.v.setActionCommand("manterNotaDestImportar");
        this.t.setActionCommand("MANTER_NOTA_DEST_CONSULTAR_CADASTRO");
        this.S.setActionCommand("detalhar");
        this.T.setActionCommand("excluir");
        this.U.setActionCommand("incluir");
        this.Y.setActionCommand("detalharReboque");
        this.Z.setActionCommand("excluirReboque");
        this.aa.setActionCommand("incluirReboque");
        this.ab.setActionCommand("detalharVolume");
        this.ac.setActionCommand("excluirVolume");
        this.ad.setActionCommand("incluirVolume");
        this.X.setActionCommand("pesquisar");
        this.W.setActionCommand("MANTER_NOTA_TRANSP_CONSULTAR_CADASTRO");
        this.x.setActionCommand("estadoRetICMS");
        this.A.setActionCommand("estadoTransp");
        this.h.setActionCommand("detalhar");
        this.i.setActionCommand("excluir");
        this.j.setActionCommand("incluir");
        this.I.setActionCommand("ACTION_DETALHAR_OBS_CONT");
        this.J.setActionCommand("ACTION_EXCLUIR_OBS_CONT");
        this.K.setActionCommand("ACTION_INCLUIR_OBS_CONT");
        this.L.setActionCommand("ACTION_DETALHAR_OBS_FISCO");
        this.M.setActionCommand("ACTION_EXCLUIR_OBS_FISCO");
        this.N.setActionCommand("ACTION_INCLUIR_OBS_FISCO");
        this.P.setActionCommand("ACTION_DETALHAR_PROCESSO");
        this.Q.setActionCommand("ACTION_EXCLUIR_PROCESSO");
        this.R.setActionCommand("ACTION_INCLUIR_PROCESSO");
        this.V.setActionCommand("calcular");
        this.x.setActionCommand("ACTION_DETALHAR_DEDUCAO");
        this.z.setActionCommand("ACTION_EXCLUIR_DEDUCAO");
        this.G.setActionCommand("ACTION_INCLUIR_DEDUCAO");
        this.y.setActionCommand("ACTION_DETALHAR_FORNECIMENTO");
        this.A.setActionCommand("ACTION_EXCLUIR_FORNECIMENTO");
        this.H.setActionCommand("ACTION_INCLUIR_FORNECIMENTO");
        this.b.setActionCommand("ACTION_DETALHAR_AUTORIZACAO");
        this.c.setActionCommand("ACTION_EXCLUIR_AUTORIZACAO");
        this.d.setActionCommand("ACTION_INCLUIR_AUTORIZACAO");
    }

    private void f() {
        this.a = new HashMap();
        this.a.put("manterNotaOperacaoEdicao", new JComponent[]{this.F});
        this.a.put("manterNotaOperacaoEdicaoRejeitada", new JComponent[]{this.F});
        this.a.put("MANTER_NOTA_IMPRIMIR_DANFE_CONTINGENCIA", new JComponent[]{this.E});
        this.a.put(SituacaoNFeEnum.ASSINADA.getDescricao(), new JComponent[]{this.O, this.F, this.ae, this.B});
        this.a.put(SituacaoNFeEnum.AUTORIZADA.getDescricao(), new JComponent[]{this.E, this.O, this.e, this.B, this.f});
        this.a.put(SituacaoNFeEnum.CANCELADA.getDescricao(), new JComponent[]{this.B});
        this.a.put(SituacaoNFeEnum.CANCELADA_EVENTO.getDescricao(), new JComponent[]{this.B});
        this.a.put(SituacaoNFeEnum.DENEGADA.getDescricao(), new JComponent[]{this.B});
        this.a.put(SituacaoNFeEnum.EM_DIGITACAO.getDescricao(), new JComponent[]{this.F, this.af, this.B});
        this.a.put(SituacaoNFeEnum.EM_PROCESSAMENTO_SEFAZ.getDescricao(), new JComponent[]{this.O, this.B});
        this.a.put(SituacaoNFeEnum.REJEITADA.getDescricao(), new JComponent[]{this.F, this.B});
        this.a.put(SituacaoNFeEnum.TRANSMITIDA_COM_PENDENCIA.getDescricao(), new JComponent[]{this.O, this.B});
        this.a.put(SituacaoNFeEnum.VALIDADA.getDescricao(), new JComponent[]{this.O, this.F, this.a, this.B});
        this.a.put("manterNotaEdicao", new JComponent[]{this.k, this.o, this.f, this.j, this.f, this.g, this.d, this.d, this.u, this.h, this.b, this.c, this.e, this.f, this.a, this.c, this.d, this.e, this.q, this.s, this.r, this.r, this.p, this.n, this.x, this.y, this.z, this.v, this.o, this.k, this.m, this.l, this.u, this.n, this.l, this.S, this.e, this.h, this.t, this.v, this.j, this.q, this.d, this.s, this.i, this.f, this.h, this.g, this.p, this.k, this.i, this.j, this.R, this.b, this.a, this.f, this.U, this.K, this.V, this.N, this.C, this.W, this.R, this.P, this.Q, this.x, this.T, this.z, this.S, this.y, this.z, this.K, this.X, this.W, this.Z, this.J, this.Y, this.A, this.C, this.M, this.L, this.a, this.b, this.c, this.a, this.Q, this.O, this.x, this.w, this.v, this.P, this.X, this.B, this.aa, this.j, this.ad, this.b, this.e, this.c, this.d, this.j, this.d, this.e, this.K, this.N, this.R, this.q, this.s, this.r, this.t, this.u, this.q, this.F, this.G, this.T, this.X, this.H, this.G, this.a, this.t, this.o, this.p, this.g, this.r, this.d, this.g, this.I, this.s, this.A, this.E, this.C, this.D, this.B});
        this.a.put("manterNotaTodos", new JComponent[]{this.k, this.o, this.f, this.j, this.f, this.g, this.d, this.d, this.u, this.h, this.b, this.c, this.e, this.f, this.a, this.c, this.d, this.e, this.q, this.s, this.r, this.r, this.p, this.n, this.x, this.y, this.z, this.v, this.o, this.k, this.m, this.l, this.u, this.n, this.l, this.S, this.e, this.h, this.t, this.v, this.j, this.q, this.d, this.s, this.i, this.f, this.h, this.g, this.p, this.k, this.i, this.j, this.R, this.b, this.a, this.f, this.U, this.L, this.K, this.V, this.N, this.C, this.W, this.R, this.P, this.Q, this.x, this.T, this.z, this.S, this.y, this.z, this.K, this.X, this.W, this.Z, this.J, this.Y, this.A, this.C, this.M, this.L, this.a, this.b, this.c, this.a, this.Q, this.O, this.x, this.w, this.v, this.P, this.X, this.B, this.aa, this.j, this.ad, this.b, this.e, this.c, this.d, this.j, this.d, this.e, this.K, this.N, this.R, this.q, this.s, this.r, this.t, this.u, this.q, this.D, this.F, this.G, this.T, this.X, this.H, this.G, this.a, this.t, this.o, this.p, this.g, this.r, this.d, this.g, this.I, this.s, this.A, this.E, this.C, this.D, this.B});
        this.a.put("MANTER_NOTA_DPEC", new JComponent[]{this.D});
        this.a.put("manterNotaDetalhe", new JComponent[]{this.c, this.d, this.e, this.f, this.j});
        this.a.put("manterNotaInicioDesabilitado", new JComponent[]{this.k, this.n, this.m, this.p, this.l, this.o, this.u, this.w, this.F, this.af, this.a, this.ae, this.e, this.f, this.E, this.O, this.B, this.D});
        this.a.put("manterNotaInicioHabilitado", new JComponent[0]);
        this.a.put("manterNotaDestEntrega", new JComponent[]{this.u});
        this.a.put("manterNotaDestRetirada", new JComponent[]{this.w});
        this.a.put("manterNotaProdInicioDesabilitado", new JComponent[]{this.S, this.T});
        this.a.put("manterNotaProdUmSelecionado", new JComponent[]{this.S, this.T});
        this.a.put("manterNotaProdVariosSelecionados", new JComponent[]{this.T});
        this.a.put("manterNotaDetalheProdUmSelecionado", new JComponent[]{this.S});
        this.a.put("manterNotaDetalheProdVariosSelecionados", new JComponent[0]);
        this.a.put("manterNotaAutorizacaoInicioDesabilitado", new JComponent[]{this.b, this.c});
        this.a.put("manterNotaAutorizacaoUmSelecionado", new JComponent[]{this.b, this.c});
        this.a.put("manterNotaAutorizacaoVariosSelecionados", new JComponent[]{this.c});
        this.a.put("manterNotaDetalheAutorizacaoUmSelecionado", new JComponent[]{this.b});
        this.a.put("manterNotaDetalheAutorizacaoVariosSelecionados", new JComponent[0]);
        this.a.put("MANTER_NOTA_TRANS_BALSA", new JComponent[]{this.a});
        this.a.put("MANTER_NOTA_TRANS_VAGAO", new JComponent[]{this.Q});
        this.a.put("MANTER_NOTA_TRANS_VEICULO_REBOQUE", new JComponent[]{this.P, this.X, this.B, this.aa, this.Y, this.Z});
        this.a.put("MANTER_NOTA_TRANS_TODOS_CAMPOS", new JComponent[]{this.d, this.z, this.K, this.X, this.W, this.Z, this.J, this.Y, this.A, this.C, this.M, this.L, this.a, this.b, this.c, this.a, this.Q, this.O, this.x, this.w, this.v, this.P, this.X, this.B, this.aa, this.j, this.ad});
        this.a.put("MANTER_NFE_INICIO_DESABILITADO" + DSENLabelConstants.FORNECIMENTOS_DIARIOS, new JComponent[]{this.H, this.y, this.A});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.FORNECIMENTOS_DIARIOS + "1", new JComponent[]{this.y});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.FORNECIMENTOS_DIARIOS + "*", new JComponent[0]);
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.FORNECIMENTOS_DIARIOS + "0", new JComponent[0]);
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.FORNECIMENTOS_DIARIOS + "1", new JComponent[]{this.H, this.y, this.A});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.FORNECIMENTOS_DIARIOS + "*", new JComponent[]{this.H, this.A});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.FORNECIMENTOS_DIARIOS + "0", new JComponent[]{this.H});
        this.a.put("MANTER_NFE_INICIO_DESABILITADO" + DSENLabelConstants.DEDUCOES, new JComponent[]{this.G, this.x, this.z});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.DEDUCOES + "1", new JComponent[]{this.x});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.DEDUCOES + "*", new JComponent[0]);
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.DEDUCOES + "0", new JComponent[0]);
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.DEDUCOES + "1", new JComponent[]{this.G, this.x, this.z});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.DEDUCOES + "*", new JComponent[]{this.G, this.z});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.DEDUCOES + "0", new JComponent[]{this.G});
        this.a.put("MANTER_NFE_INICIO_DESABILITADO" + DSENLabelConstants.NF_REFERENCIADA, new JComponent[]{this.q, this.k, this.n});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.NF_REFERENCIADA + "1", new JComponent[]{this.k});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.NF_REFERENCIADA + "*", new JComponent[0]);
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.NF_REFERENCIADA + "0", new JComponent[0]);
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.NF_REFERENCIADA + "1", new JComponent[]{this.q, this.k, this.n});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.NF_REFERENCIADA + "*", new JComponent[]{this.q, this.n});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.NF_REFERENCIADA + "0", new JComponent[]{this.q});
        this.a.put("MANTER_NFE_INICIO_DESABILITADO" + DSENLabelConstants.NFP_REFERENCIADA, new JComponent[]{this.s, this.m, this.p});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.NFP_REFERENCIADA + "1", new JComponent[]{this.m});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.NFP_REFERENCIADA + "*", new JComponent[0]);
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.NFP_REFERENCIADA + "0", new JComponent[0]);
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.NFP_REFERENCIADA + "1", new JComponent[]{this.s, this.m, this.p});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.NFP_REFERENCIADA + "*", new JComponent[]{this.s, this.p});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.NFP_REFERENCIADA + "0", new JComponent[]{this.s});
        this.a.put("MANTER_NFE_INICIO_DESABILITADO" + DSENLabelConstants.CUPOM_FISCAL, new JComponent[]{this.r, this.l, this.o});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.CUPOM_FISCAL + "1", new JComponent[]{this.l});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.CUPOM_FISCAL + "*", new JComponent[0]);
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.CUPOM_FISCAL + "0", new JComponent[0]);
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.CUPOM_FISCAL + "1", new JComponent[]{this.r, this.l, this.o});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.CUPOM_FISCAL + "*", new JComponent[]{this.r, this.o});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.CUPOM_FISCAL + "0", new JComponent[]{this.r});
        this.a.put("MANTER_NFE_INICIO_DESABILITADO" + DSENLabelConstants.REBOQUE, new JComponent[]{this.aa, this.Y, this.Z});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.REBOQUE + "1", new JComponent[]{this.Y});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.REBOQUE + "*", new JComponent[0]);
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.REBOQUE + "0", new JComponent[0]);
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.REBOQUE + "1", new JComponent[]{this.aa, this.Y, this.Z});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.REBOQUE + "*", new JComponent[]{this.aa, this.Z});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.REBOQUE + "0", new JComponent[]{this.aa});
        this.a.put("MANTER_NFE_INICIO_DESABILITADO" + DSENLabelConstants.VOLUME, new JComponent[]{this.ad, this.ab, this.ac});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.VOLUME + "1", new JComponent[]{this.ab});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.VOLUME + "*", new JComponent[0]);
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.VOLUME + "0", new JComponent[0]);
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.VOLUME + "1", new JComponent[]{this.ad, this.ab, this.ac});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.VOLUME + "*", new JComponent[]{this.ad, this.ac});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.VOLUME + "0", new JComponent[]{this.ad});
        this.a.put("MANTER_NFE_INICIO_DESABILITADO" + DSENLabelConstants.DUPLICATA, new JComponent[]{this.j, this.h, this.i});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.DUPLICATA + "1", new JComponent[]{this.h});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.DUPLICATA + "*", new JComponent[0]);
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.DUPLICATA + "0", new JComponent[0]);
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.DUPLICATA + "1", new JComponent[]{this.j, this.h, this.i});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.DUPLICATA + "*", new JComponent[]{this.j, this.i});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.DUPLICATA + "0", new JComponent[]{this.j});
        this.a.put("MANTER_NFE_INICIO_DESABILITADO" + DSENLabelConstants.OBSERVACAO_FISCO, new JComponent[]{this.N, this.L, this.M});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.OBSERVACAO_FISCO + "1", new JComponent[]{this.L});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.OBSERVACAO_FISCO + "*", new JComponent[0]);
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.OBSERVACAO_FISCO + "0", new JComponent[0]);
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.OBSERVACAO_FISCO + "1", new JComponent[]{this.N, this.L, this.M});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.OBSERVACAO_FISCO + "*", new JComponent[]{this.N, this.M});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.OBSERVACAO_FISCO + "0", new JComponent[]{this.N});
        this.a.put("MANTER_NFE_INICIO_DESABILITADO" + DSENLabelConstants.OBSERVACAO_CONTRIBUINTE, new JComponent[]{this.K, this.I, this.J});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.OBSERVACAO_CONTRIBUINTE + "1", new JComponent[]{this.I});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.OBSERVACAO_CONTRIBUINTE + "*", new JComponent[0]);
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.OBSERVACAO_CONTRIBUINTE + "0", new JComponent[0]);
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.OBSERVACAO_CONTRIBUINTE + "1", new JComponent[]{this.K, this.I, this.J});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.OBSERVACAO_CONTRIBUINTE + "*", new JComponent[]{this.K, this.J});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.OBSERVACAO_CONTRIBUINTE + "0", new JComponent[]{this.K});
        this.a.put("MANTER_NFE_INICIO_DESABILITADO" + DSENLabelConstants.PROCESSO_REFERENCIADO, new JComponent[]{this.R, this.P, this.Q});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.PROCESSO_REFERENCIADO + "1", new JComponent[]{this.P});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.PROCESSO_REFERENCIADO + "*", new JComponent[0]);
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.PROCESSO_REFERENCIADO + "0", new JComponent[0]);
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.PROCESSO_REFERENCIADO + "1", new JComponent[]{this.R, this.P, this.Q});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.PROCESSO_REFERENCIADO + "*", new JComponent[]{this.R, this.Q});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.PROCESSO_REFERENCIADO + "0", new JComponent[]{this.R});
    }

    private void g() {
        this.i();
        this.l();
        this.n();
        this.o();
        this.p();
        this.q();
        this.r();
        this.j();
        this.k();
        this.s();
        this.h();
        this.m();
    }

    private void h() {
        try {
            this.h = new JDSGEPageableTable();
            int index = 0;
            this.h.getWrappedTable().addColumn(index++, "numProtocolo", "Protocolo", false, "numProtocolo");
            this.h.getWrappedTable().addColumn(index++, "dataEvento", "Data/Hora", (DefaultFormatter)new DateTimeFormatter(), false, "dataEvento");
            this.h.getWrappedTable().addColumn(index++, "tpEvento", "Evento", false, "tpEvento");
            this.h.getWrappedTable().addColumn(index++, "numSeqEventoStr", "N\u00famero de Seq\u00fc\u00eancia", false, "NSeqEvento");
            this.h.getWrappedTable().addColumn(index++, "botaoDetalhe", "Detalhe", false, "botaoDetalhe");
            this.h.getWrappedTable().getColumnModel().getColumn(3).setPreferredWidth(150);
            this.h.getWrappedTable().getColumnModel().getColumn(3).setMaxWidth(150);
            this.h.getWrappedTable().getColumnModel().getColumn(4).setPreferredWidth(50);
            this.h.getWrappedTable().getColumnModel().getColumn(4).setMaxWidth(50);
            this.h.setSelectAllAvailable(false);
            this.h.setPageable(false);
            this.h.setSortable(false);
            this.h.setAutoFitTableColumns(false);
            this.h.setColumnSelecao(-1);
            this.h.setPanel(this.E);
            this.h.getWrappedTable().addMouseListener((MouseListener)new JTableImageMouseListener((JTable)this.h.getWrappedTable()));
            this.h.getWrappedTable().addMouseMotionListener((MouseMotionListener)new JTableImageMouseListener((JTable)this.h.getWrappedTable()));
            this.h.getWrappedTable().addMouseListener((MouseListener)new /* Unavailable Anonymous Inner Class!! */);
             renderer = new /* Unavailable Anonymous Inner Class!! */;
            int columnIndex = this.h.getWrappedTable().getColumnModel().getColumnCount() - 1;
            while (columnIndex > 0) {
                this.h.getWrappedTable().getColumnModel().getColumn(--columnIndex).setCellRenderer((TableCellRenderer)renderer);
            }
            this.h.getWrappedTable().setDefaultRenderer(JLabel.class, (TableCellRenderer)new JTableComponentRenderer(this.h.getWrappedTable().getDefaultRenderer(JLabel.class)));
        }
        catch (Exception ex) {
            ex.printStackTrace();
            this.showErrors((Throwable)ex);
        }
    }

    private String a(TipoEventoEnum tpEvento) throws IOException {
        InputStream iS = this.getClass().getResourceAsStream("html/" + tpEvento.getCodigo() + ".html");
        StringBuilder builder = new StringBuilder();
        try {
            int c;
            while ((c = iS.read()) != -1) {
                builder.append((char)c);
            }
        }
        catch (IOException e) {
            int c;
            iS = this.getClass().getResourceAsStream("html/default.html");
            while ((c = iS.read()) != -1) {
                builder.append((char)c);
            }
        }
        catch (Exception e) {
            int c;
            iS = this.getClass().getResourceAsStream("html/default.html");
            while ((c = iS.read()) != -1) {
                builder.append((char)c);
            }
        }
        return builder.toString();
    }

    private String a(EventoTO eventoTO) {
        try {
            String html = this.a(eventoTO.getTpEvento());
            String descricao = eventoTO.getTpEvento().getDescricao();
            if (eventoTO.getCErro() != null && (eventoTO.getCErro().equals(DSENConstants.CODIGO_AUTORIZADO_FORA_PRAZO) || eventoTO.getCErro().equals(DSENConstants.CODIGO_CANCELAMENTO_EVENTO_FORA_PRAZO) || eventoTO.getCErro().equals(DSENConstants.CODIGO_CANCELAMENTO_FORA_PRAZO))) {
                descricao = eventoTO.getMensagemErro();
            }
            String nProt = eventoTO.getNumProtocolo();
            String dhEvento = DateHelper.formataDataHora((Date)eventoTO.getDataEvento(), (SimpleDateFormat)DateHelper.DATE_TIME_FORMAT);
            String nSeqEvento = eventoTO.getnSeqEvento().toString();
            String dhRegEvento = DateHelper.formataDataHora((Date)eventoTO.getDataRegEvento(), (SimpleDateFormat)DateHelper.DATE_TIME_FORMAT);
            if (dhRegEvento == null) {
                dhRegEvento = dhEvento;
            }
            switch (22.a[eventoTO.getTpEvento().ordinal()]) {
                case 1: {
                    return MessageFormat.format(html, descricao, nProt, nSeqEvento, dhRegEvento);
                }
                case 2: {
                    return MessageFormat.format(html, descricao, nProt, nSeqEvento, dhRegEvento);
                }
                case 13: {
                    return MessageFormat.format(html, descricao, nProt, nSeqEvento, dhEvento, dhRegEvento, XMLUtil.getFirstTagConteudo((String)eventoTO.getXmlProcString(), (String)"xCorrecao", (boolean)false, (boolean)false));
                }
                case 3: {
                    return MessageFormat.format(html, descricao, nProt, nSeqEvento, dhRegEvento, XMLUtil.getFirstTagConteudo((String)eventoTO.getXmlProcString(), (String)"xJust", (boolean)false, (boolean)false));
                }
                case 4: {
                    return MessageFormat.format(html, descricao, nProt, nSeqEvento, dhRegEvento, XMLUtil.getFirstTagConteudo((String)eventoTO.getXmlProcString(), (String)"xJust", (boolean)false, (boolean)false));
                }
                case 5: {
                    return MessageFormat.format(html, descricao, nProt, nSeqEvento, dhRegEvento);
                }
                case 6: {
                    return MessageFormat.format(html, descricao, nProt, nSeqEvento, dhRegEvento);
                }
                case 7: {
                    return MessageFormat.format(html, descricao, nProt, nSeqEvento, dhEvento, dhRegEvento, XMLUtil.getFirstTagConteudo((String)eventoTO.getXmlProcString(), (String)"xCorrecao", (boolean)false, (boolean)false));
                }
                case 11: 
                case 12: {
                    return MessageFormat.format(html, descricao, nProt, nSeqEvento, dhEvento, dhRegEvento, XMLUtil.getFirstTagConteudo((String)eventoTO.getXmlProcString(), (String)"chCTe", (boolean)false, (boolean)false));
                }
                case 8: 
                case 9: 
                case 10: {
                    return MessageFormat.format(html, descricao, nProt, nSeqEvento, dhEvento, dhRegEvento, XMLUtil.getFirstTagConteudo((String)eventoTO.getXmlProcString(), (String)"PINe", (boolean)false, (boolean)false));
                }
            }
        }
        catch (Exception e) {
            this.showErrors((Throwable)e);
        }
        return null;
    }

    public void addEvento(EventoTO eventoTO) {
        switch (22.a[eventoTO.getTpEvento().ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                JLabel label = new JLabel(this.a);
                label.addMouseListener((MouseListener)new /* Unavailable Anonymous Inner Class!! */);
                eventoTO.setBotaoDetalhe(label);
            }
        }
        this.h.addTO((BaseTO)eventoTO);
    }

    public JDSGEPageableTable<ProdutoNotaTO> getTableProdutos() {
        return this.f;
    }

    public JDSGEPageableTable<AutorizacaoTO> getTableAutorizacao() {
        return this.g;
    }

    private void i() {
        this.c = new JDSGEPageableTable();
        this.c.setPageable(false);
        this.c.setSortable(false);
        this.c.setSelectAllAvailable(true);
        CNPJFormatter cnpjFormatter = null;
        try {
            cnpjFormatter = new CNPJFormatter();
        }
        catch (ParseException parseException) {
            // empty catch block
        }
        this.c.addColumn(0, "marcado", "", true, null);
        this.c.addColumn(1, "NItem", "Item", false, null);
        this.c.addColumn(2, "descricaoTipo", "Tipo", false, null);
        this.c.addColumn(3, "chave", "Chave de acesso", (DefaultFormatter)new ChaveAcessoFormatter(), false, null);
        this.c.addColumn(4, "CUF", "UF", (DefaultFormatter)new UFFormatter(), false, null);
        this.c.addColumn(5, "MMAA", "Emiss\u00e3o", false, null);
        this.c.addColumn(6, "CNPJ", "CNPJ", (DefaultFormatter)cnpjFormatter, false, null);
        this.c.addColumn(7, "mod", "Modelo", false, null);
        this.c.addColumn(8, "formattedSerie", "S\u00e9rie", false, null);
        this.c.addColumn(9, "formattedNNf", "N\u00famero", false, null);
        this.c.getWrappedTable().getColumnModel().getColumn(0).setMaxWidth(30);
        this.c.getWrappedTable().getColumnModel().getColumn(1).setMaxWidth(50);
        this.c.getWrappedTable().getColumnModel().getColumn(2).setMaxWidth(100);
        this.c.getWrappedTable().getColumnModel().getColumn(3).setMaxWidth(1200);
        this.c.getWrappedTable().getColumnModel().getColumn(4).setMaxWidth(50);
        this.c.getWrappedTable().getColumnModel().getColumn(5).setMaxWidth(80);
        this.c.getWrappedTable().getColumnModel().getColumn(6).setMaxWidth(300);
        this.c.getWrappedTable().getColumnModel().getColumn(7).setMaxWidth(50);
        this.c.getWrappedTable().getColumnModel().getColumn(8).setMaxWidth(50);
        this.c.getWrappedTable().getColumnModel().getColumn(9).setMaxWidth(100);
        this.h.setViewportView((Component)this.c);
        this.c.addCellEditorListener(0, (CellEditorListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void j() {
        this.d = new JDSGEPageableTable();
        this.d.setPageSize(0);
        this.d.setPageable(false);
        this.d.setSortable(false);
        this.d.setSelectAllAvailable(true);
        this.d.addColumn(0, "marcado", "", true, null);
        this.d.addColumn(1, "NItem", "Item", false, null);
        this.d.addColumn(2, "CUF", "UF", (DefaultFormatter)new UFFormatter(), false, null);
        this.d.addColumn(3, "MMAA", "Emiss\u00e3o", false, null);
        this.d.addColumn(4, "documento", "CNPJ/CPF", false, null);
        this.d.addColumn(5, "IE", "Inscri\u00e7\u00e3o Estadual do Emitente", false, null);
        this.d.addColumn(6, "mod", "Modelo", false, null);
        this.d.addColumn(7, "formattedNNf", "N\u00famero", false, null);
        this.d.addColumn(8, "formattedSerie", "S\u00e9rie", false, null);
        this.d.getWrappedTable().getColumnModel().getColumn(0).setMaxWidth(30);
        this.d.getWrappedTable().getColumnModel().getColumn(1).setMaxWidth(50);
        this.d.getWrappedTable().getColumnModel().getColumn(2).setMaxWidth(50);
        this.d.getWrappedTable().getColumnModel().getColumn(3).setMaxWidth(80);
        this.d.getWrappedTable().getColumnModel().getColumn(4).setMaxWidth(300);
        this.d.getWrappedTable().getColumnModel().getColumn(5).setMaxWidth(300);
        this.d.getWrappedTable().getColumnModel().getColumn(6).setMaxWidth(50);
        this.d.getWrappedTable().getColumnModel().getColumn(7).setMaxWidth(300);
        this.d.getWrappedTable().getColumnModel().getColumn(8).setMaxWidth(100);
        this.i.setViewportView((Component)this.d);
        this.d.addCellEditorListener(0, (CellEditorListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void k() {
        this.e = new JDSGEPageableTable();
        this.e.setPageSize(0);
        this.e.setPageable(false);
        this.e.setSortable(false);
        this.d.setSelectAllAvailable(true);
        this.e.addColumn(0, "marcado", "", true, null);
        this.e.addColumn(1, "NItem", "Item", false, null);
        this.e.addColumn(2, "formattedNECF", "N\u00famero ECF", false, null);
        this.e.addColumn(3, "formattedNCOO", "N\u00famero COO", false, null);
        this.e.addColumn(4, "mod", "Modelo", false, null);
        this.e.getWrappedTable().getColumnModel().getColumn(0).setMaxWidth(30);
        this.e.getWrappedTable().getColumnModel().getColumn(1).setMaxWidth(50);
        this.e.getWrappedTable().getColumnModel().getColumn(4).setMaxWidth(100);
        this.g.setViewportView((Component)this.e);
        this.e.addCellEditorListener(0, (CellEditorListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void l() {
        this.f = new JDSGEPageableTable();
        this.f.setPageSize(0);
        this.f.setPageable(false);
        this.f.setSortable(false);
        NumberFormatter formatter1204 = NumberFormatterHelper.getFormatter1204();
        NumberFormatter formatter1104 = NumberFormatterHelper.getFormatter1104();
        NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
        NumberFormatter formatter0302 = NumberFormatterHelper.getFormatter0302();
        this.f.addColumn(0, "marcado", "", true, null);
        this.f.addColumn(1, "NItem", "Item", false, null);
        this.f.addColumn(2, "CProd", "C\u00f3digo", false, null);
        this.f.addColumn(3, "XProd", "Descri\u00e7\u00e3o", false, null);
        this.f.addColumn(4, "NCM", "NCM", false, null);
        this.f.addColumn(5, "CFOP", "CFOP", false, null);
        this.f.addColumn(6, "unid", "Unid.", false, null);
        this.f.addColumn(7, "qtd", "Qtde.", (DefaultFormatter)formatter1104, false, null);
        this.f.addColumn(8, "VUnid", "V. Unit.", (DefaultFormatter)formatter1204, false, null);
        this.f.addColumn(9, "VTot", "V. Total", (DefaultFormatter)formatter1302, false, null);
        this.f.addColumn(10, "BCICMS", "BC ICMS", (DefaultFormatter)formatter1302, false, null);
        this.f.addColumn(11, "VICMS", "V. ICMS", (DefaultFormatter)formatter1302, false, null);
        this.f.addColumn(12, "VIPI", "V. IPI", (DefaultFormatter)formatter1302, false, null);
        this.f.addColumn(13, "PICMS", "Aliq. ICMS", (DefaultFormatter)formatter0302, false, null);
        this.f.addColumn(14, "PIPI", "Aliq. IPI", (DefaultFormatter)formatter0302, false, null);
        this.f.setAutoFitTableColumns(true);
        this.f.setScrollPane(this.m);
    }

    private void m() {
        this.g = new JDSGEPageableTable();
        this.g.setPageSize(0);
        this.g.setPageable(false);
        this.g.setSortable(false);
        this.g.addColumn(0, "marcado", "", true, null);
        this.g.addColumn(1, "NItem", "Item", false, null);
        this.g.addColumn(2, "Documento", "Documento", false, null);
        this.g.setAutoFitTableColumns(true);
        this.g.setScrollPane(this.e);
    }

    private void n() {
        this.i = new JDSGEPageableTable();
        this.i.setPageSize(0);
        this.i.setPageable(false);
        this.i.setSortable(false);
        this.i.addColumn(0, "marcado", "", true, null);
        this.i.addColumn(1, "NItem", "Item", false, null);
        this.i.addColumn(2, "placa", "Placa", false, null);
        this.i.addColumn(3, "UF", "UF", false, null);
        this.i.addColumn(4, "RNTC", "RNTC", false, null);
        this.i.getWrappedTable().getColumnModel().getColumn(0).setMaxWidth(30);
        this.i.getWrappedTable().getColumnModel().getColumn(1).setMaxWidth(50);
        this.i.getWrappedTable().getColumnModel().getColumn(2).setMaxWidth(200);
        this.i.getWrappedTable().getColumnModel().getColumn(2).setPreferredWidth(125);
        this.i.getWrappedTable().getColumnModel().getColumn(3).setMaxWidth(100);
        this.i.setPanel(this.Z);
        this.i.addCellEditorListener(0, (CellEditorListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void o() {
        this.j = new JDSGEPageableTable();
        this.j.setPageSize(0);
        this.j.setPageable(false);
        this.j.setSortable(false);
        this.j.setSelectAllAvailable(true);
        NumberFormatter pesoLFormatter = NumberFormatterHelper.getFormatter1203();
        NumberFormatter pesoBFormatter = NumberFormatterHelper.getFormatter1203();
        this.j.addColumn(0, "marcado", "", true, null);
        this.j.addColumn(1, "NItem", "Item", false, null);
        this.j.addColumn(2, "QVol", "Qtde. Vol.", false, null);
        this.j.addColumn(3, "esp", "Esp\u00e9cie", false, null);
        this.j.addColumn(4, "marca", "Marca", false, null);
        this.j.addColumn(5, "NVol", "N\u00famero Vol.", false, null);
        this.j.addColumn(6, "pesoL", "Peso Liq.", (DefaultFormatter)pesoLFormatter, false, null);
        this.j.addColumn(7, "pesoB", "Peso Bruto", (DefaultFormatter)pesoBFormatter, false, null);
        this.j.setPanel(this.ad);
        this.j.setAutoFitTableColumns(true);
        this.j.addCellEditorListener(0, (CellEditorListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void p() {
        this.k = new JDSGEPageableTable();
        this.k.setPageSize(0);
        this.k.setPageable(false);
        this.k.setSortable(false);
        this.k.addColumn(0, "marcado", "", true, null);
        this.k.addColumn(1, "NItem", "Item", false, null);
        this.k.addColumn(2, "NDup", "N\u00famero", false, null);
        this.k.addColumn(3, "DVenc", "Data Vencimento", (DefaultFormatter)this.b, false, null);
        this.k.addColumn(4, "VDup", "Valor", (DefaultFormatter)NumberFormatterHelper.getFormatter1302(), false, null);
        this.k.getWrappedTable().getColumnModel().getColumn(0).setMaxWidth(30);
        this.k.getWrappedTable().getColumnModel().getColumn(1).setMaxWidth(50);
        this.f.setViewportView((Component)this.k);
        this.k.addCellEditorListener(0, (CellEditorListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void q() {
        this.l = new JDSGEPageableTable();
        this.l.setPageSize(0);
        this.l.setPageable(false);
        this.l.setSortable(false);
        this.l.addColumn(0, "marcado", "", true, null);
        this.l.addColumn(1, "NItem", "Item", false, null);
        this.l.addColumn(2, "XCampo", "Nome", false, null);
        this.l.addColumn(3, "XTexto", "Observa\u00e7\u00e3o", false, null);
        this.l.getWrappedTable().getColumnModel().getColumn(0).setMaxWidth(30);
        this.l.getWrappedTable().getColumnModel().getColumn(1).setMaxWidth(50);
        this.l.getWrappedTable().getColumnModel().getColumn(2).setMaxWidth(150);
        this.m = new JDSGEPageableTable();
        this.m.setPageSize(0);
        this.m.setPageable(false);
        this.m.setSortable(false);
        this.m.addColumn(0, "marcado", "", true, null);
        this.m.addColumn(1, "NItem", "Item", false, null);
        this.m.addColumn(2, "XCampo", "Nome", false, null);
        this.m.addColumn(3, "XTexto", "Observa\u00e7\u00e3o", false, null);
        this.m.getWrappedTable().getColumnModel().getColumn(0).setMaxWidth(30);
        this.m.getWrappedTable().getColumnModel().getColumn(1).setMaxWidth(50);
        this.m.getWrappedTable().getColumnModel().getColumn(2).setMaxWidth(150);
        this.n = new JDSGEPageableTable();
        this.n.setPageSize(0);
        this.n.setPageable(false);
        this.n.setSortable(false);
        this.n.addColumn(0, "marcado", "", true, null);
        this.n.addColumn(1, "NItem", "Item", false, null);
        this.n.addColumn(2, "NProc", "Identificador", false, null);
        this.n.addColumn(3, "descricaoOrigem", "Origem", false, null);
        this.n.getWrappedTable().getColumnModel().getColumn(0).setMaxWidth(30);
        this.n.getWrappedTable().getColumnModel().getColumn(1).setMaxWidth(50);
        this.j.setViewportView((Component)this.l);
        this.k.setViewportView((Component)this.m);
        this.l.setViewportView((Component)this.n);
        this.l.addCellEditorListener(0, (CellEditorListener)new /* Unavailable Anonymous Inner Class!! */);
        this.m.addCellEditorListener(0, (CellEditorListener)new /* Unavailable Anonymous Inner Class!! */);
        this.n.addCellEditorListener(0, (CellEditorListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void r() {
        this.a = new JDSGEPageableTable();
        this.a.setPageSize(0);
        this.a.setPageable(false);
        this.a.setSortable(false);
        this.a.addColumn(0, "marcado", "", true, null);
        this.a.addColumn(1, "Dia", "Dia", false, null);
        this.a.addColumn(2, "Qtde", "Quantidade em KG (Peso L\u00edquido)", (DefaultFormatter)NumberFormatterHelper.getFormatter((int)10, (int)10, (int)11), false, null);
        this.a.getWrappedTable().getColumnModel().getColumn(0).setMaxWidth(30);
        this.a.getWrappedTable().getColumnModel().getColumn(1).setMaxWidth(50);
        this.a.setPanel(this.G);
        this.a.addCellEditorListener(0, (CellEditorListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.addCellEditorListener(0, (CellEditorListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void s() {
        this.b = new JDSGEPageableTable();
        this.b.setPageSize(0);
        this.b.setPageable(false);
        this.b.setSortable(false);
        this.b.addColumn(0, "marcado", "", true, null);
        this.b.addColumn(1, "nItem", "Item", false, null);
        this.b.addColumn(2, "VDed", "Valor", (DefaultFormatter)NumberFormatterHelper.getFormatter1302(), false, null);
        this.b.addColumn(3, "XDed", "Descri\u00e7\u00e3o", false, null);
        this.b.getWrappedTable().getColumnModel().getColumn(0).setMaxWidth(30);
        this.b.getWrappedTable().getColumnModel().getColumn(1).setMaxWidth(50);
        this.b.getWrappedTable().getColumnModel().getColumn(2).setMaxWidth(300);
        this.b.getWrappedTable().getColumnModel().getColumn(2).setMinWidth(150);
        this.b.getWrappedTable().getColumnModel().getColumn(2).setPreferredWidth(150);
        this.b.setPanel(this.x);
        this.b.addCellEditorListener(0, (CellEditorListener)new /* Unavailable Anonymous Inner Class!! */);
        this.b.addCellEditorListener(0, (CellEditorListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    public void setMsgDadosNFe(NotaFiscalTO nota) {
        SituacaoNFeEnum situacao = nota.getSituacao();
        if (situacao == null) {
            this.af.setVisible(false);
            this.af.setText(null);
            return;
        }
        this.af.setForeground(Color.BLACK);
        this.af.setFont(new Font("Dialog", 0, 10));
        switch (22.b[situacao.ordinal()]) {
            case 1: {
                this.af.setVisible(true);
                this.af.setText(DSENMessageConstants.MENSAGEM_EXPLICATIVA_NOTA_AUTORIZADA);
                break;
            }
            case 2: {
                this.af.setFont(new Font("Dialog", 1, 14));
                this.af.setForeground(Color.RED);
                this.af.setVisible(true);
                String dataRejeicao = this.a.getLoteTO() != null && this.a.getLoteTO().getDataProcessamento() != null ? DateHelper.formataDataHora((Date)this.a.getLoteTO().getDataProcessamento(), (SimpleDateFormat)DateHelper.SIMPLE_DATE_TIME_FORMAT) : null;
                String descricaoSituacao = "<html><p>" + (!StringHelper.isBlankOrNull((Object)dataRejeicao) ? new StringBuilder().append("(").append(dataRejeicao).append(") ").toString() : "") + (!StringHelper.isBlankOrNull((Object)this.a.getCodigoErro()) ? new StringBuilder().append(this.a.getCodigoErro()).append("- ").toString() : "") + (!StringHelper.isBlankOrNull((Object)this.a.getMensagemErro()) ? this.a.getMensagemErro() : " ") + "</p></html>";
                this.af.setText(descricaoSituacao);
                break;
            }
            default: {
                this.af.setVisible(false);
                this.af.setText(null);
            }
        }
    }

    private void a(NotaFiscalTO notaFiscalTO) throws DSGEUtilException {
        if (notaFiscalTO != null) {
            NFeDocument nfe = null;
            try {
                if (!StringHelper.isBlankOrNull((Object)notaFiscalTO.getDocXmlString())) {
                    nfe = notaFiscalTO.getSituacao() == null || notaFiscalTO.getSituacao().equals((Object)SituacaoNFeEnum.EM_DIGITACAO) || notaFiscalTO.getSituacao().equals((Object)SituacaoNFeEnum.VALIDADA) ? (!StringHelper.isBlankOrNull((Object)notaFiscalTO.getDocXmlString()) ? DocumentoUtil.getNFeDocument((String)notaFiscalTO.getDocXmlString()) : NFeDocument.Factory.newInstance()) : (!StringHelper.isBlankOrNull((Object)notaFiscalTO.getDocXmlString()) ? DocumentoUtil.getNFeDocument((String)notaFiscalTO.getDocXmlString()) : NFeDocument.Factory.newInstance());
                }
            }
            catch (XmlException xmlException) {
                // empty catch block
            }
            if (nfe != null) {
                if (nfe.getNFe().getInfNFe().getIde() != null) {
                    this.a(nfe);
                    this.setMsgDadosNFe(notaFiscalTO);
                }
                this.b(nfe);
                this.c(nfe);
                this.d(nfe);
                this.f(nfe);
                this.h(nfe);
                this.j(nfe);
                this.t(nfe);
                this.e(nfe);
                this.i(nfe);
                this.k(nfe);
                this.g(nfe);
            }
            this.j.setText(notaFiscalTO.getNumero());
            this.k.setText(notaFiscalTO.getSerie());
            this.g.setText(notaFiscalTO.getDataEmissao() != null ? DateHelper.formataDataHora((Date)notaFiscalTO.getDataEmissao(), (SimpleDateFormat)DateHelper.SIMPLE_DATE_TIME_FORMAT) : null);
            this.aa.setText(notaFiscalTO.getVersao());
            this.c.setText(notaFiscalTO.getModelo());
            this.H.setText(notaFiscalTO.getNumero());
            this.v.setText(notaFiscalTO.getSituacao() != null ? notaFiscalTO.getSituacao().getDescricao() : null);
            if (nfe == null) {
                this.h.setText(this.g.getText());
            }
            if (notaFiscalTO.getSituacao() != null && !notaFiscalTO.getSituacao().equals((Object)SituacaoNFeEnum.EM_DIGITACAO)) {
                this.b.setText(ChaveAcessoUtil.formatarChaveAcesso4x4((String)ChaveAcessoUtil.gerarChaveAcesso((NotaFiscalTO)notaFiscalTO)));
                this.g.setVisible(true);
            } else {
                this.b.setText("");
                this.g.setVisible(false);
            }
        }
        this.atualizarTabelaEventosNfe(notaFiscalTO);
    }

    private void b(NotaFiscalTO notaFiscalTO) {
        if (notaFiscalTO != null) {
            if (!StringHelper.isBlankOrNull((Object)this.g.getText().replaceAll("\\D", ""))) {
                notaFiscalTO.setDataEmissao(DateHelper.getDateTime((String)this.g.getText(), (SimpleDateFormat)DateHelper.SIMPLE_DATE_TIME_FORMAT));
            } else {
                notaFiscalTO.setDataEmissao(new Date());
            }
            TipoEmissaoEnum tpEmissao = (TipoEmissaoEnum)this.c.getSelectedItem();
            Object documentoDest = null;
            EstadoTO estadoTO = (EstadoTO)this.i.getSelectedItem();
            try {
                documentoDest = this.b.stringToValue(this.t.getText());
            }
            catch (ParseException parseException) {
                // empty catch block
            }
            EstadoTO ufEmit = (EstadoTO)this.n.getSelectedItem();
            if (ufEmit != null) {
                notaFiscalTO.setCodigoUfEmitente(ufEmit.getCodigo());
            } else {
                notaFiscalTO.setCodigoUfEmitente(null);
            }
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTime(notaFiscalTO.getDataEmissao());
            notaFiscalTO.setAno(ChaveAcessoUtil.DATA_MODELO_FORMAT.format(calendar.get(1) % 100));
            notaFiscalTO.setMes(ChaveAcessoUtil.DATA_MODELO_FORMAT.format(calendar.get(2) + 1));
            notaFiscalTO.setCodigoNumericoChaveAcesso(this.f.getText());
            notaFiscalTO.setDigitoChaveAcesso(this.i.getText());
            notaFiscalTO.setSerie(!StringHelper.isBlankOrNull((Object)this.k.getText()) ? this.k.getText() : null);
            notaFiscalTO.setNumero(!StringHelper.isBlankOrNull((Object)this.j.getText()) ? this.j.getText() : null);
            notaFiscalTO.setTipoEmissao(tpEmissao);
            notaFiscalTO.setDocumentoDest(!StringHelper.isBlankOrNull((Object)documentoDest) ? documentoDest.toString() : null);
            notaFiscalTO.setUfDest(estadoTO != null ? estadoTO.getSigla() : null);
            NFeDocument nfe = null;
            try {
                nfe = !StringHelper.isBlankOrNull((Object)notaFiscalTO.getDocXmlString()) ? DocumentoUtil.getNFeDocument((String)notaFiscalTO.getDocXmlString()) : NFeDocument.Factory.newInstance();
            }
            catch (XmlException xmlException) {
                // empty catch block
            }
            if (nfe != null) {
                if (nfe.getNFe() == null) {
                    TNFe.InfNFe infNFe = nfe.addNewNFe().addNewInfNFe();
                    infNFe.setVersao(DSENProperties.getInstance().getVersaoSchema());
                }
                try {
                    this.a(notaFiscalTO, nfe);
                    this.l(nfe);
                    this.m(nfe);
                    this.n(nfe);
                    this.o(nfe);
                    this.q(nfe);
                    this.s(nfe);
                    this.r(nfe);
                    this.u(nfe);
                    this.p(nfe);
                }
                catch (ParseException infNFe) {
                    // empty catch block
                }
            }
            try {
                notaFiscalTO.setDocXmlString(DocumentoUtil.getDocumentString((Object)nfe, (boolean)true));
            }
            catch (UnsupportedEncodingException infNFe) {
                // empty catch block
            }
            notaFiscalTO.clearErrors();
            notaFiscalTO.clearMessages();
        }
    }

    private void a(NFeDocument nfe) throws DSGEUtilException {
        TNFe.InfNFe.Ide ide;
        TNFe.InfNFe.Total.ICMSTot icmsTot;
        int i;
        ide = nfe.getNFe().getInfNFe().getIde();
        this.f.setText(ide.getCNF());
        this.i.setText(ide.getCDV());
        if (!this.getOperacao().equals("manterNotaOperacaoDetalhe")) {
            this.c.setVisible(true);
            if (!StringHelper.isBlankOrNull((Object)ide.getCNF())) {
                this.c.setSelected(true);
            } else {
                this.c.setSelected(false);
                this.a(false);
            }
        } else {
            this.c.setVisible(false);
            if (!StringHelper.isBlankOrNull((Object)ide.getCNF())) {
                this.f.setVisible(true);
                this.i.setVisible(true);
                this.F.setVisible(true);
                this.q.setVisible(true);
            } else {
                this.f.setVisible(false);
                this.i.setVisible(false);
                this.F.setVisible(false);
                this.q.setVisible(false);
            }
        }
        this.c.setText(ide.getMod() != null ? ide.getMod().toString() : null);
        this.g.setText(ide.getDhEmi() != null ? DateHelper.formataDataHora((Date)DateHelper.getDateTime((String)ide.getDhEmi(), (SimpleDateFormat)DateHelper.DATE_TIME_XML_FORMAT310), (SimpleDateFormat)DateHelper.SIMPLE_DATE_TIME_FORMAT) : null);
        this.d.setText(ide.getNatOp());
        this.h.setText(ide.getDhSaiEnt() != null ? DateHelper.formataDataHora((Date)DateHelper.getDateTime((String)ide.getDhSaiEnt(), (SimpleDateFormat)DateHelper.DATE_TIME_XML_FORMAT310), (SimpleDateFormat)DateHelper.SIMPLE_DATE_TIME_FORMAT) : null);
        if (ide.getIdDest() != null) {
            IdentLocalDestinoEnum[] destino;
            for (IdentLocalDestinoEnum d : destino = IdentLocalDestinoEnum.values()) {
                if (!d.getCodigo().equals(ide.getIdDest().toString())) continue;
                this.p.setSelectedItem((Object)d);
                break;
            }
        } else {
            this.p.setSelectedIndex(0);
        }
        if (ide.getIndFinal() != null) {
            IndOperacaoConsumidorFinalEnum[] consumidor = IndOperacaoConsumidorFinalEnum.values();
            for (IdentLocalDestinoEnum c : consumidor) {
                if (!c.getCodigo().equals(ide.getIndFinal().toString())) continue;
                this.o.setSelectedItem((Object)c);
                break;
            }
        } else {
            this.o.setSelectedIndex(0);
        }
        if (ide.getIndPres() != null) {
            IndAtendementoPresencialEnum[] atendimento = IndAtendementoPresencialEnum.values();
            for (IdentLocalDestinoEnum a : atendimento) {
                if (!a.getCodigo().equals(ide.getIndPres().toString())) continue;
                this.t.setSelectedItem((Object)a);
                break;
            }
        } else {
            this.t.setSelectedIndex(0);
        }
        if (ide.getTpNF() != null) {
            if (TipoDocumentoNFeEnum.ENTRADA.getCodigo().equals(ide.getTpNF().toString())) {
                this.d.setSelectedItem((Object)TipoDocumentoNFeEnum.ENTRADA);
            } else {
                this.d.setSelectedItem((Object)TipoDocumentoNFeEnum.SAIDA);
            }
        } else {
            this.d.setSelectedItem(null);
        }
        if (ide.getIndPag() != null) {
            FormaPagamentoEnum[] formasPag = FormaPagamentoEnum.values();
            for (int i2 = 0; i2 < formasPag.length; ++i2) {
                if (!formasPag[i2].getCodigo().equals(ide.getIndPag().toString())) continue;
                this.b.setSelectedItem((Object)formasPag[i2]);
                break;
            }
        } else {
            this.b.setSelectedItem(null);
        }
        if (ide.getTpImp() != null) {
            TipoImpressaoEnum[] tpImpValues = TipoImpressaoEnum.values();
            for (i = 0; i < tpImpValues.length; ++i) {
                if (!tpImpValues[i].getCodigo().equals(ide.getTpImp().toString())) continue;
                this.u.setSelectedItem((Object)tpImpValues[i]);
                break;
            }
        } else {
            this.u.setSelectedItem(null);
        }
        if (ide.getTpEmis() != null) {
            TipoEmissaoEnum[] tpEmis = TipoEmissaoEnum.values();
            for (i = 0; i < tpEmis.length; ++i) {
                if (!tpEmis[i].getCodigo().equals(ide.getTpEmis().toString())) continue;
                this.c.setSelectedItem((Object)tpEmis[i]);
                break;
            }
        }
        if (ide.getFinNFe() != null) {
            FinalidadeEmissaoEnum[] tpNfe = FinalidadeEmissaoEnum.values();
            for (i = 0; i < tpNfe.length; ++i) {
                if (!tpNfe[i].getCodigo().equals(ide.getFinNFe().toString())) continue;
                this.e.setSelectedItem((Object)tpNfe[i]);
                break;
            }
        } else {
            this.e.setSelectedItem(null);
        }
        if (!StringHelper.isBlankOrNull((Object)ide.getCMunFG())) {
            String codigoEstado = ide.getCMunFG().substring(0, 2);
            EstadoTO estadoTO = DSENUtilHelper.getInstance().getEstadoTO(codigoEstado);
            this.f.setSelectedItem((Object)estadoTO);
            try {
                this.a.setSelectedItem((Object)DSENUtilHelper.getInstance().getMunicipioTO(ide.getCMunFG()));
            }
            catch (NumberFormatException len$) {
            }
            catch (DSGEUtilException ex) {
                this.showErrors((DSGEBaseException)ex);
            }
        }
        this.a(ide.getNFrefArray());
        this.b(ide.getNFrefArray());
        this.c(ide.getNFrefArray());
        TNFe.InfNFe.Total total = nfe.getNFe().getInfNFe().getTotal();
        if (total != null && (icmsTot = total.getICMSTot()) != null) {
            NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
            try {
                this.n.setText(!StringHelper.isBlankOrNull((Object)icmsTot.getVNF()) ? formatter1302.valueToString(new BigDecimal(icmsTot.getVNF())) : null);
                this.l.setText(!StringHelper.isBlankOrNull((Object)icmsTot.getVICMS()) ? formatter1302.valueToString(new BigDecimal(icmsTot.getVICMS())) : null);
                this.m.setText(!StringHelper.isBlankOrNull((Object)icmsTot.getVST()) ? formatter1302.valueToString(new BigDecimal(icmsTot.getVST())) : null);
            }
            catch (ParseException i$) {
                // empty catch block
            }
        }
        String dataContingencia = ide.getDhCont() != null ? DateHelper.formataDataHora((Date)DateHelper.getDateTime((String)ide.getDhCont(), (SimpleDateFormat)DateHelper.DATE_TIME_XML_FORMAT310), (SimpleDateFormat)DateHelper.DATE_HOUR_MINUTE_FORMAT) : null;
        String justificativaConting = ide.getXJust();
        this.updateDadosContingencia(dataContingencia, justificativaConting);
    }

    private void a(TNFe.InfNFe.Ide.NFref[] notas) {
        this.c.removeAllTO();
        int j = 0;
        if (notas != null) {
            for (int i = 0; i < notas.length; ++i) {
                RefNFTO refNFTO = this.a(notas[i]);
                if (refNFTO == null) continue;
                refNFTO.setNItem(String.valueOf(j + 1));
                this.c.addTO((BaseTO)refNFTO);
                ++j;
            }
        }
    }

    private String a(String aamm) {
        if (!StringHelper.isBlankOrNull((Object)aamm)) {
            String ano = "";
            String mes = "";
            if (aamm.length() >= 2) {
                ano = aamm.substring(0, 2);
            }
            if (aamm.length() > 2) {
                mes = aamm.substring(2, aamm.length());
            }
            return mes + "/" + ano;
        }
        return aamm;
    }

    private String b(String mmaa) {
        if (!StringHelper.isBlankOrNull((Object)mmaa)) {
            String ano = "";
            String mes = "";
            if (mmaa.length() >= 2) {
                mes = mmaa.substring(0, 2);
            }
            if (mmaa.length() > 3) {
                ano = mmaa.substring(3, mmaa.length());
            }
            return ano + mes;
        }
        return mmaa;
    }

    private RefNFTO a(TNFe.InfNFe.Ide.NFref notaRef) {
        RefNFTO refNFTO = null;
        if (notaRef.getRefNF() != null) {
            refNFTO = new RefNFTO();
            refNFTO.setMMAA(this.a(notaRef.getRefNF().getAAMM()));
            refNFTO.setCNPJ(notaRef.getRefNF().getCNPJ());
            refNFTO.setCUF(notaRef.getRefNF().getCUF() != null ? notaRef.getRefNF().getCUF().toString() : null);
            refNFTO.setMod(notaRef.getRefNF().getMod() != null ? notaRef.getRefNF().getMod().toString() : null);
            refNFTO.setNNF(notaRef.getRefNF().getNNF());
            refNFTO.setSerie(notaRef.getRefNF().getSerie());
            refNFTO.setTipoRefNF(RefNFTO.TIPO_NFPAPEL);
        } else if (notaRef.getRefNFe() != null) {
            refNFTO = new RefNFTO();
            refNFTO.setChave(notaRef.getRefNFe());
            refNFTO.setTipoRefNF(RefNFTO.TIPO_NFE);
        } else if (notaRef.getRefCTe() != null) {
            refNFTO = new RefNFTO();
            refNFTO.setChave(notaRef.getRefCTe());
            refNFTO.setTipoRefNF(RefNFTO.TIPO_CTE);
        }
        return refNFTO;
    }

    private void b(TNFe.InfNFe.Ide.NFref[] notas) {
        this.d.removeAllTO();
        int j = 0;
        if (notas != null) {
            for (int i = 0; i < notas.length; ++i) {
                RefNFPTO refNPTO = this.a(notas[i]);
                if (refNPTO == null) continue;
                refNPTO.setNItem(String.valueOf(j + 1));
                this.d.addTO((BaseTO)refNPTO);
                ++j;
            }
        }
    }

    private RefNFPTO a(TNFe.InfNFe.Ide.NFref notaRef) {
        RefNFPTO refNPTO = null;
        if (notaRef.getRefNFP() != null) {
            refNPTO = new RefNFPTO();
            refNPTO.setMMAA(this.a(notaRef.getRefNFP().getAAMM()));
            refNPTO.setCUF(notaRef.getRefNFP().getCUF() != null ? notaRef.getRefNFP().getCUF().toString() : null);
            refNPTO.setIE(notaRef.getRefNFP().getIE());
            refNPTO.setSerie(notaRef.getRefNFP().getSerie());
            refNPTO.setNNF(notaRef.getRefNFP().getNNF());
            refNPTO.setMod(notaRef.getRefNFP().getMod() != null ? notaRef.getRefNFP().getMod().toString() : null);
            if (!StringHelper.isBlankOrNull((Object)notaRef.getRefNFP().getCPF())) {
                refNPTO.setCPF(notaRef.getRefNFP().getCPF());
            } else if (!StringHelper.isBlankOrNull((Object)notaRef.getRefNFP().getCNPJ())) {
                refNPTO.setCNPJ(notaRef.getRefNFP().getCNPJ());
            }
        }
        return refNPTO;
    }

    private void c(TNFe.InfNFe.Ide.NFref[] notas) {
        this.e.removeAllTO();
        int j = 0;
        if (notas != null) {
            for (int i = 0; i < notas.length; ++i) {
                RefECFTO refECFTO = this.a(notas[i]);
                if (refECFTO == null) continue;
                refECFTO.setNItem(String.valueOf(j + 1));
                this.e.addTO((BaseTO)refECFTO);
                ++j;
            }
        }
    }

    private RefECFTO a(TNFe.InfNFe.Ide.NFref notaRef) {
        RefECFTO refECFTO = null;
        if (notaRef.getRefECF() != null) {
            refECFTO = new RefECFTO();
            refECFTO.setNECF(notaRef.getRefECF().getNECF());
            refECFTO.setNCOO(notaRef.getRefECF().getNCOO());
            refECFTO.setMod(notaRef.getRefECF().getMod() != null ? notaRef.getRefECF().getMod().toString() : null);
        }
        return refECFTO;
    }

    private void b(NFeDocument nfe) {
        TNFe.InfNFe.Emit emit = nfe.getNFe().getInfNFe().getEmit();
        if (emit != null) {
            this.w.setText(!StringHelper.isBlankOrNull((Object)emit.getCNPJ()) ? StringHelper.cnpjFormat((String)emit.getCNPJ()) : null);
            this.p.setText(emit.getXNome());
            this.n.setText(emit.getXFant());
            this.x.setText(emit.getIE());
            this.y.setText(emit.getIEST());
            this.z.setText(emit.getIM());
            this.v.setText(emit.getCNAE());
            RegimeTributarioEnum regimeTribEnum = emit.getCRT() != null ? RegimeTributarioEnum.getEnumPeloCodigo((String)emit.getCRT().toString()) : null;
            this.r.setSelectedItem((Object)regimeTribEnum);
            if (emit.getEnderEmit() != null) {
                this.o.setText(emit.getEnderEmit().getXLgr());
                this.k.setText(emit.getEnderEmit().getNro());
                this.m.setText(emit.getEnderEmit().getXCpl());
                this.l.setText(emit.getEnderEmit().getXBairro());
                this.u.setText(emit.getEnderEmit().getCEP() != null ? StringHelper.formataCEP((String)emit.getEnderEmit().getCEP()) : null);
                this.S.setText(emit.getEnderEmit().getFone());
                try {
                    Object cpaisEnum = null;
                    try {
                        cpaisEnum = emit.getEnderEmit().getCPais();
                        if (cpaisEnum == null) {
                            cpaisEnum = this.a.getEmitenteTO().getCPais().toString();
                        }
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    PaisTO paisTO = DSENUtilHelper.getInstance().getPaisTO(cpaisEnum != null ? cpaisEnum.toString() : null);
                    EstadoTO estadoTO = emit.getEnderEmit().getUF() != null ? DSENUtilHelper.getInstance().getSiglaEstadoTO(emit.getEnderEmit().getUF().toString()) : null;
                    MunicipioTO municipioTO = DSENUtilHelper.getInstance().getMunicipioTO(emit.getEnderEmit().getCMun());
                    this.m.setSelectedItem((Object)paisTO);
                    this.n.setSelectedItem((Object)estadoTO);
                    this.l.setSelectedItem((Object)municipioTO);
                }
                catch (DSGEUtilException ex) {
                    this.showErrors((DSGEBaseException)ex);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(String ie) {
        ItemListener[] listeners = this.d.getItemListeners();
        if (listeners != null) {
            for (ItemListener listener : listeners) {
                this.d.removeItemListener(listener);
            }
        }
        try {
            if (DSENConstants.ISENTO.equals(ie)) {
                this.d.setSelected(true);
                this.J.setEnabled(false);
                this.J.setText("");
            } else {
                this.J.setText(ie);
                this.d.setSelected(false);
                if (this.K.isEnabled()) {
                    this.J.setEnabled(true);
                }
            }
        }
        catch (Throwable throwable) {
            this.d.addItemListener((ItemListener)new /* Unavailable Anonymous Inner Class!! */);
            throw throwable;
        }
        this.d.addItemListener((ItemListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void c(NFeDocument nfe) throws DSGEUtilException {
        this.k.setSelectedIndex(-1);
        this.itemStateChanged(new ItemEvent(this.h, -1, null, 1));
        this.b.uninstall();
        this.a.uninstall();
        this.a.uninstall();
        TNFe.InfNFe.Dest dest = nfe.getNFe().getInfNFe().getDest();
        if (dest != null) {
            if (dest.getEnderDest() != null && dest.getEnderDest().getCPais() != null && !DSGEConstants.BRASIL.equals(dest.getEnderDest().getCPais().toString())) {
                this.h.setSelectedItem((Object)TipoDocumentoDestEnum.ESTRANGEIRO);
                this.t.setText(dest.getIdEstrangeiro());
            } else if (dest.getCPF() != null) {
                this.h.setSelectedItem((Object)TipoDocumentoDestEnum.CPF);
                this.t.setText(StringHelper.cpfFormat((String)dest.getCPF()));
            } else if (dest.getCNPJ() != null) {
                this.h.setSelectedItem((Object)TipoDocumentoDestEnum.CNPJ);
                this.t.setText(StringHelper.cnpjFormat((String)dest.getCNPJ()));
            } else if (dest.getIdEstrangeiro() != null) {
                this.h.setSelectedItem((Object)TipoDocumentoDestEnum.ESTRANGEIRO);
                this.t.setText(dest.getIdEstrangeiro());
            } else {
                this.h.setSelectedIndex(-1);
                this.t.setText("");
            }
            this.j.setText(dest.getXNome());
            this.e.setText(dest.getEmail());
            this.s.setText(dest.getISUF());
            this.r.setText(dest.getIM());
            if (dest.getEnderDest() != null) {
                this.i.setText(dest.getEnderDest().getXLgr());
                this.f.setText(dest.getEnderDest().getNro());
                this.h.setText(dest.getEnderDest().getXCpl());
                this.g.setText(dest.getEnderDest().getXBairro());
                this.p.setText(dest.getEnderDest().getCEP() != null ? StringHelper.formataCEP((String)dest.getEnderDest().getCEP()) : null);
                try {
                    this.k.setSelectedItem((Object)DSENUtilHelper.getInstance().getPaisTO(dest.getEnderDest().getCPais() != null ? dest.getEnderDest().getCPais().toString() : null));
                }
                catch (NumberFormatException numberFormatException) {
                }
                catch (DSGEUtilException ex2) {
                    this.showErrors((DSGEBaseException)ex2);
                }
                if (dest.getEnderDest().getUF() != null) {
                    this.i.setSelectedItem((Object)DSENUtilHelper.getInstance().getSiglaEstadoTO(dest.getEnderDest().getUF().toString()));
                }
                try {
                    this.j.setSelectedItem((Object)DSENUtilHelper.getInstance().getMunicipioTO(dest.getEnderDest().getCMun()));
                }
                catch (NumberFormatException ex2) {
                }
                catch (DSGEUtilException ex) {
                    this.showErrors((DSGEBaseException)ex);
                }
                this.R.setText(dest.getEnderDest().getFone());
            }
            if (nfe.getNFe().getInfNFe().getEntrega() != null) {
                this.a.doClick(2);
                this.a.setSelected(true);
                this.enableComponents("manterNotaDestEntrega");
                this.a = nfe.getNFe().getInfNFe().getEntrega();
            } else {
                this.a.setSelected(false);
            }
            if (nfe.getNFe().getInfNFe().getRetirada() != null) {
                this.b.doClick(2);
                this.b.setSelected(true);
                this.enableComponents("manterNotaDestRetirada");
                this.b = nfe.getNFe().getInfNFe().getRetirada();
            } else {
                this.b.setSelected(false);
            }
            if (dest.getIndIEDest() != null) {
                if (dest.getIndIEDest() == TNFe.InfNFe.Dest.IndIEDest.X_1) {
                    this.g.setSelectedItem((Object)IndIEDestEnum.CONTRIB_ICMS);
                    this.q.setText(dest.getIE());
                } else if (dest.getIndIEDest() == TNFe.InfNFe.Dest.IndIEDest.X_2) {
                    this.g.setSelectedItem((Object)IndIEDestEnum.CONTRIB_ISENTO);
                    this.q.setText("");
                    this.q.setEnabled(false);
                } else if (dest.getIndIEDest() == TNFe.InfNFe.Dest.IndIEDest.X_9) {
                    this.g.setSelectedItem((Object)IndIEDestEnum.NAO_CONBRIB);
                    this.q.setText("");
                    this.q.setEnabled(false);
                }
            }
        }
    }

    private void d(NFeDocument nfe) {
        TNFe.InfNFe.Total total = nfe.getNFe().getInfNFe().getTotal();
        if (nfe.getNFe().getInfNFe().getTotal() != null) {
            NumberFormatter formatter1302;
            block11 : {
                formatter1302 = NumberFormatterHelper.getFormatter1302();
                if (total.getICMSTot() != null) {
                    TNFe.InfNFe.Total.ICMSTot icms = total.getICMSTot();
                    try {
                        this.w.setText(!StringHelper.isBlankOrNull((Object)icms.getVBC()) ? formatter1302.valueToString(new BigDecimal(icms.getVBC())) : null);
                        this.F.setText(!StringHelper.isBlankOrNull((Object)icms.getVICMS()) ? formatter1302.valueToString(new BigDecimal(icms.getVICMS())) : null);
                        this.A.setText(!StringHelper.isBlankOrNull((Object)icms.getVBCST()) ? formatter1302.valueToString(new BigDecimal(icms.getVBCST())) : null);
                        this.U.setText(!StringHelper.isBlankOrNull((Object)icms.getVST()) ? formatter1302.valueToString(new BigDecimal(icms.getVST())) : null);
                        this.O.setText(!StringHelper.isBlankOrNull((Object)icms.getVProd()) ? formatter1302.valueToString(new BigDecimal(icms.getVProd())) : null);
                        this.E.setText(!StringHelper.isBlankOrNull((Object)icms.getVFrete()) ? formatter1302.valueToString(new BigDecimal(icms.getVFrete())) : null);
                        this.V.setText(!StringHelper.isBlankOrNull((Object)icms.getVSeg()) ? formatter1302.valueToString(new BigDecimal(icms.getVSeg())) : null);
                        this.D.setText(!StringHelper.isBlankOrNull((Object)icms.getVDesc()) ? formatter1302.valueToString(new BigDecimal(icms.getVDesc())) : null);
                        this.H.setText(!StringHelper.isBlankOrNull((Object)icms.getVII()) ? formatter1302.valueToString(new BigDecimal(icms.getVII())) : null);
                        this.I.setText(!StringHelper.isBlankOrNull((Object)icms.getVIPI()) ? formatter1302.valueToString(new BigDecimal(icms.getVIPI())) : null);
                        this.M.setText(!StringHelper.isBlankOrNull((Object)icms.getVPIS()) ? formatter1302.valueToString(new BigDecimal(icms.getVPIS())) : null);
                        this.B.setText(!StringHelper.isBlankOrNull((Object)icms.getVCOFINS()) ? formatter1302.valueToString(new BigDecimal(icms.getVCOFINS())) : null);
                        this.L.setText(!StringHelper.isBlankOrNull((Object)icms.getVOutro()) ? formatter1302.valueToString(new BigDecimal(icms.getVOutro())) : null);
                        this.K.setText(!StringHelper.isBlankOrNull((Object)icms.getVNF()) ? formatter1302.valueToString(new BigDecimal(icms.getVNF())) : null);
                        this.a.setText(!StringHelper.isBlankOrNull((Object)icms.getVTotTrib()) ? formatter1302.valueToString(new BigDecimal(icms.getVTotTrib())) : null);
                        this.G.setText(!StringHelper.isBlankOrNull((Object)icms.getVICMSDeson()) ? formatter1302.valueToString(new BigDecimal(icms.getVICMSDeson())) : null);
                    }
                    catch (ParseException parseException) {
                        // empty catch block
                    }
                }
                if (total.getISSQNtot() != null) {
                    TNFe.InfNFe.Total.ISSQNtot issqn = total.getISSQNtot();
                    try {
                        this.W.setText(!StringHelper.isBlankOrNull((Object)issqn.getVServ()) ? formatter1302.valueToString(new BigDecimal(issqn.getVServ())) : null);
                        this.y.setText(!StringHelper.isBlankOrNull((Object)issqn.getVBC()) ? formatter1302.valueToString(new BigDecimal(issqn.getVBC())) : null);
                        this.J.setText(!StringHelper.isBlankOrNull((Object)issqn.getVISS()) ? formatter1302.valueToString(new BigDecimal(issqn.getVISS())) : null);
                        this.N.setText(!StringHelper.isBlankOrNull((Object)issqn.getVPIS()) ? formatter1302.valueToString(new BigDecimal(issqn.getVPIS())) : null);
                        this.C.setText(!StringHelper.isBlankOrNull((Object)issqn.getVCOFINS()) ? formatter1302.valueToString(new BigDecimal(issqn.getVCOFINS())) : null);
                        this.I.setText(issqn.getDCompet() != null ? DateHelper.formataData((Date)DateHelper.getDate((String)issqn.getDCompet(), (SimpleDateFormat)DateHelper.DATE_XML_FORMAT)) : null);
                        this.A.setText(!StringHelper.isBlankOrNull((Object)issqn.getVDeducao()) ? formatter1302.valueToString(new BigDecimal(issqn.getVDeducao())) : null);
                        this.E.setText(!StringHelper.isBlankOrNull((Object)issqn.getVOutro()) ? formatter1302.valueToString(new BigDecimal(issqn.getVOutro())) : null);
                        this.C.setText(!StringHelper.isBlankOrNull((Object)issqn.getVDescIncond()) ? formatter1302.valueToString(new BigDecimal(issqn.getVDescIncond())) : null);
                        this.B.setText(!StringHelper.isBlankOrNull((Object)issqn.getVDescCond()) ? formatter1302.valueToString(new BigDecimal(issqn.getVDescCond())) : null);
                        this.D.setText(!StringHelper.isBlankOrNull((Object)issqn.getVISSRet()) ? formatter1302.valueToString(new BigDecimal(issqn.getVISSRet())) : null);
                        if (issqn.getCRegTrib() == null) break block11;
                        RegimeEspecialTributarioEnum[] regTrib = RegimeEspecialTributarioEnum.values();
                        for (int i = 0; i < regTrib.length; ++i) {
                            if (!regTrib[i].getCodigo().equals(issqn.getCRegTrib().toString())) continue;
                            this.s.setSelectedItem((Object)regTrib[i]);
                            break;
                        }
                    }
                    catch (ParseException regTrib) {
                        // empty catch block
                    }
                }
            }
            if (total.getRetTrib() != null) {
                TNFe.InfNFe.Total.RetTrib ret = total.getRetTrib();
                try {
                    this.R.setText(!StringHelper.isBlankOrNull((Object)ret.getVRetPIS()) ? formatter1302.valueToString(new BigDecimal(ret.getVRetPIS())) : null);
                    this.P.setText(!StringHelper.isBlankOrNull((Object)ret.getVRetCOFINS()) ? formatter1302.valueToString(new BigDecimal(ret.getVRetCOFINS())) : null);
                    this.Q.setText(!StringHelper.isBlankOrNull((Object)ret.getVRetCSLL()) ? formatter1302.valueToString(new BigDecimal(ret.getVRetCSLL())) : null);
                    this.x.setText(!StringHelper.isBlankOrNull((Object)ret.getVBCIRRF()) ? formatter1302.valueToString(new BigDecimal(ret.getVBCIRRF())) : null);
                    this.T.setText(!StringHelper.isBlankOrNull((Object)ret.getVIRRF()) ? formatter1302.valueToString(new BigDecimal(ret.getVIRRF())) : null);
                    this.z.setText(!StringHelper.isBlankOrNull((Object)ret.getVBCRetPrev()) ? formatter1302.valueToString(new BigDecimal(ret.getVBCRetPrev())) : null);
                    this.S.setText(!StringHelper.isBlankOrNull((Object)ret.getVRetPrev()) ? formatter1302.valueToString(new BigDecimal(ret.getVRetPrev())) : null);
                }
                catch (ParseException regTrib) {
                    // empty catch block
                }
            }
        }
    }

    private void e(NFeDocument nfe) throws DSGEUtilException {
        String frete;
        this.A.setSelectedIndex(0);
        this.z.setSelectedIndex(0);
        this.itemStateChanged(new ItemEvent(this.z, -1, null, 1));
        this.c.uninstall();
        this.b.uninstall();
        this.x();
        TNFe.InfNFe.Transp transp = nfe.getNFe().getInfNFe().getTransp();
        if (transp != null) {
            if (transp.getModFrete() != null) {
                ModalidadeFreteEnum[] modFrete = ModalidadeFreteEnum.values();
                for (int i = 0; i < modFrete.length; ++i) {
                    if (!modFrete[i].getCodigo().equals(transp.getModFrete().toString())) continue;
                    this.y.setSelectedItem((Object)modFrete[i]);
                    break;
                }
            }
            TNFe.InfNFe.Transp.Transporta transporta = transp.getTransporta();
            TNFe.InfNFe.Transp.RetTransp retTransp = transp.getRetTransp();
            TVeiculo veicTransp = transp.getVeicTransp();
            TVeiculo[] reboque = transp.getReboqueArray();
            TNFe.InfNFe.Transp.Vol[] vol = transp.getVolArray();
            if (transporta != null) {
                if (!StringHelper.isBlankOrNull((Object)transporta.getUF())) {
                    try {
                        EstadoTO estadoTO = DSENUtilHelper.getInstance().getSiglaEstadoTO(transporta.getUF().toString());
                        this.A.setSelectedItem((Object)estadoTO);
                        this.C.setSelectedItem((Object)DSENUtilHelper.getInstance().getMunicipioTO(estadoTO, transporta.getXMun()));
                    }
                    catch (DSGEUtilException ex) {
                        this.showErrors((DSGEBaseException)ex);
                    }
                }
                if (!StringHelper.isBlankOrNull((Object)transporta.getCNPJ())) {
                    this.z.setSelectedItem((Object)TipoDocumentoEnum.CNPJ);
                    this.c.install(this.K);
                    this.K.setText(StringHelper.cnpjFormat((String)transporta.getCNPJ()));
                } else if (!StringHelper.isBlankOrNull((Object)transporta.getCPF())) {
                    this.z.setSelectedItem((Object)TipoDocumentoEnum.CPF);
                    this.b.install(this.K);
                    this.K.setText(StringHelper.cpfFormat((String)transporta.getCPF()));
                } else {
                    this.K.setEnabled(false);
                }
                this.Z.setText(transporta.getXNome());
                this.Y.setText(transporta.getXEnder());
                this.a(transporta.getIE());
            }
            NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
            NumberFormatter formatter0302 = NumberFormatterHelper.getFormatter0302();
            if (retTransp != null) {
                try {
                    this.O.setText(!StringHelper.isBlankOrNull((Object)retTransp.getVServ()) ? formatter1302.valueToString(new BigDecimal(retTransp.getVServ())) : null);
                    this.M.setText(!StringHelper.isBlankOrNull((Object)retTransp.getVBCRet()) ? formatter1302.valueToString(new BigDecimal(retTransp.getVBCRet())) : null);
                    this.N.setText(!StringHelper.isBlankOrNull((Object)retTransp.getVICMSRet()) ? formatter1302.valueToString(new BigDecimal(retTransp.getVICMSRet())) : null);
                    this.L.setText(!StringHelper.isBlankOrNull((Object)retTransp.getPICMSRet()) ? formatter0302.valueToString(new BigDecimal(retTransp.getPICMSRet())) : null);
                }
                catch (ParseException parseException) {
                    // empty catch block
                }
                this.a(retTransp);
                if (!StringHelper.isBlankOrNull((Object)retTransp.getCMunFG())) {
                    String codigoEstado = retTransp.getCMunFG().substring(0, 2);
                    this.x.setSelectedItem((Object)DSENUtilHelper.getInstance().getEstadoTO(codigoEstado));
                    try {
                        this.w.setSelectedItem((Object)DSENUtilHelper.getInstance().getMunicipioTO(retTransp.getCMunFG()));
                    }
                    catch (DSGEUtilException ex) {
                        this.showErrors((DSGEBaseException)ex);
                    }
                }
            }
            if (veicTransp != null || reboque != null && reboque.length > 0) {
                this.c.setSelected(true);
                if (veicTransp != null) {
                    EstadoTO estadoTO = null;
                    if (veicTransp.getUF() != null) {
                        estadoTO = DSENUtilHelper.getInstance().getSiglaEstadoTO(veicTransp.getUF().toString());
                    }
                    this.P.setText(veicTransp.getPlaca());
                    this.X.setText(veicTransp.getRNTC());
                    this.B.setSelectedItem((Object)estadoTO);
                }
                if (reboque != null) {
                    for (int i = 0; i < reboque.length; ++i) {
                        ReboqueTO reboqueTO = new ReboqueTO();
                        reboqueTO.setPlaca(reboque[i].getPlaca());
                        reboqueTO.setRNTC(reboque[i].getRNTC());
                        reboqueTO.setUF(reboque[i].getUF() != null ? reboque[i].getUF().toString() : null);
                        reboqueTO.setNItem(String.valueOf(i + 1));
                        this.i.addTO((BaseTO)reboqueTO);
                    }
                }
            } else if (!StringHelper.isBlankOrNull((Object)transp.getBalsa())) {
                this.a.setSelected(true);
                this.a.setText(transp.getBalsa());
            } else if (!StringHelper.isBlankOrNull((Object)transp.getVagao())) {
                this.b.setSelected(true);
                this.Q.setText(transp.getVagao());
            }
            this.j.removeAllTO();
            if (vol != null) {
                for (int i = 0; i < vol.length; ++i) {
                    VolumeTO volumeTO = new VolumeTO();
                    volumeTO.setValues(vol[i]);
                    volumeTO.setNItem(String.valueOf(i + 1));
                    this.j.addTO((BaseTO)volumeTO);
                }
            }
        }
        if (transp != null && transp.getModFrete() != null && (frete = transp.getModFrete().toString()).equals("9") && (this.getOperacao().equals("manterNotaOperacaoEdicao") || this.getOperacao().equals("manterNotaOperacaoDetalhe"))) {
            this.disableComponents("MANTER_NOTA_TRANS_TODOS_CAMPOS");
        }
        this.verificarSelecionadosTabela(this.getSelectedVolumeTOs(), DSENLabelConstants.VOLUME);
        this.verificarSelecionadosTabela(this.getSelectedReboqueTOs(), DSENLabelConstants.REBOQUE);
    }

    private void a(TNFe.InfNFe.Transp.RetTransp retTransp) throws DSGEUtilException {
        String cfopStr = DocumentoUtil.getCFOP((TNFe.InfNFe.Transp.RetTransp)retTransp, (boolean)false);
        this.v.setVisible(true);
        this.bd.setText("CFOP");
        this.bd.setForeground(Color.BLACK);
        if (cfopStr != null) {
            CfopTO cfop = DSENUtilHelper.getInstance().getCfopTranspTO(cfopStr);
            if (cfop != null) {
                this.v.setSelectedItem((Object)cfop);
            } else {
                this.v.setSelectedIndex(-1);
            }
        } else {
            cfopStr = DocumentoUtil.getCFOP((TNFe.InfNFe.Transp.RetTransp)retTransp, (boolean)true);
            if (cfopStr != null && "manterNotaOperacaoDetalhe".equals(this.getOperacao())) {
                this.v.setVisible(false);
                this.bd.setText("CFOP " + cfopStr + " inexistente");
                this.bd.setForeground(Color.RED);
            } else {
                this.v.setSelectedIndex(-1);
            }
        }
    }

    private void f(NFeDocument nfe) {
        this.f.removeAllTO();
        if (nfe.getNFe().getInfNFe().getDetArray() != null) {
            TNFe.InfNFe.Det[] det = nfe.getNFe().getInfNFe().getDetArray();
            ArrayList<ProdutoNotaTO> prodList = new ArrayList<ProdutoNotaTO>();
            for (int i = 0; i < det.length; ++i) {
                ProdutoNotaTO produtoNotaTO = new ProdutoNotaTO();
                produtoNotaTO.setDetalheProduto(det[i]);
                if (det[i].getProd().getArmaArray() != null && det[i].getProd().getArmaArray().length > 0) {
                    produtoNotaTO.setProdutoEspecifico(ProdutoEspecificoEnum.ARMAMENTO);
                } else if (det[i].getProd().getMedArray() != null && det[i].getProd().getMedArray().length > 0) {
                    produtoNotaTO.setProdutoEspecifico(ProdutoEspecificoEnum.MEDICAMENTO);
                } else if (det[i].getProd().getComb() != null) {
                    produtoNotaTO.setProdutoEspecifico(ProdutoEspecificoEnum.COMBUSTIVEL);
                } else if (det[i].getProd().getVeicProd() != null) {
                    produtoNotaTO.setProdutoEspecifico(ProdutoEspecificoEnum.VEICULO);
                } else if (det[i].getProd().getNRECOPI() != null) {
                    produtoNotaTO.setProdutoEspecifico(ProdutoEspecificoEnum.PAPEL_IMUNE);
                }
                prodList.add(produtoNotaTO);
            }
            this.f.addTO(prodList);
        }
    }

    private void g(NFeDocument nfe) {
        this.g.removeAllTO();
        if (nfe.getNFe().getInfNFe().getAutXMLArray() != null) {
            TNFe.InfNFe.AutXML[] aut = nfe.getNFe().getInfNFe().getAutXMLArray();
            ArrayList<AutorizacaoTO> autList = new ArrayList<AutorizacaoTO>();
            for (int i = 0; i < aut.length; ++i) {
                AutorizacaoTO autTO = new AutorizacaoTO();
                if (aut[i].isSetCNPJ()) {
                    autTO.setCNPJ(aut[i].getCNPJ());
                }
                if (aut[i].isSetCPF()) {
                    autTO.setCPF(aut[i].getCPF());
                }
                autTO.setNItem(new Integer(i + 1).toString());
                autList.add(autTO);
            }
            this.g.addTO(autList);
        }
    }

    private void h(NFeDocument nfe) {
        TNFe.InfNFe.InfAdic info = nfe.getNFe().getInfNFe().getInfAdic();
        this.l.removeAllTO();
        this.m.removeAllTO();
        this.n.removeAllTO();
        if (info != null) {
            int i;
            ObservacaoNotaTO obsTO;
            this.d.setText(info.getInfAdFisco());
            this.e.setText(info.getInfCpl());
            if (info.getObsContArray() != null) {
                for (i = 0; i < info.getObsContArray().length; ++i) {
                    obsTO = new ObservacaoNotaTO();
                    obsTO.setXCampo(info.getObsContArray()[i].getXCampo());
                    obsTO.setXTexto(info.getObsContArray()[i].getXTexto());
                    obsTO.setNItem(String.valueOf(i + 1));
                    this.l.addTO((BaseTO)obsTO);
                }
            }
            if (info.getObsFiscoArray() != null) {
                for (i = 0; i < info.getObsFiscoArray().length; ++i) {
                    obsTO = new ObservacaoNotaTO();
                    obsTO.setXCampo(info.getObsFiscoArray()[i].getXCampo());
                    obsTO.setXTexto(info.getObsFiscoArray()[i].getXTexto());
                    obsTO.setNItem(String.valueOf(i + 1));
                    this.m.addTO((BaseTO)obsTO);
                }
            }
            if (info.getProcRefArray() != null) {
                for (i = 0; i < info.getProcRefArray().length; ++i) {
                    ProcessoReferenciadoNotaTO procTO = new ProcessoReferenciadoNotaTO();
                    procTO.setIndProc(info.getProcRefArray()[i].getIndProc() != null ? info.getProcRefArray()[i].getIndProc().toString() : null);
                    procTO.setNProc(info.getProcRefArray()[i].getNProc());
                    procTO.setNItem(String.valueOf(i + 1));
                    this.n.addTO((BaseTO)procTO);
                }
            }
        }
        this.verificarSelecionadosTabela(this.getSelectedObservacaoContribuinteTOs(), DSENLabelConstants.OBSERVACAO_CONTRIBUINTE);
        this.verificarSelecionadosTabela(this.getSelectedObservacaoFiscoTOs(), DSENLabelConstants.OBSERVACAO_FISCO);
        this.verificarSelecionadosTabela(this.getSelectedProcessoReferenciadoTOs(), DSENLabelConstants.PROCESSO_REFERENCIADO);
    }

    private void i(NFeDocument nfe) throws DSGEUtilException {
        TNFe.InfNFe.Exporta exporta = nfe.getNFe().getInfNFe().getExporta();
        TNFe.InfNFe.Compra compra = nfe.getNFe().getInfNFe().getCompra();
        if (exporta != null) {
            EstadoTO estadoTO = exporta.getUFSaidaPais() != null ? DSENUtilHelper.getInstance().getSiglaEstadoTO(exporta.getUFSaidaPais().toString()) : null;
            this.s.setText(exporta.getXLocExporta());
            this.q.setSelectedItem((Object)estadoTO);
            if (exporta.getXLocDespacho() != null) {
                this.r.setText(exporta.getXLocDespacho());
            }
        }
        if (compra != null) {
            this.t.setText(compra.getXNEmp());
            this.u.setText(compra.getXPed());
            this.q.setText(compra.getXCont());
        }
    }

    private void j(NFeDocument nfe) {
        this.k.removeAllTO();
        TNFe.InfNFe.Cobr cobranca = nfe.getNFe().getInfNFe().getCobr();
        if (cobranca != null) {
            TNFe.InfNFe.Cobr.Dup[] dup;
            TNFe.InfNFe.Cobr.Fat fatura = cobranca.getFat();
            NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
            if (fatura != null) {
                this.b.setText(fatura.getNFat());
                try {
                    this.e.setText(!StringHelper.isBlankOrNull((Object)fatura.getVOrig()) ? formatter1302.valueToString(new BigDecimal(fatura.getVOrig())) : null);
                    this.c.setText(!StringHelper.isBlankOrNull((Object)fatura.getVDesc()) ? formatter1302.valueToString(new BigDecimal(fatura.getVDesc())) : null);
                    this.d.setText(!StringHelper.isBlankOrNull((Object)fatura.getVLiq()) ? formatter1302.valueToString(new BigDecimal(fatura.getVLiq())) : null);
                }
                catch (ParseException parseException) {
                    // empty catch block
                }
            }
            if ((dup = cobranca.getDupArray()) != null) {
                for (int i = 0; i < dup.length; ++i) {
                    DuplicataTO duplicataTO = new DuplicataTO();
                    if (dup[i].getDVenc() != null) {
                        GregorianCalendar gcAux = new GregorianCalendar();
                        gcAux.setTime(DateHelper.getDate((String)dup[i].getDVenc(), (SimpleDateFormat)DateHelper.DATE_XML_FORMAT));
                        duplicataTO.setDVenc((Calendar)gcAux);
                    } else {
                        duplicataTO.setDVenc(null);
                    }
                    duplicataTO.setNDup(dup[i].getNDup());
                    duplicataTO.setVDup(dup[i].getVDup());
                    duplicataTO.setNItem(String.valueOf(i + 1));
                    this.k.addTO((BaseTO)duplicataTO);
                }
            }
        }
        this.verificarSelecionadosTabela(this.getSelectedDuplicataTOs(), DSENLabelConstants.DUPLICATA);
    }

    private void k(NFeDocument nfe) {
        X509Certificate cert = null;
        SignatureType sType = nfe.getNFe().getSignature();
        if (sType != null) {
            byte[] certificado = sType.getKeyInfo().getX509Data().getX509Certificate();
            try {
                cert = CertificadoHelper.getX509((byte[])certificado);
            }
            catch (DSGECertificadoInvalidoException dSGECertificadoInvalidoException) {
                // empty catch block
            }
        }
        if (cert != null) {
            this.setTabEnabled(10, true);
            this.c.setText(CertificadoHelper.getEmissor((X509Certificate)cert));
            try {
                this.b.setText(new DocumentoFormatter().valueToString((Object)CertificadoHelper.recuperarCNPJ((X509Certificate)cert)));
            }
            catch (Exception certificado) {
                // empty catch block
            }
            this.G.setText(DateHelper.formataDataHora((Date)CertificadoHelper.getDataValidadeFim((X509Certificate)cert), (SimpleDateFormat)DateHelper.DATE_TIME_FORMAT));
            this.H.setText(DateHelper.formataDataHora((Date)CertificadoHelper.getDataValidadeInicio((X509Certificate)cert), (SimpleDateFormat)DateHelper.DATE_TIME_FORMAT));
            this.a.setText(CertificadoHelper.getAssunto((X509Certificate)cert));
        } else {
            this.setTabEnabled(10, false);
            this.c.setText(null);
            this.b.setText(null);
            this.G.setText(null);
            this.H.setText(null);
            this.a.setText(null);
        }
    }

    public void setTabEnabled(int tab, boolean enabled) {
        this.d.setEnabledAt(tab, enabled);
    }

    private void a(NotaFiscalTO notaFiscalTO, NFeDocument nfe) throws ParseException {
        TNFe.InfNFe.Ide ide = nfe.getNFe().getInfNFe().getIde();
        if (ide == null) {
            ide = nfe.getNFe().getInfNFe().addNewIde();
        }
        nfe.getNFe().getInfNFe().setVersao(DSENProperties.getInstance().getVersaoSchema());
        FormaPagamentoEnum formaPagamento = (FormaPagamentoEnum)this.b.getSelectedItem();
        TipoDocumentoNFeEnum tipoNfe = (TipoDocumentoNFeEnum)this.d.getSelectedItem();
        FinalidadeEmissaoEnum finalidadeEmissao = (FinalidadeEmissaoEnum)this.e.getSelectedItem();
        TipoImpressaoEnum tpImp = (TipoImpressaoEnum)this.u.getSelectedItem();
        MunicipioTO municipio = (MunicipioTO)this.a.getSelectedItem();
        IndOperacaoConsumidorFinalEnum tipoConsumidor = (IndOperacaoConsumidorFinalEnum)this.o.getSelectedItem();
        IdentLocalDestinoEnum localDestino = (IdentLocalDestinoEnum)this.p.getSelectedItem();
        IndAtendementoPresencialEnum atendimento = (IndAtendementoPresencialEnum)this.t.getSelectedItem();
        ide.setCNF(notaFiscalTO.getCodigoNumericoChaveAcesso());
        ide.setCDV(notaFiscalTO.getDigitoChaveAcesso());
        ide.setNNF(!StringHelper.isBlankOrNull((Object)notaFiscalTO.getNumero()) ? new Integer(notaFiscalTO.getNumero()).toString() : null);
        ide.setCUF(notaFiscalTO.getCodigoUfEmitente() != null ? TCodUfIBGE.Enum.forString((String)notaFiscalTO.getCodigoUfEmitente()) : null);
        ide.setSerie(!StringHelper.isBlankOrNull((Object)notaFiscalTO.getSerie()) ? new Integer(notaFiscalTO.getSerie()).toString() : null);
        ide.setNatOp(!StringHelper.isBlankOrNull((Object)this.d.getText()) ? this.d.getText().trim() : null);
        ide.setIndPag(formaPagamento != null ? TNFe.InfNFe.Ide.IndPag.Enum.forString((String)formaPagamento.getCodigo()) : null);
        ide.setMod(notaFiscalTO.getModelo() != null ? TMod.Enum.forString((String)notaFiscalTO.getModelo()) : null);
        ide.setTpNF(tipoNfe != null ? TNFe.InfNFe.Ide.TpNF.Enum.forString((String)tipoNfe.getCodigo()) : null);
        ide.setCMunFG(municipio != null && !municipio.getCodigo().equals("") ? municipio.getCodigo() : null);
        ide.setTpEmis(notaFiscalTO.getTipoEmissao() != null ? TNFe.InfNFe.Ide.TpEmis.Enum.forString((String)notaFiscalTO.getTipoEmissao().getCodigo()) : null);
        ide.setFinNFe(finalidadeEmissao != null ? TFinNFe.Enum.forString((String)finalidadeEmissao.getCodigo()) : null);
        ide.setTpImp(tpImp != null ? TNFe.InfNFe.Ide.TpImp.Enum.forString((String)tpImp.getCodigo()) : null);
        ide.setTpAmb(TAmb.Enum.forString((String)DSENProperties.getInstance().getAplicativoTipoAmbiente()));
        ide.setProcEmi(TProcEmi.Enum.forString((String)"3"));
        ide.setVerProc(DSENProperties.getInstance().getAplicativoVersao());
        ide.setIdDest(localDestino != null ? TNFe.InfNFe.Ide.IdDest.Enum.forString((String)localDestino.getCodigo()) : null);
        ide.setIndFinal(tipoConsumidor != null ? TNFe.InfNFe.Ide.IndFinal.Enum.forString((String)tipoConsumidor.getCodigo()) : null);
        ide.setIndPres(atendimento != null ? TNFe.InfNFe.Ide.IndPres.Enum.forString((String)atendimento.getCodigo()) : null);
        try {
            nfe.getNFe().getInfNFe().setId("NFe" + ChaveAcessoUtil.gerarChaveAcesso((NotaFiscalTO)notaFiscalTO));
        }
        catch (Throwable t) {
            nfe.getNFe().getInfNFe().setId("NFe");
        }
        String dSaiEntStr = this.h.getText();
        if (notaFiscalTO.getDataEmissao() != null) {
            Date dEmi = notaFiscalTO.getDataEmissao();
            ide.setDhEmi(DateHelper.formataDataHora((Date)dEmi, (SimpleDateFormat)DateHelper.DATE_TIME_XML_FORMAT310));
        } else {
            ide.setDhEmi(null);
        }
        if (dSaiEntStr.contains("  /  /       :  ") && dSaiEntStr.equals("  /  /       :  ")) {
            dSaiEntStr = "";
        }
        if (!StringHelper.isBlankOrNull((Object)dSaiEntStr)) {
            Date dSaiEnt = DateHelper.getDateTime((String)this.h.getText(), (SimpleDateFormat)DateHelper.SIMPLE_DATE_TIME_FORMAT);
            ide.setDhSaiEnt(DateHelper.formataDataHora((Date)dSaiEnt, (SimpleDateFormat)DateHelper.DATE_TIME_XML_FORMAT310));
        } else if (ide.getDhSaiEnt() != null) {
            ide.unsetDhSaiEnt();
        }
        if (!StringHelper.isBlankOrNull((Object)this.f.getText())) {
            ide.setXJust(this.f.getText());
        } else if (ide.isSetXJust()) {
            ide.unsetXJust();
        }
        String dataContingStr = this.o.getText().replaceAll("\\D", "");
        if (!StringHelper.isBlankOrNull((Object)dataContingStr)) {
            Date dConting = DateHelper.getDateTime((String)this.o.getText(), (SimpleDateFormat)DateHelper.DATE_HOUR_MINUTE_FORMAT);
            if (dConting != null) {
                ide.setDhCont(DateHelper.formataDataHora((Date)dConting, (SimpleDateFormat)DateHelper.DATE_TIME_XML_FORMAT310));
            } else if (ide.isSetDhCont()) {
                ide.unsetDhCont();
            }
        } else if (ide.getDhCont() != null && ide.isSetDhCont()) {
            ide.unsetDhCont();
        }
        this.a(ide);
    }

    public void refreshTableNotasRef() {
        ((DSGETableModel)this.c.getWrappedTable().getModel()).fireTableDataChanged();
    }

    public void refreshTableNFProdutorRef() {
        ((DSGETableModel)this.d.getWrappedTable().getModel()).fireTableDataChanged();
    }

    public void refreshTableECFRef() {
        ((DSGETableModel)this.e.getWrappedTable().getModel()).fireTableDataChanged();
    }

    public void refreshTableReboques() {
        ((DSGETableModel)this.i.getWrappedTable().getModel()).fireTableDataChanged();
    }

    public void refreshTableDuplicatas() {
        ((DSGETableModel)this.k.getWrappedTable().getModel()).fireTableDataChanged();
    }

    public void refreshTableFornecimentos() {
        ((DSGETableModel)this.a.getWrappedTable().getModel()).fireTableDataChanged();
    }

    public void refreshTableDeducoes() {
        ((DSGETableModel)this.b.getWrappedTable().getModel()).fireTableDataChanged();
    }

    public void refreshTableProdutos() {
        ((DSGETableModel)this.f.getWrappedTable().getModel()).fireTableDataChanged();
    }

    public void refreshTableAutorizacao() {
        ((DSGETableModel)this.g.getWrappedTable().getModel()).fireTableDataChanged();
    }

    private void a(TNFe.InfNFe.Ide ide) {
        List listaECFsRef;
        List listaNotasRefProdutor;
        ide.setNFrefArray(new TNFe.InfNFe.Ide.NFref[0]);
        List listaNotasRef = this.c.getWrappedTable().getAllTO();
        if (listaNotasRef != null) {
            for (int i = 0; i < listaNotasRef.size(); ++i) {
                RefNFTO notaRef = (RefNFTO)listaNotasRef.get(i);
                TNFe.InfNFe.Ide.NFref nFRef = ide.addNewNFref();
                if (notaRef.getTipoRefNF() == RefNFTO.TIPO_NFE) {
                    nFRef.setRefNFe(notaRef.getChave());
                    continue;
                }
                if (notaRef.getTipoRefNF() == RefNFTO.TIPO_CTE) {
                    nFRef.setRefCTe(notaRef.getChave());
                    continue;
                }
                TNFe.InfNFe.Ide.NFref.RefNF refNF = nFRef.addNewRefNF();
                refNF.setAAMM(this.b(notaRef.getMMAA()));
                refNF.setCNPJ(notaRef.getCNPJ());
                refNF.setCUF(notaRef.getCUF() != null ? TCodUfIBGE.Enum.forString((String)notaRef.getCUF()) : null);
                refNF.setNNF(notaRef.getNNF());
                refNF.setSerie(notaRef.getSerie());
                refNF.setMod(notaRef.getMod() != null ? TNFe.InfNFe.Ide.NFref.RefNF.Mod.Enum.forString((String)notaRef.getMod()) : null);
            }
        }
        if ((listaNotasRefProdutor = this.d.getWrappedTable().getAllTO()) != null) {
            for (int i = 0; i < listaNotasRefProdutor.size(); ++i) {
                RefNFPTO notaRefProdutor = (RefNFPTO)listaNotasRefProdutor.get(i);
                TNFe.InfNFe.Ide.NFref nFRef = ide.addNewNFref();
                TNFe.InfNFe.Ide.NFref.RefNFP refNFP = nFRef.addNewRefNFP();
                refNFP.setAAMM(this.b(notaRefProdutor.getMMAA()));
                refNFP.setCUF(notaRefProdutor.getCUF() != null ? TCodUfIBGE.Enum.forString((String)notaRefProdutor.getCUF()) : null);
                refNFP.setIE(notaRefProdutor.getIE());
                refNFP.setSerie(notaRefProdutor.getSerie());
                refNFP.setNNF(notaRefProdutor.getNNF());
                refNFP.setMod(notaRefProdutor.getMod() != null ? TNFe.InfNFe.Ide.NFref.RefNFP.Mod.Enum.forString((String)notaRefProdutor.getMod()) : null);
                if (!StringHelper.isBlankOrNull((Object)notaRefProdutor.getCPF())) {
                    refNFP.setCPF(notaRefProdutor.getCPF());
                    continue;
                }
                if (StringHelper.isBlankOrNull((Object)notaRefProdutor.getCNPJ())) continue;
                refNFP.setCNPJ(notaRefProdutor.getCNPJ());
            }
        }
        if ((listaECFsRef = this.e.getWrappedTable().getAllTO()) != null) {
            for (int i = 0; i < listaECFsRef.size(); ++i) {
                RefECFTO ecfRef = (RefECFTO)listaECFsRef.get(i);
                TNFe.InfNFe.Ide.NFref nFRef = ide.addNewNFref();
                TNFe.InfNFe.Ide.NFref.RefECF refECF = nFRef.addNewRefECF();
                refECF.setNECF(ecfRef.getNECF());
                refECF.setNCOO(ecfRef.getNCOO());
                refECF.setMod(ecfRef.getMod() != null ? TNFe.InfNFe.Ide.NFref.RefECF.Mod.Enum.forString((String)ecfRef.getMod()) : null);
            }
        }
    }

    private void l(NFeDocument nfe) {
        TNFe.InfNFe.Emit emit = nfe.getNFe().getInfNFe().getEmit();
        if (emit == null) {
            emit = nfe.getNFe().getInfNFe().addNewEmit();
        }
        PaisTO paisTO = (PaisTO)this.m.getSelectedItem();
        EstadoTO ufTO = (EstadoTO)this.n.getSelectedItem();
        MunicipioTO municipioTO = (MunicipioTO)this.l.getSelectedItem();
        RegimeTributarioEnum regTribEnum = (RegimeTributarioEnum)this.r.getSelectedItem();
        emit.setCRT(regTribEnum != null ? TNFe.InfNFe.Emit.CRT.Enum.forString((String)regTribEnum.getCodigo()) : null);
        try {
            emit.setCNPJ(!StringHelper.isBlankOrNull((Object)this.w.getText()) ? this.a.stringToValue(this.w.getText()).toString() : null);
        }
        catch (ParseException parseException) {
            // empty catch block
        }
        emit.setXNome(!StringHelper.isBlankOrNull((Object)this.p.getText()) ? this.p.getText().trim() : null);
        emit.setIE(!StringHelper.isBlankOrNull((Object)this.x.getText()) ? this.x.getText().trim() : null);
        if (!StringHelper.isBlankOrNull((Object)this.n.getText())) {
            emit.setXFant(this.n.getText().trim());
        } else if (emit.getXFant() != null) {
            emit.unsetXFant();
        }
        if (!StringHelper.isBlankOrNull((Object)this.y.getText())) {
            emit.setIEST(this.y.getText().trim());
        } else if (emit.getIEST() != null) {
            emit.unsetIEST();
        }
        if (!StringHelper.isBlankOrNull((Object)this.z.getText())) {
            emit.setIM(this.z.getText().trim());
        } else if (emit.getIM() != null) {
            emit.unsetIM();
        }
        if (!StringHelper.isBlankOrNull((Object)this.v.getText())) {
            emit.setCNAE(this.v.getText().trim());
        } else if (emit.getCNAE() != null) {
            emit.unsetCNAE();
        }
        String cMun = null;
        String xMun = null;
        String cPais = null;
        String xPais = null;
        String uf = null;
        if (paisTO != null && !paisTO.getCodigo().equals("")) {
            cPais = paisTO.getCodigo();
            xPais = paisTO.getNome();
        }
        if (ufTO != null && !ufTO.getCodigo().equals("")) {
            uf = ufTO.getSigla();
        }
        if (municipioTO != null && !municipioTO.getCodigo().equals("")) {
            cMun = municipioTO.getCodigo();
            xMun = municipioTO.getNome();
        }
        emit.setEnderEmit(this.a(this.o.getText().trim(), this.k.getText().trim(), this.m.getText().trim(), this.l.getText().trim(), cMun, xMun, uf, this.u.getText(), cPais, xPais, this.S.getText()));
    }

    private TEndereco a(String xLgr, String nro, String xCpl, String xBairro, String cMun, String xMun, String uf, String cep, String cPais, String xPais, String fone) {
        TEndereco endereco = null;
        String cepStr = null;
        try {
            cepStr = this.a.stringToValue(cep).toString();
        }
        catch (ParseException parseException) {
            // empty catch block
        }
        try {
            fone = this.a.stringToValue(fone).toString();
        }
        catch (ParseException parseException) {
            // empty catch block
        }
        if (!(StringHelper.isBlankOrNull((Object)xLgr) && StringHelper.isBlankOrNull((Object)nro) && StringHelper.isBlankOrNull((Object)xCpl) && StringHelper.isBlankOrNull((Object)xBairro) && StringHelper.isBlankOrNull((Object)cMun) && StringHelper.isBlankOrNull((Object)xMun) && StringHelper.isBlankOrNull((Object)uf) && StringHelper.isBlankOrNull((Object)cepStr) && StringHelper.isBlankOrNull((Object)cPais) && StringHelper.isBlankOrNull((Object)xPais) && StringHelper.isBlankOrNull((Object)fone))) {
            endereco = TEndereco.Factory.newInstance();
            endereco.setXLgr(xLgr);
            endereco.setNro(nro);
            endereco.setXBairro(xBairro);
            endereco.setCMun(cMun);
            endereco.setXMun(xMun);
            endereco.setUF(!StringHelper.isBlankOrNull((Object)uf) ? TUf.Enum.forString((String)uf) : null);
            if (!StringHelper.isBlankOrNull((Object)xCpl)) {
                endereco.setXCpl(xCpl);
            }
            if (!StringHelper.isBlankOrNull((Object)cepStr)) {
                endereco.setCEP(cepStr);
            }
            if (!StringHelper.isBlankOrNull((Object)cPais)) {
                endereco.setCPais(Tpais.Enum.forString((String)cPais));
                endereco.setXPais(xPais);
            }
            if (!StringHelper.isBlankOrNull((Object)fone)) {
                endereco.setFone(fone);
            }
        }
        return endereco;
    }

    private TEnderEmi a(String xLgr, String nro, String xCpl, String xBairro, String cMun, String xMun, String uf, String cep, String cPais, String xPais, String fone) {
        TEnderEmi endereco = null;
        String cepStr = null;
        try {
            cepStr = this.a.stringToValue(cep).toString();
        }
        catch (ParseException parseException) {
            // empty catch block
        }
        try {
            fone = this.a.stringToValue(fone).toString();
        }
        catch (ParseException parseException) {
            // empty catch block
        }
        if (!(StringHelper.isBlankOrNull((Object)xLgr) && StringHelper.isBlankOrNull((Object)nro) && StringHelper.isBlankOrNull((Object)xCpl) && StringHelper.isBlankOrNull((Object)xBairro) && StringHelper.isBlankOrNull((Object)cMun) && StringHelper.isBlankOrNull((Object)xMun) && StringHelper.isBlankOrNull((Object)uf) && StringHelper.isBlankOrNull((Object)cepStr) && StringHelper.isBlankOrNull((Object)cPais) && StringHelper.isBlankOrNull((Object)xPais) && StringHelper.isBlankOrNull((Object)fone))) {
            endereco = TEnderEmi.Factory.newInstance();
            endereco.setXLgr(xLgr);
            endereco.setNro(nro);
            endereco.setXBairro(xBairro);
            endereco.setCMun(cMun);
            endereco.setXMun(xMun);
            endereco.setUF(!StringHelper.isBlankOrNull((Object)uf) ? TUfEmi.Enum.forString((String)uf) : null);
            if (!StringHelper.isBlankOrNull((Object)xCpl)) {
                endereco.setXCpl(xCpl);
            }
            if (!StringHelper.isBlankOrNull((Object)cepStr)) {
                endereco.setCEP(cepStr);
            }
            if (!StringHelper.isBlankOrNull((Object)cPais)) {
                endereco.setCPais(TEnderEmi.CPais.Enum.forString((String)cPais));
                if (!StringHelper.isBlankOrNull((Object)xPais)) {
                    endereco.setXPais(TEnderEmi.XPais.Enum.forString((String)xPais));
                }
            }
            if (!StringHelper.isBlankOrNull((Object)fone)) {
                endereco.setFone(fone);
            }
        }
        return endereco;
    }

    private void m(NFeDocument nfe) {
        TNFe.InfNFe.Dest dest = nfe.getNFe().getInfNFe().getDest();
        if (dest == null) {
            dest = nfe.getNFe().getInfNFe().addNewDest();
        }
        TipoDocumentoDestEnum tipoDocumento = (TipoDocumentoDestEnum)this.h.getSelectedItem();
        PaisTO paisTO = (PaisTO)this.k.getSelectedItem();
        EstadoTO ufTO = (EstadoTO)this.i.getSelectedItem();
        MunicipioTO municipioTO = (MunicipioTO)this.j.getSelectedItem();
        IndIEDestEnum tipoDestContri = (IndIEDestEnum)this.g.getSelectedItem();
        if (dest.getCNPJ() != null) {
            dest.unsetCNPJ();
        }
        if (dest.getCPF() != null) {
            dest.unsetCPF();
        }
        if (dest.getIdEstrangeiro() != null) {
            dest.unsetIdEstrangeiro();
        }
        try {
            String nrDocumento = this.t.getText();
            if (TipoDocumentoDestEnum.CNPJ.equals((Object)tipoDocumento)) {
                dest.setCNPJ(this.b.stringToValue(nrDocumento.replaceAll("\\D", "")).toString());
            } else if (TipoDocumentoDestEnum.CPF.equals((Object)tipoDocumento)) {
                dest.setCPF(this.a.stringToValue(nrDocumento.replaceAll("\\D", "")).toString());
            } else if (TipoDocumentoDestEnum.ESTRANGEIRO.equals((Object)tipoDocumento)) {
                dest.setIdEstrangeiro(nrDocumento);
            }
        }
        catch (ParseException nrDocumento) {
            // empty catch block
        }
        dest.setXNome(!StringHelper.isBlankOrNull((Object)this.j.getText()) ? this.j.getText().trim() : null);
        if (!StringHelper.isBlankOrNull((Object)this.e.getText())) {
            dest.setEmail(this.e.getText());
        } else if (dest.isSetEmail()) {
            dest.unsetEmail();
        }
        if (tipoDestContri == IndIEDestEnum.CONTRIB_ICMS) {
            dest.setIndIEDest(TNFe.InfNFe.Dest.IndIEDest.X_1);
            dest.setIE(!StringHelper.isBlankOrNull((Object)this.q.getText()) ? this.q.getText() : "");
        } else if (tipoDestContri == IndIEDestEnum.CONTRIB_ISENTO) {
            dest.setIndIEDest(TNFe.InfNFe.Dest.IndIEDest.X_2);
            if (dest.isSetIE()) {
                dest.unsetIE();
            }
        } else if (tipoDestContri == IndIEDestEnum.NAO_CONBRIB) {
            dest.setIndIEDest(TNFe.InfNFe.Dest.IndIEDest.X_9);
            if (dest.isSetIE()) {
                dest.unsetIE();
            }
        }
        if (!StringHelper.isBlankOrNull((Object)this.r.getText())) {
            dest.setIM(this.r.getText().trim());
        } else if (dest.isSetIM()) {
            dest.unsetIM();
        }
        if (!StringHelper.isBlankOrNull((Object)this.s.getText())) {
            dest.setISUF(this.s.getText().trim());
        } else if (dest.getISUF() != null) {
            dest.unsetISUF();
        }
        String cMun = null;
        String xMun = null;
        String cPais = null;
        String xPais = null;
        String uf = null;
        if (paisTO != null && !paisTO.getCodigo().equals("")) {
            cPais = paisTO.getCodigo();
            xPais = paisTO.getNome();
        }
        if (ufTO != null && !ufTO.getCodigo().equals("")) {
            uf = ufTO.getSigla();
        }
        if (municipioTO != null && !municipioTO.getCodigo().equals("")) {
            cMun = municipioTO.getCodigo();
            xMun = municipioTO.getNome();
        }
        TEndereco endereco = this.a(this.i.getText().trim(), this.f.getText().trim(), this.h.getText().trim(), this.g.getText().trim(), cMun, xMun, uf, this.p.getText(), cPais, xPais, this.R.getText());
        dest.setEnderDest(endereco);
        if (this.a.isSelected()) {
            nfe.getNFe().getInfNFe().setEntrega(this.a);
        } else if (nfe.getNFe().getInfNFe().getEntrega() != null) {
            nfe.getNFe().getInfNFe().unsetEntrega();
        }
        if (this.b.isSelected()) {
            nfe.getNFe().getInfNFe().setRetirada(this.b);
        } else if (nfe.getNFe().getInfNFe().getRetirada() != null) {
            nfe.getNFe().getInfNFe().unsetRetirada();
        }
    }

    private void n(NFeDocument nfe) {
        TNFe.InfNFe.Total total = nfe.getNFe().getInfNFe().getTotal();
        if (total == null) {
            total = nfe.getNFe().getInfNFe().addNewTotal();
        }
        TNFe.InfNFe.Total.ICMSTot icms = total.getICMSTot();
        TNFe.InfNFe.Total.ISSQNtot issqn = total.getISSQNtot();
        TNFe.InfNFe.Total.RetTrib ret = total.getRetTrib();
        if (icms == null) {
            icms = total.addNewICMSTot();
        }
        if (issqn == null) {
            issqn = total.addNewISSQNtot();
        }
        if (ret == null) {
            ret = total.addNewRetTrib();
        }
        icms.setVBC(!StringHelper.isBlankOrNull((Object)this.w.getText()) ? StringHelper.formataValorXML((String)this.w.getText()) : null);
        icms.setVICMS(!StringHelper.isBlankOrNull((Object)this.F.getText()) ? StringHelper.formataValorXML((String)this.F.getText()) : null);
        icms.setVBCST(!StringHelper.isBlankOrNull((Object)this.A.getText()) ? StringHelper.formataValorXML((String)this.A.getText()) : null);
        icms.setVST(!StringHelper.isBlankOrNull((Object)this.U.getText()) ? StringHelper.formataValorXML((String)this.U.getText()) : null);
        icms.setVProd(!StringHelper.isBlankOrNull((Object)this.O.getText()) ? StringHelper.formataValorXML((String)this.O.getText()) : null);
        icms.setVFrete(!StringHelper.isBlankOrNull((Object)this.E.getText()) ? StringHelper.formataValorXML((String)this.E.getText()) : null);
        icms.setVSeg(!StringHelper.isBlankOrNull((Object)this.V.getText()) ? StringHelper.formataValorXML((String)this.V.getText()) : null);
        icms.setVDesc(!StringHelper.isBlankOrNull((Object)this.D.getText()) ? StringHelper.formataValorXML((String)this.D.getText()) : null);
        icms.setVII(!StringHelper.isBlankOrNull((Object)this.H.getText()) ? StringHelper.formataValorXML((String)this.H.getText()) : null);
        icms.setVIPI(!StringHelper.isBlankOrNull((Object)this.I.getText()) ? StringHelper.formataValorXML((String)this.I.getText()) : null);
        icms.setVPIS(!StringHelper.isBlankOrNull((Object)this.M.getText()) ? StringHelper.formataValorXML((String)this.M.getText()) : null);
        icms.setVCOFINS(!StringHelper.isBlankOrNull((Object)this.B.getText()) ? StringHelper.formataValorXML((String)this.B.getText()) : null);
        icms.setVOutro(!StringHelper.isBlankOrNull((Object)this.L.getText()) ? StringHelper.formataValorXML((String)this.L.getText()) : null);
        icms.setVNF(!StringHelper.isBlankOrNull((Object)this.K.getText()) ? StringHelper.formataValorXML((String)this.K.getText()) : null);
        icms.setVICMSDeson(!StringHelper.isBlankOrNull((Object)this.G.getText()) ? StringHelper.formataValorXML((String)this.G.getText()) : null);
        if (!StringHelper.isBlankOrNull((Object)this.a.getText())) {
            icms.setVTotTrib(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? StringHelper.formataValorXML((String)this.a.getText()) : null);
        } else if (icms.getVTotTrib() != null) {
            icms.unsetVTotTrib();
        }
        if (!(StringHelper.isBlankOrNull((Object)this.W.getText()) && StringHelper.isBlankOrNull((Object)this.y.getText()) && StringHelper.isBlankOrNull((Object)this.J.getText()) && StringHelper.isBlankOrNull((Object)this.N.getText()) && StringHelper.isBlankOrNull((Object)this.C.getText()) && StringHelper.isBlankOrNull((Object)this.A.getText()) && StringHelper.isBlankOrNull((Object)this.D.getText()) && StringHelper.isBlankOrNull((Object)this.C.getText()) && StringHelper.isBlankOrNull((Object)this.B.getText()) && StringHelper.isBlankOrNull((Object)this.E.getText()))) {
            if (!StringHelper.isBlankOrNull((Object)this.W.getText())) {
                issqn.setVServ(StringHelper.formataValorXML((String)this.W.getText()));
            } else if (issqn.getVServ() != null) {
                issqn.unsetVServ();
            }
            if (!StringHelper.isBlankOrNull((Object)this.y.getText())) {
                issqn.setVBC(StringHelper.formataValorXML((String)this.y.getText()));
            } else if (issqn.getVBC() != null) {
                issqn.unsetVBC();
            }
            if (!StringHelper.isBlankOrNull((Object)this.J.getText())) {
                issqn.setVISS(StringHelper.formataValorXML((String)this.J.getText()));
            } else if (issqn.getVISS() != null) {
                issqn.unsetVISS();
            }
            if (!StringHelper.isBlankOrNull((Object)this.A.getText())) {
                issqn.setVDeducao(StringHelper.formataValorXML((String)this.A.getText()));
            } else if (issqn.getVDeducao() != null) {
                issqn.unsetVDeducao();
            }
            if (!StringHelper.isBlankOrNull((Object)this.N.getText())) {
                issqn.setVPIS(StringHelper.formataValorXML((String)this.N.getText()));
            } else if (issqn.getVPIS() != null) {
                issqn.unsetVPIS();
            }
            if (!StringHelper.isBlankOrNull((Object)this.C.getText())) {
                issqn.setVCOFINS(StringHelper.formataValorXML((String)this.C.getText()));
            } else if (issqn.getVCOFINS() != null) {
                issqn.unsetVCOFINS();
            }
            if (!StringHelper.isBlankOrNull((Object)this.D.getText())) {
                issqn.setVISSRet(StringHelper.formataValorXML((String)this.D.getText()));
            } else if (issqn.getVISSRet() != null) {
                issqn.unsetVISSRet();
            }
            if (!StringHelper.isBlankOrNull((Object)this.C.getText())) {
                issqn.setVDescIncond(StringHelper.formataValorXML((String)this.C.getText()));
            } else if (issqn.getVDescIncond() != null) {
                issqn.unsetVDescIncond();
            }
            if (!StringHelper.isBlankOrNull((Object)this.B.getText())) {
                issqn.setVDescCond(StringHelper.formataValorXML((String)this.B.getText()));
            } else if (issqn.getVDescCond() != null) {
                issqn.unsetVDescCond();
            }
            if (!StringHelper.isBlankOrNull((Object)this.E.getText())) {
                issqn.setVOutro(StringHelper.formataValorXML((String)this.E.getText()));
            } else if (issqn.getVOutro() != null) {
                issqn.unsetVOutro();
            }
            if (!StringHelper.isBlankOrNull((Object)this.D.getText())) {
                issqn.setVISSRet(StringHelper.formataValorXML((String)this.D.getText()));
            } else if (issqn.getVISSRet() != null) {
                issqn.unsetVISSRet();
            }
            if (!StringHelper.isBlankOrNull((Object)this.I.getText())) {
                issqn.setDCompet(DateHelper.formataDataHora((Date)DateHelper.getDate((String)this.I.getText()), (SimpleDateFormat)DateHelper.DATE_XML_FORMAT));
            }
            if (this.s.getSelectedItem() != null) {
                RegimeEspecialTributarioEnum retrib = (RegimeEspecialTributarioEnum)this.s.getSelectedItem();
                issqn.setCRegTrib(TNFe.InfNFe.Total.ISSQNtot.CRegTrib.Enum.forString((String)retrib.getCodigo()));
            }
        } else if (total.getISSQNtot() != null) {
            total.unsetISSQNtot();
        }
        if (!(StringHelper.isBlankOrNull((Object)this.R.getText()) && StringHelper.isBlankOrNull((Object)this.P.getText()) && StringHelper.isBlankOrNull((Object)this.Q.getText()) && StringHelper.isBlankOrNull((Object)this.x.getText()) && StringHelper.isBlankOrNull((Object)this.T.getText()) && StringHelper.isBlankOrNull((Object)this.z.getText()) && StringHelper.isBlankOrNull((Object)this.S.getText()))) {
            if (!StringHelper.isBlankOrNull((Object)this.R.getText())) {
                ret.setVRetPIS(StringHelper.formataValorXML((String)this.R.getText()));
            } else if (ret.getVRetPIS() != null) {
                ret.unsetVRetPIS();
            }
            if (!StringHelper.isBlankOrNull((Object)this.P.getText())) {
                ret.setVRetCOFINS(StringHelper.formataValorXML((String)this.P.getText()));
            } else if (ret.getVRetCOFINS() != null) {
                ret.unsetVRetCOFINS();
            }
            if (!StringHelper.isBlankOrNull((Object)this.Q.getText())) {
                ret.setVRetCSLL(StringHelper.formataValorXML((String)this.Q.getText()));
            } else if (ret.getVRetCSLL() != null) {
                ret.unsetVRetCSLL();
            }
            if (!StringHelper.isBlankOrNull((Object)this.x.getText())) {
                ret.setVBCIRRF(StringHelper.formataValorXML((String)this.x.getText()));
            } else if (ret.getVBCIRRF() != null) {
                ret.unsetVBCIRRF();
            }
            if (!StringHelper.isBlankOrNull((Object)this.T.getText())) {
                ret.setVIRRF(StringHelper.formataValorXML((String)this.T.getText()));
            } else if (ret.getVIRRF() != null) {
                ret.unsetVIRRF();
            }
            if (!StringHelper.isBlankOrNull((Object)this.z.getText())) {
                ret.setVBCRetPrev(StringHelper.formataValorXML((String)this.z.getText()));
            } else if (ret.getVBCRetPrev() != null) {
                ret.unsetVBCRetPrev();
            }
            if (!StringHelper.isBlankOrNull((Object)this.S.getText())) {
                ret.setVRetPrev(StringHelper.formataValorXML((String)this.S.getText()));
            } else if (ret.getVRetPrev() != null) {
                ret.unsetVRetPrev();
            }
        } else if (total.getRetTrib() != null) {
            total.unsetRetTrib();
        }
    }

    private void o(NFeDocument nfe) {
        List listaProdutos = this.f.getWrappedTable().getAllTO();
        if (listaProdutos != null) {
            TNFe.InfNFe.Det[] det = new TNFe.InfNFe.Det[listaProdutos.size()];
            HashMap<String, ProdutoEspecificoEnum> mapProdutoEspecifico = new HashMap<String, ProdutoEspecificoEnum>();
            for (int i = 0; i < listaProdutos.size(); ++i) {
                ProdutoNotaTO produtoNotaTO = (ProdutoNotaTO)listaProdutos.get(i);
                det[i] = produtoNotaTO.getDetalheProduto();
                if (produtoNotaTO.getProdutoEspecifico() == null) continue;
                mapProdutoEspecifico.put(produtoNotaTO.getCProd(), produtoNotaTO.getProdutoEspecifico());
            }
            nfe.getNFe().getInfNFe().setDetArray(det);
            this.a.setProdutoEspecifico(mapProdutoEspecifico);
        }
    }

    private void p(NFeDocument nfe) {
        List lista = this.g.getWrappedTable().getAllTO();
        if (lista != null) {
            TNFe.InfNFe.AutXML[] aut = new TNFe.InfNFe.AutXML[lista.size()];
            HashMap mapProdutoEspecifico = new HashMap();
            for (int i = 0; i < lista.size(); ++i) {
                AutorizacaoTO autTO = (AutorizacaoTO)lista.get(i);
                aut[i] = TNFe.InfNFe.AutXML.Factory.newInstance();
                if (autTO.getCNPJ() != null) {
                    aut[i].setCNPJ(autTO.getCNPJ());
                    continue;
                }
                if (autTO.getCPF() == null) continue;
                aut[i].setCPF(autTO.getCPF());
            }
            nfe.getNFe().getInfNFe().setAutXMLArray(aut);
        }
    }

    private void q(NFeDocument nfe) {
        EstadoTO ufEmbarque;
        TNFe.InfNFe.InfAdic info = null;
        TNFe.InfNFe.Exporta exporta = null;
        TNFe.InfNFe.Compra compra = null;
        if (!StringHelper.isBlankOrNull((Object)this.d.getText()) || !StringHelper.isBlankOrNull((Object)this.e.getText()) || this.l.getAllTO() != null && this.l.getAllTO().size() > 0 || this.m.getAllTO() != null && this.m.getAllTO().size() > 0 || this.n.getAllTO() != null && this.n.getAllTO().size() > 0) {
            ObservacaoNotaTO obsTO;
            int i;
            info = TNFe.InfNFe.InfAdic.Factory.newInstance();
            if (!StringHelper.isBlankOrNull((Object)this.d.getText())) {
                info.setInfAdFisco(this.d.getText().trim());
            } else if (info.getInfAdFisco() != null) {
                info.unsetInfAdFisco();
            }
            if (!StringHelper.isBlankOrNull((Object)this.e.getText())) {
                info.setInfCpl(this.e.getText().trim());
            } else if (info.getInfCpl() != null) {
                info.unsetInfCpl();
            }
            info.setObsContArray(new TNFe.InfNFe.InfAdic.ObsCont[0]);
            if (this.l.getAllTO() != null) {
                for (i = 0; i < this.l.getAllTO().size(); ++i) {
                    obsTO = (ObservacaoNotaTO)this.l.getAllTO().get(i);
                    TNFe.InfNFe.InfAdic.ObsCont obsCont = info.addNewObsCont();
                    if (!StringHelper.isBlankOrNull((Object)obsTO.getXCampo())) {
                        obsCont.setXCampo(obsTO.getXCampo().trim());
                    }
                    if (StringHelper.isBlankOrNull((Object)obsTO.getXTexto())) continue;
                    obsCont.setXTexto(obsTO.getXTexto().trim());
                }
            }
            info.setObsFiscoArray(new TNFe.InfNFe.InfAdic.ObsFisco[0]);
            if (this.m.getAllTO() != null) {
                for (i = 0; i < this.m.getAllTO().size(); ++i) {
                    obsTO = (ObservacaoNotaTO)this.m.getAllTO().get(i);
                    TNFe.InfNFe.InfAdic.ObsFisco obsFisco = info.addNewObsFisco();
                    if (!StringHelper.isBlankOrNull((Object)obsTO.getXCampo())) {
                        obsFisco.setXCampo(obsTO.getXCampo().trim());
                    }
                    if (StringHelper.isBlankOrNull((Object)obsTO.getXTexto())) continue;
                    obsFisco.setXTexto(obsTO.getXTexto().trim());
                }
            }
            info.setProcRefArray(new TNFe.InfNFe.InfAdic.ProcRef[0]);
            if (this.n.getAllTO() != null) {
                for (i = 0; i < this.n.getAllTO().size(); ++i) {
                    ProcessoReferenciadoNotaTO procTO = (ProcessoReferenciadoNotaTO)this.n.getAllTO().get(i);
                    TNFe.InfNFe.InfAdic.ProcRef procRef = info.addNewProcRef();
                    procRef.setIndProc(!StringHelper.isBlankOrNull((Object)procTO.getIndProc()) ? TNFe.InfNFe.InfAdic.ProcRef.IndProc.Enum.forString((String)procTO.getIndProc()) : null);
                    procRef.setNProc(procTO.getNProc());
                }
            }
        }
        if ((ufEmbarque = (EstadoTO)this.q.getSelectedItem()) != null && !ufEmbarque.getCodigo().equals("") || !StringHelper.isBlankOrNull((Object)this.s.getText())) {
            exporta = TNFe.InfNFe.Exporta.Factory.newInstance();
            exporta.setUFSaidaPais(ufEmbarque != null && !ufEmbarque.getCodigo().equals("") ? TUfEmi.Enum.forString((String)ufEmbarque.getSigla()) : null);
            exporta.setXLocExporta(!StringHelper.isBlankOrNull((Object)this.s.getText()) ? this.s.getText().trim() : null);
            if (!StringHelper.isBlankOrNull((Object)this.r.getText())) {
                exporta.setXLocDespacho(this.r.getText());
            } else if (exporta.isSetXLocDespacho()) {
                exporta.unsetXLocDespacho();
            }
        }
        if (!(StringHelper.isBlankOrNull((Object)this.q.getText()) && StringHelper.isBlankOrNull((Object)this.t.getText()) && StringHelper.isBlankOrNull((Object)this.u.getText()))) {
            compra = TNFe.InfNFe.Compra.Factory.newInstance();
            if (!StringHelper.isBlankOrNull((Object)this.q.getText())) {
                compra.setXCont(this.q.getText().trim());
            }
            if (!StringHelper.isBlankOrNull((Object)this.t.getText())) {
                compra.setXNEmp(this.t.getText().trim());
            }
            if (!StringHelper.isBlankOrNull((Object)this.u.getText())) {
                compra.setXPed(this.u.getText().trim());
            }
        }
        if (info != null) {
            nfe.getNFe().getInfNFe().setInfAdic(info);
        } else if (nfe.getNFe().getInfNFe().getInfAdic() != null) {
            nfe.getNFe().getInfNFe().unsetInfAdic();
        }
        if (exporta != null) {
            nfe.getNFe().getInfNFe().setExporta(exporta);
        } else if (nfe.getNFe().getInfNFe().getExporta() != null) {
            nfe.getNFe().getInfNFe().unsetExporta();
        }
        if (compra != null) {
            nfe.getNFe().getInfNFe().setCompra(compra);
        } else if (nfe.getNFe().getInfNFe().getCompra() != null) {
            nfe.getNFe().getInfNFe().unsetCompra();
        }
    }

    private void r(NFeDocument nfe) {
        boolean cfopInexistente;
        ModalidadeFreteEnum modFrete;
        TNFe.InfNFe.Transp transp = nfe.getNFe().getInfNFe().getTransp();
        if (transp == null) {
            transp = nfe.getNFe().getInfNFe().addNewTransp();
        }
        transp.setModFrete((modFrete = (ModalidadeFreteEnum)this.y.getSelectedItem()) != null ? TNFe.InfNFe.Transp.ModFrete.Enum.forString((String)modFrete.getCodigo()) : null);
        String nrDocumento = this.K.getText().replaceAll("[_/-[ ][.]]", "");
        if (this.z.getSelectedItem() != null || !StringHelper.isBlankOrNull((Object)nrDocumento) || !StringHelper.isBlankOrNull((Object)this.Z.getText()) || !StringHelper.isBlankOrNull((Object)this.J.getText()) || !StringHelper.isBlankOrNull((Object)this.Y.getText()) || this.A.getSelectedItem() != null && !StringHelper.isBlankOrNull((Object)((EstadoTO)this.A.getSelectedItem()).getCodigo()) || this.d.isSelected()) {
            TNFe.InfNFe.Transp.Transporta transporta = transp.getTransporta() != null ? transp.getTransporta() : transp.addNewTransporta();
            TipoDocumentoEnum tpDocumento = (TipoDocumentoEnum)this.z.getSelectedItem();
            EstadoTO estadoTO = (EstadoTO)this.A.getSelectedItem();
            MunicipioTO municipioTO = (MunicipioTO)this.C.getSelectedItem();
            if (transporta.getCNPJ() != null) {
                transporta.unsetCNPJ();
            }
            if (transporta.getCPF() != null) {
                transporta.unsetCPF();
            }
            if (tpDocumento != null) {
                try {
                    if (tpDocumento.equals((Object)TipoDocumentoEnum.CNPJ)) {
                        String cnpj = this.c.stringToValue(this.K.getText()).toString();
                        transporta.setCNPJ(cnpj);
                    } else if (tpDocumento.equals((Object)TipoDocumentoEnum.CPF)) {
                        String cpf = this.b.stringToValue(this.K.getText()).toString();
                        transporta.setCPF(cpf);
                    }
                }
                catch (ParseException cpf) {
                    // empty catch block
                }
            }
            if (!StringHelper.isBlankOrNull((Object)this.Z.getText())) {
                transporta.setXNome(this.Z.getText().trim());
            } else if (transporta.getXNome() != null) {
                transporta.unsetXNome();
            }
            if (this.d.isSelected()) {
                transporta.setIE(DSENConstants.ISENTO);
            } else if (!StringHelper.isBlankOrNull((Object)this.J.getText())) {
                transporta.setIE(this.J.getText().trim());
            } else if (transporta.getIE() != null) {
                transporta.unsetIE();
            }
            if (!StringHelper.isBlankOrNull((Object)this.Y.getText())) {
                transporta.setXEnder(this.Y.getText().trim());
            } else if (transporta.getXEnder() != null) {
                transporta.unsetXEnder();
            }
            if (municipioTO != null && !municipioTO.getCodigo().equals("")) {
                transporta.setXMun(municipioTO != null && !municipioTO.getCodigo().equals("") ? municipioTO.getNome() : null);
            } else if (transporta.getXMun() != null) {
                transporta.unsetXMun();
            }
            if (estadoTO != null && !estadoTO.getCodigo().equals("")) {
                transporta.setUF(TUf.Enum.forString((String)estadoTO.getSigla()));
            } else if (transporta.getUF() != null) {
                transporta.unsetUF();
            }
        } else if (transp.getTransporta() != null) {
            transp.unsetTransporta();
        }
        CfopTO cfopTO = (CfopTO)this.v.getSelectedItem();
        String codigoCFOP = null;
        if (cfopTO != null && !StringHelper.isBlankOrNull((Object)cfopTO.getCodigo())) {
            codigoCFOP = cfopTO.getCodigo();
        }
        boolean bl = cfopInexistente = !this.v.isVisible();
        if (!(StringHelper.isBlankOrNull((Object)this.M.getText()) && StringHelper.isBlankOrNull((Object)this.L.getText()) && StringHelper.isBlankOrNull((Object)this.O.getText()) && this.x.getSelectedItem() == null && this.w.getSelectedItem() == null && StringHelper.isBlankOrNull((Object)codigoCFOP) && !cfopInexistente)) {
            TNFe.InfNFe.Transp.RetTransp retTransp = transp.getRetTransp() != null ? transp.getRetTransp() : transp.addNewRetTransp();
            MunicipioTO municipioTO = (MunicipioTO)this.w.getSelectedItem();
            retTransp.setVServ(!StringHelper.isBlankOrNull((Object)this.O.getText()) ? StringHelper.formataValorXML((String)this.O.getText()) : null);
            retTransp.setVBCRet(!StringHelper.isBlankOrNull((Object)this.M.getText()) ? StringHelper.formataValorXML((String)this.M.getText()) : null);
            retTransp.setPICMSRet(!StringHelper.isBlankOrNull((Object)this.L.getText()) ? StringHelper.formataValorXML((String)this.L.getText()) : null);
            retTransp.setVICMSRet(!StringHelper.isBlankOrNull((Object)this.N.getText()) ? StringHelper.formataValorXML((String)this.N.getText()) : null);
            if (!cfopInexistente) {
                retTransp.setCFOP(!StringHelper.isBlankOrNull((Object)codigoCFOP) ? TCfopTransp.Enum.forString((String)codigoCFOP) : null);
            }
            retTransp.setCMunFG(municipioTO != null && !municipioTO.getCodigo().equals("") ? municipioTO.getCodigo().toString() : null);
        } else if (transp.getRetTransp() != null) {
            transp.unsetRetTransp();
        }
        if (transp.isSetVeicTransp()) {
            transp.unsetVeicTransp();
        }
        if (!(!this.c.isSelected() || StringHelper.isBlankOrNull((Object)this.P.getText()) && StringHelper.isBlankOrNull((Object)this.X.getText()) && this.B.getSelectedItem() == null)) {
            TVeiculo veicTransp = transp.getVeicTransp() != null ? transp.getVeicTransp() : transp.addNewVeicTransp();
            EstadoTO estadoTO = (EstadoTO)this.B.getSelectedItem();
            veicTransp.setPlaca(!StringHelper.isBlankOrNull((Object)this.P.getText()) ? this.P.getText().trim() : null);
            veicTransp.setUF(estadoTO != null && !estadoTO.getCodigo().equals("") ? TUf.Enum.forString((String)estadoTO.getSigla()) : null);
            if (!StringHelper.isBlankOrNull((Object)this.X.getText())) {
                veicTransp.setRNTC(this.X.getText().trim());
            } else if (veicTransp.getRNTC() != null) {
                veicTransp.unsetRNTC();
            }
        }
        List listaReboque = this.i.getWrappedTable().getAllTO();
        TVeiculo[] reboqueArray = new TVeiculo[listaReboque.size()];
        for (int i = 0; i < listaReboque.size(); ++i) {
            ReboqueTO reboqueTO = (ReboqueTO)listaReboque.get(i);
            TVeiculo reboque = TVeiculo.Factory.newInstance();
            reboque.setPlaca(reboqueTO.getPlaca());
            reboque.setUF(!StringHelper.isBlankOrNull((Object)reboqueTO.getUF()) ? TUf.Enum.forString((String)reboqueTO.getUF()) : null);
            if (reboqueTO.getRNTC() != null) {
                reboque.setRNTC(reboqueTO.getRNTC());
            }
            reboqueArray[i] = reboque;
        }
        transp.setReboqueArray(reboqueArray);
        if (transp.isSetBalsa()) {
            transp.unsetBalsa();
        }
        if (transp.isSetVagao()) {
            transp.unsetVagao();
        }
        if (!StringHelper.isBlankOrNull((Object)this.Q.getText())) {
            transp.setVagao(this.Q.getText());
        } else if (!StringHelper.isBlankOrNull((Object)this.a.getText())) {
            transp.setBalsa(this.a.getText());
        }
        List listaVolume = this.j.getWrappedTable().getAllTO();
        transp.setVolArray(new TNFe.InfNFe.Transp.Vol[0]);
        if (listaVolume != null) {
            for (int i = 0; i < listaVolume.size(); ++i) {
                VolumeTO volumeTO = (VolumeTO)listaVolume.get(i);
                TNFe.InfNFe.Transp.Vol vol = transp.addNewVol();
                if (volumeTO.getQVol() != null) {
                    vol.setQVol(volumeTO.getQVol());
                }
                if (volumeTO.getEsp() != null) {
                    vol.setEsp(volumeTO.getEsp());
                }
                if (volumeTO.getMarca() != null) {
                    vol.setMarca(volumeTO.getMarca());
                }
                if (volumeTO.getNVol() != null) {
                    vol.setNVol(volumeTO.getNVol());
                }
                if (volumeTO.getPesoL() != null) {
                    vol.setPesoL(volumeTO.getPesoL());
                }
                if (volumeTO.getPesoB() != null) {
                    vol.setPesoB(volumeTO.getPesoB());
                }
                if (volumeTO.getListaLacre() == null) continue;
                for (LacreTO lacreTO : volumeTO.getListaLacre()) {
                    TNFe.InfNFe.Transp.Vol.Lacres lacres = vol.addNewLacres();
                    lacres.setNLacre(lacreTO.getNLacre());
                }
            }
        }
    }

    private void s(NFeDocument nfe) {
        TNFe.InfNFe.Cobr cobranca = nfe.getNFe().getInfNFe().getCobr();
        List listaDuplicata = this.k.getWrappedTable().getAllTO();
        if (!((listaDuplicata == null || listaDuplicata.isEmpty()) && StringHelper.isBlankOrNull((Object)this.b.getText()) && StringHelper.isBlankOrNull((Object)this.e.getText()) && StringHelper.isBlankOrNull((Object)this.c.getText()) && StringHelper.isBlankOrNull((Object)this.d.getText()))) {
            TNFe.InfNFe.Cobr cobr = cobranca = cobranca != null ? cobranca : nfe.getNFe().getInfNFe().addNewCobr();
            if (!(StringHelper.isBlankOrNull((Object)this.b.getText()) && StringHelper.isBlankOrNull((Object)this.e.getText()) && StringHelper.isBlankOrNull((Object)this.c.getText()) && StringHelper.isBlankOrNull((Object)this.d.getText()))) {
                TNFe.InfNFe.Cobr.Fat fatura;
                TNFe.InfNFe.Cobr.Fat fat = fatura = cobranca.getFat() != null ? cobranca.getFat() : cobranca.addNewFat();
                if (!StringHelper.isBlankOrNull((Object)this.b.getText())) {
                    fatura.setNFat(this.b.getText().trim());
                } else if (fatura.getNFat() != null) {
                    fatura.unsetNFat();
                }
                if (!StringHelper.isBlankOrNull((Object)this.d.getText())) {
                    fatura.setVLiq(StringHelper.formataValorXML((String)this.d.getText()));
                } else if (fatura.getVLiq() != null) {
                    fatura.unsetVLiq();
                }
                if (!StringHelper.isBlankOrNull((Object)this.e.getText())) {
                    fatura.setVOrig(StringHelper.formataValorXML((String)this.e.getText()));
                } else if (fatura.getVOrig() != null) {
                    fatura.unsetVOrig();
                }
                if (!StringHelper.isBlankOrNull((Object)this.c.getText())) {
                    fatura.setVDesc(StringHelper.formataValorXML((String)this.c.getText()));
                } else if (fatura.getVDesc() != null) {
                    fatura.unsetVDesc();
                }
            } else if (cobranca.getFat() != null) {
                cobranca.unsetFat();
            }
            cobranca.setDupArray(new TNFe.InfNFe.Cobr.Dup[0]);
            if (listaDuplicata != null) {
                for (int i = 0; i < listaDuplicata.size(); ++i) {
                    DuplicataTO duplicataTO = (DuplicataTO)listaDuplicata.get(i);
                    TNFe.InfNFe.Cobr.Dup dup = cobranca.addNewDup();
                    if (duplicataTO.getDVenc() != null) {
                        dup.setDVenc(DateHelper.formataDataHora((Date)duplicataTO.getDVenc().getTime(), (SimpleDateFormat)DateHelper.DATE_XML_FORMAT));
                    }
                    if (!StringHelper.isBlankOrNull((Object)duplicataTO.getNDup())) {
                        dup.setNDup(duplicataTO.getNDup());
                    }
                    if (duplicataTO.getVDup() == null) continue;
                    dup.setVDup(duplicataTO.getVDup());
                }
            }
        } else if (nfe.getNFe().getInfNFe().getCobr() != null) {
            nfe.getNFe().getInfNFe().unsetCobr();
        }
    }

    private void t(NFeDocument nfe) {
        this.a.removeAllTO();
        this.b.removeAllTO();
        TNFe.InfNFe.Cana cana = nfe.getNFe().getInfNFe().getCana();
        if (cana != null) {
            TNFe.InfNFe.Cana.Deduc[] deduc;
            NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
            NumberFormatter formatter1110 = NumberFormatterHelper.getFormatter((int)10, (int)10, (int)11);
            this.F.setText(cana.getSafra());
            this.G.setText(cana.getRef());
            BigDecimal totalFornecimentoMes = new BigDecimal("0");
            BigDecimal totalDeducoes = new BigDecimal("0");
            TNFe.InfNFe.Cana.ForDia[] forDia = cana.getForDiaArray();
            if (forDia != null) {
                for (int i = 0; i < forDia.length; ++i) {
                    FornecimentoTO fornecimentoTO = new FornecimentoTO();
                    fornecimentoTO.setDia(!StringHelper.isBlankOrNull((Object)forDia[i].getDia()) ? StringHelper.completaComZerosAEsquerda((String)forDia[i].getDia(), (int)2) : null);
                    if (!StringHelper.isBlankOrNull((Object)forDia[i].getQtde())) {
                        fornecimentoTO.setQtde(new BigDecimal(forDia[i].getQtde()));
                        totalFornecimentoMes = totalFornecimentoMes.add(fornecimentoTO.getQtde());
                    }
                    this.a.addTO((BaseTO)fornecimentoTO);
                }
            }
            if ((deduc = cana.getDeducArray()) != null) {
                for (int i = 0; i < deduc.length; ++i) {
                    DeducaoTO deducaoTO = new DeducaoTO();
                    deducaoTO.setXDed(deduc[i].getXDed());
                    if (!StringHelper.isBlankOrNull((Object)deduc[i].getVDed())) {
                        deducaoTO.setVDed(new BigDecimal(deduc[i].getVDed()));
                        totalDeducoes = totalDeducoes.add(deducaoTO.getVDed());
                    }
                    this.b.addTO((BaseTO)deducaoTO);
                    deducaoTO.setNItem(String.valueOf(i + 1));
                }
            }
            try {
                this.T.setText(!StringHelper.isBlankOrNull((Object)cana.getQTotAnt()) ? formatter1110.valueToString(new BigDecimal(cana.getQTotAnt())) : null);
                if (!StringHelper.isBlankOrNull((Object)this.V.getText()) && !StringHelper.isBlankOrNull((Object)this.T.getText())) {
                    this.U.setText(formatter1110.valueToString(totalFornecimentoMes.add(new BigDecimal(cana.getQTotAnt()))));
                } else if (!StringHelper.isBlankOrNull((Object)this.V.getText())) {
                    this.U.setText(this.V.getText());
                } else if (!StringHelper.isBlankOrNull((Object)this.T.getText())) {
                    this.U.setText(this.T.getText());
                }
                this.V.setText(formatter1110.valueToString(totalFornecimentoMes));
                this.X.setText(!StringHelper.isBlankOrNull((Object)cana.getVFor()) ? formatter1302.valueToString(new BigDecimal(cana.getVFor())) : null);
                if (!StringHelper.isBlankOrNull((Object)this.X.getText()) && !StringHelper.isBlankOrNull((Object)this.W.getText())) {
                    this.Y.setText(formatter1302.valueToString(new BigDecimal(StringHelper.formataValorXML((String)this.X.getText())).subtract(totalDeducoes)));
                } else if (!StringHelper.isBlankOrNull((Object)this.X.getText())) {
                    this.Y.setText(this.X.getText());
                } else if (!StringHelper.isBlankOrNull((Object)this.W.getText())) {
                    this.Y.setText(formatter1302.valueToString(totalDeducoes.multiply(new BigDecimal("-1"))));
                }
                this.W.setText(formatter1302.valueToString(totalDeducoes));
            }
            catch (ParseException ex) {
                this.showErrors((Throwable)ex);
            }
        }
        this.t();
        this.verificarSelecionadosTabela(this.getSelectedDeducaoTOs(), DSENLabelConstants.DEDUCOES);
        this.verificarSelecionadosTabela(this.getSelectedFornecimentoTOs(), DSENLabelConstants.FORNECIMENTOS_DIARIOS);
    }

    private void u(NFeDocument nfe) {
        TNFe.InfNFe.Cana cana = nfe.getNFe().getInfNFe().getCana();
        List listaFornecimento = this.a.getWrappedTable().getAllTO();
        List listaDeducao = this.b.getWrappedTable().getAllTO();
        if (nfe.getNFe().getInfNFe().isSetCana()) {
            nfe.getNFe().getInfNFe().unsetCana();
        }
        if (listaFornecimento != null && !listaFornecimento.isEmpty() || listaDeducao != null && !listaDeducao.isEmpty() || !StringHelper.isBlankOrNull((Object)this.F.getText()) || !StringHelper.isBlankOrNull((Object)this.G.getText().replaceAll("\\D", "")) || !StringHelper.isBlankOrNull((Object)this.V.getText()) || !StringHelper.isBlankOrNull((Object)this.T.getText()) || !StringHelper.isBlankOrNull((Object)this.U.getText()) || !StringHelper.isBlankOrNull((Object)this.X.getText()) || !StringHelper.isBlankOrNull((Object)this.W.getText()) || !StringHelper.isBlankOrNull((Object)this.Y.getText())) {
            int i;
            cana = nfe.getNFe().getInfNFe().addNewCana();
            cana.setRef(null);
            cana.setSafra(this.F.getText());
            if (!StringHelper.isBlankOrNull((Object)this.G.getText()) && !this.G.getText().trim().replace("/", "").equals("")) {
                cana.setRef(this.G.getText().trim());
            }
            cana.setQTotMes(!StringHelper.isBlankOrNull((Object)this.V.getText()) ? StringHelper.formataValorXML((String)this.V.getText()) : null);
            cana.setQTotAnt(!StringHelper.isBlankOrNull((Object)this.T.getText()) ? StringHelper.formataValorXML((String)this.T.getText()) : null);
            cana.setQTotGer(!StringHelper.isBlankOrNull((Object)this.U.getText()) ? StringHelper.formataValorXML((String)this.U.getText()) : null);
            cana.setVFor(!StringHelper.isBlankOrNull((Object)this.X.getText()) ? StringHelper.formataValorXML((String)this.X.getText()) : null);
            cana.setVTotDed(!StringHelper.isBlankOrNull((Object)this.W.getText()) ? StringHelper.formataValorXML((String)this.W.getText()) : null);
            cana.setVLiqFor(!StringHelper.isBlankOrNull((Object)this.Y.getText()) ? StringHelper.formataValorXML((String)this.Y.getText()) : null);
            cana.setForDiaArray(new TNFe.InfNFe.Cana.ForDia[0]);
            cana.setDeducArray(new TNFe.InfNFe.Cana.Deduc[0]);
            if (listaFornecimento != null) {
                for (i = 0; i < listaFornecimento.size(); ++i) {
                    FornecimentoTO fornecimentoTO = (FornecimentoTO)listaFornecimento.get(i);
                    TNFe.InfNFe.Cana.ForDia forDia = cana.addNewForDia();
                    forDia.setDia(!StringHelper.isBlankOrNull((Object)fornecimentoTO.getDia()) ? new Integer(fornecimentoTO.getDia()).toString() : null);
                    forDia.setQtde(!StringHelper.isBlankOrNull((Object)fornecimentoTO.getQtde()) ? fornecimentoTO.getQtde().toString() : null);
                }
            }
            if (listaDeducao != null) {
                for (i = 0; i < listaDeducao.size(); ++i) {
                    DeducaoTO deducaoTO = (DeducaoTO)listaDeducao.get(i);
                    TNFe.InfNFe.Cana.Deduc deduc = cana.addNewDeduc();
                    deduc.setXDed(!StringHelper.isBlankOrNull((Object)deducaoTO.getXDed()) ? deducaoTO.getXDed() : null);
                    deduc.setVDed(!StringHelper.isBlankOrNull((Object)deducaoTO.getVDed()) ? deducaoTO.getVDed().toString() : null);
                }
            }
        }
    }

    public void atualizaTotaisFornecimentos() {
        try {
            BigDecimal tFornecimentos = BigDecimal.ZERO;
            this.V.setText("");
            this.U.setText("");
            this.Y.setText("");
            List listaFornecimento = this.a.getWrappedTable().getAllTO();
            NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
            NumberFormatter formatter1110 = NumberFormatterHelper.getFormatter((int)10, (int)10, (int)11);
            if (listaFornecimento != null) {
                for (int i = 0; i < listaFornecimento.size(); ++i) {
                    FornecimentoTO fornecimentoTO = (FornecimentoTO)listaFornecimento.get(i);
                    if (fornecimentoTO.getQtde() == null) continue;
                    tFornecimentos = tFornecimentos.add(fornecimentoTO.getQtde());
                }
            }
            this.V.setText(formatter1110.valueToString(tFornecimentos));
            if (!StringHelper.isBlankOrNull((Object)this.V.getText()) && !StringHelper.isBlankOrNull((Object)this.T.getText())) {
                this.U.setText(formatter1110.valueToString(tFornecimentos.add(new BigDecimal(StringHelper.formataValorXML((String)this.T.getText())))));
            } else if (!StringHelper.isBlankOrNull((Object)this.V.getText())) {
                this.U.setText(this.V.getText());
            } else if (!StringHelper.isBlankOrNull((Object)this.T.getText())) {
                this.U.setText(this.T.getText());
            }
            if (!StringHelper.isBlankOrNull((Object)this.X.getText()) && !StringHelper.isBlankOrNull((Object)this.W.getText())) {
                this.Y.setText(formatter1302.valueToString(new BigDecimal(StringHelper.formataValorXML((String)this.X.getText())).subtract(new BigDecimal(StringHelper.formataValorXML((String)this.W.getText())))));
            } else if (!StringHelper.isBlankOrNull((Object)this.X.getText())) {
                this.Y.setText(this.X.getText());
            } else if (!StringHelper.isBlankOrNull((Object)this.W.getText())) {
                this.Y.setText(formatter1302.valueToString(new BigDecimal(StringHelper.formataValorXML((String)this.W.getText())).multiply(new BigDecimal("-1"))));
            }
        }
        catch (ParseException tFornecimentos) {
            // empty catch block
        }
        this.t();
    }

    public void atualizaTotaisDeducoes() {
        try {
            BigDecimal tDeducoes = BigDecimal.ZERO;
            this.W.setText("");
            this.Y.setText("");
            List listaDeducao = this.b.getWrappedTable().getAllTO();
            NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
            if (listaDeducao != null) {
                for (int i = 0; i < listaDeducao.size(); ++i) {
                    DeducaoTO deducaoTO = (DeducaoTO)listaDeducao.get(i);
                    if (deducaoTO.getVDed() == null) continue;
                    tDeducoes = tDeducoes.add(deducaoTO.getVDed());
                }
            }
            this.W.setText(formatter1302.valueToString(tDeducoes));
            if (!StringHelper.isBlankOrNull((Object)this.X.getText()) && !StringHelper.isBlankOrNull((Object)this.W.getText())) {
                this.Y.setText(formatter1302.valueToString(new BigDecimal(this.X.getText().replace(".", "").replace(",", ".")).doubleValue() - new BigDecimal(this.W.getText().replace(".", "").replace(",", ".")).doubleValue()));
            } else if (!StringHelper.isBlankOrNull((Object)this.X.getText())) {
                this.Y.setText(this.X.getText());
            } else if (!StringHelper.isBlankOrNull((Object)this.W.getText())) {
                this.Y.setText(formatter1302.valueToString(tDeducoes.multiply(new BigDecimal("-1"))));
            }
        }
        catch (ParseException tDeducoes) {
            // empty catch block
        }
        this.t();
    }

    private void t() {
        List listaFornecimento = this.a.getWrappedTable().getAllTO();
        List listaDeducao = this.b.getWrappedTable().getAllTO();
        if (listaFornecimento != null && !listaFornecimento.isEmpty() || listaDeducao != null && !listaDeducao.isEmpty() || !StringHelper.isBlankOrNull((Object)this.F.getText()) || !StringHelper.isBlankOrNull((Object)this.G.getText().replaceAll("\\D", "")) || !StringHelper.isBlankOrNull((Object)this.T.getText()) || !StringHelper.isBlankOrNull((Object)this.X.getText())) {
            this.W.setText(this.c(this.W.getText()));
            this.ae.setText(this.c(this.ae.getText()));
            this.as.setText(this.c(this.as.getText()));
            this.bx.setText(this.c(this.bx.getText()));
            this.au.setText(this.c(this.au.getText()));
            this.at.setText(this.c(this.at.getText()));
            this.bz.setText(this.c(this.bz.getText()));
            this.by.setText(this.c(this.by.getText()));
            ((TitledBorder)this.T.getBorder()).setTitle(this.c(((TitledBorder)this.T.getBorder()).getTitle()));
        } else {
            this.V.setText(null);
            this.U.setText(null);
            this.W.setText(null);
            this.Y.setText(null);
            this.W.setText(this.d(this.W.getText()));
            this.ae.setText(this.d(this.ae.getText()));
            this.as.setText(this.d(this.as.getText()));
            this.bx.setText(this.d(this.bx.getText()));
            this.au.setText(this.d(this.au.getText()));
            this.at.setText(this.d(this.at.getText()));
            this.bz.setText(this.d(this.bz.getText()));
            this.by.setText(this.d(this.by.getText()));
            ((TitledBorder)this.T.getBorder()).setTitle(this.d(((TitledBorder)this.T.getBorder()).getTitle()));
        }
    }

    private String c(String label) {
        if (!label.startsWith("*")) {
            return "* " + label;
        }
        return label;
    }

    private String d(String s) {
        if (s == null) {
            return null;
        }
        return s.replaceFirst("[ ]{0,}[*][ ]{0,}", "");
    }

    public void reordenaFornecimentos() {
        List listaFornecimento = this.a.getWrappedTable().getAllTO();
        Collections.sort(listaFornecimento);
        this.a.removeAllTO();
        this.a.addTO(listaFornecimento);
    }

    public void reordenaDeducoes() {
        List listaDeducao = this.b.getWrappedTable().getAllTO();
        Collections.sort(listaDeducao);
        this.b.removeAllTO();
        this.b.addTO(listaDeducao);
        this.u();
    }

    private void u() {
        List lista = this.getAllDeducaoTO();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                DeducaoTO deducaoTO = (DeducaoTO)lista.get(i);
                deducaoTO.setNItem(String.valueOf(i + 1));
            }
        }
    }

    private void v() {
        void var60_60;
        this.a = new ButtonGroup();
        this.H = new JPanel();
        this.l = new JLabel();
        this.b = new JFormattedTextField();
        this.ai = new JLabel();
        this.H = new JFormattedTextField();
        this.ar = new JLabel();
        this.v = new JTextField();
        this.aa = new JTextField();
        this.bA = new JLabel();
        this.g = new JButton();
        this.d = new DSGETabbedPane();
        this.s = new JPanel();
        this.b = new DSGETabbedPane();
        this.l = new JPanel();
        this.a = new JPanel();
        this.v = new JLabel();
        this.X = new JLabel();
        this.e = new JComboBox();
        this.bb = new JLabel();
        this.bc = new JLabel();
        this.c = new JComboBox();
        this.aj = new JLabel();
        this.aq = new JLabel();
        this.k = new JLabel();
        this.j = new JFormattedTextField();
        ((AbstractDocument)this.j.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(9));
        this.aY = new JLabel();
        this.d = new JComboBox();
        this.u = new JLabel();
        this.b = new JComboBox();
        this.f = new JComboBox();
        this.c = new JTextField();
        this.h = new JFormattedTextField();
        this.c.install(this.h);
        this.k = new JFormattedTextField();
        ((AbstractDocument)this.k.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(3));
        this.s = new JLabel();
        this.a = new JComboBox();
        this.c = new JCheckBox();
        this.f = new JFormattedTextField();
        ((AbstractDocument)this.f.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(8));
        this.q = new JLabel();
        this.F = new JLabel();
        this.i = new JFormattedTextField();
        this.g = new JFormattedTextField();
        this.a.install(this.g);
        this.r = new JLabel();
        this.ak = new JLabel();
        this.d = new JTextField();
        ((AbstractDocument)this.d.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.aZ = new JLabel();
        this.u = new JComboBox();
        this.h = new JLabel();
        this.w = new JLabel();
        this.o = new JFormattedTextField();
        this.b.install(this.o);
        this.n = new JScrollPane();
        this.f = new JTextArea();
        ((AbstractDocument)this.f.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 256));
        this.ad = new JLabel();
        this.al = new JLabel();
        this.p = new JComboBox();
        this.am = new JLabel();
        this.o = new JComboBox();
        this.ba = new JLabel();
        this.t = new JComboBox();
        this.t = new JPanel();
        this.bD = new JLabel();
        this.n = new JFormattedTextField();
        this.l = new JFormattedTextField();
        this.bB = new JLabel();
        this.m = new JFormattedTextField();
        this.bC = new JLabel();
        this.E = new JPanel();
        this.af = new JLabel();
        this.u = new JPanel();
        this.h = new JScrollPane();
        this.q = new JButton();
        this.k = new JButton();
        this.n = new JButton();
        this.v = new JPanel();
        this.i = new JScrollPane();
        this.s = new JButton();
        this.m = new JButton();
        this.p = new JButton();
        this.w = new JPanel();
        this.g = new JScrollPane();
        this.r = new JButton();
        this.l = new JButton();
        this.o = new JButton();
        this.C = new JPanel();
        this.D = new JPanel();
        this.J = new JLabel();
        this.w = new JFormattedTextField();
        this.a.install(this.w);
        this.O = new JLabel();
        this.p = new JTextField();
        ((AbstractDocument)this.p.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.N = new JLabel();
        this.n = new JTextField();
        ((AbstractDocument)this.n.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.K = new JLabel();
        this.x = new JFormattedTextField();
        ((AbstractDocument)this.x.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{0,14}", 14));
        this.L = new JLabel();
        this.y = new JFormattedTextField();
        ((AbstractDocument)this.y.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{0,14}", 14));
        this.z = new JFormattedTextField();
        ((AbstractDocument)this.z.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 15));
        this.M = new JLabel();
        this.I = new JLabel();
        this.v = new JFormattedTextField();
        ((AbstractDocument)this.v.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(7));
        this.r = new JComboBox();
        this.ap = new JLabel();
        this.r = new JPanel();
        this.bJ = new JLabel();
        this.o = new JTextField();
        ((AbstractDocument)this.o.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.an = new JLabel();
        this.k = new JTextField();
        ((AbstractDocument)this.k.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.bH = new JLabel();
        this.m = new JTextField();
        ((AbstractDocument)this.m.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.bE = new JLabel();
        this.l = new JTextField();
        ((AbstractDocument)this.l.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.i = new JLabel();
        this.u = new JFormattedTextField();
        this.a.install(this.u);
        this.bO = new JLabel();
        this.m = new JComboBox();
        this.bv = new JLabel();
        this.n = new JComboBox();
        this.bL = new JLabel();
        this.l = new JComboBox();
        this.P = new JLabel();
        this.S = new JFormattedTextField();
        this.B = new JPanel();
        this.z = new JPanel();
        this.B = new JLabel();
        this.h = new JComboBox();
        this.A = new JLabel();
        this.t = new JFormattedTextField();
        ((AbstractDocument)this.t.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 20));
        this.D = new JLabel();
        this.j = new JTextField();
        ((AbstractDocument)this.j.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.x = new JLabel();
        this.q = new JFormattedTextField();
        ((AbstractDocument)this.q.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{0,14}", 14));
        this.y = new JLabel();
        this.s = new JFormattedTextField();
        ((AbstractDocument)this.s.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{8,9}", 9));
        this.v = new JButton();
        this.t = new JButton();
        this.E = new JLabel();
        this.e = new JTextField();
        ((AbstractDocument)this.e.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.C = new JLabel();
        this.g = new JComboBox();
        this.z = new JLabel();
        this.r = new JFormattedTextField();
        ((AbstractDocument)this.r.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 15));
        this.A = new JPanel();
        this.b = new JCheckBox();
        this.w = new JButton();
        this.a = new JCheckBox();
        this.u = new JButton();
        this.y = new JPanel();
        this.bK = new JLabel();
        this.i = new JTextField();
        ((AbstractDocument)this.i.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.ao = new JLabel();
        this.f = new JTextField();
        ((AbstractDocument)this.f.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.bI = new JLabel();
        this.h = new JTextField();
        ((AbstractDocument)this.h.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.bF = new JLabel();
        this.g = new JTextField();
        ((AbstractDocument)this.g.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.j = new JLabel();
        this.p = new JFormattedTextField();
        this.b.install(this.p);
        this.bP = new JLabel();
        this.k = new JComboBox();
        this.bw = new JLabel();
        this.i = new JComboBox();
        this.bM = new JLabel();
        this.j = new JComboBox();
        this.Q = new JLabel();
        this.R = new JFormattedTextField();
        this.Q = new JPanel();
        this.R = new JPanel();
        this.m = new JScrollPane();
        this.U = new JButton();
        this.S = new JButton();
        this.T = new JButton();
        this.X = new JPanel();
        this.c = new DSGETabbedPane();
        this.U = new JPanel();
        this.av = new JLabel();
        this.w = new JTextField();
        this.aF = new JLabel();
        this.F = new JTextField();
        this.az = new JLabel();
        this.A = new JTextField();
        this.aV = new JLabel();
        this.U = new JTextField();
        this.aQ = new JLabel();
        this.O = new JTextField();
        this.aE = new JLabel();
        this.E = new JTextField();
        this.aW = new JLabel();
        this.V = new JTextField();
        this.aD = new JLabel();
        this.D = new JTextField();
        this.aH = new JLabel();
        this.H = new JTextField();
        this.aI = new JLabel();
        this.I = new JTextField();
        this.aO = new JLabel();
        this.M = new JTextField();
        this.aA = new JLabel();
        this.B = new JTextField();
        this.aN = new JLabel();
        this.L = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)((JFormattedTextField)this.L), (int)13, (int)2);
        this.aL = new JLabel();
        this.K = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)((JFormattedTextField)this.K), (int)13, (int)2);
        this.V = new JButton();
        this.aG = new JLabel();
        this.G = new JTextField();
        this.V = new JPanel();
        this.ax = new JLabel();
        this.y = new JTextField();
        this.aK = new JLabel();
        this.J = new JTextField();
        this.aP = new JLabel();
        this.N = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)((JFormattedTextField)this.N), (int)13, (int)2);
        this.aB = new JLabel();
        this.C = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)((JFormattedTextField)this.C), (int)13, (int)2);
        this.aX = new JLabel();
        this.W = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)((JFormattedTextField)this.W), (int)13, (int)2);
        this.R = new JLabel();
        this.A = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.A, (int)13, (int)2);
        this.S = new JLabel();
        this.E = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.E, (int)13, (int)2);
        this.T = new JLabel();
        this.C = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.C, (int)13, (int)2);
        this.U = new JLabel();
        this.B = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.B, (int)13, (int)2);
        this.V = new JLabel();
        this.D = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.E, (int)13, (int)2);
        this.I = new JFormattedTextField();
        this.a.install(this.I);
        this.t = new JLabel();
        this.aC = new JLabel();
        this.s = new JComboBox();
        this.W = new JPanel();
        this.aT = new JLabel();
        this.R = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)((JFormattedTextField)this.R), (int)13, (int)2);
        this.aR = new JLabel();
        this.P = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)((JFormattedTextField)this.P), (int)13, (int)2);
        this.aS = new JLabel();
        this.Q = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)((JFormattedTextField)this.Q), (int)13, (int)2);
        this.aw = new JLabel();
        this.x = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)((JFormattedTextField)this.x), (int)13, (int)2);
        this.aJ = new JLabel();
        this.T = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)((JFormattedTextField)this.T), (int)13, (int)2);
        this.ay = new JLabel();
        this.z = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)((JFormattedTextField)this.z), (int)13, (int)2);
        this.aU = new JLabel();
        this.S = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)((JFormattedTextField)this.S), (int)13, (int)2);
        this.ag = new JLabel();
        this.ag.setText("<html><p>" + DSENMessageConstants.MSG_PREENCHIMENTO_TOTAIS + "</p></html>");
        this.k = new JPanel();
        this.a = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)((JFormattedTextField)this.a), (int)13, (int)2);
        this.aM = new JLabel();
        this.bu = new JLabel();
        this.af = new JPanel();
        this.ag = new JPanel();
        this.bh = new JLabel();
        this.y = new JComboBox();
        this.e = new DSGETabbedPane();
        this.ab = new JPanel();
        this.i = new JPanel();
        this.bs = new JLabel();
        this.Y = new JTextField();
        ((AbstractDocument)this.Y.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.A = new JComboBox();
        this.bl = new JLabel();
        this.ah = new JLabel();
        this.C = new JComboBox();
        this.j = new JPanel();
        this.bk = new JLabel();
        this.bt = new JLabel();
        this.bg = new JLabel();
        this.J = new JFormattedTextField();
        ((AbstractDocument)this.J.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{0,14}", 14));
        this.Z = new JTextField();
        ((AbstractDocument)this.Z.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.z = new JComboBox();
        this.bi = new JLabel();
        this.K = new JFormattedTextField();
        this.X = new JButton();
        this.d = new JCheckBox();
        this.W = new JButton();
        this.Y = new JPanel();
        this.bm = new JLabel();
        this.M = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.M, (int)13, (int)2);
        this.bj = new JLabel();
        this.L = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.L, (int)3, (int)2);
        this.bo = new JLabel();
        this.O = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.O, (int)13, (int)2);
        this.bf = new JLabel();
        this.x = new JComboBox();
        this.be = new JLabel();
        this.w = new JComboBox();
        this.bd = new JLabel();
        this.bn = new JLabel();
        this.N = new JFormattedTextField();
        this.v = new JComboBox();
        this.ac = new JPanel();
        this.c = new JRadioButton();
        this.m = new JPanel();
        this.b = new JPanel();
        this.bp = new JLabel();
        this.P = new JFormattedTextField();
        ((AbstractDocument)this.P.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("([A-Z]{2,3}[0-9]{4}|[A-Z]{3,4}[0-9]{3})", 8));
        this.br = new JLabel();
        this.B = new JComboBox();
        this.bq = new JLabel();
        this.X = new JTextField();
        ((AbstractDocument)this.X.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 20));
        this.aa = new JPanel();
        this.aa = new JButton();
        this.Z = new JButton();
        this.Y = new JButton();
        this.Z = new JPanel();
        this.a = new JRadioButton();
        this.b = new JRadioButton();
        this.a = new JFormattedTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 20));
        this.Q = new JFormattedTextField();
        ((AbstractDocument)this.Q.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 20));
        this.ae = new JPanel();
        this.ad = new JButton();
        this.ab = new JButton();
        this.ac = new JButton();
        this.ad = new JPanel();
        this.q = new JPanel();
        this.p = new JPanel();
        this.m = new JLabel();
        this.b = new JTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.p = new JLabel();
        this.e = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.e, (int)13, (int)2);
        this.n = new JLabel();
        this.c = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.c, (int)13, (int)2);
        this.o = new JLabel();
        this.d = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.d, (int)13, (int)2);
        this.o = new JPanel();
        this.j = new JButton();
        this.f = new JScrollPane();
        this.h = new JButton();
        this.i = new JButton();
        this.J = new JPanel();
        this.a = new DSGETabbedPane();
        this.I = new JPanel();
        this.Y = new JLabel();
        this.a = new JScrollPane();
        this.d = new JTextArea();
        ((AbstractDocument)this.d.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 2000));
        this.Z = new JLabel();
        this.b = new JScrollPane();
        this.e = new JTextArea();
        ((AbstractDocument)this.e.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 5000));
        this.M = new JPanel();
        this.j = new JScrollPane();
        this.K = new JButton();
        this.I = new JButton();
        this.J = new JButton();
        this.N = new JPanel();
        this.k = new JScrollPane();
        this.N = new JButton();
        this.L = new JButton();
        this.M = new JButton();
        this.O = new JPanel();
        this.l = new JScrollPane();
        this.R = new JButton();
        this.P = new JButton();
        this.Q = new JButton();
        this.F = new JPanel();
        this.L = new JPanel();
        this.aa = new JLabel();
        this.q = new JComboBox();
        this.ab = new JLabel();
        this.s = new JTextField();
        ((AbstractDocument)this.s.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.ac = new JLabel();
        this.r = new JTextField();
        ((AbstractDocument)this.r.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.K = new JPanel();
        this.bN = new JLabel();
        this.t = new JTextField();
        ((AbstractDocument)this.t.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 22));
        this.bQ = new JLabel();
        this.u = new JTextField();
        ((AbstractDocument)this.u.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.bG = new JLabel();
        this.q = new JTextField();
        ((AbstractDocument)this.q.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.n = new JPanel();
        this.P = new JPanel();
        this.W = new JLabel();
        this.F = new JFormattedTextField();
        this.a.install(this.F);
        this.G = new JFormattedTextField();
        this.ae = new JLabel();
        this.T = new JPanel();
        this.H = new JButton();
        this.y = new JButton();
        this.A = new JButton();
        this.G = new JPanel();
        this.d = new JPanel();
        this.V = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.V, (int)11, (int)10);
        this.au = new JLabel();
        this.as = new JLabel();
        this.at = new JLabel();
        this.T = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.T, (int)11, (int)10);
        this.U = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.U, (int)11, (int)10);
        this.bx = new JLabel();
        this.bz = new JLabel();
        this.by = new JLabel();
        this.Y = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.Y, (int)13, (int)2);
        this.W = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.W, (int)13, (int)2);
        this.X = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.X, (int)13, (int)2);
        this.e = new JPanel();
        this.z = new JButton();
        this.x = new JButton();
        this.G = new JButton();
        this.x = new JPanel();
        this.f = new JPanel();
        this.g = new JPanel();
        this.c = new JScrollPane();
        this.a = new JTextArea();
        this.b = new JLabel();
        this.c = new JLabel();
        this.b = new JTextArea();
        this.d = new JLabel();
        this.d = new JScrollPane();
        this.c = new JTextArea();
        this.h = new JPanel();
        this.e = new JLabel();
        this.f = new JLabel();
        this.H = new JLabel();
        this.G = new JLabel();
        this.c = new JPanel();
        this.S = new JPanel();
        this.e = new JScrollPane();
        this.d = new JButton();
        this.b = new JButton();
        this.c = new JButton();
        this.F = new JButton();
        this.af = new JButton();
        this.a = new JButton();
        this.ae = new JButton();
        this.e = new JButton();
        this.E = new JButton();
        this.B = new JButton();
        this.C = new JButton();
        this.a = new JLabel();
        this.g = new JLabel();
        this.D = new JButton();
        this.O = new JButton();
        this.f = new JButton();
        this.setBorder((Border)BorderFactory.createTitledBorder(null, "Nota Fiscal", 2, 0, new Font("Dialog", 1, 14), new Color(0, 0, 255)));
        this.setRequestFocusEnabled(false);
        this.H.setBorder(BorderFactory.createTitledBorder(""));
        this.l.setFont(new Font("Tahoma", 1, 11));
        this.l.setText("Chave de acesso");
        this.b.setEditable(false);
        this.b.setFont(new Font("SansSerif", 1, 10));
        this.ai.setFont(new Font("Tahoma", 1, 11));
        this.ai.setText("N\u00famero");
        this.H.setEditable(false);
        this.H.setHorizontalAlignment(0);
        this.H.setFont(new Font("SansSerif", 1, 10));
        this.ar.setFont(new Font("Tahoma", 1, 11));
        this.ar.setText("Status");
        this.v.setEditable(false);
        this.v.setFont(new Font("SansSerif", 1, 10));
        this.aa.setEditable(false);
        this.aa.setFont(new Font("SansSerif", 1, 10));
        this.bA.setFont(new Font("Tahoma", 1, 11));
        this.bA.setText("Vers\u00e3o XML");
        this.g.setIcon(new ImageIcon(this.getClass().getResource("/br/gov/sp/fazenda/dsen/view/resources/chave.gif")));
        GroupLayout pnlHeaderLayout = new GroupLayout(this.H);
        this.H.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(pnlHeaderLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup().addGroup(pnlHeaderLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.v).addComponent(this.ar)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlHeaderLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.l, GroupLayout.Alignment.LEADING).addComponent(this.b, GroupLayout.Alignment.LEADING)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.g, -2, 16, -2).addGap(15, 15, 15).addGroup(pnlHeaderLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(pnlHeaderLayout.createSequentialGroup().addComponent(this.ai).addGap(62, 62, 62)).addGroup(pnlHeaderLayout.createSequentialGroup().addComponent(this.H, -2, 94, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))).addGroup(pnlHeaderLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.aa).addComponent(this.bA))));
        pnlHeaderLayout.setVerticalGroup(pnlHeaderLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlHeaderLayout.createSequentialGroup().addGroup(pnlHeaderLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ar).addComponent(this.l)).addGap(3, 3, 3).addGroup(pnlHeaderLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.v, -2, -1, -2).addComponent(this.b, -2, -1, -2))).addGroup(pnlHeaderLayout.createSequentialGroup().addGroup(pnlHeaderLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bA).addComponent(this.ai)).addGap(3, 3, 3).addGroup(pnlHeaderLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.aa, -2, -1, -2).addComponent(this.H, -2, -1, -2))).addGroup(pnlHeaderLayout.createSequentialGroup().addGap(17, 17, 17).addComponent(this.g, -2, 18, -2)));
        this.a.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
        this.v.setFont(new Font("Tahoma", 1, 11));
        this.v.setText("* UF");
        this.X.setFont(new Font("Tahoma", 1, 11));
        this.X.setText("* Forma de pagamento");
        this.bb.setFont(new Font("Tahoma", 1, 11));
        this.bb.setText("* Tipo do documento");
        this.bc.setFont(new Font("Tahoma", 1, 11));
        this.bc.setText("* Finalidade de emiss\u00e3o");
        this.aj.setFont(new Font("Tahoma", 1, 11));
        this.aj.setText("* N\u00famero");
        this.aq.setFont(new Font("Tahoma", 1, 11));
        this.aq.setText("* S\u00e9rie");
        this.k.setFont(new Font("Tahoma", 1, 11));
        this.k.setText("* Munic\u00edpio de ocorr\u00eancia");
        this.j.setHorizontalAlignment(4);
        this.aY.setFont(new Font("Tahoma", 1, 11));
        this.aY.setText("* Forma de emiss\u00e3o");
        this.u.setFont(new Font("Tahoma", 1, 11));
        this.u.setText("Modelo");
        this.c.setEditable(false);
        this.c.setEnabled(false);
        this.c.setFocusable(false);
        this.h.setHorizontalAlignment(4);
        this.k.setHorizontalAlignment(4);
        this.s.setFont(new Font("Tahoma", 1, 11));
        this.s.setText("Data e Hora de sa\u00edda/entrada");
        this.c.setFont(new Font("Dialog", 1, 11));
        this.c.setText("Informar C\u00f3digo Num\u00e9rico");
        this.c.setToolTipText("Selecione esse item para informar manualmente o C\u00f3digo Num\u00e9rico da NF-e. Caso essa op\u00e7\u00e3o n\u00e3o seja selecionada, o sistema gerar\u00e1 um C\u00f3digo Num\u00e9rico automaticamente.");
        this.f.setHorizontalAlignment(4);
        this.f.setToolTipText("C\u00f3digo Num\u00e9rico que comp\u00f5e a chave de acesso. Se este campo estiver em branco, o sistema gerar\u00e1 um c\u00f3digo quando a NF-e for validada.");
        this.q.setFont(new Font("SansSerif", 1, 11));
        this.q.setText("C\u00f3digo Num\u00e9rico");
        this.F.setFont(new Font("SansSerif", 1, 11));
        this.F.setText("DV");
        this.i.setEditable(false);
        this.i.setHorizontalAlignment(0);
        this.i.setToolTipText("D\u00edgito Verificador da Chave de Acesso");
        this.i.setEnabled(false);
        this.g.setHorizontalAlignment(4);
        this.r.setFont(new Font("Tahoma", 1, 11));
        this.r.setText("* Data e Hora de emiss\u00e3o");
        this.ak.setFont(new Font("Tahoma", 1, 11));
        this.ak.setText("* Natureza da opera\u00e7\u00e3o");
        this.aZ.setFont(new Font("Tahoma", 1, 11));
        this.aZ.setText("* Tipo impress\u00e3o DANFE");
        this.h.setText(" ");
        this.w.setFont(new Font("Tahoma", 1, 11));
        this.w.setText("* Data e Hora de Entrada em Conting\u00eancia");
        this.o.setHorizontalAlignment(4);
        this.n.setHorizontalScrollBarPolicy(31);
        this.f.setColumns(20);
        this.f.setLineWrap(true);
        this.f.setRows(1);
        this.f.setWrapStyleWord(true);
        this.n.setViewportView(this.f);
        this.ad.setFont(new Font("Tahoma", 1, 11));
        this.ad.setText("* Justificativa de Entrada em Conting\u00eancia");
        this.al.setFont(new Font("Tahoma", 1, 11));
        this.al.setText("* Destino da opera\u00e7\u00e3o");
        this.am.setFont(new Font("Tahoma", 1, 11));
        this.am.setText("* Consumidor Final");
        this.ba.setFont(new Font("Tahoma", 1, 11));
        this.ba.setText("* Tipo Atendimento");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.h, GroupLayout.Alignment.TRAILING, -2, 12, -2).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.o, GroupLayout.Alignment.LEADING).addComponent(this.w, GroupLayout.Alignment.LEADING)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.ad, -1, -1, 32767).addGap(361, 361, 361)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.n).addGap(12, 12, 12)))).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.c).addComponent(this.u)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.k).addComponent(this.aq)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.aj).addComponent(this.j, -2, 77, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.r).addComponent(this.g, -2, 155, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -2, 177, -2).addGap(12, 12, 12).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.f, -2, 110, -2).addComponent(this.q)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.i).addComponent(this.F, -2, 28, -2)).addGap(0, 0, 32767)).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.d, 0, -1, 32767).addComponent(this.bb, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.s, -1, 173, 32767).addComponent(this.h)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b, 0, -1, 32767).addComponent(this.X, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.c, 0, -1, 32767).addComponent(this.aY, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.bc, -1, -1, 32767).addComponent(this.e, 0, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.u, 0, -1, 32767).addComponent(this.aZ, -1, -1, 32767))).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.o, 0, -1, 32767).addComponent(this.am, -1, 109, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.al, -1, -1, 32767).addComponent(this.p, 0, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ba, -1, -1, 32767).addComponent(this.t, 0, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.ak, -1, -1, 32767).addComponent(this.d, -2, 220, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.v).addComponent(this.f, -2, 53, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.a, 0, -1, 32767).addComponent(this.k, -1, 293, 32767)))).addGap(12, 12, 12)))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.u).addGap(1, 1, 1).addComponent(this.c, -2, -1, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.aq).addGap(1, 1, 1).addComponent(this.k, -2, -1, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.aj).addGap(1, 1, 1).addComponent(this.j, -2, -1, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.r).addGap(1, 1, 1).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.g, -2, -1, -2).addComponent(this.c, -2, 16, -2)))).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(15, 15, 15).addComponent(this.f, -2, -1, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.q).addComponent(this.F)).addGap(1, 1, 1).addComponent(this.i, -2, -1, -2)))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.bb).addGap(1, 1, 1).addComponent(this.d, -2, 16, -2)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.X).addGap(1, 1, 1).addComponent(this.b, -2, 12, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.aY).addGap(1, 1, 1).addComponent(this.c, -2, 12, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.bc).addGap(1, 1, 1).addComponent(this.e, -2, 12, -2)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(this.aZ).addGap(1, 1, 1).addComponent(this.u, -2, 15, -2))).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.s).addGap(1, 1, 1).addComponent(this.h, -2, -1, -2)))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.am, GroupLayout.Alignment.TRAILING).addComponent(this.al, GroupLayout.Alignment.TRAILING).addComponent(this.ba, GroupLayout.Alignment.TRAILING).addComponent(this.ak, GroupLayout.Alignment.TRAILING).addComponent(this.v, GroupLayout.Alignment.TRAILING).addComponent(this.k, GroupLayout.Alignment.TRAILING)).addGap(5, 5, 5).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.o, GroupLayout.Alignment.TRAILING, -2, -1, -2).addComponent(this.p, GroupLayout.Alignment.TRAILING, -2, -1, -2).addComponent(this.t, GroupLayout.Alignment.TRAILING, -2, -1, -2).addComponent(this.d, GroupLayout.Alignment.TRAILING, -2, -1, -2).addComponent(this.f, GroupLayout.Alignment.TRAILING, -2, 12, -2).addComponent(this.a, GroupLayout.Alignment.TRAILING, -2, 12, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.w).addComponent(this.ad)).addGap(1, 1, 1).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.o, -2, -1, -2).addComponent(this.n, -2, 31, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.h).addContainerGap()));
        jPanel1Layout.linkSize(1, this.a, this.b, this.c, this.d, this.e, this.f, this.u, this.d);
        jPanel1Layout.linkSize(1, this.f, this.i);
        this.t.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
        this.bD.setFont(new Font("Tahoma", 1, 11));
        this.bD.setText("Valor total da nota");
        this.n.setEditable(false);
        this.n.setHorizontalAlignment(4);
        this.n.setEnabled(false);
        this.n.setFocusable(false);
        this.l.setEditable(false);
        this.l.setHorizontalAlignment(4);
        this.l.setEnabled(false);
        this.l.setFocusable(false);
        this.bB.setFont(new Font("Tahoma", 1, 11));
        this.bB.setText("Valor ICMS da nota");
        this.m.setEditable(false);
        this.m.setHorizontalAlignment(4);
        this.m.setEnabled(false);
        this.m.setFocusable(false);
        this.bC.setFont(new Font("Tahoma", 1, 11));
        this.bC.setText("Valor ICMS ST da nota");
        GroupLayout pnlDados3Layout = new GroupLayout(this.t);
        this.t.setLayout(pnlDados3Layout);
        pnlDados3Layout.setHorizontalGroup(pnlDados3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDados3Layout.createSequentialGroup().addContainerGap().addGroup(pnlDados3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.n, -1, 133, 32767).addComponent(this.bD, -2, 133, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDados3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.l, -1, 123, 32767).addComponent(this.bB, -2, 123, -2)).addGap(12, 12, 12).addGroup(pnlDados3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.bC, -1, -1, 32767).addComponent(this.m, -2, 135, -2)).addContainerGap(489, 32767)));
        pnlDados3Layout.linkSize(0, this.bB, this.bC, this.bD, this.l, this.m, this.n);
        pnlDados3Layout.setVerticalGroup(pnlDados3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlDados3Layout.createSequentialGroup().addGap(2, 2, 2).addGroup(pnlDados3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDados3Layout.createSequentialGroup().addComponent(this.bD).addGap(1, 1, 1).addComponent(this.n, -2, -1, -2)).addGroup(pnlDados3Layout.createSequentialGroup().addComponent(this.bB).addGap(1, 1, 1).addComponent(this.l, -2, -1, -2)).addGroup(pnlDados3Layout.createSequentialGroup().addComponent(this.bC).addGap(1, 1, 1).addComponent(this.m, -2, -1, -2))).addContainerGap(-1, 32767)));
        this.E.setBorder(BorderFactory.createTitledBorder(null, "Hist\u00f3rico de Eventos", 0, 0, new Font("Tahoma", 1, 11)));
        GroupLayout pnlEventosLayout = new GroupLayout(this.E);
        this.E.setLayout(pnlEventosLayout);
        pnlEventosLayout.setHorizontalGroup(pnlEventosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 912, 32767));
        pnlEventosLayout.setVerticalGroup(pnlEventosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 109, 32767));
        this.af.setFont(new Font("Dialog", 0, 10));
        GroupLayout jPanel8Layout = new GroupLayout(this.l);
        this.l.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup().addContainerGap().addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.t, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.af, GroupLayout.Alignment.LEADING, -1, 924, 32767).addComponent(this.E, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.a, GroupLayout.Alignment.LEADING, -2, 924, 32767)).addContainerGap()));
        jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addGap(4, 4, 4).addComponent(this.a, -2, 172, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.t, -2, 40, -2).addGap(1, 1, 1).addComponent(this.E, -1, -1, 32767).addGap(0, 0, 0).addComponent(this.af, -1, 39, 32767)));
        this.b.addTab("NF-e", this.l);
        this.q.setText("Incluir");
        this.k.setText("Detalhar");
        this.n.setText("Excluir");
        GroupLayout pnlDados4Layout = new GroupLayout(this.u);
        this.u.setLayout(pnlDados4Layout);
        pnlDados4Layout.setHorizontalGroup(pnlDados4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDados4Layout.createSequentialGroup().addContainerGap().addGroup(pnlDados4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.h, -1, 924, 32767).addGroup(pnlDados4Layout.createSequentialGroup().addComponent(this.q).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.k).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.n))).addContainerGap()));
        pnlDados4Layout.linkSize(0, this.k, this.n, this.q);
        pnlDados4Layout.setVerticalGroup(pnlDados4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlDados4Layout.createSequentialGroup().addContainerGap().addComponent(this.h, -1, 343, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDados4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.q).addComponent(this.k).addComponent(this.n)).addContainerGap()));
        this.b.addTab("Notas e Conhecimentos Fiscais Referenciados", this.u);
        this.s.setText("Incluir");
        this.m.setText("Detalhar");
        this.p.setText("Excluir");
        GroupLayout pnlDados5Layout = new GroupLayout(this.v);
        this.v.setLayout(pnlDados5Layout);
        pnlDados5Layout.setHorizontalGroup(pnlDados5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDados5Layout.createSequentialGroup().addContainerGap().addGroup(pnlDados5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.i, -1, 924, 32767).addGroup(pnlDados5Layout.createSequentialGroup().addComponent(this.s).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.m).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.p))).addContainerGap()));
        pnlDados5Layout.setVerticalGroup(pnlDados5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlDados5Layout.createSequentialGroup().addContainerGap().addComponent(this.i, -1, 343, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDados5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.s).addComponent(this.m).addComponent(this.p)).addContainerGap()));
        this.b.addTab("Notas Fiscais Referenciadas de Produtor", this.v);
        this.r.setText("Incluir");
        this.l.setText("Detalhar");
        this.o.setText("Excluir");
        GroupLayout pnlDados6Layout = new GroupLayout(this.w);
        this.w.setLayout(pnlDados6Layout);
        pnlDados6Layout.setHorizontalGroup(pnlDados6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDados6Layout.createSequentialGroup().addContainerGap().addGroup(pnlDados6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.g, -1, 924, 32767).addGroup(pnlDados6Layout.createSequentialGroup().addComponent(this.r).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.l).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.o))).addContainerGap()));
        pnlDados6Layout.setVerticalGroup(pnlDados6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlDados6Layout.createSequentialGroup().addContainerGap().addComponent(this.g, -1, 343, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDados6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.r).addComponent(this.l).addComponent(this.o)).addContainerGap()));
        this.b.addTab("Cupons Fiscais Vinculados \u00e0 NF-e", this.w);
        GroupLayout pnlDadosLayout = new GroupLayout(this.s);
        this.s.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(pnlDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlDadosLayout.createSequentialGroup().addGap(4, 4, 4).addComponent(this.b).addGap(74, 74, 74)));
        pnlDadosLayout.setVerticalGroup(pnlDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDadosLayout.createSequentialGroup().addGap(4, 4, 4).addComponent(this.b).addGap(11, 11, 11)));
        this.d.addTab("Dados da NF-e", this.s);
        this.D.setBorder(BorderFactory.createTitledBorder(null, "Identifica\u00e7\u00e3o", 1, 2));
        this.J.setFont(new Font("Tahoma", 1, 11));
        this.J.setText("* CNPJ");
        this.w.setEditable(false);
        this.w.setHorizontalAlignment(2);
        this.w.setEnabled(false);
        this.O.setFont(new Font("Tahoma", 1, 11));
        this.O.setText("* Raz\u00e3o Social");
        this.N.setFont(new Font("Tahoma", 1, 11));
        this.N.setText("Nome Fantasia");
        this.K.setFont(new Font("Tahoma", 1, 11));
        this.K.setText("* Inscri\u00e7\u00e3o Estadual");
        this.L.setFont(new Font("Tahoma", 1, 11));
        this.L.setText("Insc. Est. do Subst. Tribut\u00e1rio");
        this.M.setFont(new Font("Tahoma", 1, 11));
        this.M.setText("Inscri\u00e7\u00e3o Municipal");
        this.I.setFont(new Font("Tahoma", 1, 11));
        this.I.setText("CNAE");
        this.v.setHorizontalAlignment(4);
        this.ap.setFont(new Font("Tahoma", 1, 11));
        this.ap.setText("* Regime Tribut\u00e1rio");
        GroupLayout pnlEmitente1Layout = new GroupLayout(this.D);
        this.D.setLayout(pnlEmitente1Layout);
        pnlEmitente1Layout.setHorizontalGroup(pnlEmitente1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlEmitente1Layout.createSequentialGroup().addContainerGap().addGroup(pnlEmitente1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlEmitente1Layout.createSequentialGroup().addGroup(pnlEmitente1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.N).addComponent(this.O).addComponent(this.J).addComponent(this.K).addComponent(this.M)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlEmitente1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlEmitente1Layout.createSequentialGroup().addGroup(pnlEmitente1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.w, -2, 240, -2).addGroup(pnlEmitente1Layout.createSequentialGroup().addGroup(pnlEmitente1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.z, GroupLayout.Alignment.LEADING).addComponent(this.x, GroupLayout.Alignment.LEADING, -1, 165, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlEmitente1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.L).addComponent(this.I)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlEmitente1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.v, -2, 109, -2).addComponent(this.y, -2, 158, -2))).addComponent(this.r, 0, 614, 32767)).addGap(244, 244, 244)).addComponent(this.p, -1, 858, 32767).addComponent(this.n, -1, 858, 32767))).addComponent(this.ap)).addContainerGap()));
        pnlEmitente1Layout.setVerticalGroup(pnlEmitente1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlEmitente1Layout.createSequentialGroup().addGroup(pnlEmitente1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.w, -2, -1, -2).addComponent(this.J)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlEmitente1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.O).addComponent(this.p, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlEmitente1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.N).addComponent(this.n, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlEmitente1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.x, -2, -1, -2).addComponent(this.K).addComponent(this.L).addComponent(this.y, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlEmitente1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.M).addComponent(this.z, -2, -1, -2).addComponent(this.I).addComponent(this.v, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlEmitente1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ap).addComponent(this.r, -2, -1, -2)).addContainerGap(53, 32767)));
        this.r.setBorder(BorderFactory.createTitledBorder("Endere\u00e7o"));
        this.bJ.setFont(new Font("Tahoma", 1, 11));
        this.bJ.setText("* Logradouro");
        this.an.setFont(new Font("Tahoma", 1, 11));
        this.an.setText("* N\u00famero");
        this.k.setHorizontalAlignment(4);
        this.bH.setFont(new Font("Tahoma", 1, 11));
        this.bH.setText("Complemento");
        this.bE.setFont(new Font("Tahoma", 1, 11));
        this.bE.setText("* Bairro");
        this.i.setFont(new Font("Tahoma", 1, 11));
        this.i.setText("* CEP");
        this.u.setHorizontalAlignment(4);
        this.bO.setFont(new Font("Tahoma", 1, 11));
        this.bO.setText("Pa\u00eds");
        this.m.setEnabled(false);
        this.bv.setFont(new Font("Tahoma", 1, 11));
        this.bv.setText("* UF");
        this.bL.setFont(new Font("Tahoma", 1, 11));
        this.bL.setText("* Munic\u00edpio");
        this.P.setFont(new Font("Tahoma", 1, 11));
        this.P.setText("Fone");
        this.S.setHorizontalAlignment(4);
        ((AbstractDocument)this.S.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(14));
        GroupLayout pnlContatoCliente1Layout = new GroupLayout(this.r);
        this.r.setLayout(pnlContatoCliente1Layout);
        pnlContatoCliente1Layout.setHorizontalGroup(pnlContatoCliente1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlContatoCliente1Layout.createSequentialGroup().addContainerGap().addGroup(pnlContatoCliente1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlContatoCliente1Layout.createSequentialGroup().addGroup(pnlContatoCliente1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.bH).addComponent(this.bJ)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlContatoCliente1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlContatoCliente1Layout.createSequentialGroup().addComponent(this.m, -1, 308, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.l, -1, 383, 32767)).addComponent(this.o, -1, 743, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlContatoCliente1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.i).addComponent(this.an)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlContatoCliente1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.u, -2, 87, -2).addComponent(this.k, -2, 87, -2))).addGroup(pnlContatoCliente1Layout.createSequentialGroup().addGroup(pnlContatoCliente1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.bO).addComponent(this.P)).addGroup(pnlContatoCliente1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlContatoCliente1Layout.createSequentialGroup().addGap(14, 14, 14).addComponent(this.m, 0, 299, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bv).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.n, -2, 105, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bL).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.l, 0, 427, 32767)).addGroup(pnlContatoCliente1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.S, -2, 158, -2))))).addContainerGap()));
        pnlContatoCliente1Layout.setVerticalGroup(pnlContatoCliente1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlContatoCliente1Layout.createSequentialGroup().addGroup(pnlContatoCliente1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bJ).addComponent(this.k, -2, -1, -2).addComponent(this.an).addComponent(this.o, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlContatoCliente1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bH).addComponent(this.m, -2, -1, -2).addComponent(this.bE).addComponent(this.u, -2, -1, -2).addComponent(this.i).addComponent(this.l, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlContatoCliente1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bO).addComponent(this.bv).addComponent(this.n, -2, -1, -2).addComponent(this.bL).addComponent(this.l, -2, -1, -2).addComponent(this.m, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlContatoCliente1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.P).addComponent(this.S, -2, -1, -2)).addContainerGap(54, 32767)));
        GroupLayout pnlEmitenteLayout = new GroupLayout(this.C);
        this.C.setLayout(pnlEmitenteLayout);
        pnlEmitenteLayout.setHorizontalGroup(pnlEmitenteLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlEmitenteLayout.createSequentialGroup().addContainerGap().addGroup(pnlEmitenteLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.D, -1, -1, 32767).addComponent(this.r, -1, -1, 32767)).addContainerGap()));
        pnlEmitenteLayout.setVerticalGroup(pnlEmitenteLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlEmitenteLayout.createSequentialGroup().addContainerGap().addComponent(this.D, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.r, -2, -1, -2).addContainerGap(19, 32767)));
        this.d.addTab("Emitente", this.C);
        this.z.setBorder(BorderFactory.createTitledBorder("Identifica\u00e7\u00e3o"));
        this.B.setFont(new Font("Tahoma", 1, 11));
        this.B.setText("Tipo de documento");
        this.A.setFont(new Font("Tahoma", 1, 11));
        this.A.setText("Documento");
        this.t.setHorizontalAlignment(2);
        this.t.setEnabled(false);
        this.D.setFont(new Font("Tahoma", 1, 11));
        this.D.setText("Raz\u00e3o social/Nome");
        this.x.setFont(new Font("Tahoma", 1, 11));
        this.x.setText("Inscri\u00e7\u00e3o Estadual");
        this.q.setHorizontalAlignment(4);
        this.y.setFont(new Font("Tahoma", 1, 11));
        this.y.setText("Inscri\u00e7\u00e3o SUFRAMA");
        this.s.setHorizontalAlignment(4);
        this.v.setFont(new Font("Dialog", 0, 12));
        this.v.setText("Pesquisar");
        this.v.setMargin(new Insets(1, 4, 1, 4));
        this.t.setFont(new Font("Dialog", 0, 12));
        this.t.setText("Consultar Cadastro");
        this.t.setMargin(new Insets(1, 4, 1, 4));
        this.E.setFont(new Font("Tahoma", 1, 11));
        this.E.setText("E-mail");
        this.C.setFont(new Font("Tahoma", 1, 11));
        this.C.setText("Tipo de contribuinte");
        this.g.addItemListener((ItemListener)new /* Unavailable Anonymous Inner Class!! */);
        this.z.setFont(new Font("Tahoma", 1, 11));
        this.z.setText("Inscri\u00e7\u00e3o Municipal");
        this.r.setHorizontalAlignment(4);
        GroupLayout pnlDestIdLayout = new GroupLayout(this.z);
        this.z.setLayout(pnlDestIdLayout);
        pnlDestIdLayout.setHorizontalGroup(pnlDestIdLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDestIdLayout.createSequentialGroup().addGroup(pnlDestIdLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDestIdLayout.createSequentialGroup().addGap(142, 142, 142).addComponent(this.j, -1, 843, 32767)).addGroup(pnlDestIdLayout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.E).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e, -1, 936, 32767))).addGap(10, 10, 10)).addGroup(pnlDestIdLayout.createSequentialGroup().addGroup(pnlDestIdLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDestIdLayout.createSequentialGroup().addContainerGap().addGroup(pnlDestIdLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDestIdLayout.createSequentialGroup().addGroup(pnlDestIdLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.D).addComponent(this.C)).addGap(1, 1, 1).addComponent(this.g, -2, 139, -2)).addGroup(pnlDestIdLayout.createSequentialGroup().addComponent(this.y).addGap(10, 10, 10).addComponent(this.s, -2, 140, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDestIdLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.z).addComponent(this.x)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDestIdLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.q, -1, 233, 32767).addComponent(this.r))).addGroup(pnlDestIdLayout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.B).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.h, -2, 110, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.A).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.t, -2, 184, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.v).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.t))).addContainerGap(284, 32767)));
        pnlDestIdLayout.setVerticalGroup(pnlDestIdLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDestIdLayout.createSequentialGroup().addGroup(pnlDestIdLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.B).addComponent(this.h, -2, -1, -2).addComponent(this.A).addComponent(this.v).addComponent(this.t).addComponent(this.t, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDestIdLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.D).addComponent(this.j, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDestIdLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.x).addComponent(this.q, -2, -1, -2).addComponent(this.C).addComponent(this.g, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDestIdLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.y).addComponent(this.s, -2, -1, -2).addComponent(this.z).addComponent(this.r, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDestIdLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.E).addComponent(this.e, -2, -1, -2)).addContainerGap(-1, 32767)));
        this.A.setBorder(BorderFactory.createTitledBorder("Local Retirada/Entrega"));
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("Local de retirada diferente do emitente");
        this.b.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.b.setMargin(new Insets(0, 0, 0, 0));
        this.w.setText("Endere\u00e7o");
        this.a.setFont(new Font("Tahoma", 1, 11));
        this.a.setText("Local de entrega diferente do destinat\u00e1rio");
        this.a.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.a.setMargin(new Insets(0, 0, 0, 0));
        this.u.setText("Endere\u00e7o");
        GroupLayout pnlDestRetiradaEntregaLayout = new GroupLayout(this.A);
        this.A.setLayout(pnlDestRetiradaEntregaLayout);
        pnlDestRetiradaEntregaLayout.setHorizontalGroup(pnlDestRetiradaEntregaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDestRetiradaEntregaLayout.createSequentialGroup().addContainerGap().addGroup(pnlDestRetiradaEntregaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b).addComponent(this.a)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDestRetiradaEntregaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.w).addComponent(this.u)).addGap(350, 350, 350)));
        pnlDestRetiradaEntregaLayout.setVerticalGroup(pnlDestRetiradaEntregaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDestRetiradaEntregaLayout.createSequentialGroup().addGroup(pnlDestRetiradaEntregaLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.w)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDestRetiradaEntregaLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.u))));
        this.y.setBorder(BorderFactory.createTitledBorder("Endere\u00e7o"));
        this.bK.setFont(new Font("Tahoma", 1, 11));
        this.bK.setText("* Logradouro");
        this.ao.setFont(new Font("Tahoma", 1, 11));
        this.ao.setText("* N\u00famero");
        this.f.setHorizontalAlignment(4);
        this.bI.setFont(new Font("Tahoma", 1, 11));
        this.bI.setText("Complemento");
        this.bF.setFont(new Font("Tahoma", 1, 11));
        this.bF.setText("* Bairro");
        this.j.setFont(new Font("Tahoma", 1, 11));
        this.j.setText("CEP");
        this.p.setHorizontalAlignment(4);
        this.bP.setFont(new Font("Tahoma", 1, 11));
        this.bP.setText("Pa\u00eds");
        this.bw.setFont(new Font("Tahoma", 1, 11));
        this.bw.setText("* UF");
        this.bM.setFont(new Font("Tahoma", 1, 11));
        this.bM.setText("* Munic\u00edpio");
        this.Q.setFont(new Font("Tahoma", 1, 11));
        this.Q.setText("Fone");
        this.R.setHorizontalAlignment(4);
        ((AbstractDocument)this.R.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(14));
        GroupLayout pnlDestContatoLayout = new GroupLayout(this.y);
        this.y.setLayout(pnlDestContatoLayout);
        pnlDestContatoLayout.setHorizontalGroup(pnlDestContatoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDestContatoLayout.createSequentialGroup().addContainerGap().addGroup(pnlDestContatoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDestContatoLayout.createSequentialGroup().addGroup(pnlDestContatoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.bI).addComponent(this.bK)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDestContatoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDestContatoLayout.createSequentialGroup().addComponent(this.h, -1, 323, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bF).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.g, -1, 368, 32767)).addComponent(this.i, -1, 743, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDestContatoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.j).addComponent(this.ao)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDestContatoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.p, -2, 87, -2).addComponent(this.f, -2, 87, -2))).addGroup(pnlDestContatoLayout.createSequentialGroup().addGroup(pnlDestContatoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.bP).addComponent(this.Q)).addGroup(pnlDestContatoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDestContatoLayout.createSequentialGroup().addGap(14, 14, 14).addComponent(this.k, 0, 314, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bw).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.i, -2, 105, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bM).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.j, 0, 412, 32767)).addGroup(pnlDestContatoLayout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.R, -2, 158, -2))))).addContainerGap()));
        pnlDestContatoLayout.setVerticalGroup(pnlDestContatoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDestContatoLayout.createSequentialGroup().addGroup(pnlDestContatoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bK).addComponent(this.f, -2, -1, -2).addComponent(this.ao).addComponent(this.i, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDestContatoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bI).addComponent(this.h, -2, -1, -2).addComponent(this.bF).addComponent(this.p, -2, -1, -2).addComponent(this.j).addComponent(this.g, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDestContatoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bP).addComponent(this.bw).addComponent(this.i, -2, -1, -2).addComponent(this.bM).addComponent(this.j, -2, -1, -2).addComponent(this.k, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDestContatoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Q).addComponent(this.R, -2, -1, -2)).addContainerGap(-1, 32767)));
        GroupLayout pnlDestinatarioLayout = new GroupLayout(this.B);
        this.B.setLayout(pnlDestinatarioLayout);
        pnlDestinatarioLayout.setHorizontalGroup(pnlDestinatarioLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDestinatarioLayout.createSequentialGroup().addContainerGap().addGroup(pnlDestinatarioLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.z, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.A, -1, -1, 32767).addComponent(this.y, GroupLayout.Alignment.TRAILING, -1, -1, 32767)).addContainerGap()));
        pnlDestinatarioLayout.setVerticalGroup(pnlDestinatarioLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDestinatarioLayout.createSequentialGroup().addContainerGap().addComponent(this.z, -2, 152, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.y, -2, 127, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.A, -2, -1, -2).addContainerGap(60, 32767)));
        this.d.addTab("Destinat\u00e1rio/Remetente", this.B);
        this.R.setBorder(BorderFactory.createTitledBorder(null, "Produtos e Servi\u00e7os da NF-e", 1, 2));
        this.U.setText("Incluir");
        this.S.setText("Detalhar");
        this.T.setText("Excluir");
        GroupLayout pnlProdutos1Layout = new GroupLayout(this.R);
        this.R.setLayout(pnlProdutos1Layout);
        pnlProdutos1Layout.setHorizontalGroup(pnlProdutos1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlProdutos1Layout.createSequentialGroup().addContainerGap().addGroup(pnlProdutos1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.m, -1, 955, 32767).addGroup(pnlProdutos1Layout.createSequentialGroup().addComponent(this.U).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.S).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.T))).addContainerGap()));
        pnlProdutos1Layout.linkSize(0, this.S, this.T, this.U);
        pnlProdutos1Layout.setVerticalGroup(pnlProdutos1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlProdutos1Layout.createSequentialGroup().addContainerGap().addComponent(this.m, -1, 352, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlProdutos1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.U).addComponent(this.S).addComponent(this.T))));
        GroupLayout pnlProdutosLayout = new GroupLayout(this.Q);
        this.Q.setLayout(pnlProdutosLayout);
        pnlProdutosLayout.setHorizontalGroup(pnlProdutosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlProdutosLayout.createSequentialGroup().addContainerGap().addComponent(this.R, -1, -1, 32767).addContainerGap()));
        pnlProdutosLayout.setVerticalGroup(pnlProdutosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlProdutosLayout.createSequentialGroup().addContainerGap().addComponent(this.R, -1, -1, 32767).addContainerGap()));
        this.d.addTab("Produtos e Servi\u00e7os", this.Q);
        this.av.setFont(new Font("Tahoma", 1, 11));
        this.av.setText("* Base de c\u00e1lculo");
        this.w.setEditable(false);
        this.w.setHorizontalAlignment(4);
        this.w.setEnabled(false);
        this.w.setFocusable(false);
        this.aF.setFont(new Font("Tahoma", 1, 11));
        this.aF.setText("* Total do ICMS");
        this.F.setEditable(false);
        this.F.setHorizontalAlignment(4);
        this.F.setEnabled(false);
        this.F.setFocusable(false);
        this.az.setFont(new Font("Tahoma", 1, 11));
        this.az.setText("* Base de c\u00e1lculo do ICMS ST");
        this.A.setEditable(false);
        this.A.setHorizontalAlignment(4);
        this.A.setEnabled(false);
        this.A.setFocusable(false);
        this.aV.setFont(new Font("Tahoma", 1, 11));
        this.aV.setText("* Total do ICMS ST");
        this.U.setEditable(false);
        this.U.setHorizontalAlignment(4);
        this.U.setEnabled(false);
        this.U.setFocusable(false);
        this.aQ.setFont(new Font("Tahoma", 1, 11));
        this.aQ.setText("* Total dos produtos e servi\u00e7os");
        this.O.setEditable(false);
        this.O.setHorizontalAlignment(4);
        this.O.setEnabled(false);
        this.O.setFocusable(false);
        this.aE.setFont(new Font("Tahoma", 1, 11));
        this.aE.setText("* Total do frete");
        this.E.setEditable(false);
        this.E.setHorizontalAlignment(4);
        this.E.setEnabled(false);
        this.E.setFocusable(false);
        this.aW.setFont(new Font("Tahoma", 1, 11));
        this.aW.setText("* Total do seguro");
        this.V.setEditable(false);
        this.V.setHorizontalAlignment(4);
        this.V.setEnabled(false);
        this.V.setFocusable(false);
        this.aD.setFont(new Font("Tahoma", 1, 11));
        this.aD.setText("* Total do desconto");
        this.D.setEditable(false);
        this.D.setHorizontalAlignment(4);
        this.D.setEnabled(false);
        this.D.setFocusable(false);
        this.aH.setFont(new Font("Tahoma", 1, 11));
        this.aH.setText("* Total do II");
        this.H.setEditable(false);
        this.H.setHorizontalAlignment(4);
        this.H.setEnabled(false);
        this.H.setFocusable(false);
        this.aI.setFont(new Font("Tahoma", 1, 11));
        this.aI.setText("* Total do IPI");
        this.I.setEditable(false);
        this.I.setHorizontalAlignment(4);
        this.I.setEnabled(false);
        this.I.setFocusable(false);
        this.aO.setFont(new Font("Tahoma", 1, 11));
        this.aO.setText("* PIS");
        this.M.setEditable(false);
        this.M.setHorizontalAlignment(4);
        this.M.setEnabled(false);
        this.M.setFocusable(false);
        this.aA.setFont(new Font("Tahoma", 1, 11));
        this.aA.setText("* COFINS");
        this.B.setEditable(false);
        this.B.setHorizontalAlignment(4);
        this.B.setEnabled(false);
        this.B.setFocusable(false);
        this.aN.setFont(new Font("Tahoma", 1, 11));
        this.aN.setText("* Outras despesas acess\u00f3rias");
        this.L.setEditable(false);
        this.L.setHorizontalAlignment(4);
        this.L.setEnabled(false);
        this.L.setFocusable(false);
        this.aL.setFont(new Font("Tahoma", 1, 11));
        this.aL.setText("* Total da nota");
        this.K.setHorizontalAlignment(4);
        this.V.setText("Calcular");
        this.aG.setFont(new Font("Tahoma", 1, 11));
        this.aG.setText("* Total do ICMS Desonerado");
        this.G.setEditable(false);
        this.G.setHorizontalAlignment(4);
        this.G.setEnabled(false);
        this.G.setFocusable(false);
        GroupLayout pnlTotICMSLayout = new GroupLayout(this.U);
        this.U.setLayout(pnlTotICMSLayout);
        pnlTotICMSLayout.setHorizontalGroup(pnlTotICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTotICMSLayout.createSequentialGroup().addContainerGap().addGroup(pnlTotICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.av, -2, 176, -2).addComponent(this.aH, -2, 176, -2).addComponent(this.aN).addGroup(pnlTotICMSLayout.createSequentialGroup().addGroup(pnlTotICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.w).addComponent(this.O).addComponent(this.aQ, -1, -1, 32767).addComponent(this.H).addComponent(this.L)).addGap(3, 3, 3))).addGap(9, 9, 9).addGroup(pnlTotICMSLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(pnlTotICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.aF, -2, 176, -2).addComponent(this.F).addComponent(this.aE, -2, 176, -2).addComponent(this.E).addComponent(this.I).addComponent(this.aI, -2, 176, -2)).addGroup(pnlTotICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.aG, -2, 176, -2).addComponent(this.G, -2, 176, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTotICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.aW, -2, 176, -2).addComponent(this.aO, -2, 176, -2).addGroup(GroupLayout.Alignment.TRAILING, pnlTotICMSLayout.createSequentialGroup().addGroup(pnlTotICMSLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(pnlTotICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.aL, -2, 176, -2).addComponent(this.K, -2, 176, -2)).addComponent(this.az, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.A, GroupLayout.Alignment.LEADING).addComponent(this.V, GroupLayout.Alignment.LEADING).addComponent(this.M, GroupLayout.Alignment.LEADING)).addGap(3, 3, 3))).addGap(15, 15, 15).addGroup(pnlTotICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.V).addGroup(pnlTotICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.aV, -2, 176, -2).addComponent(this.U).addComponent(this.aD, -2, 176, -2).addComponent(this.D).addComponent(this.aA, -2, 176, -2).addComponent(this.B))).addContainerGap(242, 32767)));
        pnlTotICMSLayout.setVerticalGroup(pnlTotICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTotICMSLayout.createSequentialGroup().addContainerGap().addGroup(pnlTotICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.av).addComponent(this.az).addComponent(this.aV).addComponent(this.aF)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTotICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.A, -2, -1, -2).addComponent(this.w, -2, -1, -2).addComponent(this.F, -2, -1, -2).addComponent(this.U, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTotICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.aQ).addComponent(this.aE).addComponent(this.aW).addComponent(this.aD)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTotICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.O, -2, -1, -2).addComponent(this.E, -2, -1, -2).addComponent(this.D, -2, -1, -2).addComponent(this.V, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTotICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.aH).addComponent(this.aI).addComponent(this.aO).addComponent(this.aA)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTotICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.H, -2, -1, -2).addComponent(this.M, -2, -1, -2).addComponent(this.I, -2, -1, -2).addComponent(this.B, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTotICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTotICMSLayout.createSequentialGroup().addGroup(pnlTotICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.aN).addComponent(this.aL)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTotICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.L, -2, -1, -2).addComponent(this.K, -2, -1, -2).addComponent(this.V))).addGroup(pnlTotICMSLayout.createSequentialGroup().addComponent(this.aG).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.G, -2, -1, -2))).addContainerGap(128, 32767)));
        this.c.addTab("ICMS", this.U);
        this.ax.setFont(new Font("Tahoma", 1, 11));
        this.ax.setText("Base de c\u00e1lculo do ISS");
        this.y.setEditable(false);
        this.y.setHorizontalAlignment(4);
        this.y.setEnabled(false);
        this.y.setFocusable(false);
        this.aK.setFont(new Font("Tahoma", 1, 11));
        this.aK.setText("Total do ISS");
        this.J.setEditable(false);
        this.J.setHorizontalAlignment(4);
        this.J.setEnabled(false);
        this.J.setFocusable(false);
        this.aP.setFont(new Font("Tahoma", 1, 11));
        this.aP.setText("PIS sobre servi\u00e7os");
        this.N.setHorizontalAlignment(4);
        this.aB.setFont(new Font("Tahoma", 1, 11));
        this.aB.setText("COFINS sobre servi\u00e7os");
        this.C.setHorizontalAlignment(4);
        this.aX.setFont(new Font("Tahoma", 1, 11));
        this.aX.setText("Total dos servi\u00e7os sob n\u00e3o-incid\u00eancia ou n\u00e3o tributados pelo ICMS");
        this.W.setHorizontalAlignment(4);
        this.R.setFont(new Font("Tahoma", 1, 11));
        this.R.setText("Valor Total das Dedu\u00e7\u00f5es");
        this.A.setHorizontalAlignment(4);
        this.S.setFont(new Font("Tahoma", 1, 11));
        this.S.setText("Valor Total Outras Reten\u00e7\u00f5es");
        this.E.setHorizontalAlignment(4);
        this.T.setFont(new Font("Tahoma", 1, 11));
        this.T.setText("Valor Total Desconto Incondicionado");
        this.C.setHorizontalAlignment(4);
        this.U.setFont(new Font("Tahoma", 1, 11));
        this.U.setText("Valor Total Desconto Condicionado");
        this.B.setHorizontalAlignment(4);
        this.V.setFont(new Font("Tahoma", 1, 11));
        this.V.setText("Valor Total Reten\u00e7\u00e3o ISS");
        this.D.setHorizontalAlignment(4);
        this.I.setHorizontalAlignment(4);
        this.t.setFont(new Font("Tahoma", 1, 11));
        this.t.setText("Data da Presta\u00e7\u00e3o do Servi\u00e7o*");
        this.aC.setFont(new Font("Tahoma", 1, 11));
        this.aC.setText("Regime Especial de Tributa\u00e7\u00e3o");
        GroupLayout pnlTotISSQNLayout = new GroupLayout(this.V);
        this.V.setLayout(pnlTotISSQNLayout);
        pnlTotISSQNLayout.setHorizontalGroup(pnlTotISSQNLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTotISSQNLayout.createSequentialGroup().addGroup(pnlTotISSQNLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTotISSQNLayout.createSequentialGroup().addGroup(pnlTotISSQNLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(pnlTotISSQNLayout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.aX)).addGroup(pnlTotISSQNLayout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.W, -2, 125, -2)).addGroup(pnlTotISSQNLayout.createSequentialGroup().addGap(10, 10, 10).addGroup(pnlTotISSQNLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ax).addComponent(this.y, -2, 176, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(pnlTotISSQNLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.J, GroupLayout.Alignment.TRAILING, -2, 68, -2).addComponent(this.aK, GroupLayout.Alignment.TRAILING))).addGroup(pnlTotISSQNLayout.createSequentialGroup().addContainerGap().addGroup(pnlTotISSQNLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.C, -2, 176, -2).addGroup(pnlTotISSQNLayout.createSequentialGroup().addGroup(pnlTotISSQNLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.N, -1, 104, 32767).addComponent(this.aP).addGroup(pnlTotISSQNLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.B, GroupLayout.Alignment.LEADING, -1, 176, 32767).addComponent(this.C, GroupLayout.Alignment.LEADING).addComponent(this.A, GroupLayout.Alignment.LEADING).addComponent(this.R, GroupLayout.Alignment.LEADING)).addComponent(this.T)).addGroup(pnlTotISSQNLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTotISSQNLayout.createSequentialGroup().addGap(22, 22, 22).addGroup(pnlTotISSQNLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.D, -2, 176, -2).addComponent(this.V).addComponent(this.E, -2, 176, -2).addComponent(this.S))).addGroup(GroupLayout.Alignment.TRAILING, pnlTotISSQNLayout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.aB))))))).addGap(39, 39, 39).addGroup(pnlTotISSQNLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTotISSQNLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.t, -1, -1, 32767).addComponent(this.I, -2, 173, -2)).addGroup(pnlTotISSQNLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.s, GroupLayout.Alignment.LEADING, 0, -1, 32767).addComponent(this.aC, GroupLayout.Alignment.LEADING)))).addGroup(pnlTotISSQNLayout.createSequentialGroup().addContainerGap().addComponent(this.U))).addContainerGap(366, 32767)));
        pnlTotISSQNLayout.linkSize(0, this.ax, this.aB, this.aK, this.aP, this.y, this.J, this.N, this.W);
        pnlTotISSQNLayout.setVerticalGroup(pnlTotISSQNLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTotISSQNLayout.createSequentialGroup().addContainerGap().addGroup(pnlTotISSQNLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(pnlTotISSQNLayout.createSequentialGroup().addGroup(pnlTotISSQNLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTotISSQNLayout.createSequentialGroup().addComponent(this.ax).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.y, -2, -1, -2)).addGroup(pnlTotISSQNLayout.createSequentialGroup().addComponent(this.aK).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.J, -2, -1, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTotISSQNLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTotISSQNLayout.createSequentialGroup().addComponent(this.aB).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.C, -2, -1, -2)).addGroup(pnlTotISSQNLayout.createSequentialGroup().addComponent(this.aP).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.N, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.aX).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.W, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTotISSQNLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.R).addComponent(this.S)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTotISSQNLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.A, -2, -1, -2).addComponent(this.E, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTotISSQNLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.T).addComponent(this.V)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(pnlTotISSQNLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.C, -2, -1, -2).addComponent(this.D, -2, -1, -2))))).addGroup(pnlTotISSQNLayout.createSequentialGroup().addComponent(this.t).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.I, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.aC).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.s, -2, -1, -2).addGap(143, 143, 143))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.U).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.B, -2, -1, -2).addContainerGap(34, 32767)));
        this.c.addTab("ISSQN", this.V);
        this.aT.setFont(new Font("Tahoma", 1, 11));
        this.aT.setText("Valor retido de PIS");
        this.R.setHorizontalAlignment(4);
        this.aR.setFont(new Font("Tahoma", 1, 11));
        this.aR.setText("Valor retido de COFINS");
        this.P.setHorizontalAlignment(4);
        this.aS.setFont(new Font("Tahoma", 1, 11));
        this.aS.setText("Valor retido de CSLL");
        this.Q.setHorizontalAlignment(4);
        this.aw.setFont(new Font("Tahoma", 1, 11));
        this.aw.setText("Base de c\u00e1lculo do IRRF");
        this.x.setHorizontalAlignment(4);
        this.aJ.setFont(new Font("Tahoma", 1, 11));
        this.aJ.setText("Valor retido do IRRF");
        this.T.setHorizontalAlignment(4);
        this.ay.setFont(new Font("Tahoma", 1, 11));
        this.ay.setText("BC da Reten\u00e7\u00e3o da Prev. Social");
        this.z.setHorizontalAlignment(4);
        this.aU.setFont(new Font("Tahoma", 1, 11));
        this.aU.setText("Reten\u00e7\u00e3o da Prev. Social");
        this.S.setHorizontalAlignment(4);
        GroupLayout pnlTotRetencaoLayout = new GroupLayout(this.W);
        this.W.setLayout(pnlTotRetencaoLayout);
        pnlTotRetencaoLayout.setHorizontalGroup(pnlTotRetencaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTotRetencaoLayout.createSequentialGroup().addContainerGap().addGroup(pnlTotRetencaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTotRetencaoLayout.createSequentialGroup().addGroup(pnlTotRetencaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.aT, -2, 176, -2).addComponent(this.R, -1, 176, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTotRetencaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.P, -2, 176, -2).addComponent(this.aR, -2, 176, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTotRetencaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.aS, -2, 176, -2).addComponent(this.Q, -2, 176, -2))).addGroup(pnlTotRetencaoLayout.createSequentialGroup().addGroup(pnlTotRetencaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.x, -2, 176, -2).addComponent(this.aw, -2, 176, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTotRetencaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.T, -2, 176, -2).addComponent(this.aJ, -2, 176, -2))).addGroup(pnlTotRetencaoLayout.createSequentialGroup().addGroup(pnlTotRetencaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.z, -2, 176, -2).addComponent(this.ay, -2, 176, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTotRetencaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.aU, -2, 176, -2).addComponent(this.S, -2, 176, -2)))).addContainerGap(442, 32767)));
        pnlTotRetencaoLayout.linkSize(0, this.aw, this.ay, this.aJ, this.aR, this.aS, this.aT, this.aU, this.x, this.z, this.P, this.Q, this.R, this.S, this.T);
        pnlTotRetencaoLayout.setVerticalGroup(pnlTotRetencaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTotRetencaoLayout.createSequentialGroup().addContainerGap().addGroup(pnlTotRetencaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTotRetencaoLayout.createSequentialGroup().addComponent(this.aT).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.R, -2, -1, -2)).addGroup(pnlTotRetencaoLayout.createSequentialGroup().addComponent(this.aR).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.P, -2, -1, -2)).addGroup(pnlTotRetencaoLayout.createSequentialGroup().addComponent(this.aS).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Q, -2, -1, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTotRetencaoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(pnlTotRetencaoLayout.createSequentialGroup().addComponent(this.aw).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.x, -2, -1, -2)).addGroup(pnlTotRetencaoLayout.createSequentialGroup().addComponent(this.aJ).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.T, -2, -1, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTotRetencaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTotRetencaoLayout.createSequentialGroup().addComponent(this.ay).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.z, -2, -1, -2)).addGroup(pnlTotRetencaoLayout.createSequentialGroup().addComponent(this.aU).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.S, -2, -1, -2))).addGap(12, 12, 12)));
        this.c.addTab("Reten\u00e7\u00e3o de Tributos", this.W);
        this.ag.setFont(new Font("Dialog", 0, 12));
        this.ag.setForeground(Color.red);
        this.a.setHorizontalAlignment(4);
        this.aM.setFont(new Font("Tahoma", 1, 11));
        this.aM.setText(" Total dos Tributos\u00b9");
        this.bu.setFont(new Font("Dialog", 2, 12));
        this.bu.setText("<html><p>\u00b9 Valor aproximado total de tributos federais, estaduais e municipais conforme disposto na Lei n\u00ba 12.741/12. </p></html>");
        GroupLayout jPanel7Layout = new GroupLayout(this.k);
        this.k.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -2, 176, -2).addComponent(this.aM, -2, 176, -2)).addGap(88, 88, 88).addComponent(this.bu, -2, 317, -2).addContainerGap(-1, 32767)));
        jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addComponent(this.aM).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, -1, -2)).addComponent(this.bu, -2, 53, -2))));
        GroupLayout pnlTotaisLayout = new GroupLayout(this.X);
        this.X.setLayout(pnlTotaisLayout);
        pnlTotaisLayout.setHorizontalGroup(pnlTotaisLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlTotaisLayout.createSequentialGroup().addContainerGap().addComponent(this.ag, -1, -1, 32767).addContainerGap()).addGroup(GroupLayout.Alignment.TRAILING, pnlTotaisLayout.createSequentialGroup().addComponent(this.k, -1, -1, 32767).addGap(20, 20, 20)).addGroup(pnlTotaisLayout.createSequentialGroup().addComponent(this.c, -2, 0, 32767).addContainerGap()));
        pnlTotaisLayout.setVerticalGroup(pnlTotaisLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTotaisLayout.createSequentialGroup().addComponent(this.k, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -2, 348, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ag, -1, 2, 32767).addContainerGap()));
        this.d.addTab("Totais", this.X);
        this.ag.setBorder(BorderFactory.createTitledBorder(""));
        this.bh.setFont(new Font("Tahoma", 1, 11));
        this.bh.setText("* Modalidade do frete");
        this.i.setBorder(BorderFactory.createTitledBorder("Endere\u00e7o"));
        this.bs.setFont(new Font("Tahoma", 1, 11));
        this.bs.setText("Logradouro");
        this.bl.setFont(new Font("Tahoma", 1, 11));
        this.bl.setText("UF");
        this.ah.setFont(new Font("Tahoma", 1, 11));
        this.ah.setText("Munic\u00edpio");
        GroupLayout jPanel5Layout = new GroupLayout(this.i);
        this.i.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.bs).addComponent(this.bl)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addComponent(this.A, -2, 76, -2).addGap(47, 47, 47).addComponent(this.ah).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.C, 0, 679, 32767)).addComponent(this.Y, -1, 859, 32767)).addContainerGap()));
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bs).addComponent(this.Y, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bl).addComponent(this.A, -2, -1, -2).addComponent(this.ah).addComponent(this.C, -2, -1, -2)).addContainerGap(66, 32767)));
        this.j.setBorder(BorderFactory.createTitledBorder("Identifica\u00e7\u00e3o"));
        this.bk.setFont(new Font("Tahoma", 1, 11));
        this.bk.setText("Tipo de documento");
        this.bt.setFont(new Font("Tahoma", 1, 11));
        this.bt.setText("Raz\u00e3o Social/Nome");
        this.bg.setFont(new Font("Tahoma", 1, 11));
        this.bg.setText("Inscri\u00e7\u00e3o Estadual");
        this.bi.setFont(new Font("Tahoma", 1, 11));
        this.bi.setText("CNPJ/CPF");
        this.K.setHorizontalAlignment(2);
        this.K.setEnabled(false);
        this.X.setFont(new Font("Dialog", 0, 12));
        this.X.setText("Pesquisar");
        this.X.setMargin(new Insets(1, 4, 1, 4));
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText("Isento do ICMS");
        this.d.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.d.setMargin(new Insets(0, 0, 0, 0));
        this.d.addItemListener((ItemListener)new /* Unavailable Anonymous Inner Class!! */);
        this.W.setFont(new Font("Dialog", 0, 12));
        this.W.setText("Consultar Cadastro");
        this.W.setMargin(new Insets(1, 4, 1, 4));
        GroupLayout jPanel6Layout = new GroupLayout(this.j);
        this.j.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.bk).addComponent(this.bt).addComponent(this.bg)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.J, -2, 178, -2).addGroup(jPanel6Layout.createSequentialGroup().addComponent(this.z, -2, 67, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bi).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.K, -2, 158, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.X).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.W)).addComponent(this.Z, -1, 803, 32767))).addComponent(this.d)).addContainerGap()));
        jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bk).addComponent(this.z, -2, -1, -2).addComponent(this.bi).addComponent(this.K, -2, -1, -2).addComponent(this.X).addComponent(this.W)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bt).addComponent(this.Z, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bg).addComponent(this.J, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d)));
        GroupLayout pnlTransTransportadorLayout = new GroupLayout(this.ab);
        this.ab.setLayout(pnlTransTransportadorLayout);
        pnlTransTransportadorLayout.setHorizontalGroup(pnlTransTransportadorLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTransTransportadorLayout.createSequentialGroup().addContainerGap().addGroup(pnlTransTransportadorLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.i, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.j, GroupLayout.Alignment.TRAILING, -1, -1, 32767)).addContainerGap()));
        pnlTransTransportadorLayout.setVerticalGroup(pnlTransTransportadorLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTransTransportadorLayout.createSequentialGroup().addContainerGap().addComponent(this.j, -2, 118, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.i, -2, -1, -2).addContainerGap(86, 32767)));
        this.e.addTab("Transportador", this.ab);
        this.bm.setFont(new Font("Tahoma", 1, 11));
        this.bm.setText("Base de C\u00e1lculo");
        this.M.setHorizontalAlignment(4);
        this.bj.setFont(new Font("Tahoma", 1, 11));
        this.bj.setText("Al\u00edquota");
        this.L.setHorizontalAlignment(4);
        this.bo.setFont(new Font("Tahoma", 1, 11));
        this.bo.setText("Valor do Servi\u00e7o");
        this.O.setHorizontalAlignment(4);
        this.bf.setFont(new Font("Tahoma", 1, 11));
        this.bf.setText("UF");
        this.be.setFont(new Font("Tahoma", 1, 11));
        this.be.setText("Munic\u00edpio");
        this.bd.setFont(new Font("Tahoma", 1, 11));
        this.bd.setText("CFOP");
        this.bn.setFont(new Font("Tahoma", 1, 11));
        this.bn.setText("ICMS Retido");
        this.N.setEditable(false);
        this.N.setHorizontalAlignment(4);
        this.N.setEnabled(false);
        this.N.setFocusable(false);
        GroupLayout pnlTransICMSLayout = new GroupLayout(this.Y);
        this.Y.setLayout(pnlTransICMSLayout);
        pnlTransICMSLayout.setHorizontalGroup(pnlTransICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTransICMSLayout.createSequentialGroup().addContainerGap().addGroup(pnlTransICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.bf).addComponent(this.bm).addComponent(this.bn)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTransICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.N).addComponent(this.x, -2, 63, -2).addComponent(this.M, -1, 142, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 98, 32767).addGroup(pnlTransICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.be).addComponent(this.bj)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTransICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.w, 0, 260, 32767).addGroup(pnlTransICMSLayout.createSequentialGroup().addComponent(this.L, -1, 118, 32767).addGap(142, 142, 142))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTransICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.bo).addComponent(this.bd)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTransICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.v, -2, 105, -2).addComponent(this.O, -2, 157, -2)).addGap(54, 54, 54)));
        pnlTransICMSLayout.setVerticalGroup(pnlTransICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTransICMSLayout.createSequentialGroup().addContainerGap().addGroup(pnlTransICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bm).addComponent(this.bj).addComponent(this.L, -2, -1, -2).addComponent(this.bo).addComponent(this.M, -2, -1, -2).addComponent(this.O, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTransICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bf).addComponent(this.be).addComponent(this.w, -2, -1, -2).addComponent(this.bd).addComponent(this.v, -2, -1, -2).addComponent(this.x, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTransICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bn).addComponent(this.N, -2, -1, -2)).addContainerGap(273, 32767)));
        this.e.addTab("Reten\u00e7\u00e3o ICMS", this.Y);
        this.a.add(this.c);
        this.m.setBorder(BorderFactory.createTitledBorder(null, "Ve\u00edculo/Reboque", 0, 0, new Font("Arial", 1, 11)));
        this.b.setBorder(BorderFactory.createTitledBorder(null, "Ve\u00edculo", 0, 0, new Font("Arial", 1, 11)));
        this.bp.setFont(new Font("Tahoma", 1, 11));
        this.bp.setText("* Placa");
        this.br.setFont(new Font("Tahoma", 1, 11));
        this.br.setText("* UF");
        this.bq.setFont(new Font("Tahoma", 1, 11));
        this.bq.setText("RNTC");
        GroupLayout jPanel10Layout = new GroupLayout(this.b);
        this.b.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel10Layout.createSequentialGroup().addContainerGap().addComponent(this.bp).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.P, -2, 115, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.br).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.B, -2, 78, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.bq).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.X, -2, 239, -2).addContainerGap(338, 32767)));
        jPanel10Layout.setVerticalGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bp).addComponent(this.P, -2, -1, -2).addComponent(this.B, -2, -1, -2).addComponent(this.br).addComponent(this.bq).addComponent(this.X, -2, -1, -2)));
        this.aa.setBorder(BorderFactory.createTitledBorder(null, "Reboques(5 no M\u00e1ximo)", 0, 0, new Font("Arial", 1, 11)));
        this.aa.setText("Incluir");
        this.Z.setText("Excluir");
        this.Y.setText("Detalhar");
        GroupLayout pnlTransRebLayout = new GroupLayout(this.Z);
        this.Z.setLayout(pnlTransRebLayout);
        pnlTransRebLayout.setHorizontalGroup(pnlTransRebLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 871, 32767));
        pnlTransRebLayout.setVerticalGroup(pnlTransRebLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 136, 32767));
        GroupLayout pnlTransReboqueLayout = new GroupLayout(this.aa);
        this.aa.setLayout(pnlTransReboqueLayout);
        pnlTransReboqueLayout.setHorizontalGroup(pnlTransReboqueLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTransReboqueLayout.createSequentialGroup().addContainerGap().addGroup(pnlTransReboqueLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.Z, -1, -1, 32767).addGroup(pnlTransReboqueLayout.createSequentialGroup().addComponent(this.aa).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Y).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Z))).addContainerGap()));
        pnlTransReboqueLayout.linkSize(0, this.Y, this.Z, this.aa);
        pnlTransReboqueLayout.setVerticalGroup(pnlTransReboqueLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlTransReboqueLayout.createSequentialGroup().addComponent(this.Z, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTransReboqueLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.aa).addComponent(this.Y).addComponent(this.Z)).addContainerGap()));
        GroupLayout jPanel9Layout = new GroupLayout(this.m);
        this.m.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup().addContainerGap().addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.aa, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.b, GroupLayout.Alignment.LEADING, -1, -1, 32767)).addContainerGap()));
        jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel9Layout.createSequentialGroup().addComponent(this.b, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.aa, -1, -1, 32767).addContainerGap()));
        this.a.add(this.a);
        this.a.setFont(new Font("Arial", 1, 11));
        this.a.setText("Identifica\u00e7\u00e3o da Balsa");
        this.a.add(this.b);
        this.b.setFont(new Font("Arial", 1, 11));
        this.b.setText("Identifica\u00e7\u00e3o do Vag\u00e3o");
        GroupLayout pnlTransVeiculoLayout = new GroupLayout(this.ac);
        this.ac.setLayout(pnlTransVeiculoLayout);
        pnlTransVeiculoLayout.setHorizontalGroup(pnlTransVeiculoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTransVeiculoLayout.createSequentialGroup().addContainerGap().addGroup(pnlTransVeiculoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTransVeiculoLayout.createSequentialGroup().addGroup(pnlTransVeiculoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b).addComponent(this.a, -2, 176, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTransVeiculoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.Q).addComponent(this.a, -1, 444, 32767))).addGroup(pnlTransVeiculoLayout.createSequentialGroup().addComponent(this.c).addGap(8, 8, 8).addComponent(this.m, -1, -1, 32767))).addContainerGap()));
        pnlTransVeiculoLayout.linkSize(0, this.a, this.b);
        pnlTransVeiculoLayout.setVerticalGroup(pnlTransVeiculoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTransVeiculoLayout.createSequentialGroup().addContainerGap().addGroup(pnlTransVeiculoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.m, -1, -1, 32767).addGroup(pnlTransVeiculoLayout.createSequentialGroup().addComponent(this.c).addGap(0, 0, 32767))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTransVeiculoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTransVeiculoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.Q, -2, -1, -2)).addContainerGap()));
        this.e.addTab("Ve\u00edculo/Reboque/Balsa/Vag\u00e3o", this.ac);
        this.ad.setText("Incluir");
        this.ab.setText("Detalhar");
        this.ac.setText("Excluir");
        GroupLayout pnlTransVolLayout = new GroupLayout(this.ad);
        this.ad.setLayout(pnlTransVolLayout);
        pnlTransVolLayout.setHorizontalGroup(pnlTransVolLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 948, 32767));
        pnlTransVolLayout.setVerticalGroup(pnlTransVolLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 305, 32767));
        GroupLayout pnlTransVolumesLayout = new GroupLayout(this.ae);
        this.ae.setLayout(pnlTransVolumesLayout);
        pnlTransVolumesLayout.setHorizontalGroup(pnlTransVolumesLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTransVolumesLayout.createSequentialGroup().addContainerGap().addGroup(pnlTransVolumesLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ad, -1, -1, 32767).addGroup(pnlTransVolumesLayout.createSequentialGroup().addComponent(this.ad).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ab).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ac))).addContainerGap()));
        pnlTransVolumesLayout.linkSize(0, this.ab, this.ac, this.ad);
        pnlTransVolumesLayout.setVerticalGroup(pnlTransVolumesLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlTransVolumesLayout.createSequentialGroup().addContainerGap().addComponent(this.ad, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTransVolumesLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ad).addComponent(this.ab).addComponent(this.ac)).addContainerGap()));
        this.e.addTab("Volumes", this.ae);
        GroupLayout pnlTransporte1Layout = new GroupLayout(this.ag);
        this.ag.setLayout(pnlTransporte1Layout);
        pnlTransporte1Layout.setHorizontalGroup(pnlTransporte1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTransporte1Layout.createSequentialGroup().addGroup(pnlTransporte1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTransporte1Layout.createSequentialGroup().addContainerGap().addComponent(this.bh).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.y, -2, 468, -2)).addComponent(this.e, -1, 973, 32767)).addContainerGap()));
        pnlTransporte1Layout.setVerticalGroup(pnlTransporte1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTransporte1Layout.createSequentialGroup().addGroup(pnlTransporte1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bh).addComponent(this.y, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e)));
        GroupLayout pnlTransporteLayout = new GroupLayout(this.af);
        this.af.setLayout(pnlTransporteLayout);
        pnlTransporteLayout.setHorizontalGroup(pnlTransporteLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTransporteLayout.createSequentialGroup().addContainerGap().addComponent(this.ag, -1, -1, 32767).addContainerGap()));
        pnlTransporteLayout.setVerticalGroup(pnlTransporteLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTransporteLayout.createSequentialGroup().addContainerGap().addComponent(this.ag, -1, -1, 32767).addContainerGap()));
        this.d.addTab("Transporte", this.af);
        this.p.setBorder(BorderFactory.createTitledBorder(null, "Fatura", 1, 2));
        this.m.setFont(new Font("Tahoma", 1, 11));
        this.m.setText("N\u00famero");
        this.p.setFont(new Font("Tahoma", 1, 11));
        this.p.setText("Valor original");
        this.e.setHorizontalAlignment(4);
        this.n.setFont(new Font("Tahoma", 1, 11));
        this.n.setText("Valor do desconto");
        this.c.setHorizontalAlignment(4);
        this.o.setFont(new Font("Tahoma", 1, 11));
        this.o.setText("Valor l\u00edquido");
        this.d.setHorizontalAlignment(4);
        GroupLayout pnlCobFaturaLayout = new GroupLayout(this.p);
        this.p.setLayout(pnlCobFaturaLayout);
        pnlCobFaturaLayout.setHorizontalGroup(pnlCobFaturaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlCobFaturaLayout.createSequentialGroup().addContainerGap().addGroup(pnlCobFaturaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.p).addComponent(this.m)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlCobFaturaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlCobFaturaLayout.createSequentialGroup().addComponent(this.e, -2, 192, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.n).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -2, 191, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.o).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d, -2, 192, -2)).addComponent(this.b, -1, 877, 32767)).addContainerGap()));
        pnlCobFaturaLayout.setVerticalGroup(pnlCobFaturaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlCobFaturaLayout.createSequentialGroup().addGroup(pnlCobFaturaLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.m).addComponent(this.b, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlCobFaturaLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.p).addComponent(this.n).addComponent(this.c, -2, -1, -2).addComponent(this.o).addComponent(this.e, -2, -1, -2).addComponent(this.d, -2, -1, -2)).addContainerGap(13, 32767)));
        this.o.setBorder(BorderFactory.createTitledBorder(null, "Duplicatas (120 no M\u00e1ximo)", 1, 2));
        this.j.setText("Incluir");
        this.h.setText("Detalhar");
        this.i.setText("Excluir");
        GroupLayout pnlCobDuplicataLayout = new GroupLayout(this.o);
        this.o.setLayout(pnlCobDuplicataLayout);
        pnlCobDuplicataLayout.setHorizontalGroup(pnlCobDuplicataLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlCobDuplicataLayout.createSequentialGroup().addContainerGap().addGroup(pnlCobDuplicataLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.f, -1, 975, 32767).addGroup(pnlCobDuplicataLayout.createSequentialGroup().addComponent(this.j).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.h).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.i))).addContainerGap()));
        pnlCobDuplicataLayout.linkSize(0, this.h, this.i, this.j);
        pnlCobDuplicataLayout.setVerticalGroup(pnlCobDuplicataLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlCobDuplicataLayout.createSequentialGroup().addComponent(this.f, -1, 264, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlCobDuplicataLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.j).addComponent(this.h).addComponent(this.i)).addContainerGap()));
        GroupLayout pnlCobrancaLayout = new GroupLayout(this.q);
        this.q.setLayout(pnlCobrancaLayout);
        pnlCobrancaLayout.setHorizontalGroup(pnlCobrancaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlCobrancaLayout.createSequentialGroup().addContainerGap().addGroup(pnlCobrancaLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.o, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.p, GroupLayout.Alignment.LEADING, -1, -1, 32767)).addContainerGap()));
        pnlCobrancaLayout.setVerticalGroup(pnlCobrancaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlCobrancaLayout.createSequentialGroup().addContainerGap().addComponent(this.p, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.o, -1, -1, 32767).addContainerGap()));
        this.d.addTab("Cobran\u00e7a", this.q);
        this.Y.setFont(new Font("Tahoma", 1, 11));
        this.Y.setText("Informa\u00e7\u00f5es adicionais de interesse do fisco");
        this.a.setHorizontalScrollBarPolicy(31);
        this.d.setColumns(20);
        this.d.setLineWrap(true);
        this.d.setRows(1);
        this.d.setWrapStyleWord(true);
        this.a.setViewportView(this.d);
        this.Z.setFont(new Font("Tahoma", 1, 11));
        this.Z.setText("Informa\u00e7\u00f5es complementares de interesse do contribuinte");
        this.e.setColumns(20);
        this.e.setLineWrap(true);
        this.e.setRows(1);
        this.e.setWrapStyleWord(true);
        this.b.setViewportView(this.e);
        GroupLayout pnlInfoLayout = new GroupLayout(this.I);
        this.I.setLayout(pnlInfoLayout);
        pnlInfoLayout.setHorizontalGroup(pnlInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlInfoLayout.createSequentialGroup().addContainerGap().addGroup(pnlInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b, -1, 962, 32767).addComponent(this.a, -1, 982, 32767).addComponent(this.Y).addComponent(this.Z)).addContainerGap()));
        pnlInfoLayout.setVerticalGroup(pnlInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlInfoLayout.createSequentialGroup().addContainerGap().addComponent(this.Y).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 57, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Z).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, 86, -2).addContainerGap(158, 32767)));
        pnlInfoLayout.linkSize(1, this.a, this.b);
        this.a.addTab("Informa\u00e7\u00f5es Adicionais", this.I);
        this.K.setText("Incluir");
        this.I.setText("Detalhar");
        this.J.setText("Excluir");
        GroupLayout pnlInfoObsContLayout = new GroupLayout(this.M);
        this.M.setLayout(pnlInfoObsContLayout);
        pnlInfoObsContLayout.setHorizontalGroup(pnlInfoObsContLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlInfoObsContLayout.createSequentialGroup().addContainerGap().addGroup(pnlInfoObsContLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.j, -1, 962, 32767).addGroup(pnlInfoObsContLayout.createSequentialGroup().addComponent(this.K).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.I).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.J))).addContainerGap()));
        pnlInfoObsContLayout.linkSize(0, this.I, this.J, this.K);
        pnlInfoObsContLayout.setVerticalGroup(pnlInfoObsContLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlInfoObsContLayout.createSequentialGroup().addContainerGap().addComponent(this.j, -1, 336, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlInfoObsContLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.K).addComponent(this.I).addComponent(this.J)).addContainerGap()));
        this.a.addTab("Observa\u00e7\u00f5es do Contribuinte", this.M);
        this.N.setText("Incluir");
        this.L.setText("Detalhar");
        this.M.setText("Excluir");
        GroupLayout pnlInfoObsCont1Layout = new GroupLayout(this.N);
        this.N.setLayout(pnlInfoObsCont1Layout);
        pnlInfoObsCont1Layout.setHorizontalGroup(pnlInfoObsCont1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlInfoObsCont1Layout.createSequentialGroup().addContainerGap().addGroup(pnlInfoObsCont1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.k, -1, 962, 32767).addGroup(pnlInfoObsCont1Layout.createSequentialGroup().addComponent(this.N).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.L).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.M))).addContainerGap()));
        pnlInfoObsCont1Layout.setVerticalGroup(pnlInfoObsCont1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlInfoObsCont1Layout.createSequentialGroup().addContainerGap().addComponent(this.k, -1, 336, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlInfoObsCont1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.N).addComponent(this.L).addComponent(this.M)).addContainerGap()));
        this.a.addTab("Observa\u00e7\u00f5es do Fisco", this.N);
        this.R.setText("Incluir");
        this.P.setText("Detalhar");
        this.Q.setText("Excluir");
        GroupLayout pnlInfoObsProcRefLayout = new GroupLayout(this.O);
        this.O.setLayout(pnlInfoObsProcRefLayout);
        pnlInfoObsProcRefLayout.setHorizontalGroup(pnlInfoObsProcRefLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlInfoObsProcRefLayout.createSequentialGroup().addContainerGap().addGroup(pnlInfoObsProcRefLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.l, -1, 962, 32767).addGroup(pnlInfoObsProcRefLayout.createSequentialGroup().addComponent(this.R).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.P).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Q))).addContainerGap()));
        pnlInfoObsProcRefLayout.linkSize(0, this.P, this.Q, this.R);
        pnlInfoObsProcRefLayout.setVerticalGroup(pnlInfoObsProcRefLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlInfoObsProcRefLayout.createSequentialGroup().addContainerGap().addComponent(this.l, -1, 336, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlInfoObsProcRefLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.R).addComponent(this.P).addComponent(this.Q)).addContainerGap()));
        this.a.addTab("Processos Referenciados", this.O);
        GroupLayout pnlInfoAdicionaisLayout = new GroupLayout(this.J);
        this.J.setLayout(pnlInfoAdicionaisLayout);
        pnlInfoAdicionaisLayout.setHorizontalGroup(pnlInfoAdicionaisLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlInfoAdicionaisLayout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, 987, 32767).addContainerGap()));
        pnlInfoAdicionaisLayout.setVerticalGroup(pnlInfoAdicionaisLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlInfoAdicionaisLayout.createSequentialGroup().addContainerGap().addComponent(this.a).addContainerGap()));
        this.d.addTab("Informa\u00e7\u00f5es Adicionais", this.J);
        this.L.setBorder(BorderFactory.createTitledBorder(null, "Exporta\u00e7\u00e3o", 1, 2));
        this.aa.setFont(new Font("Tahoma", 1, 11));
        this.aa.setText("UF de embarque");
        this.ab.setFont(new Font("Tahoma", 1, 11));
        this.ab.setText("Local de embarque");
        this.ac.setFont(new Font("Tahoma", 1, 11));
        this.ac.setText("Local de despacho");
        GroupLayout pnlInfoExportacaoLayout = new GroupLayout(this.L);
        this.L.setLayout(pnlInfoExportacaoLayout);
        pnlInfoExportacaoLayout.setHorizontalGroup(pnlInfoExportacaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlInfoExportacaoLayout.createSequentialGroup().addContainerGap().addGroup(pnlInfoExportacaoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(pnlInfoExportacaoLayout.createSequentialGroup().addComponent(this.aa).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.q, -2, 80, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ab)).addComponent(this.ac)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlInfoExportacaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.r).addComponent(this.s, -1, 684, 32767)).addContainerGap()));
        pnlInfoExportacaoLayout.setVerticalGroup(pnlInfoExportacaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlInfoExportacaoLayout.createSequentialGroup().addGroup(pnlInfoExportacaoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.aa).addComponent(this.q, -2, -1, -2).addComponent(this.ab).addComponent(this.s, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlInfoExportacaoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ac).addComponent(this.r, -2, -1, -2)).addContainerGap(64, 32767)));
        this.K.setBorder(BorderFactory.createTitledBorder("Compra"));
        this.bN.setFont(new Font("Tahoma", 1, 11));
        this.bN.setText("Informa\u00e7\u00e3o da nota de empenho de compras p\u00fablicas");
        this.bQ.setFont(new Font("Tahoma", 1, 11));
        this.bQ.setText("Informa\u00e7\u00e3o do pedido");
        this.bG.setFont(new Font("Tahoma", 1, 11));
        this.bG.setText("Informa\u00e7\u00e3o do contrato");
        GroupLayout pnlInfoCompraLayout = new GroupLayout(this.K);
        this.K.setLayout(pnlInfoCompraLayout);
        pnlInfoCompraLayout.setHorizontalGroup(pnlInfoCompraLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlInfoCompraLayout.createSequentialGroup().addContainerGap().addGroup(pnlInfoCompraLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlInfoCompraLayout.createSequentialGroup().addComponent(this.bN).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.t, -1, 648, 32767)).addGroup(pnlInfoCompraLayout.createSequentialGroup().addGroup(pnlInfoCompraLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.bG).addComponent(this.bQ)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlInfoCompraLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.u, -1, 836, 32767).addComponent(this.q, -1, 836, 32767)))).addContainerGap()));
        pnlInfoCompraLayout.setVerticalGroup(pnlInfoCompraLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlInfoCompraLayout.createSequentialGroup().addGroup(pnlInfoCompraLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bN).addComponent(this.t, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlInfoCompraLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bQ).addComponent(this.u, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlInfoCompraLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bG).addComponent(this.q, -2, -1, -2)).addContainerGap(108, 32767)));
        GroupLayout pnlExportaCompraLayout = new GroupLayout(this.F);
        this.F.setLayout(pnlExportaCompraLayout);
        pnlExportaCompraLayout.setHorizontalGroup(pnlExportaCompraLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlExportaCompraLayout.createSequentialGroup().addContainerGap().addGroup(pnlExportaCompraLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.K, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.L, GroupLayout.Alignment.LEADING, -1, -1, 32767)).addContainerGap()));
        pnlExportaCompraLayout.setVerticalGroup(pnlExportaCompraLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlExportaCompraLayout.createSequentialGroup().addContainerGap().addComponent(this.L, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.K, -2, -1, -2).addContainerGap(84, 32767)));
        this.d.addTab("Exporta\u00e7\u00e3o e Compras", this.F);
        this.P.setBorder(BorderFactory.createTitledBorder("Safra"));
        this.W.setFont(new Font("Tahoma", 1, 11));
        this.W.setText("Identifica\u00e7\u00e3o da Safra");
        this.F.setHorizontalAlignment(2);
        ((AbstractDocument)this.F.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 9));
        this.G.setHorizontalAlignment(4);
        this.ae.setFont(new Font("Tahoma", 1, 11));
        this.ae.setText("M\u00eas e Ano de Refer\u00eancia");
        GroupLayout pnlPrincipalLayout = new GroupLayout(this.P);
        this.P.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addContainerGap().addComponent(this.W).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.F, -1, 73, 32767).addGap(18, 18, 18).addComponent(this.ae).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.G, -2, 110, -2).addGap(513, 513, 513)));
        pnlPrincipalLayout.setVerticalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.W).addComponent(this.G, -2, -1, -2).addComponent(this.ae).addComponent(this.F, -2, -1, -2)));
        this.T.setBorder(BorderFactory.createTitledBorder("Fornecimentos Di\u00e1rios"));
        this.H.setText("Incluir");
        this.y.setText("Detalhar");
        this.A.setText("Excluir");
        GroupLayout pnlFornecimentosLayout = new GroupLayout(this.G);
        this.G.setLayout(pnlFornecimentosLayout);
        pnlFornecimentosLayout.setHorizontalGroup(pnlFornecimentosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 347, 32767));
        pnlFornecimentosLayout.setVerticalGroup(pnlFornecimentosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 125, 32767));
        GroupLayout pnlTitleFornecimentosLayout = new GroupLayout(this.T);
        this.T.setLayout(pnlTitleFornecimentosLayout);
        pnlTitleFornecimentosLayout.setHorizontalGroup(pnlTitleFornecimentosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTitleFornecimentosLayout.createSequentialGroup().addContainerGap().addGroup(pnlTitleFornecimentosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.G, -1, -1, 32767).addGroup(pnlTitleFornecimentosLayout.createSequentialGroup().addComponent(this.H).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.y).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.A))).addContainerGap()));
        pnlTitleFornecimentosLayout.setVerticalGroup(pnlTitleFornecimentosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlTitleFornecimentosLayout.createSequentialGroup().addComponent(this.G, -1, -1, 32767).addGap(9, 9, 9).addGroup(pnlTitleFornecimentosLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.H).addComponent(this.y).addComponent(this.A))));
        this.d.setBorder(BorderFactory.createTitledBorder("Totais Fornecimentos"));
        this.V.setEnabled(false);
        this.au.setFont(new Font("Tahoma", 1, 11));
        this.au.setText("Total do M\u00eas(KG)");
        this.as.setFont(new Font("Tahoma", 1, 11));
        this.as.setText("Total Anterior(KG)");
        this.at.setFont(new Font("Tahoma", 1, 11));
        this.at.setText("Total Geral(KG)");
        this.U.setEnabled(false);
        this.bx.setFont(new Font("Tahoma", 1, 11));
        this.bx.setText("Valor dos Fornecimentos");
        this.bz.setFont(new Font("Tahoma", 1, 11));
        this.bz.setText("Valor Total das Dedu\u00e7\u00f5es");
        this.by.setFont(new Font("Tahoma", 1, 11));
        this.by.setText("Valor L\u00edquido dos Fornecimentos");
        this.Y.setEnabled(false);
        this.W.setEnabled(false);
        this.X.setEnabled(false);
        GroupLayout jPanel12Layout = new GroupLayout(this.d);
        this.d.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel12Layout.createSequentialGroup().addContainerGap().addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.bz).addComponent(this.by).addComponent(this.au, -2, 116, -2).addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.as, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.bx, GroupLayout.Alignment.LEADING, -1, -1, 32767)).addComponent(this.at, -2, 126, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.V, -2, 206, -2).addComponent(this.T, -2, 206, -2).addComponent(this.U, -2, 206, -2).addComponent(this.X, -2, 206, -2).addComponent(this.W, -2, 206, -2).addComponent(this.Y, -2, 206, -2)).addContainerGap(186, 32767)));
        jPanel12Layout.setVerticalGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel12Layout.createSequentialGroup().addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.V, -2, -1, -2).addComponent(this.au)).addGap(3, 3, 3).addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.T, -2, -1, -2).addComponent(this.as)).addGap(3, 3, 3).addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.U, -2, -1, -2).addComponent(this.at)).addGap(3, 3, 3).addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bx).addComponent(this.X, -2, -1, -2)).addGap(3, 3, 3).addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bz).addComponent(this.W, -2, -1, -2)).addGap(3, 3, 3).addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.by).addComponent(this.Y, -2, -1, -2)).addContainerGap(22, 32767)));
        this.e.setBorder(BorderFactory.createTitledBorder("Dedu\u00e7\u00f5es - Taxas e Contribui\u00e7\u00f5es (10 no M\u00e1ximo)"));
        this.z.setText("Excluir");
        this.x.setText("Detalhar");
        this.G.setText("Incluir");
        GroupLayout pnlDeducoesLayout = new GroupLayout(this.x);
        this.x.setLayout(pnlDeducoesLayout);
        pnlDeducoesLayout.setHorizontalGroup(pnlDeducoesLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 975, 32767));
        pnlDeducoesLayout.setVerticalGroup(pnlDeducoesLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 139, 32767));
        GroupLayout jPanel13Layout = new GroupLayout(this.e);
        this.e.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel13Layout.createSequentialGroup().addContainerGap().addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.x, -1, -1, 32767).addGroup(jPanel13Layout.createSequentialGroup().addComponent(this.G).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.x).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.z))).addContainerGap()));
        jPanel13Layout.setVerticalGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup().addComponent(this.x, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.G).addComponent(this.x).addComponent(this.z))));
        GroupLayout pnlCanaLayout = new GroupLayout(this.n);
        this.n.setLayout(pnlCanaLayout);
        pnlCanaLayout.setHorizontalGroup(pnlCanaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlCanaLayout.createSequentialGroup().addContainerGap().addGroup(pnlCanaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlCanaLayout.createSequentialGroup().addComponent(this.P, -1, -1, 32767).addContainerGap()).addGroup(pnlCanaLayout.createSequentialGroup().addComponent(this.e, -1, -1, 32767).addContainerGap()).addGroup(GroupLayout.Alignment.TRAILING, pnlCanaLayout.createSequentialGroup().addComponent(this.T, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d, -1, -1, 32767).addGap(12, 12, 12)))));
        pnlCanaLayout.setVerticalGroup(pnlCanaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlCanaLayout.createSequentialGroup().addComponent(this.P, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlCanaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.d, 0, -1, 32767).addComponent(this.T, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e, -1, -1, 32767).addContainerGap()));
        this.d.addTab("Cana", this.n);
        this.g.setBorder(BorderFactory.createTitledBorder("Informa\u00e7\u00f5es do Certificado Digital da NF-e"));
        this.c.setBorder(null);
        this.a.setBackground(UIManager.getDefaults().getColor("Panel.background"));
        this.a.setColumns(20);
        this.a.setLineWrap(true);
        this.a.setRows(1);
        this.a.setWrapStyleWord(true);
        this.c.setViewportView(this.a);
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("Assunto");
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("CNPJ");
        this.b.setBackground(UIManager.getDefaults().getColor("Panel.background"));
        this.b.setColumns(20);
        this.b.setRows(1);
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText("Emissor");
        this.d.setBorder(null);
        this.c.setBackground(UIManager.getDefaults().getColor("Panel.background"));
        this.c.setColumns(20);
        this.c.setLineWrap(true);
        this.c.setRows(1);
        this.c.setWrapStyleWord(true);
        this.d.setViewportView(this.c);
        GroupLayout jPanel3Layout = new GroupLayout(this.g);
        this.g.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.c).addComponent(this.b).addComponent(this.d)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b, -1, 925, 32767).addComponent(this.c, -1, 925, 32767).addComponent(this.d, -1, 925, 32767)).addContainerGap()));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.b, -2, 14, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.d).addComponent(this.d, -2, 57, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.c, -2, 57, -2).addComponent(this.b)).addGap(73, 73, 73)));
        this.h.setBorder(BorderFactory.createTitledBorder("Validade do Certificado"));
        this.e.setFont(new Font("Tahoma", 1, 11));
        this.e.setText("Data Inicial");
        this.f.setFont(new Font("Tahoma", 1, 11));
        this.f.setText("Data Final");
        this.H.setText(" ");
        this.G.setText(" ");
        GroupLayout jPanel4Layout = new GroupLayout(this.h);
        this.h.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.e).addComponent(this.f)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.H, -2, 252, -2).addComponent(this.G, -2, 252, -2)).addContainerGap(643, 32767)));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.e).addComponent(this.H)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.f).addComponent(this.G)).addContainerGap(103, 32767)));
        GroupLayout jPanel2Layout = new GroupLayout(this.f);
        this.f.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.h, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.g, GroupLayout.Alignment.LEADING, -1, -1, 32767)).addContainerGap()));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.g, -2, 176, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.h, -2, -1, -2).addContainerGap(84, 32767)));
        this.d.addTab("Certificado Digital", this.f);
        this.S.setBorder(BorderFactory.createTitledBorder(null, "Autoriza\u00e7\u00e3o para obter XML", 1, 2));
        this.d.setText("Incluir");
        this.b.setText("Detalhar");
        this.c.setText("Excluir");
        GroupLayout pnlProdutos2Layout = new GroupLayout(this.S);
        this.S.setLayout(pnlProdutos2Layout);
        pnlProdutos2Layout.setHorizontalGroup(pnlProdutos2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlProdutos2Layout.createSequentialGroup().addContainerGap().addGroup(pnlProdutos2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.e, -1, 955, 32767).addGroup(pnlProdutos2Layout.createSequentialGroup().addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c))).addContainerGap()));
        pnlProdutos2Layout.setVerticalGroup(pnlProdutos2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlProdutos2Layout.createSequentialGroup().addContainerGap().addComponent(this.e, -1, 352, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlProdutos2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.d).addComponent(this.b).addComponent(this.c))));
        GroupLayout jPanel11Layout = new GroupLayout(this.c);
        this.c.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addContainerGap().addComponent(this.S, -1, -1, 32767).addContainerGap()));
        jPanel11Layout.setVerticalGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addContainerGap().addComponent(this.S, -1, -1, 32767).addContainerGap()));
        this.d.addTab("Autoriza\u00e7\u00e3o Download", this.c);
        this.F.setFont(new Font("Dialog", 0, 11));
        this.F.setText("Salvar");
        this.F.setMargin(new Insets(1, 5, 1, 5));
        this.af.setFont(new Font("Dialog", 0, 11));
        this.af.setText("Validar");
        this.af.setMargin(new Insets(1, 5, 1, 5));
        this.a.setFont(new Font("Dialog", 0, 11));
        this.a.setText("Assinar");
        this.a.setMargin(new Insets(1, 5, 1, 5));
        this.ae.setFont(new Font("Dialog", 0, 11));
        this.ae.setText("Transmitir");
        this.ae.setMargin(new Insets(1, 5, 1, 5));
        this.e.setFont(new Font("Dialog", 0, 11));
        this.e.setText("Cancelar NF-e");
        this.e.setMargin(new Insets(1, 5, 1, 5));
        this.E.setFont(new Font("Dialog", 0, 11));
        this.E.setText("Imprimir DANFE");
        this.E.setMargin(new Insets(1, 5, 1, 5));
        this.B.setFont(new Font("Dialog", 0, 11));
        this.B.setText("Exportar");
        this.B.setMargin(new Insets(1, 5, 1, 5));
        this.C.setFont(new Font("Dialog", 0, 11));
        this.C.setText("Fechar");
        this.C.setMargin(new Insets(1, 5, 1, 5));
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("(*) Campo de preenchimento obrigat\u00f3rio.");
        this.g.setFont(new Font("Dialog", 0, 10));
        this.g.setForeground(new Color(255, 0, 0));
        this.g.setHorizontalAlignment(0);
        this.g.setText("Os documentos eletr\u00f4nicos gerados por esse aplicativo n\u00e3o t\u00eam validade jur\u00eddica");
        this.g.setText(DSENProperties.getInstance().getAplicativoLabelAviso());
        this.D.setFont(new Font("Dialog", 0, 11));
        this.D.setText("Gerar DPEC");
        this.D.setMargin(new Insets(1, 5, 1, 5));
        this.O.setFont(new Font("Dialog", 0, 11));
        this.O.setText("Pr\u00e9-Visualizar DANFE");
        this.O.setMargin(new Insets(1, 5, 1, 5));
        this.f.setFont(new Font("Dialog", 0, 11));
        this.f.setText("Carta de Corre\u00e7\u00e3o");
        this.f.setMargin(new Insets(1, 5, 1, 5));
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.F).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.af).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 81, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ae).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(var0.O).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(var0.E).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(var0.D).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(var0.B).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(var0.f).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(var0.C).addGap(151, 151, 151)).addGroup(var60_60.createSequentialGroup().addComponent(var0.g).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(var0.a).addContainerGap()).addGroup(var60_60.createSequentialGroup().addGap(2, 2, 2).addComponent(var0.H, -1, -1, 32767).addGap(2, 2, 2)).addGroup(var60_60.createSequentialGroup().addComponent(var0.d, -2, 0, 32767).addGap(2, 2, 2)));
        var60_60.setVerticalGroup(var60_60.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(var60_60.createSequentialGroup().addComponent(var0.H, -2, -1, -2).addGap(3, 3, 3).addComponent(var0.d, -1, 481, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(var60_60.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(var0.g).addComponent(var0.a)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(var60_60.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(var0.F).addComponent(var0.af).addComponent(var0.ae).addComponent(var0.e).addComponent(var0.a).addComponent(var0.E).addComponent(var0.B).addComponent(var0.C).addComponent(var0.D).addComponent(var0.O).addComponent(var0.f))));
    }

    private void a(ItemEvent evt) {
    }

    private void b(ItemEvent evt) {
        if (this.d.isSelected()) {
            this.J.setText("");
            this.J.setEnabled(false);
            this.W.setEnabled(false);
        } else {
            if (this.d.isEnabled()) {
                this.J.setEnabled(true);
            }
            this.W.setEnabled(true);
        }
    }

    private void c(ItemEvent evt) {
        if (this.g.getSelectedItem() == IndIEDestEnum.CONTRIB_ICMS) {
            this.q.setEnabled(true);
            this.t.setEnabled(true);
        } else if (this.g.getSelectedItem() == IndIEDestEnum.CONTRIB_ISENTO) {
            this.q.setText("");
            this.q.setEnabled(false);
            this.t.setEnabled(false);
        } else if (this.g.getSelectedItem() == IndIEDestEnum.NAO_CONBRIB) {
            this.q.setText("");
            this.q.setEnabled(false);
            this.t.setEnabled(false);
        }
    }

    public void addActionListener(EventListener listener) {
        this.F.addActionListener((ActionListener)listener);
        this.af.addActionListener((ActionListener)listener);
        this.D.addActionListener((ActionListener)listener);
        this.a.addActionListener((ActionListener)listener);
        this.ae.addActionListener((ActionListener)listener);
        this.e.addActionListener((ActionListener)listener);
        this.E.addActionListener((ActionListener)listener);
        this.O.addActionListener((ActionListener)listener);
        this.B.addActionListener((ActionListener)listener);
        this.f.addActionListener((ActionListener)listener);
        this.k.addFocusListener((FocusListener)listener);
        this.C.addActionListener((ActionListener)listener);
        this.g.addActionListener((ActionListener)listener);
    }

    public void addActionListener(EventListener listener, int aba) {
        switch (aba) {
            case 0: {
                this.k.addActionListener((ActionListener)listener);
                this.n.addActionListener((ActionListener)listener);
                this.q.addActionListener((ActionListener)listener);
                this.m.addActionListener((ActionListener)listener);
                this.p.addActionListener((ActionListener)listener);
                this.s.addActionListener((ActionListener)listener);
                this.l.addActionListener((ActionListener)listener);
                this.o.addActionListener((ActionListener)listener);
                this.r.addActionListener((ActionListener)listener);
                this.f.addItemListener((ItemListener)listener);
                break;
            }
            case 1: {
                this.m.addItemListener((ItemListener)listener);
                this.n.addItemListener((ItemListener)listener);
                break;
            }
            case 2: {
                this.k.addItemListener((ItemListener)listener);
                this.i.addItemListener((ItemListener)listener);
                this.u.addActionListener((ActionListener)listener);
                this.w.addActionListener((ActionListener)listener);
                this.v.addActionListener((ActionListener)listener);
                this.t.addActionListener((ActionListener)listener);
                this.a.addItemListener((ItemListener)listener);
                this.b.addItemListener((ItemListener)listener);
                break;
            }
            case 3: {
                this.f.addCellEditorListener(0, (CellEditorListener)listener);
                this.S.addActionListener((ActionListener)listener);
                this.T.addActionListener((ActionListener)listener);
                this.U.addActionListener((ActionListener)listener);
                break;
            }
            case 5: {
                this.x.addItemListener((ItemListener)listener);
                this.A.addItemListener((ItemListener)listener);
                this.X.addActionListener((ActionListener)listener);
                this.Y.addActionListener((ActionListener)listener);
                this.Z.addActionListener((ActionListener)listener);
                this.aa.addActionListener((ActionListener)listener);
                this.ab.addActionListener((ActionListener)listener);
                this.ac.addActionListener((ActionListener)listener);
                this.ad.addActionListener((ActionListener)listener);
                this.W.addActionListener((ActionListener)listener);
                this.M.addFocusListener((FocusListener)listener);
                this.L.addFocusListener((FocusListener)listener);
                this.O.addFocusListener((FocusListener)listener);
                break;
            }
            case 6: {
                this.h.addActionListener((ActionListener)listener);
                this.i.addActionListener((ActionListener)listener);
                this.j.addActionListener((ActionListener)listener);
                break;
            }
            case 7: {
                this.I.addActionListener((ActionListener)listener);
                this.J.addActionListener((ActionListener)listener);
                this.K.addActionListener((ActionListener)listener);
                this.L.addActionListener((ActionListener)listener);
                this.M.addActionListener((ActionListener)listener);
                this.N.addActionListener((ActionListener)listener);
                this.P.addActionListener((ActionListener)listener);
                this.Q.addActionListener((ActionListener)listener);
                this.R.addActionListener((ActionListener)listener);
                break;
            }
            case 4: {
                this.V.addActionListener((ActionListener)listener);
                break;
            }
            case 9: {
                this.H.addActionListener((ActionListener)listener);
                this.y.addActionListener((ActionListener)listener);
                this.A.addActionListener((ActionListener)listener);
                this.G.addActionListener((ActionListener)listener);
                this.x.addActionListener((ActionListener)listener);
                this.z.addActionListener((ActionListener)listener);
                break;
            }
            case 11: {
                this.g.addCellEditorListener(0, (CellEditorListener)listener);
                this.b.addActionListener((ActionListener)listener);
                this.c.addActionListener((ActionListener)listener);
                this.d.addActionListener((ActionListener)listener);
            }
        }
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public String getOperacao() {
        return this.a;
    }

    public void setOperacao(String operacao) {
        this.a = operacao;
    }

    public void adicionarFornecimentoTO(FornecimentoTO fornecimentoTO) {
        this.a.addTO((BaseTO)fornecimentoTO);
    }

    public void excluirFornecimentoTO(List<FornecimentoTO> lista) {
        this.a.removeTO(lista);
    }

    public List<FornecimentoTO> getSelectedFornecimentoTOs() {
        return this.a.getSelectedItens(0);
    }

    public FornecimentoTO getSelectedFornecimentoTO() {
        List lista = this.getSelectedFornecimentoTOs();
        FornecimentoTO fornecimentoTO = null;
        if (lista != null && lista.size() > 0) {
            fornecimentoTO = (FornecimentoTO)lista.get(0);
        }
        return fornecimentoTO;
    }

    public List<FornecimentoTO> getAllFornecimentoTO() {
        return this.a.getAllTO();
    }

    public void adicionarDeducaoTO(DeducaoTO deducaoTO) {
        this.b.addTO((BaseTO)deducaoTO);
    }

    public void excluirDeducaoTO(List<DeducaoTO> lista) {
        this.b.removeTO(lista);
    }

    public List<DeducaoTO> getSelectedDeducaoTOs() {
        return this.b.getSelectedItens(0);
    }

    public DeducaoTO getSelectedDeducaoTO() {
        List lista = this.getSelectedDeducaoTOs();
        DeducaoTO deducaoTO = null;
        if (lista != null && lista.size() > 0) {
            deducaoTO = (DeducaoTO)lista.get(0);
        }
        return deducaoTO;
    }

    public List<DeducaoTO> getAllDeducaoTO() {
        return this.b.getAllTO();
    }

    public void setNotaFiscalTO(NotaFiscalTO notaFiscalTO) {
        this.a = notaFiscalTO;
        try {
            this.a(notaFiscalTO);
        }
        catch (DSGEUtilException e) {
            this.showErrors((DSGEBaseException)e);
        }
    }

    public void adicionarNotaFiscalReferenciadaTO(RefNFTO refNFTO) {
        this.c.addTO((BaseTO)refNFTO);
    }

    public void excluirNotaFiscalReferenciadaTO(List<RefNFTO> lista) {
        this.c.removeTO(lista);
    }

    public RefNFTO getSelectedNotaReferenciadaTO() {
        List lista = this.c.getWrappedTable().getSelectedItens(0);
        RefNFTO refNFTO = null;
        if (lista != null && lista.size() > 0) {
            refNFTO = (RefNFTO)lista.get(0);
        }
        return refNFTO;
    }

    public List<RefNFTO> getSelectedNotaReferenciadaTOs() {
        return this.c.getSelectedItens(0);
    }

    public void adicionarNotaFiscalReferenciadaProdutorTO(RefNFPTO refNFPTO) {
        this.d.addTO((BaseTO)refNFPTO);
    }

    public void excluirNotaFiscalReferenciadaProdutorTO(List<RefNFPTO> lista) {
        this.d.removeTO(lista);
    }

    public RefNFPTO getSelectedNotaReferenciadaProdutorTO() {
        List lista = this.d.getWrappedTable().getSelectedItens(0);
        RefNFPTO refNFPTO = null;
        if (lista != null && lista.size() > 0) {
            refNFPTO = (RefNFPTO)lista.get(0);
        }
        return refNFPTO;
    }

    public List<RefNFPTO> getSelectedNotaReferenciadaProdutorTOs() {
        return this.d.getSelectedItens(0);
    }

    public void adicionarECFReferenciadoTO(RefECFTO refECFTO) {
        this.e.addTO((BaseTO)refECFTO);
    }

    public void excluirECFReferenciadoTO(List<RefECFTO> lista) {
        this.e.removeTO(lista);
    }

    public RefECFTO getSelectedECFReferenciadoTO() {
        List lista = this.e.getWrappedTable().getSelectedItens(0);
        RefECFTO refECFTO = null;
        if (lista != null && lista.size() > 0) {
            refECFTO = (RefECFTO)lista.get(0);
        }
        return refECFTO;
    }

    public List<RefECFTO> getSelectedECFReferenciadoTOs() {
        return this.e.getSelectedItens(0);
    }

    public List<ReboqueTO> getSelectedReboqueTOs() {
        return this.i.getSelectedItens(0);
    }

    public ReboqueTO getSelectedReboqueTO() {
        List lista = this.getSelectedReboqueTOs();
        ReboqueTO reboqueTO = null;
        if (lista != null && lista.size() > 0) {
            reboqueTO = (ReboqueTO)lista.get(0);
        }
        return reboqueTO;
    }

    public List<ReboqueTO> getAllReboqueTOs() {
        return this.i.getAllTO();
    }

    public List<VolumeTO> getSelectedVolumeTOs() {
        return this.j.getSelectedItens(0);
    }

    public VolumeTO getSelectedVolumeTO() {
        List lista = this.getSelectedVolumeTOs();
        VolumeTO volumeTO = null;
        if (lista != null && lista.size() > 0) {
            volumeTO = (VolumeTO)lista.get(0);
        }
        return volumeTO;
    }

    public List<ProdutoNotaTO> getSelectedProdutoNotaTOs() {
        return this.f.getSelectedItens(0);
    }

    public ProdutoNotaTO getSelectedProdutoNotaTO() {
        List lista = this.getSelectedProdutoNotaTOs();
        ProdutoNotaTO produtoNotaTO = null;
        if (lista != null && lista.size() > 0) {
            produtoNotaTO = (ProdutoNotaTO)lista.get(0);
        }
        return produtoNotaTO;
    }

    public void excluirProdutoNotaTOs(List<ProdutoNotaTO> lista) {
        this.f.removeTO(lista);
    }

    public List<AutorizacaoTO> getSelectedAutorizacaoTOs() {
        return this.g.getSelectedItens(0);
    }

    public AutorizacaoTO getSelectedAutorizacaoTO() {
        List lista = this.getSelectedAutorizacaoTOs();
        AutorizacaoTO autorizacaoTO = null;
        if (lista != null && lista.size() > 0) {
            autorizacaoTO = (AutorizacaoTO)lista.get(0);
        }
        return autorizacaoTO;
    }

    public void excluirAutorizacaoTOs(List<AutorizacaoTO> lista) {
        this.g.removeTO(lista);
    }

    public void setListaTipoDocumentoNFe(TipoDocumentoNFeEnum[] lista) {
        this.d.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.d.addItem(lista[i]);
            }
        }
        this.d.setSelectedIndex(TipoDocumentoNFeEnum.SAIDA.ordinal());
    }

    public void setListaTipoImpressao(TipoImpressaoEnum[] lista) {
        this.u.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.u.addItem(lista[i]);
            }
        }
        this.u.setSelectedItem((Object)TipoImpressaoEnum.RETRATO);
    }

    public void setListaTransTipoDocumento(TipoDocumentoEnum[] lista) {
        this.z.removeAllItems();
        this.z.addItem(null);
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.z.addItem(lista[i]);
            }
        }
        this.z.setSelectedIndex(-1);
    }

    public void setListaDestTipoDocumento(TipoDocumentoDestEnum[] lista) {
        this.h.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.h.addItem(lista[i]);
            }
        }
        this.h.setSelectedIndex(-1);
    }

    public void setListaDestTipoContribuinte(IndIEDestEnum[] lista) {
        this.g.removeAllItems();
        if (lista != null) {
            for (IndIEDestEnum i : lista) {
                this.g.addItem(i);
            }
        }
    }

    public void setListaFormaPagamento(FormaPagamentoEnum[] lista) {
        this.b.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.b.addItem(lista[i]);
            }
        }
    }

    public void setListaFormaEmissao(TipoEmissaoEnum[] lista) {
        this.c.removeAllItems();
        EmitenteTO emitenteLogado = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
        String ufEmitente = emitenteLogado.getUf();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                if (TipoEmissaoEnum.CONTINGENCIA_SVC_AN == lista[i] && (ufEmitente.equals("AC") || ufEmitente.equals("AL") || ufEmitente.equals("AP") || ufEmitente.equals("ES") || ufEmitente.equals("MG") || ufEmitente.equals("PB") || ufEmitente.equals("RJ") || ufEmitente.equals("RS") || ufEmitente.equals("RN") || ufEmitente.equals("RO") || ufEmitente.equals("RR") || ufEmitente.equals("SC") || ufEmitente.equals("SE") || ufEmitente.equals("SP") || ufEmitente.equals("TO") || ufEmitente.equals("DF"))) {
                    this.c.addItem(lista[i]);
                    continue;
                }
                if (TipoEmissaoEnum.CONTINGENCIA_SVC_RS == lista[i] && (ufEmitente.equals("AC") || ufEmitente.equals("AM") || ufEmitente.equals("BA") || ufEmitente.equals("CE") || ufEmitente.equals("GO") || ufEmitente.equals("MA") || ufEmitente.equals("MS") || ufEmitente.equals("MT") || ufEmitente.equals("PA") || ufEmitente.equals("PE") || ufEmitente.equals("PI") || ufEmitente.equals("PR"))) {
                    this.c.addItem(lista[i]);
                    continue;
                }
                if (TipoEmissaoEnum.CONTINGENCIA_SVC_RS == lista[i] || TipoEmissaoEnum.CONTINGENCIA_SVC_AN == lista[i]) continue;
                this.c.addItem(lista[i]);
            }
        }
        this.c.setSelectedItem((Object)TipoEmissaoEnum.NORMAL);
    }

    public void setListaRegimeTributario(RegimeTributarioEnum[] lista, RegimeTributarioEnum defaultReg) {
        this.r.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.r.addItem(lista[i]);
            }
        }
        this.r.setSelectedItem((Object)defaultReg);
    }

    public void setListaFinalidadeEmissao(FinalidadeEmissaoEnum[] lista) {
        this.e.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.e.addItem(lista[i]);
            }
        }
        this.e.setSelectedItem((Object)FinalidadeEmissaoEnum.NFE_NORMAL);
    }

    public void setListaIdeEstado(List<EstadoTO> listaEstado) {
        this.f.removeAllItems();
        this.a.removeAllItems();
        if (listaEstado != null) {
            this.f.addItem(new EstadoTO("", "", ""));
            for (int i = 0; i < listaEstado.size(); ++i) {
                this.f.addItem(listaEstado.get(i));
            }
        }
        this.f.setSelectedIndex(-1);
    }

    public void setListaTranspCFOP(List<CfopTO> listaCFOP) {
        CfopTO blankCFOP = new CfopTO("");
        this.v.addItem(blankCFOP);
        for (CfopTO cfop : listaCFOP) {
            this.v.addItem(cfop);
        }
        this.v.setSelectedItem((Object)blankCFOP);
    }

    public void setListaIdeMunicipio(List<MunicipioTO> listaMunicipio) {
        this.a.removeAllItems();
        if (listaMunicipio != null) {
            for (int i = 0; i < listaMunicipio.size(); ++i) {
                this.a.addItem(listaMunicipio.get(i));
            }
        }
        this.a.setSelectedIndex(-1);
    }

    public void setListaEmitPais(List<PaisTO> listaPais) {
        this.m.removeAllItems();
        this.n.removeAllItems();
        this.l.removeAllItems();
        if (listaPais != null) {
            PaisTO paisTO = new PaisTO();
            paisTO.setCodigo("");
            paisTO.setNome("");
            listaPais.add(0, paisTO);
            for (int i = 0; i < listaPais.size(); ++i) {
                this.m.addItem(listaPais.get(i));
            }
        }
        this.m.setSelectedIndex(-1);
    }

    public void setListaEmitEstado(List<EstadoTO> listaEstado) {
        this.n.removeAllItems();
        this.l.removeAllItems();
        if (listaEstado != null) {
            this.n.addItem(new EstadoTO("", "", ""));
            for (int i = 0; i < listaEstado.size(); ++i) {
                this.n.addItem(listaEstado.get(i));
            }
        }
        this.n.setSelectedIndex(-1);
    }

    public void setListaEmitMunicipio(List<MunicipioTO> listaMunicipio) {
        this.l.removeAllItems();
        if (listaMunicipio != null) {
            MunicipioTO municipioTO = new MunicipioTO();
            municipioTO.setCodigo("");
            municipioTO.setNome("");
            listaMunicipio.add(0, municipioTO);
            for (int i = 0; i < listaMunicipio.size(); ++i) {
                this.l.addItem(listaMunicipio.get(i));
            }
        }
        this.l.setSelectedIndex(-1);
    }

    public void setListaDestPais(List<PaisTO> listaPais) {
        this.k.removeAllItems();
        this.i.removeAllItems();
        this.j.removeAllItems();
        if (listaPais != null) {
            PaisTO paisTO = new PaisTO();
            paisTO.setCodigo("");
            paisTO.setNome("");
            listaPais.add(0, paisTO);
            for (int i = 0; i < listaPais.size(); ++i) {
                this.k.addItem(listaPais.get(i));
            }
        }
        this.k.setSelectedIndex(-1);
    }

    public void setDestPais(PaisTO paisTO) {
        this.k.setSelectedItem((Object)paisTO);
    }

    public void setListaDestEstado(List<EstadoTO> listaEstado) {
        this.i.removeAllItems();
        this.j.removeAllItems();
        if (listaEstado != null) {
            this.i.addItem(new EstadoTO("", "", ""));
            for (int i = 0; i < listaEstado.size(); ++i) {
                this.i.addItem(listaEstado.get(i));
            }
        }
        this.i.setSelectedIndex(-1);
    }

    public void setListaDestMunicipio(List<MunicipioTO> listaMunicipio) {
        this.j.removeAllItems();
        if (listaMunicipio != null) {
            for (int i = 0; i < listaMunicipio.size(); ++i) {
                this.j.addItem(listaMunicipio.get(i));
            }
        }
        this.j.setSelectedIndex(-1);
    }

    public void setListaModalidadeFrete(ModalidadeFreteEnum[] lista) {
        this.y.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.y.addItem(lista[i]);
            }
        }
        this.y.setSelectedIndex(-1);
    }

    public void setListaTransUF(List<EstadoTO> lista) {
        this.A.removeAllItems();
        this.C.removeAllItems();
        this.A.addItem(new EstadoTO("", "", ""));
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                this.A.addItem(lista.get(i));
            }
        }
    }

    public void setListaTransMunicipio(List<MunicipioTO> lista) {
        this.C.removeAllItems();
        if (lista != null) {
            MunicipioTO municipioTO = new MunicipioTO();
            municipioTO.setCodigo("");
            municipioTO.setNome("");
            lista.add(0, municipioTO);
            for (int i = 0; i < lista.size(); ++i) {
                this.C.addItem(lista.get(i));
            }
        }
    }

    public void setListaTransVeicUF(List<EstadoTO> lista) {
        this.B.removeAllItems();
        this.B.addItem(new EstadoTO("", "", ""));
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                this.B.addItem(lista.get(i));
            }
        }
        this.B.setSelectedIndex(-1);
    }

    public void setListaTransRetencaoUF(List<EstadoTO> lista) {
        this.x.removeAllItems();
        this.w.removeAllItems();
        this.x.addItem(new EstadoTO("", "", ""));
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                this.x.addItem(lista.get(i));
            }
        }
        this.x.setSelectedIndex(-1);
    }

    public void setListaTransRetencaoMunicipio(List<MunicipioTO> lista) {
        this.w.removeAllItems();
        if (lista != null) {
            MunicipioTO municipioTO = new MunicipioTO();
            municipioTO.setCodigo("");
            municipioTO.setNome("");
            lista.add(0, municipioTO);
            for (int i = 0; i < lista.size(); ++i) {
                this.w.addItem(lista.get(i));
            }
        }
        this.w.setSelectedIndex(-1);
    }

    public void setListaInfoUF(List<EstadoTO> lista) {
        this.q.removeAllItems();
        if (lista != null) {
            this.q.addItem(new EstadoTO("", "", ""));
            for (int i = 0; i < lista.size(); ++i) {
                this.q.addItem(lista.get(i));
            }
        }
    }

    public void setListaTipoAtendimento(IndAtendementoPresencialEnum[] tipoAtendimento) {
        this.t.removeAllItems();
        if (tipoAtendimento != null) {
            for (int i = 0; i < tipoAtendimento.length; ++i) {
                this.t.addItem(tipoAtendimento[i]);
            }
        }
        this.t.setSelectedIndex(0);
    }

    public void setListaOperacaoConsumidor(IndOperacaoConsumidorFinalEnum[] lista) {
        this.o.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.o.addItem(lista[i]);
            }
        }
        this.o.setSelectedIndex(0);
    }

    public void setListaISSRegimeEspecial(RegimeEspecialTributarioEnum[] lista) {
        this.s.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.s.addItem(lista[i]);
            }
        }
        this.s.setSelectedIndex(0);
    }

    public void setListaLocalDestino(IdentLocalDestinoEnum[] lista) {
        this.p.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.p.addItem(lista[i]);
            }
        }
        this.p.setSelectedIndex(0);
    }

    public TLocal getEnderecoEntrega() {
        return this.a;
    }

    public TLocal getEnderecoRetirada() {
        return this.b;
    }

    public void setEnderecoEntrega(TLocal endereco) {
        this.a = endereco;
    }

    public void setEnderecoRetirada(TLocal endereco) {
        this.b = endereco;
    }

    public NotaFiscalTO getNotaFiscalTO() {
        return this.a;
    }

    public ConsultaCadastroTO getTranspConsultaCadastroTO() {
        ConsultaCadastroTO consultaCadastroTO = new ConsultaCadastroTO();
        consultaCadastroTO.setTipoConsultaEnum(ConsultaCadastroTO.TipoConsultaEnum.TRANSPORTADORA);
        consultaCadastroTO.setUf(this.A.getSelectedItem() != null ? this.A.getSelectedItem().toString() : null);
        consultaCadastroTO.setIE(this.J.getText());
        consultaCadastroTO.setCNPJ(this.K.getText());
        return consultaCadastroTO;
    }

    public ConsultaCadastroTO getDestConsultaCadastroTO() {
        ConsultaCadastroTO consultaCadastroTO = new ConsultaCadastroTO();
        consultaCadastroTO.setTipoConsultaEnum(ConsultaCadastroTO.TipoConsultaEnum.CLIENTE);
        consultaCadastroTO.setUf(this.i.getSelectedItem() != null ? this.i.getSelectedItem().toString() : null);
        consultaCadastroTO.setIE(this.q.getText());
        consultaCadastroTO.setCNPJ(this.t.getText());
        consultaCadastroTO.setIeSuframa(this.s.getText());
        return consultaCadastroTO;
    }

    public NotaFiscalTO getUpdatedNotaFiscalTO() {
        this.b(this.a);
        this.a.clearErrors();
        this.a.clearMessages();
        this.a.setQuestionEnum(null);
        return this.a;
    }

    public void carregarCliente(ClienteTO clienteTO) {
        try {
            if (clienteTO != null) {
                this.k.setSelectedIndex(-1);
                this.b.uninstall();
                this.a.uninstall();
                String value = null;
                PaisTO paisTO = null;
                EstadoTO estadoTO = null;
                MunicipioTO municipioTO = null;
                paisTO = DSENUtilHelper.getInstance().getPaisTO(clienteTO.getCPais());
                estadoTO = !StringHelper.isBlankOrNull((Object)clienteTO.getUf()) ? DSENUtilHelper.getInstance().getSiglaEstadoTO(clienteTO.getUf()) : null;
                MunicipioTO municipioTO2 = municipioTO = clienteTO.getCMun() != null ? DSENUtilHelper.getInstance().getMunicipioTO(clienteTO.getCMun()) : null;
                if (TipoDocumentoEnum.CNPJ.equals((Object)clienteTO.getTpDocumentoEnum())) {
                    this.b.install(this.t);
                    value = StringHelper.cnpjFormat((String)clienteTO.getNrDocumento());
                } else if (TipoDocumentoEnum.CPF.equals((Object)clienteTO.getTpDocumentoEnum())) {
                    this.a.install(this.t);
                    value = StringHelper.cpfFormat((String)clienteTO.getNrDocumento());
                }
                String nrDoc = value;
                this.h.setSelectedItem((Object)clienteTO.getTpDocumentoEnum());
                this.t.setText(nrDoc);
                this.j.setText(clienteTO.getXNome());
                this.s.setText(clienteTO.getIesuf() != null ? clienteTO.getIesuf() : "");
                this.i.setText(clienteTO.getXLgr());
                this.f.setText(clienteTO.getNro());
                this.h.setText(clienteTO.getXCpl());
                this.g.setText(clienteTO.getXBairro());
                this.p.setText(clienteTO.getCep());
                this.e.setText(clienteTO.getEmail());
                this.k.setSelectedItem((Object)paisTO);
                if (paisTO != null) {
                    this.setListaDestEstado(DSENUtilHelper.getInstance().getEstadoTO(paisTO));
                    this.i.setSelectedItem((Object)estadoTO);
                    if (estadoTO != null) {
                        this.setListaDestMunicipio(DSENUtilHelper.getInstance().getMunicipioTO(estadoTO));
                        this.j.setSelectedItem((Object)municipioTO);
                    }
                }
                this.R.setText(clienteTO.getFone());
            }
        }
        catch (DSGEUtilException ex) {
            this.showErrors((DSGEBaseException)ex);
        }
    }

    public void setTransportadoraTO(TransportadoraTO transportadoraTO) {
        if (transportadoraTO != null) {
            this.c.uninstall();
            this.b.uninstall();
            this.A.setSelectedItem(0);
            String value = null;
            if (TipoDocumentoEnum.CNPJ.equals((Object)transportadoraTO.getTpDocumentoEnum())) {
                this.c.install(this.K);
                value = StringHelper.cnpjFormat((String)transportadoraTO.getNrDocumento());
            } else if (TipoDocumentoEnum.CPF.equals((Object)transportadoraTO.getTpDocumentoEnum())) {
                this.b.install(this.K);
                value = StringHelper.cpfFormat((String)transportadoraTO.getNrDocumento());
            }
            String text = value;
            this.z.setSelectedItem((Object)transportadoraTO.getTpDocumentoEnum());
            this.K.setText(text);
            this.Z.setText(transportadoraTO.getXNome());
            this.Y.setText(transportadoraTO.getXEnder());
            try {
                EstadoTO estadoTO = DSENUtilHelper.getInstance().getSiglaEstadoTO(transportadoraTO.getUf());
                this.A.setSelectedItem((Object)estadoTO);
                this.C.setSelectedItem((Object)DSENUtilHelper.getInstance().getMunicipioTO(estadoTO, transportadoraTO.getXMun()));
            }
            catch (DSGEUtilException e) {
                this.showErrors((DSGEBaseException)e);
            }
            this.a(transportadoraTO.getIe());
        }
    }

    public List<ProdutoNotaTO> getAllProdutoNotaTO() {
        return this.f.getAllTO();
    }

    public void adicionarProdutoNotaTO(ProdutoNotaTO produtoNotaTO) {
        this.f.addTO((BaseTO)produtoNotaTO);
    }

    public List<AutorizacaoTO> getAllAutorizacaoTO() {
        return this.g.getAllTO();
    }

    public void adicionarAutorizacaoTO(AutorizacaoTO autorizacaoTO) {
        this.g.addTO((BaseTO)autorizacaoTO);
    }

    public void adicionarReboqueTO(ReboqueTO reboqueTO) {
        this.i.addTO((BaseTO)reboqueTO);
    }

    public void excluirReboqueTO(List<ReboqueTO> lista) {
        this.i.removeTO(lista);
    }

    public void adicionarVolumeTO(VolumeTO volumeTO) {
        this.j.addTO((BaseTO)volumeTO);
    }

    public void refreshTableVolume() {
        ((DSGETableModel)this.j.getWrappedTable().getModel()).fireTableDataChanged();
    }

    public void refreshTableObsFisco() {
        ((DSGETableModel)this.m.getWrappedTable().getModel()).fireTableDataChanged();
    }

    public void refreshTableObsContrib() {
        ((DSGETableModel)this.l.getWrappedTable().getModel()).fireTableDataChanged();
    }

    public void refreshTableProcessoReferenciado() {
        ((DSGETableModel)this.n.getWrappedTable().getModel()).fireTableDataChanged();
    }

    public void excluirVolumeTO(List<VolumeTO> lista) {
        this.j.removeTO(lista);
    }

    public void adicionarDuplicataTO(DuplicataTO to) {
        this.k.addTO((BaseTO)to);
    }

    public void excluirDuplicataTO(List<DuplicataTO> lista) {
        this.k.removeTO(lista);
    }

    public void adicionarObservacaoContribuinteTO(ObservacaoNotaTO to) {
        this.l.addTO((BaseTO)to);
    }

    public void excluirObservacaoContribuinteTO(List<ObservacaoNotaTO> lista) {
        this.l.removeTO(lista);
    }

    public void adicionarObservacaoFiscoTO(ObservacaoNotaTO to) {
        this.m.addTO((BaseTO)to);
    }

    public void excluirObservacaoFiscoTO(List<ObservacaoNotaTO> lista) {
        this.m.removeTO(lista);
    }

    public void adicionarProcessoReferenciadoNotaTO(ProcessoReferenciadoNotaTO to) {
        this.n.addTO((BaseTO)to);
    }

    public void excluirProcessoReferenciadoTO(List<ProcessoReferenciadoNotaTO> lista) {
        this.n.removeTO(lista);
    }

    public List<ObservacaoNotaTO> getSelectedObservacaoContribuinteTOs() {
        return this.l.getSelectedItens(0);
    }

    public List<ObservacaoNotaTO> getAllObservacaoContribuinteTOs() {
        return this.l.getAllTO();
    }

    public ObservacaoNotaTO getSelectedObservaoContribuinteTO() {
        List lista = this.getSelectedObservacaoContribuinteTOs();
        ObservacaoNotaTO obsTO = null;
        if (lista != null && lista.size() > 0) {
            obsTO = (ObservacaoNotaTO)lista.get(0);
        }
        return obsTO;
    }

    public List<ObservacaoNotaTO> getSelectedObservacaoFiscoTOs() {
        return this.m.getSelectedItens(0);
    }

    public List<ObservacaoNotaTO> getAllObservacaoFiscoTOs() {
        return this.m.getAllTO();
    }

    public ObservacaoNotaTO getSelectedObservaoFiscoTO() {
        List lista = this.getSelectedObservacaoFiscoTOs();
        ObservacaoNotaTO obsTO = null;
        if (lista != null && lista.size() > 0) {
            obsTO = (ObservacaoNotaTO)lista.get(0);
        }
        return obsTO;
    }

    public List<ProcessoReferenciadoNotaTO> getSelectedProcessoReferenciadoTOs() {
        return this.n.getSelectedItens(0);
    }

    public ProcessoReferenciadoNotaTO getSelectedProcessoReferenciadoTO() {
        List lista = this.getSelectedProcessoReferenciadoTOs();
        ProcessoReferenciadoNotaTO procTO = null;
        if (lista != null && lista.size() > 0) {
            procTO = (ProcessoReferenciadoNotaTO)lista.get(0);
        }
        return procTO;
    }

    public List<DuplicataTO> getSelectedDuplicataTOs() {
        return this.k.getSelectedItens(0);
    }

    public DuplicataTO getSelectedDuplicataTO() {
        List lista = this.getSelectedDuplicataTOs();
        DuplicataTO duplicataTO = null;
        if (lista != null && lista.size() > 0) {
            duplicataTO = (DuplicataTO)lista.get(0);
        }
        return duplicataTO;
    }

    public void setEmitenteTO(EmitenteTO emitenteTO) {
        if (emitenteTO != null) {
            this.w.setText(emitenteTO.getNrDocumento());
            this.p.setText(emitenteTO.getXNome());
            this.n.setText(emitenteTO.getXFant());
            this.x.setText(emitenteTO.getIe());
            this.y.setText(emitenteTO.getIest());
            this.z.setText(emitenteTO.getIm());
            this.v.setText(emitenteTO.getCnae() != null ? emitenteTO.getCnae().toString() : null);
            this.o.setText(emitenteTO.getXLgr());
            this.k.setText(emitenteTO.getNro());
            this.m.setText(emitenteTO.getXCpl());
            this.l.setText(emitenteTO.getXBairro());
            this.u.setText(emitenteTO.getCep());
            this.S.setText(emitenteTO.getFone() != null ? emitenteTO.getFone().toString() : null);
            try {
                PaisTO paisTO = DSENUtilHelper.getInstance().getPaisTO(emitenteTO.getCPais());
                EstadoTO estadoTO = !StringHelper.isBlankOrNull((Object)emitenteTO.getUf()) ? DSENUtilHelper.getInstance().getSiglaEstadoTO(emitenteTO.getUf()) : null;
                MunicipioTO municipioTO = emitenteTO.getCMun() != null ? DSENUtilHelper.getInstance().getMunicipioTO(emitenteTO.getCMun()) : null;
                this.m.setSelectedItem((Object)paisTO);
                if (paisTO != null) {
                    this.setListaEmitEstado(DSENUtilHelper.getInstance().getEstadoTO(paisTO));
                    this.n.setSelectedItem((Object)estadoTO);
                    this.f.setSelectedItem((Object)estadoTO);
                    if (estadoTO != null) {
                        this.setListaEmitMunicipio(DSENUtilHelper.getInstance().getMunicipioTO(estadoTO));
                        this.l.setSelectedItem((Object)municipioTO);
                        this.a.setSelectedItem((Object)municipioTO);
                    }
                }
            }
            catch (DSGEUtilException ex) {
                this.showErrors((DSGEBaseException)ex);
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        TipoDocumentoEnum tpDocumento;
        TipoDocumentoEnum tpDocumento2;
        String nrDocLabel;
        if (e.getSource() == this.A && e.getStateChange() == 1) {
            EstadoTO estadoTO = (EstadoTO)this.A.getSelectedItem();
            if ("EX".equals(estadoTO.getSigla())) {
                this.b.uninstall();
                this.c.uninstall();
                this.d.setEnabled(false);
                this.d.setSelected(false);
                this.z.setEnabled(false);
                this.z.setSelectedIndex(-1);
                this.K.setEnabled(false);
                this.bi.setText((Object)TipoDocumentoEnum.CPF + "/" + (Object)TipoDocumentoEnum.CNPJ);
                this.K.setText("");
                this.J.setEnabled(false);
                this.J.setText("");
            } else {
                tpDocumento = (TipoDocumentoEnum)this.z.getSelectedItem();
                nrDocLabel = tpDocumento == null ? (Object)TipoDocumentoEnum.CPF + "/" + (Object)TipoDocumentoEnum.CNPJ : (TipoDocumentoEnum.CNPJ.equals((Object)tpDocumento) ? TipoDocumentoEnum.CNPJ.toString() : TipoDocumentoEnum.CPF.toString());
                if (this.getOperacao().equals("manterNotaOperacaoEdicao")) {
                    this.z.setEnabled(true);
                }
                if (tpDocumento != null) {
                    this.bi.setText("* " + nrDocLabel);
                }
                if (this.z.getSelectedIndex() >= 0) {
                    if (this.getOperacao().equals("manterNotaOperacaoEdicao")) {
                        this.K.setEnabled(true);
                    }
                } else {
                    this.K.setEnabled(false);
                }
                if (this.getOperacao().equals("manterNotaOperacaoEdicao")) {
                    this.d.setEnabled(true);
                }
                if (this.d.isSelected()) {
                    this.J.setEnabled(false);
                } else if (this.getOperacao().equals("manterNotaOperacaoEdicao")) {
                    this.J.setEnabled(true);
                }
            }
        } else if (e.getSource() == this.z) {
            tpDocumento2 = (TipoDocumentoEnum)this.z.getSelectedItem();
            if (tpDocumento2 == null) {
                this.b.uninstall();
                this.c.uninstall();
                this.K.setEnabled(false);
                this.bi.setText((Object)TipoDocumentoEnum.CPF + "/" + (Object)TipoDocumentoEnum.CNPJ);
            } else if (tpDocumento2 != null && e.getStateChange() == 1) {
                if (tpDocumento2.equals((Object)TipoDocumentoEnum.CPF)) {
                    if (this.getOperacao().equals("manterNotaOperacaoEdicao")) {
                        this.K.setEnabled(true);
                    }
                    this.bi.setText("* " + (Object)TipoDocumentoEnum.CPF);
                    this.b.uninstall();
                    this.c.uninstall();
                    this.b.install(this.K);
                } else {
                    if (this.getOperacao().equals("manterNotaOperacaoEdicao")) {
                        this.K.setEnabled(true);
                    }
                    this.bi.setText("* " + TipoDocumentoEnum.CNPJ.toString());
                    this.b.uninstall();
                    this.c.uninstall();
                    this.c.install(this.K);
                }
            }
        }
        if (e.getSource() == this.k && e.getStateChange() == 1) {
            PaisTO paisTO = (PaisTO)this.k.getSelectedItem();
            if (!StringHelper.isBlankOrNull((Object)paisTO.getCodigo()) && !DSENConstants.BRASIL.equals(paisTO.getCodigo())) {
                this.a.uninstall();
                this.b.uninstall();
                this.h.setEnabled(false);
                this.h.setSelectedItem((Object)TipoDocumentoDestEnum.ESTRANGEIRO);
                this.t.setEnabled(true);
                this.A.setText("Documento");
                this.B.setText(DSENLabelConstants.TIPO_DE_DOCUMENTO);
                this.q.setEnabled(false);
                this.q.setText("");
                this.s.setEnabled(false);
                this.s.setText("");
            } else {
                this.B.setText("* " + DSENLabelConstants.TIPO_DE_DOCUMENTO);
                tpDocumento = (TipoDocumentoDestEnum)this.h.getSelectedItem();
                nrDocLabel = tpDocumento == null ? (Object)TipoDocumentoDestEnum.CPF + "/" + (Object)TipoDocumentoDestEnum.CNPJ : (TipoDocumentoDestEnum.CNPJ.equals((Object)tpDocumento) ? TipoDocumentoDestEnum.CNPJ.toString() : (TipoDocumentoDestEnum.CPF.equals((Object)tpDocumento) ? TipoDocumentoDestEnum.CPF.toString() : "Documento"));
                if (this.getOperacao().equals("manterNotaOperacaoEdicao")) {
                    this.h.setEnabled(true);
                }
                if (tpDocumento != null) {
                    this.A.setText("* " + nrDocLabel);
                }
                if (this.h.getSelectedIndex() >= 0) {
                    if (this.getOperacao().equals("manterNotaOperacaoEdicao")) {
                        this.t.setEnabled(true);
                    }
                } else {
                    this.t.setEnabled(false);
                }
                if (this.getOperacao().equals("manterNotaOperacaoEdicao")) {
                    this.s.setEnabled(true);
                }
            }
        } else if (e.getSource() == this.h) {
            tpDocumento2 = (TipoDocumentoDestEnum)this.h.getSelectedItem();
            if (tpDocumento2 == null) {
                this.a.uninstall();
                this.b.uninstall();
                this.t.setEnabled(false);
                this.A.setText("Documento");
            } else if (tpDocumento2 != null && e.getStateChange() == 1) {
                if (tpDocumento2.equals((Object)TipoDocumentoDestEnum.CPF)) {
                    if (this.getOperacao().equals("manterNotaOperacaoEdicao")) {
                        this.t.setEnabled(true);
                    }
                    this.A.setText("* " + (Object)TipoDocumentoEnum.CPF);
                    this.a.uninstall();
                    this.b.uninstall();
                    this.a.uninstall();
                    this.a.install(this.t);
                } else if (tpDocumento2.equals((Object)TipoDocumentoDestEnum.CNPJ)) {
                    if (this.getOperacao().equals("manterNotaOperacaoEdicao")) {
                        this.t.setEnabled(true);
                    }
                    this.A.setText("* " + TipoDocumentoEnum.CNPJ.toString());
                    this.a.uninstall();
                    this.b.uninstall();
                    this.a.uninstall();
                    this.b.install(this.t);
                } else if (tpDocumento2.equals((Object)TipoDocumentoDestEnum.ESTRANGEIRO)) {
                    if (this.getOperacao().equals("manterNotaOperacaoEdicao")) {
                        this.t.setEnabled(true);
                    }
                    this.A.setText("Documento");
                    this.a.uninstall();
                    this.b.uninstall();
                    this.a.uninstall();
                }
            }
        } else if (e.getSource() == this.a || e.getSource() == this.b || e.getSource() == this.c) {
            if (e.getStateChange() == 1) {
                this.x();
            }
        } else if (this.y == e.getSource() && e.getStateChange() == 1) {
            this.a((ModalidadeFreteEnum)e.getItem());
        }
        if (this.c == e.getSource() && !this.getOperacao().equals("manterNotaOperacaoDetalhe")) {
            this.a(1 == e.getStateChange());
        }
        if (this.c == e.getSource()) {
            this.updateDadosContingencia(null, null);
        }
    }

    private void a(ModalidadeFreteEnum modalidadeFreteEnum) {
        switch (22.c[modalidadeFreteEnum.ordinal()]) {
            case 1: {
                this.w();
                this.disableComponents("MANTER_NOTA_TRANS_TODOS_CAMPOS");
                break;
            }
            default: {
                if (!this.getOperacao().equals("manterNotaOperacaoEdicao")) break;
                this.enableComponents("MANTER_NOTA_TRANS_TODOS_CAMPOS");
                this.x();
                this.verificarSelecionadosTabela(this.getSelectedReboqueTOs(), DSENLabelConstants.REBOQUE);
                this.verificarSelecionadosTabela(this.getSelectedVolumeTOs(), DSENLabelConstants.VOLUME);
                this.z.setSelectedIndex(0);
                this.itemStateChanged(new ItemEvent(this.z, -1, null, 1));
            }
        }
    }

    private void w() {
        this.Q.setText("");
        this.a.setText("");
        this.z.setSelectedIndex(-1);
        this.K.setText("");
        this.d.setSelected(false);
        this.Z.setText("");
        this.J.setText("");
        this.Y.setText("");
        this.A.setSelectedIndex(-1);
        this.C.setSelectedIndex(-1);
        this.M.setText("");
        this.L.setText("");
        this.N.setText("");
        if (this.a.isSelected()) {
            this.a.setSelected(false);
        }
        if (this.b.isSelected()) {
            this.b.setSelected(false);
        }
        if (this.c.isSelected()) {
            this.c.setSelected(false);
        }
        this.O.setText("");
        this.x.setSelectedIndex(-1);
        this.w.setSelectedIndex(-1);
        this.v.setSelectedIndex(0);
        this.P.setText("");
        this.X.setText("");
        this.B.setSelectedIndex(-1);
        this.i.removeAllTO();
        this.j.removeAllTO();
    }

    private void x() {
        this.y();
        this.Q.setText(null);
        this.a.setText(null);
        if (this.a.isSelected()) {
            if (!this.getOperacao().equals("manterNotaOperacaoDetalhe")) {
                this.enableComponents("MANTER_NOTA_TRANS_BALSA");
            }
            this.disableComponents("MANTER_NOTA_TRANS_VAGAO");
            this.disableComponents("MANTER_NOTA_TRANS_VEICULO_REBOQUE");
        } else if (this.b.isSelected()) {
            this.disableComponents("MANTER_NOTA_TRANS_BALSA");
            if (!this.getOperacao().equals("manterNotaOperacaoDetalhe")) {
                this.enableComponents("MANTER_NOTA_TRANS_VAGAO");
            }
            this.disableComponents("MANTER_NOTA_TRANS_VEICULO_REBOQUE");
        } else if (this.c.isSelected()) {
            this.disableComponents("MANTER_NOTA_TRANS_BALSA");
            this.disableComponents("MANTER_NOTA_TRANS_VAGAO");
            if (!this.getOperacao().equals("manterNotaOperacaoDetalhe")) {
                this.enableComponents("MANTER_NOTA_TRANS_VEICULO_REBOQUE");
            }
        } else {
            this.disableComponents("MANTER_NOTA_TRANS_BALSA");
            this.disableComponents("MANTER_NOTA_TRANS_VAGAO");
            this.disableComponents("MANTER_NOTA_TRANS_VEICULO_REBOQUE");
        }
    }

    private void y() {
        this.P.setText("");
        this.X.setText(null);
        this.B.setSelectedIndex(-1);
        this.i.removeAllTO();
    }

    private void a(boolean informar) {
        if (informar) {
            this.f.setVisible(true);
            this.i.setVisible(true);
            this.F.setVisible(true);
            this.q.setVisible(true);
        } else {
            this.f.setVisible(false);
            this.i.setVisible(false);
            this.F.setVisible(false);
            this.q.setVisible(false);
            this.f.setText(null);
            this.i.setText(null);
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == this.v) {
            if (!StringHelper.isBlankOrNull((Object)this.v.getText())) {
                this.v.setText(StringHelper.completaComZerosAEsquerda((String)this.v.getText(), (int)7));
            }
        } else if (e.getSource() == this.w) {
            if (!StringHelper.isBlankOrNull((Object)this.w.getText())) {
                try {
                    String cnpj = StringHelper.completaComZerosAEsquerda((String)this.a.stringToValue(this.w.getText()).toString(), (int)14);
                    this.w.setText(cnpj);
                }
                catch (ParseException cnpj) {}
            }
        } else if (e.getSource() == this.t) {
            TipoDocumentoDestEnum tpDocumento = (TipoDocumentoDestEnum)this.h.getSelectedItem();
            if (tpDocumento != null && !StringHelper.isBlankOrNull((Object)this.t.getText())) {
                if (tpDocumento.equals((Object)TipoDocumentoDestEnum.CNPJ)) {
                    try {
                        String cnpj = this.b.stringToValue(this.t.getText()).toString();
                        if (!StringHelper.isBlankOrNull((Object)cnpj)) {
                            cnpj = StringHelper.completaComZerosAEsquerda((String)cnpj, (int)14);
                        }
                        this.t.setText(cnpj);
                    }
                    catch (ParseException cnpj) {}
                } else if (tpDocumento.equals((Object)TipoDocumentoDestEnum.CPF)) {
                    try {
                        String cpf = this.a.stringToValue(this.t.getText()).toString();
                        if (!StringHelper.isBlankOrNull((Object)cpf)) {
                            cpf = StringHelper.completaComZerosAEsquerda((String)cpf, (int)11);
                        }
                        this.t.setText(cpf);
                    }
                    catch (ParseException cpf) {}
                } else {
                    String docEstrangeiro = StringHelper.unformatDocument((String)this.t.getText()).toString();
                    if (!StringHelper.isBlankOrNull((Object)docEstrangeiro)) {
                        docEstrangeiro = StringHelper.completaComZerosAEsquerda((String)docEstrangeiro, (int)14);
                    }
                    this.t.setText(docEstrangeiro);
                }
            }
        } else if (e.getSource() == this.K) {
            TipoDocumentoEnum tpDocumento = (TipoDocumentoEnum)this.z.getSelectedItem();
            if (tpDocumento != null && !StringHelper.isBlankOrNull((Object)this.K.getText())) {
                if (tpDocumento.equals((Object)TipoDocumentoEnum.CNPJ)) {
                    try {
                        String cnpj = this.c.stringToValue(this.K.getText()).toString();
                        if (!StringHelper.isBlankOrNull((Object)cnpj)) {
                            cnpj = StringHelper.completaComZerosAEsquerda((String)cnpj, (int)14);
                        }
                        this.K.setText(cnpj);
                    }
                    catch (ParseException cnpj) {}
                } else {
                    try {
                        String cpf = this.b.stringToValue(this.K.getText()).toString();
                        if (!StringHelper.isBlankOrNull((Object)cpf)) {
                            cpf = StringHelper.completaComZerosAEsquerda((String)cpf, (int)11);
                        }
                        this.K.setText(cpf);
                    }
                    catch (ParseException cpf) {}
                }
            }
        } else if (e.getSource() == this.k) {
            String serie = StringHelper.completaComZerosAEsquerda((String)this.k.getText(), (int)3);
            this.k.setText(serie);
        } else if (e.getSource() == this.j) {
            String nnf = StringHelper.completaComZerosAEsquerda((String)this.j.getText(), (int)9);
            this.j.setText(nnf);
            this.H.setText(nnf);
        } else if (e.getSource() == this.g) {
            if (StringHelper.isBlankOrNull((Object)this.g.getText().replaceAll("\\D", ""))) {
                this.g.setText(DateHelper.formataData((Date)new Date()));
            }
        } else if (e.getSource() == this.T) {
            this.atualizaTotaisFornecimentos();
        } else if (e.getSource() == this.X) {
            this.atualizaTotaisFornecimentos();
            this.atualizaTotaisDeducoes();
        } else if (e.getSource() == this.G) {
            this.t();
        } else if (e.getSource() == this.F) {
            this.t();
        }
        if (!StringHelper.isBlankOrNull((Object)this.f.getText())) {
            this.f.setText(StringHelper.completaComZerosAEsquerda((String)this.f.getText(), (int)8));
        }
        this.i.setText(this.getDigitoVerificador());
    }

    public String getDigitoVerificador() {
        String codigoUFEmitente;
        EmitenteTO emitenteLogado = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
        try {
            codigoUFEmitente = DSENUtilHelper.getInstance().getEstadoTOBySigla(emitenteLogado.getUf()).getCodigo();
        }
        catch (DSGEUtilException e) {
            this.showErrors((DSGEBaseException)e);
            return null;
        }
        String cnpj = !StringHelper.isBlankOrNull((Object)this.w.getText()) ? this.w.getText().replaceAll("\\D", "") : null;
        String ano = null;
        String mes = null;
        String modelo = this.c.getText();
        Date dataEmissao = this.getDataEmissao();
        if (dataEmissao != null) {
            GregorianCalendar calendarEmissao = new GregorianCalendar();
            calendarEmissao.setTime(dataEmissao);
            ano = ChaveAcessoUtil.DATA_MODELO_FORMAT.format(calendarEmissao.get(1) % 100);
            mes = ChaveAcessoUtil.DATA_MODELO_FORMAT.format(calendarEmissao.get(2) + 1);
        }
        String codigoNumerico = this.f.getText();
        String serie = this.k.getText();
        String numero = this.j.getText();
        TipoEmissaoEnum tipoEmissaoEnum = (TipoEmissaoEnum)this.c.getSelectedItem();
        if (!(StringHelper.isBlankOrNull((Object)codigoUFEmitente) || StringHelper.isBlankOrNull((Object)ano) || StringHelper.isBlankOrNull((Object)mes) || StringHelper.isBlankOrNull((Object)cnpj) || StringHelper.isBlankOrNull((Object)modelo) || StringHelper.isBlankOrNull((Object)serie) || StringHelper.isBlankOrNull((Object)numero) || StringHelper.isBlankOrNull((Object)codigoNumerico) || tipoEmissaoEnum == null || codigoNumerico.length() != 8)) {
            return ChaveAcessoUtil.gerarDigitoChaveAcesso((String)codigoUFEmitente, (String)ano, (String)mes, (String)cnpj, (String)modelo, (String)serie, (String)numero, (String)tipoEmissaoEnum.getCodigo(), (String)codigoNumerico);
        }
        return "";
    }

    public List<RefNFTO> getAllRefNFTO() {
        return this.c.getAllTO();
    }

    public List<RefNFPTO> getAllRefNFPTO() {
        return this.d.getAllTO();
    }

    public List<RefECFTO> getAllRefECFTO() {
        return this.e.getAllTO();
    }

    public List<VolumeTO> getAllVolumeTO() {
        return this.j.getAllTO();
    }

    public List<DuplicataTO> getAllDuplicataTO() {
        return this.k.getAllTO();
    }

    public List<ProcessoReferenciadoNotaTO> getAllProcessoReferenciadoTO() {
        return this.n.getAllTO();
    }

    public void updateValorICMSTransporte(NotaFiscalTO notaFiscalTO) {
        try {
            NFeDocument nfe = DocumentoUtil.getNFeDocument((String)notaFiscalTO.getDocXmlString());
            if (nfe.getNFe().getInfNFe().getTransp().getRetTransp() != null) {
                TNFe.InfNFe.Transp.RetTransp retTransp = nfe.getNFe().getInfNFe().getTransp().getRetTransp();
                this.N.setText(!StringHelper.isBlankOrNull((Object)retTransp.getVICMSRet()) ? StringHelper.formataValor((BigDecimal)new BigDecimal(retTransp.getVICMSRet()), (int)2, (int)2) : null);
            }
        }
        catch (XmlException nfe) {
            // empty catch block
        }
    }

    public void setEditarCommand() {
        this.F.setActionCommand("editar");
        this.F.setText(DSENLabelConstants.EDITAR);
    }

    public void setSalvarCommand() {
        this.F.setActionCommand("salvar");
        this.F.setText(DSENLabelConstants.SALVAR);
    }

    public void firePropertyChange(String propertyName) {
        this.firePropertyChange(propertyName, (Object)null, (Object)null);
    }

    private String a() {
        String digestValue = null;
        try {
            NFeDocument nfe = DocumentoUtil.getNFeDocument((String)this.a.getDocXmlString());
            if (nfe != null && nfe.getNFe().getSignature() != null) {
                digestValue = new String(nfe.getNFe().getSignature().getSignedInfo().getReference().getDigestValue());
            }
        }
        catch (Exception nfe) {
            // empty catch block
        }
        return digestValue;
    }

    @Override
    public void keyPressed(KeyEvent arg0) {
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        this.P.setText(this.P.getText().toUpperCase() + Character.toUpperCase(arg0.getKeyChar()));
        arg0.consume();
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
    }

    public void setSelectedTab(int index) {
        this.d.setSelectedIndex(index);
    }

    public String getSerie() {
        return this.k.getText();
    }

    public String getNumero() {
        return this.j.getText();
    }

    public void setNumero(String numero) {
        this.j.setText(numero);
    }

    public Date getDataEmissao() {
        return !StringHelper.isBlankOrNull((Object)this.g.getText().replaceAll("[_/:]", "")) ? DateHelper.getDate((String)this.g.getText(), (SimpleDateFormat)DateHelper.DATE_FORMAT) : new Date();
    }

    public void updateDadosContingencia(String dataHora, String justificativa) {
        if (TipoEmissaoEnum.NORMAL.equals(this.c.getSelectedItem())) {
            this.w.setVisible(false);
            this.ad.setVisible(false);
            this.f.setVisible(false);
            this.n.setVisible(false);
            this.o.setVisible(false);
            this.f.setText("");
            this.o.setText("");
        } else {
            this.w.setVisible(true);
            this.ad.setVisible(true);
            this.f.setVisible(true);
            this.n.setVisible(true);
            this.o.setVisible(true);
            this.f.setText(justificativa);
            this.o.setText(dataHora);
        }
    }

    private EventoTO a(TipoEventoEnum tpEvento) {
        EventoTO eventoTO = new EventoTO();
        eventoTO.setXmlProcString(this.a.getProtocoloString());
        eventoTO.setTpEvento(tpEvento);
        eventoTO.setNumProtocolo(this.a.getNumeroProtocolo());
        eventoTO.setNotaFiscalTO(this.a);
        eventoTO.setMensagemErro(this.a.getMensagemErro());
        eventoTO.setCErro(this.a.getCodigoErro());
        eventoTO.setDataRegEvento(this.a.getDataAutorizacao());
        eventoTO.setDataEvento(this.a.getLoteTO() != null ? this.a.getLoteTO().getDataProcessamento() : this.a.getDataAutorizacao());
        eventoTO.setnSeqEvento(new Integer(1));
        return eventoTO;
    }

    public void atualizarTabelaEventosNfe(NotaFiscalTO notaFiscalTO) {
        this.E.setVisible(true);
        this.h.removeAllTO();
        ArrayList<EventoTO> listEventos = new ArrayList<EventoTO>();
        switch (22.b[notaFiscalTO.getSituacao().ordinal()]) {
            case 1: {
                listEventos.add(this.a(TipoEventoEnum.e110100));
                break;
            }
            case 3: {
                listEventos.add(this.a(TipoEventoEnum.e110100));
                break;
            }
            case 4: {
                listEventos.add(this.a(TipoEventoEnum.e110100));
                EventoTO eventoCancelada = new EventoTO();
                CancelamentoTO cancelamentoTO = notaFiscalTO.getCancelamentoTO();
                eventoCancelada.setXmlProcString(cancelamentoTO.getProtocoloString());
                eventoCancelada.setTpEvento(TipoEventoEnum.e110111);
                eventoCancelada.setNumProtocolo(cancelamentoTO.getNumeroProtocolo());
                eventoCancelada.setNotaFiscalTO(notaFiscalTO);
                eventoCancelada.setMensagemErro(cancelamentoTO.getMensagemErro());
                eventoCancelada.setCErro(cancelamentoTO.getCodigoErro());
                eventoCancelada.setDataRegEvento(cancelamentoTO.getDataProtocolo());
                eventoCancelada.setDataEvento(cancelamentoTO.getDataProtocolo());
                eventoCancelada.setnSeqEvento(new Integer(1));
                listEventos.add(eventoCancelada);
                break;
            }
            case 5: {
                listEventos.add(this.a(TipoEventoEnum.e110101));
            }
        }
        if (notaFiscalTO.getEventoTOList() != null) {
            listEventos.addAll(notaFiscalTO.getEventoTOList());
            for (EventoTO eventoTO : listEventos) {
                try {
                    ProcEventoNFeDocument e = DocumentoUtil.getProcEventoNFeDocument((String)eventoTO.getXmlProcString());
                    String codigo = e.getProcEventoNFe().getRetEvento().getInfEvento().getCStat();
                    if (!DSENConstants.CODIGO_CANCELAMENTO_EVENTO_FORA_PRAZO.equalsIgnoreCase(codigo)) continue;
                    eventoTO.setCErro(DSENConstants.CODIGO_CANCELAMENTO_EVENTO_FORA_PRAZO);
                    eventoTO.setMensagemErro(e.getProcEventoNFe().getRetEvento().getInfEvento().getXMotivo());
                }
                catch (DSENCommonException e) {}
            }
        }
        if (listEventos.isEmpty()) {
            this.E.setVisible(false);
            return;
        }
        Collections.sort(listEventos);
        for (EventoTO eventoTO : listEventos) {
            this.addEvento(eventoTO);
        }
    }

    private void z() throws ParseException {
        if (!StringHelper.isBlankOrNull((Object)this.G.getText().replace("/", "")) && this.G.getText().matches("(0[1-9]|1[0-2])([/][2][0-9][0-9][0-9])")) {
            Date d1 = null;
            Calendar c = null;
            d1 = DateHelper.getDate((String)("01/" + this.G.getText()), (SimpleDateFormat)DateHelper.DATE_FORMAT);
            c = Calendar.getInstance();
            c.setTime(d1);
            int maxDay = c.getActualMaximum(5);
            List listaFornecimento = this.a.getWrappedTable().getAllTO();
            if (listaFornecimento != null) {
                for (int i = 0; i < listaFornecimento.size(); ++i) {
                    FornecimentoTO fornecimentoTO = (FornecimentoTO)listaFornecimento.get(i);
                    if (Integer.parseInt(fornecimentoTO.getDia()) <= maxDay) continue;
                    throw new ParseException(MessageFormat.format(DSENMessageConstants.MSG_CANA_REFERENCIA_INVALIDA_FORNECIMENTO, fornecimentoTO.getDia()), 0);
                }
            }
        }
    }

    public RegimeTributarioEnum getRegimeTributario() {
        return (RegimeTributarioEnum)this.r.getSelectedItem();
    }

    public void verificarSelecionadosTabela(List<? extends BaseTO> lista, String tipo) {
        this.disableComponents("MANTER_NFE_INICIO_DESABILITADO" + tipo);
        if (lista == null || lista.size() == 0) {
            if (!this.getOperacao().equals("manterNotaOperacaoDetalhe")) {
                this.enableComponents("MANTER_NFE_EDICAO" + tipo + "0");
            } else {
                this.enableComponents("MANTER_NFE_DETALHE" + tipo + "0");
            }
            return;
        }
        if (lista.size() == 1) {
            if (!this.getOperacao().equals("manterNotaOperacaoDetalhe")) {
                this.enableComponents("MANTER_NFE_EDICAO" + tipo + "1");
            } else {
                this.enableComponents("MANTER_NFE_DETALHE" + tipo + "1");
            }
        } else if (!this.getOperacao().equals("manterNotaOperacaoDetalhe")) {
            this.enableComponents("MANTER_NFE_EDICAO" + tipo + "*");
        } else {
            this.enableComponents("MANTER_NFE_DETALHE" + tipo + "*");
        }
    }

    public String getMesAnoRefCana() {
        return this.G.getText();
    }

    static /* synthetic */ void a(DigitarNotaFiscalGUI x0) throws ParseException {
        x0.z();
    }

    static /* synthetic */ JFormattedTextField a(DigitarNotaFiscalGUI x0) {
        return x0.t;
    }

    static /* synthetic */ String a(DigitarNotaFiscalGUI x0, EventoTO x1) {
        return x0.a(x1);
    }

    static /* synthetic */ void a(DigitarNotaFiscalGUI x0, ItemEvent x1) {
        x0.b(x1);
    }

    static /* synthetic */ void b(DigitarNotaFiscalGUI x0, ItemEvent x1) {
        x0.c(x1);
    }
}

