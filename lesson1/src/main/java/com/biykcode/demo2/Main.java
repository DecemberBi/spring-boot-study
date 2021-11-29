package com.biykcode.demo2;

import com.biykcode.demo2.config.JavaConfig;
import com.biykcode.demo2.service.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        String world = useFunctionService.SayHello("World");
        System.out.println(world);
        context.close();
    }
}
