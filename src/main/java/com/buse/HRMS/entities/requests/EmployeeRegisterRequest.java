package com.buse.HRMS.entities.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class EmployeeRegisterRequest {
    @NotBlank(message = "İsim alanı boş bırakılamaz")
    private String firstName;

    @NotBlank(message = "Soyisim alanı boş bırakılamaz")
    private String lastName;

    @NotBlank(message = "TC No alanı boş bırakılamaz")
    private String identityNumber;

    @NotNull(message = "Doğum Tarihi alanı boş bırakılamaz")
    private Date birthDate;

    @NotBlank(message = "Email alanı boş bırakılamaz")
    @Email
    private String email;

    @NotBlank(message = "Şifre alanı boş bırakılamaz")
    private String password;

    @NotBlank(message = "Şifre tekrarı boş bırakılamaz")
    private String passwordRepaid;
}
