/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1_ip;

/**
 *
 * @author Bogdan
 */
class Dacia implements CarInterface,VehicleInterface{
    public void type(){
        System.out.println("Land vehicle");
    }
    public void NumberOfWheels(){
        System.out.println("4 wheels");
    }
    public void brand() {
        System.out.println("Brand: Dacia");
    }

}
