package com.tracker.repositories;

import com.tracker.models.Family;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface FamilyRepository extends JpaRepository<Family, UUID> {

    // Find a Family by email
    Optional<Family> findByEmail(String email);

    // Find a Family by Familyname
    Optional<Family> findByFamilyname(String Familyname);

    // Check if a Family exists by email
    boolean existsByEmail(String email);

    // Check if a Family exists by Familyname
    boolean existsByFamilyname(String Familyname);

    // Delete a Family by email
    void deleteByEmail(String email);
}

