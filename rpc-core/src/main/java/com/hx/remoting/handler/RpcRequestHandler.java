package com.hx.remoting.handler;

import com.hx.provider.ServiceProvider;
import com.hx.provider.ServiceProviderImpl;
import com.hx.remoting.dto.RpcRequest;
import exception.RpcException;
import factory.SingletonFactory;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author hawdies
 * @date 2021/5/6
 **/
@Slf4j
public class RpcRequestHandler {
    private final ServiceProvider serviceProvider;

    public RpcRequestHandler() {
        serviceProvider = SingletonFactory.getInstance(ServiceProviderImpl.class);
    }

    public Object handler(RpcRequest request) {
        Object service = serviceProvider.getService(request.toRpcProperties());
        return invokeTargetMethod(request, service);
    }

    private Object invokeTargetMethod(RpcRequest request, Object service) {
        Object result;
        try {
            Method method = service.getClass().getMethod(request.getMethodName());
            result = method.invoke(service, request.getParameters());
            log.info("service: [{}] successful invoke method: [{}]", request.getInterfaceName(), request.getMethodName());
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RpcException(e.getMessage(), e);
        }
        return result;
    }
}
