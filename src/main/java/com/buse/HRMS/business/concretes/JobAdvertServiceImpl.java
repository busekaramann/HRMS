package com.buse.HRMS.business.concretes;

import com.buse.HRMS.business.abstracts.JobAdvertService;
import com.buse.HRMS.core.utilities.results.*;
import com.buse.HRMS.dataAccsess.abstracts.JobAdvertDao;
import com.buse.HRMS.entities.concretes.JobAdvert;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class JobAdvertServiceImpl implements JobAdvertService {
    private  JobAdvertDao jobAdvertDao;

    public JobAdvertServiceImpl(JobAdvertDao jobAdvertDao) {
        this.jobAdvertDao = jobAdvertDao;
    }

    @Override
    public Result add(JobAdvert jobAdvert) {
        this.jobAdvertDao.save(jobAdvert);
        return new SuccessDataResult<>();


    }

    @Override
    public Result update(JobAdvert jobAdvert) {
        this.jobAdvertDao.save(jobAdvert);
        return new SuccessDataResult<>();
    }

    @Override
    public Result delete(JobAdvert jobAdvert) {
        this.jobAdvertDao.delete(jobAdvert);
        return new SuccessDataResult<>();
    }

    @Override
    public DataResult<List<JobAdvert>> getAll() {

        return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAll());
    }

    @Override
    public DataResult<List<JobAdvert>> getByEmployer_CompanyName(String companyName) {
        return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getByEmployer_CompanyName(companyName));
    }

    @Override
    public DataResult<List<JobAdvert>> getByPublishDateBetween(Date startDate, Date endDate) {
        return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getByPublishDateBetween(startDate,endDate));
    }


}
