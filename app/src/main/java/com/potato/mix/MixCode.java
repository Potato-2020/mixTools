package com.potato.mix;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * create by Potato
 * create time
 * Description：找到带有@MixCode的方法（目的：找到插桩的代码内容，进行插桩）
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MixCode {
    String value() default "";//备用
}
