package com.example.demo.thread001;

import java.lang.annotation.Annotation;
import java.net.Socket;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author lamaxiya
 * @version 1.0
 * @date 2021/2/4 15:19
 */
@MyAnnos(my = {@MyAnno(value = "12"), @MyAnno(value = "22")})
public class Sort {

    public static void main(String[] args) {
        Class sortClass = Sort.class;
        Annotation[] annotations = sortClass.getAnnotations();
        System.out.println(annotations.length);
        for (Annotation an: annotations
             ) {
            System.out.println(an);
            System.out.println(an.annotationType());
        }
        Stu[] aa = new Stu[5];
        aa[0] = new Stu("ajj", 12);
        aa[1] = new Stu("bjj", 3);
        aa[4] = new Stu("bbj", 3);
        aa[2] = new Stu("bjj", 5);
        aa[3] = new Stu("cjj", 9);
        Arrays.sort(aa, new Comparator<Stu>() {
            @Override
            public int compare(Stu o1, Stu o2) {
               if (!o1.getAge().equals(o2.getAge())){
                   return o1.getAge() - o2.getAge();
               }else{
                   return o1.getName().compareTo(o2.getName());
               }
            }
        });
        for (Stu s: aa
             ) {
            System.out.println(s.toString());
        }
    }
}
class Stu {
    private String name;
    private Integer age;

    public Stu(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
