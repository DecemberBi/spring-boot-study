package com.biykcode.demo2;

import com.biykcode.demo2.taskexecutor.AsyncService;
import com.biykcode.demo2.taskexecutor.TaskExecutorConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncService asyncService = context.getBean(AsyncService.class);
        for (int i = 0; i < 10; i++) {
            asyncService.executeAsyncTask(i);
            asyncService.executeAsyncTaskPlus(i);
        }
        context.close();
    }
}
