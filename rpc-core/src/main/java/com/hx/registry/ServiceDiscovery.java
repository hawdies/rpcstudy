package com.hx.registry;

import java.net.InetSocketAddress;

/**
 * @author hawdies
 * @date 2021/4/28
 **/
public interface ServiceDiscovery {
    InetSocketAddress lookupService(String rpcServiceName);
}
