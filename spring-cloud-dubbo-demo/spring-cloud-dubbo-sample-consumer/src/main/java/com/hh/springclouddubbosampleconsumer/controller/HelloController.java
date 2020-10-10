package com.hh.springclouddubbosampleconsumer.controller;

import com.hh.springclouddubbosampleapi.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname: HelloController
 * @Description: TODO
 * @Author: chenguoku
 * @Date 2020-10-10
 * @Version V1.0
 */
@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @GetMapping("say/{name}")
    public String sayHello(@PathVariable(name = "name") String name) {
        String result = helloService.sayHello(name);
        return result;
    }


}
