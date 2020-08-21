package com.yogo.nakalabackend;

import java.util.Arrays;

import com.yogo.nakalabackend.domain.Covid;
import com.yogo.nakalabackend.repo.CovidRepo;
import com.yogo.nakalabackend.services.DataLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NakalaBackendApplication implements ApplicationRunner {
	@Autowired
	private CovidRepo covidRepo;

	public static void main(String[] args) {
		SpringApplication.run(NakalaBackendApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		if (covidRepo.count() == 0) {
			covidRepo.saveAll(DataLoader.loadData());

		}

		System.out.println("records in db : " + covidRepo.count());

	}

}
