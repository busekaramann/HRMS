package com.buse.HRMS.business.abstracts;


import com.buse.HRMS.entities.concretes.City;
import com.buse.HRMS.entities.concretes.Employer;
import com.buse.HRMS.entities.concretes.JobTitle;

public interface MapperService {
    JobTitle getJobTitle(int id);
    Employer getEmployer(int id);
    City getCity(int id);
}
