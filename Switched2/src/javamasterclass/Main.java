package com.company;

public class Main {

    public static void main(String[] args) {

        int value = 3;
        if (value == 1) {

            System.out.println("Value was 1");

        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {

            System.out.println("Was not 1 or 2");

        }

        int switchedValue = 2;
        switch (switchedValue) {

            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }


        char charValue = 'A';

        switch (charValue){
            case 'A':
                System.out.println("Char value is A");
                break;
            case 'B':
                System.out.println("Char value is B");
                break;
            case 'C':
                System.out.println("Char value is C");
                break;
            case 'D':
                System.out.println("Char value is D");
                break;
            default:
                System.out.println("No found");
                break;

        }

    }


}
