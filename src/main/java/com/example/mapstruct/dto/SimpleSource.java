package com.example.mapstruct.dto;

import lombok.*;

public class SimpleSource {
    private String name;
    private String description;

    public SimpleSource(){
    }
    public SimpleSource(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SimpleSource{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
