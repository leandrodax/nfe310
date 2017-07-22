/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO$Status
 *  br.gov.sp.fazenda.dsen.model.business.importacao.Validacao
 *  br.gov.sp.fazenda.dsen.model.exception.DSENValidationException
 *  br.gov.sp.fazenda.dsge.common.to.Campo
 *  br.gov.sp.fazenda.dsge.common.to.Registro
 *  br.gov.sp.fazenda.dsge.common.to.TipoValidacao
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 */
package br.gov.sp.fazenda.dsen.model.business.importacao;

import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO;
import br.gov.sp.fazenda.dsen.model.exception.DSENValidationException;
import br.gov.sp.fazenda.dsge.common.to.Campo;
import br.gov.sp.fazenda.dsge.common.to.Registro;
import br.gov.sp.fazenda.dsge.common.to.TipoValidacao;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Validacao {
    private List<ImportacaoErroTO> a = new ArrayList();

    private void a(List<Registro> list) throws DSENValidationException {
        for (Registro registro : list) {
            for (Map.Entry entry : registro.getCampos().entrySet()) {
                this.a((Campo)entry.getValue(), registro.getLineNumber());
            }
            this.a(registro.getChildren());
        }
    }

    private void a(Campo campo, int lineNumber) throws DSENValidationException {
        for (TipoValidacao tipoValidacao : campo.getTipoValidacao()) {
            Class clazz = tipoValidacao.getTipoValidacao();
            try {
                Method method = clazz.getMethod("isValid", Object.class, Map.class);
                method.setAccessible(true);
                Object ret = method.invoke(clazz, campo.getValue(), tipoValidacao.getParameterMap());
                if (((Boolean)ret).booleanValue()) continue;
                this.a.add(new ImportacaoErroTO(campo.getNome(), tipoValidacao.getParameterValue("message") + (!StringHelper.isBlankOrNull((Object)campo.getValue()) ? new StringBuilder().append(": ").append(campo.getValue()).toString() : ""), tipoValidacao.getParameterValue("aviso") != null ? ImportacaoErroTO.Status.WARNING : ImportacaoErroTO.Status.ERROR));
            }
            catch (SecurityException e) {
                throw new DSENValidationException((Throwable)e, e.getMessage());
            }
            catch (NoSuchMethodException e) {
                throw new DSENValidationException((Throwable)e, e.getMessage());
            }
            catch (IllegalArgumentException e) {
                throw new DSENValidationException((Throwable)e, e.getMessage());
            }
            catch (IllegalAccessException e) {
                throw new DSENValidationException((Throwable)e, e.getMessage());
            }
            catch (InvocationTargetException e) {
                throw new DSENValidationException((Throwable)e, e.getMessage());
            }
        }
    }

    public List<ImportacaoErroTO> validar(Registro registroNfe, String versao) throws DSENValidationException {
        ArrayList<Registro> list = new ArrayList<Registro>();
        list.add(registroNfe);
        this.a(list);
        return this.a;
    }
}

