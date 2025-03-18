package com.LeetcodeGen.services;


import com.LeetcodeGen.dtos.UserRequestDto;
import com.LeetcodeGen.dtos.UserResponseDto;
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
    public UserResponseDto findById(UUID id){
        var user = userRepository.findById(id).orElseThrow(()-> new RuntimeException("Cannot be found"));
        return new UserResponseDto(user.getEmail(), user.getName(), user.getSolves());
    }
    public UserResponseDto createUser(UserRequestDto userDto){
        var user = new User();
        BeanUtils.copyProperties(userDto, user);
        userRepository.save(user);
        return new UserResponseDto(user.getEmail(), user.getName(), user.getSolves());
    }


}
