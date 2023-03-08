package com.example.animal_shelter_org.controller;

import com.example.animal_shelter_org.dto.AnimalDTO;
import com.example.animal_shelter_org.dto.UserDTO;
import com.example.animal_shelter_org.mapper.MapperAnimal;
import com.example.animal_shelter_org.model.Animal;
import com.example.animal_shelter_org.service.AnimalService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("api/animals")
public class AnimalController {
    private final MapperAnimal mapperAnimal;

    private final AnimalService animalService;


    @PostMapping("save")//solo save, sin user
    @ResponseStatus(HttpStatus.CREATED)
    public Animal saveAnimal (@RequestBody @Valid AnimalDTO animalDTO) {
        return animalService.save(mapperAnimal.dtoToModel(animalDTO));
    }

    @GetMapping("getAll")
    @ResponseStatus(HttpStatus.OK)
    public List<AnimalDTO> findAllAnimals(){
        return mapperAnimal.modelsToDtos(animalService.findAll());
    }


    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public AnimalDTO findById(@PathVariable(value = "id") Integer id) {
        return mapperAnimal.modelToDto(animalService.findById(id));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById (@PathVariable (value ="id") Integer id){
        AnimalDTO animalDTO = mapperAnimal.modelToDto(animalService.findById(id));
        animalService.deleteById(animalDTO.getIdAnimal());
    }

    @PutMapping("update")
    @ResponseStatus(HttpStatus.OK)
    public Animal updateAnimal (@RequestBody @Valid AnimalDTO animalDTO){
        return animalService.update(mapperAnimal.dtoToModel(animalDTO));
    }


}
