package com.example.springboottemplate.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @author 30号男朋友
 * @ClassName: WebMvcConfig
 * @Description: 配置springboot web项目uri统一前缀 "/api",访问静态资源时则忽略。
 * @date 2021年06月12日 4:25 上午
 */
@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.addPathPrefix("/api", c -> c.isAnnotationPresent(RestController.class ) ||
                c.isAnnotationPresent(Controller.class));
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/resources/");
    }
}
