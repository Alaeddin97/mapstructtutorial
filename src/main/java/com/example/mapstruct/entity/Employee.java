package com.example.mapstruct.entity;

import java.util.Date;

public class Employee {
    private int id;
    private String name;
    private Division division;
    private Date startDt;

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(int id, String name, Division division) {
        this.id = id;
        this.name = name;
        this.division = division;
    }
    public Employee(int id, String name, Division division,Date startDt) {
        this.id = id;
        this.name = name;
        this.division = division;
        this.startDt=startDt;
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

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Date getStartDt() {
        return startDt;
    }

    public void setStartDt(Date startDt) {
        this.startDt = startDt;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", division=" + division +
                ", startDt=" + startDt +
                '}';
    }
}
