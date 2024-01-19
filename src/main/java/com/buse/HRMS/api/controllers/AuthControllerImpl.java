package com.buse.HRMS.api.controllers;

import com.buse.HRMS.business.abstracts.AuthService;
import com.buse.HRMS.core.utilities.results.DataResult;
import com.buse.HRMS.core.utilities.results.SuccessDataResult;
import com.buse.HRMS.entities.requests.EmployeeRegisterRequest;
import com.buse.HRMS.entities.requests.EmployerRegisterRequest;
import com.buse.HRMS.entities.responses.RegisterResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthControllerImpl {

    private final AuthService authService;


    @PostMapping("/register/employee")
    public ResponseEntity<DataResult<RegisterResponse>> registerForEmployee (@RequestBody @Valid EmployeeRegisterRequest employeeRegisterRequest) throws URISyntaxException {
        DataResult<RegisterResponse>  response= this.authService.registerForEmployee(employeeRegisterRequest);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/register/employer")
    public ResponseEntity<DataResult<RegisterResponse>> registerForEmployer (@RequestBody @Valid EmployerRegisterRequest employerRegisterRequest) throws URISyntaxException {
        DataResult<RegisterResponse> response= this.authService.registerForEmployer(employerRegisterRequest);
        return ResponseEntity.ok(response);
    }

}
