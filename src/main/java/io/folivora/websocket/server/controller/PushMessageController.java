package io.folivora.websocket.server.controller;

import io.folivora.websocket.server.model.PushMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class PushMessageController {
    @MessageMapping("/message")
    @SendTo("/topic/message")
    public void sendMessage(@Payload PushMessage pushMessage) {

    }
}