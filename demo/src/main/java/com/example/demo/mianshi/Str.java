package com.example.demo.mianshi;

/**
 * @author lamaxiya
 * @version 1.0
 * @date 2021/2/16 16:29
 */
public class Str {
    String s = "aa";
    public void changeStr(Str s){
        s.s = "xxx";
    }

    public static void main(String[] args) {
//        String s = "abc";
        Str str = new Str();
        str.changeStr(str);
        System.out.println(str.s);

    }
}
