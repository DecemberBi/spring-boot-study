package com.biykcode.demo3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.biykcode.demo3.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
