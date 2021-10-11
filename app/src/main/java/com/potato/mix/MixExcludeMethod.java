package com.potato.mix;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * create by Potato
 * create time
 * Description：排除带有@MixExcludeMethod的方法
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MixExcludeMethod {
    String value() default "";//备用
}
