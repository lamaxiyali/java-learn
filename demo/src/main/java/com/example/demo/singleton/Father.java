package com.example.demo.singleton;

/**
 * @author 32933
 */
public class Father {
    private static Father father;
    private Father(){
    }
    public static Father getFather(){
        if(father == null) {
            father = new Father();
        }
        return father;
    }

}


