package com.tracker.services;

import com.tracker.models.Person;
import com.tracker.models.ClothingItem;
import com.tracker.models.Family;
import com.tracker.repositories.PersonRepository;
import com.tracker.repositories.FamilyRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class FamilyService {

    @Autowired
    private FamilyRepository familyRepository;

    @Autowired
    private PersonRepository personRepository;

    public Family findById(UUID id) {
        return familyRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Family not found with ID: " + id));
    }

    public Family findByEmail(String email) {
        return familyRepository.findByEmail(email)
                .orElseThrow(() -> new EntityNotFoundException("Family not found with email: " + email));
    }

    public Family findByFamilyname(String Familyname){
        return familyRepository.findByFamilyname(Familyname).orElseThrow(() -> new EntityNotFoundException("Family not found with Familyname: " + Familyname));
    }

    public boolean existsByEmail(String email) {
        return familyRepository.existsByEmail(email);
    }

    public boolean existsByFamilyname(String Familyname) {
        return familyRepository.existsByFamilyname(Familyname);
    }

    public void deleteByEmail(String email) {
        try {
            familyRepository.deleteByEmail(email);
        } catch (EmptyResultDataAccessException e) {
            //add logging here

        }
    }

    public List<ClothingItem> getAllClothingItemsForFamily(UUID FamilyId) {
        List<Person> people = personRepository.findByFamily(FamilyId);  // Get all children for the Family
        List<ClothingItem> allClothingItems = new ArrayList<>();

        // Loop through each child and collect their clothing items
        for (Person person : people) {
            allClothingItems.addAll(person.getClothingItems());
        }

        return allClothingItems;
    }

}
