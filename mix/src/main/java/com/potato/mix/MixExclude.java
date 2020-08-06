package com.potato.mix;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * create by Potato
 * create time
 * Description：添加注解后，插桩失效
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MixExclude {
    String value() default "";//备用
}
