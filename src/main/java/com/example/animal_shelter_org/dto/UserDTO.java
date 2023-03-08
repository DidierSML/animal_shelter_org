package com.example.animal_shelter_org.dto;
import com.example.animal_shelter_org.model.Animal;
import lombok.Data;

import java.util.Set;

@Data
public class UserDTO {

    private Integer idUser;

    private String name;
    private String email;
    private Set<Animal> animalList;

}
