package com.buse.HRMS.entities.mappers;

import com.buse.HRMS.entities.concretes.Employer;
import com.buse.HRMS.entities.requests.EmployerRegisterRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EmployerMapper {
    Employer toEntity(EmployerRegisterRequest employerRegisterRequest);
}
