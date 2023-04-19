package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.DivisionDTO;
import com.example.mapstruct.dto.EmployeeDTO;
import com.example.mapstruct.entity.Division;
import com.example.mapstruct.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface EmployeeMapper {
    DivisionDTO divisionToDivisionDTO(Division entity);
    Division divisionDTOtoDivision(DivisionDTO dto);

    @Mapping(target = "employeeId",source = "employee.id")
    @Mapping(target = "employeeName",source = "employee.name")
    @Mapping(target = "employeeStartDt",source = "startDt",dateFormat = "dd-MM-yyyy HH:mm:ss")
    EmployeeDTO employeeToEmployeeDTO(Employee employee);

    @Mapping(target = "id",source = "employeeDTO.employeeId")
    @Mapping(target = "name",source = "employeeDTO.employeeName")
    @Mapping(target = "startDt",source = "employeeStartDt",dateFormat = "dd-MM-yyyy HH:mm:ss")
    Employee employeeDtoToEmployee(EmployeeDTO employeeDTO);


}
