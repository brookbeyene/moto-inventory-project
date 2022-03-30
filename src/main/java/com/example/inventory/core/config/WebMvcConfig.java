package com.example.inventory.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedMethods("*")
                .allowedOrigins("https://team-project-bcd.web.app/")
                .allowedHeaders("*")
                .allowCredentials(false)
                .maxAge(-1);
    }
}
