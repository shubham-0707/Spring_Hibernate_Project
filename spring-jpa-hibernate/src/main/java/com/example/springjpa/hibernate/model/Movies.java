package com.example.springjpa.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movies {
    @Id
    private String name;
    private int duration;

    private double rating;

    public Movies(){

    }

    public Movies(String name, int duration, double rating) {
        this.name = name;
        this.duration = duration;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
