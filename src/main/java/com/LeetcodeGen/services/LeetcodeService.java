package com.LeetcodeGen.services;


import com.LeetcodeGen.dtos.LeetcodeDto;
import com.LeetcodeGen.models.Leetcode;
import com.LeetcodeGen.repositories.LeetcodeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LeetcodeService {

    @Autowired
    LeetcodeRepository leetcodeRepository;

    public List<Leetcode> findAll(){
        return leetcodeRepository.findAll();
    }
    public Leetcode findById(UUID id){
        return leetcodeRepository.findById(id).orElseThrow(()-> new RuntimeException("Cannot be found"));
    }
    public Leetcode createLeetcode(LeetcodeDto leetcodeDto){
        var leetcode = new Leetcode();
        BeanUtils.copyProperties(leetcodeDto, leetcode);
        return leetcodeRepository.save(leetcode);
    }
    public Leetcode updateLeetcode(UUID id, LeetcodeDto leetcodeDto){
        var leetcode = findById(id);
        BeanUtils.copyProperties(leetcodeDto, leetcode);
        return leetcodeRepository.save(leetcode);
    }

}
