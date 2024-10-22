package com.tracker.controllers;

import com.tracker.models.Person;
import com.tracker.models.ClothingItem;
import com.tracker.services.PersonService;
import com.tracker.services.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/Families")
public class FamilyController {

    @Autowired
    FamilyService FamilyService;

    @Autowired
    PersonService personService;

    // Get all children for a specific Family
    @GetMapping("/{FamilyId}/people")
    public List<Person> getChildrenForFamily(@PathVariable UUID FamilyId) {
        return personService.getPeopleForFamily(FamilyId);
    }

    // Get all clothing items for all children of a specific Family
    @GetMapping("/{FamilyId}/clothing-items")
    public List<ClothingItem> getAllClothingItemsForFamily(@PathVariable UUID FamilyId) {
        return FamilyService.getAllClothingItemsForFamily(FamilyId);
    }
}
