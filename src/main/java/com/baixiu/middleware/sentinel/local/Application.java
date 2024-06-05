package com.baixiu.middleware.sentinel.local;

import com.baixiu.middleware.sentinel.local.util.SpringContextUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

/**
 * test application
 * @author baixiu
 * @date 创建时间 2024年06月05日
 */
@PropertySource(value = {
        "classpath:spring-caffeine.properties",
}, encoding = "utf-8")
@SpringBootApplication(scanBasePackages={"com.baixiu.middleware.cache.local","com.baixiu.middleware.sentinel.local"})
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        ApplicationContext ac=SpringApplication.run(Application.class);
        SpringContextUtil.refreshContext(ac);
        System.out.println ("limit middleware.test started");
    }
    
    
    
}
