package com.company;

public class Car {
    private String model; //unique
    private double fuelAmount;
    private double fuelCost; //for 1 km
    private double distanceTraveled = 0;

    public Car(String model, double fuelAmount, double fuelCost) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCost = fuelCost;
    }

    public boolean fuelIsEnough (double km){
        boolean isEnough  = true;
        double usedFuel = fuelCost*km;
        if(fuelAmount-usedFuel<0) isEnough=false;
        else {
            distanceTraveled+=km;
            fuelAmount-=usedFuel;
        }

        return isEnough;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelCost() {
        return fuelCost;
    }

    public void setFuelCost(double fuelCost) {
        this.fuelCost = fuelCost;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }
}
