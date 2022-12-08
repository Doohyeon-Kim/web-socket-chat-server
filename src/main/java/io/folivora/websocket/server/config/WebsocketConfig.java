package io.folivora.websocket.server.config;

import io.folivora.websocket.server.handler.WebSocketHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.*;


@Configuration
@EnableWebSocket
public class WebsocketConfig implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(new WebSocketHandler(), "/webSocketHandler").setAllowedOrigins("*");
        registry.addHandler(new WebSocketHandler(), "/webSocketHandler").setAllowedOrigins("*").withSockJS();
    }
}

//@Configuration
//@EnableWebSocketMessageBroker
//public class WebsocketConfig implements WebSocketMessageBrokerConfigurer {
//
//    @Override
//    public void registerStompEndpoints(StompEndpointRegistry registry) {
//        registry.addEndpoint("/web-socket");
//        registry.addEndpoint("/web-socket").withSockJS();
//    }
//
//    @Override
//    public void configureMessageBroker(MessageBrokerRegistry registry) {
//        registry.enableSimpleBroker("/topic");
//        registry.setApplicationDestinationPrefixes("/app");
//    }
//
//    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
//        registry.addHandler(new WebSocketHandler(), "/webSocketHandler").setAllowedOrigins("*");
//        registry.addHandler(new WebSocketHandler(), "/webSocketHandler").setAllowedOrigins("*").withSockJS();
//    }
//}