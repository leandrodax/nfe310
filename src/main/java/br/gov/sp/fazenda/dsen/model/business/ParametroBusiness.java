/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ParametroEnum
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.model.business.ParametroBusiness
 *  br.gov.sp.fazenda.dsen.model.business.ParametroBusiness$1
 *  br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter
 *  br.gov.sp.fazenda.dsen.model.dao.ParametroDAO
 *  br.gov.sp.fazenda.dsen.model.entity.ParametrosEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENConverterException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 */
package br.gov.sp.fazenda.dsen.model.business;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ParametroEnum;
import br.gov.sp.fazenda.dsen.common.to.ParametroTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.model.business.ParametroBusiness;
import br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter;
import br.gov.sp.fazenda.dsen.model.dao.ParametroDAO;
import br.gov.sp.fazenda.dsen.model.entity.ParametrosEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.exception.DSENConverterException;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ParametroBusiness {
    private static final int a = 10;
    private static final int b = 600;
    private static final int c = 10;
    private static final int d = 600;
    private static final int e = 1;
    private static final int f = 10000;
    private ParametroDAO a = new ParametroDAO();

    private boolean a(List<ParametroTO> list) throws DSENBusinessException {
        boolean ok = true;
        for (ParametroTO p : list) {
            if (this.a(p)) continue;
            ok = false;
        }
        return ok;
    }

    private boolean a(ParametroTO parametro) throws DSENBusinessException {
        boolean isValid = true;
        try {
            String valor = parametro.getValor();
            if (parametro.getParametrosEnum() == ParametroEnum.INTERVALO_CONSULTA) {
                if (StringHelper.isBlankOrNull((Object)valor)) {
                    isValid = false;
                    parametro.addError(DSENMessageConstants.PARAMETRO_INTERVALO_CONSULTA_REQUIRED);
                } else if (Integer.parseInt(valor) < 10 || Integer.parseInt(valor) > 600) {
                    isValid = false;
                    parametro.addError(DSENMessageConstants.replacePatterns((String)DSENMessageConstants.PARAMETRO_INTERVALO_CONSULTA_OUTRANGE, (String[])new String[]{String.valueOf(10), String.valueOf(600)}));
                }
            }
            if (parametro.getParametrosEnum() == ParametroEnum.INTERVALO_TRANSMISSAO) {
                if (StringHelper.isBlankOrNull((Object)valor)) {
                    isValid = false;
                    parametro.addError(DSENMessageConstants.PARAMETRO_INTERVALO_TRANSMISSAO_REQUIRED);
                } else if (Integer.parseInt(valor) < 10 || Integer.parseInt(valor) > 600) {
                    isValid = false;
                    parametro.addError(DSENMessageConstants.replacePatterns((String)DSENMessageConstants.PARAMETRO_INTERVALO_TRANSMISSAO_OUTRANGE, (String[])new String[]{String.valueOf(10), String.valueOf(600)}));
                }
            }
            if (parametro.getParametrosEnum() == ParametroEnum.NUM_REGISTROS_PAGINA) {
                if (StringHelper.isBlankOrNull((Object)valor)) {
                    isValid = false;
                    parametro.addError(DSENMessageConstants.PARAMETRO_NUM_REGISTROS_PAGINA_REQUIRED);
                } else if (Integer.parseInt(valor) < 1 || Integer.parseInt(valor) > 10000) {
                    isValid = false;
                    parametro.addError(DSENMessageConstants.replacePatterns((String)DSENMessageConstants.PARAMETRO_NUM_REGISTROS_PAGINA_OUTRANGE, (String[])new String[]{String.valueOf(1), String.valueOf(10000)}));
                }
            }
        }
        catch (NumberFormatException ex) {
            throw new DSENBusinessException((Throwable)ex, ex.getMessage());
        }
        catch (Exception ex) {
            throw new DSENBusinessException((Throwable)ex, ex.getMessage());
        }
        return isValid;
    }

    public List<ParametroTO> selectParametros() throws DSENBusinessException {
        List listaParametros = null;
        List listaEntitys = null;
        try {
            listaEntitys = this.a.selectParametros();
            listaParametros = DSENBusinessConverter.converteListaParametro((List)listaEntitys);
        }
        catch (DSENDAOException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSENConverterException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        return listaParametros;
    }

    @DSGETransaction
    public List<ParametroTO> updateParametros(List<ParametroTO> listaParametros) throws DSENBusinessException {
        if (this.a(listaParametros)) {
            try {
                Iterator<ParametroTO> i$ = listaParametros.iterator();
                while (i$.hasNext()) {
                    ParametroTO parametro = i$.next();
                    parametro = this.a(parametro);
                }
            }
            catch (DSENBusinessException ex) {
                throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
            }
        }
        return listaParametros;
    }

    private ParametroTO a(ParametroTO parametroTO) throws DSENBusinessException {
        try {
            ParametrosEntity entity = DSENBusinessConverter.getParametrosEntity((ParametroTO)parametroTO);
            entity = (ParametrosEntity)this.a.update((Serializable)entity);
            parametroTO.addMessage(DSENMessageConstants.PARAMETRO_UPDATED_SUCCESSFUL);
            this.a(parametroTO);
        }
        catch (DSGEDAOException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        return parametroTO;
    }

    private void a(ParametroTO parametroTO) {
        switch (1.a[parametroTO.getParametrosEnum().ordinal()]) {
            case 1: {
                AppContext.getInstance().setTO((EnumItf)AppContextEnum.PARAMETRO_PORTA_PROXY, (BaseTO)parametroTO);
                break;
            }
            case 2: {
                AppContext.getInstance().setTO((EnumItf)AppContextEnum.PARAMETRO_SENHA_PROXY, (BaseTO)parametroTO);
                break;
            }
            case 3: {
                AppContext.getInstance().setTO((EnumItf)AppContextEnum.PARAMETRO_PROXY_SERVIDOR, (BaseTO)parametroTO);
                break;
            }
            case 4: {
                AppContext.getInstance().setTO((EnumItf)AppContextEnum.PARAMETRO_USUARIO_PROXY, (BaseTO)parametroTO);
                break;
            }
            case 5: {
                AppContext.getInstance().setTO((EnumItf)AppContextEnum.PARAMETRO_AVISO_INUTILIZACAO_APENAS_MENSAL, (BaseTO)parametroTO);
                break;
            }
            case 6: {
                AppContext.getInstance().setTO((EnumItf)AppContextEnum.PARAMETRO_INTERV_CONS_PROC_PEND, (BaseTO)parametroTO);
                break;
            }
            case 7: {
                AppContext.getInstance().setTO((EnumItf)AppContextEnum.PARAMETRO_INTERV_TENT_TRANSM, (BaseTO)parametroTO);
                break;
            }
            case 8: {
                AppContext.getInstance().setTO((EnumItf)AppContextEnum.PARAMETRO_NUM_REG_POR_PAG_CONSULTA, (BaseTO)parametroTO);
                break;
            }
            case 9: {
                AppContext.getInstance().setTO((EnumItf)AppContextEnum.PARAMETRO_DPEC_GERADO_DIR, (BaseTO)parametroTO);
                break;
            }
            case 10: {
                AppContext.getInstance().setTO((EnumItf)AppContextEnum.PARAMETRO_DPEC_AUTORIZADO_DIR, (BaseTO)parametroTO);
            }
        }
    }

    private ParametroTO b(ParametroTO parametroTO) throws DSENBusinessException {
        if (this.a(parametroTO)) {
            try {
                ParametrosEntity entity = DSENBusinessConverter.getParametrosEntity((ParametroTO)parametroTO);
                this.a.insert((Serializable)entity);
                parametroTO.addMessage(DSENMessageConstants.PARAMETRO_UPDATED_SUCCESSFUL);
                this.a(parametroTO);
            }
            catch (DSGEDAOException ex) {
                throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
            }
            catch (DSENConverterException e) {
                throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
            }
        }
        return parametroTO;
    }

    @DSGETransaction
    public void carregaParametrosAppContext() throws DSENBusinessException {
        try {
            ArrayList<ParametroTO> listaParametros = new ArrayList<ParametroTO>();
            List pesquisa = this.selectParametros();
            if (pesquisa != null) {
                listaParametros.addAll(pesquisa);
            }
            ParametroEnum[] values = ParametroEnum.values();
            for (int i = 0; i < values.length; ++i) {
                ParametroTO parametro = new ParametroTO(values[i], values[i].getDefaultValue());
                if (listaParametros.contains((Object)parametro)) continue;
                parametro = this.b(parametro);
                listaParametros.add(parametro);
            }
            for (ParametroTO param : listaParametros) {
                this.a(param);
            }
        }
        catch (DSENBusinessException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
    }
}

