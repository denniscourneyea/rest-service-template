package ca.denniscourneyea.service.impl;

import java.time.ZonedDateTime;

public abstract class AbstractResponseBuilder<R extends Response> {
    protected final R response;

    protected AbstractResponseBuilder(R response) {
        this.response = response;
    }

    public R toResponse() {
        this.response.setTimestamp(ZonedDateTime.now().toString());
        return this.response;
    }

}
