package io.github.pmypadi.domain;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;

@RequiredArgsConstructor
@Component
public class TransportContainer {

    private ConcurrentHashMap<String, Subscriber> subscribers = new ConcurrentHashMap<>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.put(subscriber.id(), subscriber);
    }

    public void removeSubscriber(String id) {
        subscribers.remove(id);
    }

    public void notifySubscribers(MessageContainer messageContainer) {

    }

    public Subscriber getSubscriber(String id) {
        return subscribers.get(id);
    }
}
