package com.fernandes.email_service.core;

public interface EmailSanderUseCase {

    void sendEmail(String to, String subject, String body);
}
