package com.challenge;


public class Main {

    public static void main(String[] args) {
        // write your code here

        int j = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {

            if (i % 3 == 0 && i % 5 == 0){

                System.out.println("The number is: " + i);
                j++;
                sum=sum+i;
            }

            if(j == 5)
                break;


        }

        System.out.println("Suma este " + sum);

    }
}
