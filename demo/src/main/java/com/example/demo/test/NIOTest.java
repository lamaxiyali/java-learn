package com.example.demo.test;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author lamaxiya
 * @version 1.0
 * @date 2021/2/6 18:59
 */
public class NIOTest {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(new File("C:\\files\\idea-workspace\\unit2\\demo\\src\\main\\java\\com\\example\\demo\\test\\a.txt"));
            FileOutputStream fos = new FileOutputStream(new File("src/main/java/com/example/demo/test/acc"));
            FileChannel fileChannel = fis.getChannel();
            FileChannel fileChannel1 = fos.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            while(true){
                int pos = fileChannel.read(byteBuffer);
                if(pos == -1){
                    break;
                }
                byteBuffer.flip();
                fileChannel1.write(byteBuffer);
                byteBuffer.clear();
            }
            fileChannel.close();
            fileChannel1.close();
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
