/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO
 *  br.gov.sp.fazenda.dsen.model.dao.util.DSENDAOHelper
 *  br.gov.sp.fazenda.dsge.model.dao.DSGEBaseDAO
 *  javax.persistence.EntityManager
 */
package br.gov.sp.fazenda.dsen.model.dao;

import br.gov.sp.fazenda.dsen.model.dao.util.DSENDAOHelper;
import br.gov.sp.fazenda.dsge.model.dao.DSGEBaseDAO;
import javax.persistence.EntityManager;

public class DSENBaseDAO
extends DSGEBaseDAO {
    protected EntityManager currentSession() {
        return DSENDAOHelper.currentSession();
    }
}

