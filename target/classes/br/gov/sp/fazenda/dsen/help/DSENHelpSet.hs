<?xml version="1.0" encoding="ISO-8859-1" ?>
<!DOCTYPE helpset
  PUBLIC "-//Sun Microsystems Inc.//DTD JavaHelp HelpSet Version 2.0//EN"
          "http://java.sun.com/products/javahelp/helpset_1_0.dtd">

<helpset version="2.0">

   <!-- title -->
   <title>Ajuda - Emissor de Nota Fiscal Eletrônica (NF-e)</title>

   <!-- maps -->
   <maps>
      <homeID>EmissorNFe-inicio</homeID>
      <mapref location="DSENMap.jhm" />
   </maps>

   <!-- views -->
   <view mergetype="javax.help.UniteAppendMerge">
      <name>Tópico</name>
      <label>Tópico</label>
      <type>javax.help.TOCView</type>
      <data>DSENTOC.xml</data>
   </view>

   <view mergetype="javax.help.SortMerge">
      <name>Índice</name>
      <label>Índice</label>
      <type>javax.help.IndexView</type>
      <data>DSENIndex.xml</data>
   </view>
   
   <view>
      <name>Pesquisa</name>
      <label>Pesquisa</label>
      <type>javax.help.SearchView</type>
      <data engine="com.sun.java.help.search.DefaultSearchEngine">JavaHelpSearch</data>
   </view>
  
   <presentation default="true">
      <name>Ajuda - Emissor de Nota Fiscal Eletrônica (NF-e)</name>
      <title>Ajuda - Emissor de Nota Fiscal Eletrônica (NF-e)</title>
      <size width="600" height="400" />
      <location x="200" y="200" />
      <image>help</image>
      <toolbar>
         <helpaction image="helpviewer_back">javax.help.BackAction</helpaction>
         <helpaction image="helpviewer_forward">javax.help.ForwardAction</helpaction>
         <helpaction>javax.help.SeparatorAction</helpaction>
         <helpaction image="helpviewer_print">javax.help.PrintAction</helpaction>
         <helpaction image="helpviewer_page-setup">javax.help.PrintSetupAction</helpaction>
      </toolbar>
   </presentation>

   <presentation displayviewimages="false">
      <name>Ajuda - Emissor de Nota Fiscal Eletrônica (NF-e)</name>
      <size width="600" height="400" />
      <location x="200" y="200" />
      <title>Ajuda do Emissor de Nota Fiscal Eletrônica (NF-e)</title>
  </presentation>

</helpset>
