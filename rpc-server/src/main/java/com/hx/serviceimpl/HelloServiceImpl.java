package com.hx.serviceimpl;

import com.hx.annotation.RpcService;
import com.hx.api.HelloService;

/**
 * @author hawdies
 * @date 2021/5/7
 **/
@RpcService(group = "socketServiceTest", version = "1.0")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "服务端实现了sayHello()方法";
    }
}
