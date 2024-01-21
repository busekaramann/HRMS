package com.buse.HRMS.business.concretes;

import com.buse.HRMS.business.abstracts.JobTitleService;
import com.buse.HRMS.core.business.BusinessRule;
import com.buse.HRMS.core.utilities.results.*;
import com.buse.HRMS.dataAccsess.abstracts.JobTitleDao;
import com.buse.HRMS.entities.concretes.JobTitle;
import com.buse.HRMS.entities.requests.AddJobTitleRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobTitleServiceImpl implements JobTitleService {

    private final JobTitleDao jobTitleDao;



    @Override
    public DataResult<Boolean> add(AddJobTitleRequest addJobTitleRequest) {
        Result logics = BusinessRule.run(List.of(
           existsByName(addJobTitleRequest.getName())
        ));
        if (logics != null) {
            return new ErrorDataResult<>(false, "Aynı isimde pozisyon eklenemez");
        }

        JobTitle entity = new JobTitle();
        entity.setName(addJobTitleRequest.getName());

        this.jobTitleDao.save(entity);
        return new SuccessDataResult<>(true);
    }

    @Override
    public Result update(JobTitle jobTitle) {
        this.jobTitleDao.save(jobTitle);
        return new SuccessResult();

    }

    @Override
    public DataResult<List<JobTitle>> getAll() {
        return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll());
    }

    public Result existsByName(String name) {
        if (this.jobTitleDao.existsByName(name)) {
            return new ErrorResult();
        }
        return new SuccessResult();
    }
}
