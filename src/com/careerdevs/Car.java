package com.careerdevs;

public class Car {

    public String make;
    public String model;
    private boolean isRented;

    public Car(String make, String model)
    {
        this.make = make;
        this.model = model;
        this.isRented = false;

    }

    public  String getMake()
    {
        return make;
    }

    public  String getModel()
    {
        return make;
    }

    public boolean IsRented()
    {
        return isRented;
    }
}
