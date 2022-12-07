package io.folivora.ws.api.controller;

import io.folivora.ws.api.model.PushMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {
    @MessageMapping("/send")
    @SendTo("/topic/public")
    public PushMessage sendMessage(@Payload PushMessage message) {
        return message;
    }
}