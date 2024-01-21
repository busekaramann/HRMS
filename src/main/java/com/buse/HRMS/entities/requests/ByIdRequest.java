package com.buse.HRMS.entities.requests;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ByIdRequest {
    @NotNull(message = "id boş olamaz")
    private int id;
}
