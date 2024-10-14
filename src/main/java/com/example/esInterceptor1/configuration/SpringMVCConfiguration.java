package com.example.esInterceptor1.configuration;

import com.example.esInterceptor1.interceptors.APILoggingInterceptor;
import com.example.esInterceptor1.interceptors.LegacyIntercepotr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SpringMVCConfiguration implements WebMvcConfigurer {

    @Autowired
    private APILoggingInterceptor apiLoggingInterceptor;

    @Autowired
    private LegacyIntercepotr legacyIntercepotr;

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(apiLoggingInterceptor);
        registry.addInterceptor(legacyIntercepotr);
    }
}
