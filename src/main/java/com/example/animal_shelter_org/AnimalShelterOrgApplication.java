package com.example.animal_shelter_org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class AnimalShelterOrgApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalShelterOrgApplication.class, args);
	}

}
