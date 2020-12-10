package com.practise.core.java8;

public class DiamondProblem {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.print();
        Vehicle.horn();
    }
}

interface Vehicle{
    default void print(){
        System.out.println("Vehicle Print");
    }
    static void horn(){
        System.out.println("Vehicle horn");
    }
}

interface Aeroplane {
    default void print(){
        System.out.println("Aeroplane Print");
    }
}

class Car implements Vehicle,Aeroplane{
    public void print()
    {
        System.out.println("car");
        Aeroplane.super.print();
    }

}
