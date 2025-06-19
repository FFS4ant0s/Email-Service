package com.fernandes.email_service.exception;

public record EmailRequest(String to, String subject, String body) {
    
}
