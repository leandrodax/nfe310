/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.log.DSGEDailyRollingFileAppender
 *  org.apache.log4j.RollingFileAppender
 */
package br.gov.sp.fazenda.dsge.log;

import java.io.File;
import java.io.IOException;
import org.apache.log4j.RollingFileAppender;

public class DSGEDailyRollingFileAppender
extends RollingFileAppender {
    public synchronized void setFile(String fileName, boolean append, boolean bufferedIO, int bufferSize) throws IOException {
        String[] pastas = fileName.split("/");
        File pasta = new File("/" + pastas[1]);
        if (!pasta.exists()) {
            pasta.mkdir();
        }
        if (!(pasta = new File("/" + pastas[1] + "/" + pastas[2])).exists()) {
            pasta.mkdir();
        }
        super.setFile(fileName, append, bufferedIO, bufferSize);
    }
}

