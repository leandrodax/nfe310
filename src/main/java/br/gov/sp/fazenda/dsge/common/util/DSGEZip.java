/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.util.DSGEZip
 */
package br.gov.sp.fazenda.dsge.common.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class DSGEZip {
    private static final int a = 4096;

    public void criarZip(String caminhoOrigem, String novoZip) throws ZipException {
        File arquivoZip = new File(novoZip);
        File arquivoOrigem = new File(caminhoOrigem);
        ZipOutputStream zipOutputStream = null;
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(arquivoZip), 4096));
            String caminhoPai = arquivoOrigem.getParent();
            this.a(zipOutputStream, arquivoOrigem, caminhoPai);
        }
        catch (IOException e) {
            e.printStackTrace();
            throw new ZipException(e.getMessage());
        }
        finally {
            if (zipOutputStream != null) {
                try {
                    zipOutputStream.close();
                }
                catch (Exception exception) {}
            }
        }
    }

    private void a(ZipOutputStream zipOutputStream, File arquivo, String caminhoPai) throws ZipException {
        BufferedInputStream bufferedInputStream = null;
        byte[] buffer = new byte[4096];
        try {
            if (arquivo.isDirectory()) {
                File[] arquivos = arquivo.listFiles();
                for (int i = 0; i < arquivos.length; ++i) {
                    this.a(zipOutputStream, arquivos[i], caminhoPai);
                }
                return;
            }
            String inicioZip = null;
            int i = arquivo.getAbsolutePath().indexOf(caminhoPai);
            if (i >= 0) {
                inicioZip = arquivo.getAbsolutePath().substring(i + caminhoPai.length() + 1);
            }
            zipOutputStream.putNextEntry(new ZipEntry(inicioZip));
            zipOutputStream.setMethod(8);
            bufferedInputStream = new BufferedInputStream(new FileInputStream(arquivo), 4096);
            int bytesLidos = 0;
            while ((bytesLidos = bufferedInputStream.read(buffer, 0, 4096)) != -1) {
                zipOutputStream.write(buffer, 0, bytesLidos);
            }
            zipOutputStream.closeEntry();
        }
        catch (IOException e) {
            e.printStackTrace();
            throw new ZipException(e.getMessage());
        }
        finally {
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                }
                catch (Exception exception) {}
            }
        }
    }

    public File extrairZip(String caminhoZip, String caminhoDestino) throws ZipException {
        byte[] buffer = new byte[4096];
        File destino = new File(caminhoDestino);
        if (!destino.exists()) {
            destino.mkdirs();
        }
        if (!destino.exists() || !destino.isDirectory()) {
            throw new ZipException("N\u00e3o foi poss\u00edvel ler/criar o diret\u00f3rio de destino.");
        }
        try {
            ZipFile zipFile = new ZipFile(caminhoZip);
            Enumeration<? extends ZipEntry> entradas = zipFile.entries();
            File entryFile = null;
            while (entradas.hasMoreElements()) {
                ZipEntry zipEntry = entradas.nextElement();
                entryFile = new File(destino, zipEntry.getName());
                if (zipEntry.isDirectory() && !entryFile.exists()) {
                    entryFile.mkdirs();
                    continue;
                }
                if (!entryFile.getParentFile().exists()) {
                    entryFile.getParentFile().mkdirs();
                }
                InputStream inputStream = zipFile.getInputStream(zipEntry);
                BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(entryFile));
                int bytes = 0;
                while ((bytes = inputStream.read(buffer)) > 0) {
                    outputStream.write(buffer, 0, bytes);
                }
                outputStream.close();
            }
            return this.a(entryFile, caminhoDestino);
        }
        catch (IOException e) {
            e.printStackTrace();
            throw new ZipException(e.getMessage());
        }
    }

    private File a(File entryFile, String caminhoDestino) {
        if (entryFile == null) {
            return null;
        }
        File destino = new File(caminhoDestino);
        File root = entryFile.getParentFile();
        while ((root = root.getParentFile()) != null && root.getParentFile() != null && !root.getParentFile().getAbsolutePath().equals(destino.getAbsolutePath())) {
        }
        return root;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String extrairConteudoZip(byte[] arquivoCompactado) throws IOException {
        int read = 0;
        ByteArrayInputStream inputStream = null;
        ZipInputStream zipInputStream = null;
        try {
            inputStream = new ByteArrayInputStream(arquivoCompactado);
            zipInputStream = new ZipInputStream(new BufferedInputStream(inputStream));
            zipInputStream.getNextEntry();
            StringBuffer xmlLido = new StringBuffer();
            while ((read = zipInputStream.read()) != -1) {
                xmlLido.append(new String(new byte[]{(byte)read}));
            }
            String string = xmlLido.toString();
            return string;
        }
        finally {
            if (zipInputStream != null) {
                try {
                    zipInputStream.close();
                }
                catch (IOException iOException) {}
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                }
                catch (IOException iOException) {}
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] criarConteudoZip(String arquivoDescompactado, String entryName) throws IOException {
        ByteArrayOutputStream outputStream = null;
        ZipOutputStream zipOutputStream = null;
        try {
            byte[] retorno;
            outputStream = new ByteArrayOutputStream();
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(outputStream));
            ZipEntry entry = new ZipEntry(entryName);
            zipOutputStream.putNextEntry(entry);
            zipOutputStream.write(arquivoDescompactado.getBytes());
            zipOutputStream.close();
            outputStream.close();
            byte[] arrby = retorno = outputStream.toByteArray();
            return arrby;
        }
        finally {
            if (zipOutputStream != null) {
                try {
                    zipOutputStream.close();
                }
                catch (IOException iOException) {}
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                }
                catch (IOException iOException) {}
            }
        }
    }
}

