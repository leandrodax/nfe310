/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.model.scheduler.DSGEBaseJobListener
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 *  org.quartz.JobExecutionContext
 *  org.quartz.JobExecutionException
 *  org.quartz.JobListener
 *  org.quartz.Scheduler
 *  org.quartz.SchedulerException
 */
package br.gov.sp.fazenda.dsge.model.scheduler;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;

public class DSGEBaseJobListener
implements JobListener {
    protected static Log logger = LogFactory.getLog(DSGEBaseJobListener.class);

    public String getName() {
        return this.getClass().getSimpleName();
    }

    public void jobToBeExecuted(JobExecutionContext arg0) {
        try {
            logger.debug((Object)"Job: Inicio");
            arg0.getScheduler().pauseAll();
        }
        catch (SchedulerException schedulerException) {
            // empty catch block
        }
    }

    public void jobWasExecuted(JobExecutionContext jobContext, JobExecutionException exception) {
        try {
            logger.debug((Object)"Job: Fim");
            if (!jobContext.getScheduler().isShutdown()) {
                jobContext.getScheduler().resumeAll();
            }
        }
        catch (SchedulerException schedulerException) {
            // empty catch block
        }
    }

    public void jobExecutionVetoed(JobExecutionContext jobContext) {
    }
}

