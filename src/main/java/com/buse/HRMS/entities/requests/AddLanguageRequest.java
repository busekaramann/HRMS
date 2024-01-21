package com.buse.HRMS.entities.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddLanguageRequest {

    @NotNull(message = "Resume id boş olamaz")
    private int resumeId;

    @NotBlank(message = "Dil alanı boş bırakılamaz")
    private String languageName;

    @NotBlank(message = "Dil seviyesi boş bırakılamaz")
    private String languageGrade;
}
