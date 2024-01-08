package com.example.examples;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class RetryExecutor {
    private final RetryCreatedByFactoryExample retryCreatedByFactoryExample;
    private final RetrySingletonExample retrySingletonExample;

    public RetryExecutor(
        RetryCreatedByFactoryExample retryCreatedByFactoryExample,
        RetrySingletonExample retrySingletonExample
    ) {
        this.retryCreatedByFactoryExample = retryCreatedByFactoryExample;
        this.retrySingletonExample = retrySingletonExample;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void executeRetryExample() {
        try {
            System.out.println("Executing retryMe in a class created using @Component");
            retrySingletonExample.retryMe();
        } catch (Exception ex) {
            System.out.println("Done");
        }
    }

    @EventListener(ApplicationReadyEvent.class)
    public void executeRetryExampleFactoryBean() {
        try {
            System.out.println("Executing retryMe in class created by factory");
            retryCreatedByFactoryExample.retryMe();
        } catch (Exception ex) {
            System.out.println("Done");
        }
    }
}
