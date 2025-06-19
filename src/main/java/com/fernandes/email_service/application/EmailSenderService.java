package com.fernandes.email_service.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernandes.email_service.adapters.EmailSenderGateway;
import com.fernandes.email_service.core.EmailSanderUseCase;

@Service
public class EmailSenderService implements EmailSanderUseCase {

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailGateway){
        this.emailSenderGateway = emailGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to, subject, body);
    }

}
