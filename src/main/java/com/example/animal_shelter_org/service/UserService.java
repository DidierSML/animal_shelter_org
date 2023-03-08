package com.example.animal_shelter_org.service;

import com.example.animal_shelter_org.exception.NotFoundCustomException;
import com.example.animal_shelter_org.model.User;
import com.example.animal_shelter_org.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User save (User animal) { return userRepository.save(animal);}
    public List<User> findAll(){return userRepository.findAll();}
    public User findById (Integer id) {
        return userRepository.findById(id).orElseThrow(() -> new NotFoundCustomException("User not found, please verify"));
    }

    public void deleteById (Integer id){ userRepository.deleteById(id);}

    public User update(User animal){return userRepository.save(animal);}
}
