package ie.atu.week10.eventmanagementplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestEventManagementPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.from(EventManagementPlatformApplication::main).with(TestEventManagementPlatformApplication.class).run(args);
    }

}
