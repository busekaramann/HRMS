package com.buse.HRMS.entities.concretes;

import com.buse.HRMS.entities.enums.JobAdvertStatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "job_adverts")
@Where(clause = "status is CONFIRMED")
public class JobAdvert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "job_title_id")
    private int jobTitleId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "min_salary")
    private int minSalary;

    @Column(name = "max_salary")
    private int maxSalary;

    @Column(name = "job_of_number_position")
    private int jobOfNumberPosition;

    @Column(name = "deadline")
    private Date deadline;

    @Column(name = "status")
    private String status = JobAdvertStatusEnum.PENDING.getStatus();

    @Column(name = "photo")
    private String photo;

    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date createdDate;

    @Column(name = "publish_date")
    private Date publishDate;



    @ManyToOne()
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne()
    @JoinColumn(name = "employer_id")
    private Employer employer;


}
