package com.hx.remoting.transport.socket;

import com.hx.provider.ServiceProvider;
import lombok.extern.slf4j.Slf4j;

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

    }
}
