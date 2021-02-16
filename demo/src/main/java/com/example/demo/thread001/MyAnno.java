package com.example.demo.thread001;

import java.lang.annotation.*;

/**
 * @author lamaxiya
 * @version 1.0
 * @date 2021/2/4 16:26
 */
@Target(ElementType.METHOD)
//@Retention(
//        RetentionPolicy.SOURCE
//)
//@Inherited
//@Documented
public @interface MyAnno {
    String value() default "hello";
}
