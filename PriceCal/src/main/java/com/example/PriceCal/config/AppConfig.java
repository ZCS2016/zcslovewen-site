package com.example.PriceCal.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.example.PriceCal.dao")
public class AppConfig {
}
