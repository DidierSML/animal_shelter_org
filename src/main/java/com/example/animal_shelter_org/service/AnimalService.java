package com.example.animal_shelter_org.service;

import com.example.animal_shelter_org.exception.NotFoundCustomException;
import com.example.animal_shelter_org.model.Animal;
import com.example.animal_shelter_org.model.User;
import com.example.animal_shelter_org.repository.AnimalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AnimalService {

    private final AnimalRepository animalRepository;

    public Animal save (Animal animal) { return animalRepository.save(animal);}
    public List<Animal> findAll(){return animalRepository.findAll();}
    public Animal findById (Integer id) {
        return animalRepository.findById(id).orElseThrow(() -> new NotFoundCustomException("User not found, please verify"));
    }

    public void deleteById (Integer id){ animalRepository.deleteById(id);}

    public Animal update(Animal animal){return animalRepository.save(animal);}
}