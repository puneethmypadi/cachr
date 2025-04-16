package io.github.pmypadi.handlers;

import io.github.pmypadi.domain.Subscriber;
import io.github.pmypadi.domain.Subscription;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

//@Component
public class SubscriptionHandler {
    AtomicInteger idGenerator = new AtomicInteger(0);
    private ConcurrentHashMap<String, Subscription> subscriptions = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, Subscriber> subscribers = new ConcurrentHashMap<>();


    public Subscription initSubscription() {
        var id = idGenerator.incrementAndGet();

        return null;
    }

    public void deleteSubscription() {
    }


}
