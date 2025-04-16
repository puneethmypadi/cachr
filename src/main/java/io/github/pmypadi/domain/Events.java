package io.github.pmypadi.domain;

public enum Events {
    SUBSCRIBE("subscribe"), UNSUBSCRIBE("unsubscribe"), PUBLISH("publish"), SUBSCRIBE_WITH_CACHE("subscribe_with_cache"),
    DELETE_CACHE("delete_cache");
    private String event;

    private Events(String event) {
        this.event = event;
    }
    public String getEvent() {
        return event;
    }
    public Events fromString(String event) {
        for (Events e : Events.values()) {
            if (e.getEvent().equals(event.toLowerCase().trim())) {
                return e;
            }
        }
        throw new IllegalArgumentException("No enum constant " + Events.class.getCanonicalName() + "." + event);
    }
}
