package com.challenge;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,2.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,3.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,4.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,5.0));

        for(int i = 0; i < 5; i++){

            System.out.println("Loop " + i +" hello!");

        }

      /*  for(int i = 2; i < 9; i++){

            System.out.println("10.000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0,i)));

        }*/

        for(int i = 8; i >= 2; i--){

            System.out.println("10.000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0,i)));

        }

        primeNumberCheck(23);

    }

    public static void primeNumberCheck(int n){
        int m = 0;
        for (int i = 1; i <= n;i++){

            if(isPrime(i)){
            m++;
                System.out.println(i + " is prime");
            }
            if(m == 3)
                break;
        }
        System.out.println(m);

    }

    public static boolean isPrime(int n){

        if(n == 1){
            return false;
        }

        for(int i = 2; i <= n/2; i++){

            if(n % i == 0){
                return false;
            }

        }


        return true;
    }


    public static double calculateInterest(double amount, double interestRate){

        return (amount * (interestRate/100));


    }
}
