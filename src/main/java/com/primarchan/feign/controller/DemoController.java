package com.primarchan.feign.controller;

import com.primarchan.feign.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class DemoController {

    private final DemoService demoService;

    @GetMapping("/get") // -> url prefix + /get -> http://localhost:8080/target_server/get
    public String getController() {

        return demoService.get();
    }

}
