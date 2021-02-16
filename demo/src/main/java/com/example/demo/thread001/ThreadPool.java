package com.example.demo.thread001;

import java.util.concurrent.*;

/**
 * @author lamaxiya
 * @version 1.0
 * @date 2021/2/4 10:49
 */
public class ThreadPool {
    public static void main(String[] args) {
        System.out.println(ThreadFactory.class.getName());
        ExecutorService service = Executors.newFixedThreadPool(10);
        System.out.println(service.getClass());
        service.execute(new Pool());
        service.execute(new Pool());
        Future<Integer> future = service.submit(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                for (int i = 0; i < 100; i++) {
                    System.out.println("1000");
                }
                return 1000000000;
            }
        });
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        service.shutdown();
    }
}

class Pool implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "--" + i);
        }
    }
}
