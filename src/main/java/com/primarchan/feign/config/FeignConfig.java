package com.primarchan.feign.config;

import com.primarchan.feign.feign.interceptor.DemoFeignInterceptor;
import com.primarchan.feign.feign.logger.FeignCustomLogger;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public DemoFeignInterceptor feignInterceptor() {
        return DemoFeignInterceptor.of();
    }

    @Bean
    public Logger feignLogger() {
        return new FeignCustomLogger();
    }

}
