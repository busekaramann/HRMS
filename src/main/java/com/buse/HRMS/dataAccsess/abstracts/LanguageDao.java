package com.buse.HRMS.dataAccsess.abstracts;

import com.buse.HRMS.entities.concretes.JobAdvert;
import com.buse.HRMS.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageDao extends JpaRepository<Language, Integer> {
}
