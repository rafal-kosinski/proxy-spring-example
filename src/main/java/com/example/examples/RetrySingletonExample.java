package com.example.examples;

import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

@Component
public class RetrySingletonExample {

    @Retryable
    void retryMe() {
        System.out.println("Executing retryMe");
        throw new RuntimeException("Simulated error");
    }
}
