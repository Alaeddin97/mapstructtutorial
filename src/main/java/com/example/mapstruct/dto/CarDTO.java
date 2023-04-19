package com.example.mapstruct.dto;

public class CarDTO {
    private int id;
    private String name;
    private FuelType fuelType;

    public CarDTO() {
    }

    public CarDTO(int id, String name, FuelType fuelType) {
        this.id = id;
        this.name = name;
        this.fuelType = fuelType;
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

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fuelType=" + fuelType +
                '}';
    }
}
