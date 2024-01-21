package com.buse.HRMS.entities.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AddExperienceRequest {

    @NotNull(message = "Resume id boş olamaz")
    private int resumeId;

    @NotBlank(message = "Şirket adı boş bırakılamaz")
    private String companyName;

    @NotBlank(message = "Rol boş bırakılamaz")
    private String role;

    @NotNull(message = "Başlangıç tarihi boş bırakılamaz")
    private Date startDate;

    private Date endDate;
    private String description;
}
