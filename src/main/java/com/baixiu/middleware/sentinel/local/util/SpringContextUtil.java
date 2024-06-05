package com.baixiu.middleware.sentinel.local.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * static spring context util
 * @author baixiu
 * @date 创建时间 2024/6/5 10:40 AM
 */
@Component
public  class SpringContextUtil implements ApplicationContextAware {
    
    private static ApplicationContext applicationContext;
    
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextUtil.applicationContext = applicationContext;
    }
    
    public static <T> T getBeanByType(Class<T> tClass){
        return applicationContext.getBean(tClass);
    }
    
    public static <T> T getBeanByName(String beanName){
        return (T) applicationContext.getBean (beanName);
    }
    
    public static void refreshContext(ApplicationContext applicationContext){
        SpringContextUtil.applicationContext=applicationContext;
    }
}
