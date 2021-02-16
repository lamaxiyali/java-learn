package com.example.demo.test;

import org.junit.Test;

import java.util.HashSet;

/**
 * @author lamaxiya
 * @version 1.0
 * @date 2021/2/6 10:31
 */
public class Test001 {
    @Test
    public void Test(){
        System.out.println(
                18
        );
    }

    @Test
    public void TestAnd(){
        int a = 31;
        for (int i = 0; i < 300; i++) {
            System.out.println(a & i);
        }
        System.out.println(17 & 15);
    }
    @Test
    public void TestAdd(){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(17);
    }
}
