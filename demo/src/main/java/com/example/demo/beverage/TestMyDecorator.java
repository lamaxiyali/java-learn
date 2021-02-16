package com.example.demo.beverage;

import java.io.*;

public class TestMyDecorator {
    public static void main(String[] args) {
        File file = new File("C:\\files\\idea-workspace\\unit2\\demo\\src\\main\\java\\com\\example\\demo\\beverage\\a");
        try {
            FileInputStream inputStream = new FileInputStream(file);
            MyFileDecorator myFileDecorator = new MyFileDecorator(inputStream);
            System.out.println(myFileDecorator.read());

            byte[] a = new byte[17];
            System.out.println(new String(myFileDecorator.read1(a, 0, 17)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
