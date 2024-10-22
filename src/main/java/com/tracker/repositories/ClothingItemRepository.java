package com.tracker.repositories;

import com.tracker.models.Child;
import com.tracker.models.ClothingItem;
import com.tracker.models.User;
import com.tracker.models.enums.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClothingItemRepository extends JpaRepository<ClothingItem, Long> {
    // Parent: find by child
    List<ClothingItem> findByUserAndChild(User user, Child child);

    // Parent: find by child and size
    List<ClothingItem> findByUserAndChildAndSize(User user, Child child, Size size);

    // Parent: find by child, size, season
    List<ClothingItem> findByUserAndChildAndSizeAndSeason(User user, Child child, Size size, Season season);

    // Parent: find by child, size, type
    List<ClothingItem> findByUserAndChildAndSizeAndType(User user, Child child, Size size, Type type);

    // Parent: count by child, size, season, type
    Integer countByUserAndChildAndSizeAndSeasonAndType(User user, Child child, Size size, Season season, Type type);

    // Parent: count by child, size, type
    Integer countByUserAndChildAndSizeAndType(User user, Child child, Size size, Type type);

    // Parent: find by child and condition
    List<ClothingItem> findByUserAndChildAndCondition(User user, Child child, Condition condition);

    // Parent: find by child, size, and condition
    List<ClothingItem> findByUserAndChildAndSizeAndCondition(User user, Child child, Size size, Condition condition);

    // Parent: find by child, size, season, and condition
    List<ClothingItem> findByUserAndChildAndSizeAndSeasonAndCondition(User user, Child child, Size size, Season season, Condition condition);

    // Parent: count by child, size, season, type, and condition
    Integer countByUserAndChildAndSizeAndSeasonAndTypeAndCondition(User user, Child child, Size size, Season season, Type type, Condition condition);

    // Basement: find by user
    List<ClothingItem> findByUserAndArchived(User user, boolean archived);

    // Basement: find by user and size
    List<ClothingItem> findByUserAndArchivedAndSize(User user, boolean archived, Size size);

    // Basement: find by user, size, season
    List<ClothingItem> findByUserAndArchivedAndSizeAndSeason(User user, boolean archived, Size size, Season season);

    // Basement: find by user, size, season, type
    List<ClothingItem> findByUserAndArchivedAndSizeAndSeasonAndType(User user, boolean archived, Size size, Season season, Type type);

    // Basement: find by user, size, gender
    List<ClothingItem> findByUserAndArchivedAndSizeAndGender(User user, boolean archived, Size size, Gender gender);

    // Basement: find by user, size, gender, season
    List<ClothingItem> findByUserAndArchivedAndSizeAndGenderAndSeason(User user, boolean archived, Size size, Gender gender, Season season);

    // Basement: find by user, size, gender, type
    List<ClothingItem> findByUserAndArchivedAndSizeAndGenderAndType(User user, boolean archived, Size size, Gender gender, Type type);

    // Basement: count by user, size, gender, type, season
    Integer countByUserAndArchivedAndSizeAndGenderAndTypeAndSeason(User user, boolean archived, Size size, Gender gender, Type type, Season season);

    // Basement: count by user, size, gender, type
    Integer countByUserAndArchivedAndSizeAndGenderAndType(User user, boolean archived, Size size, Gender gender, Type type);

    // Basement: count by user, size, type, season
    Integer countByUserAndArchivedAndSizeAndTypeAndSeason(User user, boolean archived, Size size, Type type, Season season);

    // Basement: count by user, size, type
    Integer countByUserAndArchivedAndSizeAndType(User user, boolean archived, Size size, Type type);

    // Basement: find by user, archived, and condition
    List<ClothingItem> findByUserAndArchivedAndCondition(User user, boolean archived, Condition condition);

    // Basement: find by user, archived, size, and condition
    List<ClothingItem> findByUserAndArchivedAndSizeAndCondition(User user, boolean archived, Size size, Condition condition);

    // Basement: find by user, archived, size, season, and condition
    List<ClothingItem> findByUserAndArchivedAndSizeAndSeasonAndCondition(User user, boolean archived, Size size, Season season, Condition condition);

    // Basement: find by user, archived, size, gender, and condition
    List<ClothingItem> findByUserAndArchivedAndSizeAndGenderAndCondition(User user, boolean archived, Size size, Gender gender, Condition condition);

    // Basement: count by user, archived, size, type, season, and condition
    Integer countByUserAndArchivedAndSizeAndTypeAndSeasonAndCondition(User user, boolean archived, Size size, Type type, Season season, Condition condition);

    // Basement: count by user, archived, size, type, and condition
    Integer countByUserAndArchivedAndSizeAndTypeAndCondition(User user, boolean archived, Size size, Type type, Condition condition);

}
