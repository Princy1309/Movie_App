package com.example.movieapp.model;

public class Movie {
    private int id;
    private String name;
    private String description;

    public Movie(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;

    }

    public Movie() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }
}
