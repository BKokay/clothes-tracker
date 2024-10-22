package com.tracker.models;

import com.tracker.models.enums.*;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class ClothingItem {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "child_id", nullable = false)  // ClothingItem beUUIDs to a specific person
    private Person person;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)  
    private Family family;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String color;

    @Enumerated(EnumType.STRING)
    private Size size;

    @Enumerated(EnumType.STRING)
    private Season season;

    @Enumerated(EnumType.STRING)
    private Condition condition;

    @Enumerated(EnumType.STRING)
    private Type type;

    @Column(nullable = false)
    private boolean archived;

    private String photoUrl;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    // Default constructor for JPA
    public ClothingItem() {
    }

    public ClothingItem(UUID id, Person person, Family family, Gender gender, String color, Size size, Season season, Condition condition, Type type, boolean archived, String photoUrl, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.person = person;
        this.family = family;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.season = season;
        this.condition = condition;
        this.type = type;
        this.archived = archived;
        this.photoUrl = photoUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


    // Getters and setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    // Automatically update timestamps
    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
        archived = false;
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }


    @Override
    public String toString() {
        return "ClothingItem{" +
                "id=" + id +
                ", person=" + person +
                ", family=" + family +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", season=" + season +
                ", condition=" + condition +
                ", type=" + type +
                ", archived=" + archived +
                ", photoUrl='" + photoUrl + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
