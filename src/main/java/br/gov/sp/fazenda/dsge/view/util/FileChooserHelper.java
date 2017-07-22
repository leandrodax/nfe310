/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.util.DSGELabelConstants
 *  br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.view.message.DSGEMessageDialog
 *  br.gov.sp.fazenda.dsge.view.util.FileChooserHelper
 *  com.jtechlabs.ui.widget.directorychooser.JDirectoryChooser
 */
package br.gov.sp.fazenda.dsge.view.util;

import br.gov.sp.fazenda.dsge.common.util.DSGELabelConstants;
import br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.view.message.DSGEMessageDialog;
import com.jtechlabs.ui.widget.directorychooser.JDirectoryChooser;
import java.awt.Component;
import java.io.File;
import java.text.MessageFormat;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * Exception performing whole class analysis ignored.
 */
public class FileChooserHelper {
    private static String a = null;
    private static String b = null;
    public static int DEFAULT_MAX_PATH_LENGTH = Integer.MAX_VALUE;
    public static int DEFAULT_MAX_FILE_NAME_LENGTH = 255;
    public static int DEFAULT_MAX_DIRECTORY_NAME_LENGTH = 255;

    public FileChooserHelper() {
    }

    public static String chooseFile(Component parentGUI, String sugestedFileName, FileNameExtensionFilter filter) {
        JFileChooser fileChooser = new JFileChooser();
        if (filter != null) {
            fileChooser.setFileFilter(filter);
            fileChooser.setAcceptAllFileFilterUsed(false);
        }
        fileChooser.setApproveButtonText(DSGELabelConstants.FILE_CHOOSER_APPROVE_BUTTON_TEXT);
        fileChooser.setApproveButtonToolTipText(DSGELabelConstants.FILE_CHOOSER_APPROVE_BUTTON_TOOLTIP);
        fileChooser.setDialogTitle(DSGELabelConstants.FILE_CHOOSER_DIALOG_TITLE);
        String filePath = null;
        try {
            File lastChoosed;
            if (a != null && (lastChoosed = new File(a)).exists() && lastChoosed.canWrite() && lastChoosed.canRead()) {
                fileChooser.setSelectedFile(lastChoosed);
            }
            if (fileChooser.getSelectedFile() == null) {
                fileChooser.setSelectedFile(fileChooser.getCurrentDirectory());
            }
            if (!StringHelper.isBlankOrNull((Object)sugestedFileName)) {
                fileChooser.setSelectedFile(new File(fileChooser.getSelectedFile().getAbsolutePath() + File.separator + sugestedFileName));
            }
        }
        catch (Throwable lastChoosed) {
            // empty catch block
        }
        int selecao = fileChooser.showOpenDialog(parentGUI);
        if (selecao == 0) {
            File file = fileChooser.getSelectedFile();
            File parentDir = file.getParentFile();
            if (file.exists() && !FileChooserHelper.validateFileChoosed((File)file, (Component)parentGUI, (boolean)true, (boolean)true)) {
                return null;
            }
            if (parentDir != null && !FileChooserHelper.validateDirectoryChoosed((File)parentDir, (Component)parentGUI, (boolean)true, (boolean)true)) {
                return null;
            }
            filePath = file.getAbsolutePath();
            if (filePath.length() > DEFAULT_MAX_PATH_LENGTH) {
                DSGEMessageDialog.showMessage((String)MessageFormat.format(DSGEMessageConstants.CAMINHO_ARQUIVO_NAO_PODE_CONTER_MAIS_X_CARACTERES, DEFAULT_MAX_PATH_LENGTH));
                return null;
            }
            if (file.getName().length() > DEFAULT_MAX_FILE_NAME_LENGTH) {
                DSGEMessageDialog.showMessage((String)MessageFormat.format(DSGEMessageConstants.NOME_ARQUIVO_NAO_PODE_CONTER_MAIS_X_CARACTERES, DEFAULT_MAX_FILE_NAME_LENGTH));
                return null;
            }
            a = parentDir.getAbsolutePath();
        }
        return filePath;
    }

    public static String chooseFile(Component parentGUI, boolean checkWrite, boolean checkRead, FileNameExtensionFilter filter) {
        return FileChooserHelper.chooseFile((Component)parentGUI, (boolean)checkWrite, (boolean)checkRead, (FileNameExtensionFilter)filter, (int)DEFAULT_MAX_PATH_LENGTH, (int)DEFAULT_MAX_FILE_NAME_LENGTH);
    }

