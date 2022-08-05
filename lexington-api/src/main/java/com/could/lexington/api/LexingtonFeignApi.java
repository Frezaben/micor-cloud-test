package com.could.lexington.api;

import org.springframework.web.bind.annotation.RequestMapping;


public interface LexingtonFeignApi {
    @RequestMapping("/home/hello")
    String sayHello();
}
