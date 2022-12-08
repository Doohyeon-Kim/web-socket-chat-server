package io.folivora.websocket.server.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PushMessage {
    private String message;

    public void setMessage(String content) {
        this.message = message;
    }
}
