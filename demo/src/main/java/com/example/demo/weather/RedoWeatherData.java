package com.example.demo.weather;

import java.util.Observable;

public class RedoWeatherData extends Observable {
    private float temp;
    private float humidity;
    private float pressure;
    public RedoWeatherData(){

    }

    public void measureChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measureChanged();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
