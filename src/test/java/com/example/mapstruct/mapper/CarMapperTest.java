package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.CarDTO;
import com.example.mapstruct.entity.Car;
import com.example.mapstruct.entity.ElectricCar;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CarMapperTest {

    private final CarMapper mapper= Mappers.getMapper(CarMapper.class);

    @Test
    public void carMapperTest(){
        Car car =new ElectricCar();
        car.setId(1);
        car.setName("tesla");
        CarDTO carDTO=mapper.toCarDTO(car);
        System.out.println("carDTO = " + carDTO);
    }
}
