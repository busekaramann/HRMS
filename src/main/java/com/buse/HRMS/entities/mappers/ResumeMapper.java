package com.buse.HRMS.entities.mappers;

import com.buse.HRMS.business.abstracts.EmployeeService;
import com.buse.HRMS.business.abstracts.MapperService;
import com.buse.HRMS.entities.concretes.Resume;
import com.buse.HRMS.entities.requests.AddResumeRequest;
import com.buse.HRMS.entities.responses.ResumeResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {MapperService.class})
public interface ResumeMapper {

    @Mapping(source = "request.employeeId",target = "employee")
    Resume toEntity(AddResumeRequest request);

    ResumeResponse toResponse(Resume entity);
}
