package com.primarchan.feign.feign.interceptor;

import feign.Request;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.nio.charset.StandardCharsets;

@Slf4j
@RequiredArgsConstructor(staticName = "of")
public class DemoFeignInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {

        // get 요청일 경우
        if (template.method() == Request.HttpMethod.GET.name()) {
            log.info("[GET] [DemoFeignInterceptor] queries : {}", template.queries());
            return;
        }

        // post 요청일 경우
        String encodedRequestBody = StringUtils.toEncodedString(template.body(), StandardCharsets.UTF_8);
        log.info("[POST] [DemoFeignInterceptor] requestBody : {}", encodedRequestBody);

        // 추가적으로 필요한 로직 추가

        String convertRequestBody = encodedRequestBody;
        template.body(convertRequestBody);

    }

}
