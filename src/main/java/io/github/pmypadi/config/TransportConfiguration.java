package io.github.pmypadi.config;

import io.github.pmypadi.transport.PushPullWebSocketServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TransportConfiguration {

    @Bean
    public PushPullWebSocketServer pushPullWebSocketServer(int port) {
        return new PushPullWebSocketServer(port);
    }
}
