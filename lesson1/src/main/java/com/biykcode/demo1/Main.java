package com.biykcode.demo1;

import com.biykcode.demo1.config.DiConfig;
import com.biykcode.demo1.service.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.SayHello("world"));
        context.close();
    }
}
