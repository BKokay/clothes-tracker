package com.tracker.models;

import com.tracker.models.enums.*;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Entity
public class ToBuyItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "Family_id", nullable = false)
    private Family Family;

    @Enumerated(EnumType.STRING)
    @Column()
    private Size size;

    @Column()
    private String color;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Type type;

    @Enumerated(EnumType.STRING)
    @Column()
    private Season season;

    @Column(nullable = false)
    private Date buyBy;

    @Column()
    private String description;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    // Default constructor for JPA
    public ToBuyItem() {
    }

    // Constructor for creating a new ToBuyItem
    public ToBuyItem(Family Family, Size size, String color, Type type, Season season, Date buyBy, String description) {
        this.Family = Family;
        this.size = size;
        this.color = color;
        this.type = type;
        this.season = season;
        this.buyBy = buyBy;
        this.description = description;
    }

    // Getters and setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Family getFamily() {
        return Family;
    }

    public void setFamily(Family Family) {
        this.Family = Family;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Date getBuyBy() {
        return buyBy;
    }

    public void setBuyBy(Date buyBy) {
        this.buyBy = buyBy;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
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

    // Automatically set timestamps
    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "ToBuyItem{" +
                "id=" + id +
                ", Family=" + Family +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", type=" + type +
                ", season=" + season +
                ", buyBy=" + buyBy +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
