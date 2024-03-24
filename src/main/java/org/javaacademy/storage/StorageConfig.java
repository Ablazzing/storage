package org.javaacademy.storage;

import org.javaacademy.storage.worker.Worker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StorageConfig {

    @Bean
    public Worker zelya() {
        return new Worker("zelya");
    }

    @Bean
    public Worker mishka() {
        return new Worker("mishka");
    }
}
