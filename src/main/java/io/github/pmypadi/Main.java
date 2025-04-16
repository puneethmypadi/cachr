package io.github.pmypadi;

import io.github.pmypadi.transport.PushPullWebSocketServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("io.github.pmypadi")
@Slf4j
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        log.info("Starting PushPullWebSocketServer");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);
        log.info("PushPullWebSocketServer started");
    }

}