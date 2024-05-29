//package com.mycompany.myapp.config;
//import com.mycompany.myapp.service.NotificationService;
//import org.quartz.JobDetail;
//import org.quartz.SimpleTrigger;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.quartz.JobDetailFactoryBean;
//import org.springframework.scheduling.quartz.SchedulerFactoryBean;
//import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;
//
//public class QuartzConfig {
//    private NotificationService notificationService;
//    @Bean
//    public JobDetailFactoryBean jobDetail() {
//        JobDetailFactoryBean factory = new JobDetailFactoryBean();
//        factory.setJobClass(EmailJob.class);
//        factory.setDurability(true);
//        factory.setBeanName("emailJob");
//        factory.getJobDataMap().put("notificationService", notificationService);
//        return factory;
//    }
//    @Bean
//    public SimpleTriggerFactoryBean trigger(JobDetail job) {
//        SimpleTriggerFactoryBean trigger = new SimpleTriggerFactoryBean();
//        trigger.setJobDetail(job);
//        trigger.setStartDelay(0);
//        trigger.setRepeatInterval(86400000); // Repeat every 24 hours (24 * 60 * 60 * 1000 milliseconds)
//        trigger.setRepeatCount(SimpleTrigger.REPEAT_INDEFINITELY);
//        return trigger;
//    }
//}
//
//
