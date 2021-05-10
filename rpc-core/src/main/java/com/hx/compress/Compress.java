package com.hx.compress;

/**
 * @author hawdies
 * @date 2021/5/10
 **/
public interface Compress {
    byte[] compress(byte[] bytes);
    byte[] decompress(byte[] bytes);
}
