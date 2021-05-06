package com.nickel.medicalrecord.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(
        prefix = "medical-record"
)
@Data
public class ApiConfig {


    public boolean interceptor = false;

}
