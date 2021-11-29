package com.biykcode.demo3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.biykcode.demo3")
@EnableAspectJAutoProxy
public class AopConfig {
}
