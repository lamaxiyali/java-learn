package com.example.demo.factorymodel;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(PizzaType.CHEESE.toString().equals(type)){
            pizza = new CheesePizza();
        }else if(PizzaType.CLAM.toString().equals(type)){
            pizza = new ClamPizza();
        }
        return pizza;
    }
}
