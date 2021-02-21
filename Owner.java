package com.mycompany.lab1_ip;
import java.util.Scanner;
        
enum TypeCars{
    Audi,
    Dacia,
    Volkswagen,
    Ford,
    Opel
}

public class Owner extends Car{
   protected Owner()
        {
            Scanner console = new Scanner(System.in);
            System.out.println("Anul masinii este:");
            age=console.nextInt();
            console= new Scanner(System.in);
            System.out.println("Nume proprietarului este:");
            owner=console.nextLine();
            while(true)
            {
                System.out.println("Marca masinii este:");
                String s=new String();
                console= new Scanner(System.in);
                s=console.nextLine();
                int ok=0;
                for (TypeCars myVar : TypeCars.values())
                {
                    if(myVar.name().equals(s))
                        {
                            typeCar=s;
                            ok=1;
                        }
                }
                if(ok==0)System.out.println("Marca masinii este gresita! \nVa rugam sa introduceti marca corecta:");
                else break;
            }
        }
}
