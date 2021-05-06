package com.hx.remoting.transport.netty.server;

import com.hx.provider.ServiceProvider;
import com.hx.provider.ServiceProviderImpl;
import entity.RpcServiceProperties;
import factory.SingletonFactory;

/**
 * @author hawdies
 * @date 2021/5/6
 **/
public class NettyRpcServer {
    public static final int PORT = 9998;
    private final ServiceProvider serviceProvider = SingletonFactory.getInstance(ServiceProviderImpl.class);

    public void registerService(Object sersvice, RpcServiceProperties rpcServiceProperties) {
        serviceProvider.publishService(sersvice, rpcServiceProperties);
    }

    public void start() {
        // todo 2021-05-06
    }
}
