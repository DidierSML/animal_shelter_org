package com.example.animal_shelter_org.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="user_id")
    private Integer idUser;


    @NotBlank
    @Size(min=3,max=20, message = "Name must be at least 3 Characters long and 20 as maximum")
    private String name;

    @Email(message = "The String must be email type")
    @NotBlank(message = "must not be blank")
    private String email;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY,
            cascade = CascadeType.PERSIST,targetEntity = Animal.class)
    private Set<Animal> animalsList; //La lista de objetos va del lado del 1
}
