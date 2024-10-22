package com.tracker.repositories;

import com.tracker.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tracker.models.Family;
import java.util.List;
import java.util.UUID;

public interface PersonRepository extends JpaRepository<Person, Long> {

    // Find all children for a specific Family
    List<Person> findByFamily(UUID FamilyId);

    // Find a child by name and Family
    Person findByFamilyAndName(Family Family, String name);

    // Find all children of a specific gender for a Family
    List<Person> findByFamilyAndGender(Family Family, String gender);

    // Count the number of children for a Family
    Integer countByFamily(Family Family);

    // Check if a child exists for a Family by name
    boolean existsByFamilyAndName(Family Family, String name);

    // Delete a child by name and Family
    void deleteByFamilyAndName(Family Family, String name);
}

