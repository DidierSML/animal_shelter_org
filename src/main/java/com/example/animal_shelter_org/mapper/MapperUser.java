package com.example.animal_shelter_org.mapper;

import com.example.animal_shelter_org.dto.UserDTO;
import com.example.animal_shelter_org.model.User;
import jakarta.validation.Valid;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapperUser {

    MapperUser INSTANCE = Mappers.getMapper(MapperUser.class);

    User dtoToModel (@Valid UserDTO userDTO);

    @InheritInverseConfiguration
    UserDTO modelToDto (@Valid User user);

    List<UserDTO> modelsToDtos (@Valid List<User> userLists);


}
