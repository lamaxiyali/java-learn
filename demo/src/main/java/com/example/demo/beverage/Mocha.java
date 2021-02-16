package com.example.demo.beverage;

/**
 * @author 32933
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        if(BeverageSize.SMALL.toString().equals(beverage.getSize())){
            return beverage.cost() + 0.2;
        }
        if(BeverageSize.MEDIUM.toString().equals(beverage.getSize())){
            return beverage.cost() + 0.4;
        }
        return beverage.cost() + 0.8;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public String getSize() {
        return beverage.getSize();
    }
}
