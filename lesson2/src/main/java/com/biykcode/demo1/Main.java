package com.biykcode.demo1;

import com.biykcode.demo1.config.ScopeConfig;
import com.biykcode.demo1.service.PrototypeService;
import com.biykcode.demo1.service.SingletonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        SingletonService s1 = context.getBean(SingletonService.class);
        SingletonService s2 = context.getBean(SingletonService.class);

        PrototypeService p1 = context.getBean(PrototypeService.class);
        PrototypeService p2 = context.getBean(PrototypeService.class);

        System.out.println("s1 与 s2 是否相等：" + s1.equals(s2));
        System.out.println("s1 与 s2 是否相等：" + (s1 == s2));
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        System.out.println("p1 与 p2 是否相等：" + p1.equals(p2));
        System.out.println("p1 与 p2 是否相等：" + (p1 == p2));
        System.out.println("p1 =" + p1);
        System.out.println("p2 =" + p2);

        context.close();
    }
}
