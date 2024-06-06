package org.example.lessons.lesson3;

public class Car extends Vehicle {
  private String engineType;


  public Car(String marka, int kmh, String engineType){
      super(marka,kmh);
      this.engineType=engineType;
  }
}
