package com.competitiveprogramming.DSA.oops;

public class CarUse {
    public static void main(String[] args){

        Car car = new Car("Bolero", 4, "white");
        System.out.println(car);
        System.out.println(car.getBrand());
        System.out.println(car.getTyre());
        System.out.println(car.getColor());
    }
}
