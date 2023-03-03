package com.example.springexercise.structure;

public class Car {

    private final Engine engine;
    public Car(Engine engine){
        System.out.println("In the Car constructor");
        this.engine=engine;
        System.out.println("Dependency of engine injected");
    }

    public void start(){
        System.out.println("Car is ready to start");
    }

}
