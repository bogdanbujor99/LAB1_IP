package com.mycompany.lab1_ip;

public class VehicleEncapsulation {

    private String name;
    private double Weight;
    private int power;

    public String getName(){
        return name;
    }

    public void About(){
        System.out.println("This car is really good!");
    }
    public void About(String name, int power){
        System.out.println("This " + name + " has " + power + " horse power");
    }
    public void About(String name, int power, double weight){
        System.out.println("This " + name + " has " + power + " and " + weight + " kg");
    }
    public double getWeight() {
        return Weight;
    }

    public int getPower() {
        return power;
    }

    public void setName(String Name){
        this.name=Name;
    }

    public void setWeight(double weight) {
        this.Weight = weight;
    }

    public void setPower(int power) {
        this.power = power;
    }
}


