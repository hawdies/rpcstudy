package com.hx;

import org.junit.jupiter.api.Test;

import java.net.URL;

/**
 * @author hawdies
 * @date 2021/4/28
 **/
public class ResourceTest {
    @Test
    public void test01() {
        URL url = Thread.currentThread().getContextClassLoader().getResource("");
        System.out.println(url);
    }
}
