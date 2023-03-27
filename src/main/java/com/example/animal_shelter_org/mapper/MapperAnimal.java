package com.example.animal_shelter_org.mapper;

import com.example.animal_shelter_org.dto.AnimalDTO;
import com.example.animal_shelter_org.model.Animal;
import jakarta.validation.Valid;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapperAnimal {

    MapperAnimal INSTANCE = Mappers.getMapper(MapperAnimal.class);

    Animal dtoToModel (@Valid AnimalDTO animalDTO);

    @InheritInverseConfiguration
    AnimalDTO modelToDto (@Valid Animal animal);

    List<AnimalDTO> modelsToDtos (@Valid List<Animal> animalLists);

}
