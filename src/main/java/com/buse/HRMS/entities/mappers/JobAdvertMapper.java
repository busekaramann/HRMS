package com.buse.HRMS.entities.mappers;


import com.buse.HRMS.entities.concretes.JobAdvert;
import com.buse.HRMS.entities.requests.AddJobAdvertRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface JobAdvertMapper {

    JobAdvert toEntity (AddJobAdvertRequest addJobAdvertRequest);
}
