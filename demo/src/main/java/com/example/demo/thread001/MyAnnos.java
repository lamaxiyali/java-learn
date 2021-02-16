package com.example.demo.thread001;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author lamaxiya
 * @version 1.0
 * @date 2021/2/4 16:49
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnos {
    MyAnno[] my();
}
