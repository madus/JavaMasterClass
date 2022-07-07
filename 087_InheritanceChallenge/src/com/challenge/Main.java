package com.challenge;

import videotutorial.Outlander;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car masina = new Car(4,"albastra",5,"benzina","ceramice");
        masina.moving();

        CarType lambo = new CarType("huracan", 20);
        lambo.carSpeed(20);

        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-23);
    }
}
