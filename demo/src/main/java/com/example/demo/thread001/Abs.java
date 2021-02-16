package com.example.demo.thread001;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/**
 * @author lamaxiya
 * @version 1.0
 * @date 2021/2/4 11:11
 */
public abstract class Abs implements Executor {
    protected void osu(){
        System.out.println("os");
    }
}

class Abb extends Abs{

    @Override
    public void execute(Runnable command) {

    }
}
