package com.competitiveprogramming.DSA.oops;

public class Car {
    private String brand;
    private int tyre;
    private String color;

    public Car(String brand, int tyre, String color){
        this.brand = brand;
        this.tyre = tyre;
        this.color = color;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setTyre(int tyre){
        this.tyre = tyre;
    }
    public int getTyre(){
        return tyre;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}

