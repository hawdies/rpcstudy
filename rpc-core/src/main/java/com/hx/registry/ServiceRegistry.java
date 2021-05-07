package com.hx.registry;

import extension.SPI;

import java.net.InetSocketAddress;

/**
 * @author hawdies
 * @date 2021/4/28
 **/
@SPI
public interface ServiceRegistry {

    void registerService(String rpcServiceName, InetSocketAddress inetSocketAddress);
}
