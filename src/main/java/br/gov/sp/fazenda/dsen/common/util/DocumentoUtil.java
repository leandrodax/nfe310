/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.DSENSchemaTypeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.IndCredCTeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.IndCredNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoConsultaDpecEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEventoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.WSStatusRetorno
 *  br.gov.sp.fazenda.dsen.common.exception.DSENCommonException
 *  br.gov.sp.fazenda.dsen.common.to.CancelamentoEventoTO
 *  br.gov.sp.fazenda.dsen.common.to.CancelamentoTO
 *  br.gov.sp.fazenda.dsen.common.to.CartaCorrecaoTO
 *  br.gov.sp.fazenda.dsen.common.to.ClienteTO
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO$DocumentoConsultaEnum
 *  br.gov.sp.fazenda.dsen.common.to.DpecTO
 *  br.gov.sp.fazenda.dsen.common.to.DpecTO$DpecStatus
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.EstabelecimentoTO
 *  br.gov.sp.fazenda.dsen.common.to.EventoTO
 *  br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO
 *  br.gov.sp.fazenda.dsen.common.to.LoteTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoTO
 *  br.gov.sp.fazenda.dsen.common.to.TransportadoraTO
 *  br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil$1
 *  br.gov.sp.fazenda.dsen.schemas.dpec.v101.ConsDPECDocument
 *  br.gov.sp.fazenda.dsen.schemas.dpec.v101.ConsDPECDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.dpec.v101.EnvDPECDocument
 *  br.gov.sp.fazenda.dsen.schemas.dpec.v101.EnvDPECDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.dpec.v101.RetConsDPECDocument
 *  br.gov.sp.fazenda.dsen.schemas.dpec.v101.RetConsDPECDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.dpec.v101.RetDPECDocument
 *  br.gov.sp.fazenda.dsen.schemas.dpec.v101.RetDPECDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.dpec.v101.TAmb
 *  br.gov.sp.fazenda.dsen.schemas.dpec.v101.TAmb$Enum
 *  br.gov.sp.fazenda.dsen.schemas.dpec.v101.TCodUfIBGE
 *  br.gov.sp.fazenda.dsen.schemas.dpec.v101.TCodUfIBGE$Enum
 *  br.gov.sp.fazenda.dsen.schemas.dpec.v101.TConsDPEC
 *  br.gov.sp.fazenda.dsen.schemas.dpec.v101.TDPEC
 *  br.gov.sp.fazenda.dsen.schemas.dpec.v101.TDPEC$InfDPEC
 *  br.gov.sp.fazenda.dsen.schemas.dpec.v101.TDPEC$InfDPEC$IdeDec
 *  br.gov.sp.fazenda.dsen.schemas.dpec.v101.TDPEC$InfDPEC$ResNFe
 *  br.gov.sp.fazenda.dsen.schemas.dpec.v101.TRetConsDPEC
 *  br.gov.sp.fazenda.dsen.schemas.dpec.v101.TRetDPEC
 *  br.gov.sp.fazenda.dsen.schemas.dpec.v101.TRetDPEC$InfDPECReg
 *  br.gov.sp.fazenda.dsen.schemas.dpec.v101.TUf
 *  br.gov.sp.fazenda.dsen.schemas.dpec.v101.TUf$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.CancelamentoDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.CancelamentoDocument$Cancelamento
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.CancelamentoDocument$Cancelamento$DetEvento
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.CancelamentoDocument$Cancelamento$DetEvento$DescEvento
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.CancelamentoDocument$Cancelamento$DetEvento$DescEvento$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.CancelamentoDocument$Cancelamento$DetEvento$Versao
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.CancelamentoDocument$Cancelamento$DetEvento$Versao$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.CancelamentoDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.CartaCorrecaoDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.CartaCorrecaoDocument$CartaCorrecao
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.CartaCorrecaoDocument$CartaCorrecao$DetEvento
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.CartaCorrecaoDocument$CartaCorrecao$DetEvento$DescEvento
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.CartaCorrecaoDocument$CartaCorrecao$DetEvento$DescEvento$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.CartaCorrecaoDocument$CartaCorrecao$DetEvento$Versao
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.CartaCorrecaoDocument$CartaCorrecao$DetEvento$Versao$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.CartaCorrecaoDocument$CartaCorrecao$DetEvento$XCondUso
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.CartaCorrecaoDocument$CartaCorrecao$DetEvento$XCondUso$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.CartaCorrecaoDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.ConsCadDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.ConsCadDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.ConsReciNFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.ConsReciNFeDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.ConsSitNFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.ConsSitNFeDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.ConsStatServDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.ConsStatServDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.EnvEventoDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.EnvEventoDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.EnviNFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.EnviNFeDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.InutNFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.InutNFeDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.NfeProcDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.NfeProcDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.ProcEventoNFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.ProcEventoNFeDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.ProcInutNFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.ProcInutNFeDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.ReferenceType
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetConsCadDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetConsCadDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetConsReciNFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetConsReciNFeDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetConsSitNFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetConsSitNFeDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetConsStatServDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetConsStatServDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetEnvEventoDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetEnvEventoDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetEnviNFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetEnviNFeDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetInutNFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetInutNFeDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.SignatureType
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.SignedInfoType
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TAmb
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TAmb$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCOrgaoIBGE
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCOrgaoIBGE$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCfop
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCfop$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCfopTransp
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCfopTransp$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCodUfIBGE
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCodUfIBGE$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TConsCad
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TConsCad$InfCons
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TConsCad$InfCons$XServ
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TConsCad$InfCons$XServ$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TConsReciNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TConsSitNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TConsSitNFe$XServ
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TConsSitNFe$XServ$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TConsStatServ
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TConsStatServ$XServ
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TConsStatServ$XServ$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEnderecoConsCad
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEnvEvento
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEnviNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEnviNFe$IndSinc
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEnviNFe$IndSinc$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEvento
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEvento$InfEvento
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEvento$InfEvento$DetEvento
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEvento$InfEvento$DetEvento$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TInutNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TInutNFe$InfInut
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TInutNFe$InfInut$XServ
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TInutNFe$InfInut$XServ$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TMod
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TMod$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Total
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Total$ICMSTot
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Transp
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Transp$RetTransp
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNfeProc
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProcEvento
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProcInutNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProtNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProtNFe$InfProt
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetConsCad
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetConsCad$InfCons
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetConsCad$InfCons$InfCad
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetConsCad$InfCons$InfCad$CSit
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetConsCad$InfCons$InfCad$CSit$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetConsCad$InfCons$InfCad$IndCredCTe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetConsCad$InfCons$InfCad$IndCredCTe$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetConsCad$InfCons$InfCad$IndCredNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetConsCad$InfCons$InfCad$IndCredNFe$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetConsReciNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetConsSitNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetConsStatServ
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetEnvEvento
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetEnviNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetEnviNFe$InfRec
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetEvento
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetEvento$InfEvento
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetInutNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetInutNFe$InfInut
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUf
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUf$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUfCons
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUfCons$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TVerConsSitNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TVerConsSitNFe$Enum
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.common.util.XMLUtil
 *  javax.help.UnsupportedOperationException
 *  org.apache.xmlbeans.XmlCursor
 *  org.apache.xmlbeans.XmlCursor$TokenType
 *  org.apache.xmlbeans.XmlException
 *  org.apache.xmlbeans.XmlObject
 *  org.apache.xmlbeans.XmlOptions
 *  org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException
 */
package br.gov.sp.fazenda.dsen.common.util;

