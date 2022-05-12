package com.challenge;


public class Main {

    public static void main(String[] args) {

        printDayOfTheWeek(2);
        printDayOfTheWeek(4);
        printDayOfTheWeekForStatement(1);
        printDayOfTheWeekForStatement(2);
        printDayOfTheWeekForStatement(5);
        printDayOfTheWeekForStatement(6);

    }

    private static void printDayOfTheWeekForStatement(int day) {

        if (day == 1) {

            System.out.println("Monday");

        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5){
            System.out.println("Fiday");
        } else if (day == 6){
            System.out.println("Saturday");
        } else if (day == 7){
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day");
        }

    }

    static void printDayOfTheWeek(int day) {

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day");
                break;
        }

    }
}
