package com.LeetcodeGen.services;


import com.LeetcodeGen.dtos.SolveDto;
import com.LeetcodeGen.models.Solve;
import com.LeetcodeGen.repositories.SolveRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SolveService {

    @Autowired
    SolveRepository solveRepository;

    public List<Solve> findAll(){
        return solveRepository.findAll();
    }
    public Solve findById(UUID id){
        return solveRepository.findById(id).orElseThrow(()-> new RuntimeException("Cannot be found"));
    }
    public Solve createSolve(SolveDto solveDto){
        var solve = new Solve();
        BeanUtils.copyProperties(solveDto, solve);
        return solveRepository.save(solve);
    }
    public Solve updateSolve(UUID id, SolveDto solveDto){
        var solve = findById(id);
        BeanUtils.copyProperties(solveDto, solve);
        return solveRepository.save(solve);
    }

}
