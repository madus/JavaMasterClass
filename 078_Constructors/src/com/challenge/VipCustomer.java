package com.challenge;

import javax.sound.midi.Soundbank;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public VipCustomer(){

        this("Madalin", 1000, "tes@.com");
        System.out.println("this is constructor without params");

    }

    public VipCustomer(String name, double creditLimit){

        this.name = name;
        this.creditLimit = creditLimit;
        this.email = "email@emaiol;-)";


    }

    public VipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }





}
