/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGECommonException
 *  br.gov.sp.fazenda.dsge.common.io.CharsetToolkit
 *  br.gov.sp.fazenda.dsge.common.io.UnicodeBOMInputStream
 *  br.gov.sp.fazenda.dsge.common.io.UnicodeInputStream
 *  br.gov.sp.fazenda.dsge.common.util.IOHelper
 */
package br.gov.sp.fazenda.dsge.common.util;

import br.gov.sp.fazenda.dsge.common.exception.DSGECommonException;
import br.gov.sp.fazenda.dsge.common.io.CharsetToolkit;
import br.gov.sp.fazenda.dsge.common.io.UnicodeBOMInputStream;
import br.gov.sp.fazenda.dsge.common.io.UnicodeInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Scanner;

/*
 * Exception performing whole class analysis ignored.
 */
public class IOHelper {
    private static final byte a = 0;

    public IOHelper() {
    }

    public static final Scanner getScanner(byte[] toRead) {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(toRead);
        return new Scanner(inputStream, "UTF-8");
    }

    public static final Scanner getScanner(String toRead) {
        return new Scanner(toRead);
    }

    public static final Scanner getScannerUTF8(File file) throws Exception {
        Charset fileEncoding = CharsetToolkit.guessEncoding((File)file, (int)4096);
        if (!Charset.forName("UTF-8").equals(fileEncoding)) {
            return null;
        }
        InputStream in = IOHelper.getInputStreamUTF8SemBom((File)file);
        return new Scanner(in, "UTF-8");
    }

    public static InputStream getInputStreamUTF8SemBom(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        UnicodeInputStream uin = new UnicodeInputStream((InputStream)fis, "UTF-8");
        uin.getEncoding();
        return uin;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void writeFile(String path, String conteudo) throws DSGECommonException {
        try {
            OutputStreamWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(new File(path));
                fileWriter.write(conteudo);
            }
            finally {
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            }
        }
        catch (IOException e) {
            throw new DSGECommonException((Throwable)e, e.getMessage());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void writeFile(String path, String conteudo, String charset) throws DSGECommonException {
        try {
            OutputStreamWriter writer = null;
            try {
                writer = new OutputStreamWriter((OutputStream)new FileOutputStream(new File(path)), charset);
                writer.write(conteudo);
            }
            finally {
                if (writer != null) {
                    writer.close();
                }
            }
        }
        catch (FileNotFoundException e) {
            throw new DSGECommonException((Throwable)e, e.getMessage());
        }
        catch (IOException e) {
            throw new DSGECommonException((Throwable)e, e.getMessage());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String readFile(String path) throws DSGECommonException {
        String string;
        block7 : {
            BufferedReader bufferedReader = null;
            try {
                int c;
                bufferedReader = new BufferedReader(new FileReader(new File(path)));
                StringBuilder builder = new StringBuilder();
                while ((c = bufferedReader.read()) != -1) {
                    builder.append((char)c);
                }
                string = builder.toString();
                if (bufferedReader == null) break block7;
            }
            catch (Throwable throwable) {
                try {
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw throwable;
                }
                catch (IOException e) {
                    throw new DSGECommonException((Throwable)e, e.getMessage());
                }
            }
            bufferedReader.close();
        }
        return string;
    }

    public static String readFile(String path, String charset) throws DSGECommonException, UnsupportedEncodingException {
        return IOHelper.readFile((File)new File(path), (String)charset);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String readFile(File file, String charset) throws DSGECommonException, UnsupportedEncodingException {
        String string;
        block14 : {
            int read = 0;
            BufferedReader bufferedReader = null;
            try {
                if (charset.startsWith("UTF-8") || charset.startsWith("UTF-16") || charset.startsWith("UTF-32")) {
                    UnicodeBOMInputStream bomIs = new UnicodeBOMInputStream((InputStream)new FileInputStream(file));
                    bomIs.skipBOM();
                    bufferedReader = new BufferedReader(new InputStreamReader((InputStream)bomIs, charset));
                } else {
                    bufferedReader = new BufferedReader(new InputStreamReader((InputStream)new FileInputStream(file), charset));
                }
                StringBuilder arquivoLido = new StringBuilder();
                char[] buffer = new char[4096];
                while ((read = bufferedReader.read(buffer)) != -1) {
                    arquivoLido.append(new String(buffer, 0, read));
                }
                string = arquivoLido.toString();
                if (bufferedReader == null) break block14;
            }
            catch (Throwable throwable) {
                try {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        }
                        catch (IOException e) {
                            throw new DSGECommonException((Throwable)e, e.getMessage());
                        }
                    }
                    throw throwable;
                }
                catch (UnsupportedEncodingException e) {
                    throw e;
                }
                catch (Exception e) {
                    throw new DSGECommonException((Throwable)e, e.getMessage());
                }
            }
            try {
                bufferedReader.close();
            }
            catch (IOException e) {
                throw new DSGECommonException((Throwable)e, e.getMessage());
            }
        }
        return string;
    }

    public static String readFileSemBom(String path) throws DSGECommonException {
        return IOHelper.readFileSemBom((File)new File(path));
    }

    public static String getFirstNonEmptyLine(File file, String charset) throws DSGECommonException, UnsupportedEncodingException {
        BufferedReader bufferedReader = null;
        try {
            if (charset.startsWith("UTF-8") || charset.startsWith("UTF-16") || charset.startsWith("UTF-32")) {
                UnicodeBOMInputStream bomIs = new UnicodeBOMInputStream((InputStream)new FileInputStream(file));
                bomIs.skipBOM();
                bufferedReader = new BufferedReader(new InputStreamReader((InputStream)bomIs, charset));
            } else {
                bufferedReader = new BufferedReader(new InputStreamReader((InputStream)new FileInputStream(file), charset));
            }
            String line = null;
            while ((line = bufferedReader.readLine()) != null && line.trim().isEmpty()) {
            }
            String string = line;
            return string;
        }
        catch (UnsupportedEncodingException e) {
            throw e;
        }
        catch (Exception e) {
            throw new DSGECommonException((Throwable)e, e.getMessage());
        }
        finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                }
                catch (Exception e) {
                    throw new DSGECommonException((Throwable)e, e.getMessage());
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String readFileSemBom(File file) throws DSGECommonException {
        try {
            String conteudo;
            InputStream inputStream = null;
            conteudo = null;
            try {
                inputStream = IOHelper.getInputStreamUTF8SemBom((File)file);
                int length = (int)file.length();
                byte[] buffer = new byte[length];
                inputStream.read(buffer);
                if (buffer[length - 3] == 0 && buffer[length - 2] == 0 && buffer[length - 1] == 0) {
                    length -= 3;
                }
                conteudo = new String(buffer, 0, length, "UTF-8");
            }
            finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            return conteudo;
        }
        catch (IOException e) {
            throw new DSGECommonException((Throwable)e, e.getMessage());
        }
    }

    public static boolean verifyFile(String path, boolean create) {
        File file = new File(path);
        if (file.exists()) {
            if (!file.canWrite() || !file.canRead()) {
                return false;
            }
        } else if (create) {
            return file.mkdirs();
        }
        return true;
    }

    public static boolean delete(String path) {
        File file = new File(path);
        if (file.exists()) {
            if (!file.canWrite() || !file.canRead()) {
                return false;
            }
        } else {
            return false;
        }
        return file.delete();
    }
}

