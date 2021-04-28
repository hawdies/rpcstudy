package com.hx.provider;

import entity.RpcServiceProperties;

import java.util.Map;
import java.util.Set;

/**
 * @author hawdies
 * @date 2021/4/28
 **/
public class ServiceProviderImpl implements ServiceProvider {
//    private final Map<String, Object> serviceMap;
//    private final Set<String> registeredService;
    // todo 注册配置

    @Override
    public void addService(Object service, Class<?> serviceClass, RpcServiceProperties rpcServiceProperties) {

    }

    @Override
    public Object getService(RpcServiceProperties rpcServiceProperties) {
        return null;
    }

    @Override
    public void publishService(Object service, RpcServiceProperties rpcServiceProperties) {

    }

    @Override
    public void publishService(Object service) {

    }
}
