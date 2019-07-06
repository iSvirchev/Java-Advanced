package com.company;

public class Cargo {
    private int weight;
    private String typeOfCargo;

    public Cargo(int weight, String typeOfCargo) {
        this.weight = weight;
        this.typeOfCargo = typeOfCargo;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getTypeOfCargo() {
        return typeOfCargo;
    }

    public void setTypeOfCargo(String typeOfCargo) {
        this.typeOfCargo = typeOfCargo;
    }
}
