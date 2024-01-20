package com.buse.HRMS.entities.concretes;

import com.buse.HRMS.entities.enums.UserStatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "employers")
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "website")
    private String website;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name="status")
    @Enumerated(value = EnumType.STRING)
    private UserStatusEnum status = UserStatusEnum.PENDING;

    @Column(name = "is_verified_by_admin")
    private Boolean isVerifiedByAdmin = false;


}
