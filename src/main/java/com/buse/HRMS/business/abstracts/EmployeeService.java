package com.buse.HRMS.business.abstracts;

import com.buse.HRMS.core.utilities.results.DataResult;
import com.buse.HRMS.core.utilities.results.Result;
import com.buse.HRMS.entities.concretes.Employee;


import java.util.List;


public interface EmployeeService {
    Result add(Employee employee);
    Result update(Employee employee);
    Result delete(Employee employee);
    DataResult<List<Employee>> getAll();
    Boolean isExistByEmail(String email);
    DataResult<Employee> findById(int id);

}


