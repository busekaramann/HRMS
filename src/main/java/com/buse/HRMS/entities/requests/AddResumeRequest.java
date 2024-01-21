package com.buse.HRMS.entities.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddResumeRequest {

    @NotBlank(message = "CV adı boş olamaz")
    private String resumeName;

    @NotBlank(message = "Açıklama alanı boş bırakılamaz")
    private String description;

    private String githubLink;

    private String linkedinLink;

    private String photo;

    private String coverLetter;

    @NotNull(message = "Employee boş bırakalamaz")
    private int employeeId;
}
