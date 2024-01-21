package com.buse.HRMS.business.concretes;

import com.buse.HRMS.business.abstracts.EmployeeService;
import com.buse.HRMS.core.utilities.results.*;
import com.buse.HRMS.dataAccsess.abstracts.EmployeeDao;
import com.buse.HRMS.entities.concretes.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeDao employeeDao;


    @Override
    public Result add(Employee employee) {
        this.employeeDao.save(employee);
        return new SuccessResult();
    }

    @Override
    public Result update(Employee employee) {
        this.employeeDao.save(employee);
        return new SuccessResult();
    }

    @Override
    public Result delete(Employee employee) {
        this.employeeDao.delete(employee);
        return new SuccessResult();
    }

    @Override
    public DataResult<List<Employee>> getAll() {

        return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll());
    }

    @Override
    public Boolean isExistByEmail(String email) {
        return this.employeeDao.existsByEmail(email);
    }

    @Override
    public DataResult<Employee> findById(int id) {
        return new SuccessDataResult<Employee>(this.employeeDao.findById(id));
    }
}
