package io.github.pmypadi.domain;

import com.google.gson.JsonParser;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RequiredArgsConstructor
public class MessageContainer {

    @Getter
    private String topic;
    private final Map<String, Message> messageMap = new ConcurrentHashMap<>();

    public String addMessage(Message message) {
        String messageId = getMessageId(message);
        messageMap.put(messageId, message);
        return messageId;
    }

    public Message getMessage(String messageId) {
        return messageMap.get(messageId);
    }

    public void removeMessage(String messageId) {
        messageMap.remove(messageId);
    }
    public void clear() {
        messageMap.clear();
    }

    public int size() {
        return messageMap.size();
    }

    public Collection<Message> getAll() {
        return messageMap.values();
    }

    private String getMessageId(Message message) {
        return JsonParser.parseString(message.toString()).getAsJsonObject().get("id").getAsString();
    }


}
