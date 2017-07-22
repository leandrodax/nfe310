/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGECommonException
 *  br.gov.sp.fazenda.dsge.common.util.SerializacaoHelper
 *  org.apache.commons.codec.binary.Base64
 */
package br.gov.sp.fazenda.dsge.common.util;

import br.gov.sp.fazenda.dsge.common.exception.DSGECommonException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import org.apache.commons.codec.binary.Base64;

public class SerializacaoHelper {
    public static final String serializa(Serializable serializable) throws DSGECommonException {
        ObjectOutputStream objectOutputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            byte[] bytes = byteArrayOutputStream.toByteArray();
            Base64 base64 = new Base64();
            byte[] encoded = base64.encode(bytes);
            String string = new String(encoded);
            return string;
        }
        catch (IOException e) {
            throw new DSGECommonException((Throwable)e, e.getMessage());
        }
        finally {
            try {
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
            }
            catch (IOException iOException) {}
        }
    }

    public static final Serializable deserializa(String objetoSerializado) throws DSGECommonException {
        ObjectInputStream objectInputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            Base64 base64 = new Base64();
            byte[] decoded = base64.decode(objetoSerializado.getBytes());
            byteArrayInputStream = new ByteArrayInputStream(decoded);
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Serializable serializable = (Serializable)objectInputStream.readObject();
            return serializable;
        }
        catch (ClassNotFoundException e) {
            throw new DSGECommonException((Throwable)e, e.getMessage());
        }
        catch (IOException e) {
            throw new DSGECommonException((Throwable)e, e.getMessage());
        }
        finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            }
            catch (IOException iOException) {}
        }
    }
}

