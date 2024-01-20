package com.buse.HRMS.business.concretes;

import com.buse.HRMS.business.abstracts.JobAdvertService;
import com.buse.HRMS.core.utilities.results.*;
import com.buse.HRMS.dataAccsess.abstracts.JobAdvertDao;
import com.buse.HRMS.entities.concretes.JobAdvert;
import com.buse.HRMS.entities.mappers.JobAdvertMapper;
import com.buse.HRMS.entities.requests.AddJobAdvertRequest;
import com.buse.HRMS.entities.responses.JobAdvertResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class JobAdvertServiceImpl implements JobAdvertService {
    private final JobAdvertDao jobAdvertDao;
    private final JobAdvertMapper mapper;

    @Override
    public Result add(AddJobAdvertRequest jobAdvertRequest) {
        JobAdvert entity = mapper.toEntity(jobAdvertRequest);
        this.jobAdvertDao.save(entity);
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
    public DataResult<List<JobAdvertResponse>> getAll() {

        List<JobAdvert> entities = this.jobAdvertDao.findAll();

        return new SuccessDataResult<List<JobAdvertResponse>>(entities.stream().map(mapper::toResponse).toList());
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
