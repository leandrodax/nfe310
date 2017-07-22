/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.FormaPagamentoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ModalidadeFreteEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ModeloECFEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.OrigemProcessoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoImpressaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoPapelImpressaoEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.ImpressaoDanfeItemTO
 *  br.gov.sp.fazenda.dsen.common.to.ImpressaoDanfeTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.SelecaoDanfeTO
 *  br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.model.business.DanfeBusiness
 *  br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter
 *  br.gov.sp.fazenda.dsen.model.dao.PesquisaDAO
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.PesquisaEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENConverterException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCodUfIBGE
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCodUfIBGE$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEnderEmi
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEndereco
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TIpi
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TIpi$IPITrib
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Cobr
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Cobr$Dup
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Cobr$Fat
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Dest
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS00
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS00$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS00$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS10
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS10$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS10$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS20
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS20$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS20$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS30
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS30$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS30$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS40
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS40$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS40$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS51
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS51$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS51$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS60
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS60$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS60$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS70
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS70$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS70$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS90
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS90$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS90$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSPart
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSPart$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSPart$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN101
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN101$CSOSN
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN101$CSOSN$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN102
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN102$CSOSN
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN102$CSOSN$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN201
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN201$CSOSN
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN201$CSOSN$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN202
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN202$CSOSN
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN202$CSOSN$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN500
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN500$CSOSN
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN500$CSOSN$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN900
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN900$CSOSN
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN900$CSOSN$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSST$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSST$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Emit
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$IndPag
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$IndPag$Enum
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
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$TpImp
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$TpImp$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$TpNF
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$TpNF$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$InfAdic
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$InfAdic$ProcRef
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$InfAdic$ProcRef$IndProc
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$InfAdic$ProcRef$IndProc$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Total
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Total$ICMSTot
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Total$ISSQNtot
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Transp
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Transp$ModFrete
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Transp$ModFrete$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Transp$Transporta
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Transp$Vol
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUf
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUf$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUfEmi
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUfEmi$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TVeiculo
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.Torig
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.Torig$Enum
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  net.sourceforge.barbecue.Barcode
 *  net.sourceforge.barbecue.BarcodeException
 *  net.sourceforge.barbecue.BarcodeImageHandler
 *  net.sourceforge.barbecue.env.EnvironmentFactory
 *  net.sourceforge.barbecue.linear.code128.Code128Barcode
 *  net.sourceforge.barbecue.output.OutputException
 *  org.apache.log4j.Logger
 *  org.apache.xmlbeans.XmlException
 */
package br.gov.sp.fazenda.dsen.model.business;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.FormaPagamentoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ModalidadeFreteEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ModeloECFEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.OrigemProcessoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoImpressaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoPapelImpressaoEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.ImpressaoDanfeItemTO;
import br.gov.sp.fazenda.dsen.common.to.ImpressaoDanfeTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.SelecaoDanfeTO;
import br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter;
import br.gov.sp.fazenda.dsen.model.dao.PesquisaDAO;
import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
import br.gov.sp.fazenda.dsen.model.entity.PesquisaEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.exception.DSENConverterException;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCodUfIBGE;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEnderEmi;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEndereco;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TIpi;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUf;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUfEmi;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TVeiculo;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.Torig;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.imageio.ImageIO;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeImageHandler;
import net.sourceforge.barbecue.env.EnvironmentFactory;
import net.sourceforge.barbecue.linear.code128.Code128Barcode;
import net.sourceforge.barbecue.output.OutputException;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlException;

public class DanfeBusiness {
    private Logger a;
    private PesquisaDAO a;
    private int a = 60;
    private int b = 8;

