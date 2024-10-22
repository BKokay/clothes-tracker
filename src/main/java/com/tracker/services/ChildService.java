package com.tracker.services;

import com.tracker.models.Child;
import com.tracker.models.User;
import com.tracker.repositories.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildService {

    @Autowired
    ChildRepository childRepository;

    public List<Child> getChildrenForUser(Long userId) {
        return childRepository.findByParent(userId);
    }
}
