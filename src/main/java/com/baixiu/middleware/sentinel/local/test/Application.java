package com.baixiu.middleware.sentinel.local.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;

/**
 * test application
 * @author baixiu
 * @date 创建时间 2024年06月05日
 */
@PropertySource(value = {
        "classpath:spring-caffeine.properties",
}, encoding = "utf-8")
@SpringBootApplication(scanBasePackages={"com.baixiu.middleware"})
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
        System.out.println ("limit middleware.test started");
    }
    
    
}
