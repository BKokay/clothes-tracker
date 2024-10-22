package com.tracker.repositories;

import com.tracker.models.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tracker.models.User;
import java.util.List;

public interface ChildRepository extends JpaRepository<Child, Long> {

    // Find all children for a specific parent
    List<Child> findByParent(Long userId);

    // Find a child by name and parent
    Child findByParentAndName(User parent, String name);

    // Find all children of a specific gender for a parent
    List<Child> findByParentAndGender(User parent, String gender);

    // Count the number of children for a parent
    Integer countByParent(User parent);

    // Check if a child exists for a parent by name
    boolean existsByParentAndName(User parent, String name);

    // Delete a child by name and parent
    void deleteByParentAndName(User parent, String name);
}

