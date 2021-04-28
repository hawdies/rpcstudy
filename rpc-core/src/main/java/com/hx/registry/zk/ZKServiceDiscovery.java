package com.hx.registry.zk;

import com.hx.registry.ServiceDiscovery;
import lombok.extern.slf4j.Slf4j;

import java.net.InetSocketAddress;

/**
 * @author hawdies
 * @date 2021/4/28
 **/
@Slf4j
public class ZKServiceDiscovery implements ServiceDiscovery {
    @Override
    public InetSocketAddress lookupService(String rpcServiceName) {
        return null;
    }
}
