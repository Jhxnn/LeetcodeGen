package com.LeetcodeGen.controllers;

import com.LeetcodeGen.services.ChatgptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/leetcode")
public class LeetcodeController {


    @Autowired
    ChatgptService chatgptService;

    @GetMapping("/{pergunta}")
    public ResponseEntity<String> testeChat(@PathVariable(name = "pergunta")String pergunta){
        return ResponseEntity.status(HttpStatus.OK).body(chatgptService.perguntar(pergunta));
    }
}
