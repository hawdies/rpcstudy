package com.hx.registry.zk;

import lombok.extern.slf4j.Slf4j;
import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * @author hawdies
 * @date 2021/4/28
 **/
@Slf4j
public class ZkServiceRegistryTest {
    private String connectString = "106.53.52.32:2181";
    private int sessionTimeout = 2000;
    ZooKeeper zooKeeper;

    @Before
    public void init() {
        try {
            zooKeeper = new ZooKeeper(connectString, sessionTimeout, new Watcher() {
                @Override
                public void process(WatchedEvent event) {
                    System.out.println("event...");
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void createNode() throws KeeperException, InterruptedException {
        zooKeeper.create("/song", "zhangkuangyi".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
    }

    @Test
    public void modifyNode() throws KeeperException, InterruptedException {
        Stat stat = zooKeeper.setData("/song", "zhuaokuangyi".getBytes(), -1);
        log.info(stat.toString());
    }
}