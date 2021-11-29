package com.biykcode.demo2.service;

public class UseFunctionService {

    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String SayHello(String world) {
        return functionService.sayHello(world);
    }
}
