package com.buse.HRMS.business.concretes;

import com.buse.HRMS.business.abstracts.EmployerService;
import com.buse.HRMS.core.utilities.results.DataResult;
import com.buse.HRMS.core.utilities.results.Result;
import com.buse.HRMS.core.utilities.results.SuccessDataResult;
import com.buse.HRMS.core.utilities.results.SuccessResult;
import com.buse.HRMS.dataAccsess.abstracts.EmployerDao;
import com.buse.HRMS.entities.concretes.Employer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerServiceImpl implements EmployerService {

    private EmployerDao employerDao;

    public EmployerServiceImpl(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }

    @Override
    public Result add(Employer employer) {
        this.employerDao.save(employer);
        return new SuccessResult();
    }

    @Override
    public Result update(Employer employer) {
        this.employerDao.save(employer);
        return new SuccessResult();
    }

    @Override
    public Result delete(Employer employer) {
        this.employerDao.delete(employer);
        return new SuccessResult();
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>(this.employerDao.findAll());
    }

    @Override
    public boolean existsByEmail(String email) {
        return this.employerDao.existsByEmail(email);
    }

    @Override
    public DataResult<Employer> findById(int id) {
        return new SuccessDataResult<Employer>(this.employerDao.findById(id));
    }
}
