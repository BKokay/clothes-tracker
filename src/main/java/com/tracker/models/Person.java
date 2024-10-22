package com.tracker.models;

import com.tracker.models.enums.ShoeSize;
import com.tracker.models.enums.Size;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "family_id", nullable = false)
    private Family family;  // Each child belongs to a specific family

    private String name;

    private String gender;

    private List<Size> clothingSize;

    private ShoeSize shoeSize;

    @OneToMany(mappedBy = "child", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ClothingItem> clothingItems;  // A child can have many clothing items

    // Constructors
    public Person() {}

    public Person(Family family, String name, String gender, List<Size> clothingSize, ShoeSize shoeSize, List<ClothingItem> clothingItems) {
        this.family = family;
        this.name = name;
        this.gender = gender;
        this.clothingSize = clothingSize;
        this.shoeSize = shoeSize;
        this.clothingItems = clothingItems;
    }


    // Getters and setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Family getParent() {
        return family;
    }

    public void setParent(Family parent) {
        this.family = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Size> getClothingSize() {
        return clothingSize;
    }

    public void setClothingSize(List<Size> clothingSize) {
        this.clothingSize = clothingSize;
    }

    public ShoeSize getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(ShoeSize shoeSize) {
        this.shoeSize = shoeSize;
    }

    public List<ClothingItem> getClothingItems() {
        return clothingItems;
    }

    public void setClothingItems(List<ClothingItem> clothingItems) {
        this.clothingItems = clothingItems;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", family=" + family +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", clothingSize=" + clothingSize +
                ", shoeSize=" + shoeSize +
                ", clothingItems=" + clothingItems +
                '}';
    }
}