    public SelecaoDanfeTO carregarSelecaoImpressaoDanfe(EmitenteTO emitenteTO) throws DSENBusinessException {
        this.a.debug((Object)"(DanfeBusiness.carregarSelecaoImpressaoDanfe) Inicio");
        SelecaoDanfeTO selecaoDanfeTO = null;
        try {
            EmitenteEntity emitenteEntity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)emitenteTO);
            PesquisaEntity pesquisaEntity = new PesquisaEntity();
            pesquisaEntity.setIdEmitente(emitenteEntity);
            pesquisaEntity.setTelaEnum(TelaPesquisaEnum.IMPRESSAO_DANFE);
            selecaoDanfeTO = DSENBusinessConverter.getSelecaoDanfeTO((List)this.a.selectByEmitenteTelaPesquisaEnum(pesquisaEntity));
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        this.a.debug((Object)"(DanfeBusiness.carregarSelecaoImpressaoDanfe) Fim");
        return selecaoDanfeTO;
    }

    @DSGETransaction
    public void salvarSelecaoImpressaoDanfe(SelecaoDanfeTO selecaoDanfeTO) throws DSENBusinessException {
        try {
            EmitenteEntity emitenteEntity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)selecaoDanfeTO.getIdEmitente());
            PesquisaEntity pesquisaEntity = new PesquisaEntity();
            pesquisaEntity.setIdEmitente(emitenteEntity);
            pesquisaEntity.setTelaEnum(selecaoDanfeTO.getTelaPesquisaEnum());
            List listPesquisaBanco = this.a.selectByEmitenteTelaPesquisaEnum(pesquisaEntity);
            List listPesquisaTela = DSENBusinessConverter.getPesquisaEntity((SelecaoDanfeTO)selecaoDanfeTO);
            if (listPesquisaBanco != null) {
                for (int i = 0; i < listPesquisaBanco.size(); ++i) {
                    PesquisaEntity element = (PesquisaEntity)listPesquisaBanco.get(i);
                    element.setValor(((PesquisaEntity)listPesquisaTela.get(i)).getValor());
                    this.a.update((Serializable)element);
                }
            } else {
                for (PesquisaEntity element : listPesquisaTela) {
                    this.a.insert((Serializable)element);
                }
            }
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSGEDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
    }

    public boolean isSelecaoValida(List<NotaFiscalTO> notaFiscalTOList) throws DSENBusinessException {
        TipoEmissaoEnum tipo = notaFiscalTOList.get(0).getTipoEmissao();
        SituacaoNFeEnum situacao = notaFiscalTOList.get(0).getSituacao();
        NFeDocument nfe = null;
        try {
            nfe = DocumentoUtil.getNFeDocument((String)notaFiscalTOList.get(0).getDocXmlString());
        }
        catch (Exception e) {
            this.a.error((Object)("(DanfeBusiness.isSelecaoValida) Erro ao capturar o objeto NFe: " + e.getMessage()));
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        if (nfe == null) {
            Exception e = new Exception(DSENMessageConstants.MSG_DANFE_IMPOSSIVEL_IMPRIMIR_DOCUMENTO);
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        int orientacao = nfe.getNFe().getInfNFe().getIde().getTpImp().intValue();
        for (int i = 0; i < notaFiscalTOList.size(); ++i) {
            NotaFiscalTO nota = notaFiscalTOList.get(i);
            try {
                nfe = DocumentoUtil.getNFeDocument((String)nota.getDocXmlString());
            }
            catch (XmlException e) {
                throw new DSENBusinessException((Throwable)e, e.getMessage());
            }
            if (nota.getTipoEmissao().equals((Object)tipo) && nota.getSituacao().equals((Object)situacao) && nfe.getNFe().getInfNFe().getIde().getTpImp().intValue() == orientacao) continue;
            return false;
        }
        return true;
    }

    public boolean canSaveAndPrint(List<NotaFiscalTO> notaFiscalTOList) {
        for (int i = 0; i < notaFiscalTOList.size(); ++i) {
            NotaFiscalTO nota = notaFiscalTOList.get(i);
            if ((nota.getTipoEmissao().equals((Object)TipoEmissaoEnum.NORMAL) || nota.getTipoEmissao().equals((Object)TipoEmissaoEnum.CONTINGENCIA_SCAN)) && !nota.getSituacao().equals((Object)SituacaoNFeEnum.AUTORIZADA)) {
                return false;
            }
            if (!nota.getTipoEmissao().equals((Object)TipoEmissaoEnum.CONTINGENCIA) && !nota.getTipoEmissao().equals((Object)TipoEmissaoEnum.CONTINGENCIA_FS_DA) && !nota.getTipoEmissao().equals((Object)TipoEmissaoEnum.CONTINGENCIA_DPEC) || nota.getSituacao().equals((Object)SituacaoNFeEnum.AUTORIZADA) || nota.getSituacao().equals((Object)SituacaoNFeEnum.ASSINADA)) continue;
            return false;
        }
        return true;
    }

    public List<ImpressaoDanfeTO> getImpressaoDanfeTOList(List<NotaFiscalTO> notaFiscalTOList, TipoPapelImpressaoEnum tipoPapel) throws DSENBusinessException {
        ArrayList<ImpressaoDanfeTO> impressaoDanfeTOList = new ArrayList<ImpressaoDanfeTO>();
        for (int i = 0; i < notaFiscalTOList.size(); ++i) {
            NotaFiscalTO notaFiscal = notaFiscalTOList.get(i);
            ImpressaoDanfeTO impressaoDanfe = this.a(notaFiscal, tipoPapel);
            impressaoDanfeTOList.add(impressaoDanfe);
        }
        return impressaoDanfeTOList;
    }

    private ImpressaoDanfeTO a(NotaFiscalTO notaFiscal, TipoPapelImpressaoEnum tipoPapel) throws DSENBusinessException {
        this.a.debug((Object)"(DanfeBusiness.getImpressaoDanfeTOByNotaFiscalTO) Inicio");
        NFeDocument nfe = null;
        ImpressaoDanfeTO impressao = new ImpressaoDanfeTO();
        impressao.setSituacao(notaFiscal.getSituacao().toString());
        try {
            nfe = DocumentoUtil.getNFeDocument((String)notaFiscal.getDocXmlString());
        }
        catch (Exception e) {
            this.a.error((Object)("(DanfeBusiness.getImpressaoDanfeTOByNotaFiscalTO) Erro ao capturar o objeto NFe: " + e.getMessage()));
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        if (nfe == null) {
            Exception e = new Exception(DSENMessageConstants.MSG_DANFE_IMPOSSIVEL_IMPRIMIR_DOCUMENTO + " " + StringHelper.formataNotaFiscal((String)notaFiscal.getNumero()));
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        EmitenteTO emitenteTO = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
        if (emitenteTO.getLogotipo() != null) {
            ByteArrayInputStream in = new ByteArrayInputStream(emitenteTO.getLogotipo());
            try {
                impressao.setEmitenteLotoTipo((Image)ImageIO.read(in));
            }
            catch (IOException e) {
                this.a.error((Object)("(DanfeBusiness.getImpressaoDanfeTOByNotaFiscalTO) Erro ao capturar o logotipo do emitente: " + e.getMessage()));
                throw new DSENBusinessException((Throwable)e, e.getMessage());
            }
        }
        try {
            int bIndex;
            String dataContingencia;
            TNFe.InfNFe.Cobr.Dup[] dupArray;
            TNFe.InfNFe.Cobr cobr;
            TNFe.InfNFe.Ide.NFref[] nfrefArray;
            String chave = ChaveAcessoUtil.formatarChaveAcesso4x4((String)ChaveAcessoUtil.gerarChaveAcesso((NotaFiscalTO)notaFiscal));
            impressao.setTipoEmissao(notaFiscal.getTipoEmissao().getDescricao());
            impressao.setCodigoTipoEmissao(notaFiscal.getTipoEmissao().getCodigo());
            impressao.setChaveAcesso(chave);
            impressao.setDataEmissao(DateHelper.formataData((Date)DateHelper.getDate((String)nfe.getNFe().getInfNFe().getIde().getDhEmi(), (SimpleDateFormat)DateHelper.DATE_TIME_XML_FORMAT310)));
            impressao.setOrientacaoLayoutDanfe(nfe.getNFe().getInfNFe().getIde().getTpImp().intValue());
            impressao.setCodigoBarras(this.a(ChaveAcessoUtil.gerarChaveAcesso((NotaFiscalTO)notaFiscal)));
            impressao.setNaturezaOperacao(nfe.getNFe().getInfNFe().getIde().getNatOp());
            impressao.setSerieNfe(String.valueOf(nfe.getNFe().getInfNFe().getIde().getSerie()));
            String xLgrEmit = nfe.getNFe().getInfNFe().getEmit().getEnderEmit().getXLgr();
            String nroEmit = nfe.getNFe().getInfNFe().getEmit().getEnderEmit().getNro();
            String xCplEmit = nfe.getNFe().getInfNFe().getEmit().getEnderEmit().getXCpl();
            impressao.setEmitenteEndereco((xLgrEmit != null ? xLgrEmit : "") + ", " + (nroEmit != null ? nroEmit : "") + " - " + (xCplEmit != null ? xCplEmit : ""));
            impressao.setEmitenteRazaoSocial(nfe.getNFe().getInfNFe().getEmit().getXNome());
            impressao.setEmitenteCnpj(StringHelper.cnpjFormat((String)nfe.getNFe().getInfNFe().getEmit().getCNPJ()));
            impressao.setEmitenteInscricaoEstadual(nfe.getNFe().getInfNFe().getEmit().getIE());
            impressao.setEmitenteInscricaoEstadualSubtributario(nfe.getNFe().getInfNFe().getEmit().getIEST());
            impressao.setEmitenteBairro(nfe.getNFe().getInfNFe().getEmit().getEnderEmit().getXBairro() != null ? nfe.getNFe().getInfNFe().getEmit().getEnderEmit().getXBairro() : "");
            impressao.setEmitenteMunicipio(nfe.getNFe().getInfNFe().getEmit().getEnderEmit().getXMun() != null ? nfe.getNFe().getInfNFe().getEmit().getEnderEmit().getXMun() : "");
            impressao.setEmitenteUf(nfe.getNFe().getInfNFe().getEmit().getEnderEmit().getUF() != null ? nfe.getNFe().getInfNFe().getEmit().getEnderEmit().getUF().toString() : "");
            impressao.setEmitenteCep(!StringHelper.isBlankOrNull((Object)nfe.getNFe().getInfNFe().getEmit().getEnderEmit().getCEP()) ? nfe.getNFe().getInfNFe().getEmit().getEnderEmit().getCEP() : "");
            impressao.setEmitenteTelefone(!StringHelper.isBlankOrNull((Object)nfe.getNFe().getInfNFe().getEmit().getEnderEmit().getFone()) ? nfe.getNFe().getInfNFe().getEmit().getEnderEmit().getFone() : "");
            impressao.setNumeroNfe(nfe.getNFe().getInfNFe().getIde().getNNF() != null ? StringHelper.formataNotaFiscal((String)nfe.getNFe().getInfNFe().getIde().getNNF()) : "");
            impressao.setInscricaoMunicipal(nfe.getNFe().getInfNFe().getEmit().getIM());
            impressao.setSaidaEntrada(nfe.getNFe().getInfNFe().getIde().getTpNF().toString());
            impressao.setDataSaidaEntrada(!StringHelper.isBlankOrNull((Object)nfe.getNFe().getInfNFe().getIde().getDhSaiEnt()) ? DateHelper.formataData((Date)DateHelper.getDateTime((String)nfe.getNFe().getInfNFe().getIde().getDhSaiEnt(), (SimpleDateFormat)DateHelper.DATE_TIME_XML_FORMAT310)) : "");
            String xLgrDest = nfe.getNFe().getInfNFe().getDest().getEnderDest().getXLgr();
            String nroDest = nfe.getNFe().getInfNFe().getDest().getEnderDest().getNro();
            String xCplDest = nfe.getNFe().getInfNFe().getDest().getEnderDest().getXCpl();
            impressao.setDestinatarioEndereco((xLgrDest != null ? xLgrDest : "") + ", " + (nroDest != null ? nroDest : "") + " - " + (xCplDest != null ? xCplDest : ""));
            impressao.setDestinatarioRazaoSocial(nfe.getNFe().getInfNFe().getDest().getXNome());
            impressao.setDestinatarioBairro(nfe.getNFe().getInfNFe().getDest().getEnderDest().getXBairro());
            impressao.setDestinatarioCep(StringHelper.formataCEP((String)nfe.getNFe().getInfNFe().getDest().getEnderDest().getCEP()));
            impressao.setDestinatarioMunicipio(nfe.getNFe().getInfNFe().getDest().getEnderDest().getXMun());
            impressao.setDestinatarioInscricaoEstadual(nfe.getNFe().getInfNFe().getDest().getIE());
            impressao.setDestinatarioFoneFax(nfe.getNFe().getInfNFe().getDest().getEnderDest().getFone());
            if (nfe.getNFe().getInfNFe().getDest().getCNPJ() != null) {
                impressao.setDestinatarioCnpjCpf(StringHelper.cnpjFormat((String)nfe.getNFe().getInfNFe().getDest().getCNPJ()));
            } else if (nfe.getNFe().getInfNFe().getDest().getCPF() != null) {
                impressao.setDestinatarioCnpjCpf(StringHelper.cpfFormat((String)nfe.getNFe().getInfNFe().getDest().getCPF()));
            }
            if (nfe.getNFe().getInfNFe().getDest().getEnderDest().getUF() != null) {
                impressao.setDestinatarioUf(nfe.getNFe().getInfNFe().getDest().getEnderDest().getUF().toString());
                impressao.setDestinatarioCodigoUf(DSENUtilHelper.getInstance().getEstadoTOBySigla(impressao.getDestinatarioUf()).getCodigo());
            }
            String formaPgto = FormaPagamentoEnum.getEnumPeloCodigo((String)nfe.getNFe().getInfNFe().getIde().getIndPag().toString()).getDescricao().toUpperCase();
            StringBuffer nFat = new StringBuffer();
            StringBuffer vOrig = new StringBuffer();
            StringBuffer vDesc = new StringBuffer();
            StringBuffer vLiq = new StringBuffer();
            if (nfe.getNFe().getInfNFe().getCobr() != null && nfe.getNFe().getInfNFe().getCobr().getFat() != null) {
                if (!StringHelper.isBlankOrNull((Object)nfe.getNFe().getInfNFe().getCobr().getFat().getNFat())) {
                    nFat.append(" / Num.: ").append(nfe.getNFe().getInfNFe().getCobr().getFat().getNFat());
                }
                if (!StringHelper.isBlankOrNull((Object)nfe.getNFe().getInfNFe().getCobr().getFat().getVOrig())) {
                    vOrig.append(" / V. Orig.: ").append(StringHelper.formataValor((String)nfe.getNFe().getInfNFe().getCobr().getFat().getVOrig(), (int)2, (int)2));
                }
                if (!StringHelper.isBlankOrNull((Object)nfe.getNFe().getInfNFe().getCobr().getFat().getVDesc())) {
                    vDesc.append(" / V. Desc.: ").append(StringHelper.formataValor((String)nfe.getNFe().getInfNFe().getCobr().getFat().getVDesc(), (int)2, (int)2));
                }
                if (!StringHelper.isBlankOrNull((Object)nfe.getNFe().getInfNFe().getCobr().getFat().getVLiq())) {
                    vLiq.append(" / V. Liq.: ").append(StringHelper.formataValor((String)nfe.getNFe().getInfNFe().getCobr().getFat().getVLiq(), (int)2, (int)2));
                }
            }
            impressao.setFatura(formaPgto + nFat + vOrig + vDesc + vLiq);
            impressao.setBaseIcms(StringHelper.formataValor((String)nfe.getNFe().getInfNFe().getTotal().getICMSTot().getVBC(), (int)2, (int)2));
            impressao.setValorIcms(StringHelper.formataValor((String)nfe.getNFe().getInfNFe().getTotal().getICMSTot().getVICMS(), (int)2, (int)2));
            impressao.setBaseIcmsSubstituicao(StringHelper.formataValor((String)nfe.getNFe().getInfNFe().getTotal().getICMSTot().getVBCST(), (int)2, (int)2));
            impressao.setValorIcmsSubstituicao(StringHelper.formataValor((String)nfe.getNFe().getInfNFe().getTotal().getICMSTot().getVST(), (int)2, (int)2));
            impressao.setValorTotalProduto(StringHelper.formataValor((String)nfe.getNFe().getInfNFe().getTotal().getICMSTot().getVProd(), (int)2, (int)2));
            impressao.setValorFrete(StringHelper.formataValor((String)nfe.getNFe().getInfNFe().getTotal().getICMSTot().getVFrete(), (int)2, (int)2));
            impressao.setValorSeguro(StringHelper.formataValor((String)nfe.getNFe().getInfNFe().getTotal().getICMSTot().getVSeg(), (int)2, (int)2));
            impressao.setDesconto(StringHelper.formataValor((String)nfe.getNFe().getInfNFe().getTotal().getICMSTot().getVDesc(), (int)2, (int)2));
            impressao.setOutrasDespesas(StringHelper.formataValor((String)nfe.getNFe().getInfNFe().getTotal().getICMSTot().getVOutro(), (int)2, (int)2));
            impressao.setValorIpi(StringHelper.formataValor((String)nfe.getNFe().getInfNFe().getTotal().getICMSTot().getVIPI(), (int)2, (int)2));
            impressao.setValorTotalNota(StringHelper.formataValor((String)nfe.getNFe().getInfNFe().getTotal().getICMSTot().getVNF(), (int)2, (int)2));
            if (nfe.getNFe().getInfNFe().getTransp().getTransporta() != null) {
                impressao.setTransportadorRazaoSocial(nfe.getNFe().getInfNFe().getTransp().getTransporta().getXNome());
                impressao.setTransportadorEndere\u00e7o(nfe.getNFe().getInfNFe().getTransp().getTransporta().getXEnder());
                impressao.setTransportadorMunicipio(nfe.getNFe().getInfNFe().getTransp().getTransporta().getXMun());
                impressao.setTransportadorInscricaoEstadual(nfe.getNFe().getInfNFe().getTransp().getTransporta().getIE());
                if (nfe.getNFe().getInfNFe().getTransp().getTransporta().getCNPJ() != null) {
                    impressao.setTransportadorCnpjCpf(StringHelper.cnpjFormat((String)nfe.getNFe().getInfNFe().getTransp().getTransporta().getCNPJ()));
                } else if (nfe.getNFe().getInfNFe().getTransp().getTransporta().getCPF() != null) {
                    impressao.setTransportadorCnpjCpf(StringHelper.cpfFormat((String)nfe.getNFe().getInfNFe().getTransp().getTransporta().getCPF()));
                }
                if (nfe.getNFe().getInfNFe().getTransp().getTransporta().getUF() != null) {
                    impressao.setTransportadorUf(nfe.getNFe().getInfNFe().getTransp().getTransporta().getUF().toString());
                }
            }
            if (nfe.getNFe().getInfNFe().getTransp().getModFrete() != null) {
                impressao.setTransportadorFretePorConta(ModalidadeFreteEnum.getEnumPeloCodigo((String)nfe.getNFe().getInfNFe().getTransp().getModFrete().toString()).getDescricaoDanfe());
            }
            if (nfe.getNFe().getInfNFe().getTransp().getVeicTransp() != null) {
                impressao.setTransportadorCodigoAntt(nfe.getNFe().getInfNFe().getTransp().getVeicTransp().getRNTC());
                impressao.setTransportadorPlacaVeiculo(nfe.getNFe().getInfNFe().getTransp().getVeicTransp().getPlaca());
                impressao.setTransportadorUfVeiculo(nfe.getNFe().getInfNFe().getTransp().getVeicTransp().getUF().toString());
            }
            impressao.setMsgAutenticidade(DSENMessageConstants.MSG_CONSULTA_AUTENTICIDADE);
            if (SituacaoNFeEnum.AUTORIZADA.equals((Object)notaFiscal.getSituacao())) {
                if (TipoEmissaoEnum.NORMAL.getCodigo().equals(notaFiscal.getTipoEmissao().getCodigo()) || TipoEmissaoEnum.CONTINGENCIA_SCAN.getCodigo().equals(notaFiscal.getTipoEmissao().getCodigo()) || TipoEmissaoEnum.CONTINGENCIA_DPEC.getCodigo().equals(notaFiscal.getTipoEmissao().getCodigo()) || TipoEmissaoEnum.CONTINGENCIA_SVC_AN.getCodigo().equals(notaFiscal.getTipoEmissao().getCodigo()) || TipoEmissaoEnum.CONTINGENCIA_SVC_RS.getCodigo().equals(notaFiscal.getTipoEmissao().getCodigo())) {
                    impressao.setProtocoloDataAutorizacao(notaFiscal.getNumeroProtocolo() + " - " + DateHelper.formataDataHora((Date)notaFiscal.getDataProtocolo(), (SimpleDateFormat)DateHelper.SIMPLE_DATE_TIME_FORMAT));
                } else {
                    impressao.setProtocoloDataAutorizacao("");
                    String nroProtocolo = new String("N\u00famero do Protocolo: " + notaFiscal.getNumeroProtocolo() + "\n");
                    String dataProtocolo = new String("Data de Autoriza\u00e7\u00e3o: " + DateHelper.formataDataHora((Date)notaFiscal.getDataProtocolo(), (SimpleDateFormat)DateHelper.SIMPLE_DATE_TIME_FORMAT) + "\n");
                    impressao.setInformacoesComplementares(nroProtocolo + dataProtocolo);
                }
            } else {
                impressao.setMsgAutenticidade(DSENMessageConstants.MSG_CONSULTA_AUTENTICIDADE_DPEC);
                impressao.setNumeroRegistroDPEC(notaFiscal.getNumeroRegistroDPEC());
                String dataRegistroDPEC = DateHelper.formataDataHora((Date)notaFiscal.getDataRegistroDPEC(), (SimpleDateFormat)DateHelper.DATE_TIME_FORMAT);
                impressao.setDataRegistroDPEC(!StringHelper.isBlankOrNull((Object)dataRegistroDPEC) ? dataRegistroDPEC : "");
            }
            String justificativaConting = nfe.getNFe().getInfNFe().getIde().getXJust();
            String string = dataContingencia = nfe.getNFe().getInfNFe().getIde().getDhCont() != null ? DateHelper.formataDataHora((Date)DateHelper.getDateTime((String)nfe.getNFe().getInfNFe().getIde().getDhCont(), (SimpleDateFormat)DateHelper.DATE_TIME_XML_FORMAT310), (SimpleDateFormat)DateHelper.DATE_HOUR_MINUTE_FORMAT) : null;
            if (!StringHelper.isBlankOrNull((Object)justificativaConting) && !StringHelper.isBlankOrNull((Object)dataContingencia)) {
                impressao.setInformacoesComplementares((impressao.getInformacoesComplementares() != null ? impressao.getInformacoesComplementares() : "") + "Data e Hora de Entrada em Conting\u00eancia: " + dataContingencia + "\nJustificativa de Entrada em Conting\u00eancia: " + justificativaConting + "\n");
            }
            if (nfe.getNFe().getInfNFe().getTransp().getVolArray() != null) {
                String volumeEspecie = new String();
                String volumeMarca = new String();
                String volumeNumeracao = new String();
                BigDecimal volumeQuantidade = new BigDecimal(0);
                BigDecimal volumePesoBruto = new BigDecimal(0);
                BigDecimal volumePesoLiquido = new BigDecimal(0);
                String verInfComp = new String("VER INF. COMP.");
                StringBuffer infComp = new StringBuffer();
                boolean temVolume = nfe.getNFe().getInfNFe().getTransp().getVolArray().length > 0;
                for (int i = 0; i < nfe.getNFe().getInfNFe().getTransp().getVolArray().length; ++i) {
                    TNFe.InfNFe.Transp.Vol volume = nfe.getNFe().getInfNFe().getTransp().getVolArray(i);
                    volumeQuantidade = volumeQuantidade.add(new BigDecimal(volume.getQVol() != null ? volume.getQVol() : "0"));
                    volumePesoBruto = volumePesoBruto.add(new BigDecimal(volume.getPesoB() != null ? volume.getPesoB() : "0"));
                    volumePesoLiquido = volumePesoLiquido.add(new BigDecimal(volume.getPesoL() != null ? volume.getPesoL() : "0"));
                    volumeEspecie = volume.getEsp() != null ? volume.getEsp() : " ";
                    volumeMarca = volume.getMarca() != null ? volume.getMarca() : " ";
                    volumeNumeracao = volume.getNVol() != null ? volume.getNVol() : " ";
                    infComp.append("Esp.: " + volumeEspecie + "  Marca: " + volumeMarca + "  Num.: " + volumeNumeracao).append("\n");
                }
                impressao.setTransportadorQuantidade(temVolume ? StringHelper.formataValor((BigDecimal)volumeQuantidade, (int)0, (int)0) : "");
                impressao.setTransportadorPesoBruto(temVolume ? StringHelper.formataValor((BigDecimal)volumePesoBruto, (int)3, (int)3) : "");
                impressao.setTransportadorPesoLiquido(temVolume ? StringHelper.formataValor((BigDecimal)volumePesoLiquido, (int)3, (int)3) : "");
                impressao.setTransportadorEspecie(volumeEspecie);
                impressao.setTransportadorMarca(volumeMarca);
                impressao.setTransportadorNumeracao(volumeNumeracao);
                if (nfe.getNFe().getInfNFe().getTransp().getVolArray().length > 1) {
                    impressao.setTransportadorEspecie(verInfComp);
                    impressao.setTransportadorMarca(verInfComp);
                    impressao.setTransportadorNumeracao(verInfComp);
                    impressao.setInformacoesComplementares((impressao.getInformacoesComplementares() != null ? impressao.getInformacoesComplementares() : "") + infComp);
                }
            }
            if ((cobr = nfe.getNFe().getInfNFe().getCobr()) != null && (dupArray = cobr.getDupArray()) != null) {
                StringBuffer dupInf = new StringBuffer();
                for (TNFe.InfNFe.Cobr.Dup dup : dupArray) {
                    String numero = !StringHelper.isBlankOrNull((Object)dup.getNDup()) ? dup.getNDup() : DSENLabelConstants.ND;
                    String dataVenc = !StringHelper.isBlankOrNull((Object)dup.getDVenc()) ? DateHelper.formataData((Date)DateHelper.getDate((String)dup.getDVenc(), (SimpleDateFormat)DateHelper.DATE_XML_FORMAT)) : DSENLabelConstants.ND;
                    String valor = !StringHelper.isBlankOrNull((Object)dup.getVDup()) ? StringHelper.formataValor((String)dup.getVDup(), (int)2, (int)2) : DSENLabelConstants.ND;
                    dupInf.append(DSENLabelConstants.DUPLICATA + " - " + DSENLabelConstants.NUM + ": " + numero + ", " + DSENLabelConstants.VENC + ": " + dataVenc + ", " + DSENLabelConstants.VALOR + ": " + valor + "\n");
                }
                if (dupInf.length() > 0) {
                    impressao.setInformacoesComplementares((impressao.getInformacoesComplementares() != null ? impressao.getInformacoesComplementares() : "") + dupInf.toString());
                }
            }
            if ((nfrefArray = nfe.getNFe().getInfNFe().getIde().getNFrefArray()) != null) {
                StringBuffer nfrefInfCTE = new StringBuffer();
                StringBuffer nfrefInfNF = new StringBuffer();
                StringBuffer nfrefInfNFE = new StringBuffer();
                StringBuffer nfrefInfNFP = new StringBuffer();
                StringBuffer nfrefInfECF = new StringBuffer();
                for (TNFe.InfNFe.Ide.NFref nfref : nfrefArray) {
                    String cnpj;
                    String aamm;
                    String mod;
                    String cpf;
                    String num;
                    String serie;
                    if (!StringHelper.isBlankOrNull((Object)nfref.getRefCTe())) {
                        nfrefInfCTE.append(DSENLabelConstants.CTE_REFERENCIADO + " - " + ChaveAcessoUtil.formatarChaveAcesso4x4((String)nfref.getRefCTe()) + "\n");
                        continue;
                    }
                    if (nfref.getRefECF() != null) {
                        num = !StringHelper.isBlankOrNull((Object)nfref.getRefECF().getNECF()) ? nfref.getRefECF().getNECF() : DSENLabelConstants.ND;
                        String ncoo = !StringHelper.isBlankOrNull((Object)nfref.getRefECF().getNCOO()) ? nfref.getRefECF().getNCOO() : DSENLabelConstants.ND;
                        String modelo = nfref.getRefECF().getMod() != null ? ModeloECFEnum.getEnumPeloCodigo((String)nfref.getRefECF().getMod().toString()).getDescricao() : DSENLabelConstants.ND;
                        nfrefInfECF.append(DSENLabelConstants.CUPOM_FISCAL + " - " + DSENLabelConstants.MODELO + ": " + modelo + ", " + DSENLabelConstants.NUMERO_ECF + ": " + num + ", " + DSENLabelConstants.NUMERO_COO + ": " + ncoo + "\n");
                        continue;
                    }
                    if (nfref.getRefNF() != null) {
                        num = !StringHelper.isBlankOrNull((Object)nfref.getRefNF().getNNF()) ? nfref.getRefNF().getNNF() : DSENLabelConstants.ND;
                        mod = nfref.getRefNF().getMod() != null ? nfref.getRefNF().getMod().toString() : DSENLabelConstants.ND;
                        serie = !StringHelper.isBlankOrNull((Object)nfref.getRefNF().getSerie()) ? nfref.getRefNF().getSerie() : DSENLabelConstants.ND;
                        aamm = null;
                        if (!StringHelper.isBlankOrNull((Object)nfref.getRefNF().getAAMM()) && nfref.getRefNF().getAAMM().length() >= 2) {
                            aamm = nfref.getRefNF().getAAMM().substring(2, nfref.getRefNF().getAAMM().length());
                            aamm = aamm + "/" + nfref.getRefNF().getAAMM().substring(0, 2);
                        } else {
                            aamm = DSENLabelConstants.ND;
                        }
                        cnpj = !StringHelper.isBlankOrNull((Object)nfref.getRefNF().getCNPJ()) ? StringHelper.cnpjFormat((String)nfref.getRefNF().getCNPJ()) : DSENLabelConstants.ND;
                        String uf = !StringHelper.isBlankOrNull((Object)nfref.getRefNF().getCUF()) ? DSENUtilHelper.getInstance().getEstadoTO(nfref.getRefNF().getCUF().toString()).getSigla() : DSENLabelConstants.ND;
                        nfrefInfNF.append(DSENLabelConstants.NF_REFERENCIADA + " - " + DSENLabelConstants.MES_ANO + ": " + aamm + ", " + DSENLabelConstants.MODELO + ": " + mod + ", " + DSENLabelConstants.SERIE + ": " + serie + ", " + DSENLabelConstants.NUMERO + ": " + num + ", " + DSENLabelConstants.CNPJ + ": " + cnpj + ", " + DSENLabelConstants.UF + ": " + uf + "\n");
                        continue;
                    }
                    if (nfref.getRefNFe() != null) {
                        nfrefInfNFE.append(DSENLabelConstants.NFE_REFERENCIADA + " - " + ChaveAcessoUtil.formatarChaveAcesso4x4((String)nfref.getRefNFe()) + "\n");
                        continue;
                    }
                    if (nfref.getRefNFP() == null) continue;
                    num = !StringHelper.isBlankOrNull((Object)nfref.getRefNFP().getNNF()) ? nfref.getRefNFP().getNNF() : DSENLabelConstants.ND;
                    mod = nfref.getRefNFP().getMod() != null ? nfref.getRefNFP().getMod().toString() : DSENLabelConstants.ND;
                    serie = !StringHelper.isBlankOrNull((Object)nfref.getRefNFP().getSerie()) ? nfref.getRefNFP().getSerie() : DSENLabelConstants.ND;
                    aamm = null;
                    if (!StringHelper.isBlankOrNull((Object)nfref.getRefNFP().getAAMM()) && nfref.getRefNFP().getAAMM().length() >= 2) {
                        aamm = nfref.getRefNFP().getAAMM().substring(2, nfref.getRefNFP().getAAMM().length());
                        aamm = aamm + "/" + nfref.getRefNFP().getAAMM().substring(0, 2);
                    } else {
                        aamm = DSENLabelConstants.ND;
                    }
                    cnpj = !StringHelper.isBlankOrNull((Object)nfref.getRefNFP().getCNPJ()) ? StringHelper.cnpjFormat((String)nfref.getRefNFP().getCNPJ()) : null;
                    String string2 = cpf = !StringHelper.isBlankOrNull((Object)nfref.getRefNFP().getCPF()) ? StringHelper.cpfFormat((String)nfref.getRefNFP().getCPF()) : null;
                    String cpfCnpj = cnpj != null ? DSENLabelConstants.CNPJ + ": " + cnpj : (cpf != null ? DSENLabelConstants.CPF + ": " + cpf : DSENLabelConstants.ND);
                    String uf = !StringHelper.isBlankOrNull((Object)nfref.getRefNFP().getCUF()) ? DSENUtilHelper.getInstance().getEstadoTO(nfref.getRefNFP().getCUF().toString()).getSigla() : DSENLabelConstants.ND;
                    String ie = !StringHelper.isBlankOrNull((Object)nfref.getRefNFP().getIE()) ? nfref.getRefNFP().getIE() : DSENLabelConstants.ND;
                    nfrefInfNFP.append(DSENLabelConstants.NFP_REFERENCIADA + " - " + DSENLabelConstants.MES_ANO + ": " + aamm + ", " + DSENLabelConstants.MODELO + ": " + mod + ", " + DSENLabelConstants.SERIE + ": " + serie + ", " + DSENLabelConstants.NUMERO + ": " + num + ", " + cpfCnpj + ", " + DSENLabelConstants.IE + ": " + ie + ", " + DSENLabelConstants.UF + ": " + uf + "\n");
                }
                if (nfrefInfNFE.length() > 0) {
                    impressao.setInformacoesComplementares((impressao.getInformacoesComplementares() != null ? impressao.getInformacoesComplementares() : "") + nfrefInfNFE.toString());
                }
                if (nfrefInfNF.length() > 0) {
                    impressao.setInformacoesComplementares((impressao.getInformacoesComplementares() != null ? impressao.getInformacoesComplementares() : "") + nfrefInfNF.toString());
                }
                if (nfrefInfNFP.length() > 0) {
                    impressao.setInformacoesComplementares((impressao.getInformacoesComplementares() != null ? impressao.getInformacoesComplementares() : "") + nfrefInfNFP.toString());
                }
                if (nfrefInfCTE.length() > 0) {
                    impressao.setInformacoesComplementares((impressao.getInformacoesComplementares() != null ? impressao.getInformacoesComplementares() : "") + nfrefInfCTE.toString());
                }
                if (nfrefInfECF.length() > 0) {
                    impressao.setInformacoesComplementares((impressao.getInformacoesComplementares() != null ? impressao.getInformacoesComplementares() : "") + nfrefInfECF.toString());
                }
            }
            StringBuffer processosReferenciados = new StringBuffer();
            TNFe.InfNFe.InfAdic infAdic = nfe.getNFe().getInfNFe().getInfAdic();
            if (infAdic != null) {
                TNFe.InfNFe.InfAdic.ProcRef[] processoRefArray;
                for (TNFe.InfNFe.InfAdic.ProcRef procRef : processoRefArray = infAdic.getProcRefArray()) {
                    String identificador = !StringHelper.isBlankOrNull((Object)procRef.getNProc()) ? procRef.getNProc() : DSENLabelConstants.ND;
                    String origem = !StringHelper.isBlankOrNull((Object)procRef.getIndProc()) ? OrigemProcessoEnum.getEnumPeloCodigo((String)procRef.getIndProc().toString()).getDescricao() : DSENLabelConstants.ND;
                    processosReferenciados.append(DSENLabelConstants.PROCESSO_REFERENCIADO + " - " + DSENLabelConstants.IDENTIFICADOR + ": " + identificador + ", " + DSENLabelConstants.ORIGEM + ": " + origem + "\n");
                }
                if (processosReferenciados.length() > 0) {
                    impressao.setInformacoesComplementares((impressao.getInformacoesComplementares() != null ? impressao.getInformacoesComplementares() : "") + processosReferenciados.toString());
                }
            }
            TNFe.InfNFe.Det[] produtos = nfe.getNFe().getInfNFe().getDetArray();
            for (int i = 0; i < produtos.length; ++i) {
                ImpressaoDanfeItemTO prodImp = new ImpressaoDanfeItemTO();
                prodImp.setCodigo(produtos[i].getProd().getCProd());
                prodImp.setDescricao((produtos[i].getProd().getXProd() != null ? produtos[i].getProd().getXProd() : "") + (produtos[i].getInfAdProd() != null ? new StringBuilder().append("\n").append(produtos[i].getInfAdProd()).toString() : "") + (produtos[i].getImposto() != null && produtos[i].getImposto().getVTotTrib() != null ? new StringBuilder().append("\nTotal aproximado de tributos federais, estaduais e municipais: ").append(StringHelper.formataValor((String)produtos[i].getImposto().getVTotTrib(), (int)2, (int)2)).toString() : ""));
                prodImp.setNcm(produtos[i].getProd().getNCM());
                String cfop = DocumentoUtil.getCFOP((TNFe.InfNFe.Det.Prod)produtos[i].getProd(), (boolean)true);
                prodImp.setCfop(cfop != null ? cfop : "");
                prodImp.setUnidadeComercial(produtos[i].getProd().getUCom());
                prodImp.setUnidadeTributaria(produtos[i].getProd().getUTrib());
                prodImp.setQuantidadeComercial(StringHelper.formataValor((String)produtos[i].getProd().getQCom(), (int)4, (int)4));
                prodImp.setQuantidadeTributaria(StringHelper.formataValor((String)produtos[i].getProd().getQTrib(), (int)4, (int)4));
                prodImp.setValorUnitarioComercial(StringHelper.formataValor((String)produtos[i].getProd().getVUnCom(), (int)4, (int)4));
                prodImp.setValorUnitarioTributario(StringHelper.formataValor((String)produtos[i].getProd().getVUnTrib(), (int)4, (int)4));
                prodImp.setValorTotal(StringHelper.formataValor((String)produtos[i].getProd().getVProd(), (int)2, (int)2));
                if (produtos[i].getImposto().getICMS() != null) {
                    if (produtos[i].getImposto().getICMS().getICMS00() != null) {
                        prodImp.setCst(produtos[i].getImposto().getICMS().getICMS00().getOrig().toString() + produtos[i].getImposto().getICMS().getICMS00().getCST().toString());
                        prodImp.setBaseIcms(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS00().getVBC(), (int)2, (int)2));
                        prodImp.setValorIcms(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS00().getVICMS(), (int)2, (int)2));
                        prodImp.setAliquotaIcms(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS00().getPICMS(), (int)2, (int)2));
                    } else if (produtos[i].getImposto().getICMS().getICMS10() != null) {
                        prodImp.setCst(produtos[i].getImposto().getICMS().getICMS10().getOrig().toString() + produtos[i].getImposto().getICMS().getICMS10().getCST().toString());
                        prodImp.setBaseIcms(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS10().getVBC(), (int)2, (int)2));
                        prodImp.setValorIcms(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS10().getVICMS(), (int)2, (int)2));
                        prodImp.setBaseIcmsST(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS10().getVBCST(), (int)2, (int)2));
                        prodImp.setValorIcmsST(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS10().getVICMSST(), (int)2, (int)2));
                        prodImp.setAliquotaIcms(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS10().getPICMS(), (int)2, (int)2));
                    } else if (produtos[i].getImposto().getICMS().getICMS20() != null) {
                        prodImp.setCst(produtos[i].getImposto().getICMS().getICMS20().getOrig().toString() + produtos[i].getImposto().getICMS().getICMS20().getCST().toString());
                        prodImp.setBaseIcms(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS20().getVBC(), (int)2, (int)2));
                        prodImp.setValorIcms(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS20().getVICMS(), (int)2, (int)2));
                        prodImp.setAliquotaIcms(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS20().getPICMS(), (int)2, (int)2));
                    } else if (produtos[i].getImposto().getICMS().getICMS30() != null) {
                        prodImp.setCst(produtos[i].getImposto().getICMS().getICMS30().getOrig().toString() + produtos[i].getImposto().getICMS().getICMS30().getCST().toString());
                        prodImp.setBaseIcmsST(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS30().getVBCST(), (int)2, (int)2));
                        prodImp.setValorIcmsST(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS30().getVICMSST(), (int)2, (int)2));
                    } else if (produtos[i].getImposto().getICMS().getICMS40() != null) {
                        prodImp.setCst(produtos[i].getImposto().getICMS().getICMS40().getOrig().toString() + produtos[i].getImposto().getICMS().getICMS40().getCST().toString());
                    } else if (produtos[i].getImposto().getICMS().getICMS51() != null) {
                        prodImp.setCst(produtos[i].getImposto().getICMS().getICMS51().getOrig().toString() + produtos[i].getImposto().getICMS().getICMS51().getCST().toString());
                        prodImp.setBaseIcms(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS51().getVBC(), (int)2, (int)2));
                        prodImp.setValorIcms(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS51().getVICMS(), (int)2, (int)2));
                        prodImp.setAliquotaIcms(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS51().getPICMS(), (int)2, (int)2));
                    } else if (produtos[i].getImposto().getICMS().getICMS60() != null) {
                        prodImp.setCst(produtos[i].getImposto().getICMS().getICMS60().getOrig().toString() + produtos[i].getImposto().getICMS().getICMS60().getCST().toString());
                        prodImp.setBaseIcmsST(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS60().getVBCSTRet(), (int)2, (int)2));
                        prodImp.setValorIcmsST(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS60().getVICMSSTRet(), (int)2, (int)2));
                    } else if (produtos[i].getImposto().getICMS().getICMS70() != null) {
                        prodImp.setCst(produtos[i].getImposto().getICMS().getICMS70().getOrig().toString() + produtos[i].getImposto().getICMS().getICMS70().getCST().toString());
                        prodImp.setBaseIcms(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS70().getVBC(), (int)2, (int)2));
                        prodImp.setValorIcms(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS70().getVICMS(), (int)2, (int)2));
                        prodImp.setBaseIcmsST(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS70().getVBCST(), (int)2, (int)2));
                        prodImp.setValorIcmsST(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS70().getVICMSST(), (int)2, (int)2));
                        prodImp.setAliquotaIcms(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS70().getPICMS(), (int)2, (int)2));
                    } else if (produtos[i].getImposto().getICMS().getICMS90() != null) {
                        prodImp.setCst(produtos[i].getImposto().getICMS().getICMS90().getOrig().toString() + produtos[i].getImposto().getICMS().getICMS90().getCST().toString());
                        prodImp.setBaseIcms(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS90().getVBC(), (int)2, (int)2));
                        prodImp.setValorIcms(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS90().getVICMS(), (int)2, (int)2));
                        prodImp.setBaseIcmsST(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS90().getVBCST(), (int)2, (int)2));
                        prodImp.setValorIcmsST(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS90().getVICMSST(), (int)2, (int)2));
                        prodImp.setAliquotaIcms(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMS90().getPICMS(), (int)2, (int)2));
                    } else if (produtos[i].getImposto().getICMS().getICMSPart() != null) {
                        prodImp.setCst(produtos[i].getImposto().getICMS().getICMSPart().getOrig().toString() + produtos[i].getImposto().getICMS().getICMSPart().getCST().toString());
                        prodImp.setBaseIcms(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMSPart().getVBC(), (int)2, (int)2));
                        prodImp.setValorIcms(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMSPart().getVICMS(), (int)2, (int)2));
                        prodImp.setBaseIcmsST(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMSPart().getVBCST(), (int)2, (int)2));
                        prodImp.setValorIcmsST(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMSPart().getVICMSST(), (int)2, (int)2));
                        prodImp.setAliquotaIcms(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMSPart().getPICMS(), (int)2, (int)2));
                    } else if (produtos[i].getImposto().getICMS().getICMSSN101() != null) {
                        prodImp.setCst(produtos[i].getImposto().getICMS().getICMSSN101().getOrig().toString() + produtos[i].getImposto().getICMS().getICMSSN101().getCSOSN().toString());
                    } else if (produtos[i].getImposto().getICMS().getICMSSN102() != null) {
                        prodImp.setCst(produtos[i].getImposto().getICMS().getICMSSN102().getOrig().toString() + produtos[i].getImposto().getICMS().getICMSSN102().getCSOSN().toString());
                    } else if (produtos[i].getImposto().getICMS().getICMSSN201() != null) {
                        prodImp.setCst(produtos[i].getImposto().getICMS().getICMSSN201().getOrig().toString() + produtos[i].getImposto().getICMS().getICMSSN201().getCSOSN().toString());
                        prodImp.setBaseIcmsST(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMSSN201().getVBCST(), (int)2, (int)2));
                        prodImp.setValorIcmsST(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMSSN201().getVICMSST(), (int)2, (int)2));
                    } else if (produtos[i].getImposto().getICMS().getICMSSN202() != null) {
                        prodImp.setCst(produtos[i].getImposto().getICMS().getICMSSN202().getOrig().toString() + produtos[i].getImposto().getICMS().getICMSSN202().getCSOSN().toString());
                        prodImp.setBaseIcmsST(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMSSN202().getVBCST(), (int)2, (int)2));
                        prodImp.setValorIcmsST(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMSSN202().getVICMSST(), (int)2, (int)2));
                    } else if (produtos[i].getImposto().getICMS().getICMSSN500() != null) {
                        prodImp.setCst(produtos[i].getImposto().getICMS().getICMSSN500().getOrig().toString() + produtos[i].getImposto().getICMS().getICMSSN500().getCSOSN().toString());
                        prodImp.setBaseIcmsST(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMSSN500().getVBCSTRet(), (int)2, (int)2));
                        prodImp.setValorIcmsST(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMSSN500().getVICMSSTRet(), (int)2, (int)2));
                    } else if (produtos[i].getImposto().getICMS().getICMSSN900() != null) {
                        prodImp.setCst(produtos[i].getImposto().getICMS().getICMSSN900().getOrig().toString() + produtos[i].getImposto().getICMS().getICMSSN900().getCSOSN().toString());
                        prodImp.setBaseIcms(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMSSN900().getVBC(), (int)2, (int)2));
                        prodImp.setValorIcms(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMSSN900().getVICMS(), (int)2, (int)2));
                        prodImp.setBaseIcmsST(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMSSN900().getVBCST(), (int)2, (int)2));
                        prodImp.setValorIcmsST(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMSSN900().getVICMSST(), (int)2, (int)2));
                        prodImp.setAliquotaIcms(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMSSN900().getPICMS(), (int)2, (int)2));
                    } else if (produtos[i].getImposto().getICMS().getICMSST() != null) {
                        prodImp.setCst(produtos[i].getImposto().getICMS().getICMSST().getOrig().toString() + produtos[i].getImposto().getICMS().getICMSST().getCST().toString());
                        prodImp.setBaseIcmsST(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMSST().getVBCSTDest(), (int)2, (int)2));
                        prodImp.setValorIcmsST(StringHelper.formataValor((String)produtos[i].getImposto().getICMS().getICMSST().getVICMSSTDest(), (int)2, (int)2));
                    }
                }
                if (produtos[i].getImposto().getIPI() != null && produtos[i].getImposto().getIPI().getIPITrib() != null) {
                    prodImp.setValorIpi(StringHelper.formataValor((String)produtos[i].getImposto().getIPI().getIPITrib().getVIPI(), (int)2, (int)2));
                    prodImp.setAliquotaIpi(StringHelper.formataValor((String)produtos[i].getImposto().getIPI().getIPITrib().getPIPI(), (int)2, (int)2));
                }
                impressao.getImpressaoDanfeItemTOList().add(prodImp);
            }
            if (nfe.getNFe().getInfNFe().getInfAdic() != null) {
                impressao.setInformacoesComplementares((impressao.getInformacoesComplementares() != null ? impressao.getInformacoesComplementares() : "") + (nfe.getNFe().getInfNFe().getInfAdic().getInfCpl() != null ? nfe.getNFe().getInfNFe().getInfAdic().getInfCpl() : ""));
                impressao.setInformacoesComplementares((impressao.getInformacoesComplementares() != null ? impressao.getInformacoesComplementares() : "") + (nfe.getNFe().getInfNFe().getInfAdic().getInfAdFisco() != null ? new StringBuilder().append("\nInforma\u00e7\u00f5es Adicionais de Interesse do Fisco: ").append(nfe.getNFe().getInfNFe().getInfAdic().getInfAdFisco()).toString() : ""));
                if (nfe.getNFe().getInfNFe().getTotal().getICMSTot().getVTotTrib() != null && !nfe.getNFe().getInfNFe().getTotal().getICMSTot().getVTotTrib().equals("0.00")) {
                    impressao.setInformacoesComplementares((impressao.getInformacoesComplementares() != null ? impressao.getInformacoesComplementares() : "") + (nfe.getNFe().getInfNFe().getTotal().getICMSTot().getVTotTrib() != null ? new StringBuilder().append("\nTotal aproximado de tributos federais, estaduais e municipais: ").append(StringHelper.formataValor((String)nfe.getNFe().getInfNFe().getTotal().getICMSTot().getVTotTrib(), (int)2, (int)2)).toString() : ""));
                }
            } else if (nfe.getNFe().getInfNFe().getTotal().getICMSTot().getVTotTrib() != null && !nfe.getNFe().getInfNFe().getTotal().getICMSTot().getVTotTrib().equals("0.00")) {
                impressao.setInformacoesComplementares((impressao.getInformacoesComplementares() != null ? impressao.getInformacoesComplementares() : "") + (nfe.getNFe().getInfNFe().getTotal().getICMSTot().getVTotTrib() != null ? new StringBuilder().append("\nTotal aproximado de tributos federais, estaduais e municipais: ").append(StringHelper.formataValor((String)nfe.getNFe().getInfNFe().getTotal().getICMSTot().getVTotTrib(), (int)2, (int)2)).toString() : ""));
            }
            this.a = impressao.getOrientacaoLayoutDanfe() == Integer.parseInt(TipoImpressaoEnum.RETRATO.getCodigo()) ? (TipoPapelImpressaoEnum.OFICIO2.equals((Object)tipoPapel) ? 71 : 60) : (TipoPapelImpressaoEnum.OFICIO2.equals((Object)tipoPapel) ? 95 : 80);
            StringBuffer saida = new StringBuffer();
            if (!StringHelper.isBlankOrNull((Object)impressao.getInformacoesComplementares())) {
                saida = this.a(new StringBuffer(impressao.getInformacoesComplementares()));
            }
            StringBuffer saida1 = (bIndex = this.a()) < saida.length() ? new StringBuffer(saida.substring(0, bIndex)) : saida;
            StringBuffer saida2 = bIndex >= saida.length() ? new StringBuffer("") : new StringBuffer(saida.substring(bIndex, saida.length()));
            impressao.setInformacoesComplementares(saida1.toString());
            impressao.setInformacoesComplementares2(saida2.toString());
            if (nfe.getNFe().getInfNFe().getTotal().getISSQNtot() != null) {
                impressao.setValorTotalServicos(StringHelper.formataValor((String)nfe.getNFe().getInfNFe().getTotal().getISSQNtot().getVServ(), (int)2, (int)2));
                impressao.setBaseIssqn(StringHelper.formataValor((String)nfe.getNFe().getInfNFe().getTotal().getISSQNtot().getVBC(), (int)2, (int)2));
                impressao.setValorIssqn(StringHelper.formataValor((String)nfe.getNFe().getInfNFe().getTotal().getISSQNtot().getVISS(), (int)2, (int)2));
            }
            boolean temDestaqueIcmsProprio = false;
            boolean temDestaqueIcmsST = false;
            for (TNFe.InfNFe.Det det : nfe.getNFe().getInfNFe().getDetArray()) {
                if (det.getImposto() != null && det.getImposto().getICMS() != null) {
                    if (det.getImposto().getICMS().getICMS00() != null || det.getImposto().getICMS().getICMS10() != null || det.getImposto().getICMS().getICMS20() != null || det.getImposto().getICMS().getICMS51() != null || det.getImposto().getICMS().getICMS70() != null || det.getImposto().getICMS().getICMS90() != null || det.getImposto().getICMS().getICMSPart() != null || det.getImposto().getICMS().getICMSSN900() != null) {
                        temDestaqueIcmsProprio = true;
                    }
                    if (det.getImposto().getICMS().getICMS60() != null || det.getImposto().getICMS().getICMS10() != null || det.getImposto().getICMS().getICMS30() != null || det.getImposto().getICMS().getICMS70() != null || det.getImposto().getICMS().getICMS90() != null || det.getImposto().getICMS().getICMSPart() != null || det.getImposto().getICMS().getICMSSN201() != null || det.getImposto().getICMS().getICMSSN202() != null || det.getImposto().getICMS().getICMSSN500() != null || det.getImposto().getICMS().getICMSSN900() != null || det.getImposto().getICMS().getICMSST() != null) {
                        temDestaqueIcmsST = true;
                    }
                }
                if (temDestaqueIcmsProprio && temDestaqueIcmsST) break;
            }
            impressao.setDestaqueIcmsProprio(temDestaqueIcmsProprio ? "1" : "2");
            impressao.setDestaqueIcmsSt(temDestaqueIcmsST ? "1" : "2");
            if (nfe.getNFe().getInfNFe().getDest().getEnderDest().getUF().toString().equals("EX")) {
                impressao.setDestinatarioCnpjCpf("00000000000000");
                impressao.setDestinatarioCodigoUf("99");
            }
            if (impressao.getCodigoTipoEmissao().equals(TipoEmissaoEnum.CONTINGENCIA.getCodigo()) || impressao.getCodigoTipoEmissao().equals(TipoEmissaoEnum.CONTINGENCIA_FS_DA.getCodigo())) {
                impressao.setCodigoBarrasContingencia(this.a(impressao.getDadosNfeCodigoBarras()));
            }
        }
        catch (Exception e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        this.a.debug((Object)"(DanfeBusiness.getImpressaoDanfeTOByNotaFiscalTO) Fim");
        return impressao;
    }

    private int a() {
        return this.a * this.b;
    }

    private void a(StringBuffer s, int qtde) {
        while (qtde > 0) {
            s.append(' ');
            --qtde;
        }
    }

    private StringBuffer a(StringBuffer str2) {
        StringBuffer out = new StringBuffer();
        int length = str2.length();
        int currentLineLength = 0;
        int maxLength = this.a();
        for (int i = 0; i < length; ++i) {
            char c = str2.charAt(i);
            if (out.length() >= maxLength) {
                out.append(str2.substring(i, str2.length()));
                break;
            }
            if (c == '\n') {
                this.a(out, this.a - currentLineLength - 1);
                currentLineLength = 0;
            } else {
                ++currentLineLength;
            }
            out.append(c);
            if (currentLineLength != this.a - 1 || i >= length - 1 || str2.charAt(i + 1) == '\n') continue;
            out.append('\n');
            currentLineLength = 0;
        }
        return out;
    }

    private Image a(String numero) throws DSENBusinessException {
        this.a.debug((Object)"(DanfeBusiness.getCodigoBarras) Inicio");
        this.a.debug((Object)("(DanfeBusiness.getCodigoBarras) N\u00famero: " + numero));
        Code128Barcode barcode = null;
        BufferedImage image = null;
        try {
            EnvironmentFactory.setHeadlessMode();
            barcode = new Code128Barcode(numero, 2);
            barcode.setResolution(35);
            barcode.setBarWidth(10);
            barcode.setBarHeight(310);
            barcode.setDrawingText(false);
            image = BarcodeImageHandler.getImage((Barcode)barcode);
        }
        catch (BarcodeException e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        catch (OutputException e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        this.a.debug((Object)"(DanfeBusiness.getCodigoBarras) Fim");
        return image;
    }
}

