package com.challenge;

import javax.sound.midi.Soundbank;

public class CarType extends Car {

    private String brandCar;
    private int maximumSpeed;


    public CarType(String brandCar, int maximumSpeed) {
        super(2, "red", 2, "benzina", "normale");
    }

    public void carSpeed(int maximumSpeed){
        super.increasigSpeed();
        int speed = 2;
        while(maximumSpeed != speed){
            System.out.println("Speed is: " + speed);
            speed++;

        }
        System.out.println("The car reach maximum speed of " + maximumSpeed);



    }

    public String getBrandCar() {
        return brandCar;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }
}
