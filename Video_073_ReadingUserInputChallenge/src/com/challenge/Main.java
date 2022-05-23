package com.challenge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add number:");
        int numbers = scanner.nextInt();
        System.out.println("your number is: " + numbers);


       // boolean hasNextInt = scanner.hasNextInt();
        scanner.nextLine();
      /* if () {*/
            int sum = 0;
            for (int i = 1; i <= numbers; i++) {

                System.out.println("Introduce numarul " + i + ":");

                int addNumber = scanner.nextInt();
                sum = sum + addNumber;

            }

            System.out.println("Suma numerelor este: " + sum);

      /* }*/


    }
}
