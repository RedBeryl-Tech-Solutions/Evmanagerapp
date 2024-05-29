package com.mycompany.myapp.config;

import com.mycompany.myapp.service.NotificationService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class EmailJob implements Job {

    private final NotificationService notificationService;

    public EmailJob(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException{
        try {
            notificationService.sendScheduledEmail();
        } catch (Exception e) {
            throw new JobExecutionException("Error executing scheduled email job", e);
        }
    }
}



