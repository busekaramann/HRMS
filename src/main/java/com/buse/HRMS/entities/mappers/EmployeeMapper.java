package com.buse.HRMS.entities.mappers;

import com.buse.HRMS.entities.concretes.Employee;
import com.buse.HRMS.entities.requests.EmployeeRegisterRequest;
import com.buse.HRMS.entities.responses.RegisterResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EmployeeMapper {
    Employee toEntity(EmployeeRegisterRequest employeeRegisterRequest);

}
