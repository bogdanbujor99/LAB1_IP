package com.mycompany.lab1_ip;

class Car extends Vehicle{
    String owner = new String();
    String typeCar =  new String();
    int age;
    public int wheels=4;
    public void space(){
        System.out.println("Land vehicle");
    }
    public void power(){
        System.out.println("Medium power");
    }
    public void engine(){
        System.out.println("Engine: Diesel/Electric/Gas");
    }
}
