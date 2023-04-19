package com.example.mapstruct.entity;

public class Division {
    private int id;
    private String name;

    public Division(){}
    public Division(int id, String name){
        this.name=name;
        this.id=id;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Division{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
