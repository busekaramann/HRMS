package com.buse.HRMS.business.abstracts;

import com.buse.HRMS.core.utilities.results.DataResult;
import com.buse.HRMS.core.utilities.results.Result;
import com.buse.HRMS.entities.concretes.Experience;
import com.buse.HRMS.entities.requests.AddExperienceRequest;

import java.util.List;

public interface ExperienceService {
    Result add(AddExperienceRequest addExperienceRequest);
    Result update(Experience experience);
    Result delete(Experience experience);
    DataResult<List<Experience>> getAll();
}
