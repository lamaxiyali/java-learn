package com.example.demo.thread001;

public class NumberTest {
    public static void main(String[] args) {
        The the = new The();
        Thread thread = new Thread(the);
        Thread thread1 = new Thread(the);
        thread.start();
        thread1.start();
    }

}

class The implements Runnable{
    private int number = 1;
    private Object object = new Object();
    @Override
    public void run() {
        while(true){
            synchronized (object){
                notify();
                if (number<100) {
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    break;
                }
            }
        }
    }
}
