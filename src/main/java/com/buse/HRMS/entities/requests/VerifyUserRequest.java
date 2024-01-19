package com.buse.HRMS.entities.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VerifyUserRequest {
    int userId;
    String code;
    String userType;
}
