package com.challenge;

public class BankAccount {

    private long accout_number;
    private double balance;
    private String customer_name;
    private String email;
    private int phone_number;
    private double deposit;
    private double withdraw;

    void setAccout_number(long accout_number){

        this.accout_number = accout_number;

    }

    long getAccout_number(){

        return this.accout_number;

    }

    void setBalance(double balance){

        this.balance = balance;

    }

    double getBalance(){

        return this.balance;

    }

    void setCustomer_name(String customer_name){

        this.customer_name = customer_name;

    }

    String getCustomer_name(){

        return this.customer_name;

    }

    void setEmail(String email){

        this.email = email;

    }

    String getEmail(){

        return this.email;

    }


    void setPhone_number(int phone_number){

        this.phone_number = phone_number;

    }

    int getPhone_number(){

        return this.phone_number;

    }

    void setDeposit(double deposit){

        this.deposit = deposit;

    }

    double getDeposit(){

        return this.deposit;

    }

    double depositFounds(){

        return getBalance() + getDeposit();


    }

    void setWithdraw(double withdraw){

        this.withdraw = withdraw;

    }

    double getWithdraw(){
        return this.withdraw;
    }

    void withdrawFunds(){

        if(depositFounds() - getWithdraw() < 0){

            System.out.println("Insuficient funds");

        } else{

            System.out.println(depositFounds() - getWithdraw());

        }

    }


}
