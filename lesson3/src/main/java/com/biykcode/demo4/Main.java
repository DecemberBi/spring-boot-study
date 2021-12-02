package com.biykcode.demo4;

import com.biykcode.demo4.conditional.ListService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        String listCmd = listService.showListCmd();

        System.out.println(context.getEnvironment().getProperty("os.name") + " 系统下的列表命令为：" + listCmd);

        context.close();
    }
}
