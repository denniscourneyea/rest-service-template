package ca.denniscourneyea.service.impl.status;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class StatusResponseBuilderTest {

    @Test
    public void testVersion() {
        final String version = "Test Version";
        final StatusResponse response = new StatusResponseBuilder()
                .version(version)
                .toResponse();

        assertNotNull(response.getTimestamp());
        assertSame(version, response.getVersion());
    }

}
