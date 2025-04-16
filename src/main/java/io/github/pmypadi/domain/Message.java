package io.github.pmypadi.domain;

import lombok.Data;

@Data
public class Message {
    private String id;
    private String message;
    private String sender;
    private long timestamp;
}
