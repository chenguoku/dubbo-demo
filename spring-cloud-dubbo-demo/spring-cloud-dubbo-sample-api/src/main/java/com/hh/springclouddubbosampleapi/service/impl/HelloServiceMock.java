package com.hh.springclouddubbosampleapi.service.impl;

import com.hh.springclouddubbosampleapi.service.HelloService;

/**
 * @Classname: HelloServiceMock
 * @Description: HelloService的服务降级
 * @Author: chenguoku
 * @Date 2020-11-17
 * @Version V1.0
 */
public class HelloServiceMock implements HelloService {
    @Override
    public String sayHello(String name) {
        System.out.println("mock：服务降级:" + name);
        return "mock:服务降级:" + name;
    }
}
