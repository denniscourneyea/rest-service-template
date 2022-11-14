package ca.denniscourneyea.service.impl.common.status;

import ca.denniscourneyea.service.impl.common.Response;

public class StatusResponse extends Response {

    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
