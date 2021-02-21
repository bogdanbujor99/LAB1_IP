package com.mycompany.lab1_ip;

abstract class Vehicle {
    //abstract methods
    abstract void space();
    abstract void power();
    //concrete methods
    public void label(){
        System.out.println("Vehicle's data:");
    }
}
