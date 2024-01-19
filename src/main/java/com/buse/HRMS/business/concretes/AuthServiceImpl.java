package com.buse.HRMS.business.concretes;

import com.buse.HRMS.business.abstracts.AuthService;
import com.buse.HRMS.business.abstracts.EmailService;
import com.buse.HRMS.business.abstracts.EmployeeService;
import com.buse.HRMS.business.abstracts.EmployerService;
import com.buse.HRMS.core.business.BusinessRule;
import com.buse.HRMS.core.utilities.method.MethodUtils;
import com.buse.HRMS.core.utilities.results.*;
import com.buse.HRMS.entities.concretes.Employee;
import com.buse.HRMS.entities.concretes.Employer;
import com.buse.HRMS.entities.enums.UserStatusEnum;
import com.buse.HRMS.entities.mappers.EmployeeMapper;
import com.buse.HRMS.entities.mappers.EmployerMapper;
import com.buse.HRMS.entities.requests.EmployeeRegisterRequest;
import com.buse.HRMS.entities.requests.EmployerRegisterRequest;
import com.buse.HRMS.entities.requests.VerifyUserRequest;
import com.buse.HRMS.entities.responses.RegisterResponse;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final EmployeeService employeeService;
    private final EmployerService employerService;
    private final EmployeeMapper employeeMapper;
    private final EmployerMapper employerMapper;
    private final EmailService emailService;


    @Override
    public DataResult<RegisterResponse> registerForEmployee(EmployeeRegisterRequest employeeRegisterRequest) throws URISyntaxException {
        //TODO security ile auth işlemleri
        Result result = BusinessRule.run(List.of(
                isExistsSameEmailInEmployee(employeeRegisterRequest),
                comparePasswords(employeeRegisterRequest.getPassword(), employeeRegisterRequest.getPasswordRepaid())

        ));
        if (result != null) {
            return new ErrorDataResult<>(result.getMessage());
        }

        this.employeeService.add(this.employeeMapper.toEntity(employeeRegisterRequest));
        String generatedVerifyCode = String.valueOf(MethodUtils.generateRandomSixCharacter());

        this.emailService.sendEmail(employeeRegisterRequest.getEmail(), generatedVerifyCode);
        return new SuccessDataResult<>();
    }


    @Override
    public DataResult<RegisterResponse> registerForEmployer(EmployerRegisterRequest employerRegisterRequest) throws URISyntaxException {
        Result result = BusinessRule.run(List.of(
           checkEmailAndDomainSame(employerRegisterRequest),
                comparePasswords(employerRegisterRequest.getPassword(), employerRegisterRequest.getPasswordRepaid()),
                isExistsSameEmailInEmployer(employerRegisterRequest)
        ));

        if (result != null) {
            return new ErrorDataResult<>(result.getMessage());
        }

        //TODO security ile auth işlemleri


        this.employerService.add(this.employerMapper.toEntity(employerRegisterRequest));
        return new SuccessDataResult<>();
    }

    @Override
    public Result verifyUserVerifyUserRequest(VerifyUserRequest verifyUserRequest) {
        //TODO gelen kod doğru varsay hep ileride session yapıcaz

        switch (verifyUserRequest.getUserType()){
            case "Employee":
                Employee employee =this.employeeService.findById(verifyUserRequest.getUserId()).getData();
                if(true){
                    employee.setStatus(UserStatusEnum.CONFIRMED);
                    this.employeeService.update(employee);
                }else {
                    return new ErrorResult();
                }
                break;
            case "Employer":
                Employer employer = this.employerService.findById(verifyUserRequest.getUserId()).getData();
                if(true){
                    employer.setStatus(UserStatusEnum.CONFIRMED);
                    this.employerService.update(employer);
                }else {
                    return new ErrorResult();
                }break;
        }
        return new SuccessResult();
    }

    private Result isExistsSameEmailInEmployer(EmployerRegisterRequest employerRegisterRequest) {
        if (employerService.existsByEmail(employerRegisterRequest.getEmail())) {
            return new ErrorResult();
        }
        return new SuccessResult();
    }

    private Result isExistsSameEmailInEmployee(EmployeeRegisterRequest employeeRegisterRequest) {
        if (employeeService.isExistByEmail(employeeRegisterRequest.getEmail())) {
            return new ErrorResult();
        }
        return new SuccessResult();
    }

    private static Result comparePasswords(String password, String passwordRepaid) {
        if(!password.equals(passwordRepaid)){
            return new ErrorResult();
        }
        return new SuccessResult();
    }

    @SneakyThrows
    private static Result checkEmailAndDomainSame(EmployerRegisterRequest request) {
        String url = request.getWebsite();
        if(!url.contains("http")) {
            url = ("https://") + (url.startsWith("www.") ? url.substring(4): url);
        } else {
            var index = url.indexOf("//");
            url =(url.contains("www.") ? url.substring(index + 6): url);
        }
        URI uri = new URI(url);
        String domain = uri.getHost();
        String rawEmail = request.getEmail();
        String email = rawEmail.split("@")[1];

        if (!email.equals(domain)) {
            return new ErrorResult();
        }
        return new SuccessResult();
    }

}
