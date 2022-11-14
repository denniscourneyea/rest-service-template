package ca.denniscourneyea.service.impl.common;

import java.time.Instant;

public abstract class Response {

    private Instant timestamp;

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
}
