package com.hx.remoting.transport.socket;

import com.hx.config.CustomShutdownHook;
import com.hx.provider.ServiceProvider;
import com.hx.provider.ServiceProviderImpl;
import entity.RpcServiceProperties;
import factory.SingletonFactory;
import lombok.extern.slf4j.Slf4j;
import utils.concurrent.threadpool.ThreadPoolFactoryUtils;

import java.io.IOException;
import java.net.*;
import java.util.concurrent.ExecutorService;

import static com.hx.remoting.transport.netty.server.NettyRpcServer.PORT;

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
        serviceProvider = SingletonFactory.getInstance(ServiceProviderImpl.class);
    }

    public void registerService(Object service) {
        serviceProvider.publishService(service);
    }

    public void registerSersvie(Object service, RpcServiceProperties rpcServiceProperties) {
        serviceProvider.publishService(service, rpcServiceProperties);
    }

    public void start() {
        try (ServerSocket serverSocket = new ServerSocket()) {
            String host = InetAddress.getLocalHost().getHostAddress();
            serverSocket.bind(new InetSocketAddress(host, PORT));
            CustomShutdownHook.getCustomShutdownHook().clearAll();
            Socket socket;
            while ((socket = serverSocket.accept()) != null) {
                log.info("client conected [{}]", socket.getInetAddress());
                // todo

                threadPool.execute(null);
            }
        } catch (IOException e) {
            log.error("occur IOException", e);
        }
    }

}
