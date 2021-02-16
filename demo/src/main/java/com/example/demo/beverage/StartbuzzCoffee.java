package com.example.demo.beverage;

import java.util.Arrays;
import java.util.Collections;

public class StartbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage1 = new DarkRoast();
        beverage1.setSize("SMALL");
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription()+":"+beverage1.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2.setSize("LARGE");
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription()+":"+beverage2.cost());
    }
}
