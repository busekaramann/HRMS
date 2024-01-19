package com.buse.HRMS.dataAccsess.abstracts;

import com.buse.HRMS.entities.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {
    boolean existsByName(String name);
}
