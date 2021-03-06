package com.nickel.medicalrecord.config;

import com.nickel.medicalrecord.interceptor.WebInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    private WebInterceptor interceptor;

    private ApiConfig config;

    @Autowired
    public void setInterceptor(WebInterceptor interceptor) {
        this.interceptor = interceptor;
    }

    @Autowired
    public void setConfig(ApiConfig config) {
        this.config = config;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        if (config.isInterceptor()) {
            registry.addInterceptor(interceptor)
                    .addPathPatterns("/api/**")
                    .excludePathPatterns("/api/user/login", "/api/user/reset", "/api/user/authCode");
        }
    }
}
