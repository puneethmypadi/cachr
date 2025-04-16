package io.github.pmypadi.domain;

import org.java_websocket.WebSocket;

public sealed interface Command permits PublishCommand, SubscribeCommand, UnsubscribeCommand {
    void execute(WebSocket webSocket, String message);
}
