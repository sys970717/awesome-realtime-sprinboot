package io.sys.application.domain;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class PubMessage {
    private String name;
    private String message;
    private long timestamp;

    public PubMessage(String name) {
        this.name = name;
        this.timestamp = ZonedDateTime.now().toEpochSecond();
    }

    public PubMessage(String name, String message) {
        this.name = name;
        this.message = message;
        this.timestamp = ZonedDateTime.now().toEpochSecond();
    }
}