    public static String chooseFile(Component parentGUI, boolean checkWrite, boolean checkRead, FileNameExtensionFilter filter, int maxPathLength, int maxFileNameLength) {
        File file;
        int selecao;
        JFileChooser fileChooser = new JFileChooser();
        if (filter != null) {
            fileChooser.setFileFilter(filter);
            fileChooser.setAcceptAllFileFilterUsed(false);
        }
        fileChooser.setFileSelectionMode(0);
        fileChooser.setApproveButtonText(DSGELabelConstants.FILE_CHOOSER_APPROVE_BUTTON_TEXT);
        fileChooser.setApproveButtonToolTipText(DSGELabelConstants.FILE_CHOOSER_APPROVE_BUTTON_TOOLTIP);
        fileChooser.setDialogTitle(DSGELabelConstants.FILE_CHOOSER_DIALOG_TITLE);
        String filePath = null;
        if (b != null) {
            try {
                File lastChoosed = new File(b);
                if (lastChoosed.exists() && (checkWrite && lastChoosed.canWrite() && checkRead && lastChoosed.canRead() || checkRead && lastChoosed.canRead() || checkWrite && lastChoosed.canWrite())) {
                    fileChooser.setSelectedFile(lastChoosed);
                }
            }
            catch (Throwable lastChoosed) {
                // empty catch block
            }
        }
        if ((selecao = fileChooser.showOpenDialog(parentGUI)) == 0 && FileChooserHelper.validateFileChoosed((File)(file = fileChooser.getSelectedFile()), (Component)parentGUI, (boolean)checkWrite, (boolean)checkRead, (int)maxPathLength, (int)maxFileNameLength)) {
            filePath = file.getAbsolutePath();
        }
        if (filePath != null) {
            b = filePath;
        }
        return filePath;
    }

    public static String chooseDirectory(Component parentGUI, boolean checkWrite, boolean checkRead) {
        return FileChooserHelper.chooseDirectory((Component)parentGUI, (boolean)checkWrite, (boolean)checkRead, (int)DEFAULT_MAX_PATH_LENGTH, (int)DEFAULT_MAX_DIRECTORY_NAME_LENGTH);
    }

