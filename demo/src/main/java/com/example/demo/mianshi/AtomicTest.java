package com.example.demo.mianshi;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author lamaxiya
 * @version 1.0
 * @date 2021/2/13 21:22
 */
public class AtomicTest {
    AtomicInteger atomicInteger = new AtomicInteger();
    public void add(){
        atomicInteger.getAndAdd(1);
    }

    public static void main(String[] args) {
        AtomicTest atomicTest = new AtomicTest();
        for (int i = 0; i < 20; i++) {
            new Thread(() ->{
                atomicTest.add();
            }, String.valueOf(i)).start();
        };
        while(Thread.activeCount() > 2){

        }
        System.out.println(atomicTest.atomicInteger);
    }
}
