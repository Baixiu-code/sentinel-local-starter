package com.baixiu.middleware.sentinel.local.service;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

/**
 * cache loader  
 * @author baixiu
 * @date 创建时间 2024/6/5 3:52 PM
 */
@Component("limitCacheLoader")
public class CacheLoader implements com.github.benmanes.caffeine.cache.CacheLoader<String, AtomicLong> {

    @Override
    public @Nullable AtomicLong load(@NonNull String s) throws Exception {
        return new AtomicLong(0);
    }
}
