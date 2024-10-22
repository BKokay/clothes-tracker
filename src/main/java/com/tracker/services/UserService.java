package com.tracker.services;

import com.tracker.models.Child;
import com.tracker.models.ClothingItem;
import com.tracker.models.User;
import com.tracker.repositories.ChildRepository;
import com.tracker.repositories.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ChildRepository childRepository;

    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found with ID: " + id));
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new EntityNotFoundException("User not found with email: " + email));
    }

    public User findByUsername(String username){
        return userRepository.findByUsername(username).orElseThrow(() -> new EntityNotFoundException("User not found with username: " + username));
    }

    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    public boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }

    public void deleteByEmail(String email) {
        try {
            userRepository.deleteByEmail(email);
        } catch (EmptyResultDataAccessException e) {
            //add logging here

        }
    }

    public List<ClothingItem> getAllClothingItemsForUser(Long userId) {
        List<Child> children = childRepository.findByParent(userId);  // Get all children for the user
        List<ClothingItem> allClothingItems = new ArrayList<>();

        // Loop through each child and collect their clothing items
        for (Child child : children) {
            allClothingItems.addAll(child.getClothingItems());
        }

        return allClothingItems;
    }

}
