package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Car>> cars = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] elem = scanner.nextLine().split("\\s+");
            String carModel = elem[0];
            int engineSpeed = Integer.parseInt(elem[1]);
            int enginePower = Integer.parseInt(elem[2]);
            int cargoWeight = Integer.parseInt(elem[3]);

            String cargoType = elem[4];

            double t1Pressure = Double.parseDouble(elem[5]);
            int t1Age = Integer.parseInt(elem[6]);
            double t2Pressure = Double.parseDouble(elem[7]);
            int t2Age = Integer.parseInt(elem[8]);
            double t3Pressure = Double.parseDouble(elem[9]);
            int t3Age = Integer.parseInt(elem[10]);
            double t4Pressure = Double.parseDouble(elem[11]);
            int t4Age = Integer.parseInt(elem[12]);

            double[] tirePressure = new double[]{t1Pressure, t2Pressure, t3Pressure, t4Pressure};
            int[] tireAge = new int[]{t1Age, t2Age, t3Age, t4Age};

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tires tires = new Tires(tirePressure, tireAge);
            Car car = new Car(carModel, engine, cargo, tires);

            if (!cars.containsKey(cargoType)) {
                cars.put(cargoType, new ArrayList<>());
            }
            cars.get(cargoType).add(car);
        }
        String type = scanner.nextLine(); // fragile or flamable

        if (type.equalsIgnoreCase("fragile")) {
            for (Car car : cars.get(type)) {
                if (car.checkFragile()) {
                    System.out.println(car.getModel());
                }
            }
        } else {
            for (Car car : cars.get(type)) {
                if (car.checkFlamable()) {
                    System.out.println(car.getModel());
                }
            }
        }
    }
}
