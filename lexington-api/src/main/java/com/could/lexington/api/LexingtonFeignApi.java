package com.could.lexington.api;

import com.could.lexington.constants.ApplicationNameConst;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = ApplicationNameConst.APPLICATION_NAME)
public class LexingtonFeignApi {
}
