package com.tracker.services;

import com.tracker.models.Person;
import com.tracker.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public List<Person> getPeopleForFamily(UUID familyId) {
        return personRepository.findByFamily(familyId);
    }
}
