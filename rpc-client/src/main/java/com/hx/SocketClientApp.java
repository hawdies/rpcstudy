package com.hx;

import com.hx.api.HelloService;
import com.hx.proxy.RpcClientProxy;
import com.hx.remoting.transport.RpcRequestTransport;
import com.hx.remoting.transport.socket.SocketRpcClient;
import entity.RpcServiceProperties;

/**
 * @author hawdies
 * @date 2021/5/7
 **/
public class SocketClientApp {
    public static void main(String[] args) {
        RpcRequestTransport rpcRequestTransport = new SocketRpcClient();
        RpcServiceProperties rpcServiceProperties = RpcServiceProperties.builder().group("socketServiceTest").version("1.0").build();
        RpcClientProxy rpcClientProxy = new RpcClientProxy(rpcRequestTransport, rpcServiceProperties);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        String s = helloService.sayHello();
        System.out.println(s);

    }
}
