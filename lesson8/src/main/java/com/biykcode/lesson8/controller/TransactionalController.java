package com.biykcode.lesson8.controller;

import com.biykcode.lesson8.entity.Person;
import com.biykcode.lesson8.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionalController {

    @Autowired
    private PersonService personService;

    @GetMapping("/rollback")
    public Person rollback(@RequestParam("name") String name, @RequestParam("address") String address, @RequestParam("age") Integer age) {
        return personService.savePersonWithRollBack(new Person(null, name, age, address));
    }

    @GetMapping("/noRollback")
    public Person noRollback(@RequestParam("name") String name, @RequestParam("address") String address, @RequestParam("age") Integer age) {
        return personService.savePersonWithoutRollBack(new Person(null, name, age, address));
    }

}
