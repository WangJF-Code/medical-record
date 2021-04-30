package com.nickel.medicalrecord.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(
        prefix = "data-api"
)
@Data
public class ApiConfig {


}
