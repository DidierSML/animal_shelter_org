package com.example.animal_shelter_org.repository;

import com.example.animal_shelter_org.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository <Animal,Integer> {
}
