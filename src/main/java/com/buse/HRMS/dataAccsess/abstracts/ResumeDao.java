package com.buse.HRMS.dataAccsess.abstracts;

import com.buse.HRMS.entities.concretes.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeDao extends JpaRepository<Resume, Integer> {
}
