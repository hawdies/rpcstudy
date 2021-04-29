package com.hx.provider;

import com.hx.registry.ServiceRegistry;
import entity.RpcServiceProperties;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author hawdies
 * @date 2021/4/28
 **/
public class ServiceProviderImpl implements ServiceProvider {
    private final Map<String, Object> serviceMap;
    private final Set<String> registeredService;
    private final ServiceRegistry serviceRegistry;

    public ServiceProviderImpl() {
        serviceMap = new ConcurrentHashMap<>();
        registeredService = ConcurrentHashMap.newKeySet();
        // todo 服务发现spi
        serviceRegistry =
    }

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
