package com.company;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tires tires;

    public Car(String model, Engine engine, Cargo cargo, Tires tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public boolean checkFragile() {
        double[] tireArray = tires.getTirePressure();
        boolean isFragile = false;

        for (double tire : tireArray) {
            if (tire < 1) isFragile = true;
        }
        return isFragile;
    }

    public boolean checkFlamable() {
        int power = engine.getPower();
        boolean isFlamable = false;
        if (power > 250) isFlamable = true;
        return isFlamable;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        engine = new Engine(engine.getSpeed(), engine.getPower());
        this.engine = engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        cargo = new Cargo(cargo.getWeight(), cargo.getTypeOfCargo());
        this.cargo = cargo;
    }

    public Tires getTires() {
        return tires;
    }

    public void setTires(Tires tires) {
        tires = new Tires(tires.getTirePressure(), tires.getTireAge());
        this.tires = tires;
    }
}
