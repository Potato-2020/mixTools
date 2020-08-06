package com.potato.mix;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * create by Potato
 * create time
 * Description：插桩模板类，插桩内容从模板获取
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MixClass {
    String value() default "";//备用
}
