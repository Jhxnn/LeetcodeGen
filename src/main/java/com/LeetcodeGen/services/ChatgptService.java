package com.LeetcodeGen.services;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ChatgptService {
    private final ChatClient chatClient;



    public ChatgptService(ChatClient.Builder chatClient) {
        this.chatClient = chatClient.build();
    }

    public String perguntar(String pergunta) {
        return chatClient.prompt().user(pergunta)
                .call()
                .content();
    }
}
