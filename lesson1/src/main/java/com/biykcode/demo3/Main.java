package com.biykcode.demo3;

import com.biykcode.demo3.service.DemoAnnotationService;
import com.biykcode.demo3.service.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        demoAnnotationService.add();

        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoMethodService.add();

        context.close();
    }
}
