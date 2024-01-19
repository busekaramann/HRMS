package com.buse.HRMS.dataAccsess.abstracts;


import com.buse.HRMS.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerDao extends JpaRepository<Employer, Integer> {
    boolean existsByEmail(String email);
    Employer findById (int id);
}
