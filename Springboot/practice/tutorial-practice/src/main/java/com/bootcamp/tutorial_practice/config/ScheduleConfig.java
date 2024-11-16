package com.bootcamp.tutorial_practice.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component // Config / scheduler manager
public class ScheduleConfig {
    // do sth every xxx day
    @Scheduled (fixedDelay = 5000) // 5000 ms = 5 s
    public void sayHello(){
        System.out.println("Tastk A: Hello World!, time = " + System.currentTimeMillis());
    };
    @Scheduled (fixedRate = 3000) 
    public void sayGoodbye() throws Exception{
        System.out.println("Tastk B: Bye, start time = " + System.currentTimeMillis());
        Thread.sleep(2000);
        System.out.println("Tastk B: Bye, end time = " + System.currentTimeMillis());
    };

    @Scheduled (cron = "0 56 20 * * TUE")
    public void runTask(){
        System.out.println("run!");
    }

}
