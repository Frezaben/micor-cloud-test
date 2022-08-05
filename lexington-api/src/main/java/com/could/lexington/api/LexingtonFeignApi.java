package com.could.lexington.api;

import com.could.lexington.constants.ApplicationNameConst;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = ApplicationNameConst.APPLICATION_NAME)
public interface LexingtonFeignApi {
    @RequestMapping("/home/hello")
    String sayHello();
}
