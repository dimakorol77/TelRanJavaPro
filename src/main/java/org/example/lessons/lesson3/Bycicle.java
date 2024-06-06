package org.example.lessons.lesson3;

public class Bycicle extends Vehicle {
    private String bycicleType;

    public Bycicle(String marka, int kmh, String bycicleType) {
        super(marka, kmh);
        this.bycicleType = bycicleType;
    }

    public String getBycicleType() {
        return bycicleType;
    }

    public void setBycicleType(String bycicleType) {
        this.bycicleType = bycicleType;
    }

    @Override
    public String toString() {
        return "Bycicle{" +
                "bycicleType='" + bycicleType + '\'' +
                '}';
    }
}
