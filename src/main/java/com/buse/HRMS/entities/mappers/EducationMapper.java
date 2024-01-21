package com.buse.HRMS.entities.mappers;

import com.buse.HRMS.entities.concretes.Education;
import com.buse.HRMS.entities.requests.AddEducationRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EducationMapper {
    Education toEntity (AddEducationRequest addEducationRequest);
}
