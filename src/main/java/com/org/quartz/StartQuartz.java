package com.org.quartz;

import java.text.ParseException;

import org.quartz.SchedulerException;

import com.org.quartz.job.JobTestTime;

public class StartQuartz {

	public static void main(String[] args) throws Exception  {
		startJobTestTime();
	}
	
	
	//测试schedule_time的使用
	public static void startJobTestTime() throws SchedulerException, ParseException{
		new JobTestTime().init();
	}
}
