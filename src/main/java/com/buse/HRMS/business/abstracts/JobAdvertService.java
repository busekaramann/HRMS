package com.buse.HRMS.business.abstracts;


import com.buse.HRMS.core.utilities.results.DataResult;
import com.buse.HRMS.core.utilities.results.Result;
import com.buse.HRMS.entities.concretes.JobAdvert;


import java.util.Date;
import java.util.List;


public interface JobAdvertService {
    Result add(JobAdvert jobAdvert);
    Result update(JobAdvert jobAdvert);
    Result delete(JobAdvert jobAdvert);
    DataResult<List<JobAdvert>> getAll();
    DataResult<List<JobAdvert>> getByEmployer_CompanyName(String companyName);
    DataResult<List<JobAdvert>> getByPublishDateBetween (Date startDate, Date endDate);


}
