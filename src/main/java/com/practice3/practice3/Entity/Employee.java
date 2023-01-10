package com.practice3.practice3.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "Practice3")
public class Employee {
    @Id
    Long id;
    String name;
    String place;
    Long age;

    public Employee() {
    }

    public Employee(Long id, String name, String place, Long age) {
        this.id = id;
        this.name = name;
        this.place = place;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
