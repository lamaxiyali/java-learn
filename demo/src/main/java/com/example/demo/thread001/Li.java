package com.example.demo.thread001;

import java.util.*;

/**
 * @author lamaxiya
 * @version 1.0
 * @date 2021/2/4 17:55
 */
public class Li {
//    static Object o;
    private String name;
    private Integer age;
    private  Integer _name;

    public static void main(String[] args) {
        Li li = new Li();
        System.out.println(li._name);
        List<int[]> ints = Arrays.asList(new int[]{12, 34});
        System.out.println(ints.size());
        for (int i = 0; i < ints.size(); i++) {
            System.out.println(ints.get(i));
        }

        List<Integer> integers = Arrays.asList(new Integer[]{12, 33});
        System.out.println(integers.size());
        for (Object o: integers
             ) {
            System.out.println(o);
        }
        Iterator<Integer> iterator = integers.iterator();
        System.out.println(integers.getClass().getName());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        System.out.println(o);
        HashSet<Integer> se = new HashSet<>();
        se.add(8);
        se.add(8);
        int sum = 83 & 1590;
        System.out.println(sum);
        boolean ak = true;
        ak = !ak;
        System.out.println(ak);
    }

    @Override
    public boolean  equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Li li = (Li) o;

        if (name != null ? !name.equals(li.name) : li.name != null) return false;
        return age != null ? age.equals(li.age) : li.age == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }
}