import br.gov.sp.fazenda.dsen.common.enumeration.DSENSchemaTypeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.IndCredCTeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.IndCredNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoConsultaDpecEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEventoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.WSStatusRetorno;
import br.gov.sp.fazenda.dsen.common.exception.DSENCommonException;
import br.gov.sp.fazenda.dsen.common.to.CancelamentoEventoTO;
import br.gov.sp.fazenda.dsen.common.to.CancelamentoTO;
import br.gov.sp.fazenda.dsen.common.to.CartaCorrecaoTO;
import br.gov.sp.fazenda.dsen.common.to.ClienteTO;
import br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO;
import br.gov.sp.fazenda.dsen.common.to.DpecTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.EstabelecimentoTO;
import br.gov.sp.fazenda.dsen.common.to.EventoTO;
import br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO;
import br.gov.sp.fazenda.dsen.common.to.LoteTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.ProdutoTO;
import br.gov.sp.fazenda.dsen.common.to.TransportadoraTO;
import br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.schemas.dpec.v101.ConsDPECDocument;
import br.gov.sp.fazenda.dsen.schemas.dpec.v101.EnvDPECDocument;
import br.gov.sp.fazenda.dsen.schemas.dpec.v101.RetConsDPECDocument;
import br.gov.sp.fazenda.dsen.schemas.dpec.v101.RetDPECDocument;
import br.gov.sp.fazenda.dsen.schemas.dpec.v101.TAmb;
import br.gov.sp.fazenda.dsen.schemas.dpec.v101.TCodUfIBGE;
import br.gov.sp.fazenda.dsen.schemas.dpec.v101.TConsDPEC;
import br.gov.sp.fazenda.dsen.schemas.dpec.v101.TDPEC;
import br.gov.sp.fazenda.dsen.schemas.dpec.v101.TRetConsDPEC;
import br.gov.sp.fazenda.dsen.schemas.dpec.v101.TRetDPEC;
import br.gov.sp.fazenda.dsen.schemas.dpec.v101.TUf;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.CancelamentoDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.CartaCorrecaoDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.ConsCadDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.ConsReciNFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.ConsSitNFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.ConsStatServDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.EnvEventoDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.EnviNFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.InutNFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.NfeProcDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.ProcEventoNFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.ProcInutNFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.ReferenceType;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetConsCadDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetConsReciNFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetConsSitNFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetConsStatServDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetEnvEventoDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetEnviNFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetInutNFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.SignatureType;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.SignedInfoType;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TAmb;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCOrgaoIBGE;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCfop;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCfopTransp;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCodUfIBGE;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TConsCad;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TConsReciNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TConsSitNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TConsStatServ;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEnderecoConsCad;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEnvEvento;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEnviNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEvento;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TInutNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TMod;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNfeProc;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProcEvento;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProcInutNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProtNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetConsCad;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetConsReciNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetConsSitNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetConsStatServ;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetEnvEvento;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetEnviNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetEvento;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetInutNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUf;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUfCons;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TVerConsSitNFe;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.common.util.XMLUtil;
import java.io.File;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.help.UnsupportedOperationException;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public class DocumentoUtil {
    private static String a = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
    private static String b = "<sceCabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/SCERecepcaoRFB\"><versaoDados>";
    private static String c = "<sceCabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/SCEConsultaRFB\"><versaoDados>";
    private static String d = "</versaoDados></sceCabecMsg>";
    private static final Pattern a = Pattern.compile("(.*)\\sId\\s*=\\s*\"NFe\\d{44}\"\\s*(.*)<cNF.*</cNF\\s*>(.*)<cDV.*</cDV\\s*>(.*)", 8);
    private static final String e = "[a-zA-Z].*";
    private static final String f = " ";

    public DocumentoUtil() {
    }

    public static String getDigestValue(NotaFiscalTO nfeTO) {
        String digestValue = null;
        try {
            NFeDocument nfe = DocumentoUtil.getNFeDocument((String)nfeTO.getDocXmlString());
            if (nfe != null && nfe.getNFe().getSignature() != null) {
                digestValue = new String(nfe.getNFe().getSignature().getSignedInfo().getReference().getDigestValue());
            }
        }
        catch (Exception nfe) {
            // empty catch block
        }
        return digestValue;
    }

    public static String getDocumentString(Object document, boolean xmlDeclaration) throws UnsupportedEncodingException {
        XmlOptions xmlOptions = new XmlOptions();
        xmlOptions.setUseDefaultNamespace();
        xmlOptions.setSaveAggressiveNamespaces();
        return xmlDeclaration ? a + ((XmlObject)document).xmlText(xmlOptions) : ((XmlObject)document).xmlText(xmlOptions);
    }

    public static NFeDocument getNFeDocument(String xml) throws XmlException {
        if (xml == null) {
            return null;
        }
        return NFeDocument.Factory.parse((String)xml);
    }

    public static CartaCorrecaoDocument getCartaCorrecaoDocument(String xml) throws XmlException {
        if (xml == null) {
            return null;
        }
        return CartaCorrecaoDocument.Factory.parse((String)xml);
    }

    public static RetInutNFeDocument getRetInutNFeDocument(String xml) throws XmlException {
        if (xml == null) {
            return null;
        }
        return RetInutNFeDocument.Factory.parse((String)xml);
    }

    public static RetEnvEventoDocument getRetEnvEventoDocument(String xml) throws XmlException {
        if (xml == null) {
            return null;
        }
        return RetEnvEventoDocument.Factory.parse((String)xml);
    }

    public static NfeProcDocument getNfeProcDocument(String xml) throws XmlException {
        if (xml == null) {
            return null;
        }
        return NfeProcDocument.Factory.parse((String)xml);
    }

    public static RetConsReciNFeDocument getRetConsReciNFeDocument(String xml) throws XmlException {
        if (xml == null) {
            return null;
        }
        return RetConsReciNFeDocument.Factory.parse((String)xml);
    }

    public static RetConsStatServDocument getRetConsStatServDocument(String xml) throws XmlException {
        if (xml == null) {
            return null;
        }
        return RetConsStatServDocument.Factory.parse((String)xml);
    }

    public static InutNFeDocument getInutNFeDocument(String xml) throws XmlException {
        if (xml == null) {
            return null;
        }
        return InutNFeDocument.Factory.parse((String)xml);
    }

    public static RetEnviNFeDocument getRetEnviNFeDocument(String xml) throws XmlException {
        if (xml == null) {
            return null;
        }
        return RetEnviNFeDocument.Factory.parse((String)xml);
    }

    public static RetConsSitNFeDocument getRetConsSitNfeDocument(String xml) throws XmlException {
        if (xml == null) {
            return null;
        }
        return RetConsSitNFeDocument.Factory.parse((String)xml);
    }

    public static RetDPECDocument getRetDpecDocument(String xml) throws XmlException {
        if (xml == null) {
            return null;
        }
        return RetDPECDocument.Factory.parse((String)xml);
    }

    public static RetConsDPECDocument getRetConsDpecDocument(String xml) throws XmlException {
        if (xml == null) {
            return null;
        }
        return RetConsDPECDocument.Factory.parse((String)xml);
    }

    public static String criarCabecalhoMensagem(ServicoSefazEnum servico, String cUF, String versaoDados) {
        return MessageFormat.format(DSENConstants.NFE_CABEB_MSG, servico.getNomeServico(), cUF, versaoDados);
    }

    public static WSStatusRetorno validarXMLRetornoEnvio(String retornoEnvio, List<NotaFiscalTO> listaNotaFiscal) {
        if (retornoEnvio == null) {
            return WSStatusRetorno.XML_INVALIDO;
        }
        RetEnviNFeDocument document = null;
        try {
            document = DocumentoUtil.getRetEnviNFeDocument((String)retornoEnvio);
        }
        catch (XmlException e) {
            return WSStatusRetorno.XML_INVALIDO;
        }
        if (!document.validate()) {
            return WSStatusRetorno.XML_INVALIDO;
        }
        if (!document.getRetEnviNFe().getCStat().equals(DSENConstants.CODIGO_LOTE_RECEBIDO)) {
            for (NotaFiscalTO notaFiscalTO : listaNotaFiscal) {
                notaFiscalTO.setCodigoErro(document.getRetEnviNFe().getCStat());
                notaFiscalTO.setMensagemErro(document.getRetEnviNFe().getXMotivo());
                notaFiscalTO.addError(document.getRetEnviNFe().getXMotivo());
            }
            return WSStatusRetorno.NOK;
        }
        for (NotaFiscalTO notaFiscalTO : listaNotaFiscal) {
            notaFiscalTO.setNumeroRecibo(document.getRetEnviNFe().getInfRec().getNRec());
            notaFiscalTO.addMessage(DSENMessageConstants.MSG_NOTA_ENVIADA_OK + " " + MessageFormat.format(DSENMessageConstants.MSG_NUMERO_RECIBO_X, notaFiscalTO.getNumeroRecibo()));
        }
        return WSStatusRetorno.OK;
    }

    public static WSStatusRetorno validarXMLRetornoEnvio(String retornoEnvio, NotaFiscalTO nfeTO) {
        if (retornoEnvio == null) {
            return WSStatusRetorno.XML_INVALIDO;
        }
        RetEnviNFeDocument document = null;
        try {
            document = DocumentoUtil.getRetEnviNFeDocument((String)retornoEnvio);
        }
        catch (XmlException e) {
            return WSStatusRetorno.XML_INVALIDO;
        }
        if (!document.validate()) {
            return WSStatusRetorno.XML_INVALIDO;
        }
        if (document.getRetEnviNFe().getCStat().equals(DSENConstants.CODIGO_LOTE_RECEBIDO)) {
            nfeTO.setNumeroRecibo(document.getRetEnviNFe().getInfRec().getNRec());
            nfeTO.addMessage(DSENMessageConstants.MSG_NOTA_ENVIADA_OK + " " + MessageFormat.format(DSENMessageConstants.MSG_NUMERO_RECIBO_X, nfeTO.getNumeroRecibo()));
            return WSStatusRetorno.OK;
        }
        nfeTO.setCodigoErro(document.getRetEnviNFe().getCStat());
        nfeTO.setMensagemErro(document.getRetEnviNFe().getXMotivo());
        nfeTO.addError(document.getRetEnviNFe().getXMotivo());
        return WSStatusRetorno.NOK;
    }

    public static String criarDocumentoXmlParaEnvio(LoteTO lote, NotaFiscalTO nfeTO) throws DSENCommonException {
        StringBuilder bufferNotaFiscal = null;
        try {
            EnviNFeDocument enviNFeDocument = EnviNFeDocument.Factory.newInstance();
            TEnviNFe enviNFe = enviNFeDocument.addNewEnviNFe();
            enviNFe.setIdLote(lote.getIdLote().toString());
            enviNFe.setVersao(DSENProperties.getInstance().getVersaoSchemaEnviNFe());
            enviNFe.setIndSinc(TEnviNFe.IndSinc.X_0);
            bufferNotaFiscal = new StringBuilder(DocumentoUtil.getDocumentString((Object)enviNFeDocument, (boolean)true));
            bufferNotaFiscal.insert(bufferNotaFiscal.lastIndexOf("</"), DocumentoUtil.removerDeclaracaoXML((String)nfeTO.getDocXmlString()));
        }
        catch (UnsupportedEncodingException e) {
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
        return bufferNotaFiscal.toString();
    }

    public static WSStatusRetorno validarXMLRetornoConsultaProcessamentoPendente(String xmlRetornoConsultaProcessamentoPendente, LoteTO loteTO) throws UnsupportedEncodingException, DSENCommonException {
        boolean isProtocoloNFe;
        RetConsSitNFeDocument documento = null;
        try {
            documento = DocumentoUtil.getRetConsSitNfeDocument((String)xmlRetornoConsultaProcessamentoPendente);
        }
        catch (Exception e) {
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
        if (!documento.validate()) {
            return WSStatusRetorno.XML_INVALIDO;
        }
        String codigoRetorno = documento.getRetConsSitNFe().getCStat();
        List protocoloNFeList = XMLUtil.getTagConteudo((String)xmlRetornoConsultaProcessamentoPendente, (String)"protNFe", (boolean)true);
        boolean bl = isProtocoloNFe = protocoloNFeList != null && !protocoloNFeList.isEmpty();
        if (DSENConstants.CODIGO_LOTE_NAO_LOCALIZADO.equals(codigoRetorno) || DSENConstants.CODIGO_LOTE_PROCESSADO.equals(codigoRetorno) && !isProtocoloNFe) {
            return WSStatusRetorno.NOK;
        }
        loteTO.setCodigoRetorno(codigoRetorno);
        loteTO.addError((String)XMLUtil.getTagConteudo((String)xmlRetornoConsultaProcessamentoPendente, (String)"xMotivo", (boolean)false).get(0));
        return WSStatusRetorno.OK;
    }

    public static String[] getProtocolosNfesArray(RetConsReciNFeDocument ret) throws DSENCommonException {
        try {
            String s = DocumentoUtil.getDocumentString((Object)ret, (boolean)false);
            return XMLUtil.getTagConteudo((String)s, (String)"protNFe", (boolean)true).toArray(new String[0]);
        }
        catch (Exception e) {
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
    }

    public static String criarDocumentoXmlConsultaPorChaveAcesso(String chaveAcesso) throws DSENCommonException, UnsupportedEncodingException {
        ConsSitNFeDocument consSitNFeDocument = ConsSitNFeDocument.Factory.newInstance();
        TConsSitNFe consSitNFe = consSitNFeDocument.addNewConsSitNFe();
        consSitNFe.setVersao(TVerConsSitNFe.X_3_10);
        consSitNFe.setTpAmb(TAmb.Enum.forString((String)DSENProperties.getInstance().getAplicativoTipoAmbiente()));
        consSitNFe.setXServ(TConsSitNFe.XServ.CONSULTAR);
        consSitNFe.setChNFe(chaveAcesso);
        return DocumentoUtil.getDocumentString((Object)consSitNFeDocument, (boolean)true);
    }

    public static WSStatusRetorno validarXMLRetornoConsultaSituacao(String consultaSituacaoRetorno) throws DSENCommonException {
        RetConsSitNFeDocument document = null;
        try {
            document = DocumentoUtil.getRetConsSitNfeDocument((String)consultaSituacaoRetorno);
        }
        catch (XmlException e) {
            return WSStatusRetorno.XML_INVALIDO;
        }
        if (!document.validate()) {
            return WSStatusRetorno.XML_INVALIDO;
        }
        return WSStatusRetorno.OK;
    }

    public static void setProtocoloNFeRetornoConsultaSituacao(String protocoloNFe, NotaFiscalTO notaFiscalTO) {
        String situacao;
        String dataProtocolo = (String)XMLUtil.getTagConteudo((String)protocoloNFe, (String)"dhRecbto", (boolean)false).get(0);
        notaFiscalTO.setDataProtocolo(XMLUtil.getXmlDate((String)dataProtocolo));
        List numeroProtocolo = XMLUtil.getTagConteudo((String)protocoloNFe, (String)"nProt", (boolean)false);
        if (numeroProtocolo != null) {
            notaFiscalTO.setNumeroProtocolo((String)numeroProtocolo.get(0));
        }
        if (DSENConstants.CODIGO_AUTORIZACAO.equals(situacao = (String)XMLUtil.getTagConteudo((String)protocoloNFe, (String)"cStat", (boolean)false).get(0)) || DSENConstants.CODIGO_AUTORIZADO_FORA_PRAZO.equals(situacao)) {
            notaFiscalTO.setSituacao(SituacaoNFeEnum.AUTORIZADA);
            notaFiscalTO.setDataAutorizacao(notaFiscalTO.getDataProtocolo());
        } else if (DSENConstants.CODIGO_CANCELAMENTO.equals(situacao) || DSENConstants.CODIGO_CANCELAMENTO_FORA_PRAZO.equals(situacao) || DSENConstants.CODIGO_CANCELAMENTO_EVENTO_FORA_PRAZO.equals(situacao)) {
            notaFiscalTO.setSituacao(SituacaoNFeEnum.CANCELADA);
        } else if (DSENConstants.CODIGO_DENEGADO.equals(situacao) || DSENConstants.CODIGO_DENEGADO_EMITENTE.equals(situacao) || DSENConstants.CODIGO_DENEGADO_DESTINATARIO.equals(situacao)) {
            notaFiscalTO.setSituacao(SituacaoNFeEnum.DENEGADA);
        } else if (!DSENConstants.CODIGO_LOTE_EM_PROCESSAMENTO.equals(situacao)) {
            notaFiscalTO.setSituacao(SituacaoNFeEnum.REJEITADA);
        }
        notaFiscalTO.setCodigoErro(situacao);
        notaFiscalTO.setMensagemErro((String)XMLUtil.getTagConteudo((String)protocoloNFe, (String)"xMotivo", (boolean)false).get(0));
        notaFiscalTO.setProtocoloString(protocoloNFe);
    }

    public static String criarXmlConsultaReciboNFeDocument(String numeroRecibo) throws UnsupportedEncodingException {
        ConsReciNFeDocument consReciNFeDocument = ConsReciNFeDocument.Factory.newInstance();
        TConsReciNFe consReciNFe = consReciNFeDocument.addNewConsReciNFe();
        consReciNFe.setVersao(DSENProperties.getInstance().getVersaoSchemaConsRecibo());
        consReciNFe.setTpAmb(TAmb.Enum.forString((String)DSENProperties.getInstance().getAplicativoTipoAmbiente()));
        consReciNFe.setNRec(numeroRecibo);
        return DocumentoUtil.getDocumentString((Object)consReciNFeDocument, (boolean)true);
    }

    public static String criarDocumentoXmlInutilizacaoFaixasNFe(InutilizacaoTO inutilizacaoTO, String justificativa) throws UnsupportedEncodingException {
        InutNFeDocument inutilizacaoNFeDocumento = InutNFeDocument.Factory.newInstance();
        TInutNFe inutilizacaoNFe = inutilizacaoNFeDocumento.addNewInutNFe();
        inutilizacaoNFe.setVersao(DSENProperties.getInstance().getVersaoSchemaInutilizacao());
        TInutNFe.InfInut infInut = inutilizacaoNFe.addNewInfInut();
        infInut.setId(DocumentoUtil.criarIdDocumentoInutilizacao((InutilizacaoTO)inutilizacaoTO));
        infInut.setTpAmb(TAmb.Enum.forString((String)DSENProperties.getInstance().getAplicativoTipoAmbiente()));
        infInut.setXServ(TInutNFe.InfInut.XServ.INUTILIZAR);
        infInut.setCUF(TCodUfIBGE.Enum.forString((String)inutilizacaoTO.getCodigoUf()));
        infInut.setAno(inutilizacaoTO.getAno());
        infInut.setCNPJ(inutilizacaoTO.getEmitenteTO().getNrDocumento());
        infInut.setMod(TMod.Enum.forString((String)DSENConstants.MODELO_NFE));
        infInut.setSerie("" + Integer.valueOf(inutilizacaoTO.getSerie()));
        infInut.setNNFIni("" + Integer.valueOf(inutilizacaoTO.getNumeroInicial()));
        infInut.setNNFFin("" + Integer.valueOf(inutilizacaoTO.getNumeroFinal()));
        infInut.setXJust(justificativa);
        return DocumentoUtil.getDocumentString((Object)inutilizacaoNFeDocumento, (boolean)true);
    }

    public static String criarCabecMsgEnvioDpecDocument(String versaoDocumento) throws UnsupportedEncodingException {
        StringBuilder stringBuilder = new StringBuilder(b).append(versaoDocumento).append(d);
        return stringBuilder.toString();
    }

    public static String criarCabecMsgConsultaDpecDocument(String versaoDocumento) throws UnsupportedEncodingException {
        StringBuilder stringBuilder = new StringBuilder(c).append(versaoDocumento).append(d);
        return stringBuilder.toString();
    }

    public static String criarConsStatServDocument(String codigoUfConsulta) throws UnsupportedEncodingException {
        ConsStatServDocument consStatServDocument = ConsStatServDocument.Factory.newInstance();
        TConsStatServ consStatServ = consStatServDocument.addNewConsStatServ();
        consStatServ.setCUF(TCodUfIBGE.Enum.forString((String)codigoUfConsulta));
        consStatServ.setTpAmb(TAmb.Enum.forString((String)DSENProperties.getInstance().getAplicativoTipoAmbiente()));
        consStatServ.setVersao(DSENProperties.getInstance().getVersaoSchemaStatusServico());
        consStatServ.setXServ(TConsStatServ.XServ.STATUS);
        return DocumentoUtil.getDocumentString((Object)consStatServDocument, (boolean)true);
    }

    public static String criarConsReciNFeDocument(String numeroRecibo) throws UnsupportedEncodingException {
        ConsReciNFeDocument consReciNFeDocument = ConsReciNFeDocument.Factory.newInstance();
        TConsReciNFe consReciNFe = consReciNFeDocument.addNewConsReciNFe();
        consReciNFe.setVersao(DSENProperties.getInstance().getVersaoSchema());
        consReciNFe.setTpAmb(TAmb.Enum.forString((String)DSENProperties.getInstance().getAplicativoTipoAmbiente()));
        consReciNFe.setNRec(numeroRecibo);
        return DocumentoUtil.getDocumentString((Object)consReciNFeDocument, (boolean)true);
    }

    public static String criarConsCadDocument(ConsultaCadastroTO consultaCadastroTO) throws UnsupportedEncodingException {
        ConsCadDocument consCadDocument = ConsCadDocument.Factory.newInstance();
        TConsCad consCad = consCadDocument.addNewConsCad();
        consCad.setVersao(DSENProperties.getInstance().getVersaoSchemaConsultaCadastro());
        TConsCad.InfCons infCons = consCad.addNewInfCons();
        infCons.setUF(TUfCons.Enum.forString((String)consultaCadastroTO.getUf()));
        infCons.setXServ(TConsCad.InfCons.XServ.CONS_CAD);
        if (consultaCadastroTO.getUf().equals("SU")) {
            infCons.setIE(consultaCadastroTO.getIeSuframa());
        } else if (consultaCadastroTO.getDocumentoConsulta().equals((Object)ConsultaCadastroTO.DocumentoConsultaEnum.IE)) {
            infCons.setIE(consultaCadastroTO.getIE());
        } else if (consultaCadastroTO.getDocumentoConsulta().equals((Object)ConsultaCadastroTO.DocumentoConsultaEnum.CNPJ)) {
            infCons.setCNPJ(consultaCadastroTO.getCNPJ().trim().replace(".", "").replace("/", "").replace("-", ""));
        }
        return DocumentoUtil.getDocumentString((Object)consCadDocument, (boolean)true);
    }

    public static String getValorTotalNotaFiscal(NotaFiscalTO notaFiscalTO) throws XmlException {
        NFeDocument nfeDocument = DocumentoUtil.getNFeDocument((String)notaFiscalTO.getDocXmlString());
        TNFe.InfNFe.Total total = nfeDocument.getNFe().getInfNFe().getTotal();
        if (total != null && total.getICMSTot() != null) {
            return total.getICMSTot().getVNF();
        }
        return null;
    }

    public static void setValorTotalNotaFiscal(NotaFiscalTO notaFiscalTO, String vNF) throws XmlException, UnsupportedEncodingException {
        NFeDocument nfeDocument = DocumentoUtil.getNFeDocument((String)notaFiscalTO.getDocXmlString());
        TNFe.InfNFe.Total total = nfeDocument.getNFe().getInfNFe().getTotal();
        if (total != null && total.getICMSTot() != null) {
            total.getICMSTot().setVNF(vNF);
        }
        notaFiscalTO.setDocXmlString(DocumentoUtil.getDocumentString((Object)nfeDocument, (boolean)true));
    }

    public static void setSerieNotaFiscal(NotaFiscalTO notaFiscalTO) throws DSENCommonException {
        try {
            NFeDocument nfeDocument = DocumentoUtil.getNFeDocument((String)notaFiscalTO.getDocXmlString());
            nfeDocument.getNFe().getInfNFe().getIde().setSerie(String.valueOf(Integer.parseInt(notaFiscalTO.getSerie())));
            notaFiscalTO.setDocXmlString(DocumentoUtil.getDocumentString((Object)nfeDocument, (boolean)true));
        }
        catch (Exception e) {
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
    }

    public static void setNumeroNotaFiscal(NotaFiscalTO notaFiscalTO) throws DSENCommonException {
        try {
            NFeDocument nfeDocument = DocumentoUtil.getNFeDocument((String)notaFiscalTO.getDocXmlString());
            nfeDocument.getNFe().getInfNFe().getIde().setNNF(String.valueOf(Integer.parseInt(notaFiscalTO.getNumero())));
            notaFiscalTO.setDocXmlString(DocumentoUtil.getDocumentString((Object)nfeDocument, (boolean)true));
        }
        catch (Exception e) {
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
    }

    public static String criarIdDocumentoInutilizacao(InutilizacaoTO inutilizacaoTO) {
        return DSENConstants.ID_INUTILIZACAO + (Object)TCodUfIBGE.Enum.forString((String)inutilizacaoTO.getCodigoUf()) + inutilizacaoTO.getAno() + inutilizacaoTO.getEmitenteTO().getNrDocumento() + DSENConstants.MODELO_NFE + StringHelper.completaComZerosAEsquerda((String)inutilizacaoTO.getSerie(), (int)3) + StringHelper.completaComZerosAEsquerda((String)inutilizacaoTO.getNumeroInicial(), (int)9) + StringHelper.completaComZerosAEsquerda((String)inutilizacaoTO.getNumeroFinal(), (int)9);
    }

    public static void excluirAssinatura(NotaFiscalTO notaFiscalTO) throws XmlException, UnsupportedEncodingException {
        NFeDocument nFeDocumentComAssinatura = DocumentoUtil.getNFeDocument((String)notaFiscalTO.getDocXmlString());
        NFeDocument nFeDocumentSemAssinatura = NFeDocument.Factory.newInstance();
        nFeDocumentSemAssinatura.addNewNFe();
        nFeDocumentSemAssinatura.getNFe().addNewInfNFe();
        nFeDocumentSemAssinatura.getNFe().setInfNFe(nFeDocumentComAssinatura.getNFe().getInfNFe());
        notaFiscalTO.setDocXmlString(DocumentoUtil.getDocumentString((Object)nFeDocumentSemAssinatura, (boolean)true));
    }

    public static String[] getProtocoloNFeArray(String buscaRetornoXML) throws DSENCommonException {
        return XMLUtil.getTagConteudo((String)buscaRetornoXML, (String)"protNFe", (boolean)true).toArray(new String[0]);
    }

    public static String getProtocoloNFeConsultaSituacao(String retConsSitNFeString) throws DSENCommonException {
        try {
            RetConsSitNFeDocument retConsSitNFeDocument = DocumentoUtil.getRetConsSitNfeDocument((String)retConsSitNFeString);
            TProtNFe.InfProt infProtSituacao = retConsSitNFeDocument.getRetConsSitNFe().getProtNFe().getInfProt();
            NfeProcDocument nfeProcDocument = NfeProcDocument.Factory.newInstance();
            TProtNFe protNFe = nfeProcDocument.addNewNfeProc().addNewProtNFe();
            TProtNFe.InfProt infProtNFe = protNFe.addNewInfProt();
            protNFe.setVersao(DSENProperties.getInstance().getVersaoSchema());
            if (!StringHelper.isBlankOrNull((Object)infProtSituacao.getId())) {
                infProtNFe.setId(infProtSituacao.getId());
            }
            infProtNFe.setTpAmb(TAmb.Enum.forString((String)infProtSituacao.getTpAmb().toString()));
            infProtNFe.setVerAplic(infProtSituacao.getVerAplic());
            infProtNFe.setChNFe(infProtSituacao.getChNFe());
            infProtNFe.setDhRecbto(infProtSituacao.getDhRecbto());
            if (!StringHelper.isBlankOrNull((Object)infProtSituacao.getNProt())) {
                infProtNFe.setNProt(infProtSituacao.getNProt());
            }
            if (!StringHelper.isBlankOrNull((Object)infProtSituacao.getDigVal())) {
                infProtNFe.setDigVal(infProtSituacao.getDigVal());
            }
            infProtNFe.setCStat(infProtSituacao.getCStat());
            infProtNFe.setXMotivo(infProtSituacao.getXMotivo());
            return (String)XMLUtil.getTagConteudo((String)DocumentoUtil.getDocumentString((Object)nfeProcDocument, (boolean)true), (String)"protNFe", (boolean)true).get(0);
        }
        catch (Exception e) {
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
    }

    public static void setNotaFiscalProtocolo(String protocoloNFe, NotaFiscalTO notaFiscalTO) {
        String situacao;
        String dataProtocolo = (String)XMLUtil.getTagConteudo((String)protocoloNFe, (String)"dhRecbto", (boolean)false).get(0);
        notaFiscalTO.setDataProtocolo(XMLUtil.getXmlDate((String)dataProtocolo));
        List numeroProtocolo = XMLUtil.getTagConteudo((String)protocoloNFe, (String)"nProt", (boolean)false);
        if (numeroProtocolo != null) {
            notaFiscalTO.setNumeroProtocolo((String)numeroProtocolo.get(0));
        }
        if (DSENConstants.CODIGO_AUTORIZACAO.equals(situacao = (String)XMLUtil.getTagConteudo((String)protocoloNFe, (String)"cStat", (boolean)false).get(0)) || DSENConstants.CODIGO_AUTORIZADO_FORA_PRAZO.equals(situacao)) {
            notaFiscalTO.setSituacao(SituacaoNFeEnum.AUTORIZADA);
        } else if (DSENConstants.CODIGO_CANCELAMENTO.equals(situacao) || DSENConstants.CODIGO_CANCELAMENTO_FORA_PRAZO.equals(situacao) || DSENConstants.CODIGO_CANCELAMENTO_EVENTO_FORA_PRAZO.equals(situacao)) {
            notaFiscalTO.setSituacao(SituacaoNFeEnum.CANCELADA);
        } else if (DSENConstants.CODIGO_DENEGADO.equals(situacao) || DSENConstants.CODIGO_DENEGADO_EMITENTE.equals(situacao) || DSENConstants.CODIGO_DENEGADO_DESTINATARIO.equals(situacao)) {
            notaFiscalTO.setSituacao(SituacaoNFeEnum.DENEGADA);
        } else if (!DSENConstants.CODIGO_LOTE_EM_PROCESSAMENTO.equals(situacao)) {
            notaFiscalTO.setSituacao(SituacaoNFeEnum.REJEITADA);
            notaFiscalTO.setCodigoErro(situacao);
            notaFiscalTO.setMensagemErro((String)XMLUtil.getTagConteudo((String)protocoloNFe, (String)"xMotivo", (boolean)false).get(0));
        }
        notaFiscalTO.setProtocoloString(protocoloNFe);
    }

    public static WSStatusRetorno validarXmlRetornoInutilizacao(String retornoInutilizacaoXML, InutilizacaoTO inutilizacaoTO) {
        RetInutNFeDocument document = null;
        try {
            document = DocumentoUtil.getRetornoInutilizacaoNFeDocumento((String)retornoInutilizacaoXML);
        }
        catch (XmlException e) {
            inutilizacaoTO.setCErro(DSENConstants.CODIGO_NAO_CATALOGADO);
            inutilizacaoTO.setMensagemErro(DSGEMessageConstants.MSG_WS_XML_INVALIDO);
            return WSStatusRetorno.XML_INVALIDO;
        }
        if (!document.validate()) {
            inutilizacaoTO.setCErro(DSENConstants.CODIGO_NAO_CATALOGADO);
            inutilizacaoTO.setMensagemErro(DSGEMessageConstants.MSG_WS_XML_INVALIDO);
            return WSStatusRetorno.XML_INVALIDO;
        }
        TRetInutNFe.InfInut infInut = document.getRetInutNFe().getInfInut();
        if (!DSENConstants.CODIGO_INUTILIZACAO.equals(infInut.getCStat())) {
            inutilizacaoTO.setCErro(infInut.getCStat());
            inutilizacaoTO.setMensagemErro(infInut.getXMotivo());
            return WSStatusRetorno.NOK;
        }
        try {
            InutNFeDocument inutilizacaoNFeDocumento = InutNFeDocument.Factory.parse((String)inutilizacaoTO.getDocXmlString());
            ProcInutNFeDocument procInutNFeDocument = ProcInutNFeDocument.Factory.newInstance();
            TProcInutNFe tProcInut = procInutNFeDocument.addNewProcInutNFe();
            tProcInut.setVersao(DSENProperties.getInstance().getVersaoSchemaInutilizacao());
            tProcInut.setInutNFe(inutilizacaoNFeDocumento.getInutNFe());
            tProcInut.setRetInutNFe(document.getRetInutNFe());
            inutilizacaoTO.setProtocoloXmlString(DocumentoUtil.getDocumentString((Object)procInutNFeDocument, (boolean)true));
        }
        catch (XmlException e) {
            inutilizacaoTO.setCErro(DSENConstants.CODIGO_NAO_CATALOGADO);
            inutilizacaoTO.setMensagemErro(DSGEMessageConstants.MSG_WS_XML_INVALIDO);
            return WSStatusRetorno.XML_INVALIDO;
        }
        catch (UnsupportedEncodingException e) {
            inutilizacaoTO.setCErro(DSENConstants.CODIGO_NAO_CATALOGADO);
            inutilizacaoTO.setMensagemErro(DSGEMessageConstants.MSG_WS_XML_INVALIDO);
        }
        if (infInut.getDhRecbto() != null) {
            inutilizacaoTO.setDataInutilizacao(DateHelper.getDateTime((String)infInut.getDhRecbto(), (SimpleDateFormat)DateHelper.DATE_TIME_FORMAT));
        }
        return WSStatusRetorno.OK;
    }

    public static WSStatusRetorno validarXmlRetornoEvento(String retornoEventoXML, EventoTO eventoTO) throws DSENCommonException {
        RetEnvEventoDocument document = null;
        if (retornoEventoXML == null) {
            eventoTO.setCErro(DSENConstants.CODIGO_NAO_CATALOGADO);
            eventoTO.setMensagemErro(DSGEMessageConstants.MSG_WS_XML_INVALIDO);
            return WSStatusRetorno.XML_INVALIDO;
        }
        try {
            document = DocumentoUtil.getRetEnvEventoDocument((String)retornoEventoXML);
        }
        catch (XmlException e) {
            eventoTO.setCErro(DSENConstants.CODIGO_NAO_CATALOGADO);
            eventoTO.setMensagemErro(DSGEMessageConstants.MSG_WS_XML_INVALIDO);
            return WSStatusRetorno.XML_INVALIDO;
        }
        if (!document.validate()) {
            eventoTO.setCErro(DSENConstants.CODIGO_NAO_CATALOGADO);
            eventoTO.setMensagemErro(DSGEMessageConstants.MSG_WS_XML_INVALIDO);
            return WSStatusRetorno.XML_INVALIDO;
        }
        if (!DSENConstants.CODIGO_LOTE_EVENTO_PROCESSADO.equals(document.getRetEnvEvento().getCStat())) {
            eventoTO.setCErro(document.getRetEnvEvento().getCStat());
            eventoTO.setMensagemErro(document.getRetEnvEvento().getXMotivo());
            return WSStatusRetorno.NOK;
        }
        TRetEvento[] retEventoArray = document.getRetEnvEvento().getRetEventoArray();
        if (retEventoArray == null || retEventoArray.length == 0) {
            eventoTO.setCErro(DSENConstants.CODIGO_NAO_CATALOGADO);
            eventoTO.setMensagemErro(DSENMessageConstants.MSG_RETORNO_EVENTO_VAZIO);
            return WSStatusRetorno.XML_INVALIDO;
        }
        TRetEvento retEvento = retEventoArray[0];
        if (!(DSENConstants.CODIGO_EVENTO_REGISTRADO_E_VINCULADO_NFE.equals(retEvento.getInfEvento().getCStat()) || DSENConstants.CODIGO_EVENTO_REGISTRADO_NAO_VINCULADO_NFE.equals(retEvento.getInfEvento().getCStat()) || DSENConstants.CODIGO_CANCELAMENTO_EVENTO_FORA_PRAZO.equals(retEvento.getInfEvento().getCStat()))) {
            eventoTO.setCErro(retEvento.getInfEvento().getCStat());
            eventoTO.setMensagemErro(retEvento.getInfEvento().getXMotivo());
            return WSStatusRetorno.NOK;
        }
        try {
            EnvEventoDocument envEventoDocument = EnvEventoDocument.Factory.parse((String)eventoTO.getDocXmlString());
            ProcEventoNFeDocument procEventoNFeDocument = ProcEventoNFeDocument.Factory.newInstance();
            TProcEvento tProcEvento = procEventoNFeDocument.addNewProcEventoNFe();
            tProcEvento.setVersao(DSENProperties.getInstance().getVersaoSchemaEventos());
            tProcEvento.setEvento(envEventoDocument.getEnvEvento().getEventoArray()[0]);
            tProcEvento.setRetEvento(retEvento);
            eventoTO.setXmlProcString(DocumentoUtil.getDocumentString((Object)procEventoNFeDocument, (boolean)true));
        }
        catch (XmlException e) {
            eventoTO.setCErro(DSENConstants.CODIGO_NAO_CATALOGADO);
            eventoTO.setMensagemErro(DSGEMessageConstants.MSG_WS_XML_INVALIDO);
            return WSStatusRetorno.XML_INVALIDO;
        }
        catch (UnsupportedEncodingException e) {
            eventoTO.setCErro(DSENConstants.CODIGO_NAO_CATALOGADO);
            eventoTO.setMensagemErro(DSGEMessageConstants.MSG_WS_XML_INVALIDO);
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
        eventoTO.setNumProtocolo(retEvento.getInfEvento().getNProt());
        if (retEvento.getInfEvento().getDhRegEvento() != null) {
            eventoTO.setDataRegEvento(DateHelper.getDateTime((String)retEvento.getInfEvento().getDhRegEvento(), (SimpleDateFormat)DateHelper.DATE_TIME_XML_FORMAT));
        }
        return WSStatusRetorno.OK;
    }

    public static ProcInutNFeDocument getProcInutNFeDocument(String xml) throws DSENCommonException {
        try {
            ProcInutNFeDocument doc = ProcInutNFeDocument.Factory.parse((String)xml);
            return doc;
        }
        catch (Exception e) {
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
    }

    public static ProcEventoNFeDocument getProcEventoNFeDocument(String xml) throws DSENCommonException {
        try {
            ProcEventoNFeDocument doc = ProcEventoNFeDocument.Factory.parse((String)xml);
            return doc;
        }
        catch (Exception e) {
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
    }

    public static RetInutNFeDocument getRetornoInutilizacaoNFeDocumento(String xml) throws XmlException {
        if (xml == null) {
            return null;
        }
        return RetInutNFeDocument.Factory.parse((String)xml);
    }

    public static WSStatusRetorno validarRetConsStatServDocument(String consultaStatusRetornoXML) {
        RetConsStatServDocument document = null;
        try {
            document = DocumentoUtil.getRetConsStatServDocument((String)consultaStatusRetornoXML);
        }
        catch (XmlException e) {
            return WSStatusRetorno.XML_INVALIDO;
        }
        if (!document.validate()) {
            return WSStatusRetorno.XML_INVALIDO;
        }
        if (document.getRetConsStatServ().getCStat().equals(DSENConstants.CODIGO_SERVICO_OPERACAO)) {
            return WSStatusRetorno.STATUS_SERVICO_EM_OPERACAO;
        }
        if (document.getRetConsStatServ().getCStat().equals(DSENConstants.CODIGO_SERVICO_EM_PROCESSO_DE_DESATIVACAO)) {
            return WSStatusRetorno.STATUS_SERVICO_EM_DESATIVACAO;
        }
        if (document.getRetConsStatServ().getCStat().equals(DSENConstants.CODIGO_SERVICO_PARALISADO_PARA_AQUELA_UF)) {
            return WSStatusRetorno.STATUS_SERVICO_PARALISADO;
        }
        return WSStatusRetorno.NOK;
    }

    public static WSStatusRetorno validarRetConsReciNFeDocument(String buscaRetornoXML, LoteTO loteTO) {
        boolean hasProtNFe;
        RetConsReciNFeDocument document = null;
        try {
            document = DocumentoUtil.getRetConsReciNFeDocument((String)buscaRetornoXML);
        }
        catch (XmlException e) {
            return WSStatusRetorno.XML_INVALIDO;
        }
        if (!document.validate()) {
            return WSStatusRetorno.XML_INVALIDO;
        }
        String cStat = document.getRetConsReciNFe().getCStat();
        List protNFeList = XMLUtil.getTagConteudo((String)buscaRetornoXML, (String)"protNFe", (boolean)true);
        boolean bl = hasProtNFe = protNFeList != null && !protNFeList.isEmpty();
        if (DSENConstants.CODIGO_LOTE_NAO_LOCALIZADO.equals(cStat) || DSENConstants.CODIGO_LOTE_PROCESSADO.equals(cStat) && !hasProtNFe) {
            return WSStatusRetorno.NOK;
        }
        loteTO.setCodigoRetorno(cStat);
        loteTO.addError((String)XMLUtil.getTagConteudo((String)buscaRetornoXML, (String)"xMotivo", (boolean)false).get(0));
        return WSStatusRetorno.OK;
    }

    public static WSStatusRetorno validarRetEnviNFeDocument(String retornoEnvioNFeXML, List<NotaFiscalTO> listaNotaFiscalTO) {
        if (retornoEnvioNFeXML == null) {
            return WSStatusRetorno.XML_INVALIDO;
        }
        RetEnviNFeDocument document = null;
        try {
            document = DocumentoUtil.getRetEnviNFeDocument((String)retornoEnvioNFeXML);
        }
        catch (XmlException e) {
            return WSStatusRetorno.XML_INVALIDO;
        }
        if (!document.validate()) {
            return WSStatusRetorno.XML_INVALIDO;
        }
        if (!document.getRetEnviNFe().getCStat().equals(DSENConstants.CODIGO_LOTE_RECEBIDO)) {
            for (NotaFiscalTO notaFiscalTO : listaNotaFiscalTO) {
                notaFiscalTO.setCodigoErro(document.getRetEnviNFe().getCStat());
                notaFiscalTO.setMensagemErro(document.getRetEnviNFe().getXMotivo());
                notaFiscalTO.addError(document.getRetEnviNFe().getXMotivo());
            }
            return WSStatusRetorno.NOK;
        }
        for (NotaFiscalTO notaFiscalTO : listaNotaFiscalTO) {
            notaFiscalTO.setNumeroRecibo(document.getRetEnviNFe().getInfRec().getNRec());
            notaFiscalTO.addMessage(DSENMessageConstants.MSG_NOTA_ENVIADA_OK);
        }
        return WSStatusRetorno.OK;
    }

    public static String criarConsSitNFeDocument(String chaveAcesso) throws UnsupportedEncodingException {
        ConsSitNFeDocument consSitNfeDocument = ConsSitNFeDocument.Factory.newInstance();
        TConsSitNFe consSitNfe = consSitNfeDocument.addNewConsSitNFe();
        consSitNfe.setVersao(TVerConsSitNFe.X_3_10);
        consSitNfe.setTpAmb(TAmb.Enum.forString((String)DSENProperties.getInstance().getAplicativoTipoAmbiente()));
        consSitNfe.setXServ(TConsSitNFe.XServ.CONSULTAR);
        consSitNfe.setChNFe(chaveAcesso);
        return DocumentoUtil.getDocumentString((Object)consSitNfeDocument, (boolean)true);
    }

    public static WSStatusRetorno validarRetDpecDocument(String retDpecXML, DpecTO dpecTO) {
        RetDPECDocument retDpecDocument = null;
        try {
            retDpecDocument = DocumentoUtil.getRetDpecDocument((String)retDpecXML);
        }
        catch (XmlException e) {
            dpecTO.setCodigoStatus(DSENConstants.CODIGO_NAO_CATALOGADO);
            dpecTO.setMotivo(MessageFormat.format(DSGEMessageConstants.MSG_WS_XML_INVALIDO, DSGEMessageConstants.MSG_WS_DPEC));
            return WSStatusRetorno.XML_INVALIDO;
        }
        if (!retDpecDocument.validate()) {
            dpecTO.setCodigoStatus(DSENConstants.CODIGO_NAO_CATALOGADO);
            dpecTO.setMotivo(MessageFormat.format(DSGEMessageConstants.MSG_WS_XML_INVALIDO, DSGEMessageConstants.MSG_WS_DPEC));
            return WSStatusRetorno.XML_INVALIDO;
        }
        TRetDPEC.InfDPECReg infDPECReg = retDpecDocument.getRetDPEC().getInfDPECReg();
        dpecTO.setCodigoStatus(infDPECReg.getCStat());
        dpecTO.setMotivo(infDPECReg.getXMotivo());
        if (!retDpecDocument.getRetDPEC().getInfDPECReg().getCStat().equals(DSENConstants.DPEC_RECEBIDO)) {
            dpecTO.setMotivo(dpecTO.getMotivo() + (infDPECReg.getChNFe() != null ? new StringBuilder().append(" - Chave Acesso: ").append(infDPECReg.getChNFe()).toString() : ""));
            return WSStatusRetorno.NOK;
        }
        dpecTO.setConteudoArquivo(retDpecXML);
        dpecTO.setDataRegistro(infDPECReg.getDhRegDPEC().getTime());
        dpecTO.setDpecStatus(DpecTO.DpecStatus.AUTORIZADO);
        dpecTO.setNumeroRegistro(infDPECReg.getNRegDPEC().newCursor().getTextValue());
        return WSStatusRetorno.OK;
    }

    public static String criarConsDPECDocument(TipoConsultaDpecEnum tipoConsultaDpecEnum, String chaveConsulta) throws UnsupportedEncodingException, XmlException {
        ConsDPECDocument consDPECDocument = ConsDPECDocument.Factory.newInstance();
        TConsDPEC consDPEC = consDPECDocument.addNewConsDPEC();
        consDPEC.setVersao(DSENProperties.getInstance().getVersaoSchemaDpec());
        consDPEC.setTpAmb(TAmb.Enum.forString((String)DSENProperties.getInstance().getAplicativoTipoAmbiente()));
        consDPEC.setVerAplic(DSENProperties.getInstance().getAplicativoVersao());
        if (TipoConsultaDpecEnum.CHAVE_ACESSO.equals((Object)tipoConsultaDpecEnum)) {
            consDPEC.setChNFe(chaveConsulta);
        } else {
            consDPEC.addNewNRegDPEC().newCursor().setTextValue(chaveConsulta);
        }
        return DocumentoUtil.getDocumentString((Object)consDPECDocument, (boolean)false);
    }

    public static WSStatusRetorno validarRetConsDpecDocument(String retConsDpecXML, DpecTO dpecTO) {
        RetConsDPECDocument retConsDpecDocument = null;
        try {
            retConsDpecDocument = DocumentoUtil.getRetConsDpecDocument((String)retConsDpecXML);
        }
        catch (XmlException e) {
            dpecTO.setCodigoStatus(DSENConstants.CODIGO_NAO_CATALOGADO);
            dpecTO.setMotivo(MessageFormat.format(DSGEMessageConstants.MSG_WS_XML_INVALIDO, DSGEMessageConstants.MSG_WS_DPEC));
            return WSStatusRetorno.XML_INVALIDO;
        }
        if (!retConsDpecDocument.validate()) {
            dpecTO.setCodigoStatus(DSENConstants.CODIGO_NAO_CATALOGADO);
            dpecTO.setMotivo(MessageFormat.format(DSGEMessageConstants.MSG_WS_XML_INVALIDO, DSGEMessageConstants.MSG_WS_DPEC));
            return WSStatusRetorno.XML_INVALIDO;
        }
        if (!retConsDpecDocument.getRetConsDPEC().getCStat().equals(DSENConstants.DPEC_LOCALIZADO)) {
            return WSStatusRetorno.NOK;
        }
        dpecTO.setDpecStatus(DpecTO.DpecStatus.AUTORIZADO);
        return WSStatusRetorno.OK;
    }

    public static String criarNFeProcDocument(NotaFiscalTO notaFiscalTO) throws UnsupportedEncodingException {
        NfeProcDocument nfeProcDocument = NfeProcDocument.Factory.newInstance();
        TNfeProc nfeProc = nfeProcDocument.addNewNfeProc();
        nfeProc.setVersao(DSENProperties.getInstance().getVersaoSchema());
        nfeProc.addNewNFe();
        StringBuilder bufferNotaFiscal = new StringBuilder(DocumentoUtil.getDocumentString((Object)nfeProcDocument, (boolean)true));
        String nfe = "<NFe/>";
        int posNFe = bufferNotaFiscal.indexOf(nfe);
        bufferNotaFiscal.delete(posNFe, posNFe + nfe.length());
        if (!StringHelper.isBlankOrNull((Object)notaFiscalTO.getDocXmlString())) {
            bufferNotaFiscal.insert(bufferNotaFiscal.lastIndexOf("</"), DocumentoUtil.removerDeclaracaoXML((String)notaFiscalTO.getDocXmlString()));
        }
        if (!StringHelper.isBlankOrNull((Object)notaFiscalTO.getProtocoloString())) {
            bufferNotaFiscal.insert(bufferNotaFiscal.lastIndexOf("</"), DocumentoUtil.removerDeclaracaoXML((String)notaFiscalTO.getProtocoloString()));
        }
        return bufferNotaFiscal.toString();
    }

    public static String removerDeclaracaoXML(String xml) {
        int posicaoInicialXML = xml.indexOf("<?xml");
        posicaoInicialXML = posicaoInicialXML != -1 ? xml.indexOf(">") + 1 : 0;
        return xml.substring(posicaoInicialXML);
    }

    public static void removerNamespaceDeclaration(XmlObject x, String prefix) {
        XmlCursor c = x.newCursor();
        c.toNextToken();
        while (c.hasNextToken()) {
            if (c.isNamespace() && c.getName() != null && prefix.equals(c.getName().getLocalPart())) {
                System.out.println("xmlns:" + prefix + " removido");
                c.removeXml();
            }
            c.toNextToken();
        }
        c.dispose();
    }

    public static String criarNFeProcXML(NotaFiscalTO notaFiscalTO) {
        StringBuffer nfeProc = new StringBuffer();
        nfeProc.append(a);
        nfeProc.append("<nfeProc versao=");
        nfeProc.append("\"").append(notaFiscalTO.getVersao()).append("\"");
        nfeProc.append(" xmlns=\"http://www.portalfiscal.inf.br/nfe\">");
        nfeProc.append(DocumentoUtil.removerDeclaracaoXML((String)notaFiscalTO.getDocXmlString()));
        nfeProc.append(DocumentoUtil.removerDeclaracaoXML((String)notaFiscalTO.getProtocoloString()));
        nfeProc.append("</nfeProc>");
        return nfeProc.toString();
    }

    public static String criarProcCancNFeXML(NotaFiscalTO notaFiscalTO) {
        StringBuffer procCancNFe = new StringBuffer();
        procCancNFe.append(a);
        procCancNFe.append("<procCancNFe versao=");
        procCancNFe.append("\"").append(notaFiscalTO.getVersao()).append("\"");
        procCancNFe.append(" xmlns=\"http://www.portalfiscal.inf.br/nfe\">");
        procCancNFe.append(DocumentoUtil.removerDeclaracaoXML((String)notaFiscalTO.getDocXmlString()));
        procCancNFe.append(DocumentoUtil.removerDeclaracaoXML((String)notaFiscalTO.getProtocoloString()));
        procCancNFe.append("</procCancNFe>");
        return procCancNFe.toString();
    }

    public static String montaNomeCadastroArquivoXML(String path, String nomeArquivo, String sufixName, ExtensaoArquivoEnum extensaoArquivo) {
        StringBuffer nome = new StringBuffer();
        nome.append(path).append(File.separator);
        nome.append(DocumentoUtil.montaNomeCadastroArquivoXML((String)nomeArquivo, (String)sufixName, (ExtensaoArquivoEnum)extensaoArquivo));
        return nome.toString();
    }

    public static String montaNomeArquivoXML(String path, String nomeCompletoArquivo) {
        StringBuffer nome = new StringBuffer();
        nome.append(path).append(File.separator);
        nome.append(nomeCompletoArquivo);
        return nome.toString();
    }

    public static String montaNomeCadastroArquivoXML(String nomeArquivo, String sufixName, ExtensaoArquivoEnum extensaoArquivo) {
        StringBuffer nome = new StringBuffer();
        String dataHora = DateHelper.formataDataHora((Date)new Date(), (SimpleDateFormat)DateHelper.DATE_TIME_FORMAT_EXPORT);
        nome.append(nomeArquivo);
        nome.append("-").append(dataHora);
        nome.append("-").append(sufixName);
        nome.append(extensaoArquivo.getExtensao());
        return nome.toString();
    }

    public static String montaNomeArquivoXML(String path, NotaFiscalTO notaFiscalTO, ExtensaoArquivoEnum extensaoArquivo, DSENSchemaTypeEnum schemaType) {
        StringBuffer nome = new StringBuffer();
        nome.append(path).append(File.separator);
        nome.append(DocumentoUtil.montaNomeArquivoXML((NotaFiscalTO)notaFiscalTO, (ExtensaoArquivoEnum)extensaoArquivo, (DSENSchemaTypeEnum)schemaType));
        return nome.toString();
    }

    public static String montaNomeArquivoXML(NotaFiscalTO notaFiscalTO, ExtensaoArquivoEnum extensaoArquivo, DSENSchemaTypeEnum schemaType) {
        StringBuffer nome = new StringBuffer();
        nome.append(ChaveAcessoUtil.gerarChaveAcesso((NotaFiscalTO)notaFiscalTO));
        nome.append("-").append(schemaType.getSufixoNomeExportacao());
        nome.append(extensaoArquivo.getExtensao());
        return nome.toString();
    }

    public static String montaNomeArquivoXML(String path, CancelamentoTO cancelamentoTO, ExtensaoArquivoEnum extensaoArquivo, DSENSchemaTypeEnum schemaType) {
        StringBuffer nome = new StringBuffer();
        nome.append(path).append(File.separator);
        nome.append(DocumentoUtil.montaNomeArquivoXML((CancelamentoTO)cancelamentoTO, (ExtensaoArquivoEnum)extensaoArquivo, (DSENSchemaTypeEnum)schemaType));
        return nome.toString();
    }

    public static String montaNomeArquivoXML(CancelamentoTO cancelamentoTO, ExtensaoArquivoEnum extensaoArquivo, DSENSchemaTypeEnum schemaType) {
        StringBuffer nome = new StringBuffer();
        nome.append(cancelamentoTO.getNumeroProtocolo());
        nome.append("_v").append(DSENProperties.getInstance().getVersaoSchemaCancelamento());
        nome.append("-").append(schemaType.getSufixoNomeExportacao());
        nome.append(extensaoArquivo.getExtensao());
        return nome.toString();
    }

    public static String montaNomeArquivoXML(String path, EventoTO eventoTO, ExtensaoArquivoEnum extensaoArquivo, DSENSchemaTypeEnum schemaType) {
        StringBuffer nome = new StringBuffer();
        nome.append(path).append(File.separator);
        nome.append(DocumentoUtil.montaNomeArquivoXML((EventoTO)eventoTO, (ExtensaoArquivoEnum)extensaoArquivo, (DSENSchemaTypeEnum)schemaType));
        return nome.toString();
    }

    public static String montaNomeArquivoXML(EventoTO eventoTO, ExtensaoArquivoEnum extensaoArquivo, DSENSchemaTypeEnum schemaType) {
        StringBuffer nome = new StringBuffer();
        nome.append(eventoTO.getTpEvento().getCodigo() + "-" + ChaveAcessoUtil.gerarChaveAcesso((NotaFiscalTO)eventoTO.getNotaFiscalTO()) + "-" + eventoTO.getnSeqEvento());
        nome.append("-").append(schemaType.getSufixoNomeExportacao());
        nome.append(extensaoArquivo.getExtensao());
        return nome.toString();
    }

    public static String montaNomeArquivoXML(String path, InutilizacaoTO inutilizacaoTO, ExtensaoArquivoEnum extensaoArquivo, DSENSchemaTypeEnum schemaType) {
        StringBuffer nome = new StringBuffer();
        nome.append(path).append(File.separator);
        nome.append(DocumentoUtil.montaNomeArquivoXML((InutilizacaoTO)inutilizacaoTO, (ExtensaoArquivoEnum)extensaoArquivo, (DSENSchemaTypeEnum)schemaType));
        return nome.toString();
    }

    public static String montaNomeArquivoXML(InutilizacaoTO inutilizacaoTO, ExtensaoArquivoEnum extensaoArquivo, DSENSchemaTypeEnum schemaType) {
        StringBuffer nome = new StringBuffer();
        String xmlString = inutilizacaoTO.getProtocoloXmlString();
        String nProt = XMLUtil.getFirstTagConteudo((String)xmlString, (String)"nProt", (boolean)false, (boolean)false);
        nProt = nProt == null ? "" : nProt;
        nome.append(nProt);
        nome.append("_v").append(DSENProperties.getInstance().getVersaoSchemaInutilizacao());
        nome.append("-").append(schemaType.getSufixoNomeExportacao());
        nome.append(extensaoArquivo.getExtensao());
        return nome.toString();
    }

    public static String getNomePadraoArquivoXML(CancelamentoTO cancTO) {
        String protocolo = cancTO.getProtocoloString();
        String nomeCanc = null;
        if (!StringHelper.isBlankOrNull((Object)protocolo)) {
            String tagProcCanc = XMLUtil.getFirstTagConteudo((String)protocolo, (String)"procCancNFe", (boolean)false, (boolean)false);
            nomeCanc = !StringHelper.isBlankOrNull((Object)tagProcCanc) ? DocumentoUtil.montaNomeArquivoXML((CancelamentoTO)cancTO, (ExtensaoArquivoEnum)ExtensaoArquivoEnum.XML, (DSENSchemaTypeEnum)DSENSchemaTypeEnum.procCancNFe) : DocumentoUtil.montaNomeArquivoXML((CancelamentoTO)cancTO, (ExtensaoArquivoEnum)ExtensaoArquivoEnum.XML, (DSENSchemaTypeEnum)DSENSchemaTypeEnum.retCancNFe);
        }
        return nomeCanc;
    }

    public static String getNomePadraoArquivoXML(NotaFiscalTO notaTO) {
        switch (1.a[notaTO.getSituacao().ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                return DocumentoUtil.montaNomeArquivoXML((NotaFiscalTO)notaTO, (ExtensaoArquivoEnum)ExtensaoArquivoEnum.XML, (DSENSchemaTypeEnum)DSENSchemaTypeEnum.nfe);
            }
            case 5: 
            case 6: {
                return DocumentoUtil.montaNomeArquivoXML((NotaFiscalTO)notaTO, (ExtensaoArquivoEnum)ExtensaoArquivoEnum.XML, (DSENSchemaTypeEnum)DSENSchemaTypeEnum.procNFe);
            }
            case 7: {
                if (!StringHelper.isBlankOrNull((Object)notaTO.getDocXmlString())) {
                    if (!StringHelper.isBlankOrNull((Object)notaTO.getProtocoloString())) {
                        return DocumentoUtil.montaNomeArquivoXML((NotaFiscalTO)notaTO, (ExtensaoArquivoEnum)ExtensaoArquivoEnum.XML, (DSENSchemaTypeEnum)DSENSchemaTypeEnum.procNFe);
                    }
                    return DocumentoUtil.montaNomeArquivoXML((NotaFiscalTO)notaTO, (ExtensaoArquivoEnum)ExtensaoArquivoEnum.XML, (DSENSchemaTypeEnum)DSENSchemaTypeEnum.nfe);
                }
                return null;
            }
        }
        return null;
    }

    public static String getNomePadraoArquivoXML(InutilizacaoTO inutTO) {
        return DocumentoUtil.montaNomeArquivoXML((InutilizacaoTO)inutTO, (ExtensaoArquivoEnum)ExtensaoArquivoEnum.XML, (DSENSchemaTypeEnum)DSENSchemaTypeEnum.ProcInutNFe);
    }

    public static String getNomePadraoArquivoXML(EventoTO eventoTO) {
        return DocumentoUtil.montaNomeArquivoXML((EventoTO)eventoTO, (ExtensaoArquivoEnum)ExtensaoArquivoEnum.XML, (DSENSchemaTypeEnum)DSENSchemaTypeEnum.procEventoNFe);
    }

    public static String getNomePadraoArquivoXML(ProdutoTO prodTO) {
        return DocumentoUtil.montaNomeCadastroArquivoXML((String)TipoDocumentoArquivoEnum.Produto.toString().toUpperCase(), (String)prodTO.getCProd(), (ExtensaoArquivoEnum)ExtensaoArquivoEnum.XML);
    }

    public static String getNomePadraoArquivoXML(ClienteTO clienteTO) {
        String identificadorCliente = clienteTO.getNrDocumento();
        if (StringHelper.isBlankOrNull((Object)identificadorCliente) && !StringHelper.isBlankOrNull((Object)(identificadorCliente = clienteTO.getXNome()))) {
            identificadorCliente = identificadorCliente.replaceAll("[\\\\/]", " ");
        }
        return DocumentoUtil.montaNomeCadastroArquivoXML((String)TipoDocumentoArquivoEnum.Cliente.toString().toUpperCase(), (String)identificadorCliente, (ExtensaoArquivoEnum)ExtensaoArquivoEnum.XML);
    }

    public static String getNomePadraoArquivoXML(TransportadoraTO transpTO) {
        String identificadorTransp = transpTO.getNrDocumento();
        if (StringHelper.isBlankOrNull((Object)identificadorTransp) && !StringHelper.isBlankOrNull((Object)(identificadorTransp = transpTO.getXNome()))) {
            identificadorTransp = identificadorTransp.replaceAll("[\\\\/]", " ");
        }
        return DocumentoUtil.montaNomeCadastroArquivoXML((String)TipoDocumentoArquivoEnum.Transportadora.toString().toUpperCase(), (String)identificadorTransp, (ExtensaoArquivoEnum)ExtensaoArquivoEnum.XML);
    }

    public static String getNomePadraoArquivoXML(EmitenteTO emitenteTO) {
        return DocumentoUtil.montaNomeCadastroArquivoXML((String)TipoDocumentoArquivoEnum.Emitente.toString().toUpperCase(), (String)emitenteTO.getNrDocumento(), (ExtensaoArquivoEnum)ExtensaoArquivoEnum.XML);
    }

    public static String getNomePadraoArquivoXML(BaseTO baseTO) {
        if (baseTO instanceof EmitenteTO) {
            return DocumentoUtil.getNomePadraoArquivoXML((EmitenteTO)((EmitenteTO)baseTO));
        }
        if (baseTO instanceof ClienteTO) {
            return DocumentoUtil.getNomePadraoArquivoXML((ClienteTO)((ClienteTO)baseTO));
        }
        if (baseTO instanceof TransportadoraTO) {
            return DocumentoUtil.getNomePadraoArquivoXML((TransportadoraTO)((TransportadoraTO)baseTO));
        }
        if (baseTO instanceof InutilizacaoTO) {
            return DocumentoUtil.getNomePadraoArquivoXML((InutilizacaoTO)((InutilizacaoTO)baseTO));
        }
        if (baseTO instanceof NotaFiscalTO) {
            return DocumentoUtil.getNomePadraoArquivoXML((NotaFiscalTO)((NotaFiscalTO)baseTO));
        }
        if (baseTO instanceof CancelamentoTO) {
            return DocumentoUtil.getNomePadraoArquivoXML((CancelamentoTO)((CancelamentoTO)baseTO));
        }
        if (baseTO instanceof ProdutoTO) {
            return DocumentoUtil.getNomePadraoArquivoXML((ProdutoTO)((ProdutoTO)baseTO));
        }
        if (baseTO instanceof EventoTO) {
            return DocumentoUtil.getNomePadraoArquivoXML((EventoTO)((EventoTO)baseTO));
        }
        return null;
    }

    public static void excluirCodigoNumerico(NotaFiscalTO notaFiscalTO) {
        Matcher matcher = a.matcher(notaFiscalTO.getDocXmlString());
        if (matcher.find() && matcher.groupCount() == 4) {
            String antesId = matcher.group(1);
            String depoisId = matcher.group(2);
            if (Pattern.matches("[a-zA-Z].*", depoisId) && !antesId.endsWith(" ")) {
                antesId = antesId + " ";
            }
            notaFiscalTO.setDocXmlString(antesId + depoisId + matcher.group(3) + matcher.group(4));
        }
    }

    public static EnvEventoDocument criarDocumentoEnvioEventos() throws DSENCommonException {
        try {
            EnvEventoDocument envEventoDocument = EnvEventoDocument.Factory.newInstance();
            TEnvEvento envEvento = envEventoDocument.addNewEnvEvento();
            envEvento.setVersao(DSENProperties.getInstance().getVersaoSchemaEventos());
            envEvento.setIdLote(String.valueOf(new Date().getTime()));
            envEventoDocument.setEnvEvento(envEvento);
            return envEventoDocument;
        }
        catch (Exception e) {
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
    }

    public static String criarIdDocumentoEvento(EventoTO eventoTO, int numSeq) {
        return DSENConstants.ID_EVENTO + eventoTO.getTpEvento().getCodigo() + eventoTO.getNotaFiscalTO().getChaveAcesso() + String.format("%02d", numSeq);
    }

    public static String criarIdDocumentoEvento(EventoTO eventoTO) {
        Integer nSeqEvento = eventoTO.getnSeqEvento() == null ? Integer.valueOf(DocumentoUtil.recuperarProximoNSeqEvento((EventoTO)eventoTO)) : eventoTO.getnSeqEvento();
        return DocumentoUtil.criarIdDocumentoEvento((EventoTO)eventoTO, (int)nSeqEvento);
    }

    public static String criarXMLEnvioEventoCartaCorrecao(CartaCorrecaoTO cartaCorrecaoTO, String cUF) throws DSENCommonException {
        try {
            EnvEventoDocument envEventoDocument = DocumentoUtil.criarDocumentoEnvioEventos();
            TEvento evento = envEventoDocument.getEnvEvento().addNewEvento();
            CartaCorrecaoDocument cartaCorrecaoDocument = CartaCorrecaoDocument.Factory.newInstance();
            CartaCorrecaoDocument.CartaCorrecao cartaCorrecao = cartaCorrecaoDocument.addNewCartaCorrecao();
            CartaCorrecaoDocument.CartaCorrecao.DetEvento detEventoCC = cartaCorrecao.addNewDetEvento();
            detEventoCC.setVersao(CartaCorrecaoDocument.CartaCorrecao.DetEvento.Versao.X_1_00);
            detEventoCC.setDescEvento(CartaCorrecaoDocument.CartaCorrecao.DetEvento.DescEvento.CARTA_DE_CORRECAO);
            detEventoCC.setXCondUso(CartaCorrecaoDocument.CartaCorrecao.DetEvento.XCondUso.A_CARTA_DE_CORRECAO_E_DISCIPLINADA_PELO_PARAGRAFO_1_O_A_DO_ART_7_O_DO_CONVENIO_S_N_DE_15_DE_DEZEMBRO_DE_1970_E_PODE_SER_UTILIZADA_PARA_REGULARIZACAO_DE_ERRO_OCORRIDO_NA_EMISSAO_DE_DOCUMENTO_FISCAL_DESDE_QUE_O_ERRO_NAO_ESTEJA_RELACIONADO_COM_I_AS_VARIAVEIS_QUE_DETERMINAM_O_VALOR_DO_IMPOSTO_TAIS_COMO_BASE_DE_CALCULO_ALIQUOTA_DIFERENCA_DE_PRECO_QUANTIDADE_VALOR_DA_OPERACAO_OU_DA_PRESTACAO_II_A_CORRECAO_DE_DADOS_CADASTRAIS_QUE_IMPLIQUE_MUDANCA_DO_REMETENTE_OU_DO_DESTINATARIO_III_A_DATA_DE_EMISSAO_OU_DE_SAIDA);
            detEventoCC.setXCorrecao(cartaCorrecaoTO.getxCorrecao());
            evento.setVersao(DSENProperties.getInstance().getVersaoSchemaEventos());
            TEvento.InfEvento infEvento = evento.addNewInfEvento();
            infEvento.setTpAmb(TAmb.Enum.forString((String)DSENProperties.getInstance().getAplicativoTipoAmbiente()));
            infEvento.setTpEvento(cartaCorrecaoTO.getTpEvento().getCodigo());
            infEvento.setNSeqEvento(String.valueOf(cartaCorrecaoTO.getnSeqEvento()));
            infEvento.setVerEvento(DSENProperties.getInstance().getVersaoSchemaCartaCorrecao());
            infEvento.setChNFe(cartaCorrecaoTO.getNotaFiscalTO().getChaveAcesso());
            infEvento.setCNPJ(cartaCorrecaoTO.getNotaFiscalTO().getEmitenteTO().getNrDocumento());
            infEvento.setCOrgao(TCOrgaoIBGE.Enum.forString((String)cUF));
            String timezone = DateHelper.formataDataHora((Date)cartaCorrecaoTO.getDataEvento(), (SimpleDateFormat)new SimpleDateFormat("Z"));
            timezone = timezone.substring(0, timezone.length() - 2) + ":" + timezone.substring(timezone.length() - 2, timezone.length());
            infEvento.setDhEvento(DateHelper.formataDataHora((Date)cartaCorrecaoTO.getDataEvento(), (SimpleDateFormat)DateHelper.DATE_TIME_XML_FORMAT) + timezone);
            String idInfEvento = DocumentoUtil.criarIdDocumentoEvento((EventoTO)cartaCorrecaoTO);
            infEvento.setId(idInfEvento);
            TEvento.InfEvento.DetEvento detEvento = TEvento.InfEvento.DetEvento.Factory.newInstance();
            infEvento.setDetEvento(detEvento);
            evento.setInfEvento(infEvento);
            String xmlEnvEvento = DocumentoUtil.getDocumentString((Object)envEventoDocument, (boolean)true);
            xmlEnvEvento = xmlEnvEvento.replaceFirst("<detEvento/>", "<detEvento versao=\"" + DSENProperties.getInstance().getVersaoSchemaCartaCorrecao() + "\"/>");
            return XMLUtil.alterarTagConteudo((String)xmlEnvEvento, (String)"detEvento", (String)XMLUtil.getFirstTagConteudo((String)DocumentoUtil.getDocumentString((Object)cartaCorrecaoDocument, (boolean)false), (String)"detEvento", (boolean)false, (boolean)false));
        }
        catch (DSENCommonException e) {
            throw e;
        }
        catch (Exception e) {
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
    }

    public static String criarXMLEnvioEventoCancelamento(CancelamentoEventoTO cancelamentoEventoTO, String cUF) throws DSENCommonException {
        try {
            EnvEventoDocument envEventoDocument = DocumentoUtil.criarDocumentoEnvioEventos();
            TEvento evento = envEventoDocument.getEnvEvento().addNewEvento();
            NotaFiscalTO notaFiscalTO = cancelamentoEventoTO.getNotaFiscalTO();
            CancelamentoDocument cancelamentoDocument = CancelamentoDocument.Factory.newInstance();
            CancelamentoDocument.Cancelamento cancelamento = cancelamentoDocument.addNewCancelamento();
            CancelamentoDocument.Cancelamento.DetEvento detEventoC = cancelamento.addNewDetEvento();
            detEventoC.setVersao(CancelamentoDocument.Cancelamento.DetEvento.Versao.X_1_00);
            detEventoC.setDescEvento(CancelamentoDocument.Cancelamento.DetEvento.DescEvento.CANCELAMENTO);
            if (notaFiscalTO.getNumeroProtocolo() == null) {
                notaFiscalTO.setNumeroProtocolo(cancelamentoEventoTO.getNumProtocolo());
            }
            detEventoC.setNProt(notaFiscalTO.getNumeroProtocolo());
            detEventoC.setXJust(cancelamentoEventoTO.getxJustificativa());
            evento.setVersao(DSENProperties.getInstance().getVersaoSchemaEventos());
            TEvento.InfEvento infEvento = evento.addNewInfEvento();
            infEvento.setTpAmb(TAmb.Enum.forString((String)DSENProperties.getInstance().getAplicativoTipoAmbiente()));
            infEvento.setTpEvento(cancelamentoEventoTO.getTpEvento().getCodigo());
            infEvento.setNSeqEvento(String.valueOf(cancelamentoEventoTO.getnSeqEvento()));
            infEvento.setVerEvento(DSENProperties.getInstance().getVersaoSchemaCartaCorrecao());
            infEvento.setChNFe(cancelamentoEventoTO.getNotaFiscalTO().getChaveAcesso());
            infEvento.setCNPJ(cancelamentoEventoTO.getNotaFiscalTO().getEmitenteTO().getNrDocumento());
            infEvento.setCOrgao(TCOrgaoIBGE.Enum.forString((String)cUF));
            String timezone = DateHelper.formataDataHora((Date)cancelamentoEventoTO.getDataEvento(), (SimpleDateFormat)new SimpleDateFormat("Z"));
            timezone = timezone.substring(0, timezone.length() - 2) + ":" + timezone.substring(timezone.length() - 2, timezone.length());
            infEvento.setDhEvento(DateHelper.formataDataHora((Date)cancelamentoEventoTO.getDataEvento(), (SimpleDateFormat)DateHelper.DATE_TIME_XML_FORMAT) + timezone);
            String idInfEvento = DocumentoUtil.criarIdDocumentoEvento((EventoTO)cancelamentoEventoTO);
            infEvento.setId(idInfEvento);
            TEvento.InfEvento.DetEvento detEvento = TEvento.InfEvento.DetEvento.Factory.newInstance();
            infEvento.setDetEvento(detEvento);
            evento.setInfEvento(infEvento);
            String xmlEnvEvento = DocumentoUtil.getDocumentString((Object)envEventoDocument, (boolean)true);
            xmlEnvEvento = xmlEnvEvento.replaceFirst("<detEvento/>", "<detEvento versao=\"" + DSENProperties.getInstance().getVersaoSchemaCancelamentoEvento() + "\"/>");
            return XMLUtil.alterarTagConteudo((String)xmlEnvEvento, (String)"detEvento", (String)XMLUtil.getFirstTagConteudo((String)DocumentoUtil.getDocumentString((Object)cancelamentoDocument, (boolean)false), (String)"detEvento", (boolean)false, (boolean)false));
        }
        catch (DSENCommonException e) {
            throw e;
        }
        catch (Exception e) {
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
    }

    public static int recuperarProximoNSeqEvento(EventoTO eventoTO) {
        List eventosList = eventoTO.getNotaFiscalTO().getEventoTOList();
        int maxNSeq = 0;
        if (eventosList != null) {
            for (EventoTO outroEventoTO : eventosList) {
                if (!outroEventoTO.getTpEvento().equals((Object)eventoTO.getTpEvento())) continue;
                maxNSeq = Math.max(maxNSeq, outroEventoTO.getnSeqEvento());
            }
        }
        return maxNSeq + 1;
    }

    public static String criarXMLEnvioEvento(EventoTO eventoTO, String cUF) throws DSENCommonException {
        switch (1.b[eventoTO.getTpEvento().ordinal()]) {
            case 1: {
                return DocumentoUtil.criarXMLEnvioEventoCartaCorrecao((CartaCorrecaoTO)((CartaCorrecaoTO)eventoTO), (String)cUF);
            }
            case 2: {
                return DocumentoUtil.criarXMLEnvioEventoCancelamento((CancelamentoEventoTO)((CancelamentoEventoTO)eventoTO), (String)cUF);
            }
        }
        throw new DSENCommonException((Throwable)new UnsupportedOperationException(), "N\u00e3o Implementado! Tratamento do Evento " + eventoTO.getTpEvento().getDescricao() + " n\u00e3o implementado!");
    }

    public static Object criarEnvioDPEC(EmitenteTO emitenteTO, String codigoEstado) throws DSENCommonException {
        EnvDPECDocument envDPECDocument = EnvDPECDocument.Factory.newInstance();
        TDPEC tDpec = envDPECDocument.addNewEnvDPEC();
        TDPEC.InfDPEC infDpec = tDpec.addNewInfDPEC();
        TDPEC.InfDPEC.IdeDec ideDec = infDpec.addNewIdeDec();
        tDpec.setVersao(DSENProperties.getInstance().getVersaoSchemaDpec());
        infDpec.setId(DSENConstants.ID_DPEC + emitenteTO.getNrDocumento());
        ideDec.setCUF(TCodUfIBGE.Enum.forString((String)codigoEstado));
        ideDec.setTpAmb(TAmb.Enum.forString((String)DSENProperties.getInstance().getAplicativoTipoAmbiente()));
        ideDec.setVerProc(DSENProperties.getInstance().getAplicativoVersao());
        ideDec.setCNPJ(emitenteTO.getNrDocumento());
        ideDec.setIE(emitenteTO.getIe());
        return envDPECDocument;
    }

    public static void addResumoNFeDPEC(Object envioDPEC, NotaFiscalTO notaFiscalTO) throws DSENCommonException {
        EnvDPECDocument envDPECDocument = (EnvDPECDocument)envioDPEC;
        TDPEC.InfDPEC.ResNFe resNFe = envDPECDocument.getEnvDPEC().getInfDPEC().addNewResNFe();
        resNFe.setChNFe(ChaveAcessoUtil.gerarChaveAcesso((NotaFiscalTO)notaFiscalTO));
        if (StringHelper.isBlankOrNull((Object)notaFiscalTO.getDocumentoDest())) {
            resNFe.setCNPJ("");
        } else if (notaFiscalTO.getDocumentoDest().length() == 14) {
            resNFe.setCNPJ(notaFiscalTO.getDocumentoDest());
        } else if (notaFiscalTO.getDocumentoDest().length() == 11) {
            resNFe.setCPF(notaFiscalTO.getDocumentoDest());
        }
        resNFe.setUF(TUf.Enum.forString((String)notaFiscalTO.getUfDest()));
        String icmsTot = (String)XMLUtil.getTagConteudo((String)notaFiscalTO.getDocXmlString(), (String)"ICMSTot", (boolean)true).get(0);
        resNFe.setVNF((String)XMLUtil.getTagConteudo((String)icmsTot, (String)"vNF", (boolean)false).get(0));
        resNFe.setVICMS((String)XMLUtil.getTagConteudo((String)icmsTot, (String)"vICMS", (boolean)false).get(0));
        resNFe.setVST((String)XMLUtil.getTagConteudo((String)icmsTot, (String)"vST", (boolean)false).get(0));
    }

    public static void removeUltimoResumoNFe(Object envioDPEC) throws DSENCommonException {
        EnvDPECDocument envDPECDocument = (EnvDPECDocument)envioDPEC;
        TDPEC.InfDPEC infDPEC = envDPECDocument.getEnvDPEC().getInfDPEC();
        int lastIndex = infDPEC.sizeOfResNFeArray() - 1;
        infDPEC.removeResNFe(lastIndex);
    }

    public static String getCFOP(TNFe.InfNFe.Det.Prod prod, boolean force) {
        String cfop;
        block3 : {
            cfop = null;
            if (prod != null) {
                TCfop.Enum tcfop = null;
                try {
                    tcfop = prod.getCFOP();
                    cfop = tcfop != null ? tcfop.toString() : null;
                }
                catch (XmlValueOutOfRangeException e) {
                    String xmlCFOP;
                    List list;
                    if (!force || (list = XMLUtil.getTagConteudo((String)(xmlCFOP = prod.xgetCFOP().toString()), (String)"xml-fragment", (boolean)false)) == null || list.size() <= 0) break block3;
                    cfop = (String)list.get(0);
                }
            }
        }
        return cfop;
    }

    public static String getCFOP(TNFe.InfNFe.Transp.RetTransp transp, boolean force) {
        String cfop;
        block3 : {
            cfop = null;
            if (transp != null) {
                TCfopTransp.Enum tcfop = null;
                try {
                    tcfop = transp.getCFOP();
                    cfop = tcfop != null ? tcfop.toString() : null;
                }
                catch (XmlValueOutOfRangeException e) {
                    String xmlCFOP;
                    List list;
                    if (!force || (list = XMLUtil.getTagConteudo((String)(xmlCFOP = transp.xgetCFOP().toString()), (String)"xml-fragment", (boolean)false)) == null || list.size() <= 0) break block3;
                    cfop = (String)list.get(0);
                }
            }
        }
        return cfop;
    }

    public static WSStatusRetorno validarRetornoConsultaCadastro(String retConsCadXML, ConsultaCadastroTO consultaCadastroTO) {
        RetConsCadDocument retConsCadDocument = null;
        try {
            retConsCadDocument = RetConsCadDocument.Factory.parse((String)retConsCadXML);
        }
        catch (XmlException e) {
            return WSStatusRetorno.XML_INVALIDO;
        }
        ArrayList validationErrors = new ArrayList();
        XmlOptions m_validationOptions = new XmlOptions();
        m_validationOptions.setErrorListener(validationErrors);
        if (!retConsCadDocument.validate(m_validationOptions)) {
            System.err.println(validationErrors);
            return WSStatusRetorno.XML_INVALIDO;
        }
        TRetConsCad.InfCons infCons = retConsCadDocument.getRetConsCad().getInfCons();
        consultaCadastroTO.setVerAplic(infCons.getVerAplic());
        consultaCadastroTO.setCStat(infCons.getCStat());
        consultaCadastroTO.setXMotivo(infCons.getXMotivo());
        consultaCadastroTO.setUf(infCons.getUF().toString());
        if (!StringHelper.isBlankOrNull((Object)infCons.getIE())) {
            if ("SU".equalsIgnoreCase(consultaCadastroTO.getUf())) {
                consultaCadastroTO.setIeSuframa(infCons.getIE());
            } else {
                consultaCadastroTO.setIE(infCons.getIE());
            }
        } else if (!StringHelper.isBlankOrNull((Object)infCons.getCNPJ())) {
            consultaCadastroTO.setCNPJ(infCons.getCNPJ());
        } else if (!StringHelper.isBlankOrNull((Object)infCons.getCPF())) {
            consultaCadastroTO.setCPF(infCons.getCPF());
        }
        consultaCadastroTO.setDhCons(infCons.getDhCons().getTime());
        consultaCadastroTO.setCUF(infCons.getCUF().toString());
        if (!DSENConstants.CONSULTA_CADASTRO_UMA_OCORRENCIA.equals(infCons.getCStat()) && !DSENConstants.CONSULTA_CADASTRO_MAIS_DE_UMA_OCORRENCIA.equals(infCons.getCStat())) {
            return WSStatusRetorno.NOK;
        }
        TRetConsCad.InfCons.InfCad[] infCadArray = infCons.getInfCadArray();
        ArrayList<EstabelecimentoTO> listaEstabelecimentoTO = new ArrayList<EstabelecimentoTO>();
        EstabelecimentoTO estabelecimentoTO = null;
        TRetConsCad.InfCons.InfCad infCad = null;
        if (infCadArray.length != 0) {
            for (int i = 0; i < infCadArray.length; ++i) {
                infCad = infCadArray[i];
                estabelecimentoTO = new EstabelecimentoTO();
                estabelecimentoTO.setIE(infCad.getIE());
                if (!StringHelper.isBlankOrNull((Object)infCad.getCNPJ())) {
                    estabelecimentoTO.setCNPJ(infCad.getCNPJ());
                } else if (!StringHelper.isBlankOrNull((Object)infCad.getCPF())) {
                    estabelecimentoTO.setCPF(infCad.getCPF());
                }
                estabelecimentoTO.setUF(infCad.getUF().toString());
                estabelecimentoTO.setCSit(infCad.getCSit().toString());
                estabelecimentoTO.setXNome(infCad.getXNome());
                estabelecimentoTO.setXFant(infCad.getXFant());
                estabelecimentoTO.setXRegApur(infCad.getXRegApur());
                estabelecimentoTO.setCNAE(infCad.getCNAE());
                if (infCad.getDIniAtiv() != null) {
                    estabelecimentoTO.setDataIniAtiv(infCad.getDIniAtiv().getTime());
                }
                if (infCad.getDUltSit() != null) {
                    estabelecimentoTO.setDUltSit(infCad.getDUltSit().getTime());
                }
                if (infCad.getDBaixa() != null) {
                    estabelecimentoTO.setDBaixa(infCad.getDBaixa().getTime());
                }
                estabelecimentoTO.setIEUnica(infCad.getIEUnica());
                estabelecimentoTO.setIEAtual(infCad.getIEAtual());
                estabelecimentoTO.setIndCredCTe(IndCredCTeEnum.getEnumPeloCodigo((String)infCad.getIndCredCTe().toString()));
                estabelecimentoTO.setIndCredNFe(IndCredNFeEnum.getEnumPeloCodigo((String)infCad.getIndCredNFe().toString()));
                TEnderecoConsCad ender = infCad.getEnder();
                if (ender != null) {
                    estabelecimentoTO.setXLgr(ender.getXLgr());
                    estabelecimentoTO.setNro(ender.getNro());
                    estabelecimentoTO.setXCpl(ender.getXCpl());
                    estabelecimentoTO.setXBairro(ender.getXBairro());
                    estabelecimentoTO.setCMun(ender.getCMun());
                    estabelecimentoTO.setXMun(ender.getXMun());
                    estabelecimentoTO.setCEP(ender.getCEP());
                }
                listaEstabelecimentoTO.add(estabelecimentoTO);
            }
            consultaCadastroTO.setListaEstabelecimentoTO(listaEstabelecimentoTO);
        }
        return WSStatusRetorno.OK;
    }

    public static void setProtocoloEvento(EventoTO eventoTO, String xmlRetorno) throws DSENCommonException {
        try {
            ProcEventoNFeDocument procDocument = ProcEventoNFeDocument.Factory.newInstance();
            EnvEventoDocument envDocument = EnvEventoDocument.Factory.parse((String)eventoTO.getDocXmlString());
            RetEnvEventoDocument retEnvDocument = RetEnvEventoDocument.Factory.parse((String)xmlRetorno);
            TProcEvento procEvento = procDocument.addNewProcEventoNFe();
            procEvento.setVersao(DSENProperties.getInstance().getVersaoSchemaEventos());
            procEvento.setEvento(envDocument.getEnvEvento().getEventoArray(0));
            procEvento.setRetEvento(retEnvDocument.getRetEnvEvento().getRetEventoArray(0));
            eventoTO.setXmlProcString(DocumentoUtil.getDocumentString((Object)procDocument, (boolean)true));
        }
        catch (Exception e) {
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
    }

    public static String getProtocoloNFeConsultaSituacao(TProtNFe situacaoProtNFe) throws DSENCommonException {
        try {
            TProtNFe.InfProt infProtSituacao = situacaoProtNFe.getInfProt();
            NfeProcDocument NFeProcDocument = NfeProcDocument.Factory.newInstance();
            TProtNFe protNFe = NFeProcDocument.addNewNfeProc().addNewProtNFe();
            TProtNFe.InfProt infProtNFe = protNFe.addNewInfProt();
            protNFe.setVersao(DSENProperties.getInstance().getVersaoSchema());
            if (!StringHelper.isBlankOrNull((Object)infProtSituacao.getId())) {
                infProtNFe.setId(infProtSituacao.getId());
            }
            infProtNFe.setTpAmb(TAmb.Enum.forString((String)infProtSituacao.getTpAmb().toString()));
            infProtNFe.setVerAplic(infProtSituacao.getVerAplic());
            infProtNFe.setChNFe(infProtSituacao.getChNFe());
            if (!StringHelper.isBlankOrNull((Object)infProtSituacao.getDhRecbto())) {
                infProtNFe.setDhRecbto(infProtSituacao.getDhRecbto());
            }
            if (!StringHelper.isBlankOrNull((Object)infProtSituacao.getNProt())) {
                infProtNFe.setNProt(infProtSituacao.getNProt());
            }
            if (!StringHelper.isBlankOrNull((Object)infProtSituacao.getDigVal())) {
                infProtNFe.setDigVal(infProtSituacao.getDigVal());
            }
            infProtNFe.setCStat(infProtSituacao.getCStat());
            infProtNFe.setXMotivo(infProtSituacao.getXMotivo());
            return (String)XMLUtil.getTagConteudo((String)DocumentoUtil.getDocumentString((Object)NFeProcDocument, (boolean)true), (String)"protNFe", (boolean)true).get(0);
        }
        catch (Exception e) {
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
    }

    public static EventoTO getEventoTO(NotaFiscalTO notaFiscalTO, TProcEvento procEvento) throws DSENCommonException {
        try {
            EventoTO eventoTO = new EventoTO();
            eventoTO.setTpEvento(TipoEventoEnum.getEnumPeloCodigo((String)procEvento.getEvento().getInfEvento().getTpEvento()));
            eventoTO.setDataEvento(DateHelper.getDate((String)procEvento.getEvento().getInfEvento().getDhEvento(), (SimpleDateFormat)DateHelper.DATE_TIME_XML_FORMAT));
            eventoTO.setDataRegEvento(DateHelper.getDate((String)procEvento.getRetEvento().getInfEvento().getDhRegEvento(), (SimpleDateFormat)DateHelper.DATE_TIME_XML_FORMAT));
            eventoTO.setNumProtocolo(procEvento.getRetEvento().getInfEvento().getNProt());
            eventoTO.setNotaFiscalTO(notaFiscalTO);
            eventoTO.setnSeqEvento(new Integer(procEvento.getEvento().getInfEvento().getNSeqEvento()));
            ProcEventoNFeDocument procEventoDocument = ProcEventoNFeDocument.Factory.newInstance();
            procEventoDocument.setProcEventoNFe(procEvento);
            eventoTO.setXmlProcString(DocumentoUtil.getDocumentString((Object)procEventoDocument, (boolean)true));
            return eventoTO;
        }
        catch (Exception e) {
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
    }

    static {
    }
}

