package com.org.quartz.base;

import java.text.ParseException;

import org.apache.commons.lang.StringUtils;
import org.quartz.CronTrigger;
import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

import com.hwaggLee.utils.UtilsUUID;
 
/**
 * 父基类
 * @author huage
 *
 */
public abstract class BaseJobQuartz implements Job{
	public abstract void start();
	
	public void execute(JobExecutionContext context) throws JobExecutionException {
        this.start();
	}
	public Scheduler init() throws SchedulerException, ParseException{
		return initJobScheduler();
	}
	
	/**
	 * 任务团体（默认uuid生成）
	 * @return
	 */
	public String getJobGroupName(){
		if(StringUtils.isBlank(jobGroupName)){
			jobGroupName = UtilsUUID.getUUID();
		}
		return jobGroupName;
	}
	
	/**
	 * 分组触发器组任务（默认使用uuid生成）
	 * @return
	 */
	public String getTriggerGroupName(){
		if(StringUtils.isBlank(triggerGroupName)){
			triggerGroupName = UtilsUUID.getUUID();
		}
		return triggerGroupName;
	}
	

	/**
	 * 任务名称（默认使用类文件）
	 * @return
	 */
	public String getJobName(){
		if(StringUtils.isBlank(time)){
			jobName = this.getClass().getName();
		}
		return jobName;
	}

	/**
	 * 默认1秒钟跑一次
	 * @return
	 */
	public String getTime(){
		if(StringUtils.isBlank(time)){
			time = "0/1 * * * * ?";
		}
		return time;
	}
	
	private String jobName, time, jobGroupName, triggerGroupName;
	
	
    /**
     * 初始化定时任务
     * @param jobName
     * @param job
     * @param time
     * @param jobGroupName
     * @param triggerGroupName
     * @return
     * @throws SchedulerException
     * @throws ParseException
     */
    protected Scheduler initJobScheduler() throws SchedulerException, ParseException {
        Scheduler sched = new StdSchedulerFactory().getScheduler();
        JobDetail jobDetail = new JobDetail(getJobGroupName(), getTriggerGroupName(), this.getClass());// 任务名，任务组，任务执行类
        // 触发器
        CronTrigger trigger = new CronTrigger(getJobName(), getTriggerGroupName());// 触发器名,触发器组
        trigger.setCronExpression(getTime());// 触发器时间设定
        sched.scheduleJob(jobDetail, trigger);
        // 启动
        if (!sched.isShutdown()) sched.start();
        return sched;
    }
}
