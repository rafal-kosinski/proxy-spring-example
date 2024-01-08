package com.example.examples;


import org.springframework.retry.annotation.Retryable;

public class RetryCreatedByFactoryExample {
    @Retryable
    void retryMe() {
        System.out.println("Executing retryMe");
        throw new RuntimeException("Simulated error");
    }
}
