package com.example.demo.thread001;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author lamaxiya
 * @version 1.0
 * @date 2021/2/4 10:12
 */
public class CallThread {
    public static void main(String[] args) {
        CallTh cl = new CallTh();
        FutureTask futureTask = new FutureTask(cl);
//        new Thread(futureTask).start();

        Object o = null;
        try {
            o = futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("总和：" + o);
    }
}


class CallTh implements Callable{

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
            System.out.println(i);
        }
        return sum;
    }
}
