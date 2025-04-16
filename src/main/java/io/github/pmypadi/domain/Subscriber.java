package io.github.pmypadi.domain;

import lombok.Data;

import java.net.http.WebSocket;

@Data
public class Subscriber {
    private String id;
    WebSocket socket;

    public Subscriber(String id) {
        this.id = id;
    }

    public void doSomething() {

    }
}

