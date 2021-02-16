package com.example.demo.thread001;

import sun.awt.windows.ThemeReader;

import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

/**
 * changyongfangfa
 */
public class Thread1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread1 = new MyThread();
        System.out.println(myThread1.getState());
        myThread1.setName("窗口1");
        MyThread myThread2 = new MyThread();
        myThread2.setName("窗口2");
        MyThread myThread3 = new MyThread();
        myThread3.setName("窗口3");
        myThread1.start();
        myThread2.start();
        myThread3.start();

    }

}
class MyThread extends Thread{
    private static int TICKET = 100;
    private static ReentrantLock reentrantLock = new ReentrantLock(true);
    @Override
    public void run() {
        while(true){

            try{
                reentrantLock.lock();
                if(TICKET>0){
                    System.out.println(this.getName()+"--正在买票--"+ TICKET );
                    TICKET--;
                }else{
                    break;
                }
            }finally {
                reentrantLock.unlock();
            }


    }

    }
}

class My2 implements Runnable{

    @Override
    public void run() {
        System.out.println("ok");
    }
}
