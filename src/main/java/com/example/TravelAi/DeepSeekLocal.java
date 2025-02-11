package com.example.TravelAi;


import com.example.TravelAi.Model.TravelInput;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class DeepSeekLocal {
    private final ChatClient chatClient;

    @Autowired
    private TravelService travelService;

    public DeepSeekLocal(@Qualifier("ollamaChatClient") ChatClient  chatClient){
        this.chatClient = chatClient;
    }


    @PostMapping("/deepseeklocal/")
    public String chat() {
        TravelInput travelInput = new TravelInput();
        String m = travelService.TravelInputGenerator(travelInput);
        return chatClient
                .prompt()
                .user(m)
                .call()
                .content();
    }
}
