package com.buse.HRMS.business.concretes;

import com.buse.HRMS.business.abstracts.MapperService;
import com.buse.HRMS.dataAccsess.abstracts.*;
import com.buse.HRMS.entities.concretes.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MapperServiceImpl implements MapperService {

    private final EmployerDao employerDao;
    private final CityDao cityDao;
    private final JobTitleDao jobTitleDao;
    private final EmployeeDao employeeDao;
    private final TalentDao talentDao;
    private final ExperienceDao experienceDao;
    private final EducationDao educationDao;
    private final LanguageDao languageDao;


    @Override
    public JobTitle getJobTitle(int id) {
        return jobTitleDao.findById(id).get();
    }

    @Override
    public Employer getEmployer(int id) {
        return employerDao.findById(id);
    }

    @Override
    public City getCity(int id) {
        return cityDao.findById(id).get();
    }

    @Override
    public Employee getEmployee(int id) {
        return employeeDao.findById(id);
    }

    @Override
    public Talent getTalent(int id) {
        return talentDao.findById(id).get();
    }

    @Override
    public Language getLanguage(int id) {
        return languageDao.findById(id).get();
    }

    @Override
    public Experience getExperience(int id) {
        return experienceDao.findById(id).get();
    }

    @Override
    public Education getEducation(int id) {
        return educationDao.findById(id).get();
    }
}
