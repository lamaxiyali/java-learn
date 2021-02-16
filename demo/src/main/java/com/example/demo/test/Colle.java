package com.example.demo.test;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lamaxiya
 * @version 1.0
 * @date 2021/2/6 18:29
 */
public class Colle {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(133);
        list.add(13);
        list.add(4);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
