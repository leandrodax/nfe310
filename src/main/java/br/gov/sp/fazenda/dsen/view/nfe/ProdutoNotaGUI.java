/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.COFINSEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.CSOSNEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.CSTEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.CondicaoVeiculoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExigibilidadeISSEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.IPIEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.IndIncentivoFiscalEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ModBCEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ModBcstEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.MotivoDesoneracaoICMSEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.OrigemMercadoriaEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.PISEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ProdutoEspecificoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.RegimeTributarioEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.RestricaoVeiculoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoCalculoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoImportacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoOperacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoTributacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoViaTransporteEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TributacaoISSQNEnum
 *  br.gov.sp.fazenda.dsen.common.to.AdicaoTO
 *  br.gov.sp.fazenda.dsen.common.to.ArmaTO
 *  br.gov.sp.fazenda.dsen.common.to.DITO
 *  br.gov.sp.fazenda.dsen.common.to.IcmsTO
 *  br.gov.sp.fazenda.dsen.common.to.IpiTO
 *  br.gov.sp.fazenda.dsen.common.to.MedicamentoNotaTO
 *  br.gov.sp.fazenda.dsen.common.to.NVETO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoExportacaoTO
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoNotaTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCListServ
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCListServ$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCfop
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCfop$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TIpi
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TIpi$IPINT
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TIpi$IPINT$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TIpi$IPINT$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TIpi$IPITrib
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TIpi$IPITrib$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TIpi$IPITrib$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$COFINS
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$COFINS$COFINSAliq
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$COFINS$COFINSAliq$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$COFINS$COFINSAliq$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$COFINS$COFINSNT
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$COFINS$COFINSNT$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$COFINS$COFINSNT$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$COFINS$COFINSOutr
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$COFINS$COFINSOutr$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$COFINS$COFINSOutr$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$COFINS$COFINSQtde
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$COFINS$COFINSQtde$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$COFINS$COFINSQtde$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$COFINSST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS00
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS00$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS00$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS00$ModBC
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS00$ModBC$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS10
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS10$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS10$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS10$ModBC
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS10$ModBC$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS10$ModBCST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS10$ModBCST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS20
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS20$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS20$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS20$ModBC
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS20$ModBC$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS20$MotDesICMS
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS20$MotDesICMS$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS30
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS30$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS30$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS30$ModBCST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS30$ModBCST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS30$MotDesICMS
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS30$MotDesICMS$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS40
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS40$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS40$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS40$MotDesICMS
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS40$MotDesICMS$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS51
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS51$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS51$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS51$ModBC
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS51$ModBC$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS60
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS60$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS60$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS70
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS70$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS70$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS70$ModBC
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS70$ModBC$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS70$ModBCST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS70$ModBCST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS70$MotDesICMS
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS70$MotDesICMS$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS90
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS90$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS90$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS90$ModBC
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS90$ModBC$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS90$ModBCST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS90$ModBCST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS90$MotDesICMS
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMS90$MotDesICMS$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSPart
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSPart$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSPart$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSPart$ModBC
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSPart$ModBC$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSPart$ModBCST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSPart$ModBCST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN101
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN101$CSOSN
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN101$CSOSN$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN102
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN102$CSOSN
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN102$CSOSN$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN201
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN201$CSOSN
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN201$CSOSN$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN201$ModBCST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN201$ModBCST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN202
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN202$CSOSN
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN202$CSOSN$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN202$ModBCST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN202$ModBCST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN500
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN500$CSOSN
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN500$CSOSN$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN900
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN900$CSOSN
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN900$CSOSN$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN900$ModBC
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN900$ModBC$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN900$ModBCST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSSN900$ModBCST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSST$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ICMS$ICMSST$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$II
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ISSQN
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ISSQN$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ISSQN$IndISS
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ISSQN$IndISS$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ISSQN$IndIncentivo
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$ISSQN$IndIncentivo$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$PIS
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$PIS$PISAliq
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$PIS$PISAliq$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$PIS$PISAliq$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$PIS$PISNT
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$PIS$PISNT$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$PIS$PISNT$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$PIS$PISOutr
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$PIS$PISOutr$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$PIS$PISOutr$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$PIS$PISQtde
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$PIS$PISQtde$CST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$PIS$PISQtde$CST$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto$PISST
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$ImpostoDevol
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$ImpostoDevol$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$ImpostoDevol$IPI
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$Arma
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$Arma$TpArma
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$Arma$TpArma$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$Comb
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$Comb$CIDE
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$DI
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$DI$Adi
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$DI$TpIntermedio
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$DI$TpIntermedio$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$DI$TpViaTransp
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$DI$TpViaTransp$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$DetExport
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$DetExport$ExportInd
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$IndTot
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$IndTot$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$Med
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$NVE
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$VeicProd
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$VeicProd$CondVeic
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$VeicProd$CondVeic$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$VeicProd$TpOp
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$VeicProd$TpOp$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$VeicProd$TpRest
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$VeicProd$TpRest$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$VeicProd$VIN
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$VeicProd$VIN$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUf
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUf$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUfEmi
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUfEmi$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TcProdANP
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TcProdANP$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.Torig
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.Torig$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.Tpais
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.Tpais$Enum
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI$1
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI$2
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI$3
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI$4
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI$5
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI$6
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.util.CfopTO
 *  br.gov.sp.fazenda.dsge.util.CorDenatranTO
 *  br.gov.sp.fazenda.dsge.util.EspecieVeiculoTO
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.MunicipioTO
 *  br.gov.sp.fazenda.dsge.util.PaisTO
 *  br.gov.sp.fazenda.dsge.util.ServicoTO
 *  br.gov.sp.fazenda.dsge.util.TipoCombustivelTO
 *  br.gov.sp.fazenda.dsge.util.TipoVeiculoTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.DSGETabbedPane
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.CNPJFormatter
 *  br.gov.sp.fazenda.dsge.view.format.DateFormatter
 *  br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.format.NumberFormatterHelper
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 *  br.gov.sp.fazenda.dsge.view.table.model.DSGETableModel
 *  org.apache.commons.beanutils.PropertyUtils
 *  org.apache.xmlbeans.XmlException
 *  org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException
 */
package br.gov.sp.fazenda.dsen.view.nfe;

import br.gov.sp.fazenda.dsen.common.enumeration.COFINSEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.CSOSNEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.CSTEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.CondicaoVeiculoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ExigibilidadeISSEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.IPIEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.IndIncentivoFiscalEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ModBCEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ModBcstEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.MotivoDesoneracaoICMSEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.OrigemMercadoriaEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.PISEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ProdutoEspecificoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.RegimeTributarioEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.RestricaoVeiculoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoCalculoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoImportacaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoOperacaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoTributacaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoViaTransporteEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TributacaoISSQNEnum;
import br.gov.sp.fazenda.dsen.common.to.AdicaoTO;
import br.gov.sp.fazenda.dsen.common.to.ArmaTO;
import br.gov.sp.fazenda.dsen.common.to.DITO;
import br.gov.sp.fazenda.dsen.common.to.IcmsTO;
import br.gov.sp.fazenda.dsen.common.to.IpiTO;
import br.gov.sp.fazenda.dsen.common.to.MedicamentoNotaTO;
import br.gov.sp.fazenda.dsen.common.to.NVETO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.ProdutoExportacaoTO;
import br.gov.sp.fazenda.dsen.common.to.ProdutoNotaTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCListServ;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCfop;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TIpi;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUf;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUfEmi;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TcProdANP;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.Torig;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.Tpais;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.util.CfopTO;
import br.gov.sp.fazenda.dsge.util.CorDenatranTO;
import br.gov.sp.fazenda.dsge.util.EspecieVeiculoTO;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.MunicipioTO;
import br.gov.sp.fazenda.dsge.util.PaisTO;
import br.gov.sp.fazenda.dsge.util.ServicoTO;
import br.gov.sp.fazenda.dsge.util.TipoCombustivelTO;
import br.gov.sp.fazenda.dsge.util.TipoVeiculoTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.DSGETabbedPane;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.CNPJFormatter;
import br.gov.sp.fazenda.dsge.view.format.DateFormatter;
import br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter;
import br.gov.sp.fazenda.dsge.view.format.NumberFormatterHelper;
import br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import br.gov.sp.fazenda.dsge.view.table.JDSGETable;
import br.gov.sp.fazenda.dsge.view.table.model.DSGETableModel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxEditor;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DefaultFormatter;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import javax.swing.text.NumberFormatter;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException;

public class ProdutoNotaGUI
extends DSGEDialog
implements FocusListener,
ItemListener,
KeyListener {
    private static final long a = -614800427592765293L;
    public static final int ABA_BASICO = 0;
    public static final int ABA_DI = 3;
    public static final int ABA_VEIC = 5;
    public static final int ABA_MEDIC = 6;
    public static final int ABA_ARMA = 7;
    public static final int ABA_TRIBUTO = 1;
    public static final int ABA_INFO = 2;
    public static final int ABA_COMB = 8;
    public static final int ABA_PAPEL = 9;
    public static final int ABA_EXPORT = 4;
    public static final int ABA_TRIB_ICMS = 0;
    public static final int ABA_TRIB_IPI = 1;
    public static final int ABA_TRIB_PIS = 2;
    public static final int ABA_TRIB_COFINS = 3;
    public static final int ABA_TRIB_II = 4;
    public static final int ABA_TRIB_ISSQN = 5;
    public static final int ABA_TRIB_IPI_DEVOL = 6;
    RegimeTributarioEnum a;
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
    private ButtonGroup a;
    private JCheckBox a;
    private JCheckBox b;
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
    private JComboBox D;
    private JComboBox E;
    private JComboBox F;
    private JComboBox G;
    private JComboBox H;
    private JComboBox I;
    private JComboBox J;
    private JComboBox K;
    private JComboBox L;
    private JComboBox M;
    private JComboBox N;
    private JLabel a;
    private JLabel b;
    private JPanel a;
    private JPanel b;
    private JPanel c;
    private JPanel d;
    private JPanel e;
    private JPanel f;
    private JPanel g;
    private JPanel h;
    private JScrollPane a;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JLabel f;
    private JLabel g;
    private JLabel h;
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
    private JLabel bR;
    private JLabel bS;
    private JLabel bT;
    private JLabel bU;
    private JLabel bV;
    private JLabel bW;
    private JLabel bX;
    private JLabel bY;
    private JLabel bZ;
    private JLabel ca;
    private JLabel cb;
    private JLabel cc;
    private JLabel cd;
    private JLabel ce;
    private JLabel cf;
    private JLabel cg;
    private JLabel ch;
    private JLabel ci;
    private JLabel cj;
    private JLabel ck;
    private JLabel cl;
    private JLabel cm;
    private JScrollPane b;
    private JPanel i;
    private JPanel j;
    private JPanel k;
    private JPanel l;
    private JPanel m;
    private JPanel n;
    private JPanel o;
    private JPanel p;
    private JPanel q;
    private JPanel r;
    private JScrollPane c;
    private JPanel s;
    private JPanel t;
    private JPanel u;
    private JPanel v;
    private JPanel w;
    private JPanel x;
    private JScrollPane d;
    private JPanel y;
    private JScrollPane e;
    private JPanel z;
    private JPanel A;
    private JPanel B;
    private JPanel C;
    private JPanel D;
    private JScrollPane f;
    private JPanel E;
    private JPanel F;
    private JPanel G;
    private JPanel H;
    private JPanel I;
    private JPanel J;
    private JPanel K;
    private JPanel L;
    private JRadioButton a;
    private JRadioButton b;
    private JScrollPane g;
    private JTabbedPane a;
    private JTabbedPane b;
    private JTextArea a;
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
    private JFormattedTextField J;
    private JFormattedTextField K;
    private JFormattedTextField L;
    private JFormattedTextField M;
    private JFormattedTextField N;
    private JFormattedTextField O;
    private JFormattedTextField P;
    private JFormattedTextField Q;
    private JFormattedTextField R;
    private JFormattedTextField S;
    private JFormattedTextField T;
    private JFormattedTextField U;
    private JFormattedTextField V;
    private JFormattedTextField W;
    private JFormattedTextField X;
    private JFormattedTextField Y;
    private JFormattedTextField Z;
    private JFormattedTextField aa;
    private JFormattedTextField ab;
    private JFormattedTextField ac;
    private JFormattedTextField ad;
    private JFormattedTextField ae;
    private JFormattedTextField af;
    private JFormattedTextField ag;
    private JFormattedTextField ah;
    private JFormattedTextField ai;
    private JFormattedTextField aj;
    private JFormattedTextField ak;
    private JFormattedTextField al;
    private JFormattedTextField am;
    private JFormattedTextField an;
    private JFormattedTextField ao;
    private JFormattedTextField ap;
    private JFormattedTextField aq;
    private JFormattedTextField ar;
    private JFormattedTextField as;
    private JFormattedTextField at;
    private JFormattedTextField au;
    private JFormattedTextField av;
    private JFormattedTextField aw;
    private JFormattedTextField ax;
    private JFormattedTextField ay;
    private JFormattedTextField az;
    private JFormattedTextField aA;
    private JFormattedTextField aB;
    private JFormattedTextField aC;
    private JFormattedTextField aD;
    private JFormattedTextField aE;
    private JFormattedTextField aF;
    private JFormattedTextField aG;
    private JFormattedTextField aH;
    private JFormattedTextField aI;
    private JFormattedTextField aJ;
    private JFormattedTextField aK;
    private JFormattedTextField aL;
    private JFormattedTextField aM;
    private JFormattedTextField aN;
    private JTextField a;
    private JTextField b;
    private JTextField c;
    private JTextField d;
    private JTextField e;
    private JTextField f;
    private JTextField g;
    private JTextField h;
    private JTextField i;
    private JTextField j;
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
    private JFormattedTextField aO;
    private JTextField u;
    private JTextField v;
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
    private JDSGEPageableTable<DITO> a;
    private JDSGEPageableTable<MedicamentoNotaTO> b;
    private JDSGEPageableTable<ArmaTO> c;
    private JDSGEPageableTable<ProdutoExportacaoTO> d;
    private JDSGEPageableTable<NVETO> e;
    private ProdutoNotaTO a;
    private NotaFiscalTO a;
    private String a;
    private String b;
    private Map<String, JComponent[]> a;
    private CNPJFormatter a;
    private DateFormatter a;
    private DateFormatter b;
    private DateFormatter c;
    private DateFormatter d;

    public ProdutoNotaGUI(String operacao, String operacaoNota, RegimeTributarioEnum regimeTributarioEmitente) throws DSGEViewException {
        super((Window)DSENDesktop.getInstance(), true);
        this.a = operacao;
        this.b = operacaoNota;
        this.a = regimeTributarioEmitente;
        this.b();
        this.m();
        this.e();
        this.a(true);
        this.a();
        this.d();
        this.c();
        this.k();
        this.bindController((ViewItf)this);
        this.E.setVisible(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(new Dimension(screenSize.width - 10, screenSize.height - 60));
        this.D.setPreferredSize(new Dimension(this.D.getPreferredSize().width, screenSize.height - 150));
        this.a.setPreferredSize(new Dimension(screenSize.width - 30, screenSize.height - 150));
        this.b.setPreferredSize(new Dimension(screenSize.width - 100, screenSize.height - 250));
        this.c.setPreferredSize(new Dimension(screenSize.width - 100, 250));
        this.D.setSize(new Dimension(this.D.getPreferredSize().width, screenSize.height - 150));
        this.a.setSize(new Dimension(screenSize.width - 30, screenSize.height - 150));
        this.b.setSize(new Dimension(screenSize.width - 100, screenSize.height - 250));
        this.bK.setVisible(false);
        this.at.setVisible(false);
        this.bB.setVisible(false);
        this.ap.setVisible(false);
        this.k.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    private void a() {
        this.v.addFocusListener((FocusListener)this);
        this.i.addKeyListener((KeyListener)this);
        this.j.addItemListener((ItemListener)this);
        this.f.addItemListener((ItemListener)this);
        this.a.addItemListener((ItemListener)this);
        this.b.addItemListener((ItemListener)this);
        this.n.addItemListener((ItemListener)this);
        this.aB.addFocusListener((FocusListener)this);
        this.aE.addFocusListener((FocusListener)this);
        this.ap.addFocusListener((FocusListener)this);
        this.az.addFocusListener((FocusListener)this);
        this.at.addFocusListener((FocusListener)this);
        this.aA.addFocusListener((FocusListener)this);
        this.au.addFocusListener((FocusListener)this);
        this.aJ.addFocusListener((FocusListener)this);
        this.I.addFocusListener((FocusListener)this);
        this.M.addFocusListener((FocusListener)this);
        this.ai.addFocusListener((FocusListener)this);
        this.aj.addFocusListener((FocusListener)this);
        this.ae.addFocusListener((FocusListener)this);
        this.ah.addFocusListener((FocusListener)this);
        this.af.addFocusListener((FocusListener)this);
        this.al.addFocusListener((FocusListener)this);
        this.ag.addFocusListener((FocusListener)this);
        this.am.addFocusListener((FocusListener)this);
        this.B.addFocusListener((FocusListener)this);
        this.D.addFocusListener((FocusListener)this);
        this.ab.addFocusListener((FocusListener)this);
        this.ad.addFocusListener((FocusListener)this);
    }

    private void a(boolean b) {
        this.E.setEditable(b);
        this.e.setEditable(b);
        this.i.setEditable(b);
        this.G.setEditable(b);
    }

    private void b() {
        try {
            this.a = new CNPJFormatter();
            this.a = new DateFormatter();
            this.b = new DateFormatter();
            this.c = new DateFormatter();
            this.d = new DateFormatter();
        }
        catch (ParseException parseException) {
            // empty catch block
        }
    }

    private void c() {
        this.j.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    public void fechar() {
        this.setVisible(false);
        this.dispose();
    }

    private void d() {
        this.a = new HashMap();
        this.a.put("produtoNotaInicioDesabilitado", new JComponent[]{this.d, this.e, this.n, this.o, this.k, this.l, this.a, this.b});
        this.a.put("manterNotaEdicao", new JComponent[]{this.q, this.h, this.F, this.r, this.d, this.u, this.n, this.a, this.C, this.Y, this.b, this.D, this.A, this.y, this.x, this.Z, this.c, this.e, this.aL, this.aN, this.aM, this.b, this.aK, this.a, this.y, this.a, this.b, this.j, this.H, this.L, this.A, this.C, this.ar, this.aq, this.ap, this.at, this.au, this.I, this.N, this.az, this.aA, this.aJ, this.M, this.aH, this.aI, this.J, this.aB, this.aE, this.aC, this.aF, this.aD, this.aG, this.B, this.af, this.ac, this.ae, this.ag, this.D, this.ak, this.aa, this.al, this.ah, this.am, this.ad, this.ab, this.ai, this.aj, this.k, this.q, this.o, this.v, this.p, this.r, this.v, this.b, this.s, this.E, this.J, this.D, this.m, this.t, this.o, this.r, this.p, this.q, this.G, this.L, this.I, this.H, this.K, this.F, this.n, this.C, this.u, this.r, this.s, this.u, this.t, this.a, this.f, this.p, this.g, this.h, this.i, this.F, this.e, this.z, this.t, this.i, this.v, this.w, this.g, this.B, this.f, this.X, this.W, this.E, this.m, this.aO, this.b, this.a, this.G, this.i, this.ao, this.c, this.E, this.a, this.h, this.k, this.f, this.j, this.p, this.n, this.q, this.g, this.an, this.z, this.w, this.x, this.av, this.aw, this.K, this.ay, this.as, this.ax});
        this.a.put("manterNotaTodos", new JComponent[]{this.q, this.h, this.F, this.r, this.d, this.u, this.n, this.a, this.C, this.Y, this.b, this.D, this.A, this.y, this.x, this.Z, this.c, this.e, this.aL, this.aN, this.aM, this.b, this.aK, this.a, this.y, this.a, this.b, this.j, this.H, this.L, this.A, this.C, this.ar, this.aq, this.ap, this.at, this.au, this.I, this.N, this.az, this.aA, this.aJ, this.M, this.aH, this.aI, this.J, this.aB, this.aE, this.aC, this.aF, this.aD, this.aG, this.B, this.af, this.ac, this.ae, this.ag, this.D, this.ak, this.aa, this.al, this.ah, this.am, this.ad, this.ab, this.ai, this.aj, this.k, this.q, this.o, this.v, this.p, this.r, this.l, this.z, this.y, this.s, this.B, this.v, this.x, this.R, this.M, this.N, this.T, this.O, this.Q, this.P, this.U, this.b, this.d, this.l, this.d, this.k, this.e, this.i, this.f, this.h, this.g, this.s, this.E, this.J, this.D, this.m, this.t, this.o, this.r, this.p, this.q, this.G, this.L, this.I, this.H, this.K, this.F, this.n, this.C, this.u, this.r, this.s, this.u, this.t, this.a, this.f, this.p, this.g, this.h, this.i, this.F, this.e, this.z, this.t, this.i, this.v, this.w, this.g, this.B, this.f, this.X, this.W, this.E, this.m, this.aO, this.b, this.a, this.G, this.i, this.ao, this.c, this.E, this.a, this.h, this.k, this.f, this.j, this.p, this.o, this.n, this.q, this.g, this.an, this.z, this.w, this.x, this.av, this.aw, this.K, this.ay, this.as, this.ax});
        this.a.put("produtoNotaUmaDISelecionada", new JComponent[]{this.d, this.e});
        this.a.put("produtoNotaDetalheUmaDISelecionada", new JComponent[]{this.d});
        this.a.put("produtoNotaVariasDISelecionadas", new JComponent[]{this.e});
        this.a.put("produtoNotaUmaNVESelecionada", new JComponent[]{this.n, this.o});
        this.a.put("produtoNotaDetalheUmaNVESelecionada", new JComponent[]{this.n});
        this.a.put("produtoNotaVariasNVESelecionadas", new JComponent[]{this.o});
        this.a.put("produtoNotaUmaExportSelecionada", new JComponent[]{this.g, this.h});
        this.a.put("produtoNotaDetalheUmaExportSelecionada", new JComponent[]{this.g});
        this.a.put("produtoNotaVariasExportSelecionadas", new JComponent[]{this.h});
        this.a.put("produtoNotaUmMedicSelecionado", new JComponent[]{this.k, this.l});
        this.a.put("produtoNotaVariosMedicSelecionados", new JComponent[]{this.l});
        this.a.put("produtoNotaUmArmamentoSelecionado", new JComponent[]{this.a, this.b});
        this.a.put("produtoNotaVariosArmamentosSelecionados", new JComponent[]{this.b});
        this.a.put("produtoNotaTributoICMSTodos", new JComponent[]{this.H, this.I, this.bC, this.bI, this.bH, this.bB, this.bK, this.bL, this.bE, this.ar, this.aq, this.ap, this.at, this.au, this.I, this.cd, this.bS, this.bT, this.ce, this.ca, this.cb, this.cc, this.N, this.az, this.aA, this.aJ, this.M, this.aH, this.aI, this.bF, this.bU, this.bX, this.J, this.aB, this.aE, this.bV, this.bY, this.bW, this.bZ, this.aC, this.aF, this.aD, this.aG, this.F, this.G, this.aD, this.bl, this.bm, this.bh, this.bk, this.bn, this.B, this.af, this.ac, this.ae, this.ag, this.bs, this.bt, this.bf, this.bu, this.bp, this.bv, this.bj, this.bg, this.D, this.ak, this.aa, this.al, this.ah, this.am, this.ad, this.ab, this.bq, this.br, this.ai, this.aj, this.bN, this.av, this.bO, this.aw, this.K, this.bG, this.bQ, this.ay, this.bJ, this.as, this.bP, this.ax});
        this.a.put("PRODUTO_NOTA_ICMS_TRIB_NORMAL_TODOS", new JComponent[]{this.H, this.I, this.bC, this.bI, this.bH, this.bB, this.bK, this.bL, this.bE, this.ar, this.aq, this.ap, this.at, this.au, this.I, this.cd, this.bS, this.bT, this.ce, this.ca, this.cb, this.cc, this.N, this.az, this.aA, this.aJ, this.M, this.aH, this.aI, this.bF, this.bU, this.bX, this.J, this.aB, this.aE, this.bV, this.bY, this.bW, this.bZ, this.aC, this.aF, this.aD, this.aG, this.bN, this.av, this.bO, this.aw, this.K, this.bG, this.bQ, this.ay, this.bJ, this.as, this.bP, this.ax});
        this.a.put("PRODUTO_NOTA_ICMS_SIMPLES_NACIONAL_TODOS", new JComponent[]{this.F, this.G, this.aD, this.bl, this.bm, this.bh, this.bk, this.bn, this.B, this.af, this.ac, this.ae, this.ag, this.bs, this.bt, this.bf, this.bu, this.bp, this.bv, this.bj, this.bg, this.D, this.ak, this.aa, this.al, this.ah, this.am, this.ad, this.ab, this.bq, this.br, this.ai, this.aj});
        this.a.put("produtoNotaCSTSemICMS", new JComponent[]{this.bL, this.au});
        this.a.put(CSTEnum._00.getDescricao(), new JComponent[]{this.H, this.bB, this.bK, this.bC, this.bL, this.bE, this.I, this.ap, this.at, this.au});
        this.a.put(CSTEnum._10.getDescricao(), new JComponent[]{this.H, this.I, this.bB, this.bK, this.bC, this.bL, this.bE, this.I, this.ap, this.at, this.au, this.bS, this.bT, this.ce, this.ca, this.cb, this.cc, this.az, this.aA, this.aJ, this.M, this.aH, this.aI});
        this.a.put(CSTEnum._10_Part.getDescricao(), new JComponent[]{this.H, this.I, this.bI, this.bH, this.bB, this.bC, this.bK, this.bL, this.bE, this.ar, this.aq, this.ap, this.at, this.au, this.I, this.cd, this.bS, this.bT, this.ce, this.ca, this.cb, this.cc, this.N, this.az, this.aA, this.aJ, this.M, this.aH, this.aI});
        this.a.put(CSTEnum._20.getDescricao(), new JComponent[]{this.H, this.bH, this.bB, this.bC, this.bK, this.bL, this.bE, this.aq, this.ap, this.at, this.au, this.I, this.J, this.av, this.bF, this.bN});
        this.a.put(CSTEnum._30.getDescricao(), new JComponent[]{this.I, this.bS, this.bT, this.ce, this.ca, this.cb, this.cc, this.az, this.aA, this.aJ, this.M, this.aH, this.aI, this.K, this.aw, this.bG, this.bO});
        this.a.put(CSTEnum._40.getDescricao(), new JComponent[]{this.H, this.bL, this.bF, this.au, this.J, this.bF, this.bN, this.av});
        this.a.put(CSTEnum._41.getDescricao(), new JComponent[]{this.H, this.bL, this.bF, this.au, this.J, this.bF, this.bN, this.av});
        this.a.put(CSTEnum._41_ST.getDescricao(), new JComponent[]{this.I, this.bV, this.bY, this.bW, this.bZ, this.aC, this.aF, this.aD, this.aG});
        this.a.put(CSTEnum._50.getDescricao(), new JComponent[]{this.H, this.bL, this.bF, this.au, this.J, this.bF, this.bN, this.av});
        this.a.put(CSTEnum._51.getDescricao(), new JComponent[]{this.H, this.bH, this.bB, this.bK, this.bC, this.bL, this.bE, this.aq, this.ap, this.at, this.au, this.I, this.bQ, this.ay, this.bJ, this.as, this.bP, this.ax});
        this.a.put(CSTEnum._60.getDescricao(), new JComponent[]{this.I, this.bU, this.bX, this.aB, this.aE});
        this.a.put(CSTEnum._70.getDescricao(), new JComponent[]{this.H, this.I, this.bH, this.bB, this.bK, this.bC, this.bL, this.bE, this.aq, this.ap, this.at, this.au, this.I, this.bS, this.bT, this.ce, this.ca, this.cb, this.cc, this.az, this.aA, this.aJ, this.M, this.aH, this.aI, this.J, this.av, this.bF, this.bN});
        this.a.put(CSTEnum._90.getDescricao(), new JComponent[]{this.H, this.I, this.bH, this.bB, this.bK, this.bC, this.bL, this.bE, this.aq, this.ap, this.at, this.au, this.I, this.bS, this.bT, this.ce, this.ca, this.cb, this.cc, this.az, this.aA, this.aJ, this.M, this.aH, this.aI, this.J, this.av, this.bF, this.bN});
        this.a.put(CSTEnum._90_Part.getDescricao(), new JComponent[]{this.H, this.I, this.bI, this.bH, this.bB, this.bK, this.bC, this.bL, this.bE, this.ar, this.aq, this.ap, this.at, this.au, this.I, this.cd, this.bS, this.bT, this.ce, this.ca, this.cb, this.cc, this.N, this.az, this.aA, this.aJ, this.M, this.aH, this.aI});
        this.a.put(CSOSNEnum._101.getDescricao(), new JComponent[]{this.bj, this.bg, this.ad, this.ab});
        this.a.put(CSOSNEnum._102.getDescricao(), new JComponent[0]);
        this.a.put(CSOSNEnum._103.getDescricao(), new JComponent[0]);
        this.a.put(CSOSNEnum._201.getDescricao(), new JComponent[]{this.G, this.aD, this.bs, this.bt, this.bf, this.bu, this.bp, this.bv, this.bj, this.bg, this.D, this.ak, this.aa, this.al, this.ah, this.am, this.ad, this.ab});
        this.a.put(CSOSNEnum._202.getDescricao(), new JComponent[]{this.G, this.aD, this.bs, this.bt, this.bf, this.bu, this.bp, this.bv, this.D, this.ak, this.aa, this.al, this.ah, this.am});
        this.a.put(CSOSNEnum._203.getDescricao(), new JComponent[]{this.G, this.bs, this.bt, this.bf, this.bu, this.bp, this.bv, this.D, this.ak, this.aa, this.al, this.ah, this.am});
        this.a.put(CSOSNEnum._300.getDescricao(), new JComponent[0]);
        this.a.put(CSOSNEnum._400.getDescricao(), new JComponent[0]);
        this.a.put(CSOSNEnum._500.getDescricao(), new JComponent[]{this.G, this.bq, this.br, this.ai, this.aj});
        this.a.put(CSOSNEnum._900.getDescricao(), new JComponent[]{this.F, this.G, this.bl, this.bm, this.bh, this.bk, this.bn, this.B, this.af, this.ac, this.ae, this.ag, this.bs, this.bt, this.bf, this.bu, this.bp, this.bv, this.bj, this.bg, this.D, this.ak, this.aa, this.al, this.ah, this.am, this.ad, this.ab});
        this.a.put("LABEL_ICMS" + CSTEnum._00.getDescricao(), new JComponent[]{this.bB, this.bK, this.bL, this.bE});
        this.a.put("LABEL_ICMS" + CSTEnum._10.getDescricao(), new JComponent[]{this.bB, this.bK, this.bL, this.bE, this.bS, this.bT, this.ce, this.ca, this.cb, this.cc});
        this.a.put("LABEL_ICMS" + CSTEnum._10_Part.getDescricao(), new JComponent[]{this.bI, this.bH, this.bB, this.bK, this.bL, this.bE, this.cd, this.bS, this.bT, this.ce, this.ca, this.cb, this.cc});
        this.a.put("LABEL_ICMS" + CSTEnum._20.getDescricao(), new JComponent[]{this.bH, this.bB, this.bK, this.bL, this.bE, this.bN, this.bG});
        this.a.put("LABEL_ICMS" + CSTEnum._30.getDescricao(), new JComponent[]{this.bS, this.bT, this.ce, this.ca, this.cb, this.cc, this.bF, this.bN});
        this.a.put("LABEL_ICMS" + CSTEnum._40.getDescricao(), new JComponent[]{this.bF, this.bN});
        this.a.put("LABEL_ICMS" + CSTEnum._41.getDescricao(), new JComponent[]{this.bF, this.bN});
        this.a.put("LABEL_ICMS" + CSTEnum._41_ST.getDescricao(), new JComponent[]{this.bV, this.bY, this.bW, this.bZ});
        this.a.put("LABEL_ICMS" + CSTEnum._50.getDescricao(), new JComponent[]{this.bF, this.bN});
        this.a.put("LABEL_ICMS" + CSTEnum._51.getDescricao(), new JComponent[]{this.bH, this.bB, this.bK, this.bL, this.bE, this.bQ, this.bJ, this.bP});
        this.a.put("LABEL_ICMS" + CSTEnum._60.getDescricao(), new JComponent[]{this.bU, this.bX});
        this.a.put("LABEL_ICMS" + CSTEnum._70.getDescricao(), new JComponent[]{this.bH, this.bB, this.bK, this.bL, this.bE, this.bS, this.bT, this.ce, this.ca, this.cb, this.cc, this.bF, this.bN});
        this.a.put("LABEL_ICMS" + CSTEnum._90.getDescricao(), new JComponent[]{this.bH, this.bB, this.bK, this.bL, this.bE, this.bS, this.bT, this.ce, this.ca, this.cb, this.cc, this.bF, this.bN});
        this.a.put("LABEL_ICMS" + CSTEnum._90_Part.getDescricao(), new JComponent[]{this.bI, this.bH, this.bB, this.bK, this.bL, this.bE, this.cd, this.bS, this.bT, this.ce, this.ca, this.cb, this.cc});
        this.a.put("LABEL_ICMS" + CSOSNEnum._101.getDescricao(), new JComponent[]{this.bj, this.bg});
        this.a.put("LABEL_ICMS" + CSOSNEnum._102.getDescricao(), new JComponent[0]);
        this.a.put("LABEL_ICMS" + CSOSNEnum._103.getDescricao(), new JComponent[0]);
        this.a.put("LABEL_ICMS" + CSOSNEnum._201.getDescricao(), new JComponent[]{this.bs, this.bt, this.bf, this.bu, this.bp, this.bv, this.bj, this.bg});
        this.a.put("LABEL_ICMS" + CSOSNEnum._202.getDescricao(), new JComponent[]{this.bs, this.bt, this.bf, this.bu, this.bp, this.bv});
        this.a.put("LABEL_ICMS" + CSOSNEnum._203.getDescricao(), new JComponent[]{this.bs, this.bt, this.bf, this.bu, this.bp, this.bv});
        this.a.put("LABEL_ICMS" + CSOSNEnum._300.getDescricao(), new JComponent[0]);
        this.a.put("LABEL_ICMS" + CSOSNEnum._400.getDescricao(), new JComponent[0]);
        this.a.put("LABEL_ICMS" + CSOSNEnum._500.getDescricao(), new JComponent[]{this.bq, this.br});
        this.a.put("LABEL_ICMS" + CSOSNEnum._900.getDescricao(), new JComponent[]{this.bl, this.bm, this.bh, this.bk, this.bn, this.bs, this.bt, this.bf, this.bu, this.bp, this.bv, this.bj, this.bg});
        this.a.put("LABEL_ICMS_OPC" + CSTEnum._00.getDescricao(), new JComponent[0]);
        this.a.put("LABEL_ICMS_OPC" + CSTEnum._10.getDescricao(), new JComponent[]{this.cb, this.cc});
        this.a.put("LABEL_ICMS_OPC" + CSTEnum._10_Part.getDescricao(), new JComponent[]{this.bH, this.cb, this.cc});
        this.a.put("LABEL_ICMS_OPC" + CSTEnum._20.getDescricao(), new JComponent[]{this.bN, this.bG});
        this.a.put("LABEL_ICMS_OPC" + CSTEnum._30.getDescricao(), new JComponent[]{this.cb, this.cc, this.bF, this.bN});
        this.a.put("LABEL_ICMS_OPC" + CSTEnum._40.getDescricao(), new JComponent[]{this.bL, this.bF, this.bN});
        this.a.put("LABEL_ICMS_OPC" + CSTEnum._41.getDescricao(), new JComponent[]{this.bL, this.bF, this.bN});
        this.a.put("LABEL_ICMS_OPC" + CSTEnum._41_ST.getDescricao(), new JComponent[0]);
        this.a.put("LABEL_ICMS_OPC" + CSTEnum._50.getDescricao(), new JComponent[]{this.bL, this.bF, this.bN});
        this.a.put("LABEL_ICMS_OPC" + CSTEnum._51.getDescricao(), new JComponent[]{this.bH, this.bB, this.bK, this.bL, this.bE, this.bQ, this.bJ, this.bP});
        this.a.put("LABEL_ICMS_OPC" + CSTEnum._60.getDescricao(), new JComponent[0]);
        this.a.put("LABEL_ICMS_OPC" + CSTEnum._70.getDescricao(), new JComponent[]{this.cb, this.cc, this.bF, this.bN});
        this.a.put("LABEL_ICMS_OPC" + CSTEnum._90.getDescricao(), new JComponent[]{this.bH, this.bB, this.bK, this.bL, this.bE, this.bS, this.bT, this.ce, this.ca, this.cb, this.cc, this.bF, this.bN});
        this.a.put("LABEL_ICMS_OPC" + CSTEnum._90_Part.getDescricao(), new JComponent[]{this.bH, this.cb, this.cc});
        this.a.put("LABEL_ICMS_OPC" + CSOSNEnum._101.getDescricao(), new JComponent[0]);
        this.a.put("LABEL_ICMS_OPC" + CSOSNEnum._102.getDescricao(), new JComponent[0]);
        this.a.put("LABEL_ICMS_OPC" + CSOSNEnum._103.getDescricao(), new JComponent[0]);
        this.a.put("LABEL_ICMS_OPC" + CSOSNEnum._201.getDescricao(), new JComponent[]{this.bt, this.bf});
        this.a.put("LABEL_ICMS_OPC" + CSOSNEnum._202.getDescricao(), new JComponent[]{this.bt, this.bf});
        this.a.put("LABEL_ICMS_OPC" + CSOSNEnum._203.getDescricao(), new JComponent[]{this.bt, this.bf});
        this.a.put("LABEL_ICMS_OPC" + CSOSNEnum._300.getDescricao(), new JComponent[0]);
        this.a.put("LABEL_ICMS_OPC" + CSOSNEnum._400.getDescricao(), new JComponent[0]);
        this.a.put("LABEL_ICMS_OPC" + CSOSNEnum._500.getDescricao(), new JComponent[0]);
        this.a.put("LABEL_ICMS_OPC" + CSOSNEnum._900.getDescricao(), new JComponent[]{this.bl, this.bm, this.bh, this.bk, this.bn, this.bs, this.bt, this.bf, this.bu, this.bp, this.bv, this.bj, this.bg});
        this.a.put("produtoNotaTributoIPITodos", new JComponent[]{this.l, this.z, this.y, this.s, this.B, this.A});
        this.a.put("produtoNotaTributoIPITodosDisable", new JComponent[]{this.q, this.o, this.v, this.p, this.r});
        this.a.put(IPIEnum.IPI_00.getDescricao(), new JComponent[]{this.l});
        this.a.put(IPIEnum.IPI_49.getDescricao(), new JComponent[]{this.l});
        this.a.put(IPIEnum.IPI_50.getDescricao(), new JComponent[]{this.l});
        this.a.put(IPIEnum.IPI_99.getDescricao(), new JComponent[]{this.l});
        this.a.put(IPIEnum.IPI_01.getDescricao(), new JComponent[]{this.k});
        this.a.put(IPIEnum.IPI_02.getDescricao(), new JComponent[]{this.k});
        this.a.put(IPIEnum.IPI_03.getDescricao(), new JComponent[]{this.k});
        this.a.put(IPIEnum.IPI_04.getDescricao(), new JComponent[]{this.k});
        this.a.put(IPIEnum.IPI_05.getDescricao(), new JComponent[]{this.k});
        this.a.put(IPIEnum.IPI_51.getDescricao(), new JComponent[]{this.k});
        this.a.put(IPIEnum.IPI_52.getDescricao(), new JComponent[]{this.k});
        this.a.put(IPIEnum.IPI_53.getDescricao(), new JComponent[]{this.k});
        this.a.put(IPIEnum.IPI_54.getDescricao(), new JComponent[]{this.k});
        this.a.put(IPIEnum.IPI_55.getDescricao(), new JComponent[]{this.k});
        this.a.put("produtoNotaIPIPercentual", new JComponent[]{this.l, this.z, this.y, this.A});
        this.a.put("produtoNotaIPIEmValor", new JComponent[]{this.l, this.s, this.B, this.A});
        this.a.put("produtoNotaTributoPISTodos", new JComponent[]{this.x, this.V, this.U, this.M, this.N, this.T});
        this.a.put("produtoNotaPISST", new JComponent[]{this.R, this.O, this.P, this.Q, this.S});
        this.a.put("produtoNotaPISSTTodos", new JComponent[]{this.x, this.w, this.R, this.O, this.P, this.Q, this.S});
        this.a.put(PISEnum.PIS_01.getDescricao(), new JComponent[]{this.v, this.U, this.M, this.V});
        this.a.put(PISEnum.PIS_02.getDescricao(), new JComponent[]{this.v, this.U, this.M, this.V});
        this.a.put(PISEnum.PIS_03.getDescricao(), new JComponent[]{this.v, this.N, this.T, this.V});
        this.a.put(PISEnum.PIS_04.getDescricao(), new JComponent[]{this.v});
        this.a.put(PISEnum.PIS_05.getDescricao(), new JComponent[]{this.v});
        this.a.put(PISEnum.PIS_06.getDescricao(), new JComponent[]{this.v});
        this.a.put(PISEnum.PIS_07.getDescricao(), new JComponent[]{this.v});
        this.a.put(PISEnum.PIS_08.getDescricao(), new JComponent[]{this.v});
        this.a.put(PISEnum.PIS_09.getDescricao(), new JComponent[]{this.v});
        this.a.put(PISEnum.PIS_49.getDescricao(), new JComponent[]{this.v, this.x});
        this.a.put(PISEnum.PIS_50.getDescricao(), new JComponent[]{this.v, this.x});
        this.a.put(PISEnum.PIS_51.getDescricao(), new JComponent[]{this.v, this.x});
        this.a.put(PISEnum.PIS_52.getDescricao(), new JComponent[]{this.v, this.x});
        this.a.put(PISEnum.PIS_53.getDescricao(), new JComponent[]{this.v, this.x});
        this.a.put(PISEnum.PIS_54.getDescricao(), new JComponent[]{this.v, this.x});
        this.a.put(PISEnum.PIS_55.getDescricao(), new JComponent[]{this.v, this.x});
        this.a.put(PISEnum.PIS_56.getDescricao(), new JComponent[]{this.v, this.x});
        this.a.put(PISEnum.PIS_60.getDescricao(), new JComponent[]{this.v, this.x});
        this.a.put(PISEnum.PIS_61.getDescricao(), new JComponent[]{this.v, this.x});
        this.a.put(PISEnum.PIS_62.getDescricao(), new JComponent[]{this.v, this.x});
        this.a.put(PISEnum.PIS_63.getDescricao(), new JComponent[]{this.v, this.x});
        this.a.put(PISEnum.PIS_64.getDescricao(), new JComponent[]{this.v, this.x});
        this.a.put(PISEnum.PIS_65.getDescricao(), new JComponent[]{this.v, this.x});
        this.a.put(PISEnum.PIS_66.getDescricao(), new JComponent[]{this.v, this.x});
        this.a.put(PISEnum.PIS_67.getDescricao(), new JComponent[]{this.v, this.x});
        this.a.put(PISEnum.PIS_70.getDescricao(), new JComponent[]{this.v, this.x});
        this.a.put(PISEnum.PIS_71.getDescricao(), new JComponent[]{this.v, this.x});
        this.a.put(PISEnum.PIS_72.getDescricao(), new JComponent[]{this.v, this.x});
        this.a.put(PISEnum.PIS_73.getDescricao(), new JComponent[]{this.v, this.x});
        this.a.put(PISEnum.PIS_74.getDescricao(), new JComponent[]{this.v, this.x});
        this.a.put(PISEnum.PIS_75.getDescricao(), new JComponent[]{this.v, this.x});
        this.a.put(PISEnum.PIS_98.getDescricao(), new JComponent[]{this.v, this.x});
        this.a.put(PISEnum.PIS_99.getDescricao(), new JComponent[]{this.v, this.x});
        this.a.put("produtoNotaPISPercentual", new JComponent[]{this.U, this.M, this.V, this.x});
        this.a.put("produtoNotaPISEmValor", new JComponent[]{this.N, this.T, this.V, this.x});
        this.a.put("produtoNotaPISSTPercentual", new JComponent[]{this.R, this.S, this.O});
        this.a.put("produtoNotaPISSTEmValor", new JComponent[]{this.P, this.S, this.Q});
        this.a.put("produtoNotaTributoCofinsTodos", new JComponent[]{this.d, this.m, this.l, this.d, this.e, this.k});
        this.a.put("produtoNotaCOFINS", new JComponent[]{this.i, this.f, this.g, this.h, this.j});
        this.a.put("produtoNotaCOFINSTodos", new JComponent[]{this.d, this.c, this.i, this.f, this.g, this.h, this.j});
        this.a.put(COFINSEnum.COFINS_01.getDescricao(), new JComponent[]{this.b, this.l, this.d, this.m});
        this.a.put(COFINSEnum.COFINS_02.getDescricao(), new JComponent[]{this.b, this.l, this.d, this.m});
        this.a.put(COFINSEnum.COFINS_03.getDescricao(), new JComponent[]{this.b, this.e, this.k, this.m});
        this.a.put(COFINSEnum.COFINS_04.getDescricao(), new JComponent[]{this.b});
        this.a.put(COFINSEnum.COFINS_05.getDescricao(), new JComponent[]{this.b});
        this.a.put(COFINSEnum.COFINS_06.getDescricao(), new JComponent[]{this.b});
        this.a.put(COFINSEnum.COFINS_07.getDescricao(), new JComponent[]{this.b});
        this.a.put(COFINSEnum.COFINS_08.getDescricao(), new JComponent[]{this.b});
        this.a.put(COFINSEnum.COFINS_09.getDescricao(), new JComponent[]{this.b});
        this.a.put(COFINSEnum.COFINS_49.getDescricao(), new JComponent[]{this.b, this.d});
        this.a.put(COFINSEnum.COFINS_50.getDescricao(), new JComponent[]{this.b, this.d});
        this.a.put(COFINSEnum.COFINS_51.getDescricao(), new JComponent[]{this.b, this.d});
        this.a.put(COFINSEnum.COFINS_52.getDescricao(), new JComponent[]{this.b, this.d});
        this.a.put(COFINSEnum.COFINS_53.getDescricao(), new JComponent[]{this.b, this.d});
        this.a.put(COFINSEnum.COFINS_54.getDescricao(), new JComponent[]{this.b, this.d});
        this.a.put(COFINSEnum.COFINS_55.getDescricao(), new JComponent[]{this.b, this.d});
        this.a.put(COFINSEnum.COFINS_56.getDescricao(), new JComponent[]{this.b, this.d});
        this.a.put(COFINSEnum.COFINS_60.getDescricao(), new JComponent[]{this.b, this.d});
        this.a.put(COFINSEnum.COFINS_61.getDescricao(), new JComponent[]{this.b, this.d});
        this.a.put(COFINSEnum.COFINS_62.getDescricao(), new JComponent[]{this.b, this.d});
        this.a.put(COFINSEnum.COFINS_63.getDescricao(), new JComponent[]{this.b, this.d});
        this.a.put(COFINSEnum.COFINS_64.getDescricao(), new JComponent[]{this.b, this.d});
        this.a.put(COFINSEnum.COFINS_65.getDescricao(), new JComponent[]{this.b, this.d});
        this.a.put(COFINSEnum.COFINS_66.getDescricao(), new JComponent[]{this.b, this.d});
        this.a.put(COFINSEnum.COFINS_67.getDescricao(), new JComponent[]{this.b, this.d});
        this.a.put(COFINSEnum.COFINS_70.getDescricao(), new JComponent[]{this.b, this.d});
        this.a.put(COFINSEnum.COFINS_71.getDescricao(), new JComponent[]{this.b, this.d});
        this.a.put(COFINSEnum.COFINS_72.getDescricao(), new JComponent[]{this.b, this.d});
        this.a.put(COFINSEnum.COFINS_73.getDescricao(), new JComponent[]{this.b, this.d});
        this.a.put(COFINSEnum.COFINS_74.getDescricao(), new JComponent[]{this.b, this.d});
        this.a.put(COFINSEnum.COFINS_75.getDescricao(), new JComponent[]{this.b, this.d});
        this.a.put(COFINSEnum.COFINS_98.getDescricao(), new JComponent[]{this.b, this.d});
        this.a.put(COFINSEnum.COFINS_99.getDescricao(), new JComponent[]{this.b, this.d});
        this.a.put("produtoNotaCOFINSPercentual", new JComponent[]{this.l, this.d, this.d, this.m});
        this.a.put("produtoNotaCOFINSEmValor", new JComponent[]{this.e, this.k, this.d, this.m});
        this.a.put("produtoNotaCOFINSSTPercentual", new JComponent[]{this.i, this.f, this.j});
        this.a.put("produtoNotaCOFINSSTEmValor", new JComponent[]{this.g, this.h, this.j});
        this.a.put("MANTER_NFE_INICIO_DESABILITADO" + DSENLabelConstants.MEDICAMENTO, new JComponent[]{this.m, this.l, this.k});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.MEDICAMENTO + "1", new JComponent[]{this.k});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.MEDICAMENTO + "*", new JComponent[0]);
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.MEDICAMENTO + "0", new JComponent[0]);
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.MEDICAMENTO + "1", new JComponent[]{this.k, this.l, this.m});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.MEDICAMENTO + "*", new JComponent[]{this.m, this.l});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.MEDICAMENTO + "0", new JComponent[]{this.m});
        this.a.put("MANTER_NFE_INICIO_DESABILITADO" + DSENLabelConstants.ARMAMENTO, new JComponent[]{this.a, this.b, this.c});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.ARMAMENTO + "1", new JComponent[]{this.a});
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.ARMAMENTO + "*", new JComponent[0]);
        this.a.put("MANTER_NFE_DETALHE" + DSENLabelConstants.ARMAMENTO + "0", new JComponent[0]);
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.ARMAMENTO + "1", new JComponent[]{this.a, this.b, this.c});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.ARMAMENTO + "*", new JComponent[]{this.c, this.b});
        this.a.put("MANTER_NFE_EDICAO" + DSENLabelConstants.ARMAMENTO + "0", new JComponent[]{this.c});
    }

    private void e() {
        this.g();
        this.i();
        this.j();
        this.f();
        this.h();
    }

    private void f() {
        this.d = new JDSGEPageableTable();
        this.d.setPageSize(0);
        this.d.setPageable(false);
        this.d.setSortable(false);
        this.d.addColumn(0, "marcado", "", true, null);
        this.d.addColumn(1, "NItem", "Item", false, null);
        this.d.addColumn(2, "NDraw", "Drawback", false, null);
        this.d.addColumn(3, "NRE", "Registro Exporta\u00e7\u00e3o", false, null);
        this.d.addColumn(4, "chNFe", "Chave Acesso NFe", false, null);
        this.d.addColumn(5, "QExport", "Quantidade Exportada", false, null);
        this.d.getWrappedTable().getColumnModel().getColumn(0).setMaxWidth(30);
        this.d.getWrappedTable().getColumnModel().getColumn(1).setMaxWidth(50);
        this.f.setViewportView((Component)this.d);
    }

    private void g() {
        this.a = new JDSGEPageableTable();
        this.a.setPageSize(0);
        this.a.setPageable(false);
        this.a.setSortable(false);
        this.a.addColumn(0, "marcado", "", true, null);
        this.a.addColumn(1, "NItem", "Item", false, null);
        this.a.addColumn(2, "NDI", "N\u00famero", false, null);
        this.a.addColumn(3, "DDI", "Data", (DefaultFormatter)this.a, false, null);
        this.a.addColumn(4, "UFDesemb", "UF desemb. aduaneiro", false, null);
        this.a.addColumn(5, "XLocDesemb", "Local desemb. aduaneiro", false, null);
        this.a.addColumn(6, "DDesemb", "Data desemb. aduaneiro", (DefaultFormatter)this.b, false, null);
        this.a.addColumn(7, "CExportador", "Exportador", false, null);
        this.a.getWrappedTable().getColumnModel().getColumn(0).setMaxWidth(30);
        this.a.getWrappedTable().getColumnModel().getColumn(1).setMaxWidth(50);
        this.c.setViewportView((Component)this.a);
    }

    private void h() {
        this.e = new JDSGEPageableTable();
        this.e.setPageSize(0);
        this.e.setPageable(false);
        this.e.setSortable(false);
        this.e.addColumn(0, "marcado", "", true, null);
        this.e.addColumn(1, "valorNVE", "NVE", false, null);
        this.e.getWrappedTable().getColumnModel().getColumn(0).setMaxWidth(30);
        this.e.setViewportView((Component)this.e);
    }

    public void refreshTableProdutoExportacao() {
        ((DSGETableModel)this.d.getWrappedTable().getModel()).fireTableDataChanged();
    }

    public void refreshTableDIProduto() {
        ((DSGETableModel)this.a.getWrappedTable().getModel()).fireTableDataChanged();
    }

    public void refreshTableNVE() {
        ((DSGETableModel)this.e.getWrappedTable().getModel()).fireTableDataChanged();
    }

    public void refreshTableMedicamentos() {
        ((DSGETableModel)this.b.getWrappedTable().getModel()).fireTableDataChanged();
    }

    public void refreshTableArmamentos() {
        ((DSGETableModel)this.c.getWrappedTable().getModel()).fireTableDataChanged();
    }

    private void i() {
        this.b = new JDSGEPageableTable();
        this.b.setPageSize(0);
        this.b.setPageable(false);
        this.b.setSortable(false);
        this.b.addColumn(0, "marcado", "", true, null);
        this.b.addColumn(1, "NItem", "Item", false, null);
        this.b.addColumn(2, "NLote", "N\u00famero Lote", false, null);
        this.b.addColumn(3, "QLote", "Qtd. Lote", (DefaultFormatter)NumberFormatterHelper.getFormatter0803(), false, null);
        this.b.addColumn(4, "DFab", "Data Fab.", (DefaultFormatter)this.c, false, null);
        this.b.addColumn(5, "DVal", "Data Valid.", (DefaultFormatter)this.d, false, null);
        this.b.addColumn(6, "VPMC", "Pre\u00e7o M\u00e1x.", (DefaultFormatter)NumberFormatterHelper.getFormatter1302(), false, null);
        this.b.getWrappedTable().getColumnModel().getColumn(0).setMaxWidth(30);
        this.b.getWrappedTable().getColumnModel().getColumn(1).setMaxWidth(50);
        this.d.setViewportView((Component)this.b);
    }

    private void j() {
        this.c = new JDSGEPageableTable();
        this.c.setPageSize(0);
        this.c.setPageable(false);
        this.c.setSortable(false);
        this.c.addColumn(0, "marcado", "", true, null);
        this.c.addColumn(1, "NItem", "Item", false, null);
        this.c.addColumn(2, "NSerie", "N\u00famero S\u00e9rie", false, null);
        this.c.addColumn(3, "NCano", "N\u00famero S\u00e9rie Cano", false, null);
        this.c.addColumn(4, "descr", "Descri\u00e7\u00e3o", false, null);
        this.c.getWrappedTable().getColumnModel().getColumn(0).setMaxWidth(30);
        this.c.getWrappedTable().getColumnModel().getColumn(1).setMaxWidth(50);
        this.c.getWrappedTable().getColumnModel().getColumn(2).setMaxWidth(150);
        this.c.getWrappedTable().getColumnModel().getColumn(2).setPreferredWidth(150);
        this.c.getWrappedTable().getColumnModel().getColumn(3).setMaxWidth(150);
        this.c.getWrappedTable().getColumnModel().getColumn(3).setPreferredWidth(150);
        this.b.setViewportView((Component)this.c);
    }

    private void k() {
        this.n.setActionCommand("editarNVE");
        this.o.setActionCommand("excluirNVE");
        this.p.setActionCommand("incluirNVE");
        this.d.setActionCommand("editarDI");
        this.e.setActionCommand("excluirDI");
        this.f.setActionCommand("incluirDI");
        this.g.setActionCommand("editarEXPORT");
        this.h.setActionCommand("excluirEXPORT");
        this.i.setActionCommand("incluirEXPORT");
        this.k.setActionCommand("detalhar");
        this.l.setActionCommand("excluir");
        this.m.setActionCommand("incluir");
        this.a.setActionCommand("detalhar");
        this.b.setActionCommand("excluir");
        this.c.setActionCommand("incluir");
        this.H.setActionCommand("ICMSCST");
        this.A.setActionCommand("ACTION_ICMS_CSOSN");
        this.k.setActionCommand("IPICST");
        this.l.setActionCommand("IPITpCalculo");
        this.v.setActionCommand("PISCST");
        this.w.setActionCommand("PISSTTpCalculo");
        this.x.setActionCommand("PISTpCalculo");
        this.b.setActionCommand("COFINSCST");
        this.c.setActionCommand("COFINSSTTpCalculo");
        this.d.setActionCommand("COFINSTpCalculo");
        this.t.setActionCommand("ISSQNUF");
        this.u.setActionCommand("ISSQNUFINCI");
        this.o.setActionCommand("ISSQNMUNFG");
        this.r.setActionCommand("pesquisar");
        this.q.setActionCommand("ok");
        this.ap.setName("TRIB_NORM_ICMS_FOCUS_LOST");
        this.az.setName("TRIB_NORM_ICMSST_FOCUS_LOST");
        this.aH.setName("TRIB_NORM_ICMSST_FOCUS_LOST");
        this.aq.setName("TRIB_NORM_ICMS_FOCUS_LOST");
        this.aI.setName("TRIB_NORM_ICMSST_FOCUS_LOST");
        this.at.setName("TRIB_NORM_ICMS_FOCUS_LOST");
        this.aA.setName("TRIB_NORM_ICMSST_FOCUS_LOST");
        this.au.setName("TRIB_NORM_ICMS_FOCUS_LOST");
        this.ae.setName("SIMPLES_NACIONAL_ICMS_FOCUS_LOST");
        this.ah.setName("SIMPLES_NACIONAL_ICMSST_FOCUS_LOST");
        this.ak.setName("SIMPLES_NACIONAL_ICMSST_FOCUS_LOST");
        this.ac.setName("SIMPLES_NACIONAL_ICMS_FOCUS_LOST");
        this.aa.setName("SIMPLES_NACIONAL_ICMSST_FOCUS_LOST");
        this.af.setName("SIMPLES_NACIONAL_ICMS_FOCUS_LOST");
        this.al.setName("SIMPLES_NACIONAL_ICMSST_FOCUS_LOST");
        this.y.setName("ipiFocusLost");
        this.z.setName("ipiFocusLost");
        this.B.setName("ipiFocusLost");
        this.s.setName("ipiFocusLost");
        this.r.setName("iiFocusLost");
        this.s.setName("iiFocusLost");
        this.u.setName("iiFocusLost");
        this.M.setName("pisFocusLost");
        this.N.setName("pisFocusLost");
        this.T.setName("pisFocusLost");
        this.U.setName("pisFocusLost");
        this.O.setName("pisSTFocusLost");
        this.P.setName("pisSTFocusLost");
        this.Q.setName("pisSTFocusLost");
        this.R.setName("pisSTFocusLost");
        this.d.setName("cofinsFocusLost");
        this.e.setName("cofinsFocusLost");
        this.f.setName("cofinsSTFocusLost");
        this.g.setName("cofinsSTFocusLost");
        this.h.setName("cofinsSTFocusLost");
        this.i.setName("cofinsSTFocusLost");
        this.k.setName("cofinsFocusLost");
        this.l.setName("cofinsFocusLost");
        this.D.setName("issqnFocusLost");
        this.E.setName("issqnFocusLost");
        this.n.setName("cideFocusLost");
        this.q.setName("cideFocusLost");
    }

    private void a(ProdutoNotaTO produtoNotaTO) throws DSGEUtilException {
        if (produtoNotaTO.getDetalheProduto() != null && produtoNotaTO.getDetalheProduto().getProd() != null) {
            this.b(produtoNotaTO);
            this.c(produtoNotaTO);
            this.i(produtoNotaTO);
            this.j(produtoNotaTO);
            this.e(produtoNotaTO);
            if (produtoNotaTO.getDetalheProduto().getProd().getVeicProd() != null) {
                this.f(produtoNotaTO);
            }
            if (produtoNotaTO.getDetalheProduto().getProd().getMedArray() != null) {
                this.g(produtoNotaTO);
            }
            if (produtoNotaTO.getDetalheProduto().getProd().getArmaArray() != null) {
                this.h(produtoNotaTO);
            }
            if (produtoNotaTO.getDetalheProduto().getProd().getComb() != null) {
                this.k(produtoNotaTO);
            }
            if (produtoNotaTO.getDetalheProduto().getProd().getNRECOPI() != null) {
                this.z.setText(!StringHelper.isBlankOrNull((Object)produtoNotaTO.getDetalheProduto().getProd().getNRECOPI()) ? produtoNotaTO.getDetalheProduto().getProd().getNRECOPI() : null);
            }
        }
    }

    private void b(ProdutoNotaTO produtoNotaTO) throws DSGEUtilException {
        TNFe.InfNFe.Det.Prod produto = produtoNotaTO.getDetalheProduto().getProd();
        this.d(produtoNotaTO);
        this.h.setText(produto.getCProd());
        this.d.setText(produto.getCEAN() != null ? produto.getCEAN() : "");
        this.F.setText(produto.getXProd());
        this.u.setText(produto.getNCM() != null ? produto.getNCM() : "");
        this.n.setText(produto.getEXTIPI() != null ? produto.getEXTIPI() : "");
        this.C.setText(produto.getUCom());
        this.e.setText(produto.getCEANTrib() != null ? produto.getCEANTrib() : "");
        this.D.setText(produto.getUTrib());
        this.a(produto);
        try {
            this.Y.setText(!StringHelper.isBlankOrNull((Object)produto.getQCom()) ? NumberFormatterHelper.getFormatter((int)4, (int)4, (int)11).valueToString(new BigDecimal(produto.getQCom())) : null);
            this.b.setText(!StringHelper.isBlankOrNull((Object)produto.getVUnCom()) ? NumberFormatterHelper.getFormatter((int)10, (int)10, (int)11).valueToString(new BigDecimal(produto.getVUnCom())) : null);
            this.a.setText(!StringHelper.isBlankOrNull((Object)produto.getVProd()) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(produto.getVProd())) : null);
            this.Z.setText(!StringHelper.isBlankOrNull((Object)produto.getQTrib()) ? NumberFormatterHelper.getFormatter((int)4, (int)4, (int)11).valueToString(new BigDecimal(produto.getQTrib())) : null);
            this.c.setText(!StringHelper.isBlankOrNull((Object)produto.getVUnTrib()) ? NumberFormatterHelper.getFormatter((int)10, (int)10, (int)11).valueToString(new BigDecimal(produto.getVUnTrib())) : null);
            this.aL.setText(!StringHelper.isBlankOrNull((Object)produto.getVFrete()) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(produto.getVFrete())) : null);
            this.aN.setText(!StringHelper.isBlankOrNull((Object)produto.getVSeg()) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(produto.getVSeg())) : null);
            this.aK.setText(!StringHelper.isBlankOrNull((Object)produto.getVDesc()) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(produto.getVDesc())) : null);
            this.A.setText(produto.getXPed());
            this.y.setText(produto.getNItemPed());
            this.x.setText(produto.getNFCI());
            this.aM.setText(!StringHelper.isBlankOrNull((Object)produto.getVOutro()) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(produto.getVOutro())) : null);
            this.b.setSelected(produto.getIndTot() == null || "1".equals(produto.getIndTot().toString()));
        }
        catch (ParseException ex) {
            this.showErrors((Throwable)ex);
        }
        if (produto.getVeicProd() != null) {
            this.y.setSelectedItem((Object)ProdutoEspecificoEnum.VEICULO);
        } else if (produto.getMedArray() != null && produto.getMedArray().length > 0) {
            this.y.setSelectedItem((Object)ProdutoEspecificoEnum.MEDICAMENTO);
        } else if (produto.getArmaArray() != null && produto.getArmaArray().length > 0) {
            this.y.setSelectedItem((Object)ProdutoEspecificoEnum.ARMAMENTO);
        } else if (produto.getComb() != null) {
            this.y.setSelectedItem((Object)ProdutoEspecificoEnum.COMBUSTIVEL);
        } else if (produto.getNRECOPI() != null) {
            this.y.setSelectedItem((Object)ProdutoEspecificoEnum.PAPEL_IMUNE);
        }
    }

    private void a(TNFe.InfNFe.Det.Prod prod) throws DSGEUtilException {
        String cfopStr = DocumentoUtil.getCFOP((TNFe.InfNFe.Det.Prod)prod, (boolean)false);
        this.a.setVisible(true);
        this.k.setText("* CFOP");
        this.k.setForeground(Color.BLACK);
        if (cfopStr != null) {
            CfopTO cfop = DSENUtilHelper.getInstance().getCfopTO(cfopStr);
            if (cfop != null) {
                this.a.setSelectedItem((Object)cfop);
            } else {
                this.a.setSelectedIndex(-1);
            }
        } else {
            cfopStr = DocumentoUtil.getCFOP((TNFe.InfNFe.Det.Prod)prod, (boolean)true);
            if (cfopStr != null && "manterNotaOperacaoDetalhe".equals(this.getOperacaoNota())) {
                this.a.setVisible(false);
                this.k.setText("CFOP " + cfopStr + " inexistente");
                this.k.setForeground(Color.RED);
            } else {
                this.a.setSelectedIndex(-1);
            }
        }
    }

    private void c(ProdutoNotaTO produtoNotaTO) {
        TNFe.InfNFe.Det.Prod.DI[] di = produtoNotaTO.getDetalheProduto().getProd().getDIArray();
        if (di != null) {
            for (int i = 0; i < di.length; ++i) {
                DITO diTO = new DITO();
                diTO.setValues(di[i]);
                diTO.setNItem(String.valueOf(i + 1));
                this.a.addTO((BaseTO)diTO);
            }
        }
    }

    private void d(ProdutoNotaTO produtoNotaTO) {
        String[] nve = produtoNotaTO.getDetalheProduto().getProd().getNVEArray();
        if (nve != null && nve.length > 0) {
            for (String item : nve) {
                NVETO to = new NVETO();
                to.setValorNVE(item);
                this.e.addTO((BaseTO)to);
            }
        }
    }

    private void e(ProdutoNotaTO produtoNotaTO) {
        TNFe.InfNFe.Det.Prod.DetExport[] de = produtoNotaTO.getDetalheProduto().getProd().getDetExportArray();
        if (de != null) {
            for (int i = 0; i < de.length; ++i) {
                ProdutoExportacaoTO prodE = new ProdutoExportacaoTO();
                prodE.setNItem(String.valueOf(i + 1));
                prodE.setValues(de[i]);
                this.d.addTO((BaseTO)prodE);
            }
        }
    }

    private void f(ProdutoNotaTO produtoNotaTO) {
        TNFe.InfNFe.Det.Prod.VeicProd veic = produtoNotaTO.getDetalheProduto().getProd().getVeicProd();
        if (veic != null) {
            int i;
            if (veic.getTpOp() != null) {
                TipoOperacaoEnum[] tpOp = TipoOperacaoEnum.values();
                for (i = 0; i < tpOp.length; ++i) {
                    if (!tpOp[i].getCodigo().equals(veic.getTpOp().toString())) continue;
                    this.F.setSelectedItem((Object)tpOp[i]);
                }
            }
            if (veic.getCondVeic() != null) {
                CondicaoVeiculoEnum[] condVeic = CondicaoVeiculoEnum.values();
                for (i = 0; i < condVeic.length; ++i) {
                    if (!condVeic[i].getCodigo().equals(veic.getCondVeic().toString())) continue;
                    this.h.setSelectedItem((Object)condVeic[i]);
                }
            }
            this.z.setSelectedItem((Object)(veic.getTpRest() != null ? RestricaoVeiculoEnum.getEnumPeloCodigo((String)veic.getTpRest().toString()) : null));
            if (!StringHelper.isBlankOrNull((Object)veic.getTpComb())) {
                try {
                    TipoCombustivelTO tpCombTO = DSENUtilHelper.getInstance().getTipoCombustivelTO(veic.getTpComb());
                    if (tpCombTO != null) {
                        this.E.setSelectedItem((Object)tpCombTO);
                    } else {
                        ((JTextField)this.E.getEditor().getEditorComponent()).setText(veic.getTpComb());
                    }
                }
                catch (DSGEUtilException ex) {
                    this.showErrors((DSGEBaseException)ex);
                }
            }
            try {
                TipoVeiculoTO tpVeicTO = DSENUtilHelper.getInstance().getTipoVeiculoTO(veic.getTpVeic());
                if (tpVeicTO != null) {
                    this.G.setSelectedItem((Object)tpVeicTO);
                } else {
                    ((JTextField)this.G.getEditor().getEditorComponent()).setText(veic.getTpVeic());
                }
            }
            catch (DSGEUtilException ex) {
                this.showErrors((DSGEBaseException)ex);
            }
            try {
                EspecieVeiculoTO espVeicTO = DSENUtilHelper.getInstance().getEspecieVeiculoTO(veic.getEspVeic());
                if (espVeicTO != null) {
                    this.i.setSelectedItem((Object)espVeicTO);
                } else {
                    ((JTextField)this.i.getEditor().getEditorComponent()).setText(veic.getEspVeic());
                }
            }
            catch (DSGEUtilException ex) {
                this.showErrors((DSGEBaseException)ex);
            }
            try {
                CorDenatranTO codcorTO = DSENUtilHelper.getInstance().getCorDenatranTO(veic.getCCorDENATRAN());
                if (codcorTO != null) {
                    this.e.setSelectedItem((Object)codcorTO);
                } else {
                    ((JTextField)this.e.getEditor().getEditorComponent()).setText(veic.getCCorDENATRAN());
                }
            }
            catch (DSGEUtilException ex) {
                this.showErrors((DSGEBaseException)ex);
            }
            this.ao.setText(veic.getTpPint());
            this.i.setText(veic.getChassi());
            this.c.setText(veic.getCCor());
            this.E.setText(veic.getXCor());
            this.B.setText(veic.getPot());
            this.f.setText(veic.getCilin());
            this.X.setText(veic.getPesoL());
            this.W.setText(veic.getPesoB());
            this.w.setText(veic.getNSerie());
            this.v.setText(veic.getNMotor());
            this.g.setText(veic.getCMT());
            this.m.setText(veic.getDist());
            this.b.setText(veic.getAnoMod());
            this.a.setText(veic.getAnoFab());
            this.a.setSelected(veic.getVIN() != null && "R".equals(veic.getVIN().toString()));
            this.aO.setText(veic.getCMod());
            this.t.setText(veic.getLota());
        }
    }

    private void g(ProdutoNotaTO produtoNotaTO) {
        TNFe.InfNFe.Det.Prod.Med[] med = produtoNotaTO.getDetalheProduto().getProd().getMedArray();
        if (med != null) {
            for (int i = 0; i < med.length; ++i) {
                MedicamentoNotaTO medicamentoTO = new MedicamentoNotaTO();
                medicamentoTO.setValues(med[i]);
                medicamentoTO.setNItem(String.valueOf(i + 1));
                this.b.addTO((BaseTO)medicamentoTO);
            }
        }
    }

    private void h(ProdutoNotaTO produtoNotaTO) {
        TNFe.InfNFe.Det.Prod.Arma[] arma = produtoNotaTO.getDetalheProduto().getProd().getArmaArray();
        if (arma != null) {
            for (int i = 0; i < arma.length; ++i) {
                ArmaTO armaTO = new ArmaTO();
                armaTO.setValues(arma[i]);
                armaTO.setNItem(String.valueOf(i + 1));
                this.c.addTO((BaseTO)armaTO);
            }
        }
    }

    private void i(ProdutoNotaTO produtoNotaTO) throws DSGEUtilException {
        TNFe.InfNFe.Det.Imposto imposto = produtoNotaTO.getDetalheProduto().getImposto();
        TNFe.InfNFe.Det.ImpostoDevol impostoD = produtoNotaTO.getDetalheProduto().getImpostoDevol();
        if (imposto != null) {
            String vTotTrib = imposto.getVTotTrib();
            try {
                this.an.setValue(!StringHelper.isBlankOrNull((Object)vTotTrib) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(vTotTrib)) : null);
            }
            catch (Throwable t) {
                this.showErrors(t);
            }
            this.a(imposto);
            this.b(imposto);
            this.c(imposto);
            this.d(imposto);
            this.e(imposto);
            this.f(imposto);
            if (impostoD != null) {
                this.a(impostoD);
            }
            if (imposto.getISSQN() == null) {
                boolean enabled = this.a.isEnabled();
                if (!enabled) {
                    this.a.setEnabled(true);
                }
                this.a.doClick();
                this.a.setEnabled(enabled);
            } else {
                boolean enabled = this.b.isEnabled();
                if (!enabled) {
                    this.b.setEnabled(true);
                }
                this.b.doClick();
                this.b.setEnabled(enabled);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(TNFe.InfNFe.Det.Imposto imposto) {
        this.setComponentsVisible("produtoNotaTributoICMSTodos", false);
        this.limparICMS();
        TNFe.InfNFe.Det.Imposto.ICMS icms = imposto.getICMS();
        if (icms != null) {
            String tribNormICMSPercBCOpPropria = null;
            String tribNormICMSPRedBC = null;
            String tribNormICMSAliqICMS = null;
            String tribNormICMSVBC = null;
            String tribNormICMSVICMS = null;
            String tribNormSTAliqICMS = null;
            String tribNormSTBCICMS = null;
            String tribNormSTVICMS = null;
            String tribNormSTPMargemVAd = null;
            String tribNormSTPRedBC = null;
            String tribNormSTBCRetidoAnteriormente = null;
            String tribNormSTICMSRetidoAnteriormente = null;
            String tribNormSTBCRetidoUFRemetente = null;
            String tribNormSTICMSRetidoUFRemetente = null;
            String tribNormSTBCUFDestino = null;
            String tribNormSTICMSUFDestino = null;
            String tribNormICMSVICMSDeson = null;
            String tribNormICMSVICMSDesonST = null;
            String tribNormICMSVICMSOp = null;
            String tribNormICMSPDif = null;
            String tribNormICMSVICMSDif = null;
            String simplesNacionalICMSVBC = null;
            String simplesNacionalCMSPRedBC = null;
            String simplesNacionalICMSAliqICMS = null;
            String simplesNacionalICMSVICMS = null;
            String simplesNacionalSTPMargemVAd = null;
            String simplesNacionaSTPRedBC = null;
            String simplesNacionalSTVBC = null;
            String simplesNacionalSTAliqICMS = null;
            String simplesNacionalSTVICMS = null;
            String simplesNacionalCredAproveitado = null;
            String simplesNacionalAliqAplicCalcCred = null;
            String simplesNacionalSTBCRetidoAnteriormente = null;
            String simplesNacionalSTICMSRetidoAnteriormente = null;
            if (icms.getICMS00() != null) {
                TNFe.InfNFe.Det.Imposto.ICMS.ICMS00 icms00;
                this.j.setSelectedItem((Object)TipoTributacaoEnum.NORMAL);
                if (!StringHelper.isBlankOrNull((Object)icms.getICMS00().getCST())) {
                    this.H.setSelectedItem((Object)CSTEnum.getEnumPeloCodigo((String)icms.getICMS00().getCST().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)(icms00 = icms.getICMS00()).getOrig())) {
                    this.L.setSelectedItem((Object)OrigemMercadoriaEnum.getEnumPeloCodigo((String)icms00.getOrig().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)icms00.getModBC())) {
                    this.I.setSelectedItem((Object)ModBCEnum.getEnumPeloCodigo((String)icms00.getModBC().toString()));
                }
                tribNormICMSAliqICMS = icms00.getPICMS();
                tribNormICMSVBC = icms00.getVBC();
                tribNormICMSVICMS = icms00.getVICMS();
            } else if (icms.getICMS10() != null) {
                TNFe.InfNFe.Det.Imposto.ICMS.ICMS10 icms10;
                this.j.setSelectedItem((Object)TipoTributacaoEnum.NORMAL);
                if (!StringHelper.isBlankOrNull((Object)icms.getICMS10().getCST())) {
                    this.H.setSelectedItem((Object)CSTEnum.getEnumPeloCodigo((String)icms.getICMS10().getCST().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)(icms10 = icms.getICMS10()).getOrig())) {
                    this.L.setSelectedItem((Object)OrigemMercadoriaEnum.getEnumPeloCodigo((String)icms10.getOrig().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)icms10.getModBC())) {
                    this.I.setSelectedItem((Object)ModBCEnum.getEnumPeloCodigo((String)icms10.getModBC().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)icms10.getModBCST())) {
                    this.M.setSelectedItem((Object)ModBcstEnum.getEnumPeloCodigo((String)icms10.getModBCST().toString()));
                }
                tribNormICMSAliqICMS = icms10.getPICMS();
                tribNormSTAliqICMS = icms10.getPICMSST();
                tribNormSTPMargemVAd = icms10.getPMVAST();
                tribNormSTPRedBC = icms10.getPRedBCST();
                tribNormICMSVBC = icms10.getVBC();
                tribNormSTBCICMS = icms10.getVBCST();
                tribNormICMSVICMS = icms10.getVICMS();
                tribNormSTVICMS = icms10.getVICMSST();
            } else if (icms.getICMS20() != null) {
                TNFe.InfNFe.Det.Imposto.ICMS.ICMS20 icms20;
                this.j.setSelectedItem((Object)TipoTributacaoEnum.NORMAL);
                if (!StringHelper.isBlankOrNull((Object)icms.getICMS20().getCST())) {
                    this.H.setSelectedItem((Object)CSTEnum.getEnumPeloCodigo((String)icms.getICMS20().getCST().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)(icms20 = icms.getICMS20()).getOrig())) {
                    this.L.setSelectedItem((Object)OrigemMercadoriaEnum.getEnumPeloCodigo((String)icms20.getOrig().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)icms20.getModBC())) {
                    this.I.setSelectedItem((Object)ModBCEnum.getEnumPeloCodigo((String)icms20.getModBC().toString()));
                }
                tribNormICMSAliqICMS = icms20.getPICMS();
                tribNormICMSVBC = icms20.getVBC();
                tribNormICMSVICMS = icms20.getVICMS();
                tribNormICMSPRedBC = icms20.getPRedBC();
                if (!StringHelper.isBlankOrNull((Object)icms20.getMotDesICMS())) {
                    this.J.setSelectedItem((Object)MotivoDesoneracaoICMSEnum.getEnumPeloCodigo((String)icms20.getMotDesICMS().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)icms20.getVICMSDeson())) {
                    tribNormICMSVICMSDeson = icms20.getVICMSDeson();
                }
            } else if (icms.getICMS30() != null) {
                TNFe.InfNFe.Det.Imposto.ICMS.ICMS30 icms30;
                this.j.setSelectedItem((Object)TipoTributacaoEnum.NORMAL);
                if (!StringHelper.isBlankOrNull((Object)icms.getICMS30().getCST())) {
                    this.H.setSelectedItem((Object)CSTEnum.getEnumPeloCodigo((String)icms.getICMS30().getCST().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)(icms30 = icms.getICMS30()).getOrig())) {
                    this.L.setSelectedItem((Object)OrigemMercadoriaEnum.getEnumPeloCodigo((String)icms30.getOrig().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)icms30.getModBCST())) {
                    this.M.setSelectedItem((Object)ModBcstEnum.getEnumPeloCodigo((String)icms30.getModBCST().toString()));
                }
                tribNormSTAliqICMS = icms30.getPICMSST();
                tribNormSTPMargemVAd = icms30.getPMVAST();
                tribNormSTPRedBC = icms30.getPRedBCST();
                tribNormSTBCICMS = icms30.getVBCST();
                tribNormSTVICMS = icms30.getVICMSST();
                if (!StringHelper.isBlankOrNull((Object)icms30.getMotDesICMS())) {
                    this.K.setSelectedItem((Object)MotivoDesoneracaoICMSEnum.getEnumPeloCodigo((String)icms30.getMotDesICMS().toString()));
                }
                tribNormICMSVICMSDesonST = icms30.getVICMSDeson();
            } else if (icms.getICMS40() != null) {
                TNFe.InfNFe.Det.Imposto.ICMS.ICMS40 icms40;
                this.j.setSelectedItem((Object)TipoTributacaoEnum.NORMAL);
                if (!StringHelper.isBlankOrNull((Object)icms.getICMS40().getCST())) {
                    this.H.setSelectedItem((Object)CSTEnum.getEnumPeloCodigo((String)icms.getICMS40().getCST().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)(icms40 = icms.getICMS40()).getOrig())) {
                    this.L.setSelectedItem((Object)OrigemMercadoriaEnum.getEnumPeloCodigo((String)icms40.getOrig().toString()));
                }
                String codigoMotivoDesoneracao = icms40.getMotDesICMS() != null ? icms40.getMotDesICMS().toString() : null;
                this.J.setSelectedItem((Object)MotivoDesoneracaoICMSEnum.getEnumPeloCodigo((String)codigoMotivoDesoneracao));
                tribNormICMSVICMSDeson = icms40.getVICMSDeson();
            } else if (icms.getICMS51() != null) {
                TNFe.InfNFe.Det.Imposto.ICMS.ICMS51 icms51;
                this.j.setSelectedItem((Object)TipoTributacaoEnum.NORMAL);
                if (!StringHelper.isBlankOrNull((Object)icms.getICMS51().getCST())) {
                    this.H.setSelectedItem((Object)CSTEnum.getEnumPeloCodigo((String)icms.getICMS51().getCST().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)(icms51 = icms.getICMS51()).getOrig())) {
                    this.L.setSelectedItem((Object)OrigemMercadoriaEnum.getEnumPeloCodigo((String)icms51.getOrig().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)icms51.getModBC())) {
                    this.I.setSelectedItem((Object)ModBCEnum.getEnumPeloCodigo((String)icms51.getModBC().toString()));
                }
                tribNormICMSAliqICMS = icms51.getPICMS();
                tribNormICMSVBC = icms51.getVBC();
                tribNormICMSVICMS = icms51.getVICMS();
                tribNormICMSPRedBC = icms51.getPRedBC();
                tribNormICMSVICMSOp = icms51.getVICMSOp();
                tribNormICMSVICMSDif = icms51.getVICMSDif();
                tribNormICMSPDif = icms51.getPDif();
            } else if (icms.getICMS60() != null) {
                TNFe.InfNFe.Det.Imposto.ICMS.ICMS60 icms60;
                this.j.setSelectedItem((Object)TipoTributacaoEnum.NORMAL);
                if (!StringHelper.isBlankOrNull((Object)icms.getICMS60().getCST())) {
                    this.H.setSelectedItem((Object)CSTEnum.getEnumPeloCodigo((String)icms.getICMS60().getCST().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)(icms60 = icms.getICMS60()).getOrig())) {
                    this.L.setSelectedItem((Object)OrigemMercadoriaEnum.getEnumPeloCodigo((String)icms60.getOrig().toString()));
                }
                tribNormSTBCRetidoAnteriormente = icms60.getVBCSTRet();
                tribNormSTICMSRetidoAnteriormente = icms60.getVICMSSTRet();
            } else if (icms.getICMS70() != null) {
                TNFe.InfNFe.Det.Imposto.ICMS.ICMS70 icms70;
                this.j.setSelectedItem((Object)TipoTributacaoEnum.NORMAL);
                if (!StringHelper.isBlankOrNull((Object)icms.getICMS70().getCST())) {
                    this.H.setSelectedItem((Object)CSTEnum.getEnumPeloCodigo((String)icms.getICMS70().getCST().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)(icms70 = icms.getICMS70()).getOrig())) {
                    this.L.setSelectedItem((Object)OrigemMercadoriaEnum.getEnumPeloCodigo((String)icms70.getOrig().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)icms70.getModBC())) {
                    this.I.setSelectedItem((Object)ModBCEnum.getEnumPeloCodigo((String)icms70.getModBC().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)icms70.getModBCST())) {
                    this.M.setSelectedItem((Object)ModBcstEnum.getEnumPeloCodigo((String)icms70.getModBCST().toString()));
                }
                tribNormICMSAliqICMS = icms70.getPICMS();
                tribNormSTAliqICMS = icms70.getPICMSST();
                tribNormSTPMargemVAd = icms70.getPMVAST();
                tribNormSTPRedBC = icms70.getPRedBCST();
                tribNormICMSVBC = icms70.getVBC();
                tribNormSTBCICMS = icms70.getVBCST();
                tribNormICMSVICMS = icms70.getVICMS();
                tribNormSTVICMS = icms70.getVICMSST();
                tribNormICMSPRedBC = icms70.getPRedBC();
                if (!StringHelper.isBlankOrNull((Object)icms70.getMotDesICMS())) {
                    this.J.setSelectedItem((Object)MotivoDesoneracaoICMSEnum.getEnumPeloCodigo((String)icms70.getMotDesICMS().toString()));
                }
                tribNormICMSVICMSDeson = icms70.getVICMSDeson();
            } else if (icms.getICMS90() != null) {
                TNFe.InfNFe.Det.Imposto.ICMS.ICMS90 icms90;
                this.j.setSelectedItem((Object)TipoTributacaoEnum.NORMAL);
                if (!StringHelper.isBlankOrNull((Object)icms.getICMS90().getCST())) {
                    this.H.setSelectedItem((Object)CSTEnum.getEnumPeloCodigo((String)icms.getICMS90().getCST().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)(icms90 = icms.getICMS90()).getOrig())) {
                    this.L.setSelectedItem((Object)OrigemMercadoriaEnum.getEnumPeloCodigo((String)icms90.getOrig().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)icms90.getModBC())) {
                    this.I.setSelectedItem((Object)ModBCEnum.getEnumPeloCodigo((String)icms90.getModBC().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)icms90.getModBCST())) {
                    this.M.setSelectedItem((Object)ModBcstEnum.getEnumPeloCodigo((String)icms90.getModBCST().toString()));
                }
                tribNormICMSAliqICMS = icms90.getPICMS();
                tribNormSTAliqICMS = icms90.getPICMSST();
                tribNormSTPMargemVAd = icms90.getPMVAST();
                tribNormSTPRedBC = icms90.getPRedBCST();
                tribNormICMSVBC = icms90.getVBC();
                tribNormSTBCICMS = icms90.getVBCST();
                tribNormICMSVICMS = icms90.getVICMS();
                tribNormSTVICMS = icms90.getVICMSST();
                tribNormICMSPRedBC = icms90.getPRedBC();
                if (!StringHelper.isBlankOrNull((Object)icms90.getMotDesICMS())) {
                    this.J.setSelectedItem((Object)MotivoDesoneracaoICMSEnum.getEnumPeloCodigo((String)icms90.getMotDesICMS().toString()));
                }
                tribNormICMSVICMSDeson = icms90.getVICMSDeson();
            } else if (icms.getICMSPart() != null) {
                TNFe.InfNFe.Det.Imposto.ICMS.ICMSPart icmsPart;
                this.j.setSelectedItem((Object)TipoTributacaoEnum.NORMAL);
                if (!StringHelper.isBlankOrNull((Object)icms.getICMSPart().getCST())) {
                    this.H.setSelectedItem((Object)CSTEnum.getEnumPeloCodigo((String)(icms.getICMSPart().getCST().toString() + "_Part")));
                }
                if (!StringHelper.isBlankOrNull((Object)(icmsPart = icms.getICMSPart()).getOrig())) {
                    this.L.setSelectedItem((Object)OrigemMercadoriaEnum.getEnumPeloCodigo((String)icmsPart.getOrig().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)icmsPart.getModBC())) {
                    this.I.setSelectedItem((Object)ModBCEnum.getEnumPeloCodigo((String)icmsPart.getModBC().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)icmsPart.getModBCST())) {
                    this.M.setSelectedItem((Object)ModBcstEnum.getEnumPeloCodigo((String)icmsPart.getModBCST().toString()));
                }
                try {
                    if (icmsPart.getUFST() != null) {
                        EstadoTO estadoTO = DSENUtilHelper.getInstance().getEstadoTOBySigla(icmsPart.getUFST().toString());
                        this.N.setSelectedItem((Object)estadoTO);
                    }
                }
                catch (Throwable t) {
                    this.showErrors(t);
                }
                tribNormICMSAliqICMS = icmsPart.getPICMS();
                tribNormSTAliqICMS = icmsPart.getPICMSST();
                tribNormSTPMargemVAd = icmsPart.getPMVAST();
                tribNormSTPRedBC = icmsPart.getPRedBCST();
                tribNormICMSVBC = icmsPart.getVBC();
                tribNormSTBCICMS = icmsPart.getVBCST();
                tribNormICMSVICMS = icmsPart.getVICMS();
                tribNormSTVICMS = icmsPart.getVICMSST();
                tribNormICMSPRedBC = icmsPart.getPRedBC();
                tribNormICMSPercBCOpPropria = icmsPart.getPBCOp();
            } else if (icms.getICMSSN101() != null) {
                TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN101 icms101;
                this.j.setSelectedItem((Object)TipoTributacaoEnum.SIMPLES_NACIONAL);
                if (!StringHelper.isBlankOrNull((Object)icms.getICMSSN101().getCSOSN())) {
                    this.A.setSelectedItem((Object)CSOSNEnum.getEnumPeloCodigo((String)icms.getICMSSN101().getCSOSN().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)(icms101 = icms.getICMSSN101()).getOrig())) {
                    this.C.setSelectedItem((Object)OrigemMercadoriaEnum.getEnumPeloCodigo((String)icms101.getOrig().toString()));
                }
                simplesNacionalAliqAplicCalcCred = icms101.getPCredSN();
                simplesNacionalCredAproveitado = icms101.getVCredICMSSN();
            } else if (icms.getICMSSN102() != null) {
                TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN102 icms102;
                this.j.setSelectedItem((Object)TipoTributacaoEnum.SIMPLES_NACIONAL);
                if (!StringHelper.isBlankOrNull((Object)icms.getICMSSN102().getCSOSN())) {
                    this.A.setSelectedItem((Object)CSOSNEnum.getEnumPeloCodigo((String)icms.getICMSSN102().getCSOSN().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)(icms102 = icms.getICMSSN102()).getOrig())) {
                    this.C.setSelectedItem((Object)OrigemMercadoriaEnum.getEnumPeloCodigo((String)icms102.getOrig().toString()));
                }
            } else if (icms.getICMSSN201() != null) {
                TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN201 icms201;
                this.j.setSelectedItem((Object)TipoTributacaoEnum.SIMPLES_NACIONAL);
                if (!StringHelper.isBlankOrNull((Object)icms.getICMSSN201().getCSOSN())) {
                    this.A.setSelectedItem((Object)CSOSNEnum.getEnumPeloCodigo((String)icms.getICMSSN201().getCSOSN().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)(icms201 = icms.getICMSSN201()).getOrig())) {
                    this.C.setSelectedItem((Object)OrigemMercadoriaEnum.getEnumPeloCodigo((String)icms201.getOrig().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)icms201.getModBCST())) {
                    this.D.setSelectedItem((Object)ModBcstEnum.getEnumPeloCodigo((String)icms201.getModBCST().toString()));
                }
                simplesNacionalAliqAplicCalcCred = icms201.getPCredSN();
                simplesNacionalSTAliqICMS = icms201.getPICMSST();
                simplesNacionalSTPMargemVAd = icms201.getPMVAST();
                simplesNacionaSTPRedBC = icms201.getPRedBCST();
                simplesNacionalSTVBC = icms201.getVBCST();
                simplesNacionalCredAproveitado = icms201.getVCredICMSSN();
                simplesNacionalSTVICMS = icms201.getVICMSST();
            } else if (icms.getICMSSN202() != null) {
                TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN202 icms202;
                this.j.setSelectedItem((Object)TipoTributacaoEnum.SIMPLES_NACIONAL);
                if (!StringHelper.isBlankOrNull((Object)icms.getICMSSN202().getCSOSN())) {
                    this.A.setSelectedItem((Object)CSOSNEnum.getEnumPeloCodigo((String)icms.getICMSSN202().getCSOSN().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)(icms202 = icms.getICMSSN202()).getOrig())) {
                    this.C.setSelectedItem((Object)OrigemMercadoriaEnum.getEnumPeloCodigo((String)icms202.getOrig().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)icms202.getModBCST())) {
                    this.D.setSelectedItem((Object)ModBcstEnum.getEnumPeloCodigo((String)icms202.getModBCST().toString()));
                }
                simplesNacionalSTAliqICMS = icms202.getPICMSST();
                simplesNacionalSTPMargemVAd = icms202.getPMVAST();
                simplesNacionaSTPRedBC = icms202.getPRedBCST();
                simplesNacionalSTVBC = icms202.getVBCST();
                simplesNacionalSTVICMS = icms202.getVICMSST();
            } else if (icms.getICMSSN500() != null) {
                TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN500 icms500;
                this.j.setSelectedItem((Object)TipoTributacaoEnum.SIMPLES_NACIONAL);
                if (!StringHelper.isBlankOrNull((Object)icms.getICMSSN500().getCSOSN())) {
                    this.A.setSelectedItem((Object)CSOSNEnum.getEnumPeloCodigo((String)icms.getICMSSN500().getCSOSN().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)(icms500 = icms.getICMSSN500()).getOrig())) {
                    this.C.setSelectedItem((Object)OrigemMercadoriaEnum.getEnumPeloCodigo((String)icms500.getOrig().toString()));
                }
                simplesNacionalSTBCRetidoAnteriormente = icms500.getVBCSTRet();
                simplesNacionalSTICMSRetidoAnteriormente = icms500.getVICMSSTRet();
            } else if (icms.getICMSSN900() != null) {
                TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN900 icms900;
                this.j.setSelectedItem((Object)TipoTributacaoEnum.SIMPLES_NACIONAL);
                if (!StringHelper.isBlankOrNull((Object)icms.getICMSSN900().getCSOSN())) {
                    this.A.setSelectedItem((Object)CSOSNEnum.getEnumPeloCodigo((String)icms.getICMSSN900().getCSOSN().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)(icms900 = icms.getICMSSN900()).getOrig())) {
                    this.C.setSelectedItem((Object)OrigemMercadoriaEnum.getEnumPeloCodigo((String)icms900.getOrig().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)icms900.getModBC())) {
                    this.B.setSelectedItem((Object)ModBCEnum.getEnumPeloCodigo((String)icms900.getModBC().toString()));
                }
                if (!StringHelper.isBlankOrNull((Object)icms900.getModBCST())) {
                    this.D.setSelectedItem((Object)ModBcstEnum.getEnumPeloCodigo((String)icms900.getModBCST().toString()));
                }
                simplesNacionalAliqAplicCalcCred = icms900.getPCredSN();
                simplesNacionalICMSAliqICMS = icms900.getPICMS();
                simplesNacionalSTAliqICMS = icms900.getPICMSST();
                simplesNacionalSTPMargemVAd = icms900.getPMVAST();
                simplesNacionalCMSPRedBC = icms900.getPRedBC();
                simplesNacionaSTPRedBC = icms900.getPRedBCST();
                simplesNacionalICMSVBC = icms900.getVBC();
                simplesNacionalSTVBC = icms900.getVBCST();
                simplesNacionalCredAproveitado = icms900.getVCredICMSSN();
                simplesNacionalICMSVICMS = icms900.getVICMS();
                simplesNacionalSTVICMS = icms900.getVICMSST();
            } else if (icms.getICMSST() != null) {
                TNFe.InfNFe.Det.Imposto.ICMS.ICMSST icmsST;
                this.j.setSelectedItem((Object)TipoTributacaoEnum.NORMAL);
                if (!StringHelper.isBlankOrNull((Object)icms.getICMSST().getCST())) {
                    this.H.setSelectedItem((Object)CSTEnum.getEnumPeloCodigo((String)(icms.getICMSST().getCST().toString() + "_ST")));
                }
                if (!StringHelper.isBlankOrNull((Object)(icmsST = icms.getICMSST()).getOrig())) {
                    this.L.setSelectedItem((Object)OrigemMercadoriaEnum.getEnumPeloCodigo((String)icmsST.getOrig().toString()));
                }
                tribNormSTBCUFDestino = icmsST.getVBCSTDest();
                tribNormSTBCRetidoUFRemetente = icmsST.getVBCSTRet();
                tribNormSTICMSUFDestino = icmsST.getVICMSSTDest();
                tribNormSTICMSRetidoUFRemetente = icmsST.getVICMSSTRet();
            } else {
                this.l();
            }
            try {
                this.ar.setText(!StringHelper.isBlankOrNull((Object)tribNormICMSPercBCOpPropria) ? NumberFormatterHelper.getFormatter0302().valueToString(new BigDecimal(tribNormICMSPercBCOpPropria)) : null);
                this.aq.setText(!StringHelper.isBlankOrNull((Object)tribNormICMSPRedBC) ? NumberFormatterHelper.getFormatter0304().valueToString(new BigDecimal(tribNormICMSPRedBC)) : null);
                this.ap.setText(!StringHelper.isBlankOrNull((Object)tribNormICMSAliqICMS) ? NumberFormatterHelper.getFormatter0304().valueToString(new BigDecimal(tribNormICMSAliqICMS)) : null);
                this.at.setText(!StringHelper.isBlankOrNull((Object)tribNormICMSVBC) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(tribNormICMSVBC)) : null);
                this.au.setText(!StringHelper.isBlankOrNull((Object)tribNormICMSVICMS) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(tribNormICMSVICMS)) : null);
                this.az.setText(!StringHelper.isBlankOrNull((Object)tribNormSTAliqICMS) ? NumberFormatterHelper.getFormatter0304().valueToString(new BigDecimal(tribNormSTAliqICMS)) : null);
                this.aA.setText(!StringHelper.isBlankOrNull((Object)tribNormSTBCICMS) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(tribNormSTBCICMS)) : null);
                this.aJ.setText(!StringHelper.isBlankOrNull((Object)tribNormSTVICMS) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(tribNormSTVICMS)) : null);
                this.aH.setText(!StringHelper.isBlankOrNull((Object)tribNormSTPMargemVAd) ? NumberFormatterHelper.getFormatter0304().valueToString(new BigDecimal(tribNormSTPMargemVAd)) : null);
                this.aI.setText(!StringHelper.isBlankOrNull((Object)tribNormSTPRedBC) ? NumberFormatterHelper.getFormatter0304().valueToString(new BigDecimal(tribNormSTPRedBC)) : null);
                this.aB.setText(!StringHelper.isBlankOrNull((Object)tribNormSTBCRetidoAnteriormente) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(tribNormSTBCRetidoAnteriormente)) : null);
                this.aE.setText(!StringHelper.isBlankOrNull((Object)tribNormSTICMSRetidoAnteriormente) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(tribNormSTICMSRetidoAnteriormente)) : null);
                this.aC.setText(!StringHelper.isBlankOrNull((Object)tribNormSTBCRetidoUFRemetente) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(tribNormSTBCRetidoUFRemetente)) : null);
                this.aF.setText(!StringHelper.isBlankOrNull((Object)tribNormSTICMSRetidoUFRemetente) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(tribNormSTICMSRetidoUFRemetente)) : null);
                this.aD.setText(!StringHelper.isBlankOrNull((Object)tribNormSTBCUFDestino) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(tribNormSTBCUFDestino)) : null);
                this.aG.setText(!StringHelper.isBlankOrNull((Object)tribNormSTICMSUFDestino) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(tribNormSTICMSUFDestino)) : null);
                this.av.setText(!StringHelper.isBlankOrNull((Object)tribNormICMSVICMSDeson) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(tribNormICMSVICMSDeson)) : null);
                this.aw.setText(!StringHelper.isBlankOrNull((Object)tribNormICMSVICMSDesonST) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(tribNormICMSVICMSDesonST)) : null);
                this.ay.setText(!StringHelper.isBlankOrNull((Object)tribNormICMSVICMSOp) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(tribNormICMSVICMSOp)) : null);
                this.ax.setText(!StringHelper.isBlankOrNull((Object)tribNormICMSVICMSDif) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(tribNormICMSVICMSDif)) : null);
                this.as.setText(!StringHelper.isBlankOrNull((Object)tribNormICMSPDif) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(tribNormICMSPDif)) : null);
                this.af.setText(!StringHelper.isBlankOrNull((Object)simplesNacionalICMSVBC) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(simplesNacionalICMSVBC)) : null);
                this.ac.setText(!StringHelper.isBlankOrNull((Object)simplesNacionalCMSPRedBC) ? NumberFormatterHelper.getFormatter0302().valueToString(new BigDecimal(simplesNacionalCMSPRedBC)) : null);
                this.ae.setText(!StringHelper.isBlankOrNull((Object)simplesNacionalICMSAliqICMS) ? NumberFormatterHelper.getFormatter0302().valueToString(new BigDecimal(simplesNacionalICMSAliqICMS)) : null);
                this.ag.setText(!StringHelper.isBlankOrNull((Object)simplesNacionalICMSVICMS) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(simplesNacionalICMSVICMS)) : null);
                this.ak.setText(!StringHelper.isBlankOrNull((Object)simplesNacionalSTPMargemVAd) ? NumberFormatterHelper.getFormatter0302().valueToString(new BigDecimal(simplesNacionalSTPMargemVAd)) : null);
                this.aa.setText(!StringHelper.isBlankOrNull((Object)simplesNacionaSTPRedBC) ? NumberFormatterHelper.getFormatter0302().valueToString(new BigDecimal(simplesNacionaSTPRedBC)) : null);
                this.al.setText(!StringHelper.isBlankOrNull((Object)simplesNacionalSTVBC) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(simplesNacionalSTVBC)) : null);
                this.ah.setText(!StringHelper.isBlankOrNull((Object)simplesNacionalSTAliqICMS) ? NumberFormatterHelper.getFormatter0302().valueToString(new BigDecimal(simplesNacionalSTAliqICMS)) : null);
                this.am.setText(!StringHelper.isBlankOrNull((Object)simplesNacionalSTVICMS) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(simplesNacionalSTVICMS)) : null);
                this.ad.setText(!StringHelper.isBlankOrNull((Object)simplesNacionalCredAproveitado) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(simplesNacionalCredAproveitado)) : null);
                this.ab.setText(!StringHelper.isBlankOrNull((Object)simplesNacionalAliqAplicCalcCred) ? NumberFormatterHelper.getFormatter0302().valueToString(new BigDecimal(simplesNacionalAliqAplicCalcCred)) : null);
                this.ai.setText(!StringHelper.isBlankOrNull((Object)simplesNacionalSTBCRetidoAnteriormente) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(simplesNacionalSTBCRetidoAnteriormente)) : null);
                this.aj.setText(!StringHelper.isBlankOrNull((Object)simplesNacionalSTICMSRetidoAnteriormente) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(simplesNacionalSTICMSRetidoAnteriormente)) : null);
            }
            catch (Throwable t) {
                this.showErrors(t);
            }
            finally {
                if (icms.getICMS90() != null) {
                    this.o();
                }
                if (icms.getICMS60() != null) {
                    this.q();
                }
                if (icms.getICMSSN900() != null) {
                    this.n();
                }
                if (icms.getICMSSN500() != null) {
                    this.p();
                }
            }
        } else {
            this.l();
        }
    }

    private void l() {
        if (this.a != null) {
            if (RegimeTributarioEnum.SN_1.equals((Object)this.a)) {
                this.j.setSelectedItem((Object)TipoTributacaoEnum.SIMPLES_NACIONAL);
                this.A.setSelectedIndex(0);
            } else {
                this.j.setSelectedItem((Object)TipoTributacaoEnum.NORMAL);
                this.H.setSelectedIndex(0);
            }
        } else {
            this.j.setSelectedItem((Object)TipoTributacaoEnum.NORMAL);
            this.H.setSelectedIndex(0);
        }
    }

    private void b(TNFe.InfNFe.Det.Imposto imposto) {
        TIpi ipi = imposto.getIPI();
        if (ipi != null) {
            this.q.setText(ipi.getClEnq());
            this.v.setText(ipi.getCNPJProd());
            this.p.setText(ipi.getCSelo());
            this.r.setText(ipi.getQSelo() != null ? ipi.getQSelo().toString() : null);
            this.o.setText(ipi.getCEnq());
            if (ipi.getIPITrib() != null) {
                if (ipi.getIPITrib().getCST() != null) {
                    if (ipi.getIPITrib().getCST().equals((Object)TIpi.IPITrib.CST.X_00)) {
                        this.k.setSelectedItem((Object)IPIEnum.IPI_00);
                    }
                    if (ipi.getIPITrib().getCST().equals((Object)TIpi.IPITrib.CST.X_49)) {
                        this.k.setSelectedItem((Object)IPIEnum.IPI_49);
                    }
                    if (ipi.getIPITrib().getCST().equals((Object)TIpi.IPITrib.CST.X_50)) {
                        this.k.setSelectedItem((Object)IPIEnum.IPI_50);
                    }
                    if (ipi.getIPITrib().getCST().equals((Object)TIpi.IPITrib.CST.X_99)) {
                        this.k.setSelectedItem((Object)IPIEnum.IPI_99);
                    }
                }
                NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
                SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
                if (ipi.getIPITrib().getVBC() != null || ipi.getIPITrib().getPIPI() != null) {
                    this.l.setSelectedItem((Object)TipoCalculoEnum.PERCENTUAL);
                    try {
                        this.z.setText(!StringHelper.isBlankOrNull((Object)ipi.getIPITrib().getVBC()) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(ipi.getIPITrib().getVBC())) : null);
                        this.y.setText(!StringHelper.isBlankOrNull((Object)ipi.getIPITrib().getPIPI()) ? NumberFormatterHelper.getFormatter0304().valueToString(new BigDecimal(ipi.getIPITrib().getPIPI())) : null);
                    }
                    catch (ParseException parseException) {}
                } else if (ipi.getIPITrib().getQUnid() != null || ipi.getIPITrib().getVUnid() != null) {
                    this.l.setSelectedItem((Object)TipoCalculoEnum.EM_VALOR);
                    try {
                        this.s.setText(!StringHelper.isBlankOrNull((Object)ipi.getIPITrib().getQUnid()) ? NumberFormatterHelper.getFormatter1204().valueToString(new BigDecimal(ipi.getIPITrib().getQUnid())) : null);
                        this.B.setText(!StringHelper.isBlankOrNull((Object)ipi.getIPITrib().getVUnid()) ? NumberFormatterHelper.getFormatter1104().valueToString(new BigDecimal(ipi.getIPITrib().getVUnid())) : null);
                    }
                    catch (ParseException parseException) {}
                }
            } else if (ipi.getIPINT() != null && ipi.getIPINT().getCST() != null) {
                if (ipi.getIPINT().getCST().equals((Object)TIpi.IPINT.CST.X_01)) {
                    this.k.setSelectedItem((Object)IPIEnum.IPI_01);
                }
                if (ipi.getIPINT().getCST().equals((Object)TIpi.IPINT.CST.X_02)) {
                    this.k.setSelectedItem((Object)IPIEnum.IPI_02);
                }
                if (ipi.getIPINT().getCST().equals((Object)TIpi.IPINT.CST.X_03)) {
                    this.k.setSelectedItem((Object)IPIEnum.IPI_03);
                }
                if (ipi.getIPINT().getCST().equals((Object)TIpi.IPINT.CST.X_04)) {
                    this.k.setSelectedItem((Object)IPIEnum.IPI_04);
                }
                if (ipi.getIPINT().getCST().equals((Object)TIpi.IPINT.CST.X_05)) {
                    this.k.setSelectedItem((Object)IPIEnum.IPI_05);
                }
                if (ipi.getIPINT().getCST().equals((Object)TIpi.IPINT.CST.X_51)) {
                    this.k.setSelectedItem((Object)IPIEnum.IPI_51);
                }
                if (ipi.getIPINT().getCST().equals((Object)TIpi.IPINT.CST.X_52)) {
                    this.k.setSelectedItem((Object)IPIEnum.IPI_52);
                }
                if (ipi.getIPINT().getCST().equals((Object)TIpi.IPINT.CST.X_53)) {
                    this.k.setSelectedItem((Object)IPIEnum.IPI_53);
                }
                if (ipi.getIPINT().getCST().equals((Object)TIpi.IPINT.CST.X_54)) {
                    this.k.setSelectedItem((Object)IPIEnum.IPI_54);
                }
                if (ipi.getIPINT().getCST().equals((Object)TIpi.IPINT.CST.X_55)) {
                    this.k.setSelectedItem((Object)IPIEnum.IPI_55);
                }
            }
        }
    }

    private void c(TNFe.InfNFe.Det.Imposto imposto) {
        TNFe.InfNFe.Det.Imposto.PIS pis = imposto.getPIS();
        TNFe.InfNFe.Det.Imposto.PISST pisST = imposto.getPISST();
        String cst = null;
        String vBC = null;
        String pPIS = null;
        String vPIS = null;
        String qBCProd = null;
        String vAliqProd = null;
        if (pis != null) {
            if (pis.getPISAliq() != null) {
                cst = pis.getPISAliq().getCST() != null ? pis.getPISAliq().getCST().toString() : null;
                vBC = pis.getPISAliq().getVBC();
                pPIS = pis.getPISAliq().getPPIS();
                vPIS = pis.getPISAliq().getVPIS();
            } else if (pis.getPISQtde() != null) {
                cst = pis.getPISQtde().getCST() != null ? pis.getPISQtde().getCST().toString() : null;
                qBCProd = pis.getPISQtde().getQBCProd();
                vAliqProd = pis.getPISQtde().getVAliqProd();
                vPIS = pis.getPISQtde().getVPIS();
            } else if (pis.getPISNT() != null) {
                cst = pis.getPISNT().getCST() != null ? pis.getPISNT().getCST().toString() : null;
            } else if (pis.getPISOutr() != null) {
                cst = pis.getPISOutr().getCST() != null ? pis.getPISOutr().getCST().toString() : null;
                vPIS = pis.getPISOutr().getVPIS();
                vBC = pis.getPISOutr().getVBC();
                pPIS = pis.getPISOutr().getPPIS();
                qBCProd = pis.getPISOutr().getQBCProd();
                vAliqProd = pis.getPISOutr().getVAliqProd();
            }
        }
        NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
        NumberFormatter formatter0302 = NumberFormatterHelper.getFormatter0302();
        NumberFormatter formatter0304 = NumberFormatterHelper.getFormatter0304();
        NumberFormatter formatter1204 = NumberFormatterHelper.getFormatter1204();
        NumberFormatter formatter1104 = NumberFormatterHelper.getFormatter1104();
        if (cst != null) {
            PISEnum[] pisValues = PISEnum.values();
            for (int i = 0; i < pisValues.length; ++i) {
                if (!pisValues[i].getCst().equals(cst)) continue;
                this.v.setSelectedItem((Object)pisValues[i]);
                break;
            }
        }
        if (!StringHelper.isBlankOrNull((Object)vBC) || !StringHelper.isBlankOrNull((Object)pPIS)) {
            this.x.setSelectedItem((Object)TipoCalculoEnum.PERCENTUAL);
        } else if (!StringHelper.isBlankOrNull((Object)qBCProd) || !StringHelper.isBlankOrNull((Object)vAliqProd)) {
            this.x.setSelectedItem((Object)TipoCalculoEnum.EM_VALOR);
        }
        try {
            this.V.setText(vPIS != null ? formatter1302.valueToString(new BigDecimal(vPIS)) : null);
            this.U.setText(vBC != null ? formatter1302.valueToString(new BigDecimal(vBC)) : null);
            this.M.setText(pPIS != null ? formatter0304.valueToString(new BigDecimal(pPIS)) : null);
            this.N.setText(qBCProd != null ? formatter1204.valueToString(new BigDecimal(qBCProd)) : null);
            this.T.setText(vAliqProd != null ? formatter1104.valueToString(new BigDecimal(vAliqProd)) : null);
        }
        catch (ParseException pisValues) {
            // empty catch block
        }
        if (pisST != null) {
            try {
                if (!StringHelper.isBlankOrNull((Object)pisST.getVBC()) || !StringHelper.isBlankOrNull((Object)pisST.getPPIS())) {
                    this.w.setSelectedItem((Object)TipoCalculoEnum.PERCENTUAL);
                } else {
                    this.w.setSelectedItem((Object)TipoCalculoEnum.EM_VALOR);
                }
                this.S.setText(!StringHelper.isBlankOrNull((Object)pisST.getVPIS()) ? formatter1302.valueToString(new BigDecimal(pisST.getVPIS())) : null);
                this.R.setText(!StringHelper.isBlankOrNull((Object)pisST.getVBC()) ? formatter1302.valueToString(new BigDecimal(pisST.getVBC())) : null);
                this.O.setText(!StringHelper.isBlankOrNull((Object)pisST.getPPIS()) ? formatter0302.valueToString(new BigDecimal(pisST.getPPIS())) : null);
                this.P.setText(!StringHelper.isBlankOrNull((Object)pisST.getQBCProd()) ? formatter1204.valueToString(new BigDecimal(pisST.getQBCProd())) : null);
                this.Q.setText(!StringHelper.isBlankOrNull((Object)pisST.getVAliqProd()) ? formatter1104.valueToString(new BigDecimal(pisST.getVAliqProd())) : null);
            }
            catch (ParseException pisValues) {
                // empty catch block
            }
        }
    }

    private void d(TNFe.InfNFe.Det.Imposto imposto) {
        TNFe.InfNFe.Det.Imposto.COFINS cofins = imposto.getCOFINS();
        TNFe.InfNFe.Det.Imposto.COFINSST cofinsST = imposto.getCOFINSST();
        String cst = null;
        String vBC = null;
        String pCOFINS = null;
        String vCOFINS = null;
        String qBCProd = null;
        String vAliqProd = null;
        if (cofins != null) {
            if (cofins.getCOFINSAliq() != null) {
                cst = cofins.getCOFINSAliq().getCST() != null ? cofins.getCOFINSAliq().getCST().toString() : null;
                vBC = cofins.getCOFINSAliq().getVBC();
                pCOFINS = cofins.getCOFINSAliq().getPCOFINS();
                vCOFINS = cofins.getCOFINSAliq().getVCOFINS();
            } else if (cofins.getCOFINSQtde() != null) {
                cst = cofins.getCOFINSQtde().getCST() != null ? cofins.getCOFINSQtde().getCST().toString() : null;
                qBCProd = cofins.getCOFINSQtde().getQBCProd();
                vAliqProd = cofins.getCOFINSQtde().getVAliqProd();
                vCOFINS = cofins.getCOFINSQtde().getVCOFINS();
            } else if (cofins.getCOFINSNT() != null) {
                cst = cofins.getCOFINSNT().getCST() != null ? cofins.getCOFINSNT().getCST().toString() : null;
            } else if (cofins.getCOFINSOutr() != null) {
                cst = cofins.getCOFINSOutr().getCST() != null ? cofins.getCOFINSOutr().getCST().toString() : null;
                vCOFINS = cofins.getCOFINSOutr().getVCOFINS();
                vBC = cofins.getCOFINSOutr().getVBC();
                pCOFINS = cofins.getCOFINSOutr().getPCOFINS();
                qBCProd = cofins.getCOFINSOutr().getQBCProd();
                vAliqProd = cofins.getCOFINSOutr().getVAliqProd();
            }
        }
        NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
        NumberFormatter formatter0302 = NumberFormatterHelper.getFormatter0302();
        NumberFormatter formatter0304 = NumberFormatterHelper.getFormatter0304();
        NumberFormatter formatter1204 = NumberFormatterHelper.getFormatter1204();
        NumberFormatter formatter1104 = NumberFormatterHelper.getFormatter1104();
        if (cst != null) {
            COFINSEnum[] cofinsValues = COFINSEnum.values();
            for (int i = 0; i < cofinsValues.length; ++i) {
                if (!cofinsValues[i].getCst().equals(cst)) continue;
                this.b.setSelectedItem((Object)cofinsValues[i]);
                break;
            }
        }
        if (!StringHelper.isBlankOrNull((Object)vBC) || !StringHelper.isBlankOrNull((Object)pCOFINS)) {
            this.d.setSelectedItem((Object)TipoCalculoEnum.PERCENTUAL);
        } else if (!StringHelper.isBlankOrNull((Object)qBCProd) || !StringHelper.isBlankOrNull((Object)vAliqProd)) {
            this.d.setSelectedItem((Object)TipoCalculoEnum.EM_VALOR);
        }
        try {
            this.m.setText(vCOFINS != null ? formatter1302.valueToString(new BigDecimal(vCOFINS)) : null);
            this.l.setText(vBC != null ? formatter1302.valueToString(new BigDecimal(vBC)) : null);
            this.d.setText(pCOFINS != null ? formatter0304.valueToString(new BigDecimal(pCOFINS)) : null);
            this.e.setText(qBCProd != null ? formatter1204.valueToString(new BigDecimal(qBCProd)) : null);
            this.k.setText(vAliqProd != null ? formatter1104.valueToString(new BigDecimal(vAliqProd)) : null);
        }
        catch (ParseException cofinsValues) {
            // empty catch block
        }
        if (cofinsST != null) {
            try {
                if (!StringHelper.isBlankOrNull((Object)cofinsST.getVBC()) || !StringHelper.isBlankOrNull((Object)cofinsST.getPCOFINS())) {
                    this.c.setSelectedItem((Object)TipoCalculoEnum.PERCENTUAL);
                } else {
                    this.c.setSelectedItem((Object)TipoCalculoEnum.EM_VALOR);
                }
                this.j.setText(!StringHelper.isBlankOrNull((Object)cofinsST.getVCOFINS()) ? formatter1302.valueToString(new BigDecimal(cofinsST.getVCOFINS())) : null);
                this.i.setText(!StringHelper.isBlankOrNull((Object)cofinsST.getVBC()) ? formatter1302.valueToString(new BigDecimal(cofinsST.getVBC())) : null);
                this.f.setText(!StringHelper.isBlankOrNull((Object)cofinsST.getPCOFINS()) ? formatter0302.valueToString(new BigDecimal(cofinsST.getPCOFINS())) : null);
                this.g.setText(!StringHelper.isBlankOrNull((Object)cofinsST.getQBCProd()) ? formatter1204.valueToString(new BigDecimal(cofinsST.getQBCProd())) : null);
                this.h.setText(!StringHelper.isBlankOrNull((Object)cofinsST.getVAliqProd()) ? formatter1104.valueToString(new BigDecimal(cofinsST.getVAliqProd())) : null);
            }
            catch (ParseException cofinsValues) {
                // empty catch block
            }
        }
    }

    private void e(TNFe.InfNFe.Det.Imposto imposto) {
        TNFe.InfNFe.Det.Imposto.II ii = imposto.getII();
        if (ii != null) {
            NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
            try {
                this.r.setText(!StringHelper.isBlankOrNull((Object)ii.getVBC()) ? formatter1302.valueToString(new BigDecimal(ii.getVBC())) : null);
                this.s.setText(!StringHelper.isBlankOrNull((Object)ii.getVDespAdu()) ? formatter1302.valueToString(new BigDecimal(ii.getVDespAdu())) : null);
                this.t.setText(!StringHelper.isBlankOrNull((Object)ii.getVII()) ? formatter1302.valueToString(new BigDecimal(ii.getVII())) : null);
                this.u.setText(!StringHelper.isBlankOrNull((Object)ii.getVIOF()) ? formatter1302.valueToString(new BigDecimal(ii.getVIOF())) : null);
            }
            catch (ParseException parseException) {
                // empty catch block
            }
        }
    }

    private void a(TNFe.InfNFe.Det.ImpostoDevol imposto) {
        TNFe.InfNFe.Det.ImpostoDevol.IPI ipi = imposto.getIPI();
        if (ipi != null) {
            NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
            NumberFormatter formatter0302 = NumberFormatterHelper.getFormatter0302();
            try {
                this.w.setText(!StringHelper.isBlankOrNull((Object)imposto.getPDevol()) ? formatter0302.valueToString(new BigDecimal(imposto.getPDevol())) : null);
                this.x.setText(!StringHelper.isBlankOrNull((Object)ipi.getVIPIDevol()) ? formatter1302.valueToString(new BigDecimal(ipi.getVIPIDevol())) : null);
            }
            catch (ParseException parseException) {
                // empty catch block
            }
        }
    }

    private void f(TNFe.InfNFe.Det.Imposto imposto) throws DSGEUtilException {
        TNFe.InfNFe.Det.Imposto.ISSQN issqn = imposto.getISSQN();
        if (issqn != null) {
            NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
            NumberFormatter formatter0304 = NumberFormatterHelper.getFormatter0304();
            try {
                String codigoEstado;
                this.E.setText(!StringHelper.isBlankOrNull((Object)issqn.getVBC()) ? formatter1302.valueToString(new BigDecimal(issqn.getVBC())) : null);
                this.D.setText(!StringHelper.isBlankOrNull((Object)issqn.getVAliq()) ? formatter0304.valueToString(new BigDecimal(issqn.getVAliq())) : null);
                this.J.setText(!StringHelper.isBlankOrNull((Object)issqn.getVISSQN()) ? formatter1302.valueToString(new BigDecimal(issqn.getVISSQN())) : null);
                if (!StringHelper.isBlankOrNull((Object)issqn.getCMunFG())) {
                    codigoEstado = issqn.getCMunFG().substring(0, 2);
                    this.t.setSelectedItem((Object)DSENUtilHelper.getInstance().getEstadoTO(codigoEstado));
                    try {
                        this.o.setSelectedItem((Object)DSENUtilHelper.getInstance().getMunicipioTO(issqn.getCMunFG()));
                        if (issqn.getCMunFG().equalsIgnoreCase("9999999")) {
                            this.r.setSelectedItem((Object)(issqn.getCPais() != null ? DSENUtilHelper.getInstance().getPaisTO(issqn.getCPais().toString()) : null));
                        }
                    }
                    catch (DSGEUtilException ex) {
                        this.showErrors((DSGEBaseException)ex);
                    }
                }
                if (!StringHelper.isBlankOrNull((Object)issqn.getCMun())) {
                    codigoEstado = issqn.getCMun().substring(0, 2);
                    this.u.setSelectedItem((Object)DSENUtilHelper.getInstance().getEstadoTO(codigoEstado));
                    try {
                        this.n.setSelectedItem((Object)DSENUtilHelper.getInstance().getMunicipioTO(issqn.getCMun()));
                    }
                    catch (DSGEUtilException ex) {
                        this.showErrors((DSGEBaseException)ex);
                    }
                }
                this.m.setSelectedItem((Object)(issqn.getCListServ() != null ? DSENUtilHelper.getInstance().getServicoNFe310TO(issqn.getCListServ().toString()) : null));
                if (issqn.getIndISS() != null) {
                    for (ExigibilidadeISSEnum e : ExigibilidadeISSEnum.values()) {
                        if (!e.getCodigo().equalsIgnoreCase(issqn.getIndISS().toString())) continue;
                        this.p.setSelectedItem((Object)e);
                        break;
                    }
                }
                if (issqn.getIndIncentivo() != null) {
                    for (ExigibilidadeISSEnum e : IndIncentivoFiscalEnum.values()) {
                        if (!e.getCodigo().equalsIgnoreCase(issqn.getIndIncentivo().toString())) continue;
                        this.q.setSelectedItem((Object)e);
                        break;
                    }
                }
                this.G.setText(!StringHelper.isBlankOrNull((Object)issqn.getVDeducao()) ? formatter1302.valueToString(new BigDecimal(issqn.getVDeducao())) : null);
                this.L.setText(!StringHelper.isBlankOrNull((Object)issqn.getVOutro()) ? formatter1302.valueToString(new BigDecimal(issqn.getVOutro())) : null);
                this.I.setText(!StringHelper.isBlankOrNull((Object)issqn.getVDescIncond()) ? formatter1302.valueToString(new BigDecimal(issqn.getVDescIncond())) : null);
                this.H.setText(!StringHelper.isBlankOrNull((Object)issqn.getVDescCond()) ? formatter1302.valueToString(new BigDecimal(issqn.getVDescCond())) : null);
                this.K.setText(!StringHelper.isBlankOrNull((Object)issqn.getVISSRet()) ? formatter1302.valueToString(new BigDecimal(issqn.getVISSRet())) : null);
                this.F.setText(!StringHelper.isBlankOrNull((Object)issqn.getCServico()) ? issqn.getCServico() : null);
                this.C.setText(!StringHelper.isBlankOrNull((Object)issqn.getNProcesso()) ? issqn.getNProcesso() : null);
            }
            catch (ParseException arr$) {
                // empty catch block
            }
        }
    }

    private void j(ProdutoNotaTO produtoNotaTO) {
        this.a.setText(produtoNotaTO.getDetalheProduto().getInfAdProd());
    }

    private void k(ProdutoNotaTO produtoNotaTO) throws DSGEUtilException {
        TNFe.InfNFe.Det.Prod.Comb comb = produtoNotaTO.getDetalheProduto().getProd().getComb();
        if (comb != null) {
            try {
                if (comb.getCProdANP() != null) {
                    if (TcProdANP.Enum.forString((String)comb.getCProdANP().toString()) == null) {
                        this.f.setVisible(false);
                        this.k.setVisible(true);
                    } else {
                        this.f.setVisible(true);
                        this.k.setVisible(false);
                    }
                    this.k.setText(comb.getCProdANP().toString());
                    this.f.setSelectedItem(comb.getCProdANP().toString());
                }
            }
            catch (XmlValueOutOfRangeException e2) {
                String x = e2.getMessage();
                int inicio = x.indexOf("'");
                int fim = x.substring(inicio + 1).indexOf("'");
                String codigo = x.substring(inicio + 1, inicio + 1 + fim);
                if (this.b.equalsIgnoreCase("manterNotaOperacaoEdicao")) {
                    this.f.setVisible(true);
                    this.k.setVisible(false);
                    this.f.setSelectedItem(codigo);
                }
                this.f.setVisible(false);
                this.k.setVisible(true);
                this.k.setText(codigo);
            }
            this.j.setText(comb.getCODIF());
            try {
                this.p.setText(!StringHelper.isBlankOrNull((Object)comb.getQTemp()) ? NumberFormatterHelper.getFormatter1204().valueToString(new BigDecimal(comb.getQTemp())) : null);
            }
            catch (ParseException e2) {
                // empty catch block
            }
            try {
                this.o.setText(!StringHelper.isBlankOrNull((Object)comb.getPMixGN()) ? NumberFormatterHelper.getFormatter0204().valueToString(new BigDecimal(comb.getPMixGN())) : null);
            }
            catch (ParseException e2) {
                // empty catch block
            }
            if (comb.getCIDE() != null) {
                try {
                    this.n.setText(!StringHelper.isBlankOrNull((Object)comb.getCIDE().getQBCProd()) ? NumberFormatterHelper.getFormatter1204().valueToString(new BigDecimal(comb.getCIDE().getQBCProd())) : null);
                    this.q.setText(!StringHelper.isBlankOrNull((Object)comb.getCIDE().getVAliqProd()) ? NumberFormatterHelper.getFormatter1104().valueToString(new BigDecimal(comb.getCIDE().getVAliqProd())) : null);
                    this.l.setText(!StringHelper.isBlankOrNull((Object)comb.getCIDE().getVCIDE()) ? NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(comb.getCIDE().getVCIDE())) : null);
                }
                catch (ParseException e2) {
                    // empty catch block
                }
            }
            if (comb.getUFCons() != null) {
                this.g.setSelectedItem((Object)DSENUtilHelper.getInstance().getSiglaEstadoTO(comb.getUFCons().toString()));
            }
        }
    }

    private void l(ProdutoNotaTO produtoNotaTO) {
        if (produtoNotaTO.getDetalheProduto() == null) {
            produtoNotaTO.setDetalheProduto(TNFe.InfNFe.Det.Factory.newInstance());
            produtoNotaTO.getDetalheProduto().addNewProd();
        }
        this.n(produtoNotaTO);
        this.o(produtoNotaTO);
        this.t(produtoNotaTO);
        this.u(produtoNotaTO);
        this.p(produtoNotaTO);
        ProdutoEspecificoEnum produtoEspecifico = (ProdutoEspecificoEnum)this.y.getSelectedItem();
        produtoNotaTO.setProdutoEspecifico(produtoEspecifico);
        if (produtoNotaTO.getDetalheProduto().getProd().getVeicProd() != null) {
            produtoNotaTO.getDetalheProduto().getProd().unsetVeicProd();
        }
        if (produtoNotaTO.getDetalheProduto().getProd().getComb() != null) {
            produtoNotaTO.getDetalheProduto().getProd().unsetComb();
        }
        if (produtoNotaTO.getDetalheProduto().getProd().getNRECOPI() != null) {
            produtoNotaTO.getDetalheProduto().getProd().unsetNRECOPI();
        }
        produtoNotaTO.getDetalheProduto().getProd().setArmaArray(new TNFe.InfNFe.Det.Prod.Arma[0]);
        produtoNotaTO.getDetalheProduto().getProd().setMedArray(new TNFe.InfNFe.Det.Prod.Med[0]);
        if (produtoEspecifico != null) {
            if (produtoEspecifico.equals((Object)ProdutoEspecificoEnum.ARMAMENTO)) {
                this.s(produtoNotaTO);
            } else if (produtoEspecifico.equals((Object)ProdutoEspecificoEnum.MEDICAMENTO)) {
                this.r(produtoNotaTO);
            } else if (produtoEspecifico.equals((Object)ProdutoEspecificoEnum.COMBUSTIVEL)) {
                this.v(produtoNotaTO);
            } else if (produtoEspecifico.equals((Object)ProdutoEspecificoEnum.VEICULO)) {
                this.q(produtoNotaTO);
            } else if (produtoEspecifico.equals((Object)ProdutoEspecificoEnum.PAPEL_IMUNE)) {
                this.m(produtoNotaTO);
            }
        }
    }

    private void m(ProdutoNotaTO produtoNotaTO) {
        produtoNotaTO.getDetalheProduto().getProd().setNRECOPI(!StringHelper.isBlankOrNull((Object)this.z.getText()) ? this.z.getText().trim() : null);
        if (produtoNotaTO.getDetalheProduto().getProd().getNRECOPI() == null) {
            produtoNotaTO.getDetalheProduto().getProd().unsetNRECOPI();
            this.showMessage("Informe o n\u00famero de RECOPI");
            this.dispose();
        }
    }

    private void n(ProdutoNotaTO produtoNotaTO) {
        TNFe.InfNFe.Det.Prod produto = produtoNotaTO.getDetalheProduto().getProd();
        produto.setCProd(!StringHelper.isBlankOrNull((Object)this.h.getText()) ? this.h.getText().trim() : null);
        produto.setCEAN(!StringHelper.isBlankOrNull((Object)this.d.getText()) ? this.d.getText().trim() : "");
        produto.setXProd(!StringHelper.isBlankOrNull((Object)this.F.getText()) ? this.F.getText().trim() : null);
        if (this.a.isVisible()) {
            String cfop = this.a.getSelectedIndex() == -1 ? null : ((CfopTO)this.a.getSelectedItem()).getCodigo();
            produto.setCFOP(cfop != null ? TCfop.Enum.forString((String)cfop) : null);
        }
        produto.setUCom(!StringHelper.isBlankOrNull((Object)this.C.getText()) ? this.C.getText().trim() : null);
        produto.setCEANTrib(!StringHelper.isBlankOrNull((Object)this.e.getText()) ? this.e.getText().trim() : "");
        produto.setUTrib(!StringHelper.isBlankOrNull((Object)this.D.getText()) ? this.D.getText().trim() : null);
        produto.setVUnCom(!StringHelper.isBlankOrNull((Object)this.b.getText()) ? StringHelper.formataValorXML((String)this.b.getText()) : null);
        produto.setVUnTrib(!StringHelper.isBlankOrNull((Object)this.c.getText()) ? StringHelper.formataValorXML((String)this.c.getText()) : null);
        produto.setVProd(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? StringHelper.formataValorXML((String)this.a.getText()) : null);
        produto.setQTrib(!StringHelper.isBlankOrNull((Object)this.Z.getText()) ? StringHelper.formataValorXML((String)this.Z.getText()) : null);
        produto.setQCom(!StringHelper.isBlankOrNull((Object)this.Y.getText()) ? StringHelper.formataValorXML((String)this.Y.getText()) : null);
        if (!StringHelper.isBlankOrNull((Object)this.A.getText())) {
            produto.setXPed(this.A.getText().trim());
        } else if (produto.isSetXPed()) {
            produto.unsetXPed();
        }
        if (!StringHelper.isBlankOrNull((Object)this.y.getText())) {
            produto.setNItemPed(this.y.getText().trim());
        } else if (produto.isSetNItemPed()) {
            produto.unsetNItemPed();
        }
        if (!StringHelper.isBlankOrNull((Object)this.x.getText())) {
            produto.setNFCI(this.x.getText().trim());
        } else if (produto.isSetNFCI()) {
            produto.unsetNFCI();
        }
        produto.setIndTot(TNFe.InfNFe.Det.Prod.IndTot.Enum.forString((String)(this.b.isSelected() ? "1" : "0")));
        produto.setNCM(this.u.getText().trim());
        produto.setNVEArray(null);
        if (this.e.getAllTO() != null && this.e.getAllTO().size() > 0) {
            for (NVETO to : this.e.getAllTO()) {
                TNFe.InfNFe.Det.Prod.NVE nve = produto.addNewNVE();
                nve.setStringValue(to.getValorNVE());
            }
        }
        if (!StringHelper.isBlankOrNull((Object)this.n.getText())) {
            produto.setEXTIPI(this.n.getText().trim());
        } else if (produto.isSetEXTIPI()) {
            produto.unsetEXTIPI();
        }
        if (!StringHelper.isBlankOrNull((Object)this.aL.getText())) {
            produto.setVFrete(StringHelper.formataValorXML((String)this.aL.getText()));
        } else if (produto.isSetVFrete()) {
            produto.unsetVFrete();
        }
        if (!StringHelper.isBlankOrNull((Object)this.aN.getText())) {
            produto.setVSeg(StringHelper.formataValorXML((String)this.aN.getText()));
        } else if (produto.isSetVSeg()) {
            produto.unsetVSeg();
        }
        if (!StringHelper.isBlankOrNull((Object)this.aK.getText())) {
            produto.setVDesc(StringHelper.formataValorXML((String)this.aK.getText()));
        } else if (produto.isSetVDesc()) {
            produto.unsetVDesc();
        }
        if (!StringHelper.isBlankOrNull((Object)this.aM.getText())) {
            produto.setVOutro(StringHelper.formataValorXML((String)this.aM.getText()));
        } else if (produto.isSetVOutro()) {
            produto.unsetVOutro();
        }
    }

    private void o(ProdutoNotaTO produtoNotaTO) {
        List listaDI = this.a.getAllTO();
        produtoNotaTO.getDetalheProduto().getProd().setDIArray(new TNFe.InfNFe.Det.Prod.DI[0]);
        if (listaDI != null && listaDI.size() > 0) {
            for (int i = 0; i < listaDI.size(); ++i) {
                DITO diTO = (DITO)listaDI.get(i);
                TNFe.InfNFe.Det.Prod.DI di = produtoNotaTO.getDetalheProduto().getProd().addNewDI();
                if (diTO.getCExportador() != null) {
                    di.setCExportador(diTO.getCExportador());
                }
                if (diTO.getDDI() != null) {
                    di.setDDI(DateHelper.formataDataHora((Date)diTO.getDDI(), (SimpleDateFormat)DateHelper.DATE_XML_FORMAT));
                }
                if (diTO.getCNPJAE() != null) {
                    di.setCNPJ(diTO.getCNPJAE());
                }
                if (diTO.getUFAE() != null) {
                    di.setUFTerceiro(!StringHelper.isBlankOrNull((Object)diTO.getUFAE()) ? TUfEmi.Enum.forString((String)diTO.getUFAE()) : null);
                }
                if (diTO.getDDesemb() != null) {
                    di.setDDesemb(DateHelper.formataDataHora((Date)diTO.getDDesemb(), (SimpleDateFormat)DateHelper.DATE_XML_FORMAT));
                }
                if (diTO.getNDI() != null) {
                    di.setNDI(diTO.getNDI());
                }
                if (diTO.getTpViaTransp() != null) {
                    di.setTpViaTransp(TNFe.InfNFe.Det.Prod.DI.TpViaTransp.Enum.forString((String)diTO.getTpViaTransp().getCodigo()));
                }
                if (diTO.getTpIntermedio() != null) {
                    di.setTpIntermedio(TNFe.InfNFe.Det.Prod.DI.TpIntermedio.Enum.forString((String)diTO.getTpIntermedio().getCodigo()));
                }
                if (diTO.getUFDesemb() != null) {
                    di.setUFDesemb(!StringHelper.isBlankOrNull((Object)diTO.getUFDesemb()) ? TUfEmi.Enum.forString((String)diTO.getUFDesemb()) : null);
                }
                di.setXLocDesemb(diTO.getXLocDesemb());
                if (diTO.getListaAdicao() == null) continue;
                for (AdicaoTO adicaoTO : diTO.getListaAdicao()) {
                    TNFe.InfNFe.Det.Prod.DI.Adi adi = di.addNewAdi();
                    if (adicaoTO.getCFabricante() != null) {
                        adi.setCFabricante(adicaoTO.getCFabricante());
                    }
                    if (adicaoTO.getNAdicao() != null) {
                        adi.setNAdicao(adicaoTO.getNAdicao());
                    }
                    if (adicaoTO.getNSeqAdic() != null) {
                        adi.setNSeqAdic(adicaoTO.getNSeqAdic());
                    }
                    if (adicaoTO.getVDescDI() != null) {
                        adi.setVDescDI(adicaoTO.getVDescDI());
                    }
                    if (adicaoTO.getNDraw() == null) continue;
                    adi.setNDraw(adicaoTO.getNDraw());
                }
            }
        }
    }

    private void p(ProdutoNotaTO produtoNotaTO) {
        List lista = this.d.getAllTO();
        produtoNotaTO.getDetalheProduto().getProd().setDetExportArray(new TNFe.InfNFe.Det.Prod.DetExport[0]);
        if (lista != null && lista.size() > 0) {
            for (int i = 0; i < lista.size(); ++i) {
                ProdutoExportacaoTO exportTO = (ProdutoExportacaoTO)lista.get(i);
                TNFe.InfNFe.Det.Prod.DetExport export = produtoNotaTO.getDetalheProduto().getProd().addNewDetExport();
                if (exportTO.getNDraw() != null) {
                    export.setNDraw(exportTO.getNDraw());
                }
                if (exportTO.getNRE() != null || exportTO.getChNFe() != null || exportTO.getQExport() != null) {
                    export.addNewExportInd();
                    if (exportTO.getNRE() != null) {
                        export.getExportInd().setNRE(exportTO.getNRE());
                    }
                    if (exportTO.getChNFe() != null) {
                        export.getExportInd().setChNFe(exportTO.getChNFe());
                    }
                    if (exportTO.getQExport() == null) continue;
                    export.getExportInd().setQExport(StringHelper.formataValorXML((String)exportTO.getQExport()));
                    continue;
                }
                if (!export.isSetExportInd()) continue;
                export.unsetExportInd();
            }
        }
    }

    private void q(ProdutoNotaTO produtoNotaTO) {
        String tpCombStr;
        String tpVeicStr;
        String espVeicStr;
        TNFe.InfNFe.Det.Prod.VeicProd veic = produtoNotaTO.getDetalheProduto().getProd().getVeicProd();
        if (veic == null) {
            veic = produtoNotaTO.getDetalheProduto().getProd().addNewVeicProd();
        }
        RestricaoVeiculoEnum restricaoVeiculo = (RestricaoVeiculoEnum)this.z.getSelectedItem();
        TipoOperacaoEnum tpOp = (TipoOperacaoEnum)this.F.getSelectedItem();
        CondicaoVeiculoEnum condVeic = (CondicaoVeiculoEnum)this.h.getSelectedItem();
        String string = this.E.getSelectedItem() instanceof TipoCombustivelTO ? ((TipoCombustivelTO)this.E.getSelectedItem()).getCodigo() : (tpCombStr = !StringHelper.isBlankOrNull((Object)((JTextField)this.E.getEditor().getEditorComponent()).getText()) ? ((JTextField)this.E.getEditor().getEditorComponent()).getText() : null);
        String string2 = this.G.getSelectedItem() instanceof TipoVeiculoTO ? ((TipoVeiculoTO)this.G.getSelectedItem()).getCodigo() : (tpVeicStr = !StringHelper.isBlankOrNull((Object)((JTextField)this.G.getEditor().getEditorComponent()).getText()) ? ((JTextField)this.G.getEditor().getEditorComponent()).getText() : null);
        String string3 = this.i.getSelectedItem() instanceof EspecieVeiculoTO ? ((EspecieVeiculoTO)this.i.getSelectedItem()).getCodigo() : (espVeicStr = !StringHelper.isBlankOrNull((Object)((JTextField)this.i.getEditor().getEditorComponent()).getText()) ? ((JTextField)this.i.getEditor().getEditorComponent()).getText() : null);
        String cCorDenatranStr = this.e.getSelectedItem() instanceof CorDenatranTO ? ((CorDenatranTO)this.e.getSelectedItem()).getCodigo() : (!StringHelper.isBlankOrNull((Object)((JTextField)this.e.getEditor().getEditorComponent()).getText()) ? ((JTextField)this.e.getEditor().getEditorComponent()).getText() : null);
        veic.setTpRest(restricaoVeiculo != null ? TNFe.InfNFe.Det.Prod.VeicProd.TpRest.Enum.forString((String)restricaoVeiculo.getCodigo()) : null);
        veic.setTpOp(tpOp != null ? TNFe.InfNFe.Det.Prod.VeicProd.TpOp.Enum.forString((String)tpOp.getCodigo()) : null);
        veic.setChassi(!StringHelper.isBlankOrNull((Object)this.i.getText()) ? this.i.getText().trim() : null);
        veic.setCCor(!StringHelper.isBlankOrNull((Object)this.c.getText()) ? this.c.getText().trim() : null);
        veic.setTpPint(!StringHelper.isBlankOrNull((Object)this.ao.getText()) ? this.ao.getText().trim() : null);
        veic.setXCor(!StringHelper.isBlankOrNull((Object)this.E.getText()) ? this.E.getText().trim() : null);
        veic.setPot(!StringHelper.isBlankOrNull((Object)this.B.getText()) ? this.B.getText().trim() : null);
        veic.setCilin(!StringHelper.isBlankOrNull((Object)this.f.getText()) ? this.f.getText().trim() : null);
        veic.setPesoL(!StringHelper.isBlankOrNull((Object)this.X.getText()) ? this.X.getText().trim() : null);
        veic.setPesoB(!StringHelper.isBlankOrNull((Object)this.W.getText()) ? this.W.getText().trim() : null);
        veic.setNSerie(!StringHelper.isBlankOrNull((Object)this.w.getText()) ? this.w.getText().trim() : null);
        veic.setTpComb(tpCombStr);
        veic.setNMotor(!StringHelper.isBlankOrNull((Object)this.v.getText()) ? this.v.getText().trim() : null);
        veic.setCMT(!StringHelper.isBlankOrNull((Object)this.g.getText()) ? this.g.getText().trim() : null);
        veic.setDist(!StringHelper.isBlankOrNull((Object)this.m.getText()) ? this.m.getText().trim() : null);
        veic.setAnoMod(!StringHelper.isBlankOrNull((Object)this.b.getText()) ? this.b.getText().trim() : null);
        veic.setAnoFab(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? this.a.getText().trim() : null);
        veic.setTpVeic(tpVeicStr);
        veic.setEspVeic(espVeicStr);
        veic.setVIN(TNFe.InfNFe.Det.Prod.VeicProd.VIN.Enum.forString((String)(this.a.isSelected() ? "R" : "N")));
        veic.setCondVeic(condVeic != null ? TNFe.InfNFe.Det.Prod.VeicProd.CondVeic.Enum.forString((String)condVeic.getCodigo()) : null);
        veic.setCMod(!StringHelper.isBlankOrNull((Object)this.aO.getText()) ? this.aO.getText().trim() : null);
        veic.setCCorDENATRAN(cCorDenatranStr);
        veic.setLota(this.t.getText());
    }

    private void r(ProdutoNotaTO produtoNotaTO) {
        produtoNotaTO.getDetalheProduto().getProd().setMedArray(new TNFe.InfNFe.Det.Prod.Med[0]);
        List lista = this.b.getAllTO();
        if (lista != null && lista.size() > 0) {
            for (int i = 0; i < lista.size(); ++i) {
                MedicamentoNotaTO medicamentoTO = (MedicamentoNotaTO)lista.get(i);
                TNFe.InfNFe.Det.Prod.Med med = produtoNotaTO.getDetalheProduto().getProd().addNewMed();
                med.setDFab(medicamentoTO.getDFab() == null ? null : DateHelper.formataDataHora((Date)medicamentoTO.getDFab().getTime(), (SimpleDateFormat)DateHelper.DATE_XML_FORMAT));
                med.setDVal(medicamentoTO.getDVal() == null ? null : DateHelper.formataDataHora((Date)medicamentoTO.getDVal().getTime(), (SimpleDateFormat)DateHelper.DATE_XML_FORMAT));
                med.setNLote(medicamentoTO.getNLote());
                med.setQLote(medicamentoTO.getQLote());
                med.setVPMC(medicamentoTO.getVPMC());
            }
        } else {
            produtoNotaTO.getDetalheProduto().getProd().addNewMed();
        }
    }

    private void s(ProdutoNotaTO produtoNotaTO) {
        produtoNotaTO.getDetalheProduto().getProd().setArmaArray(new TNFe.InfNFe.Det.Prod.Arma[0]);
        List lista = this.c.getAllTO();
        if (lista != null && lista.size() > 0) {
            for (int i = 0; i < lista.size(); ++i) {
                ArmaTO armaTO = (ArmaTO)lista.get(i);
                TNFe.InfNFe.Det.Prod.Arma arma = produtoNotaTO.getDetalheProduto().getProd().addNewArma();
                arma.setDescr(armaTO.getDescr());
                arma.setNCano(armaTO.getNCano());
                arma.setNSerie(armaTO.getNSerie());
                arma.setTpArma(armaTO.getTpArma() != null ? TNFe.InfNFe.Det.Prod.Arma.TpArma.Enum.forString((String)armaTO.getTpArma()) : null);
            }
        } else {
            produtoNotaTO.getDetalheProduto().getProd().addNewArma();
        }
    }

    private void t(ProdutoNotaTO produtoNotaTO) {
        if (produtoNotaTO.getDetalheProduto().getImposto() == null) {
            produtoNotaTO.getDetalheProduto().addNewImposto();
        }
        if (produtoNotaTO.getDetalheProduto().getImpostoDevol() == null) {
            produtoNotaTO.getDetalheProduto().addNewImpostoDevol();
        }
        if (!StringHelper.isBlankOrNull((Object)this.an.getText())) {
            produtoNotaTO.getDetalheProduto().getImposto().setVTotTrib(StringHelper.formataValorXML((String)this.an.getText()));
        } else if (produtoNotaTO.getDetalheProduto().getImposto().getVTotTrib() != null) {
            produtoNotaTO.getDetalheProduto().getImposto().unsetVTotTrib();
        }
        this.g(produtoNotaTO.getDetalheProduto().getImposto());
        this.h(produtoNotaTO.getDetalheProduto().getImposto());
        this.i(produtoNotaTO.getDetalheProduto().getImposto());
        this.j(produtoNotaTO.getDetalheProduto().getImposto());
        this.k(produtoNotaTO.getDetalheProduto().getImposto());
        this.l(produtoNotaTO.getDetalheProduto().getImposto());
        this.a(produtoNotaTO.getDetalheProduto());
    }

    private void g(TNFe.InfNFe.Det.Imposto imposto) {
        if (imposto.isSetICMS()) {
            imposto.unsetICMS();
        }
        if (!this.a.isSelected()) {
            return;
        }
        TipoTributacaoEnum tipoTributacao = (TipoTributacaoEnum)this.j.getSelectedItem();
        if (TipoTributacaoEnum.NORMAL.equals((Object)tipoTributacao)) {
            TNFe.InfNFe.Det.Imposto.ICMS icms = imposto.addNewICMS();
            CSTEnum cst = (CSTEnum)this.H.getSelectedItem();
            if (cst == null) {
                imposto.unsetICMS();
            } else if (cst != null) {
                switch (6.a[cst.ordinal()]) {
                    case 1: {
                        TNFe.InfNFe.Det.Imposto.ICMS.ICMS00 icms00 = icms.addNewICMS00();
                        icms00.setCST(TNFe.InfNFe.Det.Imposto.ICMS.ICMS00.CST.Enum.forString((String)cst.getCst()));
                        if (this.L.getSelectedItem() != null) {
                            icms00.setOrig(Torig.Enum.forString((String)((OrigemMercadoriaEnum)this.L.getSelectedItem()).getCodigo()));
                        }
                        if (this.I.getSelectedItem() != null) {
                            icms00.setModBC(TNFe.InfNFe.Det.Imposto.ICMS.ICMS00.ModBC.Enum.forString((String)((ModBCEnum)this.I.getSelectedItem()).getCodigo()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.at.getText())) {
                            icms00.setVBC(StringHelper.formataValorXML((String)this.at.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.ap.getText())) {
                            icms00.setPICMS(StringHelper.formataValorXML((String)this.ap.getText()));
                        }
                        if (StringHelper.isBlankOrNull((Object)this.au.getText())) break;
                        icms00.setVICMS(StringHelper.formataValorXML((String)this.au.getText()));
                        break;
                    }
                    case 2: {
                        TNFe.InfNFe.Det.Imposto.ICMS.ICMS10 icms10 = icms.addNewICMS10();
                        icms10.setCST(TNFe.InfNFe.Det.Imposto.ICMS.ICMS10.CST.Enum.forString((String)cst.getCst()));
                        if (this.L.getSelectedItem() != null) {
                            icms10.setOrig(Torig.Enum.forString((String)((OrigemMercadoriaEnum)this.L.getSelectedItem()).getCodigo()));
                        }
                        if (this.I.getSelectedItem() != null) {
                            icms10.setModBC(TNFe.InfNFe.Det.Imposto.ICMS.ICMS10.ModBC.Enum.forString((String)((ModBCEnum)this.I.getSelectedItem()).getCodigo()));
                        }
                        if (this.M.getSelectedItem() != null) {
                            icms10.setModBCST(TNFe.InfNFe.Det.Imposto.ICMS.ICMS10.ModBCST.Enum.forString((String)((ModBcstEnum)this.M.getSelectedItem()).getCodigo()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.at.getText())) {
                            icms10.setVBC(StringHelper.formataValorXML((String)this.at.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.ap.getText())) {
                            icms10.setPICMS(StringHelper.formataValorXML((String)this.ap.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aA.getText())) {
                            icms10.setVBCST(StringHelper.formataValorXML((String)this.aA.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.az.getText())) {
                            icms10.setPICMSST(StringHelper.formataValorXML((String)this.az.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.au.getText())) {
                            icms10.setVICMS(StringHelper.formataValorXML((String)this.au.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aJ.getText())) {
                            icms10.setVICMSST(StringHelper.formataValorXML((String)this.aJ.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aH.getText())) {
                            icms10.setPMVAST(StringHelper.formataValorXML((String)this.aH.getText()));
                        }
                        if (StringHelper.isBlankOrNull((Object)this.aI.getText())) break;
                        icms10.setPRedBCST(StringHelper.formataValorXML((String)this.aI.getText()));
                        break;
                    }
                    case 3: {
                        TNFe.InfNFe.Det.Imposto.ICMS.ICMS20 icms20 = icms.addNewICMS20();
                        icms20.setCST(TNFe.InfNFe.Det.Imposto.ICMS.ICMS20.CST.Enum.forString((String)cst.getCst()));
                        if (this.L.getSelectedItem() != null) {
                            icms20.setOrig(Torig.Enum.forString((String)((OrigemMercadoriaEnum)this.L.getSelectedItem()).getCodigo()));
                        }
                        if (this.I.getSelectedItem() != null) {
                            icms20.setModBC(TNFe.InfNFe.Det.Imposto.ICMS.ICMS20.ModBC.Enum.forString((String)((ModBCEnum)this.I.getSelectedItem()).getCodigo()));
                        }
                        if (this.J.getSelectedItem() != null) {
                            MotivoDesoneracaoICMSEnum motivoDesoneracao = (MotivoDesoneracaoICMSEnum)this.J.getSelectedItem();
                            icms20.setMotDesICMS(TNFe.InfNFe.Det.Imposto.ICMS.ICMS20.MotDesICMS.Enum.forString((String)motivoDesoneracao.getCodigo()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.av.getText())) {
                            icms20.setVICMSDeson(StringHelper.formataValorXML((String)this.av.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.at.getText())) {
                            icms20.setVBC(StringHelper.formataValorXML((String)this.at.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.ap.getText())) {
                            icms20.setPICMS(StringHelper.formataValorXML((String)this.ap.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.au.getText())) {
                            icms20.setVICMS(StringHelper.formataValorXML((String)this.au.getText()));
                        }
                        if (StringHelper.isBlankOrNull((Object)this.aq.getText())) break;
                        icms20.setPRedBC(StringHelper.formataValorXML((String)this.aq.getText()));
                        break;
                    }
                    case 4: {
                        TNFe.InfNFe.Det.Imposto.ICMS.ICMS30 icms30 = icms.addNewICMS30();
                        icms30.setCST(TNFe.InfNFe.Det.Imposto.ICMS.ICMS30.CST.Enum.forString((String)cst.getCst()));
                        if (this.L.getSelectedItem() != null) {
                            icms30.setOrig(Torig.Enum.forString((String)((OrigemMercadoriaEnum)this.L.getSelectedItem()).getCodigo()));
                        }
                        if (this.M.getSelectedItem() != null) {
                            icms30.setModBCST(TNFe.InfNFe.Det.Imposto.ICMS.ICMS30.ModBCST.Enum.forString((String)((ModBcstEnum)this.M.getSelectedItem()).getCodigo()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aA.getText())) {
                            icms30.setVBCST(StringHelper.formataValorXML((String)this.aA.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.az.getText())) {
                            icms30.setPICMSST(StringHelper.formataValorXML((String)this.az.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aJ.getText())) {
                            icms30.setVICMSST(StringHelper.formataValorXML((String)this.aJ.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aH.getText())) {
                            icms30.setPMVAST(StringHelper.formataValorXML((String)this.aH.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aI.getText())) {
                            icms30.setPRedBCST(StringHelper.formataValorXML((String)this.aI.getText()));
                        }
                        if (this.K.getSelectedItem() != null) {
                            MotivoDesoneracaoICMSEnum motivoDesoneracao = (MotivoDesoneracaoICMSEnum)this.K.getSelectedItem();
                            icms30.setMotDesICMS(TNFe.InfNFe.Det.Imposto.ICMS.ICMS30.MotDesICMS.Enum.forString((String)motivoDesoneracao.getCodigo()));
                        }
                        if (StringHelper.isBlankOrNull((Object)this.av.getText())) break;
                        icms30.setVICMSDeson(StringHelper.formataValorXML((String)this.av.getText()));
                        break;
                    }
                    case 5: 
                    case 6: 
                    case 7: {
                        MotivoDesoneracaoICMSEnum motivoDesoneracao;
                        TNFe.InfNFe.Det.Imposto.ICMS.ICMS40 icms40 = icms.addNewICMS40();
                        icms40.setCST(TNFe.InfNFe.Det.Imposto.ICMS.ICMS40.CST.Enum.forString((String)cst.getCst()));
                        if (this.L.getSelectedItem() != null) {
                            icms40.setOrig(Torig.Enum.forString((String)((OrigemMercadoriaEnum)this.L.getSelectedItem()).getCodigo()));
                        }
                        if ((motivoDesoneracao = (MotivoDesoneracaoICMSEnum)this.J.getSelectedItem()) != null) {
                            icms40.setMotDesICMS(TNFe.InfNFe.Det.Imposto.ICMS.ICMS40.MotDesICMS.Enum.forString((String)motivoDesoneracao.getCodigo()));
                        }
                        if (StringHelper.isBlankOrNull((Object)this.av.getText())) break;
                        icms40.setVICMSDeson(StringHelper.formataValorXML((String)this.av.getText()));
                        break;
                    }
                    case 8: {
                        TNFe.InfNFe.Det.Imposto.ICMS.ICMSST icmsST = icms.addNewICMSST();
                        icmsST.setCST(TNFe.InfNFe.Det.Imposto.ICMS.ICMSST.CST.Enum.forString((String)cst.getCst().replaceFirst("_ST", "")));
                        if (this.L.getSelectedItem() != null) {
                            icmsST.setOrig(Torig.Enum.forString((String)((OrigemMercadoriaEnum)this.L.getSelectedItem()).getCodigo()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aC.getText())) {
                            icmsST.setVBCSTRet(StringHelper.formataValorXML((String)this.aC.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aF.getText())) {
                            icmsST.setVICMSSTRet(StringHelper.formataValorXML((String)this.aF.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aD.getText())) {
                            icmsST.setVBCSTDest(StringHelper.formataValorXML((String)this.aD.getText()));
                        }
                        if (StringHelper.isBlankOrNull((Object)this.aG.getText())) break;
                        icmsST.setVICMSSTDest(StringHelper.formataValorXML((String)this.aG.getText()));
                        break;
                    }
                    case 9: {
                        TNFe.InfNFe.Det.Imposto.ICMS.ICMS51 icms51 = icms.addNewICMS51();
                        icms51.setCST(TNFe.InfNFe.Det.Imposto.ICMS.ICMS51.CST.Enum.forString((String)cst.getCst()));
                        if (this.L.getSelectedItem() != null) {
                            icms51.setOrig(Torig.Enum.forString((String)((OrigemMercadoriaEnum)this.L.getSelectedItem()).getCodigo()));
                        }
                        if (this.I.getSelectedItem() != null) {
                            icms51.setModBC(TNFe.InfNFe.Det.Imposto.ICMS.ICMS51.ModBC.Enum.forString((String)((ModBCEnum)this.I.getSelectedItem()).getCodigo()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.at.getText())) {
                            icms51.setVBC(StringHelper.formataValorXML((String)this.at.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.ap.getText())) {
                            icms51.setPICMS(StringHelper.formataValorXML((String)this.ap.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.au.getText())) {
                            icms51.setVICMS(StringHelper.formataValorXML((String)this.au.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aq.getText())) {
                            icms51.setPRedBC(StringHelper.formataValorXML((String)this.aq.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.ay.getText())) {
                            icms51.setVICMSOp(StringHelper.formataValorXML((String)this.ay.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.ax.getText())) {
                            icms51.setVICMSDif(StringHelper.formataValorXML((String)this.ax.getText()));
                        }
                        if (StringHelper.isBlankOrNull((Object)this.as.getText())) break;
                        icms51.setPDif(StringHelper.formataValorXML((String)this.as.getText()));
                        break;
                    }
                    case 10: {
                        TNFe.InfNFe.Det.Imposto.ICMS.ICMS60 icms60 = icms.addNewICMS60();
                        icms60.setCST(TNFe.InfNFe.Det.Imposto.ICMS.ICMS60.CST.Enum.forString((String)cst.getCst()));
                        if (this.L.getSelectedItem() != null) {
                            icms60.setOrig(Torig.Enum.forString((String)((OrigemMercadoriaEnum)this.L.getSelectedItem()).getCodigo()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aB.getText())) {
                            icms60.setVBCSTRet(StringHelper.formataValorXML((String)this.aB.getText()));
                        }
                        if (StringHelper.isBlankOrNull((Object)this.aE.getText())) break;
                        icms60.setVICMSSTRet(StringHelper.formataValorXML((String)this.aE.getText()));
                        break;
                    }
                    case 11: {
                        TNFe.InfNFe.Det.Imposto.ICMS.ICMS70 icms70 = icms.addNewICMS70();
                        icms70.setCST(TNFe.InfNFe.Det.Imposto.ICMS.ICMS70.CST.Enum.forString((String)cst.getCst()));
                        if (this.L.getSelectedItem() != null) {
                            icms70.setOrig(Torig.Enum.forString((String)((OrigemMercadoriaEnum)this.L.getSelectedItem()).getCodigo()));
                        }
                        if (this.I.getSelectedItem() != null) {
                            icms70.setModBC(TNFe.InfNFe.Det.Imposto.ICMS.ICMS70.ModBC.Enum.forString((String)((ModBCEnum)this.I.getSelectedItem()).getCodigo()));
                        }
                        if (this.M.getSelectedItem() != null) {
                            icms70.setModBCST(TNFe.InfNFe.Det.Imposto.ICMS.ICMS70.ModBCST.Enum.forString((String)((ModBcstEnum)this.M.getSelectedItem()).getCodigo()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.at.getText())) {
                            icms70.setVBC(StringHelper.formataValorXML((String)this.at.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.ap.getText())) {
                            icms70.setPICMS(StringHelper.formataValorXML((String)this.ap.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.au.getText())) {
                            icms70.setVICMS(StringHelper.formataValorXML((String)this.au.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aq.getText())) {
                            icms70.setPRedBC(StringHelper.formataValorXML((String)this.aq.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aA.getText())) {
                            icms70.setVBCST(StringHelper.formataValorXML((String)this.aA.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.az.getText())) {
                            icms70.setPICMSST(StringHelper.formataValorXML((String)this.az.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aJ.getText())) {
                            icms70.setVICMSST(StringHelper.formataValorXML((String)this.aJ.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aH.getText())) {
                            icms70.setPMVAST(StringHelper.formataValorXML((String)this.aH.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aI.getText())) {
                            icms70.setPRedBCST(StringHelper.formataValorXML((String)this.aI.getText()));
                        }
                        if (this.J.getSelectedItem() != null) {
                            MotivoDesoneracaoICMSEnum motivoDesoneracao = (MotivoDesoneracaoICMSEnum)this.J.getSelectedItem();
                            icms70.setMotDesICMS(TNFe.InfNFe.Det.Imposto.ICMS.ICMS70.MotDesICMS.Enum.forString((String)motivoDesoneracao.getCodigo()));
                        }
                        if (StringHelper.isBlankOrNull((Object)this.av.getText())) break;
                        icms70.setVICMSDeson(StringHelper.formataValorXML((String)this.av.getText()));
                        break;
                    }
                    case 12: {
                        TNFe.InfNFe.Det.Imposto.ICMS.ICMS90 icms90 = icms.addNewICMS90();
                        icms90.setCST(TNFe.InfNFe.Det.Imposto.ICMS.ICMS90.CST.Enum.forString((String)cst.getCst()));
                        if (this.L.getSelectedItem() != null) {
                            icms90.setOrig(Torig.Enum.forString((String)((OrigemMercadoriaEnum)this.L.getSelectedItem()).getCodigo()));
                        }
                        if (this.I.getSelectedItem() != null) {
                            icms90.setModBC(TNFe.InfNFe.Det.Imposto.ICMS.ICMS90.ModBC.Enum.forString((String)((ModBCEnum)this.I.getSelectedItem()).getCodigo()));
                        }
                        if (this.M.getSelectedItem() != null) {
                            icms90.setModBCST(TNFe.InfNFe.Det.Imposto.ICMS.ICMS90.ModBCST.Enum.forString((String)((ModBcstEnum)this.M.getSelectedItem()).getCodigo()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.at.getText())) {
                            icms90.setVBC(StringHelper.formataValorXML((String)this.at.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.ap.getText())) {
                            icms90.setPICMS(StringHelper.formataValorXML((String)this.ap.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.au.getText())) {
                            icms90.setVICMS(StringHelper.formataValorXML((String)this.au.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aq.getText())) {
                            icms90.setPRedBC(StringHelper.formataValorXML((String)this.aq.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aA.getText())) {
                            icms90.setVBCST(StringHelper.formataValorXML((String)this.aA.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.az.getText())) {
                            icms90.setPICMSST(StringHelper.formataValorXML((String)this.az.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aJ.getText())) {
                            icms90.setVICMSST(StringHelper.formataValorXML((String)this.aJ.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aH.getText())) {
                            icms90.setPMVAST(StringHelper.formataValorXML((String)this.aH.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aI.getText())) {
                            icms90.setPRedBCST(StringHelper.formataValorXML((String)this.aI.getText()));
                        }
                        if (this.J.getSelectedItem() != null) {
                            MotivoDesoneracaoICMSEnum motivoDesoneracao = (MotivoDesoneracaoICMSEnum)this.J.getSelectedItem();
                            icms90.setMotDesICMS(TNFe.InfNFe.Det.Imposto.ICMS.ICMS90.MotDesICMS.Enum.forString((String)motivoDesoneracao.getCodigo()));
                        }
                        if (StringHelper.isBlankOrNull((Object)this.av.getText())) break;
                        icms90.setVICMSDeson(StringHelper.formataValorXML((String)this.av.getText()));
                        break;
                    }
                    case 13: 
                    case 14: {
                        TNFe.InfNFe.Det.Imposto.ICMS.ICMSPart icmsPart = icms.addNewICMSPart();
                        icmsPart.setCST(TNFe.InfNFe.Det.Imposto.ICMS.ICMSPart.CST.Enum.forString((String)cst.getCst().replaceFirst("_Part", "")));
                        if (this.L.getSelectedItem() != null) {
                            icmsPart.setOrig(Torig.Enum.forString((String)((OrigemMercadoriaEnum)this.L.getSelectedItem()).getCodigo()));
                        }
                        if (this.N.getSelectedItem() != null) {
                            icmsPart.setUFST(TUf.Enum.forString((String)((EstadoTO)this.N.getSelectedItem()).getSigla()));
                        }
                        if (this.I.getSelectedItem() != null) {
                            icmsPart.setModBC(TNFe.InfNFe.Det.Imposto.ICMS.ICMSPart.ModBC.Enum.forString((String)((ModBCEnum)this.I.getSelectedItem()).getCodigo()));
                        }
                        if (this.M.getSelectedItem() != null) {
                            icmsPart.setModBCST(TNFe.InfNFe.Det.Imposto.ICMS.ICMSPart.ModBCST.Enum.forString((String)((ModBcstEnum)this.M.getSelectedItem()).getCodigo()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.at.getText())) {
                            icmsPart.setVBC(StringHelper.formataValorXML((String)this.at.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.ap.getText())) {
                            icmsPart.setPICMS(StringHelper.formataValorXML((String)this.ap.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.au.getText())) {
                            icmsPart.setVICMS(StringHelper.formataValorXML((String)this.au.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aq.getText())) {
                            icmsPart.setPRedBC(StringHelper.formataValorXML((String)this.aq.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aA.getText())) {
                            icmsPart.setVBCST(StringHelper.formataValorXML((String)this.aA.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.az.getText())) {
                            icmsPart.setPICMSST(StringHelper.formataValorXML((String)this.az.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aJ.getText())) {
                            icmsPart.setVICMSST(StringHelper.formataValorXML((String)this.aJ.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aH.getText())) {
                            icmsPart.setPMVAST(StringHelper.formataValorXML((String)this.aH.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aI.getText())) {
                            icmsPart.setPRedBCST(StringHelper.formataValorXML((String)this.aI.getText()));
                        }
                        if (StringHelper.isBlankOrNull((Object)this.ar.getText())) break;
                        icmsPart.setPBCOp(StringHelper.formataValorXML((String)this.ar.getText()));
                        break;
                    }
                }
            }
        } else if (TipoTributacaoEnum.SIMPLES_NACIONAL.equals((Object)tipoTributacao)) {
            TNFe.InfNFe.Det.Imposto.ICMS icms = imposto.addNewICMS();
            CSOSNEnum csosn = (CSOSNEnum)this.A.getSelectedItem();
            if (csosn == null) {
                imposto.unsetICMS();
            } else if (csosn != null) {
                switch (6.b[csosn.ordinal()]) {
                    case 1: {
                        TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN101 icms101 = icms.addNewICMSSN101();
                        icms101.setCSOSN(TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN101.CSOSN.Enum.forString((String)csosn.getCsosn()));
                        if (this.C.getSelectedItem() != null) {
                            icms101.setOrig(Torig.Enum.forString((String)((OrigemMercadoriaEnum)this.C.getSelectedItem()).getCodigo()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.ad.getText())) {
                            icms101.setVCredICMSSN(StringHelper.formataValorXML((String)this.ad.getText()));
                        }
                        if (StringHelper.isBlankOrNull((Object)this.ab.getText())) break;
                        icms101.setPCredSN(StringHelper.formataValorXML((String)this.ab.getText()));
                        break;
                    }
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: {
                        TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN102 icms102 = icms.addNewICMSSN102();
                        icms102.setCSOSN(TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN102.CSOSN.Enum.forString((String)csosn.getCsosn()));
                        if (this.C.getSelectedItem() == null) break;
                        icms102.setOrig(Torig.Enum.forString((String)((OrigemMercadoriaEnum)this.C.getSelectedItem()).getCodigo()));
                        break;
                    }
                    case 6: {
                        TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN201 icms201 = icms.addNewICMSSN201();
                        icms201.setCSOSN(TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN201.CSOSN.Enum.forString((String)csosn.getCsosn()));
                        if (this.C.getSelectedItem() != null) {
                            icms201.setOrig(Torig.Enum.forString((String)((OrigemMercadoriaEnum)this.C.getSelectedItem()).getCodigo()));
                        }
                        if (this.D.getSelectedItem() != null) {
                            icms201.setModBCST(TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN201.ModBCST.Enum.forString((String)((ModBcstEnum)this.D.getSelectedItem()).getCodigo()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.al.getText())) {
                            icms201.setVBCST(StringHelper.formataValorXML((String)this.al.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.ah.getText())) {
                            icms201.setPICMSST(StringHelper.formataValorXML((String)this.ah.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.ak.getText())) {
                            icms201.setPMVAST(StringHelper.formataValorXML((String)this.ak.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aa.getText())) {
                            icms201.setPRedBCST(StringHelper.formataValorXML((String)this.aa.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.am.getText())) {
                            icms201.setVICMSST(StringHelper.formataValorXML((String)this.am.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.ad.getText())) {
                            icms201.setVCredICMSSN(StringHelper.formataValorXML((String)this.ad.getText()));
                        }
                        if (StringHelper.isBlankOrNull((Object)this.ab.getText())) break;
                        icms201.setPCredSN(StringHelper.formataValorXML((String)this.ab.getText()));
                        break;
                    }
                    case 7: 
                    case 8: {
                        TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN202 icms202 = icms.addNewICMSSN202();
                        icms202.setCSOSN(TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN202.CSOSN.Enum.forString((String)csosn.getCsosn()));
                        if (this.C.getSelectedItem() != null) {
                            icms202.setOrig(Torig.Enum.forString((String)((OrigemMercadoriaEnum)this.C.getSelectedItem()).getCodigo()));
                        }
                        if (this.D.getSelectedItem() != null) {
                            icms202.setModBCST(TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN202.ModBCST.Enum.forString((String)((ModBcstEnum)this.D.getSelectedItem()).getCodigo()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.al.getText())) {
                            icms202.setVBCST(StringHelper.formataValorXML((String)this.al.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.ah.getText())) {
                            icms202.setPICMSST(StringHelper.formataValorXML((String)this.ah.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.ak.getText())) {
                            icms202.setPMVAST(StringHelper.formataValorXML((String)this.ak.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aa.getText())) {
                            icms202.setPRedBCST(StringHelper.formataValorXML((String)this.aa.getText()));
                        }
                        if (StringHelper.isBlankOrNull((Object)this.am.getText())) break;
                        icms202.setVICMSST(StringHelper.formataValorXML((String)this.am.getText()));
                        break;
                    }
                    case 9: {
                        TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN500 icms500 = icms.addNewICMSSN500();
                        icms500.setCSOSN(TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN500.CSOSN.Enum.forString((String)csosn.getCsosn()));
                        if (this.C.getSelectedItem() != null) {
                            icms500.setOrig(Torig.Enum.forString((String)((OrigemMercadoriaEnum)this.C.getSelectedItem()).getCodigo()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.ai.getText())) {
                            icms500.setVBCSTRet(StringHelper.formataValorXML((String)this.ai.getText()));
                        }
                        if (StringHelper.isBlankOrNull((Object)this.aj.getText())) break;
                        icms500.setVICMSSTRet(StringHelper.formataValorXML((String)this.aj.getText()));
                        break;
                    }
                    case 10: {
                        TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN900 icms900 = icms.addNewICMSSN900();
                        icms900.setCSOSN(TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN900.CSOSN.Enum.forString((String)csosn.getCsosn()));
                        if (this.C.getSelectedItem() != null) {
                            icms900.setOrig(Torig.Enum.forString((String)((OrigemMercadoriaEnum)this.C.getSelectedItem()).getCodigo()));
                        }
                        if (this.B.getSelectedItem() != null) {
                            icms900.setModBC(TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN900.ModBC.Enum.forString((String)((ModBCEnum)this.B.getSelectedItem()).getCodigo()));
                        }
                        if (this.D.getSelectedItem() != null) {
                            icms900.setModBCST(TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN900.ModBCST.Enum.forString((String)((ModBcstEnum)this.D.getSelectedItem()).getCodigo()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.af.getText())) {
                            icms900.setVBC(StringHelper.formataValorXML((String)this.af.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.ae.getText())) {
                            icms900.setPICMS(StringHelper.formataValorXML((String)this.ae.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.ac.getText())) {
                            icms900.setPRedBC(StringHelper.formataValorXML((String)this.ac.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.ag.getText())) {
                            icms900.setVICMS(StringHelper.formataValorXML((String)this.ag.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.al.getText())) {
                            icms900.setVBCST(StringHelper.formataValorXML((String)this.al.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.ah.getText())) {
                            icms900.setPICMSST(StringHelper.formataValorXML((String)this.ah.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.ak.getText())) {
                            icms900.setPMVAST(StringHelper.formataValorXML((String)this.ak.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.aa.getText())) {
                            icms900.setPRedBCST(StringHelper.formataValorXML((String)this.aa.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.am.getText())) {
                            icms900.setVICMSST(StringHelper.formataValorXML((String)this.am.getText()));
                        }
                        if (!StringHelper.isBlankOrNull((Object)this.ad.getText())) {
                            icms900.setVCredICMSSN(StringHelper.formataValorXML((String)this.ad.getText()));
                        }
                        if (StringHelper.isBlankOrNull((Object)this.ab.getText())) break;
                        icms900.setPCredSN(StringHelper.formataValorXML((String)this.ab.getText()));
                        break;
                    }
                }
            }
        }
    }

    private void h(TNFe.InfNFe.Det.Imposto imposto) {
        TIpi ipi = imposto.getIPI() != null ? imposto.getIPI() : imposto.addNewIPI();
        IPIEnum ipiCST = null;
        TipoCalculoEnum tpCalculo = null;
        String cnpj = null;
        if (this.k.getSelectedItem() != null && !this.k.getSelectedItem().equals("")) {
            ipiCST = (IPIEnum)this.k.getSelectedItem();
        }
        if (this.l.getSelectedItem() != null && !this.l.getSelectedItem().equals("")) {
            tpCalculo = (TipoCalculoEnum)this.l.getSelectedItem();
        }
        try {
            cnpj = this.a.stringToValue(this.v.getText()).toString();
        }
        catch (ParseException parseException) {
            // empty catch block
        }
        if (ipi.getIPINT() != null) {
            ipi.unsetIPINT();
        }
        if (ipi.getIPITrib() != null) {
            ipi.unsetIPITrib();
        }
        if (!(StringHelper.isBlankOrNull((Object)this.o.getText()) && StringHelper.isBlankOrNull((Object)cnpj) && StringHelper.isBlankOrNull((Object)this.p.getText()) && StringHelper.isBlankOrNull((Object)this.r.getText()) && StringHelper.isBlankOrNull((Object)this.q.getText()) && ipiCST == null && StringHelper.isBlankOrNull((Object)this.A.getText()) && StringHelper.isBlankOrNull((Object)this.z.getText()) && StringHelper.isBlankOrNull((Object)this.y.getText()) && StringHelper.isBlankOrNull((Object)this.B.getText()) && StringHelper.isBlankOrNull((Object)this.s.getText()))) {
            ipi.setCEnq(!StringHelper.isBlankOrNull((Object)this.o.getText()) ? this.o.getText() : null);
            if (!StringHelper.isBlankOrNull((Object)cnpj)) {
                ipi.setCNPJProd(cnpj);
            } else if (ipi.getCNPJProd() != null) {
                ipi.unsetCNPJProd();
            }
            if (!StringHelper.isBlankOrNull((Object)this.p.getText())) {
                ipi.setCSelo(this.p.getText());
            } else if (ipi.getCSelo() != null) {
                ipi.unsetCSelo();
            }
            if (!StringHelper.isBlankOrNull((Object)this.r.getText())) {
                ipi.setQSelo(this.r.getText());
            } else if (ipi.getQSelo() != null) {
                ipi.unsetQSelo();
            }
            if (!StringHelper.isBlankOrNull((Object)this.q.getText())) {
                ipi.setClEnq(this.q.getText());
            } else if (ipi.getClEnq() != null) {
                ipi.unsetClEnq();
            }
            if (ipiCST != null) {
                if (ipiCST.equals((Object)IPIEnum.IPI_00) || ipiCST.equals((Object)IPIEnum.IPI_49) || ipiCST.equals((Object)IPIEnum.IPI_50) || ipiCST.equals((Object)IPIEnum.IPI_99)) {
                    TIpi.IPITrib ipiTrib;
                    TIpi.IPITrib iPITrib = ipiTrib = ipi.getIPITrib() != null ? ipi.getIPITrib() : ipi.addNewIPITrib();
                    if (ipiCST.equals((Object)IPIEnum.IPI_00)) {
                        ipiTrib.setCST(TIpi.IPITrib.CST.X_00);
                    }
                    if (ipiCST.equals((Object)IPIEnum.IPI_49)) {
                        ipiTrib.setCST(TIpi.IPITrib.CST.X_49);
                    }
                    if (ipiCST.equals((Object)IPIEnum.IPI_50)) {
                        ipiTrib.setCST(TIpi.IPITrib.CST.X_50);
                    }
                    if (ipiCST.equals((Object)IPIEnum.IPI_99)) {
                        ipiTrib.setCST(TIpi.IPITrib.CST.X_99);
                    }
                    ipiTrib.setVIPI(!StringHelper.isBlankOrNull((Object)this.A.getText()) ? StringHelper.formataValorXML((String)this.A.getText()) : null);
                    if (tpCalculo != null) {
                        if (tpCalculo.equals((Object)TipoCalculoEnum.PERCENTUAL)) {
                            ipiTrib.setVBC(!StringHelper.isBlankOrNull((Object)this.z.getText()) ? StringHelper.formataValorXML((String)this.z.getText()) : null);
                            ipiTrib.setPIPI(!StringHelper.isBlankOrNull((Object)this.y.getText()) ? StringHelper.formataValorXML((String)this.y.getText()) : null);
                            if (ipiTrib.getVUnid() != null) {
                                ipiTrib.unsetVUnid();
                            }
                            if (ipiTrib.getQUnid() != null) {
                                ipiTrib.unsetQUnid();
                            }
                        } else if (tpCalculo.equals((Object)TipoCalculoEnum.EM_VALOR)) {
                            ipiTrib.setVUnid(!StringHelper.isBlankOrNull((Object)this.B.getText()) ? StringHelper.formataValorXML((String)this.B.getText()) : null);
                            ipiTrib.setQUnid(!StringHelper.isBlankOrNull((Object)this.s.getText()) ? StringHelper.formataValorXML((String)this.s.getText()) : null);
                            if (ipiTrib.getVBC() != null) {
                                ipiTrib.unsetVBC();
                            }
                            if (ipiTrib.getPIPI() != null) {
                                ipiTrib.unsetPIPI();
                            }
                        }
                    }
                } else {
                    TIpi.IPINT ipiNT;
                    TIpi.IPINT iPINT = ipiNT = ipi.getIPINT() != null ? ipi.getIPINT() : ipi.addNewIPINT();
                    if (ipiCST.equals((Object)IPIEnum.IPI_01)) {
                        ipiNT.setCST(TIpi.IPINT.CST.X_01);
                    }
                    if (ipiCST.equals((Object)IPIEnum.IPI_02)) {
                        ipiNT.setCST(TIpi.IPINT.CST.X_02);
                    }
                    if (ipiCST.equals((Object)IPIEnum.IPI_03)) {
                        ipiNT.setCST(TIpi.IPINT.CST.X_03);
                    }
                    if (ipiCST.equals((Object)IPIEnum.IPI_04)) {
                        ipiNT.setCST(TIpi.IPINT.CST.X_04);
                    }
                    if (ipiCST.equals((Object)IPIEnum.IPI_05)) {
                        ipiNT.setCST(TIpi.IPINT.CST.X_05);
                    }
                    if (ipiCST.equals((Object)IPIEnum.IPI_51)) {
                        ipiNT.setCST(TIpi.IPINT.CST.X_51);
                    }
                    if (ipiCST.equals((Object)IPIEnum.IPI_52)) {
                        ipiNT.setCST(TIpi.IPINT.CST.X_52);
                    }
                    if (ipiCST.equals((Object)IPIEnum.IPI_53)) {
                        ipiNT.setCST(TIpi.IPINT.CST.X_53);
                    }
                    if (ipiCST.equals((Object)IPIEnum.IPI_54)) {
                        ipiNT.setCST(TIpi.IPINT.CST.X_54);
                    }
                    if (ipiCST.equals((Object)IPIEnum.IPI_55)) {
                        ipiNT.setCST(TIpi.IPINT.CST.X_55);
                    }
                }
            }
        } else {
            imposto.unsetIPI();
        }
    }

    private void i(TNFe.InfNFe.Det.Imposto imposto) {
        TNFe.InfNFe.Det.Imposto.II ii;
        if (!this.a.isSelected() && imposto.isSetII()) {
            imposto.unsetII();
            return;
        }
        TNFe.InfNFe.Det.Imposto.II iI = ii = imposto.getII() != null ? imposto.getII() : imposto.addNewII();
        if (!(StringHelper.isBlankOrNull((Object)this.r.getText()) && StringHelper.isBlankOrNull((Object)this.s.getText()) && StringHelper.isBlankOrNull((Object)this.t.getText()) && StringHelper.isBlankOrNull((Object)this.u.getText()))) {
            ii.setVBC(!StringHelper.isBlankOrNull((Object)this.r.getText()) ? StringHelper.formataValorXML((String)this.r.getText()) : null);
            ii.setVDespAdu(!StringHelper.isBlankOrNull((Object)this.s.getText()) ? StringHelper.formataValorXML((String)this.s.getText()) : null);
            ii.setVII(!StringHelper.isBlankOrNull((Object)this.t.getText()) ? StringHelper.formataValorXML((String)this.t.getText()) : null);
            ii.setVIOF(!StringHelper.isBlankOrNull((Object)this.u.getText()) ? StringHelper.formataValorXML((String)this.u.getText()) : null);
        } else {
            imposto.unsetII();
        }
    }

    private void a(TNFe.InfNFe.Det det) {
        if (det.getImpostoDevol() == null) {
            det.addNewImpostoDevol();
        }
        TNFe.InfNFe.Det.ImpostoDevol imposto = det.getImpostoDevol();
        if (!StringHelper.isBlankOrNull((Object)this.w.getText()) || !StringHelper.isBlankOrNull((Object)this.x.getText())) {
            TNFe.InfNFe.Det.ImpostoDevol.IPI ipi;
            TNFe.InfNFe.Det.ImpostoDevol.IPI iPI = ipi = imposto.getIPI() != null ? imposto.getIPI() : imposto.addNewIPI();
            if (imposto.isNil()) {
                imposto = TNFe.InfNFe.Det.ImpostoDevol.Factory.newInstance();
            }
            imposto.setPDevol(!StringHelper.isBlankOrNull((Object)this.w.getText()) ? StringHelper.formataValorXML((String)this.w.getText()) : null);
            ipi.setVIPIDevol(!StringHelper.isBlankOrNull((Object)this.x.getText()) ? StringHelper.formataValorXML((String)this.x.getText()) : null);
        } else if (det.isSetImpostoDevol()) {
            det.unsetImpostoDevol();
        }
    }

    private void j(TNFe.InfNFe.Det.Imposto imposto) {
        TNFe.InfNFe.Det.Imposto.PIS pis;
        TNFe.InfNFe.Det.Imposto.PIS pIS = pis = imposto.getPIS() != null ? imposto.getPIS() : imposto.addNewPIS();
        if (imposto.getPIS().getPISAliq() != null) {
            imposto.getPIS().unsetPISAliq();
        }
        if (imposto.getPIS().getPISNT() != null) {
            imposto.getPIS().unsetPISNT();
        }
        if (imposto.getPIS().getPISOutr() != null) {
            imposto.getPIS().unsetPISOutr();
        }
        if (imposto.getPIS().getPISQtde() != null) {
            imposto.getPIS().unsetPISQtde();
        }
        PISEnum pisCST = (PISEnum)this.v.getSelectedItem();
        TipoCalculoEnum tpCalculo = (TipoCalculoEnum)this.x.getSelectedItem();
        TipoCalculoEnum tpCalculoST = null;
        if (this.w.getSelectedItem() != null && !this.w.getSelectedItem().equals("")) {
            tpCalculoST = (TipoCalculoEnum)this.w.getSelectedItem();
        }
        if (pisCST != null) {
            if (pisCST.equals((Object)PISEnum.PIS_01) || pisCST.equals((Object)PISEnum.PIS_02)) {
                TNFe.InfNFe.Det.Imposto.PIS.PISAliq pisAliq = pis.getPISAliq() != null ? pis.getPISAliq() : pis.addNewPISAliq();
                pisAliq.setCST(TNFe.InfNFe.Det.Imposto.PIS.PISAliq.CST.Enum.forString((String)pisCST.getCst()));
                pisAliq.setVBC(!StringHelper.isBlankOrNull((Object)this.U.getText()) ? StringHelper.formataValorXML((String)this.U.getText()) : null);
                pisAliq.setPPIS(!StringHelper.isBlankOrNull((Object)this.M.getText()) ? StringHelper.formataValorXML((String)this.M.getText()) : null);
                pisAliq.setVPIS(!StringHelper.isBlankOrNull((Object)this.V.getText()) ? StringHelper.formataValorXML((String)this.V.getText()) : null);
            } else if (pisCST.equals((Object)PISEnum.PIS_03)) {
                TNFe.InfNFe.Det.Imposto.PIS.PISQtde pisQtde = pis.getPISQtde() != null ? pis.getPISQtde() : pis.addNewPISQtde();
                pisQtde.setCST(TNFe.InfNFe.Det.Imposto.PIS.PISQtde.CST.X_03);
                pisQtde.setVAliqProd(!StringHelper.isBlankOrNull((Object)this.T.getText()) ? StringHelper.formataValorXML((String)this.T.getText()) : null);
                pisQtde.setQBCProd(!StringHelper.isBlankOrNull((Object)this.N.getText()) ? StringHelper.formataValorXML((String)this.N.getText()) : null);
                pisQtde.setVPIS(!StringHelper.isBlankOrNull((Object)this.V.getText()) ? StringHelper.formataValorXML((String)this.V.getText()) : null);
            } else if (pisCST.equals((Object)PISEnum.PIS_04) || pisCST.equals((Object)PISEnum.PIS_06) || pisCST.equals((Object)PISEnum.PIS_07) || pisCST.equals((Object)PISEnum.PIS_08) || pisCST.equals((Object)PISEnum.PIS_09)) {
                TNFe.InfNFe.Det.Imposto.PIS.PISNT pisNT = pis.getPISNT() != null ? pis.getPISNT() : pis.addNewPISNT();
                pisNT.setCST(TNFe.InfNFe.Det.Imposto.PIS.PISNT.CST.Enum.forString((String)pisCST.getCst()));
            } else if (new Short(pisCST.getCst()).compareTo(new Short(PISEnum.PIS_49.getCst())) >= 0) {
                TNFe.InfNFe.Det.Imposto.PIS.PISOutr pisOutro = pis.getPISOutr() != null ? pis.getPISOutr() : pis.addNewPISOutr();
                pisOutro.setCST(TNFe.InfNFe.Det.Imposto.PIS.PISOutr.CST.Enum.forString((String)pisCST.getCst()));
                pisOutro.setVPIS(!StringHelper.isBlankOrNull((Object)this.V.getText()) ? StringHelper.formataValorXML((String)this.V.getText()) : null);
                if (tpCalculo != null) {
                    if (tpCalculo.equals((Object)TipoCalculoEnum.PERCENTUAL)) {
                        pisOutro.setVBC(!StringHelper.isBlankOrNull((Object)this.U.getText()) ? StringHelper.formataValorXML((String)this.U.getText()) : null);
                        pisOutro.setPPIS(!StringHelper.isBlankOrNull((Object)this.M.getText()) ? StringHelper.formataValorXML((String)this.M.getText()) : null);
                        if (pisOutro.getQBCProd() != null) {
                            pisOutro.unsetQBCProd();
                        }
                        if (pisOutro.getVAliqProd() != null) {
                            pisOutro.unsetVAliqProd();
                        }
                    } else if (tpCalculo.equals((Object)TipoCalculoEnum.EM_VALOR)) {
                        pisOutro.setVAliqProd(!StringHelper.isBlankOrNull((Object)this.T.getText()) ? StringHelper.formataValorXML((String)this.T.getText()) : null);
                        pisOutro.setQBCProd(!StringHelper.isBlankOrNull((Object)this.N.getText()) ? StringHelper.formataValorXML((String)this.N.getText()) : null);
                        if (pisOutro.getPPIS() != null) {
                            pisOutro.unsetPPIS();
                        }
                        if (pisOutro.getVBC() != null) {
                            pisOutro.unsetVBC();
                        }
                    }
                }
            }
        }
        if (!(StringHelper.isBlankOrNull((Object)this.S.getText()) && StringHelper.isBlankOrNull((Object)this.R.getText()) && StringHelper.isBlankOrNull((Object)this.O.getText()) && StringHelper.isBlankOrNull((Object)this.P.getText()) && StringHelper.isBlankOrNull((Object)this.Q.getText()))) {
            TNFe.InfNFe.Det.Imposto.PISST pisST = imposto.getPISST() != null ? imposto.getPISST() : imposto.addNewPISST();
            pisST.setVPIS(!StringHelper.isBlankOrNull((Object)this.S.getText()) ? StringHelper.formataValorXML((String)this.S.getText()) : null);
            if (tpCalculoST != null) {
                if (tpCalculoST.equals((Object)TipoCalculoEnum.PERCENTUAL)) {
                    pisST.setVBC(!StringHelper.isBlankOrNull((Object)this.R.getText()) ? StringHelper.formataValorXML((String)this.R.getText()) : null);
                    pisST.setPPIS(!StringHelper.isBlankOrNull((Object)this.O.getText()) ? StringHelper.formataValorXML((String)this.O.getText()) : null);
                    if (pisST.getQBCProd() != null) {
                        pisST.unsetQBCProd();
                    }
                    if (pisST.getVAliqProd() != null) {
                        pisST.unsetVAliqProd();
                    }
                } else if (tpCalculoST.equals((Object)TipoCalculoEnum.EM_VALOR)) {
                    pisST.setVAliqProd(!StringHelper.isBlankOrNull((Object)this.Q.getText()) ? StringHelper.formataValorXML((String)this.Q.getText()) : null);
                    pisST.setQBCProd(!StringHelper.isBlankOrNull((Object)this.P.getText()) ? StringHelper.formataValorXML((String)this.P.getText()) : null);
                    if (pisST.getVBC() != null) {
                        pisST.unsetVBC();
                    }
                    if (pisST.getPPIS() != null) {
                        pisST.unsetPPIS();
                    }
                }
            }
        } else if (imposto.getPISST() != null) {
            imposto.unsetPISST();
        }
    }

    private void k(TNFe.InfNFe.Det.Imposto imposto) {
        TNFe.InfNFe.Det.Imposto.COFINS cofins;
        TNFe.InfNFe.Det.Imposto.COFINS cOFINS = cofins = imposto.getCOFINS() != null ? imposto.getCOFINS() : imposto.addNewCOFINS();
        if (cofins.getCOFINSAliq() != null) {
            cofins.unsetCOFINSAliq();
        }
        if (cofins.getCOFINSNT() != null) {
            cofins.unsetCOFINSNT();
        }
        if (cofins.getCOFINSOutr() != null) {
            cofins.unsetCOFINSOutr();
        }
        if (cofins.getCOFINSQtde() != null) {
            cofins.unsetCOFINSQtde();
        }
        COFINSEnum cofinsCST = (COFINSEnum)this.b.getSelectedItem();
        TipoCalculoEnum tpCalculo = (TipoCalculoEnum)this.d.getSelectedItem();
        TipoCalculoEnum tpCalculoST = null;
        if (this.c.getSelectedItem() != null && !this.c.getSelectedItem().equals("")) {
            tpCalculoST = (TipoCalculoEnum)this.c.getSelectedItem();
        }
        if (cofinsCST != null) {
            if (cofinsCST.equals((Object)COFINSEnum.COFINS_01) || cofinsCST.equals((Object)COFINSEnum.COFINS_02)) {
                TNFe.InfNFe.Det.Imposto.COFINS.COFINSAliq cofinsAliq = cofins.getCOFINSAliq() != null ? cofins.getCOFINSAliq() : cofins.addNewCOFINSAliq();
                cofinsAliq.setCST(TNFe.InfNFe.Det.Imposto.COFINS.COFINSAliq.CST.Enum.forString((String)cofinsCST.getCst()));
                cofinsAliq.setVBC(!StringHelper.isBlankOrNull((Object)this.l.getText()) ? StringHelper.formataValorXML((String)this.l.getText()) : null);
                cofinsAliq.setPCOFINS(!StringHelper.isBlankOrNull((Object)this.d.getText()) ? StringHelper.formataValorXML((String)this.d.getText()) : null);
                cofinsAliq.setVCOFINS(!StringHelper.isBlankOrNull((Object)this.m.getText()) ? StringHelper.formataValorXML((String)this.m.getText()) : null);
            } else if (cofinsCST.equals((Object)COFINSEnum.COFINS_03)) {
                TNFe.InfNFe.Det.Imposto.COFINS.COFINSQtde cofinsQtde = cofins.getCOFINSQtde() != null ? cofins.getCOFINSQtde() : cofins.addNewCOFINSQtde();
                cofinsQtde.setCST(TNFe.InfNFe.Det.Imposto.COFINS.COFINSQtde.CST.X_03);
                cofinsQtde.setVAliqProd(!StringHelper.isBlankOrNull((Object)this.k.getText()) ? StringHelper.formataValorXML((String)this.k.getText()) : null);
                cofinsQtde.setQBCProd(!StringHelper.isBlankOrNull((Object)this.e.getText()) ? StringHelper.formataValorXML((String)this.e.getText()) : null);
                cofinsQtde.setVCOFINS(!StringHelper.isBlankOrNull((Object)this.m.getText()) ? StringHelper.formataValorXML((String)this.m.getText()) : null);
            } else if (cofinsCST.equals((Object)COFINSEnum.COFINS_04) || cofinsCST.equals((Object)COFINSEnum.COFINS_06) || cofinsCST.equals((Object)COFINSEnum.COFINS_07) || cofinsCST.equals((Object)COFINSEnum.COFINS_08) || cofinsCST.equals((Object)COFINSEnum.COFINS_09)) {
                TNFe.InfNFe.Det.Imposto.COFINS.COFINSNT cofinsNT = cofins.getCOFINSNT() != null ? cofins.getCOFINSNT() : cofins.addNewCOFINSNT();
                cofinsNT.setCST(TNFe.InfNFe.Det.Imposto.COFINS.COFINSNT.CST.Enum.forString((String)cofinsCST.getCst()));
            } else if (new Short(cofinsCST.getCst()).compareTo(new Short(COFINSEnum.COFINS_49.getCst())) >= 0) {
                TNFe.InfNFe.Det.Imposto.COFINS.COFINSOutr cofinsOutro = cofins.getCOFINSOutr() != null ? cofins.getCOFINSOutr() : cofins.addNewCOFINSOutr();
                cofinsOutro.setCST(TNFe.InfNFe.Det.Imposto.COFINS.COFINSOutr.CST.Enum.forString((String)cofinsCST.getCst()));
                cofinsOutro.setVCOFINS(!StringHelper.isBlankOrNull((Object)this.m.getText()) ? StringHelper.formataValorXML((String)this.m.getText()) : null);
                if (tpCalculo != null) {
                    if (tpCalculo.equals((Object)TipoCalculoEnum.PERCENTUAL)) {
                        cofinsOutro.setVBC(!StringHelper.isBlankOrNull((Object)this.l.getText()) ? StringHelper.formataValorXML((String)this.l.getText()) : null);
                        cofinsOutro.setPCOFINS(!StringHelper.isBlankOrNull((Object)this.d.getText()) ? StringHelper.formataValorXML((String)this.d.getText()) : null);
                        if (cofinsOutro.getVAliqProd() != null) {
                            cofinsOutro.unsetVAliqProd();
                        }
                        if (cofinsOutro.getQBCProd() != null) {
                            cofinsOutro.unsetQBCProd();
                        }
                    } else if (tpCalculo.equals((Object)TipoCalculoEnum.EM_VALOR)) {
                        cofinsOutro.setVAliqProd(!StringHelper.isBlankOrNull((Object)this.k.getText()) ? StringHelper.formataValorXML((String)this.k.getText()) : null);
                        cofinsOutro.setQBCProd(!StringHelper.isBlankOrNull((Object)this.e.getText()) ? StringHelper.formataValorXML((String)this.e.getText()) : null);
                        if (cofinsOutro.getVBC() != null) {
                            cofinsOutro.unsetVBC();
                        }
                        if (cofinsOutro.getPCOFINS() != null) {
                            cofinsOutro.unsetPCOFINS();
                        }
                    }
                }
            }
        }
        if (!(StringHelper.isBlankOrNull((Object)this.j.getText()) && StringHelper.isBlankOrNull((Object)this.i.getText()) && StringHelper.isBlankOrNull((Object)this.f.getText()) && StringHelper.isBlankOrNull((Object)this.g.getText()) && StringHelper.isBlankOrNull((Object)this.h.getText()))) {
            TNFe.InfNFe.Det.Imposto.COFINSST cofinsST = imposto.getCOFINSST() != null ? imposto.getCOFINSST() : imposto.addNewCOFINSST();
            cofinsST.setVCOFINS(!StringHelper.isBlankOrNull((Object)this.j.getText()) ? StringHelper.formataValorXML((String)this.j.getText()) : null);
            if (tpCalculoST != null) {
                if (tpCalculoST.equals((Object)TipoCalculoEnum.PERCENTUAL)) {
                    cofinsST.setVBC(!StringHelper.isBlankOrNull((Object)this.i.getText()) ? StringHelper.formataValorXML((String)this.i.getText()) : null);
                    cofinsST.setPCOFINS(!StringHelper.isBlankOrNull((Object)this.f.getText()) ? StringHelper.formataValorXML((String)this.f.getText()) : null);
                    if (cofinsST.getVAliqProd() != null) {
                        cofinsST.unsetVAliqProd();
                    }
                    if (cofinsST.getQBCProd() != null) {
                        cofinsST.unsetQBCProd();
                    }
                } else if (tpCalculoST.equals((Object)TipoCalculoEnum.EM_VALOR)) {
                    cofinsST.setVAliqProd(!StringHelper.isBlankOrNull((Object)this.h.getText()) ? StringHelper.formataValorXML((String)this.h.getText()) : null);
                    cofinsST.setQBCProd(!StringHelper.isBlankOrNull((Object)this.g.getText()) ? StringHelper.formataValorXML((String)this.g.getText()) : null);
                    if (cofinsST.getVBC() != null) {
                        cofinsST.unsetVBC();
                    }
                    if (cofinsST.getPCOFINS() != null) {
                        cofinsST.unsetPCOFINS();
                    }
                }
            }
        } else if (imposto.getCOFINSST() != null) {
            imposto.unsetCOFINSST();
        }
    }

    private void l(TNFe.InfNFe.Det.Imposto imposto) {
        if (imposto.isSetISSQN()) {
            imposto.unsetISSQN();
        }
        if (!this.b.isSelected()) {
            return;
        }
        TributacaoISSQNEnum tributoISSQN = (TributacaoISSQNEnum)this.s.getSelectedItem();
        boolean temISSQN = false;
        if (tributoISSQN != null) {
            TNFe.InfNFe.Det.Imposto.ISSQN issqn = TNFe.InfNFe.Det.Imposto.ISSQN.Factory.newInstance();
            temISSQN = true;
            MunicipioTO munic = (MunicipioTO)this.o.getSelectedItem();
            ServicoTO servicoTO = (ServicoTO)this.m.getSelectedItem();
            PaisTO pais = (PaisTO)this.r.getSelectedItem();
            ExigibilidadeISSEnum exigi = (ExigibilidadeISSEnum)this.p.getSelectedItem();
            IndIncentivoFiscalEnum ince = (IndIncentivoFiscalEnum)this.q.getSelectedItem();
            MunicipioTO municInc = (MunicipioTO)this.n.getSelectedItem();
            if (!StringHelper.isBlankOrNull((Object)this.E.getText())) {
                issqn.setVBC(StringHelper.formataValorXML((String)this.E.getText()));
                temISSQN = true;
            }
            if (!StringHelper.isBlankOrNull((Object)this.D.getText())) {
                issqn.setVAliq(StringHelper.formataValorXML((String)this.D.getText()));
                temISSQN = true;
            }
            if (!StringHelper.isBlankOrNull((Object)this.J.getText())) {
                issqn.setVISSQN(StringHelper.formataValorXML((String)this.J.getText()));
                temISSQN = true;
            }
            if (munic != null) {
                issqn.setCMunFG(munic.getCodigo().toString());
                temISSQN = true;
            }
            if (servicoTO != null) {
                issqn.setCListServ(TCListServ.Enum.forString((String)servicoTO.getCodigo()));
                temISSQN = true;
            }
            if (pais != null) {
                issqn.setCPais(Tpais.Enum.forString((String)pais.getCodigo()));
                temISSQN = true;
            } else if (issqn.isSetCPais()) {
                issqn.unsetCPais();
            }
            if (exigi != null) {
                issqn.setIndISS(TNFe.InfNFe.Det.Imposto.ISSQN.IndISS.Enum.forString((String)exigi.getCodigo()));
                temISSQN = true;
            }
            if (ince != null) {
                issqn.setIndIncentivo(TNFe.InfNFe.Det.Imposto.ISSQN.IndIncentivo.Enum.forString((String)ince.getCodigo()));
                temISSQN = true;
            }
            if (municInc != null) {
                issqn.setCMun(municInc.getCodigo().toString());
                temISSQN = true;
            }
            if (!StringHelper.isBlankOrNull((Object)this.G.getText())) {
                issqn.setVDeducao(StringHelper.formataValorXML((String)this.G.getText()));
                temISSQN = true;
            } else if (issqn.isSetVDeducao()) {
                issqn.unsetVDeducao();
            }
            if (!StringHelper.isBlankOrNull((Object)this.L.getText())) {
                issqn.setVOutro(StringHelper.formataValorXML((String)this.L.getText()));
                temISSQN = true;
            } else if (issqn.isSetVOutro()) {
                issqn.unsetVOutro();
            }
            if (!StringHelper.isBlankOrNull((Object)this.I.getText())) {
                issqn.setVDescIncond(StringHelper.formataValorXML((String)this.I.getText()));
                temISSQN = true;
            } else if (issqn.isSetVDescIncond()) {
                issqn.unsetVDescIncond();
            }
            if (!StringHelper.isBlankOrNull((Object)this.H.getText())) {
                issqn.setVDescCond(StringHelper.formataValorXML((String)this.H.getText()));
                temISSQN = true;
            } else if (issqn.isSetVDescCond()) {
                issqn.unsetVDescCond();
            }
            if (!StringHelper.isBlankOrNull((Object)this.K.getText())) {
                issqn.setVISSRet(StringHelper.formataValorXML((String)this.K.getText()));
                temISSQN = true;
            } else if (issqn.isSetVISSRet()) {
                issqn.unsetVISSRet();
            }
            if (!StringHelper.isBlankOrNull((Object)this.F.getText())) {
                issqn.setCServico(StringHelper.formataValorXML((String)this.F.getText()));
                temISSQN = true;
            } else if (issqn.isSetCServico()) {
                issqn.unsetCServico();
            }
            if (!StringHelper.isBlankOrNull((Object)this.C.getText())) {
                issqn.setNProcesso(StringHelper.formataValorXML((String)this.C.getText()));
                temISSQN = true;
            } else if (issqn.isSetNProcesso()) {
                issqn.unsetNProcesso();
            }
            if (temISSQN) {
                imposto.setISSQN(issqn);
            }
        }
    }

    private void u(ProdutoNotaTO produtoNotaTO) {
        if (!StringHelper.isBlankOrNull((Object)this.a.getText())) {
            produtoNotaTO.getDetalheProduto().setInfAdProd(this.a.getText().trim());
        } else if (produtoNotaTO.getDetalheProduto().getInfAdProd() != null) {
            produtoNotaTO.getDetalheProduto().unsetInfAdProd();
        }
    }

    private void v(ProdutoNotaTO produtoNotaTO) {
        TNFe.InfNFe.Det.Prod.Comb comb = produtoNotaTO.getDetalheProduto().getProd().getComb() != null ? produtoNotaTO.getDetalheProduto().getProd().getComb() : produtoNotaTO.getDetalheProduto().getProd().addNewComb();
        comb.setCProdANP(TcProdANP.Enum.forString((String)((String)this.f.getSelectedItem())));
        if (!StringHelper.isBlankOrNull((Object)this.j.getText())) {
            comb.setCODIF(this.j.getText());
        } else if (comb.getCODIF() != null) {
            comb.unsetCODIF();
        }
        if (!StringHelper.isBlankOrNull((Object)this.p.getText())) {
            comb.setQTemp(StringHelper.formataValorXML((String)this.p.getText()));
        } else if (comb.getQTemp() != null) {
            comb.unsetQTemp();
        }
        if (!StringHelper.isBlankOrNull((Object)this.o.getText())) {
            comb.setPMixGN(StringHelper.formataValorXML((String)this.o.getText()));
        } else if (comb.getPMixGN() != null) {
            comb.unsetPMixGN();
        }
        if (!StringHelper.isBlankOrNull((Object)this.n.getText()) || !StringHelper.isBlankOrNull((Object)this.q.getText())) {
            if (comb.getCIDE() == null) {
                comb.addNewCIDE();
            }
            comb.getCIDE().setQBCProd(!StringHelper.isBlankOrNull((Object)this.n.getText()) ? StringHelper.formataValorXML((String)this.n.getText()) : null);
            comb.getCIDE().setVAliqProd(!StringHelper.isBlankOrNull((Object)this.q.getText()) ? StringHelper.formataValorXML((String)this.q.getText()) : null);
            comb.getCIDE().setVCIDE(!StringHelper.isBlankOrNull((Object)this.l.getText()) ? StringHelper.formataValorXML((String)this.l.getText()) : null);
        } else if (comb.getCIDE() != null) {
            comb.unsetCIDE();
        }
        EstadoTO uf = (EstadoTO)this.g.getSelectedItem();
        comb.setUFCons(uf != null ? TUf.Enum.forString((String)uf.getSigla()) : null);
    }

    private void m() {
        this.a = new ButtonGroup();
        this.g = new JScrollPane();
        this.D = new JPanel();
        this.a = new DSGETabbedPane();
        this.s = new JPanel();
        this.j = new JPanel();
        this.B = new JLabel();
        this.h = new JTextField();
        ((AbstractDocument)this.h.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.i = new JLabel();
        this.d = new JTextField();
        ((AbstractDocument)this.d.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{0}|[0-9]{8}|[0-9]{12,14}"));
        this.aH = new JLabel();
        this.k = new JLabel();
        this.P = new JLabel();
        this.n = new JTextField();
        ((AbstractDocument)this.n.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(3));
        this.cm = new JLabel();
        this.F = new JTextField();
        ((AbstractDocument)this.F.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 120));
        this.cf = new JLabel();
        this.C = new JTextField();
        ((AbstractDocument)this.C.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 6));
        this.bc = new JLabel();
        this.Y = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.Y, (int)11, (int)4);
        this.f = new JLabel();
        this.b = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.b, (int)11, (int)10);
        this.cg = new JLabel();
        this.D = new JTextField();
        ((AbstractDocument)this.D.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 6));
        this.bd = new JLabel();
        this.Z = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.Z, (int)11, (int)4);
        this.g = new JLabel();
        this.c = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.c, (int)11, (int)10);
        this.ci = new JLabel();
        this.aL = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.aL, (int)13, (int)2);
        this.ck = new JLabel();
        this.aN = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.aN, (int)13, (int)2);
        this.ch = new JLabel();
        this.aK = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.aK, (int)13, (int)2);
        this.e = new JLabel();
        this.a = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.a, (int)13, (int)2);
        this.bb = new JLabel();
        this.y = new JComboBox();
        this.r = new JButton();
        this.u = new JTextField();
        ((AbstractDocument)this.u.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(8));
        this.a = new JComboBox();
        this.j = new JLabel();
        this.e = new JTextField();
        ((AbstractDocument)this.e.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{0}|[0-9]{8}|[0-9]{12,14}"));
        this.cj = new JLabel();
        this.aM = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.aM, (int)13, (int)2);
        this.b = new JCheckBox();
        this.A = new JTextField();
        ((AbstractDocument)this.A.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 15));
        this.aX = new JLabel();
        this.aE = new JLabel();
        this.y = new JTextField();
        ((AbstractDocument)this.y.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{1,6}"));
        this.x = new JTextField();
        ((AbstractDocument)this.x.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[A-F0-9]{8}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{12}"));
        this.aF = new JLabel();
        this.h = new JPanel();
        this.e = new JScrollPane();
        this.p = new JButton();
        this.n = new JButton();
        this.o = new JButton();
        this.K = new JPanel();
        this.b = new DSGETabbedPane();
        this.c = new JPanel();
        this.R = new JLabel();
        this.j = new JComboBox();
        this.E = new JPanel();
        this.bi = new JLabel();
        this.A = new JComboBox();
        this.bo = new JLabel();
        this.C = new JComboBox();
        this.d = new JPanel();
        this.ab = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.ab, (int)3, (int)4);
        this.bj = new JLabel();
        this.bg = new JLabel();
        this.ad = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.ad, (int)13, (int)2);
        this.G = new JPanel();
        this.bs = new JLabel();
        this.D = new JComboBox();
        this.bf = new JLabel();
        this.aa = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.aa, (int)3, (int)2);
        this.bt = new JLabel();
        this.ak = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.ak, (int)3, (int)2);
        this.bu = new JLabel();
        this.bp = new JLabel();
        this.bv = new JLabel();
        this.am = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.am, (int)13, (int)2);
        this.ah = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.ah, (int)3, (int)2);
        this.al = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.al, (int)13, (int)2);
        this.bq = new JLabel();
        this.br = new JLabel();
        this.ai = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.ai, (int)13, (int)2);
        this.aj = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.aj, (int)13, (int)2);
        this.aD = new JLabel();
        this.F = new JPanel();
        this.bl = new JLabel();
        this.B = new JComboBox();
        this.bh = new JLabel();
        this.ac = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.ac, (int)3, (int)2);
        this.bm = new JLabel();
        this.af = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.af, (int)13, (int)2);
        this.bk = new JLabel();
        this.ae = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.ae, (int)3, (int)2);
        this.bn = new JLabel();
        this.ag = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.ag, (int)13, (int)2);
        this.J = new JPanel();
        this.bA = new JLabel();
        this.H = new JComboBox();
        this.bR = new JLabel();
        this.L = new JComboBox();
        this.H = new JPanel();
        this.bE = new JLabel();
        this.I = new JComboBox();
        this.bH = new JLabel();
        this.aq = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.aq, (int)3, (int)4);
        this.bK = new JLabel();
        this.at = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.at, (int)13, (int)2);
        this.bB = new JLabel();
        this.ap = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.ap, (int)3, (int)4);
        this.bL = new JLabel();
        this.au = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.au, (int)13, (int)2);
        this.bI = new JLabel();
        this.ar = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.ar, (int)3, (int)4);
        this.bC = new JLabel();
        this.bN = new JLabel();
        this.av = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.av, (int)13, (int)2);
        this.bF = new JLabel();
        this.J = new JComboBox();
        this.bQ = new JLabel();
        this.bJ = new JLabel();
        this.bP = new JLabel();
        this.ay = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.ay, (int)13, (int)2);
        this.as = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.as, (int)3, (int)4);
        this.ax = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.ax, (int)13, (int)2);
        this.I = new JPanel();
        this.ca = new JLabel();
        this.M = new JComboBox();
        this.cc = new JLabel();
        this.aI = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.aI, (int)3, (int)4);
        this.cb = new JLabel();
        this.aH = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.aH, (int)3, (int)4);
        this.bT = new JLabel();
        this.bS = new JLabel();
        this.ce = new JLabel();
        this.aJ = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.aJ, (int)13, (int)2);
        this.az = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.az, (int)3, (int)4);
        this.aA = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.aA, (int)13, (int)2);
        this.cd = new JLabel();
        this.bV = new JLabel();
        this.bY = new JLabel();
        this.bW = new JLabel();
        this.bZ = new JLabel();
        this.aC = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.aC, (int)13, (int)2);
        this.aF = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.aF, (int)13, (int)2);
        this.aD = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.aD, (int)13, (int)2);
        this.aG = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.aG, (int)13, (int)2);
        this.N = new JComboBox();
        this.bU = new JLabel();
        this.aB = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.aB, (int)13, (int)2);
        this.bX = new JLabel();
        this.aE = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.aE, (int)13, (int)2);
        this.aw = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.aw, (int)13, (int)2);
        this.bO = new JLabel();
        this.bG = new JLabel();
        this.K = new JComboBox();
        this.v = new JPanel();
        this.b = new JLabel();
        this.Z = new JLabel();
        this.k = new JComboBox();
        this.ac = new JLabel();
        this.q = new JTextField();
        ((AbstractDocument)this.q.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 5));
        this.aa = new JLabel();
        this.v = new JFormattedTextField();
        this.a.install(this.v);
        this.ab = new JLabel();
        this.p = new JTextField();
        ((AbstractDocument)this.p.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.ag = new JLabel();
        this.l = new JComboBox();
        this.ah = new JLabel();
        this.z = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.z, (int)13, (int)2);
        this.ad = new JLabel();
        this.y = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.y, (int)3, (int)4);
        this.af = new JLabel();
        this.s = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)((JFormattedTextField)this.s), (int)12, (int)4);
        this.aj = new JLabel();
        this.B = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.B, (int)11, (int)4);
        this.ai = new JLabel();
        this.A = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.A, (int)13, (int)2);
        this.Y = new JLabel();
        this.o = new JTextField();
        ((AbstractDocument)this.o.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(3));
        this.ae = new JLabel();
        this.r = new JTextField();
        ((AbstractDocument)this.r.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(8));
        this.z = new JPanel();
        this.A = new JPanel();
        this.aT = new JLabel();
        this.x = new JComboBox();
        this.aV = new JLabel();
        this.U = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.U, (int)13, (int)2);
        this.aL = new JLabel();
        this.M = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.M, (int)3, (int)4);
        this.aU = new JLabel();
        this.T = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.T, (int)11, (int)4);
        this.aM = new JLabel();
        this.N = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.N, (int)12, (int)4);
        this.aW = new JLabel();
        this.V = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.V, (int)13, (int)2);
        this.aK = new JLabel();
        this.v = new JComboBox();
        this.B = new JPanel();
        this.aP = new JLabel();
        this.w = new JComboBox();
        this.aR = new JLabel();
        this.R = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.R, (int)13, (int)2);
        this.aN = new JLabel();
        this.O = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.O, (int)3, (int)2);
        this.aQ = new JLabel();
        this.Q = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.Q, (int)11, (int)4);
        this.aO = new JLabel();
        this.P = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.P, (int)12, (int)4);
        this.aS = new JLabel();
        this.S = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.S, (int)13, (int)2);
        this.k = new JPanel();
        this.l = new JPanel();
        this.x = new JLabel();
        this.d = new JComboBox();
        this.z = new JLabel();
        this.l = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.l, (int)13, (int)2);
        this.p = new JLabel();
        this.d = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.d, (int)3, (int)4);
        this.A = new JLabel();
        this.m = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.m, (int)13, (int)2);
        this.y = new JLabel();
        this.k = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.k, (int)11, (int)4);
        this.q = new JLabel();
        this.e = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.e, (int)12, (int)4);
        this.o = new JLabel();
        this.b = new JComboBox();
        this.m = new JPanel();
        this.t = new JLabel();
        this.c = new JComboBox();
        this.v = new JLabel();
        this.i = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.i, (int)13, (int)2);
        this.r = new JLabel();
        this.f = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.f, (int)3, (int)2);
        this.w = new JLabel();
        this.j = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.j, (int)13, (int)2);
        this.u = new JLabel();
        this.h = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.h, (int)11, (int)4);
        this.s = new JLabel();
        this.g = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.g, (int)12, (int)4);
        this.u = new JPanel();
        this.S = new JLabel();
        this.r = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.r, (int)13, (int)2);
        this.U = new JLabel();
        this.s = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.s, (int)13, (int)2);
        this.W = new JLabel();
        this.t = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.t, (int)13, (int)2);
        this.X = new JLabel();
        this.u = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.u, (int)13, (int)2);
        this.w = new JPanel();
        this.as = new JLabel();
        this.E = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.E, (int)13, (int)2);
        this.ar = new JLabel();
        this.D = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.D, (int)3, (int)4);
        this.ak = new JLabel();
        this.m = new JComboBox();
        this.al = new JLabel();
        this.ao = new JLabel();
        this.t = new JComboBox();
        this.o = new JComboBox();
        this.at = new JLabel();
        this.J = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.J, (int)13, (int)2);
        this.an = new JLabel();
        this.s = new JComboBox();
        this.G = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.G, (int)13, (int)2);
        this.L = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.L, (int)13, (int)2);
        this.au = new JLabel();
        this.av = new JLabel();
        this.I = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.I, (int)13, (int)2);
        this.H = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.H, (int)13, (int)2);
        this.K = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.K, (int)13, (int)2);
        this.aw = new JLabel();
        this.ax = new JLabel();
        this.ay = new JLabel();
        this.p = new JComboBox();
        this.az = new JLabel();
        this.q = new JComboBox();
        this.aA = new JLabel();
        this.F = new JFormattedTextField();
        ((AbstractDocument)this.F.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 20));
        this.aB = new JLabel();
        this.am = new JLabel();
        this.n = new JComboBox();
        this.aC = new JLabel();
        this.C = new JFormattedTextField();
        ((AbstractDocument)this.C.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 20));
        this.ap = new JLabel();
        this.r = new JComboBox();
        this.aq = new JLabel();
        this.u = new JComboBox();
        this.g = new JPanel();
        this.T = new JLabel();
        this.V = new JLabel();
        this.w = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.w, (int)3, (int)2);
        this.x = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.x, (int)13, (int)2);
        this.a = new JPanel();
        this.bM = new JLabel();
        this.an = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.an, (int)13, (int)2);
        this.bD = new JLabel();
        this.a = new JRadioButton();
        this.b = new JRadioButton();
        this.x = new JPanel();
        this.a = new JScrollPane();
        this.a = new JTextArea();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 500));
        this.r = new JPanel();
        this.b = new JPanel();
        this.c = new JScrollPane();
        this.f = new JButton();
        this.d = new JButton();
        this.e = new JButton();
        this.t = new JPanel();
        this.f = new JPanel();
        this.f = new JScrollPane();
        this.i = new JButton();
        this.g = new JButton();
        this.h = new JButton();
        this.L = new JPanel();
        this.e = new JPanel();
        this.bx = new JLabel();
        this.F = new JComboBox();
        this.C = new JLabel();
        this.i = new JTextField();
        ((AbstractDocument)this.i.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[A-Z0-9]+", 17));
        this.aI = new JLabel();
        this.v = new JTextField();
        ((AbstractDocument)this.v.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 21));
        this.aJ = new JLabel();
        this.w = new JTextField();
        ((AbstractDocument)this.w.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 9));
        this.m = new JLabel();
        this.g = new JTextField();
        ((AbstractDocument)this.g.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 9));
        this.ba = new JLabel();
        this.B = new JTextField();
        ((AbstractDocument)this.B.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 4));
        this.l = new JLabel();
        this.f = new JTextField();
        ((AbstractDocument)this.f.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 4));
        this.aZ = new JLabel();
        this.X = new JFormattedTextField();
        ((AbstractDocument)this.X.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 9));
        this.aY = new JLabel();
        this.W = new JFormattedTextField();
        ((AbstractDocument)this.W.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 9));
        this.bw = new JLabel();
        this.O = new JLabel();
        this.m = new JTextField();
        ((AbstractDocument)this.m.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 4));
        this.n = new JLabel();
        this.d = new JLabel();
        this.b = new JTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(4));
        this.c = new JLabel();
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(4));
        this.bz = new JLabel();
        this.G = new JComboBox();
        ((AbstractDocument)((JTextField)this.G.getEditor().getEditorComponent()).getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{0,2}", 2));
        this.Q = new JLabel();
        this.i = new JComboBox();
        ((AbstractDocument)((JTextField)this.i.getEditor().getEditorComponent()).getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{0,1}", 1));
        this.by = new JLabel();
        this.h = new JLabel();
        this.c = new JTextField();
        ((AbstractDocument)this.c.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 4));
        this.cl = new JLabel();
        this.E = new JTextField();
        ((AbstractDocument)this.E.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 40));
        this.E = new JLabel();
        this.h = new JComboBox();
        this.ao = new JFormattedTextField();
        ((AbstractDocument)this.ao.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 1));
        this.E = new JComboBox();
        ((AbstractDocument)((JTextField)this.E.getEditor().getEditorComponent()).getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{0,2}", 2));
        this.a = new JCheckBox();
        this.D = new JLabel();
        this.e = new JComboBox();
        ((AbstractDocument)((JTextField)this.e.getEditor().getEditorComponent()).getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{0,2}", 2));
        this.aG = new JLabel();
        this.t = new JTextField();
        ((AbstractDocument)this.t.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{1,3}", 3));
        this.be = new JLabel();
        this.z = new JComboBox();
        this.aO = new JFormattedTextField();
        ((AbstractDocument)this.aO.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{0,6}", 6));
        this.y = new JPanel();
        this.d = new JScrollPane();
        this.m = new JButton();
        this.k = new JButton();
        this.l = new JButton();
        this.i = new JPanel();
        this.b = new JScrollPane();
        this.c = new JButton();
        this.a = new JButton();
        this.b = new JButton();
        this.q = new JPanel();
        this.n = new JPanel();
        this.G = new JLabel();
        this.k = new JTextField();
        ((AbstractDocument)this.k.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(9));
        this.F = new JLabel();
        this.j = new JTextField();
        ((AbstractDocument)this.j.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{0,21}"));
        this.K = new JLabel();
        this.p = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.p, (int)12, (int)4);
        this.I = new JLabel();
        this.g = new JComboBox();
        this.f = new JComboBox();
        this.L = new JLabel();
        this.o = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.o, (int)2, (int)4);
        this.o = new JPanel();
        this.J = new JLabel();
        this.n = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.n, (int)12, (int)4);
        this.M = new JLabel();
        this.q = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.q, (int)11, (int)4);
        this.N = new JLabel();
        this.l = new JTextField();
        this.C = new JPanel();
        this.p = new JPanel();
        this.H = new JLabel();
        this.z = new JTextField();
        ((AbstractDocument)this.z.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{20}"));
        this.j = new JButton();
        this.q = new JButton();
        this.a = new JLabel();
        this.setDefaultCloseOperation(2);
        this.setTitle("Produto e Servi\u00e7o");
        this.g.setPreferredSize(new Dimension(750, 550));
        this.g.setRequestFocusEnabled(false);
        this.D.setBorder(BorderFactory.createTitledBorder(null, "Produto e Servi\u00e7o", 2, 0, new Font("Dialog", 1, 14), new Color(0, 0, 255)));
        this.D.setPreferredSize(new Dimension(900, 925));
        this.a.setMinimumSize(new Dimension(0, 0));
        this.j.setBorder(BorderFactory.createTitledBorder(null, "", 1, 2));
        this.B.setFont(new Font("Tahoma", 1, 11));
        this.B.setText("* C\u00f3digo");
        this.i.setFont(new Font("Tahoma", 1, 11));
        this.i.setText("EAN");
        this.aH.setFont(new Font("Tahoma", 1, 11));
        this.aH.setText("* NCM");
        this.k.setFont(new Font("Tahoma", 1, 11));
        this.k.setText("* CFOP");
        this.P.setFont(new Font("Tahoma", 1, 11));
        this.P.setText("EX TIPI");
        this.cm.setFont(new Font("Tahoma", 1, 11));
        this.cm.setText("* Descri\u00e7\u00e3o");
        this.cf.setFont(new Font("Tahoma", 1, 11));
        this.cf.setText("* Un. Comercial");
        this.bc.setFont(new Font("Tahoma", 1, 11));
        this.bc.setText("* Qtd. Comercial");
        this.Y.setHorizontalAlignment(4);
        this.Y.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.f.setFont(new Font("Tahoma", 1, 11));
        this.f.setText("* Valor Unit. Comercial");
        this.b.setHorizontalAlignment(4);
        this.cg.setFont(new Font("Tahoma", 1, 11));
        this.cg.setText("* Un. Trib.");
        this.bd.setFont(new Font("Tahoma", 1, 11));
        this.bd.setText("* Qtd. Trib.");
        this.Z.setHorizontalAlignment(4);
        this.Z.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.g.setFont(new Font("Tahoma", 1, 11));
        this.g.setText("* Valor Unit Trib.");
        this.c.setHorizontalAlignment(4);
        this.ci.setFont(new Font("Tahoma", 1, 11));
        this.ci.setText("Tot. Frete");
        this.aL.setHorizontalAlignment(4);
        this.ck.setFont(new Font("Tahoma", 1, 11));
        this.ck.setText("Tot. Seguro");
        this.aN.setHorizontalAlignment(4);
        this.ch.setFont(new Font("Tahoma", 1, 11));
        this.ch.setText("Desconto");
        this.aK.setHorizontalAlignment(4);
        this.e.setFont(new Font("Tahoma", 1, 11));
        this.e.setText("* Valor Tot. Bruto");
        this.a.setHorizontalAlignment(4);
        this.bb.setFont(new Font("Tahoma", 1, 11));
        this.bb.setText("Produto espec\u00edfico");
        this.r.setText("Pesquisar");
        this.r.setMargin(new Insets(1, 4, 1, 4));
        this.u.setHorizontalAlignment(4);
        this.j.setFont(new Font("Tahoma", 1, 11));
        this.j.setText("EAN Trib.");
        this.cj.setFont(new Font("Tahoma", 1, 11));
        this.cj.setText("Outras Desp. Acess\u00f3rias");
        this.aM.setHorizontalAlignment(4);
        this.b.setFont(new Font("Arial", 1, 12));
        this.b.setSelected(true);
        this.b.setText("Valor Total Bruto comp\u00f5e o Valor Total dos Produtos e Servi\u00e7os");
        this.aX.setFont(new Font("Tahoma", 1, 11));
        this.aX.setText("Pedido de Compra");
        this.aE.setFont(new Font("Tahoma", 1, 11));
        this.aE.setText("N\u00famero do Item do Pedido de Compra");
        this.aF.setFont(new Font("Tahoma", 1, 11));
        this.aF.setText("N\u00famero de Controle da FCI");
        GroupLayout pnlBasico2Layout = new GroupLayout(this.j);
        this.j.setLayout(pnlBasico2Layout);
        pnlBasico2Layout.setHorizontalGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlBasico2Layout.createSequentialGroup().addContainerGap().addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlBasico2Layout.createSequentialGroup().addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.cm).addComponent(this.B)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlBasico2Layout.createSequentialGroup().addComponent(this.h, -1, 718, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.r).addGap(6, 6, 6)).addComponent(this.F, -1, 779, 32767))).addGroup(pnlBasico2Layout.createSequentialGroup().addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.aH, -1, 42, 32767).addComponent(this.aX).addComponent(this.cf).addComponent(this.cg).addComponent(this.ck).addComponent(this.bb)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.y, -2, 150, -2).addComponent(this.A, -1, 150, 32767).addComponent(this.a, -1, 150, 32767).addComponent(this.d, -1, 150, 32767).addComponent(this.aN, -1, 150, 32767).addComponent(this.D, -1, 150, 32767).addComponent(this.C, -1, 150, 32767).addComponent(this.u, -1, 150, 32767)).addGap(18, 18, 18).addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlBasico2Layout.createSequentialGroup().addComponent(this.P).addGap(7, 7, 7).addComponent(this.n, -1, 150, 32767).addGap(18, 18, 18).addComponent(this.k).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, 0, 150, 32767)).addGroup(pnlBasico2Layout.createSequentialGroup().addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.bc).addComponent(this.bd).addComponent(this.ch).addComponent(this.j)).addGap(7, 7, 7).addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.e, -1, 150, 32767).addComponent(this.aK, -2, 150, -2).addComponent(this.Z, -1, 150, 32767).addComponent(this.Y, -1, 150, 32767)).addGap(18, 18, 18).addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.f, -1, -1, 32767).addComponent(this.g).addComponent(this.ci).addComponent(this.cj)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.b, -1, 150, 32767).addComponent(this.aM, -2, 150, -2).addComponent(this.aL, -1, 150, 32767).addComponent(this.c, -1, 150, 32767))).addComponent(this.b).addGroup(pnlBasico2Layout.createSequentialGroup().addComponent(this.aE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.x, -2, 244, -2).addComponent(this.y, -2, 150, -2))).addComponent(this.aF)).addGap(0, 0, 32767)).addGroup(pnlBasico2Layout.createSequentialGroup().addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.e).addComponent(this.i)).addContainerGap(-1, 32767)))));
        pnlBasico2Layout.linkSize(0, this.e, this.i, this.aH, this.aX, this.bb, this.cf, this.cg, this.ck);
        pnlBasico2Layout.linkSize(0, this.j, this.P, this.bc, this.bd, this.ch);
        pnlBasico2Layout.linkSize(0, this.f, this.g, this.k, this.ci, this.cj);
        pnlBasico2Layout.linkSize(0, this.a, this.y, this.a, this.b, this.c, this.Y, this.Z, this.aK, this.aL, this.aM, this.aN, this.d, this.e, this.n, this.u, this.y, this.A, this.C, this.D);
        pnlBasico2Layout.setVerticalGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlBasico2Layout.createSequentialGroup().addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.B).addComponent(this.h, -2, -1, -2).addComponent(this.r)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.cm).addComponent(this.F, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.u, -2, -1, -2).addComponent(this.aH)).addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.P).addComponent(this.k).addComponent(this.n, -2, -1, -2).addComponent(this.a, -2, -1, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 36, 32767).addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlBasico2Layout.createSequentialGroup().addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.cf).addComponent(this.C, -2, -1, -2)).addGap(6, 6, 6).addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.cg).addComponent(this.D, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ck).addComponent(this.aN, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.i).addComponent(this.d, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.e).addComponent(this.a, -2, -1, -2))).addGroup(pnlBasico2Layout.createSequentialGroup().addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bc).addComponent(this.f).addComponent(this.Y, -2, -1, -2).addComponent(this.b, -2, -1, -2)).addGap(6, 6, 6).addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bd).addComponent(this.Z, -2, -1, -2).addComponent(this.g).addComponent(this.c, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ch).addComponent(this.aK, -2, -1, -2).addComponent(this.ci).addComponent(this.aL, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.j).addComponent(this.e, -2, -1, -2).addComponent(this.aM, -2, -1, -2).addComponent(this.cj)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.aX).addComponent(this.A, -2, -1, -2)).addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.aE).addComponent(this.y, -2, -1, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlBasico2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bb).addComponent(this.y, -2, -1, -2)).addComponent(this.aF).addComponent(this.x, -2, -1, -2))));
        this.h.setBorder(BorderFactory.createTitledBorder("NVE (8 no m\u00e1ximo)"));
        this.p.setText("Incluir");
        this.n.setText("Detalhar");
        this.o.setText("Excluir");
        GroupLayout jPanel8Layout = new GroupLayout(this.h);
        this.h.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addComponent(this.p).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.n).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.o).addContainerGap(641, 32767)).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addComponent(this.e, -1, 840, 32767).addContainerGap())));
        jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup().addGap(0, 126, 32767).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.p).addComponent(this.n).addComponent(this.o))).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addComponent(this.e, -2, 118, -2).addGap(0, 31, 32767))));
        GroupLayout pnlDadosLayout = new GroupLayout(this.s);
        this.s.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(pnlDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDadosLayout.createSequentialGroup().addContainerGap().addGroup(pnlDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.j, -1, -1, 32767).addComponent(this.h, -1, -1, 32767)).addContainerGap()));
        pnlDadosLayout.setVerticalGroup(pnlDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDadosLayout.createSequentialGroup().addContainerGap().addComponent(this.j, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.h, -2, -1, -2).addContainerGap(395, 32767)));
        this.a.addTab("Dados", this.s);
        this.b.setMinimumSize(new Dimension(0, 0));
        this.R.setFont(new Font("Tahoma", 1, 11));
        this.R.setText("* Regime");
        this.E.setBorder(BorderFactory.createTitledBorder("Simples Nacional"));
        this.bi.setFont(new Font("Tahoma", 1, 11));
        this.bi.setText("* Situa\u00e7\u00e3o tribut\u00e1ria");
        this.bo.setFont(new Font("Tahoma", 1, 11));
        this.bo.setText("* Origem");
        GroupLayout jPanel4Layout = new GroupLayout(this.d);
        this.d.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 12, 32767));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 0, 32767));
        this.ab.setHorizontalAlignment(4);
        this.bj.setFont(new Font("Tahoma", 1, 11));
        this.bj.setText("Cr\u00e9dito do ICMs que pode ser aproveitado");
        this.bg.setFont(new Font("Tahoma", 1, 11));
        this.bg.setText("Al\u00edquota aplic\u00e1vel de c\u00e1lculo do cr\u00e9dito");
        this.ad.setHorizontalAlignment(4);
        this.G.setBorder(BorderFactory.createTitledBorder("ICMS ST"));
        this.bs.setFont(new Font("Tahoma", 1, 11));
        this.bs.setText("Modalid. de determ. da BC ICMS ST");
        this.bf.setFont(new Font("Tahoma", 1, 11));
        this.bf.setText("% redu\u00e7\u00e3o da BC ICMS ST");
        this.aa.setHorizontalAlignment(4);
        this.bt.setFont(new Font("Tahoma", 1, 11));
        this.bt.setText("% margem de valor adic. ICMS ST");
        this.ak.setHorizontalAlignment(4);
        this.bu.setFont(new Font("Tahoma", 1, 11));
        this.bu.setText("BC ICMS ST");
        this.bp.setFont(new Font("Tahoma", 1, 11));
        this.bp.setText("Al\u00edquota do ICMS ST");
        this.bv.setFont(new Font("Tahoma", 1, 11));
        this.bv.setText("ICMS ST");
        this.am.setHorizontalAlignment(4);
        this.ah.setHorizontalAlignment(4);
        this.al.setHorizontalAlignment(4);
        this.bq.setFont(new Font("Tahoma", 1, 11));
        this.bq.setText("BC ICMS ST retido anteriormente");
        this.br.setFont(new Font("Tahoma", 1, 11));
        this.br.setText("ICMS ST retido anteriormente");
        this.ai.setHorizontalAlignment(4);
        this.aj.setHorizontalAlignment(4);
        this.aD.setFont(new Font("Arial", 0, 12));
        this.aD.setForeground(Color.red);
        GroupLayout pnlSimplesNacionalICMSSTLayout = new GroupLayout(this.G);
        this.G.setLayout(pnlSimplesNacionalICMSSTLayout);
        pnlSimplesNacionalICMSSTLayout.setHorizontalGroup(pnlSimplesNacionalICMSSTLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlSimplesNacionalICMSSTLayout.createSequentialGroup().addContainerGap().addGroup(pnlSimplesNacionalICMSSTLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.aD, -1, -1, 32767).addGroup(pnlSimplesNacionalICMSSTLayout.createSequentialGroup().addGroup(pnlSimplesNacionalICMSSTLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.bv, -1, -1, 32767).addComponent(this.bp, -1, -1, 32767).addComponent(this.bu, -1, -1, 32767).addComponent(this.bt, -1, -1, 32767).addComponent(this.bf, -1, -1, 32767).addComponent(this.bs, -1, -1, 32767).addComponent(this.bq).addComponent(this.br)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(pnlSimplesNacionalICMSSTLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.aj, -2, 160, -2).addComponent(this.ai, -2, 160, -2).addComponent(this.am, -2, 160, -2).addComponent(this.ah, -2, 160, -2).addComponent(this.D, GroupLayout.Alignment.TRAILING, 0, 166, 32767).addGroup(pnlSimplesNacionalICMSSTLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.ak, GroupLayout.Alignment.LEADING, -1, 160, 32767).addComponent(this.aa, GroupLayout.Alignment.LEADING, -1, 160, 32767)).addComponent(this.al, -2, 160, -2)))).addContainerGap()));
        pnlSimplesNacionalICMSSTLayout.linkSize(0, this.bf, this.bp, this.bq, this.br, this.bs, this.bt, this.bu, this.bv);
        pnlSimplesNacionalICMSSTLayout.setVerticalGroup(pnlSimplesNacionalICMSSTLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlSimplesNacionalICMSSTLayout.createSequentialGroup().addGroup(pnlSimplesNacionalICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bs, -2, 19, -2).addComponent(this.D, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlSimplesNacionalICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bf, -2, 19, -2).addComponent(this.aa, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlSimplesNacionalICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bt, -2, 19, -2).addComponent(this.ak, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlSimplesNacionalICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.al, -2, 16, -2).addComponent(this.bu, -2, 19, -2)).addGap(0, 0, 0).addGroup(pnlSimplesNacionalICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ah, -2, 16, -2).addComponent(this.bp, -2, 19, -2)).addGap(0, 0, 0).addGroup(pnlSimplesNacionalICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.am, -2, 16, -2).addComponent(this.bv, -2, 19, -2)).addGap(0, 0, 0).addGroup(pnlSimplesNacionalICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bq, -2, 19, -2).addComponent(this.ai, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlSimplesNacionalICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.br, -2, 19, -2).addComponent(this.aj, -2, 16, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.aD, -1, 15, 32767).addContainerGap()));
        this.F.setBorder(BorderFactory.createTitledBorder("ICMS"));
        this.bl.setFont(new Font("Tahoma", 1, 11));
        this.bl.setText("Modalid. de determ. da BC ICMS");
        this.bh.setFont(new Font("Tahoma", 1, 11));
        this.bh.setText("% redu\u00e7\u00e3o da BC ICMS");
        this.ac.setHorizontalAlignment(4);
        this.bm.setFont(new Font("Tahoma", 1, 11));
        this.bm.setText("BC ICMS");
        this.af.setHorizontalAlignment(4);
        this.bk.setFont(new Font("Tahoma", 1, 11));
        this.bk.setText("Al\u00edquota do ICMS");
        this.ae.setHorizontalAlignment(4);
        this.bn.setFont(new Font("Tahoma", 1, 11));
        this.bn.setText("ICMS da Opera\u00e7\u00e3o");
        this.ag.setHorizontalAlignment(4);
        GroupLayout pnlSimplesNacionalICMSLayout = new GroupLayout(this.F);
        this.F.setLayout(pnlSimplesNacionalICMSLayout);
        pnlSimplesNacionalICMSLayout.setHorizontalGroup(pnlSimplesNacionalICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlSimplesNacionalICMSLayout.createSequentialGroup().addGroup(pnlSimplesNacionalICMSLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(GroupLayout.Alignment.LEADING, pnlSimplesNacionalICMSLayout.createSequentialGroup().addContainerGap().addComponent(this.bn, -1, -1, 32767)).addGroup(GroupLayout.Alignment.LEADING, pnlSimplesNacionalICMSLayout.createSequentialGroup().addContainerGap().addComponent(this.bk, -1, -1, 32767)).addGroup(GroupLayout.Alignment.LEADING, pnlSimplesNacionalICMSLayout.createSequentialGroup().addContainerGap().addComponent(this.bm, -1, -1, 32767)).addGroup(GroupLayout.Alignment.LEADING, pnlSimplesNacionalICMSLayout.createSequentialGroup().addContainerGap().addComponent(this.bh, -1, -1, 32767)).addGroup(GroupLayout.Alignment.LEADING, pnlSimplesNacionalICMSLayout.createSequentialGroup().addGap(12, 12, 12).addComponent(this.bl, -1, -1, 32767))).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(pnlSimplesNacionalICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ac, -2, 160, -2).addComponent(this.af, -2, 160, -2).addComponent(this.ae, -2, 160, -2).addComponent(this.ag, -2, 160, -2).addComponent(this.B, 0, 166, 32767)).addContainerGap()));
        pnlSimplesNacionalICMSLayout.setVerticalGroup(pnlSimplesNacionalICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlSimplesNacionalICMSLayout.createSequentialGroup().addGroup(pnlSimplesNacionalICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bl, -2, 19, -2).addComponent(this.B, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlSimplesNacionalICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bh, -2, 19, -2).addComponent(this.ac, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlSimplesNacionalICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bm, -2, 19, -2).addComponent(this.af, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlSimplesNacionalICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bk, -2, 19, -2).addComponent(this.ae, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlSimplesNacionalICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bn, -2, 19, -2).addComponent(this.ag, -2, 16, -2)).addContainerGap(-1, 32767)));
        GroupLayout pnlSimplesNacionalLayout = new GroupLayout(this.E);
        this.E.setLayout(pnlSimplesNacionalLayout);
        pnlSimplesNacionalLayout.setHorizontalGroup(pnlSimplesNacionalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlSimplesNacionalLayout.createSequentialGroup().addContainerGap().addGroup(pnlSimplesNacionalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlSimplesNacionalLayout.createSequentialGroup().addGroup(pnlSimplesNacionalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlSimplesNacionalLayout.createSequentialGroup().addGroup(pnlSimplesNacionalLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.bj, -1, -1, 32767).addComponent(this.bg, -2, 244, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlSimplesNacionalLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.ad).addComponent(this.ab, -2, 155, -2))).addGroup(pnlSimplesNacionalLayout.createSequentialGroup().addComponent(this.F, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.G, -1, -1, 32767))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d, -1, -1, 32767)).addGroup(pnlSimplesNacionalLayout.createSequentialGroup().addComponent(this.bo).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.C, 0, -1, 32767)).addGroup(pnlSimplesNacionalLayout.createSequentialGroup().addComponent(this.bi).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.A, 0, -1, 32767))).addContainerGap()));
        pnlSimplesNacionalLayout.setVerticalGroup(pnlSimplesNacionalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlSimplesNacionalLayout.createSequentialGroup().addGroup(pnlSimplesNacionalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE, false).addComponent(this.bi).addComponent(this.A, -2, 16, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlSimplesNacionalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE, false).addComponent(this.bo).addComponent(this.C, -2, 16, -2)).addGroup(pnlSimplesNacionalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlSimplesNacionalLayout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(pnlSimplesNacionalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bg, -2, 19, -2).addComponent(this.ab, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlSimplesNacionalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bj, -2, 19, -2).addComponent(this.ad, -2, 16, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlSimplesNacionalLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.F, -1, -1, 32767).addComponent(this.G, -1, -1, 32767)).addGap(43, 43, 43)).addGroup(pnlSimplesNacionalLayout.createSequentialGroup().addGap(28, 28, 28).addComponent(this.d, -1, -1, 32767).addContainerGap()))));
        this.J.setBorder(BorderFactory.createTitledBorder("Tributa\u00e7\u00e3o Normal"));
        this.bA.setFont(new Font("Tahoma", 1, 11));
        this.bA.setText("* Situa\u00e7\u00e3o tribut\u00e1ria");
        this.bR.setFont(new Font("Tahoma", 1, 11));
        this.bR.setText("* Origem");
        this.H.setBorder(BorderFactory.createTitledBorder("ICMS"));
        this.bE.setFont(new Font("Tahoma", 1, 11));
        this.bE.setText("Modalid. de determ. da BC ICMS");
        this.bH.setFont(new Font("Tahoma", 1, 11));
        this.bH.setText("% redu\u00e7\u00e3o da BC ICMS");
        this.aq.setHorizontalAlignment(4);
        this.bK.setFont(new Font("Tahoma", 1, 11));
        this.bK.setText("BC ICMS \u00b9");
        this.at.setHorizontalAlignment(4);
        this.bB.setFont(new Font("Tahoma", 1, 11));
        this.bB.setText("Al\u00edquota do ICMS");
        this.ap.setHorizontalAlignment(4);
        this.bL.setFont(new Font("Tahoma", 1, 11));
        this.bL.setText("ICMS");
        this.au.setHorizontalAlignment(4);
        this.bI.setFont(new Font("Tahoma", 1, 11));
        this.bI.setText("% BC da opera\u00e7\u00e3o pr\u00f3pria");
        this.ar.setHorizontalAlignment(4);
        this.bC.setFont(new Font("Dialog", 2, 12));
        this.bC.setText("<html><p>\u00b9 Aten\u00e7\u00e3o: a Base de C\u00e1lculo do produto deve ser informada contemplando todos os valores previstos na legisla\u00e7\u00e3o pertinente, ainda que algumas de suas parcelas tenham sido informadas em campos espec\u00edficos (frete, seguro, desconto, IPI, Outras Despesas Acess\u00f3rias, etc). </p></html>");
        this.bN.setFont(new Font("Tahoma", 1, 11));
        this.bN.setText("Valor ICMS Desonerado");
        this.av.setHorizontalAlignment(4);
        this.bF.setFont(new Font("Tahoma", 1, 11));
        this.bF.setText("Motivo da Desonera\u00e7\u00e3o do ICMS");
        this.K.setMaximumSize(new Dimension(400, 20));
        this.bQ.setFont(new Font("Tahoma", 1, 11));
        this.bQ.setText("ICMS da Opera\u00e7\u00e3o");
        this.bJ.setFont(new Font("Tahoma", 1, 11));
        this.bJ.setText("% do Diferimento");
        this.bP.setFont(new Font("Tahoma", 1, 11));
        this.bP.setText("Valor ICMS Diferido");
        this.ay.setHorizontalAlignment(4);
        this.as.setHorizontalAlignment(4);
        this.ax.setHorizontalAlignment(4);
        GroupLayout pnlTribNormICMSLayout = new GroupLayout(this.H);
        this.H.setLayout(pnlTribNormICMSLayout);
        pnlTribNormICMSLayout.setHorizontalGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTribNormICMSLayout.createSequentialGroup().addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(pnlTribNormICMSLayout.createSequentialGroup().addContainerGap().addComponent(this.bI, -1, -1, 32767)).addGroup(pnlTribNormICMSLayout.createSequentialGroup().addContainerGap().addComponent(this.bL, -1, -1, 32767)).addGroup(pnlTribNormICMSLayout.createSequentialGroup().addContainerGap().addComponent(this.bB, -1, -1, 32767)).addGroup(pnlTribNormICMSLayout.createSequentialGroup().addContainerGap().addComponent(this.bK, -1, -1, 32767)).addGroup(pnlTribNormICMSLayout.createSequentialGroup().addContainerGap().addComponent(this.bH, -1, -1, 32767)).addGroup(pnlTribNormICMSLayout.createSequentialGroup().addGap(12, 12, 12).addComponent(this.bE, -1, 186, 32767))).addGroup(pnlTribNormICMSLayout.createSequentialGroup().addContainerGap().addComponent(this.bN, -2, 177, -2))).addGap(18, 18, 18).addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.I, 0, -1, 32767).addGroup(pnlTribNormICMSLayout.createSequentialGroup().addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.at, GroupLayout.Alignment.LEADING, -1, 160, 32767).addComponent(this.ap, GroupLayout.Alignment.LEADING, -1, 160, 32767).addComponent(this.au, GroupLayout.Alignment.LEADING, -1, 160, 32767).addComponent(this.ar, GroupLayout.Alignment.LEADING, -1, 160, 32767).addComponent(this.aq, GroupLayout.Alignment.LEADING, -1, 160, 32767).addComponent(this.av, GroupLayout.Alignment.LEADING)).addGap(0, 0, 32767))).addGap(12, 12, 12)).addGroup(GroupLayout.Alignment.TRAILING, pnlTribNormICMSLayout.createSequentialGroup().addComponent(this.bC, -2, 0, 32767).addContainerGap()).addGroup(pnlTribNormICMSLayout.createSequentialGroup().addContainerGap().addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTribNormICMSLayout.createSequentialGroup().addComponent(this.bF, -2, 188, -2).addGap(18, 18, 18).addComponent(this.J, 0, 164, 32767)).addGroup(pnlTribNormICMSLayout.createSequentialGroup().addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.bJ, -1, -1, 32767).addComponent(this.bQ, -2, 147, -2)).addComponent(this.bP, -2, 177, -2)).addGap(29, 29, 29).addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ay, -2, 160, -2).addComponent(this.as, -2, 160, -2).addComponent(this.ax, -2, 160, -2)))).addGap(8, 8, 8)));
        pnlTribNormICMSLayout.setVerticalGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTribNormICMSLayout.createSequentialGroup().addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bE, -2, 19, -2).addComponent(this.I, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bH, -2, 19, -2).addComponent(this.aq, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bK, -2, 19, -2).addComponent(this.at, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bB, -2, 19, -2).addComponent(this.ap, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bL, -2, 19, -2).addComponent(this.au, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bI, -2, 19, -2).addComponent(this.ar, -2, 16, -2)).addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.av, -2, 16, -2).addComponent(this.bN, -2, 19, -2)).addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bF, -2, 19, -2).addComponent(this.J, -2, 16, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bQ, -2, 19, -2).addComponent(this.ay, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bJ, -2, 19, -2).addComponent(this.as, -2, 16, -2)).addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ax, -2, 16, -2).addComponent(this.bP, -2, 19, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 14, 32767).addComponent(this.bC, -2, -1, -2)));
        this.I.setBorder(BorderFactory.createTitledBorder("ICMS ST"));
        this.ca.setFont(new Font("Tahoma", 1, 11));
        this.ca.setText("Modalid. de determ. da BC ICMS ST");
        this.cc.setFont(new Font("Tahoma", 1, 11));
        this.cc.setText("% redu\u00e7\u00e3o da BC ICMS ST");
        this.aI.setHorizontalAlignment(4);
        this.cb.setFont(new Font("Tahoma", 1, 11));
        this.cb.setText("% margem de valor adic. ICMS ST");
        this.aH.setHorizontalAlignment(4);
        this.bT.setFont(new Font("Tahoma", 1, 11));
        this.bT.setText("BC ICMS ST");
        this.bS.setFont(new Font("Tahoma", 1, 11));
        this.bS.setText("Al\u00edquota do ICMS ST");
        this.ce.setFont(new Font("Tahoma", 1, 11));
        this.ce.setText("ICMS ST");
        this.aJ.setHorizontalAlignment(4);
        this.az.setHorizontalAlignment(4);
        this.aA.setHorizontalAlignment(4);
        this.cd.setFont(new Font("Tahoma", 1, 11));
        this.cd.setText("UF do ICMS ST devido na opera\u00e7\u00e3o");
        this.bV.setFont(new Font("Tahoma", 1, 11));
        this.bV.setText("BC ICMS ST retido na UF remetente");
        this.bY.setFont(new Font("Tahoma", 1, 11));
        this.bY.setText("ICMS ST retido na UF remetente");
        this.bW.setFont(new Font("Tahoma", 1, 11));
        this.bW.setText("BC ICMS ST da UF destino");
        this.bZ.setFont(new Font("Tahoma", 1, 11));
        this.bZ.setText("ICMS ST da UF destino");
        this.aC.setHorizontalAlignment(4);
        this.aF.setHorizontalAlignment(4);
        this.aD.setHorizontalAlignment(4);
        this.aG.setHorizontalAlignment(4);
        this.bU.setFont(new Font("Tahoma", 1, 11));
        this.bU.setText("BC ICMS ST retido anteriormente");
        this.aB.setHorizontalAlignment(4);
        this.aB.setMinimumSize(new Dimension(6, 100));
        this.bX.setFont(new Font("Tahoma", 1, 11));
        this.bX.setText("ICMS ST retido anteriormente");
        this.aE.setHorizontalAlignment(4);
        this.aE.setMinimumSize(new Dimension(6, 100));
        this.aw.setHorizontalAlignment(4);
        this.bO.setFont(new Font("Tahoma", 1, 11));
        this.bO.setText("Valor ICMS Desonerado");
        this.bG.setFont(new Font("Tahoma", 1, 11));
        this.bG.setText("Motivo da Desonera\u00e7\u00e3o do ICMS");
        this.K.setMaximumSize(new Dimension(400, 20));
        GroupLayout pnlTribNormICMSSTLayout = new GroupLayout(this.I);
        this.I.setLayout(pnlTribNormICMSSTLayout);
        pnlTribNormICMSSTLayout.setHorizontalGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTribNormICMSSTLayout.createSequentialGroup().addContainerGap().addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTribNormICMSSTLayout.createSequentialGroup().addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.ce, -1, -1, 32767).addComponent(this.bS, -1, -1, 32767).addComponent(this.bT, -1, -1, 32767).addComponent(this.cb, -1, -1, 32767).addComponent(this.cc, -1, -1, 32767).addComponent(this.ca, -1, -1, 32767).addComponent(this.cd, -1, -1, 32767).addComponent(this.bY, -1, -1, 32767).addComponent(this.bW, -1, -1, 32767).addComponent(this.bZ, -1, -1, 32767).addComponent(this.bU, -1, -1, 32767).addComponent(this.bX, -1, -1, 32767).addComponent(this.bV, -1, 207, 32767).addComponent(this.bO, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTribNormICMSSTLayout.createSequentialGroup().addComponent(this.aw, -2, 160, -2).addGap(0, 0, 32767)).addGroup(pnlTribNormICMSSTLayout.createSequentialGroup().addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.aJ, -2, 160, -2).addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.az, -2, 160, -2).addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.aA, -2, 160, -2).addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.aH, -2, 160, -2).addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.aC, -2, 160, -2).addComponent(this.aF, -2, 160, -2).addComponent(this.aD, -2, 160, -2).addComponent(this.aG, -2, 160, -2).addComponent(this.aB, -2, 160, -2).addComponent(this.aE, -2, 160, -2).addComponent(this.M, 0, 161, 32767).addComponent(this.aI, -2, 145, -2)))))).addGap(15, 15, 15)).addGroup(pnlTribNormICMSSTLayout.createSequentialGroup().addComponent(this.N, -2, 55, -2).addContainerGap(-1, 32767)))).addGroup(pnlTribNormICMSSTLayout.createSequentialGroup().addComponent(this.bG, -2, 196, -2).addGap(18, 18, 18).addComponent(this.K, 0, 164, 32767).addContainerGap()))));
        pnlTribNormICMSSTLayout.linkSize(0, this.bS, this.bT, this.bU, this.bV, this.bW, this.bX, this.bY, this.bZ, this.ca, this.cb, this.cc, this.cd, this.ce);
        pnlTribNormICMSSTLayout.linkSize(0, this.aH, this.aI);
        pnlTribNormICMSSTLayout.setVerticalGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTribNormICMSSTLayout.createSequentialGroup().addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ca, -2, 19, -2).addComponent(this.M, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.cc, -2, 19, -2).addComponent(this.aI, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.cb, -2, 19, -2).addComponent(this.aH, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bT, -2, 19, -2).addComponent(this.aA, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bS, -2, 19, -2).addComponent(this.az, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ce, -2, 19, -2).addComponent(this.aJ, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.cd, -2, 19, -2).addComponent(this.N, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.aC, -2, 16, -2).addComponent(this.bV, -2, 19, -2)).addGap(0, 0, 0).addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bY, -2, 19, -2).addComponent(this.aF, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bW, -2, 19, -2).addComponent(this.aD, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bZ, -2, 19, -2).addComponent(this.aG, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bU, -2, 19, -2).addComponent(this.aB, -2, 14, -2)).addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bX, -2, 19, -2).addComponent(this.aE, -2, 16, -2)).addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.aw, -2, 16, -2).addComponent(this.bO, -2, 19, -2)).addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.K, -2, 16, -2).addComponent(this.bG, -2, 19, -2)).addContainerGap(-1, 32767)));
        pnlTribNormICMSSTLayout.linkSize(1, this.aB, this.aC, this.aD, this.aE, this.aF, this.aG);
        GroupLayout pnlTribNormalLayout = new GroupLayout(this.J);
        this.J.setLayout(pnlTribNormalLayout);
        pnlTribNormalLayout.setHorizontalGroup(pnlTribNormalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTribNormalLayout.createSequentialGroup().addContainerGap().addGroup(pnlTribNormalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTribNormalLayout.createSequentialGroup().addComponent(this.H, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.I, -1, -1, 32767)).addGroup(pnlTribNormalLayout.createSequentialGroup().addComponent(this.bR).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.L, 0, -1, 32767)).addGroup(pnlTribNormalLayout.createSequentialGroup().addComponent(this.bA).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.H, 0, -1, 32767))).addContainerGap()));
        pnlTribNormalLayout.setVerticalGroup(pnlTribNormalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTribNormalLayout.createSequentialGroup().addGroup(pnlTribNormalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE, false).addComponent(this.bA).addComponent(this.H, -2, 16, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTribNormalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE, false).addComponent(this.bR).addComponent(this.L, -2, 16, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTribNormalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.H, -1, -1, 32767).addComponent(this.I, -2, -1, -2))));
        GroupLayout jPanel3Layout = new GroupLayout(this.c);
        this.c.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.E, 0, -1, 32767).addComponent(this.J, -1, -1, 32767).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.R).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.j, -2, 244, -2))).addContainerGap()));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.R).addComponent(this.j, -2, 16, -2)).addGap(5, 5, 5).addComponent(this.J, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.E, -2, 328, -2).addContainerGap(34, 32767)));
        this.b.addTab("ICMS", this.c);
        this.b.setFont(new Font("Dialog", 2, 12));
        this.b.setText("<html>\u00b9 A informa\u00e7\u00e3o da Classe de enquadramento do IPI para Cigarros e Bebidas, quando aplic\u00e1vel, deve ser informada utilizando a codifica\u00e7\u00e3o prevista nos Atos Normativos editados pela Receita Federal.<br><br>\u00b2 A informa\u00e7\u00e3o do c\u00f3digo de selo, quando aplic\u00e1vel, deve ser informada utilizando a codifica\u00e7\u00e3o prevista nos Atos Normativos editados pela Receita Federal.<p></p></html>");
        this.Z.setFont(new Font("Tahoma", 1, 11));
        this.Z.setText("Situa\u00e7\u00e3o tribut\u00e1ria");
        this.ac.setFont(new Font("Tahoma", 1, 11));
        this.ac.setText("Classe de enquadramento \u00b9");
        this.q.setHorizontalAlignment(4);
        this.aa.setFont(new Font("Tahoma", 1, 11));
        this.aa.setText("CNPJ do Produtor");
        this.v.setHorizontalAlignment(2);
        this.ab.setFont(new Font("Tahoma", 1, 11));
        this.ab.setText("C\u00f3digo do selo de controle \u00b2");
        this.p.setHorizontalAlignment(4);
        this.ag.setFont(new Font("Tahoma", 1, 11));
        this.ag.setText("Tipo de c\u00e1lculo");
        this.ah.setFont(new Font("Tahoma", 1, 11));
        this.ah.setText("Valor da base de c\u00e1lculo");
        this.z.setHorizontalAlignment(4);
        this.ad.setFont(new Font("Tahoma", 1, 11));
        this.ad.setText("Al\u00edquota");
        this.y.setHorizontalAlignment(4);
        this.af.setFont(new Font("Tahoma", 1, 11));
        this.af.setText("Qtd. total unidade padr\u00e3o");
        this.s.setHorizontalAlignment(4);
        this.aj.setFont(new Font("Tahoma", 1, 11));
        this.aj.setText("Valor por unidade");
        this.B.setHorizontalAlignment(4);
        this.ai.setFont(new Font("Tahoma", 1, 11));
        this.ai.setText("Valor do IPI");
        this.A.setHorizontalAlignment(4);
        this.Y.setFont(new Font("Tahoma", 1, 11));
        this.Y.setText("* C\u00f3digo de enquadramento");
        this.o.setHorizontalAlignment(4);
        this.ae.setFont(new Font("Tahoma", 1, 11));
        this.ae.setText("Qtd. do selo de controle");
        this.r.setHorizontalAlignment(4);
        GroupLayout pnlIPILayout = new GroupLayout(this.v);
        this.v.setLayout(pnlIPILayout);
        pnlIPILayout.setHorizontalGroup(pnlIPILayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlIPILayout.createSequentialGroup().addContainerGap().addGroup(pnlIPILayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b, -1, 847, 32767).addComponent(this.ae).addGroup(pnlIPILayout.createSequentialGroup().addGroup(pnlIPILayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.Z).addComponent(this.ac).addComponent(this.aa).addComponent(this.ab).addComponent(this.ag).addComponent(this.ah).addComponent(this.ad).addComponent(this.af).addComponent(this.aj).addComponent(this.ai)).addGap(32, 32, 32).addGroup(pnlIPILayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.l, -2, 253, -2).addGroup(pnlIPILayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.A, GroupLayout.Alignment.LEADING).addComponent(this.s, GroupLayout.Alignment.LEADING).addComponent(this.y, GroupLayout.Alignment.LEADING).addComponent(this.z, GroupLayout.Alignment.LEADING, -1, 164, 32767).addComponent(this.B, GroupLayout.Alignment.LEADING)).addComponent(this.v, -2, 165, -2).addComponent(this.p, -2, 485, -2).addComponent(this.r, -2, 103, -2).addGroup(pnlIPILayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.k, GroupLayout.Alignment.LEADING, 0, -1, 32767).addGroup(GroupLayout.Alignment.LEADING, pnlIPILayout.createSequentialGroup().addComponent(this.q, -2, 167, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.Y).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.o, -2, 131, -2)))))).addContainerGap()));
        pnlIPILayout.setVerticalGroup(pnlIPILayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlIPILayout.createSequentialGroup().addContainerGap().addGroup(pnlIPILayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Z, -2, 18, -2).addComponent(this.k, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlIPILayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ac, -2, 18, -2).addComponent(this.q, -2, 18, -2).addComponent(this.Y, -2, 18, -2).addComponent(this.o, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlIPILayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.aa, -2, 18, -2).addComponent(this.v, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlIPILayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ab, -2, 18, -2).addComponent(this.p, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlIPILayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ae, -2, 18, -2).addComponent(this.r, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlIPILayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.l, 0, 18, 32767).addComponent(this.ag, -1, -1, 32767)).addGap(3, 3, 3).addGroup(pnlIPILayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlIPILayout.createSequentialGroup().addComponent(this.ah, -2, 18, -2).addGap(3, 3, 3).addComponent(this.ad, -2, 18, -2).addGap(3, 3, 3).addComponent(this.af, -2, 18, -2).addGap(3, 3, 3).addComponent(this.aj, -2, 18, -2).addGap(3, 3, 3).addComponent(this.ai, -2, 18, -2)).addGroup(pnlIPILayout.createSequentialGroup().addComponent(this.z, -2, 18, -2).addGap(3, 3, 3).addComponent(this.y, -2, 18, -2).addGap(3, 3, 3).addComponent(this.s, -2, 18, -2).addGap(3, 3, 3).addComponent(this.B, -2, 18, -2).addGap(3, 3, 3).addComponent(this.A, -2, 18, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.b, -2, 73, -2).addContainerGap(476, 32767)));
        pnlIPILayout.linkSize(1, this.k, this.l);
        this.b.addTab("IPI", this.v);
        this.A.setBorder(BorderFactory.createTitledBorder(null, "PIS", 1, 2));
        this.aT.setFont(new Font("Tahoma", 1, 11));
        this.aT.setText("Tipo de c\u00e1lculo");
        this.aV.setFont(new Font("Tahoma", 1, 11));
        this.aV.setText("Valor da base de c\u00e1lculo");
        this.U.setHorizontalAlignment(4);
        this.aL.setFont(new Font("Tahoma", 1, 11));
        this.aL.setText("Al\u00edquota (percentual)");
        this.M.setHorizontalAlignment(4);
        this.aU.setFont(new Font("Tahoma", 1, 11));
        this.aU.setText("Al\u00edquota (em reais)");
        this.T.setHorizontalAlignment(4);
        this.aM.setFont(new Font("Tahoma", 1, 11));
        this.aM.setText("Quantidade vendida");
        this.N.setHorizontalAlignment(4);
        this.aW.setFont(new Font("Tahoma", 1, 11));
        this.aW.setText("Valor do PIS");
        this.V.setHorizontalAlignment(4);
        this.aK.setFont(new Font("Tahoma", 1, 11));
        this.aK.setText("* Situa\u00e7\u00e3o tribut\u00e1ria");
        GroupLayout pnlPIS1Layout = new GroupLayout(this.A);
        this.A.setLayout(pnlPIS1Layout);
        pnlPIS1Layout.setHorizontalGroup(pnlPIS1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPIS1Layout.createSequentialGroup().addContainerGap().addGroup(pnlPIS1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.aK).addComponent(this.aT).addGroup(pnlPIS1Layout.createSequentialGroup().addGroup(pnlPIS1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.aL).addComponent(this.aV).addComponent(this.aU).addComponent(this.aM).addComponent(this.aW)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(pnlPIS1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPIS1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.U, -1, 140, 32767).addComponent(this.M, -1, 140, 32767).addComponent(this.T, -1, 140, 32767).addComponent(this.N, GroupLayout.Alignment.LEADING, -1, 140, 32767).addComponent(this.V, GroupLayout.Alignment.LEADING, -1, 140, 32767)).addComponent(this.x, -2, 132, -2).addComponent(this.v, 0, 670, 32767)))).addContainerGap()));
        pnlPIS1Layout.linkSize(0, this.aK, this.aL, this.aM, this.aT, this.aU, this.aV, this.aW);
        pnlPIS1Layout.linkSize(0, this.x, this.M, this.N, this.T, this.U, this.V);
        pnlPIS1Layout.setVerticalGroup(pnlPIS1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPIS1Layout.createSequentialGroup().addGroup(pnlPIS1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.aK, -2, 18, -2).addComponent(this.v, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlPIS1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.aT, -2, 18, -2).addComponent(this.x, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlPIS1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.aV, -2, 18, -2).addComponent(this.U, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlPIS1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.aL, -2, 18, -2).addComponent(this.M, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlPIS1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.aU, -2, 18, -2).addComponent(this.T, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlPIS1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.aM, -2, 18, -2).addComponent(this.N, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlPIS1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.aW, -2, 18, -2).addComponent(this.V, -2, 18, -2))));
        this.B.setBorder(BorderFactory.createTitledBorder(null, "PIS ST", 1, 2));
        this.aP.setFont(new Font("Tahoma", 1, 11));
        this.aP.setText("Tipo de c\u00e1lculo");
        this.aR.setFont(new Font("Tahoma", 1, 11));
        this.aR.setText("Valor da base de c\u00e1lculo");
        this.R.setHorizontalAlignment(4);
        this.aN.setFont(new Font("Tahoma", 1, 11));
        this.aN.setText("Al\u00edquota (percentual)");
        this.O.setHorizontalAlignment(4);
        this.aQ.setFont(new Font("Tahoma", 1, 11));
        this.aQ.setText("Al\u00edquota (em reais)");
        this.Q.setHorizontalAlignment(4);
        this.aO.setFont(new Font("Tahoma", 1, 11));
        this.aO.setText("Quantidade vendida");
        this.P.setHorizontalAlignment(4);
        this.aS.setFont(new Font("Tahoma", 1, 11));
        this.aS.setText("Valor do PIS ST");
        this.S.setHorizontalAlignment(4);
        GroupLayout pnlPIS2Layout = new GroupLayout(this.B);
        this.B.setLayout(pnlPIS2Layout);
        pnlPIS2Layout.setHorizontalGroup(pnlPIS2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPIS2Layout.createSequentialGroup().addContainerGap().addGroup(pnlPIS2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.aR).addComponent(this.aQ).addComponent(this.aN).addComponent(this.aO).addComponent(this.aS).addComponent(this.aP)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(pnlPIS2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.S, -1, 140, 32767).addComponent(this.P, -1, 140, 32767).addComponent(this.Q, -1, 140, 32767).addComponent(this.O, -1, 140, 32767).addComponent(this.R, -2, 140, -2).addComponent(this.w, -2, 128, -2)).addContainerGap(538, 32767)));
        pnlPIS2Layout.linkSize(0, this.aN, this.aO, this.aP, this.aQ, this.aR, this.aS);
        pnlPIS2Layout.linkSize(0, this.w, this.O, this.P, this.Q, this.R, this.S);
        pnlPIS2Layout.setVerticalGroup(pnlPIS2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPIS2Layout.createSequentialGroup().addGroup(pnlPIS2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.aP, -2, 18, -2).addComponent(this.w, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlPIS2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.aR, -2, 18, -2).addComponent(this.R, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlPIS2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.O, -2, 18, -2).addComponent(this.aN, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlPIS2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Q, -2, 18, -2).addComponent(this.aQ, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlPIS2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.aO, -2, 18, -2).addComponent(this.P, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlPIS2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.aS, -2, 18, -2).addComponent(this.S, -2, 18, -2))));
        GroupLayout pnlPISLayout = new GroupLayout(this.z);
        this.z.setLayout(pnlPISLayout);
        pnlPISLayout.setHorizontalGroup(pnlPISLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPISLayout.createSequentialGroup().addContainerGap().addGroup(pnlPISLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.A, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.B, -1, -1, 32767)).addContainerGap()));
        pnlPISLayout.setVerticalGroup(pnlPISLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPISLayout.createSequentialGroup().addContainerGap().addComponent(this.A, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.B, -2, -1, -2).addContainerGap(469, 32767)));
        this.b.addTab("PIS", this.z);
        this.l.setBorder(BorderFactory.createTitledBorder(null, "COFINS", 1, 2));
        this.x.setFont(new Font("Tahoma", 1, 11));
        this.x.setText("Tipo de c\u00e1lculo");
        this.z.setFont(new Font("Tahoma", 1, 11));
        this.z.setText("Valor da base de c\u00e1lculo");
        this.l.setHorizontalAlignment(4);
        this.p.setFont(new Font("Tahoma", 1, 11));
        this.p.setText("Al\u00edquota (percentual)");
        this.d.setHorizontalAlignment(4);
        this.A.setFont(new Font("Tahoma", 1, 11));
        this.A.setText("Valor do COFINS");
        this.m.setHorizontalAlignment(4);
        this.y.setFont(new Font("Tahoma", 1, 11));
        this.y.setText("Al\u00edquota (em reais)");
        this.k.setHorizontalAlignment(4);
        this.q.setFont(new Font("Tahoma", 1, 11));
        this.q.setText("Quantidade vendida");
        this.e.setHorizontalAlignment(4);
        this.o.setFont(new Font("Tahoma", 1, 11));
        this.o.setText("* Situa\u00e7\u00e3o tribut\u00e1ria");
        GroupLayout pnlCOFINS1Layout = new GroupLayout(this.l);
        this.l.setLayout(pnlCOFINS1Layout);
        pnlCOFINS1Layout.setHorizontalGroup(pnlCOFINS1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlCOFINS1Layout.createSequentialGroup().addContainerGap().addGroup(pnlCOFINS1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.z).addComponent(this.p).addComponent(this.y).addComponent(this.q).addComponent(this.A).addComponent(this.x).addComponent(this.o)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(pnlCOFINS1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlCOFINS1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.d, GroupLayout.Alignment.LEADING, 0, 140, 32767).addComponent(this.m, GroupLayout.Alignment.LEADING, -1, 140, 32767).addComponent(this.e, GroupLayout.Alignment.LEADING, -1, 140, 32767).addComponent(this.k, GroupLayout.Alignment.LEADING, -1, 140, 32767).addComponent(this.d, GroupLayout.Alignment.LEADING, -1, 140, 32767).addComponent(this.l, GroupLayout.Alignment.LEADING, -1, 140, 32767)).addComponent(this.b, 0, 718, 32767)).addContainerGap()));
        pnlCOFINS1Layout.setVerticalGroup(pnlCOFINS1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlCOFINS1Layout.createSequentialGroup().addGroup(pnlCOFINS1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.o, -2, 18, -2).addComponent(this.b, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlCOFINS1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.x, -2, 18, -2).addComponent(this.d, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlCOFINS1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.z, -2, 18, -2).addComponent(this.l, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlCOFINS1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.d, -2, 18, -2).addComponent(this.p, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlCOFINS1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.k, -2, 18, -2).addComponent(this.y, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlCOFINS1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.q, -2, 18, -2).addComponent(this.e, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlCOFINS1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.m, -2, 18, -2).addComponent(this.A, -2, 18, -2))));
        this.m.setBorder(BorderFactory.createTitledBorder(null, "COFINS ST", 1, 2));
        this.t.setFont(new Font("Tahoma", 1, 11));
        this.t.setText("Tipo de c\u00e1lculo");
        this.v.setFont(new Font("Tahoma", 1, 11));
        this.v.setText("Valor da base de c\u00e1lculo");
        this.i.setHorizontalAlignment(4);
        this.r.setFont(new Font("Tahoma", 1, 11));
        this.r.setText("Al\u00edquota (percentual)");
        this.f.setHorizontalAlignment(4);
        this.w.setFont(new Font("Tahoma", 1, 11));
        this.w.setText("Valor do COFINS ST");
        this.j.setHorizontalAlignment(4);
        this.u.setFont(new Font("Tahoma", 1, 11));
        this.u.setText("Al\u00edquota (em reais)");
        this.h.setHorizontalAlignment(4);
        this.s.setFont(new Font("Tahoma", 1, 11));
        this.s.setText("Quantidade vendida");
        this.g.setHorizontalAlignment(4);
        GroupLayout pnlCOFINS2Layout = new GroupLayout(this.m);
        this.m.setLayout(pnlCOFINS2Layout);
        pnlCOFINS2Layout.setHorizontalGroup(pnlCOFINS2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlCOFINS2Layout.createSequentialGroup().addContainerGap().addGroup(pnlCOFINS2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.v).addComponent(this.r).addComponent(this.u).addComponent(this.s).addComponent(this.w).addComponent(this.t)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(pnlCOFINS2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.c, 0, 140, 32767).addComponent(this.j, -1, 140, 32767).addComponent(this.g, -1, 140, 32767).addComponent(this.h, -1, 140, 32767).addComponent(this.f, -1, 140, 32767).addComponent(this.i, -1, 140, 32767)).addGap(588, 588, 588)));
        pnlCOFINS2Layout.setVerticalGroup(pnlCOFINS2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlCOFINS2Layout.createSequentialGroup().addGroup(pnlCOFINS2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.t, -2, 18, -2).addComponent(this.c, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlCOFINS2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.v, -2, 18, -2).addComponent(this.i, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlCOFINS2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.f, -2, 18, -2).addComponent(this.r, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlCOFINS2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.h, -2, 18, -2).addComponent(this.u, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlCOFINS2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.s, -2, 18, -2).addComponent(this.g, -2, 18, -2)).addGap(3, 3, 3).addGroup(pnlCOFINS2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.j, -2, 18, -2).addComponent(this.w, -2, 18, -2))));
        GroupLayout pnlCOFINSLayout = new GroupLayout(this.k);
        this.k.setLayout(pnlCOFINSLayout);
        pnlCOFINSLayout.setHorizontalGroup(pnlCOFINSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlCOFINSLayout.createSequentialGroup().addContainerGap().addGroup(pnlCOFINSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.l, -1, -1, 32767).addComponent(this.m, -1, -1, 32767)).addContainerGap()));
        pnlCOFINSLayout.setVerticalGroup(pnlCOFINSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlCOFINSLayout.createSequentialGroup().addContainerGap().addComponent(this.l, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.m, -2, -1, -2).addContainerGap(469, 32767)));
        this.b.addTab("COFINS", this.k);
        this.S.setFont(new Font("Tahoma", 1, 11));
        this.S.setText("Valor base de c\u00e1lculo");
        this.r.setHorizontalAlignment(4);
        this.U.setFont(new Font("Tahoma", 1, 11));
        this.U.setText("Valor despesas aduaneiras");
        this.s.setHorizontalAlignment(4);
        this.W.setFont(new Font("Tahoma", 1, 11));
        this.W.setText("Valor imposto de importa\u00e7\u00e3o");
        this.t.setHorizontalAlignment(4);
        this.X.setFont(new Font("Tahoma", 1, 11));
        this.X.setText("Valor do IOF");
        this.u.setHorizontalAlignment(4);
        GroupLayout pnlIILayout = new GroupLayout(this.u);
        this.u.setLayout(pnlIILayout);
        pnlIILayout.setHorizontalGroup(pnlIILayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlIILayout.createSequentialGroup().addContainerGap().addGroup(pnlIILayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.U).addComponent(this.S).addComponent(this.X).addComponent(this.W)).addGap(10, 10, 10).addGroup(pnlIILayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.r, -1, 140, 32767).addComponent(this.s, GroupLayout.Alignment.TRAILING, -1, 140, 32767).addComponent(this.u, GroupLayout.Alignment.TRAILING, -1, 140, 32767).addComponent(this.t, GroupLayout.Alignment.TRAILING, -1, 140, 32767)).addContainerGap(544, 32767)));
        pnlIILayout.setVerticalGroup(pnlIILayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlIILayout.createSequentialGroup().addContainerGap().addGroup(pnlIILayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.S).addComponent(this.r, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlIILayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.U).addComponent(this.s, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlIILayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.X).addComponent(this.u, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlIILayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.W).addComponent(this.t, -2, -1, -2)).addContainerGap(690, 32767)));
        this.b.addTab("Imposto de Importa\u00e7\u00e3o", this.u);
        this.as.setFont(new Font("Tahoma", 1, 11));
        this.as.setText("* Valor da base de c\u00e1lculo");
        this.E.setHorizontalAlignment(4);
        this.ar.setFont(new Font("Tahoma", 1, 11));
        this.ar.setText("* Al\u00edquota");
        this.D.setHorizontalAlignment(4);
        this.ak.setFont(new Font("Tahoma", 1, 11));
        this.ak.setText("* Lista de servi\u00e7o");
        this.al.setFont(new Font("Tahoma", 1, 11));
        this.al.setText("* Munic\u00edpio de ocorr\u00eancia");
        this.ao.setFont(new Font("Tahoma", 1, 11));
        this.ao.setText("* UF");
        this.at.setFont(new Font("Tahoma", 1, 11));
        this.at.setText("* Valor do ISSQN");
        this.J.setHorizontalAlignment(4);
        this.an.setFont(new Font("Tahoma", 1, 11));
        this.an.setText("* Tributa\u00e7\u00e3o");
        this.G.setHorizontalAlignment(4);
        this.L.setHorizontalAlignment(4);
        this.au.setFont(new Font("Tahoma", 1, 11));
        this.au.setText("  Valor das Dedu\u00e7\u00f5es");
        this.av.setFont(new Font("Tahoma", 1, 11));
        this.av.setText("  Valor Outras Reten\u00e7\u00f5es");
        this.I.setHorizontalAlignment(4);
        this.H.setHorizontalAlignment(4);
        this.K.setHorizontalAlignment(4);
        this.aw.setFont(new Font("Tahoma", 1, 11));
        this.aw.setText("  Valor Desconto Incondicionado");
        this.ax.setFont(new Font("Tahoma", 1, 11));
        this.ax.setText("  Valor Desconto Condicionado");
        this.ay.setFont(new Font("Tahoma", 1, 11));
        this.ay.setText("  Valor Reten\u00e7\u00e3o ISS");
        this.az.setFont(new Font("Tahoma", 1, 11));
        this.az.setText("* Exigibiliadade do ISS");
        this.aA.setFont(new Font("Tahoma", 1, 11));
        this.aA.setText("* Incentivo Fiscal");
        this.F.setHorizontalAlignment(4);
        this.aB.setFont(new Font("Tahoma", 1, 11));
        this.aB.setText("  C\u00f3digo do Servi\u00e7o");
        this.am.setFont(new Font("Tahoma", 1, 11));
        this.am.setText("  Munic\u00edpio de incid\u00eancia");
        this.aC.setFont(new Font("Tahoma", 1, 11));
        this.aC.setText("  Processo Judicial/Administrativo");
        this.C.setHorizontalAlignment(4);
        this.ap.setFont(new Font("Tahoma", 1, 11));
        this.ap.setText("   Pa\u00eds");
        this.aq.setFont(new Font("Tahoma", 1, 11));
        this.aq.setText("  UF de incid\u00eancia");
        GroupLayout pnlISSQNLayout = new GroupLayout(this.w);
        this.w.setLayout(pnlISSQNLayout);
        pnlISSQNLayout.setHorizontalGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlISSQNLayout.createSequentialGroup().addContainerGap().addGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlISSQNLayout.createSequentialGroup().addGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.au).addComponent(this.av)).addGap(6, 6, 6)).addComponent(this.aw, GroupLayout.Alignment.TRAILING)).addComponent(this.at).addComponent(this.ax).addComponent(this.ay).addComponent(this.az).addComponent(this.aA).addComponent(this.aB).addComponent(this.am).addComponent(this.aC).addComponent(this.al).addComponent(this.as).addComponent(this.ar).addComponent(this.ak).addComponent(this.ao).addComponent(this.an).addComponent(this.ap).addComponent(this.aq)).addGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.m, 0, 655, 32767).addGroup(pnlISSQNLayout.createSequentialGroup().addGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.u, -2, 140, -2).addComponent(this.C, -2, 259, -2).addComponent(this.F, -2, 256, -2).addComponent(this.K, -2, 140, -2).addComponent(this.H, -2, 140, -2).addComponent(this.I, -2, 140, -2).addComponent(this.L, -2, 140, -2).addComponent(this.G, -2, 140, -2).addComponent(this.q, -2, 140, -2).addComponent(this.J, -2, 140, -2).addComponent(this.r, -2, 140, -2).addComponent(this.t, -2, 140, -2).addComponent(this.D, -2, 140, -2).addComponent(this.E, -2, 140, -2).addComponent(this.s, -2, 140, -2).addComponent(this.n, 0, 421, 32767).addComponent(this.o, 0, -1, 32767).addComponent(this.p, 0, -1, 32767)).addGap(0, 0, 32767))).addContainerGap()));
        pnlISSQNLayout.setVerticalGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlISSQNLayout.createSequentialGroup().addContainerGap().addGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.an).addComponent(this.s, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.as).addComponent(this.E, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ar).addComponent(this.D, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ak).addComponent(this.m, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ao).addComponent(this.t, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.al).addComponent(this.o, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ap).addComponent(this.r, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.at).addComponent(this.J, -2, -1, -2)).addGap(5, 5, 5).addGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.p, -2, -1, -2).addComponent(this.az)).addGap(8, 8, 8).addGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.q, -2, -1, -2).addComponent(this.aA)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.G, -2, -1, -2).addComponent(this.au)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.L, -2, -1, -2).addComponent(this.av)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.I, -2, -1, -2).addComponent(this.aw)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.H, -2, -1, -2).addComponent(this.ax)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.K, -2, -1, -2).addComponent(this.ay)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.F, -2, -1, -2).addComponent(this.aB)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.aq).addComponent(this.u, -2, -1, -2)).addGap(9, 9, 9).addGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.am).addComponent(this.n, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlISSQNLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.C, -2, -1, -2).addComponent(this.aC)).addContainerGap(296, 32767)));
        this.b.addTab("ISSQN", this.w);
        this.T.setFont(new Font("Tahoma", 1, 11));
        this.T.setText("Percentual da mercadoria devolvida*");
        this.V.setFont(new Font("Tahoma", 1, 11));
        this.V.setText("Valor do IPI devolvido*");
        this.w.setHorizontalAlignment(4);
        this.x.setHorizontalAlignment(4);
        GroupLayout jPanel7Layout = new GroupLayout(this.g);
        this.g.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.V).addComponent(this.T)).addGap(10, 10, 10).addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.w).addComponent(this.x, GroupLayout.Alignment.TRAILING, -2, 140, -2)).addContainerGap(496, 32767)));
        jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.T).addComponent(this.w, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.V).addComponent(this.x, -2, -1, -2)).addContainerGap(742, 32767)));
        this.b.addTab("IPI Devolvido", this.g);
        this.bM.setFont(new Font("Tahoma", 1, 11));
        this.bM.setText("Valor Total dos Tributos");
        this.an.setHorizontalAlignment(2);
        this.bD.setFont(new Font("Dialog", 2, 12));
        this.bD.setHorizontalAlignment(2);
        this.bD.setText("<html><p> Valor aproximado total de tributos federais, estaduais e municipais conforme disposto na Lei n\u00ba 12.741/12 </p></html>");
        this.a.add(this.a);
        this.a.setText("ICMS");
        this.a.add(this.b);
        this.b.setText("ISSQN");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.bM, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.an, -2, 160, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.bD, -2, 463, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.a).addGap(18, 18, 18).addComponent(this.b))).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bM, -2, 19, -2).addComponent(this.an, -2, 16, -2).addComponent(this.bD, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.b)).addContainerGap(-1, 32767)));
        GroupLayout pnlTributosLayout = new GroupLayout(this.K);
        this.K.setLayout(pnlTributosLayout);
        pnlTributosLayout.setHorizontalGroup(pnlTributosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTributosLayout.createSequentialGroup().addContainerGap().addGroup(pnlTributosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -2, -1, -2).addComponent(this.b, -1, 872, 32767)).addContainerGap()));
        pnlTributosLayout.setVerticalGroup(pnlTributosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlTributosLayout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.a, -2, 61, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, 827, -2).addGap(49, 49, 49)));
        this.a.addTab("Tributos", this.K);
        this.a.setColumns(20);
        this.a.setLineWrap(true);
        this.a.setRows(5);
        this.a.setWrapStyleWord(true);
        this.a.setViewportView(this.a);
        GroupLayout pnlInfoLayout = new GroupLayout(this.x);
        this.x.setLayout(pnlInfoLayout);
        pnlInfoLayout.setHorizontalGroup(pnlInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlInfoLayout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, 872, 32767).addContainerGap()));
        pnlInfoLayout.setVerticalGroup(pnlInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlInfoLayout.createSequentialGroup().addContainerGap().addComponent(this.a, -2, 191, -2).addContainerGap(674, 32767)));
        this.a.addTab("Informa\u00e7\u00f5es Adicionais", this.x);
        this.b.setBorder(BorderFactory.createTitledBorder("Declara\u00e7\u00f5es de Importa\u00e7\u00e3o(100 no M\u00e1ximo)"));
        this.f.setText("Incluir");
        this.d.setText("Detalhar");
        this.e.setText("Excluir");
        GroupLayout jPanel2Layout = new GroupLayout(this.b);
        this.b.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.c, -1, 840, 32767).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.f).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e))).addContainerGap()));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.c, -1, 791, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.f).addComponent(this.d).addComponent(this.e))));
        GroupLayout pnlDILayout = new GroupLayout(this.r);
        this.r.setLayout(pnlDILayout);
        pnlDILayout.setHorizontalGroup(pnlDILayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDILayout.createSequentialGroup().addContainerGap().addComponent(this.b, -1, -1, 32767).addContainerGap()));
        pnlDILayout.setVerticalGroup(pnlDILayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlDILayout.createSequentialGroup().addContainerGap().addComponent(this.b, -1, -1, 32767).addContainerGap()));
        this.a.addTab("Declara\u00e7\u00f5es de Importa\u00e7\u00e3o", this.r);
        this.f.setBorder(BorderFactory.createTitledBorder("Detalhes da Exporta\u00e7\u00e3o(500 no M\u00e1ximo)"));
        this.i.setText("Incluir");
        this.g.setText("Detalhar");
        this.h.setText("Excluir");
        GroupLayout jPanel6Layout = new GroupLayout(this.f);
        this.f.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.f, -1, 840, 32767).addGroup(jPanel6Layout.createSequentialGroup().addComponent(this.i).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.g).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.h))).addContainerGap()));
        jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup().addContainerGap().addComponent(this.f, -1, 791, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.i).addComponent(this.g).addComponent(this.h))));
        GroupLayout pnlExportacaoLayout = new GroupLayout(this.t);
        this.t.setLayout(pnlExportacaoLayout);
        pnlExportacaoLayout.setHorizontalGroup(pnlExportacaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlExportacaoLayout.createSequentialGroup().addContainerGap().addComponent(this.f, -1, -1, 32767).addContainerGap()));
        pnlExportacaoLayout.setVerticalGroup(pnlExportacaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlExportacaoLayout.createSequentialGroup().addContainerGap().addComponent(this.f, -1, -1, 32767).addContainerGap()));
        this.a.addTab("Exporta\u00e7\u00e3o", this.t);
        this.e.setBorder(BorderFactory.createTitledBorder(""));
        this.bx.setFont(new Font("Tahoma", 1, 11));
        this.bx.setText("* Tipo da Opera\u00e7\u00e3o");
        this.C.setFont(new Font("Tahoma", 1, 11));
        this.C.setText("* Chassi");
        this.aI.setFont(new Font("Tahoma", 1, 11));
        this.aI.setText("* N\u00famero do Motor");
        this.aJ.setFont(new Font("Tahoma", 1, 11));
        this.aJ.setText("* S\u00e9rie");
        this.m.setFont(new Font("Tahoma", 1, 11));
        this.m.setText("* Capacidade M\u00e1x. de Tra\u00e7\u00e3o");
        this.ba.setFont(new Font("Tahoma", 1, 11));
        this.ba.setText("* Pot\u00eancia (CV)");
        this.l.setFont(new Font("Tahoma", 1, 11));
        this.l.setText("* Cilindradas (cm3)");
        this.aZ.setFont(new Font("Tahoma", 1, 11));
        this.aZ.setText("* Peso Liq.");
        this.X.setHorizontalAlignment(4);
        this.aY.setFont(new Font("Tahoma", 1, 11));
        this.aY.setText("* Peso Bruto");
        this.W.setHorizontalAlignment(4);
        this.bw.setFont(new Font("Tahoma", 1, 11));
        this.bw.setText("* Tipo de Combust\u00edvel");
        this.O.setFont(new Font("Tahoma", 1, 11));
        this.O.setText("* Dist\u00e2ncia entre Eixos");
        this.n.setFont(new Font("Tahoma", 1, 11));
        this.n.setText("* C\u00f3digo Marca/Modelo");
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText("* Ano Modelo Fabrica\u00e7\u00e3o");
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("* Ano Fabrica\u00e7\u00e3o");
        this.bz.setFont(new Font("Tahoma", 1, 11));
        this.bz.setText("* Tipo de Ve\u00edculo");
        this.Q.setFont(new Font("Tahoma", 1, 11));
        this.Q.setText("* Esp\u00e9cie de Ve\u00edculo");
        this.by.setFont(new Font("Tahoma", 1, 11));
        this.by.setText("* Tipo de Pintura");
        this.h.setFont(new Font("Tahoma", 1, 11));
        this.h.setText("* C\u00f3digo Cor Montadora");
        this.cl.setFont(new Font("Tahoma", 1, 11));
        this.cl.setText("* Descri\u00e7\u00e3o da Cor");
        this.E.setFont(new Font("Tahoma", 1, 11));
        this.E.setText("* Condi\u00e7\u00e3o Ve\u00edculo");
        this.a.setFont(new Font("Arial", 1, 12));
        this.a.setText("Chassi remarcado");
        this.D.setFont(new Font("Tahoma", 1, 11));
        this.D.setText("* C\u00f3digo Cor DENATRAN");
        this.aG.setFont(new Font("Tahoma", 1, 11));
        this.aG.setText("* Lota\u00e7\u00e3o");
        this.be.setFont(new Font("Tahoma", 1, 11));
        this.be.setText("* Restri\u00e7\u00e3o");
        GroupLayout jPanel5Layout = new GroupLayout(this.e);
        this.e.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel5Layout.createSequentialGroup().addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel5Layout.createSequentialGroup().addComponent(this.m, -2, 166, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.g, -2, 100, -2)).addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup().addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.bx).addComponent(this.C).addComponent(this.aJ).addComponent(this.ba).addComponent(this.aZ).addComponent(this.by).addComponent(this.bw).addComponent(this.n)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.F, 0, 206, 32767).addComponent(this.w, -2, 78, -2).addComponent(this.B, -2, 60, -2).addComponent(this.e, 0, -1, 32767).addComponent(this.E, 0, -1, 32767).addComponent(this.aO, -1, 56, 32767).addComponent(this.i, 0, -1, 32767).addComponent(this.ao, -1, 56, 32767).addComponent(this.X, -2, 104, -2).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.i, GroupLayout.Alignment.LEADING).addComponent(this.z, GroupLayout.Alignment.LEADING, 0, 206, 32767))).addGap(6, 6, 6))).addComponent(this.D).addComponent(this.Q)).addGap(12, 12, 12).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel5Layout.createSequentialGroup().addComponent(this.h).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -2, 63, -2)).addComponent(this.aG).addComponent(this.a, -2, 242, -2).addGroup(jPanel5Layout.createSequentialGroup().addComponent(this.O).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.m, -2, 48, -2)).addGroup(jPanel5Layout.createSequentialGroup().addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.l).addComponent(this.aY).addComponent(this.c).addComponent(this.cl).addComponent(this.bz).addComponent(this.aI).addComponent(this.E)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.h, -2, 206, -2).addComponent(this.f, -2, 57, -2).addComponent(this.W, -2, 104, -2).addComponent(this.t, -2, 74, -2).addComponent(this.v, -2, 147, -2).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.E, GroupLayout.Alignment.LEADING).addComponent(this.G, GroupLayout.Alignment.LEADING, -2, -1, -2).addGroup(GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup().addComponent(this.a, -2, 67, -2).addGap(18, 18, 18).addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, 48, -2))))))).addComponent(this.be)).addGap(140, 140, 140)));
        jPanel5Layout.linkSize(0, this.e, this.i, this.E, this.X, this.ao, this.g, this.aO, this.w, this.B);
        jPanel5Layout.linkSize(0, this.G, this.W, this.c, this.f, this.m, this.t);
        jPanel5Layout.linkSize(0, this.h, this.v);
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bx).addComponent(this.F, -2, -1, -2).addComponent(this.E).addComponent(this.h, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.C).addComponent(this.i, -2, -1, -2).addComponent(this.a, -2, 13, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.aJ).addComponent(this.v, -2, -1, -2).addComponent(this.aI).addComponent(this.w, -2, 19, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ba).addComponent(this.l).addComponent(this.B, -2, -1, -2).addComponent(this.f, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.aZ).addComponent(this.aY).addComponent(this.X, -2, -1, -2).addComponent(this.W, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.m).addComponent(this.O).addComponent(this.g, -2, -1, -2).addComponent(this.m, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bw).addComponent(this.bz).addComponent(this.E, -2, -1, -2).addComponent(this.G, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.n).addComponent(this.aO, -2, -1, -2).addComponent(this.a, -2, -1, -2).addComponent(this.d).addComponent(this.b, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.D).addComponent(this.h).addComponent(this.c, -2, -1, -2).addComponent(this.e, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.by).addComponent(this.cl).addComponent(this.E, -2, -1, -2).addComponent(this.ao, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Q).addComponent(this.aG).addComponent(this.t, -2, -1, -2).addComponent(this.i, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.be).addComponent(this.z, -2, -1, -2)).addContainerGap(53, 32767)));
        GroupLayout pnlVeiculoLayout = new GroupLayout(this.L);
        this.L.setLayout(pnlVeiculoLayout);
        pnlVeiculoLayout.setHorizontalGroup(pnlVeiculoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlVeiculoLayout.createSequentialGroup().addContainerGap().addComponent(this.e, -2, 872, 32767).addContainerGap()));
        pnlVeiculoLayout.setVerticalGroup(pnlVeiculoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlVeiculoLayout.createSequentialGroup().addContainerGap().addComponent(this.e, -2, -1, -2).addContainerGap(501, 32767)));
        this.a.addTab("Ve\u00edculo Novo", this.L);
        this.m.setText("Incluir");
        this.k.setText("Detalhar");
        this.l.setText("Excluir");
        GroupLayout pnlMedicamentoLayout = new GroupLayout(this.y);
        this.y.setLayout(pnlMedicamentoLayout);
        pnlMedicamentoLayout.setHorizontalGroup(pnlMedicamentoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlMedicamentoLayout.createSequentialGroup().addContainerGap().addGroup(pnlMedicamentoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.d, -1, 872, 32767).addGroup(pnlMedicamentoLayout.createSequentialGroup().addComponent(this.m).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.k).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.l))).addContainerGap()));
        pnlMedicamentoLayout.setVerticalGroup(pnlMedicamentoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlMedicamentoLayout.createSequentialGroup().addContainerGap().addComponent(this.d, -1, 825, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlMedicamentoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.m).addComponent(this.k).addComponent(this.l)).addContainerGap()));
        this.a.addTab("Medicamentos/Mat\u00e9rias-primas Farmac\u00eauticas", this.y);
        this.c.setText("Incluir");
        this.a.setText("Detalhar");
        this.b.setText("Excluir");
        GroupLayout pnlArmamentoLayout = new GroupLayout(this.i);
        this.i.setLayout(pnlArmamentoLayout);
        pnlArmamentoLayout.setHorizontalGroup(pnlArmamentoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlArmamentoLayout.createSequentialGroup().addContainerGap().addGroup(pnlArmamentoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b, -1, 872, 32767).addGroup(pnlArmamentoLayout.createSequentialGroup().addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b))).addContainerGap()));
        pnlArmamentoLayout.setVerticalGroup(pnlArmamentoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlArmamentoLayout.createSequentialGroup().addContainerGap().addComponent(this.b, -1, 825, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlArmamentoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.a).addComponent(this.b)).addContainerGap()));
        this.a.addTab("Armamentos", this.i);
        this.n.setBorder(BorderFactory.createTitledBorder(""));
        this.G.setFont(new Font("Tahoma", 1, 11));
        this.G.setText("* C\u00f3digo ANP");
        this.k.setHorizontalAlignment(4);
        this.F.setFont(new Font("Tahoma", 1, 11));
        this.F.setText("CODIF");
        this.j.setHorizontalAlignment(4);
        this.K.setFont(new Font("Tahoma", 1, 11));
        this.K.setText("Qtde. faturada em temperatura ambiente");
        this.p.setHorizontalAlignment(4);
        this.I.setFont(new Font("Tahoma", 1, 11));
        this.I.setText("* UF");
        this.L.setFont(new Font("Tahoma", 1, 11));
        this.L.setText("Qtde. de G\u00e1s Natural");
        this.o.setHorizontalAlignment(4);
        GroupLayout pnlComb1Layout = new GroupLayout(this.n);
        this.n.setLayout(pnlComb1Layout);
        pnlComb1Layout.setHorizontalGroup(pnlComb1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlComb1Layout.createSequentialGroup().addContainerGap().addGroup(pnlComb1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlComb1Layout.createSequentialGroup().addComponent(this.G).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.f, -2, 124, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.k, -2, 128, -2).addGap(18, 18, 18).addComponent(this.F).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.j, -2, 139, -2).addGap(26, 26, 26).addComponent(this.I).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.g, -2, 70, -2)).addGroup(pnlComb1Layout.createSequentialGroup().addComponent(this.K).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.p, -2, 176, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.L).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.o, -2, 176, -2))).addContainerGap(143, 32767)));
        pnlComb1Layout.setVerticalGroup(pnlComb1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlComb1Layout.createSequentialGroup().addGroup(pnlComb1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlComb1Layout.createSequentialGroup().addGroup(pnlComb1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.G).addComponent(this.k, -2, -1, -2).addComponent(this.F).addComponent(this.j, -2, -1, -2).addComponent(this.I).addComponent(this.g, -2, -1, -2).addComponent(this.f, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlComb1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.o, GroupLayout.Alignment.TRAILING, -2, -1, -2).addComponent(this.p, GroupLayout.Alignment.TRAILING, -2, -1, -2))).addGroup(pnlComb1Layout.createSequentialGroup().addGap(29, 29, 29).addGroup(pnlComb1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.L).addComponent(this.K)))).addContainerGap(14, 32767)));
        this.o.setBorder(BorderFactory.createTitledBorder("CIDE"));
        this.J.setFont(new Font("Tahoma", 1, 11));
        this.J.setText("Base de c\u00e1lculo");
        this.n.setHorizontalAlignment(4);
        this.M.setFont(new Font("Tahoma", 1, 11));
        this.M.setText("Al\u00edquota");
        this.q.setHorizontalAlignment(4);
        this.N.setFont(new Font("Tahoma", 1, 11));
        this.N.setText("Valor");
        this.l.setEditable(false);
        this.l.setHorizontalAlignment(4);
        this.l.setEnabled(false);
        this.l.setFocusable(false);
        this.l.setRequestFocusEnabled(false);
        GroupLayout pnlComb2Layout = new GroupLayout(this.o);
        this.o.setLayout(pnlComb2Layout);
        pnlComb2Layout.setHorizontalGroup(pnlComb2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlComb2Layout.createSequentialGroup().addContainerGap().addGroup(pnlComb2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.J).addComponent(this.N)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlComb2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.l).addComponent(this.n, -1, 138, 32767)).addGap(18, 18, 18).addComponent(this.M).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.q, -2, 160, -2).addContainerGap(391, 32767)));
        pnlComb2Layout.setVerticalGroup(pnlComb2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlComb2Layout.createSequentialGroup().addGroup(pnlComb2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.J).addComponent(this.n, -2, -1, -2).addComponent(this.M).addComponent(this.q, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlComb2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.N).addComponent(this.l, -2, -1, -2)).addContainerGap(-1, 32767)));
        GroupLayout pnlCombustivelLayout = new GroupLayout(this.q);
        this.q.setLayout(pnlCombustivelLayout);
        pnlCombustivelLayout.setHorizontalGroup(pnlCombustivelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlCombustivelLayout.createSequentialGroup().addContainerGap().addGroup(pnlCombustivelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.o, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.n, GroupLayout.Alignment.LEADING, -1, -1, 32767)).addContainerGap()));
        pnlCombustivelLayout.setVerticalGroup(pnlCombustivelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlCombustivelLayout.createSequentialGroup().addContainerGap().addComponent(this.n, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.o, -2, -1, -2).addContainerGap(714, 32767)));
        this.a.addTab("Combust\u00edvel", this.q);
        this.p.setBorder(BorderFactory.createTitledBorder(""));
        this.H.setFont(new Font("Tahoma", 1, 11));
        this.H.setText("* N\u00famero de RECOPI");
        this.z.setHorizontalAlignment(4);
        GroupLayout pnlComb3Layout = new GroupLayout(this.p);
        this.p.setLayout(pnlComb3Layout);
        pnlComb3Layout.setHorizontalGroup(pnlComb3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlComb3Layout.createSequentialGroup().addContainerGap().addComponent(this.H).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.z, -2, 192, -2).addContainerGap(547, 32767)));
        pnlComb3Layout.setVerticalGroup(pnlComb3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlComb3Layout.createSequentialGroup().addGroup(pnlComb3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.H).addComponent(this.z, -2, -1, -2)).addContainerGap(40, 32767)));
        GroupLayout pnlPapelLayout = new GroupLayout(this.C);
        this.C.setLayout(pnlPapelLayout);
        pnlPapelLayout.setHorizontalGroup(pnlPapelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlPapelLayout.createSequentialGroup().addContainerGap().addComponent(this.p, -1, -1, 32767).addContainerGap()));
        pnlPapelLayout.setVerticalGroup(pnlPapelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPapelLayout.createSequentialGroup().addContainerGap().addComponent(this.p, -2, -1, -2).addContainerGap(800, 32767)));
        this.a.addTab("Papel Imune", this.C);
        this.j.setText("Fechar");
        this.q.setText("Ok");
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("(*) Campo de preenchimento obrigat\u00f3rio.");
        GroupLayout pnlPrincipalLayout = new GroupLayout(this.D);
        this.D.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addContainerGap().addComponent(this.q).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.j).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.a).addGap(31, 31, 31)).addComponent(this.a, -1, -1, 32767));
        pnlPrincipalLayout.setVerticalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup().addComponent(this.a, -1, 920, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.q).addComponent(this.j)).addComponent(this.a))));
        this.g.setViewportView(this.D);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 911, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.g, -1, 911, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 979, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.g, -1, 979, 32767)));
        this.pack();
    }

    private void a(ActionEvent evt) {
    }

    private void b(ActionEvent evt) {
    }

    public void addActionListener(EventListener listener) {
        this.q.addActionListener((ActionListener)listener);
        this.j.addActionListener((ActionListener)listener);
        this.r.addActionListener((ActionListener)listener);
    }

    public void addActionListener(EventListener listener, int aba) {
        switch (aba) {
            case 0: {
                this.y.addItemListener((ItemListener)listener);
                this.e.addCellEditorListener(0, (CellEditorListener)listener);
                this.n.addActionListener((ActionListener)listener);
                this.o.addActionListener((ActionListener)listener);
                this.p.addActionListener((ActionListener)listener);
                break;
            }
            case 3: {
                this.a.addCellEditorListener(0, (CellEditorListener)listener);
                this.d.addActionListener((ActionListener)listener);
                this.e.addActionListener((ActionListener)listener);
                this.f.addActionListener((ActionListener)listener);
                break;
            }
            case 4: {
                this.d.addCellEditorListener(0, (CellEditorListener)listener);
                this.g.addActionListener((ActionListener)listener);
                this.h.addActionListener((ActionListener)listener);
                this.i.addActionListener((ActionListener)listener);
                break;
            }
            case 6: {
                this.k.addActionListener((ActionListener)listener);
                this.l.addActionListener((ActionListener)listener);
                this.m.addActionListener((ActionListener)listener);
                this.b.addCellEditorListener(0, (CellEditorListener)listener);
                break;
            }
            case 7: {
                this.a.addActionListener((ActionListener)listener);
                this.b.addActionListener((ActionListener)listener);
                this.c.addActionListener((ActionListener)listener);
                this.c.addCellEditorListener(0, (CellEditorListener)listener);
                break;
            }
            case 1: {
                this.j.addItemListener((ItemListener)listener);
                this.H.addItemListener((ItemListener)listener);
                this.A.addItemListener((ItemListener)listener);
                this.k.addItemListener((ItemListener)listener);
                this.l.addItemListener((ItemListener)listener);
                this.v.addItemListener((ItemListener)listener);
                this.w.addItemListener((ItemListener)listener);
                this.x.addItemListener((ItemListener)listener);
                this.b.addItemListener((ItemListener)listener);
                this.c.addItemListener((ItemListener)listener);
                this.d.addItemListener((ItemListener)listener);
                this.t.addItemListener((ItemListener)listener);
                this.u.addItemListener((ItemListener)listener);
                this.o.addItemListener((ItemListener)listener);
                this.ap.addFocusListener((FocusListener)listener);
                this.az.addFocusListener((FocusListener)listener);
                this.aH.addFocusListener((FocusListener)listener);
                this.aq.addFocusListener((FocusListener)listener);
                this.aI.addFocusListener((FocusListener)listener);
                this.at.addFocusListener((FocusListener)listener);
                this.aA.addFocusListener((FocusListener)listener);
                this.ae.addFocusListener((FocusListener)listener);
                this.ah.addFocusListener((FocusListener)listener);
                this.ak.addFocusListener((FocusListener)listener);
                this.ac.addFocusListener((FocusListener)listener);
                this.aa.addFocusListener((FocusListener)listener);
                this.af.addFocusListener((FocusListener)listener);
                this.al.addFocusListener((FocusListener)listener);
                this.y.addFocusListener((FocusListener)listener);
                this.z.addFocusListener((FocusListener)listener);
                this.B.addFocusListener((FocusListener)listener);
                this.s.addFocusListener((FocusListener)listener);
                this.M.addFocusListener((FocusListener)listener);
                this.N.addFocusListener((FocusListener)listener);
                this.O.addFocusListener((FocusListener)listener);
                this.P.addFocusListener((FocusListener)listener);
                this.Q.addFocusListener((FocusListener)listener);
                this.R.addFocusListener((FocusListener)listener);
                this.T.addFocusListener((FocusListener)listener);
                this.U.addFocusListener((FocusListener)listener);
                this.d.addFocusListener((FocusListener)listener);
                this.e.addFocusListener((FocusListener)listener);
                this.f.addFocusListener((FocusListener)listener);
                this.g.addFocusListener((FocusListener)listener);
                this.h.addFocusListener((FocusListener)listener);
                this.i.addFocusListener((FocusListener)listener);
                this.k.addFocusListener((FocusListener)listener);
                this.l.addFocusListener((FocusListener)listener);
                this.D.addFocusListener((FocusListener)listener);
                this.E.addFocusListener((FocusListener)listener);
                break;
            }
            case 8: {
                this.n.addFocusListener((FocusListener)listener);
                this.q.addFocusListener((FocusListener)listener);
            }
        }
    }

    public void setEnabledTab(int tab, boolean enabled) {
        this.a.setEnabledAt(tab, enabled);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public void setProdutoNotaTO(ProdutoNotaTO produtoNotaTO) {
        this.a = produtoNotaTO;
        try {
            this.a(produtoNotaTO);
        }
        catch (DSGEUtilException e) {
            this.showErrors((DSGEBaseException)e);
        }
    }

    public ProdutoNotaTO getProdutoNotaTO(boolean update) {
        if (update) {
            this.l(this.a);
        }
        return this.a;
    }

    public String getOperacao() {
        return this.a;
    }

    public String getOperacaoNota() {
        return this.b;
    }

    public void setListaProdutoEspecifico(ProdutoEspecificoEnum[] lista) {
        this.y.removeAllItems();
        if (lista != null) {
            this.y.addItem(null);
            for (int i = 0; i < lista.length; ++i) {
                this.y.addItem(lista[i]);
            }
        }
        this.y.setSelectedIndex(-1);
    }

    public void setListaTipoOperacao(TipoOperacaoEnum[] lista) {
        this.F.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.F.addItem(lista[i]);
            }
        }
        this.F.setSelectedIndex(-1);
    }

    public void setListaTipoCombustivel(List<TipoCombustivelTO> lista) {
        this.E.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                this.E.addItem(lista.get(i));
            }
        }
        this.E.setSelectedIndex(-1);
    }

    public void setListaCorDenatran(List<CorDenatranTO> lista) {
        this.e.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                this.e.addItem(lista.get(i));
            }
        }
        this.e.setSelectedIndex(-1);
    }

    public void setListaRestricao(RestricaoVeiculoEnum[] lista) {
        this.z.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.z.addItem(lista[i]);
            }
        }
        this.z.setSelectedIndex(-1);
    }

    public void setListaTipoVeiculo(List<TipoVeiculoTO> lista) {
        this.G.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                this.G.addItem(lista.get(i));
            }
        }
        this.G.setSelectedIndex(-1);
    }

    public void setListaEspecieVeiculo(List<EspecieVeiculoTO> lista) {
        this.i.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                this.i.addItem(lista.get(i));
            }
        }
        this.i.setSelectedIndex(-1);
    }

    public void setListaCondicaoVeiculo(CondicaoVeiculoEnum[] lista) {
        this.h.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.h.addItem(lista[i]);
            }
        }
        this.h.setSelectedIndex(-1);
    }

    public void setListaICMSCST(CSTEnum[] lista) {
        this.H.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.H.addItem(lista[i]);
            }
        }
        this.H.setSelectedIndex(-1);
    }

    public void setListaTipoTributacao(TipoTributacaoEnum[] lista) {
        this.j.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.j.addItem(lista[i]);
            }
        }
        this.j.setSelectedIndex(-1);
    }

    public void setListaCSOSN(CSOSNEnum[] lista) {
        this.A.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.A.addItem(lista[i]);
            }
        }
        this.A.setSelectedIndex(-1);
    }

    public void setListaICMSModBC(ModBCEnum[] lista) {
        int i;
        this.I.removeAllItems();
        this.I.addItem(null);
        if (lista != null) {
            for (i = 0; i < lista.length; ++i) {
                this.I.addItem(lista[i]);
            }
        }
        this.I.setSelectedIndex(-1);
        this.B.removeAllItems();
        this.B.addItem(null);
        if (lista != null) {
            for (i = 0; i < lista.length; ++i) {
                this.B.addItem(lista[i]);
            }
        }
        this.B.setSelectedIndex(-1);
    }

    public void setListaICMSModBCST(ModBcstEnum[] lista) {
        int i;
        this.M.removeAllItems();
        this.M.addItem(null);
        if (lista != null) {
            for (i = 0; i < lista.length; ++i) {
                this.M.addItem(lista[i]);
            }
        }
        this.M.setSelectedIndex(-1);
        this.D.removeAllItems();
        this.D.addItem(null);
        if (lista != null) {
            for (i = 0; i < lista.length; ++i) {
                this.D.addItem(lista[i]);
            }
        }
        this.D.setSelectedIndex(-1);
    }

    public void setListaIPICST(IPIEnum[] lista) {
        this.k.removeAllItems();
        if (lista != null) {
            this.k.addItem("");
            for (int i = 0; i < lista.length; ++i) {
                this.k.addItem(lista[i]);
            }
        }
        this.k.setSelectedIndex(-1);
    }

    public void setListaPISCST(PISEnum[] lista) {
        this.v.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.v.addItem(lista[i]);
            }
        }
        this.v.setSelectedIndex(-1);
    }

    public void setListaCOFINSCST(COFINSEnum[] lista) {
        this.b.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.b.addItem(lista[i]);
            }
        }
        this.b.setSelectedIndex(-1);
    }

    public void setListaISSQNTributacao(TributacaoISSQNEnum[] lista) {
        this.s.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.s.addItem(lista[i]);
            }
        }
        this.s.setSelectedIndex(0);
    }

    public void setListaMotivoDesoneracaoICMS(MotivoDesoneracaoICMSEnum[] lista) {
        this.J.removeAllItems();
        this.K.removeAllItems();
        this.J.addItem(null);
        this.K.addItem(null);
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.J.addItem(lista[i]);
                this.K.addItem(lista[i]);
            }
        }
        this.J.setSelectedIndex(-1);
        this.K.setSelectedIndex(-1);
    }

    public void setListaISSQNUF(List<EstadoTO> lista) {
        this.t.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                this.t.addItem(lista.get(i));
            }
        }
        this.t.setSelectedIndex(-1);
    }

    public void setListaISSQNUFInci(List<EstadoTO> lista) {
        this.u.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                this.u.addItem(lista.get(i));
            }
        }
        this.u.setSelectedIndex(-1);
    }

    public void setListaSTUFDevido(List<EstadoTO> lista) {
        this.N.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                this.N.addItem(lista.get(i));
            }
        }
        this.N.setSelectedIndex(-1);
    }

    public void setListaISSQNPais(List<PaisTO> listaPais) {
        this.r.removeAllItems();
        if (listaPais != null) {
            PaisTO paisTO = new PaisTO();
            paisTO.setCodigo("");
            paisTO.setNome("");
            listaPais.add(0, paisTO);
            for (int i = 0; i < listaPais.size(); ++i) {
                if (listaPais.get(i).getNome().equalsIgnoreCase("Brasil")) continue;
                this.r.addItem(listaPais.get(i));
            }
        }
        this.r.setSelectedIndex(-1);
    }

    public void enablecmbISSQNPais(boolean enable) {
        this.r.setEnabled(enable);
    }

    public void setListaISSQNMunicipio(List<MunicipioTO> lista) {
        this.o.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                this.o.addItem(lista.get(i));
            }
        }
        this.o.setSelectedIndex(-1);
    }

    public void setListaISSQNMunicipioInci(List<MunicipioTO> lista) {
        this.n.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                this.n.addItem(lista.get(i));
            }
        }
        this.n.setSelectedIndex(-1);
    }

    public void setListaISSQNExigibilidade(ExigibilidadeISSEnum[] lista) {
        this.p.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.p.addItem(lista[i]);
            }
        }
        this.p.setSelectedIndex(-1);
    }

    public void setListaISSQNIncentivoFiscal(IndIncentivoFiscalEnum[] lista) {
        this.q.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.q.addItem(lista[i]);
            }
        }
        this.q.setSelectedIndex(-1);
    }

    public void setListaICMSOrigem(OrigemMercadoriaEnum[] lista) {
        int i;
        this.L.removeAllItems();
        if (lista != null) {
            for (i = 0; i < lista.length; ++i) {
                this.L.addItem(lista[i]);
            }
        }
        this.L.setSelectedIndex(-1);
        this.C.removeAllItems();
        if (lista != null) {
            for (i = 0; i < lista.length; ++i) {
                this.C.addItem(lista[i]);
            }
        }
        this.C.setSelectedIndex(-1);
    }

    public void setListaCFOP(List<CfopTO> listaCFOP) {
        if (listaCFOP != null) {
            for (CfopTO cfop : listaCFOP) {
                this.a.addItem(cfop);
            }
        }
        this.a.setSelectedIndex(-1);
    }

    public void setListaTipoCalculo(TipoCalculoEnum[] lista) {
        this.l.removeAllItems();
        this.w.removeAllItems();
        this.x.removeAllItems();
        this.c.removeAllItems();
        this.d.removeAllItems();
        this.w.addItem("");
        this.c.addItem("");
        this.l.addItem("");
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.l.addItem(lista[i]);
                this.w.addItem(lista[i]);
                this.x.addItem(lista[i]);
                this.c.addItem(lista[i]);
                this.d.addItem(lista[i]);
            }
        }
        this.l.setSelectedIndex(-1);
        this.w.setSelectedIndex(-1);
        this.x.setSelectedIndex(-1);
        this.c.setSelectedIndex(-1);
        this.d.setSelectedIndex(-1);
    }

    public void setListaServicoTO(List<ServicoTO> lista) {
        this.m.removeAllItems();
        if (lista != null) {
            for (ServicoTO servicoTO : lista) {
                this.m.addItem(servicoTO);
            }
        }
        this.m.setSelectedIndex(-1);
    }

    public void setListaICMSConsumoUF(List<EstadoTO> estado) {
        this.g.removeAllItems();
        if (estado != null) {
            this.g.addItem(new EstadoTO("", "", ""));
            for (int i = 0; i < estado.size(); ++i) {
                this.g.addItem(estado.get(i));
            }
        }
    }

    public void setListaCodigoANP(List<String> lista) {
        this.f.removeAllItems();
        if (lista != null) {
            for (String anp : lista) {
                this.f.addItem(anp);
            }
        }
        this.f.setSelectedIndex(-1);
    }

    public List<DITO> getSelectedDITOs() {
        return this.a.getSelectedItens(0);
    }

    public DITO getSelectedDITO() {
        List listaDI = this.getSelectedDITOs();
        DITO diTO = null;
        if (listaDI != null && listaDI.size() > 0) {
            diTO = (DITO)listaDI.get(0);
        }
        return diTO;
    }

    public List<NVETO> getSelectedNVETOs() {
        return this.e.getSelectedItens(0);
    }

    public NVETO getSelectedNVETO() {
        List listaNVE = this.getSelectedNVETOs();
        NVETO nveTO = null;
        if (listaNVE != null && listaNVE.size() > 0) {
            nveTO = (NVETO)listaNVE.get(0);
        }
        return nveTO;
    }

    public List<ProdutoExportacaoTO> getSelectedExportacaoTOs() {
        return this.d.getSelectedItens(0);
    }

    public ProdutoExportacaoTO getSelectedExportacaoTO() {
        List lista = this.getSelectedExportacaoTOs();
        ProdutoExportacaoTO exportTO = null;
        if (lista != null && lista.size() > 0) {
            exportTO = (ProdutoExportacaoTO)lista.get(0);
        }
        return exportTO;
    }

    public List<MedicamentoNotaTO> getSelectedMedicamentoTOs() {
        return this.b.getSelectedItens(0);
    }

    public MedicamentoNotaTO getSelectedMedicamentoTO() {
        List lista = this.getSelectedMedicamentoTOs();
        MedicamentoNotaTO medicamentoTO = null;
        if (lista != null && lista.size() > 0) {
            medicamentoTO = (MedicamentoNotaTO)lista.get(0);
        }
        return medicamentoTO;
    }

    public List<ArmaTO> getSelectedArmaTOs() {
        return this.c.getSelectedItens(0);
    }

    public ArmaTO getSelectedArmaTO() {
        List lista = this.getSelectedArmaTOs();
        ArmaTO armaTO = null;
        if (lista != null && lista.size() > 0) {
            armaTO = (ArmaTO)lista.get(0);
        }
        return armaTO;
    }

    public void adicionarMedicamentoTO(MedicamentoNotaTO medicamentoTO) {
        if (medicamentoTO != null) {
            this.b.addTO((BaseTO)medicamentoTO);
        }
    }

    public void removerMedicamentoTO(List<MedicamentoNotaTO> lista) {
        if (lista != null) {
            this.b.removeTO(lista);
        }
    }

    public void removerListaDITO(List<DITO> listaDI) {
        if (listaDI != null) {
            this.a.removeTO(listaDI);
        }
    }

    public void adicionarDITO(DITO diTO) {
        this.a.addTO((BaseTO)diTO);
    }

    public void removerListaNVETO(List<NVETO> listaNVE) {
        if (listaNVE != null) {
            this.e.removeTO(listaNVE);
        }
    }

    public void adicionarNVETO(NVETO nveTO) {
        this.e.addTO((BaseTO)nveTO);
    }

    public void removerListaExportacaoTO(List<ProdutoExportacaoTO> listaExportacao) {
        if (listaExportacao != null) {
            this.d.removeTO(listaExportacao);
        }
    }

    public void adicionarExporacaoTO(ProdutoExportacaoTO exportacaoTO) {
        this.d.addTO((BaseTO)exportacaoTO);
    }

    public void adicionarArmamentoTO(ArmaTO to) {
        this.c.addTO((BaseTO)to);
    }

    public void removerArmamentoTO(List<ArmaTO> lista) {
        if (lista != null) {
            this.c.removeTO(lista);
        }
    }

    public void limparIPI(boolean limparCalculo) {
        this.y.setText("");
        this.z.setText("");
        this.A.setText("");
        this.B.setText("");
        this.s.setText("");
        if (limparCalculo) {
            this.l.setSelectedIndex(-1);
        }
    }

    public void limparISSQN() {
        this.s.setSelectedIndex(0);
        this.E.setText("");
        this.J.setText("");
        this.D.setText("");
        this.m.setSelectedIndex(-1);
        this.t.setSelectedIndex(-1);
        this.o.setSelectedIndex(-1);
    }

    public void limparII() {
        this.r.setText("");
        this.s.setText("");
        this.u.setText("");
        this.t.setText("");
    }

    public void limparICMS() {
        this.limparCamposCSOSN();
        this.limparCamposCST();
        this.H.setSelectedIndex(-1);
        this.A.setSelectedIndex(-1);
        this.j.setSelectedIndex(-1);
    }

    public void limparPIS(boolean limparCalculo) {
        this.M.setText("");
        this.N.setText("");
        this.T.setText("");
        this.U.setText("");
        this.V.setText("");
        if (limparCalculo) {
            this.x.setSelectedIndex(-1);
        }
    }

    public void limparPISST() {
        this.O.setText("");
        this.P.setText("");
        this.Q.setText("");
        this.R.setText("");
        this.S.setText("");
    }

    public void limparCOFINS(boolean limparCalculo) {
        this.d.setText("");
        this.e.setText("");
        this.k.setText("");
        this.l.setText("");
        this.m.setText("");
        if (limparCalculo) {
            this.d.setSelectedIndex(-1);
        }
    }

    public void limparCOFINSST() {
        this.f.setText("");
        this.g.setText("");
        this.h.setText("");
        this.i.setText("");
        this.j.setText("");
    }

    public void setICMSTO(IcmsTO icmsTO) {
        String cst = icmsTO.getCst();
        boolean simplesNacional = false;
        CSTEnum cstEnum = CSTEnum.getEnumPeloCodigo((String)cst);
        if (cstEnum == null) {
            simplesNacional = true;
        }
        if (!StringHelper.isBlankOrNull((Object)icmsTO.getOrig())) {
            OrigemMercadoriaEnum origemEnum = OrigemMercadoriaEnum.getEnumPeloCodigo((String)icmsTO.getOrig());
            if (simplesNacional) {
                this.C.setSelectedItem((Object)origemEnum);
            } else {
                this.L.setSelectedItem((Object)origemEnum);
            }
        }
        if (!StringHelper.isBlankOrNull((Object)icmsTO.getModBc())) {
            ModBCEnum modBCEnum = ModBCEnum.getEnumPeloCodigo((String)icmsTO.getModBc());
            if (simplesNacional) {
                this.B.setSelectedItem((Object)modBCEnum);
            } else {
                this.I.setSelectedItem((Object)modBCEnum);
            }
        }
        if (!StringHelper.isBlankOrNull((Object)icmsTO.getModBcst())) {
            ModBcstEnum modBCSTEnum = ModBcstEnum.getEnumPeloCodigo((String)icmsTO.getModBcst());
            if (simplesNacional) {
                this.D.setSelectedItem((Object)modBCSTEnum);
            } else {
                this.M.setSelectedItem((Object)modBCSTEnum);
            }
        }
        try {
            if (!StringHelper.isBlankOrNull((Object)icmsTO.getPRedBc())) {
                if (simplesNacional) {
                    this.ac.setText(NumberFormatterHelper.getFormatter0302().valueToString(new BigDecimal(icmsTO.getPRedBc())));
                } else {
                    this.aq.setText(NumberFormatterHelper.getFormatter0302().valueToString(new BigDecimal(icmsTO.getPRedBc())));
                }
            }
            if (!StringHelper.isBlankOrNull((Object)icmsTO.getPIcms())) {
                if (simplesNacional) {
                    this.ae.setText(NumberFormatterHelper.getFormatter0302().valueToString(new BigDecimal(icmsTO.getPIcms())));
                } else {
                    this.ap.setText(NumberFormatterHelper.getFormatter0302().valueToString(new BigDecimal(icmsTO.getPIcms())));
                }
            }
            if (!StringHelper.isBlankOrNull((Object)icmsTO.getPIcmsst())) {
                if (simplesNacional) {
                    this.ah.setText(NumberFormatterHelper.getFormatter0302().valueToString(new BigDecimal(icmsTO.getPIcmsst())));
                } else {
                    this.az.setText(NumberFormatterHelper.getFormatter0302().valueToString(new BigDecimal(icmsTO.getPIcmsst())));
                }
            }
            if (!StringHelper.isBlankOrNull((Object)icmsTO.getPMvast())) {
                if (simplesNacional) {
                    this.ak.setText(NumberFormatterHelper.getFormatter0302().valueToString(new BigDecimal(icmsTO.getPMvast())));
                } else {
                    this.aH.setText(NumberFormatterHelper.getFormatter0302().valueToString(new BigDecimal(icmsTO.getPMvast())));
                }
            }
            if (!StringHelper.isBlankOrNull((Object)icmsTO.getPRedBcst())) {
                if (simplesNacional) {
                    this.aa.setText(NumberFormatterHelper.getFormatter0302().valueToString(new BigDecimal(icmsTO.getPRedBcst())));
                } else {
                    this.aI.setText(NumberFormatterHelper.getFormatter0302().valueToString(new BigDecimal(icmsTO.getPRedBcst())));
                }
            }
            if (!StringHelper.isBlankOrNull((Object)icmsTO.getPBCOp()) && !simplesNacional) {
                this.ar.setText(NumberFormatterHelper.getFormatter0304().valueToString(new BigDecimal(icmsTO.getPBCOp())));
            }
            if (!StringHelper.isBlankOrNull((Object)icmsTO.getPCredSN()) && simplesNacional) {
                this.ab.setText(NumberFormatterHelper.getFormatter0304().valueToString(new BigDecimal(icmsTO.getPCredSN())));
            }
            if (!StringHelper.isBlankOrNull((Object)icmsTO.getMotDesICMS())) {
                MotivoDesoneracaoICMSEnum motDesEnum = MotivoDesoneracaoICMSEnum.getEnumPeloCodigo((String)icmsTO.getMotDesICMS());
                if (!simplesNacional) {
                    this.J.setSelectedItem((Object)motDesEnum);
                }
            }
            if (!StringHelper.isBlankOrNull((Object)icmsTO.getUFST())) {
                EstadoTO estadoTO = DSENUtilHelper.getInstance().getEstadoTOBySigla(icmsTO.getUFST());
                if (!simplesNacional) {
                    this.N.setSelectedItem((Object)estadoTO);
                }
            }
        }
        catch (ParseException ex) {
            this.showErrors((Throwable)ex);
        }
        catch (DSGEUtilException ex) {
            this.showErrors((DSGEBaseException)ex);
        }
    }

    public void setIpiTO(IpiTO ipiTO) {
        this.o.setText(ipiTO.getCEnq());
        this.q.setText(ipiTO.getClEnq());
        this.v.setText(ipiTO.getCnpjProd());
    }

    public void firePropertyChange(String propertyName, ProdutoNotaTO produtoNotaTO) {
        this.firePropertyChange(propertyName, (Object)null, (Object)produtoNotaTO);
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
        try {
            if (this.v == e.getSource()) {
                String cnpjProdutor = this.a.stringToValue(this.v.getText()).toString();
                if (!StringHelper.isBlankOrNull((Object)cnpjProdutor)) {
                    String cnpj = StringHelper.completaComZerosAEsquerda((String)this.a.stringToValue(this.v.getText()).toString(), (int)14);
                    this.v.setText(cnpj);
                }
            } else {
                CSTEnum cst = (CSTEnum)this.H.getSelectedItem();
                this.atualizarICMSObrigatorios(cst);
                CSOSNEnum csosn = (CSOSNEnum)this.A.getSelectedItem();
                this.atualizarICMSObrigatorios(csosn);
            }
        }
        catch (Throwable t) {
            this.showErrors(t);
        }
    }

    private void a(String keyTodos, String keyOpcional) {
        JComponent[] todos = (JComponent[])this.a.get(keyTodos);
        if (todos == null) {
            return;
        }
        for (JComponent c : todos) {
            JLabel label = (JLabel)c;
            label.setText(this.a(label.getText()));
        }
        JComponent[] opcionais = (JComponent[])this.a.get(keyOpcional);
        if (opcionais == null) {
            return;
        }
        for (JComponent c : opcionais) {
            JLabel label = (JLabel)c;
            label.setText(this.b(label.getText()));
        }
    }

    private String a(String label) {
        if (!label.startsWith("*")) {
            return "* " + label;
        }
        return label;
    }

    private String b(String s) {
        if (s == null) {
            return null;
        }
        return s.replaceFirst("[ ]{0,}[*][ ]{0,}", "");
    }

    public void atualizarICMSObrigatorios(CSOSNEnum csosn) {
        if (csosn != null) {
            this.a("LABEL_ICMS" + csosn.getDescricao(), "LABEL_ICMS_OPC" + csosn.getDescricao());
            if (CSOSNEnum._900.equals((Object)csosn)) {
                this.n();
            }
            if (CSOSNEnum._500.equals((Object)csosn)) {
                this.p();
            }
        }
    }

    private void n() {
        if (!(this.B.getSelectedItem() == null && StringHelper.isBlankOrNull((Object)this.af.getText()) && StringHelper.isBlankOrNull((Object)this.ae.getText()) && StringHelper.isBlankOrNull((Object)this.ag.getText()))) {
            this.bl.setText(this.a(this.bl.getText()));
            this.bm.setText(this.a(this.bm.getText()));
            this.bk.setText(this.a(this.bk.getText()));
            this.bn.setText(this.a(this.bn.getText()));
        } else {
            this.bl.setText(this.b(this.bl.getText()));
            this.bm.setText(this.b(this.bm.getText()));
            this.bk.setText(this.b(this.bk.getText()));
            this.bn.setText(this.b(this.bn.getText()));
        }
        if (!(this.D.getSelectedItem() == null && StringHelper.isBlankOrNull((Object)this.al.getText()) && StringHelper.isBlankOrNull((Object)this.ah.getText()) && StringHelper.isBlankOrNull((Object)this.am.getText()))) {
            this.bs.setText(this.a(this.bs.getText()));
            this.bu.setText(this.a(this.bu.getText()));
            this.bp.setText(this.a(this.bp.getText()));
            this.bv.setText(this.a(this.bv.getText()));
        } else {
            this.bs.setText(this.b(this.bs.getText()));
            this.bu.setText(this.b(this.bu.getText()));
            this.bp.setText(this.b(this.bp.getText()));
            this.bv.setText(this.b(this.bv.getText()));
        }
        if (!StringHelper.isBlankOrNull((Object)this.ab.getText()) || !StringHelper.isBlankOrNull((Object)this.ad.getText())) {
            this.bg.setText(this.a(this.bg.getText()));
            this.bj.setText(this.a(this.bj.getText()));
        } else {
            this.bg.setText(this.b(this.bg.getText()));
            this.bj.setText(this.b(this.bj.getText()));
        }
    }

    public void atualizarICMSObrigatorios(CSTEnum cst) {
        if (cst != null) {
            this.a("LABEL_ICMS" + cst.getDescricao(), "LABEL_ICMS_OPC" + cst.getDescricao());
            if (CSTEnum._90.equals((Object)cst)) {
                this.o();
            }
            if (CSTEnum._60.equals((Object)cst)) {
                this.q();
            }
        }
    }

    public void disableICMSRegime40(CSTEnum cst) {
        if (cst != null && !"manterNotaOperacaoDetalhe".equals(this.getOperacaoNota())) {
            if (CSTEnum._40.equals((Object)cst) || CSTEnum._41.equals((Object)cst) || CSTEnum._50.equals((Object)cst)) {
                this.disableComponents("produtoNotaCSTSemICMS");
            } else if ("manterNotaOperacaoEdicao".equals(this.getOperacaoNota())) {
                this.enableComponents("produtoNotaCSTSemICMS");
            }
        }
    }

    private void o() {
        if (!(this.I.getSelectedItem() == null && StringHelper.isBlankOrNull((Object)this.at.getText()) && StringHelper.isBlankOrNull((Object)this.ap.getText()) && StringHelper.isBlankOrNull((Object)this.au.getText()))) {
            this.bE.setText(this.a(this.bE.getText()));
            this.bK.setText(this.a(this.bK.getText()));
            this.bB.setText(this.a(this.bB.getText()));
            this.bL.setText(this.a(this.bL.getText()));
        } else {
            this.bE.setText(this.b(this.bE.getText()));
            this.bK.setText(this.b(this.bK.getText()));
            this.bB.setText(this.b(this.bB.getText()));
            this.bL.setText(this.b(this.bL.getText()));
        }
        if (!(this.M.getSelectedItem() == null && StringHelper.isBlankOrNull((Object)this.aA.getText()) && StringHelper.isBlankOrNull((Object)this.az.getText()) && StringHelper.isBlankOrNull((Object)this.aJ.getText()))) {
            this.ca.setText(this.a(this.ca.getText()));
            this.bT.setText(this.a(this.bT.getText()));
            this.bS.setText(this.a(this.bS.getText()));
            this.ce.setText(this.a(this.ce.getText()));
        } else {
            this.ca.setText(this.b(this.ca.getText()));
            this.bT.setText(this.b(this.bT.getText()));
            this.bS.setText(this.b(this.bS.getText()));
            this.ce.setText(this.b(this.ce.getText()));
        }
    }

    private void p() {
        if (!StringHelper.isBlankOrNull((Object)this.ai.getText()) || !StringHelper.isBlankOrNull((Object)this.aj.getText())) {
            this.bq.setText(this.a(this.bq.getText()));
            this.br.setText(this.a(this.br.getText()));
        } else {
            this.bq.setText(this.b(this.bq.getText()));
            this.br.setText(this.b(this.br.getText()));
        }
    }

    private void q() {
        if (!StringHelper.isBlankOrNull((Object)this.aB.getText()) || !StringHelper.isBlankOrNull((Object)this.aE.getText())) {
            this.bU.setText(this.a(this.bU.getText()));
            this.bX.setText(this.a(this.bX.getText()));
        } else {
            this.bU.setText(this.b(this.bU.getText()));
            this.bX.setText(this.b(this.bX.getText()));
        }
    }

    public NotaFiscalTO getNotaFiscalTO() {
        ProdutoNotaTO produtoNotaTO = this.getProdutoNotaTO(true);
        try {
            NFeDocument nfe = DocumentoUtil.getNFeDocument((String)this.a.getDocXmlString());
            nfe.getNFe().getInfNFe().setDetArray(new TNFe.InfNFe.Det[]{produtoNotaTO.getDetalheProduto()});
            this.a.setDocXmlString(nfe.xmlText());
        }
        catch (XmlException nfe) {
            // empty catch block
        }
        return this.a;
    }

    public void setNotaFiscalTO(NotaFiscalTO notaFiscalTO) {
        NotaFiscalTO notaFiscalTOClone = new NotaFiscalTO();
        try {
            PropertyUtils.copyProperties((Object)notaFiscalTOClone, (Object)notaFiscalTO);
            NFeDocument nfe4 = NFeDocument.Factory.newInstance();
            nfe4.addNewNFe().addNewInfNFe();
            notaFiscalTOClone.setDocXmlString(DocumentoUtil.getDocumentString((Object)nfe4, (boolean)true));
        }
        catch (UnsupportedEncodingException nfe4) {
        }
        catch (NoSuchMethodException nfe4) {
        }
        catch (IllegalAccessException nfe4) {
        }
        catch (InvocationTargetException nfe4) {
            // empty catch block
        }
        this.a = notaFiscalTOClone;
    }

    public void updateValorICMS(TNFe.InfNFe.Det detalheProduto) {
        if (detalheProduto != null && detalheProduto.getImposto() != null) {
            CSTEnum icmsEnum = (CSTEnum)this.H.getSelectedItem();
            String vICMS = null;
            String vICMSST = null;
            String vICMSop = null;
            if (icmsEnum.equals((Object)CSTEnum._00)) {
                vICMS = detalheProduto.getImposto().getICMS().getICMS00().getVICMS();
            } else if (icmsEnum.equals((Object)CSTEnum._10)) {
                vICMS = detalheProduto.getImposto().getICMS().getICMS10().getVICMS();
                vICMSST = detalheProduto.getImposto().getICMS().getICMS10().getVICMSST();
            } else if (icmsEnum.equals((Object)CSTEnum._20)) {
                vICMS = detalheProduto.getImposto().getICMS().getICMS20().getVICMS();
            } else if (icmsEnum.equals((Object)CSTEnum._30)) {
                vICMSST = detalheProduto.getImposto().getICMS().getICMS30().getVICMSST();
            } else if (icmsEnum.equals((Object)CSTEnum._51)) {
                vICMS = detalheProduto.getImposto().getICMS().getICMS51().getVICMS();
                vICMSop = detalheProduto.getImposto().getICMS().getICMS51().getVICMSOp();
            } else if (icmsEnum.equals((Object)CSTEnum._60)) {
                vICMSST = detalheProduto.getImposto().getICMS().getICMS60().getVICMSSTRet();
            } else if (icmsEnum.equals((Object)CSTEnum._70)) {
                vICMS = detalheProduto.getImposto().getICMS().getICMS70().getVICMS();
                vICMSST = detalheProduto.getImposto().getICMS().getICMS70().getVICMSST();
            } else if (icmsEnum.equals((Object)CSTEnum._90)) {
                vICMS = detalheProduto.getImposto().getICMS().getICMS90().getVICMS();
                vICMSST = detalheProduto.getImposto().getICMS().getICMS90().getVICMSST();
            } else if (icmsEnum.equals((Object)CSTEnum._90_Part) || icmsEnum.equals((Object)CSTEnum._10_Part)) {
                vICMS = detalheProduto.getImposto().getICMS().getICMSPart().getVICMS();
                vICMSST = detalheProduto.getImposto().getICMS().getICMSPart().getVICMSST();
            }
            NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
            try {
                this.au.setText(!StringHelper.isBlankOrNull((Object)vICMS) ? formatter1302.valueToString(new BigDecimal(vICMS)) : null);
                this.ay.setText(!StringHelper.isBlankOrNull((Object)vICMSop) ? formatter1302.valueToString(new BigDecimal(vICMSop)) : null);
                this.aJ.setText(!StringHelper.isBlankOrNull((Object)vICMSST) ? formatter1302.valueToString(new BigDecimal(vICMSST)) : null);
            }
            catch (ParseException parseException) {
                // empty catch block
            }
        }
    }

    public void updateValorICMSST(TNFe.InfNFe.Det detalheProduto) {
        if (detalheProduto != null && detalheProduto.getImposto() != null) {
            CSTEnum icmsEnum = (CSTEnum)this.H.getSelectedItem();
            String vICMSST = null;
            if (icmsEnum.equals((Object)CSTEnum._10)) {
                vICMSST = detalheProduto.getImposto().getICMS().getICMS10().getVICMSST();
            } else if (icmsEnum.equals((Object)CSTEnum._30)) {
                vICMSST = detalheProduto.getImposto().getICMS().getICMS30().getVICMSST();
            } else if (icmsEnum.equals((Object)CSTEnum._60)) {
                vICMSST = detalheProduto.getImposto().getICMS().getICMS60().getVICMSSTRet();
            } else if (icmsEnum.equals((Object)CSTEnum._70)) {
                vICMSST = detalheProduto.getImposto().getICMS().getICMS70().getVICMSST();
            } else if (icmsEnum.equals((Object)CSTEnum._90)) {
                vICMSST = detalheProduto.getImposto().getICMS().getICMS90().getVICMSST();
            } else if (icmsEnum.equals((Object)CSTEnum._90_Part) || icmsEnum.equals((Object)CSTEnum._10_Part)) {
                vICMSST = detalheProduto.getImposto().getICMS().getICMSPart().getVICMSST();
            }
            NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
            try {
                this.aJ.setText(!StringHelper.isBlankOrNull((Object)vICMSST) ? formatter1302.valueToString(new BigDecimal(vICMSST)) : null);
            }
            catch (ParseException parseException) {
                // empty catch block
            }
        }
    }

    public void updateValorICMSSN(TNFe.InfNFe.Det detalheProduto) {
        if (detalheProduto != null && detalheProduto.getImposto() != null) {
            CSOSNEnum icmsEnum = (CSOSNEnum)this.A.getSelectedItem();
            String vICMS = null;
            String vICMSST = null;
            switch (6.b[icmsEnum.ordinal()]) {
                case 10: {
                    vICMS = detalheProduto.getImposto().getICMS().getICMSSN900().getVICMS();
                    vICMSST = detalheProduto.getImposto().getICMS().getICMSSN900().getVICMSST();
                }
            }
            NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
            try {
                this.ag.setText(!StringHelper.isBlankOrNull((Object)vICMS) ? formatter1302.valueToString(new BigDecimal(vICMS)) : null);
                this.am.setText(!StringHelper.isBlankOrNull((Object)vICMSST) ? formatter1302.valueToString(new BigDecimal(vICMSST)) : null);
            }
            catch (ParseException parseException) {
                // empty catch block
            }
        }
    }

    public void updateValorICMSSNST(TNFe.InfNFe.Det detalheProduto) {
        if (detalheProduto != null && detalheProduto.getImposto() != null) {
            CSOSNEnum icmsEnum = (CSOSNEnum)this.A.getSelectedItem();
            String vICMSST = null;
            switch (6.b[icmsEnum.ordinal()]) {
                case 6: {
                    vICMSST = detalheProduto.getImposto().getICMS().getICMSSN201().getVICMSST();
                    break;
                }
                case 7: 
                case 8: {
                    vICMSST = detalheProduto.getImposto().getICMS().getICMSSN202().getVICMSST();
                    break;
                }
                case 10: {
                    vICMSST = detalheProduto.getImposto().getICMS().getICMSSN900().getVICMSST();
                }
            }
            NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
            try {
                this.am.setText(!StringHelper.isBlankOrNull((Object)vICMSST) ? formatter1302.valueToString(new BigDecimal(vICMSST)) : null);
            }
            catch (ParseException parseException) {
                // empty catch block
            }
        }
    }

    public void updateValorIPI(TNFe.InfNFe.Det detalheProduto) {
        IPIEnum ipiEnum;
        if (detalheProduto != null && detalheProduto.getImposto() != null && ((ipiEnum = (IPIEnum)this.k.getSelectedItem()).equals((Object)IPIEnum.IPI_00) || ipiEnum.equals((Object)IPIEnum.IPI_49) || ipiEnum.equals((Object)IPIEnum.IPI_50) || ipiEnum.equals((Object)IPIEnum.IPI_99))) {
            TIpi.IPITrib ipiTrib = detalheProduto.getImposto().getIPI().getIPITrib();
            NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
            try {
                this.A.setText(!StringHelper.isBlankOrNull((Object)ipiTrib.getVIPI()) ? formatter1302.valueToString(new BigDecimal(ipiTrib.getVIPI())) : null);
            }
            catch (ParseException parseException) {
                // empty catch block
            }
        }
    }

    public void updateValorII(TNFe.InfNFe.Det detalheProduto) {
        if (detalheProduto != null && detalheProduto.getImposto() != null) {
            TNFe.InfNFe.Det.Imposto.II ii = detalheProduto.getImposto().getII();
            NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
            try {
                this.t.setText(!StringHelper.isBlankOrNull((Object)ii.getVII()) ? formatter1302.valueToString(new BigDecimal(ii.getVII())) : null);
            }
            catch (ParseException parseException) {
                // empty catch block
            }
        }
    }

    public void updateValorPIS(TNFe.InfNFe.Det detalheProduto) {
        if (detalheProduto != null && detalheProduto.getImposto() != null) {
            PISEnum pisEnum = (PISEnum)this.v.getSelectedItem();
            String vPIS = null;
            NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
            if (pisEnum.equals((Object)PISEnum.PIS_01) || pisEnum.equals((Object)PISEnum.PIS_02)) {
                vPIS = detalheProduto.getImposto().getPIS().getPISAliq().getVPIS();
            } else if (pisEnum.equals((Object)PISEnum.PIS_03)) {
                vPIS = detalheProduto.getImposto().getPIS().getPISQtde().getVPIS();
            } else if (new Short(pisEnum.getCst()).compareTo(new Short(PISEnum.PIS_49.getCst())) >= 0) {
                vPIS = detalheProduto.getImposto().getPIS().getPISOutr().getVPIS();
            }
            try {
                this.V.setText(!StringHelper.isBlankOrNull((Object)vPIS) ? formatter1302.valueToString(new BigDecimal(vPIS)) : null);
            }
            catch (ParseException parseException) {
                // empty catch block
            }
        }
    }

    public void updateValorPISST(TNFe.InfNFe.Det detalheProduto) {
        if (detalheProduto != null && detalheProduto.getImposto() != null) {
            TNFe.InfNFe.Det.Imposto.PISST pisST = detalheProduto.getImposto().getPISST();
            NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
            try {
                this.S.setText(!StringHelper.isBlankOrNull((Object)pisST.getVPIS()) ? formatter1302.valueToString(new BigDecimal(pisST.getVPIS())) : null);
            }
            catch (ParseException parseException) {
                // empty catch block
            }
        }
    }

    public void updateValorCOFINS(TNFe.InfNFe.Det detalheProduto) {
        if (detalheProduto != null && detalheProduto.getImposto() != null) {
            COFINSEnum cofinsEnum = (COFINSEnum)this.b.getSelectedItem();
            String vCOFINS = null;
            NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
            if (cofinsEnum != null) {
                if (cofinsEnum.equals((Object)COFINSEnum.COFINS_01) || cofinsEnum.equals((Object)COFINSEnum.COFINS_02)) {
                    vCOFINS = detalheProduto.getImposto().getCOFINS().getCOFINSAliq().getVCOFINS();
                } else if (cofinsEnum.equals((Object)COFINSEnum.COFINS_03)) {
                    vCOFINS = detalheProduto.getImposto().getCOFINS().getCOFINSQtde().getVCOFINS();
                } else if (new Short(cofinsEnum.getCst()).compareTo(new Short(COFINSEnum.COFINS_49.getCst())) >= 0) {
                    vCOFINS = detalheProduto.getImposto().getCOFINS().getCOFINSOutr().getVCOFINS();
                }
            }
            try {
                this.m.setText(!StringHelper.isBlankOrNull((Object)vCOFINS) ? formatter1302.valueToString(new BigDecimal(vCOFINS)) : null);
            }
            catch (ParseException parseException) {
                // empty catch block
            }
            TNFe.InfNFe.Det.Imposto.COFINSST cofinsST = detalheProduto.getImposto().getCOFINSST();
            if (cofinsST != null) {
                try {
                    this.j.setText(!StringHelper.isBlankOrNull((Object)cofinsST.getVCOFINS()) ? formatter1302.valueToString(new BigDecimal(cofinsST.getVCOFINS())) : null);
                }
                catch (ParseException parseException) {
                    // empty catch block
                }
            }
        }
    }

    public void updateValorISSQN(TNFe.InfNFe.Det detalheProduto) {
        if (detalheProduto != null && detalheProduto.getImposto() != null) {
            TNFe.InfNFe.Det.Imposto.ISSQN issqn = detalheProduto.getImposto().getISSQN();
            NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
            if (issqn != null) {
                try {
                    this.J.setText(!StringHelper.isBlankOrNull((Object)issqn.getVISSQN()) ? formatter1302.valueToString(new BigDecimal(issqn.getVISSQN())) : null);
                }
                catch (ParseException parseException) {
                    // empty catch block
                }
            }
        }
    }

    public void updateValorCIDE(TNFe.InfNFe.Det detalheProduto) {
        if (detalheProduto != null && detalheProduto.getProd().getComb() != null) {
            TNFe.InfNFe.Det.Prod.Comb comb = detalheProduto.getProd().getComb();
            NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
            if (comb.getCIDE() != null) {
                try {
                    this.l.setText(!StringHelper.isBlankOrNull((Object)comb.getCIDE().getVCIDE()) ? formatter1302.valueToString(new BigDecimal(comb.getCIDE().getVCIDE())) : null);
                }
                catch (ParseException parseException) {
                    // empty catch block
                }
            }
        }
    }

    public List<ProdutoExportacaoTO> getAllExportTO() {
        return this.d.getAllTO();
    }

    public List<DITO> getAllDITO() {
        return this.a.getAllTO();
    }

    public List<NVETO> getAllNVETO() {
        return this.e.getAllTO();
    }

    public List<MedicamentoNotaTO> getAllMedicamentoNotaTO() {
        return this.b.getAllTO();
    }

    public List<ArmaTO> getAllArmaTO() {
        return this.c.getAllTO();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        String text = this.i.getText().toUpperCase();
        this.i.setText(text);
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        String text = this.i.getText().toUpperCase();
        this.i.setText(text);
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        String text = this.i.getText().toUpperCase();
        this.i.setText(text);
    }

    public IPIEnum getSelectedIPI() {
        IPIEnum ipiEnum = null;
        if (this.k.getSelectedItem() != null && !this.k.getSelectedItem().equals("")) {
            ipiEnum = (IPIEnum)this.k.getSelectedItem();
        }
        return ipiEnum;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == 1) {
            if (this.j == e.getSource()) {
                if (TipoTributacaoEnum.NORMAL.equals(e.getItem())) {
                    this.E.setVisible(false);
                    if (this.H.getItemCount() > 0 && this.H.getSelectedIndex() == -1) {
                        this.H.setSelectedIndex(0);
                    }
                    this.J.setVisible(true);
                } else if (TipoTributacaoEnum.SIMPLES_NACIONAL.equals(e.getItem())) {
                    this.J.setVisible(false);
                    if (this.A.getItemCount() > 0 && this.A.getSelectedIndex() == -1) {
                        this.A.setSelectedIndex(0);
                    }
                    this.E.setVisible(true);
                }
            } else if (this.a == e.getSource() || this.b == e.getSource()) {
                this.b(this.a.isSelected());
            } else if (this.f == e.getSource() && !"manterNotaOperacaoDetalhe".equals(this.getOperacaoNota())) {
                if (TcProdANP.X_210203001.toString() == (String)e.getItem()) {
                    this.o.setEnabled(true);
                } else {
                    this.o.setText(null);
                    this.o.setEnabled(false);
                }
            }
        }
    }

    private void b(boolean icms) {
        this.b.setEnabledAt(0, icms);
        this.b.setEnabledAt(4, icms);
        this.b.setEnabledAt(5, !icms);
        SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
    }

    public void disableICMSRegime40() {
        this.au.setText("");
        this.au.setVisible(false);
        this.au.setEnabled(false);
        this.au.setEditable(false);
    }

    public void enableICMSRegime40() {
        this.au.setEnabled(true);
        this.au.setEditable(true);
        this.au.setVisible(true);
    }

    public void disableAbaIPIDevol(boolean enable) {
        this.b.setEnabledAt(6, !enable);
        if (!this.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
            this.w.setText("");
            this.x.setText("");
        }
    }

    public void setComponentsVisible(String key, boolean visible) {
        JComponent[] components;
        Map map = this.getMapComponents();
        if (map != null && (components = (JComponent[])map.get(key)) != null) {
            for (int i = 0; i < components.length; ++i) {
                components[i].setVisible(visible);
            }
        }
    }

    public void limparCamposCSOSN() {
        this.B.setSelectedIndex(-1);
        this.af.setText("");
        this.ac.setText("");
        this.ae.setText("");
        this.ag.setText("");
        this.D.setSelectedIndex(-1);
        this.ak.setText("");
        this.aa.setText("");
        this.al.setText("");
        this.ah.setText("");
        this.am.setText("");
        this.ad.setText("");
        this.ab.setText("");
        this.ai.setText("");
        this.aj.setText("");
    }

    public void limparCamposIPI() {
        this.q.setText("");
        this.o.setText("");
        this.v.setText("");
        this.p.setText("");
        this.r.setText("");
    }

    public void limparCamposCST() {
        this.ar.setText("");
        this.aq.setText("");
        this.ap.setText("");
        this.at.setText("");
        this.au.setText("");
        this.I.setSelectedIndex(-1);
        this.N.setSelectedIndex(-1);
        this.az.setText("");
        this.aA.setText("");
        this.aJ.setText("");
        this.M.setSelectedIndex(-1);
        this.aH.setText("");
        this.aI.setText("");
        this.J.setSelectedIndex(-1);
        this.K.setSelectedIndex(-1);
        this.aB.setText("");
        this.aE.setText("");
        this.aC.setText("");
        this.aF.setText("");
        this.aD.setText("");
        this.aG.setText("");
    }

    public void verificarNVESelecionadosTabela() {
        List listaNVE = this.e.getAllTO();
        this.disableComponents("produtoNotaUmaNVESelecionada");
        if (listaNVE != null && listaNVE.size() == 1) {
            if (this.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
                this.enableComponents("produtoNotaUmaNVESelecionada");
            } else {
                this.enableComponents("produtoNotaDetalheUmaNVESelecionada");
            }
        } else if (listaNVE != null && listaNVE.size() > 0 && this.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
            this.enableComponents("produtoNotaVariasNVESelecionadas");
        }
    }

    public void limparCmbCOFINSSTTpCalculo() {
        this.c.setSelectedIndex(-1);
    }

    public void limparCmbPISSTTpCalculo() {
        this.w.setSelectedIndex(-1);
    }

    public void verificarSelecionadosTabela(List<? extends BaseTO> lista, String tipo) {
        this.disableComponents("MANTER_NFE_INICIO_DESABILITADO" + tipo);
        if (lista == null || lista.size() == 0) {
            if (!this.getOperacaoNota().equals("manterNotaOperacaoDetalhe")) {
                this.enableComponents("MANTER_NFE_EDICAO" + tipo + "0");
            } else {
                this.enableComponents("MANTER_NFE_DETALHE" + tipo + "0");
            }
            return;
        }
        if (lista.size() == 1) {
            if (!this.getOperacaoNota().equals("manterNotaOperacaoDetalhe")) {
                this.enableComponents("MANTER_NFE_EDICAO" + tipo + "1");
            } else {
                this.enableComponents("MANTER_NFE_DETALHE" + tipo + "1");
            }
        } else if (!this.getOperacaoNota().equals("manterNotaOperacaoDetalhe")) {
            this.enableComponents("MANTER_NFE_EDICAO" + tipo + "*");
        } else {
            this.enableComponents("MANTER_NFE_DETALHE" + tipo + "*");
        }
    }

    public void setInfoSimplesNacionalICMSST(String label) {
        this.aD.setText(label);
    }

    public NVETO showNVEGUI(NVETO nveTO) {
        JLabel label = new JLabel("* NVE:");
        JFormattedTextField txtlacre = new JFormattedTextField();
        ((AbstractDocument)txtlacre.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[A-Z]{2}[0-9]{4}"));
        txtlacre.setText(nveTO.getValorNVE());
        if (!this.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
            txtlacre.setEnabled(false);
        }
        if (JOptionPane.showConfirmDialog((Component)this, new Object[]{label, txtlacre}, "NVE:", 2, -1, null) == 2) {
            return null;
        }
        nveTO.setValorNVE(txtlacre.getText());
        return nveTO;
    }

    static /* synthetic */ JFormattedTextField a(ProdutoNotaGUI x0) {
        return x0.A;
    }

    static /* synthetic */ void a(ProdutoNotaGUI x0, ActionEvent x1) {
        x0.a(x1);
    }

    static /* synthetic */ void b(ProdutoNotaGUI x0, ActionEvent x1) {
        x0.b(x1);
    }

    static /* synthetic */ JTabbedPane a(ProdutoNotaGUI x0) {
        return x0.a;
    }

    static /* synthetic */ JTabbedPane b(ProdutoNotaGUI x0) {
        return x0.b;
    }

    static /* synthetic */ JCheckBox a(ProdutoNotaGUI x0) {
        return x0.b;
    }
}

