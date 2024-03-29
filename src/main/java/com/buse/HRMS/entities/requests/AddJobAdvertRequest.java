package com.buse.HRMS.entities.requests;

import com.buse.HRMS.entities.concretes.City;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AddJobAdvertRequest {
    private int jobTitleId;

    @NotNull(message = " İşveren alanı boş bırakılamaz")
    private int employerId;

    @NotNull(message = "Şehir alanı boş bırakılamaz")
    private int cityId;

    @NotBlank(message = "İsim alanı boş bırakılamaz")
    private String name;

    @NotBlank(message = "Açıklama alanı boş bırakılamaz")
    private String description;

    private int minSalary;

    private int maxSalary;

    @NotNull(message = "Pozisyon alanı boş bırakılamaz")
    private int jobOfNumberPosition;

    @NotNull(message = "Son başvuru tarihi boş bırakılamaz")
    private Date deadline;

    private String photo;
}
