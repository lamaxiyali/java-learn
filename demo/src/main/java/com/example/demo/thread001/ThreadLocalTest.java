package com.example.demo.thread001;

/**
 * @author lamaxiya
 * @version 1.0
 * @date 2021/2/13 9:29
 */
public class ThreadLocalTest {
    private String name;
    public ThreadLocal threadLocal = new ThreadLocal();
    public String getName() {
        String o = (String) threadLocal.get();
        return o;
    }

    public void setName(String name) {
        threadLocal.set(name);
    }

    public static void main(String[] args) {
        ThreadLocalTest threadLocalTest = new ThreadLocalTest();
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
//                System.out.println("Set the local para" + Thread.currentThread().getName());
                threadLocalTest.setName(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getName() + ":" + threadLocalTest.getName());
            }
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.setName("thread1");
        thread1.setName("thread2");
        thread1.setName("thread3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

