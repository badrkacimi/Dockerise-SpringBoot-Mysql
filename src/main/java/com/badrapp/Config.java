package com.badrapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.badrapp.resource")
@Configuration
public class Config {


}
