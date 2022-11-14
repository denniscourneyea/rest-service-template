package ca.denniscourneyea.service.impl.status;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class StatusServiceTest {

    private final StatusService service = new StatusService("version");

    @Test
    public void getStatus() {
        assertNotNull(service.getStatus().getTimestamp());
        assertNotNull(service.getStatus().getVersion());
    }

}
