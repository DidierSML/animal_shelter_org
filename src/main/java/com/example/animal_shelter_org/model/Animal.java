package com.example.animal_shelter_org.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="animal_id")
    private Integer idAnimal;

    @NotBlank(message = "must not be blank")
    @Size(min=3,max=20, message = "Name must be at least 3 Characters long and 10 as maximum")
    private String name;

    @Min(0)
    @Max(30)
    private int age;

    // @NotBlank(message = "must not be blank")
    // @Size( message = "Only those Species are allowed: CANINE, FELINE or HAMSTER")
    @Enumerated(EnumType.STRING) //For use enum in Specie
    private Specie specie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id") //Este @ indica que esta propiedad es la clave foranea de la Clase User
    //reference name was modify for the same name as column name
    private User user;

}
