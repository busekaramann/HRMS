package com.buse.HRMS.entities.responses;

import com.buse.HRMS.entities.concretes.City;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class JobAdvertResponse {
    private String companyName;
    private String name;
    private String description;
    private int jobOfNumberPosition;
    private Date created_date;
    private Date pulishDate;
    private City city;
    private String photo;
}
