package com.hx.loadbalance;

import java.util.List;

/**
 * @author hawdies
 * @date 2021/4/28
 **/
public interface LoadBalance {
    String selectServiceAddress(List<String> serviceAddresses, String rpcServiceName);
}
