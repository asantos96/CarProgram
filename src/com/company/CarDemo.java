package com.company;

public class CarDemo {

    public static void main(String[] args) {
	//Car Demo
        //Create a new project in InteliJ named CarProgram using the Command Line App template
        //Rename your Main file to CarDemo(right-click -> Refactor -> Rename…)
        //Create a new Java class file (File -> New -> Java Class) named Car
        //Define your Car class with at least (3) instance variables such as color, make, model, etc., and create
        // accessor method for each variable
        //In your CarDemo class, write a program that instantiates a Car object named myCar, uses accessor methods to
        // set each of its instance variables and then gets their values, and finally prints out information about
        // your vehicle// write your code here

           // Car myCar = new Car();

            //myCar.setColorOfCar("Graphite");
            //myCar.setMakeOfCar("Ford");
            //myCar.setModelOfCar("Bronco");

            //System.out.println("My vehicle is a " + myCar.getColorOfCar() + " " + myCar.getMakeOfCar() + " " +
            //        myCar.getModelOfCar());

            Car newCar = new Car( "white" , "Ford" , "F-150");
            newCar.describeCar();




    }
}
