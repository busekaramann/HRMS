package com.buse.HRMS.business.abstracts;


import com.buse.HRMS.core.utilities.results.DataResult;
import com.buse.HRMS.core.utilities.results.Result;
import com.buse.HRMS.entities.concretes.JobAdvert;
import com.buse.HRMS.entities.requests.AddJobAdvertRequest;
import com.buse.HRMS.entities.responses.JobAdvertResponse;


import java.util.Date;
import java.util.List;


public interface JobAdvertService {
    Result add(AddJobAdvertRequest jobAdvertRequest);
    Result update(JobAdvert jobAdvert);
    Result delete(JobAdvert jobAdvert);
    DataResult<List<JobAdvertResponse>> getAll();
    DataResult<List<JobAdvert>> getByEmployer_CompanyName(String companyName);
    DataResult<List<JobAdvert>> getByPublishDateBetween (Date startDate, Date endDate);


}
