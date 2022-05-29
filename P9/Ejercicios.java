package com.company;

public class Ejercicios {
   public static void main(String[] args) {
       //Ejercicio 1
       // no se puede crear un objeto
       /*public abstract class animal {
           animal obj=new animal();
       }*/

       //Ejercicio 3
       System.out.println("Ejercicio 3");
        Car carro=new Car("Toyota");
        carro.start();
        carro.accelerate();

        //Ejercicio 4
       //Implementas un public void start() para poder hacerlo desde ahi
       System.out.println("Ejercicio 4");
       Safety c= new Car("Ferrari");
       c.start();
   }
}
interface Safety{
    public boolean checkSeatBelts();
    public void lockSeatBelts();
    public void start();
}
class Car implements  Safety{
    String model;
    int mileage;
    double speed;

    public Car(String model){
        this.model=model;
    }

    public void start(){
        if(checkSeatBelts())
            System.out.println(model+" is running");
        else
            System.out.println("There was a problem starting"+ model);
    }
    public void accelerate(){
        System.out.println("Accelerating");
        speed++;
    }
    public boolean checkSeatBelts(){
        System.out.println("Seatbelts are working");
        return true;
    }
    public void lockSeatBelts(){
        System.out.println("Seatbelts are locked");
    }
}


