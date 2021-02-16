package com.example.demo.day03;

import java.util.Date;

/**
 * @author lamaxiya
 * @version 1.0
 * @date 2021/2/4 12:24
 */
public class day03  implements Comparable<Object>{
    public static void main(String[] args) {
        String s1 = "he";
        String s2 = "he";
        final String s3 = "he";
        System.out.println(s3 == s1);
        String s4 = "hehe";
        final String s5 = s3 + "he";
        System.out.println(s4 == s5);
        System.out.println(new Date().toString());
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
