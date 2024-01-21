package com.buse.HRMS.entities.mappers;

import com.buse.HRMS.entities.concretes.Talent;
import com.buse.HRMS.entities.requests.AddTalentRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TalentMapper {
    Talent toEntity (AddTalentRequest addTalentRequest);
}
