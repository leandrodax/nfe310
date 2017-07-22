/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.model.scheduler.DSGEBaseScheduler
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 *  org.quartz.Job
 *  org.quartz.JobDetail
 *  org.quartz.JobListener
 *  org.quartz.Scheduler
 *  org.quartz.SchedulerContext
 *  org.quartz.SchedulerException
 *  org.quartz.SchedulerListener
 *  org.quartz.SchedulerMetaData
 *  org.quartz.SimpleTrigger
 *  org.quartz.Trigger
 *  org.quartz.impl.StdSchedulerFactory
 */
package br.gov.sp.fazenda.dsge.model.scheduler;

import java.util.Date;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobListener;
import org.quartz.Scheduler;
import org.quartz.SchedulerContext;
import org.quartz.SchedulerException;
import org.quartz.SchedulerListener;
import org.quartz.SchedulerMetaData;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

public abstract class DSGEBaseScheduler {
    private static Log a = LogFactory.getLog(DSGEBaseScheduler.class);

    protected abstract Class<? extends Job> getJobClass();

    protected abstract JobListener getJobListener();

    protected abstract SchedulerListener getSchedulerListener();

    public Scheduler init(long repeatInterval) throws SchedulerException {
        a.info((Object)"Iniciando SchedulerWebService");
        String jobClassName = this.getJobClass().getSimpleName();
        JobDetail job = new JobDetail(jobClassName, "JobGroup", this.getJobClass());
        SimpleTrigger trigger = new SimpleTrigger(jobClassName + "Trigger", "TriggerGroup", jobClassName, "JobGroup", new Date(), null, SimpleTrigger.REPEAT_INDEFINITELY, repeatInterval);
        StdSchedulerFactory sf = new StdSchedulerFactory();
        Scheduler scheduler = sf.getScheduler();
        if (this.getSchedulerListener() != null) {
            scheduler.addSchedulerListener(this.getSchedulerListener());
        }
        if (this.getJobListener() != null) {
            scheduler.addJobListener(this.getJobListener());
            job.addJobListener(this.getJobListener().getName());
        }
        Date ft = scheduler.scheduleJob(job, (Trigger)trigger);
        a.info((Object)(job.getFullName() + " will run at: " + ft + " and repeat: " + trigger.getRepeatCount() + " times, every " + trigger.getRepeatInterval() / 1000 + " seconds"));
        return scheduler;
    }

    public void start(Scheduler scheduler) {
        try {
            if (!scheduler.isStarted()) {
                scheduler.start();
                a.info((Object)"Scheduler started");
            }
        }
        catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    public void stop(Scheduler scheduler, boolean esperaProcessamento) {
        try {
            if (!scheduler.isShutdown()) {
                scheduler.shutdown(esperaProcessamento);
                a.info((Object)"Scheduler shutdown");
                SchedulerMetaData metaData = scheduler.getMetaData();
                a.info((Object)"-- Summary --");
                a.info((Object)("Executed " + metaData.numJobsExecuted() + " jobs on schedule " + metaData.getSchedulerName() + " since " + metaData.runningSince()));
            }
        }
        catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    public void put(Scheduler scheduler, String key, Object value) throws SchedulerException {
        scheduler.getContext().put((Object)key, value);
    }

    public Object get(Scheduler scheduler, String key) throws SchedulerException {
        return scheduler.getContext().get((Object)key);
    }

    public boolean isScheduled(Scheduler scheduler) throws SchedulerException {
        String jobClassName = this.getJobClass().getSimpleName();
        return scheduler.getTrigger(jobClassName + "Trigger", "TriggerGroup") != null;
    }
}

