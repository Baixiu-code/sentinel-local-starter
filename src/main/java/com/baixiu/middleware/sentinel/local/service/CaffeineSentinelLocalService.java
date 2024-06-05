package com.baixiu.middleware.sentinel.local.service;

import com.baixiu.middleware.sentinel.local.api.SentinelLocalService;
import com.baixiu.middleware.sentinel.local.cache.CaffeineCache;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

/**
 * caffeine sentinel
 * @author baixiu
 * @date 创建时间 2024/6/4 2:03 PM
 */
@Component
public class CaffeineSentinelLocalService implements SentinelLocalService , ApplicationContextAware {
    
    private CaffeineCache limitCaffeineCache;
    
    @Override
    public boolean isLimitByKey(String key) {
        Long count =(Long) limitCaffeineCache.getByLoadCache (key);
        return count>0L;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //limitCaffeineCache=(CaffeineCache)applicationContext.getBean ("limitCaffeineCache");
    }
}
