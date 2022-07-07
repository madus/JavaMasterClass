package com.challenge;

public class Room {

    private int doors;
    private String furniture;

    public Room(int doors,String furniture){

        this.doors = doors;
        this.furniture = furniture;

    }

    public void roomDetails(){

        System.out.println("Here we have " + this.doors + " doors" + " and " + this.furniture + "furniture");

    }


}
