package com.example.animal_shelter_org.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Auto
    private Integer idUser;

    @NotBlank
    @Size(min=3,max=20, message = "Name must be at least 3 Characters long and 20 as maximum")
    private String name;

    @Email(message = "The String must be email type")
    @NotBlank(message = "must not be blank")
    private String email;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL, orphanRemoval = true)// targetEntity = Animal.class)change cascade type persist for all, orphan remove elimina los Animales que no tengan dueño
    private List<Animal> animalsList; //La lista de objetos va del lado del 1

//    public void addAnimalToUser(Animal animal) {
//        animalsList.add(animal);
//        animal.setUser(this);
//    }
//
//    public void removeAnimalToUser (Animal animal) {
//        animalsList.remove(animal);
//        animal.setUser(null);
//    }

}
