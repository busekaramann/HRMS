package com.buse.HRMS.business.abstracts;

import com.buse.HRMS.core.utilities.results.DataResult;
import com.buse.HRMS.core.utilities.results.Result;
import com.buse.HRMS.entities.concretes.Education;
import com.buse.HRMS.entities.requests.AddEducationRequest;

import java.util.List;

public interface EducationService {
    Result add(AddEducationRequest addEducationRequest);
    Result update(Education education);
    Result delete(Education education);
    DataResult<List<Education>> getAll();
}
