package com.buse.HRMS.dataAccsess.abstracts;

import com.buse.HRMS.entities.concretes.JobAdvert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface JobAdvertDao extends JpaRepository<JobAdvert, Integer> {
    List<JobAdvert> getByEmployer_CompanyName(String companyName);
    List<JobAdvert> getByPublishDateBetween(Date startDate, Date endDate);
}
