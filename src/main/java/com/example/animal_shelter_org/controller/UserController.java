package com.example.animal_shelter_org.controller;

import com.example.animal_shelter_org.dto.UserDTO;
import com.example.animal_shelter_org.mapper.MapperUser;
import com.example.animal_shelter_org.model.User;
import com.example.animal_shelter_org.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/users")
public class UserController {

    private final MapperUser mapperUser;

    private final UserService userService;


    @PostMapping("save")//solo save, sin user
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser (@RequestBody @Valid UserDTO userDTO) {
        return userService.save(mapperUser.dtoToModel(userDTO));
    }

    @GetMapping("getAll")
    @ResponseStatus(HttpStatus.OK)
    public List<UserDTO> findAllUser(){
        return mapperUser.modelsToDtos(userService.findAll());
    }


    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserDTO findById(@PathVariable(value = "id") Integer id) {
        return mapperUser.modelToDto(userService.findById(id));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById (@PathVariable (value ="id") Integer id){
        UserDTO userDTO = mapperUser.modelToDto(userService.findById(id));
        userService.deleteById(userDTO.getIdUser());
    }

    @PutMapping("update")
    @ResponseStatus(HttpStatus.OK)
    public User updateUser (@RequestBody @Valid UserDTO userDTO){
        return userService.update(mapperUser.dtoToModel(userDTO));
    }
}
