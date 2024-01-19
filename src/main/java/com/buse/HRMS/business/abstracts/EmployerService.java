package com.buse.HRMS.business.abstracts;

import com.buse.HRMS.core.utilities.results.DataResult;
import com.buse.HRMS.core.utilities.results.Result;
import com.buse.HRMS.entities.concretes.Employer;


import java.util.List;


public interface EmployerService {
    Result add(Employer employer);
    Result update(Employer employer);
    Result delete(Employer employer);
    DataResult<List<Employer>> getAll();
    boolean existsByEmail(String email);
    DataResult<Employer> findById (int id);
}
