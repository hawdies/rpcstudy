package com.hx.loadbalance.loadbalancer;

import com.hx.loadbalance.AbstractLoadBalance;

import java.util.List;
import java.util.Random;

/**
 * @author hawdies
 * @date 2021/4/28
 **/
public class RandomLoadBalacne extends AbstractLoadBalance {
    @Override
    protected String doSelect(List<String> serviceAddresses, String rpcServiceName) {
        Random random = new Random();
        return serviceAddresses.get(random.nextInt(serviceAddresses.size()));
    }
}
