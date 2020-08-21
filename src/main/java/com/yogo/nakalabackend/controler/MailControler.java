package com.yogo.nakalabackend.controler;

import com.yogo.nakalabackend.config.CustomMailSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/mail")
public class MailControler {
    @Autowired
    private CustomMailSender mailSender;

    @GetMapping("/test/{email}")
    public String testMail(@PathVariable("email") String email) {

        mailSender.sendSimpleMessage(email, "hello", "hello");

        return "email sent to" + email;

    }

}