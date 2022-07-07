package com.challenge;

public class House {

    private String address;
    private int parkingSpaces;
    private Room rooms;

    public House(String address, int parkingSpaces, Room rooms) {
        this.address = address;
        this.parkingSpaces = parkingSpaces;
        this.rooms = rooms;
    }

    void houseDetails(){

        System.out.println("House adress is: " + address);
        rooms.roomDetails();


    }

}
