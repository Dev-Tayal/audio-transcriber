package com.audio.Audio_Transciber;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

   public void addCorsMappings(CorsRegistry registry) {
       registry.addMapping("/**")
               .allowCredentials(true)
               .allowedMethods("GET", "POST","PUT","DELETE")
               .allowedOrigins("http://localhost:5173/")
               .allowedHeaders("*");
    }
}
