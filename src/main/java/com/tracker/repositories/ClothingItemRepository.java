package com.tracker.repositories;

import com.tracker.models.Person;
import com.tracker.models.ClothingItem;
import com.tracker.models.Family;
import com.tracker.models.enums.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ClothingItemRepository extends JpaRepository<ClothingItem, UUID> {
    // Parent: find by child
    List<ClothingItem> findByFamilyAndChild(Family Family, Person person);

    // Parent: find by child and size
    List<ClothingItem> findByFamilyAndChildAndSize(Family Family, Person person, Size size);

    // Parent: find by child, size, season
    List<ClothingItem> findByFamilyAndChildAndSizeAndSeason(Family Family, Person person, Size size, Season season);

    // Parent: find by child, size, type
    List<ClothingItem> findByFamilyAndChildAndSizeAndType(Family Family, Person person, Size size, Type type);

    // Parent: count by child, size, season, type
    Integer countByFamilyAndChildAndSizeAndSeasonAndType(Family Family, Person person, Size size, Season season, Type type);

    // Parent: count by child, size, type
    Integer countByFamilyAndChildAndSizeAndType(Family Family, Person person, Size size, Type type);

    // Parent: find by child and condition
    List<ClothingItem> findByFamilyAndChildAndCondition(Family Family, Person person, Condition condition);

    // Parent: find by child, size, and condition
    List<ClothingItem> findByFamilyAndChildAndSizeAndCondition(Family Family, Person person, Size size, Condition condition);

    // Parent: find by child, size, season, and condition
    List<ClothingItem> findByFamilyAndChildAndSizeAndSeasonAndCondition(Family Family, Person person, Size size, Season season, Condition condition);

    // Parent: count by child, size, season, type, and condition
    Integer countByFamilyAndChildAndSizeAndSeasonAndTypeAndCondition(Family Family, Person person, Size size, Season season, Type type, Condition condition);

    // Basement: find by Family
    List<ClothingItem> findByFamilyAndArchived(Family Family, boolean archived);

    // Basement: find by Family and size
    List<ClothingItem> findByFamilyAndArchivedAndSize(Family Family, boolean archived, Size size);

    // Basement: find by Family, size, season
    List<ClothingItem> findByFamilyAndArchivedAndSizeAndSeason(Family Family, boolean archived, Size size, Season season);

    // Basement: find by Family, size, season, type
    List<ClothingItem> findByFamilyAndArchivedAndSizeAndSeasonAndType(Family Family, boolean archived, Size size, Season season, Type type);

    // Basement: find by Family, size, gender
    List<ClothingItem> findByFamilyAndArchivedAndSizeAndGender(Family Family, boolean archived, Size size, Gender gender);

    // Basement: find by Family, size, gender, season
    List<ClothingItem> findByFamilyAndArchivedAndSizeAndGenderAndSeason(Family Family, boolean archived, Size size, Gender gender, Season season);

    // Basement: find by Family, size, gender, type
    List<ClothingItem> findByFamilyAndArchivedAndSizeAndGenderAndType(Family Family, boolean archived, Size size, Gender gender, Type type);

    // Basement: count by Family, size, gender, type, season
    Integer countByFamilyAndArchivedAndSizeAndGenderAndTypeAndSeason(Family Family, boolean archived, Size size, Gender gender, Type type, Season season);

    // Basement: count by Family, size, gender, type
    Integer countByFamilyAndArchivedAndSizeAndGenderAndType(Family Family, boolean archived, Size size, Gender gender, Type type);

    // Basement: count by Family, size, type, season
    Integer countByFamilyAndArchivedAndSizeAndTypeAndSeason(Family Family, boolean archived, Size size, Type type, Season season);

    // Basement: count by Family, size, type
    Integer countByFamilyAndArchivedAndSizeAndType(Family Family, boolean archived, Size size, Type type);

    // Basement: find by Family, archived, and condition
    List<ClothingItem> findByFamilyAndArchivedAndCondition(Family Family, boolean archived, Condition condition);

    // Basement: find by Family, archived, size, and condition
    List<ClothingItem> findByFamilyAndArchivedAndSizeAndCondition(Family Family, boolean archived, Size size, Condition condition);

    // Basement: find by Family, archived, size, season, and condition
    List<ClothingItem> findByFamilyAndArchivedAndSizeAndSeasonAndCondition(Family Family, boolean archived, Size size, Season season, Condition condition);

    // Basement: find by Family, archived, size, gender, and condition
    List<ClothingItem> findByFamilyAndArchivedAndSizeAndGenderAndCondition(Family Family, boolean archived, Size size, Gender gender, Condition condition);

    // Basement: count by Family, archived, size, type, season, and condition
    Integer countByFamilyAndArchivedAndSizeAndTypeAndSeasonAndCondition(Family Family, boolean archived, Size size, Type type, Season season, Condition condition);

    // Basement: count by Family, archived, size, type, and condition
    Integer countByFamilyAndArchivedAndSizeAndTypeAndCondition(Family Family, boolean archived, Size size, Type type, Condition condition);

}
