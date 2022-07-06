package com.challenge;

public class Vehicle {

   private String vehicleType;
   private String vehicleGasType;
   private int numberOfWheels;
   private String bakesType;

   public Vehicle(String vehicleType, String vehicleGasType, int numberOfWheels, String bakesType) {
      this.vehicleType = vehicleType;
      this.vehicleGasType = vehicleGasType;
      this.numberOfWheels = numberOfWheels;
      this.bakesType = bakesType;
   }


   public void changingGears(int wheels){

      System.out.println("The number of wheels changed: " + wheels);

   }

   public void moving(){

      System.out.println("The vehicle it is moving");

   }

   public String getVehicleType() {
      return vehicleType;
   }

   public void setVehicleType(String vehicleType) {
      this.vehicleType = vehicleType;
   }

   public String getVehicleGasType() {
      return vehicleGasType;
   }

   public void setVehicleGasType(String vehicleGasType) {
      this.vehicleGasType = vehicleGasType;
   }

   public int getNumberOfWheels() {
      return numberOfWheels;
   }

   public void setNumberOfWheels(int numberOfWheels) {
      this.numberOfWheels = numberOfWheels;
   }

   public String getBakesType() {
      return bakesType;
   }

   public void setBakesType(String bakesType) {
      this.bakesType = bakesType;
   }
}
