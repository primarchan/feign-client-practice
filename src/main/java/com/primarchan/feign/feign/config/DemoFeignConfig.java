package com.primarchan.feign.feign.config;

import com.primarchan.feign.feign.decoder.DemoFeignErrorDecoder;
import com.primarchan.feign.feign.interceptor.DemoFeignInterceptor;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoFeignConfig {

    @Bean
    public DemoFeignErrorDecoder demoErrorDecoder() {

        return new DemoFeignErrorDecoder();
    }

}
