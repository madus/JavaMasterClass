package com.challenge;

public class Car extends Vehicle{

    private int doorsNumber;
    private String color;
    private int seets;



    public Car(int doorsNumber, String color, int seets, String vehicleGasType, String bakesType) {
        super("combi", vehicleGasType, 4, bakesType);
        this.doorsNumber = doorsNumber;
        this.color = color;
        this.seets = seets;
    }

    @Override
    public void moving(){
       super.moving();
        System.out.println("Forward");


    }

    public void increasigSpeed(){

       this.moving();
        System.out.println("The car increaseang speed");

    }

    public void decreasingSpeed(){

        super.moving();
        System.out.println("Car decreasing speed");

    }



    public int getDoorsNumber() {
        return doorsNumber;
    }

    public String getColor() {
        return color;
    }

    public int getSeets() {
        return seets;
    }
}
