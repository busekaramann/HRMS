package com.buse.HRMS.entities.mappers;

import com.buse.HRMS.entities.concretes.Language;
import com.buse.HRMS.entities.requests.AddLanguageRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LanguageMapper {
    Language toEntitiy (AddLanguageRequest addLanguageRequest);
}
