package com.example.animal_shelter_org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories("com.example.animal_shelter_org.repository")
//@EntityScan("com.example.animal_shelter_org.model")
public class AnimalShelterOrgApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalShelterOrgApplication.class, args);
	}

}
