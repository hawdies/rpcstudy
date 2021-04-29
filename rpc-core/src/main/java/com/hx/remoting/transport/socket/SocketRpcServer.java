package com.hx.remoting.transport.socket;

import com.hx.provider.ServiceProvider;
import factory.SingletonFactory;
import lombok.extern.slf4j.Slf4j;
import utils.concurrent.threadpool.ThreadPoolFactoryUtils;

import java.util.concurrent.ExecutorService;

/**
 * @author hawdies
 * @date 2021/4/27
 **/
@Slf4j
public class SocketRpcServer {
    private final ExecutorService threadPool;
    private final ServiceProvider serviceProvider;

    public SocketRpcServer() {
        threadPool = ThreadPoolFactoryUtils.createCustomThreadPoolIfAbsent("socket-server-rpc-pool");
        // todo
        serviceProvider = SingletonFactory.getInstance();
    }
}
