package com.buse.HRMS.dataAccsess.abstracts;

import com.buse.HRMS.entities.concretes.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
    boolean existsByEmail(String email);
    Employee findById(int id);

}
