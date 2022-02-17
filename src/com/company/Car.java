package com.company;

public class Car {
    private String colorOfCar;
    private String makeOfCar;
    private String modelOfCar;

    //Constructor using this statement

    public Car(String colorOfCar, String makeOfCar, String modelOfCar) {
        this.colorOfCar = colorOfCar;
        this.makeOfCar = makeOfCar;
        this.modelOfCar = modelOfCar;
    }

    //setting method for color
    public void setColorOfCar(String color) {
        colorOfCar = color;
    }

    //getter method for color
    public String getColorOfCar() {
        return colorOfCar;
    }


    //setting method for make
    public void setMakeOfCar(String make) {
        makeOfCar = make;
    }

    //getter method for make
    public String getMakeOfCar() {
        return makeOfCar;
    }


    //setting method for model
    public void setModelOfCar(String model) {
        modelOfCar = model;
    }

    //getter method for model
    public String getModelOfCar() {
        return modelOfCar;
    }

    //Method that prints out Car details
    public void describeCar() {
        System.out.println(getColorOfCar() + getMakeOfCar() + getModelOfCar());
    }
}