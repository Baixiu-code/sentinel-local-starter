package com.baixiu.middleware.sentinel.local.api;

/**
 * @author baixiu
 * @date 创建时间 2024/6/4 11:47 AM
 */
public interface SentinelLocalService {
    
    
    public boolean isLimitByKey(String key);
    
}
