package com.baixiu.middleware.sentinel.local.service;

import com.baixiu.middleware.sentinel.local.api.SentinelLocalService;
import com.baixiu.middleware.cache.local.cache.CaffeineCache;
import com.baixiu.middleware.sentinel.local.util.SpringContextUtil;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

/**
 * caffeine sentinel service
 * @author baixiu
 * @date 创建时间 2024/6/4 2:03 PM
 */
@Component
public class CaffeineSentinelLocalService implements SentinelLocalService {
    
    
    @Override
    public boolean isLimitByKey(String key) {
        CaffeineCache limitCaffeineCache=SpringContextUtil.getBeanByName ("limitCaffeineCache");
        AtomicLong count =(AtomicLong) limitCaffeineCache.getByLoadCache(key);
        count.incrementAndGet ();
        System.out.println ("isLimitByKey:"+key+"count:"+count.longValue());
        return count.longValue ()>0L;
    }

}
