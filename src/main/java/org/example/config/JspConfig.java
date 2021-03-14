package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class JspConfig {
    @Configuration
    @ComponentScan("org.example.*")
    public class MyAppWebConfig extends WebMvcConfigurerAdapter {
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            // I tried these many combinations separately.

            ResourceHandlerRegistration resourceRegistration = registry
                    .addResourceHandler("resources/**");
            resourceRegistration.addResourceLocations("/resources/**");
            registry.addResourceHandler("/css/**").addResourceLocations("/css/**");
            registry.addResourceHandler("/img/**").addResourceLocations("/img/**");
            registry.addResourceHandler("/WEB-INF/views/js/**").addResourceLocations("/WEB-INF/views/js/**");
            registry.addResourceHandler("/resources/**")
                    .addResourceLocations("classpath:/resources/");
            // do the classpath works with the directory under webapp?
        }

    }
}