    public static String chooseDirectory(Component parentGUI, boolean checkWrite, boolean checkRead, int maxPathLength, int maxDirectoryNameLength) {
        File lastChoosed = null;
        if (a != null) {
            try {
                lastChoosed = new File(a);
                if (!(lastChoosed.exists() && (checkWrite && lastChoosed.canWrite() && checkRead && lastChoosed.canRead() || checkRead && lastChoosed.canRead() || checkWrite && lastChoosed.canWrite()))) {
                    lastChoosed = null;
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        File file = null;
        if (System.getProperty("os.name").equals("Windows 7")) {
            JFileChooser chooser = new JFileChooser();
            chooser.setFileSelectionMode(1);
            int returnVal = chooser.showDialog(parentGUI, null);
            file = chooser.getSelectedFile();
        } else {
            file = JDirectoryChooser.showDialog((Component)parentGUI, (File)lastChoosed);
        }
        String directory = null;
        if (file != null && FileChooserHelper.validateDirectoryChoosed((File)file, (Component)parentGUI, (boolean)checkWrite, (boolean)checkRead, (int)maxPathLength, (int)maxDirectoryNameLength)) {
            directory = file.getAbsolutePath();
        }
        if (directory != null) {
            a = directory;
        }
        return directory;
    }

    public static boolean validateFileChoosed(File myFile, Component myGUI, boolean checkWrite, boolean checkRead) {
        return FileChooserHelper.validateFileChoosed((File)myFile, (Component)myGUI, (boolean)checkWrite, (boolean)checkRead, (int)DEFAULT_MAX_PATH_LENGTH, (int)DEFAULT_MAX_FILE_NAME_LENGTH);
    }

    public static boolean validateFileChoosed(File myFile, Component myGUI, boolean checkWrite, boolean checkRead, int maxPathLength, int maxFileNameLength) {
        if (myFile == null) {
            DSGEMessageDialog.showMessage((String)DSGEMessageConstants.SELECIONE_UM_ARQUIVO);
            return false;
        }
        if (!myFile.exists()) {
            DSGEMessageDialog.showMessage((String)MessageFormat.format(DSGEMessageConstants.ARQUIVO_X_NAO_EXISTE, myFile.getAbsolutePath()));
            return false;
        }
        if (checkRead && !myFile.canRead()) {
            DSGEMessageDialog.showMessage((String)MessageFormat.format(DSGEMessageConstants.NAO_EXISTE_PERMISSAO_LEITURA_ARQUIVO_X, myFile.getAbsolutePath()));
            return false;
        }
        if (checkWrite && !myFile.canWrite()) {
            DSGEMessageDialog.showMessage((String)MessageFormat.format(DSGEMessageConstants.NAO_EXISTE_PERMISSAO_ESCREVER_ARQUIVO_X, myFile.getAbsolutePath()));
            return false;
        }
        if (maxPathLength > 0 && myFile.getAbsolutePath().length() > maxPathLength) {
            DSGEMessageDialog.showMessage((String)MessageFormat.format(DSGEMessageConstants.CAMINHO_ARQUIVO_NAO_PODE_CONTER_MAIS_X_CARACTERES, maxPathLength));
            return false;
        }
        if (maxFileNameLength > 0 && myFile.getName().length() > maxFileNameLength) {
            DSGEMessageDialog.showMessage((String)MessageFormat.format(DSGEMessageConstants.NOME_ARQUIVO_NAO_PODE_CONTER_MAIS_X_CARACTERES, maxFileNameLength));
            return false;
        }
        return true;
    }

    public static boolean validateDirectoryChoosed(File myFile, Component myGUI, boolean checkWrite, boolean checkRead) {
        return FileChooserHelper.validateDirectoryChoosed((File)myFile, (Component)myGUI, (boolean)checkWrite, (boolean)checkRead, (int)DEFAULT_MAX_PATH_LENGTH, (int)DEFAULT_MAX_DIRECTORY_NAME_LENGTH);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static boolean validateDirectoryChoosed(File myFile, Component myGUI, boolean checkWrite, boolean checkRead, int maxPathLength, int maxDirectoryName) {
        block10 : {
            if (myFile == null) {
                DSGEMessageDialog.showMessage((String)DSGEMessageConstants.SELECIONE_UM_DIRETORIO);
                return false;
            }
            if (myFile.exists()) ** GOTO lbl22
            resposta = DSGEMessageDialog.showQuestion((Component)myGUI, (String)MessageFormat.format(DSGEMessageConstants.CRIAR_DIRETORIO_QUESTION, new Object[]{myFile.getAbsolutePath()}));
            if (resposta != 0) return false;
            try {
                myFile.mkdirs();
            }
            catch (SecurityException var7_7) {
                if (!myFile.exists()) {
                    DSGEMessageDialog.showMessage((String)MessageFormat.format(DSGEMessageConstants.NAO_EXISTE_PERMISSAO_CRIAR_DIRETORIO_X, new Object[]{myFile.getAbsolutePath()}));
                    return false;
                }
                break block10;
                catch (Throwable var8_8) {
                    if (myFile.exists() != false) throw var8_8;
                    DSGEMessageDialog.showMessage((String)MessageFormat.format(DSGEMessageConstants.NAO_EXISTE_PERMISSAO_CRIAR_DIRETORIO_X, new Object[]{myFile.getAbsolutePath()}));
                    return false;
                }
            }
            if (!myFile.exists()) {
                DSGEMessageDialog.showMessage((String)MessageFormat.format(DSGEMessageConstants.NAO_EXISTE_PERMISSAO_CRIAR_DIRETORIO_X, new Object[]{myFile.getAbsolutePath()}));
                return false;
            }
            ** GOTO lbl28
lbl22: // 1 sources:
            if (checkRead && !myFile.canRead()) {
                DSGEMessageDialog.showMessage((String)MessageFormat.format(DSGEMessageConstants.NAO_EXISTE_PERMISSAO_LEITURA_DIRETORIO_X, new Object[]{myFile.getAbsolutePath()}));
                return false;
            }
            if (checkWrite && !myFile.canWrite()) {
                DSGEMessageDialog.showMessage((String)MessageFormat.format(DSGEMessageConstants.NAO_EXISTE_PERMISSAO_ESCREVER_DIRETORIO_X, new Object[]{myFile.getAbsolutePath()}));
                return false;
            }
        }
        if (myFile.getAbsolutePath().length() > maxPathLength) {
            DSGEMessageDialog.showMessage((String)MessageFormat.format(DSGEMessageConstants.CAMINHO_ARQUIVO_NAO_PODE_CONTER_MAIS_X_CARACTERES, new Object[]{maxPathLength}));
            return false;
        }
        if (maxDirectoryName <= 0) return true;
        if (myFile.getName().length() <= maxDirectoryName) return true;
        DSGEMessageDialog.showMessage((String)MessageFormat.format(DSGEMessageConstants.NOME_DIRETORIO_NAO_PODE_CONTER_MAIS_X_CARACTERES, new Object[]{maxDirectoryName}));
        return false;
    }

    static {
    }
}

