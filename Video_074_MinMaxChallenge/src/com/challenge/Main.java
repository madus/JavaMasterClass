package com.challenge;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    static int maxNum = 0;
    static int minNum = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("Enter number: ");

            boolean hasInt = scanner.hasNextInt();

            if (hasInt) {
                int number = scanner.nextInt();
                if(number > maxNum){

                    maxNum = number;


                } else {
                    minNum = number;
                }
            } else {

                break;

            }


            scanner.nextLine();

        }

        System.out.println("Cel mai mare numar este: " + maxNum);
        System.out.println("Cel mai mic numar este: " + minNum);

        scanner.close();
    }

}

