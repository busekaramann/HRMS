package com.buse.HRMS.dataAccsess.abstracts;

import com.buse.HRMS.entities.concretes.Education;
import com.buse.HRMS.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationDao extends JpaRepository<Education, Integer> {
}
