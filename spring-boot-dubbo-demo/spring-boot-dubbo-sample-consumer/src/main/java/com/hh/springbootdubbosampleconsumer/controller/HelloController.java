package com.hh.springbootdubbosampleconsumer.controller;

import com.hh.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname: HelloController
 * @Description: HelloController
 * @Author: chenguoku
 * @Date 2020-10-23
 * @Version V1.0
 */
@RestController
public class HelloController {

    @DubboReference
    private HelloService helloService;

    @GetMapping("hello/{name}")
    public String hello(@PathVariable(value = "name") String name) {
        String s = helloService.sayHello(name);
        return s;
    }

}
