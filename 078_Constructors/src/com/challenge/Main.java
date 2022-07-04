package com.challenge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test");
        BankAccount bankAccountInformation = new BankAccount();

        bankAccountInformation.setAccout_number(1_223_456);
        bankAccountInformation.setBalance(200);
        bankAccountInformation.setCustomer_name("Marcel");
        bankAccountInformation.setEmail("marcel@email.com");


        Scanner key = new Scanner(System.in);

        System.out.println("Choose your operation: ");
        System.out.println("Press 'D' for deposit funds or 'W' for withdraw funds");

        String myOperation = key.nextLine();


        if(myOperation.equalsIgnoreCase("d")) {

            System.out.println("Add deposit of: ");

            double myDeposit = key.nextInt();



            bankAccountInformation.setDeposit(myDeposit);

            System.out.println("Your new balance is " + bankAccountInformation.depositFounds());

        } else if (myOperation.equalsIgnoreCase("w")) {

            System.out.println("Withdraw: ");
            double myWithdraw = key.nextInt();


            bankAccountInformation.setWithdraw(myWithdraw);
            System.out.print("Your balance after withdraw is: ");
            bankAccountInformation.withdrawFunds();

        }

        VipCustomer testing = new VipCustomer();
        System.out.println(testing.getCreditLimit() + " " + testing.getEmail() + " " + testing.getName());

        VipCustomer vipCst = new VipCustomer("Madalin", 100);

        System.out.println(vipCst.getEmail());

    }



}
