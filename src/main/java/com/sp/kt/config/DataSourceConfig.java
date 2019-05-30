package com.sp.kt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {

    @Bean("getData")
    public String getData(){
        return "123456";
    }
}
