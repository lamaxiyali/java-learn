package com.example.demo.mianshi;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author lamaxiya
 * @version 1.0
 * @date 2021/2/16 20:30
 */
public class ReadWriteLock {
    public static void main(String[] args) {
        MyCache myCache = new MyCache();
        for (int i = 0; i < 5; i++) {
            final int key = i;
            new Thread(() -> {
                myCache.put(key+"", key+"");
            }, String.valueOf(i)).start();
        }
        for (int i = 0; i < 5; i++) {
            final int key = i;
            new Thread(() -> {
                myCache.get(key+"");
            }, String.valueOf(i)).start();
        }

    }
}

class MyCache{
    private volatile Map<String, Object> map = new HashMap<>();
    private ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
    public void put(String key, Object value){
        reentrantReadWriteLock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + "正在写入");
            map.put(key, value);
            System.out.println(Thread.currentThread().getName() + "写入完成");
        }finally {
            reentrantReadWriteLock.writeLock().unlock();
        }

    }

    public void get(String key){
        reentrantReadWriteLock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + "正在读取");
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread().getName() + "读取完成" + map.get(key));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }

    }
}
