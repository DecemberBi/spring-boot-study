package com.biykcode.lesson8.service;

import com.biykcode.lesson8.dao.PersonRepository;
import com.biykcode.lesson8.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Transactional(rollbackFor = {IllegalArgumentException.class})
    public Person savePersonWithRollBack(Person person) {
        Person p = personRepository.save(person);
        if (person.getName().equals("biykcode")) {
            throw new IllegalArgumentException("biykcode exist, data will rollback");
        }
        return p;
    }

    @Transactional(noRollbackFor = {IllegalArgumentException.class})
    public Person savePersonWithoutRollBack(Person person) {
        Person p = personRepository.save(person);
        if (person.getName().equals("biykcode")) {
            throw new IllegalArgumentException("biykcode exist, data will not rollback");
        }
        return p;
    }
}
