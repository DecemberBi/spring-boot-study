package com.biykcode.lesson8.controller;

import com.biykcode.lesson8.entity.Person;
import com.biykcode.lesson8.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {

    @Autowired
    private CacheService cacheService;

    @GetMapping("/put")
    public Person put(@RequestParam("name") String name, @RequestParam("address") String address, @RequestParam("age") Integer age) {
        return cacheService.save(new Person(null, name, age, address));
    }

    @GetMapping("/cacheable")
    public Person cacheable(@RequestParam("id") Long id) {
        return cacheService.findOne(id);
    }

    @GetMapping("/evit")
    public String evit(@RequestParam("id") Long id) {
        cacheService.remove(id);
        return "success";
    }

}
