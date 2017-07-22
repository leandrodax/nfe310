<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:x="http://www.portalfiscal.inf.br/nfe" >
	<xsl:output method="text" version="1.0" encoding="UTF-8" indent="yes"/>
	<xsl:strip-space elements="*"/>
	<xsl:template match="/">
	
		<!-- NOTAFISCAL -->

			<!-- A -->
			<xsl:if test="x:NFe/x:infNFe"><xsl:text>&#13;&#10;A|</xsl:text></xsl:if>
			<xsl:for-each select="x:NFe/x:infNFe">
				<xsl:value-of select="@versao"/><xsl:text>|</xsl:text>
				<xsl:value-of select="@Id"/><xsl:text>|</xsl:text>
				
				<!-- B -->
				<xsl:for-each select="x:ide">
					<xsl:text>&#13;&#10;B|</xsl:text>
					<xsl:value-of select="x:cUF"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:cNF"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:natOp"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:indPag"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:mod"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:serie"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:nNF"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:dEmi"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:dSaiEnt"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:hSaiEnt"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:tpNF"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:cMunFG"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:tpImp"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:tpEmis"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:cDV"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:tpAmb"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:finNFe"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:procEmi"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:verProc"/><xsl:text>|</xsl:text>
					<xsl:value-of select="substring(x:dhCont,0,20)"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:xJust"/><xsl:text>|</xsl:text>
					
					<!-- B13 -->
					<xsl:for-each select="x:NFref/x:refNFe">
						<xsl:text>&#13;&#10;B13|</xsl:text>
						<xsl:value-of select="."/><xsl:text>|</xsl:text>
					</xsl:for-each>
					<!-- /B13 -->
					
					<!-- B14 -->
					<xsl:for-each select="x:NFref/x:refNF">
					    <xsl:text>&#13;&#10;B14|</xsl:text>
						<xsl:value-of select="x:cUF"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:AAMM"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:CNPJ"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:mod"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:serie"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:nNF"/><xsl:text>|</xsl:text>
					</xsl:for-each>
					<!-- /B14 -->
					
					<!-- B20a -->
					<xsl:for-each select="x:NFref/x:refNFP">
					    <xsl:text>&#13;&#10;B20a|</xsl:text>
						<xsl:value-of select="x:cUF"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:AAMM"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:IE"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:mod"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:serie"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:nNF"/><xsl:text>|</xsl:text>
						<!-- B20d -->
						<xsl:if test="string-length(x:CNPJ) != 0">
							<xsl:text>&#13;&#10;B20d|</xsl:text>
							<xsl:value-of select="x:CNPJ"/><xsl:text>|</xsl:text>
						</xsl:if>
						<!-- /B20d -->
						<!-- B20e -->
						<xsl:if test="string-length(x:CPF) != 0">
							<xsl:text>&#13;&#10;B20e|</xsl:text>
							<xsl:value-of select="x:CPF"/><xsl:text>|</xsl:text>
						</xsl:if>
						<!-- /B20e -->
					</xsl:for-each>
					<!-- /B20a -->
					
					<!-- B20i -->
					<xsl:for-each select="x:NFref/x:refCTe">
						<xsl:text>&#13;&#10;B20i|</xsl:text>
						<xsl:value-of select="."/><xsl:text>|</xsl:text>
					</xsl:for-each>
					<!-- /B20i -->
					
					<!-- B20j -->
					<xsl:for-each select="x:NFref/x:refECF">
					    <xsl:text>&#13;&#10;B20j|</xsl:text>
						<xsl:value-of select="x:mod"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:nECF"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:nCOO"/><xsl:text>|</xsl:text>
					</xsl:for-each>
					<!-- /B20j -->
					
				</xsl:for-each>
				<!-- /B -->
				
				<!-- C -->
				<xsl:for-each select="x:emit">
					<xsl:text>&#13;&#10;C|</xsl:text>
					<xsl:value-of select="x:xNome"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:xFant"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:IE"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:IEST"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:IM"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:CNAE"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:CRT"/><xsl:text>|</xsl:text>
					
					<!-- C02 -->
					<xsl:if test="string-length(x:CNPJ) != 0">
						<xsl:text>&#13;&#10;C02|</xsl:text>
						<xsl:value-of select="x:CNPJ"/><xsl:text>|</xsl:text>
					</xsl:if>
					<!-- /C02 -->
					
					<!-- C02a  -->
					<xsl:if test="string-length(x:CPF) != 0">
						<xsl:text>&#13;&#10;C02a|</xsl:text>
						<xsl:value-of select="x:CPF"/><xsl:text>|</xsl:text>
					</xsl:if>
					<!-- /C02a -->
					
					<!-- C05 -->
					<xsl:for-each select="x:enderEmit">
						<xsl:text>&#13;&#10;C05|</xsl:text>
						<xsl:value-of select="x:xLgr"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:nro"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:xCpl"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:xBairro"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:cMun"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:xMun"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:UF"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:CEP"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:cPais"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:xPais"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:fone"/><xsl:text>|</xsl:text>
					</xsl:for-each>
					<!-- /C05 -->
					
				</xsl:for-each>
				<!-- /C -->
				
				<!-- D -->
				<xsl:for-each select="x:avulsa">
					<xsl:text>&#13;&#10;D|</xsl:text>
					<xsl:value-of select="x:CNPJ"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:xOrgao"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:matr"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:xAgente"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:fone"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:UF"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:nDAR"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:dEmi"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:vDAR"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:repEmi"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:dPag"/><xsl:text>|</xsl:text>
				</xsl:for-each>
				<!--/D -->
				
				<!-- E -->
				<xsl:for-each select="x:dest">
					<xsl:text>&#13;&#10;E|</xsl:text>
					<xsl:value-of select="x:xNome"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:IE"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:ISUF"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:email"/><xsl:text>|</xsl:text>
					
					<!-- E02 -->
					<xsl:if test="string-length(x:CNPJ) != 0 or x:enderDest/x:UF='EX'">
						<xsl:text>&#13;&#10;E02|</xsl:text>
						<xsl:value-of select="x:CNPJ"/><xsl:text>|</xsl:text>
					</xsl:if>
					<!-- /E02 -->
					
					<!-- E03 -->
					<xsl:if test="string-length(x:CPF) != 0">
						<xsl:text>&#13;&#10;E03|</xsl:text>
						<xsl:value-of select="x:CPF"/><xsl:text>|</xsl:text>
					</xsl:if>
					<!-- /E03 -->
					
					<!-- E05 -->
					<xsl:for-each select="x:enderDest">
						<xsl:text>&#13;&#10;E05|</xsl:text>
						<xsl:value-of select="x:xLgr"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:nro"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:xCpl"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:xBairro"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:cMun"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:xMun"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:UF"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:CEP"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:cPais"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:xPais"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:fone"/><xsl:text>|</xsl:text>
					</xsl:for-each>
					<!-- /E05 -->
					
				</xsl:for-each>
				<!-- /E -->
				
				<!-- F -->
				<xsl:for-each select="x:retirada">
					<xsl:text>&#13;&#10;F|</xsl:text>
					<xsl:value-of select="x:xLgr"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:nro"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:xCpl"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:xBairro"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:cMun"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:xMun"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:UF"/><xsl:text>|</xsl:text>
					
					<!-- F02 -->
					<xsl:if test="string-length(x:CNPJ) != 0 or x:UF='EX'">
						<xsl:text>&#13;&#10;F02|</xsl:text>
						<xsl:value-of select="x:CNPJ"/><xsl:text>|</xsl:text>
					</xsl:if>					
					<!-- /F02 -->
					
					<!-- F02a -->
					<xsl:if test="string-length(x:CPF) != 0">
						<xsl:text>&#13;&#10;F02a|</xsl:text>
						<xsl:value-of select="x:CPF"/><xsl:text>|</xsl:text>
					</xsl:if>
					<!-- /F02a -->
					
				</xsl:for-each>
				<!-- /F -->
				
				<!-- G -->
				<xsl:for-each select="x:entrega">
					<xsl:text>&#13;&#10;G|</xsl:text>
					<xsl:value-of select="x:xLgr"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:nro"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:xCpl"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:xBairro"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:cMun"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:xMun"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:UF"/><xsl:text>|</xsl:text>
					
					<!-- G02 -->
					<xsl:if test="string-length(x:CNPJ) != 0 or x:UF='EX'">
						<xsl:text>&#13;&#10;G02|</xsl:text>
						<xsl:value-of select="x:CNPJ"/><xsl:text>|</xsl:text>
					</xsl:if>
					<!-- /G02 -->
					
					<!-- G02a -->
					<xsl:if test="string-length(x:CPF) != 0">
						<xsl:text>&#13;&#10;G02a|</xsl:text>
						<xsl:value-of select="x:CPF"/><xsl:text>|</xsl:text>
					</xsl:if>
					<!-- /G02a -->
					
				</xsl:for-each>
				<!-- /G -->
				
				<!-- H -->
				<xsl:for-each select="x:det">
					<xsl:text>&#13;&#10;H|</xsl:text>
					<xsl:value-of select="@nItem"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:infAdProd"/><xsl:text>|</xsl:text>
					
					<!-- I -->
					<xsl:for-each select="x:prod">
						<xsl:text>&#13;&#10;I|</xsl:text>
						<xsl:value-of select="x:cProd"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:cEAN"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:xProd"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:NCM"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:EXTIPI"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:CFOP"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:uCom"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:qCom"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vUnCom"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vProd"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:cEANTrib"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:uTrib"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:qTrib"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vUnTrib"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vFrete"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vSeg"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vDesc"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vOutro"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:indTot"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:xPed"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:nItemPed"/><xsl:text>|</xsl:text>												
						<xsl:value-of select="x:nFCI"/><xsl:text>|</xsl:text>
						
						<!-- I18 -->
						<xsl:for-each select="x:DI">
							<xsl:text>&#13;&#10;I18|</xsl:text>
							<xsl:value-of select="x:nDI"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:dDI"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:xLocDesemb"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:UFDesemb"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:dDesemb"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:cExportador"/><xsl:text>|</xsl:text>
							
							<!-- I25 -->
							<xsl:for-each select="x:adi">
								<xsl:text>&#13;&#10;I25|</xsl:text>
								<xsl:value-of select="x:nAdicao"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:nSeqAdic"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:cFabricante"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vDescDI"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /I25 -->
							
						</xsl:for-each>
						<!-- /I18 -->
						
						<!-- J -->
						<xsl:for-each select="x:veicProd">
							<xsl:text>&#13;&#10;J|</xsl:text>
							<xsl:value-of select="x:tpOp"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:chassi"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:cCor"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:xCor"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:pot"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:cilin"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:pesoL"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:pesoB"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:nSerie"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:tpComb"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:nMotor"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:CMT"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:dist"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:anoMod"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:anoFab"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:tpPint"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:tpVeic"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:espVeic"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:VIN"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:condVeic"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:cMod"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:cCorDENATRAN"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:lota"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:tpRest"/><xsl:text>|</xsl:text>																					
						</xsl:for-each>
						<!-- /J -->
						
						<!-- K -->
						<xsl:for-each select="x:med">
							<xsl:text>&#13;&#10;K|</xsl:text>
							<xsl:value-of select="x:nLote"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:qLote"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:dFab"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:dVal"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:vPMC"/><xsl:text>|</xsl:text>
						</xsl:for-each>
						<!-- /K -->
						
						<!-- L -->
						<xsl:for-each select="x:arma">
							<xsl:text>&#13;&#10;L|</xsl:text>
							<xsl:value-of select="x:tpArma"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:nSerie"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:nCano"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:descr"/><xsl:text>|</xsl:text>
						</xsl:for-each>
						<!-- /L -->
						
						<!-- L01 -->
						<xsl:for-each select="x:comb">
							<xsl:text>&#13;&#10;L01|</xsl:text>
							<xsl:value-of select="x:cProdANP"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:CODIF"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:qTemp"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:UFCons"/><xsl:text>|</xsl:text>							
							
							<!-- L105 -->
							<xsl:for-each select="x:CIDE">
								<xsl:text>&#13;&#10;L105|</xsl:text>
								<xsl:value-of select="x:qBCProd"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vAliqProd"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vCIDE"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /L105 -->
												
						</xsl:for-each>
						<!-- /L01 -->
						
					</xsl:for-each>
					<!-- /I -->
					
					<!-- M -->
					<xsl:for-each select="x:imposto">
						<xsl:text>&#13;&#10;M|</xsl:text>
						<!-- M02  -->
						<xsl:value-of select="x:vTotTrib"/><xsl:text>|</xsl:text>
						
						<!-- N -->
						<xsl:for-each select="x:ICMS">
							<xsl:text>&#13;&#10;N|</xsl:text>
							<!-- N02 -->
							<xsl:for-each select="x:ICMS00">
								<xsl:text>&#13;&#10;N02|</xsl:text>
								<xsl:value-of select="x:orig"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:CST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:modBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pICMS"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vICMS"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /N02 -->
							
							<!-- N03 -->
							<xsl:for-each select="x:ICMS10">
								<xsl:text>&#13;&#10;N03|</xsl:text>							
								<xsl:value-of select="x:orig"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:CST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:modBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pICMS"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vICMS"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:modBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pMVAST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pRedBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pICMSST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vICMSST"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /N03 -->
														
							<!-- N04 -->
							<xsl:for-each select="x:ICMS20">
								<xsl:text>&#13;&#10;N04|</xsl:text>							
								<xsl:value-of select="x:orig"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:CST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:modBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pRedBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pICMS"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vICMS"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /N04 -->
														
							<!-- N05 -->
							<xsl:for-each select="x:ICMS30">
								<xsl:text>&#13;&#10;N05|</xsl:text>							
								<xsl:value-of select="x:orig"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:CST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:modBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pMVAST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pRedBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pICMSST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vICMSST"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /N05 -->
							
							<!-- N06 -->
							<xsl:for-each select="x:ICMS40">
								<xsl:text>&#13;&#10;N06|</xsl:text>
								<xsl:value-of select="x:orig"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:CST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vICMS"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:motDesICMS"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /N06 -->
							
							<!-- N07 -->
							<xsl:for-each select="x:ICMS51">
								<xsl:text>&#13;&#10;N07|</xsl:text>							
								<xsl:value-of select="x:orig"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:CST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:modBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pRedBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pICMS"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vICMS"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /N07 -->
							
							<!-- N08 -->
							<xsl:for-each select="x:ICMS60">
								<xsl:text>&#13;&#10;N08|</xsl:text>							
								<xsl:value-of select="x:orig"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:CST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vICMSST"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /N08 -->
							
							<!-- N09 -->
							<xsl:for-each select="x:ICMS70">
								<xsl:text>&#13;&#10;N09|</xsl:text>							
								<xsl:value-of select="x:orig"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:CST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:modBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pRedBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pICMS"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vICMS"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:modBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pMVAST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pRedBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pICMSST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vICMSST"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /N09 -->
							
							<!-- N10 -->
							<xsl:for-each select="x:ICMS90">
								<xsl:text>&#13;&#10;N10|</xsl:text>							
								<xsl:value-of select="x:orig"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:CST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:modBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pRedBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pICMS"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vICMS"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:modBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pMVAST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pRedBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pICMSST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vICMSST"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /N10 -->
							
							<!-- N10a -->
							<xsl:for-each select="x:ICMSPart">
								<xsl:text>&#13;&#10;N10a|</xsl:text>							
								<xsl:value-of select="x:orig"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:CST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:modBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pRedBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pICMS"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vICMS"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:modBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pMVAST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pRedBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pICMSST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vICMSST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pBCOp"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:UFST"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /N10a -->
							
							<!-- N10b -->
							<xsl:for-each select="x:ICMSST">
								<xsl:text>&#13;&#10;N10b|</xsl:text>							
								<xsl:value-of select="x:orig"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:CST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vBCSTRet"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vICMSSTRet"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vBCSTDest"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vICMSSTDest"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /N10b -->
							
							<!-- N10c -->
							<xsl:for-each select="x:ICMSSN101">
								<xsl:text>&#13;&#10;N10c|</xsl:text>							
								<xsl:value-of select="x:orig"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:CSOSN"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pCredSN"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vCredICMSSN"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /N10c -->
							
							<!-- N10d -->
							<xsl:for-each select="x:ICMSSN102">
								<xsl:text>&#13;&#10;N10d|</xsl:text>							
								<xsl:value-of select="x:orig"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:CSOSN"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /N10d -->
							
							<!-- N10e -->
							<xsl:for-each select="x:ICMSSN201">
								<xsl:text>&#13;&#10;N10e|</xsl:text>							
								<xsl:value-of select="x:orig"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:CSOSN"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:modBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pMVAST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pRedBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pICMSST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vICMSST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pCredSN"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vCredICMSSN"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /N10e -->
							
							<!-- N10f -->
							<xsl:for-each select="x:ICMSSN202">
								<xsl:text>&#13;&#10;N10f|</xsl:text>							
								<xsl:value-of select="x:orig"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:CSOSN"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:modBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pMVAST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pRedBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pICMSST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vICMSST"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /N10f -->
							
							<!-- N10g -->
							<xsl:for-each select="x:ICMSSN500">
								<xsl:text>&#13;&#10;N10g|</xsl:text>							
								<xsl:value-of select="x:orig"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:CSOSN"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:modBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vBCSTRet"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vICMSSTRet"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /N10g -->
							
							<!-- N10h -->
							<xsl:for-each select="x:ICMSSN900">
								<xsl:text>&#13;&#10;N10h|</xsl:text>							
								<xsl:value-of select="x:orig"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:CSOSN"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:modBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pRedBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pICMS"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vICMS"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:modBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pMVAST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pRedBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vBCST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pICMSST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vICMSST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pCredSN"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vCredICMSSN"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /N10h -->
							
						</xsl:for-each>
						<!-- /N -->
						
						<!-- O -->
						<xsl:for-each select="x:IPI">
							<xsl:text>&#13;&#10;O|</xsl:text>
							<xsl:value-of select="x:clEnq"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:CNPJProd"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:cSelo"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:qSelo"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:cEnq"/><xsl:text>|</xsl:text>
							
							<!-- O07 -->
							<xsl:for-each select="x:IPITrib">
								<xsl:text>&#13;&#10;O07|</xsl:text>
								<xsl:value-of select="x:CST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vIPI"/><xsl:text>|</xsl:text>

								<!-- O10 -->
								<xsl:if test="x:vBC">
									<xsl:text>&#13;&#10;O10|</xsl:text>
									<xsl:value-of select="x:vBC"/><xsl:text>|</xsl:text>
									<xsl:value-of select="x:pIPI"/><xsl:text>|</xsl:text>
								</xsl:if>
								<!-- /O10 -->
								
								<!-- O11 -->
								<xsl:if test="x:qUnid">
									<xsl:text>&#13;&#10;O11|</xsl:text>
									<xsl:value-of select="x:qUnid"/><xsl:text>|</xsl:text>
									<xsl:value-of select="x:vUnid"/><xsl:text>|</xsl:text>
								</xsl:if>
								<!-- /O11 -->
								
							</xsl:for-each>
							<!-- /O07 -->
							
							<!-- O08 -->
							<xsl:for-each select="x:IPINT">
								<xsl:text>&#13;&#10;O08|</xsl:text>
								<xsl:value-of select="x:CST"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /O08 -->
							
						</xsl:for-each>
						<!-- /O -->
						
						<!-- P -->
						<xsl:for-each select="x:II">
							<xsl:text>&#13;&#10;P|</xsl:text>
							<xsl:value-of select="x:vBC"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:vDespAdu"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:vII"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:vIOF"/><xsl:text>|</xsl:text>
						</xsl:for-each>
						<!-- /P -->
						
						<!-- U -->
						<xsl:for-each select="x:ISSQN">
							<xsl:text>&#13;&#10;U|</xsl:text>
							<xsl:value-of select="x:vBC"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:vAliq"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:vISSQN"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:cMunFG"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:cListServ"/><xsl:text>|</xsl:text>
							<xsl:value-of select="x:cSitTrib"/><xsl:text>|</xsl:text>
						</xsl:for-each>
						<!-- /U -->
						
						<!-- Q -->
						<xsl:for-each select="x:PIS">
							<xsl:text>&#13;&#10;Q|</xsl:text>
							
							<!-- Q02 -->
							<xsl:for-each select="x:PISAliq">
								<xsl:text>&#13;&#10;Q02|</xsl:text>
								<xsl:value-of select="x:CST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pPIS"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vPIS"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /Q02 -->
							
							<!-- Q03 -->
							<xsl:for-each select="x:PISQtde">
								<xsl:text>&#13;&#10;Q03|</xsl:text>
								<xsl:value-of select="x:CST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:qBCProd"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vAliqProd"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vPIS"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /Q03 -->
							
							<!-- Q04 -->
							<xsl:for-each select="x:PISNT">
								<xsl:text>&#13;&#10;Q04|</xsl:text>
								<xsl:value-of select="x:CST"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /Q04 -->
							
							<!-- Q05 -->
							<xsl:for-each select="x:PISOutr">
								<xsl:text>&#13;&#10;Q05|</xsl:text>
								<xsl:value-of select="x:CST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vPIS"/><xsl:text>|</xsl:text>
								
								<!-- Q07 -->
								<xsl:if test="x:vBC">
									<xsl:text>&#13;&#10;Q07|</xsl:text>
									<xsl:value-of select="x:vBC"/><xsl:text>|</xsl:text>
									<xsl:value-of select="x:pPIS"/><xsl:text>|</xsl:text>
								</xsl:if>
								<!-- /Q07 -->
								
								<!-- Q10 -->
								<xsl:if test="x:qBCProd">
									<xsl:text>&#13;&#10;Q10|</xsl:text>
									<xsl:value-of select="x:qBCProd"/><xsl:text>|</xsl:text>
									<xsl:value-of select="x:vAliqProd"/><xsl:text>|</xsl:text>
								</xsl:if>
								<!-- /Q10 -->
								
							</xsl:for-each>	
							<!-- /Q05 -->
							
						</xsl:for-each>	
						<!-- /Q -->
						
						<!-- R -->
						<xsl:for-each select="x:PISST">
							<xsl:text>&#13;&#10;R|</xsl:text>
							<xsl:value-of select="x:vPIS"/><xsl:text>|</xsl:text>
							
							<!-- R02 -->
							<xsl:if test="x:vBC">
								<xsl:text>&#13;&#10;R02|</xsl:text>
								<xsl:value-of select="x:vBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pPIS"/><xsl:text>|</xsl:text>
							</xsl:if>
							<!-- /R02 -->
							
							<!-- R04 -->
							<xsl:if test="x:qBCProd">
								<xsl:text>&#13;&#10;R04|</xsl:text>
								<xsl:value-of select="x:qBCProd"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vAliqProd"/><xsl:text>|</xsl:text>
							</xsl:if>
							<!-- /R04 -->
							
						</xsl:for-each>
						<!-- /R -->
						
						<!-- S -->
						<xsl:if test="x:COFINS"></xsl:if>
						<xsl:for-each select="x:COFINS">
							<xsl:text>&#13;&#10;S|</xsl:text>
							
							<!-- S02 -->
							<xsl:for-each select="x:COFINSAliq">
								<xsl:text>&#13;&#10;S02|</xsl:text>
								<xsl:value-of select="x:CST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pCOFINS"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vCOFINS"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /S02 -->
							
							<!-- S03 -->
							<xsl:for-each select="x:COFINSQtde">
								<xsl:text>&#13;&#10;S03|</xsl:text>
								<xsl:value-of select="x:CST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:qBCProd"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vAliqProd"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vCOFINS"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /S03 -->
							
							<!-- S04 -->
							<xsl:for-each select="x:COFINSNT">
								<xsl:text>&#13;&#10;S04|</xsl:text>
								<xsl:value-of select="x:CST"/><xsl:text>|</xsl:text>
							</xsl:for-each>
							<!-- /S04 -->
							
							<!-- S05 -->
							<xsl:for-each select="x:COFINSOutr">
								<xsl:text>&#13;&#10;S05|</xsl:text>
								<xsl:value-of select="x:CST"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vCOFINS"/><xsl:text>|</xsl:text>
								
								<!-- S07 -->
								<xsl:if test="x:vBC">
									<xsl:text>&#13;&#10;S07|</xsl:text>
									<xsl:value-of select="x:vBC"/><xsl:text>|</xsl:text>
									<xsl:value-of select="x:pCOFINS"/><xsl:text>|</xsl:text>
								</xsl:if>
								<!-- /S07 -->
								
								<!-- S09 -->
								<xsl:if test="x:qBCProd">
									<xsl:text>&#13;&#10;S09|</xsl:text>
									<xsl:value-of select="x:qBCProd"/><xsl:text>|</xsl:text>
									<xsl:value-of select="x:vAliqProd"/><xsl:text>|</xsl:text>
								</xsl:if>
								<!-- /S09 -->
							
							</xsl:for-each>
							<!-- /S05 -->
						
						</xsl:for-each>
						<!-- /S -->
						
						<!-- T -->
						<xsl:for-each select="x:COFINSST">
							<xsl:text>&#13;&#10;T|</xsl:text>
							<xsl:value-of select="x:vCOFINS"/><xsl:text>|</xsl:text>
							
							<!-- T02 -->
							<xsl:if test="x:vBC">
								<xsl:text>&#13;&#10;T02|</xsl:text>
								<xsl:value-of select="x:vBC"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:pCOFINS"/><xsl:text>|</xsl:text>
							</xsl:if>
							<!-- /T02 -->
							
							<!-- T04 -->
							<xsl:if test="x:qBCProd">
								<xsl:text>&#13;&#10;T04|</xsl:text>
								<xsl:value-of select="x:qBCProd"/><xsl:text>|</xsl:text>
								<xsl:value-of select="x:vAliqProd"/><xsl:text>|</xsl:text>
							</xsl:if>
							<!-- /T04 -->
							
						</xsl:for-each>
						<!-- /T -->
											
					</xsl:for-each>
					<!-- /M -->

				</xsl:for-each>
				<!-- /H -->
				
				<!-- W -->
				<xsl:for-each select="x:total">
					<xsl:text>&#13;&#10;W|</xsl:text>
					
					<!-- W02 -->
					<xsl:for-each select="x:ICMSTot">
						<xsl:text>&#13;&#10;W02|</xsl:text>
						<xsl:value-of select="x:vBC"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vICMS"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vBCST"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vST"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vProd"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vFrete"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vSeg"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vDesc"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vII"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vIPI"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vPIS"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vCOFINS"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vOutro"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vNF"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vTotTrib"/><xsl:text>|</xsl:text>
					</xsl:for-each>
					<!-- /W02 -->
					
					<!-- W17 -->
					<xsl:for-each select="x:ISSQNtot">
						<xsl:text>&#13;&#10;W17|</xsl:text>
						<xsl:value-of select="x:vServ"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vBC"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vISS"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vPIS"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vCOFINS"/><xsl:text>|</xsl:text>
					</xsl:for-each>
					<!-- /W17 -->

					<!-- W23 -->
					<xsl:for-each select="x:retTrib">
						<xsl:text>&#13;&#10;W23|</xsl:text>
						<xsl:value-of select="x:vRetPIS"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vRetCOFINS"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vRetCSLL"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vBCIRRF"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vIRRF"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vBCRetPrev"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vRetPrev"/><xsl:text>|</xsl:text>
					</xsl:for-each>
					<!-- /W23 -->
					
				</xsl:for-each>
				<!-- /W -->
				
				<!-- X -->
				<xsl:for-each select="x:transp">
					<xsl:text>&#13;&#10;X|</xsl:text>
					<xsl:value-of select="x:modFrete"/><xsl:text>|</xsl:text>
					
					<!-- X03 -->
					<xsl:for-each select="x:transporta">
						<xsl:text>&#13;&#10;X03|</xsl:text>
						<xsl:value-of select="x:xNome"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:IE"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:xEnder"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:UF"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:xMun"/><xsl:text>|</xsl:text>

						<!-- X04 -->
						<xsl:if test="string-length(x:CNPJ) != 0 or x:UF='EX'">
							<xsl:text>&#13;&#10;X04|</xsl:text>
							<xsl:value-of select="x:CNPJ"/><xsl:text>|</xsl:text>
						</xsl:if>
						<!-- /X04 -->
						
						<!-- X05 -->
						<xsl:if test="string-length(x:CPF) != 0">
							<xsl:text>&#13;&#10;X05|</xsl:text>
							<xsl:value-of select="x:CPF"/><xsl:text>|</xsl:text>
						</xsl:if>
						<!-- /X05 -->
					
					</xsl:for-each>
					<!-- /X03 -->
					
					<!-- X11 -->
					<xsl:for-each select="x:retTransp">
						<xsl:text>&#13;&#10;X11|</xsl:text>
						<xsl:value-of select="x:vServ"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vBCRet"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:pICMSRet"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vICMSRet"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:CFOP"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:cMunFG"/><xsl:text>|</xsl:text>
					</xsl:for-each>
					<!-- /X11 -->
					
					<!-- X18 -->
					<xsl:for-each select="x:veicTransp">
						<xsl:text>&#13;&#10;X18|</xsl:text>
						<xsl:value-of select="x:placa"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:UF"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:RNTC"/><xsl:text>|</xsl:text>
					</xsl:for-each>
					<!-- /X18 -->
					
					<!-- X22 -->
					<xsl:for-each select="x:reboque">
						<xsl:text>&#13;&#10;X22|</xsl:text>
						<xsl:value-of select="x:placa"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:UF"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:RNTC"/><xsl:text>|</xsl:text>
					</xsl:for-each>
					<!-- /X22 -->
					
					<!-- X25a -->
					<xsl:for-each select="x:vagao">
						<xsl:text>&#13;&#10;X25a|</xsl:text>
						<xsl:value-of select="."/><xsl:text>|</xsl:text>
					</xsl:for-each>
					<!-- /X25a -->
					
					<!-- X25b -->
					<xsl:for-each select="x:balsa">
						<xsl:text>&#13;&#10;X25b|</xsl:text>
						<xsl:value-of select="."/><xsl:text>|</xsl:text>
					</xsl:for-each>
					<!-- /X25b -->
					
					<!-- X26 -->
					<xsl:for-each select="x:vol">
						<xsl:text>&#13;&#10;X26|</xsl:text>
						<xsl:value-of select="x:qVol"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:esp"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:marca"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:nVol"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:pesoL"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:pesoB"/><xsl:text>|</xsl:text>
						
						<!-- X33 -->
						<xsl:for-each select="x:lacres">
							<xsl:text>&#13;&#10;X33|</xsl:text>
							<xsl:value-of select="x:nLacre"/><xsl:text>|</xsl:text>
						</xsl:for-each>
						<!-- /X33 -->
						
					</xsl:for-each>
					<!-- /X26 -->
					
				</xsl:for-each>
				<!-- /X -->
				
				<!-- Y -->
				<xsl:for-each select="x:cobr">
					<xsl:text>&#13;&#10;Y|</xsl:text>
					
					<!-- Y02 -->
					<xsl:for-each select="x:fat">
						<xsl:text>&#13;&#10;Y02|</xsl:text>
						<xsl:value-of select="x:nFat"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vOrig"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vDesc"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vLiq"/><xsl:text>|</xsl:text>
					</xsl:for-each>	
					<!-- /Y02 -->
					
					<!-- Y07 -->
					<xsl:for-each select="x:dup">
						<xsl:text>&#13;&#10;Y07|</xsl:text>
						<xsl:value-of select="x:nDup"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:dVenc"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vDup"/><xsl:text>|</xsl:text>
					</xsl:for-each>
					<!-- /Y07 -->
					
				</xsl:for-each>
				<!-- /Y -->
				
				<!-- Z -->
				<xsl:for-each select="x:infAdic">
					<xsl:text>&#13;&#10;Z|</xsl:text>
					<xsl:value-of select="x:infAdFisco"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:infCpl"/><xsl:text>|</xsl:text>
					
					<!-- Z04 -->
					<xsl:for-each select="x:obsCont">
						<xsl:text>&#13;&#10;Z04|</xsl:text>
						<xsl:value-of select="@xCampo"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:xTexto"/><xsl:text>|</xsl:text>
					</xsl:for-each>
					<!-- /Z04 -->
					
					<!-- Z07 -->
					<xsl:for-each select="x:obsFisco">
						<xsl:text>&#13;&#10;Z07|</xsl:text>
						<xsl:value-of select="@xCampo"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:xTexto"/><xsl:text>|</xsl:text>
					</xsl:for-each>
					<!-- /Z07 -->
					
					<!-- Z10 -->
					<xsl:for-each select="x:procRef">
						<xsl:text>&#13;&#10;Z10|</xsl:text>
						<xsl:value-of select="x:nProc"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:indProc"/><xsl:text>|</xsl:text>
					</xsl:for-each>
					<!-- /Z10 -->
					
				</xsl:for-each>
				<!-- /Z -->
				
				<!-- ZA -->
				<xsl:for-each select="x:exporta">
					<xsl:text>&#13;&#10;ZA|</xsl:text>
					<xsl:value-of select="x:UFEmbarq"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:xLocEmbarq"/><xsl:text>|</xsl:text>
				</xsl:for-each>
				<!-- /ZA -->
				
				<!-- ZB -->
				<xsl:for-each select="x:compra">
					<xsl:text>&#13;&#10;ZB|</xsl:text>
					<xsl:value-of select="x:xNEmp"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:xPed"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:xCont"/><xsl:text>|</xsl:text>
				</xsl:for-each>
				<!-- /ZB -->
				
				<!-- ZC01 -->
				<xsl:for-each select="x:cana">
					<xsl:text>&#13;&#10;ZC01|</xsl:text>
					<xsl:value-of select="x:safra"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:ref"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:qTotMes"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:qTotAnt"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:qTotGer"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:vFor"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:vTotDed"/><xsl:text>|</xsl:text>
					<xsl:value-of select="x:vLiqFor"/><xsl:text>|</xsl:text>	
					
					<!-- ZC04 -->
					<xsl:for-each select="x:forDia">
						<xsl:text>&#13;&#10;ZC04|</xsl:text>
						<xsl:value-of select="@dia"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:qtde"/><xsl:text>|</xsl:text>
					</xsl:for-each>
					<!-- /ZC04 -->
					
					<!-- ZC10 -->
					<xsl:for-each select="x:deduc">
						<xsl:text>&#13;&#10;ZC10|</xsl:text>
						<xsl:value-of select="x:xDed"/><xsl:text>|</xsl:text>
						<xsl:value-of select="x:vDed"/><xsl:text>|</xsl:text>
					</xsl:for-each>
					<!-- /ZC10 -->
																														
				</xsl:for-each>
				<!-- /ZC01 -->
				
			</xsl:for-each>
			<!-- /A -->
			
		<!-- /NOTAFISCAL -->
		
	</xsl:template>
</xsl:stylesheet>