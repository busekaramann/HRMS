package com.buse.HRMS.entities.concretes;

import com.buse.HRMS.entities.enums.UserStatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "employees")
//@Where(clause = "status != DELETED")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name= "identity_number")
    private int identityNumber;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="birth_date")
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Column(name="status")
    private UserStatusEnum status = UserStatusEnum.PENDING;

}
