package com.primarchan.feign.controller;

import com.primarchan.feign.feign.common.dto.BaseResponseInfo;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/target_server")
@RestController
public class TargetController {

    @GetMapping("/get")
    public BaseResponseInfo demoGet(@RequestHeader("CustomHeaderName") String header,
                                    @RequestParam("name") String name,
                                    @RequestParam("age") Long age) {

        return BaseResponseInfo.builder()
                .header(header)
                .name(name + " from target server")
                .age(age)
                .build();
    }

}
