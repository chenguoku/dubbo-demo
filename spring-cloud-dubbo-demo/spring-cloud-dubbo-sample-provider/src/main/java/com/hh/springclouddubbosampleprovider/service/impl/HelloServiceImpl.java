package com.hh.springclouddubbosampleprovider.service.impl;

import com.hh.springclouddubbosampleapi.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Classname: HelloServiceImpl
 * @Description: 实现类
 * @Author: chenguoku
 * @Date 2020-9-10
 * @Version V1.0
 */
@Service
public class HelloServiceImpl implements HelloService {

    public String sayHello(String name) {

        return "Hello " + name;
    }
}
