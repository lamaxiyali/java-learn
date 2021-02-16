package com.example.demo.weather;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private float temp;
    private float humidity;
    private Observable observable;
    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions:"+ temp + "F degrees and " + humidity + "%humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof RedoWeatherData){
            RedoWeatherData redoWeatherData = (RedoWeatherData) o;
            this.temp = redoWeatherData.getTemp();
            this.humidity = redoWeatherData.getHumidity();
            display();
        }

    }
}
