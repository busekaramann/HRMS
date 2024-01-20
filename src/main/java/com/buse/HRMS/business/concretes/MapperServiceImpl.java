package com.buse.HRMS.business.concretes;

import com.buse.HRMS.business.abstracts.MapperService;
import com.buse.HRMS.dataAccsess.abstracts.CityDao;
import com.buse.HRMS.dataAccsess.abstracts.EmployerDao;
import com.buse.HRMS.dataAccsess.abstracts.JobTitleDao;
import com.buse.HRMS.entities.concretes.City;
import com.buse.HRMS.entities.concretes.Employer;
import com.buse.HRMS.entities.concretes.JobTitle;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MapperServiceImpl implements MapperService {

    private final EmployerDao employerDao;
    private final CityDao cityDao;
    private final JobTitleDao jobTitleDao;


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
}
