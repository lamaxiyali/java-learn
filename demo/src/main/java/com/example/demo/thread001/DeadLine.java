package com.example.demo.thread001;

public class DeadLine {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        new Thread(){
            @Override
            public void run() {
                synchronized (stringBuilder){
                    stringBuilder.append(1);
                    stringBuilder1.append("a");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (stringBuilder1){
                        stringBuilder.append(2);
                        stringBuilder1.append("b");
                        System.out.println(stringBuilder);
                        System.out.println(stringBuilder1);
                    }
                }
            }
        }.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (stringBuilder1){
                    stringBuilder.append(3);
                    stringBuilder1.append("c");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (stringBuilder){
                        stringBuilder.append(4);
                        stringBuilder1.append("d");
                        System.out.println(stringBuilder);
                        System.out.println(stringBuilder1);
                    }
                }
            }
        }).start();
    }
}
