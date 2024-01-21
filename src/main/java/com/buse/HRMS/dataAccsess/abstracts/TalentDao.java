package com.buse.HRMS.dataAccsess.abstracts;

import com.buse.HRMS.entities.concretes.JobTitle;
import com.buse.HRMS.entities.concretes.Talent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TalentDao extends JpaRepository<Talent, Integer> {
}
