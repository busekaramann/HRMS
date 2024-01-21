package com.buse.HRMS.entities.mappers;

import com.buse.HRMS.entities.concretes.Experience;
import com.buse.HRMS.entities.requests.AddExperienceRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ExperienceMapper {
    Experience toEntity(AddExperienceRequest addExperienceRequest);
}
