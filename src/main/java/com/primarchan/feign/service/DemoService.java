package com.primarchan.feign.service;

import com.primarchan.feign.feign.client.DemoFeignClient;
import com.primarchan.feign.feign.common.dto.BaseRequestInfo;
import com.primarchan.feign.feign.common.dto.BaseResponseInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class DemoService {

    private final DemoFeignClient demoFeignClient;

    public String get() {
        ResponseEntity<BaseResponseInfo> response = demoFeignClient.callGet("CustomHeader", "CustomName", 1L);

        log.info("Name : {}", response.getBody().getName());
        log.info("Age : {}", response.getBody().getAge());
        log.info("Header : {}", response.getBody().getHeader());

        return "get";
    }

    public String post() {
        BaseRequestInfo baseRequestInfo = BaseRequestInfo.builder()
                .name("customName")
                .age(2L)
                .build();
        ResponseEntity<BaseResponseInfo> response = demoFeignClient.callPost("CustomHeader", baseRequestInfo);

        log.info("Name : {}", response.getBody().getName());
        log.info("Age : {}", response.getBody().getAge());
        log.info("Header : {}", response.getBody().getHeader());

        return "post";
    }
}
