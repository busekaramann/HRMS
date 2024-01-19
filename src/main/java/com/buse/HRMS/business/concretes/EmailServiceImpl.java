package com.buse.HRMS.business.concretes;

import com.buse.HRMS.business.abstracts.EmailService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
    @Override
    @Async("threadPoolTaskExecutor")
    public void sendEmail(String email, String code) {
        System.out.println("Şu adrese doğrulama maili gönderildi: " + email + " "+ code);
    }
}
