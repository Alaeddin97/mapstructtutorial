package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.EmployeeDTO;
import com.example.mapstruct.entity.Division;
import com.example.mapstruct.entity.Employee;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class EmployeeMapperTest {
    private final EmployeeMapper mapper =
            Mappers.getMapper(EmployeeMapper.class);
    private static final String DATE_FORMAT = "dd-MM-yyyy HH:mm:ss";
    @Test
    public void employeeMapperTest() throws ParseException {


        Employee employee=new Employee(1,"employeeName");
        employee.setDivision(new Division(1,"divisionName"));
        employee.setStartDt(new Date());
        EmployeeDTO employeeDTO=mapper.employeeToEmployeeDTO(employee);
        SimpleDateFormat format=new SimpleDateFormat(DATE_FORMAT);

        System.out.println(employee.getDivision());
        System.out.println(employeeDTO);
        assertEquals(employee.getId(),employeeDTO.getEmployeeId());
        assertEquals(employee.getName(),employeeDTO.getEmployeeName());
        assertEquals(employee.getDivision().getId(),employeeDTO.getDivisionDTO().getId());
        assertEquals(employee.getDivision().getName(),employeeDTO.getDivisionDTO().getName());
        assertEquals(employee.getStartDt().toString(),format.parse(employeeDTO.getEmployeeStartDt()).toString());
    }

    @Test
    public void employeeDtoMapperTest(){
        EmployeeDTO employeeDTO=new EmployeeDTO(1,"dtoName");
        Employee employee=mapper.employeeDtoToEmployee(employeeDTO);

        assertEquals(employee.getId(),employeeDTO.getEmployeeId());
        assertEquals(employee.getName(),employeeDTO.getEmployeeName());
    }
}
