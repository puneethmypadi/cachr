package io.github.pmypadi.transport;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;

public class PushPullWebSocketServer extends WebSocketServer {

    private static final Logger log = LoggerFactory.getLogger(PushPullWebSocketServer.class);
    public PushPullWebSocketServer(int port) {
        super(new InetSocketAddress(port));
        setDaemon(false);
    }

    @Override
    public void onOpen(WebSocket webSocket, ClientHandshake clientHandshake) {
        log.info("New connection opened");
    }

    @Override
    public void onClose(WebSocket webSocket, int i, String s, boolean b) {
        log.info("Connection closed");
    }

    @Override
    public void onMessage(WebSocket webSocket, String s) {
        if (s.toLowerCase().startsWith("subscribe")) {
            log.info("subscribe message received");
//            log.info("Generated random string: {}", randomString);
        }
    }

    @Override
    public void onError(WebSocket webSocket, Exception e) {

    }

    @Override
    public void onStart() {

    }

}
