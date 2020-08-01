package com.potato.mix;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * create by Potato
 * create time
 * Description：找到带有@MixClass的类（目的：找到它并且找出需要插桩的代码）
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MixClass {
    String value() default "";//备用
}
