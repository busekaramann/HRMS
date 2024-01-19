package com.buse.HRMS.business.abstracts;

import com.buse.HRMS.core.utilities.results.Result;

public interface EmailService {
    void sendEmail(String email,String code);
}
