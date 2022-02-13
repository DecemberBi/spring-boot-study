package com.biykcode.lesson8.controller;

import com.biykcode.lesson8.dao.PersonRepository;
import com.biykcode.lesson8.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/hello")
    public String hello() {
        return "hello world!";
    }

    @GetMapping("/save")
    public Person save(@RequestParam("name") String name, @RequestParam("address") String address, @RequestParam("age") Integer age) {
        return personRepository.save(new Person(null, name, age, address));
    }

    @GetMapping("/query1")
    public List<Person> query1(@RequestParam("address") String address) {
        List<Person> list = personRepository.findByAddress(address);
        return list;
    }

    @GetMapping("/query2")
    public Person query2(@RequestParam("name") String name, @RequestParam("address") String address) {
        Person p = personRepository.findByNameAndAddress(name, address);
        return p;
    }

    @GetMapping("/query3")
    public Person query3(@RequestParam("name") String name, @RequestParam("address") String address) {
        Person p = personRepository.withNameAndAddressQuery(name, address);
        return p;
    }

    @GetMapping("/query4")
    public Person query4(@RequestParam("name") String name, @RequestParam("address") String address) {
        Person p = personRepository.withNameAndAddressNamedQuery(name, address);
        return p;
    }

    @GetMapping("/sort")
    public List<Person> sort() {
        List<Person> list = personRepository.findAll(Sort.by(Sort.Direction.ASC, "age"));
        return list;
    }

    @GetMapping("/page")
    public Page<Person> page() {
        Page<Person> page = personRepository.findAll(PageRequest.of(1, 2));
        return page;
    }

}
