package ca.denniscourneyea.service.impl.status;

import ca.denniscourneyea.service.impl.AbstractResponseBuilder;

class StatusResponseBuilder extends AbstractResponseBuilder<StatusResponse> {

    StatusResponseBuilder() {
        super(new StatusResponse());
    }

    StatusResponseBuilder version(String version) {
        this.response.setVersion(version);
        return this;
    }

}
