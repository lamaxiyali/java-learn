package com.example.demo.mianshi;

/**
 * @author lamaxiya
 * @version 1.0
 * @date 2021/2/13 22:41
 */
public class DclTest {
    private static volatile DclTest singleDcl = null;
    private DclTest(){
        System.out.println("private");
    }
    private DclTest getSingle(){
        if(singleDcl == null){
            synchronized (DclTest.class){
                if(singleDcl == null){
                    singleDcl = new DclTest();
                }
            }
        }
        return singleDcl;
    }

}
