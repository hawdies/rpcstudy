package com.hx.loadbalance;

import extension.SPI;

import java.util.List;

/**
 * @author hawdies
 * @date 2021/4/28
 **/
@SPI
public interface LoadBalance {
    String selectServiceAddress(List<String> serviceAddresses, String rpcServiceName);
}
