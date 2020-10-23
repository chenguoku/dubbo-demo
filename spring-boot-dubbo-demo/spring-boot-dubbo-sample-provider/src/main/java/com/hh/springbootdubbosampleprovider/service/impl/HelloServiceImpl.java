package com.hh.springbootdubbosampleprovider.service.impl;

import com.hh.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Classname: HelloServiceImpl
 * @Description: HelloService实现类
 * @Author: chenguoku
 * @Date 2020-10-13
 * @Version V1.0
 */
@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
