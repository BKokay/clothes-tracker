package com.tracker.controllers;

import com.tracker.models.Child;
import com.tracker.models.ClothingItem;
import com.tracker.models.User;
import com.tracker.services.ChildService;
import com.tracker.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    ChildService childService;

    // Get all children for a specific user
    @GetMapping("/{userId}/children")
    public List<Child> getChildrenForUser(@PathVariable Long userId) {
        return childService.getChildrenForUser(userId);
    }

    // Get all clothing items for all children of a specific user
    @GetMapping("/{userId}/clothing-items")
    public List<ClothingItem> getAllClothingItemsForUser(@PathVariable Long userId) {
        return userService.getAllClothingItemsForUser(userId);
    }
}
