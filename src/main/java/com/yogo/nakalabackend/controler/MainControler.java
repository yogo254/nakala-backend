package com.yogo.nakalabackend.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import org.springframework.data.domain.Slice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.yogo.nakalabackend.config.CustomMailSender;
import com.yogo.nakalabackend.domain.Covid;
import com.yogo.nakalabackend.repo.CovidRepo;

/**
 * MainControler
 */
@RestController
@RequestMapping("/")
public class MainControler {
    @Autowired
    private CustomMailSender mailSender;

    @Autowired
    private CovidRepo covidRepo;

    @GetMapping("/alive")

    public String checkStatus() {
        return "app is alive";
    }

    @GetMapping("/location/{location}")

    public Slice<Covid> getByLocation(@PathVariable("location") String location) {

        return covidRepo.findAllByLocation(location, PageRequest.of(1, 10));

    }

    @PostMapping
    private void addCovid(@RequestBody Covid covid) {
        covidRepo.save(covid);
    }

    @GetMapping("/mail/{email}")
    public String testMail(@PathVariable("email") String email) {

        mailSender.sendSimpleMessage(email, "hello", "hello");

        return "email sent to" + email;

    }

}