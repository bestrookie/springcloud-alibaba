package com.bestrookie.controller;

import com.bestrookie.feignclient.ProductClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bestrookie
 * @date 2021/8/19 3:08 下午
 */
@RestController
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private ProductClient productClient;
    @GetMapping("/user")
    public String invokeProduct(){
        log.info("调用用户服务");
        String result = productClient.product(21);
        return "调用用户服务成功："+ result;
    }

}
