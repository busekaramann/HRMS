package com.buse.HRMS.entities.responses;

import com.buse.HRMS.entities.concretes.City;
import com.buse.HRMS.entities.concretes.JobTitle;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class JobAdvertResponse {
    private int id;
    private String companyName;
    private String name;
    private String description;
    private int jobOfNumberPosition;
    private Date createdDate;
    private Date publishDate;
    private City city;
    private JobTitle jobTitle;
    private String photo;
}
