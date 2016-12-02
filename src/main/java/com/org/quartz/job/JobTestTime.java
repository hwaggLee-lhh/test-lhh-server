package com.org.quartz.job;

import com.org.quartz.base.BaseJobQuartz;

public class JobTestTime extends BaseJobQuartz {
    
    public static String date ="";//对about.jsp提供
    
	public void start() {
		System.out.println("来了.."+getJobGroupName()+":"+getTriggerGroupName());
	}
}
