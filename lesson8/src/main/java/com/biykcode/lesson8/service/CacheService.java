package com.biykcode.lesson8.service;

import com.biykcode.lesson8.dao.PersonRepository;
import com.biykcode.lesson8.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheService {

    @Autowired
    private PersonRepository personRepository;

    @CachePut(value = "people", key = "#person.id")
    public Person save(Person person) {
        Person p = personRepository.save(person);
        System.out.println("cache put " + p.getId() + " to cache");
        return p;
    }

    @CacheEvict(value = "people")
    public void remove(Long id) {
        System.out.println("remove " + id + " from cache");
        personRepository.deleteById(id);
    }

    @Cacheable(value = "people", key = "#id")
    public Person findOne(Long id) {
        Person p = personRepository.findById(id).orElse(new Person());
        System.out.println("cache able put " + p.getId() + " to cache");
        return p;
    }

}
