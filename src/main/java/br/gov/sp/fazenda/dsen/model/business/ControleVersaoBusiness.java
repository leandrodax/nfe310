/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.business.ControleVersaoBusiness
 *  br.gov.sp.fazenda.dsen.model.dao.ControleVersaoDAO
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  org.apache.log4j.Logger
 */
package br.gov.sp.fazenda.dsen.model.business;

import br.gov.sp.fazenda.dsen.model.dao.ControleVersaoDAO;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import java.io.InputStream;
import java.text.MessageFormat;
import org.apache.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ControleVersaoBusiness {
    private ControleVersaoDAO a;
    private static final String a = "script/ScriptDSEN{0}.sql";
    private Logger a;

    public ControleVersaoBusiness() {
        this.a = Logger.getLogger(this.getClass());
    }

    public void verificarVersao() throws DSENBusinessException {
        boolean isUltimaVersao = false;
        while (!isUltimaVersao) {
            Integer versao = this.a();
            if (versao == null) {
                this.a();
                continue;
            }
            versao = versao + 1;
            isUltimaVersao = this.a(versao.intValue());
        }
    }

    private void a() throws DSENBusinessException {
        try {
            InputStream inputStream = this.getClass().getResourceAsStream(MessageFormat.format("script/ScriptDSEN{0}.sql", ""));
            this.a().executarScript(inputStream);
        }
        catch (Exception e) {
            this.a.error((Object)e.getMessage());
            throw new DSENBusinessException((Throwable)e, "Erro ao criar base de dados ");
        }
    }

    private boolean a(int numeroVersao) throws DSENBusinessException {
        try {
            InputStream inputStream = this.getClass().getResourceAsStream(MessageFormat.format("script/ScriptDSEN{0}.sql", numeroVersao));
            if (inputStream == null) {
                return true;
            }
            this.a().executarScript(inputStream);
        }
        catch (Exception e) {
            this.a.error((Object)e.getMessage());
            throw new DSENBusinessException((Throwable)e, "Erro ao atualizar a base de dados");
        }
        return false;
    }

    private Integer a() {
        try {
            return this.a().selectMaxNumeroVersao();
        }
        catch (DSENDAOException e) {
            return null;
        }
    }

    private ControleVersaoDAO a() {
        if (this.a == null) {
            this.a = new ControleVersaoDAO();
        }
        return this.a;
    }
}

