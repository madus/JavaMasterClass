package com.challenge;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Dell","240",dimensions);

        Resolution nativeResolution = new Resolution(2540,1440);
        Monitor theMonitor = new Monitor("27inch Beast","Acer",27,nativeResolution);

        Motherboard theMotherMoard = new Motherboard("BJ-200","Asus",4,6,"v2.44");

        PC thePC = new PC(theCase,theMonitor,theMotherMoard);

      /*  thePC.getMonitor().drawPixelArt(1500,1200,"red");
        thePC.getMotherboard().loadProgram("Windows 10");
        thePC.getTheCase().pressPowerButton();*/

        thePC.powerUp();

        Room rooms = new Room(5,"fer");

        House house = new House("baladei",2,rooms);
        house.houseDetails();
        rooms.roomDetails();
    }
}
