package com.buse.HRMS.business.abstracts;

import com.buse.HRMS.core.utilities.results.DataResult;
import com.buse.HRMS.core.utilities.results.Result;
import com.buse.HRMS.entities.concretes.JobTitle;
import com.buse.HRMS.entities.requests.AddJobTitleRequest;


import java.util.List;


public interface JobTitleService {
    DataResult<Boolean> add(AddJobTitleRequest addJobTitleRequest);
    Result update(JobTitle jobTitle);
    DataResult<List<JobTitle>> getAll();
}
