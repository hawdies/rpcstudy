package com.hx.annotation;

/**
 * @author hawdies
 * @date 2021/4/27
 **/
public @interface RpcService {
    String version() default "";
    String group() default "";
}
