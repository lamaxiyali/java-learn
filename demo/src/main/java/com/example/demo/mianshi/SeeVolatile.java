package com.example.demo.mianshi;

import java.util.concurrent.TimeUnit;

/**
 * @author lamaxiya
 * @version 1.0
 * @date 2021/2/13 20:42
 */
public class SeeVolatile {
    volatile int age = 10;
    public void addAge(){
        age = 20;
    }
    public static void main(String[] args) {
        SeeVolatile seeVolatile = new SeeVolatile();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("进入子线程");
                try {
                    TimeUnit.SECONDS.sleep(3);
                    seeVolatile.addAge();
                    System.out.println("子线程修改age完成");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                seeVolatile.addAge();

            }
        };
        new Thread(runnable).start();

        while(seeVolatile.age == 10){
        }
        System.out.println("主线程收到修改信息，结束执行");
    }
}
