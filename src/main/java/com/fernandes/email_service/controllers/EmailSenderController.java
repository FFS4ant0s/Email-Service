package com.fernandes.email_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fernandes.email_service.application.EmailSenderService;
import com.fernandes.email_service.exception.EmailServiceException;

@RestController
@RequestMapping("/api/email")
public class EmailSenderController {

    private final EmailSenderService emailSenderService;

    @Autowired
    public EmailSenderController(EmailSenderService emailService){
        this.emailSenderService = emailService;
    }

    @PostMapping
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest request){
        try {
            this.emailSenderService.sendEmail(request.to(), request.subject(), request.body());
        } catch (EmailServiceException ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error while sending email");
        }
    }

}
