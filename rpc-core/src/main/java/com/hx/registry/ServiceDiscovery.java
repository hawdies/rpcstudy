package com.hx.registry;

import extension.SPI;

import java.net.InetSocketAddress;

/**
 * @author hawdies
 * @date 2021/4/28
 **/
@SPI
public interface ServiceDiscovery {
    InetSocketAddress lookupService(String rpcServiceName);
}
