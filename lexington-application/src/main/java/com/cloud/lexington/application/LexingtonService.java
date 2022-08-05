package com.cloud.lexington.application;

import com.could.lexington.api.LexingtonFeignApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LexingtonService implements LexingtonFeignApi {
    @Override
    public String sayHello() {
        return "hello World!";
    }
}
