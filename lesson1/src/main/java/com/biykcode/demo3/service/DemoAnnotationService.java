package com.biykcode.demo3.service;

import com.biykcode.demo3.annotation.Action;
import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void add() {
        System.out.println("add");
    }

}
