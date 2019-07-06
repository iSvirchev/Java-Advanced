package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Car> cars = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] elem = scanner.nextLine().split("\\s+");
            String model = elem[0];
            double fuelAmount = Double.parseDouble(elem[1]);
            double fuelCost = Double.parseDouble(elem[2]);

            Car car = new Car(model,fuelAmount,fuelCost);
            cars.putIfAbsent(model,car);
        }

        String end = scanner.nextLine();

        while (!"End".equalsIgnoreCase(end)) {
            String[] elem = end.split("\\s+");
            String model = elem[1];
            double km = Double.parseDouble(elem[2]);

            if(!cars.get(model).fuelIsEnough(km)){
                System.out.println("Insufficient fuel for the drive");
            }
            end = scanner.nextLine();
        }

        for (Map.Entry<String, Car> kvp : cars.entrySet()) {

            System.out.println(String.format("%s %.2f %.0f",
            kvp.getValue().getModel(),
            kvp.getValue().getFuelAmount(),
            kvp.getValue().getDistanceTraveled()
            ));
        }
    }
}
