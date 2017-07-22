/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsge.common.enumeration.YesNoAllCancelEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGECommonException
 *  br.gov.sp.fazenda.dsge.common.exception.exportacao.CancelarExportacaoException
 *  br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants
 *  br.gov.sp.fazenda.dsge.common.util.IOHelper
 *  br.gov.sp.fazenda.dsge.common.util.exportacao.ExportacaoHelper
 */
package br.gov.sp.fazenda.dsge.common.util.exportacao;

import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.GrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsge.common.enumeration.YesNoAllCancelEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGECommonException;
import br.gov.sp.fazenda.dsge.common.exception.exportacao.CancelarExportacaoException;
import br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants;
import br.gov.sp.fazenda.dsge.common.util.IOHelper;
import java.io.File;
import java.text.MessageFormat;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public class ExportacaoHelper {
    public ExportacaoHelper() {
    }

    public static boolean exportar(String nomeArquivo, String conteudoArquivo) throws CancelarExportacaoException {
        File file = new File(nomeArquivo);
        if (file.exists() && !ExportacaoHelper.a()) {
            Notificador.getInstance().notificar((Object)nomeArquivo, new EnumItf[]{GrupoNotificacaoEnum.SOBRESCREVER_ARQUIVO_EXISTENTE});
            YesNoAllCancelEnum arquivoExistenteAcao = ExportacaoHelper.a();
            if (YesNoAllCancelEnum.CANCELAR.equals((Object)arquivoExistenteAcao)) {
                throw new CancelarExportacaoException();
            }
            if (YesNoAllCancelEnum.NAO_SOBRESCREVER.equals((Object)arquivoExistenteAcao)) {
                return false;
            }
        }
        String exportacaoResultado = "";
        if (conteudoArquivo == null) {
            exportacaoResultado = MessageFormat.format(DSGEMessageConstants.ARQUIVO_X_ERRO_EXPORTACAO_NULL, nomeArquivo);
            Notificador.getInstance().notificar((Object)exportacaoResultado, new EnumItf[]{GrupoNotificacaoEnum.EXPORTACAO_RESULTADO});
            return false;
        }
        boolean ok = ExportacaoHelper.a((String)nomeArquivo, (String)conteudoArquivo);
        exportacaoResultado = MessageFormat.format(DSGEMessageConstants.ARQUIVO_X_EXPORTACAO, nomeArquivo);
        if (!ok) {
            exportacaoResultado = MessageFormat.format(DSGEMessageConstants.ARQUIVO_X_ERRO_EXPORTACAO_CAMINHO, nomeArquivo);
        }
        Notificador.getInstance().notificar((Object)exportacaoResultado, new EnumItf[]{GrupoNotificacaoEnum.EXPORTACAO_RESULTADO});
        return ok;
    }

    private static boolean a() {
        if (YesNoAllCancelEnum.SOBRESCREVER_TODOS.equals((Object)ExportacaoHelper.a())) {
            return true;
        }
        return false;
    }

    private static YesNoAllCancelEnum a() {
        YesNoAllCancelEnum defaultAcao = (YesNoAllCancelEnum)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.ACAO_SOBRESCREVER_ARQUIVO_EXISTENTE, YesNoAllCancelEnum.class);
        if (defaultAcao == null) {
            defaultAcao = YesNoAllCancelEnum.NAO_SOBRESCREVER;
        }
        return defaultAcao;
    }

    private static boolean a(String nomeArquivo, String conteudoArquivo) {
        try {
            IOHelper.writeFile((String)nomeArquivo, (String)conteudoArquivo, (String)"UTF-8");
            return true;
        }
        catch (DSGECommonException e) {
            return false;
        }
    }
}

