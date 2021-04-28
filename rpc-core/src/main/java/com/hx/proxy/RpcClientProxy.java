package com.hx.proxy;

import entity.RpcServiceProperties;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author hawdies
 * @date 2021/4/27
 **/
@Slf4j
public class RpcClientProxy implements InvocationHandler {
    private static final String INTEFACE_NAME = "interfaceName";
//    private final RpcServiceProperties rpcServiceProperties;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
