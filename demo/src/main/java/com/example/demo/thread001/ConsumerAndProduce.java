package com.example.demo.thread001;

/**
 * @author lamaxiya
 * @version 1.0
 * @date 2021/2/3 22:05
 */
public class ConsumerAndProduce {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Consumer consumer = new Consumer(clerk);
        Producer producer = new Producer(clerk);
        Producer producer1 = new Producer(clerk);
        consumer.start();
        producer.start();
        producer1.start();


    }

}
class Clerk{
    private int count = 0;


    public synchronized void createProduce() {

        if (
                count<20
        ) {
            count++;
            System.out.println(Thread.currentThread().getName()+ "生产:"+count);
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            notify();

        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public synchronized void consumerProduce() {
        if (
                count>0
        ) {
            count--;
            System.out.println(Thread.currentThread().getName()+ "消费:"+count);
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            notify();
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Producer extends Thread{
    private Clerk clerk;
    public Producer(Clerk clerk){
        this.clerk = clerk;
    }
    @Override
    public void run() {
        while (true){

            clerk.createProduce();
        }
    }
}
class Consumer extends Thread{
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {

        while (true) {
            clerk.consumerProduce();
        }
    }
}
