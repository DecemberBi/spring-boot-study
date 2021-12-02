package com.biykcode.demo3.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class ScheduledTaskService {

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔5秒执行一次" + LocalTime.now().toString());
    }

    @Scheduled(cron = "0 49 21 * * ?")
    public void fixTimeExecution() {
        System.out.println("在指定时间执行" + LocalTime.now().toString());
    }
}
