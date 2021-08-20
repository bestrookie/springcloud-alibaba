package com.bestrookie.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author bestrookie
 * @date 2021/8/19 3:46 下午
 */
@FeignClient("PRODUCTS")
public interface ProductClient {
    @GetMapping("/product")
    public String product(@RequestParam(value = "id") Integer id);
}
