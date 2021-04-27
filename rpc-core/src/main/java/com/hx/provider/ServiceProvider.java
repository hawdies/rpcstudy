package com.hx.provider;

import entity.RpcServiceProperties;

/**
 * @author hawdies
 * @date 2021/4/27
 **/
public interface ServiceProvider {
    void addService(Object service, Class<?> serviceClass, RpcServiceProperties rpcServiceProperties);

    Object getService(RpcServiceProperties rpcServiceProperties);

    void publishService(Object service, RpcServiceProperties rpcServiceProperties);

    void publishService(Object service);
}
