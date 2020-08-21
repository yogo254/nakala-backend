package com.yogo.nakalabackend.controler;

import com.yogo.nakalabackend.domain.Login;
import com.yogo.nakalabackend.domain.Person;
import com.yogo.nakalabackend.repo.PersonRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/auth")
public class Auth {

    @Autowired
    private PersonRepo personRepo;

    @PostMapping("/signup")

    public void addPerson(@RequestBody Person person) {
        personRepo.save(person);
    }

    @PostMapping("/login")
    public String login(@RequestBody Login login) {

        Person person = personRepo.findOneByEmail(login.getEmail());
        if (!person.equals(null)) {
            if (person.getPassword().equals(login.getPassword()))
                return "success";
            else
                return "invalid credentials";
        } else
            return "invalid user";

    }

}