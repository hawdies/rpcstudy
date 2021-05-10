package com.hx.remoting.serialize;

import extension.SPI;

/**
 * @author hawdies
 * @date 2021/5/10
 **/
@SPI
public interface Serializer {
    byte[] serialize(Object obj);

    <T> T deserizlize(byte[] bytes, Class<T> clazz);
}
