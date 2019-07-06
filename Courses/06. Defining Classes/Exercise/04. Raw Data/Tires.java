package com.company;

public class Tires {
    private double[] tirePressure;
    private int[] tireAge;

    public Tires(double[] tirePressure, int[] tireAge) {
        this.tirePressure = tirePressure;
        this.tireAge = tireAge;
    }

    public double[] getTirePressure() {
        return tirePressure;
    }

    public void setTirePressure(double[] tirePressure) {
        tirePressure = new double[4];
        this.tirePressure = tirePressure;
    }

    public int[] getTireAge() {
        return tireAge;
    }

    public void setTireAge(int[] tireAge) {
        this.tireAge = tireAge;
        tireAge = new int[4];
    }


}
