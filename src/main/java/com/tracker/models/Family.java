package com.tracker.models;

import jakarta.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Family {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column()
    private String username;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "family", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Person> people;  //this creates the one-to-many relationship for JPA.

    // Default constructor for JPA
    public Family() {
    }

    // Constructor for creating a new family
    public Family(String username, String email, String password, List<Person> person) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.people = person;
    }

    // Getters and setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Person> getChildren() {
        return people;
    }

    public void setChildren(List<Person> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", children='" + people + '\'' +
                '}';
    }
}
