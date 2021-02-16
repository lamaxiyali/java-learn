package com.example.demo.thread001;

/**
 * @author lamaxiya
 * @version 1.0
 * @date 2021/2/5 13:17
 */
public class InstanceOf {
    static String a = "00";

    public static void main(String[] args) {
        if(a instanceof String ){
            System.out.println("true");
        }
    }
}
