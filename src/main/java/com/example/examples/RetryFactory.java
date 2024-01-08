package com.example.examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RetryFactory {
    @Bean
    RetryCreatedByFactoryExample retryCreatedByFactoryExample() {
        return new RetryCreatedByFactoryExample();
    }
}
