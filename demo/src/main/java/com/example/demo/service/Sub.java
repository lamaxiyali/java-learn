package com.example.demo.service;

class SubClass extends SuperClass {
    public static String A=NAME;
    static {
        System.out.println("init Subclass");
    }
    public SubClass(){
        System.out.println("sub project");
    }
}

 class SuperClass{
    public static String NAME="12";
    public static final String AGE = "0";
    public static String PLACE;
    protected static String COU;
    static {
        System.out.println("superclass init");
        NAME = "324";
    }
}

public class Sub{
    public static void main(String[] args) throws ClassNotFoundException {
        SubClass subClass = new SubClass();
//        System.out.println(SuperClass.NAME);
        Class.forName("com.example.demo.service.SubClass");

    }

}
