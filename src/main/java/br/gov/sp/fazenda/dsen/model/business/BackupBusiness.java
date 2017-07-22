/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.BackupRestoreTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.model.business.BackupBusiness
 *  br.gov.sp.fazenda.dsen.model.dao.BackupRestoreDAO
 *  br.gov.sp.fazenda.dsen.model.dao.util.DSENDAOHelper
 *  br.gov.sp.fazenda.dsen.model.database.util.NetworkServerManager
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsen.model.facade.SistemaFacade
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.util.DSGEZip
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction
 */
package br.gov.sp.fazenda.dsen.model.business;

import br.gov.sp.fazenda.dsen.common.to.BackupRestoreTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.model.dao.BackupRestoreDAO;
import br.gov.sp.fazenda.dsen.model.dao.util.DSENDAOHelper;
import br.gov.sp.fazenda.dsen.model.database.util.NetworkServerManager;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsen.model.facade.SistemaFacade;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.util.DSGEZip;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction;
import java.io.File;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.ZipException;

public class BackupBusiness {
    private String a = DSENDAOHelper.databaseName;
    private String b = this.a + DateHelper.formataDataHora((Date)new Date(), (SimpleDateFormat)DateHelper.DATE_TIME_FORMAT_BACKUP);
    private String c = this.b + ".zip";

    private boolean a(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; ++i) {
                boolean success = this.a(new File(dir, children[i]));
                if (success) continue;
                return false;
            }
        }
        return dir.delete();
    }

    @DSGETransaction
    public boolean executarBackup(BackupRestoreTO backupTO) throws DSENBusinessException {
        boolean resultado = false;
        DSGEZip zip = new DSGEZip();
        String caminhoBackup = backupTO.getCaminho();
        try {
            BackupRestoreDAO backupDAO = new BackupRestoreDAO();
            if (AppContext.getInstance().isBuscaRetornoSEFAZRunning()) {
                backupTO.addError(MessageFormat.format(DSENMessageConstants.MSG_WS_EM_EXECUCAO, ""));
                return resultado;
            }
            if (caminhoBackup == null || "".equals(caminhoBackup)) {
                backupTO.addError(MessageFormat.format(DSENMessageConstants.MSG_CAMINHO_INVALIDO, ""));
                return resultado;
            }
            File caminhoDir = new File(caminhoBackup);
            if (!caminhoDir.isDirectory()) {
                backupTO.addError(MessageFormat.format(DSENMessageConstants.MSG_CAMINHO_INVALIDO, ""));
                return resultado;
            }
            File caminhoDirBackup = new File(caminhoDir.getAbsolutePath() + File.separator + this.b);
            caminhoDirBackup.mkdir();
            backupDAO.backupBD(caminhoDirBackup.getAbsolutePath());
            zip.criarZip(caminhoDirBackup.getAbsolutePath(), caminhoDir + File.separator + this.c);
            this.a(caminhoDirBackup);
            resultado = true;
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (ZipException e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        return resultado;
    }

    public boolean executarRestore(BackupRestoreTO to) throws DSENBusinessException {
        boolean resultado = false;
        DSGEZip zip = new DSGEZip();
        String caminhoRestore = to.getCaminho();
        try {
            BackupRestoreDAO restoreDAO = new BackupRestoreDAO();
            if (AppContext.getInstance().isBuscaRetornoSEFAZRunning()) {
                to.addError(MessageFormat.format(DSENMessageConstants.MSG_WS_EM_EXECUCAO, ""));
                return resultado;
            }
            if (StringHelper.isBlankOrNull((Object)caminhoRestore)) {
                to.addError(MessageFormat.format(DSENMessageConstants.MSG_CAMINHO_INVALIDO, ""));
                return resultado;
            }
            File zipFile = new File(caminhoRestore);
            if (!zipFile.isFile()) {
                to.addError(MessageFormat.format(DSENMessageConstants.MSG_CAMINHO_INVALIDO, ""));
                return resultado;
            }
            String tmpDir = System.getProperty("java.io.tmpdir");
            File caminhoRestoreTemp = zip.extrairZip(zipFile.getAbsolutePath(), tmpDir);
            DSENDAOHelper.closeSession();
            DSENDAOHelper.closeFactory();
            restoreDAO.encerrarBD();
            restoreDAO.restaurarBD(caminhoRestoreTemp.getAbsolutePath() + File.separator + this.a);
            NetworkServerManager.getInstance().startNetworkServer();
            new DSENDAOHelper().init();
            SistemaFacade sistemaFacade = new SistemaFacade();
            sistemaFacade.verificarVersao();
            this.a(caminhoRestoreTemp);
            resultado = true;
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (ZipException e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        catch (Throwable t) {
            throw new DSENBusinessException(t, t.getMessage());
        }
        return resultado;
    }
}

