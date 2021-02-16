package com.example.demo.leetcode001;

import java.util.*;

public class StrIsChangeble {
    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println(s1.charAt(0) == 'h');
        Object o = null;

        o = new Object();
        System.out.println(o);
        String ss = "Hell , HHH , ";
        char cccc = (char) 97;

        System.out.println(String.valueOf(cccc));
        StringBuilder stringBuilder= new StringBuilder(ss);
        System.out.println((char) 97);
        stringBuilder.replace(0,1, "a"+1);
        System.out.println(stringBuilder);
        String sss = ss.toLowerCase(Locale.ROOT);
        System.out.println(sss);
        if('a' == 'a'){
            System.out.println("true");
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        StringBuilder sb = new StringBuilder("cccdd");
        int j =0;
        sb.replace(j, j+1, String.valueOf((char) (25+97)));
        System.out.println(sb.toString());
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.replace(1, 100);
        map.put(2, 99);
        System.out.println(map.get(1));
        map.forEach((a,b) ->{
            System.out.println(a);
            System.out.println(
                    b
            );
        });
        Deque<String> list = new LinkedList<>();
        List<Integer> list1 = new ArrayList<>();
        list.add("11");
//        list.remove("11");
        System.out.println(list.size());
        list.toArray();
        String s11 = " jij jkj  ljl ";
        System.out.println(s11.trim());
        String[] sarr = s11.split(" ");
        String sji = "   ";
        System.out.println(
                sji.trim().length()
        );
        System.out.println(012);
    }
}
