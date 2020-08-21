package com.yogo.nakalabackend.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.yogo.nakalabackend.domain.Covid;
import com.yogo.nakalabackend.repo.CovidRepo;

/**
 * MainControler
 */
@RestController
@RequestMapping("/")
public class MainControler {

    @Autowired
    private CovidRepo covidRepo;

    @GetMapping("/alive")

    public String checkStatus() {
        return "app is alive";
    }

    @GetMapping("location/{location}")

    public Slice<Covid> getByLocation(@PathVariable("location") String location) {

        return covidRepo.findAllByLocation(location, PageRequest.of(1, 10));

    }

}