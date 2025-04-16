package io.github.pmypadi.domain;


import java.net.http.WebSocket;
public record Subscriber (String id, String topic, WebSocket socket) {}

