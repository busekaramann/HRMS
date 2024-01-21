package com.buse.HRMS.entities.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddTalentRequest {

    @NotBlank(message = "Yetenek alanı boş bırakılamaz")
    private String talent;

    private int resumeId;
}
