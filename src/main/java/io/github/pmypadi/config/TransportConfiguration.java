package io.github.pmypadi.config;

import io.github.pmypadi.transport.PushPullWebSocketServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TransportConfiguration {

    @Bean
    public PushPullWebSocketServer pushPullWebSocketServer() {
        var server = new PushPullWebSocketServer(8399);
        server.start();
        return server;
    }
}
