package com.buse.HRMS.business.abstracts;


import com.buse.HRMS.entities.concretes.*;

public interface MapperService {
    JobTitle getJobTitle(int id);
    Employer getEmployer(int id);
    City getCity(int id);

    Employee getEmployee(int id);

    Talent getTalent(int id);

    Language getLanguage(int id);

    Experience getExperience(int id);

    Education getEducation(int id);
}
