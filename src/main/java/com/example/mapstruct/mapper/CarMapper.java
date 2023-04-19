package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.CarDTO;
import com.example.mapstruct.dto.FuelType;
import com.example.mapstruct.entity.BioDieselCar;
import com.example.mapstruct.entity.Car;
import com.example.mapstruct.entity.ElectricCar;
import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public abstract class CarMapper {

    @BeforeMapping
    protected void enrichCarWithFuelType(Car car, @MappingTarget CarDTO carDTO){
        if(car instanceof ElectricCar) carDTO.setFuelType(FuelType.ELECTRIC);
        if (car instanceof BioDieselCar) carDTO.setFuelType(FuelType.BIO_DIESEL);}

    @AfterMapping
    protected void carNameToUppercase(@MappingTarget CarDTO carDTO){
        carDTO.setName(carDTO.getName().toUpperCase());
    }

    abstract CarDTO toCarDTO(Car car);
}
