package org.example.lessons.lesson3;

public class Vehicle {
   private String marka;
   private int kmh;

    public int getKmh() {
        return kmh;
    }

    public Vehicle(String marka, int kmh) {
        this.marka = marka;
        this.kmh = kmh;
    }

    public void setKmh(int kmh) {
        this.kmh = kmh;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "marka='" + marka + '\'' +
                ", kmh=" + kmh +
                '}';
    }
}
