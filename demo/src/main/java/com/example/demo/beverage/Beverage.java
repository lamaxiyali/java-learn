package com.example.demo.beverage;

public abstract class Beverage {
    public String description = "Unknown Beverage";
    public String size = "Unknown Size";

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription(){
        return description;
    }

    public abstract double cost();

}
