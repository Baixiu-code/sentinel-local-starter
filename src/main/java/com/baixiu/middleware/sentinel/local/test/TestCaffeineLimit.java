package com.baixiu.middleware.sentinel.local.test;

import com.baixiu.middleware.sentinel.local.Application;
import com.baixiu.middleware.sentinel.local.api.SentinelLocalService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * test caffeine limit
 * @author baixiu
 * @date 创建时间 2024/6/5 11:04 AM
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ComponentScan(basePackages={"com.baixiu.middleware"})
@TestPropertySource("classpath:spring-caffeine.properties")
public class TestCaffeineLimit {
    
    @Autowired
    private SentinelLocalService sentinelLocalService;
    
    @Test
    public void testIsFlowLimit(){
        boolean isLimit=sentinelLocalService.isLimitByKey("testKey");
        System.out.println(isLimit?"被限流啦.":"安全通过");
    }
    
}
