package com.buse.HRMS.business.abstracts;

import com.buse.HRMS.core.utilities.results.DataResult;
import com.buse.HRMS.core.utilities.results.Result;
import com.buse.HRMS.entities.requests.EmployeeRegisterRequest;
import com.buse.HRMS.entities.requests.EmployerRegisterRequest;
import com.buse.HRMS.entities.requests.VerifyUserRequest;
import com.buse.HRMS.entities.responses.RegisterResponse;

import java.net.URISyntaxException;


public interface AuthService {
    DataResult<RegisterResponse> registerForEmployee(EmployeeRegisterRequest employeeRegisterRequest) throws URISyntaxException;
    DataResult<RegisterResponse> registerForEmployer(EmployerRegisterRequest employerRegisterRequest) throws URISyntaxException;

    Result verifyUserVerifyUserRequest(VerifyUserRequest verifyUserRequest);

}
