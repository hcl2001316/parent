package com.first.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 黄成龙
 * @description 全局解决跨域问题
 */
//@Configuration
//public class CorsConfig {
//    @Bean
//    public WebMvcConfigurer myCorsConfig(){
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                WebMvcConfigurer.super.addCorsMappings(registry);
//                registry.addMapping("/**")
//                        .allowedOrigins("*")
//                        .maxAge(3600)
//                        .allowedMethods("GET","POST");
//            }
//        };
//    }
//}
