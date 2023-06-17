package com.abacus.usersvc.config;

import com.abacus.usersvc.part.PartRepository;
import com.abacus.usersvc.part.PartRepositoryOnMemory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PartRepository partRepository() {
        return new PartRepositoryOnMemory();
    }
}
