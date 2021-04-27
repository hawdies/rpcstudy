package com.hx.annotation;

import java.lang.annotation.*;

/**
 * @author hawdies
 * @date 2021/4/27
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface RpcReference {
    String version() default "";

    String group() default "";
}
