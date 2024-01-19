package com.buse.HRMS.entities.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class EmployerRegisterRequest {
    @NotBlank(message = "Şirket ismi boş bırakılamaz")
    private String companyName;

    @NotBlank(message = "Website boş bırakılamaz")
    private String website;

    @NotBlank(message = "Email alanı boş bırakılamaz")
    @Email
    private String email;

    @NotBlank(message = "Şifre alanı boş bırakılamaz")
    private String password;

    @NotBlank(message = "Şifre tekrarı boş bırakılamaz")
    private String passwordRepaid;

    @NotBlank(message = "Telefon numarası boş bırakılamaz")
    private String phoneNumber;
}
