package com.hx;

import com.hx.api.HelloService;
import com.hx.remoting.transport.socket.SocketRpcServer;
import com.hx.serviceimpl.HelloServiceImpl;
import entity.RpcServiceProperties;

/**
 * @author hawdies
 * @date 2021/5/7
 **/
public class SocketServerApp {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        SocketRpcServer socketRpcServer = new SocketRpcServer();
        RpcServiceProperties rpcServiceProperties = RpcServiceProperties.builder()
                .group("socketServiceTest")
                .version("1.0")
                .build();
        socketRpcServer.registerSersvie(helloService, rpcServiceProperties);
        socketRpcServer.start();
    }
}
