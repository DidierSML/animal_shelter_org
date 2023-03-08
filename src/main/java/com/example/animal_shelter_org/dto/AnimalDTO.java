package com.example.animal_shelter_org.dto;
import com.example.animal_shelter_org.model.Specie;
import com.example.animal_shelter_org.model.User;
import lombok.Data;

@Data
public class AnimalDTO {

    private Integer idAnimal;

    private String name;
    private int age;
    private Specie specie; //modificado a enum Specie
    private User user; // agregando dato (Many To One)
}
