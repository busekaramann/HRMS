package com.buse.HRMS.entities.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AddEducationRequest {

    @NotNull(message = "Resume id boş olamaz")
    private int resumeId;

    @NotBlank(message = "Okul adı boş bırakılamaz")
    private String schoolName;

    @NotBlank(message = "Fakülte alanı boş bırakılamaz")
    private String faculty;

    @NotNull(message = "Başlangı tarihi boş bırakılamaz")
    private Date startDate;

    private Date endDate;
}
