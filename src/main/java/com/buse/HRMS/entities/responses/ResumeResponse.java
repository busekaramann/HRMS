package com.buse.HRMS.entities.responses;

import com.buse.HRMS.entities.concretes.Education;
import com.buse.HRMS.entities.concretes.Experience;
import com.buse.HRMS.entities.concretes.Language;
import com.buse.HRMS.entities.concretes.Talent;
import com.buse.HRMS.entities.enums.ResumeStatusEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class ResumeResponse {
    private int id;
    private String resumeName;
    private String description;
    private Date createdDate = new Date();
    private Date updateDate;
    private ResumeStatusEnum status;
    private String githubLink;
    private String linkedinLink;
    private String photo;
    private String coverLetter;
    // employee için response yazıldığında buraya o response verilecek
    List<Education> educations;
    List<Experience> experiences;
    List<Language> languages;
    List<Talent> talents;
}
