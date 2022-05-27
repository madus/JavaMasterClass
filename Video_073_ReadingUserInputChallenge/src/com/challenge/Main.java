package com.challenge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int couter = 0;
        int sum = 0;
        while (couter < 10){

            int order = couter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isInt = scanner.hasNextInt();

            if(isInt){
                int number = scanner.nextInt();
                couter++;
                sum = sum + number;
                if(couter == 10){
                    break;
                }


            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine();

        }

        System.out.println("sum = " + sum);
        scanner.close();

    }
}