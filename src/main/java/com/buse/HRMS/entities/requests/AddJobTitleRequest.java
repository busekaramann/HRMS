package com.buse.HRMS.entities.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddJobTitleRequest {

    @NotBlank(message = "İsim alanı boş bırakılamaz")
    private String name;
}
