package com.buse.HRMS.entities.mappers;


import com.buse.HRMS.business.abstracts.MapperService;
import com.buse.HRMS.entities.concretes.JobAdvert;
import com.buse.HRMS.entities.requests.AddJobAdvertRequest;
import com.buse.HRMS.entities.responses.JobAdvertResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {MapperService.class})
public interface JobAdvertMapper {

    @Mapping(source = "request.cityId", target = "city")
    @Mapping(source = "request.employerId", target = "employer")
    @Mapping(source = "request.jobTitleId", target = "jobTitle")
    JobAdvert toEntity (AddJobAdvertRequest request);

    @Mapping(source = "entity.employer.companyName", target = "companyName")
    JobAdvertResponse toResponse(JobAdvert entity);
}
