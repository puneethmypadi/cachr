package io.github.pmypadi.domain;

import java.net.http.WebSocket;

public class Publisher {

    private String id;
    private String topic;
    private String message;
    private WebSocket socket;
}
