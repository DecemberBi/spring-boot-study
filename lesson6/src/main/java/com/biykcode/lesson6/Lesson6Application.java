package com.biykcode.lesson6;

import com.biykcode.lesson6.config.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Lesson6Application {


    @Autowired
    private AuthorSettings authorSettings;

    public static void main(String[] args) {
        SpringApplication.run(Lesson6Application.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return "author name is " + authorSettings.getName() + " and author age is " + authorSettings.getAge();
    }

}
