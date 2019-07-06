package com.company;

public class Car {
    private String model;
    private Engine engine;
    private String weight;
    private String color;


    public Car(String model, Engine engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        engine = new Engine(engine.getModel(), engine.getPower(), engine.getDisplacement(), engine.getEfficiency());
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {

        return String.format("%s: \n%s: \nPower: %s\nDisplacement: %s\nEfficiency: %s\nWeight: %s\nColor: %s", getModel()
                , engine.getModel()
                , engine.getPower()
                , engine.getDisplacement()
                , engine.getEfficiency()
                , getWeight()
                , getColor());
    }

    /*<CarModel>:
    <EngineModel>:
    Power: <EnginePower>
    Displacement: <EngineDisplacement>
    Efficiency: <EngineEfficiency>
    Weight: <CarWeight>
    Color: <CarColor>*/

}
