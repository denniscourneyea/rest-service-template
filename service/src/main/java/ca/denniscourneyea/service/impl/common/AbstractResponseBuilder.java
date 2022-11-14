package ca.denniscourneyea.service.impl.common;

import java.time.Instant;

public abstract class AbstractResponseBuilder<R extends Response> {
    protected final R response;

    protected AbstractResponseBuilder(R response) {
        this.response = response;
    }

    public R toResponse() {
        this.response.setTimestamp(Instant.now());
        return this.response;
    }

}
