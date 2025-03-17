package com.LeetcodeGen.services;


import com.LeetcodeGen.dtos.UserRequestDto;
import com.LeetcodeGen.models.User;
import com.LeetcodeGen.repositories.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
    public User findById(UUID id){
        return userRepository.findById(id).orElseThrow(()-> new RuntimeException("Cannot be found"));
    }
    public User createUser(UserRequestDto userDto){
        var user = new User();
        BeanUtils.copyProperties(userDto, user);
        return userRepository.save(user);
    }
    public User updateUser(UUID id, UserRequestDto userDto){
        var user = findById(id);
        BeanUtils.copyProperties(userDto, user);
        return userRepository.save(user);
    }

}
