package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Engine> enginesMap = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] elem = scanner.nextLine().split("\\s+");
            String model = elem[0];
            String power = elem[1];
            String displacement = "n/a";
            String efficiency = "n/a";

            if (elem.length == 3) {
                if (Character.isDigit(elem[2].charAt(0))) displacement = elem[2];
                else efficiency = elem[2];
            } else if (elem.length == 4) {
                displacement = elem[2];
                efficiency = elem[3];
            }

            Engine engine = new Engine(model, power, displacement, efficiency);
            enginesMap.putIfAbsent(model, engine);
        }

        int m = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        while (m-- > 0) {
            String[] elem = scanner.nextLine().split("\\s+");
            String model = elem[0];
            String engine = elem[1];
            String weight = "n/a";
            String color = "n/a";

            if (elem.length == 3) {
                if (Character.isDigit(elem[2].charAt(0))) weight = elem[2];
                else color = elem[2];
            } else if (elem.length == 4) {
                weight = elem[2];
                color = elem[3];
            }

            Car car = new Car(model, enginesMap.get(engine), weight, color);
            cars.add(car);
        }

        for (Car car : cars) {
            System.out.println(car.toString());
        }

    }
}
